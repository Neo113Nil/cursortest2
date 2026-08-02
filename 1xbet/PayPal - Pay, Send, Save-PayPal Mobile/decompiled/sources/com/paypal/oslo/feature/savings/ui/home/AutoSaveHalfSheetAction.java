package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;", "", "<init>", "()V", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "SetUp", "Manage", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$Dismiss;", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$Manage;", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$SetUp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutoSaveHalfSheetAction {
    public static final int $stable = 0;

    private AutoSaveHalfSheetAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$Dismiss;", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss extends com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Dismiss INSTANCE = new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Dismiss();

        public final int hashCode() {
            return -347582281;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Dismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$SetUp;", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$SetUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetUp extends com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetUp(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetUp(goal=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp copy$default(com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp setUp, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = setUp.goal;
            }
            return setUp.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$Manage;", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction$Manage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Manage extends com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Manage(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Manage(goal=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage copy$default(com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage manage, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = manage.goal;
            }
            return manage.copy(goalSummaryDTO);
        }
    }

    public /* synthetic */ AutoSaveHalfSheetAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
