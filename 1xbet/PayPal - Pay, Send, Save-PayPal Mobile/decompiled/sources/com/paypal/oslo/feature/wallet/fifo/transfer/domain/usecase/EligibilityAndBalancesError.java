package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError;", "", "<init>", "()V", "EligibilityFailed", "BalancesFailed", "WithdrawalNotEligible", "NoCurrenciesAvailable", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$BalancesFailed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$EligibilityFailed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$NoCurrenciesAvailable;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$WithdrawalNotEligible;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class EligibilityAndBalancesError {
    public static final int $stable = 0;

    private EligibilityAndBalancesError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$EligibilityFailed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "error", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$EligibilityFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityFailed extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityFailed(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getEligibilityError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityError, "");
            this.error = getEligibilityError;
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getEligibilityError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityFailed(error=");
            sb.append(getEligibilityError);
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
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed) other).error);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed copy(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed eligibilityFailed, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getEligibilityError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                getEligibilityError = eligibilityFailed.error;
            }
            return eligibilityFailed.copy(getEligibilityError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$BalancesFailed;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;", "error", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$BalancesFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalancesFailed extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalancesFailed(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getAccountBalancesError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountBalancesError, "");
            this.error = getAccountBalancesError;
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getAccountBalancesError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalancesFailed(error=");
            sb.append(getAccountBalancesError);
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
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed) other).error);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed copy(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed balancesFailed, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getAccountBalancesError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                getAccountBalancesError = balancesFailed.error;
            }
            return balancesFailed.copy(getAccountBalancesError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$WithdrawalNotEligible;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WithdrawalNotEligible extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.WithdrawalNotEligible INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.WithdrawalNotEligible();

        public final int hashCode() {
            return -1559110254;
        }

        private WithdrawalNotEligible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "WithdrawalNotEligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.WithdrawalNotEligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError$NoCurrenciesAvailable;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoCurrenciesAvailable extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.NoCurrenciesAvailable INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.NoCurrenciesAvailable();

        public final int hashCode() {
            return 665612118;
        }

        private NoCurrenciesAvailable() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoCurrenciesAvailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.NoCurrenciesAvailable)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ EligibilityAndBalancesError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
