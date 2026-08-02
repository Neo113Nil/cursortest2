package com.paypal.oslo.feature.p2p.ui.transfer.state;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "TransferAttemptStarted", "TransferAttemptFailed", "InitializeTransferConfigurationAndStartTransferAttempt", "UpdateAmountAndIntent", "UpdateAmountAndIntentCompleted", "UpdateAmountAndIntentFailed", "InvalidAmountSubmitted", "AmountChanged", "AmountFormatted", "ResetTransferState", "NavigateToCurrencyPicker", "SetTransferAttemptId", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$AmountChanged;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$AmountFormatted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$InitializeTransferConfigurationAndStartTransferAttempt;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$InvalidAmountSubmitted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$NavigateToCurrencyPicker;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$ResetTransferState;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$SetTransferAttemptId;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$TransferAttemptFailed;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$TransferAttemptStarted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntent;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntentCompleted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntentFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class TransferEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private TransferEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$TransferAttemptStarted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;", "successState", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$TransferAttemptStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState$Success;", "getSuccessState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferAttemptStarted extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success successState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferAttemptStarted(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success) {
            super("TransferAttemptStarted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
            this.successState = success;
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success getSuccessState() {
            return this.successState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success = this.successState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferAttemptStarted(successState=");
            sb.append(success);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.successState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.successState, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted) other).successState);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted copy(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success successState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted(successState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success getSuccessState() {
            return this.successState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted transferAttemptStarted, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                success = transferAttemptStarted.successState;
            }
            return transferAttemptStarted.copy(success);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$TransferAttemptFailed;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferAttemptFailed extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed();

        public final int hashCode() {
            return -1011569623;
        }

        private TransferAttemptFailed() {
            super("TransferAttemptFailed", null);
        }

        public final java.lang.String toString() {
            return "TransferAttemptFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$InitializeTransferConfigurationAndStartTransferAttempt;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializeTransferConfigurationAndStartTransferAttempt extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt();

        public final int hashCode() {
            return 1330944210;
        }

        private InitializeTransferConfigurationAndStartTransferAttempt() {
            super("InitializeTransferConfigurationAndAttempt", null);
        }

        public final java.lang.String toString() {
            return "InitializeTransferConfigurationAndStartTransferAttempt";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntent;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "amount", "currencyCode", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId", "getAmount", "getCurrencyCode", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntent extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String currencyCode;
        private final java.lang.String intent;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAmountAndIntent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("UpdateAmountAndIntent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.transferAttemptId = str;
            this.amount = str2;
            this.currencyCode = str3;
            this.intent = str4;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.String str2 = this.amount;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAmountAndIntent(transferAttemptId=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", intent=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.transferAttemptId.hashCode() * 31) + this.amount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent updateAmountAndIntent = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, updateAmountAndIntent.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, updateAmountAndIntent.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, updateAmountAndIntent.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, updateAmountAndIntent.intent);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent copy(java.lang.String transferAttemptId, java.lang.String amount, java.lang.String currencyCode, java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent(transferAttemptId, amount, currencyCode, intent);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent updateAmountAndIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateAmountAndIntent.transferAttemptId;
            }
            if ((i & 2) != 0) {
                str2 = updateAmountAndIntent.amount;
            }
            if ((i & 4) != 0) {
                str3 = updateAmountAndIntent.currencyCode;
            }
            if ((i & 8) != 0) {
                str4 = updateAmountAndIntent.intent;
            }
            return updateAmountAndIntent.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntentCompleted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntentCompleted extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentCompleted INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentCompleted();

        public final int hashCode() {
            return 1489464047;
        }

        private UpdateAmountAndIntentCompleted() {
            super("UpdateAmountAndIntentCompleted", null);
        }

        public final java.lang.String toString() {
            return "UpdateAmountAndIntentCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$UpdateAmountAndIntentFailed;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntentFailed extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentFailed();

        public final int hashCode() {
            return 1021379097;
        }

        private UpdateAmountAndIntentFailed() {
            super("UpdateAmountAndIntentFailed", null);
        }

        public final java.lang.String toString() {
            return "UpdateAmountAndIntentFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$InvalidAmountSubmitted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidAmountSubmitted extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InvalidAmountSubmitted INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InvalidAmountSubmitted();

        public final int hashCode() {
            return 1508341986;
        }

        private InvalidAmountSubmitted() {
            super("InvalidAmountSubmitted", null);
        }

        public final java.lang.String toString() {
            return "InvalidAmountSubmitted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InvalidAmountSubmitted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$AmountChanged;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "", "rawAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$AmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRawAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountChanged extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        private final java.lang.String rawAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountChanged(java.lang.String str) {
            super("AmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawAmount = str;
        }

        public final java.lang.String getRawAmount() {
            return this.rawAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.rawAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountChanged(rawAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawAmount, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) other).rawAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged copy(java.lang.String rawAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged(rawAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRawAmount() {
            return this.rawAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged amountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountChanged.rawAmount;
            }
            return amountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$AmountFormatted;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "", "formattedAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "money", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$AmountFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountFormatted extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountFormatted(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
            super("AmountFormatted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
            this.formattedAmount = str;
            this.money = moneyAmount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.money;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountFormatted(formattedAmount=");
            sb.append(str);
            sb.append(", money=");
            sb.append(moneyAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formattedAmount.hashCode() * 31) + this.money.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted amountFormatted = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, amountFormatted.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.money, amountFormatted.money);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted copy(java.lang.String formattedAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted(formattedAmount, money);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted amountFormatted, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountFormatted.formattedAmount;
            }
            if ((i & 2) != 0) {
                moneyAmount = amountFormatted.money;
            }
            return amountFormatted.copy(str, moneyAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$ResetTransferState;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResetTransferState extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.ResetTransferState INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.ResetTransferState();

        public final int hashCode() {
            return -637009491;
        }

        private ResetTransferState() {
            super("ResetTransferState", null);
        }

        public final java.lang.String toString() {
            return "ResetTransferState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.ResetTransferState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$NavigateToCurrencyPicker;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCurrencyPicker extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.NavigateToCurrencyPicker INSTANCE = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.NavigateToCurrencyPicker();

        public final int hashCode() {
            return -1053038143;
        }

        private NavigateToCurrencyPicker() {
            super("NavigateToCurrencyPicker", null);
        }

        public final java.lang.String toString() {
            return "NavigateToCurrencyPicker";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.NavigateToCurrencyPicker)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$SetTransferAttemptId;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent$SetTransferAttemptId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetTransferAttemptId extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent {
        public static final int $stable = 0;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetTransferAttemptId(java.lang.String str) {
            super("SetTransferAttemptId", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transferAttemptId = str;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetTransferAttemptId(transferAttemptId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferAttemptId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId) other).transferAttemptId);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId copy(java.lang.String transferAttemptId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId(transferAttemptId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId setTransferAttemptId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setTransferAttemptId.transferAttemptId;
            }
            return setTransferAttemptId.copy(str);
        }
    }

    public /* synthetic */ TransferEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
