package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u008a\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/pds/components/ChipKt$ChipPreview$ChipData;", "", "", "id", "title", "Lcom/paypal/pds/core/Icon;", "icon", "", "isSelected", "canClose", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;ZZ)Lcom/paypal/pds/components/ChipKt$ChipPreview$ChipData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "Lcom/paypal/pds/core/Icon;", "getIcon", "Z", "getCanClose"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChipKt$ChipPreview$ChipData {
    private final boolean canClose;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String id;
    private final boolean isSelected;
    private final java.lang.String title;

    public ChipKt$ChipPreview$ChipData(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.title = str2;
        this.icon = icon;
        this.isSelected = z;
        this.canClose = z2;
    }

    public /* synthetic */ ChipKt$ChipPreview$ChipData(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        com.paypal.pds.core.Icon icon = this.icon;
        boolean z = this.isSelected;
        boolean z2 = this.canClose;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChipData(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(", canClose=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        com.paypal.pds.core.Icon icon = this.icon;
        return (((((((hashCode * 31) + hashCode2) * 31) + (icon == null ? 0 : icon.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isSelected)) * 31) + java.lang.Boolean.hashCode(this.canClose);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.ChipKt$ChipPreview$ChipData)) {
            return false;
        }
        com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData = (com.paypal.pds.components.ChipKt$ChipPreview$ChipData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, chipKt$ChipPreview$ChipData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, chipKt$ChipPreview$ChipData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, chipKt$ChipPreview$ChipData.icon) && this.isSelected == chipKt$ChipPreview$ChipData.isSelected && this.canClose == chipKt$ChipPreview$ChipData.canClose;
    }

    public final com.paypal.pds.components.ChipKt$ChipPreview$ChipData copy(java.lang.String id, java.lang.String title, com.paypal.pds.core.Icon icon, boolean isSelected, boolean canClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.pds.components.ChipKt$ChipPreview$ChipData(id, title, icon, isSelected, canClose);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCanClose() {
        return this.canClose;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.pds.components.ChipKt$ChipPreview$ChipData copy$default(com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = chipKt$ChipPreview$ChipData.id;
        }
        if ((i & 2) != 0) {
            str2 = chipKt$ChipPreview$ChipData.title;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            icon = chipKt$ChipPreview$ChipData.icon;
        }
        com.paypal.pds.core.Icon icon2 = icon;
        if ((i & 8) != 0) {
            z = chipKt$ChipPreview$ChipData.isSelected;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = chipKt$ChipPreview$ChipData.canClose;
        }
        return chipKt$ChipPreview$ChipData.copy(str, str3, icon2, z3, z2);
    }
}
