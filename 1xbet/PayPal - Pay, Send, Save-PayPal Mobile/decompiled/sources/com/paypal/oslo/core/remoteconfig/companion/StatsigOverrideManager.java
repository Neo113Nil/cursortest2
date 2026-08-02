package com.paypal.oslo.core.remoteconfig.companion;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0013\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u001a\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/companion/StatsigOverrideManager;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "overrideGate", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;Z)V", "T", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "overrideConfig", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;Ljava/util/Map;)V", "overrideConfigParameter", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;Ljava/lang/Object;)V", "removeOverride", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)V", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;)V", "clearAllOverrides", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "hasOverride", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Z", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatsigOverrideManager {
    @javax.inject.Inject
    public StatsigOverrideManager() {
    }

    public final void overrideGate(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Overriding feature gate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("gateName", key.getKeyName()), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Boolean.valueOf(value))), null, 4, null);
        com.statsig.androidsdk.Statsig.overrideGate(key.getKeyName(), value);
    }

    public final <T> void overrideConfig(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key, java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Overriding config/experiment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("configGroupName", key.getGroupName()), kotlin.TuplesKt.to("parameterCount", java.lang.Integer.valueOf(value.size()))), null, 4, null);
        com.statsig.androidsdk.Statsig.overrideConfig(key.getGroupName(), value);
    }

    public final <T> void overrideConfigParameter(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key, T value) {
        java.util.LinkedHashMap linkedHashMap;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            java.util.Map<java.lang.String, java.lang.Object> map = getAllOverrides().getConfigs().get(key.getGroupName());
            if (map == null || (linkedHashMap = kotlin.collections.MapsKt.toMutableMap(map)) == null) {
                linkedHashMap = new java.util.LinkedHashMap();
            }
            java.lang.String keyName = key.getKeyName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            linkedHashMap.put(keyName, value);
            com.statsig.androidsdk.Statsig.overrideConfig(key.getGroupName(), linkedHashMap);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Overriding config parameter", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("configGroupName", key.getGroupName()), kotlin.TuplesKt.to("parameterKey", key.getKeyName()), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, value)), null, 4, null);
        }
    }

    public final void removeOverride(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Removing gate override", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("gateName", key.getKeyName())), null, 4, null);
        com.statsig.androidsdk.Statsig.removeOverride(key.getKeyName());
    }

    public final <T> void removeOverride(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Removing config/experiment override", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("configGroupName", key.getGroupName())), null, 4, null);
        com.statsig.androidsdk.Statsig.removeOverride(key.getGroupName());
    }

    public final void clearAllOverrides() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Clearing all remote config overrides", null, null, 6, null);
        com.statsig.androidsdk.Statsig.removeAllOverrides();
    }

    public final com.statsig.androidsdk.StatsigOverrides getAllOverrides() {
        return com.statsig.androidsdk.Statsig.getAllOverrides();
    }

    public final boolean hasOverride(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getAllOverrides().getGates().containsKey(key.getKeyName());
    }

    public final <T> boolean hasOverride(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.statsig.androidsdk.StatsigOverrides allOverrides = getAllOverrides();
        return allOverrides.getConfigs().containsKey(key.getGroupName()) || allOverrides.getLayers().containsKey(key.getGroupName());
    }
}
