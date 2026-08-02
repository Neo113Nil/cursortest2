package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawablePadding implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        java.lang.reflect.Type type = (java.lang.reflect.Type) objArr[3];
        int i = valueOf;
        int i2 = i & 91;
        int i3 = -(-((i ^ 91) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            if (obj instanceof java.util.Collection) {
                java.util.Collection collection = (java.util.Collection) com.payair.hce.setOnGroupExpandListener.valueOf(new java.lang.Object[]{setongroupexpandlistener, (java.util.Collection) obj, new java.util.TreeSet(), type}, -1714344637, 1714344638, java.lang.System.identityHashCode(setongroupexpandlistener));
                int i5 = DigitizedCardProfile;
                valueOf = (((i5 & (-54)) | ((~i5) & 53)) + ((i5 & 53) << 1)) % 128;
                return collection;
            }
            java.util.TreeSet treeSet = new java.util.TreeSet();
            treeSet.add(setongroupexpandlistener.AlternateContactlessPaymentDataJson(obj));
            int i6 = valueOf;
            int i7 = i6 & 85;
            int i8 = ((i6 ^ 85) | i7) << 1;
            int i9 = -((i6 | 85) & (~i7));
            int i10 = (i8 & i9) + (i8 | i9);
            DigitizedCardProfile = i10 % 128;
            if (i10 % 2 == 0) {
                return treeSet;
            }
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -2127463374, 2127463374, java.lang.System.identityHashCode(this));
    }
}
