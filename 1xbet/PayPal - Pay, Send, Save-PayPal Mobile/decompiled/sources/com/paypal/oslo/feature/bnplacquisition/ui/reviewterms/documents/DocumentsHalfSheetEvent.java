package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DocumentClicked", "DownloadSuccess", "DownloadError", "ClosePressed", "SheetOpened", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DocumentClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DownloadError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DownloadSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$SheetOpened;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DocumentsHalfSheetEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DocumentsHalfSheetEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DocumentClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;", "document", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DocumentClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;", "getDocument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DocumentClicked extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel document;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentClicked(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel) {
            super("DocumentClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentItemUiModel, "");
            this.document = documentItemUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel getDocument() {
            return this.document;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel = this.document;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentClicked(document=");
            sb.append(documentItemUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.document.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.document, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked) other).document);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel document) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(document, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked(document);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel getDocument() {
            return this.document;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked documentClicked, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                documentItemUiModel = documentClicked.document;
            }
            return documentClicked.copy(documentItemUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DownloadSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DownloadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent {
        public static final int $stable = 8;
        private final android.net.Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadSuccess(android.net.Uri uri) {
            super("DownloadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.uri = uri;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.uri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadSuccess(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess) other).uri);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess copy(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess downloadSuccess, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = downloadSuccess.uri;
            }
            return downloadSuccess.copy(uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$DownloadError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadError extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadError INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadError();

        public final int hashCode() {
            return -1535068541;
        }

        private DownloadError() {
            super("DownloadError", null);
        }

        public final java.lang.String toString() {
            return "DownloadError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.ClosePressed();

        public final int hashCode() {
            return 87991943;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent$SheetOpened;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SheetOpened extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.SheetOpened INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.SheetOpened();

        public final int hashCode() {
            return -1192787061;
        }

        private SheetOpened() {
            super("SheetOpened", null);
        }

        public final java.lang.String toString() {
            return "SheetOpened";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.SheetOpened)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DocumentsHalfSheetEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
