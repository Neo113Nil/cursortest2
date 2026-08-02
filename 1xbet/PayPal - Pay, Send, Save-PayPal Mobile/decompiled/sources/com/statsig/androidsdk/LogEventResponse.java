package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/statsig/androidsdk/LogEventResponse;", "", "", "success", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/statsig/androidsdk/LogEventResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getSuccess"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LogEventResponse {

    @com.google.gson.annotations.SerializedName("success")
    public java.lang.Boolean success;

    public LogEventResponse(java.lang.Boolean bool) {
        this.success = bool;
    }

    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ LogEventResponse() {
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.success;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogEventResponse(success=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.success;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.statsig.androidsdk.LogEventResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.success, ((com.statsig.androidsdk.LogEventResponse) other).success);
    }

    public final com.statsig.androidsdk.LogEventResponse copy(java.lang.Boolean success) {
        return new com.statsig.androidsdk.LogEventResponse(success);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.statsig.androidsdk.LogEventResponse copy$default(com.statsig.androidsdk.LogEventResponse logEventResponse, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = logEventResponse.success;
        }
        return logEventResponse.copy(bool);
    }
}
