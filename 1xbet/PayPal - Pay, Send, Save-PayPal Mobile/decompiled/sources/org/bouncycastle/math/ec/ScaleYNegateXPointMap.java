package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class ScaleYNegateXPointMap implements org.bouncycastle.math.ec.ECPointMap {
    protected final org.bouncycastle.math.ec.ECFieldElement scale;

    @Override // org.bouncycastle.math.ec.ECPointMap
    public org.bouncycastle.math.ec.ECPoint map(org.bouncycastle.math.ec.ECPoint eCPoint) {
        return eCPoint.scaleYNegateX(this.scale);
    }

    public ScaleYNegateXPointMap(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        this.scale = eCFieldElement;
    }
}
