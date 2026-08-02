package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/StatsigExperimentation;", "Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;", "Lcom/statsig/androidsdk/Statsig;", "statsig", "<init>", "(Lcom/statsig/androidsdk/Statsig;)V", "Lcom/paypal/oslo/core/remoteconfig/contract/ExperimentationSpec;", "experiment", "", "isUserInExperiment", "(Lcom/paypal/oslo/core/remoteconfig/contract/ExperimentationSpec;)Z", "T", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "key", "getExperimentValue", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/Statsig;", "getStatsig", "()Lcom/statsig/androidsdk/Statsig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatsigExperimentation implements com.paypal.oslo.core.remoteconfig.contract.Experimentation {
    private final com.statsig.androidsdk.Statsig statsig;

    public StatsigExperimentation(com.statsig.androidsdk.Statsig statsig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsig, "");
        this.statsig = statsig;
    }

    public final com.statsig.androidsdk.Statsig getStatsig() {
        return this.statsig;
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.Experimentation
    public final boolean isUserInExperiment(com.paypal.oslo.core.remoteconfig.contract.ExperimentationSpec experiment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experiment, "");
        if (!com.statsig.androidsdk.Statsig.isInitialized()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_user_in_experiment_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", experiment.getDomain()), kotlin.TuplesKt.to("key_name", experiment.getExperimentName()), kotlin.TuplesKt.to("reason", com.paypal.android.threeds.utils.ConstantUtil.SDK_NOT_INITIALIZED)), null, 4, null);
            return false;
        }
        return com.statsig.androidsdk.Statsig.getExperimentWithExposureLoggingDisabled$default(com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.definedName$remote_config_release(experiment.getDomain(), experiment.getExperimentName()), false, 2, null).getIsUserInExperiment();
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.Experimentation
    public final <T> T getExperimentValue(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!com.statsig.androidsdk.Statsig.isInitialized()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_experiment_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", key.getDomain()), kotlin.TuplesKt.to("key_name", key.getKeyName()), kotlin.TuplesKt.to("reason", com.paypal.android.threeds.utils.ConstantUtil.SDK_NOT_INITIALIZED)), null, 4, null);
            return key.getDefaultValue();
        }
        com.statsig.androidsdk.DynamicConfig experiment$default = com.statsig.androidsdk.Statsig.getExperiment$default(key.getGroupName(), false, 2, null);
        T t = (T) com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.getTypedValue(experiment$default, key.getKeyName(), key.getDefaultValue());
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_experiment_exposure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", key.getDomain()), kotlin.TuplesKt.to("group_name", key.getGroupName()), kotlin.TuplesKt.to("key_name", key.getKeyName()), kotlin.TuplesKt.to("value_config", t), kotlin.TuplesKt.to("reason", experiment$default.getDetails().getReason())), null, 4, null);
        return t;
    }
}
