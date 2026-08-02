package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent;", "", "<init>", "()V", "Initialize", "AuthenticationSuccess", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent$AuthenticationSuccess;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent$Initialize;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CheckoutAuthenticationEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "", "authRequestId", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "getCheckoutAuthenticationContext", "Ljava/lang/String;", "getAuthRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent {
        public static final int $stable = 8;
        private final java.lang.String authRequestId;
        private final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.checkoutAuthenticationContext = checkoutAuthenticationContext;
            this.authRequestId = str;
        }

        public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
            return this.checkoutAuthenticationContext;
        }

        public final java.lang.String getAuthRequestId() {
            return this.authRequestId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext = this.checkoutAuthenticationContext;
            java.lang.String str = this.authRequestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(checkoutAuthenticationContext=");
            sb.append(checkoutAuthenticationContext);
            sb.append(", authRequestId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.checkoutAuthenticationContext.hashCode() * 31) + this.authRequestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize initialize = (com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutAuthenticationContext, initialize.checkoutAuthenticationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.authRequestId, initialize.authRequestId);
        }

        public final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize copy(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String authRequestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRequestId, "");
            return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize(checkoutAuthenticationContext, authRequestId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAuthRequestId() {
            return this.authRequestId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
            return this.checkoutAuthenticationContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize copy$default(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize initialize, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                checkoutAuthenticationContext = initialize.checkoutAuthenticationContext;
            }
            if ((i & 2) != 0) {
                str = initialize.authRequestId;
            }
            return initialize.copy(checkoutAuthenticationContext, str);
        }
    }

    private CheckoutAuthenticationEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent$AuthenticationSuccess;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent;", "", "authRequestId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent$AuthenticationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationSuccess extends com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent {
        public static final int $stable = 0;
        private final java.lang.String authRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationSuccess(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.authRequestId = str;
        }

        public final java.lang.String getAuthRequestId() {
            return this.authRequestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.authRequestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationSuccess(authRequestId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authRequestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.authRequestId, ((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess) other).authRequestId);
        }

        public final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess copy(java.lang.String authRequestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRequestId, "");
            return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess(authRequestId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAuthRequestId() {
            return this.authRequestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess copy$default(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess authenticationSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticationSuccess.authRequestId;
            }
            return authenticationSuccess.copy(str);
        }
    }

    public /* synthetic */ CheckoutAuthenticationEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
