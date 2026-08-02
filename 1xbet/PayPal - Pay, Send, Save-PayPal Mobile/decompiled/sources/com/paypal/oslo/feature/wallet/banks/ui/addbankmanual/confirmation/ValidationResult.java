package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult;", "", "<init>", "()V", "Valid", "Invalid", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult$Invalid;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ValidationResult {
    public static final int $stable = 0;

    private ValidationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult$Valid;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Valid INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Valid();

        public final int hashCode() {
            return -437678637;
        }

        private Valid() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Valid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Valid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult$Invalid;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult;", "", "isFirstAmountInvalid", "isSecondAmountInvalid", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult$Invalid;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Invalid extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult {
        public static final int $stable = 0;
        private final boolean isFirstAmountInvalid;
        private final boolean isSecondAmountInvalid;

        public Invalid(boolean z, boolean z2) {
            super(null);
            this.isFirstAmountInvalid = z;
            this.isSecondAmountInvalid = z2;
        }

        public final boolean isFirstAmountInvalid() {
            return this.isFirstAmountInvalid;
        }

        public final boolean isSecondAmountInvalid() {
            return this.isSecondAmountInvalid;
        }

        public final java.lang.String toString() {
            boolean z = this.isFirstAmountInvalid;
            boolean z2 = this.isSecondAmountInvalid;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(isFirstAmountInvalid=");
            sb.append(z);
            sb.append(", isSecondAmountInvalid=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isFirstAmountInvalid) * 31) + java.lang.Boolean.hashCode(this.isSecondAmountInvalid);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid invalid = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid) other;
            return this.isFirstAmountInvalid == invalid.isFirstAmountInvalid && this.isSecondAmountInvalid == invalid.isSecondAmountInvalid;
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid copy(boolean isFirstAmountInvalid, boolean isSecondAmountInvalid) {
            return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid(isFirstAmountInvalid, isSecondAmountInvalid);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSecondAmountInvalid() {
            return this.isSecondAmountInvalid;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFirstAmountInvalid() {
            return this.isFirstAmountInvalid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid invalid, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = invalid.isFirstAmountInvalid;
            }
            if ((i & 2) != 0) {
                z2 = invalid.isSecondAmountInvalid;
            }
            return invalid.copy(z, z2);
        }
    }

    public /* synthetic */ ValidationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
