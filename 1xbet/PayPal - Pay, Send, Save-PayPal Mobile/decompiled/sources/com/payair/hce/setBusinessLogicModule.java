package com.payair.hce;

/* loaded from: classes4.dex */
public final class setBusinessLogicModule extends com.payair.hce.Record {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.initialize initializeVar;
        int i;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.payair.hce.smallInitialization smallinitialization = (com.payair.hce.smallInitialization) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 105584507, -105584498, java.lang.System.identityHashCode(access202Var));
        ((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1684199295, 1684199305, java.lang.System.identityHashCode(access202Var))).DigitizedCardProfile();
        access202Var.writeReplace();
        smallinitialization.values();
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            int i2 = DigitizedCardProfile;
            int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
            writeReplace = i3 % 128;
            if (i3 % 2 != 0) {
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                throw null;
            }
            com.payair.hce.getCodeCacheDir getcodecachedir2 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
            initializeVar = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir2));
            int i4 = writeReplace;
            int i5 = (i4 & (-122)) | ((~i4) & 121);
            int i6 = -(-((i4 & 121) << 1));
            DigitizedCardProfile = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        } else {
            if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
                int i7 = writeReplace;
                int i8 = i7 ^ 109;
                int i9 = (i7 & 109) << 1;
                DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
                com.payair.hce.getCodeCacheDir getcodecachedir3 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                initializeVar = (com.payair.hce.setTrack2EquivalentData) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir3}, 1387703596, -1387703595, java.lang.System.identityHashCode(getcodecachedir3));
                i = DigitizedCardProfile + 85;
            } else {
                com.payair.hce.getCodeCacheDir getcodecachedir4 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
                initializeVar = (com.payair.hce.addCardAndSuk) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir4}, -1462391279, 1462391281, java.lang.System.identityHashCode(getcodecachedir4));
                i = DigitizedCardProfile + 101;
            }
            writeReplace = i % 128;
        }
        initializeVar.getCvmResetTimeout();
        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.AlternateContactlessPaymentDataJson;
        int i10 = DigitizedCardProfile;
        int i11 = i10 ^ 49;
        int i12 = ((i10 & 49) | i11) << 1;
        int i13 = -i11;
        writeReplace = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) values(new java.lang.Object[]{this, access202Var}, 1757411029, -1757411029, java.lang.System.identityHashCode(this));
    }
}
