package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState;", "", "<init>", "()V", "Idle", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Idle;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ReviewScreenState {
    public static final int $stable = 0;

    private ReviewScreenState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Idle;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Idle INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Idle();

        public final int hashCode() {
            return 2071710870;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b,\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState;", "", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "frequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "startDate", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component3", "()Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "getFlowType", "getFrequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getFrequency", "getStartDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency;
        private final java.lang.String frequencyText;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final java.lang.String startDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
            this.amount = str;
            this.goal = goalSummaryDTO;
            this.flowType = moneyManagementFlowType;
            this.frequencyText = str2;
            this.frequency = frequencyType;
            this.startDate = str3;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        public /* synthetic */ Loading(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, goalSummaryDTO, moneyManagementFlowType, (i & 8) != 0 ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.DefaultFrequencyText : str2, (i & 16) != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME : frequencyType, (i & 32) != 0 ? null : str3);
        }

        public final java.lang.String getFrequencyText() {
            return this.frequencyText;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = this.flowType;
            java.lang.String str2 = this.frequencyText;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.frequency;
            java.lang.String str3 = this.startDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(amount=");
            sb.append(str);
            sb.append(", goal=");
            sb.append(goalSummaryDTO);
            sb.append(", flowType=");
            sb.append(moneyManagementFlowType);
            sb.append(", frequencyText=");
            sb.append(str2);
            sb.append(", frequency=");
            sb.append(frequencyType);
            sb.append(", startDate=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            int hashCode2 = this.goal.hashCode();
            int hashCode3 = this.flowType.hashCode();
            int hashCode4 = this.frequencyText.hashCode();
            int hashCode5 = this.frequency.hashCode();
            java.lang.String str = this.startDate;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading loading = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, loading.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, loading.goal) && this.flowType == loading.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyText, loading.frequencyText) && this.frequency == loading.frequency && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, loading.startDate);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading copy(java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType, java.lang.String frequencyText, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency, java.lang.String startDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading(amount, goal, flowType, frequencyText, frequency, startDate);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFrequencyText() {
            return this.frequencyText;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Loading loading, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loading.amount;
            }
            if ((i & 2) != 0) {
                goalSummaryDTO = loading.goal;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = goalSummaryDTO;
            if ((i & 4) != 0) {
                moneyManagementFlowType = loading.flowType;
            }
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType2 = moneyManagementFlowType;
            if ((i & 8) != 0) {
                str2 = loading.frequencyText;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                frequencyType = loading.frequency;
            }
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2 = frequencyType;
            if ((i & 32) != 0) {
                str3 = loading.startDate;
            }
            return loading.copy(str, goalSummaryDTO2, moneyManagementFlowType2, str4, frequencyType2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0090\u0001\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b1\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b:\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b=\u0010\u0019R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b>\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bA\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\b\u0013\u0010'R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028G¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u0011\u0010F\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bE\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Success;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "financialInstruments", "", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "frequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "startDate", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "selectedFi", "selectedGoal", "", "isSubmitting", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component4", "()Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "component10", "component11", "()Z", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getFinancialInstruments", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "getFlowType", "getFrequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getFrequency", "getStartDate", "getGoals", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "getSelectedFi", "getSelectedGoal", "Z", "getAvailableGoals", "availableGoals", "getHasInsufficientBalance", "hasInsufficientBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState {
        public static final int $stable = 8;
        private final java.lang.String amount;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments;
        private final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency;
        private final java.lang.String frequencyText;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;
        private final boolean isSubmitting;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal;
        private final java.lang.String startDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.financialInstruments = list;
            this.amount = str;
            this.goal = goalSummaryDTO;
            this.flowType = moneyManagementFlowType;
            this.frequencyText = str2;
            this.frequency = frequencyType;
            this.startDate = str3;
            this.goals = list2;
            this.selectedFi = moneyMovementFiDTO;
            this.selectedGoal = goalSummaryDTO2;
            this.isSubmitting = z;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getFinancialInstruments() {
            return this.financialInstruments;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        public /* synthetic */ Success(java.util.List list, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.util.List list2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, goalSummaryDTO, moneyManagementFlowType, (i & 16) != 0 ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.DefaultFrequencyText : str2, (i & 32) != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME : frequencyType, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 256) != 0 ? null : moneyMovementFiDTO, (i & 512) != 0 ? null : goalSummaryDTO2, (i & 1024) != 0 ? false : z);
        }

        public final java.lang.String getFrequencyText() {
            return this.frequencyText;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getGoals() {
            return this.goals;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getSelectedGoal() {
            return this.selectedGoal;
        }

        public final boolean isSubmitting() {
            return this.isSubmitting;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getAvailableGoals() {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list = this.goals;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj).getId(), this.goal.getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final boolean getHasInsufficientBalance() {
            double highResolutionOutputSizeshNQ4ISI;
            double highResolutionOutputSizeshNQ4ISI2;
            double highResolutionOutputSizeshNQ4ISI3;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO source;
            double highResolutionOutputSizeshNQ4ISI4;
            highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.getHighResolutionOutputSizeshNQ4ISI(this.amount);
            if (this.flowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY || this.flowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL) {
                highResolutionOutputSizeshNQ4ISI2 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.getHighResolutionOutputSizeshNQ4ISI(this.goal.getCurrentAmountFormatted());
                return highResolutionOutputSizeshNQ4ISI > highResolutionOutputSizeshNQ4ISI2;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.selectedGoal;
            if (goalSummaryDTO != null) {
                highResolutionOutputSizeshNQ4ISI4 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.getHighResolutionOutputSizeshNQ4ISI(goalSummaryDTO.getCurrentAmountFormatted());
                return highResolutionOutputSizeshNQ4ISI > highResolutionOutputSizeshNQ4ISI4;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            if (moneyMovementFiDTO == null) {
                moneyMovementFiDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.financialInstruments);
            }
            java.lang.String availableBalance = (moneyMovementFiDTO == null || (source = moneyMovementFiDTO.getSource()) == null) ? null : source.getAvailableBalance();
            if (moneyMovementFiDTO != null && availableBalance != null) {
                highResolutionOutputSizeshNQ4ISI3 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.getHighResolutionOutputSizeshNQ4ISI(availableBalance);
                if (highResolutionOutputSizeshNQ4ISI > highResolutionOutputSizeshNQ4ISI3) {
                    return true;
                }
            }
            return false;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = this.financialInstruments;
            java.lang.String str = this.amount;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = this.flowType;
            java.lang.String str2 = this.frequencyText;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.frequency;
            java.lang.String str3 = this.startDate;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list2 = this.goals;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = this.selectedGoal;
            boolean z = this.isSubmitting;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(financialInstruments=");
            sb.append(list);
            sb.append(", amount=");
            sb.append(str);
            sb.append(", goal=");
            sb.append(goalSummaryDTO);
            sb.append(", flowType=");
            sb.append(moneyManagementFlowType);
            sb.append(", frequencyText=");
            sb.append(str2);
            sb.append(", frequency=");
            sb.append(frequencyType);
            sb.append(", startDate=");
            sb.append(str3);
            sb.append(", goals=");
            sb.append(list2);
            sb.append(", selectedFi=");
            sb.append(moneyMovementFiDTO);
            sb.append(", selectedGoal=");
            sb.append(goalSummaryDTO2);
            sb.append(", isSubmitting=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.financialInstruments.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.goal.hashCode();
            int hashCode4 = this.flowType.hashCode();
            int hashCode5 = this.frequencyText.hashCode();
            int hashCode6 = this.frequency.hashCode();
            java.lang.String str = this.startDate;
            int hashCode7 = str == null ? 0 : str.hashCode();
            int hashCode8 = this.goals.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            int hashCode9 = moneyMovementFiDTO == null ? 0 : moneyMovementFiDTO.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.selectedGoal;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (goalSummaryDTO != null ? goalSummaryDTO.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isSubmitting);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success success = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstruments, success.financialInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, success.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, success.goal) && this.flowType == success.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyText, success.frequencyText) && this.frequency == success.frequency && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, success.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.goals, success.goals) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, success.selectedFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedGoal, success.selectedGoal) && this.isSubmitting == success.isSubmitting;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments, java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType, java.lang.String frequencyText, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency, java.lang.String startDate, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal, boolean isSubmitting) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success(financialInstruments, amount, goal, flowType, frequencyText, frequency, startDate, goals, selectedFi, selectedGoal, isSubmitting);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> component8() {
            return this.goals;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFrequencyText() {
            return this.frequencyText;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getSelectedGoal() {
            return this.selectedGoal;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> component1() {
            return this.financialInstruments;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J¦\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0019R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010$R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bC\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\bF\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bG\u0010\u0019R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\b\u0015\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState;", "", "message", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "frequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "startDate", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "financialInstruments", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "selectedFi", "selectedGoal", "preSelectedFiId", "", "isAddCardFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component4", "()Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "component11", "component12", "component13", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getAmount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "getFlowType", "getFrequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getFrequency", "getStartDate", "Ljava/util/List;", "getFinancialInstruments", "getGoals", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "getSelectedFi", "getSelectedGoal", "getPreSelectedFiId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState {
        public static final int $stable = 8;
        private final java.lang.String amount;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments;
        private final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency;
        private final java.lang.String frequencyText;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;
        private final boolean isAddCardFlow;
        private final java.lang.String message;
        private final java.lang.String preSelectedFiId;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal;
        private final java.lang.String startDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, java.lang.String str5, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.message = str;
            this.amount = str2;
            this.goal = goalSummaryDTO;
            this.flowType = moneyManagementFlowType;
            this.frequencyText = str3;
            this.frequency = frequencyType;
            this.startDate = str4;
            this.financialInstruments = list;
            this.goals = list2;
            this.selectedFi = moneyMovementFiDTO;
            this.selectedGoal = goalSummaryDTO2;
            this.preSelectedFiId = str5;
            this.isAddCardFlow = z;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4, java.util.List list, java.util.List list2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2, java.lang.String str5, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, goalSummaryDTO, moneyManagementFlowType, (i & 16) != 0 ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenStateKt.DefaultFrequencyText : str3, (i & 32) != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME : frequencyType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 512) != 0 ? null : moneyMovementFiDTO, (i & 1024) != 0 ? null : goalSummaryDTO2, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? false : z);
        }

        public final java.lang.String getFrequencyText() {
            return this.frequencyText;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getFinancialInstruments() {
            return this.financialInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getGoals() {
            return this.goals;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getSelectedGoal() {
            return this.selectedGoal;
        }

        public final java.lang.String getPreSelectedFiId() {
            return this.preSelectedFiId;
        }

        public final boolean isAddCardFlow() {
            return this.isAddCardFlow;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.amount;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = this.flowType;
            java.lang.String str3 = this.frequencyText;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.frequency;
            java.lang.String str4 = this.startDate;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = this.financialInstruments;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list2 = this.goals;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = this.selectedGoal;
            java.lang.String str5 = this.preSelectedFiId;
            boolean z = this.isAddCardFlow;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(str2);
            sb.append(", goal=");
            sb.append(goalSummaryDTO);
            sb.append(", flowType=");
            sb.append(moneyManagementFlowType);
            sb.append(", frequencyText=");
            sb.append(str3);
            sb.append(", frequency=");
            sb.append(frequencyType);
            sb.append(", startDate=");
            sb.append(str4);
            sb.append(", financialInstruments=");
            sb.append(list);
            sb.append(", goals=");
            sb.append(list2);
            sb.append(", selectedFi=");
            sb.append(moneyMovementFiDTO);
            sb.append(", selectedGoal=");
            sb.append(goalSummaryDTO2);
            sb.append(", preSelectedFiId=");
            sb.append(str5);
            sb.append(", isAddCardFlow=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.goal.hashCode();
            int hashCode4 = this.flowType.hashCode();
            int hashCode5 = this.frequencyText.hashCode();
            int hashCode6 = this.frequency.hashCode();
            java.lang.String str = this.startDate;
            int hashCode7 = str == null ? 0 : str.hashCode();
            int hashCode8 = this.financialInstruments.hashCode();
            int hashCode9 = this.goals.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            int hashCode10 = moneyMovementFiDTO == null ? 0 : moneyMovementFiDTO.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.selectedGoal;
            int hashCode11 = goalSummaryDTO == null ? 0 : goalSummaryDTO.hashCode();
            java.lang.String str2 = this.preSelectedFiId;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isAddCardFlow);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Error error = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, error.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, error.goal) && this.flowType == error.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyText, error.frequencyText) && this.frequency == error.frequency && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, error.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstruments, error.financialInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.goals, error.goals) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, error.selectedFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedGoal, error.selectedGoal) && kotlin.jvm.internal.Intrinsics.areEqual(this.preSelectedFiId, error.preSelectedFiId) && this.isAddCardFlow == error.isAddCardFlow;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Error copy(java.lang.String message, java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType, java.lang.String frequencyText, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency, java.lang.String startDate, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal, java.lang.String preSelectedFiId, boolean isAddCardFlow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Error(message, amount, goal, flowType, frequencyText, frequency, startDate, financialInstruments, goals, selectedFi, selectedGoal, preSelectedFiId, isAddCardFlow);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> component9() {
            return this.goals;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> component8() {
            return this.financialInstruments;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
            return this.frequency;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFrequencyText() {
            return this.frequencyText;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsAddCardFlow() {
            return this.isAddCardFlow;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getPreSelectedFiId() {
            return this.preSelectedFiId;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getSelectedGoal() {
            return this.selectedGoal;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ ReviewScreenState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
