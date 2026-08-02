package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/CurrencyPickerItem;", "", "", "label", "Landroidx/compose/ui/graphics/painter/Painter;", "avatarPainter", "avatarContentDescription", "", "showDropdownWhenSelected", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/compose/ui/graphics/painter/Painter;", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Z)Lcom/paypal/oslo/core/commonui/components/CurrencyPickerItem;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Landroidx/compose/ui/graphics/painter/Painter;", "getAvatarPainter", "getAvatarContentDescription", "Z", "getShowDropdownWhenSelected"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CurrencyPickerItem {
    public static final int $stable = androidx.compose.ui.graphics.painter.Painter.$stable;
    private final java.lang.String avatarContentDescription;
    private final androidx.compose.ui.graphics.painter.Painter avatarPainter;
    private final java.lang.String label;
    private final boolean showDropdownWhenSelected;

    public CurrencyPickerItem(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        this.avatarPainter = painter;
        this.avatarContentDescription = str2;
        this.showDropdownWhenSelected = z;
    }

    public /* synthetic */ CurrencyPickerItem(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : painter, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final androidx.compose.ui.graphics.painter.Painter getAvatarPainter() {
        return this.avatarPainter;
    }

    public final java.lang.String getAvatarContentDescription() {
        return this.avatarContentDescription;
    }

    public final boolean getShowDropdownWhenSelected() {
        return this.showDropdownWhenSelected;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        androidx.compose.ui.graphics.painter.Painter painter = this.avatarPainter;
        java.lang.String str2 = this.avatarContentDescription;
        boolean z = this.showDropdownWhenSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyPickerItem(label=");
        sb.append(str);
        sb.append(", avatarPainter=");
        sb.append(painter);
        sb.append(", avatarContentDescription=");
        sb.append(str2);
        sb.append(", showDropdownWhenSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode();
        androidx.compose.ui.graphics.painter.Painter painter = this.avatarPainter;
        int hashCode2 = painter == null ? 0 : painter.hashCode();
        java.lang.String str = this.avatarContentDescription;
        return (((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showDropdownWhenSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.CurrencyPickerItem)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.CurrencyPickerItem currencyPickerItem = (com.paypal.oslo.core.commonui.components.CurrencyPickerItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, currencyPickerItem.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatarPainter, currencyPickerItem.avatarPainter) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatarContentDescription, currencyPickerItem.avatarContentDescription) && this.showDropdownWhenSelected == currencyPickerItem.showDropdownWhenSelected;
    }

    public final com.paypal.oslo.core.commonui.components.CurrencyPickerItem copy(java.lang.String label, androidx.compose.ui.graphics.painter.Painter avatarPainter, java.lang.String avatarContentDescription, boolean showDropdownWhenSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.core.commonui.components.CurrencyPickerItem(label, avatarPainter, avatarContentDescription, showDropdownWhenSelected);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDropdownWhenSelected() {
        return this.showDropdownWhenSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAvatarContentDescription() {
        return this.avatarContentDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.graphics.painter.Painter getAvatarPainter() {
        return this.avatarPainter;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.components.CurrencyPickerItem copy$default(com.paypal.oslo.core.commonui.components.CurrencyPickerItem currencyPickerItem, java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = currencyPickerItem.label;
        }
        if ((i & 2) != 0) {
            painter = currencyPickerItem.avatarPainter;
        }
        if ((i & 4) != 0) {
            str2 = currencyPickerItem.avatarContentDescription;
        }
        if ((i & 8) != 0) {
            z = currencyPickerItem.showDropdownWhenSelected;
        }
        return currencyPickerItem.copy(str, painter, str2, z);
    }
}
