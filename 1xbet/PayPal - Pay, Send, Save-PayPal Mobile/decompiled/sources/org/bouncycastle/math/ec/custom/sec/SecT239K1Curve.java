package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecT239K1Curve extends org.bouncycastle.math.ec.ECCurve.AbstractF2m {
    private static final org.bouncycastle.math.ec.ECFieldElement[] getHighResolutionOutputSizeshNQ4ISI = {new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(org.bouncycastle.math.ec.ECConstants.ONE)};
    protected org.bouncycastle.math.ec.custom.sec.SecT239K1Point infinity;

    @Override // org.bouncycastle.math.ec.ECCurve
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

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger) {
        return new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        return new org.bouncycastle.math.ec.custom.sec.SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return new org.bouncycastle.math.ec.custom.sec.SecT239K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECMultiplier createDefaultMultiplier() {
        return new org.bouncycastle.math.ec.WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
        final long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i4];
            org.bouncycastle.math.raw.Nat256.copy64(((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCPoint.getRawXCoord()).x, 0, jArr, i3);
            org.bouncycastle.math.raw.Nat256.copy64(((org.bouncycastle.math.ec.custom.sec.SecT239FieldElement) eCPoint.getRawYCoord()).x, 0, jArr, i3 + 4);
            i3 += 8;
        }
        return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.1
            @Override // org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookup(int i5) {
                long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
                long[] create642 = org.bouncycastle.math.raw.Nat256.create64();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    long j = ((i7 ^ i5) - 1) >> 31;
                    for (int i8 = 0; i8 < 4; i8++) {
                        long j2 = create64[i8];
                        long[] jArr2 = jArr;
                        create64[i8] = j2 ^ (jArr2[i6 + i8] & j);
                        create642[i8] = create642[i8] ^ (jArr2[(i6 + 4) + i8] & j);
                    }
                    i6 += 8;
                }
                return org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64), new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create642), org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.getHighResolutionOutputSizeshNQ4ISI);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookupVar(int i5) {
                long[] create64 = org.bouncycastle.math.raw.Nat256.create64();
                long[] create642 = org.bouncycastle.math.raw.Nat256.create64();
                int i6 = i5 * 8;
                for (int i7 = 0; i7 < 4; i7++) {
                    long[] jArr2 = jArr;
                    create64[i7] = jArr2[i6 + i7];
                    create642[i7] = jArr2[4 + i6 + i7];
                }
                return org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create64), new org.bouncycastle.math.ec.custom.sec.SecT239FieldElement(create642), org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.getHighResolutionOutputSizeshNQ4ISI);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECCurve cloneCurve() {
        return new org.bouncycastle.math.ec.custom.sec.SecT239K1Curve();
    }

    public SecT239K1Curve() {
        super(239, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 0, 0);
        this.infinity = new org.bouncycastle.math.ec.custom.sec.SecT239K1Point(this, null, null);
        this.f7050a = fromBigInteger(java.math.BigInteger.valueOf(0L));
        this.b = fromBigInteger(java.math.BigInteger.valueOf(1L));
        this.order = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = java.math.BigInteger.valueOf(4L);
        this.coord = 6;
    }
}
