package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$1", f = "TapToPayRefundsFragment.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TapToPayRefundsFragment$RefundView$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayRefundsFragment$RefundView$1(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = tapToPayRefundsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects> effects = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getViewModel(this.getHighSpeedVideoSizes).getEffects();
            final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (effects.collect(new kotlinx.coroutines.flow.FlowCollector<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects effects2, kotlin.coroutines.Continuation continuation) {
                    com.zettle.sdk.ui.SdkViewModel sdkViewModel;
                    com.zettle.sdk.ui.SdkViewModel sdkViewModel2;
                    com.zettle.sdk.ui.SdkViewModel sdkViewModel3;
                    com.zettle.sdk.ui.SdkViewModel sdkViewModel4;
                    com.zettle.sdk.ui.SdkViewModel sdkViewModel5;
                    com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects effects3 = effects2;
                    if (effects3 instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorDoRefund) {
                        sdkViewModel5 = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.getSdkViewModel();
                        sdkViewModel5.finish(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Failed(((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorDoRefund) effects3).getReason()));
                    } else if (effects3 instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorRetrieveData) {
                        sdkViewModel4 = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.getSdkViewModel();
                        sdkViewModel4.finish(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Failed(((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorRetrieveData) effects3).getReason()));
                    } else if (effects3 instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.SuccessDoRefund) {
                        sdkViewModel3 = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.getSdkViewModel();
                        sdkViewModel3.finish(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Completed(((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.SuccessDoRefund) effects3).getPayload()));
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(effects3, com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.Canceled.INSTANCE)) {
                        sdkViewModel2 = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.getSdkViewModel();
                        sdkViewModel2.finish(com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Canceled.INSTANCE);
                    } else if (effects3 instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorAmountAboveMaximum) {
                        sdkViewModel = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.getSdkViewModel();
                        sdkViewModel.finish(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Failed(((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorAmountAboveMaximum) effects3).getReason()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }
}
