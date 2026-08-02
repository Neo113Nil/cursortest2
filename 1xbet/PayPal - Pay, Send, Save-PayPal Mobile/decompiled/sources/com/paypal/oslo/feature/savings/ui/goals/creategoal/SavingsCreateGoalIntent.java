package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "GoalNameChanged", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_TARGET_AMOUNT_CHANGED, "AmountSelected", "CustomAmountChanged", "FrequencySelected", "BackClicked", "ReviewClicked", "FrequencyCardClicked", "OtherAmountClicked", "CustomAmountSave", "CustomAmountCancel", "CustomAmountDisplayClicked", "DuplicateNameValidationResult", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$AmountSelected;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$BackClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountCancel;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountDisplayClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountSave;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$DuplicateNameValidationResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$FrequencyCardClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$FrequencySelected;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$GoalNameChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$OtherAmountClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$ReviewClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$TargetAmountChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsCreateGoalIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsCreateGoalIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$GoalNameChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "", "goalName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$GoalNameChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGoalName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalNameChanged extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalName, ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged) other).goalName);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged copy(java.lang.String goalName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged(goalName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGoalName() {
            return this.goalName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.GoalNameChanged goalNameChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = goalNameChanged.goalName;
            }
            return goalNameChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$TargetAmountChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$TargetAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmountChanged extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged) other).amount);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.TargetAmountChanged targetAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = targetAmountChanged.amount;
            }
            return targetAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$AmountSelected;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$AmountSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountSelected extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        private final int index;

        public AmountSelected(int i) {
            super("AmountSelected", null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountSelected(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.index);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected) && this.index == ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected) other).index;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected copy(int index) {
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected(index);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.AmountSelected amountSelected, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = amountSelected.index;
            }
            return amountSelected.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountChanged;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomAmountChanged extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAmountChanged(java.lang.String str) {
            super("CustomAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomAmountChanged(amount=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged) other).amount);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountChanged customAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customAmountChanged.amount;
            }
            return customAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$FrequencySelected;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "frequencyState", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$FrequencySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "getFrequencyState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FrequencySelected extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrequencySelected(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
            super("FrequencySelected", null);
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyState, ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected) other).frequencyState);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected copy(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyState, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected(frequencyState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencySelected frequencySelected, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                frequencySelectionState = frequencySelected.frequencyState;
            }
            return frequencySelected.copy(frequencySelectionState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$BackClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.BackClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.BackClicked();

        public final int hashCode() {
            return -252510535;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$ReviewClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReviewClicked extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.ReviewClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.ReviewClicked();

        public final int hashCode() {
            return 140583144;
        }

        private ReviewClicked() {
            super("ReviewClicked", null);
        }

        public final java.lang.String toString() {
            return "ReviewClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.ReviewClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$FrequencyCardClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FrequencyCardClicked extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencyCardClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencyCardClicked();

        public final int hashCode() {
            return 382977698;
        }

        private FrequencyCardClicked() {
            super("FrequencyCardClicked", null);
        }

        public final java.lang.String toString() {
            return "FrequencyCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.FrequencyCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$OtherAmountClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtherAmountClicked extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.OtherAmountClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.OtherAmountClicked();

        public final int hashCode() {
            return -1831426074;
        }

        private OtherAmountClicked() {
            super("OtherAmountClicked", null);
        }

        public final java.lang.String toString() {
            return "OtherAmountClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.OtherAmountClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountSave;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountSave;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomAmountSave extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAmountSave(java.lang.String str) {
            super("CustomAmountSave", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomAmountSave(amount=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave) other).amount);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountSave customAmountSave, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customAmountSave.amount;
            }
            return customAmountSave.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountCancel;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomAmountCancel extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountCancel INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountCancel();

        public final int hashCode() {
            return 1022476138;
        }

        private CustomAmountCancel() {
            super("CustomAmountCancel", null);
        }

        public final java.lang.String toString() {
            return "CustomAmountCancel";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountCancel)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$CustomAmountDisplayClicked;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomAmountDisplayClicked extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountDisplayClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountDisplayClicked();

        public final int hashCode() {
            return 975614453;
        }

        private CustomAmountDisplayClicked() {
            super("CustomAmountDisplayClicked", null);
        }

        public final java.lang.String toString() {
            return "CustomAmountDisplayClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.CustomAmountDisplayClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$DuplicateNameValidationResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;", "", "isDuplicate", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent$DuplicateNameValidationResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DuplicateNameValidationResult extends com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent {
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult) && this.isDuplicate == ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult) other).isDuplicate;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult copy(boolean isDuplicate) {
            return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult(isDuplicate);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDuplicate() {
            return this.isDuplicate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult copy$default(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent.DuplicateNameValidationResult duplicateNameValidationResult, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = duplicateNameValidationResult.isDuplicate;
            }
            return duplicateNameValidationResult.copy(z);
        }
    }

    public /* synthetic */ SavingsCreateGoalIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
