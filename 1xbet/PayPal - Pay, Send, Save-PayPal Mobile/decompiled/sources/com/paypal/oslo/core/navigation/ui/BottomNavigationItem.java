package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/BottomNavigationItem;", "", "Lcom/paypal/pds/core/Icon;", "icon", "", "label", "Landroidx/navigation3/runtime/NavKey;", "destination", "selectedIcon", "contentDescription", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;Lcom/paypal/pds/core/Icon;Ljava/lang/String;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "()Landroidx/navigation3/runtime/NavKey;", "component4", "component5", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;Lcom/paypal/pds/core/Icon;Ljava/lang/String;)Lcom/paypal/oslo/core/navigation/ui/BottomNavigationItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getLabel", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "getSelectedIcon", "getContentDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BottomNavigationItem {
    public static final int $stable = 0;
    private final java.lang.String contentDescription;
    private final androidx.navigation3.runtime.NavKey destination;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String label;
    private final com.paypal.pds.core.Icon selectedIcon;

    public BottomNavigationItem(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.navigation3.runtime.NavKey navKey, com.paypal.pds.core.Icon icon2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.icon = icon;
        this.label = str;
        this.destination = navKey;
        this.selectedIcon = icon2;
        this.contentDescription = str2;
    }

    public /* synthetic */ BottomNavigationItem(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.navigation3.runtime.NavKey navKey, com.paypal.pds.core.Icon icon2, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, str, navKey, (i & 8) != 0 ? null : icon2, (i & 16) != 0 ? str : str2);
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public final com.paypal.pds.core.Icon getSelectedIcon() {
        return this.selectedIcon;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.String str = this.label;
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        com.paypal.pds.core.Icon icon2 = this.selectedIcon;
        java.lang.String str2 = this.contentDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BottomNavigationItem(icon=");
        sb.append(icon);
        sb.append(", label=");
        sb.append(str);
        sb.append(", destination=");
        sb.append(navKey);
        sb.append(", selectedIcon=");
        sb.append(icon2);
        sb.append(", contentDescription=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.icon.hashCode();
        int hashCode2 = this.label.hashCode();
        int hashCode3 = this.destination.hashCode();
        com.paypal.pds.core.Icon icon = this.selectedIcon;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (icon == null ? 0 : icon.hashCode())) * 31) + this.contentDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.navigation.ui.BottomNavigationItem)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.BottomNavigationItem bottomNavigationItem = (com.paypal.oslo.core.navigation.ui.BottomNavigationItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, bottomNavigationItem.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, bottomNavigationItem.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, bottomNavigationItem.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedIcon, bottomNavigationItem.selectedIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, bottomNavigationItem.contentDescription);
    }

    public final com.paypal.oslo.core.navigation.ui.BottomNavigationItem copy(com.paypal.pds.core.Icon icon, java.lang.String label, androidx.navigation3.runtime.NavKey destination, com.paypal.pds.core.Icon selectedIcon, java.lang.String contentDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDescription, "");
        return new com.paypal.oslo.core.navigation.ui.BottomNavigationItem(icon, label, destination, selectedIcon, contentDescription);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.Icon getSelectedIcon() {
        return this.selectedIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public static /* synthetic */ com.paypal.oslo.core.navigation.ui.BottomNavigationItem copy$default(com.paypal.oslo.core.navigation.ui.BottomNavigationItem bottomNavigationItem, com.paypal.pds.core.Icon icon, java.lang.String str, androidx.navigation3.runtime.NavKey navKey, com.paypal.pds.core.Icon icon2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = bottomNavigationItem.icon;
        }
        if ((i & 2) != 0) {
            str = bottomNavigationItem.label;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            navKey = bottomNavigationItem.destination;
        }
        androidx.navigation3.runtime.NavKey navKey2 = navKey;
        if ((i & 8) != 0) {
            icon2 = bottomNavigationItem.selectedIcon;
        }
        com.paypal.pds.core.Icon icon3 = icon2;
        if ((i & 16) != 0) {
            str2 = bottomNavigationItem.contentDescription;
        }
        return bottomNavigationItem.copy(icon, str3, navKey2, icon3, str2);
    }
}
