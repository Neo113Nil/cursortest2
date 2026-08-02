package com.paypal.oslo.feature.mosaic.ui.legacy;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel$fetchEligibility$1", f = "MosaicLegacyFlowViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, nl = {60}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MosaicLegacyFlowViewModel$fetchEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase getMosaicEligibilityUseCase;
        com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination;
        com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getMosaicEligibilityUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mosaicLegacyDestination = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String policyName = mosaicLegacyDestination.getPolicyName();
            mosaicLegacyDestination2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = getMosaicEligibilityUseCase.invoke(policyName, mosaicLegacyDestination2.getEncryptedProcessId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel mosaicLegacyFlowViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Eligibility check failed, falling back to Adroit web", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString())), null, 4, null);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility = (com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
            if (mosaicEligibility != null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.mosaic.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                pairArr[0] = kotlin.TuplesKt.to("isSupportedOnMosaic", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mosaicEligibility.isSupportedOnMosaic()));
                pairArr[1] = kotlin.TuplesKt.to("isWebSupported", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mosaicEligibility.isWebSupported()));
                pairArr[2] = kotlin.TuplesKt.to("isNativeSupported", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mosaicEligibility.isNativeSupported()));
                java.lang.String qualifiedIntentId = mosaicEligibility.getQualifiedIntentId();
                if (qualifiedIntentId == null) {
                    qualifiedIntentId = "null";
                }
                pairArr[3] = kotlin.TuplesKt.to("qualifiedIntentId", qualifiedIntentId);
                com.paypal.android.logger.Logger.d$default(logger, "Eligibility check succeeded", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                mviStateStore2 = mosaicLegacyFlowViewModel.getHighSpeedVideoFpsRangesFor;
                mviStateStore2.onEvent(new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded(mosaicEligibility));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Eligibility response data was null, falling back to Adroit web", null, null, 6, null);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Eligibility check returned partial result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.graphql.error.CallError) leftValue).toString())), null, 4, null);
            com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility2 = (com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility) graphQLData.getData();
            if (mosaicEligibility2 != null) {
                mviStateStore = mosaicLegacyFlowViewModel.getHighSpeedVideoFpsRangesFor;
                mviStateStore.onEvent(new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded(mosaicEligibility2));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mviStateStore3 = mosaicLegacyFlowViewModel.getHighSpeedVideoFpsRangesFor;
        mviStateStore3.onEvent(com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityFailed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel$fetchEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel$fetchEligibility$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MosaicLegacyFlowViewModel$fetchEligibility$1(com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel mosaicLegacyFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel$fetchEligibility$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = mosaicLegacyFlowViewModel;
    }
}
