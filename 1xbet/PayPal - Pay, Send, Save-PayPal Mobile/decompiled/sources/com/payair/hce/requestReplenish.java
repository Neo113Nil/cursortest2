package com.payair.hce;

/* loaded from: classes4.dex */
public final class requestReplenish {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private com.payair.hce.access202 valueOf;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public requestReplenish(com.payair.hce.access202 access202Var) {
        this.valueOf = access202Var;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        byte b = 0;
        com.payair.hce.requestReplenish requestreplenish = (com.payair.hce.requestReplenish) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 100) + ((i & 100) << 1)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0 ? requestreplenish.valueOf.writeReplace() == com.payair.hce.activateCardForToken.writeReplace : requestreplenish.valueOf.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            com.payair.hce.access202 access202Var = requestreplenish.valueOf;
            b = ((com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var))).writeReplace().getAid().byteValue();
            try {
                com.payair.hce.access202 access202Var2 = requestreplenish.valueOf;
                com.payair.hce.createOpenHelper profileVersion = ((com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var2}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var2))).getProfileVersion();
                com.payair.hce.access202 access202Var3 = requestreplenish.valueOf;
                com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var3}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var3));
                if (((com.payair.hce.provisionFromLocalStorage) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var}, 1737569389, -1737569387, java.lang.System.identityHashCode(access400Var))).getAid().longValue() == 0) {
                    values = ((-2) - (~(DigitizedCardProfile + 110))) % 128;
                    if (profileVersion.writeReplace()) {
                        int i3 = values;
                        int i4 = (((i3 | 86) << 1) - (i3 ^ 86)) - 1;
                        DigitizedCardProfile = i4 % 128;
                        if (i4 % 2 == 0) {
                            return com.payair.hce.unRegisterDevice.valueOf;
                        }
                        com.payair.hce.unRegisterDevice unregisterdevice = com.payair.hce.unRegisterDevice.valueOf;
                        throw new java.lang.ArithmeticException();
                    }
                }
                int i5 = DigitizedCardProfile;
                values = (((i5 ^ 66) + ((i5 & 66) << 1)) - 1) % 128;
            } catch (com.payair.hce.getSetPinRequestData unused) {
            }
        } else if (requestreplenish.valueOf.writeReplace() == com.payair.hce.activateCardForToken.values) {
            int i6 = DigitizedCardProfile;
            int i7 = i6 ^ 117;
            int i8 = -(-((i6 & 117) << 1));
            values = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) requestreplenish.valueOf;
            com.payair.hce.onDeleteCardFailed ondeletecardfailed = (com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted));
            if (((java.lang.Byte) com.payair.hce.onDeleteCardFailed.writeReplace(new java.lang.Object[]{ondeletecardfailed}, 724539993, -724539993, java.lang.System.identityHashCode(ondeletecardfailed))) != null) {
                values = (DigitizedCardProfile + 7) % 128;
                com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted2 = (com.payair.hce.onContactlessPaymentCompleted) requestreplenish.valueOf;
                com.payair.hce.onDeleteCardFailed ondeletecardfailed2 = (com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted2}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted2));
                b = ((java.lang.Byte) com.payair.hce.onDeleteCardFailed.writeReplace(new java.lang.Object[]{ondeletecardfailed2}, 724539993, -724539993, java.lang.System.identityHashCode(ondeletecardfailed2))).byteValue();
                int i9 = values;
                int i10 = i9 ^ 73;
                int i11 = (i9 & 73) << 1;
                DigitizedCardProfile = ((i10 & i11) + (i11 | i10)) % 128;
            }
        }
        if (b == 0) {
            com.payair.hce.unRegisterDevice unregisterdevice2 = com.payair.hce.unRegisterDevice.values;
            int i12 = values;
            DigitizedCardProfile = (((i12 & (-122)) | ((~i12) & 121)) + ((i12 & 121) << 1)) % 128;
            return unregisterdevice2;
        }
        if (b == 1) {
            com.payair.hce.unRegisterDevice unregisterdevice3 = com.payair.hce.unRegisterDevice.AlternateContactlessPaymentDataJson;
            int i13 = DigitizedCardProfile + 87;
            values = i13 % 128;
            if (i13 % 2 != 0) {
                return unregisterdevice3;
            }
            throw null;
        }
        if (b == 9) {
            com.payair.hce.unRegisterDevice unregisterdevice4 = com.payair.hce.unRegisterDevice.DigitizedCardProfile;
            int i14 = DigitizedCardProfile;
            values = ((i14 & 23) + (i14 | 23)) % 128;
            return unregisterdevice4;
        }
        if (b == 32) {
            return com.payair.hce.unRegisterDevice.writeReplace;
        }
        com.payair.hce.unRegisterDevice unregisterdevice5 = com.payair.hce.unRegisterDevice.IccPrivateKeyCrtComponentsJson;
        int i15 = values;
        int i16 = i15 & 99;
        int i17 = (i15 | 99) & (~i16);
        int i18 = i16 << 1;
        DigitizedCardProfile = ((i17 ^ i18) + ((i17 & i18) << 1)) % 128;
        return unregisterdevice5;
    }

    public final com.payair.hce.unRegisterDevice valueOf() throws com.payair.hce.getSetPinRequestData {
        return (com.payair.hce.unRegisterDevice) values(new java.lang.Object[]{this}, -699536888, 699536888, java.lang.System.identityHashCode(this));
    }
}
