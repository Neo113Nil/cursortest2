package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/TagStyle;", "", "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "isBold", "<init>", "(Lcom/paypal/pds/core/Color;Z)V", "component1", "()Lcom/paypal/pds/core/Color;", "component2", "()Z", "copy", "(Lcom/paypal/pds/core/Color;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/TagStyle;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Color;", "getColor", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TagStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color color;
    private final boolean isBold;

    public TagStyle(com.paypal.pds.core.Color color, boolean z) {
        this.color = color;
        this.isBold = z;
    }

    public /* synthetic */ TagStyle(com.paypal.pds.core.Color color, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : color, (i & 2) != 0 ? false : z);
    }

    public final com.paypal.pds.core.Color getColor() {
        return this.color;
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Color color = this.color;
        boolean z = this.isBold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TagStyle(color=");
        sb.append(color);
        sb.append(", isBold=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.pds.core.Color color = this.color;
        return ((color == null ? 0 : color.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isBold);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle tagStyle = (com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.color, tagStyle.color) && this.isBold == tagStyle.isBold;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle copy(com.paypal.pds.core.Color color, boolean isBold) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle(color, isBold);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBold() {
        return this.isBold;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Color getColor() {
        return this.color;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle tagStyle, com.paypal.pds.core.Color color, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            color = tagStyle.color;
        }
        if ((i & 2) != 0) {
            z = tagStyle.isBold;
        }
        return tagStyle.copy(color, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TagStyle() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
