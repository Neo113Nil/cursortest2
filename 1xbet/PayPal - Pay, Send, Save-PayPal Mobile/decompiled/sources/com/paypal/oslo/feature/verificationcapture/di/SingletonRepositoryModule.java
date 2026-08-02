package com.paypal.oslo.feature.verificationcapture.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/di/SingletonRepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/data/repository/LivenessRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "bindLivenessRepository", "(Lcom/paypal/oslo/feature/verificationcapture/data/repository/LivenessRepositoryImpl;)Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "Lcom/paypal/oslo/feature/verificationcapture/data/repository/VerificationCaptureRepositoryImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "bindVerificationCaptureRepository", "(Lcom/paypal/oslo/feature/verificationcapture/data/repository/VerificationCaptureRepositoryImpl;)Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "Lcom/paypal/oslo/feature/verificationcapture/data/repository/DocumentValidationRepositoryImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;", "bindDocumentValidationRepository", "(Lcom/paypal/oslo/feature/verificationcapture/data/repository/DocumentValidationRepositoryImpl;)Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public abstract class SingletonRepositoryModule {
    public static final int $stable = 0;

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository bindDocumentValidationRepository(com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository bindLivenessRepository(com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository bindVerificationCaptureRepository(com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl impl);
}
