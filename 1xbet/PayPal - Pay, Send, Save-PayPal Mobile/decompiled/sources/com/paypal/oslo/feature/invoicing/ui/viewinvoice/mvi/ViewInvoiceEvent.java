package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnOpenExternalLink", "OnOpenExternalSchemeUri", "OnOpenPdfViewer", "OnBackPressed", "OnRefreshRequested", "OnScreenLoaded", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenExternalLink;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenExternalSchemeUri;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenPdfViewer;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnRefreshRequested;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnScreenLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ViewInvoiceEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ViewInvoiceEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenExternalLink;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenExternalLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOpenExternalLink extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnOpenExternalLink(java.lang.String str) {
            super("OnOpenExternalLink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOpenExternalLink(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink) other).url);
        }

        public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink copy$default(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink onOpenExternalLink, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onOpenExternalLink.url;
            }
            return onOpenExternalLink.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenExternalSchemeUri;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenExternalSchemeUri;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOpenExternalSchemeUri extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnOpenExternalSchemeUri(java.lang.String str) {
            super("OnOpenExternalSchemeUri", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOpenExternalSchemeUri(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri) other).url);
        }

        public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri copy$default(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri onOpenExternalSchemeUri, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onOpenExternalSchemeUri.url;
            }
            return onOpenExternalSchemeUri.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenPdfViewer;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnOpenPdfViewer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOpenPdfViewer extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnOpenPdfViewer(java.lang.String str) {
            super("OnOpenPdfViewer", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOpenPdfViewer(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer) other).url);
        }

        public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer copy$default(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer onOpenPdfViewer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onOpenPdfViewer.url;
            }
            return onOpenPdfViewer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnBackPressed INSTANCE = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnBackPressed();

        public final int hashCode() {
            return 127161273;
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
            if (!(other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnRefreshRequested;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRefreshRequested extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnRefreshRequested INSTANCE = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnRefreshRequested();

        public final int hashCode() {
            return 72708885;
        }

        private OnRefreshRequested() {
            super("OnRefreshRequested", null);
        }

        public final java.lang.String toString() {
            return "OnRefreshRequested";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnRefreshRequested)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent$OnScreenLoaded;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnScreenLoaded extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnScreenLoaded INSTANCE = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnScreenLoaded();

        public final int hashCode() {
            return -181103405;
        }

        private OnScreenLoaded() {
            super("OnScreenLoaded", null);
        }

        public final java.lang.String toString() {
            return "OnScreenLoaded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnScreenLoaded)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ViewInvoiceEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
