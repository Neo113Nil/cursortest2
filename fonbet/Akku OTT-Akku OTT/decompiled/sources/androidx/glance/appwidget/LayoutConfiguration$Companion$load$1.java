package androidx.glance.appwidget;

import androidx.glance.appwidget.LayoutConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.LayoutConfiguration$Companion", f = "WidgetLayout.kt", i = {0, 0}, l = {97}, m = "load$glance_appwidget_release", n = {"context", "appWidgetId"}, s = {"L$0", "I$0"})
/* loaded from: classes.dex */
public final class LayoutConfiguration$Companion$load$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LayoutConfiguration.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutConfiguration$Companion$load$1(LayoutConfiguration.Companion companion, Continuation<? super LayoutConfiguration$Companion$load$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load$glance_appwidget_release(null, 0, this);
    }
}
