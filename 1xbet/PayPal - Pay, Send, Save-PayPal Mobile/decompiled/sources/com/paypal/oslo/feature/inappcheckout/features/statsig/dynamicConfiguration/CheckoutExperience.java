package com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "", "", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/TokenType;", "merchantUpgrade", "noMerchantUpgrade", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMerchantUpgrade", "getNoMerchantUpgrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CheckoutExperience {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> merchantUpgrade;
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> noMerchantUpgrade;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutExperience(java.util.List<? extends com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list2) {
        this.merchantUpgrade = list;
        this.noMerchantUpgrade = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> getMerchantUpgrade() {
        return this.merchantUpgrade;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> getNoMerchantUpgrade() {
        return this.noMerchantUpgrade;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list = this.merchantUpgrade;
        java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list2 = this.noMerchantUpgrade;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutExperience(merchantUpgrade=");
        sb.append(list);
        sb.append(", noMerchantUpgrade=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list = this.merchantUpgrade;
        int hashCode = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> list2 = this.noMerchantUpgrade;
        return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience = (com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantUpgrade, checkoutExperience.merchantUpgrade) && kotlin.jvm.internal.Intrinsics.areEqual(this.noMerchantUpgrade, checkoutExperience.noMerchantUpgrade);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience copy(java.util.List<? extends com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> merchantUpgrade, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> noMerchantUpgrade) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience(merchantUpgrade, noMerchantUpgrade);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> component2() {
        return this.noMerchantUpgrade;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> component1() {
        return this.merchantUpgrade;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience copy$default(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = checkoutExperience.merchantUpgrade;
        }
        if ((i & 2) != 0) {
            list2 = checkoutExperience.noMerchantUpgrade;
        }
        return checkoutExperience.copy(list, list2);
    }
}
