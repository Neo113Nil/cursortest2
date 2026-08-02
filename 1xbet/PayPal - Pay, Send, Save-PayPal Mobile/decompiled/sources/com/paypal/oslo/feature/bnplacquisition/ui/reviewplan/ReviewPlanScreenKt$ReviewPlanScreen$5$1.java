package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$5$1", f = "ReviewPlanScreen.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewPlanScreenKt$ReviewPlanScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003b -> B:5:0x003e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float floatValue;
        float floatValue2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.setFloatValue(0.0f);
                floatValue = this.getHighSpeedVideoFpsRanges.getFloatValue();
                if (floatValue < 100.0f) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.runtime.MutableFloatState mutableFloatState = this.getHighSpeedVideoFpsRanges;
        floatValue2 = mutableFloatState.getFloatValue();
        mutableFloatState.setFloatValue(floatValue2 + 1.0f);
        floatValue = this.getHighSpeedVideoFpsRanges.getFloatValue();
        if (floatValue < 100.0f) {
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.getHighSpeedVideoFpsRanges;
            floatValue2 = mutableFloatState2.getFloatValue();
            mutableFloatState2.setFloatValue(floatValue2 + 1.0f);
            floatValue = this.getHighSpeedVideoFpsRanges.getFloatValue();
            if (floatValue < 100.0f) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$5$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPlanScreenKt$ReviewPlanScreen$5$1(boolean z, androidx.compose.runtime.MutableFloatState mutableFloatState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = mutableFloatState;
    }
}
