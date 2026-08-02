package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R2\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecParamStore;", "", "", "", "targetAppIDs", "", "parameters", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/statsig/androidsdk/evaluator/SpecParamStore;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getParameters", "Ljava/util/List;", "getTargetAppIDs"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpecParamStore {

    @com.google.gson.annotations.SerializedName("parameters")
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> parameters;

    @com.google.gson.annotations.SerializedName("targetAppIDs")
    public java.util.List<java.lang.String> targetAppIDs;

    /* JADX WARN: Multi-variable type inference failed */
    public SpecParamStore(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.targetAppIDs = list;
        this.parameters = map;
    }

    public final java.util.List<java.lang.String> getTargetAppIDs() {
        return this.targetAppIDs;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getParameters() {
        return this.parameters;
    }

    public /* synthetic */ SpecParamStore() {
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.targetAppIDs;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map = this.parameters;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpecParamStore(targetAppIDs=");
        sb.append(list);
        sb.append(", parameters=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.targetAppIDs.hashCode() * 31) + this.parameters.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.evaluator.SpecParamStore)) {
            return false;
        }
        com.statsig.androidsdk.evaluator.SpecParamStore specParamStore = (com.statsig.androidsdk.evaluator.SpecParamStore) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.targetAppIDs, specParamStore.targetAppIDs) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, specParamStore.parameters);
    }

    public final com.statsig.androidsdk.evaluator.SpecParamStore copy(java.util.List<java.lang.String> targetAppIDs, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAppIDs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        return new com.statsig.androidsdk.evaluator.SpecParamStore(targetAppIDs, parameters);
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> component2() {
        return this.parameters;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.targetAppIDs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.evaluator.SpecParamStore copy$default(com.statsig.androidsdk.evaluator.SpecParamStore specParamStore, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = specParamStore.targetAppIDs;
        }
        if ((i & 2) != 0) {
            map = specParamStore.parameters;
        }
        return specParamStore.copy(list, map);
    }
}
