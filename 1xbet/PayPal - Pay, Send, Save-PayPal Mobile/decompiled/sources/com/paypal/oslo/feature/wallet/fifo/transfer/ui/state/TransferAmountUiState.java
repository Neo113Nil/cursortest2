package com.paypal.oslo.feature.wallet.fifo.transfer.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState;", "", "<init>", "()V", "Loading", "Loaded", "Success", "Error", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Loaded;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TransferAmountUiState {
    public static final int $stable = 0;

    private TransferAmountUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loading();

        public final int hashCode() {
            return 1680792854;
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Loaded;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "currencySelectorConfig", "", "errorMessageRes", "", "", "errorMessageArgs", "", "shouldAutoShowCurrencySelector", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Ljava/lang/Integer;Ljava/util/List;Z)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/util/List;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Loaded;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "getCurrencySelectorConfig", "Ljava/lang/Integer;", "getErrorMessageRes", "Ljava/util/List;", "getErrorMessageArgs", "Z", "getShouldAutoShowCurrencySelector"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loaded extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig;
        private final java.util.List<java.lang.Object> errorMessageArgs;
        private final java.lang.Integer errorMessageRes;
        private final boolean shouldAutoShowCurrencySelector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, java.lang.Integer num, java.util.List<? extends java.lang.Object> list, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.currencySelectorConfig = currencySelectorConfig;
            this.errorMessageRes = num;
            this.errorMessageArgs = list;
            this.shouldAutoShowCurrencySelector = z;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig getCurrencySelectorConfig() {
            return this.currencySelectorConfig;
        }

        public final java.lang.Integer getErrorMessageRes() {
            return this.errorMessageRes;
        }

        public /* synthetic */ Loaded(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, java.lang.Integer num, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(currencySelectorConfig, (i & 2) != 0 ? null : num, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z);
        }

        public final java.util.List<java.lang.Object> getErrorMessageArgs() {
            return this.errorMessageArgs;
        }

        public final boolean getShouldAutoShowCurrencySelector() {
            return this.shouldAutoShowCurrencySelector;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = this.currencySelectorConfig;
            java.lang.Integer num = this.errorMessageRes;
            java.util.List<java.lang.Object> list = this.errorMessageArgs;
            boolean z = this.shouldAutoShowCurrencySelector;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(currencySelectorConfig=");
            sb.append(currencySelectorConfig);
            sb.append(", errorMessageRes=");
            sb.append(num);
            sb.append(", errorMessageArgs=");
            sb.append(list);
            sb.append(", shouldAutoShowCurrencySelector=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.currencySelectorConfig.hashCode();
            java.lang.Integer num = this.errorMessageRes;
            return (((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.errorMessageArgs.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldAutoShowCurrencySelector);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded loaded = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencySelectorConfig, loaded.currencySelectorConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageRes, loaded.errorMessageRes) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageArgs, loaded.errorMessageArgs) && this.shouldAutoShowCurrencySelector == loaded.shouldAutoShowCurrencySelector;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded copy(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, java.lang.Integer errorMessageRes, java.util.List<? extends java.lang.Object> errorMessageArgs, boolean shouldAutoShowCurrencySelector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessageArgs, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded(currencySelectorConfig, errorMessageRes, errorMessageArgs, shouldAutoShowCurrencySelector);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldAutoShowCurrencySelector() {
            return this.shouldAutoShowCurrencySelector;
        }

        public final java.util.List<java.lang.Object> component3() {
            return this.errorMessageArgs;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorMessageRes() {
            return this.errorMessageRes;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig getCurrencySelectorConfig() {
            return this.currencySelectorConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Loaded loaded, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, java.lang.Integer num, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencySelectorConfig = loaded.currencySelectorConfig;
            }
            if ((i & 2) != 0) {
                num = loaded.errorMessageRes;
            }
            if ((i & 4) != 0) {
                list = loaded.errorMessageArgs;
            }
            if ((i & 8) != 0) {
                z = loaded.shouldAutoShowCurrencySelector;
            }
            return loaded.copy(currencySelectorConfig, num, list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Success;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState;", "", "amount", "", "balanceId", "currencyCode", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "copy", "(DLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "D", "getAmount", "Ljava/lang/String;", "getBalanceId", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState {
        public static final int $stable = 0;
        private final double amount;
        private final java.lang.String balanceId;
        private final java.lang.String currencyCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(double d, java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amount = d;
            this.balanceId = str;
            this.currencyCode = str2;
        }

        public final double getAmount() {
            return this.amount;
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            double d = this.amount;
            java.lang.String str = this.balanceId;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(amount=");
            sb.append(d);
            sb.append(", balanceId=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Double.hashCode(this.amount) * 31) + this.balanceId.hashCode()) * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success success = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success) other;
            return java.lang.Double.compare(this.amount, success.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, success.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, success.currencyCode);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success copy(double amount, java.lang.String balanceId, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success(amount, balanceId, currencyCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        /* renamed from: component1, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Success success, double d, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = success.amount;
            }
            if ((i & 2) != 0) {
                str = success.balanceId;
            }
            if ((i & 4) != 0) {
                str2 = success.currencyCode;
            }
            return success.copy(d, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState;", "", "errorTitle", "errorMessage", "actionButtonLabel", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/state/TransferAmountUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorTitle", "getErrorMessage", "getActionButtonLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState {
        public static final int $stable = 0;
        private final int actionButtonLabel;
        private final int errorMessage;
        private final int errorTitle;

        public Error(int i, int i2, int i3) {
            super(null);
            this.errorTitle = i;
            this.errorMessage = i2;
            this.actionButtonLabel = i3;
        }

        public /* synthetic */ Error(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }

        public final int getErrorTitle() {
            return this.errorTitle;
        }

        public final int getErrorMessage() {
            return this.errorMessage;
        }

        public final int getActionButtonLabel() {
            return this.actionButtonLabel;
        }

        public final java.lang.String toString() {
            int i = this.errorTitle;
            int i2 = this.errorMessage;
            int i3 = this.actionButtonLabel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorTitle=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(i2);
            sb.append(", actionButtonLabel=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.errorTitle) * 31) + java.lang.Integer.hashCode(this.errorMessage)) * 31) + java.lang.Integer.hashCode(this.actionButtonLabel);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error error = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error) other;
            return this.errorTitle == error.errorTitle && this.errorMessage == error.errorMessage && this.actionButtonLabel == error.actionButtonLabel;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error copy(int errorTitle, int errorMessage, int actionButtonLabel) {
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error(errorTitle, errorMessage, actionButtonLabel);
        }

        /* renamed from: component3, reason: from getter */
        public final int getActionButtonLabel() {
            return this.actionButtonLabel;
        }

        /* renamed from: component2, reason: from getter */
        public final int getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.state.TransferAmountUiState.Error error, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = error.errorTitle;
            }
            if ((i4 & 2) != 0) {
                i2 = error.errorMessage;
            }
            if ((i4 & 4) != 0) {
                i3 = error.actionButtonLabel;
            }
            return error.copy(i, i2, i3);
        }

        public Error() {
            this(0, 0, 0, 7, null);
        }
    }

    public /* synthetic */ TransferAmountUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
