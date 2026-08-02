package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon;", "", "<init>", "()V", "MoneyManagementAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyManagementCommon {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon();

    private MoneyManagementCommon() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction;", "", "<init>", "()V", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "GoalSelected", "AmountEntered", "Submit", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$AmountEntered;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$Cancel;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$GoalSelected;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$Submit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class MoneyManagementAction {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$Cancel;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Cancel extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Cancel INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Cancel();

            public final int hashCode() {
                return 1489496184;
            }

            private Cancel() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Cancel)) {
                    return false;
                }
                return true;
            }
        }

        private MoneyManagementAction() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$GoalSelected;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goalSummary", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$GoalSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoalSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GoalSelected extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummary;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoalSelected(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
                this.goalSummary = goalSummaryDTO;
            }

            public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoalSummary() {
                return this.goalSummary;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goalSummary;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalSelected(goalSummary=");
                sb.append(goalSummaryDTO);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.goalSummary.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.GoalSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalSummary, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.GoalSelected) other).goalSummary);
            }

            public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.GoalSelected copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummary) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummary, "");
                return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.GoalSelected(goalSummary);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoalSummary() {
                return this.goalSummary;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.GoalSelected copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.GoalSelected goalSelected, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    goalSummaryDTO = goalSelected.goalSummary;
                }
                return goalSelected.copy(goalSummaryDTO);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$AmountEntered;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$AmountEntered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AmountEntered extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction {
            public static final int $stable = 0;
            private final java.lang.String amount;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AmountEntered(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.amount = str;
            }

            public final java.lang.String getAmount() {
                return this.amount;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.amount;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountEntered(amount=");
                sb.append(str);
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
                return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.AmountEntered) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.AmountEntered) other).amount);
            }

            public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.AmountEntered copy(java.lang.String amount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
                return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.AmountEntered(amount);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAmount() {
                return this.amount;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.AmountEntered copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.AmountEntered amountEntered, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = amountEntered.amount;
                }
                return amountEntered.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$Submit;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction;", "", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementCommon$MoneyManagementAction$Submit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Submit extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction {
            public static final int $stable = 0;
            private final java.lang.String amount;
            private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
                this.amount = str;
                this.goal = goalSummaryDTO;
            }

            public final java.lang.String getAmount() {
                return this.amount;
            }

            public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
                return this.goal;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.amount;
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Submit(amount=");
                sb.append(str);
                sb.append(", goal=");
                sb.append(goalSummaryDTO);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.amount.hashCode() * 31) + this.goal.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit)) {
                    return false;
                }
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit submit = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, submit.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, submit.goal);
            }

            public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit copy(java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
                return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit(amount, goal);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
                return this.goal;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAmount() {
                return this.amount;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommon.MoneyManagementAction.Submit submit, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = submit.amount;
                }
                if ((i & 2) != 0) {
                    goalSummaryDTO = submit.goal;
                }
                return submit.copy(str, goalSummaryDTO);
            }
        }

        public /* synthetic */ MoneyManagementAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
