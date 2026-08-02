package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/shared/navigation/result/FundingSourceSelectorNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1", f = "RequestPhysicalCardRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult fundingSourceSelectorNavResult = (com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (fundingSourceSelectorNavResult.getSelectedFundingSourceId() != null) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo = this.getHighSpeedVideoFpsRangesFor;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination(requestPhysicalCardInfo));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult fundingSourceSelectorNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1) create(fundingSourceSelectorNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1 requestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        requestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1.getHighSpeedVideoFpsRanges = obj;
        return requestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = requestPhysicalCardInfo;
    }
}
