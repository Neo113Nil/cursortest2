package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "", "<init>", "()V", "NavigateBack", "ShowFrequencySheet", "ShowFiSelectionSheet", "NavigateToAddCard", "ShowFiSelectionWithToast", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFiSelectionSheet;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFiSelectionWithToast;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFrequencySheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutoSaveManageEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "Lcom/paypal/oslo/feature/savings/navigation/result/AutoSaveManageNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/savings/navigation/result/AutoSaveManageNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/navigation/result/AutoSaveManageNavResult;", "copy", "(Lcom/paypal/oslo/feature/savings/navigation/result/AutoSaveManageNavResult;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$NavigateBack;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/navigation/result/AutoSaveManageNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBack(com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult autoSaveManageNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveManageNavResult, "");
            this.result = autoSaveManageNavResult;
        }

        public final com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult autoSaveManageNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBack(result=");
            sb.append(autoSaveManageNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack) other).result);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack copy(com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack, com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult autoSaveManageNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoSaveManageNavResult = navigateBack.result;
            }
            return navigateBack.copy(autoSaveManageNavResult);
        }
    }

    private AutoSaveManageEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFrequencySheet;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "currentState", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFrequencySheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "getCurrentState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowFrequencySheet extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState currentState;

        public ShowFrequencySheet(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
            super(null);
            this.currentState = frequencySelectionState;
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getCurrentState() {
            return this.currentState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.currentState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowFrequencySheet(currentState=");
            sb.append(frequencySelectionState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = this.currentState;
            if (frequencySelectionState == null) {
                return 0;
            }
            return frequencySelectionState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentState, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet) other).currentState);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet copy(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState currentState) {
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet(currentState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState getCurrentState() {
            return this.currentState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet showFrequencySheet, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                frequencySelectionState = showFrequencySheet.currentState;
            }
            return showFrequencySheet.copy(frequencySelectionState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFiSelectionSheet;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "financialInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFiSelectionSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFinancialInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowFiSelectionSheet extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFiSelectionSheet(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.financialInstruments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getFinancialInstruments() {
            return this.financialInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = this.financialInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowFiSelectionSheet(financialInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.financialInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstruments, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet) other).financialInstruments);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstruments, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet(financialInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> component1() {
            return this.financialInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet showFiSelectionSheet, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = showFiSelectionSheet.financialInstruments;
            }
            return showFiSelectionSheet.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddCard extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateToAddCard INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateToAddCard();

        public final int hashCode() {
            return 796517138;
        }

        private NavigateToAddCard() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddCard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateToAddCard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFiSelectionWithToast;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;", "toastType", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$ShowFiSelectionWithToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;", "getToastType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowFiSelectionWithToast extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType toastType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFiSelectionWithToast(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType fiToastType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiToastType, "");
            this.toastType = fiToastType;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType getToastType() {
            return this.toastType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType fiToastType = this.toastType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowFiSelectionWithToast(toastType=");
            sb.append(fiToastType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.toastType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast) && this.toastType == ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast) other).toastType;
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast copy(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType toastType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastType, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast(toastType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType getToastType() {
            return this.toastType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast showFiSelectionWithToast, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType fiToastType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fiToastType = showFiSelectionWithToast.toastType;
            }
            return showFiSelectionWithToast.copy(fiToastType);
        }
    }

    public /* synthetic */ AutoSaveManageEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
