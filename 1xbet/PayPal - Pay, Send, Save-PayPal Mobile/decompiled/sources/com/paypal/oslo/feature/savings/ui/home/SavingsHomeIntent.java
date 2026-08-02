package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u001e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u001e()*+,-./0123456789:;<=>?@ABCDE"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "HubDataFetchResult", "NetworkError", "GraphQLError", "UnknownError", "RetryRequested", com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TRANSFER_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_ADD_MONEY_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_ADD_MONEY_GENERAL_SAVINGS_CLICKED, "NavigateToAddMoneyWithFiType", com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_SMART_ROUTE_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_CLICKED, "NavigateToAutoSaveManage", com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_INTEREST_EARNINGS_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_PROMO_TILE_DISMISSED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_CREATE_GOAL_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_GOAL_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_EDUCATIONAL_TILE_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_SAVINGS_STATEMENTS_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_FDIC_INSURANCE_CLICKED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CONFIRMED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_UPDATE_SUCCESS, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_MONEY_MANAGEMENT_SUCCESS, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_SUCCESS, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_ERROR, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_DELETE_GOAL_SUCCESS, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TILE_RETRY_REQUESTED, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_CLEAR_GOAL_SUCCESS_SHEET, com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SHOW_TAX_PREFERENCE_PROMPT, "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AddMoneyClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AddMoneyGeneralSavingsClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoShowTaxPreferencePrompt;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$ClearGoalForSuccessSheet;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$CreateGoalClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$DeleteGoalSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$EducationalTileClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$FdicInsuranceClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$GoalClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$GraphQLError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$HubDataFetchResult;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$Initialize;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$InterestEarningsClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$MoneyManagementSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NavigateToAddMoneyWithFiType;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NavigateToAutoSaveManage;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$PromoTileDismissed;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$RetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$SavingsStatementsClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$SmartRouteClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceConfirmed;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceUpdateSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TileRetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TransferClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsHomeIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsHomeIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$Initialize;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize();

        public final int hashCode() {
            return -1832611163;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b\u0003\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b-\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$HubDataFetchResult;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "isFeatureAvailable", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "savingsHubData", "electronic1099OptIn", "", "savingsAccountId", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goalForSuccessSheet", "shouldAutoShowTaxPreferencePrompt", "<init>", "(ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component6", "copy", "(ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$HubDataFetchResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/util/List;", "getSavingsHubData", "Ljava/lang/Boolean;", "getElectronic1099OptIn", "Ljava/lang/String;", "getSavingsAccountId", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoalForSuccessSheet", "getShouldAutoShowTaxPreferencePrompt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HubDataFetchResult extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 8;
        private final java.lang.Boolean electronic1099OptIn;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalForSuccessSheet;
        private final boolean isFeatureAvailable;
        private final java.lang.String savingsAccountId;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> savingsHubData;
        private final boolean shouldAutoShowTaxPreferencePrompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public HubDataFetchResult(boolean z, java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> list, java.lang.Boolean bool, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z2) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_FEATURE_AVAILABILITY_RESULT, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.isFeatureAvailable = z;
            this.savingsHubData = list;
            this.electronic1099OptIn = bool;
            this.savingsAccountId = str;
            this.goalForSuccessSheet = goalSummaryDTO;
            this.shouldAutoShowTaxPreferencePrompt = z2;
        }

        public final boolean isFeatureAvailable() {
            return this.isFeatureAvailable;
        }

        public /* synthetic */ HubDataFetchResult(boolean z, java.util.List list, java.lang.Boolean bool, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : goalSummaryDTO, (i & 32) != 0 ? false : z2);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> getSavingsHubData() {
            return this.savingsHubData;
        }

        public final java.lang.Boolean getElectronic1099OptIn() {
            return this.electronic1099OptIn;
        }

        public final java.lang.String getSavingsAccountId() {
            return this.savingsAccountId;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoalForSuccessSheet() {
            return this.goalForSuccessSheet;
        }

        public final boolean getShouldAutoShowTaxPreferencePrompt() {
            return this.shouldAutoShowTaxPreferencePrompt;
        }

        public final java.lang.String toString() {
            boolean z = this.isFeatureAvailable;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> list = this.savingsHubData;
            java.lang.Boolean bool = this.electronic1099OptIn;
            java.lang.String str = this.savingsAccountId;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goalForSuccessSheet;
            boolean z2 = this.shouldAutoShowTaxPreferencePrompt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HubDataFetchResult(isFeatureAvailable=");
            sb.append(z);
            sb.append(", savingsHubData=");
            sb.append(list);
            sb.append(", electronic1099OptIn=");
            sb.append(bool);
            sb.append(", savingsAccountId=");
            sb.append(str);
            sb.append(", goalForSuccessSheet=");
            sb.append(goalSummaryDTO);
            sb.append(", shouldAutoShowTaxPreferencePrompt=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isFeatureAvailable);
            int hashCode2 = this.savingsHubData.hashCode();
            java.lang.Boolean bool = this.electronic1099OptIn;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.savingsAccountId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goalForSuccessSheet;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (goalSummaryDTO != null ? goalSummaryDTO.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.shouldAutoShowTaxPreferencePrompt);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult hubDataFetchResult = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult) other;
            return this.isFeatureAvailable == hubDataFetchResult.isFeatureAvailable && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsHubData, hubDataFetchResult.savingsHubData) && kotlin.jvm.internal.Intrinsics.areEqual(this.electronic1099OptIn, hubDataFetchResult.electronic1099OptIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountId, hubDataFetchResult.savingsAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalForSuccessSheet, hubDataFetchResult.goalForSuccessSheet) && this.shouldAutoShowTaxPreferencePrompt == hubDataFetchResult.shouldAutoShowTaxPreferencePrompt;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult copy(boolean isFeatureAvailable, java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> savingsHubData, java.lang.Boolean electronic1099OptIn, java.lang.String savingsAccountId, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalForSuccessSheet, boolean shouldAutoShowTaxPreferencePrompt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHubData, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult(isFeatureAvailable, savingsHubData, electronic1099OptIn, savingsAccountId, goalForSuccessSheet, shouldAutoShowTaxPreferencePrompt);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldAutoShowTaxPreferencePrompt() {
            return this.shouldAutoShowTaxPreferencePrompt;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoalForSuccessSheet() {
            return this.goalForSuccessSheet;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSavingsAccountId() {
            return this.savingsAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getElectronic1099OptIn() {
            return this.electronic1099OptIn;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> component2() {
            return this.savingsHubData;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFeatureAvailable() {
            return this.isFeatureAvailable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult hubDataFetchResult, boolean z, java.util.List list, java.lang.Boolean bool, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = hubDataFetchResult.isFeatureAvailable;
            }
            if ((i & 2) != 0) {
                list = hubDataFetchResult.savingsHubData;
            }
            java.util.List list2 = list;
            if ((i & 4) != 0) {
                bool = hubDataFetchResult.electronic1099OptIn;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 8) != 0) {
                str = hubDataFetchResult.savingsAccountId;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                goalSummaryDTO = hubDataFetchResult.goalForSuccessSheet;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = goalSummaryDTO;
            if ((i & 32) != 0) {
                z2 = hubDataFetchResult.shouldAutoShowTaxPreferencePrompt;
            }
            return hubDataFetchResult.copy(z, list2, bool2, str2, goalSummaryDTO2, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError();

        public final int hashCode() {
            return 153815631;
        }

        private NetworkError() {
            super("Error.Network", null);
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$GraphQLError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphQLError(java.lang.String str) {
            super("Error.GraphQL", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(message=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError graphQLError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = graphQLError.message;
            }
            return graphQLError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$UnknownError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.String str) {
            super("Error.Unknown", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(message=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError unknownError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.message;
            }
            return unknownError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$RetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryRequested extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.RetryRequested INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.RetryRequested();

        public final int hashCode() {
            return -1198111173;
        }

        private RetryRequested() {
            super("RetryRequested", null);
        }

        public final java.lang.String toString() {
            return "RetryRequested";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.RetryRequested)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TransferClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TransferClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TransferClicked();

        public final int hashCode() {
            return 1783898055;
        }

        private TransferClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TRANSFER_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TRANSFER_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TransferClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AddMoneyClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddMoneyClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyClicked();

        public final int hashCode() {
            return 1483600019;
        }

        private AddMoneyClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_ADD_MONEY_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_ADD_MONEY_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AddMoneyGeneralSavingsClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddMoneyGeneralSavingsClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyGeneralSavingsClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyGeneralSavingsClicked();

        public final int hashCode() {
            return -504464478;
        }

        private AddMoneyGeneralSavingsClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_ADD_MONEY_GENERAL_SAVINGS_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_ADD_MONEY_GENERAL_SAVINGS_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyGeneralSavingsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NavigateToAddMoneyWithFiType;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "fiType", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NavigateToAddMoneyWithFiType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddMoneyWithFiType extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String fiType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAddMoneyWithFiType(java.lang.String str) {
            super("NavigateToAddMoneyWithFiType", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fiType = str;
        }

        public final java.lang.String getFiType() {
            return this.fiType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fiType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAddMoneyWithFiType(fiType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fiType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiType, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType) other).fiType);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType copy(java.lang.String fiType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiType, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType(fiType);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFiType() {
            return this.fiType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType navigateToAddMoneyWithFiType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAddMoneyWithFiType.fiType;
            }
            return navigateToAddMoneyWithFiType.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$SmartRouteClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmartRouteClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SmartRouteClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SmartRouteClicked();

        public final int hashCode() {
            return -1238397614;
        }

        private SmartRouteClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_SMART_ROUTE_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_SMART_ROUTE_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SmartRouteClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoSaveClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveClicked();

        public final int hashCode() {
            return 1344685254;
        }

        private AutoSaveClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NavigateToAutoSaveManage;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$NavigateToAutoSaveManage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAutoSaveManage extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAutoSaveManage(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super("NavigateToAutoSaveManage", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAutoSaveManage(goal=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage navigateToAutoSaveManage, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = navigateToAutoSaveManage.goal;
            }
            return navigateToAutoSaveManage.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$InterestEarningsClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InterestEarningsClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.InterestEarningsClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.InterestEarningsClicked();

        public final int hashCode() {
            return -1672878657;
        }

        private InterestEarningsClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_INTEREST_EARNINGS_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_INTEREST_EARNINGS_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.InterestEarningsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$PromoTileDismissed;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "action", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$PromoTileDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromoTileDismissed extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action;

        public PromoTileDismissed(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_PROMO_TILE_DISMISSED, null);
            this.action = action;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoTileDismissed(action=");
            sb.append(action);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action = this.action;
            if (action == null) {
                return 0;
            }
            return action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed) other).action);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action) {
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed(action);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed promoTileDismissed, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action action, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                action = promoTileDismissed.action;
            }
            return promoTileDismissed.copy(action);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$CreateGoalClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateGoalClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.CreateGoalClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.CreateGoalClicked();

        public final int hashCode() {
            return -437455293;
        }

        private CreateGoalClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_CREATE_GOAL_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_CREATE_GOAL_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.CreateGoalClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$GoalClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$GoalClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalClicked(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_GOAL_CLICKED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalClicked(goal=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked goalClicked, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = goalClicked.goal;
            }
            return goalClicked.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$EducationalTileClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "title", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$EducationalTileClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EducationalTileClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String content;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationalTileClicked(java.lang.String str, java.lang.String str2) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_EDUCATIONAL_TILE_CLICKED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.content = str2;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getContent() {
            return this.content;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.content;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EducationalTileClicked(title=");
            sb.append(str);
            sb.append(", content=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.content.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked educationalTileClicked = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, educationalTileClicked.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, educationalTileClicked.content);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked copy(java.lang.String title, java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked(title, content);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContent() {
            return this.content;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked educationalTileClicked, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = educationalTileClicked.title;
            }
            if ((i & 2) != 0) {
                str2 = educationalTileClicked.content;
            }
            return educationalTileClicked.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$SavingsStatementsClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsStatementsClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SavingsStatementsClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SavingsStatementsClicked();

        public final int hashCode() {
            return -846719681;
        }

        private SavingsStatementsClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_SAVINGS_STATEMENTS_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_SAVINGS_STATEMENTS_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SavingsStatementsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxStatementDeliveryPreferenceClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceClicked();

        public final int hashCode() {
            return -1272660129;
        }

        private TaxStatementDeliveryPreferenceClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$FdicInsuranceClicked;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FdicInsuranceClicked extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.FdicInsuranceClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.FdicInsuranceClicked();

        public final int hashCode() {
            return 1084563258;
        }

        private FdicInsuranceClicked() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_FDIC_INSURANCE_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_FDIC_INSURANCE_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.FdicInsuranceClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceConfirmed;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "selectedDigital", "", "successMessage", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceConfirmed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSelectedDigital", "Ljava/lang/String;", "getSuccessMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxStatementDeliveryPreferenceConfirmed extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final boolean selectedDigital;
        private final java.lang.String successMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxStatementDeliveryPreferenceConfirmed(boolean z, java.lang.String str) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_CONFIRMED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.selectedDigital = z;
            this.successMessage = str;
        }

        public final boolean getSelectedDigital() {
            return this.selectedDigital;
        }

        public final java.lang.String getSuccessMessage() {
            return this.successMessage;
        }

        public final java.lang.String toString() {
            boolean z = this.selectedDigital;
            java.lang.String str = this.successMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxStatementDeliveryPreferenceConfirmed(selectedDigital=");
            sb.append(z);
            sb.append(", successMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.selectedDigital) * 31) + this.successMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed taxStatementDeliveryPreferenceConfirmed = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed) other;
            return this.selectedDigital == taxStatementDeliveryPreferenceConfirmed.selectedDigital && kotlin.jvm.internal.Intrinsics.areEqual(this.successMessage, taxStatementDeliveryPreferenceConfirmed.successMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed copy(boolean selectedDigital, java.lang.String successMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successMessage, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed(selectedDigital, successMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSuccessMessage() {
            return this.successMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSelectedDigital() {
            return this.selectedDigital;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed taxStatementDeliveryPreferenceConfirmed, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taxStatementDeliveryPreferenceConfirmed.selectedDigital;
            }
            if ((i & 2) != 0) {
                str = taxStatementDeliveryPreferenceConfirmed.successMessage;
            }
            return taxStatementDeliveryPreferenceConfirmed.copy(z, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceUpdateSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TaxStatementDeliveryPreferenceUpdateSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxStatementDeliveryPreferenceUpdateSuccess extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxStatementDeliveryPreferenceUpdateSuccess(java.lang.String str) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TAX_STATEMENT_DELIVERY_PREFERENCE_UPDATE_SUCCESS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxStatementDeliveryPreferenceUpdateSuccess(message=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess taxStatementDeliveryPreferenceUpdateSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taxStatementDeliveryPreferenceUpdateSuccess.message;
            }
            return taxStatementDeliveryPreferenceUpdateSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$MoneyManagementSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "result", "", "formattedToastMessage", "<init>", "(Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$MoneyManagementSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "getResult", "Ljava/lang/String;", "getFormattedToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyManagementSuccess extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 8;
        private final java.lang.String formattedToastMessage;
        private final com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoneyManagementSuccess(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, java.lang.String str) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_MONEY_MANAGEMENT_SUCCESS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementSuccessNavResult, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.result = moneyManagementSuccessNavResult;
            this.formattedToastMessage = str;
        }

        public final com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult getResult() {
            return this.result;
        }

        public final java.lang.String getFormattedToastMessage() {
            return this.formattedToastMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult = this.result;
            java.lang.String str = this.formattedToastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyManagementSuccess(result=");
            sb.append(moneyManagementSuccessNavResult);
            sb.append(", formattedToastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.result.hashCode() * 31) + this.formattedToastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess moneyManagementSuccess = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.result, moneyManagementSuccess.result) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedToastMessage, moneyManagementSuccess.formattedToastMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess copy(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult result, java.lang.String formattedToastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedToastMessage, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess(result, formattedToastMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedToastMessage() {
            return this.formattedToastMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess moneyManagementSuccess, com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyManagementSuccessNavResult = moneyManagementSuccess.result;
            }
            if ((i & 2) != 0) {
                str = moneyManagementSuccess.formattedToastMessage;
            }
            return moneyManagementSuccess.copy(moneyManagementSuccessNavResult, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoSaveSuccess extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoSaveSuccess(java.lang.String str) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_SUCCESS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoSaveSuccess(message=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess autoSaveSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = autoSaveSuccess.message;
            }
            return autoSaveSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoSaveError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoSaveError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoSaveError(java.lang.String str) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SAVE_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoSaveError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError) other).error);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError autoSaveError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = autoSaveError.error;
            }
            return autoSaveError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$DeleteGoalSuccess;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "", "formattedToastMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$DeleteGoalSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteGoalSuccess extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final java.lang.String formattedToastMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteGoalSuccess(java.lang.String str) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_DELETE_GOAL_SUCCESS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.formattedToastMessage = str;
        }

        public final java.lang.String getFormattedToastMessage() {
            return this.formattedToastMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedToastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteGoalSuccess(formattedToastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedToastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedToastMessage, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess) other).formattedToastMessage);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess copy(java.lang.String formattedToastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedToastMessage, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess(formattedToastMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedToastMessage() {
            return this.formattedToastMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess deleteGoalSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteGoalSuccess.formattedToastMessage;
            }
            return deleteGoalSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TileRetryRequested;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "componentType", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$TileRetryRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "getComponentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TileRetryRequested extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType componentType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileRetryRequested(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_TILE_RETRY_REQUESTED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHubComponentType, "");
            this.componentType = savingsHubComponentType;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType getComponentType() {
            return this.componentType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType = this.componentType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TileRetryRequested(componentType=");
            sb.append(savingsHubComponentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested) && this.componentType == ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested) other).componentType;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested copy(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType componentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested(componentType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType getComponentType() {
            return this.componentType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested tileRetryRequested, com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsHubComponentType = tileRetryRequested.componentType;
            }
            return tileRetryRequested.copy(savingsHubComponentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$ClearGoalForSuccessSheet;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearGoalForSuccessSheet extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.ClearGoalForSuccessSheet INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.ClearGoalForSuccessSheet();

        public final int hashCode() {
            return -857043526;
        }

        private ClearGoalForSuccessSheet() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_CLEAR_GOAL_SUCCESS_SHEET, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_CLEAR_GOAL_SUCCESS_SHEET;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.ClearGoalForSuccessSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$AutoShowTaxPreferencePrompt;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoShowTaxPreferencePrompt extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoShowTaxPreferencePrompt INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoShowTaxPreferencePrompt();

        public final int hashCode() {
            return -1199885175;
        }

        private AutoShowTaxPreferencePrompt() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SHOW_TAX_PREFERENCE_PROMPT, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.IntentNames.INTENT_AUTO_SHOW_TAX_PREFERENCE_PROMPT;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoShowTaxPreferencePrompt)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsHomeIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
