package com.paypal.oslo.feature.moneymovement.api.ui.shipping;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", "", "", "label", "", "showNoShipping", "showAddAddress", "autoCollapseOnSelection", "<init>", "(Ljava/lang/String;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Z", "getShowNoShipping", "getShowAddAddress", "getAutoCollapseOnSelection", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShippingAccordionConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig.Companion(null);
    private final boolean autoCollapseOnSelection;
    private final java.lang.String label;
    private final boolean showAddAddress;
    private final boolean showNoShipping;

    public ShippingAccordionConfig(java.lang.String str, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        this.showNoShipping = z;
        this.showAddAddress = z2;
        this.autoCollapseOnSelection = z3;
    }

    public /* synthetic */ ShippingAccordionConfig(java.lang.String str, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Ship" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final boolean getShowNoShipping() {
        return this.showNoShipping;
    }

    public final boolean getShowAddAddress() {
        return this.showAddAddress;
    }

    public final boolean getAutoCollapseOnSelection() {
        return this.autoCollapseOnSelection;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", "standard", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", "digitalGoods", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig standard() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig(null, false, false, false, 15, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig digitalGoods() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig(null, true, false, false, 9, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig required() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig(null, false, false, false, 13, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        boolean z = this.showNoShipping;
        boolean z2 = this.showAddAddress;
        boolean z3 = this.autoCollapseOnSelection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingAccordionConfig(label=");
        sb.append(str);
        sb.append(", showNoShipping=");
        sb.append(z);
        sb.append(", showAddAddress=");
        sb.append(z2);
        sb.append(", autoCollapseOnSelection=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + java.lang.Boolean.hashCode(this.showNoShipping)) * 31) + java.lang.Boolean.hashCode(this.showAddAddress)) * 31) + java.lang.Boolean.hashCode(this.autoCollapseOnSelection);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig = (com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, shippingAccordionConfig.label) && this.showNoShipping == shippingAccordionConfig.showNoShipping && this.showAddAddress == shippingAccordionConfig.showAddAddress && this.autoCollapseOnSelection == shippingAccordionConfig.autoCollapseOnSelection;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig copy(java.lang.String label, boolean showNoShipping, boolean showAddAddress, boolean autoCollapseOnSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig(label, showNoShipping, showAddAddress, autoCollapseOnSelection);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAutoCollapseOnSelection() {
        return this.autoCollapseOnSelection;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowAddAddress() {
        return this.showAddAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowNoShipping() {
        return this.showNoShipping;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig copy$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = shippingAccordionConfig.label;
        }
        if ((i & 2) != 0) {
            z = shippingAccordionConfig.showNoShipping;
        }
        if ((i & 4) != 0) {
            z2 = shippingAccordionConfig.showAddAddress;
        }
        if ((i & 8) != 0) {
            z3 = shippingAccordionConfig.autoCollapseOnSelection;
        }
        return shippingAccordionConfig.copy(str, z, z2, z3);
    }

    public ShippingAccordionConfig() {
        this(null, false, false, false, 15, null);
    }
}
