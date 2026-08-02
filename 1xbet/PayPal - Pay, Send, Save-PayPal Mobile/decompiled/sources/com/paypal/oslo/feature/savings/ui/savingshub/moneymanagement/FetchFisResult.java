package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult;", "", "<init>", "()V", "Success", "Error", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FetchFisResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult$Success;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "financialInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFinancialInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.financialInstruments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> getFinancialInstruments() {
            return this.financialInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list = this.financialInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(financialInstruments=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstruments, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Success) other).financialInstruments);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Success copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstruments, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Success(financialInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> component1() {
            return this.financialInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Success copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Success success, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.financialInstruments;
            }
            return success.copy(list);
        }
    }

    private FetchFisResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult$Error;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/FetchFisResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult {
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Error) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Error copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FetchFisResult.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ FetchFisResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
