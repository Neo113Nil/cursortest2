package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/CameraDimensions;", "", "", "viewWidth", "viewHeight", "offsetX", "offsetY", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/CameraDimensions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getViewWidth", "getViewHeight", "getOffsetX", "getOffsetY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CameraDimensions {
    public static final int $stable = 0;
    private final int offsetX;
    private final int offsetY;
    private final int viewHeight;
    private final int viewWidth;

    public CameraDimensions(int i, int i2, int i3, int i4) {
        this.viewWidth = i;
        this.viewHeight = i2;
        this.offsetX = i3;
        this.offsetY = i4;
    }

    public final int getViewWidth() {
        return this.viewWidth;
    }

    public final int getViewHeight() {
        return this.viewHeight;
    }

    public final int getOffsetX() {
        return this.offsetX;
    }

    public final int getOffsetY() {
        return this.offsetY;
    }

    public final java.lang.String toString() {
        int i = this.viewWidth;
        int i2 = this.viewHeight;
        int i3 = this.offsetX;
        int i4 = this.offsetY;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraDimensions(viewWidth=");
        sb.append(i);
        sb.append(", viewHeight=");
        sb.append(i2);
        sb.append(", offsetX=");
        sb.append(i3);
        sb.append(", offsetY=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.viewWidth) * 31) + java.lang.Integer.hashCode(this.viewHeight)) * 31) + java.lang.Integer.hashCode(this.offsetX)) * 31) + java.lang.Integer.hashCode(this.offsetY);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions cameraDimensions = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions) other;
        return this.viewWidth == cameraDimensions.viewWidth && this.viewHeight == cameraDimensions.viewHeight && this.offsetX == cameraDimensions.offsetX && this.offsetY == cameraDimensions.offsetY;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions copy(int viewWidth, int viewHeight, int offsetX, int offsetY) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions(viewWidth, viewHeight, offsetX, offsetY);
    }

    /* renamed from: component4, reason: from getter */
    public final int getOffsetY() {
        return this.offsetY;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOffsetX() {
        return this.offsetX;
    }

    /* renamed from: component2, reason: from getter */
    public final int getViewHeight() {
        return this.viewHeight;
    }

    /* renamed from: component1, reason: from getter */
    public final int getViewWidth() {
        return this.viewWidth;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions cameraDimensions, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = cameraDimensions.viewWidth;
        }
        if ((i5 & 2) != 0) {
            i2 = cameraDimensions.viewHeight;
        }
        if ((i5 & 4) != 0) {
            i3 = cameraDimensions.offsetX;
        }
        if ((i5 & 8) != 0) {
            i4 = cameraDimensions.offsetY;
        }
        return cameraDimensions.copy(i, i2, i3, i4);
    }
}
