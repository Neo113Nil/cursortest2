package com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/Disallowed;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "web", "native", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "component2", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/Disallowed;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/CheckoutExperience;", "getWeb", "getNative"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Disallowed {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience native;
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience web;

    public Disallowed(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience2) {
        this.web = checkoutExperience;
        this.native = checkoutExperience2;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience getWeb() {
        return this.web;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience getNative() {
        return this.native;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience = this.web;
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience2 = this.native;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Disallowed(web=");
        sb.append(checkoutExperience);
        sb.append(", native=");
        sb.append(checkoutExperience2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience = this.web;
        int hashCode = checkoutExperience == null ? 0 : checkoutExperience.hashCode();
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience2 = this.native;
        return (hashCode * 31) + (checkoutExperience2 != null ? checkoutExperience2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed disallowed = (com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.web, disallowed.web) && kotlin.jvm.internal.Intrinsics.areEqual(this.native, disallowed.native);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed copy(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience web, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience r3) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed(web, r3);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience getNative() {
        return this.native;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience getWeb() {
        return this.web;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed copy$default(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.Disallowed disallowed, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.CheckoutExperience checkoutExperience2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            checkoutExperience = disallowed.web;
        }
        if ((i & 2) != 0) {
            checkoutExperience2 = disallowed.native;
        }
        return disallowed.copy(checkoutExperience, checkoutExperience2);
    }
}
