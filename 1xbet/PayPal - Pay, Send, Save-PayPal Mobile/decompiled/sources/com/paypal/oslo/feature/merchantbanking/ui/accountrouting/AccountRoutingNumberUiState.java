package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "", "<init>", "()V", "Success", "Error", "NavigateToTerms", "Default", "Loading", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Default;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Error;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Loading;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$NavigateToTerms;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AccountRoutingNumberUiState {
    public static final int $stable = 0;

    private AccountRoutingNumberUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Success;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "routingNumber", "", "showAccountCreationToast", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountNumber", "getRoutingNumber", "Z", "getShowAccountCreationToast"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState {
        public static final int $stable = 0;
        private final java.lang.String accountNumber;
        private final java.lang.String routingNumber;
        private final boolean showAccountCreationToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.accountNumber = str;
            this.routingNumber = str2;
            this.showAccountCreationToast = z;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public final boolean getShowAccountCreationToast() {
            return this.showAccountCreationToast;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountNumber;
            java.lang.String str2 = this.routingNumber;
            boolean z = this.showAccountCreationToast;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(accountNumber=");
            sb.append(str);
            sb.append(", routingNumber=");
            sb.append(str2);
            sb.append(", showAccountCreationToast=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.routingNumber.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showAccountCreationToast);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success success = (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, success.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, success.routingNumber) && this.showAccountCreationToast == success.showAccountCreationToast;
        }

        public final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success copy(java.lang.String accountNumber, java.lang.String routingNumber, boolean showAccountCreationToast) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success(accountNumber, routingNumber, showAccountCreationToast);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowAccountCreationToast() {
            return this.showAccountCreationToast;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success copy$default(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success success, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = success.routingNumber;
            }
            if ((i & 4) != 0) {
                z = success.showAccountCreationToast;
            }
            return success.copy(str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Error;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;)Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenTypeEnum, "");
            this.errorType = errorScreenTypeEnum;
        }

        public final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(errorScreenTypeEnum);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error) && this.errorType == ((com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error) other).errorType;
        }

        public final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error copy(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error copy$default(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error error, com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorScreenTypeEnum = error.errorType;
            }
            return error.copy(errorScreenTypeEnum);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$NavigateToTerms;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToTerms extends com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.NavigateToTerms INSTANCE = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.NavigateToTerms();

        public final int hashCode() {
            return 703748716;
        }

        private NavigateToTerms() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToTerms";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.NavigateToTerms)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Default;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Default extends com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Default INSTANCE = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Default();

        public final int hashCode() {
            return -942624622;
        }

        private Default() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Default";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Default)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Loading;", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Loading INSTANCE = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Loading();

        public final int hashCode() {
            return 2144189325;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AccountRoutingNumberUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
