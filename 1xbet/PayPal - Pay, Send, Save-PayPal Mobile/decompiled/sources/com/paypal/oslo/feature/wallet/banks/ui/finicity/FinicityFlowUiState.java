package com.paypal.oslo.feature.wallet.banks.ui.finicity;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState;", "", "Loading", "ConnectUrl", "ManualAddBankExitFriction", "Error", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$ConnectUrl;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$ManualAddBankExitFriction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface FinicityFlowUiState {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState;", "", "bankLogoUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState {
        public static final int $stable = 0;
        private final java.lang.String bankLogoUrl;

        public Loading(java.lang.String str) {
            this.bankLogoUrl = str;
        }

        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(bankLogoUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.bankLogoUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoUrl, ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading) other).bankLogoUrl);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading copy(java.lang.String bankLogoUrl) {
            return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading(bankLogoUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankLogoUrl() {
            return this.bankLogoUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading copy$default(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading loading, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loading.bankLogoUrl;
            }
            return loading.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$ConnectUrl;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$ConnectUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConnectUrl implements com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState {
        public static final int $stable = 0;
        private final java.lang.String url;

        public ConnectUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectUrl(url=");
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
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl) other).url);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl copy$default(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl connectUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = connectUrl.url;
            }
            return connectUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$ManualAddBankExitFriction;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManualAddBankExitFriction implements com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ManualAddBankExitFriction INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ManualAddBankExitFriction();

        public final int hashCode() {
            return -237093247;
        }

        private ManualAddBankExitFriction() {
        }

        public final java.lang.String toString() {
            return "ManualAddBankExitFriction";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ManualAddBankExitFriction)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error copy$default(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }
}
