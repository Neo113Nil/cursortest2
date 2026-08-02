package com.paypal.oslo.feature.debitcard.shared.ui.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$AnimateProgressValue$1$1", f = "ProgressBarUtil.kt", i = {0, 0}, l = {64}, m = "invokeSuspend", n = {com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "elapsed"}, nl = {66}, s = {"J$0", "J$1"}, v = 2)
/* loaded from: classes12.dex */
final class ProgressBarUtilKt$AnimateProgressValue$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long currentTimeMillis;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRangesFor.setFloatValue(0.0f);
                currentTimeMillis = java.lang.System.currentTimeMillis();
            } else {
                this.getHighSpeedVideoFpsRangesFor.setFloatValue(this.getHighSpeedVideoSizes);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentTimeMillis = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (this.Camera2StreamConfigurationMap) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            this.getHighSpeedVideoFpsRangesFor.setFloatValue((currentTimeMillis2 % 5000) / 5000.0f);
            this.getHighResolutionOutputSizeshNQ4ISI = currentTimeMillis;
            this.getHighSpeedVideoFpsRanges = currentTimeMillis2;
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(60L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.getHighSpeedVideoFpsRangesFor.setFloatValue(this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$AnimateProgressValue$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$AnimateProgressValue$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarUtilKt$AnimateProgressValue$1$1(boolean z, androidx.compose.runtime.MutableFloatState mutableFloatState, float f, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$AnimateProgressValue$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState;
        this.getHighSpeedVideoSizes = f;
    }
}
