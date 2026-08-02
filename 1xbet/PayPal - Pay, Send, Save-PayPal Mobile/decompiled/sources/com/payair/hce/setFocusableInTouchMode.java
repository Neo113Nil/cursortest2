package com.payair.hce;

/* loaded from: classes10.dex */
final class setFocusableInTouchMode {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 934) + (i2 * (-932)) + (((~((~i) | i5)) | i4) * (-933)) + (((~(i5 | i4)) | (~(i4 | i))) * 933) + ((~(i | i2)) * 933);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 2) {
            final com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json = (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json) objArr[0];
            final com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) objArr[1];
            final com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[2];
            com.payair.hce.checkForSuccess checkforsuccess = new com.payair.hce.checkForSuccess() { // from class: com.payair.hce.setFocusableInTouchMode.5
                private static int AlternateContactlessPaymentDataJson = 1;
                private static int DigitizedCardProfile;

                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i7, int i8, int i9) {
                    int i10 = ~i7;
                    int i11 = ~i8;
                    int i12 = ~i9;
                    switch ((i7 * (-183)) + (i8 * 185) + ((i8 | i10) * (-368)) + ((i7 | i11 | i12) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i7 | i12)) | (~(i10 | i11)) | (~(i8 | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) {
                        case 1:
                            com.payair.hce.setDetailedMessage setdetailedmessage = new com.payair.hce.setDetailedMessage() { // from class: com.payair.hce.setFocusableInTouchMode.5.4
                                private static int valueOf = 1;
                                private static int writeReplace;

                                public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3, int i13, int i14, int i15) {
                                    int i16 = ~i13;
                                    int i17 = ~i15;
                                    int i18 = (i13 * (-563)) + (i14 * 565) + (((~((~i14) | i17)) | i16 | (~(i14 | i15))) * (-564)) + ((~(i15 | i16 | i14)) * 1128) + (((~(i13 | i14)) | (~(i16 | i17))) * 564);
                                    if (i18 == 1) {
                                        int i19 = writeReplace;
                                        valueOf = (i19 + 31) % 128;
                                        int i20 = i19 & 5;
                                        int i21 = (i19 ^ 5) | i20;
                                        valueOf = ((i20 ^ i21) + ((i21 & i20) << 1)) % 128;
                                        return 30;
                                    }
                                    if (i18 == 2) {
                                        return values(objArr3);
                                    }
                                    if (i18 == 3) {
                                        return valueOf(objArr3);
                                    }
                                    if (i18 == 4) {
                                        return DigitizedCardProfile(objArr3);
                                    }
                                    int i22 = writeReplace;
                                    int i23 = i22 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                    int i24 = i23 + ((i22 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i23);
                                    valueOf = i24 % 128;
                                    int i25 = i24 % 2 == 0 ? 93 : 30;
                                    int i26 = i22 & 27;
                                    int i27 = ((i22 ^ 27) | i26) << 1;
                                    int i28 = -((i22 | 27) & (~i26));
                                    valueOf = ((i27 & i28) + (i28 | i27)) % 128;
                                    return java.lang.Integer.valueOf(i25);
                                }

                                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                    int i13 = valueOf;
                                    int i14 = i13 & 23;
                                    int i15 = -(-((i13 ^ 23) | i14));
                                    writeReplace = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                                    com.payair.hce.setOrderRef setorderref = com.payair.hce.setOrderRef.writeReplace;
                                    int i16 = valueOf;
                                    int i17 = i16 & 83;
                                    int i18 = (i17 - (~(-(-((i16 ^ 83) | i17))))) - 1;
                                    writeReplace = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        return setorderref;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5.AnonymousClass4) objArr3[0];
                                    int i13 = writeReplace;
                                    int i14 = (((i13 | 46) << 1) - (i13 ^ 46)) - 1;
                                    valueOf = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.accountType;
                                        throw null;
                                    }
                                    if (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.accountType == null) {
                                        int i15 = writeReplace;
                                        int i16 = (((i15 | 106) << 1) - (i15 ^ 106)) - 1;
                                        valueOf = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            return com.payair.hce.getjSONObject.valueOf;
                                        }
                                        com.payair.hce.getjSONObject getjsonobject = com.payair.hce.getjSONObject.valueOf;
                                        throw new java.lang.ArithmeticException();
                                    }
                                    java.lang.String str2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.accountType;
                                    int hashCode = str2.hashCode();
                                    if (hashCode == 64920780) {
                                        if (str2.equals("DEBIT")) {
                                            int i17 = writeReplace;
                                            int i18 = (-2) - (~((i17 & 4) + (i17 | 4)));
                                            valueOf = i18 % 128;
                                            r0 = i18 % 2 != 0 ? (char) 1 : (char) 0;
                                            valueOf = (i17 + 125) % 128;
                                        }
                                        r0 = 65535;
                                    } else if (hashCode != 433141802) {
                                        if (hashCode == 1996005113 && str2.equals("CREDIT")) {
                                            int i19 = valueOf;
                                            int i20 = i19 & 113;
                                            int i21 = (~i20) & (i19 | 113);
                                            int i22 = -(-(i20 << 1));
                                            writeReplace = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
                                            writeReplace = (i19 + 113) % 128;
                                        }
                                        r0 = 65535;
                                    } else {
                                        if (str2.equals("UNKNOWN")) {
                                            int i23 = writeReplace;
                                            int i24 = i23 & 65;
                                            valueOf = (((((i23 ^ 65) | i24) << 1) - (~(-((~i24) & (i23 | 65))))) - 1) % 128;
                                            int i25 = i23 & 117;
                                            valueOf = ((i25 - (~(-(-((i23 ^ 117) | i25))))) - 1) % 128;
                                            r0 = 2;
                                        }
                                        r0 = 65535;
                                    }
                                    if (r0 == 0) {
                                        com.payair.hce.getjSONObject getjsonobject2 = com.payair.hce.getjSONObject.values;
                                        int i26 = valueOf;
                                        writeReplace = (((i26 & (-4)) | ((~i26) & 3)) + ((i26 & 3) << 1)) % 128;
                                        return getjsonobject2;
                                    }
                                    if (r0 == 1) {
                                        com.payair.hce.getjSONObject getjsonobject3 = com.payair.hce.getjSONObject.AlternateContactlessPaymentDataJson;
                                        int i27 = writeReplace;
                                        int i28 = (i27 & 81) + (i27 | 81);
                                        valueOf = i28 % 128;
                                        if (i28 % 2 != 0) {
                                            return getjsonobject3;
                                        }
                                        throw null;
                                    }
                                    if (r0 == 2) {
                                        com.payair.hce.getjSONObject getjsonobject4 = com.payair.hce.getjSONObject.valueOf;
                                        valueOf = (writeReplace + 11) % 128;
                                        return getjsonobject4;
                                    }
                                    com.payair.hce.getjSONObject getjsonobject5 = com.payair.hce.getjSONObject.valueOf;
                                    int i29 = valueOf;
                                    int i30 = ((i29 ^ 91) | (i29 & 91)) << 1;
                                    int i31 = -((i29 & (-92)) | ((~i29) & 91));
                                    int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                                    writeReplace = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        return getjsonobject5;
                                    }
                                    throw null;
                                }

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                    char c = 0;
                                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5.AnonymousClass4) objArr3[0];
                                    valueOf = (writeReplace + 1) % 128;
                                    if (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.productType == null) {
                                        int i13 = valueOf;
                                        int i14 = ((i13 & (-38)) | ((~i13) & 37)) + ((i13 & 37) << 1);
                                        writeReplace = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            com.payair.hce.setjSONObject setjsonobject = com.payair.hce.setjSONObject.values;
                                            throw null;
                                        }
                                        com.payair.hce.setjSONObject setjsonobject2 = com.payair.hce.setjSONObject.values;
                                        int i15 = valueOf;
                                        int i16 = (i15 | 99) << 1;
                                        int i17 = -(i15 ^ 99);
                                        writeReplace = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                                        return setjsonobject2;
                                    }
                                    java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.productType;
                                    switch (str.hashCode()) {
                                        case 64920780:
                                            if (str.equals("DEBIT")) {
                                                int i18 = valueOf;
                                                int i19 = (((i18 & 112) + (i18 | 112)) - 1) % 128;
                                                writeReplace = i19;
                                                int i20 = i19 & 11;
                                                valueOf = (i20 + ((i19 ^ 11) | i20)) % 128;
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 399611855:
                                            if (str.equals("PREPAID")) {
                                                int i21 = valueOf;
                                                int i22 = ((i21 & 85) - (~(i21 | 85))) - 1;
                                                writeReplace = i22 % 128;
                                                c = i22 % 2 != 0 ? (char) 5 : (char) 3;
                                                writeReplace = ((-2) - (~(((i21 | 118) << 1) - (i21 ^ 118)))) % 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                                            if (str.equals("UNKNOWN")) {
                                                int i23 = valueOf;
                                                int i24 = ((i23 & (-100)) | ((~i23) & 99)) + ((i23 & 99) << 1);
                                                int i25 = i24 % 128;
                                                writeReplace = i25;
                                                c = i24 % 2 != 0 ? (char) 2 : (char) 4;
                                                valueOf = (i25 + 31) % 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1387439946:
                                            if (str.equals("COMMERCIAL")) {
                                                int i26 = writeReplace;
                                                int i27 = ((((i26 ^ 39) | (i26 & 39)) << 1) - ((i26 & (-40)) | ((~i26) & 39))) % 128;
                                                valueOf = i27;
                                                writeReplace = (i27 + 69) % 128;
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1996005113:
                                            if (str.equals("CREDIT")) {
                                                int i28 = (writeReplace + 33) % 128;
                                                valueOf = i28;
                                                int i29 = i28 & 117;
                                                int i30 = -(-((i28 ^ 117) | i29));
                                                writeReplace = ((i29 & i30) + (i30 | i29)) % 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0) {
                                        com.payair.hce.setjSONObject setjsonobject3 = com.payair.hce.setjSONObject.writeReplace;
                                        int i31 = valueOf;
                                        int i32 = i31 & 19;
                                        int i33 = ((i31 ^ 19) | i32) << 1;
                                        int i34 = -((i31 | 19) & (~i32));
                                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                                        writeReplace = i35 % 128;
                                        if (i35 % 2 == 0) {
                                            return setjsonobject3;
                                        }
                                        throw null;
                                    }
                                    if (c == 1) {
                                        com.payair.hce.setjSONObject setjsonobject4 = com.payair.hce.setjSONObject.DigitizedCardProfile;
                                        int i36 = valueOf;
                                        int i37 = ((i36 | 100) << 1) - (i36 ^ 100);
                                        int i38 = (~i37) + (i37 << 1);
                                        writeReplace = i38 % 128;
                                        if (i38 % 2 == 0) {
                                            return setjsonobject4;
                                        }
                                        throw null;
                                    }
                                    if (c == 2) {
                                        com.payair.hce.setjSONObject setjsonobject5 = com.payair.hce.setjSONObject.valueOf;
                                        int i39 = writeReplace;
                                        valueOf = ((i39 ^ 109) + ((i39 & 109) << 1)) % 128;
                                        return setjsonobject5;
                                    }
                                    if (c == 3) {
                                        com.payair.hce.setjSONObject setjsonobject6 = com.payair.hce.setjSONObject.AlternateContactlessPaymentDataJson;
                                        int i40 = writeReplace;
                                        int i41 = (i40 ^ 49) + ((i40 & 49) << 1);
                                        valueOf = i41 % 128;
                                        if (i41 % 2 != 0) {
                                            return setjsonobject6;
                                        }
                                        throw null;
                                    }
                                    if (c == 4) {
                                        com.payair.hce.setjSONObject setjsonobject7 = com.payair.hce.setjSONObject.values;
                                        int i42 = writeReplace;
                                        valueOf = ((i42 ^ 23) + ((i42 & 23) << 1)) % 128;
                                        return setjsonobject7;
                                    }
                                    com.payair.hce.setjSONObject setjsonobject8 = com.payair.hce.setjSONObject.values;
                                    int i43 = writeReplace;
                                    int i44 = i43 & 117;
                                    valueOf = ((i44 - (~(-(-((i43 ^ 117) | i44))))) - 1) % 128;
                                    return setjsonobject8;
                                }

                                @Override // com.payair.hce.setDetailedMessage
                                public final com.payair.hce.setjSONObject getProductType() {
                                    return (com.payair.hce.setjSONObject) values(new java.lang.Object[]{this}, 928067796, -928067793, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.setDetailedMessage
                                public final com.payair.hce.getjSONObject getAccountType() {
                                    return (com.payair.hce.getjSONObject) values(new java.lang.Object[]{this}, 1978832461, -1978832457, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.setDetailedMessage
                                public final int getDualTapResetTimeout() {
                                    return ((java.lang.Integer) values(new java.lang.Object[]{this}, -562215323, 562215323, java.lang.System.identityHashCode(this))).intValue();
                                }

                                @Override // com.payair.hce.setDetailedMessage
                                public final int getCvmResetTimeout() {
                                    return ((java.lang.Integer) values(new java.lang.Object[]{this}, 47743792, -47743791, java.lang.System.identityHashCode(this))).intValue();
                                }

                                @Override // com.payair.hce.setDetailedMessage
                                public final com.payair.hce.setOrderRef getCardholderValidator() {
                                    return (com.payair.hce.setOrderRef) values(new java.lang.Object[]{this}, -153954855, 153954857, java.lang.System.identityHashCode(this));
                                }
                            };
                            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 91) % 128;
                            return setdetailedmessage;
                        case 2:
                            return AlternateContactlessPaymentDataJson(objArr2);
                        case 3:
                            return values(objArr2);
                        case 4:
                            return DigitizedCardProfile(objArr2);
                        case 5:
                            return writeReplace(objArr2);
                        case 6:
                            return SdkCoreAlternateContactlessPaymentDataImpl(objArr2);
                        case 7:
                            com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                            int i13 = AlternateContactlessPaymentDataJson;
                            DigitizedCardProfile = (((i13 ^ 93) - (~(-(-((i13 & 93) << 1))))) - 1) % 128;
                            com.payair.hce.getStatusCode getstatuscode = (com.payair.hce.getStatusCode) com.payair.hce.setFocusableInTouchMode.valueOf(new java.lang.Object[]{com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.dsrpData}, -1503898026, 1503898027, (int) java.lang.System.currentTimeMillis());
                            int i14 = AlternateContactlessPaymentDataJson;
                            int i15 = ((i14 ^ 51) | (i14 & 51)) << 1;
                            int i16 = -((i14 & (-52)) | ((~i14) & 51));
                            DigitizedCardProfile = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
                            return getstatuscode;
                        default:
                            return valueOf(objArr2);
                    }
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                    int i7 = DigitizedCardProfile;
                    int i8 = i7 & 29;
                    int i9 = (i7 | 29) & (~i8);
                    int i10 = i8 << 1;
                    AlternateContactlessPaymentDataJson = (((i9 | i10) << 1) - (i9 ^ i10)) % 128;
                    com.payair.hce.getStatusCodeFromServer profileVersion = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.getProfileVersion();
                    int i11 = DigitizedCardProfile;
                    int i12 = i11 & 7;
                    int i13 = (i11 | 7) & (~i12);
                    int i14 = -(-(i12 << 1));
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    AlternateContactlessPaymentDataJson = i15 % 128;
                    if (i15 % 2 != 0) {
                        return profileVersion;
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr2) {
                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                    int i7 = DigitizedCardProfile;
                    int i8 = i7 & 111;
                    int i9 = i8 + ((i7 ^ 111) | i8);
                    AlternateContactlessPaymentDataJson = i9 % 128;
                    com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.digitizedCardId);
                    if (i9 % 2 == 0) {
                        AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                        throw null;
                    }
                    return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                }

                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                    int i7 = DigitizedCardProfile;
                    int i8 = i7 & 101;
                    int i9 = (i7 | 101) & (~i8);
                    int i10 = -(-(i8 << 1));
                    AlternateContactlessPaymentDataJson = ((i9 & i10) + (i9 | i10)) % 128;
                    byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.cardCountryCode).DigitizedCardProfile();
                    int i11 = DigitizedCardProfile;
                    int i12 = ((i11 | 95) << 1) - (i11 ^ 95);
                    AlternateContactlessPaymentDataJson = i12 % 128;
                    if (i12 % 2 != 0) {
                        return DigitizedCardProfile2;
                    }
                    throw new java.lang.ArithmeticException();
                }

                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                    int i7 = AlternateContactlessPaymentDataJson;
                    int i8 = ((i7 & 68) + (i7 | 68)) - 1;
                    DigitizedCardProfile = i8 % 128;
                    byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.pan).DigitizedCardProfile();
                    if (i8 % 2 == 0) {
                        return DigitizedCardProfile2;
                    }
                    throw new java.lang.ArithmeticException();
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                    int i7 = AlternateContactlessPaymentDataJson;
                    DigitizedCardProfile = ((((i7 & (-16)) | ((~i7) & 15)) - (~(-(-((i7 & 15) << 1))))) - 1) % 128;
                    boolean z = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.isTransactionIdRequired;
                    int i8 = AlternateContactlessPaymentDataJson;
                    int i9 = i8 ^ 31;
                    int i10 = (i8 & 31) << 1;
                    int i11 = (i9 & i10) + (i10 | i9);
                    DigitizedCardProfile = i11 % 128;
                    if (i11 % 2 == 0) {
                        return java.lang.Boolean.valueOf(z);
                    }
                    throw new java.lang.ArithmeticException();
                }

                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                    com.payair.hce.setFocusableInTouchMode.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass5) objArr2[0];
                    int i7 = DigitizedCardProfile;
                    int i8 = i7 & 25;
                    int i9 = (i8 - (~(-(-((i7 ^ 25) | i8))))) - 1;
                    AlternateContactlessPaymentDataJson = i9 % 128;
                    if (i9 % 2 != 0) {
                        return (com.payair.hce.JsonResponse) com.payair.hce.setFocusableInTouchMode.valueOf(new java.lang.Object[]{com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this, initializevisapaymentsdk, settransitionalpha}, 1637749163, -1637749163, (int) java.lang.System.currentTimeMillis());
                    }
                    throw null;
                }

                @Override // com.payair.hce.checkForSuccess
                public final com.payair.hce.getStatusCode getDsrpData() {
                    return (com.payair.hce.getStatusCode) writeReplace(new java.lang.Object[]{this}, -2083071384, 2083071391, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.checkForSuccess
                public final com.payair.hce.JsonResponse getContactlessPaymentData() {
                    return (com.payair.hce.JsonResponse) writeReplace(new java.lang.Object[]{this}, 2053570624, -2053570622, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.checkForSuccess
                public final com.payair.hce.setDetailedMessage getWalletData() {
                    return (com.payair.hce.setDetailedMessage) writeReplace(new java.lang.Object[]{this}, 144092185, -144092184, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.checkForSuccess
                public final boolean isTransactionIdRequired() {
                    return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -1962946776, 1962946780, java.lang.System.identityHashCode(this))).booleanValue();
                }

                @Override // com.payair.hce.checkForSuccess
                public final byte[] getPan() {
                    return (byte[]) writeReplace(new java.lang.Object[]{this}, -437755216, 437755216, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.checkForSuccess
                public final byte[] getCardCountryCode() {
                    return (byte[]) writeReplace(new java.lang.Object[]{this}, -882589855, 882589860, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.checkForSuccess
                public final byte[] getDigitizedCardId() {
                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 1703885584, -1703885578, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.checkForSuccess
                public final com.payair.hce.getStatusCodeFromServer getVersion() {
                    return (com.payair.hce.getStatusCodeFromServer) writeReplace(new java.lang.Object[]{this}, 1022012187, -1022012184, java.lang.System.identityHashCode(this));
                }
            };
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 31) % 128;
            return checkforsuccess;
        }
        if (i6 != 3) {
            return valueOf(objArr);
        }
        final java.lang.String str = (java.lang.String) objArr[0];
        final java.lang.String str2 = (java.lang.String) objArr[1];
        final java.lang.String str3 = (java.lang.String) objArr[2];
        final java.lang.String str4 = (java.lang.String) objArr[3];
        com.payair.hce.setErrorName seterrorname = new com.payair.hce.setErrorName() { // from class: com.payair.hce.setFocusableInTouchMode.1
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i7, int i8, int i9) {
                int i10 = ~i7;
                int i11 = ~i8;
                int i12 = (i7 * (-661)) + (i8 * (-661)) + (((~i9) | (~(i10 | i11))) * 1324) + (((~(i9 | i7)) | (~(i9 | i8))) * (-1324)) + (((~(i7 | i11)) | (~(i8 | i10))) * 662);
                if (i12 != 1) {
                    return i12 != 2 ? i12 != 3 ? valueOf(objArr2) : DigitizedCardProfile(objArr2) : AlternateContactlessPaymentDataJson(objArr2);
                }
                com.payair.hce.setFocusableInTouchMode.AnonymousClass1 anonymousClass1 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass1) objArr2[0];
                int i13 = AlternateContactlessPaymentDataJson;
                int i14 = (i13 & 32) + (i13 | 32);
                SdkCoreAlternateContactlessPaymentDataImpl = ((~i14) + (i14 << 1)) % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str3).DigitizedCardProfile();
                int i15 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i16 = ((i15 ^ 35) | (i15 & 35)) << 1;
                int i17 = -((i15 & (-36)) | ((~i15) & 35));
                AlternateContactlessPaymentDataJson = ((i16 & i17) + (i16 | i17)) % 128;
                return DigitizedCardProfile2;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass1 anonymousClass1 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass1) objArr2[0];
                int i7 = AlternateContactlessPaymentDataJson;
                int i8 = i7 ^ 83;
                int i9 = ((((i7 & 83) | i8) << 1) - (~(-i8))) - 1;
                SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str);
                if (i9 % 2 != 0) {
                    return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                }
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw null;
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass1 anonymousClass1 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass1) objArr2[0];
                int i7 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i8 = ((((i7 ^ 71) | (i7 & 71)) << 1) - (~(-((i7 & (-72)) | ((~i7) & 71))))) - 1;
                AlternateContactlessPaymentDataJson = i8 % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str2).DigitizedCardProfile();
                if (i8 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i9 = SdkCoreAlternateContactlessPaymentDataImpl;
                AlternateContactlessPaymentDataJson = (((i9 & 108) + (i9 | 108)) - 1) % 128;
                return DigitizedCardProfile2;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass1 anonymousClass1 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass1) objArr2[0];
                int i7 = AlternateContactlessPaymentDataJson + 33;
                SdkCoreAlternateContactlessPaymentDataImpl = i7 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str4);
                if (i7 % 2 != 0) {
                    return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                }
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw null;
            }

            @Override // com.payair.hce.setErrorName
            public final byte[] getTrackData() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1603509475, 1603509477, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setErrorName
            public final byte[] getNAtc() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -905330213, 905330214, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setErrorName
            public final byte[] getPUnAtc() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -979389603, 979389603, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setErrorName
            public final byte[] getPCvc3() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1476935622, 1476935625, java.lang.System.identityHashCode(this));
            }
        };
        int i7 = AlternateContactlessPaymentDataJson;
        int i8 = (i7 | 45) << 1;
        int i9 = -((i7 & (-46)) | ((~i7) & 45));
        DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
        return seterrorname;
    }

    setFocusableInTouchMode() {
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        final com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json = (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json) objArr[0];
        final com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) objArr[1];
        final com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[2];
        int i = DigitizedCardProfile;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            final com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json = digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData;
            if (contactlessPaymentDataV2Json != null) {
                return new com.payair.hce.JsonResponse() { // from class: com.payair.hce.setFocusableInTouchMode.3
                    private static int RecordsJson = 1;
                    private static int valueOf;

                    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i3, int i4, int i5) {
                        int i6 = ~i4;
                        int i7 = i6 | i3;
                        switch ((i3 * (-129)) + (i4 * 131) + ((~(i6 | (~i5) | i3)) * 130) + ((~i7) * (-260)) + (((~((~i3) | i4)) | (~(i7 | i5))) * 130)) {
                            case 1:
                                return values(objArr2);
                            case 2:
                                com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                                RecordsJson = (valueOf + 29) % 128;
                                boolean booleanValue = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.isTransitSupported.booleanValue();
                                int i8 = RecordsJson & 71;
                                valueOf = ((i8 - (~(-(-((r5 ^ 71) | i8))))) - 1) % 128;
                                return java.lang.Boolean.valueOf(booleanValue);
                            case 3:
                                return DigitizedCardProfile(objArr2);
                            case 4:
                                return valueOf(objArr2);
                            case 5:
                                return writeReplace(objArr2);
                            case 6:
                                return RecordsJson(objArr2);
                            case 7:
                                return getAid(objArr2);
                            case 8:
                                return SdkCoreAlternateContactlessPaymentDataImpl(objArr2);
                            case 9:
                                return getProfileVersion(objArr2);
                            case 10:
                                return IccPrivateKeyCrtComponentsJson(objArr2);
                            case 11:
                                return SdkCoreBusinessLogicModuleImpl(objArr2);
                            case 12:
                                return getPaymentFci(objArr2);
                            case 13:
                                return getCvrMaskAnd(objArr2);
                            case 14:
                                return getCiacDecline(objArr2);
                            case 15:
                                return getGpoResponse(objArr2);
                            case 16:
                                return getSecurityWord(objArr2);
                            case 17:
                                return getCardLayoutDescription(objArr2);
                            case 18:
                                return getCvmResetTimeout(objArr2);
                            default:
                                return AlternateContactlessPaymentDataJson(objArr2);
                        }
                    }

                    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf;
                        int i4 = (i3 | 35) << 1;
                        int i5 = -(i3 ^ 35);
                        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                        RecordsJson = i6 % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.aid).DigitizedCardProfile();
                        if (i6 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        RecordsJson = (valueOf + 87) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.ppseFci).DigitizedCardProfile();
                        int i3 = RecordsJson;
                        int i4 = i3 & 69;
                        int i5 = -(-((i3 ^ 69) | i4));
                        int i6 = (i4 & i5) + (i5 | i4);
                        valueOf = i6 % 128;
                        if (i6 % 2 == 0) {
                            return DigitizedCardProfile2;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        RecordsJson = i3 % 128;
                        com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.paymentFci);
                        if (i3 % 2 != 0) {
                            return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                        }
                        AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf;
                        int i4 = i3 ^ 51;
                        int i5 = ((i3 & 51) | i4) << 1;
                        int i6 = -i4;
                        RecordsJson = ((i5 & i6) + (i5 | i6)) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.gpoResponse).DigitizedCardProfile();
                        int i7 = RecordsJson;
                        int i8 = ((i7 | 55) << 1) - (i7 ^ 55);
                        valueOf = i8 % 128;
                        if (i8 % 2 == 0) {
                            return DigitizedCardProfile2;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = RecordsJson + 51;
                        valueOf = i3 % 128;
                        java.lang.Integer num = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cdol1RelatedDataLength;
                        if (i3 % 2 == 0) {
                            return java.lang.Integer.valueOf(num.intValue());
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        RecordsJson = (valueOf + 27) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.issuerApplicationData).DigitizedCardProfile();
                        int i3 = valueOf;
                        int i4 = i3 ^ 3;
                        int i5 = ((i3 & 3) | i4) << 1;
                        int i6 = -i4;
                        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                        RecordsJson = i7 % 128;
                        if (i7 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr2) {
                        char c = 0;
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = RecordsJson + 113;
                        valueOf = i3 % 128;
                        if (i3 % 2 != 0) {
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cvmModel;
                            throw null;
                        }
                        if (com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cvmModel == null) {
                            int i4 = RecordsJson;
                            int i5 = ((i4 & (-82)) | ((~i4) & 81)) + ((i4 & 81) << 1);
                            valueOf = i5 % 128;
                            if (i5 % 2 != 0) {
                                com.payair.hce.gotDeleteData gotdeletedata = com.payair.hce.gotDeleteData.valueOf;
                                throw null;
                            }
                            com.payair.hce.gotDeleteData gotdeletedata2 = com.payair.hce.gotDeleteData.valueOf;
                            int i6 = valueOf;
                            RecordsJson = (((i6 | 13) << 1) - (i6 ^ 13)) % 128;
                            return gotdeletedata2;
                        }
                        java.lang.String str2 = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cvmModel;
                        int hashCode = str2.hashCode();
                        if (hashCode == -1724098714) {
                            if (str2.equals("CARD_LIKE")) {
                                int i7 = valueOf;
                                RecordsJson = ((i7 ^ 17) + ((i7 & 17) << 1)) % 128;
                                RecordsJson = ((((i7 ^ 29) | (i7 & 29)) << 1) - ((i7 & (-30)) | ((~i7) & 29))) % 128;
                                c = 2;
                            }
                            c = 65535;
                        } else if (hashCode != -1579111723) {
                            if (hashCode == 1953740997 && str2.equals("FLEXIBLE_CDCVM")) {
                                int i8 = RecordsJson;
                                int i9 = i8 & 73;
                                valueOf = ((((~i9) & (i8 | 73)) - (~(i9 << 1))) - 1) % 128;
                                int i10 = i8 & 121;
                                int i11 = -(-((i8 ^ 121) | i10));
                                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                                valueOf = i12 % 128;
                                int i13 = i12 % 2;
                                c = 1;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("CDCVM_ALWAYS")) {
                                int i14 = RecordsJson;
                                valueOf = ((i14 & 23) + (i14 | 23)) % 128;
                                valueOf = (((i14 & 116) + (i14 | 116)) - 1) % 128;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            com.payair.hce.gotDeleteData gotdeletedata3 = com.payair.hce.gotDeleteData.valueOf;
                            int i15 = RecordsJson;
                            int i16 = i15 & 61;
                            int i17 = (((i15 ^ 61) | i16) << 1) - ((i15 | 61) & (~i16));
                            valueOf = i17 % 128;
                            if (i17 % 2 == 0) {
                                return gotdeletedata3;
                            }
                            throw null;
                        }
                        if (c != 1) {
                            if (c != 2) {
                                com.payair.hce.gotDeleteData gotdeletedata4 = com.payair.hce.gotDeleteData.values;
                                int i18 = valueOf + 27;
                                RecordsJson = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return gotdeletedata4;
                                }
                                throw null;
                            }
                            com.payair.hce.gotDeleteData gotdeletedata5 = com.payair.hce.gotDeleteData.DigitizedCardProfile;
                            int i19 = RecordsJson;
                            int i20 = i19 & 77;
                            int i21 = -(-((i19 ^ 77) | i20));
                            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                            valueOf = i22 % 128;
                            if (i22 % 2 == 0) {
                                return gotdeletedata5;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        com.payair.hce.gotDeleteData gotdeletedata6 = com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson;
                        int identityHashCode = java.lang.System.identityHashCode(anonymousClass3);
                        int i23 = ~identityHashCode;
                        int i24 = (i23 | identityHashCode) & i23;
                        int i25 = i24 & 303645764;
                        int i26 = (i24 | 303645764) & (~i25);
                        int i27 = ~((i26 ^ i25) | (i26 & i25));
                        int i28 = (i27 ^ 1065028) | (i27 & 1065028);
                        int i29 = ~(((-303645765) & identityHashCode) | (i23 & (-303645765)) | (identityHashCode & 303645764));
                        int i30 = -(-(((i28 ^ i29) | (i29 & i28)) * (-338)));
                        int i31 = i30 | (-842178191);
                        int i32 = i31 << 1;
                        int i33 = -((~(i30 & (-842178191))) & i31);
                        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                        int i35 = (i34 ^ (-1014855801)) + (((-1014855801) & i34) << 1);
                        int i36 = (~i35) + (i35 << 1);
                        int i37 = i23 & 303645764;
                        int i38 = (i23 | 303645764) & (~i37);
                        int i39 = ~((i38 ^ i37) | (i38 & i37));
                        int i40 = ~((identityHashCode ^ (-302580737)) | (identityHashCode & (-302580737)));
                        int i41 = ((~i40) & i39) | ((~i39) & i40);
                        int i42 = i40 & i39;
                        int i43 = -(-(((i42 ^ i41) | (i42 & i41)) * 338));
                        int i44 = i36 & i43;
                        int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass3);
                        int i45 = ~identityHashCode2;
                        int i46 = i45 ^ 1232734877;
                        int i47 = i45 & 1232734877;
                        int i48 = ~((i46 ^ i47) | (i46 & i47));
                        int i49 = (1803267069 & i48) | ((~i48) & (-1803267070));
                        int i50 = i48 & (-1803267070);
                        int i51 = (-1776651337) - (~(-(~(((i50 ^ i49) | (i50 & i49)) * (-245)))));
                        int i52 = (~i51) + (i51 << 1);
                        int i53 = i47 | ((-1232734878) & identityHashCode2);
                        int i54 = identityHashCode2 & 1232734877;
                        int i55 = (~((i53 ^ i54) | (i53 & i54))) * (-245);
                        int i56 = i52 & i55;
                        int i57 = -(-((i55 ^ i52) | i56));
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        int i59 = identityHashCode2 ^ 1232734877;
                        int i60 = ~((i59 ^ i54) | (i54 & i59));
                        int i61 = ((~i60) & 577481569) | ((-577481570) & i60);
                        int i62 = i60 & 577481569;
                        int i63 = -(-(((i62 ^ i61) | (i62 & i61)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                        if (i44 + ((i43 ^ i36) | i44) > ((i58 | i63) << 1) - (i63 ^ i58)) {
                            return gotdeletedata6;
                        }
                        throw null;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
                    
                        if ((r4 % 2) == 0) goto L30;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static /* synthetic */ java.lang.Object getCvmResetTimeout(java.lang.Object[] objArr2) {
                        com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader;
                        int i3;
                        int i4;
                        int i5;
                        char c = 0;
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i6 = valueOf;
                        RecordsJson = ((((i6 | 68) << 1) - (i6 ^ 68)) - 1) % 128;
                        if (com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.umdGeneration == null) {
                            int i7 = valueOf;
                            int i8 = i7 ^ 67;
                            int i9 = (i7 & 67) << 1;
                            int i10 = (i8 & i9) + (i9 | i8);
                            RecordsJson = i10 % 128;
                            if (i10 % 2 == 0) {
                                com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader2 = com.payair.hce.setSendAuthenticationHeader.writeReplace;
                                throw null;
                            }
                            setsendauthenticationheader = com.payair.hce.setSendAuthenticationHeader.writeReplace;
                            int i11 = valueOf;
                            i5 = ((i11 | 33) << 1) - (i11 ^ 33);
                        } else {
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.umdGeneration;
                            int hashCode = str.hashCode();
                            if (hashCode == 366664857) {
                                if (str.equals("GENERATE_VALID_UMD_ON_CDCVM")) {
                                    int i12 = valueOf;
                                    RecordsJson = ((((i12 | 16) << 1) - (i12 ^ 16)) - 1) % 128;
                                    RecordsJson = (i12 + 3) % 128;
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 1118204426) {
                                if (hashCode == 1555809199 && str.equals("ALWAYS_GENERATE_VALID_UMD")) {
                                    int i13 = RecordsJson;
                                    int i14 = i13 & 83;
                                    int i15 = (((i13 ^ 83) | i14) << 1) - ((i13 | 83) & (~i14));
                                    valueOf = i15 % 128;
                                }
                                c = 65535;
                            } else {
                                if (str.equals("ALWAYS_GENERATE_RANDOM_UMD")) {
                                    int i16 = RecordsJson;
                                    valueOf = ((i16 & 83) + (i16 | 83)) % 128;
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                setsendauthenticationheader = com.payair.hce.setSendAuthenticationHeader.writeReplace;
                                int i17 = valueOf;
                                i3 = i17 ^ 43;
                                i4 = (i17 & 43) << 1;
                            } else if (c == 1) {
                                setsendauthenticationheader = com.payair.hce.setSendAuthenticationHeader.values;
                                int i18 = valueOf;
                                int i19 = i18 & 95;
                                i5 = (i19 - (~(-(-((i18 ^ 95) | i19))))) - 1;
                            } else {
                                if (c != 2) {
                                    com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader3 = com.payair.hce.setSendAuthenticationHeader.values;
                                    int i20 = valueOf;
                                    int i21 = i20 ^ 41;
                                    int i22 = ((i20 & 41) | i21) << 1;
                                    int i23 = -i21;
                                    int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                                    RecordsJson = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        return setsendauthenticationheader3;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }
                                setsendauthenticationheader = com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile;
                                int i25 = valueOf;
                                i3 = i25 & 7;
                                i4 = i25 | 7;
                            }
                            i5 = i3 + i4;
                        }
                        RecordsJson = i5 % 128;
                        return setsendauthenticationheader;
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = RecordsJson;
                        int i4 = (i3 ^ 18) + ((i3 & 18) << 1);
                        int i5 = (~i4) + (i4 << 1);
                        valueOf = i5 % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.pinIvCvc3Track2).DigitizedCardProfile();
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        RecordsJson = (valueOf + 121) % 128;
                        return DigitizedCardProfile2;
                    }

                    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf + 9;
                        RecordsJson = i3 % 128;
                        java.lang.Boolean bool = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.isUsAipMaskingSupported;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        boolean booleanValue = bool.booleanValue();
                        int i4 = valueOf;
                        int i5 = i4 & 89;
                        int i6 = (i4 | 89) & (~i5);
                        int i7 = i5 << 1;
                        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                        RecordsJson = i8 % 128;
                        if (i8 % 2 != 0) {
                            return java.lang.Boolean.valueOf(booleanValue);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        RecordsJson = (valueOf + 77) % 128;
                        try {
                            com.payair.hce.setTransitionAlpha settransitionalpha2 = settransitionalpha;
                            byte[] bArr = (byte[]) ((java.util.concurrent.Future) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, initializevisapaymentsdk}, 1735867052, -1735867048, java.lang.System.identityHashCode(settransitionalpha2))).get();
                            com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData.protectedIccPrivateKeyCrtComponents;
                            com.payair.hce.setTransitionAlpha settransitionalpha3 = settransitionalpha;
                            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha3, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccPrivateKeyCrtComponentsJson.u).DigitizedCardProfile(), bArr}, 1273890719, -1273890707, java.lang.System.identityHashCode(settransitionalpha3)));
                            com.payair.hce.setTransitionAlpha settransitionalpha4 = settransitionalpha;
                            AlternateContactlessPaymentDataJson2.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha4, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccPrivateKeyCrtComponentsJson.p).DigitizedCardProfile(), bArr}, 1273890719, -1273890707, java.lang.System.identityHashCode(settransitionalpha4))));
                            com.payair.hce.setTransitionAlpha settransitionalpha5 = settransitionalpha;
                            AlternateContactlessPaymentDataJson2.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha5, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccPrivateKeyCrtComponentsJson.q).DigitizedCardProfile(), bArr}, 1273890719, -1273890707, java.lang.System.identityHashCode(settransitionalpha5))));
                            com.payair.hce.setTransitionAlpha settransitionalpha6 = settransitionalpha;
                            AlternateContactlessPaymentDataJson2.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha6, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccPrivateKeyCrtComponentsJson.dp).DigitizedCardProfile(), bArr}, 1273890719, -1273890707, java.lang.System.identityHashCode(settransitionalpha6))));
                            com.payair.hce.setTransitionAlpha settransitionalpha7 = settransitionalpha;
                            AlternateContactlessPaymentDataJson2.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha7, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccPrivateKeyCrtComponentsJson.dq).DigitizedCardProfile(), bArr}, 1273890719, -1273890707, java.lang.System.identityHashCode(settransitionalpha7))));
                            com.payair.hce.setTransitionAlpha settransitionalpha8 = settransitionalpha;
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha8, AlternateContactlessPaymentDataJson2.DigitizedCardProfile()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha8));
                            int i3 = RecordsJson;
                            int i4 = ((i3 & 96) + (i3 | 96)) - 1;
                            valueOf = i4 % 128;
                            if (i4 % 2 == 0) {
                                return initializevisapaymentsdk2;
                            }
                            throw new java.lang.ArithmeticException();
                        } catch (java.lang.Exception unused) {
                            return new com.payair.hce.initializeVisaPaymentSdk(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("").DigitizedCardProfile());
                        }
                    }

                    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf;
                        int i4 = (((i3 | 90) << 1) - (i3 ^ 90)) - 1;
                        RecordsJson = i4 % 128;
                        java.lang.Object[] objArr3 = {digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData.alternateContactlessPaymentData};
                        int i5 = i4 % 2;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (i5 != 0) {
                            return (com.payair.hce.JsonRequest) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(objArr3, -1885591455, 1885591458, (int) currentTimeMillis);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf;
                        int i4 = i3 & 63;
                        int i5 = i3 | 63;
                        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                        RecordsJson = i6 % 128;
                        int i7 = i6 % 2;
                        java.util.List list = (java.util.List) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData.records}, 1279096886, -1279096884, (int) java.lang.System.currentTimeMillis());
                        if (i7 == 0) {
                            throw null;
                        }
                        int i8 = RecordsJson;
                        int i9 = i8 & 73;
                        int i10 = -(-(i8 | 73));
                        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                        valueOf = i11 % 128;
                        if (i11 % 2 == 0) {
                            return list;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = RecordsJson;
                        valueOf = (((i3 & (-120)) | ((~i3) & 119)) + ((i3 & 119) << 1)) % 128;
                        com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData.track1ConstructionData;
                        if (trackConstructionDataV2Json == null) {
                            int i4 = valueOf;
                            int i5 = i4 ^ 51;
                            int i6 = ((i4 & 51) | i5) << 1;
                            int i7 = -i5;
                            int i8 = (i6 & i7) + (i6 | i7);
                            RecordsJson = i8 % 128;
                            if (i8 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        com.payair.hce.setErrorName seterrorname = (com.payair.hce.setErrorName) com.payair.hce.setFocusableInTouchMode.valueOf(new java.lang.Object[]{trackConstructionDataV2Json.pCvc3, trackConstructionDataV2Json.pUnAtc, trackConstructionDataV2Json.nAtc, trackConstructionDataV2Json.trackData}, -924716355, 924716358, (int) java.lang.System.currentTimeMillis());
                        int i9 = RecordsJson;
                        valueOf = ((i9 & 15) + (i9 | 15)) % 128;
                        return seterrorname;
                    }

                    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr2) {
                        com.payair.hce.setFocusableInTouchMode.AnonymousClass3 anonymousClass3 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass3) objArr2[0];
                        int i3 = valueOf + 15;
                        RecordsJson = i3 % 128;
                        if (i3 % 2 != 0) {
                            com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData.track2ConstructionData;
                            if (trackConstructionDataV2Json == null) {
                                int i4 = valueOf;
                                int i5 = i4 & 91;
                                int i6 = ((i4 ^ 91) | i5) << 1;
                                int i7 = -((i4 | 91) & (~i5));
                                int i8 = (i6 & i7) + (i7 | i6);
                                RecordsJson = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                            com.payair.hce.setErrorName seterrorname = (com.payair.hce.setErrorName) com.payair.hce.setFocusableInTouchMode.valueOf(new java.lang.Object[]{trackConstructionDataV2Json.pCvc3, trackConstructionDataV2Json.pUnAtc, trackConstructionDataV2Json.nAtc, trackConstructionDataV2Json.trackData}, -924716355, 924716358, (int) java.lang.System.currentTimeMillis());
                            int i9 = valueOf + 85;
                            RecordsJson = i9 % 128;
                            if (i9 % 2 != 0) {
                                return seterrorname;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json2 = digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData.track2ConstructionData;
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                        int i3 = RecordsJson;
                        int i4 = ((i3 ^ 23) | (i3 & 23)) << 1;
                        int i5 = -((i3 & (-24)) | ((~i3) & 23));
                        int i6 = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
                        valueOf = i6;
                        int i7 = i6 & 111;
                        int i8 = (i6 ^ 111) | i7;
                        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                        RecordsJson = i9 % 128;
                        if (i9 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr2) {
                        int i3 = valueOf;
                        int i4 = i3 & 1;
                        int i5 = ((~i4) & (i3 | 1)) + (i4 << 1);
                        RecordsJson = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        int i6 = (((i3 & (-28)) | ((~i3) & 27)) - (~((i3 & 27) << 1))) - 1;
                        RecordsJson = i6 % 128;
                        if (i6 % 2 != 0) {
                            return null;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr2) {
                        int i3 = RecordsJson;
                        int i4 = i3 ^ 7;
                        valueOf = ((((i3 & 7) | i4) << 1) - i4) % 128;
                        int i5 = i3 & 67;
                        int i6 = (i3 ^ 67) | i5;
                        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                        valueOf = i7 % 128;
                        if (i7 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCvrMaskAnd() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1302874405, 1302874411, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCiacDeclineOnPpms() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -431443836, 431443845, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCiacDecline() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -524906404, 524906404, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setErrorName getTrack2ConstructionData() {
                        return (com.payair.hce.setErrorName) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -509540370, 509540383, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setErrorName getTrack1ConstructionData() {
                        return (com.payair.hce.setErrorName) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -891672265, 891672270, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final java.util.List<com.payair.hce.setNetworkError> getRecords() {
                        return (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -9503644, 9503661, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.JsonRequest getAlternateContactlessPaymentData() {
                        return (com.payair.hce.JsonRequest) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -535700226, 535700234, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.initializeVisaPaymentSdk getIccPrivateKeyCrtComponents() {
                        return (com.payair.hce.initializeVisaPaymentSdk) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1099688985, -1099688982, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final boolean isUsAipMaskingSupported() {
                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1168498293, 1168498305, java.lang.System.identityHashCode(this))).booleanValue();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final boolean isTransitSupported() {
                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1386851539, -1386851537, java.lang.System.identityHashCode(this))).booleanValue();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPinIvCvc3Track2() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -679485993, 679485994, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                        return (com.payair.hce.setSendAuthenticationHeader) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1529702771, 1529702789, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.gotDeleteData getCvmModel() {
                        return (com.payair.hce.gotDeleteData) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -943325477, 943325487, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getIssuerApplicationData() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1913228971, -1913228967, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final int getCdol1RelatedDataLength() {
                        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 703509548, -703509533, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getGpoResponse() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -955538683, 955538697, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPaymentFci() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1573893132, -1573893121, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPpseFci() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1232626965, 1232626981, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getAid() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 477274594, -477274587, java.lang.System.identityHashCode(this));
                    }
                };
            }
            int i3 = DigitizedCardProfile;
            int i4 = i3 & 9;
            int i5 = -(-((i3 ^ 9) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json2 = digitizedCardProfileV2Json.mchipCardProfile.contactlessPaymentData;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        final com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json = (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json) objArr[0];
        int i = DigitizedCardProfile + 33;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (dsrpDataV2Json == null) {
            int i3 = i2 & 111;
            int i4 = (i2 ^ 111) | i3;
            int i5 = ((i3 & i4) + (i3 | i4)) % 128;
            DigitizedCardProfile = i5;
            int i6 = i5 & 79;
            int i7 = (i5 | 79) & (~i6);
            int i8 = i6 << 1;
            AlternateContactlessPaymentDataJson = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
            return null;
        }
        com.payair.hce.getStatusCode getstatuscode = new com.payair.hce.getStatusCode() { // from class: com.payair.hce.setFocusableInTouchMode.4
            private static int values = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i9, int i10, int i11) {
                int i12 = ~i10;
                int i13 = ~i11;
                switch ((i9 * 46) + (i10 * 46) + (((~(i12 | i13)) | i9) * (-90)) + (((~(i10 | i9)) | (~(i12 | i11))) * (-45)) + (((~((~i9) | i11)) | i12 | (~(i9 | i13))) * 45)) {
                    case 1:
                        return AlternateContactlessPaymentDataJson(objArr2);
                    case 2:
                        return valueOf(objArr2);
                    case 3:
                        return values(objArr2);
                    case 4:
                        return writeReplace(objArr2);
                    case 5:
                        return SdkCoreAlternateContactlessPaymentDataImpl(objArr2);
                    case 6:
                        return RecordsJson(objArr2);
                    case 7:
                        return getAid(objArr2);
                    case 8:
                        return getProfileVersion(objArr2);
                    case 9:
                        return IccPrivateKeyCrtComponentsJson(objArr2);
                    case 10:
                        return SdkCoreBusinessLogicModuleImpl(objArr2);
                    default:
                        return DigitizedCardProfile(objArr2);
                }
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = values;
                writeReplace = (((i9 ^ 114) + ((i9 & 114) << 1)) - 1) % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.aip).DigitizedCardProfile();
                int i10 = writeReplace;
                int i11 = i10 & 91;
                int i12 = ((i10 ^ 91) | i11) << 1;
                int i13 = -((i10 | 91) & (~i11));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                values = i14 % 128;
                if (i14 % 2 != 0) {
                    return DigitizedCardProfile2;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = values + 111;
                writeReplace = i9 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.expirationDate);
                if (i9 % 2 != 0) {
                    AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                    throw null;
                }
                byte[] DigitizedCardProfile2 = AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                int i10 = writeReplace;
                int i11 = ((i10 ^ 93) | (i10 & 93)) << 1;
                int i12 = -((i10 & (-94)) | ((~i10) & 93));
                int i13 = (i11 & i12) + (i12 | i11);
                values = i13 % 128;
                if (i13 % 2 != 0) {
                    return DigitizedCardProfile2;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = values;
                int i10 = i9 & 47;
                int i11 = (i9 ^ 47) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                writeReplace = i12 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.panSequenceNumber);
                if (i12 % 2 == 0) {
                    return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                }
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw null;
            }

            private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = writeReplace;
                int i10 = i9 & 97;
                int i11 = (i9 | 97) & (~i10);
                int i12 = i10 << 1;
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                values = i13 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.track2Equivalent);
                if (i13 % 2 == 0) {
                    AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                    throw null;
                }
                byte[] DigitizedCardProfile2 = AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                writeReplace = ((-2) - (~(values + 80))) % 128;
                return DigitizedCardProfile2;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = writeReplace;
                int i10 = ((i9 | 111) << 1) - (i9 ^ 111);
                values = i10 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.issuerApplicationData);
                if (i10 % 2 != 0) {
                    return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                }
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw null;
            }

            private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr2) {
                int i9;
                int i10;
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i11 = values + 68;
                int i12 = (~i11) + (i11 << 1);
                writeReplace = i12 % 128;
                if (i12 % 2 != 0) {
                    java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.cvmModel;
                    throw new java.lang.ArithmeticException();
                }
                if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.cvmModel == null) {
                    int i13 = writeReplace;
                    int i14 = i13 ^ 115;
                    int i15 = (((i13 & 115) | i14) << 1) - i14;
                    values = i15 % 128;
                    if (i15 % 2 != 0) {
                        return com.payair.hce.gotDeleteData.valueOf;
                    }
                    com.payair.hce.gotDeleteData gotdeletedata = com.payair.hce.gotDeleteData.valueOf;
                    throw null;
                }
                java.lang.String str2 = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.cvmModel;
                int hashCode = str2.hashCode();
                if (hashCode != -1724098714) {
                    if (hashCode != -1579111723) {
                        if (hashCode == 1953740997 && str2.equals("FLEXIBLE_CDCVM")) {
                            int i16 = writeReplace;
                            int i17 = (((i16 ^ 89) | (i16 & 89)) << 1) - ((i16 & (-90)) | ((~i16) & 89));
                            int i18 = i17 % 128;
                            values = i18;
                            r0 = i17 % 2 != 0 ? (char) 1 : (char) 0;
                            i9 = i18 ^ 101;
                            i10 = i18 & 101;
                            writeReplace = (i9 + (i10 << 1)) % 128;
                        }
                    } else if (str2.equals("CDCVM_ALWAYS")) {
                        int i19 = values;
                        writeReplace = (((i19 ^ 22) + ((i19 & 22) << 1)) - 1) % 128;
                    }
                    r0 = 65535;
                } else {
                    if (str2.equals("CARD_LIKE")) {
                        int i20 = values;
                        int i21 = ((i20 & (-26)) | ((~i20) & 25)) + ((i20 & 25) << 1);
                        writeReplace = i21 % 128;
                        r0 = i21 % 2 != 0 ? (char) 3 : (char) 2;
                        i9 = i20 ^ 115;
                        i10 = i20 & 115;
                        writeReplace = (i9 + (i10 << 1)) % 128;
                    }
                    r0 = 65535;
                }
                if (r0 == 0) {
                    com.payair.hce.gotDeleteData gotdeletedata2 = com.payair.hce.gotDeleteData.valueOf;
                    int i22 = values;
                    int i23 = i22 & 25;
                    int i24 = i23 + ((i22 ^ 25) | i23);
                    writeReplace = i24 % 128;
                    if (i24 % 2 == 0) {
                        return gotdeletedata2;
                    }
                    throw null;
                }
                if (r0 == 1) {
                    com.payair.hce.gotDeleteData gotdeletedata3 = com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson;
                    int i25 = writeReplace;
                    int i26 = (((i25 & (-68)) | ((~i25) & 67)) - (~((i25 & 67) << 1))) - 1;
                    values = i26 % 128;
                    if (i26 % 2 != 0) {
                        return gotdeletedata3;
                    }
                    throw null;
                }
                if (r0 == 2) {
                    com.payair.hce.gotDeleteData gotdeletedata4 = com.payair.hce.gotDeleteData.DigitizedCardProfile;
                    values = (writeReplace + 83) % 128;
                    return gotdeletedata4;
                }
                com.payair.hce.gotDeleteData gotdeletedata5 = com.payair.hce.gotDeleteData.values;
                int i27 = writeReplace;
                int i28 = i27 ^ 59;
                values = (((((i27 & 59) | i28) << 1) - (~(-i28))) - 1) % 128;
                return gotdeletedata5;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                char c = 0;
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = writeReplace + 97;
                values = i9 % 128;
                if (i9 % 2 == 0) {
                    java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.umdGeneration;
                    throw null;
                }
                if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.umdGeneration == null) {
                    com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader = com.payair.hce.setSendAuthenticationHeader.writeReplace;
                    int i10 = writeReplace;
                    int i11 = i10 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    int i12 = -(-((i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1));
                    values = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                    return setsendauthenticationheader;
                }
                java.lang.String str2 = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.umdGeneration;
                int hashCode = str2.hashCode();
                if (hashCode == 366664857) {
                    if (str2.equals("GENERATE_VALID_UMD_ON_CDCVM")) {
                        int i13 = values;
                        int i14 = i13 & 27;
                        int i15 = -(-(i13 | 27));
                        int i16 = ((i14 & i15) + (i15 | i14)) % 128;
                        writeReplace = i16;
                        int i17 = (((i16 | 126) << 1) - (i16 ^ 126)) - 1;
                        values = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 5 / 5;
                        }
                        c = 1;
                    }
                    c = 65535;
                } else if (hashCode != 1118204426) {
                    if (hashCode == 1555809199 && str2.equals("ALWAYS_GENERATE_VALID_UMD")) {
                        int i19 = writeReplace;
                        int i20 = ((((i19 | 43) << 1) - (~(-((i19 & (-44)) | ((~i19) & 43))))) - 1) % 128;
                        values = i20;
                        int i21 = i20 & 1;
                        writeReplace = (((i20 | 1) & (~i21)) + (i21 << 1)) % 128;
                    }
                    c = 65535;
                } else {
                    if (str2.equals("ALWAYS_GENERATE_RANDOM_UMD")) {
                        int i22 = writeReplace;
                        int i23 = i22 & 25;
                        int i24 = (i22 ^ 25) | i23;
                        int i25 = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                        values = i25;
                        writeReplace = (i25 + 75) % 128;
                        c = 2;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader2 = com.payair.hce.setSendAuthenticationHeader.writeReplace;
                    int i26 = writeReplace;
                    int i27 = ((i26 & 55) - (~(i26 | 55))) - 1;
                    values = i27 % 128;
                    if (i27 % 2 != 0) {
                        return setsendauthenticationheader2;
                    }
                    throw null;
                }
                if (c == 1) {
                    com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader3 = com.payair.hce.setSendAuthenticationHeader.values;
                    int i28 = values;
                    int i29 = i28 & 13;
                    int i30 = -(-((i28 ^ 13) | i29));
                    writeReplace = ((i29 ^ i30) + ((i30 & i29) << 1)) % 128;
                    return setsendauthenticationheader3;
                }
                if (c == 2) {
                    com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader4 = com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile;
                    values = (writeReplace + 39) % 128;
                    return setsendauthenticationheader4;
                }
                com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader5 = com.payair.hce.setSendAuthenticationHeader.values;
                int i31 = writeReplace;
                values = ((-2) - (~((i31 & 38) + (i31 | 38)))) % 128;
                return setsendauthenticationheader5;
            }

            private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = writeReplace;
                int i10 = ((i9 ^ 81) | (i9 & 81)) << 1;
                int i11 = -((i9 & (-82)) | ((~i9) & 81));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                values = i12 % 128;
                if (i12 % 2 == 0) {
                    java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.ucafVersion;
                    throw null;
                }
                if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.ucafVersion == null) {
                    com.payair.hce.gotPutData gotputdata = com.payair.hce.gotPutData.valueOf;
                    int i13 = writeReplace + 13;
                    values = i13 % 128;
                    if (i13 % 2 != 0) {
                        return gotputdata;
                    }
                    throw null;
                }
                java.lang.String str2 = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.ucafVersion;
                int hashCode = str2.hashCode();
                if (hashCode != 2714) {
                    if (hashCode == 480298015 && str2.equals("V0_PLUS")) {
                        int i14 = values;
                        int i15 = i14 & 73;
                        int i16 = ((i14 ^ 73) | i15) << 1;
                        int i17 = -((~i15) & (i14 | 73));
                        writeReplace = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
                        writeReplace = (i14 + 95) % 128;
                        com.payair.hce.gotPutData gotputdata2 = com.payair.hce.gotPutData.AlternateContactlessPaymentDataJson;
                        int i18 = values + 19;
                        writeReplace = i18 % 128;
                        if (i18 % 2 == 0) {
                            return gotputdata2;
                        }
                        throw null;
                    }
                } else if (str2.equals("V0")) {
                    int i19 = (writeReplace + 113) % 128;
                    values = i19;
                    int i20 = i19 & 5;
                    writeReplace = (((i19 | 5) & (~i20)) + (i20 << 1)) % 128;
                    com.payair.hce.gotPutData gotputdata3 = com.payair.hce.gotPutData.valueOf;
                    int i21 = values;
                    int i22 = i21 ^ 111;
                    int i23 = -(-((i21 & 111) << 1));
                    writeReplace = (((i22 | i23) << 1) - (i23 ^ i22)) % 128;
                    return gotputdata3;
                }
                com.payair.hce.gotPutData gotputdata4 = com.payair.hce.gotPutData.valueOf;
                values = (writeReplace + 71) % 128;
                return gotputdata4;
            }

            private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr2) {
                com.payair.hce.setFocusableInTouchMode.AnonymousClass4 anonymousClass4 = (com.payair.hce.setFocusableInTouchMode.AnonymousClass4) objArr2[0];
                int i9 = values;
                int i10 = i9 & 95;
                writeReplace = (i10 + ((i9 ^ 95) | i10)) % 128;
                if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.par == null) {
                    int i11 = values;
                    int i12 = (i11 & 111) + (i11 | 111);
                    writeReplace = i12 % 128;
                    if (i12 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i13 = values;
                writeReplace = ((i13 ^ 101) + ((i13 & 101) << 1)) % 128;
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.par).DigitizedCardProfile();
                int i14 = values;
                int i15 = (i14 | 117) << 1;
                int i16 = -((i14 & (-118)) | ((~i14) & 117));
                writeReplace = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
                return DigitizedCardProfile2;
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                int i9 = writeReplace;
                int i10 = i9 & 113;
                values = ((i10 - (~((i9 ^ 113) | i10))) - 1) % 128;
                int i11 = ((i9 & 58) + (i9 | 58)) - 1;
                values = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr2) {
                int i9 = values & 87;
                int i10 = ((((r2 | 87) & (~i9)) - (~(-(-(i9 << 1))))) - 1) % 128;
                writeReplace = i10;
                int i11 = i10 & 65;
                int i12 = (i10 | 65) & (~i11);
                int i13 = -(-(i11 << 1));
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                values = i14 % 128;
                if (i14 % 2 != 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getCvrMaskAnd() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, 496066395, -496066385, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getCiacDecline() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, 2136447797, -2136447795, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getPar() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, 902615413, -902615408, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final com.payair.hce.gotPutData getUcafVersion() {
                return (com.payair.hce.gotPutData) valueOf(new java.lang.Object[]{this}, -883889572, 883889579, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                return (com.payair.hce.setSendAuthenticationHeader) valueOf(new java.lang.Object[]{this}, 1946644798, -1946644794, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final com.payair.hce.gotDeleteData getCvmModel() {
                return (com.payair.hce.gotDeleteData) valueOf(new java.lang.Object[]{this}, 529762253, -529762247, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getIssuerApplicationData() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, -929010620, 929010621, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getTrack2EquivalentData() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, 2138449816, -2138449808, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getPanSequenceNumber() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, -517049827, 517049830, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getExpiryDate() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, 1438957256, -1438957247, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.getStatusCode
            public final byte[] getAip() {
                return (byte[]) valueOf(new java.lang.Object[]{this}, 1248155501, -1248155501, java.lang.System.identityHashCode(this));
            }
        };
        int i9 = DigitizedCardProfile + 37;
        AlternateContactlessPaymentDataJson = i9 % 128;
        if (i9 % 2 == 0) {
            return getstatuscode;
        }
        throw null;
    }

    static com.payair.hce.getStatusCode writeReplace(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json) {
        return (com.payair.hce.getStatusCode) valueOf(new java.lang.Object[]{dsrpDataV2Json}, -1503898026, 1503898027, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.setErrorName values(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return (com.payair.hce.setErrorName) valueOf(new java.lang.Object[]{str, str2, str3, str4}, -924716355, 924716358, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.JsonResponse DigitizedCardProfile(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.setTransitionAlpha settransitionalpha) {
        return (com.payair.hce.JsonResponse) valueOf(new java.lang.Object[]{digitizedCardProfileV2Json, initializevisapaymentsdk, settransitionalpha}, 1637749163, -1637749163, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.checkForSuccess AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.setTransitionAlpha settransitionalpha) {
        return (com.payair.hce.checkForSuccess) valueOf(new java.lang.Object[]{digitizedCardProfileV2Json, initializevisapaymentsdk, settransitionalpha}, -2013748298, 2013748300, (int) java.lang.System.currentTimeMillis());
    }
}
