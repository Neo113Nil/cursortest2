package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP224R1Point extends org.bouncycastle.math.ec.ECPoint.AbstractFp {
    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        return !isInfinity() ? eCPoint.isInfinity() ? twice() : this.y.isZero() ? eCPoint : twice().add(eCPoint) : eCPoint;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) this.y;
        if (secP224R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) this.x;
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) this.zs[0];
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        int[] create2 = org.bouncycastle.math.raw.Nat224.create();
        int[] create3 = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(secP224R1FieldElement.x, create3);
        int[] create4 = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(create3, create4);
        boolean isOne = secP224R1FieldElement3.isOne();
        int[] iArr = secP224R1FieldElement3.x;
        if (!isOne) {
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(secP224R1FieldElement3.x, create2);
            iArr = create2;
        }
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(secP224R1FieldElement2.x, iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.add(secP224R1FieldElement2.x, iArr, create2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create2, create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.reduce32(org.bouncycastle.math.raw.Nat224.addBothTo(create2, create2, create2), create2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create3, secP224R1FieldElement2.x, create3);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.reduce32(org.bouncycastle.math.raw.Nat.shiftUpBits(7, create3, 2, 0), create3);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.reduce32(org.bouncycastle.math.raw.Nat.shiftUpBits(7, create4, 3, 0, create), create);
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement4 = new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create4);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(create2, secP224R1FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(secP224R1FieldElement4.x, create3, secP224R1FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(secP224R1FieldElement4.x, create3, secP224R1FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement5 = new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create3);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(create3, secP224R1FieldElement4.x, secP224R1FieldElement5.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(secP224R1FieldElement5.x, create2, secP224R1FieldElement5.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(secP224R1FieldElement5.x, create, secP224R1FieldElement5.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement6 = new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.twice(secP224R1FieldElement.x, secP224R1FieldElement6.x);
        if (!isOne) {
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(secP224R1FieldElement6.x, secP224R1FieldElement3.x, secP224R1FieldElement6.x);
        }
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1Point(curve, secP224R1FieldElement4, secP224R1FieldElement5, new org.bouncycastle.math.ec.ECFieldElement[]{secP224R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint threeTimes() {
        return (isInfinity() || this.y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint negate() {
        return isInfinity() ? this : new org.bouncycastle.math.ec.custom.sec.SecP224R1Point(this.curve, this.x, this.y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint detach() {
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1Point(null, getAffineXCoord(), getAffineYCoord());
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
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) this.x;
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) this.y;
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCPoint.getXCoord();
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement4 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCPoint.getYCoord();
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement5 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) this.zs[0];
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement6 = (org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCPoint.getZCoord(0);
        int[] createExt = org.bouncycastle.math.raw.Nat224.createExt();
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        int[] create2 = org.bouncycastle.math.raw.Nat224.create();
        int[] create3 = org.bouncycastle.math.raw.Nat224.create();
        boolean isOne = secP224R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP224R1FieldElement3.x;
            iArr2 = secP224R1FieldElement4.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(secP224R1FieldElement5.x, create2);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create2, secP224R1FieldElement3.x, create);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create2, secP224R1FieldElement5.x, create2);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create2, secP224R1FieldElement4.x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = secP224R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP224R1FieldElement.x;
            iArr4 = secP224R1FieldElement2.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(secP224R1FieldElement6.x, create3);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create3, secP224R1FieldElement.x, createExt);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create3, secP224R1FieldElement6.x, create3);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create3, secP224R1FieldElement2.x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(iArr3, iArr, create4);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(iArr4, iArr2, create);
        if (org.bouncycastle.math.raw.Nat224.isZero(create4)) {
            return org.bouncycastle.math.raw.Nat224.isZero(create) ? twice() : curve.getInfinity();
        }
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(create4, create2);
        int[] create5 = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create2, create4, create5);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create2, iArr3, create2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.negate(create5, create5);
        org.bouncycastle.math.raw.Nat224.mul(iArr4, create5, createExt);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.reduce32(org.bouncycastle.math.raw.Nat224.addBothTo(create2, create2, create5), create5);
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement7 = new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create3);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(create, secP224R1FieldElement7.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(secP224R1FieldElement7.x, create5, secP224R1FieldElement7.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement8 = new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create5);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(create2, secP224R1FieldElement7.x, secP224R1FieldElement8.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiplyAddToExt(secP224R1FieldElement8.x, create, createExt);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.reduce(createExt, secP224R1FieldElement8.x);
        org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement secP224R1FieldElement9 = new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create4);
        if (!isOne) {
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(secP224R1FieldElement9.x, secP224R1FieldElement5.x, secP224R1FieldElement9.x);
        }
        if (!isOne2) {
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(secP224R1FieldElement9.x, secP224R1FieldElement6.x, secP224R1FieldElement9.x);
        }
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1Point(curve, secP224R1FieldElement7, secP224R1FieldElement8, new org.bouncycastle.math.ec.ECFieldElement[]{secP224R1FieldElement9});
    }

    SecP224R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    SecP224R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }
}
