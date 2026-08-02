package com.paypal.oslo.core.remoteconfig.registry;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u0004R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigRegistry;", "K", "", "<init>", "()V", "key", "", "displayName", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", "createEntry", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", "", "register", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "", "getAll", "()Ljava/util/List;", "keyName", "find", "(Ljava/lang/String;)Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "registerEntry", "(Lcom/paypal/oslo/core/remoteconfig/registry/RemoteConfigEntry;)V", "defaultValue", "groupName", "registerFromCdnInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "clear$remote_config_release", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ConcurrentHashMap;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "getConfigType", "()Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "configType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RemoteConfigRegistry<K> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap<>();

    protected abstract com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry createEntry(K key, java.lang.String displayName, java.lang.String description);

    protected abstract com.paypal.oslo.core.remoteconfig.registry.ConfigType getConfigType();

    public final void register(K key, java.lang.String displayName, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry createEntry = createEntry(key, displayName, description);
        this.Camera2StreamConfigurationMap.put(createEntry.getFullKey(), createEntry);
    }

    public final java.util.List<com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry> getAll() {
        java.util.Collection<com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry> values = this.Camera2StreamConfigurationMap.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        return kotlin.collections.CollectionsKt.toList(values);
    }

    public final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry find(java.lang.String keyName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyName, "");
        com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry remoteConfigEntry = this.Camera2StreamConfigurationMap.get(keyName);
        if (remoteConfigEntry != null) {
            return remoteConfigEntry;
        }
        java.lang.Object obj = null;
        if (getConfigType() == com.paypal.oslo.core.remoteconfig.registry.ConfigType.FEATURE_GATE) {
            return null;
        }
        java.util.Collection<com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry> values = this.Camera2StreamConfigurationMap.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        java.util.Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) next).getKey(), keyName)) {
                obj = next;
                break;
            }
        }
        return (com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) obj;
    }

    protected final void registerEntry(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        this.Camera2StreamConfigurationMap.put(entry.getFullKey(), entry);
    }

    public static /* synthetic */ void registerFromCdnInternal$default(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigRegistry remoteConfigRegistry, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.String str4, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerFromCdnInternal");
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        remoteConfigRegistry.registerFromCdnInternal(str, str2, str3, obj, str4);
    }

    protected final void registerFromCdnInternal(java.lang.String keyName, java.lang.String displayName, java.lang.String description, java.lang.Object defaultValue, java.lang.String groupName) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        if (groupName != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(groupName);
            sb.append(".");
            sb.append(keyName);
            str = sb.toString();
        } else {
            str = keyName;
        }
        registerEntry(new com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry(keyName, displayName, description, getConfigType(), defaultValue, groupName, str));
    }

    public final void clear$remote_config_release() {
        this.Camera2StreamConfigurationMap.clear();
    }
}
