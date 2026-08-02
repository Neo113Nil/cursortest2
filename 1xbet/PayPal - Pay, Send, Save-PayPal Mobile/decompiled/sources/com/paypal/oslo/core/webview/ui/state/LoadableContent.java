package com.paypal.oslo.core.webview.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, "Html", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent$Html;", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent$Url;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface LoadableContent {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/LoadableContent$Url;", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "", "url", "", "additionalHttpHeaders", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/webview/ui/state/LoadableContent$Url;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Ljava/util/Map;", "getAdditionalHttpHeaders"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Url implements com.paypal.oslo.core.webview.ui.state.LoadableContent {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders;
        private final java.lang.String url;

        public Url(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.url = str;
            this.additionalHttpHeaders = map;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public /* synthetic */ Url(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getAdditionalHttpHeaders() {
            return this.additionalHttpHeaders;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.util.Map<java.lang.String, java.lang.String> map = this.additionalHttpHeaders;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Url(url=");
            sb.append(str);
            sb.append(", additionalHttpHeaders=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + this.additionalHttpHeaders.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.webview.ui.state.LoadableContent.Url)) {
                return false;
            }
            com.paypal.oslo.core.webview.ui.state.LoadableContent.Url url = (com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, url.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalHttpHeaders, url.additionalHttpHeaders);
        }

        public final com.paypal.oslo.core.webview.ui.state.LoadableContent.Url copy(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalHttpHeaders, "");
            return new com.paypal.oslo.core.webview.ui.state.LoadableContent.Url(url, additionalHttpHeaders);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.additionalHttpHeaders;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.webview.ui.state.LoadableContent.Url copy$default(com.paypal.oslo.core.webview.ui.state.LoadableContent.Url url, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            if ((i & 2) != 0) {
                map = url.additionalHttpHeaders;
            }
            return url.copy(str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/LoadableContent$Html;", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/webview/ui/state/LoadableContent$Html;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Html implements com.paypal.oslo.core.webview.ui.state.LoadableContent {
        public static final int $stable = 0;
        private final java.lang.String data;

        public Html(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = str;
        }

        public final java.lang.String getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Html(data=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.webview.ui.state.LoadableContent.Html) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.core.webview.ui.state.LoadableContent.Html) other).data);
        }

        public final com.paypal.oslo.core.webview.ui.state.LoadableContent.Html copy(java.lang.String data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.core.webview.ui.state.LoadableContent.Html(data);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.state.LoadableContent.Html copy$default(com.paypal.oslo.core.webview.ui.state.LoadableContent.Html html, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = html.data;
            }
            return html.copy(str);
        }
    }
}
