package com.payair.hce;

/* loaded from: classes4.dex */
class setOnSystemUiVisibilityChangeListener {
    private static int valueOf = 1;
    private static int writeReplace;
    private android.content.SharedPreferences AlternateContactlessPaymentDataJson;
    private android.content.Context DigitizedCardProfile;

    public setOnSystemUiVisibilityChangeListener(android.content.Context context) {
        this.DigitizedCardProfile = context;
        this.AlternateContactlessPaymentDataJson = context.getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
    }

    void AlternateContactlessPaymentDataJson(com.payair.hce.communication.JsonResponse jsonResponse) {
        int i = writeReplace;
        int i2 = i & 125;
        int i3 = (i ^ 125) | i2;
        valueOf = ((i2 & i3) + (i3 | i2)) % 128;
        if (!jsonResponse.isSuccessful()) {
            int i4 = valueOf ^ 61;
            writeReplace = (((((r0 & 61) | i4) << 1) - (~(-i4))) - 1) % 128;
            if (jsonResponse.getErrors() != null) {
                int i5 = writeReplace;
                int i6 = (i5 ^ 65) + ((i5 & 65) << 1);
                valueOf = i6 % 128;
                if (i6 % 2 == 0) {
                    jsonResponse.getErrors().iterator();
                    throw null;
                }
                java.util.Iterator<com.payair.hce.ErrorModel> it = jsonResponse.getErrors().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int i7 = valueOf;
                    int i8 = i7 & 57;
                    int i9 = (i7 | 57) & (~i8);
                    int i10 = -(-(i8 << 1));
                    writeReplace = (((i9 | i10) << 1) - (i9 ^ i10)) % 128;
                    if (it.next().getReasonCode().equals("SDK_VERSION_CHECK_FAILURE")) {
                        int i11 = valueOf;
                        int i12 = ((i11 ^ 2) + ((i11 & 2) << 1)) - 1;
                        writeReplace = i12 % 128;
                        if (i12 % 2 == 0) {
                            com.payair.hce.setLeft.values(new java.lang.Object[]{"VERSION_CHECK_FAILED", java.lang.Boolean.TRUE, this.AlternateContactlessPaymentDataJson}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
                            new com.payair.hce.setIsCredential().DigitizedCardProfile();
                            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
                            ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).sdkTooOldNeedReset();
                            valueOf = (writeReplace + 121) % 128;
                        }
                    }
                }
            }
        }
        int i13 = writeReplace + 109;
        valueOf = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    boolean values() {
        writeReplace = (valueOf + 89) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"VERSION_CHECK_FAILED", java.lang.Boolean.FALSE, this.AlternateContactlessPaymentDataJson}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i = writeReplace;
        int i2 = i ^ 23;
        int i3 = ((i & 23) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            return booleanValue;
        }
        throw new java.lang.ArithmeticException();
    }

    void writeReplace(com.payair.hce.communication.JsonResponse jsonResponse) {
        int i = writeReplace;
        int i2 = (((i & (-48)) | ((~i) & 47)) - (~((i & 47) << 1))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            jsonResponse.isSuccessful();
            throw new java.lang.ArithmeticException();
        }
        if (jsonResponse.isSuccessful()) {
            com.payair.hce.setLeft.values(new java.lang.Object[]{"VERSION_CHECK_FAILED", java.lang.Boolean.FALSE, this.AlternateContactlessPaymentDataJson}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
            valueOf = (writeReplace + 1) % 128;
        }
        int i3 = valueOf;
        int i4 = i3 & 9;
        writeReplace = (((i3 | 9) & (~i4)) + (i4 << 1)) % 128;
    }
}
