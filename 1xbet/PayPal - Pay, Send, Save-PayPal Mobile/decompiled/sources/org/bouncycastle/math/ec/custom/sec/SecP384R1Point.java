package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP384R1Point extends org.bouncycastle.math.ec.ECPoint.AbstractFp {
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
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) this.y;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) this.x;
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) this.zs[0];
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        int[] create2 = org.bouncycastle.math.raw.Nat.create(12);
        int[] create3 = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(secP384R1FieldElement.x, create3);
        int[] create4 = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(create3, create4);
        boolean isOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.x;
        if (!isOne) {
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(secP384R1FieldElement3.x, create2);
            iArr = create2;
        }
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(secP384R1FieldElement2.x, iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.add(secP384R1FieldElement2.x, iArr, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.reduce32(org.bouncycastle.math.raw.Nat.addBothTo(12, create2, create2, create2), create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, secP384R1FieldElement2.x, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.reduce32(org.bouncycastle.math.raw.Nat.shiftUpBits(12, create3, 2, 0), create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.reduce32(org.bouncycastle.math.raw.Nat.shiftUpBits(12, create4, 3, 0, create), create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement4 = new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create4);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(create2, secP384R1FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(secP384R1FieldElement4.x, create3, secP384R1FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(secP384R1FieldElement4.x, create3, secP384R1FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement5 = new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(create3, secP384R1FieldElement4.x, secP384R1FieldElement5.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(secP384R1FieldElement5.x, create2, secP384R1FieldElement5.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(secP384R1FieldElement5.x, create, secP384R1FieldElement5.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement6 = new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.twice(secP384R1FieldElement.x, secP384R1FieldElement6.x);
        if (!isOne) {
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(secP384R1FieldElement6.x, secP384R1FieldElement3.x, secP384R1FieldElement6.x);
        }
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new org.bouncycastle.math.ec.ECFieldElement[]{secP384R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint threeTimes() {
        return (isInfinity() || this.y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint negate() {
        return isInfinity() ? this : new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(this.curve, this.x, this.y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint detach() {
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
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
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) this.x;
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) this.y;
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCPoint.getXCoord();
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement4 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCPoint.getYCoord();
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement5 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) this.zs[0];
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement6 = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] create = org.bouncycastle.math.raw.Nat.create(24);
        int[] create2 = org.bouncycastle.math.raw.Nat.create(24);
        int[] create3 = org.bouncycastle.math.raw.Nat.create(12);
        int[] create4 = org.bouncycastle.math.raw.Nat.create(12);
        boolean isOne = secP384R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP384R1FieldElement3.x;
            iArr2 = secP384R1FieldElement4.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(secP384R1FieldElement5.x, create3);
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, secP384R1FieldElement3.x, create2);
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, secP384R1FieldElement5.x, create3);
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, secP384R1FieldElement4.x, create3);
            iArr = create2;
            iArr2 = create3;
        }
        boolean isOne2 = secP384R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP384R1FieldElement.x;
            iArr4 = secP384R1FieldElement2.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(secP384R1FieldElement6.x, create4);
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create4, secP384R1FieldElement.x, create);
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create4, secP384R1FieldElement6.x, create4);
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create4, secP384R1FieldElement2.x, create4);
            iArr3 = create;
            iArr4 = create4;
        }
        int[] create5 = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(iArr3, iArr, create5);
        int[] create6 = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(iArr4, iArr2, create6);
        if (org.bouncycastle.math.raw.Nat.isZero(12, create5)) {
            return org.bouncycastle.math.raw.Nat.isZero(12, create6) ? twice() : curve.getInfinity();
        }
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(create5, create3);
        int[] create7 = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, create5, create7);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, iArr3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.negate(create7, create7);
        org.bouncycastle.math.raw.Nat384.mul(iArr4, create7, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.reduce32(org.bouncycastle.math.raw.Nat.addBothTo(12, create3, create3, create7), create7);
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement7 = new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create4);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(create6, secP384R1FieldElement7.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(secP384R1FieldElement7.x, create7, secP384R1FieldElement7.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement8 = new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create7);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(create3, secP384R1FieldElement7.x, secP384R1FieldElement8.x);
        org.bouncycastle.math.raw.Nat384.mul(secP384R1FieldElement8.x, create6, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.addExt(create, create2, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.reduce(create, secP384R1FieldElement8.x);
        org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement9 = new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create5);
        if (!isOne) {
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(secP384R1FieldElement9.x, secP384R1FieldElement5.x, secP384R1FieldElement9.x);
        }
        if (!isOne2) {
            org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(secP384R1FieldElement9.x, secP384R1FieldElement6.x, secP384R1FieldElement9.x);
        }
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new org.bouncycastle.math.ec.ECFieldElement[]{secP384R1FieldElement9});
    }

    SecP384R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    SecP384R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }
}
