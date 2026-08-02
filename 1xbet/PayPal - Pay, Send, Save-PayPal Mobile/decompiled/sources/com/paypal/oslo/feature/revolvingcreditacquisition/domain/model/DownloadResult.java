package com.paypal.oslo.feature.revolvingcreditacquisition.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult;", "", "<init>", "()V", "Success", "Error", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult$Error;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class DownloadResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult$Success;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult;", "Landroid/net/Uri;", "fileUri", "", "fileName", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getFileUri", "Ljava/lang/String;", "getFileName", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult {
        public static final int $stable = 8;
        private final java.lang.String fileName;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fileUri = uri;
            this.fileName = str;
            this.mimeType = str2;
        }

        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.fileUri;
            java.lang.String str = this.fileName;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(fileUri=");
            sb.append(uri);
            sb.append(", fileName=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fileUri.hashCode();
            int hashCode2 = this.fileName.hashCode();
            java.lang.String str = this.mimeType;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success success = (com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, success.fileUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, success.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, success.mimeType);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success copy(android.net.Uri fileUri, java.lang.String fileName, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success(fileUri, fileName, mimeType);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success success, android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = success.fileUri;
            }
            if ((i & 2) != 0) {
                str = success.fileName;
            }
            if ((i & 4) != 0) {
                str2 = success.mimeType;
            }
            return success.copy(uri, str, str2);
        }
    }

    private DownloadResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult$Error;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "error", "<init>", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/DownloadError;", "copy", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult {
        public static final int $stable = 8;
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error) other).error);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error copy(com.paypal.oslo.downloads.api.model.DownloadError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.DownloadError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error error, com.paypal.oslo.downloads.api.model.DownloadError downloadError, int i, java.lang.Object obj) {
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
