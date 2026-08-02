package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", i = {0, 0, 0, 0, 0, 1}, l = {160, 162, 167}, m = "triggerAction$glance_appwidget_release", n = {"this", "context", "actionKey", "options", "glanceId", "actionKey"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
/* loaded from: classes.dex */
public final class GlanceAppWidget$triggerAction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$triggerAction$1(GlanceAppWidget glanceAppWidget, Continuation<? super GlanceAppWidget$triggerAction$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.triggerAction$glance_appwidget_release(null, 0, null, null, this);
    }
}
