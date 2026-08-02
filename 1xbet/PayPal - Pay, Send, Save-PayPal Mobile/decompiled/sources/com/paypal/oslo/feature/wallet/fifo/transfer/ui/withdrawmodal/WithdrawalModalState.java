package com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Loaded;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class WithdrawalModalState {
    public static final int $stable = 0;

    private WithdrawalModalState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading();

        public final int hashCode() {
            return -56777561;
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Loaded;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;", "", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionsModel;", "withdrawMoneyOptions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Loaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getWithdrawMoneyOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loaded extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> withdrawMoneyOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.withdrawMoneyOptions = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> getWithdrawMoneyOptions() {
            return this.withdrawMoneyOptions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> list = this.withdrawMoneyOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(withdrawMoneyOptions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.withdrawMoneyOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawMoneyOptions, ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded) other).withdrawMoneyOptions);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded copy(java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> withdrawMoneyOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyOptions, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded(withdrawMoneyOptions);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> component1() {
            return this.withdrawMoneyOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded loaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loaded.withdrawMoneyOptions;
            }
            return loaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;", "", "errorMessage", "errorDescription", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorDescription", "Ljava/lang/Integer;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState {
        public static final int $stable = 0;
        private final java.lang.Integer errorCode;
        private final java.lang.String errorDescription;
        private final java.lang.String errorMessage;

        public Error(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
            super(null);
            this.errorMessage = str;
            this.errorDescription = str2;
            this.errorCode = num;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorDescription;
            java.lang.Integer num = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(", errorDescription=");
            sb.append(str2);
            sb.append(", errorCode=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.errorDescription;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.Integer num = this.errorCode;
            return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error error = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, error.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error copy(java.lang.String errorMessage, java.lang.String errorDescription, java.lang.Integer errorCode) {
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error(errorMessage, errorDescription, errorCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error error, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i & 2) != 0) {
                str2 = error.errorDescription;
            }
            if ((i & 4) != 0) {
                num = error.errorCode;
            }
            return error.copy(str, str2, num);
        }

        public Error() {
            this(null, null, null, 7, null);
        }
    }

    public /* synthetic */ WithdrawalModalState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
