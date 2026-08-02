package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/CenterClearanceRegion;", "", "", "startX", "startY", "endX", "endY", "<init>", "(IIII)V", "x", "y", "", "contains", "(II)Z", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/CenterClearanceRegion;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStartX", "getStartY", "getEndX", "getEndY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CenterClearanceRegion {
    public static final int $stable = 0;
    private final int endX;
    private final int endY;
    private final int startX;
    private final int startY;

    public CenterClearanceRegion(int i, int i2, int i3, int i4) {
        this.startX = i;
        this.startY = i2;
        this.endX = i3;
        this.endY = i4;
    }

    public final int getStartX() {
        return this.startX;
    }

    public final int getStartY() {
        return this.startY;
    }

    public final int getEndX() {
        return this.endX;
    }

    public final int getEndY() {
        return this.endY;
    }

    public final boolean contains(int x, int y) {
        int i = this.startX;
        if (x > this.endX || i > x) {
            return false;
        }
        return y <= this.endY && this.startY <= y;
    }

    public final java.lang.String toString() {
        int i = this.startX;
        int i2 = this.startY;
        int i3 = this.endX;
        int i4 = this.endY;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CenterClearanceRegion(startX=");
        sb.append(i);
        sb.append(", startY=");
        sb.append(i2);
        sb.append(", endX=");
        sb.append(i3);
        sb.append(", endY=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.startX) * 31) + java.lang.Integer.hashCode(this.startY)) * 31) + java.lang.Integer.hashCode(this.endX)) * 31) + java.lang.Integer.hashCode(this.endY);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion centerClearanceRegion = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion) other;
        return this.startX == centerClearanceRegion.startX && this.startY == centerClearanceRegion.startY && this.endX == centerClearanceRegion.endX && this.endY == centerClearanceRegion.endY;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion copy(int startX, int startY, int endX, int endY) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion(startX, startY, endX, endY);
    }

    /* renamed from: component4, reason: from getter */
    public final int getEndY() {
        return this.endY;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndX() {
        return this.endX;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartY() {
        return this.startY;
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartX() {
        return this.startX;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion centerClearanceRegion, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = centerClearanceRegion.startX;
        }
        if ((i5 & 2) != 0) {
            i2 = centerClearanceRegion.startY;
        }
        if ((i5 & 4) != 0) {
            i3 = centerClearanceRegion.endX;
        }
        if ((i5 & 8) != 0) {
            i4 = centerClearanceRegion.endY;
        }
        return centerClearanceRegion.copy(i, i2, i3, i4);
    }
}
