package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecT571R1Point extends org.bouncycastle.math.ec.ECPoint.AbstractF2m {
    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.x;
        if (secT571FieldElement.isZero()) {
            return eCPoint;
        }
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) eCPoint.getRawXCoord();
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) eCPoint.getZCoord(0);
        if (secT571FieldElement2.isZero() || !secT571FieldElement3.isOne()) {
            return twice().add(eCPoint);
        }
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement4 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.y;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement5 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.zs[0];
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement6 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) eCPoint.getRawYCoord();
        long[] create64 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create642 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create643 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create644 = org.bouncycastle.math.raw.Nat576.create64();
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(secT571FieldElement.x, create64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(secT571FieldElement4.x, create642);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(secT571FieldElement5.x, create643);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiply(secT571FieldElement4.x, secT571FieldElement5.x, create644);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.addBothTo(create643, create642, create644);
        long[] precompMultiplicand = org.bouncycastle.math.ec.custom.sec.SecT571Field.precompMultiplicand(create643);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement6.x, precompMultiplicand, create643);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.add(create643, create642, create643);
        long[] createExt64 = org.bouncycastle.math.raw.Nat576.createExt64();
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyAddToExt(create643, create644, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecompAddToExt(create64, precompMultiplicand, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.reduce(createExt64, create643);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement2.x, precompMultiplicand, create64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.add(create64, create644, create642);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(create642, create642);
        if (org.bouncycastle.math.raw.Nat576.isZero64(create642)) {
            return org.bouncycastle.math.raw.Nat576.isZero64(create643) ? eCPoint.twice() : curve.getInfinity();
        }
        if (org.bouncycastle.math.raw.Nat576.isZero64(create643)) {
            return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create643), org.bouncycastle.math.ec.custom.sec.SecT571R1Curve.getHighResolutionOutputSizeshNQ4ISI);
        }
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement7 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement();
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(create643, secT571FieldElement7.x);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiply(secT571FieldElement7.x, create64, secT571FieldElement7.x);
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement8 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiply(create643, create642, secT571FieldElement8.x);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement8.x, precompMultiplicand, secT571FieldElement8.x);
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement9 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create642);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.add(create643, create642, secT571FieldElement9.x);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(secT571FieldElement9.x, secT571FieldElement9.x);
        org.bouncycastle.math.raw.Nat.zero64(18, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyAddToExt(secT571FieldElement9.x, create644, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.addOne(secT571FieldElement6.x, create644);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyAddToExt(create644, secT571FieldElement8.x, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.reduce(createExt64, secT571FieldElement9.x);
        return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, secT571FieldElement7, secT571FieldElement9, new org.bouncycastle.math.ec.ECFieldElement[]{secT571FieldElement8});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twice() {
        long[] jArr;
        if (isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.x;
        if (secT571FieldElement.isZero()) {
            return curve.getInfinity();
        }
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.y;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.zs[0];
        long[] create64 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create642 = org.bouncycastle.math.raw.Nat576.create64();
        long[] precompMultiplicand = secT571FieldElement3.isOne() ? null : org.bouncycastle.math.ec.custom.sec.SecT571Field.precompMultiplicand(secT571FieldElement3.x);
        long[] jArr2 = secT571FieldElement2.x;
        if (precompMultiplicand == null) {
            jArr = secT571FieldElement3.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(jArr2, precompMultiplicand, create64);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.square(secT571FieldElement3.x, create642);
            jArr2 = create64;
            jArr = create642;
        }
        long[] create643 = org.bouncycastle.math.raw.Nat576.create64();
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(secT571FieldElement2.x, create643);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.addBothTo(jArr2, jArr, create643);
        if (org.bouncycastle.math.raw.Nat576.isZero64(create643)) {
            return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create643), org.bouncycastle.math.ec.custom.sec.SecT571R1Curve.getHighResolutionOutputSizeshNQ4ISI);
        }
        long[] createExt64 = org.bouncycastle.math.raw.Nat576.createExt64();
        org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyAddToExt(create643, jArr2, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement4 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.square(create643, secT571FieldElement4.x);
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement5 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create643);
        if (precompMultiplicand != null) {
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiply(secT571FieldElement5.x, jArr, secT571FieldElement5.x);
        }
        long[] jArr3 = secT571FieldElement.x;
        if (precompMultiplicand != null) {
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(jArr3, precompMultiplicand, create642);
            jArr3 = create642;
        }
        org.bouncycastle.math.ec.custom.sec.SecT571Field.squareAddToExt(jArr3, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.reduce(createExt64, create642);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.addBothTo(secT571FieldElement4.x, secT571FieldElement5.x, create642);
        return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, secT571FieldElement4, new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create642), new org.bouncycastle.math.ec.ECFieldElement[]{secT571FieldElement5});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint negate() {
        if (!isInfinity()) {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            if (!eCFieldElement.isZero()) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new org.bouncycastle.math.ec.ECFieldElement[]{eCFieldElement3});
            }
        }
        return this;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECFieldElement getYCoord() {
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
        if (isInfinity() || eCFieldElement.isZero()) {
            return eCFieldElement2;
        }
        org.bouncycastle.math.ec.ECFieldElement multiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
        return !eCFieldElement3.isOne() ? multiply.divide(eCFieldElement3) : multiply;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public boolean getCompressionYTilde() {
        org.bouncycastle.math.ec.ECFieldElement rawXCoord = getRawXCoord();
        return (rawXCoord.isZero() || getRawYCoord().testBitZero() == rawXCoord.testBitZero()) ? false : true;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint detach() {
        return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint add(org.bouncycastle.math.ec.ECPoint eCPoint) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement2;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement3;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement4 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.x;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement5 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) eCPoint.getRawXCoord();
        if (secT571FieldElement4.isZero()) {
            return secT571FieldElement5.isZero() ? curve.getInfinity() : eCPoint.add(this);
        }
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement6 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.y;
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement7 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) this.zs[0];
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement8 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) eCPoint.getRawYCoord();
        org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement9 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) eCPoint.getZCoord(0);
        long[] create64 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create642 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create643 = org.bouncycastle.math.raw.Nat576.create64();
        long[] create644 = org.bouncycastle.math.raw.Nat576.create64();
        long[] precompMultiplicand = secT571FieldElement7.isOne() ? null : org.bouncycastle.math.ec.custom.sec.SecT571Field.precompMultiplicand(secT571FieldElement7.x);
        if (precompMultiplicand == null) {
            jArr = secT571FieldElement5.x;
            jArr2 = secT571FieldElement8.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement5.x, precompMultiplicand, create642);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement8.x, precompMultiplicand, create644);
            jArr = create642;
            jArr2 = create644;
        }
        long[] precompMultiplicand2 = !secT571FieldElement9.isOne() ? org.bouncycastle.math.ec.custom.sec.SecT571Field.precompMultiplicand(secT571FieldElement9.x) : null;
        long[] jArr4 = secT571FieldElement4.x;
        if (precompMultiplicand2 == null) {
            jArr3 = secT571FieldElement6.x;
        } else {
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(jArr4, precompMultiplicand2, create64);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement6.x, precompMultiplicand2, create643);
            jArr4 = create64;
            jArr3 = create643;
        }
        org.bouncycastle.math.ec.custom.sec.SecT571Field.add(jArr3, jArr2, create643);
        org.bouncycastle.math.ec.custom.sec.SecT571Field.add(jArr4, jArr, create644);
        if (org.bouncycastle.math.raw.Nat576.isZero64(create644)) {
            return org.bouncycastle.math.raw.Nat576.isZero64(create643) ? twice() : curve.getInfinity();
        }
        if (secT571FieldElement5.isZero()) {
            org.bouncycastle.math.ec.ECPoint normalize = normalize();
            org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement10 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) normalize.getXCoord();
            org.bouncycastle.math.ec.ECFieldElement yCoord = normalize.getYCoord();
            org.bouncycastle.math.ec.ECFieldElement divide = yCoord.add(secT571FieldElement8).divide(secT571FieldElement10);
            secT571FieldElement = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) divide.square().add(divide).add(secT571FieldElement10).addOne();
            if (secT571FieldElement.isZero()) {
                return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, secT571FieldElement, org.bouncycastle.math.ec.custom.sec.SecT571R1Curve.getHighResolutionOutputSizeshNQ4ISI);
            }
            secT571FieldElement2 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) divide.multiply(secT571FieldElement10.add(secT571FieldElement)).add(secT571FieldElement).add(yCoord).divide(secT571FieldElement).add(secT571FieldElement);
            secT571FieldElement3 = (org.bouncycastle.math.ec.custom.sec.SecT571FieldElement) curve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ONE);
        } else {
            org.bouncycastle.math.ec.custom.sec.SecT571Field.square(create644, create644);
            long[] precompMultiplicand3 = org.bouncycastle.math.ec.custom.sec.SecT571Field.precompMultiplicand(create643);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(jArr4, precompMultiplicand3, create64);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(jArr, precompMultiplicand3, create642);
            org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement11 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create64);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiply(create64, create642, secT571FieldElement11.x);
            if (secT571FieldElement11.isZero()) {
                return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, secT571FieldElement11, org.bouncycastle.math.ec.custom.sec.SecT571R1Curve.getHighResolutionOutputSizeshNQ4ISI);
            }
            org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement12 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create643);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(create644, precompMultiplicand3, secT571FieldElement12.x);
            if (precompMultiplicand2 != null) {
                org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement12.x, precompMultiplicand2, secT571FieldElement12.x);
            }
            long[] createExt64 = org.bouncycastle.math.raw.Nat576.createExt64();
            org.bouncycastle.math.ec.custom.sec.SecT571Field.add(create642, create644, create644);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.squareAddToExt(create644, createExt64);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.add(secT571FieldElement6.x, secT571FieldElement7.x, create644);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyAddToExt(create644, secT571FieldElement12.x, createExt64);
            org.bouncycastle.math.ec.custom.sec.SecT571FieldElement secT571FieldElement13 = new org.bouncycastle.math.ec.custom.sec.SecT571FieldElement(create644);
            org.bouncycastle.math.ec.custom.sec.SecT571Field.reduce(createExt64, secT571FieldElement13.x);
            if (precompMultiplicand != null) {
                org.bouncycastle.math.ec.custom.sec.SecT571Field.multiplyPrecomp(secT571FieldElement12.x, precompMultiplicand, secT571FieldElement12.x);
            }
            secT571FieldElement = secT571FieldElement11;
            secT571FieldElement2 = secT571FieldElement13;
            secT571FieldElement3 = secT571FieldElement12;
        }
        return new org.bouncycastle.math.ec.custom.sec.SecT571R1Point(curve, secT571FieldElement, secT571FieldElement2, new org.bouncycastle.math.ec.ECFieldElement[]{secT571FieldElement3});
    }

    SecT571R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    SecT571R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }
}
