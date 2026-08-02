package com.paypal.oslo.feature.checkcapture.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig;", "", "Configs", "Manager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CheckCaptureConfig {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Manager;", "", "", "getIngoBaseUrl", "()Ljava/lang/String;", "getIngoPrivacyPolicyUrl", "getIngoTermsAndConditionsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manager {
        java.lang.String getIngoBaseUrl();

        java.lang.String getIngoPrivacyPolicyUrl();

        java.lang.String getIngoTermsAndConditionsUrl();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Configs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "ingoBaseUrl$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getIngoBaseUrl", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "ingoBaseUrl", "ingoPrivacyPolicyUrl$delegate", "getIngoPrivacyPolicyUrl", "ingoPrivacyPolicyUrl", "ingoTermsAndConditionsUrl$delegate", "getIngoTermsAndConditionsUrl", "ingoTermsAndConditionsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Configs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs.class, "ingoBaseUrl", "getIngoBaseUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs.class, "ingoPrivacyPolicyUrl", "getIngoPrivacyPolicyUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs.class, "ingoTermsAndConditionsUrl", "getIngoTermsAndConditionsUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        /* renamed from: ingoBaseUrl$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty ingoBaseUrl;

        /* renamed from: ingoPrivacyPolicyUrl$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty ingoPrivacyPolicyUrl;

        /* renamed from: ingoTermsAndConditionsUrl$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty ingoTermsAndConditionsUrl;

        private Configs() {
            super(com.paypal.oslo.feature.checkcapture.constants.CheckCaptureConstants.RemoteConfig.DOMAIN, "config");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getIngoBaseUrl() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) ingoBaseUrl.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getIngoPrivacyPolicyUrl() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) ingoPrivacyPolicyUrl.getValue(this, getHighSpeedVideoFpsRanges[1]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getIngoTermsAndConditionsUrl() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) ingoTermsAndConditionsUrl.getValue(this, getHighSpeedVideoFpsRanges[2]);
        }

        static {
            com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs configs = new com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs();
            INSTANCE = configs;
            ingoBaseUrl = configs.create("https://check-cashing.spykemobile.net/mobile-sdk/", "ingo_base_url");
            ingoPrivacyPolicyUrl = configs.create("https://ingomoneyapp.com/privacy-policy/", "ingo_privacy_policy_url");
            ingoTermsAndConditionsUrl = configs.create("https://ingomoneyapp.com/terms-conditions/", "ingo_terms_and_conditions_url");
            $stable = 8;
        }
    }
}
