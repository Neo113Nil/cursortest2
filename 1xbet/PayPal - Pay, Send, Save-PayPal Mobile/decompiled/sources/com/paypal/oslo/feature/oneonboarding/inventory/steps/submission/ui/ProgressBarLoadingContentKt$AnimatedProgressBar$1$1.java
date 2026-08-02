package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.ProgressBarLoadingContentKt$AnimatedProgressBar$1$1", f = "ProgressBarLoadingContent.kt", i = {}, l = {69, 72}, m = "invokeSuspend", n = {}, nl = {70, -1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ProgressBarLoadingContentKt$AnimatedProgressBar$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(300, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(5500, r6) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004e -> B:11:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
                this.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(0.0f);
                this.getHighSpeedVideoSizes = 2;
            } else if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
        this.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(100.0f);
        this.getHighSpeedVideoSizes = 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.ProgressBarLoadingContentKt$AnimatedProgressBar$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.ProgressBarLoadingContentKt$AnimatedProgressBar$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarLoadingContentKt$AnimatedProgressBar$1$1(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableFloatState mutableFloatState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.ProgressBarLoadingContentKt$AnimatedProgressBar$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableFloatState;
    }
}
