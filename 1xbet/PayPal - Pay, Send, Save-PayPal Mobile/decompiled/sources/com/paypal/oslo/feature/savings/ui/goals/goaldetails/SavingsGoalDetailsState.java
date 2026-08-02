package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Error;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsGoalDetailsState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private SavingsGoalDetailsState() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00198\u0017X\u0097D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "initialGoal", "", "isAddMoneyFeatureAvailable", "isTransferMoneyFeatureAvailable", "isSmartRouteEntryPointVisible", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;ZZZ)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component2", "()Z", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;ZZZ)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getInitialGoal", "Z", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO initialGoal;
        private final boolean isAddMoneyFeatureAvailable;
        private final boolean isSmartRouteEntryPointVisible;
        private final boolean isTransferMoneyFeatureAvailable;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, boolean z2, boolean z3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.initialGoal = goalSummaryDTO;
            this.isAddMoneyFeatureAvailable = z;
            this.isTransferMoneyFeatureAvailable = z2;
            this.isSmartRouteEntryPointVisible = z3;
            this.name = "SavingsGoalDetailsState.Loading";
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(goalSummaryDTO, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getInitialGoal() {
            return this.initialGoal;
        }

        public final boolean isAddMoneyFeatureAvailable() {
            return this.isAddMoneyFeatureAvailable;
        }

        public final boolean isTransferMoneyFeatureAvailable() {
            return this.isTransferMoneyFeatureAvailable;
        }

        public final boolean isSmartRouteEntryPointVisible() {
            return this.isSmartRouteEntryPointVisible;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.initialGoal;
            boolean z = this.isAddMoneyFeatureAvailable;
            boolean z2 = this.isTransferMoneyFeatureAvailable;
            boolean z3 = this.isSmartRouteEntryPointVisible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(initialGoal=");
            sb.append(goalSummaryDTO);
            sb.append(", isAddMoneyFeatureAvailable=");
            sb.append(z);
            sb.append(", isTransferMoneyFeatureAvailable=");
            sb.append(z2);
            sb.append(", isSmartRouteEntryPointVisible=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.initialGoal.hashCode() * 31) + java.lang.Boolean.hashCode(this.isAddMoneyFeatureAvailable)) * 31) + java.lang.Boolean.hashCode(this.isTransferMoneyFeatureAvailable)) * 31) + java.lang.Boolean.hashCode(this.isSmartRouteEntryPointVisible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading loading = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.initialGoal, loading.initialGoal) && this.isAddMoneyFeatureAvailable == loading.isAddMoneyFeatureAvailable && this.isTransferMoneyFeatureAvailable == loading.isTransferMoneyFeatureAvailable && this.isSmartRouteEntryPointVisible == loading.isSmartRouteEntryPointVisible;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO initialGoal, boolean isAddMoneyFeatureAvailable, boolean isTransferMoneyFeatureAvailable, boolean isSmartRouteEntryPointVisible) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialGoal, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading(initialGoal, isAddMoneyFeatureAvailable, isTransferMoneyFeatureAvailable, isSmartRouteEntryPointVisible);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSmartRouteEntryPointVisible() {
            return this.isSmartRouteEntryPointVisible;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsTransferMoneyFeatureAvailable() {
            return this.isTransferMoneyFeatureAvailable;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAddMoneyFeatureAvailable() {
            return this.isAddMoneyFeatureAvailable;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getInitialGoal() {
            return this.initialGoal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading loading, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = loading.initialGoal;
            }
            if ((i & 2) != 0) {
                z = loading.isAddMoneyFeatureAvailable;
            }
            if ((i & 4) != 0) {
                z2 = loading.isTransferMoneyFeatureAvailable;
            }
            if ((i & 8) != 0) {
                z3 = loading.isSmartRouteEntryPointVisible;
            }
            return loading.copy(goalSummaryDTO, z, z2, z3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\u001dJ®\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b9\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b\u0005\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b\u0006\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b\u0007\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010\"R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b\u000b\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010%R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010)R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b\u0012\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bF\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010-R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b\u0016\u0010\u001dR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010I\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Success;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "", "isAddMoneyFeatureAvailable", "isTransferMoneyFeatureAvailable", "isRefreshing", "showDeleteDialog", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "deleteDialogType", "isDeleting", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;", "transferReviewSheetRequest", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", "transferReviewContentType", "", "transferAmount", "isTransferPending", "showDeleteErrorSheet", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "deleteErrorType", "isActivityRefreshRequired", "isSmartRouteEntryPointVisible", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;ZZZZLcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;ZLcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;Ljava/lang/String;ZZLcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component2", "()Z", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "component7", "component8", "()Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;", "component9", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", "component10", "()Ljava/lang/String;", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "component14", "component15", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;ZZZZLcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;ZLcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;Ljava/lang/String;ZZLcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;ZZ)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Z", "getShowDeleteDialog", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "getDeleteDialogType", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/TransferReviewSheetRequest;", "getTransferReviewSheetRequest", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", "getTransferReviewContentType", "Ljava/lang/String;", "getTransferAmount", "getShowDeleteErrorSheet", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "getDeleteErrorType", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType;
        private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteErrorType;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final boolean isActivityRefreshRequired;
        private final boolean isAddMoneyFeatureAvailable;
        private final boolean isDeleting;
        private final boolean isRefreshing;
        private final boolean isSmartRouteEntryPointVisible;
        private final boolean isTransferMoneyFeatureAvailable;
        private final boolean isTransferPending;
        private final java.lang.String name;
        private final boolean showDeleteDialog;
        private final boolean showDeleteErrorSheet;
        private final java.lang.String transferAmount;
        private final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType transferReviewContentType;
        private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, boolean z2, boolean z3, boolean z4, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType, boolean z5, com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType, java.lang.String str, boolean z6, boolean z7, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType, boolean z8, boolean z9) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewContentType, "");
            this.goal = goalSummaryDTO;
            this.isAddMoneyFeatureAvailable = z;
            this.isTransferMoneyFeatureAvailable = z2;
            this.isRefreshing = z3;
            this.showDeleteDialog = z4;
            this.deleteDialogType = deleteDialogType;
            this.isDeleting = z5;
            this.transferReviewSheetRequest = transferReviewSheetRequest;
            this.transferReviewContentType = reviewContentType;
            this.transferAmount = str;
            this.isTransferPending = z6;
            this.showDeleteErrorSheet = z7;
            this.deleteErrorType = deleteGoalErrorType;
            this.isActivityRefreshRequired = z8;
            this.isSmartRouteEntryPointVisible = z9;
            this.name = "SavingsGoalDetailsState.Success";
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final boolean isAddMoneyFeatureAvailable() {
            return this.isAddMoneyFeatureAvailable;
        }

        public final boolean isTransferMoneyFeatureAvailable() {
            return this.isTransferMoneyFeatureAvailable;
        }

        public final boolean isRefreshing() {
            return this.isRefreshing;
        }

        public final boolean getShowDeleteDialog() {
            return this.showDeleteDialog;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType getDeleteDialogType() {
            return this.deleteDialogType;
        }

        public final boolean isDeleting() {
            return this.isDeleting;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest getTransferReviewSheetRequest() {
            return this.transferReviewSheetRequest;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, boolean z2, boolean z3, boolean z4, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType, boolean z5, com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType, java.lang.String str, boolean z6, boolean z7, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType, boolean z8, boolean z9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(goalSummaryDTO, z, z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? null : deleteDialogType, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? null : transferReviewSheetRequest, (i & 256) != 0 ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType.REVIEW : reviewContentType, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? false : z7, (i & 4096) != 0 ? null : deleteGoalErrorType, (i & 8192) != 0 ? false : z8, (i & 16384) != 0 ? false : z9);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType getTransferReviewContentType() {
            return this.transferReviewContentType;
        }

        public final java.lang.String getTransferAmount() {
            return this.transferAmount;
        }

        public final boolean isTransferPending() {
            return this.isTransferPending;
        }

        public final boolean getShowDeleteErrorSheet() {
            return this.showDeleteErrorSheet;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType getDeleteErrorType() {
            return this.deleteErrorType;
        }

        public final boolean isActivityRefreshRequired() {
            return this.isActivityRefreshRequired;
        }

        public final boolean isSmartRouteEntryPointVisible() {
            return this.isSmartRouteEntryPointVisible;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            boolean z = this.isAddMoneyFeatureAvailable;
            boolean z2 = this.isTransferMoneyFeatureAvailable;
            boolean z3 = this.isRefreshing;
            boolean z4 = this.showDeleteDialog;
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType = this.deleteDialogType;
            boolean z5 = this.isDeleting;
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest = this.transferReviewSheetRequest;
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType = this.transferReviewContentType;
            java.lang.String str = this.transferAmount;
            boolean z6 = this.isTransferPending;
            boolean z7 = this.showDeleteErrorSheet;
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType = this.deleteErrorType;
            boolean z8 = this.isActivityRefreshRequired;
            boolean z9 = this.isSmartRouteEntryPointVisible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(goal=");
            sb.append(goalSummaryDTO);
            sb.append(", isAddMoneyFeatureAvailable=");
            sb.append(z);
            sb.append(", isTransferMoneyFeatureAvailable=");
            sb.append(z2);
            sb.append(", isRefreshing=");
            sb.append(z3);
            sb.append(", showDeleteDialog=");
            sb.append(z4);
            sb.append(", deleteDialogType=");
            sb.append(deleteDialogType);
            sb.append(", isDeleting=");
            sb.append(z5);
            sb.append(", transferReviewSheetRequest=");
            sb.append(transferReviewSheetRequest);
            sb.append(", transferReviewContentType=");
            sb.append(reviewContentType);
            sb.append(", transferAmount=");
            sb.append(str);
            sb.append(", isTransferPending=");
            sb.append(z6);
            sb.append(", showDeleteErrorSheet=");
            sb.append(z7);
            sb.append(", deleteErrorType=");
            sb.append(deleteGoalErrorType);
            sb.append(", isActivityRefreshRequired=");
            sb.append(z8);
            sb.append(", isSmartRouteEntryPointVisible=");
            sb.append(z9);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.goal.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isAddMoneyFeatureAvailable);
            int hashCode3 = java.lang.Boolean.hashCode(this.isTransferMoneyFeatureAvailable);
            int hashCode4 = java.lang.Boolean.hashCode(this.isRefreshing);
            int hashCode5 = java.lang.Boolean.hashCode(this.showDeleteDialog);
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType = this.deleteDialogType;
            int hashCode6 = deleteDialogType == null ? 0 : deleteDialogType.hashCode();
            int hashCode7 = java.lang.Boolean.hashCode(this.isDeleting);
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest = this.transferReviewSheetRequest;
            int hashCode8 = transferReviewSheetRequest == null ? 0 : transferReviewSheetRequest.hashCode();
            int hashCode9 = this.transferReviewContentType.hashCode();
            java.lang.String str = this.transferAmount;
            int hashCode10 = str == null ? 0 : str.hashCode();
            int hashCode11 = java.lang.Boolean.hashCode(this.isTransferPending);
            int hashCode12 = java.lang.Boolean.hashCode(this.showDeleteErrorSheet);
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType = this.deleteErrorType;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (deleteGoalErrorType != null ? deleteGoalErrorType.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isActivityRefreshRequired)) * 31) + java.lang.Boolean.hashCode(this.isSmartRouteEntryPointVisible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success success = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.goal, success.goal) && this.isAddMoneyFeatureAvailable == success.isAddMoneyFeatureAvailable && this.isTransferMoneyFeatureAvailable == success.isTransferMoneyFeatureAvailable && this.isRefreshing == success.isRefreshing && this.showDeleteDialog == success.showDeleteDialog && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteDialogType, success.deleteDialogType) && this.isDeleting == success.isDeleting && kotlin.jvm.internal.Intrinsics.areEqual(this.transferReviewSheetRequest, success.transferReviewSheetRequest) && this.transferReviewContentType == success.transferReviewContentType && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAmount, success.transferAmount) && this.isTransferPending == success.isTransferPending && this.showDeleteErrorSheet == success.showDeleteErrorSheet && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteErrorType, success.deleteErrorType) && this.isActivityRefreshRequired == success.isActivityRefreshRequired && this.isSmartRouteEntryPointVisible == success.isSmartRouteEntryPointVisible;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, boolean isAddMoneyFeatureAvailable, boolean isTransferMoneyFeatureAvailable, boolean isRefreshing, boolean showDeleteDialog, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType, boolean isDeleting, com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType transferReviewContentType, java.lang.String transferAmount, boolean isTransferPending, boolean showDeleteErrorSheet, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteErrorType, boolean isActivityRefreshRequired, boolean isSmartRouteEntryPointVisible) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferReviewContentType, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success(goal, isAddMoneyFeatureAvailable, isTransferMoneyFeatureAvailable, isRefreshing, showDeleteDialog, deleteDialogType, isDeleting, transferReviewSheetRequest, transferReviewContentType, transferAmount, isTransferPending, showDeleteErrorSheet, deleteErrorType, isActivityRefreshRequired, isSmartRouteEntryPointVisible);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType getTransferReviewContentType() {
            return this.transferReviewContentType;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest getTransferReviewSheetRequest() {
            return this.transferReviewSheetRequest;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsDeleting() {
            return this.isDeleting;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType getDeleteDialogType() {
            return this.deleteDialogType;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowDeleteDialog() {
            return this.showDeleteDialog;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRefreshing() {
            return this.isRefreshing;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsTransferMoneyFeatureAvailable() {
            return this.isTransferMoneyFeatureAvailable;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAddMoneyFeatureAvailable() {
            return this.isAddMoneyFeatureAvailable;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getIsSmartRouteEntryPointVisible() {
            return this.isSmartRouteEntryPointVisible;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsActivityRefreshRequired() {
            return this.isActivityRefreshRequired;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType getDeleteErrorType() {
            return this.deleteErrorType;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getShowDeleteErrorSheet() {
            return this.showDeleteErrorSheet;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsTransferPending() {
            return this.isTransferPending;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getTransferAmount() {
            return this.transferAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Error;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.name = "SavingsGoalDetailsState.Error";
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ SavingsGoalDetailsState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
