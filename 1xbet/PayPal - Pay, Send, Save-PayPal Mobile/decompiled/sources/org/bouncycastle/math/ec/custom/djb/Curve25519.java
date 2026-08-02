package org.bouncycastle.math.ec.custom.djb;

/* loaded from: classes17.dex */
public class Curve25519 extends org.bouncycastle.math.ec.ECCurve.AbstractFp {
    private static final java.math.BigInteger Camera2StreamConfigurationMap;
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private static final org.bouncycastle.math.ec.ECFieldElement[] getHighSpeedVideoFpsRangesFor;
    public static final java.math.BigInteger q = org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement.Q;
    protected org.bouncycastle.math.ec.custom.djb.Curve25519Point infinity;

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 4;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom secureRandom) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.randomMult(secureRandom, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom secureRandom) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.random(secureRandom, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    public java.math.BigInteger getQ() {
        return q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger) {
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        return new org.bouncycastle.math.ec.custom.djb.Curve25519Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return new org.bouncycastle.math.ec.custom.djb.Curve25519Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
        final int[] iArr = new int[i2 * 16];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i4];
            org.bouncycastle.math.raw.Nat256.copy(((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCPoint.getRawXCoord()).x, 0, iArr, i3);
            org.bouncycastle.math.raw.Nat256.copy(((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCPoint.getRawYCoord()).x, 0, iArr, i3 + 8);
            i3 += 16;
        }
        return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.djb.Curve25519.1
            @Override // org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookup(int i5) {
                int[] create = org.bouncycastle.math.raw.Nat256.create();
                int[] create2 = org.bouncycastle.math.raw.Nat256.create();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = ((i7 ^ i5) - 1) >> 31;
                    for (int i9 = 0; i9 < 8; i9++) {
                        int i10 = create[i9];
                        int[] iArr2 = iArr;
                        create[i9] = i10 ^ (iArr2[i6 + i9] & i8);
                        create2[i9] = create2[i9] ^ (iArr2[(i6 + 8) + i9] & i8);
                    }
                    i6 += 16;
                }
                return org.bouncycastle.math.ec.custom.djb.Curve25519.this.createRawPoint(new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create), new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create2), org.bouncycastle.math.ec.custom.djb.Curve25519.getHighSpeedVideoFpsRangesFor);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookupVar(int i5) {
                int[] create = org.bouncycastle.math.raw.Nat256.create();
                int[] create2 = org.bouncycastle.math.raw.Nat256.create();
                int i6 = i5 * 16;
                for (int i7 = 0; i7 < 8; i7++) {
                    int[] iArr2 = iArr;
                    create[i7] = iArr2[i6 + i7];
                    create2[i7] = iArr2[8 + i6 + i7];
                }
                return org.bouncycastle.math.ec.custom.djb.Curve25519.this.createRawPoint(new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create), new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create2), org.bouncycastle.math.ec.custom.djb.Curve25519.getHighSpeedVideoFpsRangesFor);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECCurve cloneCurve() {
        return new org.bouncycastle.math.ec.custom.djb.Curve25519();
    }

    public Curve25519() {
        super(q);
        this.infinity = new org.bouncycastle.math.ec.custom.djb.Curve25519Point(this, null, null);
        this.f7050a = fromBigInteger(Camera2StreamConfigurationMap);
        this.b = fromBigInteger(getHighResolutionOutputSizeshNQ4ISI);
        this.order = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.cofactor = java.math.BigInteger.valueOf(8L);
        this.coord = 4;
    }

    static {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        Camera2StreamConfigurationMap = bigInteger;
        getHighResolutionOutputSizeshNQ4ISI = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        getHighSpeedVideoFpsRangesFor = new org.bouncycastle.math.ec.ECFieldElement[]{new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(org.bouncycastle.math.ec.ECConstants.ONE), new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(bigInteger)};
    }
}
