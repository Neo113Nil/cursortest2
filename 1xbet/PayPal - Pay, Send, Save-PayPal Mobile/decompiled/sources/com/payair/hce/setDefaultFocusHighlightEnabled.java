package com.payair.hce;

/* loaded from: classes4.dex */
public final class setDefaultFocusHighlightEnabled extends com.payair.hce.setVerticalScrollBarEnabled {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int RecordsJson;
    private int DigitizedCardProfile = 0;
    private final android.content.SharedPreferences SdkCoreAlternateContactlessPaymentDataImpl;
    private boolean getProfileVersion;
    private final android.content.Context valueOf;
    private final com.payair.hce.setPressed values;
    private final com.payair.hce.setDrawingCacheQuality writeReplace;

    public interface writeReplace {
        void writeReplace();
    }

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i3 | i2);
        switch ((i * (-391)) + (i2 * (-195)) + (((~(i4 | i)) | i5) * (-196)) + ((i2 | i) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY) + (((~((~i) | i4)) | i5) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)) {
            case 1:
                com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
                com.payair.hce.suspendCardForToken suspendcardfortoken = (com.payair.hce.suspendCardForToken) objArr[1];
                int i6 = RecordsJson;
                IccPrivateKeyCrtComponentsJson = (((i6 ^ 20) + ((i6 & 20) << 1)) - 1) % 128;
                setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson = suspendcardfortoken;
                int i7 = IccPrivateKeyCrtComponentsJson;
                int i8 = i7 & 109;
                RecordsJson = ((((i7 | 109) & (~i8)) - (~(i8 << 1))) - 1) % 128;
                return null;
            case 2:
                return valueOf(objArr);
            case 3:
                int i9 = IccPrivateKeyCrtComponentsJson;
                int i10 = i9 | 109;
                int i11 = (i10 << 1) - ((~(i9 & 109)) & i10);
                RecordsJson = i11 % 128;
                return java.lang.Boolean.valueOf(i11 % 2 != 0);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return AlternateContactlessPaymentDataJson(objArr);
            case 6:
                return writeReplace(objArr);
            case 7:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 8:
                return RecordsJson(objArr);
            case 9:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 10:
                return getAid(objArr);
            default:
                return values(objArr);
        }
    }

    setDefaultFocusHighlightEnabled(android.content.Context context, boolean z) {
        this.valueOf = context;
        this.values = new com.payair.hce.setPressed(context);
        this.writeReplace = new com.payair.hce.setDrawingCacheQuality(context);
        this.SdkCoreAlternateContactlessPaymentDataImpl = context.getSharedPreferences("LocallyVerifiedValidator", 0);
        this.getProfileVersion = z;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences = (com.payair.hce.getMDESCardsUniqueTokenReferences) objArr[1];
        int i = RecordsJson;
        IccPrivateKeyCrtComponentsJson = (((i | 51) << 1) - (i ^ 51)) % 128;
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.valueOf) {
            int i2 = RecordsJson;
            int i3 = i2 & 83;
            int i4 = i3 + ((i2 ^ 83) | i3);
            IccPrivateKeyCrtComponentsJson = i4 % 128;
            if (i4 % 2 != 0) {
                setdefaultfocushighlightenabled.values.DigitizedCardProfile(getmdescardsuniquetokenreferences);
                return null;
            }
            setdefaultfocushighlightenabled.values.DigitizedCardProfile(getmdescardsuniquetokenreferences);
            throw new java.lang.ArithmeticException();
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.writeReplace) {
            int i5 = RecordsJson + 29;
            IccPrivateKeyCrtComponentsJson = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = setdefaultfocushighlightenabled.getProfileVersion;
                throw null;
            }
            if (setdefaultfocushighlightenabled.getProfileVersion) {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{setdefaultfocushighlightenabled}, -863748824, 863748830, java.lang.System.identityHashCode(setdefaultfocushighlightenabled));
                int i6 = IccPrivateKeyCrtComponentsJson;
                int i7 = i6 & 27;
                int i8 = -(-((i6 ^ 27) | i7));
                RecordsJson = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
            }
        }
        int i9 = RecordsJson;
        int i10 = ((i9 | 57) << 1) - (i9 ^ 57);
        IccPrivateKeyCrtComponentsJson = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        RecordsJson = ((((i | 58) << 1) - (i ^ 58)) - 1) % 128;
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.writeReplace) {
            int i2 = RecordsJson;
            int i3 = i2 & 33;
            int i4 = (i2 ^ 33) | i3;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            IccPrivateKeyCrtComponentsJson = i5 % 128;
            boolean z = setdefaultfocushighlightenabled.getProfileVersion;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (!z) {
                int i6 = (i2 ^ 44) + ((i2 & 44) << 1);
                int i7 = (~i6) + (i6 << 1);
                IccPrivateKeyCrtComponentsJson = i7 % 128;
                if (i7 % 2 != 0) {
                    return java.lang.Boolean.FALSE;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        int i8 = IccPrivateKeyCrtComponentsJson;
        int i9 = (i8 & 79) + (i8 | 79);
        RecordsJson = i9 % 128;
        if (i9 % 2 == 0) {
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        int i = RecordsJson;
        int i2 = i ^ 125;
        int i3 = -(-((i & 125) << 1));
        IccPrivateKeyCrtComponentsJson = ((i2 & i3) + (i3 | i2)) % 128;
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.DigitizedCardProfile) {
            int i4 = RecordsJson;
            int i5 = i4 & 47;
            int i6 = ((i4 ^ 47) | i5) << 1;
            int i7 = -((i4 | 47) & (~i5));
            IccPrivateKeyCrtComponentsJson = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            com.payair.hce.setDrawingCacheQuality setdrawingcachequality = setdefaultfocushighlightenabled.writeReplace;
            boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setDrawingCacheQuality.DigitizedCardProfile(new java.lang.Object[]{setdrawingcachequality}, 397604687, -397604686, java.lang.System.identityHashCode(setdrawingcachequality))).booleanValue();
            int i8 = IccPrivateKeyCrtComponentsJson;
            int i9 = i8 & 13;
            int i10 = i8 | 13;
            RecordsJson = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            return java.lang.Boolean.valueOf(booleanValue);
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.valueOf) {
            int i11 = IccPrivateKeyCrtComponentsJson;
            RecordsJson = ((i11 & 121) + (i11 | 121)) % 128;
            com.payair.hce.setPressed setpressed = setdefaultfocushighlightenabled.values;
            boolean booleanValue2 = ((java.lang.Boolean) com.payair.hce.setPressed.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setpressed}, 1199835196, -1199835196, java.lang.System.identityHashCode(setpressed))).booleanValue();
            int i12 = RecordsJson;
            IccPrivateKeyCrtComponentsJson = ((i12 & 37) + (i12 | 37)) % 128;
            return java.lang.Boolean.valueOf(booleanValue2);
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.writeReplace) {
            int i13 = IccPrivateKeyCrtComponentsJson;
            int i14 = (-2) - (~((i13 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1)));
            RecordsJson = i14 % 128;
            if (i14 % 2 != 0) {
                boolean z = setdefaultfocushighlightenabled.getProfileVersion;
                throw null;
            }
            if (setdefaultfocushighlightenabled.getProfileVersion) {
                int i15 = i13 & 43;
                RecordsJson = (i15 + ((i13 ^ 43) | i15)) % 128;
                if (((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setdefaultfocushighlightenabled}, 813597775, -813597768, java.lang.System.identityHashCode(setdefaultfocushighlightenabled))).booleanValue()) {
                    int i16 = IccPrivateKeyCrtComponentsJson;
                    int i17 = i16 & 73;
                    int i18 = (i16 | 73) & (~i17);
                    int i19 = -(-(i17 << 1));
                    RecordsJson = ((i18 & i19) + (i18 | i19)) % 128;
                    return bool;
                }
                int i20 = RecordsJson;
                int i21 = i20 & 77;
                int i22 = -(-((i20 ^ 77) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = i23 % 128;
                IccPrivateKeyCrtComponentsJson = i24;
                boolean z2 = i23 % 2 != 0;
                int i25 = i24 | 107;
                int i26 = i25 << 1;
                int i27 = -((~(i24 & 107)) & i25);
                RecordsJson = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
                return java.lang.Boolean.valueOf(z2);
            }
        }
        if (((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setdefaultfocushighlightenabled}, 1836195866, -1836195856, java.lang.System.identityHashCode(setdefaultfocushighlightenabled))).booleanValue()) {
            int i28 = IccPrivateKeyCrtComponentsJson;
            RecordsJson = ((i28 ^ 15) + ((i28 & 15) << 1)) % 128;
            return bool;
        }
        int i29 = RecordsJson;
        int i30 = i29 ^ 55;
        int i31 = ((i29 & 55) | i30) << 1;
        int i32 = -i30;
        int i33 = (((i31 | i32) << 1) - (i31 ^ i32)) % 128;
        IccPrivateKeyCrtComponentsJson = i33;
        int i34 = i33 & 5;
        int i35 = ((i33 ^ 5) | i34) << 1;
        int i36 = -((~i34) & (i33 | 5));
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        RecordsJson = i37 % 128;
        if (i37 % 2 == 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        long j;
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 19) % 128;
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.DigitizedCardProfile) {
            int i = IccPrivateKeyCrtComponentsJson;
            RecordsJson = (((i & 34) + (i | 34)) - 1) % 128;
            com.payair.hce.setDrawingCacheQuality setdrawingcachequality = setdefaultfocushighlightenabled.writeReplace;
            long longValue = ((java.lang.Long) com.payair.hce.setDrawingCacheQuality.DigitizedCardProfile(new java.lang.Object[]{setdrawingcachequality}, -1002511576, 1002511578, java.lang.System.identityHashCode(setdrawingcachequality))).longValue();
            int i2 = IccPrivateKeyCrtComponentsJson;
            int i3 = ((i2 & 53) - (~(-(-(i2 | 53))))) - 1;
            RecordsJson = i3 % 128;
            if (i3 % 2 == 0) {
                return java.lang.Long.valueOf(longValue);
            }
            throw new java.lang.ArithmeticException();
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.valueOf) {
            int i4 = IccPrivateKeyCrtComponentsJson;
            int i5 = i4 & 109;
            int i6 = (i4 | 109) & (~i5);
            int i7 = -(-(i5 << 1));
            RecordsJson = ((i6 & i7) + (i6 | i7)) % 128;
            long writeReplace2 = setdefaultfocushighlightenabled.values.writeReplace();
            int i8 = IccPrivateKeyCrtComponentsJson;
            int i9 = i8 & 43;
            int i10 = (i8 ^ 43) | i9;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            RecordsJson = i11 % 128;
            if (i11 % 2 == 0) {
                return java.lang.Long.valueOf(writeReplace2);
            }
            throw null;
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.writeReplace) {
            int i12 = RecordsJson;
            int i13 = i12 ^ 39;
            int i14 = ((i12 & 39) | i13) << 1;
            int i15 = -i13;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            IccPrivateKeyCrtComponentsJson = i16 % 128;
            if (i16 % 2 == 0) {
                boolean z = setdefaultfocushighlightenabled.getProfileVersion;
                throw null;
            }
            if (setdefaultfocushighlightenabled.getProfileVersion) {
                j = setdefaultfocushighlightenabled.values.writeReplace();
                int i17 = RecordsJson;
                IccPrivateKeyCrtComponentsJson = ((i17 ^ 109) + ((i17 & 109) << 1)) % 128;
                return java.lang.Long.valueOf(j);
            }
        }
        int i18 = RecordsJson;
        int i19 = i18 & 97;
        int i20 = (i18 ^ 97) | i19;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        IccPrivateKeyCrtComponentsJson = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
        j = 0;
        return java.lang.Long.valueOf(j);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i & (-16)) | ((~i) & 15);
        int i3 = -(-((i & 15) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        RecordsJson = i4 % 128;
        if (i4 % 2 != 0) {
            com.payair.hce.suspendCardForToken suspendcardfortoken = setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson;
            com.payair.hce.suspendCardForToken suspendcardfortoken2 = com.payair.hce.suspendCardForToken.DigitizedCardProfile;
            throw new java.lang.ArithmeticException();
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.DigitizedCardProfile) {
            com.payair.hce.setDrawingCacheQuality setdrawingcachequality = setdefaultfocushighlightenabled.writeReplace;
            com.payair.hce.setDrawingCacheQuality.DigitizedCardProfile(new java.lang.Object[]{setdrawingcachequality}, 773653097, -773653094, java.lang.System.identityHashCode(setdrawingcachequality));
            int i5 = RecordsJson;
            int i6 = i5 & 3;
            int i7 = (i5 | 3) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            IccPrivateKeyCrtComponentsJson = i9 % 128;
            if (i9 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (setdefaultfocushighlightenabled.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.valueOf) {
            int i10 = RecordsJson;
            IccPrivateKeyCrtComponentsJson = ((((i10 & (-102)) | ((~i10) & 101)) - (~((i10 & 101) << 1))) - 1) % 128;
            setdefaultfocushighlightenabled.values.DigitizedCardProfile(0L);
            int i11 = RecordsJson;
            int i12 = i11 & 53;
            int i13 = (i11 ^ 53) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            IccPrivateKeyCrtComponentsJson = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 / 4;
            }
        }
        int i16 = IccPrivateKeyCrtComponentsJson;
        RecordsJson = ((i16 ^ 85) + ((i16 & 85) << 1)) % 128;
        return null;
    }

    final void valueOf(long j) {
        synchronized (this) {
            int i = RecordsJson;
            int i2 = (-2) - (~((i & 14) + (i | 14)));
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.suspendCardForToken suspendcardfortoken = this.AlternateContactlessPaymentDataJson;
                com.payair.hce.suspendCardForToken suspendcardfortoken2 = com.payair.hce.suspendCardForToken.valueOf;
                throw new java.lang.ArithmeticException();
            }
            if (this.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.valueOf) {
                int i3 = IccPrivateKeyCrtComponentsJson;
                int i4 = i3 & 3;
                int i5 = i4 + ((i3 ^ 3) | i4);
                RecordsJson = i5 % 128;
                if (i5 % 2 == 0) {
                    this.values.DigitizedCardProfile(j);
                    return;
                } else {
                    this.values.DigitizedCardProfile(j);
                    throw null;
                }
            }
            if (this.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.DigitizedCardProfile) {
                int i6 = RecordsJson;
                int i7 = i6 & 37;
                int i8 = -(-((i6 ^ 37) | i7));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                IccPrivateKeyCrtComponentsJson = i9 % 128;
                if (i9 % 2 != 0) {
                    com.payair.hce.setDrawingCacheQuality setdrawingcachequality = this.writeReplace;
                    com.payair.hce.setDrawingCacheQuality.DigitizedCardProfile(new java.lang.Object[]{setdrawingcachequality, java.lang.Long.valueOf(j)}, -1379219444, 1379219444, java.lang.System.identityHashCode(setdrawingcachequality));
                    return;
                } else {
                    com.payair.hce.setDrawingCacheQuality setdrawingcachequality2 = this.writeReplace;
                    com.payair.hce.setDrawingCacheQuality.DigitizedCardProfile(new java.lang.Object[]{setdrawingcachequality2, java.lang.Long.valueOf(j)}, -1379219444, 1379219444, java.lang.System.identityHashCode(setdrawingcachequality2));
                    throw new java.lang.ArithmeticException();
                }
            }
            if (this.AlternateContactlessPaymentDataJson == com.payair.hce.suspendCardForToken.writeReplace) {
                int i10 = RecordsJson;
                int i11 = i10 ^ 63;
                int i12 = ((i10 & 63) | i11) << 1;
                int i13 = -i11;
                int i14 = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
                IccPrivateKeyCrtComponentsJson = i14;
                if (this.getProfileVersion) {
                    int i15 = i14 & 71;
                    int i16 = ((i14 ^ 71) | i15) << 1;
                    int i17 = -((~i15) & (i14 | 71));
                    RecordsJson = ((i16 & i17) + (i17 | i16)) % 128;
                    this.values.DigitizedCardProfile(j);
                    IccPrivateKeyCrtComponentsJson = (RecordsJson + 81) % 128;
                }
            }
            RecordsJson = (IccPrivateKeyCrtComponentsJson + 47) % 128;
            return;
        }
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        int identityHashCode = java.lang.System.identityHashCode(setdefaultfocushighlightenabled);
        int i = 1748596141 - (~(-(~(-(-((identityHashCode | (-2143051481)) * 988))))));
        int i2 = ~identityHashCode;
        int i3 = (i2 | identityHashCode) & i2;
        int i4 = i3 & (-1690066625);
        int i5 = (i3 | (-1690066625)) & (~i4);
        int i6 = ~((i5 ^ i4) | (i5 & i4));
        int i7 = i6 ^ 1150553600;
        int i8 = i6 & 1150553600;
        int i9 = ((i8 ^ i7) | (i8 & i7)) * (-1976);
        int i10 = i ^ i9;
        int i11 = ((i & i9) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        int i14 = (i2 & (-1603538457)) | (identityHashCode & 1603538456);
        int i15 = identityHashCode & (-1603538457);
        int i16 = ~((i15 ^ i14) | (i15 & i14));
        int i17 = i16 & (-2143051481);
        int i18 = (i16 | (-2143051481)) & (~i17);
        int i19 = (i18 ^ i17) | (i18 & i17);
        int i20 = ~((i2 ^ 1603538456) | (i2 & 1603538456));
        int i21 = -(~((((~i19) & i20) | ((~i20) & i19) | (i19 & i20)) * 988));
        int i22 = ~java.lang.System.identityHashCode(setdefaultfocushighlightenabled);
        int i23 = i22 & (-1027685216);
        int i24 = ((-1027685216) | i22) & (~i23);
        int i25 = ~((i24 ^ i23) | (i24 & i23));
        int i26 = i25 & 1074685978;
        int i27 = (i25 | 1074685978) & (~i26);
        int i28 = (((i27 ^ i26) | (i27 & i26)) * (-933)) - 1334731034;
        int i29 = ~((i22 ^ 1074685978) | (i22 & 1074685978));
        int i30 = (((~i29) & (-2102360928)) | (2102360927 & i29) | (i29 & (-2102360928))) * 933;
        int i31 = i28 | i30;
        int i32 = i31 << 1;
        int i33 = -((~(i30 & i28)) & i31);
        int i34 = (i32 & i33) + (i33 | i32);
        if (((i13 ^ i21) + ((i21 & i13) << 1)) - 1 <= (i34 & 1945059328) + (1945059328 | i34)) {
            boolean inKeyguardRestrictedInputMode = ((android.app.KeyguardManager) setdefaultfocushighlightenabled.valueOf.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            int i35 = IccPrivateKeyCrtComponentsJson;
            int i36 = (i35 ^ 39) + ((i35 & 39) << 1);
            RecordsJson = i36 % 128;
            if (i36 % 2 == 0) {
                return java.lang.Boolean.valueOf(inKeyguardRestrictedInputMode);
            }
            throw new java.lang.ArithmeticException();
        }
        ((android.app.KeyguardManager) setdefaultfocushighlightenabled.valueOf.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        setdefaultfocushighlightenabled.DigitizedCardProfile = 0;
        com.payair.hce.setLeft.values(new java.lang.Object[]{"TransactionCounter", 0, setdefaultfocushighlightenabled.SdkCoreAlternateContactlessPaymentDataImpl}, 987195454, -987195452, 0);
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 53) + ((i & 53) << 1);
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        int i = RecordsJson + 95;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0 ? ((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"TransactionCounter", 0, setdefaultfocushighlightenabled.SdkCoreAlternateContactlessPaymentDataImpl}, 654732084, -654732078, 0)).intValue() > 3 : ((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"TransactionCounter", 1, setdefaultfocushighlightenabled.SdkCoreAlternateContactlessPaymentDataImpl}, 654732084, -654732078, 1)).intValue() > 5) {
            int i2 = IccPrivateKeyCrtComponentsJson;
            int i3 = i2 & 113;
            int i4 = (((i2 | 113) & (~i3)) + (i3 << 1)) % 128;
            RecordsJson = i4;
            int i5 = (i4 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i4) & 109);
            int i6 = -(-((i4 & 109) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            IccPrivateKeyCrtComponentsJson = i7 % 128;
            if (i7 % 2 != 0) {
                return java.lang.Boolean.TRUE;
            }
            throw new java.lang.ArithmeticException();
        }
        int identityHashCode = java.lang.System.identityHashCode(setdefaultfocushighlightenabled);
        int i8 = ~identityHashCode;
        int i9 = ((~i8) & 1038745482) | (i8 & (-1038745483));
        int i10 = i8 & 1038745482;
        int i11 = ~((i9 ^ i10) | (i10 & i9));
        int i12 = i11 & 1074004032;
        int i13 = (i11 | 1074004032) & (~i12);
        int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * (-245)));
        int i15 = ((((~i14) & 1433516130) | ((-1433516131) & i14)) - (~(-(-((i14 & 1433516130) << 1))))) - 1;
        int i16 = (identityHashCode & 1038745482) | i10 | (identityHashCode & (-1038745483));
        int i17 = ~i16;
        int i18 = i17 * (-245);
        int i19 = i15 ^ i18;
        int i20 = (i16 | i17) & i17;
        int i21 = i20 ^ (-1422783681);
        int i22 = i20 & (-1422783681);
        int i23 = (((((i15 & i18) | i19) << 1) - (~(-i19))) - 1) - (~(((i22 ^ i21) | (i22 & i21)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
        int identityHashCode2 = java.lang.System.identityHashCode(setdefaultfocushighlightenabled);
        int i24 = ~identityHashCode2;
        int i25 = ~((i24 ^ 898658637) | (i24 & 898658637));
        int i26 = -(-(((i25 ^ (-2141057518)) | (i25 & (-2141057518))) * 98));
        int i27 = ((i26 | (-898781346)) << 1) - (i26 ^ (-898781346));
        int i28 = (i24 | identityHashCode2) & i24;
        int i29 = i28 ^ (-1846399145);
        int i30 = i28 & (-1846399145);
        int i31 = ~((i30 ^ i29) | (i30 & i29));
        int i32 = (i31 ^ 898658637) | (i31 & 898658637);
        int i33 = (i24 & 1846399144) | ((-1846399145) & identityHashCode2);
        int i34 = identityHashCode2 & 1846399144;
        int i35 = (i33 ^ i34) | (i33 & i34);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = i32 ^ i37;
        int i39 = i37 & i32;
        int i40 = ((i39 ^ i38) | (i39 & i38)) * (-49);
        int i41 = i27 & i40;
        int i42 = -(-((i40 ^ i27) | i41));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        int i44 = (identityHashCode2 ^ 898658637) | (identityHashCode2 & 898658637);
        int i45 = ~i44;
        int i46 = (i44 | i45) & i45;
        int i47 = ((i46 ^ 294658373) | (i46 & 294658373)) * 49;
        int i48 = i43 & i47;
        int i49 = (i47 | i43) & (~i48);
        int i50 = i48 << 1;
        if ((~i23) + (i23 << 1) > (i49 ^ i50) + ((i49 & i50) << 1)) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        RecordsJson = ((i & 25) + (i | 25)) % 128;
        if (!((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1829311170, 1829311259, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i2 = IccPrivateKeyCrtComponentsJson;
            int i3 = i2 & 55;
            int i4 = -(-((i2 ^ 55) | i3));
            RecordsJson = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            int intValue = ((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"TransactionCounter", 0, setdefaultfocushighlightenabled.SdkCoreAlternateContactlessPaymentDataImpl}, 654732084, -654732078, 0)).intValue();
            int identityHashCode = java.lang.System.identityHashCode(setdefaultfocushighlightenabled);
            int i5 = intValue * 971;
            int i6 = -((i5 | (-1939)) & (~(i5 & (-1939))));
            int i7 = ~intValue;
            int i8 = (i7 & (-2)) | ((~i7) & 1);
            int i9 = i7 & 1;
            int i10 = ~((i8 ^ i9) | (i8 & i9));
            int i11 = ~identityHashCode;
            int i12 = i11 & intValue;
            int i13 = ~((i11 ^ intValue) | i12);
            int i14 = ((~i13) & i10) | ((~i10) & i13);
            int i15 = i10 & i13;
            int i16 = ((((((i5 ^ (-1939)) | r4) << 1) - (~i6)) - 1) - (~(((i15 & i14) | (i14 ^ i15)) * (-970)))) - 1;
            int i17 = intValue & (-2);
            int i18 = -(-((~(i17 | ((~i17) & (intValue | (-2))))) * 1940));
            int i19 = i16 & i18;
            int i20 = (i16 | i18) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 & i21) + (i20 | i21);
            int i23 = (i7 | intValue) & i7;
            int i24 = (i23 & 1) | ((~i23) & (-2)) | (i23 & (-2));
            int i25 = ~i24;
            int i26 = (i24 | i25) & i25;
            int i27 = (intValue | i11) & (~i12);
            int i28 = ~((i27 ^ i12) | (i27 & i12));
            int i29 = ((~i28) & i26) | ((~i26) & i28);
            int i30 = i28 & i26;
            int i31 = -(-(((i30 ^ i29) | (i30 & i29)) * 970));
            int i32 = ((((~i31) & i22) | ((~i22) & i31)) - (~(-(-((i31 & i22) << 1))))) - 1;
            setdefaultfocushighlightenabled.DigitizedCardProfile = i32;
            com.payair.hce.setLeft.values(new java.lang.Object[]{"TransactionCounter", java.lang.Integer.valueOf(i32), setdefaultfocushighlightenabled.SdkCoreAlternateContactlessPaymentDataImpl}, 987195454, -987195452, i32);
            int i33 = RecordsJson;
            int i34 = i33 & 103;
            int i35 = ((i33 ^ 103) | i34) << 1;
            int i36 = -((i33 | 103) & (~i34));
            IccPrivateKeyCrtComponentsJson = ((i35 ^ i36) + ((i36 & i35) << 1)) % 128;
        }
        int i37 = IccPrivateKeyCrtComponentsJson;
        int i38 = i37 & 35;
        int i39 = i38 + ((i37 ^ 35) | i38);
        RecordsJson = i39 % 128;
        if (i39 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    final void IccPrivateKeyCrtComponentsJson() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -863748824, 863748830, java.lang.System.identityHashCode(this));
    }

    private boolean SdkCoreAlternateContactlessPaymentDataImpl() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 813597775, -813597768, java.lang.System.identityHashCode(this))).booleanValue();
    }

    final void getAid() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 450611634, -450611632, java.lang.System.identityHashCode(this));
    }

    private boolean RecordsJson() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1836195866, -1836195856, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 359941818, -359941818, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getPackageName
    public final boolean values() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1948906398, -1948906395, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getPackageName
    public final long AlternateContactlessPaymentDataJson() {
        return ((java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1913515476, -1913515468, java.lang.System.identityHashCode(this))).longValue();
    }

    @Override // com.payair.hce.getPackageName
    public final boolean writeReplace() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1575419740, -1575419731, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getPackageName
    public final boolean valueOf() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1101654897, -1101654893, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setVerticalScrollBarEnabled
    public final void valueOf(com.payair.hce.suspendCardForToken suspendcardfortoken) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, suspendcardfortoken}, -1400470570, 1400470571, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setVerticalScrollBarEnabled
    public final void AlternateContactlessPaymentDataJson(com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, getmdescardsuniquetokenreferences}, 2017594641, -2017594636, java.lang.System.identityHashCode(this));
    }
}
