package com.paypal.oslo.feature.moneymovement.api.ui.paymenttype;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", "", "", "label", "", "showInfoLinks", "autoCollapseOnSelection", "hardDefault", "showCollapseChevron", "<init>", "(Ljava/lang/String;ZZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZZZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Z", "getShowInfoLinks", "getAutoCollapseOnSelection", "getHardDefault", "getShowCollapseChevron", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentTypeAccordionConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig.Companion(null);
    private final boolean autoCollapseOnSelection;
    private final boolean hardDefault;
    private final java.lang.String label;
    private final boolean showCollapseChevron;
    private final boolean showInfoLinks;

    public PaymentTypeAccordionConfig(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        this.showInfoLinks = z;
        this.autoCollapseOnSelection = z2;
        this.hardDefault = z3;
        this.showCollapseChevron = z4;
    }

    public /* synthetic */ PaymentTypeAccordionConfig(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "As" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : true);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final boolean getShowInfoLinks() {
        return this.showInfoLinks;
    }

    public final boolean getAutoCollapseOnSelection() {
        return this.autoCollapseOnSelection;
    }

    public final boolean getHardDefault() {
        return this.hardDefault;
    }

    public final boolean getShowCollapseChevron() {
        return this.showCollapseChevron;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", "standard", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", "minimal", "hardDefault"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig standard() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig(null, false, false, false, false, 31, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig minimal() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig(null, false, false, false, false, 29, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig hardDefault() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig(null, false, false, true, false, 23, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        boolean z = this.showInfoLinks;
        boolean z2 = this.autoCollapseOnSelection;
        boolean z3 = this.hardDefault;
        boolean z4 = this.showCollapseChevron;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTypeAccordionConfig(label=");
        sb.append(str);
        sb.append(", showInfoLinks=");
        sb.append(z);
        sb.append(", autoCollapseOnSelection=");
        sb.append(z2);
        sb.append(", hardDefault=");
        sb.append(z3);
        sb.append(", showCollapseChevron=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.label.hashCode() * 31) + java.lang.Boolean.hashCode(this.showInfoLinks)) * 31) + java.lang.Boolean.hashCode(this.autoCollapseOnSelection)) * 31) + java.lang.Boolean.hashCode(this.hardDefault)) * 31) + java.lang.Boolean.hashCode(this.showCollapseChevron);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig = (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, paymentTypeAccordionConfig.label) && this.showInfoLinks == paymentTypeAccordionConfig.showInfoLinks && this.autoCollapseOnSelection == paymentTypeAccordionConfig.autoCollapseOnSelection && this.hardDefault == paymentTypeAccordionConfig.hardDefault && this.showCollapseChevron == paymentTypeAccordionConfig.showCollapseChevron;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig copy(java.lang.String label, boolean showInfoLinks, boolean autoCollapseOnSelection, boolean hardDefault, boolean showCollapseChevron) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig(label, showInfoLinks, autoCollapseOnSelection, hardDefault, showCollapseChevron);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowCollapseChevron() {
        return this.showCollapseChevron;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHardDefault() {
        return this.hardDefault;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAutoCollapseOnSelection() {
        return this.autoCollapseOnSelection;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowInfoLinks() {
        return this.showInfoLinks;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig copy$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentTypeAccordionConfig.label;
        }
        if ((i & 2) != 0) {
            z = paymentTypeAccordionConfig.showInfoLinks;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = paymentTypeAccordionConfig.autoCollapseOnSelection;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = paymentTypeAccordionConfig.hardDefault;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = paymentTypeAccordionConfig.showCollapseChevron;
        }
        return paymentTypeAccordionConfig.copy(str, z5, z6, z7, z4);
    }

    public PaymentTypeAccordionConfig() {
        this(null, false, false, false, false, 31, null);
    }
}
