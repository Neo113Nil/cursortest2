package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCardId extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i2) | i);
        int i5 = ~(i3 | i);
        int i6 = (i * 659) + (i2 * (-657)) + (((~((~i) | i2)) | i4 | i5) * (-658)) + (i4 * 658) + ((i5 | i4) * 658);
        return i6 != 1 ? i6 != 2 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.suspendCardForToken suspendcardfortoken;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.payair.hce.processNotificationData processnotificationdata = (com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1684199295, 1684199305, java.lang.System.identityHashCode(access202Var));
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access202Var));
        processnotificationdata.writeReplace();
        com.payair.hce.processNotificationData.writeReplace(new java.lang.Object[]{processnotificationdata}, -1366931947, 1366931947, java.lang.System.identityHashCode(processnotificationdata));
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 93) % 128;
            com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir));
            suspendcardfortoken = (com.payair.hce.suspendCardForToken) com.payair.hce.initialize.valueOf(new java.lang.Object[]{setpansequencenumber}, -566547452, 566547452, java.lang.System.identityHashCode(setpansequencenumber));
            int i = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((((i & (-108)) | ((~i) & 107)) - (~((i & 107) << 1))) - 1) % 128;
        } else if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
            int i2 = DigitizedCardProfile;
            int i3 = i2 & 85;
            int i4 = i3 + ((i2 ^ 85) | i3);
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 == 0) {
                com.payair.hce.setTrack2EquivalentData settrack2equivalentdata = (com.payair.hce.setTrack2EquivalentData) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, 1387703596, -1387703595, java.lang.System.identityHashCode(getcodecachedir));
                throw null;
            }
            com.payair.hce.setTrack2EquivalentData settrack2equivalentdata2 = (com.payair.hce.setTrack2EquivalentData) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, 1387703596, -1387703595, java.lang.System.identityHashCode(getcodecachedir));
            suspendcardfortoken = (com.payair.hce.suspendCardForToken) com.payair.hce.initialize.valueOf(new java.lang.Object[]{settrack2equivalentdata2}, -566547452, 566547452, java.lang.System.identityHashCode(settrack2equivalentdata2));
        } else {
            com.payair.hce.addCardAndSuk addcardandsuk = (com.payair.hce.addCardAndSuk) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -1462391279, 1462391281, java.lang.System.identityHashCode(getcodecachedir));
            suspendcardfortoken = (com.payair.hce.suspendCardForToken) com.payair.hce.initialize.valueOf(new java.lang.Object[]{addcardandsuk}, -566547452, 566547452, java.lang.System.identityHashCode(addcardandsuk));
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = (i5 & (-28)) | ((~i5) & 27);
            int i7 = (i5 & 27) << 1;
            DigitizedCardProfile = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        }
        int i8 = com.payair.hce.getCardId.AnonymousClass1.AlternateContactlessPaymentDataJson[suspendcardfortoken.ordinal()];
        if (i8 == 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (((com.payair.hce.setNewDefaultCardForContactlessPayments) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1636012707, 1636012736, java.lang.System.identityHashCode(access202Var))) == com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile) {
                int i9 = AlternateContactlessPaymentDataJson;
                int i10 = i9 & 37;
                int i11 = (i9 | 37) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                DigitizedCardProfile = i13 % 128;
                if (i13 % 2 != 0) {
                    ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var))).writeReplace();
                    com.payair.hce.replenishAllCards replenishallcards = com.payair.hce.replenishAllCards.writeReplace;
                    throw null;
                }
                if (((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var))).writeReplace() == com.payair.hce.replenishAllCards.writeReplace) {
                    arrayList2.add(com.payair.hce.resetAuthenticationReferences.AlternateContactlessPaymentDataJson);
                    int i14 = DigitizedCardProfile;
                    AlternateContactlessPaymentDataJson = ((i14 ^ 87) + ((i14 & 87) << 1)) % 128;
                }
            }
            arrayList.addAll(arrayList2);
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 31) % 128;
        } else if (i8 == 2) {
            arrayList.addAll((java.util.List) DigitizedCardProfile(new java.lang.Object[]{access202Var}, 587366990, -587366990, (int) java.lang.System.currentTimeMillis()));
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 33) % 128;
        } else if (i8 == 3) {
            arrayList.addAll((java.util.List) DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1793636824, 1793636826, (int) java.lang.System.currentTimeMillis()));
            int i15 = DigitizedCardProfile;
            int i16 = i15 & 95;
            int i17 = (i15 | 95) & (~i16);
            int i18 = -(-(i16 << 1));
            AlternateContactlessPaymentDataJson = ((i17 & i18) + (i17 | i18)) % 128;
        }
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 27) % 128;
        return arrayList;
    }

    /* renamed from: com.payair.hce.getCardId$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int DigitizedCardProfile = 0;
        private static int valueOf = 1;

        static {
            int[] iArr = new int[com.payair.hce.suspendCardForToken.values().length];
            AlternateContactlessPaymentDataJson = iArr;
            try {
                iArr[com.payair.hce.suspendCardForToken.writeReplace.ordinal()] = 1;
                int i = DigitizedCardProfile;
                valueOf = ((((i & (-64)) | ((~i) & 63)) - (~((i & 63) << 1))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.suspendCardForToken.DigitizedCardProfile.ordinal()] = 2;
                int i2 = DigitizedCardProfile;
                int i3 = i2 & 115;
                int i4 = -(-((i2 ^ 115) | i3));
                valueOf = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.suspendCardForToken.valueOf.ordinal()] = 3;
                int i5 = valueOf;
                DigitizedCardProfile = ((((i5 & (-120)) | ((~i5) & 119)) - (~(-(-((i5 & 119) << 1))))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1684199295, 1684199305, java.lang.System.identityHashCode(access202Var))).DigitizedCardProfile()) {
            int i = DigitizedCardProfile;
            int i2 = i & 87;
            int i3 = -(-((i ^ 87) | i2));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList.add(com.payair.hce.resetAuthenticationReferences.getAid);
                throw null;
            }
            arrayList.add(com.payair.hce.resetAuthenticationReferences.getAid);
            int i5 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = (((i5 ^ 30) + ((i5 & 30) << 1)) - 1) % 128;
        } else if (!((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1684199295, 1684199305, java.lang.System.identityHashCode(access202Var))).valueOf((com.payair.hce.setNewDefaultCardForContactlessPayments) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1636012707, 1636012736, java.lang.System.identityHashCode(access202Var)))) {
            int i6 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((i6 & 99) + (i6 | 99)) % 128;
            arrayList.add(com.payair.hce.resetAuthenticationReferences.values);
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 59) % 128;
        }
        int i7 = DigitizedCardProfile;
        int i8 = ((i7 | 126) << 1) - (i7 ^ 126);
        int i9 = (~i8) + (i8 << 1);
        AlternateContactlessPaymentDataJson = i9 % 128;
        if (i9 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.unRegisterDevice unregisterdevice;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.payair.hce.requestReplenish DigitizedCardProfile2 = ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var))).DigitizedCardProfile();
            unregisterdevice = (com.payair.hce.unRegisterDevice) com.payair.hce.requestReplenish.values(new java.lang.Object[]{DigitizedCardProfile2}, -699536888, 699536888, java.lang.System.identityHashCode(DigitizedCardProfile2));
            int i = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((i ^ 17) + ((i & 17) << 1)) % 128;
        } catch (com.payair.hce.getSetPinRequestData unused) {
            unregisterdevice = com.payair.hce.unRegisterDevice.IccPrivateKeyCrtComponentsJson;
        }
        if (((com.payair.hce.setNewDefaultCardForContactlessPayments) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1636012707, 1636012736, java.lang.System.identityHashCode(access202Var))) != com.payair.hce.setNewDefaultCardForContactlessPayments.values) {
            int i2 = DigitizedCardProfile;
            int i3 = ((i2 & 121) - (~(-(-(i2 | 121))))) - 1;
            AlternateContactlessPaymentDataJson = i3 % 128;
            if (i3 % 2 == 0) {
                com.payair.hce.unRegisterDevice unregisterdevice2 = com.payair.hce.unRegisterDevice.valueOf;
                throw null;
            }
            if (unregisterdevice != com.payair.hce.unRegisterDevice.valueOf) {
                java.util.List list = (java.util.List) DigitizedCardProfile(new java.lang.Object[]{access202Var}, 587366990, -587366990, (int) java.lang.System.currentTimeMillis());
                int i4 = DigitizedCardProfile;
                int i5 = i4 | 73;
                int i6 = i5 << 1;
                int i7 = -((~(i4 & 73)) & i5);
                AlternateContactlessPaymentDataJson = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                return list;
            }
        }
        int i8 = AlternateContactlessPaymentDataJson;
        int i9 = i8 & 115;
        int i10 = (i8 ^ 115) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        DigitizedCardProfile = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        throw new java.lang.ArithmeticException();
    }

    private static java.util.List<com.payair.hce.resetAuthenticationReferences> AlternateContactlessPaymentDataJson(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{access202Var}, -1793636824, 1793636826, (int) java.lang.System.currentTimeMillis());
    }

    private static java.util.List<com.payair.hce.resetAuthenticationReferences> writeReplace(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{access202Var}, 587366990, -587366990, (int) java.lang.System.currentTimeMillis());
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this, access202Var}, -928673903, 928673904, java.lang.System.identityHashCode(this));
    }
}
