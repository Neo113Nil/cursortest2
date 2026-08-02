package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOverscrollFooter implements com.payair.hce.setSelectedGroup {
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        int i = valueOf;
        int i2 = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        writeReplace = i2;
        if (obj instanceof java.lang.Number) {
            int i3 = i2 ^ 33;
            valueOf = ((((i2 & 33) | i3) << 1) - i3) % 128;
            float floatValue = ((java.lang.Number) obj).floatValue();
            int i4 = writeReplace;
            int i5 = i4 & 25;
            valueOf = (i5 + ((i4 ^ 25) | i5)) % 128;
            return java.lang.Float.valueOf(floatValue);
        }
        try {
            float parseFloat = java.lang.Float.parseFloat(obj.toString());
            int i6 = valueOf;
            int i7 = i6 & 53;
            int i8 = (i6 ^ 53) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            writeReplace = i9 % 128;
            if (i9 % 2 != 0) {
                return java.lang.Float.valueOf(parseFloat);
            }
            throw null;
        } catch (java.lang.Exception unused) {
            throw setongroupexpandlistener.DigitizedCardProfile(obj, java.lang.Float.class);
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return writeReplace(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -1929595312, 1929595312, java.lang.System.identityHashCode(this));
    }
}
