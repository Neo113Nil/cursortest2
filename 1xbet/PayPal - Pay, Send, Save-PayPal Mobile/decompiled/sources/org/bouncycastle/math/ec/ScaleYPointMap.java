package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class ScaleYPointMap implements org.bouncycastle.math.ec.ECPointMap {
    protected final org.bouncycastle.math.ec.ECFieldElement scale;

    @Override // org.bouncycastle.math.ec.ECPointMap
    public org.bouncycastle.math.ec.ECPoint map(org.bouncycastle.math.ec.ECPoint eCPoint) {
        return eCPoint.scaleY(this.scale);
    }

    public ScaleYPointMap(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        this.scale = eCFieldElement;
    }
}
