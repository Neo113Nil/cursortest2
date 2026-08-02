package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\nR\u0011\u0010 \u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010!\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b#\u0010\""}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "", "", "downloadedBytes", "totalBytes", "bytesPerSecond", "estimatedTimeRemainingMs", "<init>", "(JJJJ)V", "component1", "()J", "component2", "component3", "component4", "copy", "(JJJJ)Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDownloadedBytes", "getTotalBytes", "getBytesPerSecond", "getEstimatedTimeRemainingMs", "getPercentage", "percentage", "isSizeKnown", "()Z", "isComplete", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DownloadProgress {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.downloads.api.model.DownloadProgress.Companion INSTANCE = new com.paypal.oslo.downloads.api.model.DownloadProgress.Companion(null);
    private final long bytesPerSecond;
    private final long downloadedBytes;
    private final long estimatedTimeRemainingMs;
    private final long totalBytes;

    public DownloadProgress(long j, long j2, long j3, long j4) {
        this.downloadedBytes = j;
        this.totalBytes = j2;
        this.bytesPerSecond = j3;
        this.estimatedTimeRemainingMs = j4;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("downloadedBytes must be non-negative".toString());
        }
        if (j3 < 0) {
            throw new java.lang.IllegalArgumentException("bytesPerSecond must be non-negative".toString());
        }
    }

    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    public final long getEstimatedTimeRemainingMs() {
        return this.estimatedTimeRemainingMs;
    }

    public final int getPercentage() {
        long j = this.totalBytes;
        if (j <= 0) {
            return -1;
        }
        long j2 = this.downloadedBytes;
        if (j2 >= j) {
            return 100;
        }
        return (int) ((j2 * 100) / j);
    }

    public final boolean isSizeKnown() {
        return this.totalBytes > 0;
    }

    public final boolean isComplete() {
        return isSizeKnown() && this.downloadedBytes >= this.totalBytes;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadProgress$Companion;", "", "<init>", "()V", "", "totalBytes", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "initial", "(J)Lcom/paypal/oslo/downloads/api/model/DownloadProgress;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadProgress initial$default(com.paypal.oslo.downloads.api.model.DownloadProgress.Companion companion, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = -1;
            }
            return companion.initial(j);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadProgress initial(long totalBytes) {
            return new com.paypal.oslo.downloads.api.model.DownloadProgress(0L, totalBytes, 0L, -1L);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        long j = this.downloadedBytes;
        long j2 = this.totalBytes;
        long j3 = this.bytesPerSecond;
        long j4 = this.estimatedTimeRemainingMs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadProgress(downloadedBytes=");
        sb.append(j);
        sb.append(", totalBytes=");
        sb.append(j2);
        sb.append(", bytesPerSecond=");
        sb.append(j3);
        sb.append(", estimatedTimeRemainingMs=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Long.hashCode(this.downloadedBytes) * 31) + java.lang.Long.hashCode(this.totalBytes)) * 31) + java.lang.Long.hashCode(this.bytesPerSecond)) * 31) + java.lang.Long.hashCode(this.estimatedTimeRemainingMs);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadProgress)) {
            return false;
        }
        com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress = (com.paypal.oslo.downloads.api.model.DownloadProgress) other;
        return this.downloadedBytes == downloadProgress.downloadedBytes && this.totalBytes == downloadProgress.totalBytes && this.bytesPerSecond == downloadProgress.bytesPerSecond && this.estimatedTimeRemainingMs == downloadProgress.estimatedTimeRemainingMs;
    }

    public final com.paypal.oslo.downloads.api.model.DownloadProgress copy(long downloadedBytes, long totalBytes, long bytesPerSecond, long estimatedTimeRemainingMs) {
        return new com.paypal.oslo.downloads.api.model.DownloadProgress(downloadedBytes, totalBytes, bytesPerSecond, estimatedTimeRemainingMs);
    }

    /* renamed from: component4, reason: from getter */
    public final long getEstimatedTimeRemainingMs() {
        return this.estimatedTimeRemainingMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }
}
