package org.bouncycastle.math.ec.endo;

/* loaded from: classes17.dex */
public class EndoPreCompInfo implements org.bouncycastle.math.ec.PreCompInfo {
    protected org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism;
    protected org.bouncycastle.math.ec.ECPoint mappedPoint;

    public void setMappedPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        this.mappedPoint = eCPoint;
    }

    public void setEndomorphism(org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism) {
        this.endomorphism = eCEndomorphism;
    }

    public org.bouncycastle.math.ec.ECPoint getMappedPoint() {
        return this.mappedPoint;
    }

    public org.bouncycastle.math.ec.endo.ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }
}
