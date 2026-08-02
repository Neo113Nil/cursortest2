package com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "", "", "hasSampleDynamicConfig", "()Z", "", "getCheckoutDataMaxRetries", "()I", "", "getCheckoutDataRetryIntervalDelay", "()J", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "upgradePath", "checkoutFlow", "isFlowAllowed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "isAllFlowsDisallowed", "(Ljava/lang/String;Ljava/lang/String;)Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DynamicConfigurationManager {
    public static final java.lang.String CHECKOUT_FLOW_BA = "billing";
    public static final java.lang.String CHECKOUT_FLOW_ECS = "onetime";
    public static final java.lang.String CHECKOUT_FLOW_VA = "vaulting";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager.Companion INSTANCE = com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager.Companion.getHighSpeedVideoFpsRangesFor;
    public static final java.lang.String PLATFORM_NATIVE = "native";
    public static final java.lang.String PLATFORM_WEB = "web";
    public static final java.lang.String UPGRADE_PATH_MU = "merchantUpgrade";
    public static final java.lang.String UPGRADE_PATH_NOMU = "noMerchantUpgrade";

    int getCheckoutDataMaxRetries();

    long getCheckoutDataRetryIntervalDelay();

    boolean hasSampleDynamicConfig();

    boolean isAllFlowsDisallowed(java.lang.String upgradePath, java.lang.String checkoutFlow);

    boolean isFlowAllowed(java.lang.String platform, java.lang.String upgradePath, java.lang.String checkoutFlow);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager$Companion;", "", "<init>", "()V", "", "PLATFORM_WEB", "Ljava/lang/String;", "PLATFORM_NATIVE", "UPGRADE_PATH_MU", "UPGRADE_PATH_NOMU", "CHECKOUT_FLOW_BA", "CHECKOUT_FLOW_ECS", "CHECKOUT_FLOW_VA"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String CHECKOUT_FLOW_BA = "billing";
        public static final java.lang.String CHECKOUT_FLOW_ECS = "onetime";
        public static final java.lang.String CHECKOUT_FLOW_VA = "vaulting";
        public static final java.lang.String PLATFORM_NATIVE = "native";
        public static final java.lang.String PLATFORM_WEB = "web";
        public static final java.lang.String UPGRADE_PATH_MU = "merchantUpgrade";
        public static final java.lang.String UPGRADE_PATH_NOMU = "noMerchantUpgrade";
        static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager.Companion();

        private Companion() {
        }
    }
}
