package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Error;", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Loading;", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class EligibilityState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Loading;", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bankingbundle.ui.EligibilityState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Loading INSTANCE = new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Loading();

        public final int hashCode() {
            return -567114603;
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
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private EligibilityState() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Success;", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState;", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "eligibility", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "copy", "(Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;)Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "getEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bankingbundle.ui.EligibilityState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility eligibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility bankingBundleEligibility) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleEligibility, "");
            this.eligibility = bankingBundleEligibility;
        }

        public final com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility getEligibility() {
            return this.eligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility bankingBundleEligibility = this.eligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(eligibility=");
            sb.append(bankingBundleEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibility, ((com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success) other).eligibility);
        }

        public final com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success copy(com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility eligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibility, "");
            return new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success(eligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility getEligibility() {
            return this.eligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success copy$default(com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success success, com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility bankingBundleEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankingBundleEligibility = success.eligibility;
            }
            return success.copy(bankingBundleEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Error;", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "error", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;)V", "component1", "()Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "copy", "(Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;)Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bankingbundle.ui.EligibilityState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError bankingBundleError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleError, "");
            this.error = bankingBundleError;
        }

        public final com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError bankingBundleError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(bankingBundleError);
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
            return (other instanceof com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error) other).error);
        }

        public final com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error copy(com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error copy$default(com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error error, com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError bankingBundleError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankingBundleError = error.error;
            }
            return error.copy(bankingBundleError);
        }
    }

    public /* synthetic */ EligibilityState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
