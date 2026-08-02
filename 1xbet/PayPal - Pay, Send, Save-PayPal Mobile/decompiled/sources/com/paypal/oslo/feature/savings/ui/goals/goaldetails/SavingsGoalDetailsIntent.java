package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0016\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0016 !\"#$%&'()*+,-./012345"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "GoalDataFetchResult", "Error", "RetryRequested", com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_MONEY_MANAGEMENT_SUCCESS, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_SUCCESS, "DeleteGoalRequested", "DeleteGoalConfirmed", "DeleteGoalCancelled", com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_DELETE_GOAL_SUCCESS, "DeleteGoalError", "DeleteGoalRetryRequested", "DeleteGoalErrorDismissed", "TransferForDeleteCompleted", "TransferForDeleteFailed", "ShowTransferReviewSheet", "HideTransferReviewSheet", "ChangeTransferReviewContent", "MarkTransferPending", "RefreshGoal", "ShowTransferErrorToast", "ResetActivityRefreshFlag", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$AutoSaveSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ChangeTransferReviewContent;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalCancelled;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalConfirmed;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalError;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalErrorDismissed;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalRequested;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalRetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$Error;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$GoalDataFetchResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$HideTransferReviewSheet;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$Initialize;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$MarkTransferPending;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$MoneyManagementSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$RefreshGoal;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ResetActivityRefreshFlag;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$RetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ShowTransferErrorToast;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ShowTransferReviewSheet;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$TransferForDeleteCompleted;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$TransferForDeleteFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsGoalDetailsIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsGoalDetailsIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$Initialize;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Initialize INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Initialize();

        public final int hashCode() {
            return 1986827435;
        }

        private Initialize() {
            super("INITIALIZE", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$GoalDataFetchResult;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "", "isActivityRefreshRequired", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$GoalDataFetchResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalDataFetchResult extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final boolean isActivityRefreshRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalDataFetchResult(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z) {
            super("GOAL_DATA_FETCH_RESULT", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
            this.isActivityRefreshRequired = z;
        }

        public /* synthetic */ GoalDataFetchResult(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(goalSummaryDTO, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final boolean isActivityRefreshRequired() {
            return this.isActivityRefreshRequired;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            boolean z = this.isActivityRefreshRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalDataFetchResult(goal=");
            sb.append(goalSummaryDTO);
            sb.append(", isActivityRefreshRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.goal.hashCode() * 31) + java.lang.Boolean.hashCode(this.isActivityRefreshRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult goalDataFetchResult = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.goal, goalDataFetchResult.goal) && this.isActivityRefreshRequired == goalDataFetchResult.isActivityRefreshRequired;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, boolean isActivityRefreshRequired) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult(goal, isActivityRefreshRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActivityRefreshRequired() {
            return this.isActivityRefreshRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.GoalDataFetchResult goalDataFetchResult, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = goalDataFetchResult.goal;
            }
            if ((i & 2) != 0) {
                z = goalDataFetchResult.isActivityRefreshRequired;
            }
            return goalDataFetchResult.copy(goalSummaryDTO, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$Error;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("ERROR", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$RetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$RetryRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryRequested extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryRequested(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super("RETRY_REQUESTED", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryRequested(goal=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested retryRequested, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = retryRequested.goal;
            }
            return retryRequested.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$MoneyManagementSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "toastMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$MoneyManagementSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyManagementSuccess extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String toastMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoneyManagementSuccess(java.lang.String str) {
            super("MONEY_MANAGEMENT_SUCCESS", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.toastMessage = str;
        }

        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyManagementSuccess(toastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess) other).toastMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess copy(java.lang.String toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess(toastMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MoneyManagementSuccess moneyManagementSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneyManagementSuccess.toastMessage;
            }
            return moneyManagementSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$AutoSaveSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "toastMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$AutoSaveSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoSaveSuccess extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String toastMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoSaveSuccess(java.lang.String str) {
            super("AUTO_SAVE_SUCCESS", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.toastMessage = str;
        }

        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoSaveSuccess(toastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess) other).toastMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess copy(java.lang.String toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess(toastMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.AutoSaveSuccess autoSaveSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = autoSaveSuccess.toastMessage;
            }
            return autoSaveSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalRequested;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "dialogType", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "getDialogType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalRequested extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType dialogType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteGoalRequested(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType) {
            super("DELETE_GOAL_REQUESTED", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteDialogType, "");
            this.dialogType = deleteDialogType;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType getDialogType() {
            return this.dialogType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType = this.dialogType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteGoalRequested(dialogType=");
            sb.append(deleteDialogType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.dialogType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRequested) && kotlin.jvm.internal.Intrinsics.areEqual(this.dialogType, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRequested) other).dialogType);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRequested copy(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType dialogType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogType, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRequested(dialogType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType getDialogType() {
            return this.dialogType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRequested copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRequested deleteGoalRequested, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deleteDialogType = deleteGoalRequested.dialogType;
            }
            return deleteGoalRequested.copy(deleteDialogType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalConfirmed;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalConfirmed extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalConfirmed INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalConfirmed();

        public final int hashCode() {
            return -153819418;
        }

        private DeleteGoalConfirmed() {
            super("DELETE_GOAL_CONFIRMED", null);
        }

        public final java.lang.String toString() {
            return "DeleteGoalConfirmed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalConfirmed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalCancelled;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalCancelled extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalCancelled INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalCancelled();

        public final int hashCode() {
            return 1126878424;
        }

        private DeleteGoalCancelled() {
            super("DELETE_GOAL_CANCELLED", null);
        }

        public final java.lang.String toString() {
            return "DeleteGoalCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalSuccess;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "toastMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalSuccess extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String toastMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteGoalSuccess(java.lang.String str) {
            super("DELETE_GOAL_SUCCESS", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.toastMessage = str;
        }

        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteGoalSuccess(toastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess) other).toastMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess copy(java.lang.String toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess(toastMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalSuccess deleteGoalSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteGoalSuccess.toastMessage;
            }
            return deleteGoalSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalError;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "errorType", "", "shouldRefresh", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;Z)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;Z)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteGoalErrorType;", "getErrorType", "Z", "getShouldRefresh"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalError extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType errorType;
        private final boolean shouldRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteGoalError(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType, boolean z) {
            super("DELETE_GOAL_ERROR", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteGoalErrorType, "");
            this.errorType = deleteGoalErrorType;
            this.shouldRefresh = z;
        }

        public /* synthetic */ DeleteGoalError(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(deleteGoalErrorType, (i & 2) != 0 ? true : z);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType getErrorType() {
            return this.errorType;
        }

        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType = this.errorType;
            boolean z = this.shouldRefresh;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteGoalError(errorType=");
            sb.append(deleteGoalErrorType);
            sb.append(", shouldRefresh=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldRefresh);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError deleteGoalError = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, deleteGoalError.errorType) && this.shouldRefresh == deleteGoalError.shouldRefresh;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError copy(com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType errorType, boolean shouldRefresh) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError(errorType, shouldRefresh);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalError deleteGoalError, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalErrorType deleteGoalErrorType, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deleteGoalErrorType = deleteGoalError.errorType;
            }
            if ((i & 2) != 0) {
                z = deleteGoalError.shouldRefresh;
            }
            return deleteGoalError.copy(deleteGoalErrorType, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalRetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalRetryRequested extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRetryRequested INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRetryRequested();

        public final int hashCode() {
            return 1595574911;
        }

        private DeleteGoalRetryRequested() {
            super("DELETE_GOAL_RETRY_REQUESTED", null);
        }

        public final java.lang.String toString() {
            return "DeleteGoalRetryRequested";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalRetryRequested)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$DeleteGoalErrorDismissed;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalErrorDismissed extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalErrorDismissed INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalErrorDismissed();

        public final int hashCode() {
            return 1737479258;
        }

        private DeleteGoalErrorDismissed() {
            super("DELETE_GOAL_ERROR_DISMISSED", null);
        }

        public final java.lang.String toString() {
            return "DeleteGoalErrorDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.DeleteGoalErrorDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$TransferForDeleteCompleted;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferForDeleteCompleted extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteCompleted INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteCompleted();

        public final int hashCode() {
            return 1835877181;
        }

        private TransferForDeleteCompleted() {
            super("TRANSFER_FOR_DELETE_COMPLETED", null);
        }

        public final java.lang.String toString() {
            return "TransferForDeleteCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$TransferForDeleteFailed;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$TransferForDeleteFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferForDeleteFailed extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferForDeleteFailed(java.lang.String str) {
            super("TRANSFER_FOR_DELETE_FAILED", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferForDeleteFailed(message=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteFailed) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteFailed copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.TransferForDeleteFailed transferForDeleteFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transferForDeleteFailed.message;
            }
            return transferForDeleteFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ShowTransferReviewSheet;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ShowTransferReviewSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTransferReviewSheet extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTransferReviewSheet(java.lang.String str) {
            super("SHOW_TRANSFER_REVIEW_SHEET", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTransferReviewSheet(amount=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferReviewSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferReviewSheet) other).amount);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferReviewSheet copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferReviewSheet(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferReviewSheet copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferReviewSheet showTransferReviewSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showTransferReviewSheet.amount;
            }
            return showTransferReviewSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$HideTransferReviewSheet;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideTransferReviewSheet extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.HideTransferReviewSheet INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.HideTransferReviewSheet();

        public final int hashCode() {
            return 2067453471;
        }

        private HideTransferReviewSheet() {
            super("HIDE_TRANSFER_REVIEW_SHEET", null);
        }

        public final java.lang.String toString() {
            return "HideTransferReviewSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.HideTransferReviewSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ChangeTransferReviewContent;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ChangeTransferReviewContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", "getContentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeTransferReviewContent extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType contentType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeTransferReviewContent(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType) {
            super("CHANGE_TRANSFER_REVIEW_CONTENT", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewContentType, "");
            this.contentType = reviewContentType;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType getContentType() {
            return this.contentType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType = this.contentType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeTransferReviewContent(contentType=");
            sb.append(reviewContentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contentType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ChangeTransferReviewContent) && this.contentType == ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ChangeTransferReviewContent) other).contentType;
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ChangeTransferReviewContent copy(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ChangeTransferReviewContent(contentType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType getContentType() {
            return this.contentType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ChangeTransferReviewContent copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ChangeTransferReviewContent changeTransferReviewContent, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewContentType = changeTransferReviewContent.contentType;
            }
            return changeTransferReviewContent.copy(reviewContentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$MarkTransferPending;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MarkTransferPending extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MarkTransferPending INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MarkTransferPending();

        public final int hashCode() {
            return 772447716;
        }

        private MarkTransferPending() {
            super("MARK_TRANSFER_PENDING", null);
        }

        public final java.lang.String toString() {
            return "MarkTransferPending";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.MarkTransferPending)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$RefreshGoal;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshGoal extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RefreshGoal INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RefreshGoal();

        public final int hashCode() {
            return -1159595309;
        }

        private RefreshGoal() {
            super("REFRESH_GOAL", null);
        }

        public final java.lang.String toString() {
            return "RefreshGoal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RefreshGoal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ShowTransferErrorToast;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ShowTransferErrorToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTransferErrorToast extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTransferErrorToast(java.lang.String str) {
            super("SHOW_TRANSFER_ERROR_TOAST", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTransferErrorToast(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast) other).errorMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast copy$default(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ShowTransferErrorToast showTransferErrorToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showTransferErrorToast.errorMessage;
            }
            return showTransferErrorToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent$ResetActivityRefreshFlag;", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/SavingsGoalDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResetActivityRefreshFlag extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ResetActivityRefreshFlag INSTANCE = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ResetActivityRefreshFlag();

        public final int hashCode() {
            return -1582131612;
        }

        private ResetActivityRefreshFlag() {
            super("RESET_ACTIVITY_REFRESH_FLAG", null);
        }

        public final java.lang.String toString() {
            return "ResetActivityRefreshFlag";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.ResetActivityRefreshFlag)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsGoalDetailsIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
