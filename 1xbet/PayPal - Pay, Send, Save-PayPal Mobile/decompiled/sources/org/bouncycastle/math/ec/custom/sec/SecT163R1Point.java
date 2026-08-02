package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecT163R1Point extends org.bouncycastle.math.ec.ECPoint.AbstractF2m {
    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
        if (eCFieldElement.isZero()) {
            return eCPoint;
        }
        org.bouncycastle.math.ec.ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        org.bouncycastle.math.ec.ECFieldElement zCoord = eCPoint.getZCoord(0);
        if (rawXCoord.isZero() || !zCoord.isOne()) {
            return twice().add(eCPoint);
        }
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
        org.bouncycastle.math.ec.ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement.square();
        org.bouncycastle.math.ec.ECFieldElement square2 = eCFieldElement2.square();
        org.bouncycastle.math.ec.ECFieldElement square3 = eCFieldElement3.square();
        org.bouncycastle.math.ec.ECFieldElement add = curve.getA().multiply(square3).add(square2).add(eCFieldElement2.multiply(eCFieldElement3));
        org.bouncycastle.math.ec.ECFieldElement addOne = rawYCoord.addOne();
        org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct = curve.getA().add(addOne).multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
        org.bouncycastle.math.ec.ECFieldElement multiply = rawXCoord.multiply(square3);
        org.bouncycastle.math.ec.ECFieldElement square4 = multiply.add(add).square();
        if (square4.isZero()) {
            return multiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
        }
        if (multiplyPlusProduct.isZero()) {
            return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, multiplyPlusProduct, curve.getB().sqrt());
        }
        org.bouncycastle.math.ec.ECFieldElement multiply2 = multiplyPlusProduct.square().multiply(multiply);
        org.bouncycastle.math.ec.ECFieldElement multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
        return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, addOne, multiply3), new org.bouncycastle.math.ec.ECFieldElement[]{multiply3});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
        if (eCFieldElement.isZero()) {
            return curve.getInfinity();
        }
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
        boolean isOne = eCFieldElement3.isOne();
        org.bouncycastle.math.ec.ECFieldElement multiply = isOne ? eCFieldElement2 : eCFieldElement2.multiply(eCFieldElement3);
        org.bouncycastle.math.ec.ECFieldElement square = isOne ? eCFieldElement3 : eCFieldElement3.square();
        org.bouncycastle.math.ec.ECFieldElement a2 = curve.getA();
        if (!isOne) {
            a2 = a2.multiply(square);
        }
        org.bouncycastle.math.ec.ECFieldElement add = eCFieldElement2.square().add(multiply).add(a2);
        if (add.isZero()) {
            return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, add, curve.getB().sqrt());
        }
        org.bouncycastle.math.ec.ECFieldElement square2 = add.square();
        org.bouncycastle.math.ec.ECFieldElement multiply2 = isOne ? add : add.multiply(square);
        if (!isOne) {
            eCFieldElement = eCFieldElement.multiply(eCFieldElement3);
        }
        return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, square2, eCFieldElement.squarePlusProduct(add, multiply).add(square2).add(multiply2), new org.bouncycastle.math.ec.ECFieldElement[]{multiply2});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint negate() {
        if (!isInfinity()) {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            if (!eCFieldElement.isZero()) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new org.bouncycastle.math.ec.ECFieldElement[]{eCFieldElement3});
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
        return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public org.bouncycastle.math.ec.ECPoint add(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement2;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement3;
        org.bouncycastle.math.ec.ECFieldElement squarePlusProduct;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement4;
        org.bouncycastle.math.ec.ECFieldElement multiply;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = this.x;
        org.bouncycastle.math.ec.ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        if (eCFieldElement5.isZero()) {
            return rawXCoord.isZero() ? curve.getInfinity() : eCPoint.add(this);
        }
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement6 = this.y;
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement7 = this.zs[0];
        org.bouncycastle.math.ec.ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        org.bouncycastle.math.ec.ECFieldElement zCoord = eCPoint.getZCoord(0);
        boolean isOne = eCFieldElement7.isOne();
        if (isOne) {
            eCFieldElement = rawXCoord;
            eCFieldElement2 = rawYCoord;
        } else {
            eCFieldElement = rawXCoord.multiply(eCFieldElement7);
            eCFieldElement2 = rawYCoord.multiply(eCFieldElement7);
        }
        boolean isOne2 = zCoord.isOne();
        if (isOne2) {
            eCFieldElement3 = eCFieldElement6;
        } else {
            eCFieldElement5 = eCFieldElement5.multiply(zCoord);
            eCFieldElement3 = eCFieldElement6.multiply(zCoord);
        }
        org.bouncycastle.math.ec.ECFieldElement add = eCFieldElement3.add(eCFieldElement2);
        org.bouncycastle.math.ec.ECFieldElement add2 = eCFieldElement5.add(eCFieldElement);
        if (add2.isZero()) {
            return add.isZero() ? twice() : curve.getInfinity();
        }
        if (rawXCoord.isZero()) {
            org.bouncycastle.math.ec.ECPoint normalize = normalize();
            org.bouncycastle.math.ec.ECFieldElement xCoord = normalize.getXCoord();
            org.bouncycastle.math.ec.ECFieldElement yCoord = normalize.getYCoord();
            org.bouncycastle.math.ec.ECFieldElement divide = yCoord.add(rawYCoord).divide(xCoord);
            eCFieldElement4 = divide.square().add(divide).add(xCoord).add(curve.getA());
            if (eCFieldElement4.isZero()) {
                return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, eCFieldElement4, curve.getB().sqrt());
            }
            squarePlusProduct = divide.multiply(xCoord.add(eCFieldElement4)).add(eCFieldElement4).add(yCoord).divide(eCFieldElement4).add(eCFieldElement4);
            multiply = curve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ONE);
        } else {
            org.bouncycastle.math.ec.ECFieldElement square = add2.square();
            org.bouncycastle.math.ec.ECFieldElement multiply2 = add.multiply(eCFieldElement5);
            org.bouncycastle.math.ec.ECFieldElement multiply3 = add.multiply(eCFieldElement);
            org.bouncycastle.math.ec.ECFieldElement multiply4 = multiply2.multiply(multiply3);
            if (multiply4.isZero()) {
                return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, multiply4, curve.getB().sqrt());
            }
            org.bouncycastle.math.ec.ECFieldElement multiply5 = add.multiply(square);
            if (!isOne2) {
                multiply5 = multiply5.multiply(zCoord);
            }
            squarePlusProduct = multiply3.add(square).squarePlusProduct(multiply5, eCFieldElement6.add(eCFieldElement7));
            eCFieldElement4 = multiply4;
            multiply = !isOne ? multiply5.multiply(eCFieldElement7) : multiply5;
        }
        return new org.bouncycastle.math.ec.custom.sec.SecT163R1Point(curve, eCFieldElement4, squarePlusProduct, new org.bouncycastle.math.ec.ECFieldElement[]{multiply});
    }

    SecT163R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    SecT163R1Point(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }
}
