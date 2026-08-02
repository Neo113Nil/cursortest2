package com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0015\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0015\u0010\n\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0015\u0010\u000b\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0015\u0010\f\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/gates/FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getOutputFormats", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges", "getInputFormats", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.class, "widgetEntrypointEnabled", "getWidgetEntrypointEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.class, "widgetAcquisitionEntrypointEnabled", "getWidgetAcquisitionEntrypointEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.class, "cardConnectEntrypointEnabled", "getCardConnectEntrypointEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.class, "ppdcContingencyHandlingEnabled", "getPpdcContingencyHandlingEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.class, "additionalCardholderManagementEnabled", "getAdditionalCardholderManagementEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates INSTANCE;
    static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

    private FeatureGates() {
        super("debit_card");
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates featureGates = new com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates();
        INSTANCE = featureGates;
        getHighSpeedVideoFpsRanges = featureGates.create("entrypoint_enabled");
        getHighSpeedVideoFpsRangesFor = featureGates.create(com.paypal.oslo.feature.cashin.common.CashInConstants.DebitCardIntegration.ACQUISITION_ENTRYPOINT_KEY);
        getHighResolutionOutputSizeshNQ4ISI = featureGates.create("card_connect_entrypoint_enabled");
        getHighSpeedVideoSizes = featureGates.create("ppdc_contingency_handling_enabled");
        Camera2StreamConfigurationMap = featureGates.create("additional_cardholder_management_enabled");
    }
}
