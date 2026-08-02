package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class SimpleLookupTable extends org.bouncycastle.math.ec.AbstractECLookupTable {
    private final org.bouncycastle.math.ec.ECPoint[] getHighSpeedVideoFpsRangesFor;

    public SimpleLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, int i2) {
        org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = new org.bouncycastle.math.ec.ECPoint[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            eCPointArr2[i3] = eCPointArr[i + i3];
        }
        this.getHighSpeedVideoFpsRangesFor = eCPointArr2;
    }

    @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
    public org.bouncycastle.math.ec.ECPoint lookupVar(int i) {
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public org.bouncycastle.math.ec.ECPoint lookup(int i) {
        throw new java.lang.UnsupportedOperationException("Constant-time lookup not supported");
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public int getSize() {
        return this.getHighSpeedVideoFpsRangesFor.length;
    }
}
