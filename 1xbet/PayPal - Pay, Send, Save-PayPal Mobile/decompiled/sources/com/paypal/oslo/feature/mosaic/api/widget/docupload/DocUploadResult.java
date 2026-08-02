package com.paypal.oslo.feature.mosaic.api.widget.docupload;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "getDocType", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "docType", "Success", "Error", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Error;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DocUploadResult {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getDocType();

    private DocUploadResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Success;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult;", "", "docRefId", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "docType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocRefId", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "getDocType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult {
        public static final int $stable = 0;
        private final java.lang.String docRefId;
        private final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID docType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
            this.docRefId = str;
            this.docType = documentTypeID;
        }

        public final java.lang.String getDocRefId() {
            return this.docRefId;
        }

        @Override // com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult
        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getDocType() {
            return this.docType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.docRefId;
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = this.docType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(docRefId=");
            sb.append(str);
            sb.append(", docType=");
            sb.append(documentTypeID);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.docRefId.hashCode() * 31) + this.docType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success success = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.docRefId, success.docRefId) && this.docType == success.docType;
        }

        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success copy(java.lang.String docRefId, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID docType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docRefId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docType, "");
            return new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success(docRefId, docType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getDocType() {
            return this.docType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocRefId() {
            return this.docRefId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success copy$default(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success success, java.lang.String str, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.docRefId;
            }
            if ((i & 2) != 0) {
                documentTypeID = success.docType;
            }
            return success.copy(str, documentTypeID);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Error;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "docType", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "docUploadError", "<init>", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "component2", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "copy", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "getDocType", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "getDocUploadError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID docType;
        private final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadError, "");
            this.docType = documentTypeID;
            this.docUploadError = docUploadError;
        }

        @Override // com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult
        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getDocType() {
            return this.docType;
        }

        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError getDocUploadError() {
            return this.docUploadError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = this.docType;
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError = this.docUploadError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(docType=");
            sb.append(documentTypeID);
            sb.append(", docUploadError=");
            sb.append(docUploadError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.docType.hashCode() * 31) + this.docUploadError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error)) {
                return false;
            }
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error error = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error) other;
            return this.docType == error.docType && kotlin.jvm.internal.Intrinsics.areEqual(this.docUploadError, error.docUploadError);
        }

        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error copy(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID docType, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadError, "");
            return new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error(docType, docUploadError);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError getDocUploadError() {
            return this.docUploadError;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getDocType() {
            return this.docType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error copy$default(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error error, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                documentTypeID = error.docType;
            }
            if ((i & 2) != 0) {
                docUploadError = error.docUploadError;
            }
            return error.copy(documentTypeID, docUploadError);
        }
    }

    public /* synthetic */ DocUploadResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
