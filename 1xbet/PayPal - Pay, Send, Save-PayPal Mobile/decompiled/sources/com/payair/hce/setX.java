package com.payair.hce;

/* loaded from: classes10.dex */
public class setX {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static char getCiacDecline;
    private static int getCvrMaskAnd;
    private static char getGpoResponse;
    private static char getPaymentFci;
    private static char getProfileVersion;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "base64Signature")
    private java.lang.String AlternateContactlessPaymentDataJson;
    private long DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "keyType")
    private java.lang.String valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private java.lang.String values;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "timestamp")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) + (i2 * (-282)) + (((~(i2 | i4)) | (~(i4 | i3))) * (-283)) + ((~(i | i5)) * 283) + ((~(i4 | i5 | i3)) * 283);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 2) {
            return writeReplace(objArr);
        }
        if (i6 == 3) {
            return values(objArr);
        }
        if (i6 == 4) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 != 5) {
            return valueOf(objArr);
        }
        com.payair.hce.setX setx = (com.payair.hce.setX) objArr[0];
        int i7 = SdkCoreBusinessLogicModuleImpl;
        int i8 = i7 & 9;
        getCvrMaskAnd = (i8 + ((i7 ^ 9) | i8)) % 128;
        java.lang.String str = setx.writeReplace;
        getCvrMaskAnd = (i7 + 61) % 128;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 5;
        int i6 = (i2 * 2) + 1;
        byte[] bArr = $$g;
        int i7 = 115 - s;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7 += i5;
            i5 = i8;
            i3 = i4;
            int i9 = i5 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b = bArr[i9];
            i5 = i7;
            i7 = b;
            i8 = i9;
            i7 += i5;
            i5 = i8;
            i3 = i4;
            int i92 = i5 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            int i922 = i5 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 14;
        int i4 = (b * 19) + 4;
        int i5 = 118 - (i * 50);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[20 - i3];
        int i6 = 19 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            int i9 = 0;
            int i10 = i8 + (-i4) + 2;
            int i11 = i7 + 1;
            i2 = i9;
            i5 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i7 = i4;
            i4 = bArr[i4];
            i9 = i2 + 1;
            i8 = i12;
            int i102 = i8 + (-i4) + 2;
            int i112 = i7 + 1;
            i2 = i9;
            i5 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$d;
        int i3 = s + 68;
        int i4 = b + 4;
        int i5 = 40 - (s2 * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i3 = i5;
            i2 = 0;
            i3 += i6;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i3 += i6;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public setX(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.values = str;
        this.valueOf = str2;
        this.AlternateContactlessPaymentDataJson = str3;
        this.writeReplace = str4;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setX setx = (com.payair.hce.setX) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i & 15;
        int i3 = -(-((i ^ 15) | i2));
        int i4 = (i2 & i3) + (i2 | i3);
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        if (i4 % 2 == 0) {
            long j = setx.DigitizedCardProfile;
            throw null;
        }
        long j2 = setx.DigitizedCardProfile;
        int i5 = (i & 14) + (i | 14);
        SdkCoreBusinessLogicModuleImpl = ((~i5) + (i5 << 1)) % 128;
        return java.lang.Long.valueOf(j2);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setX setx = (com.payair.hce.setX) objArr[0];
        long longValue = ((java.lang.Number) objArr[1]).longValue();
        int i = SdkCoreBusinessLogicModuleImpl;
        getCvrMaskAnd = (i + 13) % 128;
        setx.DigitizedCardProfile = longValue;
        int i2 = i & 37;
        int i3 = -(-(i | 37));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getCvrMaskAnd = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setX setx = (com.payair.hce.setX) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 81;
        int i3 = -(-(i | 81));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        getCvrMaskAnd = i4 % 128;
        java.lang.String str = setx.values;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i & 19;
        int i6 = (i | 19) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        getCvrMaskAnd = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0915  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        android.content.Context context;
        java.lang.Integer num;
        int intValue;
        java.lang.String[] strArr;
        java.lang.Integer num2;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        int i;
        int i2;
        com.payair.hce.setX setx = (com.payair.hce.setX) objArr[0];
        int i3 = SdkCoreBusinessLogicModuleImpl;
        getCvrMaskAnd = ((i3 & 65) + (i3 | 65)) % 128;
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.os.Process.getGidForName(""), 429 - android.graphics.Color.alpha(0), (char) (31611 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
        byte[] bArr = $$a;
        byte b = bArr[6];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(b, b, (byte) (-bArr[20]), objArr4);
        long j = cls.getField((java.lang.String) objArr4[0]).getLong(null);
        try {
            if (j != -1) {
                int i4 = SdkCoreBusinessLogicModuleImpl;
                getCvrMaskAnd = ((i4 ^ 81) + ((i4 & 81) << 1)) % 128;
                int i5 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int identityHashCode = java.lang.System.identityHashCode(setx);
                int i6 = i5 * (-949);
                int i7 = (i6 ^ 949) + ((i6 & 949) << 1);
                int i8 = ~identityHashCode;
                int i9 = ~i8;
                int i10 = i9 & (i9 | i8);
                int i11 = ~i5;
                int i12 = i11 & i8;
                int i13 = i12 | ((~i11) & identityHashCode);
                int i14 = i11 & identityHashCode;
                int i15 = ~((i13 ^ i14) | (i13 & i14));
                int i16 = ((i10 ^ i15) | (i10 & i15)) * 1900;
                int i17 = ((i7 | i16) << 1) - (i7 ^ i16);
                int i18 = (i9 & i5) | i12;
                int i19 = i8 & i5;
                int i20 = ~((i18 ^ i19) | (i18 & i19));
                int i21 = (i8 & identityHashCode) | (i8 ^ identityHashCode);
                int i22 = ~i21;
                int i23 = (i21 | i22) & i22;
                int i24 = i20 & i23;
                int i25 = (i23 | i20) & (~i24);
                int i26 = ((i25 ^ i24) | (i25 & i24)) * (-950);
                int i27 = ((((~i26) & i17) | ((~i17) & i26)) - (~(-(-((i26 & i17) << 1))))) - 1;
                int i28 = (i8 | identityHashCode) & i8;
                int i29 = i28 | (~i28);
                int i30 = ~i29;
                int i31 = (i29 | i30) & i30;
                int i32 = i19 | i14;
                int i33 = i5 & identityHashCode;
                int i34 = ~((i32 ^ i33) | (i33 & i32));
                int i35 = ((i31 ^ i34) | (i31 & i34)) * 950;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                c("鈒‸嚶\uf310⮵\uf2be틜\u0a29뒼즧疠ᷘ跡Ⱬ룰\uef25瓘Έ‣壟蹾\ua4ca", "볡栋\uea3c찟", "\udd00ꇍ짇챂", ((((i35 & i27) | (i27 ^ i35)) << 1) - (~(-(((~i27) & i35) | ((~i35) & i27))))) - 1, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                int indexOf = android.text.TextUtils.indexOf("", "");
                int identityHashCode2 = java.lang.System.identityHashCode(setx);
                int i36 = indexOf * (-381);
                int i37 = ((i36 & (-2881)) | ((~i36) & 2880)) + ((i36 & 2880) << 1);
                int i38 = ~indexOf;
                int i39 = -(-(i38 * (-191)));
                int i40 = i37 ^ i39;
                int i41 = -(-((i37 & i39) << 1));
                int i42 = identityHashCode2 ^ 15;
                int i43 = identityHashCode2 & 15;
                int i44 = (i42 ^ i43) | (i42 & i43);
                int i45 = (i40 ^ i41) + ((i41 & i40) << 1);
                int i46 = ~i44;
                int i47 = (i45 - (~(-(~((indexOf | (i46 & (i44 | i46))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))))) - 2;
                int i48 = i38 & 15;
                int i49 = (i38 | 15) & (~i48);
                int i50 = (i48 ^ i49) | (i49 & i48);
                int i51 = ~i50;
                int i52 = (i50 | i51) & i51;
                int i53 = ~identityHashCode2;
                int i54 = i53 & 15;
                int i55 = (i53 | 15) & (~i54);
                int i56 = ~((i55 ^ i54) | (i55 & i54));
                int i57 = i52 & i56;
                int i58 = (((i52 | i56) & (~i57)) | i57) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                d("걝批\uee42ḓ퉈睞ꕛ鲖啕坎\ue40e훷薙畚ִ\u202a", ((i47 | i58) << 1) - (i58 ^ i47), objArr6);
                if (j + 1928 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr6[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                    int i59 = SdkCoreBusinessLogicModuleImpl;
                    int i60 = (i59 & (-112)) | ((~i59) & 111);
                    int i61 = -(-((i59 & 111) << 1));
                    getCvrMaskAnd = ((i60 & i61) + (i61 | i60)) % 128;
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.getSize(0), 428 - android.os.Process.getGidForName(""), (char) (31609 - android.view.MotionEvent.axisFromString("")));
                    byte b2 = (byte) (-bArr[20]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b2, b2, bArr[6], objArr7);
                    try {
                        java.lang.Object[] objArr8 = {cls3.getField((java.lang.String) objArr7[0]).get(null), -2061931577, 0};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 4618 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj);
                        }
                        objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                        int i62 = SdkCoreBusinessLogicModuleImpl;
                        int i63 = i62 & 59;
                        int i64 = (i62 | 59) & (~i63);
                        int i65 = -(-(i63 << 1));
                        getCvrMaskAnd = ((i64 ^ i65) + ((i64 & i65) << 1)) % 128;
                        num2 = 0;
                        num = -854902220;
                        objArr2 = objArr3;
                        i = ((int[]) objArr2[1])[0];
                        i2 = ((int[]) objArr2[0])[0];
                        if (i2 == i) {
                            SdkCoreBusinessLogicModuleImpl = ((-2) - (~(getCvrMaskAnd + 126))) % 128;
                            java.lang.Object[] objArr9 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[0]), num2};
                            java.lang.Integer num3 = num;
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34, android.view.View.MeasureSpec.getSize(0) + 4618, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj2);
                            }
                            ((java.lang.reflect.Method) obj2).invoke(null, objArr9);
                            getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 1) % 128;
                        } else {
                            java.lang.Integer num4 = num;
                            int i66 = (~i2) & i;
                            int i67 = (~i) & i2;
                            long j2 = (i66 ^ i67) | (i67 & i66);
                            int i68 = getCvrMaskAnd;
                            SdkCoreBusinessLogicModuleImpl = (((i68 | 53) << 1) - ((i68 & (-54)) | ((~i68) & 53))) % 128;
                            int i69 = i68 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                            SdkCoreBusinessLogicModuleImpl = (((((i68 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i69) << 1) - (~(-((i68 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i69))))) - 1) % 128;
                            try {
                                java.lang.Object[] objArr10 = {java.lang.Long.valueOf(j2 ^ (-8496837881619283968L)), -1978324297L};
                                byte[] bArr2 = $$d;
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                e((byte) (bArr2[22] + 1), (byte) (bArr2[81] + 1), bArr2[20], objArr11);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                byte b3 = bArr2[20];
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                e(b3, (byte) (b3 | 77), bArr2[63], objArr12);
                                cls4.getMethod((java.lang.String) objArr12[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr10);
                                java.lang.Object[] objArr13 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[0]), num2};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 33, 4618 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr13);
                                int i70 = getCvrMaskAnd;
                                int i71 = i70 & 33;
                                int i72 = (i70 ^ 33) | i71;
                                SdkCoreBusinessLogicModuleImpl = (((i71 | i72) << 1) - (i72 ^ i71)) % 128;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        java.lang.String str = setx.valueOf;
                        int i73 = SdkCoreBusinessLogicModuleImpl;
                        int i74 = i73 & 99;
                        int i75 = -(-((i73 ^ 99) | i74));
                        getCvrMaskAnd = ((i74 & i75) + (i75 | i74)) % 128;
                        return str;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            java.lang.Object[] objArr14 = {context, strArr, java.lang.Integer.valueOf(intValue), 0, -2061931577};
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            e((byte) ($$d[22] + 1), r4[20], r4[19], objArr15);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr15[0]);
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            e(r4[18], com.google.common.base.Ascii.ESC, r4[80], objArr16);
            java.lang.String str2 = (java.lang.String) objArr16[0];
            int i76 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int identityHashCode3 = java.lang.System.identityHashCode(setx);
            int i77 = i76 * 193;
            int i78 = ((45162 ^ i77) | (45162 & i77)) << 1;
            int i79 = -((i77 & (-45163)) | ((~i77) & 45162));
            int i80 = (i78 & i79) + (i79 | i78);
            int i81 = ~identityHashCode3;
            int i82 = ~i76;
            int i83 = i82 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
            int i84 = (~i83) & (i82 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
            int i85 = (i83 & i84) | (i84 ^ i83);
            int i86 = ~i85;
            int i87 = (i85 | i86) & i86;
            int i88 = i81 ^ i87;
            int i89 = i87 & i81;
            int i90 = -(-(((i89 ^ i88) | (i89 & i88)) * (-192)));
            int i91 = i80 & i90;
            int i92 = ((i80 ^ i90) | i91) << 1;
            int i93 = -((i80 | i90) & (~i91));
            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
            int i95 = (i82 | i76) & i82;
            int i96 = (i95 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | ((~i95) & (-235));
            int i97 = i95 & (-235);
            int i98 = (i97 & i96) | (i96 ^ i97);
            int i99 = ~i98;
            int i100 = (i98 | i99) & i99;
            int i101 = i81 & (-235);
            num2 = 0;
            int i102 = (i81 | (-235)) & (~i101);
            int i103 = ~((i102 ^ i101) | (i102 & i101));
            int i104 = i100 & i103;
            int i105 = (i103 | i100) & (~i104);
            int i106 = -(-(((i105 ^ i104) | (i105 & i104)) * (-384)));
            int i107 = (i94 ^ i106) + ((i106 & i94) << 1);
            int i108 = (i82 ^ (-235)) | (i82 & (-235));
            int i109 = ~((i108 ^ identityHashCode3) | (i108 & identityHashCode3));
            int i110 = ((~i81) & (-235)) | (i81 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | i101;
            int i111 = i110 ^ i76;
            int i112 = i110 & i76;
            int i113 = ~((i112 ^ i111) | (i112 & i111));
            int i114 = i109 ^ i113;
            int i115 = i109 & i113;
            int i116 = (i115 ^ i114) | (i115 & i114);
            int i117 = i76 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
            int i118 = (i76 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) & (~i117);
            int i119 = (i118 ^ i117) | (i118 & i117);
            int i120 = (i81 & i119) | ((~i119) & identityHashCode3);
            int i121 = i119 & identityHashCode3;
            int i122 = ~((i121 ^ i120) | (i121 & i120));
            int i123 = i116 & i122;
            int i124 = (i116 | i122) & (~i123);
            int i125 = -(-(((i124 ^ i123) | (i124 & i123)) * 192));
            int resolveSize = android.view.View.resolveSize(0, 0);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            f((i107 ^ i125) + ((i125 & i107) << 1), ((resolveSize | 23) << 1) - (resolveSize ^ 23), "\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde", false, android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, objArr17);
            objArr2 = (java.lang.Object[]) cls5.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr17[0]), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr14);
            int i126 = ((int[]) objArr2[1])[0];
            int i127 = ((int[]) objArr2[0])[0];
            if (context == null) {
                objArr3 = objArr2;
                objArr2 = objArr3;
                i = ((int[]) objArr2[1])[0];
                i2 = ((int[]) objArr2[0])[0];
                if (i2 == i) {
                }
                java.lang.String str3 = setx.valueOf;
                int i732 = SdkCoreBusinessLogicModuleImpl;
                int i742 = i732 & 99;
                int i752 = -(-((i732 ^ 99) | i742));
                getCvrMaskAnd = ((i742 & i752) + (i752 | i742)) % 128;
                return str3;
            }
            int i128 = getCvrMaskAnd;
            int i129 = i128 & 25;
            int i130 = -(-((i128 ^ 25) | i129));
            SdkCoreBusinessLogicModuleImpl = (((i129 | i130) << 1) - (i130 ^ i129)) % 128;
            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 429, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31610));
            byte b4 = (byte) (-bArr[20]);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            b(b4, b4, bArr[6], objArr18);
            cls6.getField((java.lang.String) objArr18[0]).set(null, objArr2);
            try {
                try {
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    c("鈒‸嚶\uf310⮵\uf2be틜\u0a29뒼즧疠ᷘ跡Ⱬ룰\uef25瓘Έ‣壟蹾\ua4ca", "볡栋\uea3c찟", "\udd00ꇍ짇챂", android.text.TextUtils.getOffsetAfter("", 0), (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr19);
                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                    int i131 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int identityHashCode4 = java.lang.System.identityHashCode(setx);
                    int i132 = -(-(i131 * (-963)));
                    int i133 = i132 ^ (-964);
                    int i134 = (((i132 & (-964)) | i133) << 1) - i133;
                    int i135 = ~i131;
                    int i136 = i135 & (i135 | i131);
                    int i137 = identityHashCode4 & (-15);
                    int i138 = (identityHashCode4 | (-15)) & (~i137);
                    int i139 = ~((i137 ^ i138) | (i138 & i137));
                    int i140 = i136 ^ i139;
                    int i141 = i136 & i139;
                    int i142 = (((i134 & 13510) + (i134 | 13510)) - (~(((i141 & i140) | (i141 ^ i140)) * (-964)))) - 1;
                    int i143 = ~identityHashCode4;
                    int i144 = (i143 ^ (-15)) | (i143 & (-15));
                    int i145 = ~((i131 ^ (-15)) | (i131 & (-15)));
                    int i146 = ~i144;
                    int i147 = (i145 | ((i144 | i146) & i146)) * (-964);
                    int i148 = i142 & i147;
                    int i149 = -(-((i147 ^ i142) | i148));
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    d("걝批\uee42ḓ퉈睞ꕛ鲖啕坎\ue40e훷薙畚ִ\u202a", ((i148 | i149) << 1) - (i149 ^ i148), objArr20);
                    long longValue = ((java.lang.Long) cls7.getDeclaredMethod((java.lang.String) objArr20[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, 429 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (31610 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                    byte b5 = bArr[6];
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    b(b5, b5, (byte) (-bArr[20]), objArr21);
                    cls8.getField((java.lang.String) objArr21[0]).set(null, java.lang.Long.valueOf(longValue));
                    int i150 = getCvrMaskAnd;
                    int i151 = i150 ^ 67;
                    int i152 = ((i150 & 67) | i151) << 1;
                    int i153 = -i151;
                    SdkCoreBusinessLogicModuleImpl = (((i152 | i153) << 1) - (i152 ^ i153)) % 128;
                    i = ((int[]) objArr2[1])[0];
                    i2 = ((int[]) objArr2[0])[0];
                    if (i2 == i) {
                    }
                    java.lang.String str32 = setx.valueOf;
                    int i7322 = SdkCoreBusinessLogicModuleImpl;
                    int i7422 = i7322 & 99;
                    int i7522 = -(-((i7322 ^ 99) | i7422));
                    getCvrMaskAnd = ((i7422 & i7522) + (i7522 | i7422)) % 128;
                    return str32;
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (java.lang.Exception unused) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
        int i154 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        int i155 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        char c = (char) ((((i155 ^ 11668) | (i155 & 11668)) << 1) - (((~i155) & 11668) | (i155 & (-11669))));
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        c("\uf6d5䃅\ud6882㷛❁혝ൽ⳺ᢉ䴩屢⅒㙜屍勋\uf43a桢ྤ带\uf73e䊢⻱芃眱欢", "볡栋\uea3c찟", "ⴶ网鏤㔭", (i154 - (~((~i154) | i154))) - 1, c, objArr22);
        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr22[0]);
        int i156 = -android.view.View.resolveSizeAndState(0, 0, 0);
        int identityHashCode5 = java.lang.System.identityHashCode(setx);
        int i157 = i156 * 1773;
        int i158 = ((i157 & 15929) | ((~i157) & (-15930))) + ((i157 & (-15930)) << 1);
        int i159 = ~i156;
        int i160 = i159 & (-19);
        int i161 = (~i160) & (i159 | (-19));
        int i162 = ~((i160 ^ i161) | (i160 & i161));
        int i163 = ~((identityHashCode5 & (-19)) | (identityHashCode5 ^ (-19)));
        int i164 = (i162 ^ i163) | (i162 & i163);
        int i165 = ~identityHashCode5;
        int i166 = (identityHashCode5 | i165) & i165;
        int i167 = i166 ^ i156;
        int i168 = i166 & i156;
        int i169 = (i168 ^ i167) | (i168 & i167);
        int i170 = (i169 & (-19)) | ((~i169) & 18);
        int i171 = i169 & 18;
        int i172 = (i171 ^ i170) | (i171 & i170);
        int i173 = ~i172;
        int i174 = (i172 | i173) & i173;
        int i175 = i164 & i174;
        int i176 = (i174 | i164) & (~i175);
        int i177 = -(~(((i176 ^ i175) | (i176 & i175)) * 886));
        int i178 = ((i158 ^ i177) + ((i177 & i158) << 1)) - 1;
        int i179 = i165 ^ 18;
        int i180 = i165 & 18;
        int i181 = ~((i179 ^ i180) | (i179 & i180));
        int i182 = -(-((((~i181) & i156) | (i159 & i181) | (i181 & i156)) * (-1772)));
        int i183 = i178 & i182;
        int i184 = i183 + ((i182 ^ i178) | i183);
        int i185 = i165 & i156;
        int i186 = -(-((~(((i156 | i165) & (~i185)) | i185)) * 886));
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        d("གྷ롹섞\ueb92䄠礌\ue202舜織℟㯁Ꜿ쏽ⱹ֪䯹댉짽", (((~i186) & i184) | ((~i184) & i186)) + ((i186 & i184) << 1), objArr23);
        context = (android.content.Context) cls9.getMethod((java.lang.String) objArr23[0], new java.lang.Class[0]).invoke(null, null);
        if (context != null) {
            int i187 = SdkCoreBusinessLogicModuleImpl;
            getCvrMaskAnd = (((((i187 ^ 111) | (i187 & 111)) << 1) - (~(-((i187 & (-112)) | ((~i187) & 111))))) - 1) % 128;
            context = context.getApplicationContext();
            int i188 = getCvrMaskAnd;
            int i189 = i188 & 115;
            int i190 = (i188 | 115) & (~i189);
            int i191 = -(-(i189 << 1));
            int i192 = (i190 & i191) + (i190 | i191);
            SdkCoreBusinessLogicModuleImpl = i192 % 128;
            int i193 = i192 % 2;
        }
        int i194 = -android.os.Process.getGidForName("");
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        d("뽵㦷∹\ue410婱펚픠쁳羸փ劖ꙋ㹪阥냾", ((i194 ^ 15) - (~((i194 & 15) << 1))) - 1, objArr24);
        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr24[0]);
        int i195 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        int i196 = i195 & 1;
        int i197 = (i195 | 1) & (~i196);
        int i198 = -(-(i196 << 1));
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
        int identityHashCode6 = java.lang.System.identityHashCode(setx);
        int i199 = windowTouchSlop * 1773;
        int i200 = (-39494895) & i199;
        int i201 = -(((-39494895) | i199) & (~i200));
        int i202 = ~windowTouchSlop;
        int i203 = i202 & (i202 | windowTouchSlop);
        int i204 = ~((i203 & (-44628)) | (i203 ^ (-44628)));
        num = -854902220;
        int i205 = ~((identityHashCode6 ^ (-44628)) | (identityHashCode6 & (-44628)));
        int i206 = i204 & i205;
        int i207 = (i205 | i204) & (~i206);
        int i208 = (i207 ^ i206) | (i207 & i206);
        int i209 = ~identityHashCode6;
        int i210 = (identityHashCode6 | i209) & i209;
        int i211 = ((~i210) & windowTouchSlop) | (i210 & i202);
        int i212 = i210 & windowTouchSlop;
        int i213 = ~((i211 & i212) | (i212 ^ i211) | 44627);
        int i214 = i208 & i213;
        int i215 = (((((i199 ^ (-39494895)) | i200) << 1) - (~i201)) - 1) + ((((i208 | i213) & (~i214)) | i214) * 886);
        int i216 = (i209 & (-44628)) | ((~i209) & 44627);
        int i217 = 44627 & i209;
        int i218 = (i216 ^ i217) | (i216 & i217);
        int i219 = ~i218;
        int i220 = (i218 | i219) & i219;
        int i221 = ((~i220) & windowTouchSlop) | (i220 & i202);
        int i222 = i220 & windowTouchSlop;
        int i223 = -(-(((i222 ^ i221) | (i222 & i221)) * (-1772)));
        int i224 = i215 & i223;
        int i225 = (i224 - (~((i223 ^ i215) | i224))) - 1;
        int i226 = i209 & windowTouchSlop;
        int i227 = (i209 | windowTouchSlop) & (~i226);
        int i228 = (i226 ^ i227) | (i226 & i227);
        int i229 = ~i228;
        int i230 = ((i228 | i229) & i229) * 886;
        int i231 = i225 & i230;
        char c2 = (char) (i231 + ((i230 ^ i225) | i231));
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        c("뀿\u1c89\ue93aퟑ讼캃ㆰ볎ᓊ\uec47铜讻崂㑽삛켇", "볡栋\uea3c찟", "䬢쇒協㒮", (i197 ^ i198) + ((i198 & i197) << 1), c2, objArr25);
        intValue = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr25[0], java.lang.Object.class).invoke(null, setx)).intValue();
        int threadPriority = (android.os.Process.getThreadPriority(0) + 20) >> 6;
        int i232 = threadPriority | 64;
        int i233 = i232 << 1;
        int i234 = -(i232 & (~(threadPriority & 64)));
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        d("襪犵ጤ颖\udf32㽊笴䗃ઝ縦謜깾\u243eኻ흒꜒䑇粇忸鶏\uec64무흒꜒笴䗃\uf283痉\uddd6䕜卸혛❜㨃又졆ⅿ\ue92a䛇嶝\udc01\ud906ꊍG࢛썖촺檭㗓鿗襪犵䃆藍森嶫㪷\uef75\udc01\ud906톽的\udb0d鶽", (i233 ^ i234) + ((i234 & i233) << 1), objArr26);
        java.lang.String str4 = (java.lang.String) objArr26[0];
        int i235 = -(-android.os.Process.getGidForName(""));
        int i236 = i235 & 1;
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        c("靻䄆\ueeee榃㮜鍾γ㔟蹢綜䜅\u2d6c\ud963\udbe9ས\uee12\ueef4噰踕䫐\uf624巽\udeefៅ䱷᭙\uef82鐋匞횽䝴\uf7f8㲝菂鋤ጝ픞浚Ḍᘼ漝\u0bc4朡憱协䱿メ▶櫤\ueefc玏浏吉濹麩\udfc6⽙搲ɝ䚝\uf660\ude02Ⲭ\udf57", "볡栋\uea3c찟", "Ϙꯠ㝄玵", ((i235 | 1) & (~i236)) + (i236 << 1), (char) android.text.TextUtils.getTrimmedLength(""), objArr27);
        java.lang.String str5 = (java.lang.String) objArr27[0];
        int alpha = android.graphics.Color.alpha(0);
        int i237 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i238 = i237 ^ 1;
        int i239 = (i237 & 1) << 1;
        char c3 = (char) ((i238 & i239) + (i239 | i238));
        java.lang.Object[] objArr28 = new java.lang.Object[1];
        c("◽큳ã숑\uef3e\ue25e胸᠃쪨䓘\uecc5१\ue7b4舤\ue5e5䜻˵境홣퓴\uea77袏玡姎ꡬꇣ翥柧ￓ￫်嘊凂ߛଉ쉶ڸ픛\ue24b搈\uf726괾穸쏂䋔螀䧛礝篛↳\ue2d0䁾䣽髃墻䒆黻擓⋪檸魎쒏䩡髸", "볡栋\uea3c찟", "㴛困줗礀", alpha, c3, objArr28);
        java.lang.String str6 = (java.lang.String) objArr28[0];
        int rgb = android.graphics.Color.rgb(0, 0, 0);
        int identityHashCode7 = java.lang.System.identityHashCode(setx);
        int i240 = (rgb * (-380)) + 2113929216;
        int i241 = identityHashCode7 & 16777216;
        int i242 = (~i241) & (identityHashCode7 | 16777216);
        int i243 = (i241 ^ i242) | (i241 & i242);
        int i244 = ~rgb;
        int i245 = (i244 | rgb) & i244;
        int i246 = i243 & i245;
        int i247 = (~i246) & (i243 | i245);
        int i248 = -(-(((i247 ^ i246) | (i246 & i247)) * (-381)));
        int i249 = ((~i248) & i240) | ((~i240) & i248);
        int i250 = (i240 & i248) << 1;
        int i251 = (i249 ^ i250) + ((i250 & i249) << 1);
        int i252 = (-16777217) ^ i244;
        int i253 = (-16777217) & i244;
        int i254 = (i252 ^ i253) | (i253 & i252);
        int i255 = ~i254;
        int i256 = (i254 | i255) & i255;
        int i257 = ~identityHashCode7;
        int i258 = i257 & 16777216;
        int i259 = (i257 | 16777216) & (~i258);
        int i260 = (i259 ^ i258) | (i259 & i258);
        int i261 = ~i260;
        int i262 = (i260 | i261) & i261;
        int i263 = i256 & i262;
        int i264 = ((i262 | i256) & (~i263)) | i263;
        int i265 = rgb & 16777216;
        int i266 = (rgb | 16777216) & (~i265);
        int i267 = ~((i266 ^ i265) | (i265 & i266));
        int i268 = -(-(((i264 ^ i267) | (i264 & i267)) * 381));
        int i269 = (i251 & i268) + (i268 | i251);
        int i270 = (16777216 & i244) | (i244 ^ 16777216);
        int i271 = ~i270;
        int i272 = ((i270 | i271) & i271) * 381;
        int i273 = i269 & i272;
        int i274 = -(-((i272 ^ i269) | i273));
        int i275 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int i276 = ~i275;
        int i277 = i275 << 1;
        char c4 = (char) (((i276 | i277) << 1) - (i277 ^ i276));
        java.lang.Object[] objArr29 = new java.lang.Object[1];
        c("錊⺜ꁰ鏳噌쉮霉豖ㆷ㛋\ue1bc琋\udf32ﳁ펌\uda74䍷ռ௱葽焃⥈\ue498놡鉼漈ൟ\u192d관缑浂嫋업㻭\ude0b숟\uf8e3ᄽ穜봏\u1b4dȜ웊䘷髣ம\ud823泭꺰놆▌ᾞ漞䴁죍\ueb3a㈅䫭얛ꞟ눱湲裍\ue662", "볡栋\uea3c찟", "証쀽栾粦", (i273 & i274) + (i274 | i273), c4, objArr29);
        strArr = new java.lang.String[]{str4, str5, str6, (java.lang.String) objArr29[0]};
        int i278 = getCvrMaskAnd;
        int i279 = i278 ^ 51;
        int i280 = ((i278 & 51) | i279) << 1;
        int i281 = -i279;
        SdkCoreBusinessLogicModuleImpl = ((i280 & i281) + (i280 | i281)) % 128;
    }

    private static void d(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 21) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char c = 2;
        char[] cArr2 = new char[2];
        $10 = ($11 + 57) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                $10 = ($11 + 65) % 128;
                char c2 = cArr2[1];
                char c3 = cArr2[0];
                char c4 = (char) (getCiacDecline ^ 2144259807102049818L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(getPaymentFci);
                    objArr2[c] = java.lang.Integer.valueOf(c3 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf(((c3 << 4) + c4) ^ (c3 + i2));
                    objArr2[0] = java.lang.Integer.valueOf(c2);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1335 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte[] bArr = $$g;
                        byte length = (byte) bArr.length;
                        byte b = bArr[0];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(length, (byte) (b - 1), b, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getGpoResponse)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 63, android.view.KeyEvent.getDeadChar(0, 0) + 1335, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                        byte[] bArr2 = $$g;
                        byte length2 = (byte) bArr2.length;
                        byte b2 = bArr2[0];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(length2, (byte) (b2 - 1), b2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                    i3++;
                    c = 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 53, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3543, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            c = 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            int i2 = $10 + 27;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 87) % 128;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = charArray.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        java.lang.System.arraycopy(cArr3, 0, cArr4, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 125) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.text.TextUtils.indexOf("", "", i3), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1179, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)));
                    byte b = $$g[i3];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((short) 13, (byte) (b - 1), b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[i3];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i3] = java.lang.Object.class;
                    obj = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.graphics.ImageFormat.getBitsPerPixel(i3) + 3444, (char) ((android.os.Process.myPid() >> 22) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[i3] = java.lang.Object.class;
                    obj2 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                char c3 = cArr4[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr5[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[i3] = getwalletdata;
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", i3) + 1864, (char) (41775 - android.view.View.MeasureSpec.makeMeasureSpec(i3, i3)));
                    byte[] bArr = $$g;
                    byte b2 = bArr[4];
                    byte b3 = bArr[i3];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(b2, (byte) (b3 - 1), b3, objArr6);
                    obj3 = cls3.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr4[intValue2] * 32718), java.lang.Integer.valueOf(cArr5[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 28, 3132 - android.view.MotionEvent.axisFromString(""), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                    byte[] bArr2 = $$g;
                    byte b4 = (byte) (bArr2[4] - 1);
                    byte b5 = bArr2[0];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(b4, (byte) (b5 - 1), b5, objArr8);
                    c2 = 2;
                    obj4 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr5[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr4[intValue2] = getwalletdata.values;
                cArr6[getwalletdata.writeReplace] = (char) ((((int) (RecordsJson ^ 1263759066225628708L)) ^ ((cArr4[intValue2] ^ r4[getwalletdata.writeReplace]) ^ (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L))) ^ ((char) (getProfileVersion ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr4 = cArr4;
                i3 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    private static void f(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.os.Process.myPid() >> 22), 2073 - (android.os.Process.myTid() >> 22), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 60037));
                    byte b = $$g[0];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, (byte) (b - 1), b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, 3544 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            $10 = ($11 + 59) % 128;
        }
        if (z) {
            $10 = ($11 + 5) % 128;
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.combineMeasuredStates(0, 0) + 3543, (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            $10 = ($11 + 99) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setX setx = (com.payair.hce.setX) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = ((i & 46) + (i | 46)) - 1;
        getCvrMaskAnd = i2 % 128;
        java.lang.String str = setx.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignData{signId=");
        sb.append(this.DigitizedCardProfile);
        sb.append(", data='");
        sb.append(this.values);
        sb.append("', timestamp=");
        sb.append(this.writeReplace);
        sb.append(", keyType='");
        sb.append(this.valueOf);
        sb.append("', base64Signature='");
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = getCvrMaskAnd;
        int i2 = ((i | 5) << 1) - (i ^ 5);
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    static void SdkCoreAlternateContactlessPaymentDataImpl() {
        SdkCoreAlternateContactlessPaymentDataImpl = -2479746094502417723L;
        RecordsJson = -804334044;
        getProfileVersion = (char) 54820;
        getAid = (char) 9518;
        getGpoResponse = (char) 8608;
        getCiacDecline = (char) 61924;
        getPaymentFci = (char) 6983;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getCvrMaskAnd = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        SdkCoreAlternateContactlessPaymentDataImpl();
        IccPrivateKeyCrtComponentsJson = 1889207268;
        int i = getCvrMaskAnd + 35;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1301129804, 1301129809, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1339334850, -1339334848, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -2035211089, 2035211092, java.lang.System.identityHashCode(this));
    }

    static void init$2() {
        $$g = new byte[]{0, Byte.MIN_VALUE, -48, 115, 10};
        $$h = 104;
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -27764403, 27764407, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{94, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.CAN, 122, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 3, 0, -33, com.google.common.base.Ascii.RS, 17, -14, -35, 45, -10, -17, 34, -10, -5, -9, com.google.common.base.Ascii.VT, -15, -19, 19, com.google.common.base.Ascii.VT, -4, -11, 2, 2, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, -32, com.google.common.base.Ascii.RS, -17, 13, 5, -18, 2, 17, -11, 6, -1, -43, 47, -13, -1, 1, 9, 6, -11, -8, com.google.common.base.Ascii.VT, 7, 37, -2, 2, com.google.common.base.Ascii.VT, -11, 17, -21, -1, -33, com.google.common.base.Ascii.RS, 17, -14, -20, 34, -3, -9, 3, 3, -7};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    public final void writeReplace(long j) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Long.valueOf(j)}, -355328371, 355328371, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{75, -78, -116, -102, -35, 4, 0, -9, 13, -15, com.google.common.base.Ascii.ETB, 3, 35, -28, -15, 16, com.google.common.base.Ascii.SYN, -32, 5, com.google.common.base.Ascii.VT, -1, -1, 9, com.google.common.base.Ascii.ETB, -9, -7, 18, -12};
        $$b = 231;
    }

    public final long DigitizedCardProfile() {
        return ((java.lang.Long) DigitizedCardProfile(new java.lang.Object[]{this}, -917622246, 917622247, java.lang.System.identityHashCode(this))).longValue();
    }
}
