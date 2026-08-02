package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;", "", "<init>", "()V", "OnBackPressed", "OnToggleWithdrawMoneySpeed", "OnToggleWithdrawMoneyFI", "OnSelectWithdrawMoneyFI", "OnSelectWithdrawMoneySpeed", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnSelectWithdrawMoneyFI;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnSelectWithdrawMoneySpeed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnToggleWithdrawMoneyFI;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnToggleWithdrawMoneySpeed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WithdrawMoneyReviewEvent {
    public static final int $stable = 0;

    private WithdrawMoneyReviewEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnBackPressed INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnBackPressed();

        public final int hashCode() {
            return -1002215589;
        }

        private OnBackPressed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnToggleWithdrawMoneySpeed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToggleWithdrawMoneySpeed extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnToggleWithdrawMoneySpeed INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnToggleWithdrawMoneySpeed();

        public final int hashCode() {
            return 289250917;
        }

        private OnToggleWithdrawMoneySpeed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnToggleWithdrawMoneySpeed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnToggleWithdrawMoneySpeed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnToggleWithdrawMoneyFI;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToggleWithdrawMoneyFI extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnToggleWithdrawMoneyFI INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnToggleWithdrawMoneyFI();

        public final int hashCode() {
            return -1006152891;
        }

        private OnToggleWithdrawMoneyFI() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnToggleWithdrawMoneyFI";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnToggleWithdrawMoneyFI)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnSelectWithdrawMoneyFI;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;", "", "fundingInstrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnSelectWithdrawMoneyFI;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectWithdrawMoneyFI extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingInstrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSelectWithdrawMoneyFI(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstrumentId = str;
        }

        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectWithdrawMoneyFI(fundingInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneyFI) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneyFI) other).fundingInstrumentId);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneyFI copy(java.lang.String fundingInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneyFI(fundingInstrumentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneyFI copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneyFI onSelectWithdrawMoneyFI, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSelectWithdrawMoneyFI.fundingInstrumentId;
            }
            return onSelectWithdrawMoneyFI.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnSelectWithdrawMoneySpeed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "speedType", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewEvent$OnSelectWithdrawMoneySpeed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "getSpeedType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectWithdrawMoneySpeed extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed speedType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSelectWithdrawMoneySpeed(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
            this.speedType = transferSpeed;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getSpeedType() {
            return this.speedType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = this.speedType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectWithdrawMoneySpeed(speedType=");
            sb.append(transferSpeed);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.speedType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneySpeed) && this.speedType == ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneySpeed) other).speedType;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneySpeed copy(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed speedType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speedType, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneySpeed(speedType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getSpeedType() {
            return this.speedType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneySpeed copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewEvent.OnSelectWithdrawMoneySpeed onSelectWithdrawMoneySpeed, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transferSpeed = onSelectWithdrawMoneySpeed.speedType;
            }
            return onSelectWithdrawMoneySpeed.copy(transferSpeed);
        }
    }

    public /* synthetic */ WithdrawMoneyReviewEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
