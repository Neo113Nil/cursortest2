package com.paypal.oslo.feature.onboarding.signup.email.data.config;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/data/config/OnboardingEmailDomainSuggestionsConfigSpec;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "emailDomains$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getEmailDomains", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "emailDomains"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingEmailDomainSuggestionsConfigSpec extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.onboarding.signup.email.data.config.OnboardingEmailDomainSuggestionsConfigSpec INSTANCE;

    /* renamed from: emailDomains$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty emailDomains;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.onboarding.signup.email.data.config.OnboardingEmailDomainSuggestionsConfigSpec.class, "emailDomains", "getEmailDomains()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    private OnboardingEmailDomainSuggestionsConfigSpec() {
        super(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT, "email_domain_suggestions");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String[]> getEmailDomains() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) emailDomains.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.email.data.config.OnboardingEmailDomainSuggestionsConfigSpec onboardingEmailDomainSuggestionsConfigSpec = new com.paypal.oslo.feature.onboarding.signup.email.data.config.OnboardingEmailDomainSuggestionsConfigSpec();
        INSTANCE = onboardingEmailDomainSuggestionsConfigSpec;
        emailDomains = onboardingEmailDomainSuggestionsConfigSpec.create(new java.lang.String[0], "email_domains");
        $stable = 8;
    }
}
