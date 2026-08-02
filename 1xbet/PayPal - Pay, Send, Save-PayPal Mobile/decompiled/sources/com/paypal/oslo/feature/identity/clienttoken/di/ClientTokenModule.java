package com.paypal.oslo.feature.identity.clienttoken.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/di/ClientTokenModule;", "", "Lcom/paypal/oslo/feature/identity/clienttoken/data/repository/ClientTokenRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/repository/ClientTokenRepository;", "bindClientTokenRepository", "(Lcom/paypal/oslo/feature/identity/clienttoken/data/repository/ClientTokenRepositoryImpl;)Lcom/paypal/oslo/feature/identity/clienttoken/domain/repository/ClientTokenRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface ClientTokenModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository bindClientTokenRepository(com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl impl);
}
