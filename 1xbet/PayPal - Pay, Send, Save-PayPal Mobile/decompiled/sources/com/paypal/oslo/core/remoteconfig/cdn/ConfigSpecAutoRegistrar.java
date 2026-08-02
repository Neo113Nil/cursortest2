package com.paypal.oslo.core.remoteconfig.cdn;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecAutoRegistrar;", "", "Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "featureGateRegistry", "Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;", "dynamicConfigRegistry", "Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;", "experimentRegistry", "Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnFetcher;", "cdnFetcher", "Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;", "statsigWrapper", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnFetcher;Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;)V", "", "autoRegisterFromCdn", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnFetcher;", "Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigSpecAutoRegistrar {
    private final com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.StatsigWrapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ConfigSpecAutoRegistrar(com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry, com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry, com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry, com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher statsigCdnFetcher, com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experimentRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigCdnFetcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigWrapper, "");
        this.getHighSpeedVideoFpsRangesFor = featureGateRegistry;
        this.getHighSpeedVideoFpsRanges = dynamicConfigRegistry;
        this.getHighResolutionOutputSizeshNQ4ISI = experimentRegistry;
        this.Camera2StreamConfigurationMap = statsigCdnFetcher;
        this.getHighSpeedVideoSizes = statsigWrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object autoRegisterFromCdn(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar$autoRegisterFromCdn$1 configSpecAutoRegistrar$autoRegisterFromCdn$1;
        int i;
        arrow.core.Either either;
        java.lang.Object orDefault;
        java.lang.Object orDefault2;
        if (continuation instanceof com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar$autoRegisterFromCdn$1) {
            configSpecAutoRegistrar$autoRegisterFromCdn$1 = (com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar$autoRegisterFromCdn$1) continuation;
            if ((configSpecAutoRegistrar$autoRegisterFromCdn$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                configSpecAutoRegistrar$autoRegisterFromCdn$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = configSpecAutoRegistrar$autoRegisterFromCdn$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = configSpecAutoRegistrar$autoRegisterFromCdn$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Starting auto-registration from Statsig CDN", null, null, 6, null);
                    com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher statsigCdnFetcher = this.Camera2StreamConfigurationMap;
                    configSpecAutoRegistrar$autoRegisterFromCdn$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = statsigCdnFetcher.fetchConfigSpecs(configSpecAutoRegistrar$autoRegisterFromCdn$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse configSpecResponse = (com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse) ((arrow.core.Either.Right) either).getValue();
                    java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> featureGates = configSpecResponse.getFeatureGates();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : featureGates) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec) obj2).getEntity(), "feature_gate")) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.ArrayList<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> arrayList2 = arrayList;
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
                    int size = arrayList2.size();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Registering ");
                    sb.append(size);
                    sb.append(" feature gates from CDN");
                    com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                    for (com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec featureGateSpec : arrayList2) {
                        java.lang.Boolean checkGateWithoutExposure = this.getHighSpeedVideoSizes.checkGateWithoutExposure(com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.toRemoteConfigKey$remote_config_release(featureGateSpec.getName(), com.paypal.oslo.core.remoteconfig.StatsigHelper.COMPANION_APP_DOMAIN));
                        this.getHighSpeedVideoFpsRangesFor.registerFromCdn(featureGateSpec.getName(), featureGateSpec.getName(), "", checkGateWithoutExposure != null ? checkGateWithoutExposure.booleanValue() : featureGateSpec.getDefaultValue());
                    }
                    java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> dynamicConfigs = configSpecResponse.getDynamicConfigs();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : dynamicConfigs) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec) obj3).getEntity(), "dynamic_config")) {
                            arrayList3.add(obj3);
                        }
                    }
                    java.util.ArrayList arrayList4 = arrayList3;
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
                    int size2 = arrayList4.size();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Registering ");
                    sb2.append(size2);
                    sb2.append(" dynamic configs from CDN");
                    com.paypal.android.logger.Logger.d$default(logger2, sb2.toString(), null, null, 6, null);
                    java.util.Iterator it = arrayList4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec dynamicConfigSpec = (com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec) it.next();
                        com.statsig.androidsdk.DynamicConfig configWithoutExposure = this.getHighSpeedVideoSizes.getConfigWithoutExposure(com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.toRemoteConfigKey$remote_config_release(dynamicConfigSpec.getName(), com.paypal.oslo.core.remoteconfig.StatsigHelper.COMPANION_APP_DOMAIN));
                        java.util.Map<java.lang.String, java.lang.Object> value = configWithoutExposure != null ? configWithoutExposure.getValue() : null;
                        for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement> entry : dynamicConfigSpec.getDefaultValue().entrySet()) {
                            java.lang.String key = entry.getKey();
                            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(entry.getValue());
                            com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry = this.getHighSpeedVideoFpsRanges;
                            java.lang.String name2 = dynamicConfigSpec.getName();
                            java.lang.String name3 = dynamicConfigSpec.getName();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append(name3);
                            sb3.append(".");
                            sb3.append(key);
                            dynamicConfigRegistry.registerFromCdn(name2, key, sb3.toString(), "", (value == null || (orDefault2 = value.getOrDefault(key, highSpeedVideoFpsRanges)) == null) ? highSpeedVideoFpsRanges : orDefault2);
                        }
                    }
                    java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> dynamicConfigs2 = configSpecResponse.getDynamicConfigs();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : dynamicConfigs2) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec) obj4).getEntity(), "experiment")) {
                            arrayList5.add(obj4);
                        }
                    }
                    java.util.ArrayList<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> arrayList6 = arrayList5;
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
                    int size3 = arrayList6.size();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Registering ");
                    sb4.append(size3);
                    sb4.append(" experiments from CDN");
                    com.paypal.android.logger.Logger.d$default(logger3, sb4.toString(), null, null, 6, null);
                    for (com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec dynamicConfigSpec2 : arrayList6) {
                        com.statsig.androidsdk.DynamicConfig experimentWithExposureLoggingDisabled = this.getHighSpeedVideoSizes.getExperimentWithExposureLoggingDisabled(com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE.toRemoteConfigKey$remote_config_release(dynamicConfigSpec2.getName(), com.paypal.oslo.core.remoteconfig.StatsigHelper.COMPANION_APP_DOMAIN));
                        java.util.Map<java.lang.String, java.lang.Object> value2 = experimentWithExposureLoggingDisabled != null ? experimentWithExposureLoggingDisabled.getValue() : null;
                        for (java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement> entry2 : dynamicConfigSpec2.getDefaultValue().entrySet()) {
                            java.lang.String key2 = entry2.getKey();
                            java.lang.Object highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(entry2.getValue());
                            com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry = this.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String name4 = dynamicConfigSpec2.getName();
                            java.lang.String name5 = dynamicConfigSpec2.getName();
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            sb5.append(name5);
                            sb5.append(".");
                            sb5.append(key2);
                            experimentRegistry.registerFromCdn(name4, key2, sb5.toString(), "", (value2 == null || (orDefault = value2.getOrDefault(key2, highSpeedVideoFpsRanges2)) == null) ? highSpeedVideoFpsRanges2 : orDefault);
                        }
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Auto-registration from CDN failed - companion app may have incomplete config list", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()).toString())), null, null, 12, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        configSpecAutoRegistrar$autoRegisterFromCdn$1 = new com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar$autoRegisterFromCdn$1(this, continuation);
        java.lang.Object obj5 = configSpecAutoRegistrar$autoRegisterFromCdn$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = configSpecAutoRegistrar$autoRegisterFromCdn$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj5;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.serialization.json.JsonElement p0) {
        if (p0 instanceof kotlinx.serialization.json.JsonPrimitive) {
            try {
                if (((kotlinx.serialization.json.JsonPrimitive) p0).getIsString()) {
                    return ((kotlinx.serialization.json.JsonPrimitive) p0).getContent();
                }
                if (kotlinx.serialization.json.JsonElementKt.getBooleanOrNull((kotlinx.serialization.json.JsonPrimitive) p0) != null) {
                    return java.lang.Boolean.valueOf(kotlinx.serialization.json.JsonElementKt.getBoolean((kotlinx.serialization.json.JsonPrimitive) p0));
                }
                if (kotlinx.serialization.json.JsonElementKt.getIntOrNull((kotlinx.serialization.json.JsonPrimitive) p0) != null) {
                    return java.lang.Integer.valueOf(kotlinx.serialization.json.JsonElementKt.getInt((kotlinx.serialization.json.JsonPrimitive) p0));
                }
                if (kotlinx.serialization.json.JsonElementKt.getDoubleOrNull((kotlinx.serialization.json.JsonPrimitive) p0) != null) {
                    return java.lang.Double.valueOf(kotlinx.serialization.json.JsonElementKt.getDouble((kotlinx.serialization.json.JsonPrimitive) p0));
                }
            } catch (kotlinx.serialization.SerializationException e) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Failed to parse JSON value", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, p0.toString()), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            }
        }
        return "";
    }
}
