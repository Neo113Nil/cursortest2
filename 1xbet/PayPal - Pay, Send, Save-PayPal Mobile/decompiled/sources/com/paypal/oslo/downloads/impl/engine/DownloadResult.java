package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;", "", "<init>", "()V", "Progress", "Success", "Error", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Error;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Progress;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DownloadResult {
    private DownloadResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Progress;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "progress", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadProgress;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadProgress;)Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Progress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "getProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Progress extends com.paypal.oslo.downloads.impl.engine.DownloadResult {
        private final com.paypal.oslo.downloads.api.model.DownloadProgress progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Progress(com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadProgress, "");
            this.progress = downloadProgress;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress = this.progress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progress(progress=");
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
            return (other instanceof com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, ((com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress) other).progress);
        }

        public final com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress copy(com.paypal.oslo.downloads.api.model.DownloadProgress progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
            return new com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress(progress);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadProgress getProgress() {
            return this.progress;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress copy$default(com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress progress, com.paypal.oslo.downloads.api.model.DownloadProgress downloadProgress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                downloadProgress = progress.progress;
            }
            return progress.copy(downloadProgress);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Success;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;", "", "filePath", "", "fileSize", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilePath", "J", "getFileSize", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.downloads.impl.engine.DownloadResult {
        private final java.lang.String filePath;
        private final long fileSize;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, long j, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filePath = str;
            this.fileSize = j;
            this.mimeType = str2;
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

        public final java.lang.String toString() {
            java.lang.String str = this.filePath;
            long j = this.fileSize;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(filePath=");
            sb.append(str);
            sb.append(", fileSize=");
            sb.append(j);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.filePath.hashCode();
            int hashCode2 = java.lang.Long.hashCode(this.fileSize);
            java.lang.String str = this.mimeType;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.impl.engine.DownloadResult.Success)) {
                return false;
            }
            com.paypal.oslo.downloads.impl.engine.DownloadResult.Success success = (com.paypal.oslo.downloads.impl.engine.DownloadResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, success.filePath) && this.fileSize == success.fileSize && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, success.mimeType);
        }

        public final com.paypal.oslo.downloads.impl.engine.DownloadResult.Success copy(java.lang.String filePath, long fileSize, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            return new com.paypal.oslo.downloads.impl.engine.DownloadResult.Success(filePath, fileSize, mimeType);
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

        public static /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadResult.Success copy$default(com.paypal.oslo.downloads.impl.engine.DownloadResult.Success success, java.lang.String str, long j, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.filePath;
            }
            if ((i & 2) != 0) {
                j = success.fileSize;
            }
            if ((i & 4) != 0) {
                str2 = success.mimeType;
            }
            return success.copy(str, j, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Error;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "error", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadError;", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;)Lcom/paypal/oslo/downloads/impl/engine/DownloadResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.downloads.impl.engine.DownloadResult {
        private final com.paypal.oslo.downloads.api.model.DownloadError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.downloads.api.model.DownloadError downloadError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadError, "");
            this.error = downloadError;
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.downloads.api.model.DownloadError downloadError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(downloadError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.downloads.impl.engine.DownloadResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.downloads.impl.engine.DownloadResult.Error) other).error);
        }

        public final com.paypal.oslo.downloads.impl.engine.DownloadResult.Error copy(com.paypal.oslo.downloads.api.model.DownloadError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.downloads.impl.engine.DownloadResult.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadResult.Error copy$default(com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error, com.paypal.oslo.downloads.api.model.DownloadError downloadError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                downloadError = error.error;
            }
            return error.copy(downloadError);
        }
    }

    public /* synthetic */ DownloadResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
