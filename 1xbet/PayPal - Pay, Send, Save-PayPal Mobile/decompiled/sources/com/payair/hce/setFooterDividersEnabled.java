package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFooterDividersEnabled implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.math.BigInteger bigInteger;
        int i;
        java.lang.Object obj = objArr[2];
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 117;
        int i4 = -(-((i2 ^ 117) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        writeReplace = i6;
        if (i5 % 2 == 0) {
            if (obj instanceof com.payair.hce.setOnGroupClickListener) {
                int i7 = i6 & 75;
                int i8 = -(-((i6 ^ 75) | i7));
                DigitizedCardProfile = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                bigInteger = ((com.payair.hce.setOnGroupClickListener) obj).DigitizedCardProfile();
                int i9 = writeReplace + 50;
                i = (~i9) + (i9 << 1);
            } else {
                bigInteger = new java.math.BigInteger(obj.toString());
                int i10 = writeReplace;
                i = ((i10 ^ 33) - (~((i10 & 33) << 1))) - 1;
            }
            DigitizedCardProfile = i % 128;
            return bigInteger;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return DigitizedCardProfile(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, -1191791897, 1191791897, java.lang.System.identityHashCode(this));
    }
}
