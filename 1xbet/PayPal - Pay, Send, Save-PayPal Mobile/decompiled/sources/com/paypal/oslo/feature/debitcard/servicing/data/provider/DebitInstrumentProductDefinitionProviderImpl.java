package com.paypal.oslo.feature.debitcard.servicing.data.provider;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/data/provider/DebitInstrumentProductDefinitionProviderImpl;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentProductDefinitionUseCase;", "getDebitInstrumentProductDefinitionUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentProductDefinitionUseCase;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "countryCode", "", "includeCardArtImages", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionResult;", "getProductDefinition", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentProductDefinitionUseCase;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebitInstrumentProductDefinitionProviderImpl implements com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public DebitInstrumentProductDefinitionProviderImpl(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase getDebitInstrumentProductDefinitionUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitInstrumentProductDefinitionUseCase, "");
        this.getHighSpeedVideoFpsRanges = getDebitInstrumentProductDefinitionUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getProductDefinition(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError, com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionResult>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1 debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1) {
            debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1 = (com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1) continuation;
            if ((debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest debitInstrumentProductDefinitionRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest(debitCardProductName, str, z);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase getDebitInstrumentProductDefinitionUseCase = this.getHighSpeedVideoFpsRanges;
                    debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardProductName);
                    debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentProductDefinitionRequest);
                    debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getHighSpeedVideoFpsRanges = this;
                    debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getInputSizeshNQ4ISI = 1;
                    obj = getDebitInstrumentProductDefinitionUseCase.invoke2(debitInstrumentProductDefinitionRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition>>) debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    T data = ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData();
                    if (data == 0) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition debitInstrumentProductDefinition = (com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition) data;
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionResult(debitInstrumentProductDefinition.getDisplayProductName(), debitInstrumentProductDefinition.getSmallImageFrontUrl(), debitInstrumentProductDefinition.getMediumImageFrontUrl()));
                }
                if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.HttpError) {
                    if (((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.HttpError) useCaseResult).getStatusCode() == 404) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.ProductNotFound.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Network.INSTANCE);
                }
                if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoDataFoundError) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.ProductNotFound.INSTANCE);
                }
                if ((useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet) || (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.UnknownNetworkError)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Network.INSTANCE);
                }
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Unknown.INSTANCE);
            }
        }
        debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1 = new com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1(this, continuation);
        java.lang.Object obj2 = debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitInstrumentProductDefinitionProviderImpl$getProductDefinition$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
    }
}
