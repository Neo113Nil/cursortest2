package com.payair.hce;

/* loaded from: classes4.dex */
final class setRenderEffect {
    static java.lang.String DigitizedCardProfile = null;
    private static int valueOf = 1;
    private static int values;
    static java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = i | i2;
        switch ((i * 829) + (i2 * 829) + (((~(i | i4 | i2)) | (~((~i) | (~i2)))) * (-828)) + ((i5 | i4) * (-828)) + ((~i5) * 828)) {
            case 1:
                java.lang.String str = (java.lang.String) objArr[0];
                int i6 = values;
                int i7 = i6 & 119;
                int i8 = (i6 ^ 119) | i7;
                valueOf = ((i7 & i8) + (i7 | i8)) % 128;
                DigitizedCardProfile = str;
                valueOf = (((i6 ^ 106) + ((i6 & 106) << 1)) - 1) % 128;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                new com.payair.hce.setRenderEffect.valueOf().execute("");
                int i9 = values;
                valueOf = ((((i9 | 23) << 1) - (~(-((i9 & (-24)) | ((~i9) & 23))))) - 1) % 128;
                break;
            case 6:
                java.lang.String str2 = (java.lang.String) objArr[0];
                com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
                com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
                com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = setiscredential.AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
                if (AlternateContactlessPaymentDataJson != null) {
                    int i10 = values;
                    int i11 = i10 & 93;
                    int i12 = ((i10 ^ 93) | i11) << 1;
                    int i13 = -((i10 | 93) & (~i11));
                    valueOf = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                    com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str2.getBytes()).writeReplace();
                    com.payair.hce.setOnCapturedPointerListener DigitizedCardProfile2 = setvisibility.DigitizedCardProfile(str2.getBytes(), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), true);
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{DigitizedCardProfile2, "CRYPTO_JWT"}, -497714482, 497714490, java.lang.System.identityHashCode(DigitizedCardProfile2));
                    int i14 = valueOf;
                    values = ((i14 ^ 85) + ((i14 & 85) << 1)) % 128;
                }
                int i15 = valueOf;
                int i16 = i15 & 41;
                values = ((((i15 ^ 41) | i16) << 1) - ((i15 | 41) & (~i16))) % 128;
                break;
            default:
                writeReplace = (java.lang.String) objArr[0];
                new com.payair.hce.setRenderEffect.DigitizedCardProfile().execute("");
                int i17 = values;
                int i18 = ((i17 ^ 25) | (i17 & 25)) << 1;
                int i19 = -((i17 & (-26)) | ((~i17) & 25));
                valueOf = ((i18 & i19) + (i19 | i18)) % 128;
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String str;
        int i;
        int i2 = values;
        int i3 = i2 ^ 69;
        int i4 = ((((i2 & 69) | i3) << 1) - i3) % 128;
        valueOf = i4;
        java.lang.String str2 = DigitizedCardProfile;
        if (str2 != null) {
            int i5 = ((i4 | 3) << 1) - ((i4 & (-4)) | ((~i4) & 3));
            values = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (!str2.isEmpty()) {
                str = DigitizedCardProfile;
                int i6 = valueOf;
                values = ((-2) - (~((i6 ^ 20) + ((i6 & 20) << 1)))) % 128;
                int i7 = values;
                int i8 = i7 & 109;
                int i9 = ((i7 ^ 109) | i8) << 1;
                int i10 = -((i7 | 109) & (~i8));
                i = (i9 & i10) + (i10 | i9);
                valueOf = i % 128;
                if (i % 2 == 0) {
                    return str;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        com.payair.hce.setZ setz = (com.payair.hce.setZ) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -195546592, 195546622, (int) java.lang.System.currentTimeMillis());
        str = (java.lang.String) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -302657026, 302657028, java.lang.System.identityHashCode(setz));
        int i11 = values;
        int i12 = (i11 | 117) << 1;
        int i13 = -((i11 & (-118)) | ((~i11) & 117));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        valueOf = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 3 / 3;
        }
        int i72 = values;
        int i82 = i72 & 109;
        int i92 = ((i72 ^ 109) | i82) << 1;
        int i102 = -((i72 | 109) & (~i82));
        i = (i92 & i102) + (i102 | i92);
        valueOf = i % 128;
        if (i % 2 == 0) {
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        new com.payair.hce.setRenderEffect.values().execute("");
        int i = valueOf;
        int i2 = ((i & 109) - (~(i | 109))) - 1;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class DigitizedCardProfile extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        private static int DigitizedCardProfile = 0;
        private static int values = 1;
        private com.payair.hce.setForegroundGravity AlternateContactlessPaymentDataJson;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = ~(i4 | i | i3);
            int i6 = (i * 477) + (i2 * (-475)) + (((~(i2 | (~i))) | i5) * (-476)) + (i5 * 952) + ((~(i | (~i3) | i4)) * 476);
            if (i6 != 1) {
                if (i6 == 2) {
                    return AlternateContactlessPaymentDataJson(objArr);
                }
                if (i6 != 3) {
                    return i6 != 4 ? i6 != 5 ? writeReplace(objArr) : DigitizedCardProfile(objArr) : values(objArr);
                }
                int i7 = DigitizedCardProfile;
                values = ((-2) - (~((i7 & 42) + (i7 | 42)))) % 128;
                return null;
            }
            com.payair.hce.setRenderEffect.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setRenderEffect.DigitizedCardProfile) objArr[0];
            java.lang.Object obj = objArr[1];
            int i8 = values;
            DigitizedCardProfile = ((i8 & 91) + (i8 | 91)) % 128;
            DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfile}, 459485677, -459485677, java.lang.System.identityHashCode(digitizedCardProfile));
            int i9 = DigitizedCardProfile + 38;
            values = ((~i9) + (i9 << 1)) % 128;
            return null;
        }

        DigitizedCardProfile() {
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = values;
            int i2 = i & 79;
            int i3 = (i | 79) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = (i3 & i4) + (i3 | i4);
            int i6 = i5 % 128;
            DigitizedCardProfile = i6;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i7 = (i6 | 53) << 1;
            int i8 = -((i6 & (-54)) | ((~i6) & 53));
            values = ((i7 & i8) + (i7 | i8)) % 128;
            return null;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setRenderEffect.DigitizedCardProfile) objArr[0];
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = DigitizedCardProfile;
            int i2 = (i & 75) + (i | 75);
            values = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String str = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfile}, -261786232, 261786234, java.lang.System.identityHashCode(digitizedCardProfile));
            if (i3 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i4 = DigitizedCardProfile;
            int i5 = (i4 & (-30)) | ((~i4) & 29);
            int i6 = -(-((i4 & 29) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            values = i7 % 128;
            if (i7 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setRenderEffect.DigitizedCardProfile) objArr[0];
            int i = DigitizedCardProfile;
            int i2 = (i & 79) + (i | 79);
            values = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.String str = (java.lang.String) com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[0], -1988341029, 1988341033, (int) java.lang.System.currentTimeMillis());
                if (str != null) {
                    digitizedCardProfile.AlternateContactlessPaymentDataJson = (com.payair.hce.setForegroundGravity) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{new com.payair.hce.setClipBounds(str, com.payair.hce.setRenderEffect.writeReplace)}, 1119825194, -1119825176, (int) java.lang.System.currentTimeMillis());
                    int i3 = values & 85;
                    DigitizedCardProfile = ((i3 - (~(-(-((r7 ^ 85) | i3))))) - 1) % 128;
                }
                int i4 = DigitizedCardProfile;
                int i5 = i4 | 125;
                int i6 = (i5 << 1) - ((~(i4 & 125)) & i5);
                values = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            int i;
            boolean z;
            java.lang.String str;
            java.util.List<java.lang.String> list;
            com.payair.hce.setPointerIcon setpointericon;
            int i2;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.payair.hce.setRenderEffect.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setRenderEffect.DigitizedCardProfile) objArr[0];
            int i3 = DigitizedCardProfile;
            int i4 = i3 + 109;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                if (digitizedCardProfile.AlternateContactlessPaymentDataJson != null) {
                    i = 1;
                    int i5 = i3 & 83;
                    i2 = (i5 - (~(-(-((i3 ^ 83) | i5))))) - 1;
                    values = i2 % 128;
                    if (i2 % 2 != 0) {
                        digitizedCardProfile.AlternateContactlessPaymentDataJson.isSuccessful();
                        throw null;
                    }
                    if (digitizedCardProfile.AlternateContactlessPaymentDataJson.isSuccessful()) {
                        int i6 = values;
                        DigitizedCardProfile = (((i6 | 111) << 1) - (i6 ^ 111)) % 128;
                        com.payair.hce.setForegroundGravity setforegroundgravity = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                        if (((java.lang.Long) com.payair.hce.setForegroundGravity.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setforegroundgravity}, 774624060, -774624058, java.lang.System.identityHashCode(setforegroundgravity))) != null) {
                            int i7 = DigitizedCardProfile;
                            int i8 = i7 & 71;
                            int i9 = ((((i7 ^ 71) | i8) << 1) - (~(-((i7 | 71) & (~i8))))) - 1;
                            values = i9 % 128;
                            if (i9 % 2 != 0) {
                                z = true;
                            }
                            z = false;
                        }
                    }
                    int i10 = DigitizedCardProfile;
                    int i11 = i10 & 17;
                    int i12 = -(-((i10 ^ 17) | i11));
                    values = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                    z = false;
                } else {
                    i = 1;
                    int i102 = DigitizedCardProfile;
                    int i112 = i102 & 17;
                    int i122 = -(-((i102 ^ 17) | i112));
                    values = ((i112 ^ i122) + ((i122 & i112) << 1)) % 128;
                    z = false;
                }
            } else if (digitizedCardProfile.AlternateContactlessPaymentDataJson != null) {
                i = 0;
                int i52 = i3 & 83;
                i2 = (i52 - (~(-(-((i3 ^ 83) | i52))))) - 1;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                }
            } else {
                i = 0;
                int i1022 = DigitizedCardProfile;
                int i1122 = i1022 & 17;
                int i1222 = -(-((i1022 ^ 17) | i1122));
                values = ((i1122 ^ i1222) + ((i1222 & i1122) << 1)) % 128;
                z = false;
            }
            if (z) {
                int i13 = values;
                DigitizedCardProfile = ((-2) - (~((i13 ^ 106) + ((i13 & 106) << 1)))) % 128;
                com.payair.hce.setForegroundGravity setforegroundgravity2 = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                if (((java.lang.String) com.payair.hce.setForegroundGravity.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setforegroundgravity2}, 1719230823, -1719230823, java.lang.System.identityHashCode(setforegroundgravity2))) != null) {
                    int i14 = values;
                    int i15 = i14 & 51;
                    int i16 = -(-((i14 ^ 51) | i15));
                    DigitizedCardProfile = ((i15 & i16) + (i16 | i15)) % 128;
                    com.payair.hce.setForegroundGravity setforegroundgravity3 = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                    if (((java.lang.Long) com.payair.hce.setForegroundGravity.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setforegroundgravity3}, 774624060, -774624058, java.lang.System.identityHashCode(setforegroundgravity3))) != null) {
                        int i17 = DigitizedCardProfile;
                        values = ((i17 ^ 49) + ((i17 & 49) << 1)) % 128;
                        if (((com.payair.hce.setTextDirection) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 661461888, -661461849, (int) java.lang.System.currentTimeMillis())) != null) {
                            int i18 = DigitizedCardProfile;
                            int i19 = i18 & 35;
                            int i20 = ((i18 | 35) & (~i19)) + (i19 << 1);
                            values = i20 % 128;
                            if (i20 % 2 == 0) {
                                com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 661461888, -661461849, (int) java.lang.System.currentTimeMillis());
                                throw null;
                            }
                            com.payair.hce.setTextDirection settextdirection2 = (com.payair.hce.setTextDirection) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 661461888, -661461849, (int) java.lang.System.currentTimeMillis());
                            setpointericon = (com.payair.hce.setPointerIcon) com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection2}, 841548075, -841548054, java.lang.System.identityHashCode(settextdirection2));
                        } else {
                            setpointericon = null;
                        }
                        if (setpointericon == null) {
                            setpointericon = new com.payair.hce.setPointerIcon();
                            int i21 = DigitizedCardProfile;
                            values = (((i21 ^ 20) + ((i21 & 20) << 1)) - 1) % 128;
                        }
                        com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
                        com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
                        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = setiscredential.AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
                        com.payair.hce.setForegroundGravity setforegroundgravity4 = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = setvisibility.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setForegroundGravity.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setforegroundgravity4}, 1719230823, -1719230823, java.lang.System.identityHashCode(setforegroundgravity4))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()));
                        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2, "KD"}, -497714482, 497714490, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2));
                        com.payair.hce.setForegroundGravity setforegroundgravity5 = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(((java.lang.Long) com.payair.hce.setForegroundGravity.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setforegroundgravity5}, 774624060, -774624058, java.lang.System.identityHashCode(setforegroundgravity5))).longValue())}, -1124132126, 1124132161, java.lang.System.identityHashCode(setpointericon));
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -207294250, 207294340, (int) java.lang.System.currentTimeMillis())}, -1972616230, 1972616243, java.lang.System.identityHashCode(setpointericon));
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -722536750, 722536792, (int) java.lang.System.currentTimeMillis())}, -363999224, 363999255, java.lang.System.identityHashCode(setpointericon));
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1200966837, 1200966849, (int) java.lang.System.currentTimeMillis())}, 1261895947, -1261895935, java.lang.System.identityHashCode(setpointericon));
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2050677857, -2050677801, (int) java.lang.System.currentTimeMillis())).longValue())}, -320800811, 320800831, java.lang.System.identityHashCode(setpointericon));
                        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{setpointericon}, -756011762, 756011844, (int) java.lang.System.currentTimeMillis());
                        com.payair.hce.setZ setz = new com.payair.hce.setZ();
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, 1}, 1948378219, -1948378219, 1);
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, null}, 1625632204, -1625632201, java.lang.System.identityHashCode(setz));
                        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{setz}, -488246252, 488246305, (int) java.lang.System.currentTimeMillis());
                        com.payair.hce.setForegroundGravity setforegroundgravity6 = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                        java.util.List<java.lang.String> list2 = (java.util.List) com.payair.hce.setForegroundGravity.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setforegroundgravity6}, 1200004522, -1200004521, java.lang.System.identityHashCode(setforegroundgravity6));
                        android.content.SharedPreferences sharedPreferences = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
                        if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                            int i22 = values;
                            int i23 = i22 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                            DigitizedCardProfile = ((i23 - (~((i22 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i23))) - 1) % 128;
                            com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, sharedPreferences}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setFocusable.values(new java.lang.Object[0], -74078830, 74078830, (int) java.lang.System.currentTimeMillis());
                            DigitizedCardProfile = (values + 25) % 128;
                        }
                        int i24 = values;
                        int i25 = i24 ^ 39;
                        int i26 = ((i24 & 39) | i25) << 1;
                        int i27 = -i25;
                        DigitizedCardProfile = ((i26 ^ i27) + ((i26 & i27) << 1)) % 128;
                        list = list2;
                        str = null;
                        com.payair.hce.setRenderEffect.DigitizedCardProfile = str;
                        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onAuthenticateUser(z, i, list);
                        int i28 = values;
                        int i29 = i28 | 115;
                        int i30 = i29 << 1;
                        int i31 = -((~(i28 & 115)) & i29);
                        DigitizedCardProfile = ((i30 & i31) + (i31 | i30)) % 128;
                        return null;
                    }
                }
            } else {
                com.payair.hce.setForegroundGravity setforegroundgravity7 = digitizedCardProfile.AlternateContactlessPaymentDataJson;
                if (setforegroundgravity7 != null) {
                    int i32 = DigitizedCardProfile;
                    int i33 = i32 & 41;
                    int i34 = i32 | 41;
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    values = i35 % 128;
                    if (i35 % 2 == 0) {
                        setforegroundgravity7.getStatusCodeFromServer();
                        throw null;
                    }
                    if (setforegroundgravity7.getStatusCodeFromServer() != null) {
                        int intValue = digitizedCardProfile.AlternateContactlessPaymentDataJson.getStatusCodeFromServer().intValue();
                        int i36 = DigitizedCardProfile;
                        int i37 = i36 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        values = ((i37 - (~(-(-((i36 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i37))))) - 1) % 128;
                        i = intValue;
                        int i38 = DigitizedCardProfile;
                        int i39 = i38 & 83;
                        int i40 = -(-((i38 ^ 83) | i39));
                        values = (((i39 | i40) << 1) - (i40 ^ i39)) % 128;
                    }
                }
                int i41 = values;
                DigitizedCardProfile = ((i41 & 91) + (i41 | 91)) % 128;
                i = 0;
                int i382 = DigitizedCardProfile;
                int i392 = i382 & 83;
                int i402 = -(-((i382 ^ 83) | i392));
                values = (((i392 | i402) << 1) - (i402 ^ i392)) % 128;
            }
            str = null;
            list = null;
            com.payair.hce.setRenderEffect.DigitizedCardProfile = str;
            ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onAuthenticateUser(z, i, list);
            int i282 = values;
            int i292 = i282 | 115;
            int i302 = i292 << 1;
            int i312 = -((~(i282 & 115)) & i292);
            DigitizedCardProfile = ((i302 & i312) + (i312 | i302)) % 128;
            return null;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        protected final /* synthetic */ java.lang.String doInBackground(java.lang.String[] strArr) {
            ?? DigitizedCardProfile2 = DigitizedCardProfile(new java.lang.Object[]{this, strArr}, -1160836798, 1160836802, java.lang.System.identityHashCode(this));
            return DigitizedCardProfile2;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(java.lang.String str) {
            DigitizedCardProfile(new java.lang.Object[]{this, str}, 1724127413, -1724127412, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onProgressUpdate(java.lang.Void[] voidArr) {
            DigitizedCardProfile(new java.lang.Object[]{this, voidArr}, 439148668, -439148663, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            DigitizedCardProfile(new java.lang.Object[]{this}, 897390258, -897390255, java.lang.System.identityHashCode(this));
        }

        private void valueOf() {
            DigitizedCardProfile(new java.lang.Object[]{this}, 459485677, -459485677, java.lang.System.identityHashCode(this));
        }

        private java.lang.String writeReplace() {
            return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -261786232, 261786234, java.lang.System.identityHashCode(this));
        }
    }

    static final class valueOf extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        private static int DigitizedCardProfile = 0;
        private static int values = 1;
        private com.payair.hce.setForegroundTintMode valueOf = null;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = ~i3;
            int i6 = ~i;
            int i7 = (i * (-958)) + (i2 * (-958)) + (((~(i4 | i5)) | (~(i6 | i3)) | (~(i5 | i))) * 959) + ((~(i2 | i)) * (-959)) + (((~(i | i3)) | (~(i6 | i5)) | (~(i3 | i4))) * 959);
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? AlternateContactlessPaymentDataJson(objArr) : SdkCoreAlternateContactlessPaymentDataImpl(objArr) : writeReplace(objArr) : values(objArr) : valueOf(objArr) : DigitizedCardProfile(objArr);
        }

        valueOf() {
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = values;
            int i2 = (i | 67) << 1;
            int i3 = -((i & (-68)) | ((~i) & 67));
            int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
            DigitizedCardProfile = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i5 = ((i & 52) + (i | 52)) - 1;
            DigitizedCardProfile = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.valueOf valueof = (com.payair.hce.setRenderEffect.valueOf) objArr[0];
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = values;
            DigitizedCardProfile = ((((i | 114) << 1) - (i ^ 114)) - 1) % 128;
            java.lang.String str = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{valueof}, 2029883444, -2029883440, java.lang.System.identityHashCode(valueof));
            int i2 = values;
            int i3 = i2 ^ 75;
            int i4 = -(-((i2 & 75) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            DigitizedCardProfile = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.valueOf valueof = (com.payair.hce.setRenderEffect.valueOf) objArr[0];
            java.lang.Object obj = objArr[1];
            int i = DigitizedCardProfile + 64;
            int i2 = (~i) + (i << 1);
            values = i2 % 128;
            int i3 = i2 % 2;
            DigitizedCardProfile(new java.lang.Object[]{valueof}, 48961720, -48961715, java.lang.System.identityHashCode(valueof));
            if (i3 == 0) {
                throw null;
            }
            int i4 = DigitizedCardProfile;
            int i5 = (i4 ^ 11) + ((i4 & 11) << 1);
            values = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.valueOf valueof = (com.payair.hce.setRenderEffect.valueOf) objArr[0];
            int i = DigitizedCardProfile;
            int i2 = i ^ 45;
            int i3 = (i & 45) << 1;
            values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            valueof.valueOf = (com.payair.hce.setForegroundTintMode) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 113823761, -113823744, (int) java.lang.System.currentTimeMillis());
            int i4 = values;
            int i5 = i4 & 43;
            int i6 = i4 | 43;
            int i7 = (i5 & i6) + (i6 | i5);
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
            boolean z;
            int i;
            java.lang.String str;
            com.payair.hce.setRenderEffect.valueOf valueof = (com.payair.hce.setRenderEffect.valueOf) objArr[0];
            int i2 = values;
            int i3 = ((i2 ^ 61) | (i2 & 61)) << 1;
            int i4 = -((i2 & (-62)) | ((~i2) & 61));
            int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            DigitizedCardProfile = i5;
            com.payair.hce.setForegroundTintMode setforegroundtintmode = valueof.valueOf;
            if (setforegroundtintmode != null) {
                values = ((i5 ^ 27) + ((i5 & 27) << 1)) % 128;
                if (((java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode))) != null) {
                    int i6 = values;
                    int i7 = i6 & 53;
                    int i8 = ((i6 | 53) & (~i7)) + (i7 << 1);
                    DigitizedCardProfile = i8 % 128;
                    if (i8 % 2 != 0) {
                        com.payair.hce.setForegroundTintMode setforegroundtintmode2 = valueof.valueOf;
                        ((java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode2}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode2))).equals("");
                        throw new java.lang.ArithmeticException();
                    }
                    com.payair.hce.setForegroundTintMode setforegroundtintmode3 = valueof.valueOf;
                    if (!((java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode3}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode3))).equals("")) {
                        int i9 = DigitizedCardProfile;
                        values = (((i9 & 50) + (i9 | 50)) - 1) % 128;
                        z = true;
                        if (z) {
                            com.payair.hce.setForegroundTintMode setforegroundtintmode4 = valueof.valueOf;
                            if (setforegroundtintmode4 != null) {
                                int i10 = DigitizedCardProfile;
                                int i11 = i10 & 15;
                                int i12 = -(-((i10 ^ 15) | i11));
                                int i13 = (i11 & i12) + (i12 | i11);
                                values = i13 % 128;
                                if (i13 % 2 == 0) {
                                    setforegroundtintmode4.getStatusCodeFromServer();
                                    throw null;
                                }
                                if (setforegroundtintmode4.getStatusCodeFromServer() != null) {
                                    i = valueof.valueOf.getStatusCodeFromServer().intValue();
                                    int i14 = values;
                                    DigitizedCardProfile = ((i14 ^ 105) + ((i14 & 105) << 1)) % 128;
                                    values = (DigitizedCardProfile + 87) % 128;
                                    str = null;
                                }
                            }
                            int i15 = DigitizedCardProfile;
                            int i16 = ((i15 ^ 39) | (i15 & 39)) << 1;
                            int i17 = -((i15 & (-40)) | ((~i15) & 39));
                            values = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
                            i = 0;
                            values = (DigitizedCardProfile + 87) % 128;
                            str = null;
                        } else {
                            com.payair.hce.setZ setz = new com.payair.hce.setZ();
                            com.payair.hce.setZ.values(new java.lang.Object[]{setz, 1}, 1948378219, -1948378219, 1);
                            com.payair.hce.setForegroundTintMode setforegroundtintmode5 = valueof.valueOf;
                            com.payair.hce.setZ.values(new java.lang.Object[]{setz, (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode5}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode5))}, 1625632204, -1625632201, java.lang.System.identityHashCode(setz));
                            com.payair.hce.setForegroundTintMode setforegroundtintmode6 = valueof.valueOf;
                            com.payair.hce.setZ.values(new java.lang.Object[]{setz, (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode6}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode6))}, 12451017, -12451012, java.lang.System.identityHashCode(setz));
                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{setz}, -488246252, 488246305, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setForegroundTintMode setforegroundtintmode7 = valueof.valueOf;
                            com.payair.hce.setRenderEffect.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode7}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode7))}, -79140452, 79140453, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setForegroundTintMode setforegroundtintmode8 = valueof.valueOf;
                            java.lang.String str2 = (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode8}, -226410896, 226410896, java.lang.System.identityHashCode(setforegroundtintmode8));
                            int i18 = DigitizedCardProfile + 102;
                            int i19 = (~i18) + (i18 << 1);
                            values = i19 % 128;
                            int i20 = i19 % 2;
                            str = str2;
                            i = 0;
                        }
                        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onSignUser(z, i, str);
                        DigitizedCardProfile = ((-2) - (~(values + 24))) % 128;
                        return null;
                    }
                }
            }
            int i21 = values;
            DigitizedCardProfile = (((i21 ^ 16) + ((i21 & 16) << 1)) - 1) % 128;
            z = false;
            if (z) {
            }
            ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onSignUser(z, i, str);
            DigitizedCardProfile = ((-2) - (~(values + 24))) % 128;
            return null;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            int i = DigitizedCardProfile;
            int i2 = i & 81;
            int i3 = -(-((i ^ 81) | i2));
            int i4 = (i2 & i3) + (i3 | i2);
            values = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        protected final /* synthetic */ java.lang.String doInBackground(java.lang.String[] strArr) {
            ?? DigitizedCardProfile2 = DigitizedCardProfile(new java.lang.Object[]{this, strArr}, -1611698975, 1611698976, java.lang.System.identityHashCode(this));
            return DigitizedCardProfile2;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(java.lang.String str) {
            DigitizedCardProfile(new java.lang.Object[]{this, str}, -77025828, 77025830, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onProgressUpdate(java.lang.Void[] voidArr) {
            DigitizedCardProfile(new java.lang.Object[]{this, voidArr}, -195437369, 195437369, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            DigitizedCardProfile(new java.lang.Object[]{this}, -282159216, 282159219, java.lang.System.identityHashCode(this));
        }

        private void AlternateContactlessPaymentDataJson() {
            DigitizedCardProfile(new java.lang.Object[]{this}, 48961720, -48961715, java.lang.System.identityHashCode(this));
        }

        private java.lang.String valueOf() {
            return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 2029883444, -2029883440, java.lang.System.identityHashCode(this));
        }
    }

    static final class values extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        private static int DigitizedCardProfile = 0;
        private static int values = 1;
        private com.payair.hce.setForegroundTintMode valueOf = null;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~i3;
            int i6 = ~((~i2) | i3);
            int i7 = (i * (-574)) + (i2 * (-574)) + (((~(i4 | i5)) | i6) * 1150) + (((~(i2 | i5)) | i6) * (-575)) + (((~(i | i5)) | (~(i4 | i3))) * 575);
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? DigitizedCardProfile(objArr) : IccPrivateKeyCrtComponentsJson(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr) : writeReplace(objArr);
        }

        values() {
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = DigitizedCardProfile;
            int i2 = ((i & (-6)) | ((~i) & 5)) + ((i & 5) << 1);
            values = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.values valuesVar = (com.payair.hce.setRenderEffect.values) objArr[0];
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = DigitizedCardProfile;
            int i2 = (((i | 78) << 1) - (i ^ 78)) - 1;
            values = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String str = (java.lang.String) writeReplace(new java.lang.Object[]{valuesVar}, 628924248, -628924244, java.lang.System.identityHashCode(valuesVar));
            if (i3 == 0) {
                throw null;
            }
            int i4 = DigitizedCardProfile;
            int i5 = i4 & 99;
            int i6 = (i4 ^ 99) | i5;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            values = i7 % 128;
            if (i7 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.values valuesVar = (com.payair.hce.setRenderEffect.values) objArr[0];
            java.lang.Object obj = objArr[1];
            int i = DigitizedCardProfile;
            int i2 = (i | 77) << 1;
            int i3 = -(i ^ 77);
            values = ((i2 & i3) + (i3 | i2)) % 128;
            writeReplace(new java.lang.Object[]{valuesVar}, 883730660, -883730657, java.lang.System.identityHashCode(valuesVar));
            int i4 = DigitizedCardProfile;
            int i5 = (((i4 ^ 7) | (i4 & 7)) << 1) - ((i4 & (-8)) | ((~i4) & 7));
            values = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.setRenderEffect.values valuesVar = (com.payair.hce.setRenderEffect.values) objArr[0];
            int identityHashCode = java.lang.System.identityHashCode(valuesVar);
            int i = ~identityHashCode;
            int i2 = ~(((-17367139) ^ i) | (i & (-17367139)));
            int i3 = -(-((((~i2) & 553018625) | ((-553018626) & i2) | (i2 & 553018625)) * (-591)));
            int i4 = (i3 ^ 1554885948) | (i3 & 1554885948);
            int i5 = (i & (-1359583975)) | (1359583974 & identityHashCode);
            int i6 = identityHashCode & (-1359583975);
            int i7 = (i6 ^ i5) | (i6 & i5);
            int i8 = ((-1895235462) & i7) | ((~i7) & 1895235461);
            int i9 = i7 & 1895235461;
            int i10 = -(-(((i9 ^ i8) | (i9 & i8)) * 591));
            int identityHashCode2 = java.lang.System.identityHashCode(valuesVar);
            int i11 = ~identityHashCode2;
            int i12 = i11 & 1482445056;
            int i13 = ((-1482445057) & identityHashCode2) | i12;
            int i14 = identityHashCode2 & 1482445056;
            int i15 = (~((i14 ^ i13) | (i13 & i14))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
            int i16 = i15 ^ (-1926410211);
            int i17 = -(-((i15 & (-1926410211)) << 1));
            int i18 = i11 ^ 1482445056;
            int i19 = (i18 ^ i12) | (i12 & i18);
            int i20 = ~i19;
            int i21 = (i19 | i20) & i20;
            if (((((r5 | i4) << 1) - (i4 ^ r5)) - (~i10)) - 1 > (((i16 | i17) << 1) - (i17 ^ i16)) + 1290831432 + (((1480868096 & (~i21)) | (i21 & (-1480868097)) | (i21 & 1480868096)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)) {
                valuesVar.valueOf = (com.payair.hce.setForegroundTintMode) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 1698772263, -1698772259, (int) java.lang.System.currentTimeMillis());
                int i22 = DigitizedCardProfile + 44;
                int i23 = (~i22) + (i22 << 1);
                values = i23 % 128;
                if (i23 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            valuesVar.valueOf = (com.payair.hce.setForegroundTintMode) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 1698772263, -1698772259, (int) java.lang.System.currentTimeMillis());
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x01bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x007e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            boolean z;
            int i;
            int i2;
            int i3;
            com.payair.hce.setRenderEffect.values valuesVar = (com.payair.hce.setRenderEffect.values) objArr[0];
            values = (DigitizedCardProfile + 89) % 128;
            com.payair.hce.setForegroundTintMode setforegroundtintmode = valuesVar.valueOf;
            if (((java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode))) != null) {
                int i4 = values + 69;
                DigitizedCardProfile = i4 % 128;
                if (i4 % 2 != 0) {
                    com.payair.hce.setForegroundTintMode setforegroundtintmode2 = valuesVar.valueOf;
                    ((java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode2}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode2))).equals("");
                    throw null;
                }
                com.payair.hce.setForegroundTintMode setforegroundtintmode3 = valuesVar.valueOf;
                if (!((java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode3}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode3))).equals("")) {
                    values = (DigitizedCardProfile + 89) % 128;
                    z = true;
                    if (z) {
                        com.payair.hce.setForegroundTintMode setforegroundtintmode4 = valuesVar.valueOf;
                        if (setforegroundtintmode4 != null) {
                            int i5 = values;
                            DigitizedCardProfile = (((i5 & 92) + (i5 | 92)) - 1) % 128;
                            if (setforegroundtintmode4.getStatusCodeFromServer() != null) {
                                int i6 = values;
                                int i7 = i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                int i8 = (i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i7);
                                int i9 = -(-(i7 << 1));
                                int i10 = (i8 & i9) + (i8 | i9);
                                DigitizedCardProfile = i10 % 128;
                                if (i10 % 2 != 0) {
                                    valuesVar.valueOf.getStatusCodeFromServer();
                                    throw null;
                                }
                                i = valuesVar.valueOf.getStatusCodeFromServer().intValue();
                                int i11 = values;
                                i2 = (i11 ^ 109) + ((i11 & 109) << 1);
                                DigitizedCardProfile = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i12 = 4 / 2;
                                }
                            }
                        }
                        int i13 = DigitizedCardProfile;
                        int i14 = i13 & 107;
                        values = ((i14 - (~(-(-((i13 ^ 107) | i14))))) - 1) % 128;
                        i = 0;
                        int i112 = values;
                        i2 = (i112 ^ 109) + ((i112 & 109) << 1);
                        DigitizedCardProfile = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                    } else {
                        com.payair.hce.setZ setz = new com.payair.hce.setZ();
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, 1}, 1948378219, -1948378219, 1);
                        com.payair.hce.setForegroundTintMode setforegroundtintmode5 = valuesVar.valueOf;
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode5}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode5))}, 1625632204, -1625632201, java.lang.System.identityHashCode(setz));
                        com.payair.hce.setForegroundTintMode setforegroundtintmode6 = valuesVar.valueOf;
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode6}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode6))}, 12451017, -12451012, java.lang.System.identityHashCode(setz));
                        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{setz}, -488246252, 488246305, (int) java.lang.System.currentTimeMillis());
                        com.payair.hce.setForegroundTintMode setforegroundtintmode7 = valuesVar.valueOf;
                        com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[]{(java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode7}, -955328739, 955328740, java.lang.System.identityHashCode(setforegroundtintmode7))}, 1368972204, -1368972202, (int) java.lang.System.currentTimeMillis());
                        int i15 = DigitizedCardProfile;
                        int i16 = (i15 & (-62)) | ((~i15) & 61);
                        int i17 = -(-((i15 & 61) << 1));
                        values = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
                        i = 0;
                    }
                    com.payair.hce.HCEEventListener hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setForegroundTintMode setforegroundtintmode8 = valuesVar.valueOf;
                    hCEEventListener.onIdentify(z, i, (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode8}, -226410896, 226410896, java.lang.System.identityHashCode(setforegroundtintmode8)));
                    int i18 = DigitizedCardProfile + 84;
                    i3 = (~i18) + (i18 << 1);
                    values = i3 % 128;
                    if (i3 % 2 == 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                }
            }
            int i19 = values;
            int i20 = i19 ^ 69;
            int i21 = ((i19 & 69) | i20) << 1;
            int i22 = -i20;
            DigitizedCardProfile = (((i21 | i22) << 1) - (i21 ^ i22)) % 128;
            z = false;
            if (z) {
            }
            com.payair.hce.HCEEventListener hCEEventListener2 = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setForegroundTintMode setforegroundtintmode82 = valuesVar.valueOf;
            hCEEventListener2.onIdentify(z, i, (java.lang.String) com.payair.hce.setForegroundTintMode.values(new java.lang.Object[]{setforegroundtintmode82}, -226410896, 226410896, java.lang.System.identityHashCode(setforegroundtintmode82)));
            int i182 = DigitizedCardProfile + 84;
            i3 = (~i182) + (i182 << 1);
            values = i3 % 128;
            if (i3 % 2 == 0) {
            }
        }

        private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
            int i = DigitizedCardProfile;
            int i2 = ((i | 71) << 1) - (i ^ 71);
            values = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        protected final /* synthetic */ java.lang.String doInBackground(java.lang.String[] strArr) {
            ?? writeReplace = writeReplace(new java.lang.Object[]{this, strArr}, 1655339857, -1655339855, java.lang.System.identityHashCode(this));
            return writeReplace;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(java.lang.String str) {
            writeReplace(new java.lang.Object[]{this, str}, -1824908695, 1824908696, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onProgressUpdate(java.lang.Void[] voidArr) {
            writeReplace(new java.lang.Object[]{this, voidArr}, 1992260073, -1992260073, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            writeReplace(new java.lang.Object[]{this}, -766929991, 766929996, java.lang.System.identityHashCode(this));
        }

        private void values() {
            writeReplace(new java.lang.Object[]{this}, 883730660, -883730657, java.lang.System.identityHashCode(this));
        }

        private java.lang.String AlternateContactlessPaymentDataJson() {
            return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 628924248, -628924244, java.lang.System.identityHashCode(this));
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = i & 97;
        int i3 = -(-(i | 97));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            writeReplace(new java.lang.Object[]{null}, -79140452, 79140453, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setZ setz = (com.payair.hce.setZ) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -195546592, 195546622, (int) java.lang.System.currentTimeMillis());
            if (setz != null) {
                int i5 = values;
                valueOf = ((((i5 ^ 37) | (i5 & 37)) << 1) - ((i5 & (-38)) | ((~i5) & 37))) % 128;
                com.payair.hce.setZ.values(new java.lang.Object[]{setz, null}, 12451017, -12451012, java.lang.System.identityHashCode(setz));
                com.payair.hce.setZ.values(new java.lang.Object[]{setz, null}, 1625632204, -1625632201, java.lang.System.identityHashCode(setz));
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{setz}, -488246252, 488246305, (int) java.lang.System.currentTimeMillis());
                values = (valueOf + 91) % 128;
            }
            int i6 = values;
            int i7 = i6 & 43;
            int i8 = ((i6 ^ 43) | i7) << 1;
            int i9 = -((i6 | 43) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            valueOf = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
        writeReplace(new java.lang.Object[]{null}, -79140452, 79140453, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    static void valueOf(java.lang.String str) {
        writeReplace(new java.lang.Object[]{str}, 1157035584, -1157035578, (int) java.lang.System.currentTimeMillis());
    }

    static void AlternateContactlessPaymentDataJson() {
        writeReplace(new java.lang.Object[0], -2196091, 2196093, (int) java.lang.System.currentTimeMillis());
    }

    static void values(java.lang.String str) {
        writeReplace(new java.lang.Object[]{str}, -79140452, 79140453, (int) java.lang.System.currentTimeMillis());
    }

    static void DigitizedCardProfile() {
        writeReplace(new java.lang.Object[0], 218508374, -218508371, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf() {
        writeReplace(new java.lang.Object[0], -1875299898, 1875299903, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[0], -1988341029, 1988341033, (int) java.lang.System.currentTimeMillis());
    }

    static void writeReplace(java.lang.String str) {
        writeReplace(new java.lang.Object[]{str}, -788299560, 788299560, (int) java.lang.System.currentTimeMillis());
    }
}
