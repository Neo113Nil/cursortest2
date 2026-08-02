package com.payair.hce;

/* loaded from: classes4.dex */
public class setPivotY implements com.payair.hce.isDataValid {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int RecordsJson;
    private boolean AlternateContactlessPaymentDataJson = false;
    private com.payair.hce.setScaleY DigitizedCardProfile;
    private java.lang.String getAid;
    private android.content.SharedPreferences valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ANDROID_CRYPTO | ");
        sb.append(com.payair.hce.setPivotY.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        int i = RecordsJson;
        int i2 = i & 119;
        IccPrivateKeyCrtComponentsJson = (((i | 119) & (~i2)) + (i2 << 1)) % 128;
    }

    setPivotY(android.content.SharedPreferences sharedPreferences, com.payair.hce.setScaleY setscaley, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.valueOf = sharedPreferences;
        this.DigitizedCardProfile = setscaley;
        this.values = str;
        this.writeReplace = str2;
        this.getAid = str3;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i;
        boolean z = false;
        com.payair.hce.setPivotY setpivoty = (com.payair.hce.setPivotY) objArr[0];
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 61) % 128;
        try {
            setpivoty.DigitizedCardProfile.valueOf((java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{setpivoty.values, null, setpivoty.valueOf}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis()));
            setpivoty.DigitizedCardProfile.valueOf((java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{setpivoty.getAid, null, setpivoty.valueOf}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis()));
        } catch (java.security.KeyStoreException unused) {
            int i2 = RecordsJson;
            int i3 = i2 & 61;
            i = (((i2 | 61) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        }
        if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{setpivoty.values, setpivoty.valueOf}, -894546068, 894546080, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i4 = RecordsJson;
            IccPrivateKeyCrtComponentsJson = (((i4 & (-34)) | ((~i4) & 33)) + ((i4 & 33) << 1)) % 128;
            if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{setpivoty.getAid, setpivoty.valueOf}, -894546068, 894546080, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i5 = IccPrivateKeyCrtComponentsJson;
                int i6 = i5 | 103;
                int i7 = (i6 << 1) - ((~(i5 & 103)) & i6);
                RecordsJson = i7 % 128;
                if (i7 % 2 == 0) {
                    z = true;
                }
                i = RecordsJson + 103;
                IccPrivateKeyCrtComponentsJson = i % 128;
                return java.lang.Boolean.valueOf(z);
            }
        }
        int i8 = RecordsJson;
        int i9 = (i8 & (-30)) | ((~i8) & 29);
        int i10 = -(-((i8 & 29) << 1));
        IccPrivateKeyCrtComponentsJson = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
        i = RecordsJson + 103;
        IccPrivateKeyCrtComponentsJson = i % 128;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.payair.hce.MDESInstanceIDListenerService
    public byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr3);
        byte[] AlternateContactlessPaymentDataJson = this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(new java.lang.String(bArr), bArr3);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
        byte[] DigitizedCardProfile = this.DigitizedCardProfile.DigitizedCardProfile(new java.lang.String(bArr2), AlternateContactlessPaymentDataJson);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(DigitizedCardProfile);
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 63;
        int i3 = (i ^ 63) | i2;
        RecordsJson = ((i2 & i3) + (i3 | i2)) % 128;
        return DigitizedCardProfile;
    }

    @Override // com.payair.hce.isDataValid
    public final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -498636222, 498636222, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
