package org.bouncycastle.math.ec.custom.djb;

/* loaded from: classes17.dex */
public class Curve25519Point extends org.bouncycastle.math.ec.ECPoint.AbstractFp {
    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        return !isInfinity() ? eCPoint.isInfinity() ? twice() : this.y.isZero() ? eCPoint : twiceJacobianModified(false).add(eCPoint) : eCPoint;
    }

    protected org.bouncycastle.math.ec.custom.djb.Curve25519Point twiceJacobianModified(boolean z) {
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement;
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement2 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.x;
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement3 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.y;
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement4 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.zs[0];
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement jacobianModifiedW = getJacobianModifiedW();
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(curve25519FieldElement2.x, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.reduce27(org.bouncycastle.math.raw.Nat256.addBothTo(create, create, create) + org.bouncycastle.math.raw.Nat256.addTo(jacobianModifiedW.x, create), create);
        int[] create2 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.twice(curve25519FieldElement3.x, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, curve25519FieldElement3.x, create3);
        int[] create4 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, curve25519FieldElement2.x, create4);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.twice(create4, create4);
        int[] create5 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create3, create5);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.twice(create5, create5);
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement5 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, curve25519FieldElement5.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(curve25519FieldElement5.x, create4, curve25519FieldElement5.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(curve25519FieldElement5.x, create4, curve25519FieldElement5.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement6 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create4);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(create4, curve25519FieldElement5.x, curve25519FieldElement6.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(curve25519FieldElement6.x, create, curve25519FieldElement6.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(curve25519FieldElement6.x, create5, curve25519FieldElement6.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement7 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create2);
        if (!org.bouncycastle.math.raw.Nat256.isOne(curve25519FieldElement4.x)) {
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(curve25519FieldElement7.x, curve25519FieldElement4.x, curve25519FieldElement7.x);
        }
        if (z) {
            curve25519FieldElement = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create5);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(curve25519FieldElement.x, jacobianModifiedW.x, curve25519FieldElement.x);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.twice(curve25519FieldElement.x, curve25519FieldElement.x);
        } else {
            curve25519FieldElement = null;
        }
        return new org.bouncycastle.math.ec.custom.djb.Curve25519Point(getCurve(), curve25519FieldElement5, curve25519FieldElement6, new org.bouncycastle.math.ec.ECFieldElement[]{curve25519FieldElement7, curve25519FieldElement});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        return this.y.isZero() ? getCurve().getInfinity() : twiceJacobianModified(true);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint threeTimes() {
        return (isInfinity() || this.y.isZero()) ? this : twiceJacobianModified(false).add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint negate() {
        return isInfinity() ? this : new org.bouncycastle.math.ec.custom.djb.Curve25519Point(getCurve(), this.x, this.y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECFieldElement getZCoord(int i) {
        return i == 1 ? getJacobianModifiedW() : super.getZCoord(i);
    }

    protected org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement getJacobianModifiedW() {
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.zs[1];
        if (curve25519FieldElement != null) {
            return curve25519FieldElement;
        }
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr = this.zs;
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement calculateJacobianModifiedW = calculateJacobianModifiedW((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.zs[0], null);
        eCFieldElementArr[1] = calculateJacobianModifiedW;
        return calculateJacobianModifiedW;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint detach() {
        return new org.bouncycastle.math.ec.custom.djb.Curve25519Point(null, getAffineXCoord(), getAffineYCoord());
    }

    protected org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement calculateJacobianModifiedW(org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement, int[] iArr) {
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement2 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) getCurve().getA();
        if (curve25519FieldElement.isOne()) {
            return curve25519FieldElement2;
        }
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement3 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement();
        if (iArr == null) {
            iArr = curve25519FieldElement3.x;
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(curve25519FieldElement.x, iArr);
        }
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(iArr, curve25519FieldElement3.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(curve25519FieldElement3.x, curve25519FieldElement2.x, curve25519FieldElement3.x);
        return curve25519FieldElement3;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint add(org.bouncycastle.math.ec.ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.x;
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement2 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.y;
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement3 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) this.zs[0];
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement4 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCPoint.getXCoord();
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement5 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCPoint.getYCoord();
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement6 = (org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCPoint.getZCoord(0);
        int[] createExt = org.bouncycastle.math.raw.Nat256.createExt();
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        int[] create2 = org.bouncycastle.math.raw.Nat256.create();
        int[] create3 = org.bouncycastle.math.raw.Nat256.create();
        boolean isOne = curve25519FieldElement3.isOne();
        if (isOne) {
            iArr = curve25519FieldElement4.x;
            iArr2 = curve25519FieldElement5.x;
        } else {
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(curve25519FieldElement3.x, create2);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, curve25519FieldElement4.x, create);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, curve25519FieldElement3.x, create2);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, curve25519FieldElement5.x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = curve25519FieldElement6.isOne();
        if (isOne2) {
            iArr3 = curve25519FieldElement.x;
            iArr4 = curve25519FieldElement2.x;
        } else {
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(curve25519FieldElement6.x, create3);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, curve25519FieldElement.x, createExt);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, curve25519FieldElement6.x, create3);
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, curve25519FieldElement2.x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(iArr3, iArr, create4);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(iArr4, iArr2, create);
        if (org.bouncycastle.math.raw.Nat256.isZero(create4)) {
            return org.bouncycastle.math.raw.Nat256.isZero(create) ? twice() : curve.getInfinity();
        }
        int[] create5 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create4, create5);
        int[] create6 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create5, create4, create6);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create5, iArr3, create2);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.negate(create6, create6);
        org.bouncycastle.math.raw.Nat256.mul(iArr4, create6, createExt);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.reduce27(org.bouncycastle.math.raw.Nat256.addBothTo(create2, create2, create6), create6);
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement7 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, curve25519FieldElement7.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(curve25519FieldElement7.x, create6, curve25519FieldElement7.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement8 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create6);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(create2, curve25519FieldElement7.x, curve25519FieldElement8.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiplyAddToExt(curve25519FieldElement8.x, create, createExt);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.reduce(createExt, curve25519FieldElement8.x);
        org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement curve25519FieldElement9 = new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create4);
        if (!isOne) {
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(curve25519FieldElement9.x, curve25519FieldElement3.x, curve25519FieldElement9.x);
        }
        if (!isOne2) {
            org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(curve25519FieldElement9.x, curve25519FieldElement6.x, curve25519FieldElement9.x);
        }
        if (!isOne || !isOne2) {
            create5 = null;
        }
        return new org.bouncycastle.math.ec.custom.djb.Curve25519Point(curve, curve25519FieldElement7, curve25519FieldElement8, new org.bouncycastle.math.ec.ECFieldElement[]{curve25519FieldElement9, calculateJacobianModifiedW(curve25519FieldElement9, create5)});
    }

    Curve25519Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    Curve25519Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }
}
