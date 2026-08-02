package com.payair.hce;

/* loaded from: classes4.dex */
public class getAtcCount extends java.lang.Exception {
    private static int values = 1;
    private static int writeReplace;
    private com.payair.hce.requestTaskStatusUpdate AlternateContactlessPaymentDataJson;
    private com.payair.hce.replenishToken DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i) | i2;
        int i5 = ~i3;
        if ((i * 141) + (i2 * (-279)) + ((i2 | i3) * 140) + (((~i4) | (~(i5 | i2))) * (-280)) + (((~(i | (~i2))) | (~(i5 | i)) | (~(i4 | i3))) * 140) == 1) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.getAtcCount getatccount = (com.payair.hce.getAtcCount) objArr[0];
        int i6 = values;
        int i7 = i6 & 105;
        writeReplace = ((((i6 ^ 105) | i7) << 1) - ((~i7) & (i6 | 105))) % 128;
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = getatccount.AlternateContactlessPaymentDataJson;
        int i8 = i6 & 97;
        int i9 = -(-((i6 ^ 97) | i8));
        writeReplace = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        return requesttaskstatusupdate;
    }

    public getAtcCount(com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate) {
        super(requesttaskstatusupdate.toString());
        this.AlternateContactlessPaymentDataJson = requesttaskstatusupdate;
    }

    public getAtcCount(com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate, java.lang.String str) {
        super(str);
        this.AlternateContactlessPaymentDataJson = requesttaskstatusupdate;
    }

    public void DigitizedCardProfile() throws com.payair.hce.removeCardManagerListener {
        writeReplace = (values + 9) % 128;
    }

    /* renamed from: com.payair.hce.getAtcCount$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int AlternateContactlessPaymentDataJson = 0;
        static final /* synthetic */ int[] DigitizedCardProfile;
        private static int values = 1;

        static {
            int[] iArr = new int[com.payair.hce.requestTaskStatusUpdate.values().length];
            DigitizedCardProfile = iArr;
            try {
                iArr[com.payair.hce.requestTaskStatusUpdate.getAip.ordinal()] = 1;
                int i = values;
                int i2 = ((i ^ 1) | (i & 1)) << 1;
                int i3 = -((i & (-2)) | ((~i) & 1));
                int i4 = (i2 & i3) + (i3 | i2);
                AlternateContactlessPaymentDataJson = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.valueOf.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.AlternateContactlessPaymentDataJson.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.values.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.DigitizedCardProfile.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.writeReplace.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getAid.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getProfileVersion.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.IccPrivateKeyCrtComponentsJson.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.RecordsJson.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreAlternateContactlessPaymentDataImpl.ordinal()] = 11;
                int i6 = AlternateContactlessPaymentDataJson;
                int i7 = (i6 & 115) + (i6 | 115);
                values = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreBusinessLogicModuleImpl.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getGpoResponse.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCvrMaskAnd.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCiacDecline.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPaymentFci.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getApplicationLifeCycleData.ordinal()] = 17;
                int i9 = AlternateContactlessPaymentDataJson + 9;
                values = i9 % 128;
                int i10 = i9 % 2;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCardLayoutDescription.ordinal()] = 18;
                int i11 = AlternateContactlessPaymentDataJson;
                values = ((-2) - (~(((i11 | 92) << 1) - (i11 ^ 92)))) % 128;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getDualTapResetTimeout.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getSecurityWord.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCvmResetTimeout.ordinal()] = 21;
                int i12 = AlternateContactlessPaymentDataJson;
                int i13 = (i12 & 94) + (i12 | 94);
                values = ((~i13) + (i13 << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getMchipCvmIssuerOptions.ordinal()] = 22;
                int i14 = values;
                int i15 = (((i14 & (-92)) | ((~i14) & 91)) - (~(-(-((i14 & 91) << 1))))) - 1;
                AlternateContactlessPaymentDataJson = i15 % 128;
                int i16 = i15 % 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCardholderValidators.ordinal()] = 23;
                int i17 = AlternateContactlessPaymentDataJson;
                int i18 = i17 ^ 75;
                int i19 = (i17 & 75) << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                values = i20 % 128;
                int i21 = i20 % 2;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getAdditionalCheckTable.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getMagstripeCvmIssuerOptions.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreCardRiskManagementDataImpl.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPpseFci.ordinal()] = 27;
                int i22 = values;
                int i23 = i22 & 53;
                AlternateContactlessPaymentDataJson = (i23 + ((i22 ^ 53) | i23)) % 128;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCrmCountryCode.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreContactlessPaymentDataImpl.ordinal()] = 29;
                int i24 = values;
                int i25 = i24 ^ 51;
                int i26 = (i24 & 51) << 1;
                int i27 = (i25 & i26) + (i26 | i25);
                AlternateContactlessPaymentDataJson = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 3 / 4;
                }
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCdol1RelatedDataLength.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getIccPrivateKeyCrtComponents.ordinal()] = 31;
                values = ((-2) - (~(AlternateContactlessPaymentDataJson + 42))) % 128;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCiacDeclineOnPpms.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getAlternateContactlessPaymentData.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getIssuerApplicationData.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreDigitizedCardProfileImpl.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getRecords.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getDigitizedCardId.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.build.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getMaximumPinTry.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.wipe.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getMppLiteModule.ordinal()] = 43;
                int i29 = AlternateContactlessPaymentDataJson;
                values = (((i29 ^ 50) + ((i29 & 50) << 1)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCardMetadata.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getContent.ordinal()] = 45;
                int i30 = values;
                int i31 = (i30 & 87) + (i30 | 87);
                AlternateContactlessPaymentDataJson = i31 % 128;
                int i32 = i31 % 2;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getDp.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getDq.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getQ.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getP.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreIccPrivateKeyCrtComponentsImpl.ordinal()] = 50;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPinPreEntryAllowed.ordinal()] = 51;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided.ordinal()] = 52;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getU.ordinal()] = 53;
                int i33 = AlternateContactlessPaymentDataJson + 79;
                values = i33 % 128;
                int i34 = i33 % 2;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreMChipCvmIssuerOptionsImpl.ordinal()] = 54;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided.ordinal()] = 55;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getAckPreEntryAllowed.ordinal()] = 56;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyProvided.ordinal()] = 57;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getPinAutomaticallyResetByApplication.ordinal()] = 58;
                int i35 = values;
                AlternateContactlessPaymentDataJson = (((i35 ^ 64) + ((i35 & 64) << 1)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getCardRiskManagementData.ordinal()] = 59;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i36 = 1602156957 & currentTimeMillis;
                int i37 = (1602156957 | currentTimeMillis) & (~i36);
                int i38 = ~((i36 ^ i37) | (i37 & i36));
                int i39 = ~currentTimeMillis;
                int i40 = (i39 & (-1594767758)) | (i39 ^ (-1594767758));
                int i41 = (-1081534741) ^ i40;
                int i42 = i40 & (-1081534741);
                int i43 = (i42 ^ i41) | (i42 & i41);
                int i44 = ~i43;
                int i45 = (i43 | i44) & i44;
                int i46 = i38 & i45;
                int i47 = (i38 | i45) & (~i46);
                int i48 = (-2) - (~(1618006954 - (~(-(~(((i47 ^ i46) | (i47 & i46)) * (-318)))))));
                int i49 = currentTimeMillis & (-1594767758);
                int i50 = ((-1594767758) | currentTimeMillis) & (~i49);
                int i51 = ~((i50 ^ i49) | (i49 & i50));
                int i52 = ((~i51) & 520622217) | ((-520622218) & i51);
                int i53 = i51 & 520622217;
                int i54 = -(~(((i53 ^ i52) | (i53 & i52)) * (-318)));
                int i55 = (i39 & 1594767757) | i49;
                int i56 = currentTimeMillis & 1594767757;
                int i57 = ~((i56 ^ i55) | (i56 & i55));
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i58 = currentTimeMillis2 & (-660027485);
                int i59 = (~i58) & (currentTimeMillis2 | (-660027485));
                int i60 = ~((i58 ^ i59) | (i58 & i59));
                int i61 = 22358104 & i60;
                int i62 = (-445279387) - (~(-(~((((i60 | 22358104) & (~i61)) | i61) * 104))));
                int i63 = (~i62) + (i62 << 1);
                int i64 = (~currentTimeMillis2) | (-780800518);
                int i65 = ((-660027485) & i64) | ((~i64) & 660027484);
                int i66 = i64 & 660027484;
                int i67 = (~((i65 ^ i66) | (i65 & i66))) * (-104);
                int i68 = ((~i67) & i63) | ((~i63) & i67);
                int i69 = (i67 & i63) << 1;
                int i70 = (i68 & i69) + (i69 | i68);
                int i71 = -(-(((currentTimeMillis2 ^ (-780800518)) | (currentTimeMillis2 & (-780800518))) * 104));
                int i72 = i70 ^ i71;
                int i73 = (i71 & i70) << 1;
                if (((((i48 | i54) << 1) - (i48 ^ i54)) - 1) + (((i57 ^ 1081534740) | (1081534740 & i57)) * 318) <= ((i72 | i73) << 1) - (i73 ^ i72)) {
                    int i74 = 2 / 5;
                }
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreMppLiteModuleImpl.ordinal()] = 60;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.SdkCoreMagstripeCvmIssuerOptionsImpl.ordinal()] = 61;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getRecordNumber.ordinal()] = 62;
                int i75 = AlternateContactlessPaymentDataJson;
                int i76 = i75 & 7;
                int i77 = i76 + ((i75 ^ 7) | i76);
                values = i77 % 128;
                int i78 = i77 % 2;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getContactlessPaymentData.ordinal()] = 63;
                int i79 = AlternateContactlessPaymentDataJson;
                int i80 = i79 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i81 = -(-((i79 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i80));
                values = ((i80 ^ i81) + ((i81 & i80) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getRemotePaymentData.ordinal()] = 64;
                int i82 = AlternateContactlessPaymentDataJson;
                int i83 = i82 & 121;
                int i84 = -(-((i82 ^ 121) | i83));
                values = ((i83 & i84) + (i84 | i83)) % 128;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.requestTaskStatusUpdate.getSfi.ordinal()] = 65;
                int i85 = AlternateContactlessPaymentDataJson;
                int i86 = ((i85 & 78) + (i85 | 78)) - 1;
                values = i86 % 128;
                if (i86 % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.NoSuchFieldError unused65) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getAtcCount getatccount = (com.payair.hce.getAtcCount) objArr[0];
        int i = values;
        writeReplace = ((i ^ 79) + ((i & 79) << 1)) % 128;
        com.payair.hce.replenishToken replenishtoken = getatccount.DigitizedCardProfile;
        switch (com.payair.hce.getAtcCount.AnonymousClass5.DigitizedCardProfile[getatccount.AlternateContactlessPaymentDataJson.ordinal()]) {
            case 1:
            case 2:
            case 3:
                com.payair.hce.replenishToken replenishtoken2 = com.payair.hce.replenishToken.DigitizedCardProfile;
                int i2 = values;
                int i3 = (i2 | 73) << 1;
                int i4 = -((i2 & (-74)) | ((~i2) & 73));
                writeReplace = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
                return replenishtoken2;
            case 4:
                com.payair.hce.replenishToken replenishtoken3 = com.payair.hce.replenishToken.writeReplace;
                int i5 = writeReplace;
                int i6 = i5 & 9;
                values = ((((i5 ^ 9) | i6) << 1) - ((i5 | 9) & (~i6))) % 128;
                return replenishtoken3;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                com.payair.hce.replenishToken replenishtoken4 = com.payair.hce.replenishToken.DigitizedCardProfile;
                writeReplace = (values + 113) % 128;
                return replenishtoken4;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                com.payair.hce.replenishToken replenishtoken5 = com.payair.hce.replenishToken.valueOf;
                int i7 = writeReplace;
                int i8 = i7 & 25;
                int i9 = (i8 - (~(-(-((i7 ^ 25) | i8))))) - 1;
                values = i9 % 128;
                if (i9 % 2 != 0) {
                    return replenishtoken5;
                }
                throw new java.lang.ArithmeticException();
            default:
                com.payair.hce.replenishToken replenishtoken6 = com.payair.hce.replenishToken.DigitizedCardProfile;
                int i10 = writeReplace;
                int i11 = i10 & 41;
                int i12 = (i10 | 41) & (~i11);
                int i13 = -(-(i11 << 1));
                values = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
                return replenishtoken6;
        }
    }

    public final com.payair.hce.replenishToken writeReplace() {
        return (com.payair.hce.replenishToken) writeReplace(new java.lang.Object[]{this}, 763524424, -763524423, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.requestTaskStatusUpdate values() {
        return (com.payair.hce.requestTaskStatusUpdate) writeReplace(new java.lang.Object[]{this}, -58351927, 58351927, java.lang.System.identityHashCode(this));
    }
}
