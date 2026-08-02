package com.paypal.oslo.feature.identity.llslogin.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/llslogin/di/LLSLoginModule;", "", "Lcom/paypal/oslo/feature/identity/llslogin/data/repository/LLSEligibilityRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/llslogin/domain/repository/LLSEligibilityRepository;", "bindLLSEligibilityRepository", "(Lcom/paypal/oslo/feature/identity/llslogin/data/repository/LLSEligibilityRepositoryImpl;)Lcom/paypal/oslo/feature/identity/llslogin/domain/repository/LLSEligibilityRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface LLSLoginModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule.Companion INSTANCE = com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule.Companion.Camera2StreamConfigurationMap;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository bindLLSEligibilityRepository(com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/llslogin/di/LLSLoginModule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "provideUserPreviewInputBuilder", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @dagger.multibindings.IntoSet
        public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideUserPreviewInputBuilder() {
            return com.paypal.oslo.feature.identity.llslogin.data.UserPreviewLoginInputBuilderKt.userPreviewLoginInputBuilder();
        }
    }
}
