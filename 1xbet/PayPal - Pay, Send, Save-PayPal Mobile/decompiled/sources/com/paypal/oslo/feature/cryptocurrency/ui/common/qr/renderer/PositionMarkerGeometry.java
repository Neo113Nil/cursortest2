package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/PositionMarkerGeometry;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;", "outerSquare", "middleRing", "innerSquare", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/PositionMarkerGeometry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;", "getOuterSquare", "getMiddleRing", "getInnerSquare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PositionMarkerGeometry {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec innerSquare;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec middleRing;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec outerSquare;

    public PositionMarkerGeometry(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec2, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerSquareSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerSquareSpec2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerSquareSpec3, "");
        this.outerSquare = markerSquareSpec;
        this.middleRing = markerSquareSpec2;
        this.innerSquare = markerSquareSpec3;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec getOuterSquare() {
        return this.outerSquare;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec getMiddleRing() {
        return this.middleRing;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec getInnerSquare() {
        return this.innerSquare;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec = this.outerSquare;
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec2 = this.middleRing;
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec3 = this.innerSquare;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PositionMarkerGeometry(outerSquare=");
        sb.append(markerSquareSpec);
        sb.append(", middleRing=");
        sb.append(markerSquareSpec2);
        sb.append(", innerSquare=");
        sb.append(markerSquareSpec3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.outerSquare.hashCode() * 31) + this.middleRing.hashCode()) * 31) + this.innerSquare.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry positionMarkerGeometry = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.outerSquare, positionMarkerGeometry.outerSquare) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleRing, positionMarkerGeometry.middleRing) && kotlin.jvm.internal.Intrinsics.areEqual(this.innerSquare, positionMarkerGeometry.innerSquare);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry copy(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec outerSquare, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec middleRing, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec innerSquare) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outerSquare, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(middleRing, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerSquare, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry(outerSquare, middleRing, innerSquare);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec getInnerSquare() {
        return this.innerSquare;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec getMiddleRing() {
        return this.middleRing;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec getOuterSquare() {
        return this.outerSquare;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry positionMarkerGeometry, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec2, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            markerSquareSpec = positionMarkerGeometry.outerSquare;
        }
        if ((i & 2) != 0) {
            markerSquareSpec2 = positionMarkerGeometry.middleRing;
        }
        if ((i & 4) != 0) {
            markerSquareSpec3 = positionMarkerGeometry.innerSquare;
        }
        return positionMarkerGeometry.copy(markerSquareSpec, markerSquareSpec2, markerSquareSpec3);
    }
}
