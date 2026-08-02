package com.payair.hce;

/* loaded from: classes10.dex */
public final class CardholderValidators {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~((~i3) | i4);
        return ((((i * (-337)) + (i2 * 339)) + ((((~((~i2) | i)) | i5) | (~(i | i3))) * (-338))) + ((~(i4 | i2)) * 338)) + (((~((i | i2) | i3)) | i5) * 338) != 1 ? writeReplace(objArr) : values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = i ^ 59;
        int i3 = (i & 59) << 1;
        writeReplace = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        byte[] bArr = new byte[0];
        try {
            bArr = org.apache.commons.codec.binary.Hex.decodeHex(str2.toCharArray());
            int i4 = DigitizedCardProfile;
            int i5 = i4 & 111;
            writeReplace = ((i5 - (~((i4 ^ 111) | i5))) - 1) % 128;
        } catch (org.apache.commons.codec.DecoderException e) {
            e.printStackTrace();
        }
        java.lang.String str3 = new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) DigitizedCardProfile(new java.lang.Object[]{bArr}, 1591898240, -1591898240, (int) java.lang.System.currentTimeMillis())));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        java.lang.String upperCase = sb.toString().toUpperCase();
        int i6 = DigitizedCardProfile;
        int i7 = i6 & 73;
        int i8 = -(-((i6 ^ 73) | i7));
        writeReplace = ((i7 & i8) + (i8 | i7)) % 128;
        return upperCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r12.length > 65536) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        r12 = (r3 & (-92)) | ((~r3) & 91);
        r1 = -(-((r3 & 91) << 1));
        r3 = (r12 & r1) + (r12 | r1);
        com.payair.hce.CardholderValidators.DigitizedCardProfile = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if ((r3 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        r12 = new byte[]{com.google.common.base.Ascii.SI, 0, 0};
        r12[0] = (byte) (r2 >>> 42);
        r12[4] = (byte) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        return new byte[]{-126, (byte) (r2 >> 8), (byte) r2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r12.length > 16777215) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        r1 = (r1 + 1) % 128;
        com.payair.hce.CardholderValidators.writeReplace = r1;
        r7 = new byte[]{-125, (byte) (r2 >> 16), (byte) (r2 >> 8), (byte) r2};
        r12 = r1 | 109;
        com.payair.hce.CardholderValidators.DigitizedCardProfile = ((r12 << 1) - (r12 & (~(r1 & 109)))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        r8 = new byte[]{-124, (byte) (r2 >> 24), (byte) (r2 >> 16), (byte) (r2 >> 8), (byte) r2};
        com.payair.hce.CardholderValidators.DigitizedCardProfile = (((r3 | 19) << 1) - (r3 ^ 19)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0026, code lost:
    
        r2 = new byte[]{(byte) r2};
        r12 = r1 | 111;
        com.payair.hce.CardholderValidators.writeReplace = ((r12 << 1) - (r12 & (~(r1 & 111)))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0024, code lost:
    
        if (r12.length < 128) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r12.length < 20754) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r12.length > 255) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        com.payair.hce.CardholderValidators.writeReplace = ((r1 ^ 101) + ((r1 & 101) << 1)) % 128;
        r2 = new byte[]{-127, (byte) r2};
        r12 = (((r1 | 82) << 1) - (r1 ^ 82)) - 1;
        com.payair.hce.CardholderValidators.writeReplace = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if ((r12 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int length;
        byte[] bArr = (byte[]) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = (-2) - (~((i ^ 62) + ((i & 62) << 1)));
        int i3 = i2 % 128;
        writeReplace = i3;
        if (i2 % 2 == 0) {
            length = bArr.length;
        } else {
            length = bArr.length;
        }
    }

    private static byte[] DigitizedCardProfile(byte[] bArr) {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{bArr}, 1591898240, -1591898240, (int) java.lang.System.currentTimeMillis());
    }

    public static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{str, str2}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }
}
