package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSelector {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static byte[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] getProfileVersion;
    private static long valueOf;
    private static int values;
    private static int writeReplace;
    private final com.visa.cbp.sdk.facade.VisaPaymentSDK DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        switch ((i * (-496)) + (i2 * (-496)) + ((~i6) * 497) + (((~(i6 | i3)) | (~(i5 | i7 | i))) * 497) + (((~(i | i5 | i3)) | (~(i2 | i4)) | (~(i4 | i7))) * 497)) {
            case 1:
                com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
                android.content.Context context = (android.content.Context) objArr[1];
                boolean booleanValue = ((java.lang.Boolean) objArr[2]).booleanValue();
                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 79) % 128;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                setselector.DigitizedCardProfile.setCvmVerified(context, booleanValue);
                int i8 = IccPrivateKeyCrtComponentsJson;
                int i9 = (i8 | 3) << 1;
                int i10 = -(i8 ^ 3);
                SdkCoreAlternateContactlessPaymentDataImpl = ((i9 & i10) + (i10 | i9)) % 128;
                return null;
            case 2:
                return writeReplace(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return valueOf(objArr);
            case 5:
                return values(objArr);
            case 6:
                return RecordsJson(objArr);
            case 7:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b2 * 4) + 5;
        int i5 = 119 - i;
        int i6 = (b * 4) + 1;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i4;
            int i10 = i4 + i7;
            int i11 = i9 + 1;
            i2 = i8;
            i5 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i9 = i4;
            i4 = bArr[i4];
            i8 = i3;
            i7 = i12;
            int i102 = i4 + i7;
            int i112 = i9 + 1;
            i2 = i8;
            i5 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 115 - b;
        int i4 = s + 65;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[42 - i];
        int i5 = 41 - i;
        if (bArr == null) {
            int i6 = i3;
            i4 = i5;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 2;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i2++;
            i3++;
            i4 = (i4 + i6) - 2;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 425 - i;
        int i4 = 119 - s;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[s2 + 6];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i4 = (i4 + (-i3)) - 1;
            i3 = i5;
            i2 = i6;
            int i7 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i6 = i2 + 1;
            if (i2 == s2 + 5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i7;
            i3 = bArr[i7];
            i4 = (i4 + (-i3)) - 1;
            i3 = i5;
            i2 = i6;
            int i72 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i6 = i2 + 1;
            if (i2 == s2 + 5) {
            }
        } else {
            i2 = 0;
            int i722 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i6 = i2 + 1;
            if (i2 == s2 + 5) {
            }
        }
    }

    public setSelector(com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDK) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visaPaymentSDK, "");
        this.DigitizedCardProfile = visaPaymentSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.visa.cbp.sdk.facade.data.ApduResponse apduResponse;
        byte[] bArr;
        int i;
        com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        android.content.Context context = (android.content.Context) objArr[2];
        android.os.Bundle bundle = (android.os.Bundle) objArr[3];
        int i2 = IccPrivateKeyCrtComponentsJson;
        int i3 = i2 ^ 51;
        int i4 = ((i2 & 51) | i3) << 1;
        int i5 = -i3;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (setselector.DigitizedCardProfile.tokensExist(context)) {
            int i6 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i7 = i6 ^ 1;
            int i8 = ((i6 & 1) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            IccPrivateKeyCrtComponentsJson = i10 % 128;
            if (i10 % 2 != 0) {
                setselector.DigitizedCardProfile.getSelectedCard(context);
                throw null;
            }
            if (setselector.DigitizedCardProfile.getSelectedCard(context) != null) {
                try {
                    apduResponse = setselector.DigitizedCardProfile.processCommandApdu(context, bArr2, bundle, ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1829311170, 1829311259, (int) java.lang.System.currentTimeMillis())).booleanValue());
                    int i11 = SdkCoreAlternateContactlessPaymentDataImpl;
                    IccPrivateKeyCrtComponentsJson = ((i11 & 83) + (i11 | 83)) % 128;
                } catch (java.lang.Exception unused) {
                    apduResponse = null;
                }
                if (apduResponse != null) {
                    int i12 = SdkCoreAlternateContactlessPaymentDataImpl;
                    IccPrivateKeyCrtComponentsJson = ((i12 & 109) + (i12 | 109)) % 128;
                    com.visa.cbp.sdk.facade.error.CbpError cbpError = apduResponse.getCbpError();
                    if (cbpError != null) {
                        int i13 = IccPrivateKeyCrtComponentsJson;
                        SdkCoreAlternateContactlessPaymentDataImpl = (((i13 ^ 84) + ((i13 & 84) << 1)) - 1) % 128;
                        if (cbpError.getErrorCode() == 1100) {
                            int i14 = IccPrivateKeyCrtComponentsJson;
                            SdkCoreAlternateContactlessPaymentDataImpl = (((i14 | 51) << 1) - (i14 ^ 51)) % 128;
                            SdkCoreAlternateContactlessPaymentDataImpl = ((i14 & 69) + (i14 | 69)) % 128;
                            int i15 = i14 & 35;
                            int i16 = -(-((i14 ^ 35) | i15));
                            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                            SdkCoreAlternateContactlessPaymentDataImpl = i17 % 128;
                            int i18 = i17 % 2;
                            com.payair.hce.HCEEventListener hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(hCEEventListener);
                            hCEEventListener.onShowAuthenticateScreen(true);
                        } else {
                            int i19 = IccPrivateKeyCrtComponentsJson;
                            int i20 = i19 & 99;
                            int i21 = (i19 | 99) & (~i20);
                            int i22 = -(-(i20 << 1));
                            SdkCoreAlternateContactlessPaymentDataImpl = ((i21 ^ i22) + ((i21 & i22) << 1)) % 128;
                        }
                        if (apduResponse == null) {
                            int i23 = IccPrivateKeyCrtComponentsJson;
                            int i24 = ((i23 | 2) << 1) - (i23 ^ 2);
                            SdkCoreAlternateContactlessPaymentDataImpl = ((~i24) + (i24 << 1)) % 128;
                            bArr = apduResponse.getApduData();
                            int i25 = SdkCoreAlternateContactlessPaymentDataImpl;
                            int i26 = i25 & 69;
                            int i27 = (i25 | 69) & (~i26);
                            int i28 = i26 << 1;
                            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                            IccPrivateKeyCrtComponentsJson = i29 % 128;
                            if (i29 % 2 != 0) {
                                int i30 = 3 / 2;
                            }
                        } else {
                            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 15) % 128;
                            bArr = null;
                        }
                        if (bArr == null) {
                            int i31 = IccPrivateKeyCrtComponentsJson;
                            int i32 = ((i31 ^ 74) + ((i31 & 74) << 1)) - 1;
                            SdkCoreAlternateContactlessPaymentDataImpl = i32 % 128;
                            if (i32 % 2 == 0) {
                                throw null;
                            }
                            bArr = (byte[]) com.payair.hce.setVelocityScale.writeReplace(new java.lang.Object[0], 1392842242, -1392842242, (int) java.lang.System.currentTimeMillis());
                        }
                        int i33 = SdkCoreAlternateContactlessPaymentDataImpl;
                        int i34 = (i33 | 79) << 1;
                        int i35 = -((i33 & (-80)) | ((~i33) & 79));
                        i = (i34 & i35) + (i35 | i34);
                        IccPrivateKeyCrtComponentsJson = i % 128;
                        if (i % 2 != 0) {
                            return bArr;
                        }
                        throw null;
                    }
                }
                int i36 = IccPrivateKeyCrtComponentsJson;
                int i37 = i36 ^ 7;
                SdkCoreAlternateContactlessPaymentDataImpl = ((((i36 & 7) | i37) << 1) - i37) % 128;
                if (apduResponse == null) {
                }
                if (bArr == null) {
                }
                int i332 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i342 = (i332 | 79) << 1;
                int i352 = -((i332 & (-80)) | ((~i332) & 79));
                i = (i342 & i352) + (i352 | i342);
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 != 0) {
                }
            }
        }
        byte[] bArr3 = (byte[]) com.payair.hce.setVelocityScale.writeReplace(new java.lang.Object[0], 1990872266, -1990872265, (int) java.lang.System.currentTimeMillis());
        int i38 = IccPrivateKeyCrtComponentsJson;
        int i39 = ((i38 ^ 108) + ((i38 & 108) << 1)) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i39 % 128;
        if (i39 % 2 != 0) {
            return bArr3;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        boolean z = false;
        com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 71) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            z = setselector.DigitizedCardProfile.processTransactionComplete(context, setselector.DigitizedCardProfile.getSelectedCard(context));
            int i = IccPrivateKeyCrtComponentsJson;
            int i2 = i & 125;
            SdkCoreAlternateContactlessPaymentDataImpl = (i2 + ((i ^ 125) | i2)) % 128;
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
        int i3 = IccPrivateKeyCrtComponentsJson;
        int i4 = ((i3 & (-2)) | ((~i3) & 1)) + ((i3 & 1) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 30) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        boolean isOfflinePaymentSupported;
        com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                isOfflinePaymentSupported = setselector.DigitizedCardProfile.isOfflinePaymentSupported(context);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                isOfflinePaymentSupported = setselector.DigitizedCardProfile.isOfflinePaymentSupported(context);
            }
            if (!isOfflinePaymentSupported) {
                int i3 = IccPrivateKeyCrtComponentsJson + 121;
                SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                if (i3 % 2 == 0) {
                    setselector.DigitizedCardProfile.enableOfflinePayment(context);
                    throw new java.lang.NullPointerException();
                }
                setselector.DigitizedCardProfile.enableOfflinePayment(context);
                int i4 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i5 = i4 ^ 29;
                int i6 = (((i4 & 29) | i5) << 1) - i5;
                IccPrivateKeyCrtComponentsJson = i6 % 128;
                if (i6 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
        int i7 = IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i7 | 81) << 1) - (i7 ^ 81)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        boolean z = false;
        com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 31) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            z = setselector.DigitizedCardProfile.isOfflinePaymentSupported(context);
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        IccPrivateKeyCrtComponentsJson = (((i & 30) + (i | 30)) - 1) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        com.visa.cbp.sdk.facade.data.CvmMode cvmMode = (com.visa.cbp.sdk.facade.data.CvmMode) objArr[2];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 9) + ((i & 9) << 1);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (cvmMode == null) {
            cvmMode = new com.visa.cbp.sdk.facade.data.CvmMode(com.visa.cbp.sdk.facade.data.VerifyingEntity.NO_CD_CVM, com.visa.cbp.sdk.facade.data.VerifyingType.NO_CD_CVM);
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i4 = (((i3 & (-102)) | ((~i3) & 101)) - (~((i3 & 101) << 1))) - 1;
            IccPrivateKeyCrtComponentsJson = i4 % 128;
            int i5 = i4 % 2;
        }
        setselector.DigitizedCardProfile.setCvmVerificationMode(context, cvmMode);
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
        return null;
    }

    private static void e(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 95;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        int i3 = $10 + 39;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 117) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i5 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1920, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b = $$g[0];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b, (byte) (b + 2), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.MeasureSpec.getMode(0) + 429, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 31609));
                    byte b2 = $$g[0];
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(b2, b2, b2, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority = (com.visa.cbp.sdk.facade.data.CVMPriority) objArr[2];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i | 37;
        int i3 = i2 << 1;
        int i4 = -((~(i & 37)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVMPriority, "");
                setselector.DigitizedCardProfile.setCVMPriorityList(context, cVMPriority);
                throw new java.lang.ArithmeticException();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVMPriority, "");
            setselector.DigitizedCardProfile.setCVMPriorityList(context, cVMPriority);
            int i6 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i7 = (((i6 ^ 67) | (i6 & 67)) << 1) - ((i6 & (-68)) | ((~i6) & 67));
            IccPrivateKeyCrtComponentsJson = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
            return null;
        }
    }

    private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 27, 30 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 73) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = RecordsJson;
                if (bArr2 != null) {
                    int i7 = $11 + 97;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.getCapsMode("", 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5088, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i8 = $11 + 57;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        byte[] bArr3 = RecordsJson;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.os.Process.getGidForName(""), 29 - android.text.TextUtils.indexOf("", "", 0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                        }
                        i5 = ((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] * (-4897270311952305750L))) / ((int) (values * (-4897270311952305750L)));
                    } else {
                        byte[] bArr4 = RecordsJson;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, 29 - (android.os.Process.myTid() >> 22), (char) android.view.View.resolveSize(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        i5 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L)));
                    }
                    intValue = (byte) i5;
                } else {
                    intValue = (short) (((short) (getProfileVersion[i + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                    $11 = ($10 + 109) % 128;
                }
            }
            if (intValue > 0) {
                $10 = ($11 + 65) % 128;
                gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))) + i4;
                java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace), sb};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj5 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, 2364 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    byte b2 = $$g[0];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(b2, b2, (byte) (b2 | com.google.common.base.Ascii.SI), objArr7);
                    obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = RecordsJson;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        $10 = ($11 + 19) % 128;
                        bArr6[i9] = (byte) (bArr5[i9] ^ (-4897270311952305750L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    $11 = ($10 + 67) % 128;
                    z = true;
                } else {
                    z = false;
                }
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z) {
                        byte[] bArr7 = RecordsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = getProfileVersion;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                    $11 = ($10 + 121) % 128;
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x1c18  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x1e4e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x2063  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x25fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x2797  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x29a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x2b3e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x3063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x2ecd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x2f91  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x2a20  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x28be A[Catch: all -> 0x0431, TryCatch #2 {all -> 0x0431, blocks: (B:9:0x03bd, B:11:0x03de, B:12:0x0423, B:20:0x0764, B:22:0x0781, B:23:0x07bd, B:32:0x0b0b, B:34:0x0b2c, B:35:0x0b8b, B:37:0x0ccd, B:39:0x0cdc, B:40:0x0d14, B:42:0x0d30, B:43:0x0d63, B:47:0x0d7e, B:49:0x0d8d, B:50:0x0dc0, B:52:0x0dec, B:53:0x0e4d, B:61:0x1119, B:63:0x113a, B:64:0x1177, B:70:0x139c, B:72:0x13b9, B:73:0x13f6, B:82:0x15f9, B:84:0x1617, B:85:0x1653, B:93:0x1a0b, B:95:0x1a27, B:96:0x1a6b, B:106:0x1cb1, B:108:0x1cd2, B:109:0x1d14, B:116:0x1e63, B:118:0x1e7f, B:119:0x1ebe, B:125:0x20d0, B:127:0x20f1, B:128:0x2132, B:134:0x260a, B:136:0x2627, B:137:0x2669, B:144:0x280a, B:146:0x282b, B:147:0x286c, B:152:0x29bd, B:154:0x29da, B:155:0x2a18, B:163:0x2c32, B:165:0x2c53, B:166:0x2c91, B:167:0x2d48, B:177:0x2cdd, B:179:0x2cfe, B:180:0x2d41, B:213:0x2aa0, B:215:0x2abd, B:216:0x2af6, B:224:0x28a3, B:226:0x28be, B:227:0x28f2, B:239:0x26ef, B:241:0x270c, B:242:0x274c, B:268:0x1ece, B:270:0x1eeb, B:271:0x1f2a, B:275:0x1faf, B:277:0x1fcc, B:278:0x200b, B:293:0x1a7c, B:295:0x1a99, B:296:0x1ada, B:300:0x1b65, B:302:0x1b82, B:303:0x1bc3, B:324:0x14b3, B:326:0x14d0, B:327:0x150c, B:330:0x11c5, B:332:0x11e6, B:333:0x1225, B:335:0x1253, B:337:0x1278, B:338:0x12ce, B:346:0x0e55, B:348:0x0e64, B:349:0x0e95, B:351:0x0ec1, B:352:0x0f23, B:355:0x0f95, B:357:0x0fa4, B:358:0x0fd3, B:360:0x0fff, B:361:0x105d, B:365:0x0bb6, B:367:0x0bd8, B:368:0x0c28, B:377:0x07cd, B:379:0x07ea, B:380:0x0829, B:382:0x0847, B:384:0x085a, B:385:0x0894, B:387:0x089e, B:389:0x08b1, B:390:0x08f0, B:395:0x0963, B:397:0x0980, B:398:0x09bf), top: B:8:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x267c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x2398  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x2495  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x25e5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x1f32  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1af2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x184d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1935  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x19e0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1400  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1278 A[Catch: all -> 0x0431, TryCatch #2 {all -> 0x0431, blocks: (B:9:0x03bd, B:11:0x03de, B:12:0x0423, B:20:0x0764, B:22:0x0781, B:23:0x07bd, B:32:0x0b0b, B:34:0x0b2c, B:35:0x0b8b, B:37:0x0ccd, B:39:0x0cdc, B:40:0x0d14, B:42:0x0d30, B:43:0x0d63, B:47:0x0d7e, B:49:0x0d8d, B:50:0x0dc0, B:52:0x0dec, B:53:0x0e4d, B:61:0x1119, B:63:0x113a, B:64:0x1177, B:70:0x139c, B:72:0x13b9, B:73:0x13f6, B:82:0x15f9, B:84:0x1617, B:85:0x1653, B:93:0x1a0b, B:95:0x1a27, B:96:0x1a6b, B:106:0x1cb1, B:108:0x1cd2, B:109:0x1d14, B:116:0x1e63, B:118:0x1e7f, B:119:0x1ebe, B:125:0x20d0, B:127:0x20f1, B:128:0x2132, B:134:0x260a, B:136:0x2627, B:137:0x2669, B:144:0x280a, B:146:0x282b, B:147:0x286c, B:152:0x29bd, B:154:0x29da, B:155:0x2a18, B:163:0x2c32, B:165:0x2c53, B:166:0x2c91, B:167:0x2d48, B:177:0x2cdd, B:179:0x2cfe, B:180:0x2d41, B:213:0x2aa0, B:215:0x2abd, B:216:0x2af6, B:224:0x28a3, B:226:0x28be, B:227:0x28f2, B:239:0x26ef, B:241:0x270c, B:242:0x274c, B:268:0x1ece, B:270:0x1eeb, B:271:0x1f2a, B:275:0x1faf, B:277:0x1fcc, B:278:0x200b, B:293:0x1a7c, B:295:0x1a99, B:296:0x1ada, B:300:0x1b65, B:302:0x1b82, B:303:0x1bc3, B:324:0x14b3, B:326:0x14d0, B:327:0x150c, B:330:0x11c5, B:332:0x11e6, B:333:0x1225, B:335:0x1253, B:337:0x1278, B:338:0x12ce, B:346:0x0e55, B:348:0x0e64, B:349:0x0e95, B:351:0x0ec1, B:352:0x0f23, B:355:0x0f95, B:357:0x0fa4, B:358:0x0fd3, B:360:0x0fff, B:361:0x105d, B:365:0x0bb6, B:367:0x0bd8, B:368:0x0c28, B:377:0x07cd, B:379:0x07ea, B:380:0x0829, B:382:0x0847, B:384:0x085a, B:385:0x0894, B:387:0x089e, B:389:0x08b1, B:390:0x08f0, B:395:0x0963, B:397:0x0980, B:398:0x09bf), top: B:8:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0bd8 A[Catch: all -> 0x0431, TryCatch #2 {all -> 0x0431, blocks: (B:9:0x03bd, B:11:0x03de, B:12:0x0423, B:20:0x0764, B:22:0x0781, B:23:0x07bd, B:32:0x0b0b, B:34:0x0b2c, B:35:0x0b8b, B:37:0x0ccd, B:39:0x0cdc, B:40:0x0d14, B:42:0x0d30, B:43:0x0d63, B:47:0x0d7e, B:49:0x0d8d, B:50:0x0dc0, B:52:0x0dec, B:53:0x0e4d, B:61:0x1119, B:63:0x113a, B:64:0x1177, B:70:0x139c, B:72:0x13b9, B:73:0x13f6, B:82:0x15f9, B:84:0x1617, B:85:0x1653, B:93:0x1a0b, B:95:0x1a27, B:96:0x1a6b, B:106:0x1cb1, B:108:0x1cd2, B:109:0x1d14, B:116:0x1e63, B:118:0x1e7f, B:119:0x1ebe, B:125:0x20d0, B:127:0x20f1, B:128:0x2132, B:134:0x260a, B:136:0x2627, B:137:0x2669, B:144:0x280a, B:146:0x282b, B:147:0x286c, B:152:0x29bd, B:154:0x29da, B:155:0x2a18, B:163:0x2c32, B:165:0x2c53, B:166:0x2c91, B:167:0x2d48, B:177:0x2cdd, B:179:0x2cfe, B:180:0x2d41, B:213:0x2aa0, B:215:0x2abd, B:216:0x2af6, B:224:0x28a3, B:226:0x28be, B:227:0x28f2, B:239:0x26ef, B:241:0x270c, B:242:0x274c, B:268:0x1ece, B:270:0x1eeb, B:271:0x1f2a, B:275:0x1faf, B:277:0x1fcc, B:278:0x200b, B:293:0x1a7c, B:295:0x1a99, B:296:0x1ada, B:300:0x1b65, B:302:0x1b82, B:303:0x1bc3, B:324:0x14b3, B:326:0x14d0, B:327:0x150c, B:330:0x11c5, B:332:0x11e6, B:333:0x1225, B:335:0x1253, B:337:0x1278, B:338:0x12ce, B:346:0x0e55, B:348:0x0e64, B:349:0x0e95, B:351:0x0ec1, B:352:0x0f23, B:355:0x0f95, B:357:0x0fa4, B:358:0x0fd3, B:360:0x0fff, B:361:0x105d, B:365:0x0bb6, B:367:0x0bd8, B:368:0x0c28, B:377:0x07cd, B:379:0x07ea, B:380:0x0829, B:382:0x0847, B:384:0x085a, B:385:0x0894, B:387:0x089e, B:389:0x08b1, B:390:0x08f0, B:395:0x0963, B:397:0x0980, B:398:0x09bf), top: B:8:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0cdc A[Catch: all -> 0x0431, TryCatch #2 {all -> 0x0431, blocks: (B:9:0x03bd, B:11:0x03de, B:12:0x0423, B:20:0x0764, B:22:0x0781, B:23:0x07bd, B:32:0x0b0b, B:34:0x0b2c, B:35:0x0b8b, B:37:0x0ccd, B:39:0x0cdc, B:40:0x0d14, B:42:0x0d30, B:43:0x0d63, B:47:0x0d7e, B:49:0x0d8d, B:50:0x0dc0, B:52:0x0dec, B:53:0x0e4d, B:61:0x1119, B:63:0x113a, B:64:0x1177, B:70:0x139c, B:72:0x13b9, B:73:0x13f6, B:82:0x15f9, B:84:0x1617, B:85:0x1653, B:93:0x1a0b, B:95:0x1a27, B:96:0x1a6b, B:106:0x1cb1, B:108:0x1cd2, B:109:0x1d14, B:116:0x1e63, B:118:0x1e7f, B:119:0x1ebe, B:125:0x20d0, B:127:0x20f1, B:128:0x2132, B:134:0x260a, B:136:0x2627, B:137:0x2669, B:144:0x280a, B:146:0x282b, B:147:0x286c, B:152:0x29bd, B:154:0x29da, B:155:0x2a18, B:163:0x2c32, B:165:0x2c53, B:166:0x2c91, B:167:0x2d48, B:177:0x2cdd, B:179:0x2cfe, B:180:0x2d41, B:213:0x2aa0, B:215:0x2abd, B:216:0x2af6, B:224:0x28a3, B:226:0x28be, B:227:0x28f2, B:239:0x26ef, B:241:0x270c, B:242:0x274c, B:268:0x1ece, B:270:0x1eeb, B:271:0x1f2a, B:275:0x1faf, B:277:0x1fcc, B:278:0x200b, B:293:0x1a7c, B:295:0x1a99, B:296:0x1ada, B:300:0x1b65, B:302:0x1b82, B:303:0x1bc3, B:324:0x14b3, B:326:0x14d0, B:327:0x150c, B:330:0x11c5, B:332:0x11e6, B:333:0x1225, B:335:0x1253, B:337:0x1278, B:338:0x12ce, B:346:0x0e55, B:348:0x0e64, B:349:0x0e95, B:351:0x0ec1, B:352:0x0f23, B:355:0x0f95, B:357:0x0fa4, B:358:0x0fd3, B:360:0x0fff, B:361:0x105d, B:365:0x0bb6, B:367:0x0bd8, B:368:0x0c28, B:377:0x07cd, B:379:0x07ea, B:380:0x0829, B:382:0x0847, B:384:0x085a, B:385:0x0894, B:387:0x089e, B:389:0x08b1, B:390:0x08f0, B:395:0x0963, B:397:0x0980, B:398:0x09bf), top: B:8:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0d30 A[Catch: all -> 0x0431, TryCatch #2 {all -> 0x0431, blocks: (B:9:0x03bd, B:11:0x03de, B:12:0x0423, B:20:0x0764, B:22:0x0781, B:23:0x07bd, B:32:0x0b0b, B:34:0x0b2c, B:35:0x0b8b, B:37:0x0ccd, B:39:0x0cdc, B:40:0x0d14, B:42:0x0d30, B:43:0x0d63, B:47:0x0d7e, B:49:0x0d8d, B:50:0x0dc0, B:52:0x0dec, B:53:0x0e4d, B:61:0x1119, B:63:0x113a, B:64:0x1177, B:70:0x139c, B:72:0x13b9, B:73:0x13f6, B:82:0x15f9, B:84:0x1617, B:85:0x1653, B:93:0x1a0b, B:95:0x1a27, B:96:0x1a6b, B:106:0x1cb1, B:108:0x1cd2, B:109:0x1d14, B:116:0x1e63, B:118:0x1e7f, B:119:0x1ebe, B:125:0x20d0, B:127:0x20f1, B:128:0x2132, B:134:0x260a, B:136:0x2627, B:137:0x2669, B:144:0x280a, B:146:0x282b, B:147:0x286c, B:152:0x29bd, B:154:0x29da, B:155:0x2a18, B:163:0x2c32, B:165:0x2c53, B:166:0x2c91, B:167:0x2d48, B:177:0x2cdd, B:179:0x2cfe, B:180:0x2d41, B:213:0x2aa0, B:215:0x2abd, B:216:0x2af6, B:224:0x28a3, B:226:0x28be, B:227:0x28f2, B:239:0x26ef, B:241:0x270c, B:242:0x274c, B:268:0x1ece, B:270:0x1eeb, B:271:0x1f2a, B:275:0x1faf, B:277:0x1fcc, B:278:0x200b, B:293:0x1a7c, B:295:0x1a99, B:296:0x1ada, B:300:0x1b65, B:302:0x1b82, B:303:0x1bc3, B:324:0x14b3, B:326:0x14d0, B:327:0x150c, B:330:0x11c5, B:332:0x11e6, B:333:0x1225, B:335:0x1253, B:337:0x1278, B:338:0x12ce, B:346:0x0e55, B:348:0x0e64, B:349:0x0e95, B:351:0x0ec1, B:352:0x0f23, B:355:0x0f95, B:357:0x0fa4, B:358:0x0fd3, B:360:0x0fff, B:361:0x105d, B:365:0x0bb6, B:367:0x0bd8, B:368:0x0c28, B:377:0x07cd, B:379:0x07ea, B:380:0x0829, B:382:0x0847, B:384:0x085a, B:385:0x0894, B:387:0x089e, B:389:0x08b1, B:390:0x08f0, B:395:0x0963, B:397:0x0980, B:398:0x09bf), top: B:8:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x10a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x138b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x1563  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x19f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setSelector setselector;
        java.lang.Integer num;
        java.lang.String str;
        android.content.Context context;
        java.lang.String str2;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        int i;
        java.lang.String str3;
        long j;
        java.lang.Object obj;
        java.lang.String str4;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int intValue;
        java.lang.Object obj4;
        long j2;
        java.lang.String str5;
        java.lang.Object obj5;
        java.lang.Object[] objArr4;
        int i2;
        java.lang.String str6;
        long j3;
        java.lang.Integer num2;
        java.lang.String str7;
        java.lang.String str8;
        byte[] bArr;
        android.content.Context context2;
        java.lang.String str9;
        java.lang.Object[] objArr5;
        java.lang.String str10;
        java.lang.Object[] objArr6;
        int i3;
        java.lang.String str11;
        long j4;
        java.lang.Object[] objArr7;
        char c;
        char c2;
        int i4;
        long j5;
        java.lang.String str12;
        android.content.Context context3;
        java.lang.Object[] objArr8;
        java.lang.String str13;
        java.lang.Object[] objArr9;
        java.lang.Long valueOf2;
        java.lang.Class cls;
        java.lang.Object obj6;
        int i5;
        java.lang.String str14;
        long j6;
        java.lang.Object obj7;
        java.lang.Object[] writeReplace$5f5b6fcf;
        char c3;
        char c4;
        int i6;
        long j7;
        android.content.Context context4;
        java.lang.Object[] objArr10;
        java.lang.Object invoke;
        com.payair.hce.setSelector setselector2 = (com.payair.hce.setSelector) objArr[0];
        int i7 = IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i7 | 97) << 1) - (i7 ^ 97)) % 128;
        int i8 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
        int i9 = -(-android.view.View.MeasureSpec.getMode(0));
        int size = android.view.View.MeasureSpec.getSize(0);
        int identityHashCode = java.lang.System.identityHashCode(setselector2);
        int i10 = size * (-317);
        int i11 = ((i10 | (-10527)) << 1) - (i10 ^ (-10527));
        int i12 = ~size;
        int i13 = (i12 ^ 32) | (i12 & 32);
        int i14 = ~identityHashCode;
        int i15 = (i14 ^ size) | (i14 & size);
        int i16 = -(-(((~((i13 & identityHashCode) | (i13 ^ identityHashCode))) | (~((i15 ^ (-33)) | (i15 & (-33))))) * (-318)));
        int i17 = ~((size ^ 32) | (size & 32));
        int i18 = ~((size & identityHashCode) | (size ^ identityHashCode));
        int i19 = (((i11 | i16) << 1) - (i11 ^ i16)) + (((i18 ^ i17) | (i18 & i17)) * (-318));
        int i20 = ~((i12 ^ identityHashCode) | (identityHashCode & i12));
        int i21 = -(-(((i20 ^ 32) | (i20 & 32)) * 318));
        int i22 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int identityHashCode2 = java.lang.System.identityHashCode(setselector2);
        int i23 = ~i22;
        int i24 = (i23 & (-81)) | (i23 ^ (-81));
        int i25 = ~((i24 & identityHashCode2) | (i24 ^ identityHashCode2));
        int i26 = ~identityHashCode2;
        int i27 = (i26 ^ i22) | (i26 & i22);
        int i28 = ~((i27 ^ 80) | (i27 & 80));
        int i29 = ~((i22 ^ (-81)) | (i22 & (-81)));
        int i30 = ~((i22 ^ identityHashCode2) | (i22 & identityHashCode2));
        int i31 = (((((i22 * (-317)) + 25520) - (~(((i25 ^ i28) | (i25 & i28)) * (-318)))) - 1) - (~(((i29 ^ i30) | (i29 & i30)) * (-318)))) - 1;
        int i32 = -(-(((~((i23 & identityHashCode2) | (i23 ^ identityHashCode2))) | (-81)) * 318));
        byte b = (byte) ((i31 & i32) + (i32 | i31));
        int i33 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        int identityHashCode3 = java.lang.System.identityHashCode(setselector2);
        int i34 = ~i33;
        int i35 = ~(identityHashCode3 | 94);
        int i36 = ~identityHashCode3;
        int i37 = (i36 ^ i33) | (i36 & i33);
        int i38 = ~((i37 ^ (-95)) | (i37 & (-95)));
        int i39 = i36 | 94;
        int i40 = ~((i39 & i33) | (i39 ^ i33));
        int i41 = (i33 & (-95)) | (i33 ^ (-95));
        int i42 = ~((i41 & identityHashCode3) | (i41 ^ identityHashCode3));
        short s = (short) ((((((i33 * 319) + 30115) + (((~((i34 ^ identityHashCode3) | (identityHashCode3 & i34))) | 94) * (-318))) + (((i35 ^ i38) | (i38 & i35)) * 318)) - (~(-(-(((i42 ^ i40) | (i42 & i40)) * 318))))) - 1);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b(((1497162719 | i8) << 1) - (i8 ^ 1497162719), ((-333279883) & i9) + (i9 | (-333279883)), (i19 ^ i21) + ((i21 & i19) << 1), b, s, objArr11);
        java.lang.String str15 = (java.lang.String) objArr11[0];
        int i43 = -android.graphics.Color.green(0);
        int i44 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
        int i45 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
        int i46 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        int i47 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b((1497162741 & i43) + (i43 | 1497162741), (((-333279878) | i44) << 1) - (i44 ^ (-333279878)), ((i45 | (-33)) << 1) - (i45 ^ (-33)), (byte) ((i46 & (-68)) + (i46 | (-68))), (short) ((i47 ^ (-24)) + ((i47 & (-24)) << 1)), objArr12);
        java.lang.String str16 = (java.lang.String) objArr12[0];
        int i48 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int i49 = -(-android.graphics.Color.rgb(0, 0, 0));
        int i50 = -android.text.TextUtils.indexOf("", "", 0, 0);
        int i51 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
        int i52 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b((1497162799 ^ i48) + ((i48 & 1497162799) << 1), (((-316502658) | i49) << 1) - (i49 ^ (-316502658)), ((i50 | (-33)) << 1) - (i50 ^ (-33)), (byte) ((i51 & 98) + (i51 | 98)), (short) (((i52 | (-78)) << 1) - (i52 ^ (-78))), objArr13);
        java.lang.String str17 = (java.lang.String) objArr13[0];
        int i53 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
        int i54 = -(-android.text.TextUtils.getOffsetAfter("", 0));
        int i55 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b(((i53 | 1497162816) << 1) - (i53 ^ 1497162816), (-333279876) - (~absoluteGravity), (i54 & (-33)) + (i54 | (-33)), (byte) ((i55 ^ (-3)) + ((i55 & (-3)) << 1)), (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 114), objArr14);
        java.lang.String str18 = (java.lang.String) objArr14[0];
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 666, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 40025));
        byte[] bArr2 = $$a;
        byte b2 = bArr2[97];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        c(b2, (byte) (b2 | 111), (byte) (-bArr2[45]), objArr15);
        long j8 = cls2.getField((java.lang.String) objArr15[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        try {
                            if (j8 != -1) {
                                int identityHashCode4 = java.lang.System.identityHashCode(setselector2);
                                int i56 = ~identityHashCode4;
                                int i57 = ~((i56 & (-1106784600)) | (i56 ^ (-1106784600)));
                                int identityHashCode5 = java.lang.System.identityHashCode(setselector2);
                                num = 1;
                                int i58 = ~identityHashCode5;
                                setselector = setselector2;
                                int i59 = ~((i58 ^ (-137145497)) | (i58 & (-137145497)));
                                str = str18;
                                int i60 = ~(identityHashCode5 | (-2039839636));
                                int i61 = ~((identityHashCode5 ^ (-137145497)) | (identityHashCode5 & (-137145497)));
                                int i62 = ~((i58 ^ (-2039839636)) | (i58 & (-2039839636)));
                                if (((~((identityHashCode4 ^ (-1106784600)) | (identityHashCode4 & (-1106784600)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 59085378 + ((i56 | (-1106247747)) * (-216)) + (((i57 & 1139999818) | (1139999818 ^ i57)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) > (((((i59 & i60) | (i59 ^ i60)) * com.visa.cbp.getCertUsage.getODAData) - 989269739) - (~(((i61 & i62) | (i61 ^ i62)) * com.visa.cbp.getCertUsage.getODAData))) - 1 ? j8 + 1868 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j8 - 1868 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 40, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 667, (char) (40072 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr16);
                                    try {
                                        java.lang.Object[] objArr17 = {cls3.getField((java.lang.String) objArr16[0]).get(null), -1920026617, 0};
                                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj8 == null) {
                                            obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4684, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj8);
                                        }
                                        objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj8).invoke(null, objArr17);
                                        str2 = str;
                                        i = ((int[]) objArr3[1])[0];
                                        if (((int[]) objArr3[0])[0] != i) {
                                            int identityHashCode6 = java.lang.System.identityHashCode(setselector);
                                            int i63 = ~identityHashCode6;
                                            int i64 = ~((181004443 ^ i63) | (181004443 & i63));
                                            int i65 = (i64 ^ 555090432) | (555090432 & i64);
                                            int i66 = ~((-731294226) | i63);
                                            int i67 = -(-(((i65 & i66) | (i65 ^ i66)) * (-1136)));
                                            int i68 = ~(181004443 | identityHashCode6);
                                            int i69 = ~(((-731294226) ^ identityHashCode6) | ((-731294226) & identityHashCode6));
                                            int i70 = (i68 ^ i69) | (i68 & i69);
                                            int i71 = ((-181004444) ^ i63) | ((-181004444) & i63);
                                            int i72 = ~((731294225 ^ i71) | (731294225 & i71));
                                            int i73 = (~((i63 ^ 731294225) | (731294225 & i63))) | (~i71);
                                            int i74 = ~(identityHashCode6 | (-555090433));
                                            int i75 = -(-(((i74 ^ i73) | (i74 & i73)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
                                            int identityHashCode7 = java.lang.System.identityHashCode(setselector);
                                            int i76 = ~identityHashCode7;
                                            int i77 = (i76 ^ 1617444586) | (1617444586 & i76);
                                            int i78 = -(-(((~((i77 ^ 460742534) | (i77 & 460742534))) | (~(((-6299267) & identityHashCode7) | (identityHashCode7 ^ (-6299267))))) * (-318)));
                                            int i79 = ((-680845256) ^ i78) + ((i78 & (-680845256)) << 1);
                                            int i80 = ~((1617444586 ^ identityHashCode7) | (identityHashCode7 & 1617444586));
                                            int i81 = -(-(((i80 & 454443268) | (i80 ^ 454443268)) * (-318)));
                                            int i82 = (i79 & i81) + (i81 | i79);
                                            int i83 = -(-(((~(identityHashCode7 | (-1617444587))) | (-460742535)) * 318));
                                            if ((((((-417727219) ^ i67) + ((i67 & (-417727219)) << 1)) + (((i70 ^ i72) | (i70 & i72)) * (-568))) - (~i75)) - 1 > ((i82 | i83) << 1) - (i83 ^ i82)) {
                                                java.lang.Object[] objArr18 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), num};
                                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj9 == null) {
                                                    obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.combineMeasuredStates(0, 0), 4683 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.getDefaultSize(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj9);
                                                }
                                                ((java.lang.reflect.Method) obj9).invoke(null, objArr18);
                                            } else {
                                                java.lang.Object[] objArr19 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj10 == null) {
                                                    obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777183) - android.graphics.Color.rgb(0, 0, 0), android.view.View.combineMeasuredStates(0, 0) + 4684, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj10);
                                                }
                                                ((java.lang.reflect.Method) obj10).invoke(null, objArr19);
                                            }
                                            int i84 = SdkCoreAlternateContactlessPaymentDataImpl;
                                            int i85 = (i84 ^ 21) + ((i84 & 21) << 1);
                                            IccPrivateKeyCrtComponentsJson = i85 % 128;
                                            int i86 = i85 % 2;
                                            str3 = str2;
                                        } else {
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            java.lang.Object[] objArr20 = {objArr3};
                                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                            if (obj11 == null) {
                                                obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4683, (char) (android.os.Process.myPid() >> 22))).getMethod("values", java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj11);
                                            }
                                            arrayList.add(((java.lang.reflect.Method) obj11).invoke(null, objArr20));
                                            java.lang.Object[] objArr21 = {objArr3};
                                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                            if (obj12 == null) {
                                                str3 = str2;
                                                obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4685, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("writeReplace", java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj12);
                                            } else {
                                                str3 = str2;
                                            }
                                            arrayList.add(((java.lang.reflect.Method) obj12).invoke(null, objArr21));
                                            try {
                                                java.lang.Object[] objArr22 = {java.lang.Long.valueOf((i ^ r6) ^ (-2139925617955569664L)), -498240267L};
                                                byte b3 = $$d[65];
                                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                d(b3, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, b3, objArr23);
                                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                d(r3[101], 367, r3[8], objArr24);
                                                cls4.getMethod((java.lang.String) objArr24[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr22);
                                                java.lang.Object[] objArr25 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj13 == null) {
                                                    obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.KeyEvent.getDeadChar(0, 0), 4684 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj13);
                                                }
                                                ((java.lang.reflect.Method) obj13).invoke(null, objArr25);
                                                SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 97) % 128;
                                            } catch (java.lang.Throwable th) {
                                                java.lang.Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, 753 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (45560 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                        byte b4 = bArr2[97];
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        c(b4, (byte) (b4 | 111), (byte) (-bArr2[45]), objArr26);
                                        j = cls5.getField((java.lang.String) objArr26[0]).getLong(null);
                                        if (j != -1) {
                                            int identityHashCode8 = java.lang.System.identityHashCode(setselector);
                                            int i87 = ~(((-916851593) & identityHashCode8) | ((-916851593) ^ identityHashCode8));
                                            int i88 = (((i87 ^ 570556680) | (570556680 & i87)) * (-566)) - 1143951925;
                                            int i89 = (~((identityHashCode8 ^ (-346294913)) | ((-346294913) & identityHashCode8))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
                                            int i90 = ~java.lang.System.identityHashCode(setselector);
                                            int i91 = -(-(((~((1043933551 ^ i90) | (1043933551 & i90))) | 235995141) * (-970)));
                                            int i92 = ~(i90 | 1043933551);
                                            if (((i88 | i89) << 1) - (i89 ^ i88) <= (((((-1706988809) ^ i91) + (((-1706988809) & i91) << 1)) - 1453334208) - (~(-(-(((807938410 & i92) | (i92 ^ 807938410)) * 970))))) - 1 ? j + 1923 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j - 1923 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 47, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 755, (char) (android.view.MotionEvent.axisFromString("") + 45561));
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr27);
                                                java.lang.Object[] objArr28 = {cls6.getField((java.lang.String) objArr27[0]).get(null), 1178464752, 0};
                                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                if (obj14 == null) {
                                                    obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4790, (char) (31153 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 4750 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.View.MeasureSpec.getSize(0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj14);
                                                }
                                                obj2 = ((java.lang.reflect.Method) obj14).invoke(null, objArr28);
                                                str4 = str3;
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                if (obj3 == null) {
                                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4750, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 33701))).getMethod("values", null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj3);
                                                }
                                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                if (obj4 == null) {
                                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, 4750 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 33701))).getMethod("DigitizedCardProfile", null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj4);
                                                }
                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() == intValue) {
                                                    int i93 = SdkCoreAlternateContactlessPaymentDataImpl + 83;
                                                    IccPrivateKeyCrtComponentsJson = i93 % 128;
                                                    if (i93 % 2 != 0) {
                                                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                        if (obj15 == null) {
                                                            obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4750, (char) (33702 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("valueOf", null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj15);
                                                        }
                                                        java.lang.Object[] objArr29 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(obj2, null)).intValue()), 0};
                                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj16 == null) {
                                                            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4790, (char) (31152 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 40, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4750, (char) (android.view.View.getDefaultSize(0, 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj16);
                                                        }
                                                        ((java.lang.reflect.Method) obj16).invoke(null, objArr29);
                                                    } else {
                                                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                        if (obj17 == null) {
                                                            obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.alpha(0) + 4750, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33700))).getMethod("valueOf", null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj17);
                                                        }
                                                        java.lang.Object[] objArr30 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(obj2, null)).intValue()), 0};
                                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj18 == null) {
                                                            obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4790, (char) (31153 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 40, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4702, (char) ((android.os.Process.myTid() >> 22) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj18);
                                                        }
                                                        ((java.lang.reflect.Method) obj18).invoke(null, objArr30);
                                                    }
                                                } else {
                                                    java.lang.Object[] objArr31 = {java.lang.Long.valueOf(((~(intValue & r6)) & (intValue | r6)) ^ (-2121195785268756480L)), -493881428L};
                                                    byte[] bArr3 = $$d;
                                                    byte b5 = bArr3[65];
                                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                    d(b5, (short) (b5 | 328), bArr3[185], objArr32);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                                                    byte b6 = bArr3[66];
                                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                    d(b6, (short) (b6 | 403), bArr3[57], objArr33);
                                                    cls7.getMethod((java.lang.String) objArr33[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr31);
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                    if (obj19 == null) {
                                                        obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777176) - android.graphics.Color.rgb(0, 0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 4750, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 33701))).getMethod("valueOf", null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj19);
                                                    }
                                                    java.lang.Object[] objArr34 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(obj2, null)).intValue()), 0};
                                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                    if (obj20 == null) {
                                                        obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 40, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4790, (char) (31152 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 4749 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33700)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj20);
                                                    }
                                                    ((java.lang.reflect.Method) obj20).invoke(null, objArr34);
                                                }
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, android.widget.ExpandableListView.getPackedPositionType(0L) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.View.MeasureSpec.getMode(0) + 34284));
                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr35);
                                                j2 = cls8.getField((java.lang.String) objArr35[0]).getLong(null);
                                                if (j2 != -1) {
                                                    IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
                                                    if (j2 + 1939 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                        int i94 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                        int i95 = ((i94 | 121) << 1) - (i94 ^ 121);
                                                        IccPrivateKeyCrtComponentsJson = i95 % 128;
                                                        if (i95 % 2 != 0) {
                                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 47, 707 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (34285 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                            c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr36);
                                                            java.lang.Object[] objArr37 = {cls9.getField((java.lang.String) objArr36[0]).get(null), -1674328605, num};
                                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                            if (obj21 == null) {
                                                                obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.text.TextUtils.getOffsetBefore("", 0) + 4717, (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj21);
                                                            }
                                                            objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj21).invoke(null, objArr37);
                                                        } else {
                                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 47, 707 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34285));
                                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                            c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr38);
                                                            java.lang.Object[] objArr39 = {cls10.getField((java.lang.String) objArr38[0]).get(null), -1674328605, 0};
                                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                            if (obj22 == null) {
                                                                obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 34, 4717 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.os.Process.myPid() >> 22))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj22);
                                                            }
                                                            objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj22).invoke(null, objArr39);
                                                        }
                                                        str5 = str4;
                                                        i2 = ((int[]) objArr4[1])[0];
                                                        if (((int[]) objArr4[0])[0] != i2) {
                                                            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 67) % 128;
                                                            java.lang.Object[] objArr40 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[9])[0]), 0};
                                                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                            if (obj23 == null) {
                                                                obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.Color.argb(0, 0, 0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 4717, (char) (android.os.Process.myTid() >> 22))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj23);
                                                            }
                                                            ((java.lang.reflect.Method) obj23).invoke(null, objArr40);
                                                            str6 = str5;
                                                        } else {
                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                            arrayList2.add((java.lang.String) objArr4[2]);
                                                            arrayList2.add((java.lang.String) objArr4[3]);
                                                            arrayList2.add((java.lang.String) objArr4[4]);
                                                            arrayList2.add((java.lang.String) objArr4[5]);
                                                            arrayList2.add((java.lang.String) objArr4[6]);
                                                            arrayList2.add((java.lang.String) objArr4[7]);
                                                            arrayList2.add((java.lang.String) objArr4[8]);
                                                            java.lang.Object[] objArr41 = {java.lang.Long.valueOf(((i2 | r10) & (~(i2 & r10))) ^ (-5656860284069871616L)), -1317090422L};
                                                            byte[] bArr4 = $$d;
                                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                            d(bArr4[65], 322, bArr4[10], objArr42);
                                                            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr42[0]);
                                                            byte b7 = bArr4[66];
                                                            str6 = str5;
                                                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                            d(b7, (short) (b7 | 403), bArr4[57], objArr43);
                                                            cls11.getMethod((java.lang.String) objArr43[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr41);
                                                            java.lang.Object[] objArr44 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[9])[0]), 0};
                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                            if (obj24 == null) {
                                                                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 34, android.graphics.ImageFormat.getBitsPerPixel(0) + 4718, (char) android.view.View.getDefaultSize(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj24);
                                                            }
                                                            ((java.lang.reflect.Method) obj24).invoke(null, objArr44);
                                                            int i96 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                            IccPrivateKeyCrtComponentsJson = (((i96 | 49) << 1) - (i96 ^ 49)) % 128;
                                                        }
                                                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, 584 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24291));
                                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                        c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr45);
                                                        j3 = cls12.getField((java.lang.String) objArr45[0]).getLong(null);
                                                        if (j3 != -1) {
                                                            int i97 = IccPrivateKeyCrtComponentsJson + 3;
                                                            SdkCoreAlternateContactlessPaymentDataImpl = i97 % 128;
                                                            if (i97 % 2 != 0 ? j3 + 1857 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j3 / 1857 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 71) % 128;
                                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 583, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 24291));
                                                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr46);
                                                                java.lang.Object[] objArr47 = {cls13.getField((java.lang.String) objArr46[0]).get(null), -1632628423, 0};
                                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj25 == null) {
                                                                    obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.argb(0, 0, 0, 0) + 4830, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj25);
                                                                }
                                                                objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj25).invoke(null, objArr47);
                                                                num2 = 0;
                                                                str7 = "valueOf";
                                                                str8 = str15;
                                                                str10 = "";
                                                                bArr = bArr2;
                                                                str9 = str6;
                                                                objArr5 = objArr6;
                                                                i3 = ((int[]) objArr5[1])[0];
                                                                if (((int[]) objArr5[0])[0] == i3) {
                                                                    int i98 = SdkCoreAlternateContactlessPaymentDataImpl + 31;
                                                                    IccPrivateKeyCrtComponentsJson = i98 % 128;
                                                                    if (i98 % 2 != 0) {
                                                                        java.lang.Object[] objArr48 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[5])[0]), num};
                                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                        if (obj26 == null) {
                                                                            str11 = str7;
                                                                            obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.ImageFormat.getBitsPerPixel(0), 4830 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.os.Process.myTid() >> 22))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj26);
                                                                        } else {
                                                                            str11 = str7;
                                                                        }
                                                                        ((java.lang.reflect.Method) obj26).invoke(null, objArr48);
                                                                    } else {
                                                                        str11 = str7;
                                                                        java.lang.Object[] objArr49 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), num2};
                                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                        if (obj27 == null) {
                                                                            obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777246, android.graphics.Color.rgb(0, 0, 0) + 16782046, (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj27);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj27).invoke(null, objArr49);
                                                                    }
                                                                    int i99 = IccPrivateKeyCrtComponentsJson;
                                                                    int i100 = ((i99 | 25) << 1) - (i99 ^ 25);
                                                                    SdkCoreAlternateContactlessPaymentDataImpl = i100 % 128;
                                                                    int i101 = i100 % 2;
                                                                } else {
                                                                    str11 = str7;
                                                                    java.lang.Object[] objArr50 = {java.lang.Long.valueOf(((i3 | r5) & (~(i3 & r5))) ^ (-720355836190261248L)), -167720917L};
                                                                    byte[] bArr5 = $$d;
                                                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                                    d(bArr5[65], 231, bArr5[266], objArr51);
                                                                    java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr51[0]);
                                                                    byte b8 = bArr5[66];
                                                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                    d(b8, (short) (b8 | 403), bArr5[57], objArr52);
                                                                    cls14.getMethod((java.lang.String) objArr52[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr50);
                                                                    java.lang.Object[] objArr53 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), num2};
                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                    if (obj28 == null) {
                                                                        obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4830, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj28);
                                                                    }
                                                                    ((java.lang.reflect.Method) obj28).invoke(null, objArr53);
                                                                    IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
                                                                }
                                                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 51, 584 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24291));
                                                                byte b9 = bArr[97];
                                                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                                c(b9, (byte) (b9 | 111), (byte) (-bArr[45]), objArr54);
                                                                j4 = cls15.getField((java.lang.String) objArr54[0]).getLong(null);
                                                                try {
                                                                    if (j4 != -1) {
                                                                        int i102 = SdkCoreAlternateContactlessPaymentDataImpl + 19;
                                                                        IccPrivateKeyCrtComponentsJson = i102 % 128;
                                                                        if (i102 % 2 == 0 ? j4 + 1915 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j4 + 1915 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                            int i103 = IccPrivateKeyCrtComponentsJson;
                                                                            SdkCoreAlternateContactlessPaymentDataImpl = ((i103 & 77) + (i103 | 77)) % 128;
                                                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 584, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24291));
                                                                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                                            c((byte) (-bArr[108]), (byte) 60, bArr[97], objArr55);
                                                                            java.lang.Object[] objArr56 = {cls16.getField((java.lang.String) objArr55[0]).get(null), -1436012928, num2};
                                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                            if (obj29 == null) {
                                                                                obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4829, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj29);
                                                                            }
                                                                            objArr7 = (java.lang.Object[]) ((java.lang.reflect.Method) obj29).invoke(null, objArr56);
                                                                            int i104 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                            IccPrivateKeyCrtComponentsJson = (((i104 | 73) << 1) - (i104 ^ 73)) % 128;
                                                                            c2 = 0;
                                                                            c = 1;
                                                                            i4 = ((int[]) objArr7[c])[c2];
                                                                            if (((int[]) objArr7[c2])[c2] != i4) {
                                                                                int i105 = IccPrivateKeyCrtComponentsJson + 5;
                                                                                SdkCoreAlternateContactlessPaymentDataImpl = i105 % 128;
                                                                                if (i105 % 2 == 0) {
                                                                                    java.lang.Object[] objArr57 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[5])[1]), num};
                                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj30 == null) {
                                                                                        obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.MotionEvent.axisFromString(str10), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4829, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj30).invoke(null, objArr57);
                                                                                } else {
                                                                                    java.lang.Object[] objArr58 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), num2};
                                                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj31 == null) {
                                                                                        obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, android.text.TextUtils.indexOf(str10, str10, 0) + 4830, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj31).invoke(null, objArr58);
                                                                                }
                                                                            } else {
                                                                                new java.util.ArrayList().add((java.lang.String) objArr7[2]);
                                                                                java.lang.Object[] objArr59 = {java.lang.Long.valueOf(((~(i4 & r3)) & (i4 | r3)) ^ 5682741585196875776L), 1323116365L};
                                                                                byte b10 = $$d[65];
                                                                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                                d(b10, (short) (b10 | 138), r2[95], objArr60);
                                                                                java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                                                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                                d(r2[101], 367, r2[8], objArr61);
                                                                                cls17.getMethod((java.lang.String) objArr61[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr59);
                                                                                java.lang.Object[] objArr62 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), num2};
                                                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj32 == null) {
                                                                                    obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.ImageFormat.getBitsPerPixel(0), 4829 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.os.Process.myPid() >> 22))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj32);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj32).invoke(null, objArr62);
                                                                                int i106 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                IccPrivateKeyCrtComponentsJson = ((i106 ^ 29) + ((i106 & 29) << 1)) % 128;
                                                                            }
                                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 584 - android.text.TextUtils.getTrimmedLength(str10), (char) (android.text.TextUtils.indexOf(str10, str10, 0, 0) + 24291));
                                                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                                            c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr63);
                                                                            j5 = cls18.getField((java.lang.String) objArr63[0]).getLong(null);
                                                                            if (j5 != -1) {
                                                                                int i107 = IccPrivateKeyCrtComponentsJson;
                                                                                SdkCoreAlternateContactlessPaymentDataImpl = ((i107 ^ 107) + ((i107 & 107) << 1)) % 128;
                                                                                if (j5 + 2010 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 584 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (24291 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                                    c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr64);
                                                                                    java.lang.Object[] objArr65 = {cls19.getField((java.lang.String) objArr64[0]).get(null), -2037767799, num2};
                                                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj33 == null) {
                                                                                        obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4830, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj33);
                                                                                    }
                                                                                    objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj33).invoke(null, objArr65);
                                                                                    str13 = str10;
                                                                                    str12 = str11;
                                                                                    objArr8 = objArr9;
                                                                                    i5 = ((int[]) objArr8[1])[0];
                                                                                    if (((int[]) objArr8[0])[0] == i5) {
                                                                                        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 45) % 128;
                                                                                        java.lang.Object[] objArr66 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), num2};
                                                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                        if (obj34 == null) {
                                                                                            str14 = str12;
                                                                                            obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, 4830 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.graphics.Color.blue(0))).getMethod(str14, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj34);
                                                                                        } else {
                                                                                            str14 = str12;
                                                                                        }
                                                                                        ((java.lang.reflect.Method) obj34).invoke(null, objArr66);
                                                                                        int i108 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                        IccPrivateKeyCrtComponentsJson = ((i108 & 71) + (i108 | 71)) % 128;
                                                                                    } else {
                                                                                        str14 = str12;
                                                                                        java.lang.Object[] objArr67 = {java.lang.Long.valueOf((((~i5) & r5) | (i5 & (~r5))) ^ (-6690038078989402112L)), -1557645360L};
                                                                                        byte[] bArr6 = $$d;
                                                                                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                                                        d(bArr6[65], 231, bArr6[266], objArr68);
                                                                                        java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr68[0]);
                                                                                        byte b11 = bArr6[66];
                                                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                                        d(b11, (short) (b11 | 403), bArr6[57], objArr69);
                                                                                        cls20.getMethod((java.lang.String) objArr69[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr67);
                                                                                        java.lang.Object[] objArr70 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), num2};
                                                                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                        if (obj35 == null) {
                                                                                            obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 4830 - android.text.TextUtils.getTrimmedLength(str13), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod(str14, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj35);
                                                                                        }
                                                                                        ((java.lang.reflect.Method) obj35).invoke(null, objArr70);
                                                                                    }
                                                                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 922 - android.text.TextUtils.getOffsetAfter(str13, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                                    java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                                                    c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr71);
                                                                                    j6 = cls21.getField((java.lang.String) objArr71[0]).getLong(null);
                                                                                    try {
                                                                                        if (j6 != -1) {
                                                                                            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 71) % 128;
                                                                                            if (j6 + 1909 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                                int i109 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                IccPrivateKeyCrtComponentsJson = ((i109 ^ 53) + ((i109 & 53) << 1)) % 128;
                                                                                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 921 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                                                                c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr72);
                                                                                                java.lang.Object[] objArr73 = {cls22.getField((java.lang.String) objArr72[0]).get(null), -84364309, num2};
                                                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                if (obj36 == null) {
                                                                                                    obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 45, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4860, (char) (android.os.Process.myPid() >> 22))).getMethod(str14, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj36);
                                                                                                }
                                                                                                writeReplace$5f5b6fcf = (java.lang.Object[]) ((java.lang.reflect.Method) obj36).invoke(null, objArr73);
                                                                                                int i110 = IccPrivateKeyCrtComponentsJson;
                                                                                                SdkCoreAlternateContactlessPaymentDataImpl = ((i110 & 77) + (i110 | 77)) % 128;
                                                                                                c4 = 0;
                                                                                                c3 = 1;
                                                                                                i6 = ((int[]) writeReplace$5f5b6fcf[c3])[c4];
                                                                                                if (((int[]) writeReplace$5f5b6fcf[c4])[c4] != i6) {
                                                                                                    int i111 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                    IccPrivateKeyCrtComponentsJson = ((i111 ^ 113) + ((i111 & 113) << 1)) % 128;
                                                                                                    java.lang.Object[] objArr74 = {writeReplace$5f5b6fcf, java.lang.Integer.valueOf(((int[]) writeReplace$5f5b6fcf[3])[0]), num2};
                                                                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                    if (obj37 == null) {
                                                                                                        obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.view.KeyEvent.getDeadChar(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4860, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(str14, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj37);
                                                                                                    }
                                                                                                    ((java.lang.reflect.Method) obj37).invoke(null, objArr74);
                                                                                                } else {
                                                                                                    new java.util.ArrayList().add((java.lang.String) writeReplace$5f5b6fcf[2]);
                                                                                                    java.lang.Object[] objArr75 = {java.lang.Long.valueOf(((i6 & (~r4)) | ((~i6) & r4)) ^ (-5532988698494238720L)), -1288249318L};
                                                                                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                                                    d(r4[65], (short) (-$$d[14]), r4[288], objArr76);
                                                                                                    java.lang.Class<?> cls23 = java.lang.Class.forName((java.lang.String) objArr76[0]);
                                                                                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                                                                    d(r4[101], 367, r4[8], objArr77);
                                                                                                    cls23.getMethod((java.lang.String) objArr77[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr75);
                                                                                                    java.lang.Object[] objArr78 = {writeReplace$5f5b6fcf, java.lang.Integer.valueOf(((int[]) writeReplace$5f5b6fcf[3])[0]), num2};
                                                                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                    if (obj38 == null) {
                                                                                                        obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str13) + 46, android.view.View.getDefaultSize(0, 0) + 4860, (char) android.graphics.Color.green(0))).getMethod(str14, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj38);
                                                                                                    }
                                                                                                    ((java.lang.reflect.Method) obj38).invoke(null, objArr78);
                                                                                                }
                                                                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1580, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                                                c((byte) (bArr[1] + 1), (byte) 77, (byte) (bArr[109] - 1), objArr79);
                                                                                                j7 = cls24.getField((java.lang.String) objArr79[0]).getLong(null);
                                                                                                if (j7 != -1) {
                                                                                                    int i112 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                    IccPrivateKeyCrtComponentsJson = (((i112 | 75) << 1) - (i112 ^ 75)) % 128;
                                                                                                    if (j7 + 1977 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                                        int identityHashCode9 = java.lang.System.identityHashCode(setselector);
                                                                                                        int i113 = ((~(((-94397473) & identityHashCode9) | ((-94397473) ^ identityHashCode9))) | (-2009005563)) * 449;
                                                                                                        int i114 = (((1237211130 | i113) << 1) - (i113 ^ 1237211130)) + 301096881;
                                                                                                        int i115 = ~identityHashCode9;
                                                                                                        int i116 = (i115 ^ (-1437885881)) | ((-1437885881) & i115);
                                                                                                        int i117 = ~((i116 ^ (-665517155)) | ((-665517155) & i116));
                                                                                                        int i118 = ((i117 ^ (-2009005563)) | ((-2009005563) & i117)) * 449;
                                                                                                        int i119 = ~java.lang.System.identityHashCode(setselector);
                                                                                                        int i120 = ~((i119 ^ (-292501302)) | ((-292501302) & i119));
                                                                                                        int i121 = (-2028569388) - (~(((209750024 & i120) | (209750024 ^ i120)) * (-970)));
                                                                                                        int i122 = (671330836 ^ i121) + ((i121 & 671330836) << 1);
                                                                                                        int i123 = -(-(((i120 ^ (-502251326)) | ((-502251326) & i120)) * 970));
                                                                                                        if ((i114 ^ i118) + ((i118 & i114) << 1) <= (i122 ^ i123) + ((i123 & i122) << 1)) {
                                                                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48, 1581 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                                                                            c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr80);
                                                                                                            java.lang.Object[] objArr81 = {cls25.getField((java.lang.String) objArr80[0]).get(null), 1637932694, num};
                                                                                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                                                                            if (obj39 == null) {
                                                                                                                obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4905, (char) android.graphics.Color.red(0))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj39);
                                                                                                            }
                                                                                                            invoke = ((java.lang.reflect.Method) obj39).invoke(null, objArr81);
                                                                                                        } else {
                                                                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 1581, (char) android.text.TextUtils.getCapsMode(str13, 0, 0));
                                                                                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                                                                            c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr82);
                                                                                                            java.lang.Object[] objArr83 = {cls26.getField((java.lang.String) objArr82[0]).get(null), 1637932694, num2};
                                                                                                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                                                                            if (obj40 == null) {
                                                                                                                obj40 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4905, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj40);
                                                                                                            }
                                                                                                            invoke = ((java.lang.reflect.Method) obj40).invoke(null, objArr83);
                                                                                                        }
                                                                                                        objArr10 = (java.lang.Object[]) invoke;
                                                                                                        if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
                                                                                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                                            arrayList3.add((java.lang.String) objArr10[2]);
                                                                                                            arrayList3.add((java.lang.String) objArr10[3]);
                                                                                                        }
                                                                                                        int i124 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                        IccPrivateKeyCrtComponentsJson = ((i124 & 109) + (i124 | 109)) % 128;
                                                                                                        return null;
                                                                                                    }
                                                                                                }
                                                                                                int i125 = -(-android.view.View.combineMeasuredStates(0, 0));
                                                                                                int i126 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                                int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                                                                int identityHashCode10 = java.lang.System.identityHashCode(setselector);
                                                                                                int i127 = tapTimeout * (-109);
                                                                                                int i128 = ~tapTimeout;
                                                                                                int i129 = ~((identityHashCode10 ^ (-33)) | (identityHashCode10 & (-33)));
                                                                                                int i130 = ~((tapTimeout ^ (-33)) | (tapTimeout & (-33)));
                                                                                                int i131 = ~(identityHashCode10 | (-33));
                                                                                                int i132 = ~((i128 & (-33)) | (i128 ^ (-33)));
                                                                                                int i133 = ~((tapTimeout ^ 32) | (tapTimeout & 32));
                                                                                                int i134 = -(-android.text.TextUtils.indexOf(str13, str13));
                                                                                                java.lang.String str19 = str16;
                                                                                                java.lang.String str20 = str9;
                                                                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                                                b(1497162755 - (~i125), (((-333279883) | i126) << 1) - (i126 ^ (-333279883)), ((((i127 ^ (-3663)) + ((i127 & (-3663)) << 1)) - (~(((i128 & i129) | (i128 ^ i129)) * (-220)))) - 1) + (((i131 & i130) | (i131 ^ i130)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((i133 & i132) | (i133 ^ i132)) * 110), (byte) ((i134 & 12) + (i134 | 12)), (short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 101), objArr84);
                                                                                                java.lang.Class<?> cls27 = java.lang.Class.forName((java.lang.String) objArr84[0]);
                                                                                                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                                                int i135 = -(-android.text.TextUtils.getCapsMode(str13, 0, 0));
                                                                                                int i136 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                                int identityHashCode11 = java.lang.System.identityHashCode(setselector);
                                                                                                int i137 = i136 * (-381);
                                                                                                int i138 = (i137 ^ (-6528)) + ((i137 & (-6528)) << 1);
                                                                                                int i139 = ~i136;
                                                                                                int i140 = i139 * (-191);
                                                                                                int i141 = (i138 ^ i140) + ((i138 & i140) << 1);
                                                                                                int i142 = (i136 | (~((identityHashCode11 ^ (-34)) | (identityHashCode11 & (-34))))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                                                                                int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
                                                                                                int i144 = ~((i139 & (-34)) | (i139 ^ (-34)));
                                                                                                int i145 = ~identityHashCode11;
                                                                                                int i146 = ~((i145 ^ (-34)) | (i145 & (-34)));
                                                                                                int i147 = -(-(((i144 ^ i146) | (i144 & i146)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                                                                int i148 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                                int identityHashCode12 = java.lang.System.identityHashCode(setselector);
                                                                                                int i149 = i148 * 302;
                                                                                                int i150 = (((-35577) | i149) << 1) - (i149 ^ (-35577));
                                                                                                int i151 = ~i148;
                                                                                                int i152 = ~identityHashCode12;
                                                                                                int i153 = ~((i151 ^ i152) | (i151 & i152));
                                                                                                int i154 = -(-(((i153 ^ (-59)) | (i153 & (-59))) * (-602)));
                                                                                                int i155 = (i150 & i154) + (i150 | i154);
                                                                                                int i156 = ~((i151 ^ 58) | (i151 & 58));
                                                                                                int i157 = ~(identityHashCode12 | i151);
                                                                                                int i158 = (i157 ^ i156) | (i157 & i156);
                                                                                                int i159 = (i148 ^ i152) | (i148 & i152);
                                                                                                int i160 = ~((i159 ^ (-59)) | (i159 & (-59)));
                                                                                                int i161 = -(-(((i160 ^ i158) | (i160 & i158)) * (-301)));
                                                                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                                                b((1497162782 & resolveOpacity) + (resolveOpacity | 1497162782), (((-333279881) | i135) << 1) - (i135 ^ (-333279881)), ((i143 | i147) << 1) - (i147 ^ i143), (byte) ((i155 ^ i161) + ((i161 & i155) << 1) + ((~((i152 ^ (-59)) | (i152 & (-59)))) * 301)), (short) ((-3) - (~(-(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))))), objArr85);
                                                                                                context4 = (android.content.Context) cls27.getMethod((java.lang.String) objArr85[0], new java.lang.Class[0]).invoke(null, null);
                                                                                                if (context4 != null) {
                                                                                                    int i162 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                    int i163 = (i162 & 105) + (i162 | 105);
                                                                                                    IccPrivateKeyCrtComponentsJson = i163 % 128;
                                                                                                    if (i163 % 2 != 0) {
                                                                                                        context4.getApplicationContext();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    context4 = context4.getApplicationContext();
                                                                                                }
                                                                                                java.lang.Object[] objArr86 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str20, java.lang.Object.class).invoke(null, setselector)).intValue()), num2, 1637932694};
                                                                                                byte[] bArr7 = $$d;
                                                                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                                                d(bArr7[65], bArr7[185], bArr7[296], objArr87);
                                                                                                java.lang.Class<?> cls28 = java.lang.Class.forName((java.lang.String) objArr87[0]);
                                                                                                byte b12 = bArr7[17];
                                                                                                short s2 = bArr7[66];
                                                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                                                d(b12, s2, (byte) (s2 | 29), objArr88);
                                                                                                java.lang.String str21 = (java.lang.String) objArr88[0];
                                                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                                                e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr89);
                                                                                                java.lang.Object[] objArr90 = (java.lang.Object[]) cls28.getMethod(str21, java.lang.Class.forName((java.lang.String) objArr89[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr86);
                                                                                                if (context4 != null) {
                                                                                                    int i164 = IccPrivateKeyCrtComponentsJson;
                                                                                                    SdkCoreAlternateContactlessPaymentDataImpl = ((i164 & 83) + (i164 | 83)) % 128;
                                                                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1580, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                                                    c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr91);
                                                                                                    cls29.getField((java.lang.String) objArr91[0]).set(null, objArr90);
                                                                                                    try {
                                                                                                        long longValue = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str19, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 48, android.view.View.combineMeasuredStates(0, 0) + 1581, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                                                        c((byte) (bArr[1] + 1), (byte) 77, (byte) (bArr[109] - 1), objArr92);
                                                                                                        cls30.getField((java.lang.String) objArr92[0]).set(null, java.lang.Long.valueOf(longValue));
                                                                                                        int i165 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                        IccPrivateKeyCrtComponentsJson = (((i165 | 125) << 1) - (i165 ^ 125)) % 128;
                                                                                                    } catch (java.lang.Exception unused) {
                                                                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                                    }
                                                                                                }
                                                                                                objArr10 = objArr90;
                                                                                                if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
                                                                                                }
                                                                                                int i1242 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                                IccPrivateKeyCrtComponentsJson = ((i1242 & 109) + (i1242 | 109)) % 128;
                                                                                                return null;
                                                                                            }
                                                                                        }
                                                                                        long longValue2 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 921, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                                        c3 = 1;
                                                                                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                                        c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr93);
                                                                                        c4 = 0;
                                                                                        cls31.getField((java.lang.String) objArr93[0]).set(null, java.lang.Long.valueOf(longValue2));
                                                                                        i6 = ((int[]) writeReplace$5f5b6fcf[c3])[c4];
                                                                                        if (((int[]) writeReplace$5f5b6fcf[c4])[c4] != i6) {
                                                                                        }
                                                                                        java.lang.Class cls242 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1580, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                                        java.lang.Object[] objArr792 = new java.lang.Object[1];
                                                                                        c((byte) (bArr[1] + 1), (byte) 77, (byte) (bArr[109] - 1), objArr792);
                                                                                        j7 = cls242.getField((java.lang.String) objArr792[0]).getLong(null);
                                                                                        if (j7 != -1) {
                                                                                        }
                                                                                        int i1252 = -(-android.view.View.combineMeasuredStates(0, 0));
                                                                                        int i1262 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                        int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                                                        int identityHashCode102 = java.lang.System.identityHashCode(setselector);
                                                                                        int i1272 = tapTimeout2 * (-109);
                                                                                        int i1282 = ~tapTimeout2;
                                                                                        int i1292 = ~((identityHashCode102 ^ (-33)) | (identityHashCode102 & (-33)));
                                                                                        int i1302 = ~((tapTimeout2 ^ (-33)) | (tapTimeout2 & (-33)));
                                                                                        int i1312 = ~(identityHashCode102 | (-33));
                                                                                        int i1322 = ~((i1282 & (-33)) | (i1282 ^ (-33)));
                                                                                        int i1332 = ~((tapTimeout2 ^ 32) | (tapTimeout2 & 32));
                                                                                        int i1342 = -(-android.text.TextUtils.indexOf(str13, str13));
                                                                                        java.lang.String str192 = str16;
                                                                                        java.lang.String str202 = str9;
                                                                                        java.lang.Object[] objArr842 = new java.lang.Object[1];
                                                                                        b(1497162755 - (~i1252), (((-333279883) | i1262) << 1) - (i1262 ^ (-333279883)), ((((i1272 ^ (-3663)) + ((i1272 & (-3663)) << 1)) - (~(((i1282 & i1292) | (i1282 ^ i1292)) * (-220)))) - 1) + (((i1312 & i1302) | (i1312 ^ i1302)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((i1332 & i1322) | (i1332 ^ i1322)) * 110), (byte) ((i1342 & 12) + (i1342 | 12)), (short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 101), objArr842);
                                                                                        java.lang.Class<?> cls272 = java.lang.Class.forName((java.lang.String) objArr842[0]);
                                                                                        int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                                        int i1352 = -(-android.text.TextUtils.getCapsMode(str13, 0, 0));
                                                                                        int i1362 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                        int identityHashCode112 = java.lang.System.identityHashCode(setselector);
                                                                                        int i1372 = i1362 * (-381);
                                                                                        int i1382 = (i1372 ^ (-6528)) + ((i1372 & (-6528)) << 1);
                                                                                        int i1392 = ~i1362;
                                                                                        int i1402 = i1392 * (-191);
                                                                                        int i1412 = (i1382 ^ i1402) + ((i1382 & i1402) << 1);
                                                                                        int i1422 = (i1362 | (~((identityHashCode112 ^ (-34)) | (identityHashCode112 & (-34))))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                                                                        int i1432 = (i1412 ^ i1422) + ((i1422 & i1412) << 1);
                                                                                        int i1442 = ~((i1392 & (-34)) | (i1392 ^ (-34)));
                                                                                        int i1452 = ~identityHashCode112;
                                                                                        int i1462 = ~((i1452 ^ (-34)) | (i1452 & (-34)));
                                                                                        int i1472 = -(-(((i1442 ^ i1462) | (i1442 & i1462)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                                                        int i1482 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                        int identityHashCode122 = java.lang.System.identityHashCode(setselector);
                                                                                        int i1492 = i1482 * 302;
                                                                                        int i1502 = (((-35577) | i1492) << 1) - (i1492 ^ (-35577));
                                                                                        int i1512 = ~i1482;
                                                                                        int i1522 = ~identityHashCode122;
                                                                                        int i1532 = ~((i1512 ^ i1522) | (i1512 & i1522));
                                                                                        int i1542 = -(-(((i1532 ^ (-59)) | (i1532 & (-59))) * (-602)));
                                                                                        int i1552 = (i1502 & i1542) + (i1502 | i1542);
                                                                                        int i1562 = ~((i1512 ^ 58) | (i1512 & 58));
                                                                                        int i1572 = ~(identityHashCode122 | i1512);
                                                                                        int i1582 = (i1572 ^ i1562) | (i1572 & i1562);
                                                                                        int i1592 = (i1482 ^ i1522) | (i1482 & i1522);
                                                                                        int i1602 = ~((i1592 ^ (-59)) | (i1592 & (-59)));
                                                                                        int i1612 = -(-(((i1602 ^ i1582) | (i1602 & i1582)) * (-301)));
                                                                                        java.lang.Object[] objArr852 = new java.lang.Object[1];
                                                                                        b((1497162782 & resolveOpacity2) + (resolveOpacity2 | 1497162782), (((-333279881) | i1352) << 1) - (i1352 ^ (-333279881)), ((i1432 | i1472) << 1) - (i1472 ^ i1432), (byte) ((i1552 ^ i1612) + ((i1612 & i1552) << 1) + ((~((i1522 ^ (-59)) | (i1522 & (-59)))) * 301)), (short) ((-3) - (~(-(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))))), objArr852);
                                                                                        context4 = (android.content.Context) cls272.getMethod((java.lang.String) objArr852[0], new java.lang.Class[0]).invoke(null, null);
                                                                                        if (context4 != null) {
                                                                                        }
                                                                                        java.lang.Object[] objArr862 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str202, java.lang.Object.class).invoke(null, setselector)).intValue()), num2, 1637932694};
                                                                                        byte[] bArr72 = $$d;
                                                                                        java.lang.Object[] objArr872 = new java.lang.Object[1];
                                                                                        d(bArr72[65], bArr72[185], bArr72[296], objArr872);
                                                                                        java.lang.Class<?> cls282 = java.lang.Class.forName((java.lang.String) objArr872[0]);
                                                                                        byte b122 = bArr72[17];
                                                                                        short s22 = bArr72[66];
                                                                                        java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                                                        d(b122, s22, (byte) (s22 | 29), objArr882);
                                                                                        java.lang.String str212 = (java.lang.String) objArr882[0];
                                                                                        java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                                                        e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr892);
                                                                                        java.lang.Object[] objArr902 = (java.lang.Object[]) cls282.getMethod(str212, java.lang.Class.forName((java.lang.String) objArr892[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr862);
                                                                                        if (context4 != null) {
                                                                                        }
                                                                                        objArr10 = objArr902;
                                                                                        if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
                                                                                        }
                                                                                        int i12422 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                        IccPrivateKeyCrtComponentsJson = ((i12422 & 109) + (i12422 | 109)) % 128;
                                                                                        return null;
                                                                                    } catch (java.lang.Exception unused2) {
                                                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                    }
                                                                                    int intValue2 = ((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue();
                                                                                    java.lang.Object[] objArr94 = {-332548721};
                                                                                    obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                    if (obj7 == null) {
                                                                                        obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 873 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 15955))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj7);
                                                                                    }
                                                                                    writeReplace$5f5b6fcf = com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8.writeReplace$5f5b6fcf(intValue2, ((java.lang.reflect.Constructor) obj7).newInstance(objArr94), -84364309);
                                                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, 923 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                                    c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr95);
                                                                                    cls32.getField((java.lang.String) objArr95[0]).set(null, writeReplace$5f5b6fcf);
                                                                                }
                                                                            }
                                                                            int i166 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                            int i167 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                            int identityHashCode13 = java.lang.System.identityHashCode(setselector);
                                                                            int i168 = ~identityHashCode13;
                                                                            int i169 = (~(333279883 | i168)) | (~((333279883 ^ i167) | (333279883 & i167)));
                                                                            int i170 = ~((i168 ^ i167) | (i168 & i167));
                                                                            int i171 = (i169 & i170) | (i169 ^ i170);
                                                                            int i172 = ~i167;
                                                                            int i173 = ((-333279884) ^ i172) | ((-333279884) & i172);
                                                                            int i174 = ~((identityHashCode13 & i173) | (i173 ^ identityHashCode13));
                                                                            int i175 = (i167 * (-589)) + 600084172 + (((i174 ^ i171) | (i174 & i171)) * 590);
                                                                            int i176 = ~((333279883 ^ i168) | (333279883 & i168));
                                                                            int i177 = ~(333279883 | i167);
                                                                            int i178 = (i176 ^ i177) | (i176 & i177);
                                                                            int i179 = ~(i167 | i168);
                                                                            int i180 = -(-(((i179 ^ i178) | (i178 & i179)) * (-1180)));
                                                                            int i181 = ~((i172 & i168) | (i172 ^ i168));
                                                                            int i182 = ~((i168 & (-333279884)) | ((-333279884) ^ i168));
                                                                            int i183 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                            int i184 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                            int identityHashCode14 = java.lang.System.identityHashCode(setselector);
                                                                            int i185 = ~identityHashCode14;
                                                                            int i186 = ~((i185 ^ (-13)) | (i185 & (-13)));
                                                                            int i187 = ~((i184 & (-13)) | (i184 ^ (-13)));
                                                                            str12 = str11;
                                                                            int i188 = (i184 * (-244)) + 2952 + (((i186 & i187) | (i186 ^ i187)) * (-245));
                                                                            int i189 = ~((identityHashCode14 ^ (-13)) | (identityHashCode14 & (-13)));
                                                                            int i190 = i189 * (-245);
                                                                            int i191 = ((i188 | i190) << 1) - (i188 ^ i190);
                                                                            int i192 = ((i184 & i189) | (i184 ^ i189)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                                                                            byte b13 = (byte) (((i191 | i192) << 1) - (i192 ^ i191));
                                                                            int i193 = -android.view.View.MeasureSpec.getMode(0);
                                                                            int identityHashCode15 = java.lang.System.identityHashCode(setselector);
                                                                            int i194 = i193 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                                                            int i195 = (52520 ^ i194) + ((i194 & 52520) << 1);
                                                                            int i196 = ~identityHashCode15;
                                                                            java.lang.String str22 = str16;
                                                                            int i197 = ~((i196 ^ (-101)) | (i196 & (-101)));
                                                                            int i198 = -(-(((i197 & i193) | (i197 ^ i193)) * (-1042)));
                                                                            int i199 = (i195 ^ i198) + ((i198 & i195) << 1);
                                                                            int i200 = ((identityHashCode15 ^ (-101)) | (identityHashCode15 & (-101))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                            int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
                                                                            int i202 = ~i193;
                                                                            int i203 = ~((i202 & 100) | (i202 ^ 100));
                                                                            int i204 = ~(i202 | identityHashCode15);
                                                                            int i205 = (i193 ^ i196) | (i193 & i196);
                                                                            int i206 = ((i204 ^ i203) | (i204 & i203) | (~((i205 ^ (-101)) | (i205 & (-101))))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                            b((1497162756 & i166) + (i166 | 1497162756), (((i175 | i180) << 1) - (i180 ^ i175)) + (((i181 & i182) | (i181 ^ i182)) * 590), ((i183 | (-33)) << 1) - (i183 ^ (-33)), b13, (short) ((i201 & i206) + (i206 | i201)), objArr96);
                                                                            java.lang.Class<?> cls33 = java.lang.Class.forName((java.lang.String) objArr96[0]);
                                                                            int i207 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                            int identityHashCode16 = java.lang.System.identityHashCode(setselector);
                                                                            int i208 = (i207 * (-317)) + 853557283;
                                                                            int i209 = ~i207;
                                                                            int i210 = ~(((-1497162782) & i209) | ((-1497162782) ^ i209) | identityHashCode16);
                                                                            int i211 = ~identityHashCode16;
                                                                            int i212 = (i211 ^ i207) | (i211 & i207);
                                                                            int i213 = ~((i212 & 1497162781) | (1497162781 ^ i212));
                                                                            int i214 = -(-(((i210 ^ i213) | (i210 & i213)) * (-318)));
                                                                            int i215 = ((i208 | i214) << 1) - (i208 ^ i214);
                                                                            int i216 = ~(((-1497162782) & i207) | ((-1497162782) ^ i207));
                                                                            int i217 = ~((i207 & identityHashCode16) | (i207 ^ identityHashCode16));
                                                                            int i218 = ((i217 ^ i216) | (i216 & i217)) * (-318);
                                                                            int i219 = (i215 & i218) + (i218 | i215);
                                                                            int i220 = ((~((i209 & identityHashCode16) | (identityHashCode16 ^ i209))) | (-1497162782)) * 318;
                                                                            int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                                                                            int i221 = -android.view.View.resolveSize(0, 0);
                                                                            int i222 = -(-android.text.TextUtils.indexOf(str10, str10, 0));
                                                                            int i223 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                                            int identityHashCode17 = java.lang.System.identityHashCode(setselector);
                                                                            int i224 = (i223 * (-563)) - 1695;
                                                                            int i225 = ~i223;
                                                                            int i226 = ~identityHashCode17;
                                                                            int i227 = (~((i226 & 2) | (i226 ^ 2))) | i225;
                                                                            java.lang.String str23 = str10;
                                                                            int i228 = ~((identityHashCode17 ^ (-3)) | (identityHashCode17 & (-3)));
                                                                            int i229 = -(-(((i227 ^ i228) | (i228 & i227)) * (-564)));
                                                                            int i230 = ((i224 | i229) << 1) - (i229 ^ i224);
                                                                            int i231 = (i225 ^ (-3)) | (i225 & (-3));
                                                                            int i232 = (~((i231 ^ identityHashCode17) | (i231 & identityHashCode17))) * 1128;
                                                                            int i233 = ~((i226 & i225) | (i225 ^ i226));
                                                                            int i234 = ~((i223 ^ (-3)) | (i223 & (-3)));
                                                                            short s3 = (short) ((((i230 & i232) + (i232 | i230)) - (~(-(-(((i234 & i233) | (i234 ^ i233)) * 564))))) - 1);
                                                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                            b(((i219 | i220) << 1) - (i220 ^ i219), (touchSlop >> 8) - 333279881, (-34) - (~i221), (byte) (((i222 | (-60)) << 1) - (i222 ^ (-60))), s3, objArr97);
                                                                            context3 = (android.content.Context) cls33.getMethod((java.lang.String) objArr97[0], new java.lang.Class[0]).invoke(null, null);
                                                                            if (context3 != null) {
                                                                                int i235 = IccPrivateKeyCrtComponentsJson;
                                                                                int i236 = (i235 ^ 69) + ((i235 & 69) << 1);
                                                                                SdkCoreAlternateContactlessPaymentDataImpl = i236 % 128;
                                                                                if (i236 % 2 == 0) {
                                                                                    context3.getApplicationContext();
                                                                                    throw new java.lang.ArithmeticException();
                                                                                }
                                                                                context3 = context3.getApplicationContext();
                                                                            }
                                                                            java.lang.Object[] objArr98 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -2037767799};
                                                                            byte[] bArr8 = $$d;
                                                                            byte b14 = bArr8[65];
                                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                            d(b14, (short) (b14 | 98), (byte) (bArr8[121] + 1), objArr99);
                                                                            java.lang.Class<?> cls34 = java.lang.Class.forName((java.lang.String) objArr99[0]);
                                                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                            d(bArr8[5], bArr8[341], bArr8[66], objArr100);
                                                                            java.lang.String str24 = (java.lang.String) objArr100[0];
                                                                            int i237 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                            int identityHashCode18 = java.lang.System.identityHashCode(setselector);
                                                                            int i238 = (i237 * (-344)) - 344;
                                                                            int i239 = ~i237;
                                                                            int i240 = (i239 ^ (-2)) | (i239 & (-2));
                                                                            int i241 = ~i240;
                                                                            int i242 = ~((i239 ^ identityHashCode18) | (i239 & identityHashCode18));
                                                                            int i243 = -(-(((i241 & i242) | (i241 ^ i242)) * 345));
                                                                            int i244 = ~identityHashCode18;
                                                                            int i245 = (i238 ^ i243) + ((i238 & i243) << 1) + (((~(i237 | (-2))) | (~((i239 ^ i244) | (i239 & i244)))) * 345);
                                                                            int i246 = -(-((~((i240 & identityHashCode18) | (identityHashCode18 ^ i240))) * 345));
                                                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                            e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i245 & i246) + (i246 | i245), objArr101);
                                                                            objArr8 = (java.lang.Object[]) cls34.getMethod(str24, java.lang.Class.forName((java.lang.String) objArr101[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr98);
                                                                            if (context3 != null) {
                                                                                str16 = str22;
                                                                                str13 = str23;
                                                                                objArr9 = objArr8;
                                                                                objArr8 = objArr9;
                                                                                i5 = ((int[]) objArr8[1])[0];
                                                                                if (((int[]) objArr8[0])[0] == i5) {
                                                                                }
                                                                                java.lang.Class cls212 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 922 - android.text.TextUtils.getOffsetAfter(str13, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                                java.lang.Object[] objArr712 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr712);
                                                                                j6 = cls212.getField((java.lang.String) objArr712[0]).getLong(null);
                                                                                if (j6 != -1) {
                                                                                }
                                                                                int intValue22 = ((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue();
                                                                                java.lang.Object[] objArr942 = {-332548721};
                                                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                if (obj7 == null) {
                                                                                }
                                                                                writeReplace$5f5b6fcf = com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8.writeReplace$5f5b6fcf(intValue22, ((java.lang.reflect.Constructor) obj7).newInstance(objArr942), -84364309);
                                                                                java.lang.Class cls322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, 923 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                                                c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr952);
                                                                                cls322.getField((java.lang.String) objArr952[0]).set(null, writeReplace$5f5b6fcf);
                                                                                long longValue22 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                java.lang.Class cls312 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 921, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                                c3 = 1;
                                                                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr932);
                                                                                c4 = 0;
                                                                                cls312.getField((java.lang.String) objArr932[0]).set(null, java.lang.Long.valueOf(longValue22));
                                                                                i6 = ((int[]) writeReplace$5f5b6fcf[c3])[c4];
                                                                                if (((int[]) writeReplace$5f5b6fcf[c4])[c4] != i6) {
                                                                                }
                                                                                java.lang.Class cls2422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1580, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                                java.lang.Object[] objArr7922 = new java.lang.Object[1];
                                                                                c((byte) (bArr[1] + 1), (byte) 77, (byte) (bArr[109] - 1), objArr7922);
                                                                                j7 = cls2422.getField((java.lang.String) objArr7922[0]).getLong(null);
                                                                                if (j7 != -1) {
                                                                                }
                                                                                int i12522 = -(-android.view.View.combineMeasuredStates(0, 0));
                                                                                int i12622 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                int tapTimeout22 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                                                int identityHashCode1022 = java.lang.System.identityHashCode(setselector);
                                                                                int i12722 = tapTimeout22 * (-109);
                                                                                int i12822 = ~tapTimeout22;
                                                                                int i12922 = ~((identityHashCode1022 ^ (-33)) | (identityHashCode1022 & (-33)));
                                                                                int i13022 = ~((tapTimeout22 ^ (-33)) | (tapTimeout22 & (-33)));
                                                                                int i13122 = ~(identityHashCode1022 | (-33));
                                                                                int i13222 = ~((i12822 & (-33)) | (i12822 ^ (-33)));
                                                                                int i13322 = ~((tapTimeout22 ^ 32) | (tapTimeout22 & 32));
                                                                                int i13422 = -(-android.text.TextUtils.indexOf(str13, str13));
                                                                                java.lang.String str1922 = str16;
                                                                                java.lang.String str2022 = str9;
                                                                                java.lang.Object[] objArr8422 = new java.lang.Object[1];
                                                                                b(1497162755 - (~i12522), (((-333279883) | i12622) << 1) - (i12622 ^ (-333279883)), ((((i12722 ^ (-3663)) + ((i12722 & (-3663)) << 1)) - (~(((i12822 & i12922) | (i12822 ^ i12922)) * (-220)))) - 1) + (((i13122 & i13022) | (i13122 ^ i13022)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((i13322 & i13222) | (i13322 ^ i13222)) * 110), (byte) ((i13422 & 12) + (i13422 | 12)), (short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 101), objArr8422);
                                                                                java.lang.Class<?> cls2722 = java.lang.Class.forName((java.lang.String) objArr8422[0]);
                                                                                int resolveOpacity22 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                                int i13522 = -(-android.text.TextUtils.getCapsMode(str13, 0, 0));
                                                                                int i13622 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                int identityHashCode1122 = java.lang.System.identityHashCode(setselector);
                                                                                int i13722 = i13622 * (-381);
                                                                                int i13822 = (i13722 ^ (-6528)) + ((i13722 & (-6528)) << 1);
                                                                                int i13922 = ~i13622;
                                                                                int i14022 = i13922 * (-191);
                                                                                int i14122 = (i13822 ^ i14022) + ((i13822 & i14022) << 1);
                                                                                int i14222 = (i13622 | (~((identityHashCode1122 ^ (-34)) | (identityHashCode1122 & (-34))))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                                                                int i14322 = (i14122 ^ i14222) + ((i14222 & i14122) << 1);
                                                                                int i14422 = ~((i13922 & (-34)) | (i13922 ^ (-34)));
                                                                                int i14522 = ~identityHashCode1122;
                                                                                int i14622 = ~((i14522 ^ (-34)) | (i14522 & (-34)));
                                                                                int i14722 = -(-(((i14422 ^ i14622) | (i14422 & i14622)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                                                int i14822 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                int identityHashCode1222 = java.lang.System.identityHashCode(setselector);
                                                                                int i14922 = i14822 * 302;
                                                                                int i15022 = (((-35577) | i14922) << 1) - (i14922 ^ (-35577));
                                                                                int i15122 = ~i14822;
                                                                                int i15222 = ~identityHashCode1222;
                                                                                int i15322 = ~((i15122 ^ i15222) | (i15122 & i15222));
                                                                                int i15422 = -(-(((i15322 ^ (-59)) | (i15322 & (-59))) * (-602)));
                                                                                int i15522 = (i15022 & i15422) + (i15022 | i15422);
                                                                                int i15622 = ~((i15122 ^ 58) | (i15122 & 58));
                                                                                int i15722 = ~(identityHashCode1222 | i15122);
                                                                                int i15822 = (i15722 ^ i15622) | (i15722 & i15622);
                                                                                int i15922 = (i14822 ^ i15222) | (i14822 & i15222);
                                                                                int i16022 = ~((i15922 ^ (-59)) | (i15922 & (-59)));
                                                                                int i16122 = -(-(((i16022 ^ i15822) | (i16022 & i15822)) * (-301)));
                                                                                java.lang.Object[] objArr8522 = new java.lang.Object[1];
                                                                                b((1497162782 & resolveOpacity22) + (resolveOpacity22 | 1497162782), (((-333279881) | i13522) << 1) - (i13522 ^ (-333279881)), ((i14322 | i14722) << 1) - (i14722 ^ i14322), (byte) ((i15522 ^ i16122) + ((i16122 & i15522) << 1) + ((~((i15222 ^ (-59)) | (i15222 & (-59)))) * 301)), (short) ((-3) - (~(-(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))))), objArr8522);
                                                                                context4 = (android.content.Context) cls2722.getMethod((java.lang.String) objArr8522[0], new java.lang.Class[0]).invoke(null, null);
                                                                                if (context4 != null) {
                                                                                }
                                                                                java.lang.Object[] objArr8622 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str2022, java.lang.Object.class).invoke(null, setselector)).intValue()), num2, 1637932694};
                                                                                byte[] bArr722 = $$d;
                                                                                java.lang.Object[] objArr8722 = new java.lang.Object[1];
                                                                                d(bArr722[65], bArr722[185], bArr722[296], objArr8722);
                                                                                java.lang.Class<?> cls2822 = java.lang.Class.forName((java.lang.String) objArr8722[0]);
                                                                                byte b1222 = bArr722[17];
                                                                                short s222 = bArr722[66];
                                                                                java.lang.Object[] objArr8822 = new java.lang.Object[1];
                                                                                d(b1222, s222, (byte) (s222 | 29), objArr8822);
                                                                                java.lang.String str2122 = (java.lang.String) objArr8822[0];
                                                                                java.lang.Object[] objArr8922 = new java.lang.Object[1];
                                                                                e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr8922);
                                                                                java.lang.Object[] objArr9022 = (java.lang.Object[]) cls2822.getMethod(str2122, java.lang.Class.forName((java.lang.String) objArr8922[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr8622);
                                                                                if (context4 != null) {
                                                                                }
                                                                                objArr10 = objArr9022;
                                                                                if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
                                                                                }
                                                                                int i124222 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                IccPrivateKeyCrtComponentsJson = ((i124222 & 109) + (i124222 | 109)) % 128;
                                                                                return null;
                                                                            }
                                                                            int i247 = SdkCoreAlternateContactlessPaymentDataImpl + 119;
                                                                            IccPrivateKeyCrtComponentsJson = i247 % 128;
                                                                            try {
                                                                                if (i247 % 2 != 0) {
                                                                                    str13 = str23;
                                                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.getOffsetBefore(str13, 0), 584 - (android.os.Process.myPid() >> 22), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24291));
                                                                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                                    c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr102);
                                                                                    cls35.getField((java.lang.String) objArr102[0]).set(null, objArr8);
                                                                                    str16 = str22;
                                                                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue());
                                                                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 51, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 584, (char) (android.view.View.MeasureSpec.getMode(0) + 24291));
                                                                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                                    c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr103);
                                                                                    obj6 = objArr103[0];
                                                                                } else {
                                                                                    str16 = str22;
                                                                                    str13 = str23;
                                                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str13, 0) + 51, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 584, (char) (24291 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                                                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                                    c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr104);
                                                                                    cls36.getField((java.lang.String) objArr104[0]).set(null, objArr8);
                                                                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 51, 584 - android.graphics.Color.green(0), (char) (android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24292));
                                                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                                    c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr105);
                                                                                    obj6 = objArr105[0];
                                                                                }
                                                                                cls.getField((java.lang.String) obj6).set(null, valueOf2);
                                                                                i5 = ((int[]) objArr8[1])[0];
                                                                                if (((int[]) objArr8[0])[0] == i5) {
                                                                                }
                                                                                java.lang.Class cls2122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 922 - android.text.TextUtils.getOffsetAfter(str13, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                                java.lang.Object[] objArr7122 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr7122);
                                                                                j6 = cls2122.getField((java.lang.String) objArr7122[0]).getLong(null);
                                                                                if (j6 != -1) {
                                                                                }
                                                                                int intValue222 = ((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue();
                                                                                java.lang.Object[] objArr9422 = {-332548721};
                                                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                if (obj7 == null) {
                                                                                }
                                                                                writeReplace$5f5b6fcf = com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8.writeReplace$5f5b6fcf(intValue222, ((java.lang.reflect.Constructor) obj7).newInstance(objArr9422), -84364309);
                                                                                java.lang.Class cls3222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, 923 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                                                java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                                                                c((byte) (bArr[1] + 1), bArr[97], bArr[109], objArr9522);
                                                                                cls3222.getField((java.lang.String) objArr9522[0]).set(null, writeReplace$5f5b6fcf);
                                                                                long longValue222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                java.lang.Class cls3122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 921, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                                c3 = 1;
                                                                                java.lang.Object[] objArr9322 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr9322);
                                                                                c4 = 0;
                                                                                cls3122.getField((java.lang.String) objArr9322[0]).set(null, java.lang.Long.valueOf(longValue222));
                                                                                i6 = ((int[]) writeReplace$5f5b6fcf[c3])[c4];
                                                                                if (((int[]) writeReplace$5f5b6fcf[c4])[c4] != i6) {
                                                                                }
                                                                                java.lang.Class cls24222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1580, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                                java.lang.Object[] objArr79222 = new java.lang.Object[1];
                                                                                c((byte) (bArr[1] + 1), (byte) 77, (byte) (bArr[109] - 1), objArr79222);
                                                                                j7 = cls24222.getField((java.lang.String) objArr79222[0]).getLong(null);
                                                                                if (j7 != -1) {
                                                                                }
                                                                                int i125222 = -(-android.view.View.combineMeasuredStates(0, 0));
                                                                                int i126222 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                int tapTimeout222 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                                                int identityHashCode10222 = java.lang.System.identityHashCode(setselector);
                                                                                int i127222 = tapTimeout222 * (-109);
                                                                                int i128222 = ~tapTimeout222;
                                                                                int i129222 = ~((identityHashCode10222 ^ (-33)) | (identityHashCode10222 & (-33)));
                                                                                int i130222 = ~((tapTimeout222 ^ (-33)) | (tapTimeout222 & (-33)));
                                                                                int i131222 = ~(identityHashCode10222 | (-33));
                                                                                int i132222 = ~((i128222 & (-33)) | (i128222 ^ (-33)));
                                                                                int i133222 = ~((tapTimeout222 ^ 32) | (tapTimeout222 & 32));
                                                                                int i134222 = -(-android.text.TextUtils.indexOf(str13, str13));
                                                                                java.lang.String str19222 = str16;
                                                                                java.lang.String str20222 = str9;
                                                                                java.lang.Object[] objArr84222 = new java.lang.Object[1];
                                                                                b(1497162755 - (~i125222), (((-333279883) | i126222) << 1) - (i126222 ^ (-333279883)), ((((i127222 ^ (-3663)) + ((i127222 & (-3663)) << 1)) - (~(((i128222 & i129222) | (i128222 ^ i129222)) * (-220)))) - 1) + (((i131222 & i130222) | (i131222 ^ i130222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((i133222 & i132222) | (i133222 ^ i132222)) * 110), (byte) ((i134222 & 12) + (i134222 | 12)), (short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 101), objArr84222);
                                                                                java.lang.Class<?> cls27222 = java.lang.Class.forName((java.lang.String) objArr84222[0]);
                                                                                int resolveOpacity222 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                                                int i135222 = -(-android.text.TextUtils.getCapsMode(str13, 0, 0));
                                                                                int i136222 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                int identityHashCode11222 = java.lang.System.identityHashCode(setselector);
                                                                                int i137222 = i136222 * (-381);
                                                                                int i138222 = (i137222 ^ (-6528)) + ((i137222 & (-6528)) << 1);
                                                                                int i139222 = ~i136222;
                                                                                int i140222 = i139222 * (-191);
                                                                                int i141222 = (i138222 ^ i140222) + ((i138222 & i140222) << 1);
                                                                                int i142222 = (i136222 | (~((identityHashCode11222 ^ (-34)) | (identityHashCode11222 & (-34))))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                                                                int i143222 = (i141222 ^ i142222) + ((i142222 & i141222) << 1);
                                                                                int i144222 = ~((i139222 & (-34)) | (i139222 ^ (-34)));
                                                                                int i145222 = ~identityHashCode11222;
                                                                                int i146222 = ~((i145222 ^ (-34)) | (i145222 & (-34)));
                                                                                int i147222 = -(-(((i144222 ^ i146222) | (i144222 & i146222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                                                                int i148222 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                int identityHashCode12222 = java.lang.System.identityHashCode(setselector);
                                                                                int i149222 = i148222 * 302;
                                                                                int i150222 = (((-35577) | i149222) << 1) - (i149222 ^ (-35577));
                                                                                int i151222 = ~i148222;
                                                                                int i152222 = ~identityHashCode12222;
                                                                                int i153222 = ~((i151222 ^ i152222) | (i151222 & i152222));
                                                                                int i154222 = -(-(((i153222 ^ (-59)) | (i153222 & (-59))) * (-602)));
                                                                                int i155222 = (i150222 & i154222) + (i150222 | i154222);
                                                                                int i156222 = ~((i151222 ^ 58) | (i151222 & 58));
                                                                                int i157222 = ~(identityHashCode12222 | i151222);
                                                                                int i158222 = (i157222 ^ i156222) | (i157222 & i156222);
                                                                                int i159222 = (i148222 ^ i152222) | (i148222 & i152222);
                                                                                int i160222 = ~((i159222 ^ (-59)) | (i159222 & (-59)));
                                                                                int i161222 = -(-(((i160222 ^ i158222) | (i160222 & i158222)) * (-301)));
                                                                                java.lang.Object[] objArr85222 = new java.lang.Object[1];
                                                                                b((1497162782 & resolveOpacity222) + (resolveOpacity222 | 1497162782), (((-333279881) | i135222) << 1) - (i135222 ^ (-333279881)), ((i143222 | i147222) << 1) - (i147222 ^ i143222), (byte) ((i155222 ^ i161222) + ((i161222 & i155222) << 1) + ((~((i152222 ^ (-59)) | (i152222 & (-59)))) * 301)), (short) ((-3) - (~(-(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))))), objArr85222);
                                                                                context4 = (android.content.Context) cls27222.getMethod((java.lang.String) objArr85222[0], new java.lang.Class[0]).invoke(null, null);
                                                                                if (context4 != null) {
                                                                                }
                                                                                java.lang.Object[] objArr86222 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str20222, java.lang.Object.class).invoke(null, setselector)).intValue()), num2, 1637932694};
                                                                                byte[] bArr7222 = $$d;
                                                                                java.lang.Object[] objArr87222 = new java.lang.Object[1];
                                                                                d(bArr7222[65], bArr7222[185], bArr7222[296], objArr87222);
                                                                                java.lang.Class<?> cls28222 = java.lang.Class.forName((java.lang.String) objArr87222[0]);
                                                                                byte b12222 = bArr7222[17];
                                                                                short s2222 = bArr7222[66];
                                                                                java.lang.Object[] objArr88222 = new java.lang.Object[1];
                                                                                d(b12222, s2222, (byte) (s2222 | 29), objArr88222);
                                                                                java.lang.String str21222 = (java.lang.String) objArr88222[0];
                                                                                java.lang.Object[] objArr89222 = new java.lang.Object[1];
                                                                                e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr89222);
                                                                                java.lang.Object[] objArr90222 = (java.lang.Object[]) cls28222.getMethod(str21222, java.lang.Class.forName((java.lang.String) objArr89222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr86222);
                                                                                if (context4 != null) {
                                                                                }
                                                                                objArr10 = objArr90222;
                                                                                if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
                                                                                }
                                                                                int i1242222 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                                IccPrivateKeyCrtComponentsJson = ((i1242222 & 109) + (i1242222 | 109)) % 128;
                                                                                return null;
                                                                            } catch (java.lang.Exception unused3) {
                                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                            }
                                                                        }
                                                                    }
                                                                    long longValue3 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10) + 51, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                                    byte b15 = bArr[97];
                                                                    c = 1;
                                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                    c(b15, (byte) (b15 | 111), (byte) (-bArr[45]), objArr106);
                                                                    c2 = 0;
                                                                    cls37.getField((java.lang.String) objArr106[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                    i4 = ((int[]) objArr7[c])[c2];
                                                                    if (((int[]) objArr7[c2])[c2] != i4) {
                                                                    }
                                                                    java.lang.Class cls182 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 584 - android.text.TextUtils.getTrimmedLength(str10), (char) (android.text.TextUtils.indexOf(str10, str10, 0, 0) + 24291));
                                                                    java.lang.Object[] objArr632 = new java.lang.Object[1];
                                                                    c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr632);
                                                                    j5 = cls182.getField((java.lang.String) objArr632[0]).getLong(null);
                                                                    if (j5 != -1) {
                                                                    }
                                                                    int i1662 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                    int i1672 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                    int identityHashCode132 = java.lang.System.identityHashCode(setselector);
                                                                    int i1682 = ~identityHashCode132;
                                                                    int i1692 = (~(333279883 | i1682)) | (~((333279883 ^ i1672) | (333279883 & i1672)));
                                                                    int i1702 = ~((i1682 ^ i1672) | (i1682 & i1672));
                                                                    int i1712 = (i1692 & i1702) | (i1692 ^ i1702);
                                                                    int i1722 = ~i1672;
                                                                    int i1732 = ((-333279884) ^ i1722) | ((-333279884) & i1722);
                                                                    int i1742 = ~((identityHashCode132 & i1732) | (i1732 ^ identityHashCode132));
                                                                    int i1752 = (i1672 * (-589)) + 600084172 + (((i1742 ^ i1712) | (i1742 & i1712)) * 590);
                                                                    int i1762 = ~((333279883 ^ i1682) | (333279883 & i1682));
                                                                    int i1772 = ~(333279883 | i1672);
                                                                    int i1782 = (i1762 ^ i1772) | (i1762 & i1772);
                                                                    int i1792 = ~(i1672 | i1682);
                                                                    int i1802 = -(-(((i1792 ^ i1782) | (i1782 & i1792)) * (-1180)));
                                                                    int i1812 = ~((i1722 & i1682) | (i1722 ^ i1682));
                                                                    int i1822 = ~((i1682 & (-333279884)) | ((-333279884) ^ i1682));
                                                                    int i1832 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                    int i1842 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                    int identityHashCode142 = java.lang.System.identityHashCode(setselector);
                                                                    int i1852 = ~identityHashCode142;
                                                                    int i1862 = ~((i1852 ^ (-13)) | (i1852 & (-13)));
                                                                    int i1872 = ~((i1842 & (-13)) | (i1842 ^ (-13)));
                                                                    str12 = str11;
                                                                    int i1882 = (i1842 * (-244)) + 2952 + (((i1862 & i1872) | (i1862 ^ i1872)) * (-245));
                                                                    int i1892 = ~((identityHashCode142 ^ (-13)) | (identityHashCode142 & (-13)));
                                                                    int i1902 = i1892 * (-245);
                                                                    int i1912 = ((i1882 | i1902) << 1) - (i1882 ^ i1902);
                                                                    int i1922 = ((i1842 & i1892) | (i1842 ^ i1892)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                                                                    byte b132 = (byte) (((i1912 | i1922) << 1) - (i1922 ^ i1912));
                                                                    int i1932 = -android.view.View.MeasureSpec.getMode(0);
                                                                    int identityHashCode152 = java.lang.System.identityHashCode(setselector);
                                                                    int i1942 = i1932 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                                                    int i1952 = (52520 ^ i1942) + ((i1942 & 52520) << 1);
                                                                    int i1962 = ~identityHashCode152;
                                                                    java.lang.String str222 = str16;
                                                                    int i1972 = ~((i1962 ^ (-101)) | (i1962 & (-101)));
                                                                    int i1982 = -(-(((i1972 & i1932) | (i1972 ^ i1932)) * (-1042)));
                                                                    int i1992 = (i1952 ^ i1982) + ((i1982 & i1952) << 1);
                                                                    int i2002 = ((identityHashCode152 ^ (-101)) | (identityHashCode152 & (-101))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                    int i2012 = (i1992 ^ i2002) + ((i2002 & i1992) << 1);
                                                                    int i2022 = ~i1932;
                                                                    int i2032 = ~((i2022 & 100) | (i2022 ^ 100));
                                                                    int i2042 = ~(i2022 | identityHashCode152);
                                                                    int i2052 = (i1932 ^ i1962) | (i1932 & i1962);
                                                                    int i2062 = ((i2042 ^ i2032) | (i2042 & i2032) | (~((i2052 ^ (-101)) | (i2052 & (-101))))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                    java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                                    b((1497162756 & i1662) + (i1662 | 1497162756), (((i1752 | i1802) << 1) - (i1802 ^ i1752)) + (((i1812 & i1822) | (i1812 ^ i1822)) * 590), ((i1832 | (-33)) << 1) - (i1832 ^ (-33)), b132, (short) ((i2012 & i2062) + (i2062 | i2012)), objArr962);
                                                                    java.lang.Class<?> cls332 = java.lang.Class.forName((java.lang.String) objArr962[0]);
                                                                    int i2072 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    int identityHashCode162 = java.lang.System.identityHashCode(setselector);
                                                                    int i2082 = (i2072 * (-317)) + 853557283;
                                                                    int i2092 = ~i2072;
                                                                    int i2102 = ~(((-1497162782) & i2092) | ((-1497162782) ^ i2092) | identityHashCode162);
                                                                    int i2112 = ~identityHashCode162;
                                                                    int i2122 = (i2112 ^ i2072) | (i2112 & i2072);
                                                                    int i2132 = ~((i2122 & 1497162781) | (1497162781 ^ i2122));
                                                                    int i2142 = -(-(((i2102 ^ i2132) | (i2102 & i2132)) * (-318)));
                                                                    int i2152 = ((i2082 | i2142) << 1) - (i2082 ^ i2142);
                                                                    int i2162 = ~(((-1497162782) & i2072) | ((-1497162782) ^ i2072));
                                                                    int i2172 = ~((i2072 & identityHashCode162) | (i2072 ^ identityHashCode162));
                                                                    int i2182 = ((i2172 ^ i2162) | (i2162 & i2172)) * (-318);
                                                                    int i2192 = (i2152 & i2182) + (i2182 | i2152);
                                                                    int i2202 = ((~((i2092 & identityHashCode162) | (identityHashCode162 ^ i2092))) | (-1497162782)) * 318;
                                                                    int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                                                    int i2212 = -android.view.View.resolveSize(0, 0);
                                                                    int i2222 = -(-android.text.TextUtils.indexOf(str10, str10, 0));
                                                                    int i2232 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                                    int identityHashCode172 = java.lang.System.identityHashCode(setselector);
                                                                    int i2242 = (i2232 * (-563)) - 1695;
                                                                    int i2252 = ~i2232;
                                                                    int i2262 = ~identityHashCode172;
                                                                    int i2272 = (~((i2262 & 2) | (i2262 ^ 2))) | i2252;
                                                                    java.lang.String str232 = str10;
                                                                    int i2282 = ~((identityHashCode172 ^ (-3)) | (identityHashCode172 & (-3)));
                                                                    int i2292 = -(-(((i2272 ^ i2282) | (i2282 & i2272)) * (-564)));
                                                                    int i2302 = ((i2242 | i2292) << 1) - (i2292 ^ i2242);
                                                                    int i2312 = (i2252 ^ (-3)) | (i2252 & (-3));
                                                                    int i2322 = (~((i2312 ^ identityHashCode172) | (i2312 & identityHashCode172))) * 1128;
                                                                    int i2332 = ~((i2262 & i2252) | (i2252 ^ i2262));
                                                                    int i2342 = ~((i2232 ^ (-3)) | (i2232 & (-3)));
                                                                    short s32 = (short) ((((i2302 & i2322) + (i2322 | i2302)) - (~(-(-(((i2342 & i2332) | (i2342 ^ i2332)) * 564))))) - 1);
                                                                    java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                                    b(((i2192 | i2202) << 1) - (i2202 ^ i2192), (touchSlop2 >> 8) - 333279881, (-34) - (~i2212), (byte) (((i2222 | (-60)) << 1) - (i2222 ^ (-60))), s32, objArr972);
                                                                    context3 = (android.content.Context) cls332.getMethod((java.lang.String) objArr972[0], new java.lang.Class[0]).invoke(null, null);
                                                                    if (context3 != null) {
                                                                    }
                                                                    java.lang.Object[] objArr982 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -2037767799};
                                                                    byte[] bArr82 = $$d;
                                                                    byte b142 = bArr82[65];
                                                                    java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                                    d(b142, (short) (b142 | 98), (byte) (bArr82[121] + 1), objArr992);
                                                                    java.lang.Class<?> cls342 = java.lang.Class.forName((java.lang.String) objArr992[0]);
                                                                    java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                                    d(bArr82[5], bArr82[341], bArr82[66], objArr1002);
                                                                    java.lang.String str242 = (java.lang.String) objArr1002[0];
                                                                    int i2372 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    int identityHashCode182 = java.lang.System.identityHashCode(setselector);
                                                                    int i2382 = (i2372 * (-344)) - 344;
                                                                    int i2392 = ~i2372;
                                                                    int i2402 = (i2392 ^ (-2)) | (i2392 & (-2));
                                                                    int i2412 = ~i2402;
                                                                    int i2422 = ~((i2392 ^ identityHashCode182) | (i2392 & identityHashCode182));
                                                                    int i2432 = -(-(((i2412 & i2422) | (i2412 ^ i2422)) * 345));
                                                                    int i2442 = ~identityHashCode182;
                                                                    int i2452 = (i2382 ^ i2432) + ((i2382 & i2432) << 1) + (((~(i2372 | (-2))) | (~((i2392 ^ i2442) | (i2392 & i2442)))) * 345);
                                                                    int i2462 = -(-((~((i2402 & identityHashCode182) | (identityHashCode182 ^ i2402))) * 345));
                                                                    java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                                    e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i2452 & i2462) + (i2462 | i2452), objArr1012);
                                                                    objArr8 = (java.lang.Object[]) cls342.getMethod(str242, java.lang.Class.forName((java.lang.String) objArr1012[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr982);
                                                                    if (context3 != null) {
                                                                    }
                                                                } catch (java.lang.Exception unused4) {
                                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                }
                                                                java.lang.Object[] objArr107 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1436012928};
                                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                d(r1[65], (short) ($$e - 5), (byte) ($$d[21] - 1), objArr108);
                                                                java.lang.Class<?> cls38 = java.lang.Class.forName((java.lang.String) objArr108[0]);
                                                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                d(r1[101], 367, r1[8], objArr109);
                                                                objArr7 = (java.lang.Object[]) cls38.getMethod((java.lang.String) objArr109[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr107);
                                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.View.MeasureSpec.getSize(0) + 584, (char) (24291 - android.graphics.Color.argb(0, 0, 0, 0)));
                                                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                c((byte) (-bArr[108]), (byte) 60, bArr[97], objArr110);
                                                                cls39.getField((java.lang.String) objArr110[0]).set(null, objArr7);
                                                            }
                                                        }
                                                        int mode = android.view.View.MeasureSpec.getMode(0);
                                                        int i248 = -android.text.TextUtils.indexOf("", "");
                                                        int identityHashCode19 = java.lang.System.identityHashCode(setselector);
                                                        int i249 = i248 * 624;
                                                        int i250 = ((1141657018 | i249) << 1) - (i249 ^ 1141657018);
                                                        int i251 = (333279882 & i248) | (333279882 ^ i248);
                                                        int i252 = (~(i251 | identityHashCode19)) * 623;
                                                        int i253 = ((i250 | i252) << 1) - (i250 ^ i252);
                                                        int i254 = ~identityHashCode19;
                                                        int i255 = ~i248;
                                                        int i256 = ~((i255 ^ (-333279883)) | (i255 & (-333279883)));
                                                        int i257 = ((i254 & i256) | (i254 ^ i256)) * (-623);
                                                        int i258 = ((i253 | i257) << 1) - (i257 ^ i253);
                                                        int i259 = ~i251;
                                                        int i260 = ~((333279882 & identityHashCode19) | (333279882 ^ identityHashCode19));
                                                        int i261 = (i259 ^ i260) | (i259 & i260);
                                                        int i262 = ~(i248 | identityHashCode19);
                                                        int i263 = -(-(((i262 ^ i261) | (i262 & i261)) * 623));
                                                        int i264 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        int identityHashCode20 = java.lang.System.identityHashCode(setselector);
                                                        int i265 = ~i264;
                                                        int i266 = ~((i265 ^ identityHashCode20) | (i265 & identityHashCode20));
                                                        int i267 = ~identityHashCode20;
                                                        int i268 = (i267 ^ i264) | (i267 & i264);
                                                        num2 = 0;
                                                        int i269 = ((((i264 * 319) + 10778) - (~(-(-(((i266 ^ 33) | (i266 & 33)) * (-318)))))) - 1) + (((~((identityHashCode20 ^ 33) | (identityHashCode20 & 33))) | (~((i268 ^ (-34)) | (i268 & (-34))))) * 318);
                                                        int i270 = ~((i267 ^ 33) | (i267 & 33) | i264);
                                                        int i271 = (i264 ^ (-34)) | (i264 & (-34));
                                                        int i272 = ~((i271 ^ identityHashCode20) | (i271 & identityHashCode20));
                                                        int i273 = -(-(((i270 ^ i272) | (i272 & i270)) * 318));
                                                        byte combineMeasuredStates = (byte) (android.view.View.combineMeasuredStates(0, 0) + 12);
                                                        int i274 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                        b(mode + 1497162756, ((i258 | i263) << 1) - (i263 ^ i258), ((i269 | i273) << 1) - (i273 ^ i269), combineMeasuredStates, (short) ((i274 & (-101)) + (i274 | (-101))), objArr111);
                                                        java.lang.Class<?> cls40 = java.lang.Class.forName((java.lang.String) objArr111[0]);
                                                        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(0, 0);
                                                        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                        int identityHashCode21 = java.lang.System.identityHashCode(setselector);
                                                        int i275 = ~maximumDrawingCacheSize;
                                                        int i276 = 333279880 | i275;
                                                        int i277 = ~((i276 ^ identityHashCode21) | (i276 & identityHashCode21));
                                                        int i278 = ~identityHashCode21;
                                                        int i279 = (i278 & maximumDrawingCacheSize) | (i278 ^ maximumDrawingCacheSize);
                                                        int i280 = ~((i279 & (-333279881)) | ((-333279881) ^ i279));
                                                        int i281 = (((((maximumDrawingCacheSize * (-317)) + 1057900361) - (~(((i277 & i280) | (i277 ^ i280)) * (-318)))) - 1) - (~(-(-(((~(maximumDrawingCacheSize | 333279880)) | (~(maximumDrawingCacheSize | identityHashCode21))) * (-318)))))) - 1;
                                                        int i282 = ~((i275 ^ identityHashCode21) | (identityHashCode21 & i275));
                                                        int i283 = ((i282 ^ 333279880) | (333279880 & i282)) * 318;
                                                        int i284 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                        int i285 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                        int identityHashCode22 = java.lang.System.identityHashCode(setselector);
                                                        int i286 = modifierMetaStateMask * (-518);
                                                        str7 = "valueOf";
                                                        int i287 = ~modifierMetaStateMask;
                                                        int i288 = ~identityHashCode22;
                                                        str8 = str15;
                                                        int i289 = (i287 ^ i288) | (i287 & i288);
                                                        bArr = bArr2;
                                                        int i290 = ~i289;
                                                        int i291 = (((i286 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND) + (i286 | my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND)) - (~(((~i290) | i290) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - 1;
                                                        int i292 = ~(i289 | i290);
                                                        int i293 = i287 | modifierMetaStateMask;
                                                        int i294 = ~((i293 ^ identityHashCode22) | (i293 & identityHashCode22));
                                                        int i295 = ((i294 ^ i292) | (i292 & i294)) * (-519);
                                                        int i296 = ~(i288 | identityHashCode22);
                                                        short s4 = (short) ((((i291 | i295) << 1) - (i295 ^ i291)) + (((i296 & modifierMetaStateMask) | (i296 ^ modifierMetaStateMask)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                        b(combineMeasuredStates2 + 1497162782, ((i281 | i283) << 1) - (i283 ^ i281), (i284 ^ (-33)) + ((i284 & (-33)) << 1), (byte) (((i285 | (-61)) << 1) - (i285 ^ (-61))), s4, objArr112);
                                                        context2 = (android.content.Context) cls40.getMethod((java.lang.String) objArr112[0], new java.lang.Class[0]).invoke(null, null);
                                                        if (context2 != null) {
                                                            int i297 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                            IccPrivateKeyCrtComponentsJson = (((i297 | 79) << 1) - (i297 ^ 79)) % 128;
                                                            context2 = context2.getApplicationContext();
                                                        }
                                                        str9 = str6;
                                                        java.lang.Object[] objArr113 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1632628423};
                                                        byte[] bArr9 = $$d;
                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                        d(bArr9[65], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, (byte) (-bArr9[419]), objArr114);
                                                        java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr114[0]);
                                                        byte b16 = bArr9[66];
                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                        d(b16, (short) (b16 | 403), bArr9[57], objArr115);
                                                        java.lang.String str25 = (java.lang.String) objArr115[0];
                                                        int i298 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                        int identityHashCode23 = java.lang.System.identityHashCode(setselector);
                                                        int i299 = i298 * (-55);
                                                        int i300 = ((i299 | (-55)) << 1) - (i299 ^ (-55));
                                                        int i301 = -(-(((~((i298 ^ identityHashCode23) | (i298 & identityHashCode23))) | 1) * 56));
                                                        int i302 = (((i300 ^ i301) + ((i301 & i300) << 1)) - (~((~((i298 ^ 1) | (i298 & 1))) * (-56)))) - 1;
                                                        int i303 = ~identityHashCode23;
                                                        int i304 = ~((i303 & 1) | (i303 ^ 1));
                                                        int i305 = ((i298 & i304) | (i298 ^ i304)) * 56;
                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                        e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i302 ^ i305) + ((i305 & i302) << 1), objArr116);
                                                        objArr5 = (java.lang.Object[]) cls41.getMethod(str25, java.lang.Class.forName((java.lang.String) objArr116[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr113);
                                                        if (context2 == null) {
                                                            int i306 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                            IccPrivateKeyCrtComponentsJson = (((i306 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i306 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                                                            str10 = "";
                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 584 - android.text.TextUtils.getOffsetAfter(str10, 0), (char) (android.view.View.resolveSize(0, 0) + 24291));
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            c((short) 54, (byte) 71, (byte) (bArr[31] - 1), objArr117);
                                                            cls42.getField((java.lang.String) objArr117[0]).set(null, objArr5);
                                                            try {
                                                                str16 = str16;
                                                                long longValue4 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 52, 584 - android.view.View.MeasureSpec.getSize(0), (char) (24290 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                c((byte) (bArr[1] + 1), (byte) 77, (byte) (bArr[109] - 1), objArr118);
                                                                cls43.getField((java.lang.String) objArr118[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                                i3 = ((int[]) objArr5[1])[0];
                                                                if (((int[]) objArr5[0])[0] == i3) {
                                                                }
                                                                java.lang.Class cls152 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 51, 584 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24291));
                                                                byte b92 = bArr[97];
                                                                java.lang.Object[] objArr542 = new java.lang.Object[1];
                                                                c(b92, (byte) (b92 | 111), (byte) (-bArr[45]), objArr542);
                                                                j4 = cls152.getField((java.lang.String) objArr542[0]).getLong(null);
                                                                if (j4 != -1) {
                                                                }
                                                                java.lang.Object[] objArr1072 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1436012928};
                                                                java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                                                d(r1[65], (short) ($$e - 5), (byte) ($$d[21] - 1), objArr1082);
                                                                java.lang.Class<?> cls382 = java.lang.Class.forName((java.lang.String) objArr1082[0]);
                                                                java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                                d(r1[101], 367, r1[8], objArr1092);
                                                                objArr7 = (java.lang.Object[]) cls382.getMethod((java.lang.String) objArr1092[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1072);
                                                                java.lang.Class cls392 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.View.MeasureSpec.getSize(0) + 584, (char) (24291 - android.graphics.Color.argb(0, 0, 0, 0)));
                                                                java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                                                c((byte) (-bArr[108]), (byte) 60, bArr[97], objArr1102);
                                                                cls392.getField((java.lang.String) objArr1102[0]).set(null, objArr7);
                                                                long longValue32 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls372 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10) + 51, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                                byte b152 = bArr[97];
                                                                c = 1;
                                                                java.lang.Object[] objArr1062 = new java.lang.Object[1];
                                                                c(b152, (byte) (b152 | 111), (byte) (-bArr[45]), objArr1062);
                                                                c2 = 0;
                                                                cls372.getField((java.lang.String) objArr1062[0]).set(null, java.lang.Long.valueOf(longValue32));
                                                                i4 = ((int[]) objArr7[c])[c2];
                                                                if (((int[]) objArr7[c2])[c2] != i4) {
                                                                }
                                                                java.lang.Class cls1822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 584 - android.text.TextUtils.getTrimmedLength(str10), (char) (android.text.TextUtils.indexOf(str10, str10, 0, 0) + 24291));
                                                                java.lang.Object[] objArr6322 = new java.lang.Object[1];
                                                                c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr6322);
                                                                j5 = cls1822.getField((java.lang.String) objArr6322[0]).getLong(null);
                                                                if (j5 != -1) {
                                                                }
                                                                int i16622 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                int i16722 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                int identityHashCode1322 = java.lang.System.identityHashCode(setselector);
                                                                int i16822 = ~identityHashCode1322;
                                                                int i16922 = (~(333279883 | i16822)) | (~((333279883 ^ i16722) | (333279883 & i16722)));
                                                                int i17022 = ~((i16822 ^ i16722) | (i16822 & i16722));
                                                                int i17122 = (i16922 & i17022) | (i16922 ^ i17022);
                                                                int i17222 = ~i16722;
                                                                int i17322 = ((-333279884) ^ i17222) | ((-333279884) & i17222);
                                                                int i17422 = ~((identityHashCode1322 & i17322) | (i17322 ^ identityHashCode1322));
                                                                int i17522 = (i16722 * (-589)) + 600084172 + (((i17422 ^ i17122) | (i17422 & i17122)) * 590);
                                                                int i17622 = ~((333279883 ^ i16822) | (333279883 & i16822));
                                                                int i17722 = ~(333279883 | i16722);
                                                                int i17822 = (i17622 ^ i17722) | (i17622 & i17722);
                                                                int i17922 = ~(i16722 | i16822);
                                                                int i18022 = -(-(((i17922 ^ i17822) | (i17822 & i17922)) * (-1180)));
                                                                int i18122 = ~((i17222 & i16822) | (i17222 ^ i16822));
                                                                int i18222 = ~((i16822 & (-333279884)) | ((-333279884) ^ i16822));
                                                                int i18322 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                int i18422 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                int identityHashCode1422 = java.lang.System.identityHashCode(setselector);
                                                                int i18522 = ~identityHashCode1422;
                                                                int i18622 = ~((i18522 ^ (-13)) | (i18522 & (-13)));
                                                                int i18722 = ~((i18422 & (-13)) | (i18422 ^ (-13)));
                                                                str12 = str11;
                                                                int i18822 = (i18422 * (-244)) + 2952 + (((i18622 & i18722) | (i18622 ^ i18722)) * (-245));
                                                                int i18922 = ~((identityHashCode1422 ^ (-13)) | (identityHashCode1422 & (-13)));
                                                                int i19022 = i18922 * (-245);
                                                                int i19122 = ((i18822 | i19022) << 1) - (i18822 ^ i19022);
                                                                int i19222 = ((i18422 & i18922) | (i18422 ^ i18922)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                                                                byte b1322 = (byte) (((i19122 | i19222) << 1) - (i19222 ^ i19122));
                                                                int i19322 = -android.view.View.MeasureSpec.getMode(0);
                                                                int identityHashCode1522 = java.lang.System.identityHashCode(setselector);
                                                                int i19422 = i19322 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                                                int i19522 = (52520 ^ i19422) + ((i19422 & 52520) << 1);
                                                                int i19622 = ~identityHashCode1522;
                                                                java.lang.String str2222 = str16;
                                                                int i19722 = ~((i19622 ^ (-101)) | (i19622 & (-101)));
                                                                int i19822 = -(-(((i19722 & i19322) | (i19722 ^ i19322)) * (-1042)));
                                                                int i19922 = (i19522 ^ i19822) + ((i19822 & i19522) << 1);
                                                                int i20022 = ((identityHashCode1522 ^ (-101)) | (identityHashCode1522 & (-101))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                int i20122 = (i19922 ^ i20022) + ((i20022 & i19922) << 1);
                                                                int i20222 = ~i19322;
                                                                int i20322 = ~((i20222 & 100) | (i20222 ^ 100));
                                                                int i20422 = ~(i20222 | identityHashCode1522);
                                                                int i20522 = (i19322 ^ i19622) | (i19322 & i19622);
                                                                int i20622 = ((i20422 ^ i20322) | (i20422 & i20322) | (~((i20522 ^ (-101)) | (i20522 & (-101))))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                java.lang.Object[] objArr9622 = new java.lang.Object[1];
                                                                b((1497162756 & i16622) + (i16622 | 1497162756), (((i17522 | i18022) << 1) - (i18022 ^ i17522)) + (((i18122 & i18222) | (i18122 ^ i18222)) * 590), ((i18322 | (-33)) << 1) - (i18322 ^ (-33)), b1322, (short) ((i20122 & i20622) + (i20622 | i20122)), objArr9622);
                                                                java.lang.Class<?> cls3322 = java.lang.Class.forName((java.lang.String) objArr9622[0]);
                                                                int i20722 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                int identityHashCode1622 = java.lang.System.identityHashCode(setselector);
                                                                int i20822 = (i20722 * (-317)) + 853557283;
                                                                int i20922 = ~i20722;
                                                                int i21022 = ~(((-1497162782) & i20922) | ((-1497162782) ^ i20922) | identityHashCode1622);
                                                                int i21122 = ~identityHashCode1622;
                                                                int i21222 = (i21122 ^ i20722) | (i21122 & i20722);
                                                                int i21322 = ~((i21222 & 1497162781) | (1497162781 ^ i21222));
                                                                int i21422 = -(-(((i21022 ^ i21322) | (i21022 & i21322)) * (-318)));
                                                                int i21522 = ((i20822 | i21422) << 1) - (i20822 ^ i21422);
                                                                int i21622 = ~(((-1497162782) & i20722) | ((-1497162782) ^ i20722));
                                                                int i21722 = ~((i20722 & identityHashCode1622) | (i20722 ^ identityHashCode1622));
                                                                int i21822 = ((i21722 ^ i21622) | (i21622 & i21722)) * (-318);
                                                                int i21922 = (i21522 & i21822) + (i21822 | i21522);
                                                                int i22022 = ((~((i20922 & identityHashCode1622) | (identityHashCode1622 ^ i20922))) | (-1497162782)) * 318;
                                                                int touchSlop22 = android.view.ViewConfiguration.getTouchSlop();
                                                                int i22122 = -android.view.View.resolveSize(0, 0);
                                                                int i22222 = -(-android.text.TextUtils.indexOf(str10, str10, 0));
                                                                int i22322 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                                int identityHashCode1722 = java.lang.System.identityHashCode(setselector);
                                                                int i22422 = (i22322 * (-563)) - 1695;
                                                                int i22522 = ~i22322;
                                                                int i22622 = ~identityHashCode1722;
                                                                int i22722 = (~((i22622 & 2) | (i22622 ^ 2))) | i22522;
                                                                java.lang.String str2322 = str10;
                                                                int i22822 = ~((identityHashCode1722 ^ (-3)) | (identityHashCode1722 & (-3)));
                                                                int i22922 = -(-(((i22722 ^ i22822) | (i22822 & i22722)) * (-564)));
                                                                int i23022 = ((i22422 | i22922) << 1) - (i22922 ^ i22422);
                                                                int i23122 = (i22522 ^ (-3)) | (i22522 & (-3));
                                                                int i23222 = (~((i23122 ^ identityHashCode1722) | (i23122 & identityHashCode1722))) * 1128;
                                                                int i23322 = ~((i22622 & i22522) | (i22522 ^ i22622));
                                                                int i23422 = ~((i22322 ^ (-3)) | (i22322 & (-3)));
                                                                short s322 = (short) ((((i23022 & i23222) + (i23222 | i23022)) - (~(-(-(((i23422 & i23322) | (i23422 ^ i23322)) * 564))))) - 1);
                                                                java.lang.Object[] objArr9722 = new java.lang.Object[1];
                                                                b(((i21922 | i22022) << 1) - (i22022 ^ i21922), (touchSlop22 >> 8) - 333279881, (-34) - (~i22122), (byte) (((i22222 | (-60)) << 1) - (i22222 ^ (-60))), s322, objArr9722);
                                                                context3 = (android.content.Context) cls3322.getMethod((java.lang.String) objArr9722[0], new java.lang.Class[0]).invoke(null, null);
                                                                if (context3 != null) {
                                                                }
                                                                java.lang.Object[] objArr9822 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -2037767799};
                                                                byte[] bArr822 = $$d;
                                                                byte b1422 = bArr822[65];
                                                                java.lang.Object[] objArr9922 = new java.lang.Object[1];
                                                                d(b1422, (short) (b1422 | 98), (byte) (bArr822[121] + 1), objArr9922);
                                                                java.lang.Class<?> cls3422 = java.lang.Class.forName((java.lang.String) objArr9922[0]);
                                                                java.lang.Object[] objArr10022 = new java.lang.Object[1];
                                                                d(bArr822[5], bArr822[341], bArr822[66], objArr10022);
                                                                java.lang.String str2422 = (java.lang.String) objArr10022[0];
                                                                int i23722 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int identityHashCode1822 = java.lang.System.identityHashCode(setselector);
                                                                int i23822 = (i23722 * (-344)) - 344;
                                                                int i23922 = ~i23722;
                                                                int i24022 = (i23922 ^ (-2)) | (i23922 & (-2));
                                                                int i24122 = ~i24022;
                                                                int i24222 = ~((i23922 ^ identityHashCode1822) | (i23922 & identityHashCode1822));
                                                                int i24322 = -(-(((i24122 & i24222) | (i24122 ^ i24222)) * 345));
                                                                int i24422 = ~identityHashCode1822;
                                                                int i24522 = (i23822 ^ i24322) + ((i23822 & i24322) << 1) + (((~(i23722 | (-2))) | (~((i23922 ^ i24422) | (i23922 & i24422)))) * 345);
                                                                int i24622 = -(-((~((i24022 & identityHashCode1822) | (identityHashCode1822 ^ i24022))) * 345));
                                                                java.lang.Object[] objArr10122 = new java.lang.Object[1];
                                                                e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i24522 & i24622) + (i24622 | i24522), objArr10122);
                                                                objArr8 = (java.lang.Object[]) cls3422.getMethod(str2422, java.lang.Class.forName((java.lang.String) objArr10122[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr9822);
                                                                if (context3 != null) {
                                                                }
                                                            } catch (java.lang.Exception unused5) {
                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                            }
                                                        } else {
                                                            str16 = str16;
                                                            str10 = "";
                                                            objArr6 = objArr5;
                                                            objArr5 = objArr6;
                                                            i3 = ((int[]) objArr5[1])[0];
                                                            if (((int[]) objArr5[0])[0] == i3) {
                                                            }
                                                            java.lang.Class cls1522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 51, 584 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24291));
                                                            byte b922 = bArr[97];
                                                            java.lang.Object[] objArr5422 = new java.lang.Object[1];
                                                            c(b922, (byte) (b922 | 111), (byte) (-bArr[45]), objArr5422);
                                                            j4 = cls1522.getField((java.lang.String) objArr5422[0]).getLong(null);
                                                            if (j4 != -1) {
                                                            }
                                                            java.lang.Object[] objArr10722 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1436012928};
                                                            java.lang.Object[] objArr10822 = new java.lang.Object[1];
                                                            d(r1[65], (short) ($$e - 5), (byte) ($$d[21] - 1), objArr10822);
                                                            java.lang.Class<?> cls3822 = java.lang.Class.forName((java.lang.String) objArr10822[0]);
                                                            java.lang.Object[] objArr10922 = new java.lang.Object[1];
                                                            d(r1[101], 367, r1[8], objArr10922);
                                                            objArr7 = (java.lang.Object[]) cls3822.getMethod((java.lang.String) objArr10922[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr10722);
                                                            java.lang.Class cls3922 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.View.MeasureSpec.getSize(0) + 584, (char) (24291 - android.graphics.Color.argb(0, 0, 0, 0)));
                                                            java.lang.Object[] objArr11022 = new java.lang.Object[1];
                                                            c((byte) (-bArr[108]), (byte) 60, bArr[97], objArr11022);
                                                            cls3922.getField((java.lang.String) objArr11022[0]).set(null, objArr7);
                                                            long longValue322 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls3722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10) + 51, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                            byte b1522 = bArr[97];
                                                            c = 1;
                                                            java.lang.Object[] objArr10622 = new java.lang.Object[1];
                                                            c(b1522, (byte) (b1522 | 111), (byte) (-bArr[45]), objArr10622);
                                                            c2 = 0;
                                                            cls3722.getField((java.lang.String) objArr10622[0]).set(null, java.lang.Long.valueOf(longValue322));
                                                            i4 = ((int[]) objArr7[c])[c2];
                                                            if (((int[]) objArr7[c2])[c2] != i4) {
                                                            }
                                                            java.lang.Class cls18222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 584 - android.text.TextUtils.getTrimmedLength(str10), (char) (android.text.TextUtils.indexOf(str10, str10, 0, 0) + 24291));
                                                            java.lang.Object[] objArr63222 = new java.lang.Object[1];
                                                            c((byte) (-bArr[44]), bArr[18], (byte) (-bArr[92]), objArr63222);
                                                            j5 = cls18222.getField((java.lang.String) objArr63222[0]).getLong(null);
                                                            if (j5 != -1) {
                                                            }
                                                            int i166222 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                            int i167222 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                            int identityHashCode13222 = java.lang.System.identityHashCode(setselector);
                                                            int i168222 = ~identityHashCode13222;
                                                            int i169222 = (~(333279883 | i168222)) | (~((333279883 ^ i167222) | (333279883 & i167222)));
                                                            int i170222 = ~((i168222 ^ i167222) | (i168222 & i167222));
                                                            int i171222 = (i169222 & i170222) | (i169222 ^ i170222);
                                                            int i172222 = ~i167222;
                                                            int i173222 = ((-333279884) ^ i172222) | ((-333279884) & i172222);
                                                            int i174222 = ~((identityHashCode13222 & i173222) | (i173222 ^ identityHashCode13222));
                                                            int i175222 = (i167222 * (-589)) + 600084172 + (((i174222 ^ i171222) | (i174222 & i171222)) * 590);
                                                            int i176222 = ~((333279883 ^ i168222) | (333279883 & i168222));
                                                            int i177222 = ~(333279883 | i167222);
                                                            int i178222 = (i176222 ^ i177222) | (i176222 & i177222);
                                                            int i179222 = ~(i167222 | i168222);
                                                            int i180222 = -(-(((i179222 ^ i178222) | (i178222 & i179222)) * (-1180)));
                                                            int i181222 = ~((i172222 & i168222) | (i172222 ^ i168222));
                                                            int i182222 = ~((i168222 & (-333279884)) | ((-333279884) ^ i168222));
                                                            int i183222 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                                            int i184222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int identityHashCode14222 = java.lang.System.identityHashCode(setselector);
                                                            int i185222 = ~identityHashCode14222;
                                                            int i186222 = ~((i185222 ^ (-13)) | (i185222 & (-13)));
                                                            int i187222 = ~((i184222 & (-13)) | (i184222 ^ (-13)));
                                                            str12 = str11;
                                                            int i188222 = (i184222 * (-244)) + 2952 + (((i186222 & i187222) | (i186222 ^ i187222)) * (-245));
                                                            int i189222 = ~((identityHashCode14222 ^ (-13)) | (identityHashCode14222 & (-13)));
                                                            int i190222 = i189222 * (-245);
                                                            int i191222 = ((i188222 | i190222) << 1) - (i188222 ^ i190222);
                                                            int i192222 = ((i184222 & i189222) | (i184222 ^ i189222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                                                            byte b13222 = (byte) (((i191222 | i192222) << 1) - (i192222 ^ i191222));
                                                            int i193222 = -android.view.View.MeasureSpec.getMode(0);
                                                            int identityHashCode15222 = java.lang.System.identityHashCode(setselector);
                                                            int i194222 = i193222 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                                            int i195222 = (52520 ^ i194222) + ((i194222 & 52520) << 1);
                                                            int i196222 = ~identityHashCode15222;
                                                            java.lang.String str22222 = str16;
                                                            int i197222 = ~((i196222 ^ (-101)) | (i196222 & (-101)));
                                                            int i198222 = -(-(((i197222 & i193222) | (i197222 ^ i193222)) * (-1042)));
                                                            int i199222 = (i195222 ^ i198222) + ((i198222 & i195222) << 1);
                                                            int i200222 = ((identityHashCode15222 ^ (-101)) | (identityHashCode15222 & (-101))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                            int i201222 = (i199222 ^ i200222) + ((i200222 & i199222) << 1);
                                                            int i202222 = ~i193222;
                                                            int i203222 = ~((i202222 & 100) | (i202222 ^ 100));
                                                            int i204222 = ~(i202222 | identityHashCode15222);
                                                            int i205222 = (i193222 ^ i196222) | (i193222 & i196222);
                                                            int i206222 = ((i204222 ^ i203222) | (i204222 & i203222) | (~((i205222 ^ (-101)) | (i205222 & (-101))))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                            java.lang.Object[] objArr96222 = new java.lang.Object[1];
                                                            b((1497162756 & i166222) + (i166222 | 1497162756), (((i175222 | i180222) << 1) - (i180222 ^ i175222)) + (((i181222 & i182222) | (i181222 ^ i182222)) * 590), ((i183222 | (-33)) << 1) - (i183222 ^ (-33)), b13222, (short) ((i201222 & i206222) + (i206222 | i201222)), objArr96222);
                                                            java.lang.Class<?> cls33222 = java.lang.Class.forName((java.lang.String) objArr96222[0]);
                                                            int i207222 = -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                            int identityHashCode16222 = java.lang.System.identityHashCode(setselector);
                                                            int i208222 = (i207222 * (-317)) + 853557283;
                                                            int i209222 = ~i207222;
                                                            int i210222 = ~(((-1497162782) & i209222) | ((-1497162782) ^ i209222) | identityHashCode16222);
                                                            int i211222 = ~identityHashCode16222;
                                                            int i212222 = (i211222 ^ i207222) | (i211222 & i207222);
                                                            int i213222 = ~((i212222 & 1497162781) | (1497162781 ^ i212222));
                                                            int i214222 = -(-(((i210222 ^ i213222) | (i210222 & i213222)) * (-318)));
                                                            int i215222 = ((i208222 | i214222) << 1) - (i208222 ^ i214222);
                                                            int i216222 = ~(((-1497162782) & i207222) | ((-1497162782) ^ i207222));
                                                            int i217222 = ~((i207222 & identityHashCode16222) | (i207222 ^ identityHashCode16222));
                                                            int i218222 = ((i217222 ^ i216222) | (i216222 & i217222)) * (-318);
                                                            int i219222 = (i215222 & i218222) + (i218222 | i215222);
                                                            int i220222 = ((~((i209222 & identityHashCode16222) | (identityHashCode16222 ^ i209222))) | (-1497162782)) * 318;
                                                            int touchSlop222 = android.view.ViewConfiguration.getTouchSlop();
                                                            int i221222 = -android.view.View.resolveSize(0, 0);
                                                            int i222222 = -(-android.text.TextUtils.indexOf(str10, str10, 0));
                                                            int i223222 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                            int identityHashCode17222 = java.lang.System.identityHashCode(setselector);
                                                            int i224222 = (i223222 * (-563)) - 1695;
                                                            int i225222 = ~i223222;
                                                            int i226222 = ~identityHashCode17222;
                                                            int i227222 = (~((i226222 & 2) | (i226222 ^ 2))) | i225222;
                                                            java.lang.String str23222 = str10;
                                                            int i228222 = ~((identityHashCode17222 ^ (-3)) | (identityHashCode17222 & (-3)));
                                                            int i229222 = -(-(((i227222 ^ i228222) | (i228222 & i227222)) * (-564)));
                                                            int i230222 = ((i224222 | i229222) << 1) - (i229222 ^ i224222);
                                                            int i231222 = (i225222 ^ (-3)) | (i225222 & (-3));
                                                            int i232222 = (~((i231222 ^ identityHashCode17222) | (i231222 & identityHashCode17222))) * 1128;
                                                            int i233222 = ~((i226222 & i225222) | (i225222 ^ i226222));
                                                            int i234222 = ~((i223222 ^ (-3)) | (i223222 & (-3)));
                                                            short s3222 = (short) ((((i230222 & i232222) + (i232222 | i230222)) - (~(-(-(((i234222 & i233222) | (i234222 ^ i233222)) * 564))))) - 1);
                                                            java.lang.Object[] objArr97222 = new java.lang.Object[1];
                                                            b(((i219222 | i220222) << 1) - (i220222 ^ i219222), (touchSlop222 >> 8) - 333279881, (-34) - (~i221222), (byte) (((i222222 | (-60)) << 1) - (i222222 ^ (-60))), s3222, objArr97222);
                                                            context3 = (android.content.Context) cls33222.getMethod((java.lang.String) objArr97222[0], new java.lang.Class[0]).invoke(null, null);
                                                            if (context3 != null) {
                                                            }
                                                            java.lang.Object[] objArr98222 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -2037767799};
                                                            byte[] bArr8222 = $$d;
                                                            byte b14222 = bArr8222[65];
                                                            java.lang.Object[] objArr99222 = new java.lang.Object[1];
                                                            d(b14222, (short) (b14222 | 98), (byte) (bArr8222[121] + 1), objArr99222);
                                                            java.lang.Class<?> cls34222 = java.lang.Class.forName((java.lang.String) objArr99222[0]);
                                                            java.lang.Object[] objArr100222 = new java.lang.Object[1];
                                                            d(bArr8222[5], bArr8222[341], bArr8222[66], objArr100222);
                                                            java.lang.String str24222 = (java.lang.String) objArr100222[0];
                                                            int i237222 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int identityHashCode18222 = java.lang.System.identityHashCode(setselector);
                                                            int i238222 = (i237222 * (-344)) - 344;
                                                            int i239222 = ~i237222;
                                                            int i240222 = (i239222 ^ (-2)) | (i239222 & (-2));
                                                            int i241222 = ~i240222;
                                                            int i242222 = ~((i239222 ^ identityHashCode18222) | (i239222 & identityHashCode18222));
                                                            int i243222 = -(-(((i241222 & i242222) | (i241222 ^ i242222)) * 345));
                                                            int i244222 = ~identityHashCode18222;
                                                            int i245222 = (i238222 ^ i243222) + ((i238222 & i243222) << 1) + (((~(i237222 | (-2))) | (~((i239222 ^ i244222) | (i239222 & i244222)))) * 345);
                                                            int i246222 = -(-((~((i240222 & identityHashCode18222) | (identityHashCode18222 ^ i240222))) * 345));
                                                            java.lang.Object[] objArr101222 = new java.lang.Object[1];
                                                            e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i245222 & i246222) + (i246222 | i245222), objArr101222);
                                                            objArr8 = (java.lang.Object[]) cls34222.getMethod(str24222, java.lang.Class.forName((java.lang.String) objArr101222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr98222);
                                                            if (context3 != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                str5 = str4;
                                                java.lang.Object[] objArr119 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str5, java.lang.Object.class).invoke(null, setselector)).intValue()), 0, -1674328605};
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                if (obj5 == null) {
                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, android.view.KeyEvent.getDeadChar(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr120);
                                                    obj5 = cls44.getMethod((java.lang.String) objArr120[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj5);
                                                }
                                                java.lang.Object[] objArr121 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr119);
                                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 47, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr122);
                                                cls45.getField((java.lang.String) objArr122[0]).set(null, objArr121);
                                                long longValue5 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getTapTimeout() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.graphics.Color.blue(0) + 34284));
                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr123);
                                                cls46.getField((java.lang.String) objArr123[0]).set(null, java.lang.Long.valueOf(longValue5));
                                                int i307 = IccPrivateKeyCrtComponentsJson;
                                                SdkCoreAlternateContactlessPaymentDataImpl = ((i307 & 13) + (i307 | 13)) % 128;
                                                objArr4 = objArr121;
                                                i2 = ((int[]) objArr4[1])[0];
                                                if (((int[]) objArr4[0])[0] != i2) {
                                                }
                                                java.lang.Class cls122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, 584 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24291));
                                                java.lang.Object[] objArr452 = new java.lang.Object[1];
                                                c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr452);
                                                j3 = cls122.getField((java.lang.String) objArr452[0]).getLong(null);
                                                if (j3 != -1) {
                                                }
                                                int mode2 = android.view.View.MeasureSpec.getMode(0);
                                                int i2482 = -android.text.TextUtils.indexOf("", "");
                                                int identityHashCode192 = java.lang.System.identityHashCode(setselector);
                                                int i2492 = i2482 * 624;
                                                int i2502 = ((1141657018 | i2492) << 1) - (i2492 ^ 1141657018);
                                                int i2512 = (333279882 & i2482) | (333279882 ^ i2482);
                                                int i2522 = (~(i2512 | identityHashCode192)) * 623;
                                                int i2532 = ((i2502 | i2522) << 1) - (i2502 ^ i2522);
                                                int i2542 = ~identityHashCode192;
                                                int i2552 = ~i2482;
                                                int i2562 = ~((i2552 ^ (-333279883)) | (i2552 & (-333279883)));
                                                int i2572 = ((i2542 & i2562) | (i2542 ^ i2562)) * (-623);
                                                int i2582 = ((i2532 | i2572) << 1) - (i2572 ^ i2532);
                                                int i2592 = ~i2512;
                                                int i2602 = ~((333279882 & identityHashCode192) | (333279882 ^ identityHashCode192));
                                                int i2612 = (i2592 ^ i2602) | (i2592 & i2602);
                                                int i2622 = ~(i2482 | identityHashCode192);
                                                int i2632 = -(-(((i2622 ^ i2612) | (i2622 & i2612)) * 623));
                                                int i2642 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int identityHashCode202 = java.lang.System.identityHashCode(setselector);
                                                int i2652 = ~i2642;
                                                int i2662 = ~((i2652 ^ identityHashCode202) | (i2652 & identityHashCode202));
                                                int i2672 = ~identityHashCode202;
                                                int i2682 = (i2672 ^ i2642) | (i2672 & i2642);
                                                num2 = 0;
                                                int i2692 = ((((i2642 * 319) + 10778) - (~(-(-(((i2662 ^ 33) | (i2662 & 33)) * (-318)))))) - 1) + (((~((identityHashCode202 ^ 33) | (identityHashCode202 & 33))) | (~((i2682 ^ (-34)) | (i2682 & (-34))))) * 318);
                                                int i2702 = ~((i2672 ^ 33) | (i2672 & 33) | i2642);
                                                int i2712 = (i2642 ^ (-34)) | (i2642 & (-34));
                                                int i2722 = ~((i2712 ^ identityHashCode202) | (i2712 & identityHashCode202));
                                                int i2732 = -(-(((i2702 ^ i2722) | (i2722 & i2702)) * 318));
                                                byte combineMeasuredStates3 = (byte) (android.view.View.combineMeasuredStates(0, 0) + 12);
                                                int i2742 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                b(mode2 + 1497162756, ((i2582 | i2632) << 1) - (i2632 ^ i2582), ((i2692 | i2732) << 1) - (i2732 ^ i2692), combineMeasuredStates3, (short) ((i2742 & (-101)) + (i2742 | (-101))), objArr1112);
                                                java.lang.Class<?> cls402 = java.lang.Class.forName((java.lang.String) objArr1112[0]);
                                                int combineMeasuredStates22 = android.view.View.combineMeasuredStates(0, 0);
                                                int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                int identityHashCode212 = java.lang.System.identityHashCode(setselector);
                                                int i2752 = ~maximumDrawingCacheSize2;
                                                int i2762 = 333279880 | i2752;
                                                int i2772 = ~((i2762 ^ identityHashCode212) | (i2762 & identityHashCode212));
                                                int i2782 = ~identityHashCode212;
                                                int i2792 = (i2782 & maximumDrawingCacheSize2) | (i2782 ^ maximumDrawingCacheSize2);
                                                int i2802 = ~((i2792 & (-333279881)) | ((-333279881) ^ i2792));
                                                int i2812 = (((((maximumDrawingCacheSize2 * (-317)) + 1057900361) - (~(((i2772 & i2802) | (i2772 ^ i2802)) * (-318)))) - 1) - (~(-(-(((~(maximumDrawingCacheSize2 | 333279880)) | (~(maximumDrawingCacheSize2 | identityHashCode212))) * (-318)))))) - 1;
                                                int i2822 = ~((i2752 ^ identityHashCode212) | (identityHashCode212 & i2752));
                                                int i2832 = ((i2822 ^ 333279880) | (333279880 & i2822)) * 318;
                                                int i2842 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                int i2852 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                int identityHashCode222 = java.lang.System.identityHashCode(setselector);
                                                int i2862 = modifierMetaStateMask2 * (-518);
                                                str7 = "valueOf";
                                                int i2872 = ~modifierMetaStateMask2;
                                                int i2882 = ~identityHashCode222;
                                                str8 = str15;
                                                int i2892 = (i2872 ^ i2882) | (i2872 & i2882);
                                                bArr = bArr2;
                                                int i2902 = ~i2892;
                                                int i2912 = (((i2862 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND) + (i2862 | my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND)) - (~(((~i2902) | i2902) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - 1;
                                                int i2922 = ~(i2892 | i2902);
                                                int i2932 = i2872 | modifierMetaStateMask2;
                                                int i2942 = ~((i2932 ^ identityHashCode222) | (i2932 & identityHashCode222));
                                                int i2952 = ((i2942 ^ i2922) | (i2922 & i2942)) * (-519);
                                                int i2962 = ~(i2882 | identityHashCode222);
                                                short s42 = (short) ((((i2912 | i2952) << 1) - (i2952 ^ i2912)) + (((i2962 & modifierMetaStateMask2) | (i2962 ^ modifierMetaStateMask2)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                b(combineMeasuredStates22 + 1497162782, ((i2812 | i2832) << 1) - (i2832 ^ i2812), (i2842 ^ (-33)) + ((i2842 & (-33)) << 1), (byte) (((i2852 | (-61)) << 1) - (i2852 ^ (-61))), s42, objArr1122);
                                                context2 = (android.content.Context) cls402.getMethod((java.lang.String) objArr1122[0], new java.lang.Class[0]).invoke(null, null);
                                                if (context2 != null) {
                                                }
                                                str9 = str6;
                                                java.lang.Object[] objArr1132 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1632628423};
                                                byte[] bArr92 = $$d;
                                                java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                d(bArr92[65], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, (byte) (-bArr92[419]), objArr1142);
                                                java.lang.Class<?> cls412 = java.lang.Class.forName((java.lang.String) objArr1142[0]);
                                                byte b162 = bArr92[66];
                                                java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                d(b162, (short) (b162 | 403), bArr92[57], objArr1152);
                                                java.lang.String str252 = (java.lang.String) objArr1152[0];
                                                int i2982 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                int identityHashCode232 = java.lang.System.identityHashCode(setselector);
                                                int i2992 = i2982 * (-55);
                                                int i3002 = ((i2992 | (-55)) << 1) - (i2992 ^ (-55));
                                                int i3012 = -(-(((~((i2982 ^ identityHashCode232) | (i2982 & identityHashCode232))) | 1) * 56));
                                                int i3022 = (((i3002 ^ i3012) + ((i3012 & i3002) << 1)) - (~((~((i2982 ^ 1) | (i2982 & 1))) * (-56)))) - 1;
                                                int i3032 = ~identityHashCode232;
                                                int i3042 = ~((i3032 & 1) | (i3032 ^ 1));
                                                int i3052 = ((i2982 & i3042) | (i2982 ^ i3042)) * 56;
                                                java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i3022 ^ i3052) + ((i3052 & i3022) << 1), objArr1162);
                                                objArr5 = (java.lang.Object[]) cls412.getMethod(str252, java.lang.Class.forName((java.lang.String) objArr1162[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1132);
                                                if (context2 == null) {
                                                }
                                            }
                                        }
                                        java.lang.String str26 = str3;
                                        java.lang.Object[] objArr124 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str26, java.lang.Object.class).invoke(null, setselector)).intValue()), 1178464752};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                        if (obj == null) {
                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 47, android.graphics.Color.blue(0) + 754, (char) (45561 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                            c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr125);
                                            obj = cls47.getMethod((java.lang.String) objArr125[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj);
                                        }
                                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj).invoke(null, objArr124);
                                        java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.resolveSize(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 754, (char) (android.text.TextUtils.indexOf("", "") + 45560));
                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                        c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr126);
                                        cls48.getField((java.lang.String) objArr126[0]).set(null, invoke2);
                                        long longValue6 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 47, 755 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (45560 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                        byte b17 = bArr2[97];
                                        str4 = str26;
                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                        c(b17, (byte) (b17 | 111), (byte) (-bArr2[45]), objArr127);
                                        cls49.getField((java.lang.String) objArr127[0]).set(null, java.lang.Long.valueOf(longValue6));
                                        obj2 = invoke2;
                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                        if (obj3 == null) {
                                        }
                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                        if (obj4 == null) {
                                        }
                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() == intValue) {
                                        }
                                        java.lang.Class cls82 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, android.widget.ExpandableListView.getPackedPositionType(0L) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.View.MeasureSpec.getMode(0) + 34284));
                                        java.lang.Object[] objArr352 = new java.lang.Object[1];
                                        c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr352);
                                        j2 = cls82.getField((java.lang.String) objArr352[0]).getLong(null);
                                        if (j2 != -1) {
                                        }
                                        str5 = str4;
                                        java.lang.Object[] objArr1192 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str5, java.lang.Object.class).invoke(null, setselector)).intValue()), 0, -1674328605};
                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                        if (obj5 == null) {
                                        }
                                        java.lang.Object[] objArr1212 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr1192);
                                        java.lang.Class cls452 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 47, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                        c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr1222);
                                        cls452.getField((java.lang.String) objArr1222[0]).set(null, objArr1212);
                                        long longValue52 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getTapTimeout() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.graphics.Color.blue(0) + 34284));
                                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                        c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr1232);
                                        cls462.getField((java.lang.String) objArr1232[0]).set(null, java.lang.Long.valueOf(longValue52));
                                        int i3072 = IccPrivateKeyCrtComponentsJson;
                                        SdkCoreAlternateContactlessPaymentDataImpl = ((i3072 & 13) + (i3072 | 13)) % 128;
                                        objArr4 = objArr1212;
                                        i2 = ((int[]) objArr4[1])[0];
                                        if (((int[]) objArr4[0])[0] != i2) {
                                        }
                                        java.lang.Class cls1222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, 584 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24291));
                                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                                        c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr4522);
                                        j3 = cls1222.getField((java.lang.String) objArr4522[0]).getLong(null);
                                        if (j3 != -1) {
                                        }
                                        int mode22 = android.view.View.MeasureSpec.getMode(0);
                                        int i24822 = -android.text.TextUtils.indexOf("", "");
                                        int identityHashCode1922 = java.lang.System.identityHashCode(setselector);
                                        int i24922 = i24822 * 624;
                                        int i25022 = ((1141657018 | i24922) << 1) - (i24922 ^ 1141657018);
                                        int i25122 = (333279882 & i24822) | (333279882 ^ i24822);
                                        int i25222 = (~(i25122 | identityHashCode1922)) * 623;
                                        int i25322 = ((i25022 | i25222) << 1) - (i25022 ^ i25222);
                                        int i25422 = ~identityHashCode1922;
                                        int i25522 = ~i24822;
                                        int i25622 = ~((i25522 ^ (-333279883)) | (i25522 & (-333279883)));
                                        int i25722 = ((i25422 & i25622) | (i25422 ^ i25622)) * (-623);
                                        int i25822 = ((i25322 | i25722) << 1) - (i25722 ^ i25322);
                                        int i25922 = ~i25122;
                                        int i26022 = ~((333279882 & identityHashCode1922) | (333279882 ^ identityHashCode1922));
                                        int i26122 = (i25922 ^ i26022) | (i25922 & i26022);
                                        int i26222 = ~(i24822 | identityHashCode1922);
                                        int i26322 = -(-(((i26222 ^ i26122) | (i26222 & i26122)) * 623));
                                        int i26422 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int identityHashCode2022 = java.lang.System.identityHashCode(setselector);
                                        int i26522 = ~i26422;
                                        int i26622 = ~((i26522 ^ identityHashCode2022) | (i26522 & identityHashCode2022));
                                        int i26722 = ~identityHashCode2022;
                                        int i26822 = (i26722 ^ i26422) | (i26722 & i26422);
                                        num2 = 0;
                                        int i26922 = ((((i26422 * 319) + 10778) - (~(-(-(((i26622 ^ 33) | (i26622 & 33)) * (-318)))))) - 1) + (((~((identityHashCode2022 ^ 33) | (identityHashCode2022 & 33))) | (~((i26822 ^ (-34)) | (i26822 & (-34))))) * 318);
                                        int i27022 = ~((i26722 ^ 33) | (i26722 & 33) | i26422);
                                        int i27122 = (i26422 ^ (-34)) | (i26422 & (-34));
                                        int i27222 = ~((i27122 ^ identityHashCode2022) | (i27122 & identityHashCode2022));
                                        int i27322 = -(-(((i27022 ^ i27222) | (i27222 & i27022)) * 318));
                                        byte combineMeasuredStates32 = (byte) (android.view.View.combineMeasuredStates(0, 0) + 12);
                                        int i27422 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        java.lang.Object[] objArr11122 = new java.lang.Object[1];
                                        b(mode22 + 1497162756, ((i25822 | i26322) << 1) - (i26322 ^ i25822), ((i26922 | i27322) << 1) - (i27322 ^ i26922), combineMeasuredStates32, (short) ((i27422 & (-101)) + (i27422 | (-101))), objArr11122);
                                        java.lang.Class<?> cls4022 = java.lang.Class.forName((java.lang.String) objArr11122[0]);
                                        int combineMeasuredStates222 = android.view.View.combineMeasuredStates(0, 0);
                                        int maximumDrawingCacheSize22 = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                        int identityHashCode2122 = java.lang.System.identityHashCode(setselector);
                                        int i27522 = ~maximumDrawingCacheSize22;
                                        int i27622 = 333279880 | i27522;
                                        int i27722 = ~((i27622 ^ identityHashCode2122) | (i27622 & identityHashCode2122));
                                        int i27822 = ~identityHashCode2122;
                                        int i27922 = (i27822 & maximumDrawingCacheSize22) | (i27822 ^ maximumDrawingCacheSize22);
                                        int i28022 = ~((i27922 & (-333279881)) | ((-333279881) ^ i27922));
                                        int i28122 = (((((maximumDrawingCacheSize22 * (-317)) + 1057900361) - (~(((i27722 & i28022) | (i27722 ^ i28022)) * (-318)))) - 1) - (~(-(-(((~(maximumDrawingCacheSize22 | 333279880)) | (~(maximumDrawingCacheSize22 | identityHashCode2122))) * (-318)))))) - 1;
                                        int i28222 = ~((i27522 ^ identityHashCode2122) | (identityHashCode2122 & i27522));
                                        int i28322 = ((i28222 ^ 333279880) | (333279880 & i28222)) * 318;
                                        int i28422 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                        int i28522 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                        byte modifierMetaStateMask22 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                        int identityHashCode2222 = java.lang.System.identityHashCode(setselector);
                                        int i28622 = modifierMetaStateMask22 * (-518);
                                        str7 = "valueOf";
                                        int i28722 = ~modifierMetaStateMask22;
                                        int i28822 = ~identityHashCode2222;
                                        str8 = str15;
                                        int i28922 = (i28722 ^ i28822) | (i28722 & i28822);
                                        bArr = bArr2;
                                        int i29022 = ~i28922;
                                        int i29122 = (((i28622 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND) + (i28622 | my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND)) - (~(((~i29022) | i29022) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - 1;
                                        int i29222 = ~(i28922 | i29022);
                                        int i29322 = i28722 | modifierMetaStateMask22;
                                        int i29422 = ~((i29322 ^ identityHashCode2222) | (i29322 & identityHashCode2222));
                                        int i29522 = ((i29422 ^ i29222) | (i29222 & i29422)) * (-519);
                                        int i29622 = ~(i28822 | identityHashCode2222);
                                        short s422 = (short) ((((i29122 | i29522) << 1) - (i29522 ^ i29122)) + (((i29622 & modifierMetaStateMask22) | (i29622 ^ modifierMetaStateMask22)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                        java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                        b(combineMeasuredStates222 + 1497162782, ((i28122 | i28322) << 1) - (i28322 ^ i28122), (i28422 ^ (-33)) + ((i28422 & (-33)) << 1), (byte) (((i28522 | (-61)) << 1) - (i28522 ^ (-61))), s422, objArr11222);
                                        context2 = (android.content.Context) cls4022.getMethod((java.lang.String) objArr11222[0], new java.lang.Class[0]).invoke(null, null);
                                        if (context2 != null) {
                                        }
                                        str9 = str6;
                                        java.lang.Object[] objArr11322 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1632628423};
                                        byte[] bArr922 = $$d;
                                        java.lang.Object[] objArr11422 = new java.lang.Object[1];
                                        d(bArr922[65], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, (byte) (-bArr922[419]), objArr11422);
                                        java.lang.Class<?> cls4122 = java.lang.Class.forName((java.lang.String) objArr11422[0]);
                                        byte b1622 = bArr922[66];
                                        java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                        d(b1622, (short) (b1622 | 403), bArr922[57], objArr11522);
                                        java.lang.String str2522 = (java.lang.String) objArr11522[0];
                                        int i29822 = -android.graphics.Color.argb(0, 0, 0, 0);
                                        int identityHashCode2322 = java.lang.System.identityHashCode(setselector);
                                        int i29922 = i29822 * (-55);
                                        int i30022 = ((i29922 | (-55)) << 1) - (i29922 ^ (-55));
                                        int i30122 = -(-(((~((i29822 ^ identityHashCode2322) | (i29822 & identityHashCode2322))) | 1) * 56));
                                        int i30222 = (((i30022 ^ i30122) + ((i30122 & i30022) << 1)) - (~((~((i29822 ^ 1) | (i29822 & 1))) * (-56)))) - 1;
                                        int i30322 = ~identityHashCode2322;
                                        int i30422 = ~((i30322 & 1) | (i30322 ^ 1));
                                        int i30522 = ((i29822 & i30422) | (i29822 ^ i30422)) * 56;
                                        java.lang.Object[] objArr11622 = new java.lang.Object[1];
                                        e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i30222 ^ i30522) + ((i30522 & i30222) << 1), objArr11622);
                                        objArr5 = (java.lang.Object[]) cls4122.getMethod(str2522, java.lang.Class.forName((java.lang.String) objArr11622[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11322);
                                        if (context2 == null) {
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            } else {
                                setselector = setselector2;
                                num = 1;
                                str = str18;
                            }
                            long longValue522 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls4622 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getTapTimeout() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.graphics.Color.blue(0) + 34284));
                            java.lang.Object[] objArr12322 = new java.lang.Object[1];
                            c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr12322);
                            cls4622.getField((java.lang.String) objArr12322[0]).set(null, java.lang.Long.valueOf(longValue522));
                            int i30722 = IccPrivateKeyCrtComponentsJson;
                            SdkCoreAlternateContactlessPaymentDataImpl = ((i30722 & 13) + (i30722 | 13)) % 128;
                            objArr4 = objArr1212;
                            i2 = ((int[]) objArr4[1])[0];
                            if (((int[]) objArr4[0])[0] != i2) {
                            }
                            java.lang.Class cls12222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, 584 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24291));
                            java.lang.Object[] objArr45222 = new java.lang.Object[1];
                            c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr45222);
                            j3 = cls12222.getField((java.lang.String) objArr45222[0]).getLong(null);
                            if (j3 != -1) {
                            }
                            int mode222 = android.view.View.MeasureSpec.getMode(0);
                            int i248222 = -android.text.TextUtils.indexOf("", "");
                            int identityHashCode19222 = java.lang.System.identityHashCode(setselector);
                            int i249222 = i248222 * 624;
                            int i250222 = ((1141657018 | i249222) << 1) - (i249222 ^ 1141657018);
                            int i251222 = (333279882 & i248222) | (333279882 ^ i248222);
                            int i252222 = (~(i251222 | identityHashCode19222)) * 623;
                            int i253222 = ((i250222 | i252222) << 1) - (i250222 ^ i252222);
                            int i254222 = ~identityHashCode19222;
                            int i255222 = ~i248222;
                            int i256222 = ~((i255222 ^ (-333279883)) | (i255222 & (-333279883)));
                            int i257222 = ((i254222 & i256222) | (i254222 ^ i256222)) * (-623);
                            int i258222 = ((i253222 | i257222) << 1) - (i257222 ^ i253222);
                            int i259222 = ~i251222;
                            int i260222 = ~((333279882 & identityHashCode19222) | (333279882 ^ identityHashCode19222));
                            int i261222 = (i259222 ^ i260222) | (i259222 & i260222);
                            int i262222 = ~(i248222 | identityHashCode19222);
                            int i263222 = -(-(((i262222 ^ i261222) | (i262222 & i261222)) * 623));
                            int i264222 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int identityHashCode20222 = java.lang.System.identityHashCode(setselector);
                            int i265222 = ~i264222;
                            int i266222 = ~((i265222 ^ identityHashCode20222) | (i265222 & identityHashCode20222));
                            int i267222 = ~identityHashCode20222;
                            int i268222 = (i267222 ^ i264222) | (i267222 & i264222);
                            num2 = 0;
                            int i269222 = ((((i264222 * 319) + 10778) - (~(-(-(((i266222 ^ 33) | (i266222 & 33)) * (-318)))))) - 1) + (((~((identityHashCode20222 ^ 33) | (identityHashCode20222 & 33))) | (~((i268222 ^ (-34)) | (i268222 & (-34))))) * 318);
                            int i270222 = ~((i267222 ^ 33) | (i267222 & 33) | i264222);
                            int i271222 = (i264222 ^ (-34)) | (i264222 & (-34));
                            int i272222 = ~((i271222 ^ identityHashCode20222) | (i271222 & identityHashCode20222));
                            int i273222 = -(-(((i270222 ^ i272222) | (i272222 & i270222)) * 318));
                            byte combineMeasuredStates322 = (byte) (android.view.View.combineMeasuredStates(0, 0) + 12);
                            int i274222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            java.lang.Object[] objArr111222 = new java.lang.Object[1];
                            b(mode222 + 1497162756, ((i258222 | i263222) << 1) - (i263222 ^ i258222), ((i269222 | i273222) << 1) - (i273222 ^ i269222), combineMeasuredStates322, (short) ((i274222 & (-101)) + (i274222 | (-101))), objArr111222);
                            java.lang.Class<?> cls40222 = java.lang.Class.forName((java.lang.String) objArr111222[0]);
                            int combineMeasuredStates2222 = android.view.View.combineMeasuredStates(0, 0);
                            int maximumDrawingCacheSize222 = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            int identityHashCode21222 = java.lang.System.identityHashCode(setselector);
                            int i275222 = ~maximumDrawingCacheSize222;
                            int i276222 = 333279880 | i275222;
                            int i277222 = ~((i276222 ^ identityHashCode21222) | (i276222 & identityHashCode21222));
                            int i278222 = ~identityHashCode21222;
                            int i279222 = (i278222 & maximumDrawingCacheSize222) | (i278222 ^ maximumDrawingCacheSize222);
                            int i280222 = ~((i279222 & (-333279881)) | ((-333279881) ^ i279222));
                            int i281222 = (((((maximumDrawingCacheSize222 * (-317)) + 1057900361) - (~(((i277222 & i280222) | (i277222 ^ i280222)) * (-318)))) - 1) - (~(-(-(((~(maximumDrawingCacheSize222 | 333279880)) | (~(maximumDrawingCacheSize222 | identityHashCode21222))) * (-318)))))) - 1;
                            int i282222 = ~((i275222 ^ identityHashCode21222) | (identityHashCode21222 & i275222));
                            int i283222 = ((i282222 ^ 333279880) | (333279880 & i282222)) * 318;
                            int i284222 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                            int i285222 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                            byte modifierMetaStateMask222 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                            int identityHashCode22222 = java.lang.System.identityHashCode(setselector);
                            int i286222 = modifierMetaStateMask222 * (-518);
                            str7 = "valueOf";
                            int i287222 = ~modifierMetaStateMask222;
                            int i288222 = ~identityHashCode22222;
                            str8 = str15;
                            int i289222 = (i287222 ^ i288222) | (i287222 & i288222);
                            bArr = bArr2;
                            int i290222 = ~i289222;
                            int i291222 = (((i286222 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND) + (i286222 | my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND)) - (~(((~i290222) | i290222) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - 1;
                            int i292222 = ~(i289222 | i290222);
                            int i293222 = i287222 | modifierMetaStateMask222;
                            int i294222 = ~((i293222 ^ identityHashCode22222) | (i293222 & identityHashCode22222));
                            int i295222 = ((i294222 ^ i292222) | (i292222 & i294222)) * (-519);
                            int i296222 = ~(i288222 | identityHashCode22222);
                            short s4222 = (short) ((((i291222 | i295222) << 1) - (i295222 ^ i291222)) + (((i296222 & modifierMetaStateMask222) | (i296222 ^ modifierMetaStateMask222)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                            java.lang.Object[] objArr112222 = new java.lang.Object[1];
                            b(combineMeasuredStates2222 + 1497162782, ((i281222 | i283222) << 1) - (i283222 ^ i281222), (i284222 ^ (-33)) + ((i284222 & (-33)) << 1), (byte) (((i285222 | (-61)) << 1) - (i285222 ^ (-61))), s4222, objArr112222);
                            context2 = (android.content.Context) cls40222.getMethod((java.lang.String) objArr112222[0], new java.lang.Class[0]).invoke(null, null);
                            if (context2 != null) {
                            }
                            str9 = str6;
                            java.lang.Object[] objArr113222 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, setselector)).intValue()), -1632628423};
                            byte[] bArr9222 = $$d;
                            java.lang.Object[] objArr114222 = new java.lang.Object[1];
                            d(bArr9222[65], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, (byte) (-bArr9222[419]), objArr114222);
                            java.lang.Class<?> cls41222 = java.lang.Class.forName((java.lang.String) objArr114222[0]);
                            byte b16222 = bArr9222[66];
                            java.lang.Object[] objArr115222 = new java.lang.Object[1];
                            d(b16222, (short) (b16222 | 403), bArr9222[57], objArr115222);
                            java.lang.String str25222 = (java.lang.String) objArr115222[0];
                            int i298222 = -android.graphics.Color.argb(0, 0, 0, 0);
                            int identityHashCode23222 = java.lang.System.identityHashCode(setselector);
                            int i299222 = i298222 * (-55);
                            int i300222 = ((i299222 | (-55)) << 1) - (i299222 ^ (-55));
                            int i301222 = -(-(((~((i298222 ^ identityHashCode23222) | (i298222 & identityHashCode23222))) | 1) * 56));
                            int i302222 = (((i300222 ^ i301222) + ((i301222 & i300222) << 1)) - (~((~((i298222 ^ 1) | (i298222 & 1))) * (-56)))) - 1;
                            int i303222 = ~identityHashCode23222;
                            int i304222 = ~((i303222 & 1) | (i303222 ^ 1));
                            int i305222 = ((i298222 & i304222) | (i298222 ^ i304222)) * 56;
                            java.lang.Object[] objArr116222 = new java.lang.Object[1];
                            e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", (i302222 ^ i305222) + ((i305222 & i302222) << 1), objArr116222);
                            objArr5 = (java.lang.Object[]) cls41222.getMethod(str25222, java.lang.Class.forName((java.lang.String) objArr116222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr113222);
                            if (context2 == null) {
                            }
                        } catch (java.lang.Exception unused6) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        long longValue62 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls492 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 47, 755 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (45560 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                        byte b172 = bArr2[97];
                        str4 = str26;
                        java.lang.Object[] objArr1272 = new java.lang.Object[1];
                        c(b172, (byte) (b172 | 111), (byte) (-bArr2[45]), objArr1272);
                        cls492.getField((java.lang.String) objArr1272[0]).set(null, java.lang.Long.valueOf(longValue62));
                        obj2 = invoke2;
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                        if (obj3 == null) {
                        }
                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                        if (obj4 == null) {
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() == intValue) {
                        }
                        java.lang.Class cls822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, android.widget.ExpandableListView.getPackedPositionType(0L) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.View.MeasureSpec.getMode(0) + 34284));
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr3522);
                        j2 = cls822.getField((java.lang.String) objArr3522[0]).getLong(null);
                        if (j2 != -1) {
                        }
                        str5 = str4;
                        java.lang.Object[] objArr11922 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str5, java.lang.Object.class).invoke(null, setselector)).intValue()), 0, -1674328605};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                        if (obj5 == null) {
                        }
                        java.lang.Object[] objArr12122 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr11922);
                        java.lang.Class cls4522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 47, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                        java.lang.Object[] objArr12222 = new java.lang.Object[1];
                        c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr12222);
                        cls4522.getField((java.lang.String) objArr12222[0]).set(null, objArr12122);
                    } catch (java.lang.Exception unused7) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    long longValue7 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 667, (char) (40023 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    byte b18 = bArr2[97];
                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                    c(b18, (byte) (b18 | 111), (byte) (-bArr2[45]), objArr128);
                    cls50.getField((java.lang.String) objArr128[0]).set(null, java.lang.Long.valueOf(longValue7));
                    IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 5) % 128;
                    objArr3 = objArr2;
                    i = ((int[]) objArr3[1])[0];
                    if (((int[]) objArr3[0])[0] != i) {
                    }
                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, 753 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (45560 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    byte b42 = bArr2[97];
                    java.lang.Object[] objArr262 = new java.lang.Object[1];
                    c(b42, (byte) (b42 | 111), (byte) (-bArr2[45]), objArr262);
                    j = cls52.getField((java.lang.String) objArr262[0]).getLong(null);
                    if (j != -1) {
                    }
                    java.lang.String str262 = str3;
                    java.lang.Object[] objArr1242 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str262, java.lang.Object.class).invoke(null, setselector)).intValue()), 1178464752};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                    if (obj == null) {
                    }
                    java.lang.Object invoke22 = ((java.lang.reflect.Method) obj).invoke(null, objArr1242);
                    java.lang.Class cls482 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.resolveSize(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 754, (char) (android.text.TextUtils.indexOf("", "") + 45560));
                    java.lang.Object[] objArr1262 = new java.lang.Object[1];
                    c((short) 54, (byte) 71, (byte) (bArr2[31] - 1), objArr1262);
                    cls482.getField((java.lang.String) objArr1262[0]).set(null, invoke22);
                } catch (java.lang.Exception unused8) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            java.lang.Object[] objArr129 = {context, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str2, java.lang.Object.class).invoke(null, setselector)).intValue()), 0, -1920026617};
            byte[] bArr10 = $$d;
            java.lang.Object[] objArr130 = new java.lang.Object[1];
            d(bArr10[65], 422, bArr10[8], objArr130);
            java.lang.Class<?> cls51 = java.lang.Class.forName((java.lang.String) objArr130[0]);
            byte b19 = bArr10[66];
            java.lang.Object[] objArr131 = new java.lang.Object[1];
            d(b19, (short) (b19 | 403), bArr10[57], objArr131);
            java.lang.String str27 = (java.lang.String) objArr131[0];
            int i308 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            java.lang.Object[] objArr132 = new java.lang.Object[1];
            e("鮛ኇ鯺럺쥁范釟ྸ纔⮱\u1757﴿덠\udf43뮑椱✚猞츿튧쫨\ue4ab剹㺉纂顰\ue697", ((i308 | 1) << 1) - (i308 ^ 1), objArr132);
            objArr2 = (java.lang.Object[]) cls51.getMethod(str27, java.lang.Class.forName((java.lang.String) objArr132[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr129);
            java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", "", 0), 667 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.KeyEvent.keyCodeFromString("") + 40024));
            java.lang.Object[] objArr133 = new java.lang.Object[1];
            c((byte) (bArr2[1] + 1), (byte) 77, (byte) (bArr2[109] - 1), objArr133);
            cls53.getField((java.lang.String) objArr133[0]).set(null, objArr2);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
        float maxVolume = android.media.AudioTrack.getMaxVolume();
        int i309 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
        int i310 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        int i311 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int i312 = -android.graphics.Color.alpha(0);
        java.lang.Object[] objArr134 = new java.lang.Object[1];
        b(1497162757 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), ((-333279884) ^ i309) + ((i309 & (-333279884)) << 1), (i310 & (-32)) + (i310 | (-32)), (byte) (((i311 | 11) << 1) - (i311 ^ 11)), (short) ((i312 & (-101)) + (i312 | (-101))), objArr134);
        java.lang.Class<?> cls54 = java.lang.Class.forName((java.lang.String) objArr134[0]);
        int i313 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int i314 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i315 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
        java.lang.Object[] objArr135 = new java.lang.Object[1];
        b((1497162781 ^ i313) + ((i313 & 1497162781) << 1), (-333279882) - indexOf, (i314 ^ (-33)) + ((i314 & (-33)) << 1), (byte) ((i315 ^ (-59)) + ((i315 & (-59)) << 1)), (short) (((scrollBarSize | (-2)) << 1) - (scrollBarSize ^ (-2))), objArr135);
        context = (android.content.Context) cls54.getMethod((java.lang.String) objArr135[0], new java.lang.Class[0]).invoke(null, null);
        if (context != null) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 41) % 128;
            context = context.getApplicationContext();
        }
        str2 = str;
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = -1178129013;
        values = 520368522;
        writeReplace = 215565126;
        RecordsJson = new byte[]{92, 18, -82, com.google.common.base.Ascii.ESC, 125, 76, 18, 85, 5, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 124, 121, -29, com.google.common.base.Ascii.RS, -59, 80, -93, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -95, com.google.common.base.Ascii.DC4, -84, 17, 69, com.visa.cbp.getEncExpo.onUnminimized, 124, com.visa.cbp.getEncExpo.kernelVersion, com.visa.cbp.getEncExpo.IResultReceiver2, 109, -12, com.google.common.base.Ascii.NAK, -58, -15, -54, 101, 97, com.visa.cbp.getEncExpo.kernelVersion, 121, 80, -34, -1, -50, -63, -41, -106, -60, -58, -50, -52, -12, 40, 57, 46, -67, -37, -62, 14, -127, -10, -15, -4, -51, -11, -52, 88, -105, 110, com.visa.cbp.getEncExpo.registerForActivityResult, 115, -106, -22, -111, -112, 108, 71, -95, 110, 101, -109, 108, -111, 114, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 19, 74, com.google.common.base.Ascii.SUB, 77, 57, 62, 88, 66, com.google.common.base.Ascii.SYN, 78, 1, 86, 124, 110, 72, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -60, -48, -23, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -48, -53, -4, 14, com.visa.cbp.getEncExpo.startTransaction, -62, -48, -57, -52, -60, -46};
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        writeReplace();
        valueOf = -1309710993277726256L;
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 107) % 128;
    }

    public final void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -168121427, 168121430, java.lang.System.identityHashCode(this));
    }

    public final void values(android.content.Context context, com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, context, cVMPriority}, 182783406, -182783399, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(android.content.Context context, com.visa.cbp.sdk.facade.data.CvmMode cvmMode) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, context, cvmMode}, -27651894, 27651898, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(android.content.Context context, boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, context, java.lang.Boolean.valueOf(z)}, -1928806931, 1928806932, java.lang.System.identityHashCode(this));
    }

    public final boolean DigitizedCardProfile(android.content.Context context) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, context}, -543709406, 543709408, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$2() {
        $$g = new byte[]{0, Byte.MIN_VALUE, -48, 115, 10};
        $$h = 181;
    }

    public final void valueOf(android.content.Context context) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, context}, -247765544, 247765550, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, 13, com.visa.cbp.getEncExpo.onUnminimized, 47, -45, 4, 8, -12, 14, 18, -20, -12, 3, 10, -3, -3, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, 13, com.visa.cbp.getEncExpo.onUnminimized, 32, -17, com.visa.cbp.getEncExpo.onUnminimized, 2, 2, -1, 6, -14, -38, 1, -3, -12, 10, -18, com.google.common.base.Ascii.DC4, 0, 32, -31, -18, 13, 19, -35, 2, 8, -4, -4, 6, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, 13, com.visa.cbp.getEncExpo.onUnminimized, 35, -26, -14, 6, -6, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -14, -3, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, 13, com.visa.cbp.getEncExpo.onUnminimized, 48, -35, -14, -3, 10, 2, -4, 5, 1, -20, 14, -13, 1, 62, com.visa.cbp.getEncExpo.startTransaction, com.google.common.base.Ascii.VT, -19, -2, 14, -14, 14, 1, -18, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.visa.cbp.getEncExpo.startTransaction, -4, -4, 14, -8, 60, -54, 1, -18, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -67, -3, 2, 8, -4, -4, 6, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -38, -18, -8, 39, -45, -4, com.google.common.base.Ascii.FF, 34, -52, 1, 9, -6, 8, -15, -1, 38, -36, 7, -3, 5, com.google.common.base.Ascii.NAK, -35, 10, -18, 8, 6, com.google.common.base.Ascii.ESC, -37, -4, 3, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -60, 4, -2, -10, -7, 10, 2, -20, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -38, -18, -8, 39, -45, -4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, 9, -38, -2, -8, 44, -52, 8, 35, -43, -1, -3, com.google.common.base.Ascii.SI, -14, 34, -34, -5, 10, -7, 0, -6, 41, -37, -4, 3, 71, -15, -5, 17, -14, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -54, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.FF, 3, -20, 14, 33, -45, 0, 7, -4, 1, -15, 2, 16, -20, 10, -7, 0, 42, -45, 0, -7, 14, -20, 3, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, 13, com.visa.cbp.getEncExpo.onUnminimized, 37, -24, com.visa.cbp.getEncExpo.onUnminimized, -4, 7, -4, 6, 41, -54, com.google.common.base.Ascii.DC4, -9, -4, 10, -2, -11, 6, 64, -33, -38, 1, -3, -12, 10, -18, com.google.common.base.Ascii.DC4, 0, 32, -31, -18, 13, 19, -35, 2, 8, -4, -4, 6, com.google.common.base.Ascii.DC4, -12, -10, com.google.common.base.Ascii.SI, -15, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -35, -18, -25, com.google.common.base.Ascii.ETB, -9, -10, com.google.common.base.Ascii.FS, -31, 13, -14, 45, -30, -20, 18, com.google.common.base.Ascii.FS, -30, -15, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, -37, -4, 3, 71, -18, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -58, 1, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.SUB, -13, 3, -18, -44, -9, 14, -14, 3, com.google.common.base.Ascii.FF, -20, 14, 33, -45, 0, -7, 18, -3, -18, 7, 6, -15, -1, 34, -18, -25, com.google.common.base.Ascii.VT, 7, -10, -7, 47, -30, -20, 18, com.google.common.base.Ascii.SYN, -42, 3, 0};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE;
    }

    public final boolean AlternateContactlessPaymentDataJson(android.content.Context context) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, context}, 2065105571, -2065105571, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 16, 123, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
    }

    public final byte[] aj_(byte[] bArr, android.content.Context context, android.os.Bundle bundle) {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, context, bundle}, 1185545263, -1185545258, java.lang.System.identityHashCode(this));
    }
}
