package com.paypal.oslo.core.navigation.ui.l1;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "label", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;Lcom/paypal/pds/core/Icon;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/pds/core/Icon;", "copy", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "Ljava/lang/String;", "getLabel", "Lcom/paypal/pds/core/Icon;", "getIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TabDestination {
    public static final int $stable = 8;
    private final androidx.navigation3.runtime.NavKey destination;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String label;

    public TabDestination(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.destination = navKey;
        this.label = str;
        this.icon = icon;
    }

    public /* synthetic */ TabDestination(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, com.paypal.pds.core.Icon icon, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(navKey, str, (i & 4) != 0 ? null : icon);
    }

    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String toString() {
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        java.lang.String str = this.label;
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TabDestination(destination=");
        sb.append(navKey);
        sb.append(", label=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.destination.hashCode();
        int hashCode2 = this.label.hashCode();
        com.paypal.pds.core.Icon icon = this.icon;
        return (((hashCode * 31) + hashCode2) * 31) + (icon == null ? 0 : icon.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.navigation.ui.l1.TabDestination)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination = (com.paypal.oslo.core.navigation.ui.l1.TabDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.destination, tabDestination.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, tabDestination.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, tabDestination.icon);
    }

    public final com.paypal.oslo.core.navigation.ui.l1.TabDestination copy(androidx.navigation3.runtime.NavKey destination, java.lang.String label, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.core.navigation.ui.l1.TabDestination(destination, label, icon);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public static /* synthetic */ com.paypal.oslo.core.navigation.ui.l1.TabDestination copy$default(com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination, androidx.navigation3.runtime.NavKey navKey, java.lang.String str, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navKey = tabDestination.destination;
        }
        if ((i & 2) != 0) {
            str = tabDestination.label;
        }
        if ((i & 4) != 0) {
            icon = tabDestination.icon;
        }
        return tabDestination.copy(navKey, str, icon);
    }
}
