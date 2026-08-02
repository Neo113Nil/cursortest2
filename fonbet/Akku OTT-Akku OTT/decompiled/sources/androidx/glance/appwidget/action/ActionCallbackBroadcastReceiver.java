package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.os.BundleKt;
import androidx.glance.action.ActionParameters;
import androidx.glance.appwidget.CoroutineBroadcastReceiverKt;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    private static final String AppWidgetId = "ActionCallbackBroadcastReceiver:appWidgetId";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ExtraCallbackClassName = "ActionCallbackBroadcastReceiver:callbackClass";
    private static final String ExtraParameters = "ActionCallbackBroadcastReceiver:parameters";

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\u00020\b*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$Companion;", "", "()V", "AppWidgetId", "", "ExtraCallbackClassName", "ExtraParameters", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "callbackClass", "Ljava/lang/Class;", "Landroidx/glance/appwidget/action/ActionCallback;", "appWidgetId", "", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "createIntent$glance_appwidget_release", "putParameterExtras", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nActionCallbackBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionCallbackBroadcastReceiver.kt\nandroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,98:1\n125#2:99\n152#2,3:100\n37#3,2:103\n*S KotlinDebug\n*F\n+ 1 ActionCallbackBroadcastReceiver.kt\nandroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$Companion\n*L\n91#1:99\n91#1:100,3\n93#1:103,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent putParameterExtras(Intent intent, ActionParameters actionParameters) {
            Map<ActionParameters.Key<? extends Object>, Object> asMap = actionParameters.asMap();
            ArrayList arrayList = new ArrayList(asMap.size());
            for (Map.Entry<ActionParameters.Key<? extends Object>, Object> entry : asMap.entrySet()) {
                ActionParameters.Key<? extends Object> key = entry.getKey();
                arrayList.add(TuplesKt.to(key.getName(), entry.getValue()));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            intent.putExtra(ActionCallbackBroadcastReceiver.ExtraParameters, BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return intent;
        }

        public final Intent createIntent$glance_appwidget_release(Context context, Class<? extends ActionCallback> callbackClass, int appWidgetId, ActionParameters parameters) {
            return putParameterExtras(new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra(ActionCallbackBroadcastReceiver.ExtraCallbackClassName, callbackClass.getCanonicalName()).putExtra(ActionCallbackBroadcastReceiver.AppWidgetId, appWidgetId), parameters);
        }

        private Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CoroutineBroadcastReceiverKt.goAsync$default(this, null, new ActionCallbackBroadcastReceiver$onReceive$1(intent, context, null), 1, null);
    }
}
