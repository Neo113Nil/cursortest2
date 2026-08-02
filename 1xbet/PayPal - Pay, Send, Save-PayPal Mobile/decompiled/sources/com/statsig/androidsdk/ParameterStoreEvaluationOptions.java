package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "", "", "disableExposureLog", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getDisableExposureLog"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ParameterStoreEvaluationOptions {
    private final boolean disableExposureLog;

    public ParameterStoreEvaluationOptions(boolean z) {
        this.disableExposureLog = z;
    }

    public /* synthetic */ ParameterStoreEvaluationOptions(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getDisableExposureLog() {
        return this.disableExposureLog;
    }

    public final java.lang.String toString() {
        boolean z = this.disableExposureLog;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParameterStoreEvaluationOptions(disableExposureLog=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.disableExposureLog);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.statsig.androidsdk.ParameterStoreEvaluationOptions) && this.disableExposureLog == ((com.statsig.androidsdk.ParameterStoreEvaluationOptions) other).disableExposureLog;
    }

    public final com.statsig.androidsdk.ParameterStoreEvaluationOptions copy(boolean disableExposureLog) {
        return new com.statsig.androidsdk.ParameterStoreEvaluationOptions(disableExposureLog);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDisableExposureLog() {
        return this.disableExposureLog;
    }

    public static /* synthetic */ com.statsig.androidsdk.ParameterStoreEvaluationOptions copy$default(com.statsig.androidsdk.ParameterStoreEvaluationOptions parameterStoreEvaluationOptions, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = parameterStoreEvaluationOptions.disableExposureLog;
        }
        return parameterStoreEvaluationOptions.copy(z);
    }

    public ParameterStoreEvaluationOptions() {
        this(false, 1, null);
    }
}
