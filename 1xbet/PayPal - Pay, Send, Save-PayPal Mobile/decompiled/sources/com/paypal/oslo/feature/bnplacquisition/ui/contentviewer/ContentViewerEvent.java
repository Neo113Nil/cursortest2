package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DownloadClicked", "DownloadSuccess", "DownloadError", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ContentViewerEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContentViewerEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;", "", "staticUrl", "relativePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getStaticUrl", "getRelativePath", "getFileName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadClicked extends com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent {
        public static final int $stable = 0;
        private final java.lang.String fileName;
        private final java.lang.String relativePath;
        private final java.lang.String staticUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadClicked(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("DownloadClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.staticUrl = str;
            this.relativePath = str2;
            this.fileName = str3;
        }

        public final java.lang.String getStaticUrl() {
            return this.staticUrl;
        }

        public final java.lang.String getRelativePath() {
            return this.relativePath;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.staticUrl;
            java.lang.String str2 = this.relativePath;
            java.lang.String str3 = this.fileName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadClicked(staticUrl=");
            sb.append(str);
            sb.append(", relativePath=");
            sb.append(str2);
            sb.append(", fileName=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.staticUrl;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.relativePath;
            return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.fileName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked downloadClicked = (com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.staticUrl, downloadClicked.staticUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.relativePath, downloadClicked.relativePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, downloadClicked.fileName);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked copy(java.lang.String staticUrl, java.lang.String relativePath, java.lang.String fileName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked(staticUrl, relativePath, fileName);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRelativePath() {
            return this.relativePath;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStaticUrl() {
            return this.staticUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked copy$default(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked downloadClicked, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloadClicked.staticUrl;
            }
            if ((i & 2) != 0) {
                str2 = downloadClicked.relativePath;
            }
            if ((i & 4) != 0) {
                str3 = downloadClicked.fileName;
            }
            return downloadClicked.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess) other).uri);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess copy(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess downloadSuccess, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = downloadSuccess.uri;
            }
            return downloadSuccess.copy(uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent$DownloadError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadError extends com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadError INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadError();

        public final int hashCode() {
            return -607614460;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ContentViewerEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
