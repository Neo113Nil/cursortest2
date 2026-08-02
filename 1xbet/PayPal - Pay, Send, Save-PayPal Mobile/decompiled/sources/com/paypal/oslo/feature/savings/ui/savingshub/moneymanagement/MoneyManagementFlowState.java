package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState;", "", "<init>", "()V", "Idle", "LoadingFI", "ShowingReview", "Error", "Processing", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Idle;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$LoadingFI;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Processing;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$ShowingReview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class MoneyManagementFlowState {
    public static final int $stable = 0;

    private MoneyManagementFlowState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Idle;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Idle INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Idle();

        public final int hashCode() {
            return -1690597127;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$LoadingFI;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingFI extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.LoadingFI INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.LoadingFI();

        public final int hashCode() {
            return -545509126;
        }

        private LoadingFI() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LoadingFI";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.LoadingFI)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$ShowingReview;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "financialInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$ShowingReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFinancialInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowingReview extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowingReview(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.financialInstruments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getFinancialInstruments() {
            return this.financialInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = this.financialInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowingReview(financialInstruments=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.ShowingReview) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstruments, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.ShowingReview) other).financialInstruments);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.ShowingReview copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstruments, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.ShowingReview(financialInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> component1() {
            return this.financialInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.ShowingReview copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.ShowingReview showingReview, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = showingReview.financialInstruments;
            }
            return showingReview.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Error) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Error copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState$Processing;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/MoneyManagementFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Processing INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Processing();

        public final int hashCode() {
            return 283134072;
        }

        private Processing() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Processing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementFlowState.Processing)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ MoneyManagementFlowState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
