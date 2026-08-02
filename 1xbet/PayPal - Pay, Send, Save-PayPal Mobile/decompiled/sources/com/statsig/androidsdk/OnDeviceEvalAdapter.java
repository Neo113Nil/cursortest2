package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/statsig/androidsdk/OnDeviceEvalAdapter;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "Lcom/statsig/androidsdk/DynamicConfig;", "current", "Lcom/statsig/androidsdk/StatsigUser;", "user", "getDynamicConfig", "(Lcom/statsig/androidsdk/DynamicConfig;Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/DynamicConfig;", "", "isUnrecognized", "Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "(Z)Lcom/statsig/androidsdk/EvaluationDetails;", "Lcom/statsig/androidsdk/FeatureGate;", "getGate", "(Lcom/statsig/androidsdk/FeatureGate;Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/FeatureGate;", "Lcom/statsig/androidsdk/StatsigClient;", "client", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Lcom/statsig/androidsdk/StatsigClient;Lcom/statsig/androidsdk/Layer;Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/Layer;", "Lcom/statsig/androidsdk/ParameterStore;", "getParamStore", "(Lcom/statsig/androidsdk/StatsigClient;Lcom/statsig/androidsdk/ParameterStore;)Lcom/statsig/androidsdk/ParameterStore;", "", "setData", "details", "shouldTryOnDeviceEvaluation", "(Lcom/statsig/androidsdk/EvaluationDetails;)Z", "Ljava/lang/String;", "Lcom/statsig/androidsdk/evaluator/Evaluator;", "evaluator", "Lcom/statsig/androidsdk/evaluator/Evaluator;", "Lcom/statsig/androidsdk/evaluator/SpecStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/statsig/androidsdk/evaluator/SpecStore;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnDeviceEvalAdapter {
    private static final com.statsig.androidsdk.OnDeviceEvalAdapter.Companion Companion = new com.statsig.androidsdk.OnDeviceEvalAdapter.Companion(null);
    private static final java.lang.String TAG = "statsig::OnDeviceEval";
    private final java.lang.String data;
    private final com.statsig.androidsdk.evaluator.Evaluator evaluator;
    private final com.statsig.androidsdk.evaluator.SpecStore store;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/statsig/androidsdk/OnDeviceEvalAdapter$Companion;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OnDeviceEvalAdapter(java.lang.String str) {
        this.data = str;
        com.statsig.androidsdk.evaluator.SpecStore specStore = new com.statsig.androidsdk.evaluator.SpecStore();
        this.store = specStore;
        this.evaluator = new com.statsig.androidsdk.evaluator.Evaluator(specStore);
        if (str != null) {
            setData(str);
        }
    }

    public final void setData(java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        try {
            java.lang.Object fromJson = com.statsig.androidsdk.StatsigUtil.INSTANCE.getOrBuildGson$android_sdk_release().fromJson(data, (java.lang.Class<java.lang.Object>) com.statsig.androidsdk.evaluator.SpecsResponse.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(fromJson);
            this.store.setSpecs((com.statsig.androidsdk.evaluator.SpecsResponse) fromJson);
        } catch (java.lang.Exception unused) {
        }
    }

    public final com.statsig.androidsdk.FeatureGate getGate(com.statsig.androidsdk.FeatureGate current, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        if (!shouldTryOnDeviceEvaluation(current.getDetails())) {
            return null;
        }
        java.lang.String name2 = current.getName();
        com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateGate$android_sdk_release = this.evaluator.evaluateGate$android_sdk_release(name2, user);
        return new com.statsig.androidsdk.FeatureGate(name2, evaluateGate$android_sdk_release, getEvaluationDetails(evaluateGate$android_sdk_release.getIsUnrecognized()));
    }

    public final com.statsig.androidsdk.DynamicConfig getDynamicConfig(com.statsig.androidsdk.DynamicConfig current, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        if (!shouldTryOnDeviceEvaluation(current.getDetails())) {
            return null;
        }
        java.lang.String name2 = current.getName();
        com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateConfig$android_sdk_release = this.evaluator.evaluateConfig$android_sdk_release(name2, user);
        return new com.statsig.androidsdk.DynamicConfig(name2, evaluateConfig$android_sdk_release, getEvaluationDetails(evaluateConfig$android_sdk_release.getIsUnrecognized()));
    }

    public final com.statsig.androidsdk.Layer getLayer(com.statsig.androidsdk.StatsigClient client, com.statsig.androidsdk.Layer current, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        if (!shouldTryOnDeviceEvaluation(current.getDetails())) {
            return null;
        }
        java.lang.String name2 = current.getName();
        com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateLayer$android_sdk_release = this.evaluator.evaluateLayer$android_sdk_release(name2, user);
        return new com.statsig.androidsdk.Layer(client, name2, evaluateLayer$android_sdk_release, getEvaluationDetails(evaluateLayer$android_sdk_release.getIsUnrecognized()));
    }

    public final com.statsig.androidsdk.ParameterStore getParamStore(com.statsig.androidsdk.StatsigClient client, com.statsig.androidsdk.ParameterStore current) {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        if (!shouldTryOnDeviceEvaluation(current.getEvaluationDetails())) {
            return null;
        }
        com.statsig.androidsdk.evaluator.SpecParamStore paramStore = this.store.getParamStore(current.getName());
        com.statsig.androidsdk.EvaluationDetails evaluationDetails = getEvaluationDetails(paramStore == null);
        if (paramStore == null || (emptyMap = paramStore.getParameters()) == null) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        return new com.statsig.androidsdk.ParameterStore(client, emptyMap, current.getName(), evaluationDetails, null);
    }

    private final boolean shouldTryOnDeviceEvaluation(com.statsig.androidsdk.EvaluationDetails details) {
        com.statsig.androidsdk.evaluator.SpecsResponse rawSpecs = this.store.getRawSpecs();
        return rawSpecs != null && rawSpecs.getTime() > details.getLcut();
    }

    private final com.statsig.androidsdk.EvaluationDetails getEvaluationDetails(boolean isUnrecognized) {
        java.lang.Long lcut = this.store.getLcut();
        long longValue = lcut != null ? lcut.longValue() : 0L;
        if (isUnrecognized) {
            return new com.statsig.androidsdk.EvaluationDetails(com.statsig.androidsdk.EvaluationReason.OnDeviceEvalAdapterBootstrapUnrecognized, 0L, longValue, 2, null);
        }
        return new com.statsig.androidsdk.EvaluationDetails(com.statsig.androidsdk.EvaluationReason.OnDeviceEvalAdapterBootstrapRecognized, 0L, longValue, 2, null);
    }
}
