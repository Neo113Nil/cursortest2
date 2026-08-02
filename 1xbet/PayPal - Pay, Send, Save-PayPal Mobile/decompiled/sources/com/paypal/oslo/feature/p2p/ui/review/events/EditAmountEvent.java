package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadAmount", "UpdateAmount", "UpdateAmountAndIntent", "AmountLoaded", "AmountLoadFailed", "AmountUpdateStarted", "AmountUpdateSuccess", "AmountUpdateFailed", "TransferAttemptIdObtained", "SelectedIntentObtained", "CrossBorderSendAmountStored", "ReceiveCurrencyIdUpdated", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateStarted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$CrossBorderSendAmountStored;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$LoadAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$ReceiveCurrencyIdUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$SelectedIntentObtained;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$TransferAttemptIdObtained;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$UpdateAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$UpdateAmountAndIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class EditAmountEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EditAmountEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$LoadAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadAmount extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.LoadAmount INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.LoadAmount();

        public final int hashCode() {
            return -1845470788;
        }

        private LoadAmount() {
            super("LoadAmount", null);
        }

        public final java.lang.String toString() {
            return "LoadAmount";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.LoadAmount)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$UpdateAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$UpdateAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmount extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAmount(com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount) {
            super("UpdateAmount", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiAmount, "");
            this.amount = uiAmount;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAmount(amount=");
            sb.append(uiAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount) other).amount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount copy(com.paypal.oslo.feature.p2p.ui.review.state.UiAmount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount updateAmount, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiAmount = updateAmount.amount;
            }
            return updateAmount.copy(uiAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$UpdateAmountAndIntent;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "", "newAmount", "currencyCode", "fxQuoteId", "sendAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$UpdateAmountAndIntent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewAmount", "getCurrencyCode", "getFxQuoteId", "getSendAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountAndIntent extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String fxQuoteId;
        private final java.lang.String newAmount;
        private final java.lang.String sendAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAmountAndIntent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("UpdateAmountAndIntent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.newAmount = str;
            this.currencyCode = str2;
            this.fxQuoteId = str3;
            this.sendAmount = str4;
        }

        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public /* synthetic */ UpdateAmountAndIntent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "USD" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4);
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newAmount;
            java.lang.String str2 = this.currencyCode;
            java.lang.String str3 = this.fxQuoteId;
            java.lang.String str4 = this.sendAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAmountAndIntent(newAmount=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", fxQuoteId=");
            sb.append(str3);
            sb.append(", sendAmount=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.newAmount.hashCode();
            int hashCode2 = this.currencyCode.hashCode();
            java.lang.String str = this.fxQuoteId;
            return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.sendAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent updateAmountAndIntent = (com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.newAmount, updateAmountAndIntent.newAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, updateAmountAndIntent.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, updateAmountAndIntent.fxQuoteId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendAmount, updateAmountAndIntent.sendAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent copy(java.lang.String newAmount, java.lang.String currencyCode, java.lang.String fxQuoteId, java.lang.String sendAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent(newAmount, currencyCode, fxQuoteId, sendAmount);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent updateAmountAndIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateAmountAndIntent.newAmount;
            }
            if ((i & 2) != 0) {
                str2 = updateAmountAndIntent.currencyCode;
            }
            if ((i & 4) != 0) {
                str3 = updateAmountAndIntent.fxQuoteId;
            }
            if ((i & 8) != 0) {
                str4 = updateAmountAndIntent.sendAmount;
            }
            return updateAmountAndIntent.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "uiAmount", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "getUiAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountLoaded extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountLoaded(com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount) {
            super("AmountLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiAmount, "");
            this.uiAmount = uiAmount;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount getUiAmount() {
            return this.uiAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount = this.uiAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountLoaded(uiAmount=");
            sb.append(uiAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiAmount, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded) other).uiAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded copy(com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded(uiAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount getUiAmount() {
            return this.uiAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded amountLoaded, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiAmount = amountLoaded.uiAmount;
            }
            return amountLoaded.copy(uiAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "", "errorMessageResId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountLoadFailed extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final int errorMessageResId;

        public AmountLoadFailed(int i) {
            super("AmountLoadFailed", null);
            this.errorMessageResId = i;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountLoadFailed(errorMessageResId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.errorMessageResId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed) && this.errorMessageResId == ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed) other).errorMessageResId;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed copy(int errorMessageResId) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed(errorMessageResId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed amountLoadFailed, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = amountLoadFailed.errorMessageResId;
            }
            return amountLoadFailed.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateStarted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountUpdateStarted extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateStarted INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateStarted();

        public final int hashCode() {
            return 1681688290;
        }

        private AmountUpdateStarted() {
            super("AmountUpdateStarted", null);
        }

        public final java.lang.String toString() {
            return "AmountUpdateStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateStarted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "paymentTransferAttempt", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "fundingOptions", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "fxQuote", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "getPaymentTransferAttempt", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getFundingOptions", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getFxQuote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountUpdateSuccess extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions;
        private final com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountUpdateSuccess(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            super("AmountUpdateSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            this.paymentTransferAttempt = paymentTransferAttempt;
            this.fundingOptions = fundingOptions;
            this.fxQuote = fxQuote;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = this.paymentTransferAttempt;
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountUpdateSuccess(paymentTransferAttempt=");
            sb.append(paymentTransferAttempt);
            sb.append(", fundingOptions=");
            sb.append(fundingOptions);
            sb.append(", fxQuote=");
            sb.append(fxQuote);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.paymentTransferAttempt.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
            int hashCode2 = fundingOptions == null ? 0 : fundingOptions.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            return (((hashCode * 31) + hashCode2) * 31) + (fxQuote != null ? fxQuote.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess amountUpdateSuccess = (com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttempt, amountUpdateSuccess.paymentTransferAttempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, amountUpdateSuccess.fundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, amountUpdateSuccess.fxQuote);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess(paymentTransferAttempt, fundingOptions, fxQuote);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess amountUpdateSuccess, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferAttempt = amountUpdateSuccess.paymentTransferAttempt;
            }
            if ((i & 2) != 0) {
                fundingOptions = amountUpdateSuccess.fundingOptions;
            }
            if ((i & 4) != 0) {
                fxQuote = amountUpdateSuccess.fxQuote;
            }
            return amountUpdateSuccess.copy(paymentTransferAttempt, fundingOptions, fxQuote);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "", "errorMessageResId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$AmountUpdateFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountUpdateFailed extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final int errorMessageResId;

        public AmountUpdateFailed(int i) {
            super("AmountUpdateFailed", null);
            this.errorMessageResId = i;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountUpdateFailed(errorMessageResId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.errorMessageResId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed) && this.errorMessageResId == ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed) other).errorMessageResId;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed copy(int errorMessageResId) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed(errorMessageResId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed amountUpdateFailed, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = amountUpdateFailed.errorMessageResId;
            }
            return amountUpdateFailed.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$TransferAttemptIdObtained;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$TransferAttemptIdObtained;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferAttemptIdObtained extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferAttemptIdObtained(java.lang.String str) {
            super("TransferAttemptIdObtained", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transferAttemptId = str;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferAttemptIdObtained(transferAttemptId=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained) other).transferAttemptId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained copy(java.lang.String transferAttemptId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained(transferAttemptId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained transferAttemptIdObtained, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transferAttemptIdObtained.transferAttemptId;
            }
            return transferAttemptIdObtained.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$SelectedIntentObtained;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "selectedIntent", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$SelectedIntentObtained;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "getSelectedIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectedIntentObtained extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedIntentObtained(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
            super("SelectedIntentObtained", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
            this.selectedIntent = paymentTransferIntent;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getSelectedIntent() {
            return this.selectedIntent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedIntentObtained(selectedIntent=");
            sb.append(paymentTransferIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedIntent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained) && this.selectedIntent == ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained) other).selectedIntent;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedIntent, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained(selectedIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getSelectedIntent() {
            return this.selectedIntent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained selectedIntentObtained, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferIntent = selectedIntentObtained.selectedIntent;
            }
            return selectedIntentObtained.copy(paymentTransferIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$CrossBorderSendAmountStored;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "", "sendAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$CrossBorderSendAmountStored;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSendAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CrossBorderSendAmountStored extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String sendAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CrossBorderSendAmountStored(java.lang.String str) {
            super("CrossBorderSendAmountStored", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sendAmount = str;
        }

        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sendAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CrossBorderSendAmountStored(sendAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sendAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendAmount, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored) other).sendAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored copy(java.lang.String sendAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored(sendAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored crossBorderSendAmountStored, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = crossBorderSendAmountStored.sendAmount;
            }
            return crossBorderSendAmountStored.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$ReceiveCurrencyIdUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "", "receiveCurrencyId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent$ReceiveCurrencyIdUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReceiveCurrencyId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiveCurrencyIdUpdated extends com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String receiveCurrencyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveCurrencyIdUpdated(java.lang.String str) {
            super("ReceiveCurrencyIdUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.receiveCurrencyId = str;
        }

        public final java.lang.String getReceiveCurrencyId() {
            return this.receiveCurrencyId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.receiveCurrencyId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiveCurrencyIdUpdated(receiveCurrencyId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.receiveCurrencyId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyId, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated) other).receiveCurrencyId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated copy(java.lang.String receiveCurrencyId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated(receiveCurrencyId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReceiveCurrencyId() {
            return this.receiveCurrencyId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated copy$default(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated receiveCurrencyIdUpdated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = receiveCurrencyIdUpdated.receiveCurrencyId;
            }
            return receiveCurrencyIdUpdated.copy(str);
        }
    }

    public /* synthetic */ EditAmountEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
