package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState;", "", "<init>", "()V", "Queued", "Downloading", "Paused", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Cancelled", "NoNetwork", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Cancelled;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Completed;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Downloading;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Failed;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$NoNetwork;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Paused;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Queued;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class DownloadState {
    private DownloadState() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$Queued;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "", "queuePosition", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/downloads/api/model/DownloadState$Queued;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getQueuePosition"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Queued extends com.paypal.oslo.downloads.api.model.DownloadState {
        private final int queuePosition;

        public Queued(int i) {
            super(null);
            this.queuePosition = i;
        }

        public /* synthetic */ Queued(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final int getQueuePosition() {
            return this.queuePosition;
        }

        public final java.lang.String toString() {
            int i = this.queuePosition;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Queued(queuePosition=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.queuePosition);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.downloads.api.model.DownloadState.Queued) && this.queuePosition == ((com.paypal.oslo.downloads.api.model.DownloadState.Queued) other).queuePosition;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadState.Queued copy(int queuePosition) {
            return new com.paypal.oslo.downloads.api.model.DownloadState.Queued(queuePosition);
        }

        /* renamed from: component1, reason: from getter */
        public final int getQueuePosition() {
            return this.queuePosition;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadState.Queued copy$default(com.paypal.oslo.downloads.api.model.DownloadState.Queued queued, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = queued.queuePosition;
            }
            return queued.copy(i);
        }

        public Queued() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$Downloading;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "progress", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadProgress;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadProgress;)Lcom/paypal/oslo/downloads/api/model/DownloadState$Downloading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "getProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Downloading extends com.paypal.oslo.downloads.api.model.DownloadState {
        private final com.paypal.oslo.downloads.api.model.DownloadProgress progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloading(com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadProgress, "");
            this.progress = downloadProgress;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress = this.progress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Downloading(progress=");
            sb.append(downloadProgress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.progress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.downloads.api.model.DownloadState.Downloading) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, ((com.paypal.oslo.downloads.api.model.DownloadState.Downloading) other).progress);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadState.Downloading copy(com.paypal.oslo.downloads.api.model.DownloadProgress progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
            return new com.paypal.oslo.downloads.api.model.DownloadState.Downloading(progress);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadState.Downloading copy$default(com.paypal.oslo.downloads.api.model.DownloadState.Downloading downloading, com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                downloadProgress = downloading.progress;
            }
            return downloading.copy(downloadProgress);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$Paused;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "progress", "Lcom/paypal/oslo/downloads/api/model/PauseReason;", "reason", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadProgress;Lcom/paypal/oslo/downloads/api/model/PauseReason;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "component2", "()Lcom/paypal/oslo/downloads/api/model/PauseReason;", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadProgress;Lcom/paypal/oslo/downloads/api/model/PauseReason;)Lcom/paypal/oslo/downloads/api/model/DownloadState$Paused;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "getProgress", "Lcom/paypal/oslo/downloads/api/model/PauseReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Paused extends com.paypal.oslo.downloads.api.model.DownloadState {
        private final com.paypal.oslo.downloads.api.model.DownloadProgress progress;
        private final com.paypal.oslo.downloads.api.model.PauseReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paused(com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, com.paypal.oslo.downloads.api.model.PauseReason pauseReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadProgress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pauseReason, "");
            this.progress = downloadProgress;
            this.reason = pauseReason;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public final com.paypal.oslo.downloads.api.model.PauseReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress = this.progress;
            com.paypal.oslo.downloads.api.model.PauseReason pauseReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Paused(progress=");
            sb.append(downloadProgress);
            sb.append(", reason=");
            sb.append(pauseReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.progress.hashCode() * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadState.Paused)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadState.Paused paused = (com.paypal.oslo.downloads.api.model.DownloadState.Paused) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.progress, paused.progress) && this.reason == paused.reason;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadState.Paused copy(com.paypal.oslo.downloads.api.model.DownloadProgress progress, com.paypal.oslo.downloads.api.model.PauseReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.downloads.api.model.DownloadState.Paused(progress, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.PauseReason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadState.Paused copy$default(com.paypal.oslo.downloads.api.model.DownloadState.Paused paused, com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, com.paypal.oslo.downloads.api.model.PauseReason pauseReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                downloadProgress = paused.progress;
            }
            if ((i & 2) != 0) {
                pauseReason = paused.reason;
            }
            return paused.copy(downloadProgress, pauseReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$Completed;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "", "filePath", "", "fileSize", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Landroid/net/Uri;", "fileUri", "<init>", "(Ljava/lang/String;JLjava/lang/String;Landroid/net/Uri;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;JLjava/lang/String;Landroid/net/Uri;)Lcom/paypal/oslo/downloads/api/model/DownloadState$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilePath", "J", "getFileSize", "getMimeType", "Landroid/net/Uri;", "getFileUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed extends com.paypal.oslo.downloads.api.model.DownloadState {
        private final java.lang.String filePath;
        private final long fileSize;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(java.lang.String str, long j, java.lang.String str2, android.net.Uri uri) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filePath = str;
            this.fileSize = j;
            this.mimeType = str2;
            this.fileUri = uri;
        }

        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filePath;
            long j = this.fileSize;
            java.lang.String str2 = this.mimeType;
            android.net.Uri uri = this.fileUri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(filePath=");
            sb.append(str);
            sb.append(", fileSize=");
            sb.append(j);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(", fileUri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.filePath.hashCode();
            int hashCode2 = java.lang.Long.hashCode(this.fileSize);
            java.lang.String str = this.mimeType;
            int hashCode3 = str == null ? 0 : str.hashCode();
            android.net.Uri uri = this.fileUri;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (uri != null ? uri.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadState.Completed completed = (com.paypal.oslo.downloads.api.model.DownloadState.Completed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, completed.filePath) && this.fileSize == completed.fileSize && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, completed.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, completed.fileUri);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadState.Completed copy(java.lang.String filePath, long fileSize, java.lang.String mimeType, android.net.Uri fileUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            return new com.paypal.oslo.downloads.api.model.DownloadState.Completed(filePath, fileSize, mimeType, fileUri);
        }

        /* renamed from: component4, reason: from getter */
        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component2, reason: from getter */
        public final long getFileSize() {
            return this.fileSize;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadState.Completed copy$default(com.paypal.oslo.downloads.api.model.DownloadState.Completed completed, java.lang.String str, long j, java.lang.String str2, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = completed.filePath;
            }
            if ((i & 2) != 0) {
                j = completed.fileSize;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                str2 = completed.mimeType;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                uri = completed.fileUri;
            }
            return completed.copy(str, j2, str3, uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$Failed;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "error", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "progress", "", "canRetry", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;Lcom/paypal/oslo/downloads/api/model/DownloadProgress;Z)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadError;", "component2", "()Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;Lcom/paypal/oslo/downloads/api/model/DownloadProgress;Z)Lcom/paypal/oslo/downloads/api/model/DownloadState$Failed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "getError", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "getProgress", "Z", "getCanRetry"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed extends com.paypal.oslo.downloads.api.model.DownloadState {
        private final boolean canRetry;
        private final com.paypal.oslo.downloads.api.model.DownloadError error;
        private final com.paypal.oslo.downloads.api.model.DownloadProgress progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(com.paypal.oslo.downloads.api.model.DownloadError downloadError, com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadError, "");
            this.error = downloadError;
            this.progress = downloadProgress;
            this.canRetry = z;
        }

        public /* synthetic */ Failed(com.paypal.oslo.downloads.api.model.DownloadError downloadError, com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(downloadError, downloadProgress, (i & 4) != 0 ? true : z);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError getError() {
            return this.error;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.model.DownloadError downloadError = this.error;
            com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress = this.progress;
            boolean z = this.canRetry;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
            sb.append(downloadError);
            sb.append(", progress=");
            sb.append(downloadProgress);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.error.hashCode();
            com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress = this.progress;
            return (((hashCode * 31) + (downloadProgress == null ? 0 : downloadProgress.hashCode())) * 31) + java.lang.Boolean.hashCode(this.canRetry);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadState.Failed failed = (com.paypal.oslo.downloads.api.model.DownloadState.Failed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, failed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, failed.progress) && this.canRetry == failed.canRetry;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadState.Failed copy(com.paypal.oslo.downloads.api.model.DownloadError error, com.paypal.oslo.downloads.api.model.DownloadProgress progress, boolean canRetry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.downloads.api.model.DownloadState.Failed(error, progress, canRetry);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadState.Failed copy$default(com.paypal.oslo.downloads.api.model.DownloadState.Failed failed, com.paypal.oslo.downloads.api.model.DownloadError downloadError, com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                downloadError = failed.error;
            }
            if ((i & 2) != 0) {
                downloadProgress = failed.progress;
            }
            if ((i & 4) != 0) {
                z = failed.canRetry;
            }
            return failed.copy(downloadError, downloadProgress, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$Cancelled;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.downloads.api.model.DownloadState {
        public static final com.paypal.oslo.downloads.api.model.DownloadState.Cancelled INSTANCE = new com.paypal.oslo.downloads.api.model.DownloadState.Cancelled();

        public final int hashCode() {
            return -1881865065;
        }

        private Cancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadState$NoNetwork;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/model/DownloadState$NoNetwork;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoNetwork extends com.paypal.oslo.downloads.api.model.DownloadState {
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoNetwork(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public /* synthetic */ NoNetwork(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_DESCRIPTION : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoNetwork(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) other).message);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork copy$default(com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork noNetwork, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = noNetwork.message;
            }
            return noNetwork.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoNetwork() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ DownloadState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
