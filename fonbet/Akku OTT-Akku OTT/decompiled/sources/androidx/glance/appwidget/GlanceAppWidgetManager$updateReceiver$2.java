package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "R", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "P", "Landroidx/glance/appwidget/GlanceAppWidget;", "pref"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager$updateReceiver$2", f = "GlanceAppWidgetManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager$updateReceiver$2 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {
    final /* synthetic */ String $providerName;
    final /* synthetic */ String $receiverName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$updateReceiver$2(String str, String str2, Continuation<? super GlanceAppWidgetManager$updateReceiver$2> continuation) {
        super(2, continuation);
        this.$receiverName = str;
        this.$providerName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlanceAppWidgetManager$updateReceiver$2 glanceAppWidgetManager$updateReceiver$2 = new GlanceAppWidgetManager$updateReceiver$2(this.$receiverName, this.$providerName, continuation);
        glanceAppWidgetManager$updateReceiver$2.L$0 = obj;
        return glanceAppWidgetManager$updateReceiver$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Preferences preferences, Continuation<? super Preferences> continuation) {
        return ((GlanceAppWidgetManager$updateReceiver$2) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        Preferences.Key key2;
        GlanceAppWidgetManager.Companion companion;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Preferences preferences = (Preferences) this.L$0;
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        String str = this.$receiverName;
        String str2 = this.$providerName;
        key = GlanceAppWidgetManager.providersKey;
        key2 = GlanceAppWidgetManager.providersKey;
        Set set = (Set) preferences.get(key2);
        if (set == null) {
            set = SetsKt.emptySet();
        }
        mutablePreferences.set(key, SetsKt.plus((Set<? extends String>) set, str));
        companion = GlanceAppWidgetManager.Companion;
        mutablePreferences.set(companion.providerKey(str), str2);
        return mutablePreferences.toPreferences();
    }
}
