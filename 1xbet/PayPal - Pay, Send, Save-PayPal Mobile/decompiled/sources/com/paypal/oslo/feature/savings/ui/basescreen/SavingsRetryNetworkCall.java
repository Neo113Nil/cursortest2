package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "", "<init>", "()V", "SavingsAcctStatusCall", "SavingsAcctEligibilityCall", "SavingsLandingPageDataCall", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsAcctEligibilityCall;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsAcctStatusCall;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsLandingPageDataCall;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsRetryNetworkCall {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsAcctStatusCall;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "clientSource", "", "isEmbeddedFlow", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;Z)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;Z)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsAcctStatusCall;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "getClientSource", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAcctStatusCall extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource;
        private final boolean isEmbeddedFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsAcctStatusCall(com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsClientSource, "");
            this.clientSource = savingsClientSource;
            this.isEmbeddedFlow = z;
        }

        public final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource getClientSource() {
            return this.clientSource;
        }

        public final boolean isEmbeddedFlow() {
            return this.isEmbeddedFlow;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource = this.clientSource;
            boolean z = this.isEmbeddedFlow;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAcctStatusCall(clientSource=");
            sb.append(savingsClientSource);
            sb.append(", isEmbeddedFlow=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.clientSource.hashCode() * 31) + java.lang.Boolean.hashCode(this.isEmbeddedFlow);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall savingsAcctStatusCall = (com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall) other;
            return this.clientSource == savingsAcctStatusCall.clientSource && this.isEmbeddedFlow == savingsAcctStatusCall.isEmbeddedFlow;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall copy(com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource, boolean isEmbeddedFlow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSource, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall(clientSource, isEmbeddedFlow);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEmbeddedFlow() {
            return this.isEmbeddedFlow;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource getClientSource() {
            return this.clientSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall savingsAcctStatusCall, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsClientSource = savingsAcctStatusCall.clientSource;
            }
            if ((i & 2) != 0) {
                z = savingsAcctStatusCall.isEmbeddedFlow;
            }
            return savingsAcctStatusCall.copy(savingsClientSource, z);
        }
    }

    private SavingsRetryNetworkCall() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsAcctEligibilityCall;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "", "countryCode", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "clientSource", "", "isRerunRequired", "isTerminalCall", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;ZZ)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsAcctEligibilityCall;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "getClientSource", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAcctEligibilityCall extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource;
        private final java.lang.String countryCode;
        private final boolean isRerunRequired;
        private final boolean isTerminalCall;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsAcctEligibilityCall(java.lang.String str, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z, boolean z2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsClientSource, "");
            this.countryCode = str;
            this.clientSource = savingsClientSource;
            this.isRerunRequired = z;
            this.isTerminalCall = z2;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource getClientSource() {
            return this.clientSource;
        }

        public final boolean isRerunRequired() {
            return this.isRerunRequired;
        }

        public final boolean isTerminalCall() {
            return this.isTerminalCall;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource = this.clientSource;
            boolean z = this.isRerunRequired;
            boolean z2 = this.isTerminalCall;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAcctEligibilityCall(countryCode=");
            sb.append(str);
            sb.append(", clientSource=");
            sb.append(savingsClientSource);
            sb.append(", isRerunRequired=");
            sb.append(z);
            sb.append(", isTerminalCall=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.countryCode.hashCode() * 31) + this.clientSource.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRerunRequired)) * 31) + java.lang.Boolean.hashCode(this.isTerminalCall);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall savingsAcctEligibilityCall = (com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, savingsAcctEligibilityCall.countryCode) && this.clientSource == savingsAcctEligibilityCall.clientSource && this.isRerunRequired == savingsAcctEligibilityCall.isRerunRequired && this.isTerminalCall == savingsAcctEligibilityCall.isTerminalCall;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall copy(java.lang.String countryCode, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource, boolean isRerunRequired, boolean isTerminalCall) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSource, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall(countryCode, clientSource, isRerunRequired, isTerminalCall);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsTerminalCall() {
            return this.isTerminalCall;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRerunRequired() {
            return this.isRerunRequired;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource getClientSource() {
            return this.clientSource;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall savingsAcctEligibilityCall, java.lang.String str, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savingsAcctEligibilityCall.countryCode;
            }
            if ((i & 2) != 0) {
                savingsClientSource = savingsAcctEligibilityCall.clientSource;
            }
            if ((i & 4) != 0) {
                z = savingsAcctEligibilityCall.isRerunRequired;
            }
            if ((i & 8) != 0) {
                z2 = savingsAcctEligibilityCall.isTerminalCall;
            }
            return savingsAcctEligibilityCall.copy(str, savingsClientSource, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsLandingPageDataCall;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "", "isUnconfirmedEmailError", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall$SavingsLandingPageDataCall;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsLandingPageDataCall extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall {
        public static final int $stable = 0;
        private final boolean isUnconfirmedEmailError;

        public SavingsLandingPageDataCall(boolean z) {
            super(null);
            this.isUnconfirmedEmailError = z;
        }

        public /* synthetic */ SavingsLandingPageDataCall(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean isUnconfirmedEmailError() {
            return this.isUnconfirmedEmailError;
        }

        public final java.lang.String toString() {
            boolean z = this.isUnconfirmedEmailError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsLandingPageDataCall(isUnconfirmedEmailError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isUnconfirmedEmailError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall) && this.isUnconfirmedEmailError == ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall) other).isUnconfirmedEmailError;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall copy(boolean isUnconfirmedEmailError) {
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall(isUnconfirmedEmailError);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsUnconfirmedEmailError() {
            return this.isUnconfirmedEmailError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsLandingPageDataCall savingsLandingPageDataCall, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = savingsLandingPageDataCall.isUnconfirmedEmailError;
            }
            return savingsLandingPageDataCall.copy(z);
        }

        public SavingsLandingPageDataCall() {
            this(false, 1, null);
        }
    }

    public /* synthetic */ SavingsRetryNetworkCall(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
