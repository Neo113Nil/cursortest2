package com.paypal.oslo.core.remoteconfig.registry;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\n\u001a\u00020\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;", "Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigRegistry;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "<init>", "()V", "key", "", "displayName", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", "createEntry", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", "groupName", "keyName", "", "defaultValue", "", "registerFromCdn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "configType", "Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "getConfigType", "()Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExperimentRegistry extends com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<?>> {
    private final com.paypal.oslo.core.remoteconfig.registry.ConfigType configType = com.paypal.oslo.core.remoteconfig.registry.ConfigType.EXPERIMENT;

    @javax.inject.Inject
    public ExperimentRegistry() {
    }

    @Override // com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry
    protected final com.paypal.oslo.core.remoteconfig.registry.ConfigType getConfigType() {
        return this.configType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry
    public final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry createEntry(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<?> key, java.lang.String displayName, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        java.lang.String groupName = key.getGroupName();
        java.lang.String keyName = key.getKeyName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(groupName);
        sb.append(".");
        sb.append(keyName);
        java.lang.String obj = sb.toString();
        java.lang.String keyName2 = key.getKeyName();
        com.paypal.oslo.core.remoteconfig.registry.ConfigType configType = com.paypal.oslo.core.remoteconfig.registry.ConfigType.EXPERIMENT;
        java.lang.Object defaultValue = key.getDefaultValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
        return new com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry(keyName2, displayName, description, configType, defaultValue, key.getGroupName(), obj);
    }

    public final void registerFromCdn(java.lang.String groupName, java.lang.String keyName, java.lang.String displayName, java.lang.String description, java.lang.Object defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groupName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        registerFromCdnInternal(keyName, displayName, description, defaultValue, groupName);
    }
}
