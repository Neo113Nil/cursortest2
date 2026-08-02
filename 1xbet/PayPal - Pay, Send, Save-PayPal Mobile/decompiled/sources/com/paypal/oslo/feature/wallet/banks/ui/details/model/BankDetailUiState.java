package com.paypal.oslo.feature.wallet.banks.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState;", "", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BankDetailUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Loading();

        public final int hashCode() {
            return -1487951346;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailInfo;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailInfo;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailInfo;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailInfo;)Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailInfo;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo data;

        public Success(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo bankDetailInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDetailInfo, "");
            this.data = bankDetailInfo;
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo bankDetailInfo = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(bankDetailInfo);
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
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success) other).data);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success copy(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success copy$default(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success success, com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo bankDetailInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankDetailInfo = success.data;
            }
            return success.copy(bankDetailInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            this.message = str;
        }

        public /* synthetic */ Error(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
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
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error copy(java.lang.String message) {
            return new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error copy$default(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
