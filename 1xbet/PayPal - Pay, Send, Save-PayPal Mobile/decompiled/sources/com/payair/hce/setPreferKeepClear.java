package com.payair.hce;

/* loaded from: classes4.dex */
final class setPreferKeepClear implements com.payair.hce.setSpecialRequestUrl {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private com.payair.hce.sendRequest AlternateContactlessPaymentDataJson = null;
    private final android.content.Context valueOf;
    private final java.lang.Class writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        switch ((i * 399) + (i2 * 399) + ((i4 | i6 | (~(i5 | i3))) * 398) + ((i | i2) * (-1194)) + (((~((~i3) | i5)) | i4 | i6) * 398)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
                int i7 = DigitizedCardProfile;
                int i8 = i7 & 29;
                int i9 = ((i7 ^ 29) | i8) << 1;
                int i10 = -((i7 | 29) & (~i8));
                int i11 = ((i9 & i10) + (i10 | i9)) % 128;
                values = i11;
                com.payair.hce.sendRequest sendrequest = setpreferkeepclear.AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = ((((i11 | 26) << 1) - (i11 ^ 26)) - 1) % 128;
                return sendrequest;
            case 3:
                return values(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return valueOf(objArr);
            case 6:
                return DigitizedCardProfile(objArr);
            case 7:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 8:
                return RecordsJson(objArr);
            default:
                com.payair.hce.setPreferKeepClear setpreferkeepclear2 = (com.payair.hce.setPreferKeepClear) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                java.lang.String str2 = (java.lang.String) objArr[2];
                int i12 = DigitizedCardProfile;
                int i13 = (((i12 ^ 1) | (i12 & 1)) << 1) - ((i12 & (-2)) | ((~i12) & 1));
                values = i13 % 128;
                if (i13 % 2 == 0) {
                    com.payair.hce.setLeft.values(new java.lang.Object[]{str, str2, setpreferkeepclear2.valueOf.getSharedPreferences("PREFERENCE_DEFAULT_CARD", 1)}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                    return null;
                }
                com.payair.hce.setLeft.values(new java.lang.Object[]{str, str2, setpreferkeepclear2.valueOf.getSharedPreferences("PREFERENCE_DEFAULT_CARD", 0)}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                return null;
        }
    }

    setPreferKeepClear(android.content.Context context, java.lang.Class<?> cls) {
        this.valueOf = context;
        this.writeReplace = cls;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = values;
        DigitizedCardProfile = (((i ^ 33) - (~((i & 33) << 1))) - 1) % 128;
        DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, "KEY_DEFAULT_CONTACTLESS", str}, 944566869, -944566869, java.lang.System.identityHashCode(setpreferkeepclear));
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 63;
        int i4 = (((i2 ^ 63) | i3) << 1) - ((i2 | 63) & (~i3));
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        int i = values;
        DigitizedCardProfile = ((i ^ 99) + ((i & 99) << 1)) % 128;
        DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, "KEY_DEFAULT_REMOTE", null}, 944566869, -944566869, java.lang.System.identityHashCode(setpreferkeepclear));
        int i2 = DigitizedCardProfile;
        int i3 = ((i2 | 70) << 1) - (i2 ^ 70);
        int i4 = (~i3) + (i3 << 1);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        values = (DigitizedCardProfile + 89) % 128;
        java.lang.String str = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, "KEY_DEFAULT_CONTACTLESS"}, -1602374220, 1602374226, java.lang.System.identityHashCode(setpreferkeepclear));
        int i = DigitizedCardProfile;
        int i2 = i | 103;
        int i3 = i2 << 1;
        int i4 = -((~(i & 103)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 51;
        values = (i2 + ((i ^ 51) | i2)) % 128;
        java.lang.String str = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, "KEY_DEFAULT_REMOTE"}, -1602374220, 1602374226, java.lang.System.identityHashCode(setpreferkeepclear));
        int i3 = values;
        int i4 = ((i3 ^ 25) - (~(-(-((i3 & 25) << 1))))) - 1;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) objArr[1];
        int i = values;
        int i2 = i & 93;
        int i3 = i2 + ((i ^ 93) | i2);
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            setpreferkeepclear.AlternateContactlessPaymentDataJson = sendrequest;
            return null;
        }
        setpreferkeepclear.AlternateContactlessPaymentDataJson = sendrequest;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = DigitizedCardProfile;
        values = (((i & (-44)) | ((~i) & 43)) + ((i & 43) << 1)) % 128;
        java.lang.String str2 = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{str, null, setpreferkeepclear.valueOf.getSharedPreferences("PREFERENCE_DEFAULT_CARD", 0)}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        int i2 = DigitizedCardProfile;
        int i3 = i2 ^ 57;
        int i4 = ((i2 & 57) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) objArr[0];
        com.payair.hce.setStatusCode setstatuscode = (com.payair.hce.setStatusCode) objArr[1];
        com.payair.hce.gotPostData gotpostdata = (com.payair.hce.gotPostData) objArr[2];
        int i = DigitizedCardProfile;
        int i2 = i & 97;
        int i3 = (~i2) & (i | 97);
        int i4 = i2 << 1;
        values = ((i3 & i4) + (i4 | i3)) % 128;
        com.payair.hce.sendRequest sendrequest = setpreferkeepclear.AlternateContactlessPaymentDataJson;
        if (sendrequest == null) {
            int i5 = ((i | 19) << 1) - (i ^ 19);
            values = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    com.payair.hce.setStatusCode setstatuscode2 = com.payair.hce.setStatusCode.writeReplace;
                    throw null;
                }
                if (setstatuscode == com.payair.hce.setStatusCode.writeReplace) {
                    int i6 = values;
                    DigitizedCardProfile = (((i6 & 15) - (~(i6 | 15))) - 1) % 128;
                    if (!android.text.TextUtils.isEmpty((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear)))) {
                        int i7 = DigitizedCardProfile + 119;
                        values = i7 % 128;
                        if (i7 % 2 == 0) {
                            gotpostdata.writeReplace((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear)));
                            throw new java.lang.NullPointerException();
                        }
                        sendrequest = gotpostdata.writeReplace((java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear)));
                        int i8 = DigitizedCardProfile;
                        int i9 = i8 & 23;
                        int i10 = (i8 | 23) & (~i9);
                        int i11 = i9 << 1;
                        values = (((i10 | i11) << 1) - (i10 ^ i11)) % 128;
                    }
                }
            } catch (com.payair.hce.setSuccessful unused) {
                return null;
            }
        }
        int i12 = values;
        int i13 = i12 & 93;
        int i14 = -(-((i12 ^ 93) | i13));
        DigitizedCardProfile = (((i13 | i14) << 1) - (i13 ^ i14)) % 128;
        int i15 = i12 & 5;
        int i16 = -(-(i12 | 5));
        int i17 = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
        DigitizedCardProfile = i17;
        if (sendrequest != null) {
            int i18 = (i17 ^ 31) + ((i17 & 31) << 1);
            values = i18 % 128;
            if (i18 % 2 == 0) {
                com.payair.hce.setStatusCode setstatuscode3 = com.payair.hce.setStatusCode.writeReplace;
                throw null;
            }
            if ((setstatuscode == com.payair.hce.setStatusCode.writeReplace && sendrequest.getCiacDecline()) || setstatuscode == com.payair.hce.setStatusCode.AlternateContactlessPaymentDataJson) {
                DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, sendrequest}, -1936581216, 1936581224, java.lang.System.identityHashCode(setpreferkeepclear));
                int i19 = values;
                int i20 = i19 & 19;
                int i21 = -(-((i19 ^ 19) | i20));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                DigitizedCardProfile = i22 % 128;
                if (i22 % 2 == 0) {
                    return sendrequest;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        int i23 = DigitizedCardProfile;
        int i24 = i23 | 117;
        int i25 = ((i24 << 1) - (~(-((~(i23 & 117)) & i24)))) - 1;
        values = i25 % 128;
        if (i25 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setSpecialRequestUrl
    public final com.payair.hce.sendRequest values(com.payair.hce.setStatusCode setstatuscode, com.payair.hce.gotPostData gotpostdata) {
        return (com.payair.hce.sendRequest) DigitizedCardProfile(new java.lang.Object[]{this, setstatuscode, gotpostdata}, 725286246, -725286245, java.lang.System.identityHashCode(this));
    }

    private java.lang.String values(java.lang.String str) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this, str}, -1602374220, 1602374226, java.lang.System.identityHashCode(this));
    }

    private void DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        DigitizedCardProfile(new java.lang.Object[]{this, str, str2}, 944566869, -944566869, java.lang.System.identityHashCode(this));
    }

    final com.payair.hce.sendRequest DigitizedCardProfile() {
        return (com.payair.hce.sendRequest) DigitizedCardProfile(new java.lang.Object[]{this}, 1132877524, -1132877522, java.lang.System.identityHashCode(this));
    }

    final void AlternateContactlessPaymentDataJson(com.payair.hce.sendRequest sendrequest) {
        DigitizedCardProfile(new java.lang.Object[]{this, sendrequest}, -1936581216, 1936581224, java.lang.System.identityHashCode(this));
    }

    final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1230236237, -1230236234, java.lang.System.identityHashCode(this));
    }

    final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1463023114, 1463023119, java.lang.System.identityHashCode(this));
    }

    final void values() {
        DigitizedCardProfile(new java.lang.Object[]{this}, 1935693604, -1935693597, java.lang.System.identityHashCode(this));
    }

    final void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -159678133, 159678137, java.lang.System.identityHashCode(this));
    }
}
