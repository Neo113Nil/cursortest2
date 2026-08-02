package com.payair.hce;

/* loaded from: classes4.dex */
public final class setDividerHeight implements com.payair.hce.setSelectedGroup {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        int i4 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = ((i4 ^ 13) + ((i4 & 13) << 1)) % 128;
        if (!(obj instanceof java.lang.Number)) {
            throw setongroupexpandlistener.DigitizedCardProfile(obj, java.lang.Byte.class);
        }
        AlternateContactlessPaymentDataJson = ((((i4 & (-96)) | ((~i4) & 95)) - (~(-(-((i4 & 95) << 1))))) - 1) % 128;
        byte byteValue = ((java.lang.Number) obj).byteValue();
        int i5 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (((i5 ^ 82) + ((i5 & 82) << 1)) - 1) % 128;
        return java.lang.Byte.valueOf(byteValue);
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return valueOf(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1189090289, -1189090289, java.lang.System.identityHashCode(this));
    }
}
