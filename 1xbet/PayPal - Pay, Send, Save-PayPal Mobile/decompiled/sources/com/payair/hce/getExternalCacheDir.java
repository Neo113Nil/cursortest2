package com.payair.hce;

/* loaded from: classes4.dex */
public final class getExternalCacheDir {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private static com.payair.hce.onNewToken valueOf;
    private static com.payair.hce.checkAutomaticTimeSettings values;
    private static com.payair.hce.isSessionAvailable writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        int i8 = i | i7;
        int i9 = (i * 569) + (i2 * 569) + (((~i6) | (~(i4 | i7)) | (~(i5 | i7))) * (-1136)) + (((~(i4 | i3)) | (~(i5 | i3)) | (~(i8 | i2))) * (-568)) + (((~(i2 | i7)) | (~i8) | (~(i3 | i6))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION);
        if (i9 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i9 != 2) {
            return i9 != 3 ? values(objArr) : valueOf(objArr);
        }
        int i10 = 0;
        com.mastercard.mpsdk.card.profile.RecordsJson[] recordsJsonArr = (com.mastercard.mpsdk.card.profile.RecordsJson[]) objArr[0];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = recordsJsonArr.length;
        int i11 = AlternateContactlessPaymentDataJson;
        int i12 = i11 | 87;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & 87)) & i12);
        DigitizedCardProfile = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        while (i10 < length) {
            final com.mastercard.mpsdk.card.profile.RecordsJson recordsJson = recordsJsonArr[i10];
            arrayList.add(new com.payair.hce.setNetworkError() { // from class: com.payair.hce.getExternalCacheDir.5
                private static int AlternateContactlessPaymentDataJson = 0;
                private static int writeReplace = 1;

                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i15, int i16, int i17) {
                    int i18 = (i15 * 306) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS + (i16 * 306) + (((~(i15 | i16)) | (~(i15 | i17))) * 305) + (((~(i15 | (~i17))) | (~i16)) * 305);
                    return i18 != 1 ? i18 != 2 ? writeReplace(objArr2) : DigitizedCardProfile(objArr2) : valueOf(objArr2);
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                    com.payair.hce.getExternalCacheDir.AnonymousClass5 anonymousClass5 = (com.payair.hce.getExternalCacheDir.AnonymousClass5) objArr2[0];
                    int i15 = AlternateContactlessPaymentDataJson & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    writeReplace = (((((r0 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i15) << 1) - (~(-((r0 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i15))))) - 1) % 128;
                    byte b = (byte) com.mastercard.mpsdk.card.profile.RecordsJson.this.recordNumber;
                    int i16 = AlternateContactlessPaymentDataJson;
                    int i17 = (i16 ^ 105) + ((i16 & 105) << 1);
                    writeReplace = i17 % 128;
                    if (i17 % 2 != 0) {
                        return java.lang.Byte.valueOf(b);
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                    com.payair.hce.getExternalCacheDir.AnonymousClass5 anonymousClass5 = (com.payair.hce.getExternalCacheDir.AnonymousClass5) objArr2[0];
                    int i15 = AlternateContactlessPaymentDataJson;
                    int i16 = ((i15 ^ 55) - (~(-(-((i15 & 55) << 1))))) - 1;
                    writeReplace = i16 % 128;
                    com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.RecordsJson.this.sfi);
                    if (i16 % 2 == 0) {
                        AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                        throw null;
                    }
                    byte[] DigitizedCardProfile2 = AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                    int i17 = writeReplace;
                    int i18 = i17 & 41;
                    int i19 = i18 + ((i17 ^ 41) | i18);
                    AlternateContactlessPaymentDataJson = i19 % 128;
                    if (i19 % 2 == 0) {
                        return DigitizedCardProfile2;
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                    com.payair.hce.getExternalCacheDir.AnonymousClass5 anonymousClass5 = (com.payair.hce.getExternalCacheDir.AnonymousClass5) objArr2[0];
                    AlternateContactlessPaymentDataJson = (writeReplace + 83) % 128;
                    byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.RecordsJson.this.recordValue).DigitizedCardProfile();
                    if (DigitizedCardProfile2 != null) {
                        int i15 = writeReplace;
                        int i16 = ((i15 | 63) << 1) - (i15 ^ 63);
                        AlternateContactlessPaymentDataJson = i16 % 128;
                        if (i16 % 2 == 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    int i17 = writeReplace;
                    int i18 = i17 & 57;
                    int i19 = -(-((i17 ^ 57) | i18));
                    AlternateContactlessPaymentDataJson = ((i18 & i19) + (i19 | i18)) % 128;
                    byte[] DigitizedCardProfile3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("").DigitizedCardProfile();
                    int i20 = writeReplace;
                    int i21 = i20 & 21;
                    int i22 = ((i20 ^ 21) | i21) << 1;
                    int i23 = -((i20 | 21) & (~i21));
                    AlternateContactlessPaymentDataJson = ((i22 & i23) + (i23 | i22)) % 128;
                    return DigitizedCardProfile3;
                }

                @Override // com.payair.hce.setNetworkError
                public final byte[] getRecordValue() {
                    return (byte[]) writeReplace(new java.lang.Object[]{this}, -614958233, 614958233, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.setNetworkError
                public final byte[] getSfi() {
                    return (byte[]) writeReplace(new java.lang.Object[]{this}, -344821181, 344821182, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.setNetworkError
                public final byte getRecordNumber() {
                    return ((java.lang.Byte) writeReplace(new java.lang.Object[]{this}, -429847159, 429847161, java.lang.System.identityHashCode(this))).byteValue();
                }
            });
            int i15 = i10 & 1;
            int i16 = -(-((i10 ^ 1) | i15));
            i10 = (i16 ^ i15) + ((i16 & i15) << 1);
            int i17 = DigitizedCardProfile;
            int i18 = i17 & 9;
            AlternateContactlessPaymentDataJson = (i18 + ((i17 ^ 9) | i18)) % 128;
        }
        int i19 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (((i19 | 71) << 1) - (i19 ^ 71)) % 128;
        return arrayList;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.mastercard.mpsdk.card.profile.DigitizedCardProfile digitizedCardProfile = (com.mastercard.mpsdk.card.profile.DigitizedCardProfile) objArr[0];
        com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = (com.payair.hce.checkAutomaticTimeSettings) objArr[1];
        com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) objArr[2];
        com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) objArr[3];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 19;
        int i3 = (((i | 19) & (~i2)) - (~(i2 << 1))) - 1;
        int i4 = i3 % 128;
        DigitizedCardProfile = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (digitizedCardProfile == null) {
            int i5 = i4 & 51;
            int i6 = (((~i5) & (i4 | 51)) - (~(i5 << 1))) - 1;
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        values = checkautomatictimesettings;
        writeReplace = issessionavailable;
        valueOf = onnewtoken;
        if (digitizedCardProfile.getProfileVersion() == com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
            int i7 = AlternateContactlessPaymentDataJson;
            int i8 = i7 & 59;
            int i9 = ((i7 ^ 59) | i8) << 1;
            int i10 = -((i7 | 59) & (~i8));
            DigitizedCardProfile = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            com.payair.hce.checkForSuccess checkforsuccess = (com.payair.hce.checkForSuccess) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{(com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json) digitizedCardProfile}, -522720079, 522720083, (int) java.lang.System.currentTimeMillis());
            int i11 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = (((i11 & 94) + (i11 | 94)) - 1) % 128;
            return checkforsuccess;
        }
        if (digitizedCardProfile.getProfileVersion() != com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile) {
            int i12 = AlternateContactlessPaymentDataJson;
            int i13 = i12 & 83;
            int i14 = (i12 | 83) & (~i13);
            int i15 = -(-(i13 << 1));
            DigitizedCardProfile = ((i14 & i15) + (i14 | i15)) % 128;
            return null;
        }
        int i16 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = ((((i16 & (-32)) | ((~i16) & 31)) - (~((i16 & 31) << 1))) - 1) % 128;
        com.payair.hce.checkForSuccess valueOf2 = com.payair.hce.getCacheDir.valueOf((com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json) digitizedCardProfile);
        int i17 = AlternateContactlessPaymentDataJson;
        int i18 = i17 & 23;
        int i19 = (i17 | 23) & (~i18);
        int i20 = i18 << 1;
        int i21 = (i19 & i20) + (i19 | i20);
        DigitizedCardProfile = i21 % 128;
        if (i21 % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        final com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = (com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson) objArr[0];
        try {
            com.payair.hce.initializeVisaPaymentSdk AlternateContactlessPaymentDataJson2 = valueOf.AlternateContactlessPaymentDataJson(values, writeReplace, new com.payair.hce.performEnroll() { // from class: com.payair.hce.getExternalCacheDir.3
                private static int AlternateContactlessPaymentDataJson = 0;
                private static int DigitizedCardProfile = 1;

                public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i, int i2, int i3) {
                    int i4 = ~i;
                    int i5 = (i * (-419)) + (i2 * 421) + ((~(i2 | i3)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + ((i2 | i4) * (-420)) + (((~(i2 | (~i3))) | (~(i4 | (~i2)))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                    if (i5 == 1) {
                        return writeReplace(objArr2);
                    }
                    if (i5 == 2) {
                        return DigitizedCardProfile(objArr2);
                    }
                    if (i5 == 3) {
                        return values(objArr2);
                    }
                    if (i5 != 4) {
                        return AlternateContactlessPaymentDataJson(objArr2);
                    }
                    com.payair.hce.inithce_sdk_release inithce_sdk_releaseVar = new com.payair.hce.inithce_sdk_release(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.this.dp).DigitizedCardProfile());
                    int i6 = AlternateContactlessPaymentDataJson;
                    DigitizedCardProfile = ((i6 & 101) + (i6 | 101)) % 128;
                    return inithce_sdk_releaseVar;
                }

                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                    com.payair.hce.inithce_sdk_release inithce_sdk_releaseVar = new com.payair.hce.inithce_sdk_release(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.this.u).DigitizedCardProfile());
                    int i = DigitizedCardProfile;
                    int i2 = i & 25;
                    int i3 = (i ^ 25) | i2;
                    int i4 = (i2 & i3) + (i3 | i2);
                    AlternateContactlessPaymentDataJson = i4 % 128;
                    if (i4 % 2 == 0) {
                        return inithce_sdk_releaseVar;
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                    com.payair.hce.inithce_sdk_release inithce_sdk_releaseVar = new com.payair.hce.inithce_sdk_release(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.this.p).DigitizedCardProfile());
                    int i = AlternateContactlessPaymentDataJson;
                    int i2 = i & 3;
                    int i3 = i | 3;
                    int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                    DigitizedCardProfile = i4 % 128;
                    if (i4 % 2 != 0) {
                        return inithce_sdk_releaseVar;
                    }
                    throw new java.lang.ArithmeticException();
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                    com.payair.hce.inithce_sdk_release inithce_sdk_releaseVar = new com.payair.hce.inithce_sdk_release(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.this.q).DigitizedCardProfile());
                    int i = AlternateContactlessPaymentDataJson + 27;
                    DigitizedCardProfile = i % 128;
                    if (i % 2 != 0) {
                        return inithce_sdk_releaseVar;
                    }
                    throw new java.lang.ArithmeticException();
                }

                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                    com.payair.hce.inithce_sdk_release inithce_sdk_releaseVar = new com.payair.hce.inithce_sdk_release(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.this.dq).DigitizedCardProfile());
                    int i = DigitizedCardProfile;
                    int i2 = i ^ 51;
                    int i3 = -(-((i & 51) << 1));
                    int i4 = (i2 & i3) + (i3 | i2);
                    AlternateContactlessPaymentDataJson = i4 % 128;
                    if (i4 % 2 == 0) {
                        return inithce_sdk_releaseVar;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // com.payair.hce.performEnroll
                public final com.payair.hce.inithce_sdk_release AlternateContactlessPaymentDataJson() {
                    return (com.payair.hce.inithce_sdk_release) DigitizedCardProfile(new java.lang.Object[]{this}, -1473834883, 1473834883, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.performEnroll
                public final com.payair.hce.inithce_sdk_release writeReplace() {
                    return (com.payair.hce.inithce_sdk_release) DigitizedCardProfile(new java.lang.Object[]{this}, -592397621, 592397625, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.performEnroll
                public final com.payair.hce.inithce_sdk_release values() {
                    return (com.payair.hce.inithce_sdk_release) DigitizedCardProfile(new java.lang.Object[]{this}, 139474656, -139474653, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.performEnroll
                public final com.payair.hce.inithce_sdk_release DigitizedCardProfile() {
                    return (com.payair.hce.inithce_sdk_release) DigitizedCardProfile(new java.lang.Object[]{this}, 1395698494, -1395698492, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.performEnroll
                public final com.payair.hce.inithce_sdk_release valueOf() {
                    return (com.payair.hce.inithce_sdk_release) DigitizedCardProfile(new java.lang.Object[]{this}, 948977956, -948977955, java.lang.System.identityHashCode(this));
                }
            });
            int i = AlternateContactlessPaymentDataJson;
            int i2 = i & 37;
            int i3 = -(-((i ^ 37) | i2));
            DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            return AlternateContactlessPaymentDataJson2;
        } catch (java.security.GeneralSecurityException unused) {
            return new com.payair.hce.initializeVisaPaymentSdk(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("").DigitizedCardProfile());
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        final com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i ^ 3;
        int i3 = ((i & 3) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        AlternateContactlessPaymentDataJson = i6;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (alternateContactlessPaymentDataJson == null) {
            int i7 = i6 & 103;
            int i8 = ((((i6 ^ 103) | i7) << 1) - (~(-((~i7) & (i6 | 103))))) - 1;
            int i9 = i8 % 128;
            DigitizedCardProfile = i9;
            if (i8 % 2 == 0) {
                throw null;
            }
            int i10 = i9 + 1;
            AlternateContactlessPaymentDataJson = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        com.payair.hce.JsonRequest jsonRequest = new com.payair.hce.JsonRequest() { // from class: com.payair.hce.getExternalCacheDir.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static char[] AlternateContactlessPaymentDataJson;
            private static int DigitizedCardProfile;
            private static boolean RecordsJson;
            private static int getAid;
            private static int getProfileVersion;
            private static boolean values;
            private static int[] writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i11, short s, byte b, java.lang.Object[] objArr2) {
                int i12;
                int i13;
                int i14 = 40 - (b * 2);
                byte[] bArr = $$a;
                char[] cArr = new char[35 - s];
                int i15 = 34 - s;
                if (bArr == null) {
                    int i16 = i15;
                    i13 = i14;
                    i12 = 0;
                    i14 = (i14 + (-i16)) - 2;
                    i13++;
                    cArr[i12] = (char) i14;
                    if (i12 == i15) {
                        objArr2[0] = new java.lang.String(cArr);
                        return;
                    }
                    i12++;
                    i16 = bArr[i13];
                    i14 = (i14 + (-i16)) - 2;
                    i13++;
                    cArr[i12] = (char) i14;
                    if (i12 == i15) {
                    }
                } else {
                    i12 = 0;
                    i14 = i11 + 65;
                    i13 = i14;
                    cArr[i12] = (char) i14;
                    if (i12 == i15) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(int i11, int i12, byte b, java.lang.Object[] objArr2) {
                int i13;
                byte[] bArr = $$d;
                int i14 = i12 + 4;
                int i15 = b * 2;
                int i16 = (i11 * 52) + 66;
                byte[] bArr2 = new byte[1 - i15];
                if (bArr == null) {
                    int i17 = i14;
                    int i18 = 0;
                    i16 += i14;
                    i14 = i17;
                    i13 = i18;
                    int i19 = i14 + 1;
                    bArr2[i13] = (byte) i16;
                    if (i13 == 0 - i15) {
                        objArr2[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i20 = i13 + 1;
                    i17 = i19;
                    i14 = bArr[i19];
                    i18 = i20;
                    i16 += i14;
                    i14 = i17;
                    i13 = i18;
                    int i192 = i14 + 1;
                    bArr2[i13] = (byte) i16;
                    if (i13 == 0 - i15) {
                    }
                } else {
                    i13 = 0;
                    int i1922 = i14 + 1;
                    bArr2[i13] = (byte) i16;
                    if (i13 == 0 - i15) {
                    }
                }
            }

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i11, int i12, int i13) {
                return DigitizedCardProfile(objArr2);
            }

            private static void b(int[] iArr, int i11, java.lang.Object[] objArr2) {
                int i12;
                int[] iArr2;
                int i13;
                int length;
                int[] iArr3;
                int i14;
                com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr4 = writeReplace;
                int i15 = 16;
                int i16 = 1;
                int i17 = 0;
                if (iArr4 != null) {
                    int i18 = $11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        length = iArr4.length;
                        iArr3 = new int[length];
                        i14 = 1;
                    } else {
                        length = iArr4.length;
                        iArr3 = new int[length];
                        i14 = 0;
                    }
                    while (i14 < length) {
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[i16];
                            objArr3[0] = java.lang.Integer.valueOf(iArr4[i14]);
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> i15) + 27, 29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("z", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                            }
                            iArr3[i14] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                            i14++;
                            i15 = 16;
                            i16 = 1;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr4 = iArr3;
                }
                int length2 = iArr4.length;
                int[] iArr5 = new int[length2];
                int[] iArr6 = writeReplace;
                if (iArr6 != null) {
                    int length3 = iArr6.length;
                    int[] iArr7 = new int[length3];
                    int i19 = 0;
                    while (i19 < length3) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        objArr4[i17] = java.lang.Integer.valueOf(iArr6[i19]);
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj2 == null) {
                            iArr2 = iArr6;
                            i13 = length3;
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 29, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                        } else {
                            iArr2 = iArr6;
                            i13 = length3;
                        }
                        iArr7[i19] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                        i19++;
                        iArr6 = iArr2;
                        length3 = i13;
                        i17 = 0;
                    }
                    i12 = i17;
                    iArr6 = iArr7;
                } else {
                    i12 = 0;
                }
                java.lang.System.arraycopy(iArr6, i12, iArr5, i12, length2);
                istransitsupported.valueOf = i12;
                $11 = ($10 + 9) % 128;
                while (istransitsupported.valueOf < iArr.length) {
                    cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
                    cArr[1] = (char) iArr[istransitsupported.valueOf];
                    cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                    cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                    istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                    istransitsupported.values = (cArr[2] << 16) + cArr[3];
                    com.payair.hce.isTransitSupported.values(iArr5);
                    $10 = ($11 + 79) % 128;
                    int i20 = 0;
                    while (i20 < 16) {
                        int i21 = $10 + 69;
                        $11 = i21 % 128;
                        if (i21 % 2 == 0) {
                            istransitsupported.DigitizedCardProfile ^= iArr5[i20];
                            java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 32, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5089, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                            istransitsupported.DigitizedCardProfile = istransitsupported.values;
                            istransitsupported.values = intValue;
                            i20 += 81;
                        } else {
                            istransitsupported.DigitizedCardProfile ^= iArr5[i20];
                            java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 31, 5088 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue();
                            istransitsupported.DigitizedCardProfile = istransitsupported.values;
                            istransitsupported.values = intValue2;
                            i20++;
                        }
                    }
                    int i22 = istransitsupported.DigitizedCardProfile;
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = i22;
                    istransitsupported.values ^= iArr5[16];
                    istransitsupported.DigitizedCardProfile ^= iArr5[17];
                    int i23 = istransitsupported.DigitizedCardProfile;
                    int i24 = istransitsupported.values;
                    cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
                    cArr[1] = (char) istransitsupported.DigitizedCardProfile;
                    cArr[2] = (char) (istransitsupported.values >>> 16);
                    cArr[3] = (char) istransitsupported.values;
                    com.payair.hce.isTransitSupported.values(iArr5);
                    cArr2[istransitsupported.valueOf * 2] = cArr[0];
                    cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
                    cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
                    cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                    if (obj5 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 49, android.graphics.Color.green(0) + 2923, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3037));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        d(0, -1, (byte) 0, objArr8);
                        obj5 = cls.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
                }
                objArr2[0] = new java.lang.String(cArr2, 0, i11);
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                com.payair.hce.getExternalCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getExternalCacheDir.AnonymousClass2) objArr2[0];
                int i11 = getProfileVersion + 49;
                getAid = i11 % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.aid).DigitizedCardProfile();
                if (i11 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i12 = getAid + 59;
                getProfileVersion = i12 % 128;
                if (i12 % 2 == 0) {
                    return DigitizedCardProfile2;
                }
                throw null;
            }

            private static void a(int[] iArr, java.lang.String str, int i11, java.lang.String str2, java.lang.Object[] objArr2) {
                char[] cArr;
                int length;
                char[] cArr2;
                int i12;
                java.lang.String str3 = str2;
                int i13 = $10 + 89;
                int i14 = i13 % 128;
                $11 = i14;
                byte[] bArr = str3;
                if (i13 % 2 == 0) {
                    throw null;
                }
                if (str3 != null) {
                    $10 = (i14 + 107) % 128;
                    bArr = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = bArr;
                if (str != null) {
                    int i15 = $10 + 113;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    cArr = str.toCharArray();
                } else {
                    cArr = str;
                }
                char[] cArr3 = cArr;
                com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
                char[] cArr4 = AlternateContactlessPaymentDataJson;
                if (cArr4 != null) {
                    int i16 = $11 + 63;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        length = cArr4.length;
                        cArr2 = new char[length];
                        i12 = 1;
                    } else {
                        length = cArr4.length;
                        cArr2 = new char[length];
                        i12 = 0;
                    }
                    while (i12 < length) {
                        try {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[i12])};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 47, android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46336 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("y", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                            }
                            cArr2[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).charValue();
                            i12++;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr4 = cArr2;
                }
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) (46337 - android.view.Gravity.getAbsoluteGravity(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                if (RecordsJson) {
                    getumdgeneration.values = bArr2.length;
                    char[] cArr5 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    $11 = ($10 + 87) % 128;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        cArr5[getumdgeneration.valueOf] = (char) (cArr4[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i11] - intValue);
                        java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 43, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1629, (char) android.view.KeyEvent.keyCodeFromString(""));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            d(1, -1, (byte) 0, objArr6);
                            obj3 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    }
                    objArr2[0] = new java.lang.String(cArr5);
                    return;
                }
                if (!values) {
                    getumdgeneration.values = iArr.length;
                    char[] cArr6 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        cArr6[getumdgeneration.valueOf] = (char) (cArr4[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i11] - intValue);
                        getumdgeneration.valueOf++;
                    }
                    objArr2[0] = new java.lang.String(cArr6);
                    return;
                }
                $11 = ($10 + 71) % 128;
                getumdgeneration.values = cArr3.length;
                char[] cArr7 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i11] - intValue);
                    java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 43, 1629 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        d(1, -1, (byte) 0, objArr8);
                        obj4 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                }
                objArr2[0] = new java.lang.String(cArr7);
            }

            @Override // com.payair.hce.JsonRequest
            public final byte[] getPaymentFci() {
                getProfileVersion = (getAid + 31) % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.paymentFci).DigitizedCardProfile();
                getProfileVersion = (getAid + 89) % 128;
                return DigitizedCardProfile2;
            }

            @Override // com.payair.hce.JsonRequest
            public final byte[] getgpoResponse() {
                getAid = (getProfileVersion + 85) % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.gpoResponse).DigitizedCardProfile();
                getProfileVersion = (getAid + 29) % 128;
                return DigitizedCardProfile2;
            }

            @Override // com.payair.hce.JsonRequest
            public final byte[] getCiacDecline() {
                getAid = (getProfileVersion + 15) % 128;
                if (com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.ciacDecline == null) {
                    return null;
                }
                int i11 = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getProfileVersion = i11 % 128;
                if (i11 % 2 == 0) {
                    return com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.ciacDecline).DigitizedCardProfile();
                }
                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.ciacDecline).DigitizedCardProfile();
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.JsonRequest
            public final byte[] getCvrMaskAnd() {
                int i11 = getAid + 95;
                getProfileVersion = i11 % 128;
                if (i11 % 2 != 0) {
                    com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.cvrMaskAnd).DigitizedCardProfile();
                    throw new java.lang.ArithmeticException();
                }
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.this.cvrMaskAnd).DigitizedCardProfile();
                getAid = (getProfileVersion + 99) % 128;
                return DigitizedCardProfile2;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getProfileVersion = 0;
                getAid = 1;
                writeReplace = new int[]{-1721843375, -2021154549, -29883389, 1431622120, 78033499, 2097328877, 933822829, -291635354, 642492190, 1405653584, 836380230, -1309117645, 1095329767, 1830260903, -1672908804, -425384652, 2050128785, 1915961824};
                AlternateContactlessPaymentDataJson = new char[]{11127, 11019, 11009, 11018, 11069, 11061, 11020, 11062, 11070, 11063, 11060, 11047, 11065, 11067, 11066, 11124, 11071, 11064, 11022, 11016, 11057, 11068, 11099, 11094, 11059, 11092, 11097, 11058, 11089, 11098, 11110, 11056, 11050, 11072, 11093, 11095, 11023};
                DigitizedCardProfile = -143185274;
                values = true;
                RecordsJson = true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:122:0x1784 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:123:0x1785  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x1c4f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:461:0x127f A[Catch: all -> 0x12b0, InterruptedException -> 0x12bc, TryCatch #50 {InterruptedException -> 0x12bc, all -> 0x12b0, blocks: (B:355:0x12ab, B:459:0x1279, B:461:0x127f, B:462:0x1280, B:350:0x11fe), top: B:354:0x12ab, inners: #43 }] */
            /* JADX WARN: Removed duplicated region for block: B:462:0x1280 A[Catch: all -> 0x12b0, InterruptedException -> 0x12bc, TRY_LEAVE, TryCatch #50 {InterruptedException -> 0x12bc, all -> 0x12b0, blocks: (B:355:0x12ab, B:459:0x1279, B:461:0x127f, B:462:0x1280, B:350:0x11fe), top: B:354:0x12ab, inners: #43 }] */
            /* JADX WARN: Removed duplicated region for block: B:525:0x163d A[Catch: Exception -> 0x165c, all -> 0x1680, IOException -> 0x168f, TryCatch #12 {Exception -> 0x165c, blocks: (B:438:0x15e0, B:498:0x15f4, B:500:0x1602, B:501:0x1603, B:506:0x161d, B:508:0x1623, B:509:0x1624, B:523:0x1637, B:525:0x163d, B:526:0x163e, B:549:0x164c, B:551:0x1652, B:552:0x1653), top: B:308:0x0ffb }] */
            /* JADX WARN: Removed duplicated region for block: B:526:0x163e A[Catch: Exception -> 0x165c, all -> 0x1680, IOException -> 0x168f, TryCatch #12 {Exception -> 0x165c, blocks: (B:438:0x15e0, B:498:0x15f4, B:500:0x1602, B:501:0x1603, B:506:0x161d, B:508:0x1623, B:509:0x1624, B:523:0x1637, B:525:0x163d, B:526:0x163e, B:549:0x164c, B:551:0x1652, B:552:0x1653), top: B:308:0x0ffb }] */
            /* JADX WARN: Removed duplicated region for block: B:551:0x1652 A[Catch: Exception -> 0x165c, all -> 0x1680, IOException -> 0x168f, TryCatch #12 {Exception -> 0x165c, blocks: (B:438:0x15e0, B:498:0x15f4, B:500:0x1602, B:501:0x1603, B:506:0x161d, B:508:0x1623, B:509:0x1624, B:523:0x1637, B:525:0x163d, B:526:0x163e, B:549:0x164c, B:551:0x1652, B:552:0x1653), top: B:308:0x0ffb }] */
            /* JADX WARN: Removed duplicated region for block: B:552:0x1653 A[Catch: Exception -> 0x165c, all -> 0x1680, IOException -> 0x168f, TRY_LEAVE, TryCatch #12 {Exception -> 0x165c, blocks: (B:438:0x15e0, B:498:0x15f4, B:500:0x1602, B:501:0x1603, B:506:0x161d, B:508:0x1623, B:509:0x1624, B:523:0x1637, B:525:0x163d, B:526:0x163e, B:549:0x164c, B:551:0x1652, B:552:0x1653), top: B:308:0x0ffb }] */
            /* JADX WARN: Type inference failed for: r10v124 */
            /* JADX WARN: Type inference failed for: r10v14 */
            /* JADX WARN: Type inference failed for: r10v16 */
            /* JADX WARN: Type inference failed for: r10v17 */
            /* JADX WARN: Type inference failed for: r10v18 */
            /* JADX WARN: Type inference failed for: r10v19 */
            /* JADX WARN: Type inference failed for: r10v20 */
            /* JADX WARN: Type inference failed for: r10v30 */
            /* JADX WARN: Type inference failed for: r10v57 */
            /* JADX WARN: Type inference failed for: r11v63, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Integer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v390, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r1v466, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v508, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v545, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v587, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v616, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v646, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v677, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v706, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r29v10 */
            /* JADX WARN: Type inference failed for: r29v11 */
            /* JADX WARN: Type inference failed for: r29v12 */
            /* JADX WARN: Type inference failed for: r29v13 */
            /* JADX WARN: Type inference failed for: r29v15 */
            /* JADX WARN: Type inference failed for: r29v18 */
            /* JADX WARN: Type inference failed for: r29v19 */
            /* JADX WARN: Type inference failed for: r29v6 */
            /* JADX WARN: Type inference failed for: r29v7 */
            /* JADX WARN: Type inference failed for: r29v8 */
            /* JADX WARN: Type inference failed for: r29v9 */
            /* JADX WARN: Type inference failed for: r2v109, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v135 */
            /* JADX WARN: Type inference failed for: r2v225 */
            /* JADX WARN: Type inference failed for: r2v226 */
            /* JADX WARN: Type inference failed for: r2v69 */
            /* JADX WARN: Type inference failed for: r2v70 */
            /* JADX WARN: Type inference failed for: r2v71 */
            /* JADX WARN: Type inference failed for: r2v72 */
            /* JADX WARN: Type inference failed for: r2v73 */
            /* JADX WARN: Type inference failed for: r2v74 */
            /* JADX WARN: Type inference failed for: r2v87 */
            /* JADX WARN: Type inference failed for: r34v14 */
            /* JADX WARN: Type inference failed for: r34v29 */
            /* JADX WARN: Type inference failed for: r34v37 */
            /* JADX WARN: Type inference failed for: r34v38 */
            /* JADX WARN: Type inference failed for: r34v39 */
            /* JADX WARN: Type inference failed for: r37v0 */
            /* JADX WARN: Type inference failed for: r37v1 */
            /* JADX WARN: Type inference failed for: r37v13 */
            /* JADX WARN: Type inference failed for: r37v14 */
            /* JADX WARN: Type inference failed for: r37v15 */
            /* JADX WARN: Type inference failed for: r37v16 */
            /* JADX WARN: Type inference failed for: r37v17 */
            /* JADX WARN: Type inference failed for: r37v18 */
            /* JADX WARN: Type inference failed for: r37v19 */
            /* JADX WARN: Type inference failed for: r37v2 */
            /* JADX WARN: Type inference failed for: r37v20 */
            /* JADX WARN: Type inference failed for: r37v3 */
            /* JADX WARN: Type inference failed for: r37v4 */
            /* JADX WARN: Type inference failed for: r37v5 */
            /* JADX WARN: Type inference failed for: r37v6 */
            /* JADX WARN: Type inference failed for: r37v7 */
            /* JADX WARN: Type inference failed for: r3v390, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v419, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v383, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v210 */
            /* JADX WARN: Type inference failed for: r6v302 */
            /* JADX WARN: Type inference failed for: r6v326 */
            /* JADX WARN: Type inference failed for: r6v366 */
            /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.reflect.Field] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i11, int i12, int i13) {
                int i14;
                java.lang.Integer num;
                java.lang.Integer num2;
                java.lang.Integer num3;
                java.lang.String str;
                java.lang.String str2;
                char c;
                java.lang.Object[] objArr2;
                int i15;
                java.lang.Object[] objArr3;
                char c2;
                java.lang.String str3;
                java.lang.Object[] objArr4;
                int i16;
                java.lang.Object[] objArr5;
                char c3;
                char c4;
                java.lang.Object[] objArr6;
                ?? r34;
                int i17;
                java.lang.String str4;
                java.lang.String intern;
                java.lang.Runtime runtime;
                java.lang.Process exec;
                java.lang.Throwable th;
                java.lang.Throwable cause;
                java.lang.Object obj;
                java.lang.Throwable th2;
                java.lang.Throwable cause2;
                java.lang.Object obj2;
                java.lang.String str5;
                java.lang.Throwable th3;
                java.lang.Object obj3;
                java.lang.String str6;
                java.lang.Throwable cause3;
                java.lang.String str7;
                java.lang.Object obj4;
                java.lang.Integer num4;
                java.lang.Integer num5;
                java.lang.Object[] objArr7;
                char c5;
                java.lang.Object[] objArr8;
                int i18;
                java.lang.Object[] objArr9;
                int i19;
                java.lang.Object obj5;
                int i20 = i11;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(null, null, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u008a\u0096\u008b\u009d\u008b\u008a\u0095\u0084\u008d\u008e\u0095\u009c\u0088\u0088\u009b\u0090\u0086\u0088\u0090\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr10);
                java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(null, null, android.graphics.Color.alpha(0) + 127, "\u0094\u0095\u009e\u008d\u0084\u008d\u008f", objArr11);
                java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(null, null, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u008f\u008d\u0085\u0094\u0089¡\u0090\u0091\u008b\u008d\u009c\u0090\u008d\u0087\u008d ", objArr12);
                java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
                java.lang.Integer num6 = -604620973;
                try {
                    if (context == null) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        b(new int[]{-1936280840, 1095690901, -1752079883, 369415044, -1209260551, -1844251280}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 13, objArr13);
                        java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                        java.lang.Object obj7 = obj6;
                        if (obj6 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 36, 3161 - android.view.View.MeasureSpec.getSize(0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 33100));
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(35, (short) 34, $$a[52], objArr15);
                            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method);
                            obj7 = method;
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr14)).longValue();
                        long j = ~longValue;
                        long j2 = i20 == true ? 1L : 0L;
                        long j3 = ~(j | 95597979 | j2);
                        long j4 = ~j2;
                        long j5 = ((-475) * longValue) + 45600235983L + (((~(longValue | (-95597980))) | j3) * (-476)) + (j3 * 952) + ((~(j | j4 | 95597979)) * 476) + 811872759;
                        int i21 = (int) (j5 >> 32);
                        int i22 = ~(i20 == true ? 1 : 0);
                        if (((i21 & (((((~((-1784048412) | i22)) | (-346822001)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~((-262417) | i22)) | (~((-346559585) | (i20 == true ? 1 : 0)))) * (-519)) + (((~((-346822001) | (i20 == true ? 1 : 0))) | 1784048411) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) | (((int) j5) & (((~(2146654653 | (i20 == true ? 1 : 0))) * (-301)) + 1770220246 + (((~((-1056070078) | (i20 == true ? 1 : 0))) | (~(1801670808 | i22))) * (-301)) + (((~((-1801670809) | (i20 == true ? 1 : 0))) | (-1056070078)) * 301)))) != 0) {
                            objArr7 = new java.lang.Object[]{new int[]{i20 == true ? 1 : 0}, new int[]{(i20 == true ? 1 : 0) ^ 50}, null, null, new int[1]};
                            java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((~((-677384257) | i22)) * 433) - 1269318596) + (((~((-318990399) | (i20 == true ? 1 : 0))) | (-711145547)) * (-433)) + (((~((-711145547) | (i20 == true ? 1 : 0))) | (-996374655)) * 433))};
                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj8 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, 2713 - android.graphics.Color.red(0), (char) android.view.KeyEvent.getDeadChar(0, 0));
                                short s = $$a[41];
                                num4 = 16;
                                num5 = 269015277;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                c(s, (byte) s, r7[52], objArr17);
                                java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                                obj5 = method2;
                            } else {
                                num4 = 16;
                                num5 = 269015277;
                                obj5 = obj8;
                            }
                            c5 = 0;
                            ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr16)).intValue();
                        } else {
                            num4 = 16;
                            num5 = 269015277;
                            objArr7 = new java.lang.Object[]{new int[]{i20 == true ? 1 : 0}, new int[]{i20 == true ? 1 : 0}, null, null, new int[1]};
                            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i13), 0, java.lang.Integer.valueOf((((871637096 | (i20 == true ? 1 : 0)) * (-859)) - 564432352) + (((~(871637096 | i22)) | (~((-24117281) | (i20 == true ? 1 : 0)))) * 859) + (((~((-158498849) | i22)) | 134381568) * 859))};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj10 = obj9;
                            if (obj9 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                short s2 = $$a[41];
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                c(s2, (byte) s2, r5[52], objArr19);
                                java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                obj10 = method3;
                            }
                            c5 = 0;
                            ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr18)).intValue();
                        }
                        if (((int[]) objArr7[1])[c5] != i20) {
                            return objArr7;
                        }
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(null, null, 127 - (android.view.ViewConfiguration.getTapTimeout() >> 16), "\u0085\u008e\u008d\u0088\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr20);
                        java.lang.Object[] objArr21 = {((java.lang.String) objArr20[c5]).intern()};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                        java.lang.Object obj12 = obj11;
                        if (obj11 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 3161, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 33099));
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c(35, (short) 34, $$a[52], objArr22);
                            java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method4);
                            obj12 = method4;
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr21)).longValue();
                        long j6 = ~longValue2;
                        long j7 = ((-163) * longValue2) + 120964653150L + (((~(j4 | longValue2)) | 733119110) * (-328)) + ((j2 | 733119110) * 164) + (((~(longValue2 | 733119110 | j4)) | (~((-733119111) | j6)) | (~(j6 | j2))) * 164) + 174351628;
                        if (((((int) (j7 >> 32)) & ((((~((-1140908519) | i22)) | 1140899942) * 529) + 1520786966 + (((~((-1140908519) | (i20 == true ? 1 : 0))) | 1716832366) * 529))) | (((int) j7) & ((((~(614668873 | (i20 == true ? 1 : 0))) | 363077929) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1200134373 + (((~(614668873 | i22)) | 363077929) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)))) != 0) {
                            objArr8 = new java.lang.Object[]{new int[]{i20 == true ? 1 : 0}, new int[]{(i20 == true ? 1 : 0) ^ 60}, null, null, new int[1]};
                            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i13), num4, java.lang.Integer.valueOf(((((~((-33562762) | (i20 == true ? 1 : 0))) | (~(996573183 | i22))) * (-318)) - 1865050404) + (((~(438583033 | (i20 == true ? 1 : 0))) | 557990150) * (-318)) + (((~((-438583034) | (i20 == true ? 1 : 0))) | (-591552912)) * 318))};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj14 = obj13;
                            if (obj13 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                short s3 = $$a[41];
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                c(s3, (byte) s3, r7[52], objArr24);
                                java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                                obj14 = method5;
                            }
                            i18 = 0;
                            ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr23)).intValue();
                        } else {
                            objArr8 = new java.lang.Object[]{new int[]{i20 == true ? 1 : 0}, new int[]{i20 == true ? 1 : 0}, null, null, new int[1]};
                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i13), 0, java.lang.Integer.valueOf(((((~((-8953994) | i22)) | (~(1021181951 | (i20 == true ? 1 : 0)))) * (-272)) - 851010264) + (((~((-819521242) | (i20 == true ? 1 : 0))) | 810567248) * (-272)) + (((~(819521241 | (i20 == true ? 1 : 0))) | 210614703) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj16 = obj15;
                            if (obj15 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                short s4 = $$a[41];
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                c(s4, (byte) s4, r7[52], objArr26);
                                java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                obj16 = method6;
                            }
                            i18 = 0;
                            ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr25)).intValue();
                        }
                        if (((int[]) objArr8[1])[i18] != i20) {
                            return objArr8;
                        }
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        a(null, null, 126 - android.os.Process.getGidForName(""), "\u008d\u0084\u008d\u008f\u008c\u0082\u0096\u0087\u0081\u008f\u0095\u008a\u0094\u008f\u008b\u008d\u0090\u0093\u008a\u0092\u0091\u0090\u0086\u008a\u008e\u0081\u008d\u0084\u008d\u008f\u0081\u008d\u0084\u008d\u008f\u0081", objArr27);
                        java.lang.Object[] objArr28 = {((java.lang.String) objArr27[i18]).intern()};
                        java.lang.Integer num7 = num5;
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                        java.lang.Object obj18 = obj17;
                        if (obj17 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)) + 36, 3161 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (33099 - android.view.View.resolveSizeAndState(i18, i18, i18)));
                            short s5 = (short) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                            byte[] bArr = $$a;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            c(s5, bArr[12], bArr[54], objArr29);
                            java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, method7);
                            obj18 = method7;
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr28)).longValue();
                        long j8 = (471 * longValue3) + 212289257000L + (((~((-899530751) | j4)) | longValue3) * (-235)) + (((~(j2 | (-899530751))) | longValue3) * (-470)) + (((~((~longValue3) | 899530750)) | (~((-899530751) | longValue3 | j2))) * 235) + 95904153;
                        if (((((int) (j8 >> 32)) & ((((1074353426 | (i20 == true ? 1 : 0)) * 988) - 1439527574) + (((~(1120523614 | i22)) | 270532608) * (-1976)) + (((~((-316702797) | (i20 == true ? 1 : 0))) | 1074353426 | (~(316702796 | i22))) * 988))) | (((int) j8) & (((((-1708052151) | (i20 == true ? 1 : 0)) * (-50)) - 1596873153) + (((~((-270545161) | (i20 == true ? 1 : 0))) | (~((-280581) | i22))) * 50) + (((~((-1708052151) | i22)) | (~((-270825741) | i22)) | 280580) * 50)))) != 0) {
                            objArr9 = new java.lang.Object[]{new int[]{i20 == true ? 1 : 0}, new int[]{(i20 == true ? 1 : 0) ^ 80}, null, null, new int[1]};
                            java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i13), num4, java.lang.Integer.valueOf(((((~((-94939170) | (i20 == true ? 1 : 0))) | (~((-269488193) | i22))) * 920) - 1802127416) + (((~((-665708584) | i22)) | 94939169) * 920) + (((~((-94939170) | i22)) | (~((-570769415) | (i20 == true ? 1 : 0))) | (~((-269488193) | (i20 == true ? 1 : 0)))) * 920))};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj20 = obj19;
                            if (obj19 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.graphics.Color.green(0) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                short s6 = $$a[41];
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                c(s6, (byte) s6, r8[52], objArr31);
                                java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                                obj20 = method8;
                            }
                            i19 = 0;
                            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr30)).intValue();
                        } else {
                            objArr9 = new java.lang.Object[]{new int[]{i20 == true ? 1 : 0}, new int[]{i20 == true ? 1 : 0}, null, null, new int[1]};
                            int i23 = ~(355838016 | (i20 == true ? 1 : 0));
                            java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i13), 0, java.lang.Integer.valueOf(((1023758344 | i23) * (-658)) + 1145086088 + ((i23 | 671109128) * 658))};
                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj22 = obj21;
                            if (obj21 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, android.text.TextUtils.indexOf("", "", 0) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                short s7 = $$a[41];
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                c(s7, (byte) s7, r7[52], objArr33);
                                java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                                obj22 = method9;
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr32)).intValue();
                            i19 = 0;
                            ((int[]) objArr9[4])[0] = intValue;
                        }
                        if (((int[]) objArr9[1])[i19] != i20) {
                            return objArr9;
                        }
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        b(new int[]{2059729749, 1207044025, -1737953464, 366619500, 1176725585, -1575233443, 261946170, 1715388906, -588249357, 1155888874, -1110490064, -888296135, -1431737772, 1438234558, -1268682705, -1843617696, 1642489335, -1675419413, -1778563041, -1330177590, -664818114, 287909540}, 42 - android.view.View.combineMeasuredStates(i19, i19), objArr34);
                        java.lang.Object[] objArr35 = {((java.lang.String) objArr34[i19]).intern()};
                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                        java.lang.Object obj24 = obj23;
                        if (obj23 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(i19, i19) + 36, android.view.View.MeasureSpec.getMode(i19) + 3161, (char) (33099 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                            short s8 = (short) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                            byte[] bArr2 = $$a;
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            c(s8, bArr2[12], bArr2[54], objArr36);
                            java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, method10);
                            obj24 = method10;
                        }
                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr35)).longValue();
                        long j9 = ~longValue4;
                        long j10 = ((-590) * longValue4) + 582959267264L + ((~((-984728493) | longValue4)) * (-1182)) + (((~(longValue4 | 984728492)) | (~(j4 | (-984728493) | j9))) * (-591)) + ((j2 | (-984728493) | j9) * 591) + 10706411;
                        if (((((int) (j10 >> 32)) & ((((~(230306558 | (i20 == true ? 1 : 0))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 2043863594) + (((~(230306558 | i22)) | 95429292) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | (((int) j10) & ((((-1076174886) | i22) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 621493853 + (((~((-1088927336) | i22)) | (-1411721510)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))) != 0) {
                            java.lang.Object[] objArr37 = {new int[]{i20 == true ? 1 : 0}, new int[]{(i20 == true ? 1 : 0) ^ 90}, null, null, new int[1]};
                            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i13), num4, java.lang.Integer.valueOf(((~((-546314823) | i22)) * (-783)) + 346200880 + (((~(476997041 | i22)) | (-553138904)) * 783))};
                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj26 = obj25;
                            if (obj25 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                short s9 = $$a[41];
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c(s9, (byte) s9, r4[52], objArr39);
                                java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method11);
                                obj26 = method11;
                            }
                            ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr38)).intValue();
                            return objArr37;
                        }
                        java.lang.Object[] objArr40 = {new int[]{i20 == true ? 1 : 0}, new int[]{i20 == true ? 1 : 0}, null, null, new int[1]};
                        java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i13), 0, java.lang.Integer.valueOf(((((~((-380006446) | (i20 == true ? 1 : 0))) | (~(921071743 | i22))) * (-406)) - 1265641580) + ((~((-270942245) | i22)) * (-406)) + (((~((i20 == true ? 1 : 0) | (-650129500))) | (~(i22 | 380006445))) * 406))};
                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj28 = obj27;
                        if (obj27 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 2712 - android.view.MotionEvent.axisFromString(""), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                            short s10 = $$a[41];
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            c(s10, (byte) s10, r2[52], objArr42);
                            java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method12);
                            obj28 = method12;
                        }
                        ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr41)).intValue();
                        return objArr40;
                    }
                    java.lang.Integer num8 = 0;
                    java.lang.Integer num9 = 269015277;
                    try {
                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                        a(null, null, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0084\u0093\u0085\u0084\u008b\u008a\u0097\u0090\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr43);
                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr43[0]).intern());
                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                        a(null, null, 127 - android.view.View.MeasureSpec.getMode(0), "\u0085\u0086\u008d\u009a\u0085\u0091\u008d\u0099\u008e\u008d\u0098\u0084\u0085\u0091", objArr44);
                        java.lang.String str8 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr44[0]).intern(), null).invoke(context, null);
                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                        a(null, null, 127 - (android.view.KeyEvent.getMaxKeyCode() >> 16), "\u0084\u0093\u0085\u0084\u008b\u008a\u0097\u0090\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr45);
                        java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr45[0]).intern());
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a(null, null, android.text.TextUtils.indexOf("", "") + 127, "\u008a\u0096\u008b\u009d\u008b\u008a\u0095\u0084\u008d\u008e\u0095\u009c\u0088\u0088\u009b\u0084\u0085\u0091", objArr46);
                        ?? invoke = cls14.getMethod(((java.lang.String) objArr46[0]).intern(), null).invoke(context, null);
                        int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str8);
                        if (indexOf > 0) {
                            java.lang.String str9 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                            if (str9.length() >= 16) {
                                int i24 = 0;
                                while (i24 <= str9.length() - 16) {
                                    java.lang.String str10 = str9;
                                    java.lang.Object[] objArr47 = {str9.substring(i24, i24 + 16), 931995};
                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj29 == null) {
                                        num = num9;
                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 28, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2593, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                        num3 = num6;
                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                        c(653, (byte) ($$a[23] + 1), r8[41], objArr48);
                                        java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                        obj4 = method13;
                                    } else {
                                        num = num9;
                                        num3 = num6;
                                        obj4 = obj29;
                                    }
                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr47)).longValue();
                                    long j11 = i20 == true ? 1L : 0L;
                                    java.lang.String str11 = intern4;
                                    r34 = -812853221;
                                    r34 = -812853221;
                                    long j12 = (471 * longValue5) + 191833359920L + (((~((~j11) | (-812853221))) | longValue5) * (-235)) + (((~((-812853221) | j11)) | longValue5) * (-470)) + (((~(j11 | longValue5 | (-812853221))) | (~((~longValue5) | 812853220))) * 235) + 444247304;
                                    int i25 = ~(i20 == true ? 1 : 0);
                                    int i26 = ~((-274737794) | (i20 == true ? 1 : 0));
                                    i17 = -86019;
                                    num2 = num8;
                                    if (((((int) (j12 >> 32)) & ((((((~((-1712050223) | i25)) | 1711964204) | i26) * (-252)) - 939491078) + (((~(i25 | (-86019))) | i26) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))) | (((int) j12) & ((((-277872681) | i25) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 762216765 + (((~(1868912023 | i25)) | (-1435828522)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))) == -725904754) {
                                        objArr2 = new java.lang.Object[]{new int[1], new int[1], null, r4, new int[1]};
                                        java.lang.String str12 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                        ((int[]) objArr2[0])[0] = i20 == true ? 1 : 0;
                                        ((int[]) objArr2[1])[0] = (i20 == true ? 1 : 0) ^ 20;
                                        java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((~((-685735123) | i25)) | (-344400823) | (~(685735122 | (i20 == true ? 1 : 0)))) * (-564)) + 269152824 + ((~((-335545125) | (i20 == true ? 1 : 0))) * 1128) + (((~((-344400823) | i25)) | (-1021280247)) * 564))};
                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj31 = obj30;
                                        if (obj30 == null) {
                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                            short s11 = $$a[41];
                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                            c(s11, (byte) s11, r5[52], objArr50);
                                            java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method14);
                                            obj31 = method14;
                                        }
                                        ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr49)).intValue();
                                        i14 = i20 == true ? 1 : 0;
                                        str2 = -1347122530;
                                        i15 = 1;
                                        c = 0;
                                        if (((int[]) objArr2[i15])[c] == i14) {
                                            return objArr2;
                                        }
                                        int[] iArr = new int[i15];
                                        int[] iArr2 = new int[i15];
                                        iArr[c] = i14;
                                        iArr2[c] = i14;
                                        java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[i15]};
                                        int i27 = ~i14;
                                        java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf((((-1030045813) | i27) * 1444) + 301326584 + (((~(409317406 | i14)) | (-1030090879) | (~(620818538 | i14))) * (-1444)) + 663734056)};
                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                        java.lang.Object obj33 = obj32;
                                        if (obj32 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            short s12 = $$a[41];
                                            java.lang.Object[] objArr53 = new java.lang.Object[1];
                                            c(s12, (byte) s12, r5[52], objArr53);
                                            java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method15);
                                            obj33 = method15;
                                        }
                                        ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr52)).intValue();
                                        if (((int[]) objArr51[1])[0] != i14) {
                                            return objArr51;
                                        }
                                        if ((i12 & 1) == 0) {
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            b(new int[]{-474788963, 1798003287, 1176963500, 1831761199, -221156554, -1867150815, 159581569, 739032204}, 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr54);
                                            try {
                                                java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                a(null, null, 128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0084\u0093\u0085\u0084\u008b\u008a\u0097\u0090\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr56);
                                                java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr56[0]).intern());
                                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                b(new int[]{-1881881556, 1688986134, -1789842145, 424544400, 734635369, 31381729, 2013643857, 1370237373}, 15 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr57);
                                                java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr57[0]).intern(), java.lang.String.class).invoke(context, objArr55);
                                                if (invoke2 != null) {
                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                    a(null, null, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0094\u0085\u0091\u008d\u008b\u008d£\u0083\u008e\u0095\u009c\u008a\u0098\u0085\u008e\u0095\u0087\u0085\u009e\u0090\u008b\u0095\u0086\u008f\u008d\u0090\u0088\u0088\u008d\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr58);
                                                    java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr58[0]).intern());
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    a(null, null, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0082\u008b\u0095\u0086\u008f\u009b\u0085\u0087\u0095\u0084\u008e\u009b\u0084\u0085\u0091", objArr59);
                                                    java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr59[0]).intern(), null).invoke(invoke2, null);
                                                    if (list != null) {
                                                        for (java.lang.Object obj34 : list) {
                                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                            a(null, null, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0085\u0086\u008d\u009a\u0084\u008b\u0085\u008b\u008a\u0088\u0086\u008a\u0097\u0090\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr60);
                                                            java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr60[0]).intern());
                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                            a(null, null, 127 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0085\u0086\u008d\u009a\u0085\u0091\u008d\u0099\u008e\u008d\u0098\u0084\u0085\u0091", objArr61);
                                                            java.lang.String str13 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr61[0]).intern(), null).invoke(obj34, null);
                                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                            a(null, null, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u0094\u0085\u0091\u008d\u008b\u008d£\u0083\u008e\u0095\u009c\u008a\u0098\u0085\u008e\u0095\u0087\u0085\u009e\u0090\u008b\u0095\u0086\u008f\u008d\u0090\u0088\u0088\u008d\u0090\u008f\u0095\u008a\u0094\u008f\u008b\u008d", objArr62);
                                                            java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr62[0]).intern());
                                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                            a(null, null, android.text.TextUtils.getOffsetAfter("", 0) + 127, "\u0088\u0088\u009b\u0094\u0085\u008b¥¤\u0085\u009c\u0095\u0096\u008a\u0094\u0098\u0082\u0095", objArr63);
                                                            if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr63[0]).intern(), java.lang.String.class).invoke(invoke2, str13)).booleanValue()) {
                                                                if (str13.length() >= 20) {
                                                                    int i28 = 0;
                                                                    for (int i29 = 20; i28 <= str13.length() - i29; i29 = 20) {
                                                                        java.lang.Object[] objArr64 = {str13.substring(i28, i28 + 20), 931995};
                                                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                        java.lang.Object obj36 = obj35;
                                                                        if (obj35 == null) {
                                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 28, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2594, (char) (android.os.Process.myTid() >> 22));
                                                                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                            c(653, (byte) ($$a[23] + 1), r7[41], objArr65);
                                                                            java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                            obj36 = method16;
                                                                        }
                                                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, objArr64)).longValue();
                                                                        long j13 = ~((~longValue6) | 84534551);
                                                                        long j14 = ~(i14 | 84534551);
                                                                        long j15 = ((-657) * longValue6) + 55708269109L + (((~(longValue6 | (-84534552))) | j13 | j14) * (-658)) + (658 * j13) + ((j13 | j14) * 658) + 1172565973;
                                                                        if (((((int) j15) & ((((~((-1351985793) | i27)) | (-1505755094) | (~(1371536261 | i14))) * (-68)) + 2065254977 + ((~((-134218833) | i27)) * (-68)) + (((~((-1371536262) | i27)) | (-1486204625)) * 68))) | (((int) (j15 >> 32)) & ((((~(2062110550 | i27)) | 795630334) * (-865)) + 1148500050 + ((~((-2062110551) | i14)) * 865) + (((~((-2062110551) | i27)) | (~(795630334 | i27))) * 865)))) == 1245577864) {
                                                                            objArr6 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 70}, null, null, new int[1]};
                                                                            int i30 = ~((-120647720) | i14);
                                                                            java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((~((-909488226) | i27)) | i30) * 1150) + 1407454992 + ((i30 | (~(120647719 | i27))) * (-575)) + (((~((-909488226) | i14)) | (~(909488225 | i27))) * 575))};
                                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                            java.lang.Object obj38 = obj37;
                                                                            if (obj37 == null) {
                                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.Color.red(0) + 2713, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                                                                                short s13 = $$a[41];
                                                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                                c(s13, (byte) s13, r4[52], objArr67);
                                                                                java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method17);
                                                                                obj38 = method17;
                                                                            }
                                                                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr66)).intValue();
                                                                            c4 = 0;
                                                                            ((int[]) objArr6[4])[0] = intValue2;
                                                                            if (((int[]) objArr6[1])[c4] != i14) {
                                                                                return objArr6;
                                                                            }
                                                                        } else {
                                                                            i28++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                java.lang.Object[] objArr68 = {new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                                java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf((((555828480 | r1) * (-814)) - 682985652) + (((~(239254244 | i14)) | (~((-790881701) | i27)) | 4201024) * 407) + (((~((-239254245) | i14)) | 4201024 | (~(790881700 | i14))) * 407))};
                                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                java.lang.Object obj40 = obj39;
                                                if (obj39 == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 50, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                    short s14 = $$a[41];
                                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                    c(s14, (byte) s14, r4[52], objArr70);
                                                    java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method18);
                                                    obj40 = method18;
                                                }
                                                int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr69)).intValue();
                                                c4 = 0;
                                                ((int[]) objArr68[4])[0] = intValue3;
                                                objArr6 = objArr68;
                                                if (((int[]) objArr6[1])[c4] != i14) {
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        }
                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                        b(new int[]{-1936280840, 1095690901, -1752079883, 369415044, -1209260551, -1844251280}, 12 - (android.os.Process.myPid() >> 22), objArr71);
                                        java.lang.Object[] objArr72 = {((java.lang.String) objArr71[0]).intern()};
                                        java.lang.Integer num10 = num3;
                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                        java.lang.Object obj42 = obj41;
                                        if (obj41 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('T' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3161, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33098));
                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                            c(35, (short) 34, $$a[52], objArr73);
                                            java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr73[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, method19);
                                            obj42 = method19;
                                        }
                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, objArr72)).longValue();
                                        long j16 = i14;
                                        long j17 = ~j16;
                                        long j18 = (471 * longValue7) + 39176588820L + (((~(j17 | (-166002496))) | longValue7) * (-235)) + (((~((-166002496) | j16)) | longValue7) * (-470)) + (((~((~longValue7) | 166002495)) | (~(longValue7 | (-166002496) | j16))) * 235) + 741468243;
                                        if (((((int) (j18 >> 32)) & (((((~(1799141290 | i14)) | (-2134701995)) * 1504) - 1320242614) + ((~((-335560705) | i14)) * (-1504)) + 713732096)) | (((int) j18) & ((((1871813025 | i14) * 140) - 967916371) + (((~(1871813025 | i27)) | 272891924) * (-280)) + (((~(985927860 | i27)) | 1158777089 | (~((-272891925) | i14))) * 140)))) != 0) {
                                            objArr3 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 50}, null, null, new int[1]};
                                            java.lang.Object[] objArr74 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((((~((-292919885) | i14)) | 24183308) | r1) * (-470)) - 488611184) + (((~(1005952636 | i27)) | (~((-268736577) | i14))) * 470))};
                                            java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            java.lang.Object obj44 = obj43;
                                            if (obj43 == null) {
                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                short s15 = $$a[41];
                                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                c(s15, (byte) s15, r4[52], objArr75);
                                                java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method20);
                                                obj44 = method20;
                                            }
                                            int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr74)).intValue();
                                            c2 = 0;
                                            ((int[]) objArr3[4])[0] = intValue4;
                                        } else {
                                            objArr3 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                            java.lang.Object[] objArr76 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf((((~((-387203960) | i27)) | 642931985) * (-90)) + 141613168 + (((~((-387203960) | i14)) | (-928407416)) * (-45)) + (((~((-642931986) | i14)) | (-387203960) | (~(642931985 | i27))) * 45))};
                                            java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            java.lang.Object obj46 = obj45;
                                            if (obj45 == null) {
                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                                                short s16 = $$a[41];
                                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                c(s16, (byte) s16, r5[52], objArr77);
                                                java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr77[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method21);
                                                obj46 = method21;
                                            }
                                            c2 = 0;
                                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr76)).intValue();
                                        }
                                        if (((int[]) objArr3[1])[c2] != i14) {
                                            return objArr3;
                                        }
                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                        a(null, null, 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0085\u008e\u008d\u0088\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr78);
                                        java.lang.Object[] objArr79 = {((java.lang.String) objArr78[c2]).intern()};
                                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                        java.lang.Object obj48 = obj47;
                                        if (obj47 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getCapsMode("", 0, 0), android.graphics.Color.rgb(0, 0, 0) + 16780377, (char) (33100 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                            c(35, (short) 34, $$a[52], objArr80);
                                            java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr80[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, method22);
                                            obj48 = method22;
                                        }
                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr79)).longValue();
                                        long j19 = ~longValue8;
                                        java.lang.String str14 = str2;
                                        long j20 = ~(j16 | 337886059);
                                        long j21 = (881 * longValue8) + 297677617979L + (((~(j19 | (-337886060))) | (~(j16 | (-337886060))) | (~(j19 | j16))) * (-880)) + (((~((-337886060) | j17)) | longValue8 | j20) * (-880)) + (j20 * 880) + 569584679;
                                        if (((((int) j21) & (((((~(i27 | (-1775815690))) | (~((-1081925197) | i11))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1192800469) + (((~(i27 | (-2363973))) | (~((-696254466) | i11))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (j21 >> 32)) & ((((~((-88100865) | i11)) | (-2146434526)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1870240032 + ((~(i27 | (-88100865))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) != 0) {
                                            objArr4 = new java.lang.Object[]{new int[]{i11}, new int[]{i11 ^ 60}, null, null, new int[1]};
                                            int i31 = (~((-206323882) | i11)) | 540809;
                                            java.lang.Object[] objArr81 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((i31 * 992) + 1183815944 + ((i31 | (~(i27 | 1029595135))) * (-496)) + ((823812063 | i11) * 496))};
                                            str3 = str14;
                                            java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj50 = obj49;
                                            if (obj49 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, android.view.View.resolveSize(0, 0) + 2713, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                                short s17 = $$a[41];
                                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                c(s17, (byte) s17, r3[52], objArr82);
                                                java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr82[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method23);
                                                obj50 = method23;
                                            }
                                            int intValue5 = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr81)).intValue();
                                            i16 = 0;
                                            ((int[]) objArr4[4])[0] = intValue5;
                                        } else {
                                            str3 = str14;
                                            objArr4 = new java.lang.Object[]{new int[]{i11}, new int[]{i11}, null, null, new int[1]};
                                            java.lang.Object[] objArr83 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf((((~(i27 | (-816724749))) | (~(213411196 | i11))) * com.visa.cbp.getCertUsage.getODAData) + 1990186373 + (((~((-816724749) | i11)) | (~(i27 | 213411196))) * com.visa.cbp.getCertUsage.getODAData))};
                                            java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj52 = obj51;
                                            if (obj51 == null) {
                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(""), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                short s18 = $$a[41];
                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                c(s18, (byte) s18, r4[52], objArr84);
                                                java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr84[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method24);
                                                obj52 = method24;
                                            }
                                            i16 = 0;
                                            ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr83)).intValue();
                                        }
                                        if (((int[]) objArr4[1])[i16] != i11) {
                                            return objArr4;
                                        }
                                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                                        a(null, null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u008d\u0084\u008d\u008f\u008c\u0082\u0096\u0087\u0081\u008f\u0095\u008a\u0094\u008f\u008b\u008d\u0090\u0093\u008a\u0092\u0091\u0090\u0086\u008a\u008e\u0081\u008d\u0084\u008d\u008f\u0081\u008d\u0084\u008d\u008f\u0081", objArr85);
                                        java.lang.Object[] objArr86 = {((java.lang.String) objArr85[i16]).intern()};
                                        java.lang.Integer num11 = num;
                                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                        java.lang.Object obj54 = obj53;
                                        if (obj53 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.drawable.Drawable.resolveOpacity(i16, i16), android.text.TextUtils.indexOf("", "", i16, i16) + 3161, (char) (33099 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                            short s19 = (short) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                            byte[] bArr3 = $$a;
                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                            c(s19, bArr3[12], bArr3[54], objArr87);
                                            java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method25);
                                            obj54 = method25;
                                        }
                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, objArr86)).longValue();
                                        long j22 = ~(712007983 | j16);
                                        long j23 = ~longValue9;
                                        long j24 = (((-139) * longValue9) - 100393125744L) + (((~(longValue9 | 712007983)) | j22) * (-280)) + (((~(j23 | j16)) | j22) * 140) + (((~(longValue9 | 712007983 | j17)) | (~(712007983 | j23 | j16)) | (~(j23 | j17 | (-712007984)))) * 140) + 1707442887;
                                        if (((((int) j24) & (((((~((-805448361) | i11)) | (~(2052292525 | i11))) * 69) - 1413376850) + (((~((-806584238) | i11)) | 1135877 | (~(2051156648 | i11))) * (-69)) + 54525952)) | (((int) (j24 >> 32)) & ((((~((-608444931) | i11)) | 16875560) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1684273528 + ((~(i27 | (-608444931))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) != 0) {
                                            objArr5 = new java.lang.Object[]{new int[]{i11}, new int[]{i11 ^ 80}, null, null, new int[1]};
                                            int i32 = ~(634251056 | i11);
                                            java.lang.Object[] objArr88 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((~(i27 | (-92840209))) | (~(395884888 | i11))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1633780168 + (((~(i27 | (-395884889))) | i32) * (-1040)) + ((i32 | (~(i27 | (-634251057))) | 303044680) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                            java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj56 = obj55;
                                            if (obj55 == null) {
                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.os.Process.myTid() >> 22));
                                                short s20 = $$a[41];
                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                c(s20, (byte) s20, r3[52], objArr89);
                                                java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method26);
                                                obj56 = method26;
                                            }
                                            int intValue6 = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr88)).intValue();
                                            c3 = 0;
                                            ((int[]) objArr5[4])[0] = intValue6;
                                        } else {
                                            objArr5 = new java.lang.Object[]{new int[]{i11}, new int[]{i11}, null, null, new int[1]};
                                            java.lang.Object[] objArr90 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf(((~(706883176 | i11)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 356698188 + (((~(i27 | 706883176)) | 33563168) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj58 = obj57;
                                            if (obj57 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                short s21 = $$a[41];
                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                c(s21, (byte) s21, r4[52], objArr91);
                                                java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr91[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method27);
                                                obj58 = method27;
                                            }
                                            c3 = 0;
                                            ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr90)).intValue();
                                        }
                                        if (((int[]) objArr5[1])[c3] != i11) {
                                            return objArr5;
                                        }
                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                        b(new int[]{2059729749, 1207044025, -1737953464, 366619500, 1176725585, -1575233443, 261946170, 1715388906, -588249357, 1155888874, -1110490064, -888296135, -1431737772, 1438234558, -1268682705, -1843617696, 1642489335, -1675419413, -1778563041, -1330177590, -664818114, 287909540}, 42 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr92);
                                        java.lang.Object[] objArr93 = {((java.lang.String) objArr92[0]).intern()};
                                        java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                        java.lang.Object obj60 = obj59;
                                        if (obj59 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777252, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3161, (char) (33098 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                            short s22 = (short) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                            byte[] bArr4 = $$a;
                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                            c(s22, bArr4[12], bArr4[54], objArr94);
                                            java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method28);
                                            obj60 = method28;
                                        }
                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj60).invoke(null, objArr93)).longValue();
                                        long j25 = ~longValue10;
                                        long j26 = ~(131846423 | j16);
                                        long j27 = ~((-131846424) | longValue10);
                                        java.lang.String str15 = str3;
                                        long j28 = 863588480 + ((408 * longValue10) - 107191141899L) + (((~(j25 | 131846423)) | j26) * (-814)) + (((~(j25 | j17)) | j27 | j26) * 407) + (((~(longValue10 | j16)) | (~((-131846424) | j16)) | j27) * 407);
                                        if (((((int) j28) & (((((~(i27 | (-1785238189))) | 1782612652) * (-160)) - 1811742219) + (((~(i27 | (-348011779))) | (-1785238189)) * 160))) | (((int) (j28 >> 32)) & (((((~(i11 | (-1918024840))) | 212353624) * (-502)) - 1239303230) + ((~(i27 | (-268444805))) * (-502)) + (((~(i11 | 480798428)) | (-1918024840)) * 502)))) == 0) {
                                            java.lang.Object[] objArr95 = {new int[]{i11}, new int[]{i11}, null, null, new int[1]};
                                            java.lang.Object[] objArr96 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf(((i27 | (-33624901)) * 494) + 1118099004 + (((~(i27 | 498920634)) | (-34955125)) * 494))};
                                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str15);
                                            java.lang.Object obj62 = obj61;
                                            if (obj61 == null) {
                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                short s23 = $$a[41];
                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                c(s23, (byte) s23, r4[52], objArr97);
                                                java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str15, method29);
                                                obj62 = method29;
                                            }
                                            ((int[]) objArr95[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr96)).intValue();
                                            return objArr95;
                                        }
                                        java.lang.Object[] objArr98 = {new int[]{i11}, new int[]{i11 ^ 90}, null, null, new int[1]};
                                        java.lang.Object[] objArr99 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((((~r1) | 23675073) * (-828)) - 715794328) + ((i27 | 1006460871) * (-828))) - 125946592)};
                                        java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str15);
                                        java.lang.Object obj64 = obj63;
                                        if (obj63 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                            short s24 = $$a[41];
                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                            c(s24, (byte) s24, r4[52], objArr100);
                                            java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr100[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str15, method30);
                                            obj64 = method30;
                                        }
                                        ((int[]) objArr98[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj64).invoke(null, objArr99)).intValue();
                                        return objArr98;
                                    }
                                    i24++;
                                    intern4 = str11;
                                    str9 = str10;
                                    num6 = num3;
                                    num9 = num;
                                    num8 = num2;
                                }
                            }
                            num = num9;
                            num2 = num8;
                            num3 = num6;
                            java.lang.String str16 = intern4;
                            java.lang.String str17 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                            int i33 = 6;
                            if (str17.length() >= 6) {
                                int i34 = 0;
                                invoke = invoke;
                                while (i34 <= str17.length() - i33) {
                                    java.lang.Object[] objArr101 = {str17.substring(i34, i34 + 6), 931995};
                                    java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    java.lang.Object obj66 = obj65;
                                    if (obj65 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29, 2594 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.graphics.Color.alpha(0));
                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                        c(653, (byte) ($$a[23] + 1), r8[41], objArr102);
                                        java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr102[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                        obj66 = method31;
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr101)).longValue();
                                    long j29 = ~longValue11;
                                    java.lang.String str18 = str16;
                                    long j30 = i20 == true ? 1L : 0L;
                                    int i35 = indexOf;
                                    i17 = i34;
                                    long j31 = ~j30;
                                    java.lang.Object obj67 = invoke;
                                    long j32 = (~(j29 | j31)) | (~(j29 | (-467060542))) | (~((-467060542) | j31));
                                    long j33 = (591 * longValue11) + 275098659238L + (((~(longValue11 | 467060541 | j30)) | j32) * 590) + (j32 * (-1180)) + (((~(j31 | longValue11)) | (~(467060541 | j31))) * 590) + 1724161066;
                                    int i36 = ~(i20 == true ? 1 : 0);
                                    if (((((int) (j33 >> 32)) & ((((~((-130049146) | (i20 == true ? 1 : 0))) | (-1307177266)) * (-318)) + 772639002 + (((~((-1307177266) | (i20 == true ? 1 : 0))) | (~(1340732793 | i36))) * 318) + (((~((-1210683649) | i36)) | (~(1340732793 | (i20 == true ? 1 : 0)))) * 318))) | (((int) j33) & ((((~((-1621952533) | (i20 == true ? 1 : 0))) | (-1235788354)) * (-318)) + 1103898223 + (((~((-1235788354) | (i20 == true ? 1 : 0))) | (~(1772989013 | i36))) * 318) + (((~((-151036482) | i36)) | (~(1772989013 | (i20 == true ? 1 : 0)))) * 318)))) == -2096167706) {
                                        objArr2 = new java.lang.Object[]{new int[1], new int[1], null, r5, new int[1]};
                                        java.lang.String str19 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj67);
                                        ((int[]) objArr2[0])[0] = i20 == true ? 1 : 0;
                                        ((int[]) objArr2[1])[0] = (i20 == true ? 1 : 0) ^ 20;
                                        java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((((~((-104164399) | (i20 == true ? 1 : 0))) | (~(925971546 | i36))) | r5) * (-516)) - 2115557416) + (((~(i36 | (-822087761))) | (~((-103883787) | (i20 == true ? 1 : 0)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((822087760 | (~(104164398 | i36))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                        java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj69 = obj68;
                                        if (obj68 == null) {
                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            short s25 = $$a[41];
                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                            c(s25, (byte) s25, r4[52], objArr104);
                                            java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method32);
                                            obj69 = method32;
                                        }
                                        ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj69).invoke(null, objArr103)).intValue();
                                        i14 = i20 == true ? 1 : 0;
                                        str2 = -1347122530;
                                        i15 = 1;
                                        c = 0;
                                        if (((int[]) objArr2[i15])[c] == i14) {
                                        }
                                    } else {
                                        i34 = i17 + 1;
                                        invoke = obj67;
                                        indexOf = i35;
                                        str16 = str18;
                                        i33 = 6;
                                        r34 = obj67;
                                    }
                                }
                            }
                            int i37 = indexOf;
                            java.lang.String str20 = invoke;
                            java.lang.String str21 = str16;
                            java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(str20)).substring(0, i37);
                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                            a(null, null, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0081", objArr105);
                            java.lang.String[] split = substring.split(((java.lang.String) objArr105[0]).intern());
                            int length = split.length;
                            int i38 = 0;
                            ?? r2 = i20;
                            ?? r10 = intern3;
                            java.lang.String str22 = -1347122530;
                            ?? r29 = i37;
                            int i39 = r34;
                            while (i38 < length) {
                                java.lang.String str23 = split[i38];
                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                b(new int[]{1706159245, 1978935164}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, objArr106);
                                java.lang.String str24 = null;
                                if (str23.split(((java.lang.String) objArr106[0]).intern()).length > 1) {
                                    synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1581, (char) android.view.KeyEvent.keyCodeFromString("")))) {
                                        try {
                                            try {
                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                a(null, null, android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0082\u0085\u0091\u008d\u0099\u008e\u008d\u0088\u009f\u0084\u0082\u0095\u009c\u009f\u0086\u0088", objArr107);
                                                intern = ((java.lang.String) objArr107[0]).intern();
                                                try {
                                                    runtime = java.lang.Runtime.getRuntime();
                                                    r29 = split;
                                                } catch (java.lang.Exception unused) {
                                                }
                                            } catch (java.io.IOException unused2) {
                                                r29 = split;
                                            }
                                        } catch (java.io.IOException unused3) {
                                        }
                                        try {
                                            try {
                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                b(new int[]{132439794, 525860622}, 2 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr108);
                                                exec = runtime.exec(((java.lang.String) objArr108[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                            } catch (java.lang.Exception unused4) {
                                            }
                                            try {
                                                java.lang.Object[] objArr109 = {exec.getInputStream()};
                                                java.lang.Object obj70 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                if (obj70 == null) {
                                                    try {
                                                        i17 = length;
                                                        try {
                                                            java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 44, 1506 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                            obj = declaredConstructor;
                                                        } catch (java.lang.Throwable th5) {
                                                            th = th5;
                                                            th = th;
                                                            cause = th.getCause();
                                                            if (cause == null) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th6) {
                                                        th = th6;
                                                    }
                                                } else {
                                                    i17 = length;
                                                    obj = obj70;
                                                }
                                                try {
                                                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(objArr109);
                                                    try {
                                                        try {
                                                            java.lang.Object[] objArr110 = {exec.getErrorStream()};
                                                            java.lang.Object obj71 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                            if (obj71 == null) {
                                                                try {
                                                                    i39 = i38;
                                                                    try {
                                                                        java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.MotionEvent.axisFromString(""), android.widget.ExpandableListView.getPackedPositionType(0L) + 1507, (char) android.view.View.resolveSize(0, 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                                        obj2 = declaredConstructor2;
                                                                    } catch (java.lang.Throwable th7) {
                                                                        th = th7;
                                                                        th2 = th;
                                                                        cause2 = th2.getCause();
                                                                        if (cause2 == null) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th8) {
                                                                    th = th8;
                                                                }
                                                            } else {
                                                                i39 = i38;
                                                                obj2 = obj71;
                                                            }
                                                            try {
                                                                java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj2).newInstance(objArr110);
                                                                try {
                                                                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                                    try {
                                                                        java.lang.Class<?> cls39 = java.lang.Class.forName(str21);
                                                                        str5 = str22;
                                                                        try {
                                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                            try {
                                                                                a(null, null, (android.os.Process.myTid() >> 22) + 127, "\u0084\u0094\u008d\u0084\u0082", objArr111);
                                                                                cls39.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance, null);
                                                                                try {
                                                                                    java.lang.Class<?> cls40 = java.lang.Class.forName(str21);
                                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                    a(null, null, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u0084\u0094\u008d\u0084\u0082", objArr112);
                                                                                    cls40.getMethod(((java.lang.String) objArr112[0]).intern(), null).invoke(newInstance2, null);
                                                                                    try {
                                                                                        try {
                                                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                            sb.append(intern);
                                                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                            obj3 = 0;
                                                                                            b(new int[]{-26743693, 1346117561}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr113);
                                                                                            sb.append(((java.lang.String) objArr113[0]).intern());
                                                                                            java.lang.String obj72 = sb.toString();
                                                                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                            b(new int[]{910221058, 1439300080, -1819883896, 448885077}, 6 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr114);
                                                                                            dataOutputStream.write(obj72.getBytes(((java.lang.String) objArr114[0]).intern()));
                                                                                            dataOutputStream.flush();
                                                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                            b(new int[]{1975181056, 1742371163, -26743693, 1346117561}, 5 - android.text.TextUtils.indexOf("", "", 0, 0), objArr115);
                                                                                            java.lang.String intern5 = ((java.lang.String) objArr115[0]).intern();
                                                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                            b(new int[]{910221058, 1439300080, -1819883896, 448885077}, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 5, objArr116);
                                                                                            dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr116[0]).intern()));
                                                                                            dataOutputStream.flush();
                                                                                            try {
                                                                                                long nanoTime = java.lang.System.nanoTime();
                                                                                                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                java.lang.String str25 = r10;
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        exec.exitValue();
                                                                                                        r2 = intern2;
                                                                                                        obj3 = str20;
                                                                                                        str4 = str25;
                                                                                                        break;
                                                                                                    } catch (java.lang.IllegalThreadStateException unused5) {
                                                                                                        if (nanos > 0) {
                                                                                                            try {
                                                                                                                str6 = intern2;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        java.lang.Object[] objArr117 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                        java.lang.Class<?> cls41 = java.lang.Class.forName(str21);
                                                                                                                        str7 = str20;
                                                                                                                        try {
                                                                                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                                                            str4 = str25;
                                                                                                                            try {
                                                                                                                                a(null, null, 126 - android.os.Process.getGidForName(""), "\u0088\u0085\u0085\u009c\u0082", objArr118);
                                                                                                                                cls41.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr117);
                                                                                                                            } catch (java.lang.Throwable th9) {
                                                                                                                                th = th9;
                                                                                                                                java.lang.Throwable th10 = th;
                                                                                                                                cause3 = th10.getCause();
                                                                                                                                if (cause3 == null) {
                                                                                                                                    throw cause3;
                                                                                                                                }
                                                                                                                                throw th10;
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th11) {
                                                                                                                            th = th11;
                                                                                                                            java.lang.Throwable th102 = th;
                                                                                                                            cause3 = th102.getCause();
                                                                                                                            if (cause3 == null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th12) {
                                                                                                                        th = th12;
                                                                                                                    }
                                                                                                                } catch (java.lang.InterruptedException e) {
                                                                                                                    e = e;
                                                                                                                    obj3 = str20;
                                                                                                                    str4 = str25;
                                                                                                                    throw e;
                                                                                                                } catch (java.lang.Throwable th13) {
                                                                                                                    th = th13;
                                                                                                                    obj3 = str20;
                                                                                                                    str4 = str25;
                                                                                                                    th3 = th;
                                                                                                                    try {
                                                                                                                        exec.destroy();
                                                                                                                        throw th3;
                                                                                                                    } catch (java.lang.Exception unused6) {
                                                                                                                        throw th3;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (java.lang.InterruptedException e2) {
                                                                                                                e = e2;
                                                                                                            } catch (java.lang.Throwable th14) {
                                                                                                                th = th14;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str6 = intern2;
                                                                                                            str7 = str20;
                                                                                                            str4 = str25;
                                                                                                        }
                                                                                                        try {
                                                                                                            nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                                            r2 = str6;
                                                                                                            obj3 = str7;
                                                                                                            if (nanos > 0) {
                                                                                                                intern2 = str6;
                                                                                                                str20 = str7;
                                                                                                                str25 = str4;
                                                                                                                obj3 = str7;
                                                                                                            }
                                                                                                        } catch (java.lang.InterruptedException e3) {
                                                                                                            e = e3;
                                                                                                            throw e;
                                                                                                        } catch (java.lang.Throwable th15) {
                                                                                                            th = th15;
                                                                                                            th3 = th;
                                                                                                            exec.destroy();
                                                                                                            throw th3;
                                                                                                        }
                                                                                                    } catch (java.lang.InterruptedException e4) {
                                                                                                        throw e4;
                                                                                                    } catch (java.lang.Throwable th16) {
                                                                                                        th3 = th16;
                                                                                                        exec.destroy();
                                                                                                        throw th3;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        dataOutputStream.close();
                                                                                                    } catch (java.io.IOException unused7) {
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            java.lang.Class<?> cls42 = java.lang.Class.forName(str21);
                                                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                                            a(null, null, 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u008b\u0095\u008a ", objArr119);
                                                                                                            cls42.getMethod(((java.lang.String) objArr119[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                                            try {
                                                                                                                java.lang.Class<?> cls43 = java.lang.Class.forName(str21);
                                                                                                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                                                a(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u008b\u0095\u008a ", objArr120);
                                                                                                                cls43.getMethod(((java.lang.String) objArr120[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        exec.destroy();
                                                                                                                    } catch (java.io.IOException unused8) {
                                                                                                                    }
                                                                                                                } catch (java.lang.Exception unused9) {
                                                                                                                }
                                                                                                                try {
                                                                                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, 1506 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                                                                    byte[] bArr5 = $$a;
                                                                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                                                    c((short) (bArr5[8] + 1), (byte) (-bArr5[7]), bArr5[41], objArr121);
                                                                                                                    sb2.append(cls44.getField((java.lang.String) objArr121[0]).get(newInstance).toString());
                                                                                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 1507 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                                                    c((short) (bArr5[8] + 1), (byte) (-bArr5[7]), bArr5[41], objArr122);
                                                                                                                    sb2.append(cls45.getField((java.lang.String) objArr122[0]).get(newInstance2).toString());
                                                                                                                    java.lang.String obj73 = sb2.toString();
                                                                                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                                                    b(new int[]{-26743693, 1346117561}, android.text.TextUtils.indexOf("", "") + 1, objArr123);
                                                                                                                    java.lang.String[] split2 = obj73.split(((java.lang.String) objArr123[0]).intern());
                                                                                                                    int length2 = split2.length;
                                                                                                                    int i40 = 0;
                                                                                                                    obj3 = obj3;
                                                                                                                    while (i40 < length2) {
                                                                                                                        java.lang.String str26 = split2[i40];
                                                                                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                                        a(null, null, 128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0090\u0085\u009c\u0091\u008a\u008a\u0091\u0090\u0086\u008a\u008e¢\u0085\u0091\u008d\u0099\u008e\u008d\u0088", objArr124);
                                                                                                                        if (!str26.startsWith(((java.lang.String) objArr124[0]).intern())) {
                                                                                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                                            b(new int[]{-810262118, -464059733, -387563634, 1856971357, 491880590, 1993835302, 1561454673, -738407521, -496319689, 677923783}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 21, objArr125);
                                                                                                                            if (str26.startsWith(((java.lang.String) objArr125[0]).intern())) {
                                                                                                                                continue;
                                                                                                                            } else {
                                                                                                                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                                                                a(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "¢\u0085\u0091\u008d\u0099\u008e\u008d\u0088", objArr126);
                                                                                                                                if (str26.startsWith(((java.lang.String) objArr126[0]).intern())) {
                                                                                                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                                                                    a(null, null, 126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "¢", objArr127);
                                                                                                                                    java.lang.String[] split3 = str26.split(((java.lang.String) objArr127[0]).intern());
                                                                                                                                    if (split3.length > 1 && split3[1].equalsIgnoreCase(str23)) {
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i40++;
                                                                                                                        str4 = str4;
                                                                                                                        obj3 = obj3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                    r10 = i11;
                                                                                                                    str20 = str5;
                                                                                                                    intern2 = obj3;
                                                                                                                    str24 = str4;
                                                                                                                } catch (java.lang.Exception unused10) {
                                                                                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                                                    b(new int[]{-1306844675, -309712668, 631456693, 1709513153, 1059985745, -791022789, 1532857274, -1298077714, -858108634, 1321590393, 1317713267, -1820138916, 912665850, 1002361316}, 27 - android.text.TextUtils.getOffsetBefore("", 0), objArr128);
                                                                                                                    throw new java.io.IOException(((java.lang.String) objArr128[0]).intern());
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th17) {
                                                                                                                java.lang.Throwable cause5 = th17.getCause();
                                                                                                                if (cause5 != null) {
                                                                                                                    throw cause5;
                                                                                                                }
                                                                                                                throw th17;
                                                                                                            }
                                                                                                        } catch (java.lang.InterruptedException e5) {
                                                                                                            e = e5;
                                                                                                            throw e;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th18) {
                                                                                                        java.lang.Throwable cause6 = th18.getCause();
                                                                                                        if (cause6 != null) {
                                                                                                            throw cause6;
                                                                                                        }
                                                                                                        throw th18;
                                                                                                    }
                                                                                                } catch (java.lang.InterruptedException e6) {
                                                                                                    e = e6;
                                                                                                    throw e;
                                                                                                } catch (java.lang.Throwable th19) {
                                                                                                    th = th19;
                                                                                                    th3 = th;
                                                                                                    exec.destroy();
                                                                                                    throw th3;
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e7) {
                                                                                                e = e7;
                                                                                            } catch (java.lang.Throwable th20) {
                                                                                                th = th20;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th21) {
                                                                                            th = th21;
                                                                                        }
                                                                                    } catch (java.io.IOException unused11) {
                                                                                        r2 = intern2;
                                                                                        intern2 = str20;
                                                                                        str24 = r10;
                                                                                        str20 = str5;
                                                                                        r10 = i11;
                                                                                    } catch (java.lang.Exception unused12) {
                                                                                    }
                                                                                } catch (java.lang.Throwable th22) {
                                                                                    java.lang.Throwable cause7 = th22.getCause();
                                                                                    if (cause7 != null) {
                                                                                        throw cause7;
                                                                                    }
                                                                                    throw th22;
                                                                                }
                                                                            } catch (java.lang.Throwable th23) {
                                                                                th = th23;
                                                                                java.lang.Throwable th24 = th;
                                                                                java.lang.Throwable cause8 = th24.getCause();
                                                                                if (cause8 != null) {
                                                                                    throw cause8;
                                                                                }
                                                                                throw th24;
                                                                            }
                                                                        } catch (java.lang.Throwable th25) {
                                                                            th = th25;
                                                                        }
                                                                    } catch (java.lang.Throwable th26) {
                                                                        th = th26;
                                                                    }
                                                                } catch (java.io.IOException unused13) {
                                                                    str24 = r10;
                                                                    r10 = r2;
                                                                    r2 = intern2;
                                                                    intern2 = str20;
                                                                    str20 = str22;
                                                                    i38 = i39 + 1;
                                                                    str22 = str20;
                                                                    split = r29;
                                                                    length = i17;
                                                                    str20 = intern2;
                                                                    intern2 = r2;
                                                                    r2 = r10;
                                                                    r10 = str24;
                                                                    r29 = r29;
                                                                    i39 = i39;
                                                                } catch (java.lang.Exception unused14) {
                                                                    java.lang.Object[] objArr1282 = new java.lang.Object[1];
                                                                    b(new int[]{-1306844675, -309712668, 631456693, 1709513153, 1059985745, -791022789, 1532857274, -1298077714, -858108634, 1321590393, 1317713267, -1820138916, 912665850, 1002361316}, 27 - android.text.TextUtils.getOffsetBefore("", 0), objArr1282);
                                                                    throw new java.io.IOException(((java.lang.String) objArr1282[0]).intern());
                                                                }
                                                            } catch (java.lang.Throwable th27) {
                                                                th = th27;
                                                                th2 = th;
                                                                cause2 = th2.getCause();
                                                                if (cause2 == null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (java.lang.Throwable th28) {
                                                            th = th28;
                                                        }
                                                    } catch (java.io.IOException unused15) {
                                                        i39 = i38;
                                                        str24 = r10;
                                                        r10 = r2;
                                                        r2 = intern2;
                                                        intern2 = str20;
                                                        str20 = str22;
                                                        i38 = i39 + 1;
                                                        str22 = str20;
                                                        split = r29;
                                                        length = i17;
                                                        str20 = intern2;
                                                        intern2 = r2;
                                                        r2 = r10;
                                                        r10 = str24;
                                                        r29 = r29;
                                                        i39 = i39;
                                                    } catch (java.lang.Exception unused16) {
                                                        java.lang.Object[] objArr12822 = new java.lang.Object[1];
                                                        b(new int[]{-1306844675, -309712668, 631456693, 1709513153, 1059985745, -791022789, 1532857274, -1298077714, -858108634, 1321590393, 1317713267, -1820138916, 912665850, 1002361316}, 27 - android.text.TextUtils.getOffsetBefore("", 0), objArr12822);
                                                        throw new java.io.IOException(((java.lang.String) objArr12822[0]).intern());
                                                    }
                                                } catch (java.lang.Throwable th29) {
                                                    th = th29;
                                                    th = th;
                                                    cause = th.getCause();
                                                    if (cause == null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th30) {
                                                th = th30;
                                            }
                                        } catch (java.io.IOException unused17) {
                                            i17 = length;
                                            i39 = i38;
                                            str24 = r10;
                                            r10 = r2;
                                            r2 = intern2;
                                            intern2 = str20;
                                            str20 = str22;
                                            i38 = i39 + 1;
                                            str22 = str20;
                                            split = r29;
                                            length = i17;
                                            str20 = intern2;
                                            intern2 = r2;
                                            r2 = r10;
                                            r10 = str24;
                                            r29 = r29;
                                            i39 = i39;
                                        } catch (java.lang.Exception unused18) {
                                            java.lang.Object[] objArr128222 = new java.lang.Object[1];
                                            b(new int[]{-1306844675, -309712668, 631456693, 1709513153, 1059985745, -791022789, 1532857274, -1298077714, -858108634, 1321590393, 1317713267, -1820138916, 912665850, 1002361316}, 27 - android.text.TextUtils.getOffsetBefore("", 0), objArr128222);
                                            throw new java.io.IOException(((java.lang.String) objArr128222[0]).intern());
                                        }
                                    }
                                    objArr2 = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                                    java.lang.String str27 = (java.lang.String) java.lang.Class.forName(r2).getField(str4).get(obj3);
                                    i14 = i11;
                                    ((int[]) objArr2[0])[0] = i14;
                                    ((int[]) objArr2[1])[0] = i14 ^ 20;
                                    int i41 = ~i14;
                                    int i42 = ~(1018404856 | i14);
                                    java.lang.Object[] objArr129 = {java.lang.Integer.valueOf(i13), 16, java.lang.Integer.valueOf((((((~((-11733913) | i41)) | 11731088) | i42) * (-252)) - 308597176) + (((~(i41 | (-2825))) | i42) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                    str2 = str5;
                                    java.lang.Object obj74 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj75 = obj74;
                                    if (obj74 == null) {
                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                        short s26 = $$a[41];
                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                        c(s26, (byte) s26, r3[52], objArr130);
                                        java.lang.reflect.Method method33 = cls46.getMethod((java.lang.String) objArr130[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method33);
                                        obj75 = method33;
                                    }
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj75).invoke(null, objArr129)).intValue();
                                    i15 = 1;
                                    c = 0;
                                    if (((int[]) objArr2[i15])[c] == i14) {
                                    }
                                } else {
                                    r29 = split;
                                    i17 = length;
                                    i39 = i38;
                                    str24 = r10;
                                    r10 = r2;
                                    r2 = intern2;
                                    intern2 = str20;
                                    str20 = str22;
                                }
                                i38 = i39 + 1;
                                str22 = str20;
                                split = r29;
                                length = i17;
                                str20 = intern2;
                                intern2 = r2;
                                r2 = r10;
                                r10 = str24;
                                r29 = r29;
                                i39 = i39;
                            }
                            i14 = r2;
                            str = str22;
                        } else {
                            i14 = i20 == true ? 1 : 0;
                            num = 269015277;
                            num2 = null;
                            num3 = num6;
                            str = -1347122530;
                        }
                        str2 = str;
                        java.lang.Object[] objArr131 = {new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                        int i43 = ~i14;
                        int i44 = ~(922446855 | i43);
                        java.lang.Object[] objArr132 = {java.lang.Integer.valueOf(i13), num2, java.lang.Integer.valueOf((((~(i43 | (-922446856))) | (~((-107689090) | i43)) | 107684865 | (~(922451079 | i14))) * (-84)) + 1662209320 + (((~((-922446856) | i14)) | 107689089 | i44) * (-84)) + ((i44 | (-922451080)) * 84))};
                        java.lang.Object obj76 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                        java.lang.Object obj77 = obj76;
                        if (obj76 == null) {
                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            short s27 = $$a[41];
                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                            c(s27, (byte) s27, r3[52], objArr133);
                            java.lang.reflect.Method method34 = cls47.getMethod((java.lang.String) objArr133[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method34);
                            obj77 = method34;
                        }
                        c = 0;
                        ((int[]) objArr131[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj77).invoke(null, objArr132)).intValue();
                        objArr2 = objArr131;
                        i15 = 1;
                        if (((int[]) objArr2[i15])[c] == i14) {
                        }
                    } catch (java.lang.Throwable th31) {
                        java.lang.Throwable cause9 = th31.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th31;
                    }
                } catch (java.lang.Throwable th32) {
                    java.lang.Throwable cause10 = th32.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th32;
                }
            }

            static void init$1() {
                $$d = new byte[]{74, 86, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -59};
                $$e = 56;
            }

            static void init$0() {
                $$a = new byte[]{89, 43, 98, -67, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5};
                $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
            }

            @Override // com.payair.hce.JsonRequest
            public final byte[] getAid() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, -798313039, 798313039, java.lang.System.identityHashCode(this));
            }
        };
        int i11 = DigitizedCardProfile + 103;
        AlternateContactlessPaymentDataJson = i11 % 128;
        if (i11 % 2 == 0) {
            return jsonRequest;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.JsonRequest values(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson) {
        return (com.payair.hce.JsonRequest) DigitizedCardProfile(new java.lang.Object[]{alternateContactlessPaymentDataJson}, -1885591455, 1885591458, (int) java.lang.System.currentTimeMillis());
    }

    public static com.payair.hce.initializeVisaPaymentSdk writeReplace(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson) {
        return (com.payair.hce.initializeVisaPaymentSdk) DigitizedCardProfile(new java.lang.Object[]{iccPrivateKeyCrtComponentsJson}, 1899222779, -1899222779, (int) java.lang.System.currentTimeMillis());
    }

    public static java.util.List<com.payair.hce.setNetworkError> writeReplace(com.mastercard.mpsdk.card.profile.RecordsJson[] recordsJsonArr) {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{recordsJsonArr}, 1279096886, -1279096884, (int) java.lang.System.currentTimeMillis());
    }

    public static com.payair.hce.checkForSuccess writeReplace(com.mastercard.mpsdk.card.profile.DigitizedCardProfile digitizedCardProfile, com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings, com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.onNewToken onnewtoken) {
        return (com.payair.hce.checkForSuccess) DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfile, checkautomatictimesettings, issessionavailable, onnewtoken}, -1449685080, 1449685081, (int) java.lang.System.currentTimeMillis());
    }
}
