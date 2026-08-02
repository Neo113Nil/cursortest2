package util.h.xy.eb;

/* loaded from: classes18.dex */
public final class rc {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26489(java.math.BigInteger bigInteger, int i) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        byte[] byteArray = bigInteger.toByteArray();
        if (i >= byteArray.length) {
            if (i <= byteArray.length) {
                int i2 = getHighSpeedVideoSizes;
                int i3 = ((i2 | 3) << 1) - (i2 ^ 3);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    return byteArray;
                }
                throw null;
            }
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 & 53) + (i4 | 53);
            getHighSpeedVideoSizes = i5 % 128;
            byte[] bArr = new byte[i];
            int length = byteArray.length;
            if (i5 % 2 == 0) {
                java.lang.System.arraycopy(byteArray, 1, bArr, i * length, byteArray.length);
                return bArr;
            }
            java.lang.System.arraycopy(byteArray, 0, bArr, i - length, byteArray.length);
            return bArr;
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 81) % 128;
        byte[] bArr2 = new byte[i];
        int length2 = byteArray.length;
        int i6 = -i;
        int i7 = ~i6;
        int i8 = (i6 * (-665)) + (length2 * com.visa.cbp.getCertUsage.setODAData) + (i7 * (-333));
        int i9 = ~i;
        int i10 = ~((i7 & i9) | (i7 ^ i9));
        int i11 = ~(length2 | i);
        int i12 = ((i10 ^ i11) | (i10 & i11)) * com.visa.cbp.getCertUsage.getODAData;
        int i13 = (i8 ^ i12) + ((i8 & i12) << 1);
        int i14 = ((~((i7 ^ i) | (i7 & i))) | (~((length2 ^ i9) | (length2 & i9)))) * com.visa.cbp.getCertUsage.getODAData;
        java.lang.System.arraycopy(byteArray, (i13 & i14) + (i14 | i13), bArr2, 0, i);
        int i15 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i15 & 93) + (i15 | 93)) % 128;
        return bArr2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m26490(util.h.xy.eu.a aVar) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        int m26712 = aVar.m26712();
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = (m26712 * 713) - 4977;
        int i2 = ~m26712;
        int i3 = ~((i2 ^ 7) | (i2 & 7));
        int i4 = ~identityHashCode;
        int i5 = ~((i4 ^ 7) | (i4 & 7));
        int i6 = -(-(((i3 ^ i5) | (i3 & i5)) * (-712)));
        int i7 = (i & i6) + (i | i6);
        int i8 = (i2 ^ i4) | (i2 & i4);
        int i9 = ~((i8 ^ 7) | (i8 & 7));
        int i10 = (m26712 ^ 7) | (m26712 & 7);
        int i11 = ~((i10 ^ identityHashCode) | (i10 & identityHashCode));
        int i12 = -(-(((i11 ^ i9) | (i11 & i9)) * (-712)));
        int i13 = (i7 ^ i12) + ((i12 & i7) << 1);
        int i14 = -(-((i2 | i5) * 712));
        int i15 = ((i13 & i14) + (i14 | i13)) / 8;
        int i16 = getHighSpeedVideoSizes;
        int i17 = ((i16 | 39) << 1) - (i16 ^ 39);
        getHighSpeedVideoFpsRangesFor = i17 % 128;
        if (i17 % 2 == 0) {
            return i15;
        }
        throw null;
    }
}
