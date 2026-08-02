package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawablesWithIntrinsicBounds implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        int i = valueOf;
        int i2 = i & 67;
        int i3 = ((i ^ 67) | i2) << 1;
        int i4 = -((i | 67) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        DigitizedCardProfile = i6;
        if (i5 % 2 != 0) {
            if (!(obj instanceof java.lang.Number)) {
                try {
                    int parseInt = java.lang.Integer.parseInt(obj.toString());
                    int i7 = DigitizedCardProfile;
                    int i8 = i7 & 95;
                    int i9 = (i7 ^ 95) | i8;
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    valueOf = i10 % 128;
                    if (i10 % 2 == 0) {
                        return java.lang.Integer.valueOf(parseInt);
                    }
                    throw null;
                } catch (java.lang.Exception unused) {
                    throw setongroupexpandlistener.DigitizedCardProfile(obj, java.lang.Integer.class);
                }
            }
            int i11 = i6 ^ 47;
            int i12 = (i6 & 47) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            valueOf = i13 % 128;
            if (i13 % 2 == 0) {
                return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
            }
            throw null;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return valueOf(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -774241565, 774241565, java.lang.System.identityHashCode(this));
    }
}
