package com.payair.hce;

/* loaded from: classes4.dex */
public final class isAlternateAidMchipDataValid extends com.payair.hce.setMobilePinInitialConfiguration {
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | (~i2));
        int i5 = i | i2;
        int i6 = (i * (-755)) + (i2 * (-755)) + (i4 * 1512) + (((~(i5 | i3)) | i4) * (-756)) + (((~i3) | i5) * 756);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 != 2) {
            return values(objArr);
        }
        valueOf = (writeReplace + 85) % 128;
        return null;
    }

    public isAlternateAidMchipDataValid(byte[] bArr) throws com.payair.hce.digitize {
        super(bArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.isAlternateAidMchipDataValid isalternateaidmchipdatavalid = (com.payair.hce.isAlternateAidMchipDataValid) objArr[0];
        int i = valueOf;
        int i2 = ((i & (-22)) | ((~i) & 21)) + ((i & 21) << 1);
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Byte.valueOf(isalternateaidmchipdatavalid.RecordsJson());
        }
        isalternateaidmchipdatavalid.RecordsJson();
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.isAlternateAidMchipDataValid isalternateaidmchipdatavalid = (com.payair.hce.isAlternateAidMchipDataValid) objArr[0];
        writeReplace = ((-2) - (~(valueOf + 56))) % 128;
        byte byteValue = (byte) (((java.lang.Byte) com.payair.hce.setMobilePinInitialConfiguration.valueOf(new java.lang.Object[]{isalternateaidmchipdatavalid}, 1301847775, -1301847775, java.lang.System.identityHashCode(isalternateaidmchipdatavalid))).byteValue() >>> 3);
        int i = writeReplace;
        int i2 = i | 71;
        int i3 = i2 << 1;
        int i4 = -((~(i & 71)) & i2);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Byte.valueOf(byteValue);
        }
        throw null;
    }

    public final byte writeReplace() {
        return ((java.lang.Byte) writeReplace(new java.lang.Object[]{this}, -1247048372, 1247048373, java.lang.System.identityHashCode(this))).byteValue();
    }

    public final byte valueOf() {
        return ((java.lang.Byte) writeReplace(new java.lang.Object[]{this}, -1399385240, 1399385240, java.lang.System.identityHashCode(this))).byteValue();
    }

    @Override // com.payair.hce.setMobilePinInitialConfiguration
    public final void AlternateContactlessPaymentDataJson() {
        writeReplace(new java.lang.Object[]{this}, -1479935289, 1479935291, java.lang.System.identityHashCode(this));
    }
}
