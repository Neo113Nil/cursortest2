package com.paypal.oslo.feature.wallet.amexandp3.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/usecase/RetrievePaymentTokenUseCase;", "", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/RetrievePaymentTokenRepository;", "retrievePaymentTokenRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/RetrievePaymentTokenRepository;)V", "", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/RetrievePaymentTokenError;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/RetrievePaymentTokenRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RetrievePaymentTokenUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public RetrievePaymentTokenUseCase(com.paypal.oslo.feature.wallet.amexandp3.domain.repository.RetrievePaymentTokenRepository retrievePaymentTokenRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrievePaymentTokenRepository, "");
        this.Camera2StreamConfigurationMap = retrievePaymentTokenRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.RetrievePaymentTokenError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo>> continuation) {
        return this.Camera2StreamConfigurationMap.retrievePaymentToken(str, continuation);
    }
}
