package com.payair.hce;

/* loaded from: classes4.dex */
final class setAccessibilityDataSensitive {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private com.payair.hce.getParams AlternateContactlessPaymentDataJson;
    private final com.payair.hce.getTheme values;
    private final android.app.Application writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~(i | i2);
        int i7 = (~i2) | i4;
        int i8 = (i * (-716)) + (i2 * 1435) + ((i4 | i2) * (-1434)) + (((~(i5 | i2)) | i6 | (~(i7 | i3))) * 717) + (((~(i2 | i3)) | (~(i7 | i5)) | i6) * 717);
        return i8 != 1 ? i8 != 2 ? valueOf(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    setAccessibilityDataSensitive(android.app.Application application) {
        this.writeReplace = application;
        this.values = com.payair.hce.getApplication.writeReplace.j_(application).DigitizedCardProfile();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setAccessibilityDataSensitive setaccessibilitydatasensitive = (com.payair.hce.setAccessibilityDataSensitive) objArr[0];
        int i = DigitizedCardProfile + 36;
        int i2 = (~i) + (i << 1);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.getParams DigitizedCardProfile2 = setaccessibilitydatasensitive.values.DigitizedCardProfile();
            setaccessibilitydatasensitive.AlternateContactlessPaymentDataJson = DigitizedCardProfile2;
            return DigitizedCardProfile2;
        }
        setaccessibilitydatasensitive.AlternateContactlessPaymentDataJson = setaccessibilitydatasensitive.values.DigitizedCardProfile();
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getApplicationInfo getapplicationinfo = (com.payair.hce.getApplicationInfo) objArr[0];
        com.payair.hce.setTransitionVisibility settransitionvisibility = new com.payair.hce.setTransitionVisibility();
        settransitionvisibility.values(getapplicationinfo);
        int i = valueOf + 75;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return settransitionvisibility;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getDrawable getdrawable = (com.payair.hce.getDrawable) objArr[0];
        com.payair.hce.setHovered sethovered = new com.payair.hce.setHovered();
        sethovered.AlternateContactlessPaymentDataJson(getdrawable);
        int i = DigitizedCardProfile;
        int i2 = (-2) - (~(((i | 64) << 1) - (i ^ 64)));
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return sethovered;
        }
        throw null;
    }

    static com.payair.hce.setHovered AlternateContactlessPaymentDataJson(com.payair.hce.getDrawable getdrawable) {
        return (com.payair.hce.setHovered) values(new java.lang.Object[]{getdrawable}, 1201017947, -1201017945, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.setTransitionVisibility DigitizedCardProfile(com.payair.hce.getApplicationInfo getapplicationinfo) {
        return (com.payair.hce.setTransitionVisibility) values(new java.lang.Object[]{getapplicationinfo}, 1739836677, -1739836676, (int) java.lang.System.currentTimeMillis());
    }

    final com.payair.hce.getParams valueOf() {
        return (com.payair.hce.getParams) values(new java.lang.Object[]{this}, 276966049, -276966049, java.lang.System.identityHashCode(this));
    }
}
