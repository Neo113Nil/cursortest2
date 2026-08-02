package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult;", "", "Valid", "BelowMinimum", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult$BelowMinimum;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SellAllAmountValidationResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult$Valid;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid implements com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.Valid INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.Valid();

        public final int hashCode() {
            return 1825067884;
        }

        private Valid() {
        }

        public final java.lang.String toString() {
            return "Valid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.Valid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult$BelowMinimum;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult;", "Ljava/math/BigDecimal;", "minimumAmount", "<init>", "(Ljava/math/BigDecimal;)V", "component1", "()Ljava/math/BigDecimal;", "copy", "(Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult$BelowMinimum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getMinimumAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BelowMinimum implements com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult {
        public static final int $stable = 0;
        private final java.math.BigDecimal minimumAmount;

        public BelowMinimum(java.math.BigDecimal bigDecimal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.minimumAmount = bigDecimal;
        }

        public final java.math.BigDecimal getMinimumAmount() {
            return this.minimumAmount;
        }

        public final java.lang.String toString() {
            java.math.BigDecimal bigDecimal = this.minimumAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BelowMinimum(minimumAmount=");
            sb.append(bigDecimal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.minimumAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum) other).minimumAmount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum copy(java.math.BigDecimal minimumAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum(minimumAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.math.BigDecimal getMinimumAmount() {
            return this.minimumAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum copy$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum belowMinimum, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = belowMinimum.minimumAmount;
            }
            return belowMinimum.copy(bigDecimal);
        }
    }
}
