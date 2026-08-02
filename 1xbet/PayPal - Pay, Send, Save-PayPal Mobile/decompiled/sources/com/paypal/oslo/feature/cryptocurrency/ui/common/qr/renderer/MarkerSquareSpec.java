package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;", "", "", "topLeftX", "topLeftY", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "radii", "<init>", "(FFFLcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;)V", "component1", "()F", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "copy", "(FFFLcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/MarkerSquareSpec;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTopLeftX", "getTopLeftY", "getSize", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "getRadii"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MarkerSquareSpec {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec radii;
    private final float size;
    private final float topLeftX;
    private final float topLeftY;

    public MarkerSquareSpec(float f, float f2, float f3, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec cornerRadiiSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cornerRadiiSpec, "");
        this.topLeftX = f;
        this.topLeftY = f2;
        this.size = f3;
        this.radii = cornerRadiiSpec;
    }

    public final float getTopLeftX() {
        return this.topLeftX;
    }

    public final float getTopLeftY() {
        return this.topLeftY;
    }

    public final float getSize() {
        return this.size;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec getRadii() {
        return this.radii;
    }

    public final java.lang.String toString() {
        float f = this.topLeftX;
        float f2 = this.topLeftY;
        float f3 = this.size;
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec cornerRadiiSpec = this.radii;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkerSquareSpec(topLeftX=");
        sb.append(f);
        sb.append(", topLeftY=");
        sb.append(f2);
        sb.append(", size=");
        sb.append(f3);
        sb.append(", radii=");
        sb.append(cornerRadiiSpec);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Float.hashCode(this.topLeftX) * 31) + java.lang.Float.hashCode(this.topLeftY)) * 31) + java.lang.Float.hashCode(this.size)) * 31) + this.radii.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec) other;
        return java.lang.Float.compare(this.topLeftX, markerSquareSpec.topLeftX) == 0 && java.lang.Float.compare(this.topLeftY, markerSquareSpec.topLeftY) == 0 && java.lang.Float.compare(this.size, markerSquareSpec.size) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.radii, markerSquareSpec.radii);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec copy(float topLeftX, float topLeftY, float size, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec radii) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(radii, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec(topLeftX, topLeftY, size, radii);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec getRadii() {
        return this.radii;
    }

    /* renamed from: component3, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTopLeftY() {
        return this.topLeftY;
    }

    /* renamed from: component1, reason: from getter */
    public final float getTopLeftX() {
        return this.topLeftX;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec, float f, float f2, float f3, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec cornerRadiiSpec, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = markerSquareSpec.topLeftX;
        }
        if ((i & 2) != 0) {
            f2 = markerSquareSpec.topLeftY;
        }
        if ((i & 4) != 0) {
            f3 = markerSquareSpec.size;
        }
        if ((i & 8) != 0) {
            cornerRadiiSpec = markerSquareSpec.radii;
        }
        return markerSquareSpec.copy(f, f2, f3, cornerRadiiSpec);
    }
}
