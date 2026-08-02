package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;", "", "<init>", "()V", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Error", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Initial;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutoSaveManageUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Initial;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Initial INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Initial();

        public final int hashCode() {
            return 2015010025;
        }

        private Initial() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private AutoSaveManageUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading();

        public final int hashCode() {
            return 403318497;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u009e\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001fR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b\u000e\u0010#R\u001a\u0010\u000f\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b\u000f\u0010#R\u001a\u0010\u0010\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b\u0010\u0010#R\u001a\u0010\u0011\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010#R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b\u0012\u0010#R\u001a\u0010\u0013\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b\u0013\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\bA\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Ready;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "", "selectedAmount", "customAmount", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "frequencyState", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "selectedFi", "", "financialInstruments", "", "isSubmitting", "isShowingCustomAmountInput", "isKeyboardVisible", "showCustomAmountDisplay", "isFiLoading", "isFiFetchError", "lastAddedFiId", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Ljava/util/List;ZZZZZZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Ljava/util/List;ZZZZZZLjava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Ljava/lang/String;", "getSelectedAmount", "getCustomAmount", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "getFrequencyState", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "getSelectedFi", "Ljava/util/List;", "getFinancialInstruments", "Z", "getShowCustomAmountDisplay", "getLastAddedFiId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState {
        public static final int $stable = 8;
        private final java.lang.String customAmount;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
        private final boolean isFiFetchError;
        private final boolean isFiLoading;
        private final boolean isKeyboardVisible;
        private final boolean isShowingCustomAmountInput;
        private final boolean isSubmitting;
        private final java.lang.String lastAddedFiId;
        private final java.lang.String selectedAmount;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi;
        private final boolean showCustomAmountDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.goal = goalSummaryDTO;
            this.selectedAmount = str;
            this.customAmount = str2;
            this.frequencyState = frequencySelectionState;
            this.selectedFi = moneyMovementFiDTO;
            this.financialInstruments = list;
            this.isSubmitting = z;
            this.isShowingCustomAmountInput = z2;
            this.isKeyboardVisible = z3;
            this.showCustomAmountDisplay = z4;
            this.isFiLoading = z5;
            this.isFiFetchError = z6;
            this.lastAddedFiId = str3;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(goalSummaryDTO, str, str2, frequencySelectionState, moneyMovementFiDTO, list, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? false : z6, (i & 4096) != 0 ? null : str3);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String getSelectedAmount() {
            return this.selectedAmount;
        }

        public final java.lang.String getCustomAmount() {
            return this.customAmount;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getFinancialInstruments() {
            return this.financialInstruments;
        }

        public final boolean isSubmitting() {
            return this.isSubmitting;
        }

        public final boolean isShowingCustomAmountInput() {
            return this.isShowingCustomAmountInput;
        }

        public final boolean isKeyboardVisible() {
            return this.isKeyboardVisible;
        }

        public final boolean getShowCustomAmountDisplay() {
            return this.showCustomAmountDisplay;
        }

        public final boolean isFiLoading() {
            return this.isFiLoading;
        }

        public final boolean isFiFetchError() {
            return this.isFiFetchError;
        }

        public final java.lang.String getLastAddedFiId() {
            return this.lastAddedFiId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.String str = this.selectedAmount;
            java.lang.String str2 = this.customAmount;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = this.financialInstruments;
            boolean z = this.isSubmitting;
            boolean z2 = this.isShowingCustomAmountInput;
            boolean z3 = this.isKeyboardVisible;
            boolean z4 = this.showCustomAmountDisplay;
            boolean z5 = this.isFiLoading;
            boolean z6 = this.isFiFetchError;
            java.lang.String str3 = this.lastAddedFiId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(goal=");
            sb.append(goalSummaryDTO);
            sb.append(", selectedAmount=");
            sb.append(str);
            sb.append(", customAmount=");
            sb.append(str2);
            sb.append(", frequencyState=");
            sb.append(frequencySelectionState);
            sb.append(", selectedFi=");
            sb.append(moneyMovementFiDTO);
            sb.append(", financialInstruments=");
            sb.append(list);
            sb.append(", isSubmitting=");
            sb.append(z);
            sb.append(", isShowingCustomAmountInput=");
            sb.append(z2);
            sb.append(", isKeyboardVisible=");
            sb.append(z3);
            sb.append(", showCustomAmountDisplay=");
            sb.append(z4);
            sb.append(", isFiLoading=");
            sb.append(z5);
            sb.append(", isFiFetchError=");
            sb.append(z6);
            sb.append(", lastAddedFiId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.goal.hashCode();
            int hashCode2 = this.selectedAmount.hashCode();
            int hashCode3 = this.customAmount.hashCode();
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.frequencyState;
            int hashCode4 = frequencySelectionState == null ? 0 : frequencySelectionState.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = this.selectedFi;
            int hashCode5 = moneyMovementFiDTO == null ? 0 : moneyMovementFiDTO.hashCode();
            int hashCode6 = this.financialInstruments.hashCode();
            int hashCode7 = java.lang.Boolean.hashCode(this.isSubmitting);
            int hashCode8 = java.lang.Boolean.hashCode(this.isShowingCustomAmountInput);
            int hashCode9 = java.lang.Boolean.hashCode(this.isKeyboardVisible);
            int hashCode10 = java.lang.Boolean.hashCode(this.showCustomAmountDisplay);
            int hashCode11 = java.lang.Boolean.hashCode(this.isFiLoading);
            int hashCode12 = java.lang.Boolean.hashCode(this.isFiFetchError);
            java.lang.String str = this.lastAddedFiId;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ready.goal) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAmount, ready.selectedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, ready.customAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyState, ready.frequencyState) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, ready.selectedFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstruments, ready.financialInstruments) && this.isSubmitting == ready.isSubmitting && this.isShowingCustomAmountInput == ready.isShowingCustomAmountInput && this.isKeyboardVisible == ready.isKeyboardVisible && this.showCustomAmountDisplay == ready.showCustomAmountDisplay && this.isFiLoading == ready.isFiLoading && this.isFiFetchError == ready.isFiFetchError && kotlin.jvm.internal.Intrinsics.areEqual(this.lastAddedFiId, ready.lastAddedFiId);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, java.lang.String selectedAmount, java.lang.String customAmount, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments, boolean isSubmitting, boolean isShowingCustomAmountInput, boolean isKeyboardVisible, boolean showCustomAmountDisplay, boolean isFiLoading, boolean isFiFetchError, java.lang.String lastAddedFiId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstruments, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready(goal, selectedAmount, customAmount, frequencyState, selectedFi, financialInstruments, isSubmitting, isShowingCustomAmountInput, isKeyboardVisible, showCustomAmountDisplay, isFiLoading, isFiFetchError, lastAddedFiId);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsKeyboardVisible() {
            return this.isKeyboardVisible;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsShowingCustomAmountInput() {
            return this.isShowingCustomAmountInput;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> component6() {
            return this.financialInstruments;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO getSelectedFi() {
            return this.selectedFi;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getFrequencyState() {
            return this.frequencyState;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCustomAmount() {
            return this.customAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedAmount() {
            return this.selectedAmount;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getLastAddedFiId() {
            return this.lastAddedFiId;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsFiFetchError() {
            return this.isFiFetchError;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsFiLoading() {
            return this.isFiLoading;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowCustomAmountDisplay() {
            return this.showCustomAmountDisplay;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;", "", "message", "", "isNetworkError", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState {
        public static final int $stable = 0;
        private final boolean isNetworkError;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.isNetworkError = z;
        }

        public /* synthetic */ Error(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean isNetworkError() {
            return this.isNetworkError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            boolean z = this.isNetworkError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", isNetworkError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Boolean.hashCode(this.isNetworkError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error error = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.isNetworkError == error.isNetworkError;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error copy(java.lang.String message, boolean isNetworkError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error(message, isNetworkError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNetworkError() {
            return this.isNetworkError;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error error, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                z = error.isNetworkError;
            }
            return error.copy(str, z);
        }
    }

    public /* synthetic */ AutoSaveManageUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
