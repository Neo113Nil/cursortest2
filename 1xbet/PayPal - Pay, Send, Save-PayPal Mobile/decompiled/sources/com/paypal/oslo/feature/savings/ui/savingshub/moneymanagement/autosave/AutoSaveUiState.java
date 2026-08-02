package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "", "<init>", "()V", "Loading", "MoveToAutoSaveSetup", "GoalsLoaded", "Error", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$GoalsLoaded;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$MoveToAutoSaveSetup;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutoSaveUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading();

        public final int hashCode() {
            return 651352902;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private AutoSaveUiState() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$MoveToAutoSaveSetup;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveFlowType;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveFlowType;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveFlowType;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$MoveToAutoSaveSetup;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveFlowType;", "getFlowType", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveToAutoSaveSetup extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType flowType;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveToAutoSaveSetup(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType autoSaveFlowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveFlowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.flowType = autoSaveFlowType;
            this.goal = goalSummaryDTO;
        }

        public /* synthetic */ MoveToAutoSaveSetup(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType autoSaveFlowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType.AutoSaveSetup : autoSaveFlowType, goalSummaryDTO);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType getFlowType() {
            return this.flowType;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType autoSaveFlowType = this.flowType;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveToAutoSaveSetup(flowType=");
            sb.append(autoSaveFlowType);
            sb.append(", goal=");
            sb.append(goalSummaryDTO);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.flowType.hashCode() * 31) + this.goal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup moveToAutoSaveSetup = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup) other;
            return this.flowType == moveToAutoSaveSetup.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, moveToAutoSaveSetup.goal);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup copy(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType flowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup(flowType, goal);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType getFlowType() {
            return this.flowType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup moveToAutoSaveSetup, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType autoSaveFlowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoSaveFlowType = moveToAutoSaveSetup.flowType;
            }
            if ((i & 2) != 0) {
                goalSummaryDTO = moveToAutoSaveSetup.goal;
            }
            return moveToAutoSaveSetup.copy(autoSaveFlowType, goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$GoalsLoaded;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$GoalsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getGoals"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalsLoaded extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalsLoaded(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.goals = list;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getGoals() {
            return this.goals;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list = this.goals;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalsLoaded(goals=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.goals.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.goals, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded) other).goals);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded(goals);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> component1() {
            return this.goals;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded goalsLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = goalsLoaded.goals;
            }
            return goalsLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;", "errorType", "", "message", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;", "getErrorType", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType errorType;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorType = autoSaveErrorType;
            this.message = str;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType = this.errorType;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(autoSaveErrorType);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error error = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, error.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error copy(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType errorType, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error(errorType, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error error, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoSaveErrorType = error.errorType;
            }
            if ((i & 2) != 0) {
                str = error.message;
            }
            return error.copy(autoSaveErrorType, str);
        }
    }

    public /* synthetic */ AutoSaveUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
