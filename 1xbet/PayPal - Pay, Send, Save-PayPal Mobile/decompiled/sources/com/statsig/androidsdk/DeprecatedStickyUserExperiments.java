package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/statsig/androidsdk/DeprecatedStickyUserExperiments;", "", "", "userID", "", "Lcom/statsig/androidsdk/APIDynamicConfig;", "experiments", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/statsig/androidsdk/DeprecatedStickyUserExperiments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getExperiments", "Ljava/lang/String;", "getUserID"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class DeprecatedStickyUserExperiments {

    @com.google.gson.annotations.SerializedName("values")
    private final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> experiments;

    @com.google.gson.annotations.SerializedName("user_id")
    private final java.lang.String userID;

    public DeprecatedStickyUserExperiments(java.lang.String str, java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.userID = str;
        this.experiments = map;
    }

    public final java.lang.String getUserID() {
        return this.userID;
    }

    public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.userID;
        java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map = this.experiments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeprecatedStickyUserExperiments(userID=");
        sb.append(str);
        sb.append(", experiments=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.userID;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.experiments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.DeprecatedStickyUserExperiments)) {
            return false;
        }
        com.statsig.androidsdk.DeprecatedStickyUserExperiments deprecatedStickyUserExperiments = (com.statsig.androidsdk.DeprecatedStickyUserExperiments) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userID, deprecatedStickyUserExperiments.userID) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiments, deprecatedStickyUserExperiments.experiments);
    }

    public final com.statsig.androidsdk.DeprecatedStickyUserExperiments copy(java.lang.String userID, java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> experiments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experiments, "");
        return new com.statsig.androidsdk.DeprecatedStickyUserExperiments(userID, experiments);
    }

    public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> component2() {
        return this.experiments;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserID() {
        return this.userID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.DeprecatedStickyUserExperiments copy$default(com.statsig.androidsdk.DeprecatedStickyUserExperiments deprecatedStickyUserExperiments, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deprecatedStickyUserExperiments.userID;
        }
        if ((i & 2) != 0) {
            map = deprecatedStickyUserExperiments.experiments;
        }
        return deprecatedStickyUserExperiments.copy(str, map);
    }
}
