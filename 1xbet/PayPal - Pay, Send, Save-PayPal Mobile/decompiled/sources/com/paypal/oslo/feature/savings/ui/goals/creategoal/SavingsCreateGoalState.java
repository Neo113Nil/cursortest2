package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u0000 92\u00020\u0001:\u00019Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010 Jz\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b\u000b\u0010\u001cR\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001cR\u001a\u0010\r\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b\r\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b6\u0010 R\u001a\u00107\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "goalName", "targetAmount", "", "selectedAmountIndex", "customAmount", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "frequencyState", "", "isReviewEnabled", "showCustomAmountDisplay", "isShowingCustomAmountInput", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "validationError", "targetAmountError", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;ZZZLcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "component6", "()Z", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;ZZZLcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;)Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getGoalName", "getTargetAmount", com.visa.cbp.getEncExpo.warmup, "getSelectedAmountIndex", "getCustomAmount", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "getFrequencyState", "Z", "getShowCustomAmountDisplay", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "getValidationError", "getTargetAmountError", "name", "getName", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsCreateGoalState implements com.paypal.oslo.core.mvi.UiState {
    private final java.lang.String customAmount;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState;
    private final java.lang.String goalName;
    private final boolean isReviewEnabled;
    private final boolean isShowingCustomAmountInput;
    private final java.lang.String name;
    private final int selectedAmountIndex;
    private final boolean showCustomAmountDisplay;
    private final java.lang.String targetAmount;
    private final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError targetAmountError;
    private final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validationError;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState.Companion INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState Initial = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState(null, null, 0, null, null, false, false, false, null, null, 1023, null);

    public SavingsCreateGoalState(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.goalName = str;
        this.targetAmount = str2;
        this.selectedAmountIndex = i;
        this.customAmount = str3;
        this.frequencyState = frequencySelectionState;
        this.isReviewEnabled = z;
        this.showCustomAmountDisplay = z2;
        this.isShowingCustomAmountInput = z3;
        this.validationError = goalValidationError;
        this.targetAmountError = goalValidationError2;
        this.name = "CreateGoalState";
    }

    public /* synthetic */ SavingsCreateGoalState(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : frequencySelectionState, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) == 0 ? z3 : false, (i2 & 256) != 0 ? null : goalValidationError, (i2 & 512) == 0 ? goalValidationError2 : null);
    }

    public final java.lang.String getGoalName() {
        return this.goalName;
    }

    public final java.lang.String getTargetAmount() {
        return this.targetAmount;
    }

    public final int getSelectedAmountIndex() {
        return this.selectedAmountIndex;
    }

    public final java.lang.String getCustomAmount() {
        return this.customAmount;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
        return this.frequencyState;
    }

    public final boolean isReviewEnabled() {
        return this.isReviewEnabled;
    }

    public final boolean getShowCustomAmountDisplay() {
        return this.showCustomAmountDisplay;
    }

    public final boolean isShowingCustomAmountInput() {
        return this.isShowingCustomAmountInput;
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError getValidationError() {
        return this.validationError;
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError getTargetAmountError() {
        return this.targetAmountError;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;", "Initial", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;", "getInitial", "()Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState getInitial() {
            return com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState.Initial;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.goalName;
        java.lang.String str2 = this.targetAmount;
        int i = this.selectedAmountIndex;
        java.lang.String str3 = this.customAmount;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
        boolean z = this.isReviewEnabled;
        boolean z2 = this.showCustomAmountDisplay;
        boolean z3 = this.isShowingCustomAmountInput;
        com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError = this.validationError;
        com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError2 = this.targetAmountError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsCreateGoalState(goalName=");
        sb.append(str);
        sb.append(", targetAmount=");
        sb.append(str2);
        sb.append(", selectedAmountIndex=");
        sb.append(i);
        sb.append(", customAmount=");
        sb.append(str3);
        sb.append(", frequencyState=");
        sb.append(frequencySelectionState);
        sb.append(", isReviewEnabled=");
        sb.append(z);
        sb.append(", showCustomAmountDisplay=");
        sb.append(z2);
        sb.append(", isShowingCustomAmountInput=");
        sb.append(z3);
        sb.append(", validationError=");
        sb.append(goalValidationError);
        sb.append(", targetAmountError=");
        sb.append(goalValidationError2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.goalName.hashCode();
        int hashCode2 = this.targetAmount.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.selectedAmountIndex);
        int hashCode4 = this.customAmount.hashCode();
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
        int hashCode5 = frequencySelectionState == null ? 0 : frequencySelectionState.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isReviewEnabled);
        int hashCode7 = java.lang.Boolean.hashCode(this.showCustomAmountDisplay);
        int hashCode8 = java.lang.Boolean.hashCode(this.isShowingCustomAmountInput);
        com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError = this.validationError;
        int hashCode9 = goalValidationError == null ? 0 : goalValidationError.hashCode();
        com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError2 = this.targetAmountError;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (goalValidationError2 != null ? goalValidationError2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState)) {
            return false;
        }
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState savingsCreateGoalState = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.goalName, savingsCreateGoalState.goalName) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, savingsCreateGoalState.targetAmount) && this.selectedAmountIndex == savingsCreateGoalState.selectedAmountIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, savingsCreateGoalState.customAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyState, savingsCreateGoalState.frequencyState) && this.isReviewEnabled == savingsCreateGoalState.isReviewEnabled && this.showCustomAmountDisplay == savingsCreateGoalState.showCustomAmountDisplay && this.isShowingCustomAmountInput == savingsCreateGoalState.isShowingCustomAmountInput && kotlin.jvm.internal.Intrinsics.areEqual(this.validationError, savingsCreateGoalState.validationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmountError, savingsCreateGoalState.targetAmountError);
    }

    public final com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState copy(java.lang.String goalName, java.lang.String targetAmount, int selectedAmountIndex, java.lang.String customAmount, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState, boolean isReviewEnabled, boolean showCustomAmountDisplay, boolean isShowingCustomAmountInput, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validationError, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError targetAmountError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState(goalName, targetAmount, selectedAmountIndex, customAmount, frequencyState, isReviewEnabled, showCustomAmountDisplay, isShowingCustomAmountInput, validationError, targetAmountError);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError getValidationError() {
        return this.validationError;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsShowingCustomAmountInput() {
        return this.isShowingCustomAmountInput;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowCustomAmountDisplay() {
        return this.showCustomAmountDisplay;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsReviewEnabled() {
        return this.isReviewEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
        return this.frequencyState;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCustomAmount() {
        return this.customAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectedAmountIndex() {
        return this.selectedAmountIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTargetAmount() {
        return this.targetAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError getTargetAmountError() {
        return this.targetAmountError;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getGoalName() {
        return this.goalName;
    }

    public SavingsCreateGoalState() {
        this(null, null, 0, null, null, false, false, false, null, null, 1023, null);
    }
}
