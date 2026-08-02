package com.paypal.oslo.core.remoteconfig.companion;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionResolver;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "Lcom/paypal/oslo/core/remoteconfig/companion/StatsigOverrideManager;", "statsigOverrideManager", "Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "featureGateRegistry", "Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;", "dynamicConfigRegistry", "Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;", "experimentRegistry", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/companion/StatsigOverrideManager;Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;)V", "", "fieldId", "", "canHandleField", "(Ljava/lang/String;)Z", "", "currentValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "overrideValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/companion/StatsigOverrideManager;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfigSectionResolver implements com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver {
    private final com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RemoteConfigSectionResolver(com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager statsigOverrideManager, com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry, com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry, com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigOverrideManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experimentRegistry, "");
        this.getHighSpeedVideoSizes = statsigOverrideManager;
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateRegistry;
        this.getHighSpeedVideoFpsRanges = dynamicConfigRegistry;
        this.Camera2StreamConfigurationMap = experimentRegistry;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean canHandleField(java.lang.String fieldId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        return (this.getHighResolutionOutputSizeshNQ4ISI.find(fieldId) == null && this.getHighSpeedVideoFpsRanges.find(fieldId) == null && this.Camera2StreamConfigurationMap.find(fieldId) == null) ? false : true;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final java.lang.Object defaultValue(java.lang.String fieldId, java.lang.Object currentValue) {
        java.lang.Object defaultValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry find = this.getHighResolutionOutputSizeshNQ4ISI.find(fieldId);
        if (find != null && (defaultValue = find.getDefaultValue()) != null) {
            return defaultValue;
        }
        com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry find2 = this.getHighSpeedVideoFpsRanges.find(fieldId);
        if (find2 != null) {
            return find2.getDefaultValue();
        }
        com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry find3 = this.Camera2StreamConfigurationMap.find(fieldId);
        if (find3 != null) {
            return find3.getDefaultValue();
        }
        return null;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean overrideValue(java.lang.String fieldId, java.lang.Object newValue) {
        final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry find;
        java.lang.Boolean booleanStrictOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (!canHandleField(fieldId)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Field not found in remote config registries", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId)), null, 4, null);
            return false;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.find(fieldId) == null) {
            if (this.getHighSpeedVideoFpsRanges.find(fieldId) == null) {
                if (this.Camera2StreamConfigurationMap.find(fieldId) == null || (find = this.Camera2StreamConfigurationMap.find(fieldId)) == null) {
                    return false;
                }
                final java.lang.String groupName = find.getGroupName();
                if (groupName == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Experiment entry missing groupName", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId)), null, 4, null);
                    return false;
                }
                if (newValue == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Null value for experiment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId)), null, 4, null);
                    return false;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Overriding experiment parameter", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("groupName", groupName), kotlin.TuplesKt.to("parameterKey", find.getKey()), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, newValue)), null, 4, null);
                this.getHighSpeedVideoSizes.overrideConfigParameter(new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object>(groupName, find) { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver$handleExperiment$experimentKey$1
                    private final java.lang.Object defaultValue;
                    private final java.lang.String domain = com.paypal.oslo.core.remoteconfig.StatsigHelper.COMPANION_APP_DOMAIN;
                    private final java.lang.String groupName;
                    private final java.lang.String keyName;

                    {
                        this.groupName = groupName;
                        this.keyName = find.getKey();
                        this.defaultValue = find.getDefaultValue();
                    }

                    @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
                    public final java.lang.String getDomain() {
                        return this.domain;
                    }

                    @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey
                    public final java.lang.String getGroupName() {
                        return this.groupName;
                    }

                    @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
                    public final java.lang.String getKeyName() {
                        return this.keyName;
                    }

                    @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey
                    public final java.lang.Object getDefaultValue() {
                        return this.defaultValue;
                    }
                }, newValue);
                return true;
            }
            final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry find2 = this.getHighSpeedVideoFpsRanges.find(fieldId);
            if (find2 == null) {
                return false;
            }
            final java.lang.String groupName2 = find2.getGroupName();
            if (groupName2 == null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Dynamic config entry missing groupName", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId)), null, 4, null);
                return false;
            }
            if (newValue == null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Null value for dynamic config", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId)), null, 4, null);
                return false;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Overriding dynamic config parameter", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("groupName", groupName2), kotlin.TuplesKt.to("parameterKey", find2.getKey()), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, newValue)), null, 4, null);
            this.getHighSpeedVideoSizes.overrideConfigParameter(new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object>(groupName2, find2) { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver$handleDynamicConfig$configKey$1
                private final java.lang.Object defaultValue;
                private final java.lang.String domain = com.paypal.oslo.core.remoteconfig.StatsigHelper.COMPANION_APP_DOMAIN;
                private final java.lang.String groupName;
                private final java.lang.String keyName;

                {
                    this.groupName = groupName2;
                    this.keyName = find2.getKey();
                    this.defaultValue = find2.getDefaultValue();
                }

                @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
                public final java.lang.String getDomain() {
                    return this.domain;
                }

                @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey
                public final java.lang.String getGroupName() {
                    return this.groupName;
                }

                @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
                public final java.lang.String getKeyName() {
                    return this.keyName;
                }

                @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey
                public final java.lang.Object getDefaultValue() {
                    return this.defaultValue;
                }
            }, newValue);
            return true;
        }
        if (newValue instanceof java.lang.Boolean) {
            booleanStrictOrNull = (java.lang.Boolean) newValue;
        } else {
            booleanStrictOrNull = newValue instanceof java.lang.String ? kotlin.text.StringsKt.toBooleanStrictOrNull((java.lang.String) newValue) : null;
        }
        if (booleanStrictOrNull == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Invalid boolean value for feature gate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, newValue)), null, 4, null);
            return false;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Overriding feature gate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", fieldId), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, booleanStrictOrNull)), null, 4, null);
        this.getHighSpeedVideoSizes.overrideGate(com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.toRemoteConfigKey$remote_config_release(fieldId, com.paypal.oslo.core.remoteconfig.StatsigHelper.COMPANION_APP_DOMAIN), booleanStrictOrNull.booleanValue());
        return true;
    }
}
