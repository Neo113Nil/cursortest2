package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/di/AccountCreationImageModule;", "", "", "Ljava/lang/Class;", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/ui/common/StepImageProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "bindStepImageProviders", "()Ljava/util/Map;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/AccountCreationSubmissionImageProvider;", "provider", "bindAccountCreationSubmissionImageProvider", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/AccountCreationSubmissionImageProvider;)Lcom/paypal/oslo/feature/oneonboarding/ui/common/StepImageProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface AccountCreationImageModule {
    @com.paypal.oslo.feature.oneonboarding.ui.di.StepComponentConfigKey(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.domain.AccountCreationSubmissionStepComponentConfig.class)
    @dagger.Binds
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider bindAccountCreationSubmissionImageProvider(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionImageProvider provider);

    @dagger.multibindings.Multibinds
    java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider> bindStepImageProviders();
}
