package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadStatistics;", "", "", "totalDownloads", "activeDownloads", "completedDownloads", "failedDownloads", "", "totalBytesDownloaded", "<init>", "(IIIIJ)V", "component1", "()I", "component2", "component3", "component4", "component5", "()J", "copy", "(IIIIJ)Lcom/paypal/oslo/downloads/api/model/DownloadStatistics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalDownloads", "getActiveDownloads", "getCompletedDownloads", "getFailedDownloads", "J", "getTotalBytesDownloaded"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DownloadStatistics {
    private final int activeDownloads;
    private final int completedDownloads;
    private final int failedDownloads;
    private final long totalBytesDownloaded;
    private final int totalDownloads;

    public DownloadStatistics(int i, int i2, int i3, int i4, long j) {
        this.totalDownloads = i;
        this.activeDownloads = i2;
        this.completedDownloads = i3;
        this.failedDownloads = i4;
        this.totalBytesDownloaded = j;
    }

    public final int getTotalDownloads() {
        return this.totalDownloads;
    }

    public final int getActiveDownloads() {
        return this.activeDownloads;
    }

    public final int getCompletedDownloads() {
        return this.completedDownloads;
    }

    public final int getFailedDownloads() {
        return this.failedDownloads;
    }

    public final long getTotalBytesDownloaded() {
        return this.totalBytesDownloaded;
    }

    public final java.lang.String toString() {
        int i = this.totalDownloads;
        int i2 = this.activeDownloads;
        int i3 = this.completedDownloads;
        int i4 = this.failedDownloads;
        long j = this.totalBytesDownloaded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadStatistics(totalDownloads=");
        sb.append(i);
        sb.append(", activeDownloads=");
        sb.append(i2);
        sb.append(", completedDownloads=");
        sb.append(i3);
        sb.append(", failedDownloads=");
        sb.append(i4);
        sb.append(", totalBytesDownloaded=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.totalDownloads) * 31) + java.lang.Integer.hashCode(this.activeDownloads)) * 31) + java.lang.Integer.hashCode(this.completedDownloads)) * 31) + java.lang.Integer.hashCode(this.failedDownloads)) * 31) + java.lang.Long.hashCode(this.totalBytesDownloaded);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadStatistics)) {
            return false;
        }
        com.paypal.oslo.downloads.api.model.DownloadStatistics downloadStatistics = (com.paypal.oslo.downloads.api.model.DownloadStatistics) other;
        return this.totalDownloads == downloadStatistics.totalDownloads && this.activeDownloads == downloadStatistics.activeDownloads && this.completedDownloads == downloadStatistics.completedDownloads && this.failedDownloads == downloadStatistics.failedDownloads && this.totalBytesDownloaded == downloadStatistics.totalBytesDownloaded;
    }

    public final com.paypal.oslo.downloads.api.model.DownloadStatistics copy(int totalDownloads, int activeDownloads, int completedDownloads, int failedDownloads, long totalBytesDownloaded) {
        return new com.paypal.oslo.downloads.api.model.DownloadStatistics(totalDownloads, activeDownloads, completedDownloads, failedDownloads, totalBytesDownloaded);
    }

    /* renamed from: component5, reason: from getter */
    public final long getTotalBytesDownloaded() {
        return this.totalBytesDownloaded;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFailedDownloads() {
        return this.failedDownloads;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCompletedDownloads() {
        return this.completedDownloads;
    }

    /* renamed from: component2, reason: from getter */
    public final int getActiveDownloads() {
        return this.activeDownloads;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalDownloads() {
        return this.totalDownloads;
    }

    public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadStatistics copy$default(com.paypal.oslo.downloads.api.model.DownloadStatistics downloadStatistics, int i, int i2, int i3, int i4, long j, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = downloadStatistics.totalDownloads;
        }
        if ((i5 & 2) != 0) {
            i2 = downloadStatistics.activeDownloads;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = downloadStatistics.completedDownloads;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = downloadStatistics.failedDownloads;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            j = downloadStatistics.totalBytesDownloaded;
        }
        return downloadStatistics.copy(i, i6, i7, i8, j);
    }
}
