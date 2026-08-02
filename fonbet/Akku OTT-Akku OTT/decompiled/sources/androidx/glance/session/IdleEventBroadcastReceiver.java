package androidx.glance.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/glance/session/IdleEventBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "onIdle", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnIdle", "()Lkotlin/jvm/functions/Function0;", "checkIdleStatus", "context", "Landroid/content/Context;", "checkIdleStatus$glance_release", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdleEventBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdleEventBroadcastReceiver.kt\nandroidx/glance/session/IdleEventBroadcastReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1855#2,2:93\n*S KotlinDebug\n*F\n+ 1 IdleEventBroadcastReceiver.kt\nandroidx/glance/session/IdleEventBroadcastReceiver\n*L\n38#1:93,2\n*E\n"})
/* loaded from: classes.dex */
public final class IdleEventBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> events;
    private static final IntentFilter filter;
    private final Function0<Unit> onIdle;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/glance/session/IdleEventBroadcastReceiver$Companion;", "", "()V", "events", "", "", "getEvents", "()Ljava/util/List;", "filter", "Landroid/content/IntentFilter;", "getFilter", "()Landroid/content/IntentFilter;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getEvents() {
            return IdleEventBroadcastReceiver.events;
        }

        public final IntentFilter getFilter() {
            return IdleEventBroadcastReceiver.filter;
        }

        private Companion() {
        }
    }

    static {
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{"android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED"});
        events = listOf;
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it = listOf.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        filter = intentFilter;
    }

    public IdleEventBroadcastReceiver(Function0<Unit> function0) {
        this.onIdle = function0;
    }

    public final void checkIdleStatus$glance_release(Context context) {
        int i = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean isIdle = Api23Impl.INSTANCE.isIdle(powerManager);
        if (i >= 33) {
            isIdle = isIdle || Api33Impl.INSTANCE.isLightIdleOrLowPowerStandby(powerManager);
        }
        if (isIdle) {
            this.onIdle.invoke();
        }
    }

    public final Function0<Unit> getOnIdle() {
        return this.onIdle;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (CollectionsKt.contains(events, intent.getAction())) {
            checkIdleStatus$glance_release(context);
        }
    }
}
