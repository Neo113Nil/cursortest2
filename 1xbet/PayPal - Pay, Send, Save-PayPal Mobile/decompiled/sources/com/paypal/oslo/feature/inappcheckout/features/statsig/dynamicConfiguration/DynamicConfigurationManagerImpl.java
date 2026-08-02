package com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002()B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030 H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020%0$*\u0006\u0012\u0002\b\u00030$H\u0002¢\u0006\u0004\b\"\u0010&R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManagerImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "hasSampleDynamicConfig", "()Z", "", "getCheckoutDataMaxRetries", "()I", "", "getCheckoutDataRetryIntervalDelay", "()J", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "upgradePath", "checkoutFlow", "isFlowAllowed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "isAllFlowsDisallowed", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/Disallowed;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/Disallowed;", "p0", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/Disallowed;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "getHighSpeedVideoSizes", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/TokenType;", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "DynamicConfigurations", "VersionGatingConfigurations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicConfigurationManagerImpl implements com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DynamicConfigurationManagerImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager
    public final boolean hasSampleDynamicConfig() {
        return ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.getHighResolutionOutputSizeshNQ4ISI[0]))).booleanValue();
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager
    public final int getCheckoutDataMaxRetries() {
        return ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.getHighResolutionOutputSizeshNQ4ISI[1]))).intValue();
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager
    public final long getCheckoutDataRetryIntervalDelay() {
        return ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.getHighResolutionOutputSizeshNQ4ISI[2]))).longValue();
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager
    public final boolean isFlowAllowed(java.lang.String platform, java.lang.String upgradePath, java.lang.String checkoutFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upgradePath, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutFlow, "");
        return getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(), platform, upgradePath, checkoutFlow);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager
    public final boolean isAllFlowsDisallowed(java.lang.String upgradePath, java.lang.String checkoutFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upgradePath, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutFlow, "");
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        return (getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, "native", upgradePath, checkoutFlow) || getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, "web", upgradePath, checkoutFlow)) ? false : true;
    }

    private final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed getHighSpeedVideoFpsRangesFor() {
        java.util.Map map = (java.util.Map) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations.getHighSpeedVideoFpsRanges[0]));
        java.lang.Object obj = map.get("web");
        java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience highSpeedVideoSizes = map2 != null ? getHighSpeedVideoSizes((java.util.Map<?, ?>) map2) : null;
        java.lang.Object obj2 = map.get("native");
        java.util.Map map3 = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed(highSpeedVideoSizes, map3 != null ? getHighSpeedVideoSizes((java.util.Map<?, ?>) map3) : null);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience;
        if (com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType.INSTANCE.fromValue(p3) == null) {
            return true;
        }
        java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list = null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, "web")) {
            checkoutExperience = p0.getWeb();
        } else {
            checkoutExperience = kotlin.jvm.internal.Intrinsics.areEqual(p1, "native") ? p0.getNative() : null;
        }
        if (checkoutExperience == null) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, "merchantUpgrade")) {
            list = checkoutExperience.getMerchantUpgrade();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(p2, "noMerchantUpgrade")) {
            list = checkoutExperience.getNoMerchantUpgrade();
        }
        if (list == null) {
            return true;
        }
        return !list.contains(r6);
    }

    private static com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience getHighSpeedVideoSizes(java.util.Map<?, ?> map) {
        java.lang.Object obj = map.get("merchantUpgrade");
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> highSpeedVideoSizes = list != null ? getHighSpeedVideoSizes((java.util.List<?>) list) : null;
        java.lang.Object obj2 = map.get("noMerchantUpgrade");
        java.util.List list2 = obj2 instanceof java.util.List ? (java.util.List) obj2 : null;
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience(highSpeedVideoSizes, list2 != null ? getHighSpeedVideoSizes((java.util.List<?>) list2) : null);
    }

    private static java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> getHighSpeedVideoSizes(java.util.List<?> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof java.lang.String) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType fromValue = com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType.INSTANCE.fromValue((java.lang.String) it.next());
            if (fromValue != null) {
                arrayList2.add(fromValue);
            }
        }
        return arrayList2;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManagerImpl$DynamicConfigurations;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "Camera2StreamConfigurationMap", "Lkotlin/properties/ReadOnlyProperty;", "", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    static final class DynamicConfigurations extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.class, "sampleDynamicConfig", "getSampleDynamicConfig()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.class, "maxRetries", "getMaxRetries()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations.class, "retryIntervalDelay", "getRetryIntervalDelay()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        private DynamicConfigurations() {
            super(com.paypal.oslo.feature.inappcheckout.features.statsig.domain.InAppCheckoutStatsig.DOMAIN, com.paypal.oslo.feature.inappcheckout.features.statsig.domain.InAppCheckoutStatsig.DYNAMIC_CONFIGURATION_CONFIG_NAME);
        }

        static {
            com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations dynamicConfigurations = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.DynamicConfigurations();
            INSTANCE = dynamicConfigurations;
            Camera2StreamConfigurationMap = dynamicConfigurations.create(java.lang.Boolean.TRUE, "sample_dynamic_config");
            getHighSpeedVideoFpsRanges = dynamicConfigurations.create(1, "fetch_checkout_data_max_retries");
            getHighSpeedVideoFpsRangesFor = dynamicConfigurations.create(1000L, "fetch_checkout_data_retries_interval_delay");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManagerImpl$VersionGatingConfigurations;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "", "getHighSpeedVideoFpsRangesFor", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    static final class VersionGatingConfigurations extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations.class, "disallowed", "getDisallowed()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        private VersionGatingConfigurations() {
            super(com.paypal.oslo.feature.inappcheckout.features.statsig.domain.InAppCheckoutStatsig.DOMAIN, com.paypal.oslo.feature.inappcheckout.features.statsig.domain.InAppCheckoutStatsig.VERSION_GATING_CONFIG_NAME);
        }

        static {
            com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations versionGatingConfigurations = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl.VersionGatingConfigurations();
            INSTANCE = versionGatingConfigurations;
            getHighSpeedVideoFpsRanges = versionGatingConfigurations.create(kotlin.collections.MapsKt.emptyMap(), "disallowed");
        }
    }
}
