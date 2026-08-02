package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", i = {0, 0, 0, 0}, l = {186, 187, 190}, m = "resize$glance_appwidget_release", n = {"this", "context", "options", "glanceId"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
public final class GlanceAppWidget$resize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$resize$1(GlanceAppWidget glanceAppWidget, Continuation<? super GlanceAppWidget$resize$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resize$glance_appwidget_release(null, 0, null, this);
    }
}
