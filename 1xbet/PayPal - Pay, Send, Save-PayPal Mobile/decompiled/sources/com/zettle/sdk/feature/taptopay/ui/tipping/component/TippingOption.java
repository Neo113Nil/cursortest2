package com.zettle.sdk.feature.taptopay.ui.tipping.component;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/TippingOption;", "", "", "amount", "", "percentage", "<init>", "(JF)V", "component1", "()J", "component2", "()F", "copy", "(JF)Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/TippingOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getAmount", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPercentage"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TippingOption {
    public static final int $stable = 0;
    private final long amount;
    private final float percentage;

    public TippingOption(long j, float f) {
        this.amount = j;
        this.percentage = f;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final java.lang.String toString() {
        long j = this.amount;
        float f = this.percentage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TippingOption(amount=");
        sb.append(j);
        sb.append(", percentage=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.amount) * 31) + java.lang.Float.hashCode(this.percentage);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption tippingOption = (com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption) other;
        return this.amount == tippingOption.amount && java.lang.Float.compare(this.percentage, tippingOption.percentage) == 0;
    }

    public final com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption copy(long amount, float percentage) {
        return new com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption(amount, percentage);
    }

    /* renamed from: component2, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption copy$default(com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption tippingOption, long j, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = tippingOption.amount;
        }
        if ((i & 2) != 0) {
            f = tippingOption.percentage;
        }
        return tippingOption.copy(j, f);
    }
}
