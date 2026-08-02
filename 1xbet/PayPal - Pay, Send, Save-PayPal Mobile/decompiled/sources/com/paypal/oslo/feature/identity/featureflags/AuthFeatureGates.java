package com.paypal.oslo.feature.identity.featureflags;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/featureflags/AuthFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "createNewBusinessAccountEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCreateNewBusinessAccountEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "createNewBusinessAccountEnabled", "inboundConnectEnabled$delegate", "getInboundConnectEnabled", "inboundConnectEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates INSTANCE;

    /* renamed from: createNewBusinessAccountEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty createNewBusinessAccountEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates.class, "createNewBusinessAccountEnabled", "getCreateNewBusinessAccountEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates.class, "inboundConnectEnabled", "getInboundConnectEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: inboundConnectEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty inboundConnectEnabled;

    private AuthFeatureGates() {
        super("identity");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCreateNewBusinessAccountEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) createNewBusinessAccountEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getInboundConnectEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) inboundConnectEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
    }

    static {
        com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates authFeatureGates = new com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates();
        INSTANCE = authFeatureGates;
        createNewBusinessAccountEnabled = authFeatureGates.create("native_sharedauth_create_business_account_enabled");
        inboundConnectEnabled = authFeatureGates.create("native_inbound_connect_enabled");
        $stable = 8;
    }
}
