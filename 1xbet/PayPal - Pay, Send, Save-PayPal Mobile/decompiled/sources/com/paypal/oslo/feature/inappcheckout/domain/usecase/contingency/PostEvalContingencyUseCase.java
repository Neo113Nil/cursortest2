package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/PostEvalContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$CommonContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;", "fundingSelectionUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;)V", "contingencyInput", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$CommonContingencyInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostEvalContingencyUseCase implements com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleContingencyUseCase<com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PostEvalContingencyUseCase(com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionUseCase, "");
        this.getHighSpeedVideoSizes = fundingSelectionUseCase;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleContingencyUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput commonContingencyInput, kotlin.coroutines.Continuation continuation) {
        return invoke2(commonContingencyInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput commonContingencyInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase$invoke$1 postEvalContingencyUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase$invoke$1) {
            postEvalContingencyUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase$invoke$1) continuation;
            if ((postEvalContingencyUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                postEvalContingencyUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = postEvalContingencyUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postEvalContingencyUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase = this.getHighSpeedVideoSizes;
                    postEvalContingencyUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = commonContingencyInput;
                    postEvalContingencyUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = fundingSelectionUseCase.invoke(postEvalContingencyUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    commonContingencyInput = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput) postEvalContingencyUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.fundingSelectionAsContingencyResponse((arrow.core.Either) obj, commonContingencyInput.getEntity());
            }
        }
        postEvalContingencyUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = postEvalContingencyUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postEvalContingencyUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.fundingSelectionAsContingencyResponse((arrow.core.Either) obj2, commonContingencyInput.getEntity());
    }
}
