package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnApplyWindowInsetsListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getProfileVersion;
    private androidx.biometric.BiometricPrompt AlternateContactlessPaymentDataJson;
    private java.util.concurrent.Executor valueOf;
    private android.app.KeyguardManager values;
    private androidx.biometric.BiometricPrompt.PromptInfo writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 * 3;
        byte[] bArr = $$a;
        int i3 = 4 - (b * 2);
        int i4 = (s * 3) + 66;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3++;
            i4 = (-i4) + i6;
            i = i7;
            bArr2[i] = (byte) i4;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i4;
            i4 = bArr[i3];
            i3++;
            i4 = (-i4) + i6;
            i = i7;
            bArr2[i] = (byte) i4;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i3) | i;
        int i5 = (i * (-494)) + (i2 * (-494)) + ((~(i | i2)) * (-495)) + (i4 * 495) + (((~((~i) | (~i2))) | (~i4)) * 495);
        if (i5 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 == 2) {
            com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (com.payair.hce.setOnApplyWindowInsetsListener) objArr[0];
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) objArr[1];
            int i6 = getProfileVersion;
            int i7 = i6 & 37;
            IccPrivateKeyCrtComponentsJson = (i7 + ((i6 ^ 37) | i7)) % 128;
            setonapplywindowinsetslistener.AlternateContactlessPaymentDataJson = (androidx.biometric.BiometricPrompt) valueOf(new java.lang.Object[]{setonapplywindowinsetslistener, fragmentActivity}, 2111539802, -2111539798, java.lang.System.identityHashCode(setonapplywindowinsetslistener));
            setonapplywindowinsetslistener.writeReplace = (androidx.biometric.BiometricPrompt.PromptInfo) valueOf(new java.lang.Object[0], -967809944, 967809947, (int) java.lang.System.currentTimeMillis());
            return null;
        }
        if (i5 == 3) {
            return writeReplace(objArr);
        }
        if (i5 != 4) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener2 = (com.payair.hce.setOnApplyWindowInsetsListener) objArr[0];
        androidx.fragment.app.FragmentActivity fragmentActivity2 = (androidx.fragment.app.FragmentActivity) objArr[1];
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777179) - android.graphics.Color.rgb(0, 0, 0), 5051 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            androidx.biometric.BiometricPrompt biometricPrompt = new androidx.biometric.BiometricPrompt(fragmentActivity2, setonapplywindowinsetslistener2.valueOf, new androidx.biometric.BiometricPrompt.AuthenticationCallback() { // from class: com.payair.hce.setOnApplyWindowInsetsListener.4
                private static int DigitizedCardProfile = 0;
                private static int writeReplace = 1;

                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i8, int i9, int i10) {
                    int i11 = (i8 * 530) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (i9 * 530) + (((~((~i10) | i8)) | (~(i8 | i9))) * 529) + (((~(i8 | i10)) | (~i9)) * 529);
                    if (i11 == 1) {
                        return DigitizedCardProfile(objArr2);
                    }
                    if (i11 == 2) {
                        return values(objArr2);
                    }
                    if (i11 == 3) {
                        com.payair.hce.setOnApplyWindowInsetsListener.AnonymousClass4 anonymousClass4 = (com.payair.hce.setOnApplyWindowInsetsListener.AnonymousClass4) objArr2[0];
                        androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult = (androidx.biometric.BiometricPrompt.AuthenticationResult) objArr2[1];
                        int i12 = DigitizedCardProfile;
                        int i13 = i12 & 35;
                        writeReplace = (((i12 | 35) & (~i13)) + (i13 << 1)) % 128;
                        super.onAuthenticationSucceeded(authenticationResult);
                        com.payair.hce.setFocusable.values(new java.lang.Object[]{authenticationResult}, 86799470, -86799459, (int) java.lang.System.currentTimeMillis());
                        DigitizedCardProfile = (writeReplace + 99) % 128;
                        return null;
                    }
                    com.payair.hce.setOnApplyWindowInsetsListener.AnonymousClass4 anonymousClass42 = (com.payair.hce.setOnApplyWindowInsetsListener.AnonymousClass4) objArr2[0];
                    int intValue = ((java.lang.Number) objArr2[1]).intValue();
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) objArr2[2];
                    int i14 = writeReplace;
                    DigitizedCardProfile = (((i14 | 49) << 1) - (i14 ^ 49)) % 128;
                    super.onAuthenticationError(intValue, charSequence);
                    writeReplace(new java.lang.Object[0], 1503648853, -1503648851, (int) java.lang.System.currentTimeMillis());
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onAuthenticationError(intValue, charSequence);
                    int i15 = DigitizedCardProfile;
                    writeReplace = (((i15 & (-70)) | ((~i15) & 69)) + ((i15 & 69) << 1)) % 128;
                    return null;
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                    com.payair.hce.setOnApplyWindowInsetsListener.AnonymousClass4 anonymousClass4 = (com.payair.hce.setOnApplyWindowInsetsListener.AnonymousClass4) objArr2[0];
                    int i8 = DigitizedCardProfile;
                    int i9 = i8 & 15;
                    int i10 = (i8 ^ 15) | i9;
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    writeReplace = i11 % 128;
                    if (i11 % 2 != 0) {
                        super.onAuthenticationFailed();
                        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onAuthenticationFailed();
                        int i12 = DigitizedCardProfile;
                        int i13 = i12 & 15;
                        int i14 = -(-(i12 | 15));
                        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                        writeReplace = i15 % 128;
                        if (i15 % 2 != 0) {
                            return null;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    super.onAuthenticationFailed();
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onAuthenticationFailed();
                    throw null;
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                    int i8 = writeReplace;
                    int i9 = i8 & 27;
                    int i10 = (i9 - (~(-(-((i8 ^ 27) | i9))))) - 1;
                    DigitizedCardProfile = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr = (byte[]) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -428114051, 428114062, (int) java.lang.System.currentTimeMillis());
                        if (bArr != null) {
                            com.payair.hce.HCEPayment.valueOf(new java.lang.Object[]{-1L}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -367342150, 367342170, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{null}, -503494143, 503494150, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{new java.lang.String(bArr)}, 2012165714, -2012165692, (int) java.lang.System.currentTimeMillis());
                            if (setsystemgestureexclusionrects == null) {
                                int i11 = writeReplace;
                                int i12 = ((((i11 ^ 9) | (i11 & 9)) << 1) - (~(-((i11 & (-10)) | ((~i11) & 9))))) - 1;
                                DigitizedCardProfile = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return null;
                                }
                                throw null;
                            }
                            com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1562720689, 1562720690, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
                            int i13 = DigitizedCardProfile;
                            writeReplace = (((i13 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + (i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1) % 128;
                        }
                        int i14 = writeReplace;
                        int i15 = i14 ^ 11;
                        int i16 = (i14 & 11) << 1;
                        int i17 = (i15 & i16) + (i16 | i15);
                        DigitizedCardProfile = i17 % 128;
                        if (i17 % 2 == 0) {
                            return null;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    throw new java.lang.ArithmeticException();
                }

                private static void AlternateContactlessPaymentDataJson() {
                    writeReplace(new java.lang.Object[0], 1503648853, -1503648851, (int) java.lang.System.currentTimeMillis());
                }

                @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationFailed() {
                    writeReplace(new java.lang.Object[]{this}, 1058867918, -1058867917, java.lang.System.identityHashCode(this));
                }

                @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationSucceeded(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
                    writeReplace(new java.lang.Object[]{this, authenticationResult}, -627249567, 627249570, java.lang.System.identityHashCode(this));
                }

                @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationError(int i8, java.lang.CharSequence charSequence) {
                    writeReplace(new java.lang.Object[]{this, java.lang.Integer.valueOf(i8), charSequence}, 705250583, -705250583, i8);
                }
            });
            int i8 = getProfileVersion;
            int i9 = i8 & 117;
            int i10 = -(-(i8 | 117));
            IccPrivateKeyCrtComponentsJson = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            return biometricPrompt;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public setOnApplyWindowInsetsListener(android.content.Context context) {
        this.values = (android.app.KeyguardManager) context.getSystemService("keyguard");
        this.valueOf = androidx.core.content.ContextCompat.getMainExecutor(context);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (com.payair.hce.setOnApplyWindowInsetsListener) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 111;
        int i3 = i | 111;
        getProfileVersion = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        boolean isDeviceSecure = setonapplywindowinsetslistener.values.isDeviceSecure();
        int i4 = getProfileVersion;
        int i5 = i4 & 29;
        int i6 = (((i4 ^ 29) | i5) << 1) - ((i4 | 29) & (~i5));
        IccPrivateKeyCrtComponentsJson = i6 % 128;
        if (i6 % 2 == 0) {
            return java.lang.Boolean.valueOf(isDeviceSecure);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        androidx.biometric.BiometricPrompt.PromptInfo.Builder builder = new androidx.biometric.BiometricPrompt.PromptInfo.Builder();
        android.content.Context context = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
        int i = com.payair.hce.R.string.biometric_prompt_title;
        int i2 = getProfileVersion;
        int i3 = (((i2 ^ 51) - (~(-(-((i2 & 51) << 1))))) - 1) % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        int i4 = i3 & 13;
        int i5 = ((i3 ^ 13) | i4) << 1;
        int i6 = -((~i4) & (i3 | 13));
        getProfileVersion = ((i5 & i6) + (i6 | i5)) % 128;
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i)};
            int i7 = -android.text.TextUtils.getOffsetBefore("", 0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(new int[]{882257520, 528830887, 869358664, -243321125, -893960587, -560715187, -555353555, 1439753952, 966158985, -67559217, -238758527, 2122308091}, (((~i7) & 23) | (i7 & (-24))) + ((i7 & 23) << 1), objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            int mode = android.view.View.MeasureSpec.getMode(0);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i8 = mode * (-947);
            int i9 = ~mode;
            int i10 = (i9 | mode) & i9;
            int i11 = currentTimeMillis & (-10);
            int i12 = (~i11) & (currentTimeMillis | (-10));
            int i13 = ~((i12 ^ i11) | (i11 & i12));
            int i14 = i10 ^ i13;
            int i15 = i10 & i13;
            int i16 = (((i8 | 8541) << 1) - (i8 ^ 8541)) + (((i15 & i14) | (i15 ^ i14)) * (-948));
            int i17 = (i9 & 9) | ((~i9) & (-10));
            int i18 = i9 & (-10);
            int i19 = (i17 ^ i18) | (i18 & i17);
            int i20 = ~currentTimeMillis;
            int i21 = i19 & i20;
            int i22 = (i20 | i19) & (~i21);
            int i23 = -(-((~((i22 ^ i21) | (i22 & i21))) * (-948)));
            int i24 = (i16 | i23) << 1;
            int i25 = -(((~i23) & i16) | ((~i16) & i23));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            int i27 = mode & (-10);
            int i28 = -(-((((mode | (-10)) & (~i27)) | i27) * 948));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b(new int[]{676439657, -698404890, -1859804560, -1233311237, -1396376728, 34445324}, ((i26 | i28) << 1) - (i28 ^ i26), objArr4);
            androidx.biometric.BiometricPrompt.PromptInfo.Builder title = builder.setTitle((java.lang.CharSequence) cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE).invoke(context, objArr2));
            android.content.Context context2 = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
            int i29 = com.payair.hce.R.string.biometric_prompt_subtitle;
            int i30 = getProfileVersion;
            IccPrivateKeyCrtComponentsJson = (i30 + 83) % 128;
            IccPrivateKeyCrtComponentsJson = (((i30 & 88) + (i30 | 88)) - 1) % 128;
            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i29)};
            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i31 = (mirror * 64578) + 23950;
            int i32 = ~currentTimeMillis2;
            int i33 = (i32 | currentTimeMillis2) & i32;
            int i34 = ((~i33) & 24) | (i33 & (-25));
            int i35 = i33 & 24;
            int i36 = ~((i35 & i34) | (i34 ^ i35));
            int i37 = ~mirror;
            int i38 = i37 & currentTimeMillis2;
            int i39 = (~i38) & (i37 | currentTimeMillis2);
            int i40 = ~((i39 ^ i38) | (i38 & i39));
            int i41 = i36 & i40;
            int i42 = (i36 | i40) & (~i41);
            int i43 = (i42 ^ i41) | (i42 & i41);
            int i44 = i32 & i37;
            int i45 = ~i32;
            int i46 = i44 | (i45 & mirror);
            int i47 = i32 & mirror;
            int i48 = ~((i46 & i47) | (i46 ^ i47));
            int i49 = -(-(((i43 & i48) | (i48 ^ i43)) * 959));
            int i50 = i31 & i49;
            int i51 = (i49 | i31) & (~i50);
            int i52 = i50 << 1;
            int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
            int i54 = (mirror & 24) | (i37 & (-25));
            int i55 = mirror & 65511;
            int i56 = (i54 & i55) | (i54 ^ i55);
            int i57 = ~i56;
            int i58 = ((i56 | i57) & i57) * (-959);
            int i59 = (i53 & i58) + (i58 | i53);
            int i60 = (i45 & i37) | (i32 & (~i37));
            int i61 = ~((i60 ^ i44) | (i60 & i44));
            int i62 = currentTimeMillis2 & 24;
            int i63 = (~i62) & (currentTimeMillis2 | 24);
            int i64 = ~((i62 ^ i63) | (i62 & i63));
            int i65 = -(~(((i61 ^ i64) | (i61 & i64) | (~((mirror & currentTimeMillis2) | (mirror ^ currentTimeMillis2)))) * 959));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b(new int[]{882257520, 528830887, 869358664, -243321125, -893960587, -560715187, -555353555, 1439753952, 966158985, -67559217, -238758527, 2122308091}, (-2) - (~(((i59 | i65) << 1) - (i65 ^ i59))), objArr6);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i66 = absoluteGravity * (-391);
            int i67 = i66 & (-1755);
            int i68 = (i66 | (-1755)) & (~i67);
            int i69 = -(-(i67 << 1));
            int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
            int i71 = absoluteGravity & (-10);
            int i72 = ~((absoluteGravity ^ (-10)) | i71);
            int i73 = currentTimeMillis3 & 9;
            int i74 = (~i73) & (currentTimeMillis3 | 9);
            int i75 = (i74 ^ i73) | (i74 & i73);
            int i76 = ~i75;
            int i77 = (i75 | i76) & i76;
            int i78 = i72 & i77;
            int i79 = (i72 | i77) & (~i78);
            int i80 = -(-(((i79 ^ i78) | (i79 & i78)) * (-196)));
            int i81 = i70 & i80;
            int i82 = i81 + ((i80 ^ i70) | i81);
            int i83 = ~absoluteGravity;
            int i84 = i71 | (i83 & 9);
            int i85 = absoluteGravity & 9;
            int i86 = -(-(((i85 ^ i84) | (i85 & i84)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
            int i87 = i82 & i86;
            int i88 = -(-((i86 ^ i82) | i87));
            int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
            int i90 = i83 & (-10);
            int i91 = (i83 | (-10)) & (~i90);
            int i92 = ~((i90 ^ i91) | (i90 & i91));
            int i93 = ~((currentTimeMillis3 ^ 9) | i73);
            int i94 = -(~(-(-((((~i92) & i93) | ((~i93) & i92) | (i92 & i93)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b(new int[]{676439657, -698404890, -1859804560, -1233311237, -1396376728, 34445324}, ((i89 ^ i94) + ((i94 & i89) << 1)) - 1, objArr7);
            androidx.biometric.BiometricPrompt.PromptInfo.Builder subtitle = title.setSubtitle((java.lang.CharSequence) cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE).invoke(context2, objArr5));
            android.content.Context context3 = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
            int i95 = com.payair.hce.R.string.biometric_prompt_description;
            int i96 = IccPrivateKeyCrtComponentsJson;
            int i97 = i96 & 105;
            int i98 = i96 | 105;
            int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
            getProfileVersion = i99 % 128;
            int i100 = i99 % 2;
            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i95)};
            int i101 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i102 = ((~i101) & 23) | (i101 & (-24));
            int i103 = -(-((i101 & 23) << 1));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b(new int[]{882257520, 528830887, 869358664, -243321125, -893960587, -560715187, -555353555, 1439753952, 966158985, -67559217, -238758527, 2122308091}, ((i102 | i103) << 1) - (i103 ^ i102), objArr9);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i104 = maxKeyCode * 141;
            int i105 = i104 & (-2511);
            int i106 = -(-(i104 | (-2511)));
            int i107 = (i105 & i106) + (i106 | i105);
            int i108 = currentTimeMillis4 ^ 9;
            int i109 = ~currentTimeMillis4;
            int i110 = currentTimeMillis4 & 9;
            int i111 = ((i108 ^ i110) | (i108 & i110)) * 140;
            int i112 = i107 & i111;
            int i113 = (i111 | i107) & (~i112);
            int i114 = i112 << 1;
            int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
            int i116 = ~maxKeyCode;
            int i117 = i116 & 9;
            int i118 = ~(((i116 | 9) & (~i117)) | i117);
            int i119 = ~((i109 & 9) | (i109 ^ 9));
            int i120 = ((i118 ^ i119) | (i118 & i119)) * (-280);
            int i121 = i115 ^ i120;
            int i122 = ((i115 & i120) | i121) << 1;
            int i123 = -i121;
            int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
            int i125 = ~((maxKeyCode ^ (-10)) | (maxKeyCode & (-10)));
            int i126 = i109 & (i109 | currentTimeMillis4);
            int i127 = i126 & maxKeyCode;
            int i128 = (maxKeyCode | i126) & (~i127);
            int i129 = ~((i128 ^ i127) | (i128 & i127));
            int i130 = i125 ^ i129;
            int i131 = i129 & i125;
            int i132 = (i131 ^ i130) | (i131 & i130);
            int i133 = (i116 ^ 9) | i117;
            int i134 = i133 & currentTimeMillis4;
            int i135 = (currentTimeMillis4 | i133) & (~i134);
            int i136 = ~((i135 ^ i134) | (i135 & i134));
            int i137 = -(-(((i132 ^ i136) | (i136 & i132)) * 140));
            int i138 = ((~i137) & i124) | ((~i124) & i137);
            int i139 = -(-((i137 & i124) << 1));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            b(new int[]{676439657, -698404890, -1859804560, -1233311237, -1396376728, 34445324}, (i138 & i139) + (i139 | i138), objArr10);
            androidx.biometric.BiometricPrompt.PromptInfo.Builder confirmationRequired = subtitle.setDescription((java.lang.CharSequence) cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE).invoke(context3, objArr8)).setConfirmationRequired(true);
            if (android.os.Build.VERSION.SDK_INT < 30) {
                int i140 = IccPrivateKeyCrtComponentsJson;
                int i141 = (i140 & (-10)) | ((~i140) & 9);
                int i142 = -(-((i140 & 9) << 1));
                getProfileVersion = ((i141 ^ i142) + ((i142 & i141) << 1)) % 128;
                confirmationRequired.setDeviceCredentialAllowed(true);
                int i143 = getProfileVersion;
                int i144 = ((((i143 ^ 119) | (i143 & 119)) << 1) - (~(-((i143 & (-120)) | ((~i143) & 119))))) - 1;
                IccPrivateKeyCrtComponentsJson = i144 % 128;
                if (i144 % 2 != 0) {
                    int i145 = 3 / 4;
                }
            } else {
                confirmationRequired.setAllowedAuthenticators(32783);
                int i146 = getProfileVersion;
                int i147 = i146 ^ 17;
                IccPrivateKeyCrtComponentsJson = ((((i146 & 17) | i147) << 1) - i147) % 128;
            }
            androidx.biometric.BiometricPrompt.PromptInfo build = confirmationRequired.build();
            int i148 = IccPrivateKeyCrtComponentsJson;
            int i149 = ((i148 & 64) + (i148 | 64)) - 1;
            getProfileVersion = i149 % 128;
            if (i149 % 2 != 0) {
                return build;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = DigitizedCardProfile;
        int i3 = 1;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 30 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = DigitizedCardProfile;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[i4] = java.lang.Integer.valueOf(iArr5[i6]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, android.view.KeyEvent.getDeadChar(i4, i4) + 29, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                }
                iArr6[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i6++;
                i3 = 1;
                i4 = 0;
            }
            i2 = i4;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr5, i2, iArr4, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            int i7 = 0;
            for (int i8 = 16; i7 < i8; i8 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr4[i7];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 5088 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i7++;
            }
            int i9 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i9;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i10 = istransitsupported.DigitizedCardProfile;
            int i11 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 49, 2923 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (3036 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                byte b = (byte) ($$b - 1);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(b, b, b, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (com.payair.hce.setOnApplyWindowInsetsListener) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 83;
        int i3 = (i2 - (~((i ^ 83) | i2))) - 1;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            setonapplywindowinsetslistener.AlternateContactlessPaymentDataJson.authenticate(setonapplywindowinsetslistener.writeReplace);
            int i4 = getProfileVersion;
            int i5 = i4 & 85;
            int i6 = (i4 | 85) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            IccPrivateKeyCrtComponentsJson = i8 % 128;
            if (i8 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        setonapplywindowinsetslistener.AlternateContactlessPaymentDataJson.authenticate(setonapplywindowinsetslistener.writeReplace);
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        DigitizedCardProfile = new int[]{-1487834, 366572756, -1185221927, 1937781975, -929004323, -57129989, 1849751517, -762080821, -1494718508, 1873808786, 999149667, -1812393255, -1550645261, -924802103, 1147704912, -24387976, 394750256, 1076201098};
    }

    public final void AlternateContactlessPaymentDataJson() {
        valueOf(new java.lang.Object[]{this}, 1097253822, -1097253822, java.lang.System.identityHashCode(this));
    }

    private static androidx.biometric.BiometricPrompt.PromptInfo writeReplace() {
        return (androidx.biometric.BiometricPrompt.PromptInfo) valueOf(new java.lang.Object[0], -967809944, 967809947, (int) java.lang.System.currentTimeMillis());
    }

    private androidx.biometric.BiometricPrompt writeReplace(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return (androidx.biometric.BiometricPrompt) valueOf(new java.lang.Object[]{this, fragmentActivity}, 2111539802, -2111539798, java.lang.System.identityHashCode(this));
    }

    final void values(androidx.fragment.app.FragmentActivity fragmentActivity) {
        valueOf(new java.lang.Object[]{this, fragmentActivity}, 1673882985, -1673882983, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{18, -1, 36, -56};
        $$b = 1;
    }

    final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 806546356, -806546355, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
