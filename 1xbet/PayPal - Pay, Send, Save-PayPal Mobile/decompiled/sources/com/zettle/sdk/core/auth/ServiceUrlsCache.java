package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/core/auth/ServiceUrlsCache;", "", "", "", "p0", "Lcom/izettle/android/auth/model/ServiceUrls;", "p1", "<init>", "(Ljava/util/List;Lcom/izettle/android/auth/model/ServiceUrls;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/izettle/android/auth/model/ServiceUrls;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class ServiceUrlsCache {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.izettle.android.auth.model.ServiceUrls getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public ServiceUrlsCache(java.util.List<java.lang.String> list, com.izettle.android.auth.model.ServiceUrls serviceUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceUrls, "");
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = serviceUrls;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.getHighSpeedVideoFpsRangesFor;
        com.izettle.android.auth.model.ServiceUrls serviceUrls = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceUrlsCache(getHighSpeedVideoFpsRangesFor=");
        sb.append(list);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(serviceUrls);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.zettle.sdk.core.auth.ServiceUrlsCache)) {
            return false;
        }
        com.zettle.sdk.core.auth.ServiceUrlsCache serviceUrlsCache = (com.zettle.sdk.core.auth.ServiceUrlsCache) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, serviceUrlsCache.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, serviceUrlsCache.getHighResolutionOutputSizeshNQ4ISI);
    }
}
