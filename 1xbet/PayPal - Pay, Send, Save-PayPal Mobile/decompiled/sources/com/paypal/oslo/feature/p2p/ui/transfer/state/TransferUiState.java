package com.paypal.oslo.feature.p2p.ui.transfer.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Error;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Initial;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Loading;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class TransferUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private TransferUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Initial;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "", "amount", "", "cryptoPickerEnabled", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "amountError", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Initial;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "Z", "getCryptoPickerEnabled", "getTransferAttemptId", "getAmountError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String amountError;
        private final boolean cryptoPickerEnabled;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amount = str;
            this.cryptoPickerEnabled = z;
            this.transferAttemptId = str2;
            this.amountError = str3;
        }

        public /* synthetic */ Initial(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3);
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String getAmountError() {
            return this.amountError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            boolean z = this.cryptoPickerEnabled;
            java.lang.String str2 = this.transferAttemptId;
            java.lang.String str3 = this.amountError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(amount=");
            sb.append(str);
            sb.append(", cryptoPickerEnabled=");
            sb.append(z);
            sb.append(", transferAttemptId=");
            sb.append(str2);
            sb.append(", amountError=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.cryptoPickerEnabled);
            int hashCode3 = this.transferAttemptId.hashCode();
            java.lang.String str = this.amountError;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial initial = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, initial.amount) && this.cryptoPickerEnabled == initial.cryptoPickerEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, initial.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountError, initial.amountError);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial copy(java.lang.String amount, boolean cryptoPickerEnabled, java.lang.String transferAttemptId, java.lang.String amountError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial(amount, cryptoPickerEnabled, transferAttemptId, amountError);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAmountError() {
            return this.amountError;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial initial, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initial.amount;
            }
            if ((i & 2) != 0) {
                z = initial.cryptoPickerEnabled;
            }
            if ((i & 4) != 0) {
                str2 = initial.transferAttemptId;
            }
            if ((i & 8) != 0) {
                str3 = initial.amountError;
            }
            return initial.copy(str, z, str2, str3);
        }

        public Initial() {
            this(null, false, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Loading;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "", "cryptoPickerEnabled", "", "amount", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getCryptoPickerEnabled", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final boolean cryptoPickerEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(boolean z, java.lang.String str) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cryptoPickerEnabled = z;
            this.amount = str;
        }

        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        public /* synthetic */ Loading(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            boolean z = this.cryptoPickerEnabled;
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(cryptoPickerEnabled=");
            sb.append(z);
            sb.append(", amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.cryptoPickerEnabled) * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading loading = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading) other;
            return this.cryptoPickerEnabled == loading.cryptoPickerEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, loading.amount);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading copy(boolean cryptoPickerEnabled, java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading(cryptoPickerEnabled, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading loading, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = loading.cryptoPickerEnabled;
            }
            if ((i & 2) != 0) {
                str = loading.amount;
            }
            return loading.copy(z, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001dJì\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010 R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010\"R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bE\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bH\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bI\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bJ\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bK\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\b\u0010\u0010 R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\b\u0011\u0010 R\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bL\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bM\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bN\u0010\u001dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bP\u00100R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bQ\u00100R\u001a\u0010\u0018\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bR\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\bS\u0010\u001dR\u0011\u0010U\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\bT\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "primaryCurrencyCode", "", "cryptoCurrencyEnabled", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "amount", "recipientName", "recipientAvatarUrl", "sendCurrencyCode", "receiveCurrencyCode", "receiveAmount", "exchangeRate", "isLoadingReceiveAmount", "isUpdatingIntent", "cryptoPickerEnabled", "pendingAmount", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "sendMoney", "receiveMoney", "shouldPreserveStateOnResume", "amountError", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId", "getPrimaryCurrencyCode", "Z", "getCryptoCurrencyEnabled", "Ljava/util/List;", "getSupportedIntents", "getAmount", "getRecipientName", "getRecipientAvatarUrl", "getSendCurrencyCode", "getReceiveCurrencyCode", "getReceiveAmount", "getExchangeRate", "getCryptoPickerEnabled", "getPendingAmount", "getPendingIntent", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getSendMoney", "getReceiveMoney", "getShouldPreserveStateOnResume", "getAmountError", "getAreButtonsEnabled", "areButtonsEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState {
        public static final int $stable = 8;
        private final java.lang.String amount;
        private final java.lang.String amountError;
        private final boolean cryptoCurrencyEnabled;
        private final boolean cryptoPickerEnabled;
        private final java.lang.String exchangeRate;
        private final boolean isLoadingReceiveAmount;
        private final boolean isUpdatingIntent;
        private final java.lang.String pendingAmount;
        private final java.lang.String pendingIntent;
        private final java.lang.String primaryCurrencyCode;
        private final java.lang.String receiveAmount;
        private final java.lang.String receiveCurrencyCode;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney;
        private final java.lang.String recipientAvatarUrl;
        private final java.lang.String recipientName;
        private final java.lang.String sendCurrencyCode;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney;
        private final boolean shouldPreserveStateOnResume;
        private final java.util.List<java.lang.String> supportedIntents;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2, boolean z, java.util.List<java.lang.String> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z2, boolean z3, boolean z4, java.lang.String str10, java.lang.String str11, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, boolean z5, java.lang.String str12) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            this.transferAttemptId = str;
            this.primaryCurrencyCode = str2;
            this.cryptoCurrencyEnabled = z;
            this.supportedIntents = list;
            this.amount = str3;
            this.recipientName = str4;
            this.recipientAvatarUrl = str5;
            this.sendCurrencyCode = str6;
            this.receiveCurrencyCode = str7;
            this.receiveAmount = str8;
            this.exchangeRate = str9;
            this.isLoadingReceiveAmount = z2;
            this.isUpdatingIntent = z3;
            this.cryptoPickerEnabled = z4;
            this.pendingAmount = str10;
            this.pendingIntent = str11;
            this.sendMoney = moneyAmount;
            this.receiveMoney = moneyAmount2;
            this.shouldPreserveStateOnResume = z5;
            this.amountError = str12;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.String str2, boolean z, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z2, boolean z3, boolean z4, java.lang.String str10, java.lang.String str11, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, boolean z5, java.lang.String str12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, list, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? "USD" : str6, (i & 256) != 0 ? "GBP" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : moneyAmount, (131072 & i) != 0 ? null : moneyAmount2, (262144 & i) != 0 ? false : z5, (i & 524288) != 0 ? null : str12);
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        public final boolean getCryptoCurrencyEnabled() {
            return this.cryptoCurrencyEnabled;
        }

        public final java.util.List<java.lang.String> getSupportedIntents() {
            return this.supportedIntents;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getRecipientName() {
            return this.recipientName;
        }

        public final java.lang.String getRecipientAvatarUrl() {
            return this.recipientAvatarUrl;
        }

        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        public final java.lang.String getReceiveAmount() {
            return this.receiveAmount;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final boolean isLoadingReceiveAmount() {
            return this.isLoadingReceiveAmount;
        }

        public final boolean isUpdatingIntent() {
            return this.isUpdatingIntent;
        }

        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        public final java.lang.String getPendingAmount() {
            return this.pendingAmount;
        }

        public final java.lang.String getPendingIntent() {
            return this.pendingIntent;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
            return this.sendMoney;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
            return this.receiveMoney;
        }

        public final boolean getShouldPreserveStateOnResume() {
            return this.shouldPreserveStateOnResume;
        }

        public final java.lang.String getAmountError() {
            return this.amountError;
        }

        public final boolean getAreButtonsEnabled() {
            return !this.isUpdatingIntent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.String str2 = this.primaryCurrencyCode;
            boolean z = this.cryptoCurrencyEnabled;
            java.util.List<java.lang.String> list = this.supportedIntents;
            java.lang.String str3 = this.amount;
            java.lang.String str4 = this.recipientName;
            java.lang.String str5 = this.recipientAvatarUrl;
            java.lang.String str6 = this.sendCurrencyCode;
            java.lang.String str7 = this.receiveCurrencyCode;
            java.lang.String str8 = this.receiveAmount;
            java.lang.String str9 = this.exchangeRate;
            boolean z2 = this.isLoadingReceiveAmount;
            boolean z3 = this.isUpdatingIntent;
            boolean z4 = this.cryptoPickerEnabled;
            java.lang.String str10 = this.pendingAmount;
            java.lang.String str11 = this.pendingIntent;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
            boolean z5 = this.shouldPreserveStateOnResume;
            java.lang.String str12 = this.amountError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(transferAttemptId=");
            sb.append(str);
            sb.append(", primaryCurrencyCode=");
            sb.append(str2);
            sb.append(", cryptoCurrencyEnabled=");
            sb.append(z);
            sb.append(", supportedIntents=");
            sb.append(list);
            sb.append(", amount=");
            sb.append(str3);
            sb.append(", recipientName=");
            sb.append(str4);
            sb.append(", recipientAvatarUrl=");
            sb.append(str5);
            sb.append(", sendCurrencyCode=");
            sb.append(str6);
            sb.append(", receiveCurrencyCode=");
            sb.append(str7);
            sb.append(", receiveAmount=");
            sb.append(str8);
            sb.append(", exchangeRate=");
            sb.append(str9);
            sb.append(", isLoadingReceiveAmount=");
            sb.append(z2);
            sb.append(", isUpdatingIntent=");
            sb.append(z3);
            sb.append(", cryptoPickerEnabled=");
            sb.append(z4);
            sb.append(", pendingAmount=");
            sb.append(str10);
            sb.append(", pendingIntent=");
            sb.append(str11);
            sb.append(", sendMoney=");
            sb.append(moneyAmount);
            sb.append(", receiveMoney=");
            sb.append(moneyAmount2);
            sb.append(", shouldPreserveStateOnResume=");
            sb.append(z5);
            sb.append(", amountError=");
            sb.append(str12);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.transferAttemptId.hashCode();
            int hashCode2 = this.primaryCurrencyCode.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.cryptoCurrencyEnabled);
            int hashCode4 = this.supportedIntents.hashCode();
            int hashCode5 = this.amount.hashCode();
            java.lang.String str = this.recipientName;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.recipientAvatarUrl;
            int hashCode7 = str2 == null ? 0 : str2.hashCode();
            int hashCode8 = this.sendCurrencyCode.hashCode();
            int hashCode9 = this.receiveCurrencyCode.hashCode();
            int hashCode10 = this.receiveAmount.hashCode();
            int hashCode11 = this.exchangeRate.hashCode();
            int hashCode12 = java.lang.Boolean.hashCode(this.isLoadingReceiveAmount);
            int hashCode13 = java.lang.Boolean.hashCode(this.isUpdatingIntent);
            int hashCode14 = java.lang.Boolean.hashCode(this.cryptoPickerEnabled);
            java.lang.String str3 = this.pendingAmount;
            int hashCode15 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.pendingIntent;
            int hashCode16 = str4 == null ? 0 : str4.hashCode();
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
            int hashCode17 = moneyAmount == null ? 0 : moneyAmount.hashCode();
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
            int hashCode18 = moneyAmount2 == null ? 0 : moneyAmount2.hashCode();
            int hashCode19 = java.lang.Boolean.hashCode(this.shouldPreserveStateOnResume);
            java.lang.String str5 = this.amountError;
            return (((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, success.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, success.primaryCurrencyCode) && this.cryptoCurrencyEnabled == success.cryptoCurrencyEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, success.supportedIntents) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, success.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, success.recipientName) && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientAvatarUrl, success.recipientAvatarUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendCurrencyCode, success.sendCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCode, success.receiveCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveAmount, success.receiveAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, success.exchangeRate) && this.isLoadingReceiveAmount == success.isLoadingReceiveAmount && this.isUpdatingIntent == success.isUpdatingIntent && this.cryptoPickerEnabled == success.cryptoPickerEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingAmount, success.pendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingIntent, success.pendingIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendMoney, success.sendMoney) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveMoney, success.receiveMoney) && this.shouldPreserveStateOnResume == success.shouldPreserveStateOnResume && kotlin.jvm.internal.Intrinsics.areEqual(this.amountError, success.amountError);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy(java.lang.String transferAttemptId, java.lang.String primaryCurrencyCode, boolean cryptoCurrencyEnabled, java.util.List<java.lang.String> supportedIntents, java.lang.String amount, java.lang.String recipientName, java.lang.String recipientAvatarUrl, java.lang.String sendCurrencyCode, java.lang.String receiveCurrencyCode, java.lang.String receiveAmount, java.lang.String exchangeRate, boolean isLoadingReceiveAmount, boolean isUpdatingIntent, boolean cryptoPickerEnabled, java.lang.String pendingAmount, java.lang.String pendingIntent, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney, boolean shouldPreserveStateOnResume, java.lang.String amountError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success(transferAttemptId, primaryCurrencyCode, cryptoCurrencyEnabled, supportedIntents, amount, recipientName, recipientAvatarUrl, sendCurrencyCode, receiveCurrencyCode, receiveAmount, exchangeRate, isLoadingReceiveAmount, isUpdatingIntent, cryptoPickerEnabled, pendingAmount, pendingIntent, sendMoney, receiveMoney, shouldPreserveStateOnResume, amountError);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getRecipientAvatarUrl() {
            return this.recipientAvatarUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getRecipientName() {
            return this.recipientName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.supportedIntents;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCryptoCurrencyEnabled() {
            return this.cryptoCurrencyEnabled;
        }

        /* renamed from: component20, reason: from getter */
        public final java.lang.String getAmountError() {
            return this.amountError;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getShouldPreserveStateOnResume() {
            return this.shouldPreserveStateOnResume;
        }

        /* renamed from: component18, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
            return this.receiveMoney;
        }

        /* renamed from: component17, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
            return this.sendMoney;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getPendingIntent() {
            return this.pendingIntent;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getPendingAmount() {
            return this.pendingAmount;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsUpdatingIntent() {
            return this.isUpdatingIntent;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsLoadingReceiveAmount() {
            return this.isLoadingReceiveAmount;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getReceiveAmount() {
            return this.receiveAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Error;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "", "message", "", "cryptoPickerEnabled", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z", "getCryptoPickerEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState {
        public static final int $stable = 0;
        private final boolean cryptoPickerEnabled;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cryptoPickerEnabled = z;
        }

        public /* synthetic */ Error(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            boolean z = this.cryptoPickerEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", cryptoPickerEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Boolean.hashCode(this.cryptoPickerEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error error = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.cryptoPickerEnabled == error.cryptoPickerEnabled;
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error copy(java.lang.String message, boolean cryptoPickerEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error(message, cryptoPickerEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error error, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                z = error.cryptoPickerEnabled;
            }
            return error.copy(str, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ TransferUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
