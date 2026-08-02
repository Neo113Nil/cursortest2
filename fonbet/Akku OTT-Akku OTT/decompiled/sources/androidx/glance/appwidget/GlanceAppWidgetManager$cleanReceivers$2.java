package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "prefs"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager$cleanReceivers$2", f = "GlanceAppWidgetManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGlanceAppWidgetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidgetManager.kt\nandroidx/glance/appwidget/GlanceAppWidgetManager$cleanReceivers$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n766#2:273\n857#2,2:274\n1855#2,2:276\n*S KotlinDebug\n*F\n+ 1 GlanceAppWidgetManager.kt\nandroidx/glance/appwidget/GlanceAppWidgetManager$cleanReceivers$2\n*L\n231#1:273\n231#1:274,2\n235#1:276,2\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager$cleanReceivers$2 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {
    final /* synthetic */ Set<String> $receivers;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$cleanReceivers$2(Set<String> set, Continuation<? super GlanceAppWidgetManager$cleanReceivers$2> continuation) {
        super(2, continuation);
        this.$receivers = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlanceAppWidgetManager$cleanReceivers$2 glanceAppWidgetManager$cleanReceivers$2 = new GlanceAppWidgetManager$cleanReceivers$2(this.$receivers, continuation);
        glanceAppWidgetManager$cleanReceivers$2.L$0 = obj;
        return glanceAppWidgetManager$cleanReceivers$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Preferences preferences, Continuation<? super Preferences> continuation) {
        return ((GlanceAppWidgetManager$cleanReceivers$2) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        Preferences.Key key2;
        Set minus;
        GlanceAppWidgetManager.Companion companion;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Preferences preferences = (Preferences) this.L$0;
        key = GlanceAppWidgetManager.providersKey;
        Set set = (Set) preferences.get(key);
        if (set != null) {
            Set<String> set2 = this.$receivers;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (!set2.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                key2 = GlanceAppWidgetManager.providersKey;
                minus = SetsKt___SetsKt.minus(set, (Iterable) arrayList);
                mutablePreferences.set(key2, minus);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    companion = GlanceAppWidgetManager.Companion;
                    mutablePreferences.remove(companion.providerKey(str));
                }
                return mutablePreferences.toPreferences();
            }
        }
        return preferences;
    }
}
