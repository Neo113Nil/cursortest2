package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t"}, d2 = {"Lcom/statsig/androidsdk/StickyUserExperiments;", "", "", "", "Lcom/statsig/androidsdk/APIDynamicConfig;", "experiments", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/statsig/androidsdk/StickyUserExperiments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getExperiments"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StickyUserExperiments {

    @com.google.gson.annotations.SerializedName("values")
    public java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> experiments;

    public StickyUserExperiments(java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.experiments = map;
    }

    public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public /* synthetic */ StickyUserExperiments() {
    }

    public final java.lang.String toString() {
        java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map = this.experiments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StickyUserExperiments(experiments=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.experiments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.statsig.androidsdk.StickyUserExperiments) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiments, ((com.statsig.androidsdk.StickyUserExperiments) other).experiments);
    }

    public final com.statsig.androidsdk.StickyUserExperiments copy(java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> experiments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experiments, "");
        return new com.statsig.androidsdk.StickyUserExperiments(experiments);
    }

    public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> component1() {
        return this.experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.StickyUserExperiments copy$default(com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = stickyUserExperiments.experiments;
        }
        return stickyUserExperiments.copy(map);
    }
}
