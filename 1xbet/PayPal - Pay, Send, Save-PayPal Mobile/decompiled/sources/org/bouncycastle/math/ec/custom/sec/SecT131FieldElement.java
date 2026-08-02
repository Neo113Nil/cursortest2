package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecT131FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractF2m {
    protected long[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 131;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }

    public int getM() {
        return 131;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return org.bouncycastle.math.ec.custom.sec.SecT131Field.trace(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat192.toBigInteger64(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement squarePow(int i) {
        if (i <= 0) {
            return this;
        }
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.squareN(this.x, i, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        long[] jArr = this.x;
        long[] jArr2 = ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement).x;
        long[] jArr3 = ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement2).x;
        long[] create64 = org.bouncycastle.math.raw.Nat.create64(5);
        org.bouncycastle.math.ec.custom.sec.SecT131Field.squareAddToExt(jArr, create64);
        org.bouncycastle.math.ec.custom.sec.SecT131Field.multiplyAddToExt(jArr2, jArr3, create64);
        long[] create642 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.reduce(create64, create642);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create642);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.square(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.sqrt(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
        long[] jArr = this.x;
        long[] jArr2 = ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement).x;
        long[] jArr3 = ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement2).x;
        long[] jArr4 = ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement3).x;
        long[] create64 = org.bouncycastle.math.raw.Nat.create64(5);
        org.bouncycastle.math.ec.custom.sec.SecT131Field.multiplyAddToExt(jArr, jArr2, create64);
        org.bouncycastle.math.ec.custom.sec.SecT131Field.multiplyAddToExt(jArr3, jArr4, create64);
        long[] create642 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.reduce(create64, create642);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create642);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement).x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat192.isZero64(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat192.isOne64(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.invert(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.x, 0, 3) ^ 131832;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public org.bouncycastle.math.ec.ECFieldElement halfTrace() {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.halfTrace(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecT131Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) {
            return org.bouncycastle.math.raw.Nat192.eq64(this.x, ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.addOne(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        long[] create64 = org.bouncycastle.math.raw.Nat192.create64();
        org.bouncycastle.math.ec.custom.sec.SecT131Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecT131FieldElement) eCFieldElement).x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT131FieldElement(create64);
    }

    protected SecT131FieldElement(long[] jArr) {
        this.x = jArr;
    }

    public SecT131FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecT131Field.fromBigInteger(bigInteger);
    }

    public SecT131FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat192.create64();
    }
}
