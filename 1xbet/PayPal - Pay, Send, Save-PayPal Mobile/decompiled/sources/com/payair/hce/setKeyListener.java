package com.payair.hce;

/* loaded from: classes4.dex */
public final class setKeyListener implements com.payair.hce.setSelectedGroup {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        java.lang.reflect.Type type = (java.lang.reflect.Type) objArr[3];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 93;
        int i3 = ((i | 93) & (~i2)) + (i2 << 1);
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            if (obj instanceof java.util.Collection) {
                java.util.Collection collection = (java.util.Collection) com.payair.hce.setOnGroupExpandListener.valueOf(new java.lang.Object[]{setongroupexpandlistener, (java.util.Collection) obj, new java.util.ArrayList(), type}, -1714344637, 1714344638, java.lang.System.identityHashCode(setongroupexpandlistener));
                int i4 = valueOf;
                AlternateContactlessPaymentDataJson = ((i4 ^ 45) + ((i4 & 45) << 1)) % 128;
                return collection;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(setongroupexpandlistener.AlternateContactlessPaymentDataJson(obj));
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = i5 | 79;
            valueOf = (((i6 << 1) - (~(-((~(i5 & 79)) & i6)))) - 1) % 128;
            return arrayList;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -742150270, 742150270, java.lang.System.identityHashCode(this));
    }
}
