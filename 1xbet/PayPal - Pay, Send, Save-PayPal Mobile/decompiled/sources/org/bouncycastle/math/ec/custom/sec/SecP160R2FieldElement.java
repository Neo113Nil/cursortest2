package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP160R2FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    protected int[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat160.toBigInteger(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return org.bouncycastle.math.raw.Nat160.getBit(this.x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat160.isZero(iArr) || org.bouncycastle.math.raw.Nat160.isOne(iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create, iArr, create);
        int[] create2 = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.square(create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create2, iArr, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.square(create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, iArr, create3);
        int[] create4 = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 3, create4);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create4, create2, create4);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create4, 7, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, create4, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 3, create4);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create4, create2, create4);
        int[] create5 = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create4, 14, create5);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create5, create3, create5);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create5, 31, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, create5, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 62, create5);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create5, create3, create5);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create5, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 18, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, create4, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, iArr, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, create, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 6, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.squareN(create3, 2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create3, iArr, create3);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.square(create3, create);
        if (org.bouncycastle.math.raw.Nat160.eq(iArr, create)) {
            return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat160.isZero(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat160.isOne(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.Arrays.hashCode(this.x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecP160R2Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) {
            return org.bouncycastle.math.raw.Nat160.eq(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    protected SecP160R2FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SecP160R2FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecP160R2Field.fromBigInteger(bigInteger);
    }

    public SecP160R2FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat160.create();
    }
}
