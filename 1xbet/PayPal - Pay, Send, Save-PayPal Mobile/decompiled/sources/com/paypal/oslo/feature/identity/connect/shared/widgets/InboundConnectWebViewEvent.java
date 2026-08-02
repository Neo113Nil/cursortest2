package com.paypal.oslo.feature.identity.connect.shared.widgets;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "", "WebViewInitialized", "PageLoadStarted", "PageLoadFinished", "RedirectUrlIntercepted", "BackClicked", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$BackClicked;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$PageLoadFinished;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$PageLoadStarted;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$RedirectUrlIntercepted;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$WebViewInitialized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface InboundConnectWebViewEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$WebViewInitialized;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewInitialized implements com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized INSTANCE = new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized();

        public final int hashCode() {
            return -560878094;
        }

        private WebViewInitialized() {
        }

        public final java.lang.String toString() {
            return "WebViewInitialized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$PageLoadStarted;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$PageLoadStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PageLoadStarted implements com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public PageLoadStarted(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageLoadStarted(url=");
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
            return (other instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted copy$default(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted pageLoadStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pageLoadStarted.url;
            }
            return pageLoadStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$PageLoadFinished;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$PageLoadFinished;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PageLoadFinished implements com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public PageLoadFinished(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageLoadFinished(url=");
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
            return (other instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished copy$default(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished pageLoadFinished, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pageLoadFinished.url;
            }
            return pageLoadFinished.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$RedirectUrlIntercepted;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$RedirectUrlIntercepted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedirectUrlIntercepted implements com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public RedirectUrlIntercepted(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedirectUrlIntercepted(url=");
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
            return (other instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted copy$default(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted redirectUrlIntercepted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = redirectUrlIntercepted.url;
            }
            return redirectUrlIntercepted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent$BackClicked;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked implements com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked();

        public final int hashCode() {
            return -1430368215;
        }

        private BackClicked() {
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }
}
