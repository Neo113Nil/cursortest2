package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "ConfirmTapped", "RetakeTapped", "UploadSuccess", "UploadError", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$ConfirmTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$RetakeTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$UploadError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$UploadSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DocumentReviewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DocumentReviewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "", "imageUri", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImageUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String imageUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str) {
            super("DocumentReviewEvent.Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.imageUri = str;
        }

        public final java.lang.String getImageUri() {
            return this.imageUri;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.imageUri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(imageUri=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.imageUri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUri, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize) other).imageUri);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize copy(java.lang.String imageUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUri, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize(imageUri);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImageUri() {
            return this.imageUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize initialize, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.imageUri;
            }
            return initialize.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$ConfirmTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.ConfirmTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.ConfirmTapped();

        public final int hashCode() {
            return 1114167;
        }

        private ConfirmTapped() {
            super("DocumentReviewEvent.ConfirmTapped", null);
        }

        public final java.lang.String toString() {
            return "ConfirmTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.ConfirmTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$RetakeTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetakeTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.RetakeTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.RetakeTapped();

        public final int hashCode() {
            return 1136172091;
        }

        private RetakeTapped() {
            super("DocumentReviewEvent.RetakeTapped", null);
        }

        public final java.lang.String toString() {
            return "RetakeTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.RetakeTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$UploadSuccess;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$UploadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadSuccess extends com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String documentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadSuccess(java.lang.String str) {
            super("DocumentReviewEvent.UploadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.documentId = str;
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadSuccess(documentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.documentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess) other).documentId);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess copy(java.lang.String documentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess(documentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess uploadSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uploadSuccess.documentId;
            }
            return uploadSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$UploadError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent$UploadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadError extends com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadError(java.lang.String str) {
            super("DocumentReviewEvent.UploadError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError) other).error);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError uploadError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uploadError.error;
            }
            return uploadError.copy(str);
        }
    }

    public /* synthetic */ DocumentReviewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
