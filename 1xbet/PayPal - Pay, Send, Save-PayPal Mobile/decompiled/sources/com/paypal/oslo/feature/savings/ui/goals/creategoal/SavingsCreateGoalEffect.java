package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToReview", "GoalCreated", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$GoalCreated;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$NavigateToReview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsCreateGoalEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsCreateGoalEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateBack();

        public final int hashCode() {
            return 1246716618;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;", "", "goalName", "targetAmount", "", "addAmount", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "frequencyState", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "copy", "(Ljava/lang/String;Ljava/lang/String;DLcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$NavigateToReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGoalName", "getTargetAmount", "D", "getAddAmount", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "getFrequencyState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReview extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect {
        public static final int $stable = 8;
        private final double addAmount;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState;
        private final java.lang.String goalName;
        private final java.lang.String targetAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReview(java.lang.String str, java.lang.String str2, double d, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
            super("NavigateToReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.goalName = str;
            this.targetAmount = str2;
            this.addAmount = d;
            this.frequencyState = frequencySelectionState;
        }

        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public final java.lang.String getTargetAmount() {
            return this.targetAmount;
        }

        public final double getAddAmount() {
            return this.addAmount;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.goalName;
            java.lang.String str2 = this.targetAmount;
            double d = this.addAmount;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReview(goalName=");
            sb.append(str);
            sb.append(", targetAmount=");
            sb.append(str2);
            sb.append(", addAmount=");
            sb.append(d);
            sb.append(", frequencyState=");
            sb.append(frequencySelectionState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.goalName.hashCode();
            int hashCode2 = this.targetAmount.hashCode();
            int hashCode3 = java.lang.Double.hashCode(this.addAmount);
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (frequencySelectionState == null ? 0 : frequencySelectionState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview navigateToReview = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.goalName, navigateToReview.goalName) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, navigateToReview.targetAmount) && java.lang.Double.compare(this.addAmount, navigateToReview.addAmount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyState, navigateToReview.frequencyState);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview copy(java.lang.String goalName, java.lang.String targetAmount, double addAmount, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview(goalName, targetAmount, addAmount, frequencyState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAddAmount() {
            return this.addAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTargetAmount() {
            return this.targetAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview navigateToReview, java.lang.String str, java.lang.String str2, double d, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReview.goalName;
            }
            if ((i & 2) != 0) {
                str2 = navigateToReview.targetAmount;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                d = navigateToReview.addAmount;
            }
            double d2 = d;
            if ((i & 8) != 0) {
                frequencySelectionState = navigateToReview.frequencyState;
            }
            return navigateToReview.copy(str, str3, d2, frequencySelectionState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$GoalCreated;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;", "", "goalName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect$GoalCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGoalName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalCreated extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect {
        public static final int $stable = 0;
        private final java.lang.String goalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalCreated(java.lang.String str) {
            super("GoalCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.goalName = str;
        }

        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.goalName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalCreated(goalName=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalName, ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated) other).goalName);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated copy(java.lang.String goalName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated(goalName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated goalCreated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = goalCreated.goalName;
            }
            return goalCreated.copy(str);
        }
    }

    public /* synthetic */ SavingsCreateGoalEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
