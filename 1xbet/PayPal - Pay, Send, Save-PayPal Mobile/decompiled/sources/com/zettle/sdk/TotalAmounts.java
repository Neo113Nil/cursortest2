package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/zettle/sdk/TotalAmounts;", "", "Lcom/zettle/sdk/Amount;", "total", "Lcom/zettle/sdk/AmountBreakdown;", "breakdown", "<init>", "(Lcom/zettle/sdk/Amount;Lcom/zettle/sdk/AmountBreakdown;)V", "component1", "()Lcom/zettle/sdk/Amount;", "component2", "()Lcom/zettle/sdk/AmountBreakdown;", "copy", "(Lcom/zettle/sdk/Amount;Lcom/zettle/sdk/AmountBreakdown;)Lcom/zettle/sdk/TotalAmounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/AmountBreakdown;", "getBreakdown", "Lcom/zettle/sdk/Amount;", "getTotal", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TotalAmounts {
    private final com.zettle.sdk.AmountBreakdown breakdown;
    private final com.zettle.sdk.Amount total;

    public TotalAmounts(com.zettle.sdk.Amount amount, com.zettle.sdk.AmountBreakdown amountBreakdown) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountBreakdown, "");
        this.total = amount;
        this.breakdown = amountBreakdown;
    }

    public final com.zettle.sdk.Amount getTotal() {
        return this.total;
    }

    public final com.zettle.sdk.AmountBreakdown getBreakdown() {
        return this.breakdown;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/TotalAmounts$Builder;", "", "<init>", "()V", "Lcom/zettle/sdk/TotalAmounts;", "build", "()Lcom/zettle/sdk/TotalAmounts;", "Ljava/util/Currency;", "cur", "currency", "(Ljava/util/Currency;)Lcom/zettle/sdk/TotalAmounts$Builder;", "Lcom/zettle/sdk/Gratuity;", "grat", "gratuity", "(Lcom/zettle/sdk/Gratuity;)Lcom/zettle/sdk/TotalAmounts$Builder;", "", "order", "orderAmount", "(J)Lcom/zettle/sdk/TotalAmounts$Builder;", "tax", "taxAmount", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Currency;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/Gratuity;", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Long;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.util.Currency Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.Long getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private com.zettle.sdk.Gratuity getHighSpeedVideoFpsRanges;

        public Builder() {
            java.util.Currency currency = java.util.Currency.getInstance("USD");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
            this.Camera2StreamConfigurationMap = currency;
            this.getHighSpeedVideoFpsRanges = com.zettle.sdk.Gratuity.None.INSTANCE;
        }

        public final com.zettle.sdk.TotalAmounts.Builder currency(java.util.Currency cur) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cur, "");
            this.Camera2StreamConfigurationMap = cur;
            return this;
        }

        public final com.zettle.sdk.TotalAmounts.Builder orderAmount(long order) {
            if (order < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount value (");
                sb.append(order);
                sb.append(") must be positive number");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = order;
            return this;
        }

        public final com.zettle.sdk.TotalAmounts.Builder taxAmount(long tax) {
            if (tax < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount value (");
                sb.append(tax);
                sb.append(") must be positive number");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoSizes = java.lang.Long.valueOf(tax);
            return this;
        }

        public final com.zettle.sdk.TotalAmounts.Builder gratuity(com.zettle.sdk.Gratuity grat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grat, "");
            if (grat instanceof com.zettle.sdk.Gratuity.GratuityAmount) {
                com.zettle.sdk.Gratuity.GratuityAmount gratuityAmount = (com.zettle.sdk.Gratuity.GratuityAmount) grat;
                if (gratuityAmount.getGratuityAmount().getValue() < 0) {
                    long value = gratuityAmount.getGratuityAmount().getValue();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount value (");
                    sb.append(value);
                    sb.append(") must be positive number");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            this.getHighSpeedVideoFpsRanges = grat;
            return this;
        }

        public final com.zettle.sdk.TotalAmounts build() {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Long l = this.getHighSpeedVideoSizes;
            long j2 = 0;
            long longValue = l != null ? l.longValue() : 0L;
            com.zettle.sdk.Gratuity gratuity = this.getHighSpeedVideoFpsRanges;
            if (gratuity instanceof com.zettle.sdk.Gratuity.GratuityAmount) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(gratuity, "");
                j2 = ((com.zettle.sdk.Gratuity.GratuityAmount) gratuity).getGratuityAmount().getValue();
            }
            com.zettle.sdk.Amount amount = new com.zettle.sdk.Amount(j + longValue + j2, this.Camera2StreamConfigurationMap);
            com.zettle.sdk.Amount amount2 = new com.zettle.sdk.Amount(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            java.lang.Long l2 = this.getHighSpeedVideoSizes;
            return new com.zettle.sdk.TotalAmounts(amount, new com.zettle.sdk.AmountBreakdown(amount2, this.getHighSpeedVideoFpsRanges, l2 != null ? new com.zettle.sdk.Amount(l2.longValue(), this.Camera2StreamConfigurationMap) : null));
        }
    }

    public final java.lang.String toString() {
        com.zettle.sdk.Amount amount = this.total;
        com.zettle.sdk.AmountBreakdown amountBreakdown = this.breakdown;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmounts(total=");
        sb.append(amount);
        sb.append(", breakdown=");
        sb.append(amountBreakdown);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.total.hashCode() * 31) + this.breakdown.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.TotalAmounts)) {
            return false;
        }
        com.zettle.sdk.TotalAmounts totalAmounts = (com.zettle.sdk.TotalAmounts) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.total, totalAmounts.total) && kotlin.jvm.internal.Intrinsics.areEqual(this.breakdown, totalAmounts.breakdown);
    }

    public final com.zettle.sdk.TotalAmounts copy(com.zettle.sdk.Amount total, com.zettle.sdk.AmountBreakdown breakdown) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(total, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(breakdown, "");
        return new com.zettle.sdk.TotalAmounts(total, breakdown);
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.AmountBreakdown getBreakdown() {
        return this.breakdown;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.Amount getTotal() {
        return this.total;
    }

    public static /* synthetic */ com.zettle.sdk.TotalAmounts copy$default(com.zettle.sdk.TotalAmounts totalAmounts, com.zettle.sdk.Amount amount, com.zettle.sdk.AmountBreakdown amountBreakdown, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amount = totalAmounts.total;
        }
        if ((i & 2) != 0) {
            amountBreakdown = totalAmounts.breakdown;
        }
        return totalAmounts.copy(amount, amountBreakdown);
    }
}
