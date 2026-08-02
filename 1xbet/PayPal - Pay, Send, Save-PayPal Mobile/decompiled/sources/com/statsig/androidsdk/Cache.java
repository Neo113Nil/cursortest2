package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010-"}, d2 = {"Lcom/statsig/androidsdk/Cache;", "", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "values", "Lcom/statsig/androidsdk/StickyUserExperiments;", "stickyUserExperiments", "", "userHash", "", "evaluationTime", "<init>", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StickyUserExperiments;Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "component2", "()Lcom/statsig/androidsdk/StickyUserExperiments;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Long;", "copy", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StickyUserExperiments;Ljava/lang/String;Ljava/lang/Long;)Lcom/statsig/androidsdk/Cache;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Long;", "getEvaluationTime", "setEvaluationTime", "(Ljava/lang/Long;)V", "Lcom/statsig/androidsdk/StickyUserExperiments;", "getStickyUserExperiments", "setStickyUserExperiments", "(Lcom/statsig/androidsdk/StickyUserExperiments;)V", "Ljava/lang/String;", "getUserHash", "setUserHash", "(Ljava/lang/String;)V", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "getValues", "setValues", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Cache {

    @com.google.gson.annotations.SerializedName("evaluationTime")
    public java.lang.Long evaluationTime;

    @com.google.gson.annotations.SerializedName("stickyUserExperiments")
    public com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments;

    @com.google.gson.annotations.SerializedName("userHash")
    public java.lang.String userHash;

    @com.google.gson.annotations.SerializedName("values")
    public com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse values;

    public Cache(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments, java.lang.String str, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successfulInitializeResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stickyUserExperiments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.values = successfulInitializeResponse;
        this.stickyUserExperiments = stickyUserExperiments;
        this.userHash = str;
        this.evaluationTime = l;
    }

    public final com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse getValues() {
        return this.values;
    }

    public final void setValues(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successfulInitializeResponse, "");
        this.values = successfulInitializeResponse;
    }

    public final com.statsig.androidsdk.StickyUserExperiments getStickyUserExperiments() {
        return this.stickyUserExperiments;
    }

    public final void setStickyUserExperiments(com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stickyUserExperiments, "");
        this.stickyUserExperiments = stickyUserExperiments;
    }

    public final java.lang.String getUserHash() {
        return this.userHash;
    }

    public final void setUserHash(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.userHash = str;
    }

    public /* synthetic */ Cache(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments, java.lang.String str, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(successfulInitializeResponse, stickyUserExperiments, str, (i & 8) != 0 ? java.lang.Long.valueOf(java.lang.System.currentTimeMillis()) : l);
    }

    public final java.lang.Long getEvaluationTime() {
        return this.evaluationTime;
    }

    public final void setEvaluationTime(java.lang.Long l) {
        this.evaluationTime = l;
    }

    public /* synthetic */ Cache() {
    }

    public final java.lang.String toString() {
        com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = this.values;
        com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments = this.stickyUserExperiments;
        java.lang.String str = this.userHash;
        java.lang.Long l = this.evaluationTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cache(values=");
        sb.append(successfulInitializeResponse);
        sb.append(", stickyUserExperiments=");
        sb.append(stickyUserExperiments);
        sb.append(", userHash=");
        sb.append(str);
        sb.append(", evaluationTime=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.values.hashCode();
        int hashCode2 = this.stickyUserExperiments.hashCode();
        int hashCode3 = this.userHash.hashCode();
        java.lang.Long l = this.evaluationTime;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.Cache)) {
            return false;
        }
        com.statsig.androidsdk.Cache cache = (com.statsig.androidsdk.Cache) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.values, cache.values) && kotlin.jvm.internal.Intrinsics.areEqual(this.stickyUserExperiments, cache.stickyUserExperiments) && kotlin.jvm.internal.Intrinsics.areEqual(this.userHash, cache.userHash) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluationTime, cache.evaluationTime);
    }

    public final com.statsig.androidsdk.Cache copy(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse values, com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments, java.lang.String userHash, java.lang.Long evaluationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stickyUserExperiments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userHash, "");
        return new com.statsig.androidsdk.Cache(values, stickyUserExperiments, userHash, evaluationTime);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getEvaluationTime() {
        return this.evaluationTime;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUserHash() {
        return this.userHash;
    }

    /* renamed from: component2, reason: from getter */
    public final com.statsig.androidsdk.StickyUserExperiments getStickyUserExperiments() {
        return this.stickyUserExperiments;
    }

    /* renamed from: component1, reason: from getter */
    public final com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse getValues() {
        return this.values;
    }

    public static /* synthetic */ com.statsig.androidsdk.Cache copy$default(com.statsig.androidsdk.Cache cache, com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, com.statsig.androidsdk.StickyUserExperiments stickyUserExperiments, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            successfulInitializeResponse = cache.values;
        }
        if ((i & 2) != 0) {
            stickyUserExperiments = cache.stickyUserExperiments;
        }
        if ((i & 4) != 0) {
            str = cache.userHash;
        }
        if ((i & 8) != 0) {
            l = cache.evaluationTime;
        }
        return cache.copy(successfulInitializeResponse, stickyUserExperiments, str, l);
    }
}
