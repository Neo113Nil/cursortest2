package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/statsig/androidsdk/StatsigPendingRequests;", "", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "requests", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/statsig/androidsdk/StatsigPendingRequests;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRequests"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsigPendingRequests {

    @com.google.gson.annotations.SerializedName("requests")
    public java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> requests;

    public StatsigPendingRequests(java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.requests = list;
    }

    public final java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> getRequests() {
        return this.requests;
    }

    public /* synthetic */ StatsigPendingRequests() {
    }

    public final java.lang.String toString() {
        java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> list = this.requests;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsigPendingRequests(requests=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.requests.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.statsig.androidsdk.StatsigPendingRequests) && kotlin.jvm.internal.Intrinsics.areEqual(this.requests, ((com.statsig.androidsdk.StatsigPendingRequests) other).requests);
    }

    public final com.statsig.androidsdk.StatsigPendingRequests copy(java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        return new com.statsig.androidsdk.StatsigPendingRequests(requests);
    }

    public final java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> component1() {
        return this.requests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.StatsigPendingRequests copy$default(com.statsig.androidsdk.StatsigPendingRequests statsigPendingRequests, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = statsigPendingRequests.requests;
        }
        return statsigPendingRequests.copy(list);
    }
}
