package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/app/navigation/BottomNavUiItem;", "", "Lcom/paypal/pds/core/Icon;", "icon", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "labelResId", "contentDescriptionResId", "selectedIcon", "<init>", "(Lcom/paypal/pds/core/Icon;Landroidx/navigation3/runtime/NavKey;IILcom/paypal/pds/core/Icon;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Landroidx/navigation3/runtime/NavKey;", "component3", "()I", "component4", "component5", "copy", "(Lcom/paypal/pds/core/Icon;Landroidx/navigation3/runtime/NavKey;IILcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/app/navigation/BottomNavUiItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon", "Landroidx/navigation3/runtime/NavKey;", "getDestination", com.visa.cbp.getEncExpo.warmup, "getLabelResId", "getContentDescriptionResId", "getSelectedIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BottomNavUiItem {
    public static final int $stable = 8;
    private final int contentDescriptionResId;
    private final androidx.navigation3.runtime.NavKey destination;
    private final com.paypal.pds.core.Icon icon;
    private final int labelResId;
    private final com.paypal.pds.core.Icon selectedIcon;

    public BottomNavUiItem(com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey navKey, int i, int i2, com.paypal.pds.core.Icon icon2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        this.icon = icon;
        this.destination = navKey;
        this.labelResId = i;
        this.contentDescriptionResId = i2;
        this.selectedIcon = icon2;
    }

    public /* synthetic */ BottomNavUiItem(com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey navKey, int i, int i2, com.paypal.pds.core.Icon icon2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, navKey, i, (i3 & 8) != 0 ? i : i2, (i3 & 16) != 0 ? null : icon2);
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final int getContentDescriptionResId() {
        return this.contentDescriptionResId;
    }

    public final com.paypal.pds.core.Icon getSelectedIcon() {
        return this.selectedIcon;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        int i = this.labelResId;
        int i2 = this.contentDescriptionResId;
        com.paypal.pds.core.Icon icon2 = this.selectedIcon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BottomNavUiItem(icon=");
        sb.append(icon);
        sb.append(", destination=");
        sb.append(navKey);
        sb.append(", labelResId=");
        sb.append(i);
        sb.append(", contentDescriptionResId=");
        sb.append(i2);
        sb.append(", selectedIcon=");
        sb.append(icon2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.icon.hashCode();
        int hashCode2 = this.destination.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.labelResId);
        int hashCode4 = java.lang.Integer.hashCode(this.contentDescriptionResId);
        com.paypal.pds.core.Icon icon = this.selectedIcon;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (icon == null ? 0 : icon.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.app.navigation.BottomNavUiItem)) {
            return false;
        }
        com.paypal.oslo.app.navigation.BottomNavUiItem bottomNavUiItem = (com.paypal.oslo.app.navigation.BottomNavUiItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, bottomNavUiItem.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, bottomNavUiItem.destination) && this.labelResId == bottomNavUiItem.labelResId && this.contentDescriptionResId == bottomNavUiItem.contentDescriptionResId && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedIcon, bottomNavUiItem.selectedIcon);
    }

    public final com.paypal.oslo.app.navigation.BottomNavUiItem copy(com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey destination, int labelResId, int contentDescriptionResId, com.paypal.pds.core.Icon selectedIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return new com.paypal.oslo.app.navigation.BottomNavUiItem(icon, destination, labelResId, contentDescriptionResId, selectedIcon);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.pds.core.Icon getSelectedIcon() {
        return this.selectedIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final int getContentDescriptionResId() {
        return this.contentDescriptionResId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLabelResId() {
        return this.labelResId;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public static /* synthetic */ com.paypal.oslo.app.navigation.BottomNavUiItem copy$default(com.paypal.oslo.app.navigation.BottomNavUiItem bottomNavUiItem, com.paypal.pds.core.Icon icon, androidx.navigation3.runtime.NavKey navKey, int i, int i2, com.paypal.pds.core.Icon icon2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            icon = bottomNavUiItem.icon;
        }
        if ((i3 & 2) != 0) {
            navKey = bottomNavUiItem.destination;
        }
        androidx.navigation3.runtime.NavKey navKey2 = navKey;
        if ((i3 & 4) != 0) {
            i = bottomNavUiItem.labelResId;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = bottomNavUiItem.contentDescriptionResId;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            icon2 = bottomNavUiItem.selectedIcon;
        }
        return bottomNavUiItem.copy(icon, navKey2, i4, i5, icon2);
    }
}
