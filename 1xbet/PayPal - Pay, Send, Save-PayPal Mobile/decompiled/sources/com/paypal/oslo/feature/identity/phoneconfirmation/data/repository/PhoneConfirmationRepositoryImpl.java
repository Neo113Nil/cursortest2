package com.paypal.oslo.feature.identity.phoneconfirmation.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/repository/PhoneConfirmationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationRepository;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSource;", "dataSource", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSource;)V", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "initiatePhoneConfirmation", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationOutput;", "completePhoneConfirmation", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneConfirmationRepositoryImpl implements com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PhoneConfirmationRepositoryImpl(com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource phoneConfirmationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationDataSource, "");
        this.getHighSpeedVideoFpsRanges = phoneConfirmationDataSource;
    }

    @Override // com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationInitiationRepository
    public final java.lang.Object initiatePhoneConfirmation(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput phoneConfirmationInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput>> continuation) {
        return this.getHighSpeedVideoFpsRanges.requestConfirmationCode(phoneConfirmationInput, continuation);
    }

    @Override // com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository
    public final java.lang.Object completePhoneConfirmation(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput oTPVerificationInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput>> continuation) {
        return this.getHighSpeedVideoFpsRanges.confirmCode(oTPVerificationInput, continuation);
    }
}
