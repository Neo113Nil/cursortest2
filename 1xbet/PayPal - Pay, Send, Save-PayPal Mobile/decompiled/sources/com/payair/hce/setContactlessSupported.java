package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContactlessSupported extends java.lang.Enum<com.payair.hce.setContactlessSupported> {
    private static int DigitizedCardProfile = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    /* renamed from: com.payair.hce.setContactlessSupported$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        private static int DigitizedCardProfile = 0;
        static final /* synthetic */ int[] values;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[com.payair.hce.requestTaskStatusUpdate.values().length];
            values = iArr;
            try {
                iArr[com.payair.hce.requestTaskStatusUpdate.valueOf.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.AlternateContactlessPaymentDataJson.ordinal()] = 2;
                int i = DigitizedCardProfile;
                int i2 = ((i | 114) << 1) - (i ^ 114);
                int i3 = (~i2) + (i2 << 1);
                writeReplace = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.values.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getAip.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.DigitizedCardProfile.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.writeReplace.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getAid.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getProfileVersion.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.IccPrivateKeyCrtComponentsJson.ordinal()] = 9;
                int i5 = writeReplace;
                int i6 = (i5 & (-72)) | ((~i5) & 71);
                int i7 = -(-((i5 & 71) << 1));
                DigitizedCardProfile = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.RecordsJson.ordinal()] = 10;
                int i8 = DigitizedCardProfile;
                writeReplace = ((-2) - (~((i8 & 24) + (i8 | 24)))) % 128;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreAlternateContactlessPaymentDataImpl.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreBusinessLogicModuleImpl.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getGpoResponse.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCvrMaskAnd.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCiacDecline.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPaymentFci.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getApplicationLifeCycleData.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCardLayoutDescription.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getDualTapResetTimeout.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getSecurityWord.ordinal()] = 20;
                int i9 = DigitizedCardProfile;
                int i10 = i9 & 121;
                int i11 = i9 | 121;
                writeReplace = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCvmResetTimeout.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getMchipCvmIssuerOptions.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCardholderValidators.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getAdditionalCheckTable.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getMagstripeCvmIssuerOptions.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreCardRiskManagementDataImpl.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPpseFci.ordinal()] = 27;
                int i12 = writeReplace;
                int i13 = i12 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                DigitizedCardProfile = ((((i12 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i13) << 1) - i13) % 128;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCrmCountryCode.ordinal()] = 28;
                int i14 = DigitizedCardProfile;
                writeReplace = (((i14 & 102) + (i14 | 102)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreContactlessPaymentDataImpl.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCdol1RelatedDataLength.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getIccPrivateKeyCrtComponents.ordinal()] = 31;
                int i15 = writeReplace;
                int i16 = i15 & 5;
                int i17 = (5 ^ i15) | i16;
                int i18 = (i16 & i17) + (i17 | i16);
                DigitizedCardProfile = i18 % 128;
                int i19 = i18 % 2;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCiacDeclineOnPpms.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getAlternateContactlessPaymentData.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getIssuerApplicationData.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreDigitizedCardProfileImpl.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getRecords.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getDigitizedCardId.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.build.ordinal()] = 39;
                int i20 = writeReplace;
                int i21 = i20 & 93;
                DigitizedCardProfile = ((((i20 | 93) & (~i21)) - (~(i21 << 1))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getMaximumPinTry.ordinal()] = 40;
                DigitizedCardProfile = (writeReplace + 15) % 128;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getBusinessLogicModule.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.wipe.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getMppLiteModule.ordinal()] = 43;
                int i22 = writeReplace;
                DigitizedCardProfile = (((i22 & 117) - (~(i22 | 117))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCardMetadata.ordinal()] = 44;
                int i23 = writeReplace;
                int i24 = ((((i23 ^ 119) | (i23 & 119)) << 1) - (~(-((i23 & (-120)) | ((~i23) & 119))))) - 1;
                DigitizedCardProfile = i24 % 128;
                int i25 = i24 % 2;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getContent.ordinal()] = 45;
                int i26 = DigitizedCardProfile;
                writeReplace = ((i26 & 71) + (i26 | 71)) % 128;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getDp.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getDq.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getQ.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getP.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreIccPrivateKeyCrtComponentsImpl.ordinal()] = 50;
                int i27 = DigitizedCardProfile;
                int i28 = i27 & 25;
                int i29 = (((i27 ^ 25) | i28) << 1) - ((i27 | 25) & (~i28));
                writeReplace = i29 % 128;
                int i30 = i29 % 2;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPinPreEntryAllowed.ordinal()] = 51;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided.ordinal()] = 52;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getU.ordinal()] = 53;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreMChipCvmIssuerOptionsImpl.ordinal()] = 54;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided.ordinal()] = 55;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getAckPreEntryAllowed.ordinal()] = 56;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyProvided.ordinal()] = 57;
                int i31 = DigitizedCardProfile + 121;
                writeReplace = i31 % 128;
                int i32 = i31 % 2;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getPinAutomaticallyResetByApplication.ordinal()] = 58;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getCardRiskManagementData.ordinal()] = 59;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreMppLiteModuleImpl.ordinal()] = 60;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreMagstripeCvmIssuerOptionsImpl.ordinal()] = 61;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getContactlessPaymentData.ordinal()] = 62;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getRemotePaymentData.ordinal()] = 63;
                int i33 = DigitizedCardProfile;
                int i34 = (-2) - (~(((i33 | 106) << 1) - (i33 ^ 106)));
                writeReplace = i34 % 128;
                int i35 = i34 % 2;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getSfi.ordinal()] = 64;
                int i36 = writeReplace;
                int i37 = (-2) - (~((i36 ^ 114) + ((i36 & 114) << 1)));
                DigitizedCardProfile = i37 % 128;
                int i38 = i37 % 2;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getRecordValue.ordinal()] = 65;
            } catch (java.lang.NoSuchFieldError unused65) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl.ordinal()] = 66;
                int i39 = DigitizedCardProfile;
                int i40 = i39 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i41 = (i39 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i40);
                int i42 = i40 << 1;
                writeReplace = (((i41 | i42) << 1) - (i41 ^ i42)) % 128;
            } catch (java.lang.NoSuchFieldError unused66) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.getRecordNumber.ordinal()] = 67;
            } catch (java.lang.NoSuchFieldError unused67) {
            }
            try {
                values[com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl.ordinal()] = 68;
            } catch (java.lang.NoSuchFieldError unused68) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = (com.payair.hce.requestTaskStatusUpdate) objArr[0];
        int i = values;
        DigitizedCardProfile = ((i & 53) + (i | 53)) % 128;
        switch (com.payair.hce.setContactlessSupported.AnonymousClass3.values[requesttaskstatusupdate.ordinal()]) {
            case 1:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 2:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 3:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 4:
                return new com.payair.hce.getContactlessSupported((char) 27013);
            case 5:
                com.payair.hce.getContactlessSupported getcontactlesssupported = new com.payair.hce.getContactlessSupported((char) 28416);
                int i2 = DigitizedCardProfile;
                values = (((i2 & 111) - (~(i2 | 111))) - 1) % 128;
                return getcontactlesssupported;
            case 6:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 7:
                com.payair.hce.getContactlessSupported getcontactlesssupported2 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i3 = values;
                int i4 = i3 & 65;
                int i5 = -(-(i3 | 65));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                DigitizedCardProfile = i6 % 128;
                if (i6 % 2 != 0) {
                    return getcontactlesssupported2;
                }
                throw new java.lang.ArithmeticException();
            case 8:
                com.payair.hce.getContactlessSupported getcontactlesssupported3 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i7 = values;
                int i8 = (i7 & (-40)) | ((~i7) & 39);
                int i9 = -(-((i7 & 39) << 1));
                DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
                return getcontactlesssupported3;
            case 9:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 10:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 11:
                com.payair.hce.getContactlessSupported getcontactlesssupported4 = new com.payair.hce.getContactlessSupported((char) 25856);
                int i10 = DigitizedCardProfile + 27;
                values = i10 % 128;
                if (i10 % 2 == 0) {
                    return getcontactlesssupported4;
                }
                throw null;
            case 12:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 13:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 14:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 15:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 16:
                com.payair.hce.getContactlessSupported getcontactlesssupported5 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i11 = DigitizedCardProfile + 15;
                values = i11 % 128;
                if (i11 % 2 == 0) {
                    return getcontactlesssupported5;
                }
                throw null;
            case 17:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 18:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 19:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 20:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 21:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 22:
                com.payair.hce.getContactlessSupported getcontactlesssupported6 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i12 = DigitizedCardProfile + 83;
                values = i12 % 128;
                if (i12 % 2 == 0) {
                    return getcontactlesssupported6;
                }
                throw new java.lang.ArithmeticException();
            case 23:
                com.payair.hce.getContactlessSupported getcontactlesssupported7 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i13 = values;
                int i14 = (i13 | 47) << 1;
                int i15 = -((i13 & (-48)) | ((~i13) & 47));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                DigitizedCardProfile = i16 % 128;
                if (i16 % 2 != 0) {
                    return getcontactlesssupported7;
                }
                throw new java.lang.ArithmeticException();
            case 24:
                com.payair.hce.getContactlessSupported getcontactlesssupported8 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i17 = DigitizedCardProfile;
                int i18 = i17 & 105;
                int i19 = -(-((i17 ^ 105) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                values = i20 % 128;
                if (i20 % 2 == 0) {
                    return getcontactlesssupported8;
                }
                throw null;
            case 25:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 26:
                com.payair.hce.getContactlessSupported getcontactlesssupported9 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i21 = DigitizedCardProfile & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                values = ((((r0 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i21)) - (~(i21 << 1))) - 1) % 128;
                return getcontactlesssupported9;
            case 27:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 28:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 29:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 30:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 31:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 32:
                com.payair.hce.getContactlessSupported getcontactlesssupported10 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i22 = values + 25;
                DigitizedCardProfile = i22 % 128;
                if (i22 % 2 != 0) {
                    return getcontactlesssupported10;
                }
                throw new java.lang.ArithmeticException();
            case 33:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 34:
                com.payair.hce.getContactlessSupported getcontactlesssupported11 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i23 = values;
                int i24 = (i23 & (-70)) | ((~i23) & 69);
                int i25 = (i23 & 69) << 1;
                int i26 = (i24 & i25) + (i25 | i24);
                DigitizedCardProfile = i26 % 128;
                if (i26 % 2 != 0) {
                    return getcontactlesssupported11;
                }
                throw null;
            case 35:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 36:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 37:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 38:
                com.payair.hce.getContactlessSupported getcontactlesssupported12 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i27 = DigitizedCardProfile;
                values = ((((i27 & (-100)) | ((~i27) & 99)) - (~((i27 & 99) << 1))) - 1) % 128;
                return getcontactlesssupported12;
            case 39:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 40:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 41:
                return new com.payair.hce.getContactlessSupported((char) 25856);
            case 42:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 43:
                return new com.payair.hce.getContactlessSupported((char) 26368);
            case 44:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 45:
                return new com.payair.hce.getContactlessSupported((char) 27904);
            case 46:
                return new com.payair.hce.getContactlessSupported((char) 28160);
            case 47:
                com.payair.hce.getContactlessSupported getcontactlesssupported13 = new com.payair.hce.getContactlessSupported((char) 27270);
                int i28 = values;
                DigitizedCardProfile = (((i28 | 7) << 1) - (i28 ^ 7)) % 128;
                return getcontactlesssupported13;
            case 48:
                com.payair.hce.getContactlessSupported getcontactlesssupported14 = new com.payair.hce.getContactlessSupported((char) 26368);
                int i29 = DigitizedCardProfile;
                values = (((i29 & 32) + (i29 | 32)) - 1) % 128;
                return getcontactlesssupported14;
            case 49:
                com.payair.hce.getContactlessSupported getcontactlesssupported15 = new com.payair.hce.getContactlessSupported((char) 26368);
                DigitizedCardProfile = (values + 125) % 128;
                return getcontactlesssupported15;
            case 50:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 51:
                return new com.payair.hce.getContactlessSupported((char) 27266);
            case 52:
                com.payair.hce.getContactlessSupported getcontactlesssupported16 = new com.payair.hce.getContactlessSupported((char) 27013);
                int i30 = DigitizedCardProfile;
                int i31 = i30 & 9;
                int i32 = (i31 - (~(-(-((i30 ^ 9) | i31))))) - 1;
                values = i32 % 128;
                if (i32 % 2 == 0) {
                    return getcontactlesssupported16;
                }
                throw null;
            case 53:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 54:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 55:
                return new com.payair.hce.getContactlessSupported((char) 26368);
            case 56:
                return new com.payair.hce.getContactlessSupported((char) 27013);
            case 57:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 58:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 59:
                return new com.payair.hce.getContactlessSupported((char) 27267);
            case 60:
                return new com.payair.hce.getContactlessSupported((char) 27267);
            case 61:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 62:
                com.payair.hce.getContactlessSupported getcontactlesssupported17 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i33 = DigitizedCardProfile;
                int i34 = (i33 & 107) + (i33 | 107);
                values = i34 % 128;
                if (i34 % 2 == 0) {
                    return getcontactlesssupported17;
                }
                throw new java.lang.ArithmeticException();
            case 63:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 64:
                return new com.payair.hce.getContactlessSupported((char) 28416);
            case 65:
                return new com.payair.hce.getContactlessSupported((char) 27010);
            case 66:
                com.payair.hce.getContactlessSupported getcontactlesssupported18 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i35 = DigitizedCardProfile;
                int i36 = (i35 & 71) + (i35 | 71);
                values = i36 % 128;
                if (i36 % 2 == 0) {
                    return getcontactlesssupported18;
                }
                throw null;
            case 67:
                return new com.payair.hce.getContactlessSupported((char) 27009);
            case 68:
                return new com.payair.hce.getContactlessSupported((char) 25856);
            default:
                com.payair.hce.getContactlessSupported getcontactlesssupported19 = new com.payair.hce.getContactlessSupported((char) 28416);
                int i37 = DigitizedCardProfile;
                int i38 = i37 & 23;
                int i39 = ((i37 ^ 23) | i38) << 1;
                int i40 = -((i37 | 23) & (~i38));
                int i41 = (i39 & i40) + (i40 | i39);
                values = i41 % 128;
                if (i41 % 2 == 0) {
                    return getcontactlesssupported19;
                }
                throw new java.lang.ArithmeticException();
        }
    }

    public static com.payair.hce.getContactlessSupported valueOf(com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate) {
        return (com.payair.hce.getContactlessSupported) writeReplace(new java.lang.Object[]{requesttaskstatusupdate}, -57886224, 57886224, (int) java.lang.System.currentTimeMillis());
    }
}
