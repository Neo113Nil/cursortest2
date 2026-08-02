package com.paypal.oslo.core.remoteconfig.registry;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigRegistry;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "<init>", "()V", "key", "", "displayName", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", "createEntry", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", "keyName", "", "defaultValue", "", "registerFromCdn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "configType", "Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "getConfigType", "()Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureGateRegistry extends com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey> {
    private final com.paypal.oslo.core.remoteconfig.registry.ConfigType configType = com.paypal.oslo.core.remoteconfig.registry.ConfigType.FEATURE_GATE;

    @javax.inject.Inject
    public FeatureGateRegistry() {
    }

    @Override // com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry
    protected final com.paypal.oslo.core.remoteconfig.registry.ConfigType getConfigType() {
        return this.configType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry
    public final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry createEntry(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key, java.lang.String displayName, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry(key.getKeyName(), displayName, description, com.paypal.oslo.core.remoteconfig.registry.ConfigType.FEATURE_GATE, java.lang.Boolean.FALSE, null, key.getKeyName());
    }

    public final void registerFromCdn(java.lang.String keyName, java.lang.String displayName, java.lang.String description, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        registerFromCdnInternal(keyName, displayName, description, java.lang.Boolean.valueOf(defaultValue), null);
    }
}
