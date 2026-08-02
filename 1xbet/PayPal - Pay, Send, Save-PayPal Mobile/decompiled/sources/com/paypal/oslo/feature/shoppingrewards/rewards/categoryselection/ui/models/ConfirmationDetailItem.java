package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/ConfirmationDetailItem;", "", "Lcom/paypal/pds/core/Icon;", "icon", "", "title", "subtitle", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/ConfirmationDetailItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getTitle", "getSubtitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmationDetailItem {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    public ConfirmationDetailItem(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.icon = icon;
        this.title = str;
        this.subtitle = str2;
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

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.String str = this.title;
        java.lang.String str2 = this.subtitle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationDetailItem(icon=");
        sb.append(icon);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem confirmationDetailItem = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, confirmationDetailItem.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, confirmationDetailItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, confirmationDetailItem.subtitle);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem copy(com.paypal.pds.core.Icon icon, java.lang.String title, java.lang.String subtitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem(icon, title, subtitle);
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

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem confirmationDetailItem, com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = confirmationDetailItem.icon;
        }
        if ((i & 2) != 0) {
            str = confirmationDetailItem.title;
        }
        if ((i & 4) != 0) {
            str2 = confirmationDetailItem.subtitle;
        }
        return confirmationDetailItem.copy(icon, str, str2);
    }
}
