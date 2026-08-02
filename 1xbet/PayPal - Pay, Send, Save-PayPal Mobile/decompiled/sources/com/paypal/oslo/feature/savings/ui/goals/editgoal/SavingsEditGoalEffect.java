package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "GoalUpdated", "ShowNetworkErrorScreen", "ShowServiceUnavailableScreen", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$GoalUpdated;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$ShowNetworkErrorScreen;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$ShowServiceUnavailableScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsEditGoalEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsEditGoalEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.NavigateBack();

        public final int hashCode() {
            return -1646234194;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$GoalUpdated;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "", "goalName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$GoalUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGoalName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalUpdated extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect {
        public static final int $stable = 0;
        private final java.lang.String goalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalUpdated(java.lang.String str) {
            super("GoalUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.goalName = str;
        }

        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.goalName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalUpdated(goalName=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalName, ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated) other).goalName);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated copy(java.lang.String goalName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
            return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated(goalName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated copy$default(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated goalUpdated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = goalUpdated.goalName;
            }
            return goalUpdated.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$ShowNetworkErrorScreen;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowNetworkErrorScreen extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowNetworkErrorScreen INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowNetworkErrorScreen();

        public final int hashCode() {
            return 1836399513;
        }

        private ShowNetworkErrorScreen() {
            super("ShowNetworkErrorScreen", null);
        }

        public final java.lang.String toString() {
            return "ShowNetworkErrorScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowNetworkErrorScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect$ShowServiceUnavailableScreen;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowServiceUnavailableScreen extends com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen();

        public final int hashCode() {
            return -1941657990;
        }

        private ShowServiceUnavailableScreen() {
            super("ShowServiceUnavailableScreen", null);
        }

        public final java.lang.String toString() {
            return "ShowServiceUnavailableScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsEditGoalEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
