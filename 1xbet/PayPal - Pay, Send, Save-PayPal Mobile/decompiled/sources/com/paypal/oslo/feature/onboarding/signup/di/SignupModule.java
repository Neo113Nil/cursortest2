package com.paypal.oslo.feature.onboarding.signup.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/di/SignupModule;", "", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupConfigurationProvider;", "signupConfigurationProvider", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/repository/ConfigurationProvider;", "bindConfigurationProvider", "(Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupConfigurationProvider;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/repository/ConfigurationProvider;", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupFlowConfigurationRepository;", "signupFlowConfigurationRepository", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "bindFlowConfigurationRepository", "(Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupFlowConfigurationRepository;)Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface SignupModule {
    @dagger.Binds
    com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider bindConfigurationProvider(com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider signupConfigurationProvider);

    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository bindFlowConfigurationRepository(com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository signupFlowConfigurationRepository);
}
