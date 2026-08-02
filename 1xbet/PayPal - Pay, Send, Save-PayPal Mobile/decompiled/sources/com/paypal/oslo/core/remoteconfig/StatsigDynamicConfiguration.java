package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/StatsigDynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Lcom/statsig/androidsdk/Statsig;", "statsig", "<init>", "(Lcom/statsig/androidsdk/Statsig;)V", "T", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "key", "getValue", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/Statsig;", "getStatsig", "()Lcom/statsig/androidsdk/Statsig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatsigDynamicConfiguration implements com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration {
    private final com.statsig.androidsdk.Statsig statsig;

    public StatsigDynamicConfiguration(com.statsig.androidsdk.Statsig statsig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsig, "");
        this.statsig = statsig;
    }

    public final com.statsig.androidsdk.Statsig getStatsig() {
        return this.statsig;
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration
    public final <T> T getValue(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!com.statsig.androidsdk.Statsig.isInitialized()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_dynamic_config_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", key.getDomain()), kotlin.TuplesKt.to("key_name", key.getKeyName()), kotlin.TuplesKt.to("reason", com.paypal.android.threeds.utils.ConstantUtil.SDK_NOT_INITIALIZED)), null, 4, null);
            return key.getDefaultValue();
        }
        com.statsig.androidsdk.DynamicConfig config = com.statsig.androidsdk.Statsig.getConfig(key.getGroupName());
        T t = (T) com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.getTypedValue(config, key.getKeyName(), key.getDefaultValue());
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_dynamic_config_exposure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", key.getDomain()), kotlin.TuplesKt.to("group_name", key.getGroupName()), kotlin.TuplesKt.to("key_name", key.getKeyName()), kotlin.TuplesKt.to("value_config", t), kotlin.TuplesKt.to("reason", config.getDetails().getReason())), null, 4, null);
        return t;
    }
}
