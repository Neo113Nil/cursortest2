package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipConfig;", "", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPosition;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/ui/unit/Dp;", "offset", "", "contentDescription", "", "dismissOnTap", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPosition;FLjava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPosition;", "component2-D9Ej5fM", "()F", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "copy-ziNgDLE", "(Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPosition;FLjava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipConfig;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPosition;", "getPosition", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getOffset-D9Ej5fM", "Ljava/lang/String;", "getContentDescription", "Z", "getDismissOnTap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class P2pTooltipConfig {
    public static final int $stable = 0;
    private final java.lang.String contentDescription;
    private final boolean dismissOnTap;
    private final float offset;
    private final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition position;

    private P2pTooltipConfig(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition, float f, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pTooltipPosition, "");
        this.position = p2pTooltipPosition;
        this.offset = f;
        this.contentDescription = str;
        this.dismissOnTap = z;
    }

    public /* synthetic */ P2pTooltipConfig(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition, float f, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Top : p2pTooltipPosition, (i & 2) != 0 ? com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt.getHighSpeedVideoSizes : f, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z, null);
    }

    public final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition getPosition() {
        return this.position;
    }

    /* renamed from: getOffset-D9Ej5fM, reason: not valid java name */
    public final float m17272getOffsetD9Ej5fM() {
        return this.offset;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final boolean getDismissOnTap() {
        return this.dismissOnTap;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition = this.position;
        java.lang.String m8612toStringimpl = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.offset);
        java.lang.String str = this.contentDescription;
        boolean z = this.dismissOnTap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("P2pTooltipConfig(position=");
        sb.append(p2pTooltipPosition);
        sb.append(", offset=");
        sb.append(m8612toStringimpl);
        sb.append(", contentDescription=");
        sb.append(str);
        sb.append(", dismissOnTap=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.position.hashCode();
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.offset);
        java.lang.String str = this.contentDescription;
        return (((((hashCode * 31) + m8607hashCodeimpl) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.dismissOnTap);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig p2pTooltipConfig = (com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig) other;
        return this.position == p2pTooltipConfig.position && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.offset, p2pTooltipConfig.offset) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, p2pTooltipConfig.contentDescription) && this.dismissOnTap == p2pTooltipConfig.dismissOnTap;
    }

    /* renamed from: copy-ziNgDLE, reason: not valid java name */
    public final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig m17271copyziNgDLE(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition position, float offset, java.lang.String contentDescription, boolean dismissOnTap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        return new com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig(position, offset, contentDescription, dismissOnTap, null);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDismissOnTap() {
        return this.dismissOnTap;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getOffset() {
        return this.offset;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition getPosition() {
        return this.position;
    }

    /* renamed from: copy-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig m17269copyziNgDLE$default(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig p2pTooltipConfig, com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition, float f, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            p2pTooltipPosition = p2pTooltipConfig.position;
        }
        if ((i & 2) != 0) {
            f = p2pTooltipConfig.offset;
        }
        if ((i & 4) != 0) {
            str = p2pTooltipConfig.contentDescription;
        }
        if ((i & 8) != 0) {
            z = p2pTooltipConfig.dismissOnTap;
        }
        return p2pTooltipConfig.m17271copyziNgDLE(p2pTooltipPosition, f, str, z);
    }

    public /* synthetic */ P2pTooltipConfig(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition, float f, java.lang.String str, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(p2pTooltipPosition, f, str, z);
    }
}
