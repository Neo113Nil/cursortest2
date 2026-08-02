package com.payair.hce;

/* loaded from: classes4.dex */
public final class bindServiceAsUser implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        int i = values + 23;
        DigitizedCardProfile = i % 128;
        try {
            if (i % 2 == 0) {
                return com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(obj.toString()).DigitizedCardProfile();
            }
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(obj.toString()).DigitizedCardProfile();
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return writeReplace(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1336130233, -1336130233, java.lang.System.identityHashCode(this));
    }
}
