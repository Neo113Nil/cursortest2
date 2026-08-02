package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP224R1FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    protected int[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] create;
        int[] create2;
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat224.isZero(iArr) || org.bouncycastle.math.raw.Nat224.isOne(iArr)) {
            return this;
        }
        int[] create3 = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.negate(iArr, create3);
        int[] random = org.bouncycastle.math.raw.Mod.random(org.bouncycastle.math.ec.custom.sec.SecP224R1Field.getHighResolutionOutputSizeshNQ4ISI);
        int[] create4 = org.bouncycastle.math.raw.Nat224.create();
        int[] create5 = org.bouncycastle.math.raw.Nat224.create();
        int[] create6 = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.raw.Nat224.copy(iArr, create5);
        for (int i = 0; i < 7; i++) {
            org.bouncycastle.math.raw.Nat224.copy(create5, create6);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.squareN(create5, 1 << i, create5);
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create5, create6, create5);
        }
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.squareN(create5, 95, create5);
        if (!org.bouncycastle.math.raw.Nat224.isOne(create5)) {
            return null;
        }
        loop1: while (true) {
            int[] create7 = org.bouncycastle.math.raw.Nat224.create();
            org.bouncycastle.math.raw.Nat224.copy(random, create7);
            int[] create8 = org.bouncycastle.math.raw.Nat224.create();
            create8[0] = 1;
            int[] create9 = org.bouncycastle.math.raw.Nat224.create();
            org.bouncycastle.math.raw.Nat224.copy(create3, create9);
            int[] create10 = org.bouncycastle.math.raw.Nat224.create();
            int[] create11 = org.bouncycastle.math.raw.Nat224.create();
            for (int i2 = 0; i2 < 7; i2++) {
                org.bouncycastle.math.raw.Nat224.copy(create7, create10);
                org.bouncycastle.math.raw.Nat224.copy(create8, create11);
                int i3 = 1 << i2;
                while (true) {
                    i3--;
                    if (i3 >= 0) {
                        getHighSpeedVideoFpsRangesFor(create7, create8, create9, create4);
                    }
                }
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create8, create11, create4);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create4, create3, create4);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create7, create10, create9);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.add(create9, create4, create9);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create7, create11, create4);
                org.bouncycastle.math.raw.Nat224.copy(create9, create7);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create8, create10, create8);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.add(create8, create4, create8);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(create8, create9);
                org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create9, create3, create9);
            }
            create = org.bouncycastle.math.raw.Nat224.create();
            create2 = org.bouncycastle.math.raw.Nat224.create();
            for (int i4 = 1; i4 < 96; i4++) {
                org.bouncycastle.math.raw.Nat224.copy(create7, create);
                org.bouncycastle.math.raw.Nat224.copy(create8, create2);
                getHighSpeedVideoFpsRangesFor(create7, create8, create9, create4);
                if (org.bouncycastle.math.raw.Nat224.isZero(create7)) {
                    break loop1;
                }
            }
            org.bouncycastle.math.ec.custom.sec.SecP224R1Field.addOne(random, random);
        }
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.inv(create2, create4);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create4, create, create4);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(create4, random);
        if (org.bouncycastle.math.raw.Nat224.eq(iArr, random)) {
            return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create4);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat224.toBigInteger(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return org.bouncycastle.math.raw.Nat224.getBit(this.x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat224.isZero(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat224.isOne(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.Arrays.hashCode(this.x, 0, 7);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecP224R1Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) {
            return org.bouncycastle.math.raw.Nat224.eq(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224R1FieldElement(create);
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(iArr2, iArr, iArr2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.twice(iArr2, iArr2);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.square(iArr, iArr4);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.add(iArr3, iArr4, iArr);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.multiply(iArr3, iArr4, iArr3);
        org.bouncycastle.math.ec.custom.sec.SecP224R1Field.reduce32(org.bouncycastle.math.raw.Nat.shiftUpBits(7, iArr3, 2, 0), iArr3);
    }

    protected SecP224R1FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SecP224R1FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecP224R1Field.fromBigInteger(bigInteger);
    }

    public SecP224R1FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat224.create();
    }
}
