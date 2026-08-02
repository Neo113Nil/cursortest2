package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/GetPageConfigurationUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/repository/ConfigurationProvider;", "configurationProvider", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/repository/ConfigurationProvider;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "invoke-7h4kOIA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/repository/ConfigurationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPageConfigurationUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetPageConfigurationUseCase(com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider configurationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationProvider, "");
        this.getHighSpeedVideoSizes = configurationProvider;
    }

    /* renamed from: invoke-7h4kOIA, reason: not valid java name */
    public final java.lang.Object m16330invoke7h4kOIA(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig> continuation) {
        return this.getHighSpeedVideoSizes.mo16268getPageConfig7h4kOIA(str, str2, str3, continuation);
    }
}
