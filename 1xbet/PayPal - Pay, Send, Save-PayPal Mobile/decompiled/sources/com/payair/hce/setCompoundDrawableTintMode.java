package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawableTintMode implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        short parseShort;
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        int i = DigitizedCardProfile;
        int i2 = i & 91;
        int i3 = ((i | 91) & (~i2)) + (i2 << 1);
        int i4 = i3 % 128;
        valueOf = i4;
        if (i3 % 2 == 0) {
            if (!(obj instanceof java.lang.Number)) {
                try {
                    parseShort = java.lang.Short.parseShort(obj.toString());
                    int i5 = DigitizedCardProfile;
                    int i6 = i5 & 115;
                    valueOf = (i6 + ((i5 ^ 115) | i6)) % 128;
                } catch (java.lang.Exception unused) {
                    throw setongroupexpandlistener.DigitizedCardProfile(obj, java.lang.Short.class);
                }
            } else {
                int i7 = (i4 & 41) + (i4 | 41);
                DigitizedCardProfile = i7 % 128;
                if (i7 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                parseShort = ((java.lang.Number) obj).shortValue();
            }
            return java.lang.Short.valueOf(parseShort);
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return writeReplace(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -976178859, 976178859, java.lang.System.identityHashCode(this));
    }
}
