package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public abstract class WNafUtil {
    public static final java.lang.String PRECOMP_NAME = "bc_wnaf";
    private static final int[] getHighSpeedVideoFpsRanges = {13, 41, 121, 337, 897, 2305};
    private static final byte[] getHighSpeedVideoSizes = new byte[0];
    private static final int[] getHighSpeedVideoFpsRangesFor = new int[0];
    private static final org.bouncycastle.math.ec.ECPoint[] Camera2StreamConfigurationMap = new org.bouncycastle.math.ec.ECPoint[0];

    static /* synthetic */ org.bouncycastle.math.ec.ECPoint[] getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i) {
        org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = new org.bouncycastle.math.ec.ECPoint[i];
        java.lang.System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    public static int[] generateCompactNaf(java.math.BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new java.lang.IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return getHighSpeedVideoFpsRangesFor;
        }
        java.math.BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i = bitLength >> 1;
        int[] iArr = new int[i];
        java.math.BigInteger xor = add.xor(bigInteger);
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i2 < bitLength - 1) {
            if (xor.testBit(i2)) {
                iArr[i3] = i4 | ((bigInteger.testBit(i2) ? -1 : 1) << 16);
                i2++;
                i3++;
                i4 = 1;
            } else {
                i4++;
            }
            i2++;
        }
        int i5 = i3 + 1;
        iArr[i3] = 65536 | i4;
        if (i <= i5) {
            return iArr;
        }
        int[] iArr2 = new int[i5];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i5);
        return iArr2;
    }

    public static int[] generateCompactWindowNaf(int i, java.math.BigInteger bigInteger) {
        if (i == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new java.lang.IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new java.lang.IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return getHighSpeedVideoFpsRangesFor;
        }
        int bitLength = (bigInteger.bitLength() / i) + 1;
        int[] iArr = new int[bitLength];
        int i2 = 1 << i;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i3) == z) {
                i3++;
            } else {
                bigInteger = bigInteger.shiftRight(i3);
                int intValue = bigInteger.intValue() & (i2 - 1);
                if (z) {
                    intValue++;
                }
                z = ((i2 >>> 1) & intValue) != 0;
                if (z) {
                    intValue -= i2;
                }
                if (i4 > 0) {
                    i3--;
                }
                iArr[i4] = i3 | (intValue << 16);
                i4++;
                i3 = i;
            }
        }
        if (bitLength <= i4) {
            return iArr;
        }
        int[] iArr2 = new int[i4];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i4);
        return iArr2;
    }

    public static byte[] generateJSF(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        int max = java.lang.Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if ((i | i2) == 0 && bigInteger.bitLength() <= i3 && bigInteger2.bitLength() <= i3) {
                break;
            }
            int intValue = (bigInteger.intValue() >>> i3) + i;
            int intValue2 = (bigInteger2.intValue() >>> i3) + i2;
            int i5 = intValue & 1;
            if (i5 != 0) {
                i5 -= intValue & 2;
                if ((intValue & 7) + i5 == 4 && (intValue2 & 3) == 2) {
                    i5 = -i5;
                }
            }
            int i6 = intValue2 & 1;
            if (i6 != 0) {
                i6 -= intValue2 & 2;
                if ((intValue2 & 7) + i6 == 4 && (intValue & 3) == 2) {
                    i6 = -i6;
                }
            }
            if ((i << 1) == i5 + 1) {
                i ^= 1;
            }
            if ((i2 << 1) == i6 + 1) {
                i2 ^= 1;
            }
            i3++;
            if (i3 == 30) {
                bigInteger = bigInteger.shiftRight(30);
                bigInteger2 = bigInteger2.shiftRight(30);
                i3 = 0;
            }
            bArr[i4] = (byte) ((i6 & 15) | (i5 << 4));
            i4++;
        }
        if (max <= i4) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static byte[] generateWindowNaf(int i, java.math.BigInteger bigInteger) {
        if (i == 2) {
            return generateNaf(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new java.lang.IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return getHighSpeedVideoSizes;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i2 = 1 << i;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i3) == z) {
                i3++;
            } else {
                bigInteger = bigInteger.shiftRight(i3);
                int intValue = bigInteger.intValue() & (i2 - 1);
                if (z) {
                    intValue++;
                }
                z = ((i2 >>> 1) & intValue) != 0;
                if (z) {
                    intValue -= i2;
                }
                if (i4 > 0) {
                    i3--;
                }
                int i5 = i4 + i3;
                bArr[i5] = (byte) intValue;
                i4 = i5 + 1;
                i3 = i;
            }
        }
        if (bitLength <= i4) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static org.bouncycastle.math.ec.WNafPreCompInfo precomputeWithPointMap(org.bouncycastle.math.ec.ECPoint eCPoint, final org.bouncycastle.math.ec.ECPointMap eCPointMap, final org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo, final boolean z) {
        return (org.bouncycastle.math.ec.WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.3
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public final org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                org.bouncycastle.math.ec.ECPoint[] preComp;
                org.bouncycastle.math.ec.ECPoint[] preCompNeg;
                org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo2 = preCompInfo instanceof org.bouncycastle.math.ec.WNafPreCompInfo ? (org.bouncycastle.math.ec.WNafPreCompInfo) preCompInfo : null;
                int width = org.bouncycastle.math.ec.WNafPreCompInfo.this.getWidth();
                int length = org.bouncycastle.math.ec.WNafPreCompInfo.this.getPreComp().length;
                boolean z2 = z;
                if (wNafPreCompInfo2 != null && wNafPreCompInfo2.getWidth() >= width && (preComp = wNafPreCompInfo2.getPreComp()) != null && preComp.length >= length && (!z2 || ((preCompNeg = wNafPreCompInfo2.getPreCompNeg()) != null && preCompNeg.length >= length))) {
                    int i = wNafPreCompInfo2.Camera2StreamConfigurationMap;
                    if (i > 0) {
                        wNafPreCompInfo2.Camera2StreamConfigurationMap = i - 1;
                    }
                    return wNafPreCompInfo2;
                }
                org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo3 = new org.bouncycastle.math.ec.WNafPreCompInfo();
                wNafPreCompInfo3.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.WNafPreCompInfo.this.Camera2StreamConfigurationMap;
                org.bouncycastle.math.ec.ECPoint twice = org.bouncycastle.math.ec.WNafPreCompInfo.this.getTwice();
                if (twice != null) {
                    wNafPreCompInfo3.setTwice(eCPointMap.map(twice));
                }
                org.bouncycastle.math.ec.ECPoint[] preComp2 = org.bouncycastle.math.ec.WNafPreCompInfo.this.getPreComp();
                int length2 = preComp2.length;
                org.bouncycastle.math.ec.ECPoint[] eCPointArr = new org.bouncycastle.math.ec.ECPoint[length2];
                for (int i2 = 0; i2 < preComp2.length; i2++) {
                    eCPointArr[i2] = eCPointMap.map(preComp2[i2]);
                }
                wNafPreCompInfo3.setPreComp(eCPointArr);
                wNafPreCompInfo3.setWidth(width);
                if (z) {
                    org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = new org.bouncycastle.math.ec.ECPoint[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        eCPointArr2[i3] = eCPointArr[i3].negate();
                    }
                    wNafPreCompInfo3.setPreCompNeg(eCPointArr2);
                }
                return wNafPreCompInfo3;
            }
        });
    }

    public static org.bouncycastle.math.ec.WNafPreCompInfo precompute(final org.bouncycastle.math.ec.ECPoint eCPoint, final int i, final boolean z) {
        final org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        return (org.bouncycastle.math.ec.WNafPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.2
            /* JADX WARN: Removed duplicated region for block: B:59:0x0117 A[LOOP:0: B:58:0x0115->B:59:0x0117, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x013b A[LOOP:1: B:69:0x0139->B:70:0x013b, LOOP_END] */
            @Override // org.bouncycastle.math.ec.PreCompCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                org.bouncycastle.math.ec.ECPoint eCPoint2;
                org.bouncycastle.math.ec.ECPoint[] eCPointArr;
                org.bouncycastle.math.ec.ECPoint[] eCPointArr2;
                int length;
                org.bouncycastle.math.ec.ECPoint[] highSpeedVideoSizes;
                int i2;
                org.bouncycastle.math.ec.ECPoint eCPoint3;
                int coordinateSystem;
                org.bouncycastle.math.ec.ECPoint[] preComp;
                org.bouncycastle.math.ec.ECPoint[] preCompNeg;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement = null;
                org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof org.bouncycastle.math.ec.WNafPreCompInfo ? (org.bouncycastle.math.ec.WNafPreCompInfo) preCompInfo : null;
                int max = java.lang.Math.max(2, java.lang.Math.min(16, i));
                int i3 = 1 << (max - 2);
                boolean z2 = z;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getWidth() >= java.lang.Math.max(wNafPreCompInfo.getConfWidth(), max) && (preComp = wNafPreCompInfo.getPreComp()) != null && preComp.length >= i3 && (!z2 || ((preCompNeg = wNafPreCompInfo.getPreCompNeg()) != null && preCompNeg.length >= i3))) {
                    int i4 = wNafPreCompInfo.Camera2StreamConfigurationMap;
                    if (i4 > 0) {
                        wNafPreCompInfo.Camera2StreamConfigurationMap = i4 - 1;
                    }
                    return wNafPreCompInfo;
                }
                org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo2 = new org.bouncycastle.math.ec.WNafPreCompInfo();
                if (wNafPreCompInfo != null) {
                    int i5 = wNafPreCompInfo.Camera2StreamConfigurationMap;
                    if (i5 > 0) {
                        i5--;
                        wNafPreCompInfo.Camera2StreamConfigurationMap = i5;
                    }
                    wNafPreCompInfo2.Camera2StreamConfigurationMap = i5;
                    wNafPreCompInfo2.setConfWidth(wNafPreCompInfo.getConfWidth());
                    eCPointArr = wNafPreCompInfo.getPreComp();
                    eCPointArr2 = wNafPreCompInfo.getPreCompNeg();
                    eCPoint2 = wNafPreCompInfo.getTwice();
                } else {
                    eCPoint2 = null;
                    eCPointArr = null;
                    eCPointArr2 = null;
                }
                int min = java.lang.Math.min(16, java.lang.Math.max(wNafPreCompInfo2.getConfWidth(), max));
                int i6 = 1 << (min - 2);
                int i7 = 0;
                if (eCPointArr == null) {
                    eCPointArr = org.bouncycastle.math.ec.WNafUtil.Camera2StreamConfigurationMap;
                    length = 0;
                } else {
                    length = eCPointArr.length;
                }
                if (length < i6) {
                    eCPointArr = org.bouncycastle.math.ec.WNafUtil.getHighSpeedVideoSizes(eCPointArr, i6);
                    if (i6 == 1) {
                        eCPointArr[0] = eCPoint.normalize();
                    } else {
                        if (length == 0) {
                            eCPointArr[0] = eCPoint;
                            i2 = 1;
                        } else {
                            i2 = length;
                        }
                        if (i6 == 2) {
                            eCPointArr[1] = eCPoint.threeTimes();
                        } else {
                            org.bouncycastle.math.ec.ECPoint eCPoint4 = eCPointArr[i2 - 1];
                            if (eCPoint2 == null) {
                                eCPoint2 = eCPointArr[0].twice();
                                if (!eCPoint2.isInfinity() && org.bouncycastle.math.ec.ECAlgorithms.isFpCurve(curve) && curve.getFieldSize() >= 64 && ((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                                    eCFieldElement = eCPoint2.getZCoord(0);
                                    eCPoint3 = curve.createPoint(eCPoint2.getXCoord().toBigInteger(), eCPoint2.getYCoord().toBigInteger());
                                    org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement.square();
                                    eCPoint4 = eCPoint4.scaleX(square).scaleY(square.multiply(eCFieldElement));
                                    if (length == 0) {
                                        eCPointArr[0] = eCPoint4;
                                    }
                                    while (i2 < i6) {
                                        eCPoint4 = eCPoint4.add(eCPoint3);
                                        eCPointArr[i2] = eCPoint4;
                                        i2++;
                                    }
                                }
                            }
                            eCPoint3 = eCPoint2;
                            while (i2 < i6) {
                            }
                        }
                        curve.normalizeAll(eCPointArr, length, i6 - length, eCFieldElement);
                    }
                }
                if (z) {
                    if (eCPointArr2 == null) {
                        highSpeedVideoSizes = new org.bouncycastle.math.ec.ECPoint[i6];
                    } else {
                        i7 = eCPointArr2.length;
                        if (i7 < i6) {
                            highSpeedVideoSizes = org.bouncycastle.math.ec.WNafUtil.getHighSpeedVideoSizes(eCPointArr2, i6);
                        }
                        while (i7 < i6) {
                            eCPointArr2[i7] = eCPointArr[i7].negate();
                            i7++;
                        }
                    }
                    eCPointArr2 = highSpeedVideoSizes;
                    while (i7 < i6) {
                    }
                }
                wNafPreCompInfo2.setPreComp(eCPointArr);
                wNafPreCompInfo2.setPreCompNeg(eCPointArr2);
                wNafPreCompInfo2.setTwice(eCPoint2);
                wNafPreCompInfo2.setWidth(min);
                return wNafPreCompInfo2;
            }
        });
    }

    public static int getWindowSize(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < iArr.length && i >= iArr[i3]) {
            i3++;
        }
        return java.lang.Math.max(2, java.lang.Math.min(i2, i3 + 2));
    }

    public static int getWindowSize(int i, int[] iArr) {
        return getWindowSize(i, iArr, 16);
    }

    public static int getWindowSize(int i, int i2) {
        return getWindowSize(i, getHighSpeedVideoFpsRanges, i2);
    }

    public static int getWindowSize(int i) {
        return getWindowSize(i, getHighSpeedVideoFpsRanges, 16);
    }

    public static org.bouncycastle.math.ec.WNafPreCompInfo getWNafPreCompInfo(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
        if (preCompInfo instanceof org.bouncycastle.math.ec.WNafPreCompInfo) {
            return (org.bouncycastle.math.ec.WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static org.bouncycastle.math.ec.WNafPreCompInfo getWNafPreCompInfo(org.bouncycastle.math.ec.ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getNafWeight(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static byte[] generateNaf(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return getHighSpeedVideoSizes;
        }
        java.math.BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i = bitLength - 1;
        byte[] bArr = new byte[i];
        java.math.BigInteger xor = add.xor(bigInteger);
        int i2 = 1;
        while (i2 < i) {
            if (xor.testBit(i2)) {
                bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                i2++;
            }
            i2++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static void configureBasepoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        java.math.BigInteger order = curve.getOrder();
        final int min = java.lang.Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3);
        curve.precompute(eCPoint, PRECOMP_NAME, new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public final org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof org.bouncycastle.math.ec.WNafPreCompInfo ? (org.bouncycastle.math.ec.WNafPreCompInfo) preCompInfo : null;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == min) {
                    wNafPreCompInfo.Camera2StreamConfigurationMap = 0;
                    return wNafPreCompInfo;
                }
                org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo2 = new org.bouncycastle.math.ec.WNafPreCompInfo();
                wNafPreCompInfo2.Camera2StreamConfigurationMap = 0;
                wNafPreCompInfo2.setConfWidth(min);
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                    wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                    wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                    wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
                }
                return wNafPreCompInfo2;
            }
        });
    }
}
