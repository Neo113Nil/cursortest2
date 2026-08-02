package com.paypal.oslo.feature.p2p.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0015\u0010\t\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0015\u0010\n\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0015\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0015\u0010\u000e\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0015\u0010\r\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0015\u0010\b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/remoteconfig/P2pFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getInputFormats", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Camera2StreamConfigurationMap", "getOutputFormats", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class P2pFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "cryptoPickerEnabled", "getCryptoPickerEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "qrcFlowEnabled", "getQrcFlowEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "contactSyncEnabled", "getContactSyncEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "publicProfileEnabled", "getPublicProfileEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "ppLinkEnabled", "getPpLinkEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "addPaymentMethodEnabled", "getAddPaymentMethodEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.class, "claimMoneyDeeplinkEnabled", "getClaimMoneyDeeplinkEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates INSTANCE;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getOutputFormats;
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI;

    private P2pFeatureGates() {
        super(com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.P2P);
    }

    static {
        com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates p2pFeatureGates = new com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates();
        INSTANCE = p2pFeatureGates;
        getHighSpeedVideoSizes = p2pFeatureGates.create("crypto_enabled");
        getHighResolutionOutputSizeshNQ4ISI = p2pFeatureGates.create("qrc_flow_enabled");
        getHighSpeedVideoFpsRangesFor = p2pFeatureGates.create("contact_sync_enabled");
        Camera2StreamConfigurationMap = p2pFeatureGates.create("public_profile_enabled");
        getHighSpeedVideoFpsRanges = p2pFeatureGates.create("pp_link_enabled");
        getOutputFormats = p2pFeatureGates.create("transfers_add_payment_method_enabled");
        getOutputMinFrameDuration = p2pFeatureGates.create("claim_money_deeplink_enabled");
    }
}
