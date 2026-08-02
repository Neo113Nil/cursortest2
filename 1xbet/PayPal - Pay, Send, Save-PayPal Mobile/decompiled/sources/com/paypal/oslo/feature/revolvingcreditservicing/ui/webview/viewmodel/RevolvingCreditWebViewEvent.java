package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnBackPressed", "OnDownloadRequested", "OnDownloadCompleted", "OnDownloadFailed", "OnFileOpenError", "OnRetryClick", "OnMakePhoneCall", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadRequested;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnFileOpenError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnMakePhoneCall;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnRetryClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RevolvingCreditWebViewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RevolvingCreditWebViewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnViewCreated INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnViewCreated();

        public final int hashCode() {
            return -1687021613;
        }

        private OnViewCreated() {
            super("OnViewCreated", null);
        }

        public final java.lang.String toString() {
            return "OnViewCreated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnViewCreated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnBackPressed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnBackPressed();

        public final int hashCode() {
            return -1389429;
        }

        private OnBackPressed() {
            super("OnBackPressed", null);
        }

        public final java.lang.String toString() {
            return "OnBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadRequested;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "userAgent", "", "isAuthRequired", "downloadSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadRequested;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getMimeType", "getUserAgent", "Z", "getDownloadSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadRequested extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String downloadSource;
        private final boolean isAuthRequired;
        private final java.lang.String mimeType;
        private final java.lang.String url;
        private final java.lang.String userAgent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDownloadRequested(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4) {
            super("OnDownloadRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.url = str;
            this.mimeType = str2;
            this.userAgent = str3;
            this.isAuthRequired = z;
            this.downloadSource = str4;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String getUserAgent() {
            return this.userAgent;
        }

        public final boolean isAuthRequired() {
            return this.isAuthRequired;
        }

        public final java.lang.String getDownloadSource() {
            return this.downloadSource;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.mimeType;
            java.lang.String str3 = this.userAgent;
            boolean z = this.isAuthRequired;
            java.lang.String str4 = this.downloadSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadRequested(url=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(", userAgent=");
            sb.append(str3);
            sb.append(", isAuthRequired=");
            sb.append(z);
            sb.append(", downloadSource=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.userAgent;
            return (((((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isAuthRequired)) * 31) + this.downloadSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested onDownloadRequested = (com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, onDownloadRequested.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, onDownloadRequested.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAgent, onDownloadRequested.userAgent) && this.isAuthRequired == onDownloadRequested.isAuthRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadSource, onDownloadRequested.downloadSource);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested copy(java.lang.String url, java.lang.String mimeType, java.lang.String userAgent, boolean isAuthRequired, java.lang.String downloadSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadSource, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested(url, mimeType, userAgent, isAuthRequired, downloadSource);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getDownloadSource() {
            return this.downloadSource;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAuthRequired() {
            return this.isAuthRequired;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getUserAgent() {
            return this.userAgent;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadRequested onDownloadRequested, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDownloadRequested.url;
            }
            if ((i & 2) != 0) {
                str2 = onDownloadRequested.mimeType;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = onDownloadRequested.userAgent;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                z = onDownloadRequested.isAuthRequired;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                str4 = onDownloadRequested.downloadSource;
            }
            return onDownloadRequested.copy(str, str5, str6, z2, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Landroid/net/Uri;", "fileUri", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/net/Uri;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getFileUri", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadCompleted extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDownloadCompleted(android.net.Uri uri, java.lang.String str) {
            super("OnDownloadCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.fileUri = uri;
            this.mimeType = str;
        }

        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.fileUri;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadCompleted(fileUri=");
            sb.append(uri);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fileUri.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted onDownloadCompleted = (com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, onDownloadCompleted.fileUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, onDownloadCompleted.mimeType);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted copy(android.net.Uri fileUri, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted(fileUri, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted onDownloadCompleted, android.net.Uri uri, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = onDownloadCompleted.fileUri;
            }
            if ((i & 2) != 0) {
                str = onDownloadCompleted.mimeType;
            }
            return onDownloadCompleted.copy(uri, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnDownloadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        public OnDownloadFailed(java.lang.String str) {
            super("OnDownloadFailed", null);
            this.errorMessage = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed copy(java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed onDownloadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDownloadFailed.errorMessage;
            }
            return onDownloadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnFileOpenError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFileOpenError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnFileOpenError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnFileOpenError();

        public final int hashCode() {
            return -1153193198;
        }

        private OnFileOpenError() {
            super("OnFileOpenError", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnFileOpenError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnFileOpenError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnRetryClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetryClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnRetryClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnRetryClick();

        public final int hashCode() {
            return 1381196400;
        }

        private OnRetryClick() {
            super("OnRetryClick", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnRetryClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnRetryClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnMakePhoneCall;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent$OnMakePhoneCall;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMakePhoneCall extends com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMakePhoneCall(java.lang.String str) {
            super("OnMakePhoneCall", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMakePhoneCall(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnMakePhoneCall) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnMakePhoneCall) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnMakePhoneCall copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnMakePhoneCall(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnMakePhoneCall copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnMakePhoneCall onMakePhoneCall, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMakePhoneCall.phoneNumber;
            }
            return onMakePhoneCall.copy(str);
        }
    }

    public /* synthetic */ RevolvingCreditWebViewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
