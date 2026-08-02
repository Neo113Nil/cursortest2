package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/RouteContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleEConsentContingencyUseCase;", "handleEConsentContingencyUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAddCardContingencyUseCase;", "handleAddCardContingencyUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleUpdateCardContingencyUseCase;", "handleUpdateCardContingencyUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAuthChallengeContingencyUseCase;", "handleAuthChallengeContingencyUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/PostEvalContingencyUseCase;", "postEvalContingencyUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleEConsentContingencyUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAddCardContingencyUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleUpdateCardContingencyUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAuthChallengeContingencyUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/PostEvalContingencyUseCase;)V", "contingencyInput", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleEConsentContingencyUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAddCardContingencyUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleUpdateCardContingencyUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAuthChallengeContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/PostEvalContingencyUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RouteContingencyUseCase implements com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleContingencyUseCase<com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAuthChallengeContingencyUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RouteContingencyUseCase(com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase handleEConsentContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase handleAddCardContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase handleUpdateCardContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAuthChallengeContingencyUseCase handleAuthChallengeContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase postEvalContingencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleEConsentContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleAddCardContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleUpdateCardContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleAuthChallengeContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postEvalContingencyUseCase, "");
        this.Camera2StreamConfigurationMap = handleEConsentContingencyUseCase;
        this.getHighSpeedVideoFpsRangesFor = handleAddCardContingencyUseCase;
        this.getHighSpeedVideoFpsRanges = handleUpdateCardContingencyUseCase;
        this.getHighSpeedVideoSizes = handleAuthChallengeContingencyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = postEvalContingencyUseCase;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleContingencyUseCase
    public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput contingencyInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse> continuation) {
        if (contingencyInput instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput) {
            return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput) contingencyInput, continuation);
        }
        if (contingencyInput instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput) {
            return this.getHighSpeedVideoFpsRangesFor.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput) contingencyInput, continuation);
        }
        if (contingencyInput instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput) {
            return this.getHighSpeedVideoFpsRanges.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput) contingencyInput, continuation);
        }
        if (contingencyInput instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput) {
            return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput) contingencyInput, continuation);
        }
        if (contingencyInput instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput) contingencyInput, continuation);
        }
        if (!(contingencyInput instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse(((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput) contingencyInput).getEntity(), new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_CONTINGENCY, com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_CONTINGENCY_ERROR_DESCRIPTION, false, null, null, 16, null));
    }
}
