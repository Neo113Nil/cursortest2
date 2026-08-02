package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateCurrencyConversionProviderUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;)V", "", "attemptId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "provider", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateConversionProviderResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateCurrencyConversionProviderUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdateCurrencyConversionProviderUseCase(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowRepository, "");
        this.getHighSpeedVideoSizes = transferFlowRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateConversionProviderResult>> continuation) {
        return this.getHighSpeedVideoSizes.updateCurrencyConversionProvider(str, str2, conversionOption, continuation);
    }
}
