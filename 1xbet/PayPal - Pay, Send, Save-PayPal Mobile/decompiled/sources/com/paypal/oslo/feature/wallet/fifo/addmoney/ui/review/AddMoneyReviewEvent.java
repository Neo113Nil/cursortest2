package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "", "<init>", "()V", "NavigateToIneligibleFI", "NavigateToAddFI", "NavigateToSuccessScreen", "NavigateToAutoReloadSetup", "NavigateBack", "EndFlow", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$EndFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateBack;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToAddFI;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToAutoReloadSetup;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToIneligibleFI;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToSuccessScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AddMoneyReviewEvent {
    public static final int $stable = 0;

    private AddMoneyReviewEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToIneligibleFI;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToIneligibleFI extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToIneligibleFI INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToIneligibleFI();

        public final int hashCode() {
            return -580793629;
        }

        private NavigateToIneligibleFI() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToIneligibleFI";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToIneligibleFI)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToAddFI;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "navigationType", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToAddFI;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFINavigationType;", "getNavigationType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddFI extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType navigationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAddFI(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFINavigationType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFINavigationType, "");
            this.navigationType = addFINavigationType;
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType getNavigationType() {
            return this.navigationType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFINavigationType = this.navigationType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAddFI(navigationType=");
            sb.append(addFINavigationType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navigationType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAddFI) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationType, ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAddFI) other).navigationType);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAddFI copy(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType navigationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationType, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAddFI(navigationType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType getNavigationType() {
            return this.navigationType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAddFI copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAddFI navigateToAddFI, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFINavigationType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFINavigationType = navigateToAddFI.navigationType;
            }
            return navigateToAddFI.copy(addFINavigationType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "addFundType", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amount", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToSuccessScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "getAddFundType", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccessScreen extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSuccessScreen(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.addFundType = addFundType;
            this.amount = money;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType getAddFundType() {
            return this.addFundType;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType = this.addFundType;
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSuccessScreen(addFundType=");
            sb.append(addFundType);
            sb.append(", amount=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.addFundType.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen navigateToSuccessScreen = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen) other;
            return this.addFundType == navigateToSuccessScreen.addFundType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, navigateToSuccessScreen.amount);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen copy(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.feature.wallet.common.domain.model.Money amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen(addFundType, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType getAddFundType() {
            return this.addFundType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToSuccessScreen navigateToSuccessScreen, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFundType = navigateToSuccessScreen.addFundType;
            }
            if ((i & 2) != 0) {
                money = navigateToSuccessScreen.amount;
            }
            return navigateToSuccessScreen.copy(addFundType, money);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToAutoReloadSetup;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "addFundType", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amount", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateToAutoReloadSetup;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "getAddFundType", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAutoReloadSetup extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAutoReloadSetup(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.addFundType = addFundType;
            this.amount = money;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType getAddFundType() {
            return this.addFundType;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType = this.addFundType;
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAutoReloadSetup(addFundType=");
            sb.append(addFundType);
            sb.append(", amount=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.addFundType.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup navigateToAutoReloadSetup = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup) other;
            return this.addFundType == navigateToAutoReloadSetup.addFundType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, navigateToAutoReloadSetup.amount);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup copy(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.feature.wallet.common.domain.model.Money amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup(addFundType, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType getAddFundType() {
            return this.addFundType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateToAutoReloadSetup navigateToAutoReloadSetup, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFundType = navigateToAutoReloadSetup.addFundType;
            }
            if ((i & 2) != 0) {
                money = navigateToAutoReloadSetup.amount;
            }
            return navigateToAutoReloadSetup.copy(addFundType, money);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$NavigateBack;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateBack();

        public final int hashCode() {
            return -241727184;
        }

        private NavigateBack() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent$EndFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EndFlow extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.EndFlow INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.EndFlow();

        public final int hashCode() {
            return -1626060175;
        }

        private EndFlow() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EndFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent.EndFlow)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AddMoneyReviewEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
