package com.paypal.oslo.feature.mosaic.api.widget.docupload;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "", "<init>", "()V", "", "message", "()Ljava/lang/String;", "NoDocumentTypeIDSelected", "UploadFailed", "PermissionDenied", "Cancelled", "Unknown", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$Cancelled;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$NoDocumentTypeIDSelected;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$PermissionDenied;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$Unknown;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$UploadFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DocUploadError {
    public static final int $stable = 0;

    private DocUploadError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$NoDocumentTypeIDSelected;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class NoDocumentTypeIDSelected extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.NoDocumentTypeIDSelected INSTANCE = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.NoDocumentTypeIDSelected();

        private NoDocumentTypeIDSelected() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$UploadFailed;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class UploadFailed extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.UploadFailed INSTANCE = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.UploadFailed();

        private UploadFailed() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$PermissionDenied;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class PermissionDenied extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.PermissionDenied INSTANCE = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.PermissionDenied();

        private PermissionDenied() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$Cancelled;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Cancelled extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Cancelled INSTANCE = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$Unknown;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Unknown(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown) other).message);
        }

        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown copy(java.lang.String message) {
            return new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown copy$default(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            return unknown.copy(str);
        }
    }

    public final java.lang.String message() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.NoDocumentTypeIDSelected.INSTANCE)) {
            return "No document type was selected";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.UploadFailed.INSTANCE)) {
            return "Upload operation failed";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.PermissionDenied.INSTANCE)) {
            return "Permission denied to access file or camera";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Cancelled.INSTANCE)) {
            return "Operation was cancelled";
        }
        if (!(this instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message = ((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown) this).getMessage();
        return message == null ? "An unknown error occurred" : message;
    }

    public /* synthetic */ DocUploadError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
