package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "ConnectUrlRetrieved", "UrlRetrievalFailed", "WebViewInitialized", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "PageLoadStarted", "PageLoadFinished", "RedirectUrlIntercepted", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$ConnectUrlRetrieved;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$Dismiss;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$PageLoadFinished;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$PageLoadStarted;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$RedirectUrlIntercepted;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$UrlRetrievalFailed;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$WebViewInitialized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class InboundConnectEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private InboundConnectEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "request", "<init>", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;)V", "component1", "()Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "copy", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "getRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest) {
            super("InboundConnectEvent.Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectRequest, "");
            this.request = inboundConnectRequest;
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest getRequest() {
            return this.request;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest = this.request;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(request=");
            sb.append(inboundConnectRequest);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.request.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.request, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) other).request);
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize copy(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize(request);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize initialize, com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                inboundConnectRequest = initialize.request;
            }
            return initialize.copy(inboundConnectRequest);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$ConnectUrlRetrieved;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "", "connectUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$ConnectUrlRetrieved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConnectUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConnectUrlRetrieved extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectUrlRetrieved(java.lang.String str) {
            super("InboundConnectEvent.ConnectUrlRetrieved", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.connectUrl = str;
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.connectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectUrlRetrieved(connectUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.connectUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) other).connectUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved copy(java.lang.String connectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved(connectUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved connectUrlRetrieved, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = connectUrlRetrieved.connectUrl;
            }
            return connectUrlRetrieved.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$UrlRetrievalFailed;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "", "errorRedirectUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$UrlRetrievalFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorRedirectUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UrlRetrievalFailed extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String errorRedirectUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlRetrievalFailed(java.lang.String str) {
            super("InboundConnectEvent.UrlRetrievalFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorRedirectUrl = str;
        }

        public final java.lang.String getErrorRedirectUrl() {
            return this.errorRedirectUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorRedirectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UrlRetrievalFailed(errorRedirectUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorRedirectUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorRedirectUrl, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed) other).errorRedirectUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed copy(java.lang.String errorRedirectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorRedirectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed(errorRedirectUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorRedirectUrl() {
            return this.errorRedirectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed urlRetrievalFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = urlRetrievalFailed.errorRedirectUrl;
            }
            return urlRetrievalFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$WebViewInitialized;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewInitialized extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.WebViewInitialized INSTANCE = new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.WebViewInitialized();

        public final int hashCode() {
            return 97260608;
        }

        private WebViewInitialized() {
            super("InboundConnectEvent.WebViewInitialized", null);
        }

        public final java.lang.String toString() {
            return "WebViewInitialized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.WebViewInitialized)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$Dismiss;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss INSTANCE = new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss();

        public final int hashCode() {
            return 1235631205;
        }

        private Dismiss() {
            super("InboundConnectEvent.Dismiss", null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$PageLoadStarted;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$PageLoadStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PageLoadStarted extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageLoadStarted(java.lang.String str) {
            super("InboundConnectEvent.PageLoadStarted", null);
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
            return (other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted pageLoadStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pageLoadStarted.url;
            }
            return pageLoadStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$PageLoadFinished;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$PageLoadFinished;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PageLoadFinished extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageLoadFinished(java.lang.String str) {
            super("InboundConnectEvent.PageLoadFinished", null);
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
            return (other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished) other).url);
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished pageLoadFinished, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pageLoadFinished.url;
            }
            return pageLoadFinished.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$RedirectUrlIntercepted;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent$RedirectUrlIntercepted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRedirectUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedirectUrlIntercepted extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String redirectUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectUrlIntercepted(java.lang.String str) {
            super("InboundConnectEvent.RedirectUrlIntercepted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.redirectUrl = str;
        }

        public final java.lang.String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.redirectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedirectUrlIntercepted(redirectUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redirectUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUrl, ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted) other).redirectUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted copy(java.lang.String redirectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted(redirectUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRedirectUrl() {
            return this.redirectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted redirectUrlIntercepted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = redirectUrlIntercepted.redirectUrl;
            }
            return redirectUrlIntercepted.copy(str);
        }
    }

    public /* synthetic */ InboundConnectEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
