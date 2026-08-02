package com.paypal.oslo.feature.subscriptions.shared.config;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "linkBusinessesEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getLinkBusinessesEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "linkBusinessesEnabled", "linkSubscriptionsEnabled$delegate", "getLinkSubscriptionsEnabled", "linkSubscriptionsEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates.class, "linkBusinessesEnabled", "getLinkBusinessesEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates.class, "linkSubscriptionsEnabled", "getLinkSubscriptionsEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: linkBusinessesEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty linkBusinessesEnabled;

    /* renamed from: linkSubscriptionsEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty linkSubscriptionsEnabled;

    private SubscriptionsFeatureGates() {
        super("subscriptions");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLinkBusinessesEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) linkBusinessesEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLinkSubscriptionsEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) linkSubscriptionsEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates subscriptionsFeatureGates = new com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates();
        INSTANCE = subscriptionsFeatureGates;
        linkBusinessesEnabled = subscriptionsFeatureGates.create(com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsRemoteConfigConstants.FeatureGates.LINK_BUSINESSES_ENABLED_KEY);
        linkSubscriptionsEnabled = subscriptionsFeatureGates.create(com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsRemoteConfigConstants.FeatureGates.LINK_SUBSCRIPTIONS_ENABLED_KEY);
        $stable = 8;
    }
}
