package com.payair.hce;

/* loaded from: classes4.dex */
public final class setQ extends com.payair.hce.Record {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!((com.payair.hce.smallInitialization) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 105584507, -105584498, java.lang.System.identityHashCode(access202Var))).writeReplace(access202Var.writeReplace())) {
            int i4 = DigitizedCardProfile;
            int i5 = (i4 & (-40)) | ((~i4) & 39);
            int i6 = (i4 & 39) << 1;
            writeReplace = ((i5 & i6) + (i6 | i5)) % 128;
            arrayList.add(com.payair.hce.resetAuthenticationReferences.DigitizedCardProfile);
            int i7 = DigitizedCardProfile;
            int i8 = i7 ^ 55;
            int i9 = ((i7 & 55) | i8) << 1;
            int i10 = -i8;
            writeReplace = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
        }
        int i11 = writeReplace;
        DigitizedCardProfile = (((i11 ^ 120) + ((i11 & 120) << 1)) - 1) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) writeReplace(new java.lang.Object[]{this, access202Var}, 753999523, -753999523, java.lang.System.identityHashCode(this));
    }
}
