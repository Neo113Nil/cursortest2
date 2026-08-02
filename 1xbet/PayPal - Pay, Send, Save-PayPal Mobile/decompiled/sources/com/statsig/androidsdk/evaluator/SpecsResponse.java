package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0080\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J®\u0001\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010\"R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010\u001aR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b4\u0010\u0016R.\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b5\u0010\u001aR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b6\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001d"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecsResponse;", "", "", "Lcom/statsig/androidsdk/evaluator/Spec;", "dynamicConfigs", "featureGates", "layerConfigs", "", "", "Lcom/statsig/androidsdk/evaluator/SpecParamStore;", "paramStores", "layers", "", "time", "", "hasUpdates", "", "diagnostics", "defaultEnvironment", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;JZLjava/util/Map;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "()J", "component7", "()Z", "component8", "component9", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;JZLjava/util/Map;Ljava/lang/String;)Lcom/statsig/androidsdk/evaluator/SpecsResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDefaultEnvironment", "Ljava/util/Map;", "getDiagnostics", "Ljava/util/List;", "getDynamicConfigs", "getFeatureGates", "Z", "getHasUpdates", "getLayerConfigs", "getLayers", "getParamStores", "J", "getTime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpecsResponse {

    @com.google.gson.annotations.SerializedName("default_environment")
    public java.lang.String defaultEnvironment;

    @com.google.gson.annotations.SerializedName("diagnostics")
    public java.util.Map<java.lang.String, java.lang.Integer> diagnostics;

    @com.google.gson.annotations.SerializedName("dynamic_configs")
    public java.util.List<com.statsig.androidsdk.evaluator.Spec> dynamicConfigs;

    @com.google.gson.annotations.SerializedName("feature_gates")
    public java.util.List<com.statsig.androidsdk.evaluator.Spec> featureGates;

    @com.google.gson.annotations.SerializedName("has_updates")
    public boolean hasUpdates;

    @com.google.gson.annotations.SerializedName("layer_configs")
    public java.util.List<com.statsig.androidsdk.evaluator.Spec> layerConfigs;

    @com.google.gson.annotations.SerializedName("layers")
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> layers;

    @com.google.gson.annotations.SerializedName("param_stores")
    public java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> paramStores;

    @com.google.gson.annotations.SerializedName("time")
    public long time;

    /* JADX WARN: Multi-variable type inference failed */
    public SpecsResponse(java.util.List<com.statsig.androidsdk.evaluator.Spec> list, java.util.List<com.statsig.androidsdk.evaluator.Spec> list2, java.util.List<com.statsig.androidsdk.evaluator.Spec> list3, java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> map, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map2, long j, boolean z, java.util.Map<java.lang.String, java.lang.Integer> map3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.dynamicConfigs = list;
        this.featureGates = list2;
        this.layerConfigs = list3;
        this.paramStores = map;
        this.layers = map2;
        this.time = j;
        this.hasUpdates = z;
        this.diagnostics = map3;
        this.defaultEnvironment = str;
    }

    public /* synthetic */ SpecsResponse(java.util.List list, java.util.List list2, java.util.List list3, java.util.Map map, java.util.Map map2, long j, boolean z, java.util.Map map3, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, map, map2, (i & 32) != 0 ? 0L : j, z, (i & 128) != 0 ? null : map3, (i & 256) != 0 ? null : str);
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.Spec> getDynamicConfigs() {
        return this.dynamicConfigs;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.Spec> getFeatureGates() {
        return this.featureGates;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.Spec> getLayerConfigs() {
        return this.layerConfigs;
    }

    public final java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> getParamStores() {
        return this.paramStores;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getLayers() {
        return this.layers;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean getHasUpdates() {
        return this.hasUpdates;
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> getDiagnostics() {
        return this.diagnostics;
    }

    public final java.lang.String getDefaultEnvironment() {
        return this.defaultEnvironment;
    }

    public /* synthetic */ SpecsResponse() {
    }

    public final java.lang.String toString() {
        java.util.List<com.statsig.androidsdk.evaluator.Spec> list = this.dynamicConfigs;
        java.util.List<com.statsig.androidsdk.evaluator.Spec> list2 = this.featureGates;
        java.util.List<com.statsig.androidsdk.evaluator.Spec> list3 = this.layerConfigs;
        java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> map = this.paramStores;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2 = this.layers;
        long j = this.time;
        boolean z = this.hasUpdates;
        java.util.Map<java.lang.String, java.lang.Integer> map3 = this.diagnostics;
        java.lang.String str = this.defaultEnvironment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpecsResponse(dynamicConfigs=");
        sb.append(list);
        sb.append(", featureGates=");
        sb.append(list2);
        sb.append(", layerConfigs=");
        sb.append(list3);
        sb.append(", paramStores=");
        sb.append(map);
        sb.append(", layers=");
        sb.append(map2);
        sb.append(", time=");
        sb.append(j);
        sb.append(", hasUpdates=");
        sb.append(z);
        sb.append(", diagnostics=");
        sb.append(map3);
        sb.append(", defaultEnvironment=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.dynamicConfigs.hashCode();
        int hashCode2 = this.featureGates.hashCode();
        int hashCode3 = this.layerConfigs.hashCode();
        java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> map = this.paramStores;
        int hashCode4 = map == null ? 0 : map.hashCode();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2 = this.layers;
        int hashCode5 = map2 == null ? 0 : map2.hashCode();
        int hashCode6 = java.lang.Long.hashCode(this.time);
        int hashCode7 = java.lang.Boolean.hashCode(this.hasUpdates);
        java.util.Map<java.lang.String, java.lang.Integer> map3 = this.diagnostics;
        int hashCode8 = map3 == null ? 0 : map3.hashCode();
        java.lang.String str = this.defaultEnvironment;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.evaluator.SpecsResponse)) {
            return false;
        }
        com.statsig.androidsdk.evaluator.SpecsResponse specsResponse = (com.statsig.androidsdk.evaluator.SpecsResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dynamicConfigs, specsResponse.dynamicConfigs) && kotlin.jvm.internal.Intrinsics.areEqual(this.featureGates, specsResponse.featureGates) && kotlin.jvm.internal.Intrinsics.areEqual(this.layerConfigs, specsResponse.layerConfigs) && kotlin.jvm.internal.Intrinsics.areEqual(this.paramStores, specsResponse.paramStores) && kotlin.jvm.internal.Intrinsics.areEqual(this.layers, specsResponse.layers) && this.time == specsResponse.time && this.hasUpdates == specsResponse.hasUpdates && kotlin.jvm.internal.Intrinsics.areEqual(this.diagnostics, specsResponse.diagnostics) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultEnvironment, specsResponse.defaultEnvironment);
    }

    public final com.statsig.androidsdk.evaluator.SpecsResponse copy(java.util.List<com.statsig.androidsdk.evaluator.Spec> dynamicConfigs, java.util.List<com.statsig.androidsdk.evaluator.Spec> featureGates, java.util.List<com.statsig.androidsdk.evaluator.Spec> layerConfigs, java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> paramStores, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> layers, long time, boolean hasUpdates, java.util.Map<java.lang.String, java.lang.Integer> diagnostics, java.lang.String defaultEnvironment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layerConfigs, "");
        return new com.statsig.androidsdk.evaluator.SpecsResponse(dynamicConfigs, featureGates, layerConfigs, paramStores, layers, time, hasUpdates, diagnostics, defaultEnvironment);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getDefaultEnvironment() {
        return this.defaultEnvironment;
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> component8() {
        return this.diagnostics;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasUpdates() {
        return this.hasUpdates;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component5() {
        return this.layers;
    }

    public final java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> component4() {
        return this.paramStores;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.Spec> component3() {
        return this.layerConfigs;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.Spec> component2() {
        return this.featureGates;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.Spec> component1() {
        return this.dynamicConfigs;
    }
}
