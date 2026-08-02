package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/checkoutbottomsheet/CheckoutBottomSheetUiData;", "", "Lcom/paypal/pds/core/Icon;", "icon", "", "title", "subtitle", "ctaText", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/checkoutbottomsheet/CheckoutBottomSheetUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getTitle", "getSubtitle", "getCtaText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CheckoutBottomSheetUiData {
    public static final int $stable = 0;
    private final java.lang.String ctaText;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    public CheckoutBottomSheetUiData(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.icon = icon;
        this.title = str;
        this.subtitle = str2;
        this.ctaText = str3;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getCtaText() {
        return this.ctaText;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.String str = this.title;
        java.lang.String str2 = this.subtitle;
        java.lang.String str3 = this.ctaText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutBottomSheetUiData(icon=");
        sb.append(icon);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", ctaText=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.ctaText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, checkoutBottomSheetUiData.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, checkoutBottomSheetUiData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, checkoutBottomSheetUiData.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaText, checkoutBottomSheetUiData.ctaText);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData copy(com.paypal.pds.core.Icon icon, java.lang.String title, java.lang.String subtitle, java.lang.String ctaText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaText, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData(icon, title, subtitle, ctaText);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.checkoutbottomsheet.CheckoutBottomSheetUiData checkoutBottomSheetUiData, com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = checkoutBottomSheetUiData.icon;
        }
        if ((i & 2) != 0) {
            str = checkoutBottomSheetUiData.title;
        }
        if ((i & 4) != 0) {
            str2 = checkoutBottomSheetUiData.subtitle;
        }
        if ((i & 8) != 0) {
            str3 = checkoutBottomSheetUiData.ctaText;
        }
        return checkoutBottomSheetUiData.copy(icon, str, str2, str3);
    }
}
