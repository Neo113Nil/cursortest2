package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {176}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"}, v = 1)
/* loaded from: classes5.dex */
final class FullyDrawnReporterKt$reportWhenComplete$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.view.FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }

    FullyDrawnReporterKt$reportWhenComplete$1(kotlin.coroutines.Continuation<? super androidx.view.FullyDrawnReporterKt$reportWhenComplete$1> continuation) {
        super(continuation);
    }
}
