package com.paypal.oslo.feature.wallet.fifo.common.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "()Landroidx/navigation3/runtime/NavKey;", "destination", "AddFI", "AddBank", "AddCard", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddBank;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddCard;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddFI;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AddFINavigationType {
    public static final int $stable = 0;

    public abstract androidx.navigation3.runtime.NavKey getDestination();

    private AddFINavigationType() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddFI;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;)Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddFI;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddFI extends com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination.$stable;
        private final com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFI(com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination addFIFlowDestination) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowDestination, "");
            this.destination = addFIFlowDestination;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType
        public final com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination addFIFlowDestination = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFI(destination=");
            sb.append(addFIFlowDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI) other).destination);
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI copy(com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI copy$default(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI addFI, com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination addFIFlowDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFIFlowDestination = addFI.destination;
            }
            return addFI.copy(addFIFlowDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddBank;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;)Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddBank extends com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination.$stable;
        private final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBank(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
            this.destination = addBankDestination;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType
        public final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBank(destination=");
            sb.append(addBankDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank) other).destination);
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank copy(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank copy$default(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank addBank, com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addBankDestination = addBank.destination;
            }
            return addBank.copy(addBankDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddCard;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;)Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType$AddCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCard extends com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination.$stable;
        private final com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddCard(com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination addCardFlowDestination) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowDestination, "");
            this.destination = addCardFlowDestination;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType
        public final com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination addCardFlowDestination = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCard(destination=");
            sb.append(addCardFlowDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard) other).destination);
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard copy(com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard copy$default(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard addCard, com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination addCardFlowDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCardFlowDestination = addCard.destination;
            }
            return addCard.copy(addCardFlowDestination);
        }
    }

    public /* synthetic */ AddFINavigationType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
