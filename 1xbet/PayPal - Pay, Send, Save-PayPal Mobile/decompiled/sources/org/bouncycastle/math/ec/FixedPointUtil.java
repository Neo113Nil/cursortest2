package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class FixedPointUtil {
    public static final java.lang.String PRECOMP_NAME = "bc_fixed_point";

    public static org.bouncycastle.math.ec.FixedPointPreCompInfo precompute(final org.bouncycastle.math.ec.ECPoint eCPoint) {
        final org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        return (org.bouncycastle.math.ec.FixedPointPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.FixedPointUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public final org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                org.bouncycastle.math.ec.ECLookupTable lookupTable;
                org.bouncycastle.math.ec.FixedPointPreCompInfo fixedPointPreCompInfo = preCompInfo instanceof org.bouncycastle.math.ec.FixedPointPreCompInfo ? (org.bouncycastle.math.ec.FixedPointPreCompInfo) preCompInfo : null;
                int combSize = org.bouncycastle.math.ec.FixedPointUtil.getCombSize(org.bouncycastle.math.ec.ECCurve.this);
                int i = combSize > 250 ? 6 : 5;
                int i2 = 1 << i;
                if (fixedPointPreCompInfo != null && (lookupTable = fixedPointPreCompInfo.getLookupTable()) != null && lookupTable.getSize() >= i2) {
                    return fixedPointPreCompInfo;
                }
                int i3 = ((combSize + i) - 1) / i;
                org.bouncycastle.math.ec.ECPoint[] eCPointArr = new org.bouncycastle.math.ec.ECPoint[i + 1];
                eCPointArr[0] = eCPoint;
                for (int i4 = 1; i4 < i; i4++) {
                    eCPointArr[i4] = eCPointArr[i4 - 1].timesPow2(i3);
                }
                eCPointArr[i] = eCPointArr[0].subtract(eCPointArr[1]);
                org.bouncycastle.math.ec.ECCurve.this.normalizeAll(eCPointArr);
                org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = new org.bouncycastle.math.ec.ECPoint[i2];
                eCPointArr2[0] = eCPointArr[0];
                for (int i5 = i - 1; i5 >= 0; i5--) {
                    org.bouncycastle.math.ec.ECPoint eCPoint2 = eCPointArr[i5];
                    int i6 = 1 << i5;
                    for (int i7 = i6; i7 < i2; i7 += i6 << 1) {
                        eCPointArr2[i7] = eCPointArr2[i7 - i6].add(eCPoint2);
                    }
                }
                org.bouncycastle.math.ec.ECCurve.this.normalizeAll(eCPointArr2);
                org.bouncycastle.math.ec.FixedPointPreCompInfo fixedPointPreCompInfo2 = new org.bouncycastle.math.ec.FixedPointPreCompInfo();
                fixedPointPreCompInfo2.setLookupTable(org.bouncycastle.math.ec.ECCurve.this.createCacheSafeLookupTable(eCPointArr2, 0, i2));
                fixedPointPreCompInfo2.setOffset(eCPointArr[i]);
                fixedPointPreCompInfo2.setWidth(i);
                return fixedPointPreCompInfo2;
            }
        });
    }

    public static org.bouncycastle.math.ec.FixedPointPreCompInfo getFixedPointPreCompInfo(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
        if (preCompInfo instanceof org.bouncycastle.math.ec.FixedPointPreCompInfo) {
            return (org.bouncycastle.math.ec.FixedPointPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getCombSize(org.bouncycastle.math.ec.ECCurve eCCurve) {
        java.math.BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }
}
