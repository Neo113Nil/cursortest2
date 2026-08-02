package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "", "<init>", "()V", "Dismissed", "ShowFiSelection", "NavigateToGoalSelection", "NavigateToReviewSelection", "NavigateToAddCard", "NavigateToAddBank", "SubmissionSuccess", "SubmissionError", "ShowToast", "ShowInsufficientFundsError", "CreateGoalSuccess", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$CreateGoalSuccess;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$Dismissed;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToAddBank;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToGoalSelection;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToReviewSelection;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowFiSelection;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowInsufficientFundsError;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowToast;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionError;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ReviewScreenEffect {
    public static final int $stable = 0;

    private ReviewScreenEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$Dismissed;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismissed extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.Dismissed INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.Dismissed();

        public final int hashCode() {
            return 550601233;
        }

        private Dismissed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Dismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.Dismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowFiSelection;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowFiSelection extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowFiSelection INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowFiSelection();

        public final int hashCode() {
            return -858276812;
        }

        private ShowFiSelection() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowFiSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowFiSelection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToGoalSelection;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToGoalSelection extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToGoalSelection INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToGoalSelection();

        public final int hashCode() {
            return -1219476811;
        }

        private NavigateToGoalSelection() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToGoalSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToGoalSelection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToReviewSelection;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReviewSelection extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToReviewSelection INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToReviewSelection();

        public final int hashCode() {
            return -1804240624;
        }

        private NavigateToReviewSelection() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToReviewSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToReviewSelection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddCard extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToAddCard INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToAddCard();

        public final int hashCode() {
            return 190908237;
        }

        private NavigateToAddCard() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddCard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToAddCard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$NavigateToAddBank;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddBank extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToAddBank INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToAddBank();

        public final int hashCode() {
            return 190878329;
        }

        private NavigateToAddBank() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddBank";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.NavigateToAddBank)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JP\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b-\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionSuccess;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "selectedFi", "selectedGoal", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "<init>", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component4", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "copy", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "getFlowType", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "getSelectedFi", "getSelectedGoal", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmissionSuccess extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 8;
        private final java.lang.String amount;
        private final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmissionSuccess(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
            this.flowType = moneyManagementFlowType;
            this.amount = str;
            this.goal = goalSummaryDTO;
            this.selectedFi = moneyMovementFiDTO;
            this.selectedGoal = goalSummaryDTO2;
            this.frequency = frequencyType;
        }

        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getSelectedGoal() {
            return this.selectedGoal;
        }

        public /* synthetic */ SubmissionSuccess(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(moneyManagementFlowType, str, goalSummaryDTO, (i & 8) != 0 ? null : moneyMovementFiDTO, (i & 16) != 0 ? null : goalSummaryDTO2, (i & 32) != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME : frequencyType);
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = this.flowType;
            java.lang.String str = this.amount;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = this.selectedGoal;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.frequency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmissionSuccess(flowType=");
            sb.append(moneyManagementFlowType);
            sb.append(", amount=");
            sb.append(str);
            sb.append(", goal=");
            sb.append(goalSummaryDTO);
            sb.append(", selectedFi=");
            sb.append(moneyMovementFiDTO);
            sb.append(", selectedGoal=");
            sb.append(goalSummaryDTO2);
            sb.append(", frequency=");
            sb.append(frequencyType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.flowType.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.goal.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            int hashCode4 = moneyMovementFiDTO == null ? 0 : moneyMovementFiDTO.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.selectedGoal;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (goalSummaryDTO != null ? goalSummaryDTO.hashCode() : 0)) * 31) + this.frequency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess submissionSuccess = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess) other;
            return this.flowType == submissionSuccess.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, submissionSuccess.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, submissionSuccess.goal) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, submissionSuccess.selectedFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedGoal, submissionSuccess.selectedGoal) && this.frequency == submissionSuccess.frequency;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess copy(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType, java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess(flowType, amount, goal, selectedFi, selectedGoal, frequency);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getSelectedGoal() {
            return this.selectedGoal;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess submissionSuccess, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyManagementFlowType = submissionSuccess.flowType;
            }
            if ((i & 2) != 0) {
                str = submissionSuccess.amount;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                goalSummaryDTO = submissionSuccess.goal;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3 = goalSummaryDTO;
            if ((i & 8) != 0) {
                moneyMovementFiDTO = submissionSuccess.selectedFi;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO2 = moneyMovementFiDTO;
            if ((i & 16) != 0) {
                goalSummaryDTO2 = submissionSuccess.selectedGoal;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO4 = goalSummaryDTO2;
            if ((i & 32) != 0) {
                frequencyType = submissionSuccess.frequency;
            }
            return submissionSuccess.copy(moneyManagementFlowType, str2, goalSummaryDTO3, moneyMovementFiDTO2, goalSummaryDTO4, frequencyType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionError;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmissionError extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmissionError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmissionError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionError) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionError copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionError submissionError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = submissionError.message;
            }
            return submissionError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowToast;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        private final java.lang.String errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowToast) other).errorCode);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowToast copy(java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowToast(errorCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowToast copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowToast showToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.errorCode;
            }
            return showToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$ShowInsufficientFundsError;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowInsufficientFundsError extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowInsufficientFundsError INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowInsufficientFundsError();

        public final int hashCode() {
            return 262470578;
        }

        private ShowInsufficientFundsError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowInsufficientFundsError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.ShowInsufficientFundsError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$CreateGoalSuccess;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect;", "Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalNavResult;", "copy", "(Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalNavResult;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$CreateGoalSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateGoalSuccess extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateGoalSuccess(com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult createGoalNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createGoalNavResult, "");
            this.result = createGoalNavResult;
        }

        public final com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult createGoalNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateGoalSuccess(result=");
            sb.append(createGoalNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.CreateGoalSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.CreateGoalSuccess) other).result);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.CreateGoalSuccess copy(com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.CreateGoalSuccess(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.CreateGoalSuccess copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.CreateGoalSuccess createGoalSuccess, com.paypal.oslo.feature.savings.navigation.result.CreateGoalNavResult createGoalNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createGoalNavResult = createGoalSuccess.result;
            }
            return createGoalSuccess.copy(createGoalNavResult);
        }
    }

    public /* synthetic */ ReviewScreenEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
