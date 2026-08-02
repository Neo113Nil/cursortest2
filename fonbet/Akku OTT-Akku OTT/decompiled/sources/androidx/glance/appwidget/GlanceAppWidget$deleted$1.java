package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {117, 119, WebSocketProtocol.PAYLOAD_SHORT, WebSocketProtocol.PAYLOAD_SHORT, WebSocketProtocol.PAYLOAD_SHORT, WebSocketProtocol.PAYLOAD_SHORT}, m = "deleted$glance_appwidget_release", n = {"this", "context", "glanceId", "appWidgetId", "this", "context", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
public final class GlanceAppWidget$deleted$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$deleted$1(GlanceAppWidget glanceAppWidget, Continuation<? super GlanceAppWidget$deleted$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleted$glance_appwidget_release(null, 0, this);
    }
}
