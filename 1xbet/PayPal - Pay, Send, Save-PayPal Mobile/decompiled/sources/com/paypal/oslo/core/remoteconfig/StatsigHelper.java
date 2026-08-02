package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/StatsigHelper;", "", "<init>", "()V", "T", "Lcom/statsig/androidsdk/DynamicConfig;", "config", "", "key", "defaultValue", "getTypedValue", "(Lcom/statsig/androidsdk/DynamicConfig;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "domain", "definedName$remote_config_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "toRemoteConfigKey$remote_config_release", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "COMPANION_APP_DOMAIN", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatsigHelper {
    public static final java.lang.String COMPANION_APP_DOMAIN = "companion_app";
    public static final com.paypal.oslo.core.remoteconfig.StatsigHelper INSTANCE = new com.paypal.oslo.core.remoteconfig.StatsigHelper();

    private StatsigHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T getTypedValue(com.statsig.androidsdk.DynamicConfig config, java.lang.String key, T defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (defaultValue instanceof java.lang.String) {
            return (T) config.getString(key, (java.lang.String) defaultValue);
        }
        if (defaultValue instanceof java.lang.Boolean) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
            return (T) java.lang.Boolean.valueOf(config.getBoolean(key, ((java.lang.Boolean) defaultValue).booleanValue()));
        }
        if (defaultValue instanceof java.lang.Integer) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
            return (T) java.lang.Integer.valueOf(config.getInt(key, ((java.lang.Integer) defaultValue).intValue()));
        }
        if (defaultValue instanceof java.lang.Long) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
            return (T) java.lang.Long.valueOf(config.getLong(key, ((java.lang.Long) defaultValue).longValue()));
        }
        if (!(defaultValue instanceof java.lang.Double)) {
            return defaultValue instanceof java.lang.Object[] ? (T) config.getArray(key, (java.lang.Object[]) defaultValue) : defaultValue instanceof java.util.Map ? (T) config.getDictionary(key, (java.util.Map) defaultValue) : defaultValue;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
        return (T) java.lang.Double.valueOf(config.getDouble(key, ((java.lang.Double) defaultValue).doubleValue()));
    }

    public final java.lang.String definedName$remote_config_release(java.lang.String domain, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(domain);
        sb.append("_");
        sb.append(key);
        return sb.toString();
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey toRemoteConfigKey$remote_config_release(final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey(str, str2) { // from class: com.paypal.oslo.core.remoteconfig.StatsigHelper$toRemoteConfigKey$1
            private final java.lang.String domain;
            private final java.lang.String keyName;

            {
                this.keyName = str;
                this.domain = str2;
            }

            @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
            public final java.lang.String getKeyName() {
                return this.keyName;
            }

            @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
            public final java.lang.String getDomain() {
                return this.domain;
            }
        };
    }
}
