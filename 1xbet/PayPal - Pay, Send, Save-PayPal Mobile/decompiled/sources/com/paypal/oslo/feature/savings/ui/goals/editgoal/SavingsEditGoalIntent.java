package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "GoalNameChanged", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_AMOUNT_CHANGED, "BackClicked", "SaveClicked", "UpdateResult", "UpdateError", "DuplicateNameValidationResult", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$BackClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$DuplicateNameValidationResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$GoalNameChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$SaveClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$TargetAmountChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$UpdateError;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$UpdateResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsEditGoalIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsEditGoalIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$GoalNameChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "", "goalName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$GoalNameChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGoalName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalNameChanged extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        private final java.lang.String goalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalNameChanged(java.lang.String str) {
            super("GoalNameChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.goalName = str;
        }

        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.goalName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalNameChanged(goalName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.goalName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalName, ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged) other).goalName);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged copy(java.lang.String goalName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
            return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged(goalName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged copy$default(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged goalNameChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = goalNameChanged.goalName;
            }
            return goalNameChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$TargetAmountChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$TargetAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmountChanged extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TargetAmountChanged(java.lang.String str) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_AMOUNT_CHANGED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetAmountChanged(amount=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged) other).amount);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged copy$default(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged targetAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = targetAmountChanged.amount;
            }
            return targetAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$BackClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.BackClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.BackClicked();

        public final int hashCode() {
            return 1732378453;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$SaveClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveClicked extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked();

        public final int hashCode() {
            return -599847425;
        }

        private SaveClicked() {
            super("SaveClicked", null);
        }

        public final java.lang.String toString() {
            return "SaveClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$UpdateResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;)Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$UpdateResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateResult extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateResult(com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult updateMoneyboxResult) {
            super("UpdateResult", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneyboxResult, "");
            this.result = updateMoneyboxResult;
        }

        public final com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult updateMoneyboxResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateResult(result=");
            sb.append(updateMoneyboxResult);
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult) other).result);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult copy(com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult copy$default(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateResult updateResult, com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult updateMoneyboxResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateMoneyboxResult = updateResult.result;
            }
            return updateResult.copy(updateMoneyboxResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$UpdateError;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "error", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;)Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$UpdateError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateError extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.SavingsError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateError(com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError) {
            super("UpdateError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsError, "");
            this.error = savingsError;
        }

        public final com.paypal.oslo.feature.savings.domain.model.SavingsError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateError(error=");
            sb.append(savingsError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError) other).error);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError copy(com.paypal.oslo.feature.savings.domain.model.SavingsError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.SavingsError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError copy$default(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.UpdateError updateError, com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsError = updateError.error;
            }
            return updateError.copy(savingsError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$DuplicateNameValidationResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "", "isDuplicate", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent$DuplicateNameValidationResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DuplicateNameValidationResult extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent {
        public static final int $stable = 0;
        private final boolean isDuplicate;

        public DuplicateNameValidationResult(boolean z) {
            super("DuplicateNameValidationResult", null);
            this.isDuplicate = z;
        }

        public final boolean isDuplicate() {
            return this.isDuplicate;
        }

        public final java.lang.String toString() {
            boolean z = this.isDuplicate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DuplicateNameValidationResult(isDuplicate=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isDuplicate);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult) && this.isDuplicate == ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult) other).isDuplicate;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult copy(boolean isDuplicate) {
            return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult(isDuplicate);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDuplicate() {
            return this.isDuplicate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult copy$default(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.DuplicateNameValidationResult duplicateNameValidationResult, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = duplicateNameValidationResult.isDuplicate;
            }
            return duplicateNameValidationResult.copy(z);
        }
    }

    public /* synthetic */ SavingsEditGoalIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
