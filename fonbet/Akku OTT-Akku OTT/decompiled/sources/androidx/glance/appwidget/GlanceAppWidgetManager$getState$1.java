package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", i = {0}, l = {96}, m = "getState", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager$getState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidgetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$getState$1(GlanceAppWidgetManager glanceAppWidgetManager, Continuation<? super GlanceAppWidgetManager$getState$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidgetManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object state;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        state = this.this$0.getState(this);
        return state;
    }
}
