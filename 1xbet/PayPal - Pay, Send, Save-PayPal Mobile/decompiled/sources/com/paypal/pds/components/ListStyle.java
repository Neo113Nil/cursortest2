package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/pds/components/ListStyle;", "", "Lcom/paypal/pds/core/Color;", "titleColor", "descriptionColor", "dataColor", "metadataColor", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "component1$pds_release", "()Lcom/paypal/pds/core/Color;", "component2$pds_release", "component3$pds_release", "component4$pds_release", "copy", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)Lcom/paypal/pds/components/ListStyle;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Color;", "getTitleColor$pds_release", "getDescriptionColor$pds_release", "getDataColor$pds_release", "getMetadataColor$pds_release", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ListStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.ListStyle.Companion INSTANCE = new com.paypal.pds.components.ListStyle.Companion(null);
    private static final com.paypal.pds.components.ListStyle Default = new com.paypal.pds.components.ListStyle(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE);
    private final com.paypal.pds.core.Color dataColor;
    private final com.paypal.pds.core.Color descriptionColor;
    private final com.paypal.pds.core.Color metadataColor;
    private final com.paypal.pds.core.Color titleColor;

    public ListStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color4, "");
        this.titleColor = color;
        this.descriptionColor = color2;
        this.dataColor = color3;
        this.metadataColor = color4;
    }

    public final com.paypal.pds.core.Color getTitleColor$pds_release() {
        return this.titleColor;
    }

    public final com.paypal.pds.core.Color getDescriptionColor$pds_release() {
        return this.descriptionColor;
    }

    public final com.paypal.pds.core.Color getDataColor$pds_release() {
        return this.dataColor;
    }

    public final com.paypal.pds.core.Color getMetadataColor$pds_release() {
        return this.metadataColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/components/ListStyle$Companion;", "", "<init>", "()V", "Lcom/paypal/pds/components/ListStyle;", "Default", "Lcom/paypal/pds/components/ListStyle;", "getDefault", "()Lcom/paypal/pds/components/ListStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.pds.components.ListStyle getDefault() {
            return com.paypal.pds.components.ListStyle.Default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Color color = this.titleColor;
        com.paypal.pds.core.Color color2 = this.descriptionColor;
        com.paypal.pds.core.Color color3 = this.dataColor;
        com.paypal.pds.core.Color color4 = this.metadataColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListStyle(titleColor=");
        sb.append(color);
        sb.append(", descriptionColor=");
        sb.append(color2);
        sb.append(", dataColor=");
        sb.append(color3);
        sb.append(", metadataColor=");
        sb.append(color4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.titleColor.hashCode() * 31) + this.descriptionColor.hashCode()) * 31) + this.dataColor.hashCode()) * 31) + this.metadataColor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.ListStyle)) {
            return false;
        }
        com.paypal.pds.components.ListStyle listStyle = (com.paypal.pds.components.ListStyle) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.titleColor, listStyle.titleColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionColor, listStyle.descriptionColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataColor, listStyle.dataColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadataColor, listStyle.metadataColor);
    }

    public final com.paypal.pds.components.ListStyle copy(com.paypal.pds.core.Color titleColor, com.paypal.pds.core.Color descriptionColor, com.paypal.pds.core.Color dataColor, com.paypal.pds.core.Color metadataColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titleColor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptionColor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataColor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataColor, "");
        return new com.paypal.pds.components.ListStyle(titleColor, descriptionColor, dataColor, metadataColor);
    }

    /* renamed from: component4$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getMetadataColor() {
        return this.metadataColor;
    }

    /* renamed from: component3$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getDataColor() {
        return this.dataColor;
    }

    /* renamed from: component2$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getDescriptionColor() {
        return this.descriptionColor;
    }

    /* renamed from: component1$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getTitleColor() {
        return this.titleColor;
    }

    public static /* synthetic */ com.paypal.pds.components.ListStyle copy$default(com.paypal.pds.components.ListStyle listStyle, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            color = listStyle.titleColor;
        }
        if ((i & 2) != 0) {
            color2 = listStyle.descriptionColor;
        }
        if ((i & 4) != 0) {
            color3 = listStyle.dataColor;
        }
        if ((i & 8) != 0) {
            color4 = listStyle.metadataColor;
        }
        return listStyle.copy(color, color2, color3, color4);
    }
}
