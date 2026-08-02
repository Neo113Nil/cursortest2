package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent;", "", "<init>", "()V", "SubmitAmount", "NavigateToCIP", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent$NavigateToCIP;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent$SubmitAmount;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AmountSelectionEvent {
    public static final int $stable = 0;

    private AmountSelectionEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent$SubmitAmount;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent;", "", "amount", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "addFIFlowType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent$SubmitAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "getAddFIFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitAmount extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitAmount(java.lang.String str, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowType, "");
            this.amount = str;
            this.addFIFlowType = addFIFlowType;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public /* synthetic */ SubmitAmount(java.lang.String str, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI : addFIFlowType);
        }

        public final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType getAddFIFlowType() {
            return this.addFIFlowType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType = this.addFIFlowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitAmount(amount=");
            sb.append(str);
            sb.append(", addFIFlowType=");
            sb.append(addFIFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amount.hashCode() * 31) + this.addFIFlowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount submitAmount = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, submitAmount.amount) && this.addFIFlowType == submitAmount.addFIFlowType;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount copy(java.lang.String amount, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowType, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount(amount, addFIFlowType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType getAddFIFlowType() {
            return this.addFIFlowType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount submitAmount, java.lang.String str, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = submitAmount.amount;
            }
            if ((i & 2) != 0) {
                addFIFlowType = submitAmount.addFIFlowType;
            }
            return submitAmount.copy(str, addFIFlowType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent$NavigateToCIP;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCIP extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.NavigateToCIP INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.NavigateToCIP();

        public final int hashCode() {
            return -1549476685;
        }

        private NavigateToCIP() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToCIP";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.NavigateToCIP)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AmountSelectionEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
