package com.payair.hce;

/* loaded from: classes4.dex */
public final class setP extends com.payair.hce.Record {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = i & 39;
        int i3 = (i ^ 39) | i2;
        writeReplace = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            int i4 = DigitizedCardProfile;
            writeReplace = (((i4 | 83) << 1) - (i4 ^ 83)) % 128;
            if (((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var))).getProfileVersion().writeReplace() == com.payair.hce.unRegisterDevice.valueOf) {
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                boolean IccPrivateKeyCrtComponentsJson = ((com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir))).IccPrivateKeyCrtComponentsJson();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (!IccPrivateKeyCrtComponentsJson) {
                    int i5 = writeReplace;
                    int i6 = i5 & 57;
                    int i7 = -(-((i5 ^ 57) | i6));
                    DigitizedCardProfile = ((i6 & i7) + (i7 | i6)) % 128;
                    arrayList.add(com.payair.hce.resetAuthenticationReferences.getProfileVersion);
                    int i8 = DigitizedCardProfile;
                    writeReplace = (((i8 & 43) - (~(i8 | 43))) - 1) % 128;
                }
                int i9 = DigitizedCardProfile;
                int i10 = i9 & 1;
                int i11 = i9 | 1;
                int i12 = (i10 & i11) + (i11 | i10);
                writeReplace = i12 % 128;
                if (i12 % 2 == 0) {
                    return arrayList;
                }
                throw null;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i13 = DigitizedCardProfile + 29;
        writeReplace = i13 % 128;
        if (i13 % 2 == 0) {
            return arrayList2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this, access202Var}, -1193786871, 1193786871, java.lang.System.identityHashCode(this));
    }
}
