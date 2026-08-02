package com.paypal.oslo.feature.qrc.featureflags;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/featureflags/QrcFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "showToPay$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getShowToPay", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "showToPay", "getPaidP2pQrCode$delegate", "getGetPaidP2pQrCode", "getPaidP2pQrCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGates INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGates.class, "showToPay", "getShowToPay()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGates.class, "getPaidP2pQrCode", "getGetPaidP2pQrCode()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: getPaidP2pQrCode$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty getPaidP2pQrCode;

    /* renamed from: showToPay$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty showToPay;

    private QrcFeatureGates() {
        super("qrc");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getShowToPay() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) showToPay.getValue(this, getHighSpeedVideoSizes[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getGetPaidP2pQrCode() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) getPaidP2pQrCode.getValue(this, getHighSpeedVideoSizes[1]);
    }

    static {
        com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGates qrcFeatureGates = new com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGates();
        INSTANCE = qrcFeatureGates;
        showToPay = qrcFeatureGates.create("show_to_pay");
        getPaidP2pQrCode = qrcFeatureGates.create("get_paid_p2p_qrcode");
        $stable = 8;
    }
}
