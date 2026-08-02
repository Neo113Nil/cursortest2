package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect;", "", "<init>", "()V", "NavigateToAuthenticate", "ReturnCheckoutSuccess", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect$NavigateToAuthenticate;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect$ReturnCheckoutSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CheckoutAuthenticationUiEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect$NavigateToAuthenticate;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAuthenticate extends com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.NavigateToAuthenticate INSTANCE = new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.NavigateToAuthenticate();

        public final int hashCode() {
            return 123549216;
        }

        private NavigateToAuthenticate() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToAuthenticate";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.NavigateToAuthenticate)) {
                return false;
            }
            return true;
        }
    }

    private CheckoutAuthenticationUiEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect$ReturnCheckoutSuccess;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;", "copy", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;)Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect$ReturnCheckoutSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/CheckoutAuthenticationNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReturnCheckoutSuccess extends com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReturnCheckoutSuccess(com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult checkoutAuthenticationNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationNavResult, "");
            this.result = checkoutAuthenticationNavResult;
        }

        public final com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult checkoutAuthenticationNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnCheckoutSuccess(result=");
            sb.append(checkoutAuthenticationNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess) other).result);
        }

        public final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess copy(com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess copy$default(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess returnCheckoutSuccess, com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult checkoutAuthenticationNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                checkoutAuthenticationNavResult = returnCheckoutSuccess.result;
            }
            return returnCheckoutSuccess.copy(checkoutAuthenticationNavResult);
        }
    }

    public /* synthetic */ CheckoutAuthenticationUiEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
