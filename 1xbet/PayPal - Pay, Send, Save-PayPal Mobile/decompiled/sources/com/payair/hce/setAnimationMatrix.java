package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class setAnimationMatrix {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;
    private static com.payair.hce.setAnimationMatrix values = new com.payair.hce.setAnimationMatrix("INSTANCE");
    private static final /* synthetic */ com.payair.hce.setAnimationMatrix[] valueOf = writeReplace();
    private static java.util.HashMap<java.lang.String, java.lang.String> DigitizedCardProfile = new java.util.HashMap<>();

    private setAnimationMatrix(java.lang.String str) {
    }

    public static com.payair.hce.setAnimationMatrix valueOf(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson + 65;
        writeReplace = i % 128;
        com.payair.hce.setAnimationMatrix setanimationmatrix = (com.payair.hce.setAnimationMatrix) java.lang.Enum.valueOf(com.payair.hce.setAnimationMatrix.class, str);
        if (i % 2 == 0) {
            return setanimationmatrix;
        }
        throw null;
    }

    public static com.payair.hce.setAnimationMatrix[] values() {
        int i = writeReplace;
        int i2 = (i & (-4)) | ((~i) & 3);
        int i3 = (i & 3) << 1;
        AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        com.payair.hce.setAnimationMatrix[] setanimationmatrixArr = (com.payair.hce.setAnimationMatrix[]) valueOf.clone();
        int i4 = AlternateContactlessPaymentDataJson;
        writeReplace = ((i4 & 13) + (i4 | 13)) % 128;
        return setanimationmatrixArr;
    }

    private static /* synthetic */ com.payair.hce.setAnimationMatrix[] writeReplace() {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (i + 85) % 128;
        com.payair.hce.setAnimationMatrix[] setanimationmatrixArr = {values};
        int i2 = i & 61;
        int i3 = ((i ^ 61) | i2) << 1;
        int i4 = -((i | 61) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        writeReplace = i5 % 128;
        if (i5 % 2 == 0) {
            return setanimationmatrixArr;
        }
        throw null;
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (((i | 1) << 1) - (i ^ 1)) % 128;
    }

    static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = i & (-226954001);
        int i3 = (currentTimeMillis & 226954000) | i2;
        int i4 = currentTimeMillis & (-226954001);
        int i5 = (i3 ^ i4) | (i3 & i4);
        int i6 = ~i5;
        int i7 = (i5 | i6) & i6;
        int i8 = (i | currentTimeMillis) & i;
        int i9 = i8 & 1382596846;
        int i10 = (1382596846 | i8) & (~i9);
        int i11 = (i10 ^ i9) | (i10 & i9);
        int i12 = i11 & 1340541876;
        int i13 = (i11 | 1340541876) & (~i12);
        int i14 = ~((i13 ^ i12) | (i13 & i12));
        int i15 = ((~i14) & i7) | ((~i7) & i14);
        int i16 = i7 & i14;
        int i17 = -(-(((i16 ^ i15) | (i16 & i15)) * 920));
        int i18 = i17 & (-6187315);
        int i19 = (i17 | (-6187315)) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        int i22 = i8 & (-1340541877);
        int i23 = ((-1340541877) | i8) & (~i22);
        int i24 = (i23 ^ i22) | (i23 & i22);
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = i26 & 226954000;
        int i28 = i21 & ((((226954000 | i26) & (~i27)) | i27) * 920);
        int i29 = ~((i ^ (-226954001)) | i2);
        int i30 = currentTimeMillis & (-1113587877);
        int i31 = ((-1113587877) | currentTimeMillis) & (~i30);
        int i32 = (i31 ^ i30) | (i31 & i30);
        int i33 = ~i32;
        int i34 = (i32 | i33) & i33;
        int i35 = ((~i34) & i29) | ((~i29) & i34);
        int i36 = i29 & i34;
        int i37 = (i36 ^ i35) | (i36 & i35);
        int i38 = (currentTimeMillis ^ 1609550846) | (currentTimeMillis & 1609550846);
        int i39 = ~i38;
        int i40 = (i38 | i39) & i39;
        int i41 = i37 & i40;
        int i42 = -(~(-(-((((i40 | i37) & (~i41)) | i41) * 920))));
        int i43 = ~((int) java.lang.System.currentTimeMillis());
        int i44 = i43 & 1515399170;
        int i45 = i43 ^ 1515399170;
        int i46 = ~(i44 | i45);
        int i47 = i46 & 1480591360;
        int i48 = (i46 | 1480591360) & (~i47);
        int i49 = ((i48 ^ i47) | (i48 & i47)) * (-970);
        int i50 = (i49 & 1219478961) + (i49 | 1219478961);
        int i51 = ((((-996793957) & i50) | ((~i50) & 996793956)) - (~((i50 & 996793956) << 1))) - 1;
        int i52 = (i45 ^ i44) | (i44 & i45);
        int i53 = ~i52;
        int i54 = (i52 | i53) & i53;
        int i55 = -(-(((i54 ^ 34807810) | (i54 & 34807810)) * 970));
        java.lang.String str2 = DigitizedCardProfile.get(str);
        if (((((r4 | i21) & (~i28)) + (i28 << 1)) - (~i42)) - 2 <= (i51 & i55) + (i55 | i51)) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    static void AlternateContactlessPaymentDataJson(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        int i = writeReplace;
        int i2 = (i | 21) << 1;
        int i3 = -((i & (-22)) | ((~i) & 21));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        AlternateContactlessPaymentDataJson = i4;
        DigitizedCardProfile = hashMap;
        int i5 = i4 & 55;
        int i6 = -(-(i4 | 55));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        writeReplace = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
