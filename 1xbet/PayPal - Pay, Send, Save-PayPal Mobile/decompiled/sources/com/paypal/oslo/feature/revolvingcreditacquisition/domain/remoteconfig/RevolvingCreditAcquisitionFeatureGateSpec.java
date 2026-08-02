package com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0007\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/remoteconfig/RevolvingCreditAcquisitionFeatureGateSpec;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "isNativeFlowEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isNativeFlowEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "killSwitchPpccUs$delegate", "getKillSwitchPpccUs", "killSwitchPpccUs", "killSwitchCbmc$delegate", "getKillSwitchCbmc", "killSwitchCbmc", "killSwitchPpUkPpc$delegate", "getKillSwitchPpUkPpc", "killSwitchPpUkPpc"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditAcquisitionFeatureGateSpec extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.class, "isNativeFlowEnabled", "isNativeFlowEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.class, "killSwitchPpccUs", "getKillSwitchPpccUs()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.class, "killSwitchCbmc", "getKillSwitchCbmc()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.class, "killSwitchPpUkPpc", "getKillSwitchPpUkPpc()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec INSTANCE;

    /* renamed from: isNativeFlowEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty isNativeFlowEnabled;

    /* renamed from: killSwitchCbmc$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty killSwitchCbmc;

    /* renamed from: killSwitchPpUkPpc$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty killSwitchPpUkPpc;

    /* renamed from: killSwitchPpccUs$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty killSwitchPpccUs;

    private RevolvingCreditAcquisitionFeatureGateSpec() {
        super("revolving_credit_acquisition");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey isNativeFlowEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) isNativeFlowEnabled.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getKillSwitchPpccUs() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) killSwitchPpccUs.getValue(this, Camera2StreamConfigurationMap[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getKillSwitchCbmc() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) killSwitchCbmc.getValue(this, Camera2StreamConfigurationMap[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getKillSwitchPpUkPpc() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) killSwitchPpUkPpc.getValue(this, Camera2StreamConfigurationMap[3]);
    }

    static {
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec revolvingCreditAcquisitionFeatureGateSpec = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec();
        INSTANCE = revolvingCreditAcquisitionFeatureGateSpec;
        isNativeFlowEnabled = revolvingCreditAcquisitionFeatureGateSpec.create("enable_native_flow");
        killSwitchPpccUs = revolvingCreditAcquisitionFeatureGateSpec.create("kill_switch_ppcc_us");
        killSwitchCbmc = revolvingCreditAcquisitionFeatureGateSpec.create("kill_switch_cbmc");
        killSwitchPpUkPpc = revolvingCreditAcquisitionFeatureGateSpec.create("kill_switch_pp_uk_ppc");
        $stable = 8;
    }
}
