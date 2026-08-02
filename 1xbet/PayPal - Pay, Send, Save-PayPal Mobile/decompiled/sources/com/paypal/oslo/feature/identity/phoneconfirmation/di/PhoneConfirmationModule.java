package com.paypal.oslo.feature.identity.phoneconfirmation.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/di/PhoneConfirmationModule;", "", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSourceImpl;", "impl", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSource;", "bindPhoneConfirmationDataSource", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSourceImpl;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSource;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/repository/PhoneConfirmationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationRepository;", "bindPhoneConfirmationRepository", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/repository/PhoneConfirmationRepositoryImpl;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationRepository;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationInitiationRepository;", "bindPhoneConfirmationInitiationRepository", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/repository/PhoneConfirmationRepositoryImpl;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationInitiationRepository;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationCompletionRepository;", "bindPhoneConfirmationCompletionRepository", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/repository/PhoneConfirmationRepositoryImpl;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/repository/PhoneConfirmationCompletionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface PhoneConfirmationModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository bindPhoneConfirmationCompletionRepository(com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource bindPhoneConfirmationDataSource(com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationInitiationRepository bindPhoneConfirmationInitiationRepository(com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationRepository bindPhoneConfirmationRepository(com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl impl);
}
