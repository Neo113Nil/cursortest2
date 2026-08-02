package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;", "", "", "name", "", "logo", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", com.visa.cbp.getEncExpo.warmup, "getLogo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Merchant {
    public static final int $stable = 0;
    private final int logo;
    private final java.lang.String name;

    public Merchant(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.logo = i;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final int getLogo() {
        return this.logo;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        int i = this.logo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(name=");
        sb.append(str);
        sb.append(", logo=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + java.lang.Integer.hashCode(this.logo);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.loyalty.ui.Merchant)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant = (com.paypal.oslo.feature.wallet.loyalty.ui.Merchant) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchant.name) && this.logo == merchant.logo;
    }

    public final com.paypal.oslo.feature.wallet.loyalty.ui.Merchant copy(java.lang.String name2, int logo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant(name2, logo);
    }

    /* renamed from: component2, reason: from getter */
    public final int getLogo() {
        return this.logo;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.loyalty.ui.Merchant copy$default(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = merchant.name;
        }
        if ((i2 & 2) != 0) {
            i = merchant.logo;
        }
        return merchant.copy(str, i);
    }
}
