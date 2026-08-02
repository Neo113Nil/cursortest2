package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "", "Valid", "BelowMinimum", "NearHoldings", "ExceedsHoldings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$BelowMinimum;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$ExceedsHoldings;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$NearHoldings;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SellAmountValidationResult {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$Valid;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "Ljava/math/BigDecimal;", "amount", "<init>", "(Ljava/math/BigDecimal;)V", "component1", "()Ljava/math/BigDecimal;", "copy", "(Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$Valid;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid implements com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult {
        public static final int $stable = 0;
        private final java.math.BigDecimal amount;

        public Valid(java.math.BigDecimal bigDecimal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.amount = bigDecimal;
        }

        public final java.math.BigDecimal getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.math.BigDecimal bigDecimal = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid(amount=");
            sb.append(bigDecimal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid) other).amount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid copy(java.math.BigDecimal amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.math.BigDecimal getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid copy$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid valid, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = valid.amount;
            }
            return valid.copy(bigDecimal);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$BelowMinimum;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "Ljava/math/BigDecimal;", "minimumAmount", "<init>", "(Ljava/math/BigDecimal;)V", "component1", "()Ljava/math/BigDecimal;", "copy", "(Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$BelowMinimum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getMinimumAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BelowMinimum implements com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult {
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum) other).minimumAmount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum copy(java.math.BigDecimal minimumAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum(minimumAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.math.BigDecimal getMinimumAmount() {
            return this.minimumAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum copy$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum belowMinimum, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = belowMinimum.minimumAmount;
            }
            return belowMinimum.copy(bigDecimal);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$NearHoldings;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NearHoldings implements com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.NearHoldings INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.NearHoldings();

        public final int hashCode() {
            return -169422009;
        }

        private NearHoldings() {
        }

        public final java.lang.String toString() {
            return "NearHoldings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.NearHoldings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult$ExceedsHoldings;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExceedsHoldings implements com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.ExceedsHoldings INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.ExceedsHoldings();

        public final int hashCode() {
            return 905020192;
        }

        private ExceedsHoldings() {
        }

        public final java.lang.String toString() {
            return "ExceedsHoldings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.ExceedsHoldings)) {
                return false;
            }
            return true;
        }
    }
}
