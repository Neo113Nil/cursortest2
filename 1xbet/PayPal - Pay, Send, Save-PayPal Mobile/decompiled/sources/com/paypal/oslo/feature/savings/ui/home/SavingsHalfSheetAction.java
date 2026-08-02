package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "", "<init>", "()V", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "AddMoney", "AddMoneyGeneralSavings", "TransferMoney", "AddMoneyGoalSelected", "TransferMoneyGoalSelected", "AddMoneySubmit", "TransferMoneySubmit", "BackToAmountInput", "FrequencySelected", "FiSelected", com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CONFIRMED, "TaxStatementTermsClick", "FdicAgreementClick", "ApyInfoLinkClick", "GoalSuccessAction", "DeleteGoalErrorRetry", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneyGeneralSavings;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneyGoalSelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneySubmit;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$ApyInfoLinkClick;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$BackToAmountInput;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$DeleteGoalErrorRetry;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$Dismiss;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FdicAgreementClick;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FiSelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FrequencySelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$GoalSuccessAction;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TaxStatementDeliveryPreferenceConfirmed;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TaxStatementTermsClick;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoneyGoalSelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoneySubmit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsHalfSheetAction {
    public static final int $stable = 0;

    private SavingsHalfSheetAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$Dismiss;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.Dismiss INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.Dismiss();

        public final int hashCode() {
            return 1391277504;
        }

        private Dismiss() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.Dismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddMoney extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoney INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoney();

        public final int hashCode() {
            return -1354901463;
        }

        private AddMoney() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AddMoney";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoney)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneyGeneralSavings;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddMoneyGeneralSavings extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGeneralSavings INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGeneralSavings();

        public final int hashCode() {
            return -1383542982;
        }

        private AddMoneyGeneralSavings() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AddMoneyGeneralSavings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGeneralSavings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferMoney extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoney INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoney();

        public final int hashCode() {
            return 341931595;
        }

        private TransferMoney() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TransferMoney";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoney)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneyGoalSelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneyGoalSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddMoneyGoalSelected extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoneyGoalSelected(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddMoneyGoalSelected(goal=");
            sb.append(goalSummaryDTO);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.goal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGoalSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGoalSelected) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGoalSelected copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGoalSelected(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGoalSelected copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneyGoalSelected addMoneyGoalSelected, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = addMoneyGoalSelected.goal;
            }
            return addMoneyGoalSelected.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoneyGoalSelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoneyGoalSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferMoneyGoalSelected extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferMoneyGoalSelected(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferMoneyGoalSelected(goal=");
            sb.append(goalSummaryDTO);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.goal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneyGoalSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneyGoalSelected) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneyGoalSelected copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneyGoalSelected(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneyGoalSelected copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneyGoalSelected transferMoneyGoalSelected, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = transferMoneyGoalSelected.goal;
            }
            return transferMoneyGoalSelected.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneySubmit;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "", "amount", "goalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$AddMoneySubmit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getGoalId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddMoneySubmit extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String goalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoneySubmit(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amount = str;
            this.goalId = str2;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getGoalId() {
            return this.goalId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.goalId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddMoneySubmit(amount=");
            sb.append(str);
            sb.append(", goalId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amount.hashCode() * 31) + this.goalId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit addMoneySubmit = (com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, addMoneySubmit.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalId, addMoneySubmit.goalId);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit copy(java.lang.String amount, java.lang.String goalId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalId, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit(amount, goalId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGoalId() {
            return this.goalId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.AddMoneySubmit addMoneySubmit, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addMoneySubmit.amount;
            }
            if ((i & 2) != 0) {
                str2 = addMoneySubmit.goalId;
            }
            return addMoneySubmit.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoneySubmit;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "", "amount", "goalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TransferMoneySubmit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getGoalId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferMoneySubmit extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String goalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferMoneySubmit(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amount = str;
            this.goalId = str2;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getGoalId() {
            return this.goalId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.goalId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferMoneySubmit(amount=");
            sb.append(str);
            sb.append(", goalId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amount.hashCode() * 31) + this.goalId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit transferMoneySubmit = (com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transferMoneySubmit.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalId, transferMoneySubmit.goalId);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit copy(java.lang.String amount, java.lang.String goalId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalId, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit(amount, goalId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGoalId() {
            return this.goalId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TransferMoneySubmit transferMoneySubmit, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transferMoneySubmit.amount;
            }
            if ((i & 2) != 0) {
                str2 = transferMoneySubmit.goalId;
            }
            return transferMoneySubmit.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$BackToAmountInput;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackToAmountInput extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.BackToAmountInput INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.BackToAmountInput();

        public final int hashCode() {
            return -878579994;
        }

        private BackToAmountInput() {
            super(null);
        }

        public final java.lang.String toString() {
            return "BackToAmountInput";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.BackToAmountInput)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FrequencySelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "frequencyState", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FrequencySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "getFrequencyState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FrequencySelected extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrequencySelected(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencySelectionState, "");
            this.frequencyState = frequencySelectionState;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FrequencySelected(frequencyState=");
            sb.append(frequencySelectionState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.frequencyState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyState, ((com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected) other).frequencyState);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected copy(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyState, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected(frequencyState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected frequencySelected, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                frequencySelectionState = frequencySelected.frequencyState;
            }
            return frequencySelected.copy(frequencySelectionState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FiSelected;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "fi", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FiSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "getFi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiSelected extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO fi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FiSelected(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyMovementFiDTO, "");
            this.fi = moneyMovementFiDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getFi() {
            return this.fi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.fi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiSelected(fi=");
            sb.append(moneyMovementFiDTO);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FiSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.fi, ((com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FiSelected) other).fi);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FiSelected copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO fi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fi, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FiSelected(fi);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getFi() {
            return this.fi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FiSelected copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FiSelected fiSelected, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyMovementFiDTO = fiSelected.fi;
            }
            return fiSelected.copy(moneyMovementFiDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TaxStatementDeliveryPreferenceConfirmed;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "", "selectedDigital", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TaxStatementDeliveryPreferenceConfirmed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSelectedDigital"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxStatementDeliveryPreferenceConfirmed extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        private final boolean selectedDigital;

        public TaxStatementDeliveryPreferenceConfirmed(boolean z) {
            super(null);
            this.selectedDigital = z;
        }

        public final boolean getSelectedDigital() {
            return this.selectedDigital;
        }

        public final java.lang.String toString() {
            boolean z = this.selectedDigital;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxStatementDeliveryPreferenceConfirmed(selectedDigital=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.selectedDigital);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementDeliveryPreferenceConfirmed) && this.selectedDigital == ((com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementDeliveryPreferenceConfirmed) other).selectedDigital;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementDeliveryPreferenceConfirmed copy(boolean selectedDigital) {
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementDeliveryPreferenceConfirmed(selectedDigital);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSelectedDigital() {
            return this.selectedDigital;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementDeliveryPreferenceConfirmed copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementDeliveryPreferenceConfirmed taxStatementDeliveryPreferenceConfirmed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taxStatementDeliveryPreferenceConfirmed.selectedDigital;
            }
            return taxStatementDeliveryPreferenceConfirmed.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$TaxStatementTermsClick;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxStatementTermsClick extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementTermsClick INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementTermsClick();

        public final int hashCode() {
            return 977957743;
        }

        private TaxStatementTermsClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TaxStatementTermsClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.TaxStatementTermsClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$FdicAgreementClick;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FdicAgreementClick extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FdicAgreementClick INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FdicAgreementClick();

        public final int hashCode() {
            return -143889120;
        }

        private FdicAgreementClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "FdicAgreementClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FdicAgreementClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$ApyInfoLinkClick;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApyInfoLinkClick extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.ApyInfoLinkClick INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.ApyInfoLinkClick();

        public final int hashCode() {
            return 2131489824;
        }

        private ApyInfoLinkClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ApyInfoLinkClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.ApyInfoLinkClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$GoalSuccessAction;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;", "action", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component2", "()Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$GoalSuccessAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalSuccessAction extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType action;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalSuccessAction(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSuccessActionType, "");
            this.goal = goalSummaryDTO;
            this.action = goalSuccessActionType;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalSuccessAction(goal=");
            sb.append(goalSummaryDTO);
            sb.append(", action=");
            sb.append(goalSuccessActionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.goal.hashCode() * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction goalSuccessAction = (com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.goal, goalSuccessAction.goal) && this.action == goalSuccessAction.action;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction(goal, action);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType getAction() {
            return this.action;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.GoalSuccessAction goalSuccessAction, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = goalSuccessAction.goal;
            }
            if ((i & 2) != 0) {
                goalSuccessActionType = goalSuccessAction.action;
            }
            return goalSuccessAction.copy(goalSummaryDTO, goalSuccessActionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction$DeleteGoalErrorRetry;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalErrorRetry extends com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.DeleteGoalErrorRetry INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.DeleteGoalErrorRetry();

        public final int hashCode() {
            return -1112689656;
        }

        private DeleteGoalErrorRetry() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DeleteGoalErrorRetry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.DeleteGoalErrorRetry)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsHalfSheetAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
