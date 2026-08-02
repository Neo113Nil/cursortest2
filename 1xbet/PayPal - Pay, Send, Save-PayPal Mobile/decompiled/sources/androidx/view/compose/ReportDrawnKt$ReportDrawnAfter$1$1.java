package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", i = {0}, l = {159}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes5.dex */
final class ReportDrawnKt$ReportDrawnAfter$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.FullyDrawnReporter getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.FullyDrawnReporter fullyDrawnReporter;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.view.FullyDrawnReporter fullyDrawnReporter2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.getHighSpeedVideoFpsRangesFor;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = fullyDrawnReporter2;
                    this.Camera2StreamConfigurationMap = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (java.lang.Throwable th2) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th = th2;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fullyDrawnReporter = (androidx.view.FullyDrawnReporter) this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            fullyDrawnReporter.removeReporter();
            throw th;
        }
        fullyDrawnReporter.removeReporter();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.ReportDrawnKt$ReportDrawnAfter$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.ReportDrawnKt$ReportDrawnAfter$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReportDrawnKt$ReportDrawnAfter$1$1(androidx.view.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.view.compose.ReportDrawnKt$ReportDrawnAfter$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = fullyDrawnReporter;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
