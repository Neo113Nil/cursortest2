package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJV\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011H\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015JV\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015JB\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011H\u0082\b¢\u0006\u0004\b\u001c\u0010\u0015J)\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J9\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u00052\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u0004\u0018\u00010-2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000502¢\u0006\u0004\b3\u00104J!\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b7\u00108Jª\u0001\u0010A\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00172\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u00002 \u0010<\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000;2'\u0010?\u001a#\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000=¢\u0006\u0002\b>2'\u0010@\u001a#\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000=¢\u0006\u0002\b>H\u0082\b¢\u0006\u0004\bA\u0010BR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010KR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010M"}, d2 = {"Lcom/statsig/androidsdk/ParameterStore;", "", "Lcom/statsig/androidsdk/StatsigClient;", "statsigClient", "", "", "paramStore", "name", "Lcom/statsig/androidsdk/EvaluationDetails;", "evaluationDetails", "Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "options", "<init>", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/util/Map;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;)V", "T", "param", "defaultValue", "Lkotlin/Function2;", "Lcom/statsig/androidsdk/DynamicConfig;", "getValue", "evaluateDynamicConfigParameter", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "evaluateExperimentParameter", "Lcom/statsig/androidsdk/ParamType;", "paramType", "evaluateFeatureGate", "(Lcom/statsig/androidsdk/ParamType;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/Layer;", "evaluateLayerParameter", "paramName", "", "fallback", "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getArrayIfPresent", "(Ljava/lang/String;)[Ljava/lang/Object;", "", "getBoolean", "(Ljava/lang/String;Z)Z", "getBooleanIfPresent", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "getDictionaryIfPresent", "(Ljava/lang/String;)Ljava/util/Map;", "", "getDouble", "(Ljava/lang/String;D)D", "getDoubleIfPresent", "(Ljava/lang/String;)Ljava/lang/Double;", "", "getKeys", "()Ljava/util/List;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getStringIfPresent", "(Ljava/lang/String;)Ljava/lang/String;", "topLevelParamName", "expectedParamType", "Lkotlin/Function1;", "getStaticValue", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "getLayerValue", "getDynamicConfigValue", "getValueFromRef", "(Ljava/lang/String;Lcom/statsig/androidsdk/ParamType;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "getOptions", "()Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "Ljava/util/Map;", "Lcom/statsig/androidsdk/StatsigClient;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParameterStore {
    private final com.statsig.androidsdk.EvaluationDetails evaluationDetails;
    private final java.lang.String name;
    private final com.statsig.androidsdk.ParameterStoreEvaluationOptions options;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> paramStore;
    private final com.statsig.androidsdk.StatsigClient statsigClient;

    /* JADX WARN: Multi-variable type inference failed */
    public ParameterStore(com.statsig.androidsdk.StatsigClient statsigClient, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map, java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails, com.statsig.androidsdk.ParameterStoreEvaluationOptions parameterStoreEvaluationOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        this.statsigClient = statsigClient;
        this.paramStore = map;
        this.name = str;
        this.evaluationDetails = evaluationDetails;
        this.options = parameterStoreEvaluationOptions;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.statsig.androidsdk.EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    public final com.statsig.androidsdk.ParameterStoreEvaluationOptions getOptions() {
        return this.options;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a0, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b7, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getBoolean(java.lang.String paramName, boolean fallback) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.BOOLEAN;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(fallback);
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.Boolean bool2 = null;
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                java.lang.Object obj3 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj3 instanceof java.lang.Boolean) {
                                    bool = (java.lang.Boolean) obj3;
                                }
                                valueOf = bool2;
                            } else if (i == 3) {
                                java.lang.Object obj4 = map.get("layer_name");
                                java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                                java.lang.Object obj5 = map.get("param_name");
                                java.lang.String str4 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                                if (str3 != null && str4 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                    bool = ((options == null || !options.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str3, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str3, false, 2, null)).getBooleanWithOptionalDefault$android_sdk_release(str4, valueOf);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj6 = map.get("config_name");
                                java.lang.String str5 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                                java.lang.Object obj7 = map.get("param_name");
                                java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                if (str5 != null && str6 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    bool = ((options2 == null || !options2.getDisableExposureLog()) ? this.statsigClient.getConfig(str5) : this.statsigClient.getConfigWithExposureLoggingDisabled(str5)).getBooleanWithOptionalDefault$android_sdk_release(str6, valueOf);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj8 = map.get("experiment_name");
                                java.lang.String str7 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                java.lang.Object obj9 = map.get("param_name");
                                java.lang.String str8 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                if (str7 != null && str8 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    bool = ((options3 == null || !options3.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str7, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str7, false, 2, null)).getBooleanWithOptionalDefault$android_sdk_release(str8, valueOf);
                                }
                            }
                            valueOf = bool;
                        } else {
                            ?? r0 = map.get("pass_value");
                            java.lang.Object obj10 = map.get("fail_value");
                            java.lang.Object obj11 = map.get("gate_name");
                            java.lang.String str9 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                            if (r0 != null && obj10 != null && str9 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                if (!((options4 == null || !options4.getDisableExposureLog()) ? this.statsigClient.checkGate(str9) : this.statsigClient.checkGateWithExposureLoggingDisabled(str9))) {
                                    r0 = obj10;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (r0 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (r0 instanceof java.lang.Object[]) {
                                        bool2 = r0 instanceof java.lang.Boolean ? r0 : null;
                                    } else if (r0 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) r0).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    bool2 = r0 instanceof java.lang.Boolean ? r0 : null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return valueOf != null ? valueOf.booleanValue() : fallback;
    }

    public final java.lang.Boolean getBooleanIfPresent(java.lang.String paramName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.BOOLEAN;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (obj3 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (obj3 instanceof java.lang.Object[]) {
                                        if (!(obj3 instanceof java.lang.Boolean)) {
                                            obj3 = null;
                                        }
                                        java.lang.Boolean bool = (java.lang.Boolean) obj3;
                                        if (bool != null) {
                                            return bool;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    if (!(obj3 instanceof java.lang.Boolean)) {
                                        obj3 = null;
                                    }
                                    java.lang.Boolean bool2 = (java.lang.Boolean) obj3;
                                    if (bool2 != null) {
                                        return bool2;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj6 instanceof java.lang.Boolean) {
                                    return (java.lang.Boolean) obj6;
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null)).getBooleanWithOptionalDefault$android_sdk_release(str5, null);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6)).getBooleanWithOptionalDefault$android_sdk_release(str7, null);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str8 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str9 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null)).getBooleanWithOptionalDefault$android_sdk_release(str9, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final java.lang.String getString(java.lang.String paramName, java.lang.String fallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.STRING;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            ?? r0 = map.get("pass_value");
                            java.lang.Object obj3 = map.get("fail_value");
                            java.lang.Object obj4 = map.get("gate_name");
                            java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                            if (r0 != 0 && obj3 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    r0 = obj3;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (r0 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (r0 instanceof java.lang.Object[]) {
                                        java.lang.String str4 = r0 instanceof java.lang.String ? r0 : null;
                                        if (str4 != null) {
                                            return str4;
                                        }
                                    } else if (r0 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) r0).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    java.lang.String str5 = r0 instanceof java.lang.String ? r0 : null;
                                    if (str5 != null) {
                                        return str5;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj5 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj5 instanceof java.lang.String) {
                                    return (java.lang.String) obj5;
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj6 = map.get("layer_name");
                                java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                                java.lang.Object obj7 = map.get("param_name");
                                java.lang.String str7 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str6, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str6, false, 2, null)).getStringWithOptionalDefault$android_sdk_release(str7, fallback);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj8 = map.get("config_name");
                                java.lang.String str8 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                java.lang.Object obj9 = map.get("param_name");
                                java.lang.String str9 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str8) : this.statsigClient.getConfigWithExposureLoggingDisabled(str8)).getStringWithOptionalDefault$android_sdk_release(str9, fallback);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj10 = map.get("experiment_name");
                                java.lang.String str10 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                java.lang.Object obj11 = map.get("param_name");
                                java.lang.String str11 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                if (str10 != null && str11 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str10, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str10, false, 2, null)).getStringWithOptionalDefault$android_sdk_release(str11, fallback);
                                }
                            }
                        }
                    }
                }
            }
        }
        return fallback;
    }

    public final java.lang.String getStringIfPresent(java.lang.String paramName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.STRING;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (obj3 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (obj3 instanceof java.lang.Object[]) {
                                        if (!(obj3 instanceof java.lang.String)) {
                                            obj3 = null;
                                        }
                                        java.lang.String str4 = (java.lang.String) obj3;
                                        if (str4 != null) {
                                            return str4;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    if (!(obj3 instanceof java.lang.String)) {
                                        obj3 = null;
                                    }
                                    java.lang.String str5 = (java.lang.String) obj3;
                                    if (str5 != null) {
                                        return str5;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj6 instanceof java.lang.String) {
                                    return (java.lang.String) obj6;
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str7 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str6, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str6, false, 2, null)).getStringWithOptionalDefault$android_sdk_release(str7, null);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str8 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str9 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str8) : this.statsigClient.getConfigWithExposureLoggingDisabled(str8)).getStringWithOptionalDefault$android_sdk_release(str9, null);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str10 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str11 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str10 != null && str11 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str10, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str10, false, 2, null)).getStringWithOptionalDefault$android_sdk_release(str11, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b0, code lost:
    
        if (r4 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c3, code lost:
    
        if (r4 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01da, code lost:
    
        if (r4 == null) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double getDouble(java.lang.String paramName, double fallback) {
        java.lang.Double valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.NUMBER;
        java.lang.Double valueOf2 = java.lang.Double.valueOf(fallback);
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.Double d = null;
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                java.lang.Object obj3 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                java.lang.Number number = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
                                if (number != null) {
                                    valueOf = java.lang.Double.valueOf(number.doubleValue());
                                }
                                valueOf2 = d;
                            } else if (i == 3) {
                                java.lang.Object obj4 = map.get("layer_name");
                                java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                                java.lang.Object obj5 = map.get("param_name");
                                java.lang.String str4 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                                if (str3 != null && str4 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                    valueOf = ((options == null || !options.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str3, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str3, false, 2, null)).getDoubleWithOptionalDefault$android_sdk_release(str4, valueOf2);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj6 = map.get("config_name");
                                java.lang.String str5 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                                java.lang.Object obj7 = map.get("param_name");
                                java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                if (str5 != null && str6 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    valueOf = ((options2 == null || !options2.getDisableExposureLog()) ? this.statsigClient.getConfig(str5) : this.statsigClient.getConfigWithExposureLoggingDisabled(str5)).getDoubleWithOptionalDefault$android_sdk_release(str6, valueOf2);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj8 = map.get("experiment_name");
                                java.lang.String str7 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                java.lang.Object obj9 = map.get("param_name");
                                java.lang.String str8 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                if (str7 != null && str8 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    valueOf = ((options3 == null || !options3.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str7, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str7, false, 2, null)).getDoubleWithOptionalDefault$android_sdk_release(str8, valueOf2);
                                }
                            }
                            valueOf2 = valueOf;
                        } else {
                            ?? r0 = map.get("pass_value");
                            java.lang.Object obj10 = map.get("fail_value");
                            java.lang.Object obj11 = map.get("gate_name");
                            java.lang.String str9 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                            if (r0 != null && obj10 != null && str9 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                if (!((options4 == null || !options4.getDisableExposureLog()) ? this.statsigClient.checkGate(str9) : this.statsigClient.checkGateWithExposureLoggingDisabled(str9))) {
                                    r0 = obj10;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    java.lang.Number number2 = r0 instanceof java.lang.Number ? (java.lang.Number) r0 : null;
                                    java.lang.Double valueOf3 = number2 != null ? java.lang.Double.valueOf(number2.doubleValue()) : null;
                                    d = valueOf3 instanceof java.lang.Double ? valueOf3 : null;
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (r0 instanceof java.lang.Object[]) {
                                        d = r0 instanceof java.lang.Double ? r0 : null;
                                    } else if (r0 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) r0).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    d = r0 instanceof java.lang.Double ? r0 : null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return valueOf2 != null ? valueOf2.doubleValue() : fallback;
    }

    public final java.lang.Double getDoubleIfPresent(java.lang.String paramName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.NUMBER;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    java.lang.Number number = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
                                    java.lang.Double valueOf = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
                                    if (!(valueOf instanceof java.lang.Double)) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        return valueOf;
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (obj3 instanceof java.lang.Object[]) {
                                        if (!(obj3 instanceof java.lang.Double)) {
                                            obj3 = null;
                                        }
                                        java.lang.Double d = (java.lang.Double) obj3;
                                        if (d != null) {
                                            return d;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    if (!(obj3 instanceof java.lang.Double)) {
                                        obj3 = null;
                                    }
                                    java.lang.Double d2 = (java.lang.Double) obj3;
                                    if (d2 != null) {
                                        return d2;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                java.lang.Number number2 = obj6 instanceof java.lang.Number ? (java.lang.Number) obj6 : null;
                                if (number2 != null) {
                                    return java.lang.Double.valueOf(number2.doubleValue());
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null)).getDoubleWithOptionalDefault$android_sdk_release(str5, null);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6)).getDoubleWithOptionalDefault$android_sdk_release(str7, null);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str8 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str9 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null)).getDoubleWithOptionalDefault$android_sdk_release(str9, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDictionary(java.lang.String paramName, java.util.Map<java.lang.String, ? extends java.lang.Object> fallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.OBJECT;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (obj3 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (obj3 instanceof java.lang.Object[]) {
                                        java.util.Map<java.lang.String, java.lang.Object> map2 = (java.util.Map) (obj3 instanceof java.util.Map ? obj3 : null);
                                        if (map2 != null) {
                                            return map2;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    java.util.Map<java.lang.String, java.lang.Object> map3 = (java.util.Map) (obj3 instanceof java.util.Map ? obj3 : null);
                                    if (map3 != null) {
                                        return map3;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj6 instanceof java.util.Map) {
                                    return (java.util.Map) obj6;
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null)).getDictionaryWithOptionalDefault$android_sdk_release(str5, fallback);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6)).getDictionaryWithOptionalDefault$android_sdk_release(str7, fallback);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str8 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str9 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null)).getDictionaryWithOptionalDefault$android_sdk_release(str9, fallback);
                                }
                            }
                        }
                    }
                }
            }
        }
        return fallback;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDictionaryIfPresent(java.lang.String paramName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.OBJECT;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (obj3 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (obj3 instanceof java.lang.Object[]) {
                                        if (!(obj3 instanceof java.util.Map)) {
                                            obj3 = null;
                                        }
                                        java.util.Map<java.lang.String, java.lang.Object> map2 = (java.util.Map) obj3;
                                        if (map2 != null) {
                                            return map2;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                    }
                                } else {
                                    if (!(obj3 instanceof java.util.Map)) {
                                        obj3 = null;
                                    }
                                    java.util.Map<java.lang.String, java.lang.Object> map3 = (java.util.Map) obj3;
                                    if (map3 != null) {
                                        return map3;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj6 instanceof java.util.Map) {
                                    return (java.util.Map) obj6;
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null)).getDictionaryWithOptionalDefault$android_sdk_release(str5, null);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6)).getDictionaryWithOptionalDefault$android_sdk_release(str7, null);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str8 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str9 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null)).getDictionaryWithOptionalDefault$android_sdk_release(str9, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final java.lang.Object[] getArray(java.lang.String paramName, java.lang.Object[] fallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.ARRAY;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (obj3 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    boolean z = obj3 instanceof java.lang.Object[];
                                    if (z) {
                                        java.lang.Object[] objArr = (java.lang.Object[]) (z ? obj3 : null);
                                        if (objArr != null) {
                                            return objArr;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        java.lang.Object[] array = ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                        java.lang.Object[] objArr2 = array instanceof java.lang.Object[] ? array : null;
                                        if (objArr2 != null) {
                                            return objArr2;
                                        }
                                    }
                                } else {
                                    java.lang.Object[] objArr3 = (java.lang.Object[]) (obj3 instanceof java.lang.Object[] ? obj3 : null);
                                    if (objArr3 != null) {
                                        return objArr3;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj6 instanceof java.lang.Object[]) {
                                    return (java.lang.Object[]) obj6;
                                }
                                if (obj6 instanceof java.util.ArrayList) {
                                    return ((java.util.Collection) obj6).toArray(new java.lang.Object[0]);
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null)).getArrayWithOptionalDefault$android_sdk_release(str5, fallback);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6)).getArrayWithOptionalDefault$android_sdk_release(str7, fallback);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str8 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str9 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null)).getArrayWithOptionalDefault$android_sdk_release(str9, fallback);
                                }
                            }
                        }
                    }
                }
            }
        }
        return fallback;
    }

    public final java.lang.Object[] getArrayIfPresent(java.lang.String paramName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramName, "");
        com.statsig.androidsdk.ParamType paramType = com.statsig.androidsdk.ParamType.ARRAY;
        java.util.Map map = (java.util.Map) this.paramStore.get(paramName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == paramType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            java.lang.Object obj3 = map.get("pass_value");
                            java.lang.Object obj4 = map.get("fail_value");
                            java.lang.Object obj5 = map.get("gate_name");
                            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                            if (obj3 != null && obj4 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    obj3 = obj4;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    if (obj3 instanceof java.lang.Number) {
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    boolean z = obj3 instanceof java.lang.Object[];
                                    if (z) {
                                        if (!z) {
                                            obj3 = null;
                                        }
                                        java.lang.Object[] objArr = (java.lang.Object[]) obj3;
                                        if (objArr != null) {
                                            return objArr;
                                        }
                                    } else if (obj3 instanceof java.util.ArrayList) {
                                        java.lang.Object[] array = ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                                        if (!(array instanceof java.lang.Object[])) {
                                            array = null;
                                        }
                                        if (array != null) {
                                            return array;
                                        }
                                    }
                                } else {
                                    if (!(obj3 instanceof java.lang.Object[])) {
                                        obj3 = null;
                                    }
                                    java.lang.Object[] objArr2 = (java.lang.Object[]) obj3;
                                    if (objArr2 != null) {
                                        return objArr2;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                                if (obj6 instanceof java.lang.Object[]) {
                                    return (java.lang.Object[]) obj6;
                                }
                                if (obj6 instanceof java.util.ArrayList) {
                                    return ((java.util.Collection) obj6).toArray(new java.lang.Object[0]);
                                }
                                return null;
                            }
                            if (i == 3) {
                                java.lang.Object obj7 = map.get("layer_name");
                                java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return ((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null)).getArrayWithOptionalDefault$android_sdk_release(str5, null);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj9 = map.get("config_name");
                                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str6 != null && str7 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    return ((options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6)).getArrayWithOptionalDefault$android_sdk_release(str7, null);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj11 = map.get("experiment_name");
                                java.lang.String str8 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                java.lang.String str9 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return ((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null)).getArrayWithOptionalDefault$android_sdk_release(str9, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final java.util.List<java.lang.String> getKeys() {
        return kotlin.collections.CollectionsKt.toList(this.paramStore.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T getValueFromRef(java.lang.String topLevelParamName, com.statsig.androidsdk.ParamType expectedParamType, T defaultValue, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, ? extends java.lang.Object>, ? extends T> getStaticValue, kotlin.jvm.functions.Function3<? super com.statsig.androidsdk.Layer, ? super java.lang.String, ? super T, ? extends T> getLayerValue, kotlin.jvm.functions.Function3<? super com.statsig.androidsdk.DynamicConfig, ? super java.lang.String, ? super T, ? extends T> getDynamicConfigValue) {
        java.lang.Object valueOf;
        java.util.Map map = (java.util.Map) this.paramStore.get(topLevelParamName);
        if (map != null) {
            java.lang.Object obj = map.get("ref_type");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                java.lang.Object obj2 = map.get("param_type");
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str2);
                    if (fromString2 == expectedParamType) {
                        int i = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i == 1) {
                            T t = (T) map.get("pass_value");
                            java.lang.Object obj3 = map.get("fail_value");
                            java.lang.Object obj4 = map.get("gate_name");
                            java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                            if (t != null && obj3 != null && str3 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str3) : this.statsigClient.checkGateWithExposureLoggingDisabled(str3))) {
                                    t = (T) obj3;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    java.lang.Number number = t instanceof java.lang.Number ? (java.lang.Number) t : null;
                                    valueOf = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
                                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                    T t2 = (T) valueOf;
                                    if (t2 != null) {
                                        return t2;
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (t instanceof java.lang.Object[]) {
                                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                        T t3 = t;
                                        if (t != null) {
                                            return t;
                                        }
                                    } else if (t instanceof java.util.ArrayList) {
                                        java.lang.Object[] array = ((java.util.Collection) t).toArray(new java.lang.Object[0]);
                                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                        T t4 = (T) array;
                                        if (t4 != null) {
                                            return t4;
                                        }
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                    T t5 = t;
                                    if (t != null) {
                                        return t;
                                    }
                                }
                            }
                        } else {
                            if (i == 2) {
                                return getStaticValue.invoke(map);
                            }
                            if (i == 3) {
                                java.lang.Object obj5 = map.get("layer_name");
                                java.lang.String str4 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                                java.lang.Object obj6 = map.get("param_name");
                                java.lang.String str5 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                                if (str4 != null && str5 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = getOptions();
                                    return getLayerValue.invoke((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str4, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str4, false, 2, null), str5, defaultValue);
                                }
                            } else if (i == 4) {
                                java.lang.Object obj7 = map.get("config_name");
                                java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                java.lang.Object obj8 = map.get("param_name");
                                valueOf = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                if (str6 != null && valueOf != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = getOptions();
                                    com.statsig.androidsdk.DynamicConfig config = (options3 == null || !options3.getDisableExposureLog()) ? this.statsigClient.getConfig(str6) : this.statsigClient.getConfigWithExposureLoggingDisabled(str6);
                                    return getDynamicConfigValue.invoke(config, valueOf, defaultValue);
                                }
                            } else if (i == 5) {
                                java.lang.Object obj9 = map.get("experiment_name");
                                java.lang.String str7 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str8 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str7 != null && str8 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = getOptions();
                                    return getDynamicConfigValue.invoke((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str7, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str7, false, 2, null), str8, defaultValue);
                                }
                            }
                        }
                    }
                }
            }
        }
        return defaultValue;
    }

    static /* synthetic */ java.lang.Object getValueFromRef$default(com.statsig.androidsdk.ParameterStore parameterStore, java.lang.String str, com.statsig.androidsdk.ParamType paramType, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, int i, java.lang.Object obj2) {
        java.lang.Object valueOf;
        if ((i & 4) != 0) {
            obj = null;
        }
        java.util.Map map = (java.util.Map) parameterStore.paramStore.get(str);
        if (map != null) {
            java.lang.Object obj3 = map.get("ref_type");
            java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str2 != null) {
                java.lang.Object obj4 = map.get("param_type");
                java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                if (str3 != null) {
                    com.statsig.androidsdk.RefType fromString = com.statsig.androidsdk.RefType.INSTANCE.fromString(str2);
                    com.statsig.androidsdk.ParamType fromString2 = com.statsig.androidsdk.ParamType.INSTANCE.fromString(str3);
                    if (fromString2 == paramType) {
                        int i2 = com.statsig.androidsdk.ParameterStore.WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
                        if (i2 == 1) {
                            java.lang.Object obj5 = map.get("pass_value");
                            java.lang.Object obj6 = map.get("fail_value");
                            java.lang.Object obj7 = map.get("gate_name");
                            java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                            if (obj5 != null && obj6 != null && str4 != null) {
                                com.statsig.androidsdk.ParameterStoreEvaluationOptions options = parameterStore.getOptions();
                                if (!((options == null || !options.getDisableExposureLog()) ? parameterStore.statsigClient.checkGate(str4) : parameterStore.statsigClient.checkGateWithExposureLoggingDisabled(str4))) {
                                    obj5 = obj6;
                                }
                                if (fromString2 == com.statsig.androidsdk.ParamType.NUMBER) {
                                    java.lang.Number number = obj5 instanceof java.lang.Number ? (java.lang.Number) obj5 : null;
                                    valueOf = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
                                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                    java.lang.Object obj8 = valueOf;
                                    if (obj8 != null) {
                                        return obj8;
                                    }
                                } else if (fromString2 == com.statsig.androidsdk.ParamType.ARRAY) {
                                    if (obj5 instanceof java.lang.Object[]) {
                                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                        if (obj5 != null) {
                                            return obj5;
                                        }
                                    } else if (obj5 instanceof java.util.ArrayList) {
                                        java.lang.Object[] array = ((java.util.Collection) obj5).toArray(new java.lang.Object[0]);
                                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                        java.lang.Object[] objArr = array;
                                        if (objArr != null) {
                                            return objArr;
                                        }
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                                    if (obj5 != null) {
                                        return obj5;
                                    }
                                }
                            }
                        } else {
                            if (i2 == 2) {
                                return function1.invoke(map);
                            }
                            if (i2 == 3) {
                                java.lang.Object obj9 = map.get("layer_name");
                                java.lang.String str5 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                                java.lang.Object obj10 = map.get("param_name");
                                java.lang.String str6 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                if (str5 != null && str6 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options2 = parameterStore.getOptions();
                                    return function3.invoke((options2 == null || !options2.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(parameterStore.statsigClient, str5, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(parameterStore.statsigClient, str5, false, 2, null), str6, obj);
                                }
                            } else if (i2 == 4) {
                                java.lang.Object obj11 = map.get("config_name");
                                java.lang.String str7 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                java.lang.Object obj12 = map.get("param_name");
                                valueOf = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                if (str7 != null && valueOf != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options3 = parameterStore.getOptions();
                                    com.statsig.androidsdk.DynamicConfig config = (options3 == null || !options3.getDisableExposureLog()) ? parameterStore.statsigClient.getConfig(str7) : parameterStore.statsigClient.getConfigWithExposureLoggingDisabled(str7);
                                    return function32.invoke(config, valueOf, obj);
                                }
                            } else if (i2 == 5) {
                                java.lang.Object obj13 = map.get("experiment_name");
                                java.lang.String str8 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
                                java.lang.Object obj14 = map.get("param_name");
                                java.lang.String str9 = obj14 instanceof java.lang.String ? (java.lang.String) obj14 : null;
                                if (str8 != null && str9 != null) {
                                    com.statsig.androidsdk.ParameterStoreEvaluationOptions options4 = parameterStore.getOptions();
                                    return function32.invoke((options4 == null || !options4.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(parameterStore.statsigClient, str8, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(parameterStore.statsigClient, str8, false, 2, null), str9, obj);
                                }
                            }
                        }
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T evaluateFeatureGate(com.statsig.androidsdk.ParamType paramType, java.util.Map<java.lang.String, ? extends java.lang.Object> param, T defaultValue) {
        T t = (T) param.get("pass_value");
        java.lang.Object obj = param.get("fail_value");
        java.lang.Object obj2 = param.get("gate_name");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (t != null && obj != null && str != null) {
            com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
            if (!((options == null || !options.getDisableExposureLog()) ? this.statsigClient.checkGate(str) : this.statsigClient.checkGateWithExposureLoggingDisabled(str))) {
                t = (T) obj;
            }
            if (paramType == com.statsig.androidsdk.ParamType.NUMBER) {
                java.lang.Number number = t instanceof java.lang.Number ? (java.lang.Number) t : null;
                java.lang.Object valueOf = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                T t2 = (T) valueOf;
                if (t2 != null) {
                    return t2;
                }
            } else if (paramType == com.statsig.androidsdk.ParamType.ARRAY) {
                if (t instanceof java.lang.Object[]) {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                    T t3 = t;
                    if (t != null) {
                        return t;
                    }
                } else if (t instanceof java.util.ArrayList) {
                    java.lang.Object[] array = ((java.util.Collection) t).toArray(new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                    T t4 = (T) array;
                    if (t4 != null) {
                        return t4;
                    }
                }
            } else {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                T t5 = t;
                if (t != null) {
                    return t;
                }
            }
        }
        return defaultValue;
    }

    static /* synthetic */ java.lang.Object evaluateFeatureGate$default(com.statsig.androidsdk.ParameterStore parameterStore, com.statsig.androidsdk.ParamType paramType, java.util.Map map, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        java.lang.Object obj3 = map.get("pass_value");
        java.lang.Object obj4 = map.get("fail_value");
        java.lang.Object obj5 = map.get("gate_name");
        java.lang.String str = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (obj3 != null && obj4 != null && str != null) {
            com.statsig.androidsdk.ParameterStoreEvaluationOptions options = parameterStore.getOptions();
            if (!((options == null || !options.getDisableExposureLog()) ? parameterStore.statsigClient.checkGate(str) : parameterStore.statsigClient.checkGateWithExposureLoggingDisabled(str))) {
                obj3 = obj4;
            }
            if (paramType == com.statsig.androidsdk.ParamType.NUMBER) {
                java.lang.Number number = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
                java.lang.Double valueOf = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                java.lang.Double d = valueOf;
                if (d != null) {
                    return d;
                }
            } else if (paramType == com.statsig.androidsdk.ParamType.ARRAY) {
                if (obj3 instanceof java.lang.Object[]) {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                    if (obj3 != null) {
                        return obj3;
                    }
                } else if (obj3 instanceof java.util.ArrayList) {
                    java.lang.Object[] array = ((java.util.Collection) obj3).toArray(new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                    java.lang.Object[] objArr = array;
                    if (objArr != null) {
                        return objArr;
                    }
                }
            } else {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
                if (obj3 != null) {
                    return obj3;
                }
            }
        }
        return obj;
    }

    private final /* synthetic */ <T> T evaluateLayerParameter(java.util.Map<java.lang.String, ? extends java.lang.Object> param, T defaultValue, kotlin.jvm.functions.Function2<? super com.statsig.androidsdk.Layer, ? super java.lang.String, ? extends T> getValue) {
        java.lang.Object obj = param.get("layer_name");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = param.get("param_name");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null || str2 == null) {
            return defaultValue;
        }
        com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
        return getValue.invoke((options == null || !options.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(this.statsigClient, str, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str, false, 2, null), str2);
    }

    static /* synthetic */ java.lang.Object evaluateLayerParameter$default(com.statsig.androidsdk.ParameterStore parameterStore, java.util.Map map, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        java.lang.Object obj3 = map.get("layer_name");
        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map.get("param_name");
        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str == null || str2 == null) {
            return obj;
        }
        com.statsig.androidsdk.ParameterStoreEvaluationOptions options = parameterStore.getOptions();
        return function2.invoke((options == null || !options.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getLayer$default(parameterStore.statsigClient, str, false, 2, null) : com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled$default(parameterStore.statsigClient, str, false, 2, null), str2);
    }

    private final /* synthetic */ <T> T evaluateDynamicConfigParameter(java.util.Map<java.lang.String, ? extends java.lang.Object> param, T defaultValue, kotlin.jvm.functions.Function2<? super com.statsig.androidsdk.DynamicConfig, ? super java.lang.String, ? extends T> getValue) {
        java.lang.Object obj = param.get("config_name");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = param.get("param_name");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null || str2 == null) {
            return defaultValue;
        }
        com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
        return getValue.invoke((options == null || !options.getDisableExposureLog()) ? this.statsigClient.getConfig(str) : this.statsigClient.getConfigWithExposureLoggingDisabled(str), str2);
    }

    static /* synthetic */ java.lang.Object evaluateDynamicConfigParameter$default(com.statsig.androidsdk.ParameterStore parameterStore, java.util.Map map, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        java.lang.Object obj3 = map.get("config_name");
        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map.get("param_name");
        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str == null || str2 == null) {
            return obj;
        }
        com.statsig.androidsdk.ParameterStoreEvaluationOptions options = parameterStore.getOptions();
        return function2.invoke((options == null || !options.getDisableExposureLog()) ? parameterStore.statsigClient.getConfig(str) : parameterStore.statsigClient.getConfigWithExposureLoggingDisabled(str), str2);
    }

    private final /* synthetic */ <T> T evaluateExperimentParameter(java.util.Map<java.lang.String, ? extends java.lang.Object> param, T defaultValue, kotlin.jvm.functions.Function2<? super com.statsig.androidsdk.DynamicConfig, ? super java.lang.String, ? extends T> getValue) {
        java.lang.Object obj = param.get("experiment_name");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = param.get("param_name");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null || str2 == null) {
            return defaultValue;
        }
        com.statsig.androidsdk.ParameterStoreEvaluationOptions options = getOptions();
        return getValue.invoke((options == null || !options.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(this.statsigClient, str, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str, false, 2, null), str2);
    }

    static /* synthetic */ java.lang.Object evaluateExperimentParameter$default(com.statsig.androidsdk.ParameterStore parameterStore, java.util.Map map, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        java.lang.Object obj3 = map.get("experiment_name");
        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map.get("param_name");
        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str == null || str2 == null) {
            return obj;
        }
        com.statsig.androidsdk.ParameterStoreEvaluationOptions options = parameterStore.getOptions();
        return function2.invoke((options == null || !options.getDisableExposureLog()) ? com.statsig.androidsdk.StatsigClient.getExperiment$default(parameterStore.statsigClient, str, false, 2, null) : com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled$default(parameterStore.statsigClient, str, false, 2, null), str2);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.statsig.androidsdk.RefType.values().length];
            try {
                iArr[com.statsig.androidsdk.RefType.GATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.statsig.androidsdk.RefType.STATIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.statsig.androidsdk.RefType.LAYER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.statsig.androidsdk.RefType.DYNAMIC_CONFIG.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.statsig.androidsdk.RefType.EXPERIMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
