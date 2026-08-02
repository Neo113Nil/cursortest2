package com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/BnplAcquisitionFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mockApiEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getMockApiEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mockApiEnabled", "ProductGates", "CpiGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplAcquisitionFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.class, "mockApiEnabled", "getMockApiEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: mockApiEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty mockApiEnabled;

    private BnplAcquisitionFeatureGates() {
        super(com.paypal.oslo.feature.bnplacquisition.remoteconfigs.BnplAcquisitionConstants.RemoteConfig.DOMAIN);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getMockApiEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) mockApiEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/BnplAcquisitionFeatureGates$ProductGates;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "instore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getInstore", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "instore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProductGates {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.ProductGates.class, "instore", "getInstore()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
        public static final com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.ProductGates INSTANCE = new com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.ProductGates();

        /* renamed from: instore$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty instore = com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.INSTANCE.create("instore_product_enabled");
        public static final int $stable = 8;

        private ProductGates() {
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getInstore() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) instore.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/remoteconfigs/featureflags/BnplAcquisitionFeatureGates$CpiGates;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "longTerm$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getLongTerm", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "longTerm", "shortTerm$delegate", "getShortTerm", "shortTerm"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CpiGates {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.CpiGates.class, "longTerm", "getLongTerm()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.CpiGates.class, "shortTerm", "getShortTerm()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
        public static final com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.CpiGates INSTANCE = new com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.CpiGates();

        /* renamed from: longTerm$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty longTerm = com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.INSTANCE.create("long_term_cpi_enabled");

        /* renamed from: shortTerm$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty shortTerm = com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates.INSTANCE.create("short_term_cpi_enabled");
        public static final int $stable = 8;

        private CpiGates() {
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLongTerm() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) longTerm.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getShortTerm() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) shortTerm.getValue(this, getHighSpeedVideoFpsRanges[1]);
        }
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates bnplAcquisitionFeatureGates = new com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.BnplAcquisitionFeatureGates();
        INSTANCE = bnplAcquisitionFeatureGates;
        mockApiEnabled = bnplAcquisitionFeatureGates.create("mock_api_enabled");
        $stable = 8;
    }
}
