package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawableTintList implements com.payair.hce.setSelectedGroup {
    private static int values = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setCompoundDrawableTintList setcompounddrawabletintlist = (com.payair.hce.setCompoundDrawableTintList) objArr[0];
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        java.lang.reflect.Type type = (java.lang.reflect.Type) objArr[3];
        int i = writeReplace;
        int i2 = ((i ^ 29) - (~((i & 29) << 1))) - 1;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) com.payair.hce.setOnGroupExpandListener.valueOf(new java.lang.Object[]{setongroupexpandlistener, (java.util.Collection) obj, new java.util.HashSet(), type}, -1714344637, 1714344638, java.lang.System.identityHashCode(setongroupexpandlistener));
            int i3 = values;
            int i4 = (i3 ^ 65) + ((i3 & 65) << 1);
            writeReplace = i4 % 128;
            if (i4 % 2 == 0) {
                return collection;
            }
            throw null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(setongroupexpandlistener.AlternateContactlessPaymentDataJson(obj));
        int i5 = ~java.lang.System.identityHashCode(setcompounddrawabletintlist);
        int i6 = i5 & (-1740870733);
        int i7 = ~((((-1740870733) | i5) & (~i6)) | i6);
        int i8 = ((~i7) & 1818420347) | ((-1818420348) & i7);
        int i9 = i7 & 1818420347;
        int i10 = 731308214 - (~(-(~(-(-(((i9 ^ i8) | (i9 & i8)) * (-933)))))));
        int i11 = ~((i5 ^ 1818420347) | (i5 & 1818420347));
        int i12 = i11 ^ (-1877210240);
        int i13 = i11 & (-1877210240);
        int i14 = ((i13 ^ i12) | (i13 & i12)) * 933;
        int i15 = ((i10 ^ i14) | (i10 & i14)) << 1;
        int i16 = -(((~i14) & i10) | ((~i10) & i14));
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = (1644258848 & i17) | ((~i17) & (-1644258849));
        int i19 = -(-((i17 & (-1644258849)) << 1));
        int identityHashCode = java.lang.System.identityHashCode(setcompounddrawabletintlist);
        int i20 = identityHashCode ^ (-429686805);
        int i21 = ~identityHashCode;
        int i22 = identityHashCode & (-429686805);
        int i23 = ~((i20 ^ i22) | (i20 & i22));
        int i24 = i21 & 1717786505;
        int i25 = (1717786505 | i21) & (~i24);
        int i26 = (i25 ^ i24) | (i25 & i24);
        int i27 = ~((i26 ^ 1608288021) | (i26 & 1608288021));
        int i28 = -(-(((i23 ^ i27) | (i23 & i27)) * 920));
        int i29 = (i28 & 1844859907) + (i28 | 1844859907);
        int i30 = i21 & (-1608288022);
        int i31 = ((-1608288022) | i21) & (~i30);
        int i32 = ~((i31 ^ i30) | (i31 & i30));
        int i33 = ((i32 ^ 429686804) | (i32 & 429686804)) * 920;
        int i34 = i29 & i33;
        int i35 = ~(((-429686805) & i21) | (i21 ^ (-429686805)));
        int i36 = identityHashCode ^ (-1178601218);
        int i37 = (-1178601218) & identityHashCode;
        int i38 = ~((i37 ^ i36) | (i37 & i36));
        int i39 = i35 & i38;
        int i40 = (i35 | i38) & (~i39);
        int i41 = (i40 ^ i39) | (i40 & i39);
        int i42 = identityHashCode | 2147473309;
        int i43 = ~i42;
        int i44 = (i42 | i43) & i43;
        if (((i18 | i19) << 1) - (i18 ^ i19) > (((i34 - (~((i33 ^ i29) | i34))) - 1) - (~(-(~(((i44 ^ i41) | (i44 & i41)) * 920))))) - 2) {
            return hashSet;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return writeReplace(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -735283982, 735283982, java.lang.System.identityHashCode(this));
    }
}
