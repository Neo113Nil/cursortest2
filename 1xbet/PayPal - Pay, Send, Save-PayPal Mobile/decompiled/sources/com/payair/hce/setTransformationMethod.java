package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTransformationMethod implements com.payair.hce.setSelectedGroup {
    private static int values = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        int i = values;
        int i2 = i & 113;
        int i3 = i2 + ((i ^ 113) | i2);
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (obj instanceof java.lang.Number) {
            long longValue = ((java.lang.Number) obj).longValue();
            writeReplace = (values + 69) % 128;
            return java.lang.Long.valueOf(longValue);
        }
        try {
            long parseLong = java.lang.Long.parseLong(obj.toString());
            int i4 = writeReplace;
            values = (((i4 ^ 94) + ((i4 & 94) << 1)) - 1) % 128;
            return java.lang.Long.valueOf(parseLong);
        } catch (java.lang.Exception unused) {
            throw setongroupexpandlistener.DigitizedCardProfile(obj, java.lang.Long.class);
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 752839503, -752839503, java.lang.System.identityHashCode(this));
    }
}
