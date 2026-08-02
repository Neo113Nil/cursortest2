package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/InvalidAmountReason;", "", "<init>", "()V", "AboveMaximum", "BelowMinimum", "InvalidBreakdown", "Lcom/zettle/sdk/InvalidAmountReason$AboveMaximum;", "Lcom/zettle/sdk/InvalidAmountReason$BelowMinimum;", "Lcom/zettle/sdk/InvalidAmountReason$InvalidBreakdown;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class InvalidAmountReason {
    private InvalidAmountReason() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/zettle/sdk/InvalidAmountReason$AboveMaximum;", "Lcom/zettle/sdk/InvalidAmountReason;", "", "maxAmount", "Ljava/util/Currency;", "currency", "<init>", "(JLjava/util/Currency;)V", "component1", "()J", "component2", "()Ljava/util/Currency;", "copy", "(JLjava/util/Currency;)Lcom/zettle/sdk/InvalidAmountReason$AboveMaximum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "J", "getMaxAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AboveMaximum extends com.zettle.sdk.InvalidAmountReason {
        private final java.util.Currency currency;
        private final long maxAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveMaximum(long j, java.util.Currency currency) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            this.maxAmount = j;
            this.currency = currency;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public final long getMaxAmount() {
            return this.maxAmount;
        }

        public final java.lang.String toString() {
            long j = this.maxAmount;
            java.util.Currency currency = this.currency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AboveMaximum(maxAmount=");
            sb.append(j);
            sb.append(", currency=");
            sb.append(currency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.maxAmount) * 31) + this.currency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.InvalidAmountReason.AboveMaximum)) {
                return false;
            }
            com.zettle.sdk.InvalidAmountReason.AboveMaximum aboveMaximum = (com.zettle.sdk.InvalidAmountReason.AboveMaximum) other;
            return this.maxAmount == aboveMaximum.maxAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, aboveMaximum.currency);
        }

        public final com.zettle.sdk.InvalidAmountReason.AboveMaximum copy(long maxAmount, java.util.Currency currency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            return new com.zettle.sdk.InvalidAmountReason.AboveMaximum(maxAmount, currency);
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component1, reason: from getter */
        public final long getMaxAmount() {
            return this.maxAmount;
        }

        public static /* synthetic */ com.zettle.sdk.InvalidAmountReason.AboveMaximum copy$default(com.zettle.sdk.InvalidAmountReason.AboveMaximum aboveMaximum, long j, java.util.Currency currency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = aboveMaximum.maxAmount;
            }
            if ((i & 2) != 0) {
                currency = aboveMaximum.currency;
            }
            return aboveMaximum.copy(j, currency);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/zettle/sdk/InvalidAmountReason$BelowMinimum;", "Lcom/zettle/sdk/InvalidAmountReason;", "", "minAmount", "Ljava/util/Currency;", "currency", "<init>", "(JLjava/util/Currency;)V", "component1", "()J", "component2", "()Ljava/util/Currency;", "copy", "(JLjava/util/Currency;)Lcom/zettle/sdk/InvalidAmountReason$BelowMinimum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "J", "getMinAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BelowMinimum extends com.zettle.sdk.InvalidAmountReason {
        private final java.util.Currency currency;
        private final long minAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BelowMinimum(long j, java.util.Currency currency) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            this.minAmount = j;
            this.currency = currency;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public final long getMinAmount() {
            return this.minAmount;
        }

        public final java.lang.String toString() {
            long j = this.minAmount;
            java.util.Currency currency = this.currency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BelowMinimum(minAmount=");
            sb.append(j);
            sb.append(", currency=");
            sb.append(currency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.minAmount) * 31) + this.currency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.InvalidAmountReason.BelowMinimum)) {
                return false;
            }
            com.zettle.sdk.InvalidAmountReason.BelowMinimum belowMinimum = (com.zettle.sdk.InvalidAmountReason.BelowMinimum) other;
            return this.minAmount == belowMinimum.minAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, belowMinimum.currency);
        }

        public final com.zettle.sdk.InvalidAmountReason.BelowMinimum copy(long minAmount, java.util.Currency currency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            return new com.zettle.sdk.InvalidAmountReason.BelowMinimum(minAmount, currency);
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component1, reason: from getter */
        public final long getMinAmount() {
            return this.minAmount;
        }

        public static /* synthetic */ com.zettle.sdk.InvalidAmountReason.BelowMinimum copy$default(com.zettle.sdk.InvalidAmountReason.BelowMinimum belowMinimum, long j, java.util.Currency currency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = belowMinimum.minAmount;
            }
            if ((i & 2) != 0) {
                currency = belowMinimum.currency;
            }
            return belowMinimum.copy(j, currency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/InvalidAmountReason$InvalidBreakdown;", "Lcom/zettle/sdk/InvalidAmountReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidBreakdown extends com.zettle.sdk.InvalidAmountReason {
        public static final com.zettle.sdk.InvalidAmountReason.InvalidBreakdown INSTANCE = new com.zettle.sdk.InvalidAmountReason.InvalidBreakdown();

        private InvalidBreakdown() {
            super(null);
        }
    }

    public /* synthetic */ InvalidAmountReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
