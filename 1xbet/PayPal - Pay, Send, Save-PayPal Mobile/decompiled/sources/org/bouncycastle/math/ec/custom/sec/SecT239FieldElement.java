package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecT239FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractF2m {
    protected long[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 239;
    }

    public int getK1() {
        return com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    public int getRepresentation() {
        return 2;
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
        return org.bouncycastle.math.ec.custom.sec.SecT239Field.trace(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat256.toBigInteger64(this.x);
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
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.squareN(this.x, i, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        long[] jArr = this.x;
        long[] jArr2 = ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement).x;
        long[] jArr3 = ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement2).x;
        long[] createExt64 = org.bouncycastle.math.raw.Nat256.createExt64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.squareAddToExt(jArr, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT239Field.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.reduce(createExt64, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.square(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.sqrt(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
        long[] jArr = this.x;
        long[] jArr2 = ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement).x;
        long[] jArr3 = ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement2).x;
        long[] jArr4 = ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement3).x;
        long[] createExt64 = org.bouncycastle.math.raw.Nat256.createExt64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.multiplyAddToExt(jArr, jArr2, createExt64);
        org.bouncycastle.math.ec.custom.sec.SecT239Field.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.reduce(createExt64, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement).x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat256.isZero64(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat256.isOne64(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.invert(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.x, 0, 4) ^ 23900158;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public org.bouncycastle.math.ec.ECFieldElement halfTrace() {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.halfTrace(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecT239Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) {
            return org.bouncycastle.math.raw.Nat256.eq64(this.x, ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.addOne(this.x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
        org.bouncycastle.math.ec.custom.sec.SecT239Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCFieldElement).x, create64);
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64);
    }

    protected SecT239FieldElement(long[] jArr) {
        this.x = jArr;
    }

    public SecT239FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecT239Field.fromBigInteger(bigInteger);
    }

    public SecT239FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat256.create64();
    }
}
