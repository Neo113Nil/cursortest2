package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AuthorizeBillingAgreementUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;)V", "", "fundingInstrumentID", "", "useBalance", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "invoke", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthorizeBillingAgreementUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AuthorizeBillingAgreementUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository authorizeBillingAgreementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizeBillingAgreementRepository, "");
        this.getHighSpeedVideoFpsRangesFor = authorizeBillingAgreementRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.authorize(str, bool, continuation);
    }
}
