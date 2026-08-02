package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "", "", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTopLeft", "getTopRight", "getBottomRight", "getBottomLeft"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CornerRadiiSpec {
    public static final int $stable = 0;
    private final float bottomLeft;
    private final float bottomRight;
    private final float topLeft;
    private final float topRight;

    public CornerRadiiSpec(float f, float f2, float f3, float f4) {
        this.topLeft = f;
        this.topRight = f2;
        this.bottomRight = f3;
        this.bottomLeft = f4;
    }

    public final float getTopLeft() {
        return this.topLeft;
    }

    public final float getTopRight() {
        return this.topRight;
    }

    public final float getBottomRight() {
        return this.bottomRight;
    }

    public final float getBottomLeft() {
        return this.bottomLeft;
    }

    public final java.lang.String toString() {
        float f = this.topLeft;
        float f2 = this.topRight;
        float f3 = this.bottomRight;
        float f4 = this.bottomLeft;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CornerRadiiSpec(topLeft=");
        sb.append(f);
        sb.append(", topRight=");
        sb.append(f2);
        sb.append(", bottomRight=");
        sb.append(f3);
        sb.append(", bottomLeft=");
        sb.append(f4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Float.hashCode(this.topLeft) * 31) + java.lang.Float.hashCode(this.topRight)) * 31) + java.lang.Float.hashCode(this.bottomRight)) * 31) + java.lang.Float.hashCode(this.bottomLeft);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec cornerRadiiSpec = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec) other;
        return java.lang.Float.compare(this.topLeft, cornerRadiiSpec.topLeft) == 0 && java.lang.Float.compare(this.topRight, cornerRadiiSpec.topRight) == 0 && java.lang.Float.compare(this.bottomRight, cornerRadiiSpec.bottomRight) == 0 && java.lang.Float.compare(this.bottomLeft, cornerRadiiSpec.bottomLeft) == 0;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec copy(float topLeft, float topRight, float bottomRight, float bottomLeft) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec(topLeft, topRight, bottomRight, bottomLeft);
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottomLeft() {
        return this.bottomLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final float getBottomRight() {
        return this.bottomRight;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTopRight() {
        return this.topRight;
    }

    /* renamed from: component1, reason: from getter */
    public final float getTopLeft() {
        return this.topLeft;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec cornerRadiiSpec, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = cornerRadiiSpec.topLeft;
        }
        if ((i & 2) != 0) {
            f2 = cornerRadiiSpec.topRight;
        }
        if ((i & 4) != 0) {
            f3 = cornerRadiiSpec.bottomRight;
        }
        if ((i & 8) != 0) {
            f4 = cornerRadiiSpec.bottomLeft;
        }
        return cornerRadiiSpec.copy(f, f2, f3, f4);
    }
}
