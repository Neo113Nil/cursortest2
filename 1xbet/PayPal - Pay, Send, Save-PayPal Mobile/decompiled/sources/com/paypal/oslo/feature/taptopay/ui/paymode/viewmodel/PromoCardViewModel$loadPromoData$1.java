package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel$loadPromoData$1", f = "PromoCardViewModel.kt", i = {1, 1}, l = {100, 112}, m = "invokeSuspend", n = {"clientMetadataId", "cardTypes"}, nl = {101, 113}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class PromoCardViewModel$loadPromoData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r12 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        if (r12 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase;
        java.lang.String str;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            generateRiskDataUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            obj = generateRiskDataUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    arrow.core.Either.Right right = (arrow.core.Either.Right) either;
                    if (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel.access$hasDeclineOrStepUpDecision(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult) right.getValue()).getRiskDecision())) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: Risk decision is DECLINED or STEPUP, promo will not be shown", null, null, 6, null);
                        mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                        mutableStateFlow2.setValue(null);
                    } else {
                        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel.access$getPayLaterPromoData(this.getHighSpeedVideoFpsRanges, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult) right.getValue());
                    }
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: Card eligibility failed, promo card will not be shown", null, null, 6, null);
                    mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                    mutableStateFlow.setValue(null);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either2 = (arrow.core.Either) obj;
        if (either2 instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: Risk clientMetadataId generated", null, null, 6, null);
            str = (java.lang.String) ((arrow.core.Either.Right) either2).getValue();
        } else {
            if (!(either2 instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: Failed to generate risk pairing ID", null, null, 6, null);
            str = null;
        }
        java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo);
        payPalGetCardEligibilityUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(listOf);
        this.Camera2StreamConfigurationMap = 2;
        obj = payPalGetCardEligibilityUseCase.invoke(kotlin.collections.CollectionsKt.emptyList(), str, listOf, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel$loadPromoData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel$loadPromoData$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoCardViewModel$loadPromoData$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel promoCardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel$loadPromoData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = promoCardViewModel;
    }
}
