package com.paypal.oslo.core.i18n.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/di/I18nNameModule;", "", "Lcom/paypal/oslo/core/i18n/data/implementation/NameHandlerImpl;", "nameHandlerImpl", "Lcom/paypal/oslo/core/i18n/domain/interfaces/NameHandler;", "bindsNameHandler", "(Lcom/paypal/oslo/core/i18n/data/implementation/NameHandlerImpl;)Lcom/paypal/oslo/core/i18n/domain/interfaces/NameHandler;", "Lcom/paypal/oslo/core/i18n/data/repository/NameRepositoryImpl;", "nameRepositoryImpl", "Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;", "bindsNameRepository", "(Lcom/paypal/oslo/core/i18n/data/repository/NameRepositoryImpl;)Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes2.dex */
public interface I18nNameModule {
    @kotlin.Deprecated(message = "Use NameFormatUseCase directly instead of NameHandler")
    @dagger.Binds
    com.paypal.oslo.core.i18n.domain.interfaces.NameHandler bindsNameHandler(com.paypal.oslo.core.i18n.data.implementation.NameHandlerImpl nameHandlerImpl);

    @dagger.Binds
    com.paypal.oslo.core.i18n.domain.repository.NameRepository bindsNameRepository(com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl nameRepositoryImpl);
}
