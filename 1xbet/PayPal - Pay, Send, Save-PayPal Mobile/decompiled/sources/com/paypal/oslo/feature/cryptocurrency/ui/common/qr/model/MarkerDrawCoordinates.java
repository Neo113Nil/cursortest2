package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/MarkerDrawCoordinates;", "", "", "x", "y", "markerSize", "<init>", "(FFF)V", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/MarkerDrawCoordinates;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX", "getY", "getMarkerSize"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MarkerDrawCoordinates {
    public static final int $stable = 0;
    private final float markerSize;
    private final float x;
    private final float y;

    public MarkerDrawCoordinates(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.markerSize = f3;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getMarkerSize() {
        return this.markerSize;
    }

    public final java.lang.String toString() {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.markerSize;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkerDrawCoordinates(x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", markerSize=");
        sb.append(f3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.x) * 31) + java.lang.Float.hashCode(this.y)) * 31) + java.lang.Float.hashCode(this.markerSize);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates markerDrawCoordinates = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates) other;
        return java.lang.Float.compare(this.x, markerDrawCoordinates.x) == 0 && java.lang.Float.compare(this.y, markerDrawCoordinates.y) == 0 && java.lang.Float.compare(this.markerSize, markerDrawCoordinates.markerSize) == 0;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates copy(float x, float y, float markerSize) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates(x, y, markerSize);
    }

    /* renamed from: component3, reason: from getter */
    public final float getMarkerSize() {
        return this.markerSize;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates markerDrawCoordinates, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = markerDrawCoordinates.x;
        }
        if ((i & 2) != 0) {
            f2 = markerDrawCoordinates.y;
        }
        if ((i & 4) != 0) {
            f3 = markerDrawCoordinates.markerSize;
        }
        return markerDrawCoordinates.copy(f, f2, f3);
    }
}
