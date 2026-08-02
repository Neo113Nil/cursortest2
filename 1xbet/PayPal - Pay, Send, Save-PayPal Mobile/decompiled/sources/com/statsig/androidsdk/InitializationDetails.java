package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&"}, d2 = {"Lcom/statsig/androidsdk/InitializationDetails;", "", "", "duration", "", "success", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "failureDetails", "<init>", "(JZLcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)V", "component1", "()J", "component2", "()Z", "component3", "()Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "copy", "(JZLcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)Lcom/statsig/androidsdk/InitializationDetails;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "setDuration", "(J)V", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "getFailureDetails", "setFailureDetails", "(Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)V", "Z", "getSuccess", "setSuccess", "(Z)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InitializationDetails {

    @com.google.gson.annotations.SerializedName("duration")
    private long duration;

    @com.google.gson.annotations.SerializedName("failureDetails")
    private com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failureDetails;

    @com.google.gson.annotations.SerializedName("success")
    private boolean success;

    public InitializationDetails(long j, boolean z, com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.duration = j;
        this.success = z;
        this.failureDetails = failedInitializeResponse;
    }

    public /* synthetic */ InitializationDetails(long j, boolean z, com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, (i & 4) != 0 ? null : failedInitializeResponse);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    public final com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse getFailureDetails() {
        return this.failureDetails;
    }

    public final void setFailureDetails(com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.failureDetails = failedInitializeResponse;
    }

    public final java.lang.String toString() {
        long j = this.duration;
        boolean z = this.success;
        com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse = this.failureDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializationDetails(duration=");
        sb.append(j);
        sb.append(", success=");
        sb.append(z);
        sb.append(", failureDetails=");
        sb.append(failedInitializeResponse);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.duration);
        int hashCode2 = java.lang.Boolean.hashCode(this.success);
        com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse = this.failureDetails;
        return (((hashCode * 31) + hashCode2) * 31) + (failedInitializeResponse == null ? 0 : failedInitializeResponse.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.InitializationDetails)) {
            return false;
        }
        com.statsig.androidsdk.InitializationDetails initializationDetails = (com.statsig.androidsdk.InitializationDetails) other;
        return this.duration == initializationDetails.duration && this.success == initializationDetails.success && kotlin.jvm.internal.Intrinsics.areEqual(this.failureDetails, initializationDetails.failureDetails);
    }

    public final com.statsig.androidsdk.InitializationDetails copy(long duration, boolean success, com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failureDetails) {
        return new com.statsig.androidsdk.InitializationDetails(duration, success, failureDetails);
    }

    /* renamed from: component3, reason: from getter */
    public final com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse getFailureDetails() {
        return this.failureDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public static /* synthetic */ com.statsig.androidsdk.InitializationDetails copy$default(com.statsig.androidsdk.InitializationDetails initializationDetails, long j, boolean z, com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = initializationDetails.duration;
        }
        if ((i & 2) != 0) {
            z = initializationDetails.success;
        }
        if ((i & 4) != 0) {
            failedInitializeResponse = initializationDetails.failureDetails;
        }
        return initializationDetails.copy(j, z, failedInitializeResponse);
    }
}
