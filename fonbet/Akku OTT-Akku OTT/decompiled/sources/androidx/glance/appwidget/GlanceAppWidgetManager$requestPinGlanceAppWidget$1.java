package androidx.glance.appwidget;

import androidx.compose.runtime.ComposerKt;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", i = {0, 0, 0, 0}, l = {ComposerKt.compositionLocalMapKey}, m = "requestPinGlanceAppWidget", n = {"this", "successCallback", "target", "$this$requestPinGlanceAppWidget_u24lambda_u2413"}, s = {"L$0", "L$1", "L$2", "L$4"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager$requestPinGlanceAppWidget$1<T extends GlanceAppWidgetReceiver> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidgetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$requestPinGlanceAppWidget$1(GlanceAppWidgetManager glanceAppWidgetManager, Continuation<? super GlanceAppWidgetManager$requestPinGlanceAppWidget$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidgetManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.requestPinGlanceAppWidget(null, null, null, null, this);
    }
}
