package com.payair.hce;

/* loaded from: classes10.dex */
public class setContactlessMdSessionKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static int getProfileVersion;
    private static long values;
    private static char[] writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessPaymentData")
    public com.payair.hce.getContactlessMdSessionKey AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "remotePaymentData")
    public com.payair.hce.getContactlessUmdSingleUseKey DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardRiskManagementData")
    public com.payair.hce.setTransactionCredentials valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 38 - (i * 34);
        int i5 = (s * 653) + 65;
        int i6 = i2 * 34;
        char[] cArr = new char[35 - i6];
        int i7 = 34 - i6;
        if (bArr == null) {
            int i8 = i5;
            i3 = 0;
            i5 = i7;
            i5 = (i5 + (-i8)) - 2;
            i4++;
            cArr[i3] = (char) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i8 = bArr[i4];
            i3++;
            i5 = (i5 + (-i8)) - 2;
            i4++;
            cArr[i3] = (char) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i5;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = b + 112;
        int i5 = i * 4;
        int i6 = i2 + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 = (-i4) + i6;
            i6 = i7;
            i3 = i8;
            int i9 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            i6 = i4;
            i4 = b2;
            i8 = i3 + 1;
            i7 = i9;
            i4 = (-i4) + i6;
            i6 = i7;
            i3 = i8;
            int i92 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i922 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = 2;
        if (str != null) {
            int i3 = $10 + 81;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            if (i4 % i2 == 0) {
                int i5 = getdsrpdata.valueOf;
                char c = cArr2[getdsrpdata.valueOf];
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[3];
                    objArr2[i2] = getdsrpdata;
                    objArr2[1] = getdsrpdata;
                    objArr2[0] = java.lang.Integer.valueOf(c);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1891 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (3600 - android.graphics.Color.red(0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 1, 0, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() / (values % (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 64, 1442 - android.view.MotionEvent.axisFromString(""), (char) (29682 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((byte) 0, 0, -1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 31, android.view.MotionEvent.axisFromString("") + 1891, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3600));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d((byte) 1, 0, -1, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 1443, (char) (29682 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    d((byte) 0, 0, -1, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            $10 = ($11 + 59) % 128;
            i2 = 2;
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj5 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 64, android.view.KeyEvent.getDeadChar(0, 0) + 1443, (char) (29683 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                d((byte) 0, 0, -1, objArr11);
                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void c(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i2 = ($11 + 79) % 128;
        $10 = i2;
        int i3 = 2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i4 = i2 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 91) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = writeReplace;
        float f = 0.0f;
        int i5 = 1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 77;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i5];
                        objArr2[0] = java.lang.Integer.valueOf(cArr3[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)), android.text.TextUtils.getTrimmedLength("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[i6])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46, (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                }
                i6++;
                $10 = ($11 + 9) % 128;
                i3 = 2;
                f = 0.0f;
                i5 = 1;
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getProfileVersion)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 91) % 128;
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1629 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((byte) 6, 0, -1, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!getAid) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
                $11 = ($10 + 93) % 128;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj5 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 44, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1628, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                d((byte) 6, 0, -1, objArr8);
                obj5 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        values = -2818841361970156995L;
        writeReplace = new char[]{10759, 10757, 10770, 10814, 10753, 10755, 10779, 10812, 10781, 10780, 10754, 10768, 10783, 10777, 10844, 10782, 10813, 10809, 10756, 10803, 10790, 10785, 10845, 10832, 10837, 10836, 10776, 10772, 10771, 10773, 10985, 10786, 10784};
        getProfileVersion = -143185298;
        getAid = true;
        IccPrivateKeyCrtComponentsJson = true;
    }

    static void init$1() {
        $$d = new byte[]{75, -78, -116, -102};
        $$e = 136;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0a4f, code lost:
    
        com.payair.hce.setContactlessMdSessionKey.RecordsJson = (com.payair.hce.setContactlessMdSessionKey.SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0a58, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r7;
        ((int[]) r0[1])[0] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0a6f, code lost:
    
        r2 = ~r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0a71, code lost:
    
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r36), r13, java.lang.Integer.valueOf(((((((~((-275304823) | r2)) | 2117890) | (~((-1621187339) | r2))) * (-1136)) + 1067247744) + ((((~((-275304823) | r7)) | (~((-1621187339) | r7))) | (~(1894374270 | r2))) * (-568))) + ((((~(r2 | 275304822)) | (~(1621187338 | r2))) | (~((-2117891) | r7))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
        r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0ac7, code lost:
    
        if (r2 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0ac9, code lost:
    
        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, 2712 - android.text.TextUtils.lastIndexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
        r3 = (byte) (-com.payair.hce.setContactlessMdSessionKey.$$a[14]);
        r6 = (byte) (r3 - 1);
        r11 = new java.lang.Object[1];
        a(r3, r6, r6, r11);
        r2 = r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0b24, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0b2b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0b2c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0b2d, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0b31, code lost:
    
        if (r2 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0b33, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b34, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x08c4, code lost:
    
        if (r4.capacity() == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0b69, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r7;
        ((int[]) r0[1])[0] = r7 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0b83, code lost:
    
        r2 = ~r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0b85, code lost:
    
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r36), r23, java.lang.Integer.valueOf((((((~(r2 | (-1077295907))) | 819196254) * (-90)) + 1339293440) + (((~(r7 | (-1077295907))) | (-1895299967)) * (-45))) + (((~(r2 | 819196254)) | ((-1077295907) | (~((-819196255) | r7)))) * 45))};
        r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0bc7, code lost:
    
        if (r2 != null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0bc9, code lost:
    
        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.graphics.Color.blue(0));
        r3 = (byte) (-com.payair.hce.setContactlessMdSessionKey.$$a[14]);
        r6 = (byte) (r3 - 1);
        r11 = new java.lang.Object[1];
        a(r3, r6, r6, r11);
        r2 = r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0c22, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0c29, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0c2a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0c2b, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0c2f, code lost:
    
        if (r2 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0c31, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0c32, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0ca7 A[Catch: all -> 0x00d0, TryCatch #11 {all -> 0x00d0, blocks: (B:5:0x0038, B:7:0x007a, B:8:0x00bc, B:15:0x00f2, B:17:0x0132, B:18:0x0173, B:33:0x01fd, B:35:0x0229, B:36:0x0273, B:123:0x0c6b, B:125:0x0ca7, B:126:0x0cf2), top: B:2:0x001f }] */
    /* JADX WARN: Type inference failed for: r3v41, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v83, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v85, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v108, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v125, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v145, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [long] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v8, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.lang.reflect.Method] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        ?? r7;
        ?? r8;
        java.lang.Object obj;
        java.nio.LongBuffer[] longBufferArr;
        java.nio.LongBuffer longBuffer;
        boolean z;
        java.lang.String intern;
        boolean z2;
        java.lang.Integer num;
        java.lang.String str;
        int i4;
        java.lang.String[] strArr2 = strArr;
        java.lang.Integer num2 = 16;
        int i5 = 0;
        java.lang.Integer num3 = 0;
        java.lang.String str2 = "";
        int i6 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i;
                ((int[]) objArr[1])[0] = i;
                int i7 = ~i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((~((-202527845) | i7)) | 1693964316) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1164571904 + (((~(i7 | (-134218849))) | (~(i | 1828183164))) * (-519)) + (((~(i | 1693964316)) | 202527844) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.indexOf("", ""));
                    byte b = (byte) (-$$a[14]);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b2, b2, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i;
                ((int[]) objArr4[1])[0] = i ^ 4;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((-42059831) | i) * (-627)) + 1291135488 + (((~((-1564881482) | i)) | 331610679) * (-627)) + (((~(i | 331610679)) | (~((~i) | 1564881481))) * 627))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    byte b3 = (byte) (-$$a[14]);
                    byte b4 = (byte) (b3 - 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(b3, b4, b4, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length = strArr2.length;
            java.nio.LongBuffer[] longBufferArr2 = new java.nio.LongBuffer[length];
            int i8 = 0;
            while (i8 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i8].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i6];
                b("岏", android.graphics.Color.rgb(i5, i5, i5) + 16810287, objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i5]).intern(), str2);
                int i9 = length;
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                java.lang.Integer num4 = num3;
                long longValue2 = new java.math.BigInteger(replaceAll.substring(i5, 16), 16).longValue();
                int length2 = replaceAll.length();
                if (length2 == 32) {
                    num = num2;
                    str = str2;
                    i4 = i9;
                    longBufferArr2[i8] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length2 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[0])[0] = i;
                        ((int[]) objArr8[1])[0] = i ^ 3;
                        int i10 = ~(i | 1487905322);
                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((1084563496 | i10) * (-196)) - 2023013992) + ((i10 | 403341826) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.MeasureSpec.getSize(0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                            byte b5 = (byte) (-$$a[14]);
                            byte b6 = (byte) (b5 - 1);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a(b5, b6, b6, objArr10);
                            obj4 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                        }
                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                        return objArr8;
                    }
                    i4 = i9;
                    num = num2;
                    str = str2;
                    longBufferArr2[i8] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i8++;
                strArr2 = strArr;
                str2 = str;
                num3 = num4;
                length = i4;
                num2 = num;
                i5 = 0;
                i6 = 1;
            }
            java.lang.Integer num5 = num2;
            java.lang.Integer num6 = num3;
            java.lang.String str3 = str2;
            int i11 = length;
            try {
            } catch (java.lang.Throwable unused) {
                r7 = i;
                r8 = str3;
            }
            if (context == null) {
                java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr11[0])[0] = i;
                ((int[]) objArr11[1])[0] = i;
                int i12 = ~((-1527944900) | i);
                try {
                    java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), num6, java.lang.Integer.valueOf(((((~((~i) | (-1527944900))) | 1241514562) * (-245)) - 1813895362) + (i12 * (-245)) + ((i12 | 368547261) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) android.text.TextUtils.getOffsetAfter(str3, 0));
                        byte b7 = (byte) (-$$a[14]);
                        byte b8 = (byte) (b7 - 1);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b7, b8, b8, objArr13);
                        obj5 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr12)).intValue();
                    return objArr11;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i13 = i11;
            r8 = new byte[i13][];
            int i14 = 0;
            int i15 = 0;
            r7 = i13;
            while (i14 < r7) {
                java.nio.LongBuffer longBuffer2 = longBufferArr2[i14];
                if (longBuffer2.capacity() == 4) {
                    int i16 = (RecordsJson + 83) % 128;
                    SdkCoreAlternateContactlessPaymentDataImpl = i16;
                    RecordsJson = (i16 + 19) % 128;
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                    java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                    long[] array = longBuffer2.array();
                    int length3 = array.length;
                    int i17 = 0;
                    boolean z3 = r7;
                    while (true) {
                        z2 = z3;
                        if (i17 >= length3) {
                            break;
                        }
                        asLongBuffer.put(array[i17]);
                        i17++;
                        z3 = z2;
                    }
                    r8[i15] = allocate.array();
                    i15++;
                } else {
                    z2 = r7;
                }
                i14++;
                r7 = z2;
            }
            int i18 = r7;
            if (i15 > 0) {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 59) % 128;
                int currentTimeMillis = 343337308 ^ ((int) java.lang.System.currentTimeMillis());
                try {
                    ?? r72 = {java.lang.Integer.valueOf(i ^ currentTimeMillis), r8, java.lang.Integer.valueOf(i15)};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                    if (obj6 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 27, android.view.View.MeasureSpec.getMode(0) + 429, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 31610));
                        byte b9 = $$a[14];
                        byte b10 = (byte) (b9 + 1);
                        byte b11 = (byte) (-b9);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b10, b11, b11, objArr14);
                        obj6 = cls5.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj6);
                    }
                    r8 = 0;
                    r7 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, r72)).longValue();
                    long j = ~r7;
                    long j2 = i;
                    long j3 = ~j2;
                    long j4 = ~(j3 | (-881562291));
                    longBufferArr = longBufferArr2;
                    long j5 = (713 * r7) + 626790788901L + (((~(j | (-881562291))) | j4) * (-712)) + (((~(j | j3 | (-881562291))) | (((r7 | (-881562291)) | j2) ^ (-1))) * (-712)) + ((j4 | j) * 712) + 1815462998;
                    r7 = i;
                    int i19 = ~((-1281160935) | r7);
                    int i20 = ~r7;
                    int i21 = ((((int) j5) & (((((~(1226318125 | i20)) * 979) + 511562552) + (((-210908285) | r7) * (-979))) + (((~(1226318125 | r7)) | (~((-210908285) | i20))) * 979))) | (((int) (j5 >> 32)) & (((((1576579950 | i19) * (-220)) - 426420198) + ((i19 | 1280881254) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1802117008))) ^ currentTimeMillis;
                    if ((i2 & 1) != 1 || (i21 ^ r7) != 15) {
                        r8 = str3;
                        int i22 = i21 ^ r7;
                        if (i22 == 0) {
                            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
                            java.lang.Object[] objArr15 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr15[0])[0] = r7;
                            ((int[]) objArr15[1])[0] = i21;
                            try {
                                java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), num6, java.lang.Integer.valueOf((((~((-882465672) | r7)) | 873484417) * 345) + 441725952 + (((~(i20 | (-882465672))) | 140542072) * 345) + ((~((-873484418) | r7)) * 345))};
                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj7 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter(r8, 0), 2713 - android.graphics.Color.alpha(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    byte b12 = (byte) (-$$a[14]);
                                    byte b13 = (byte) (b12 - 1);
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a(b12, b13, b13, objArr17);
                                    obj7 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                }
                                ((int[]) objArr15[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr16)).intValue();
                                return objArr15;
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        r7 = r7;
                        r8 = r8;
                        if (i22 == 11) {
                            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 19) % 128;
                            java.lang.Object[] objArr18 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr18[0])[0] = r7;
                            ((int[]) objArr18[1])[0] = i21;
                            try {
                                java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((~(i20 | (-35949826))) | (~(1860542335 | r7))) * (-272)) + 1810552736 + (((~((-174362378) | r7)) | 138412552) * (-272)) + (((~(174362377 | r7)) | 1722129783) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj8 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                    byte b14 = (byte) (-$$a[14]);
                                    byte b15 = (byte) (b14 - 1);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a(b14, b15, b15, objArr20);
                                    obj8 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                }
                                ((int[]) objArr18[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr19)).intValue();
                                return objArr18;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                        java.lang.Object[] objArr21 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr21[0])[0] = r7;
                        ((int[]) objArr21[1])[0] = r7 ^ 2;
                        java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((((~r7) | (-217394047)) * 1444) - 1571247232) + ((((~(922716811 | r7)) | (-1056943104)) | (~(973775349 | r7))) * (-1444))) - 1955288740)};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj == null) {
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) android.text.TextUtils.getCapsMode(r8, 0, 0));
                            byte b16 = (byte) (-$$a[14]);
                            byte b17 = (byte) (b16 - 1);
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(b16, b17, b17, objArr23);
                            obj = cls8.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                        }
                        ((int[]) objArr21[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr22)).intValue();
                        return objArr21;
                    }
                    try {
                        java.lang.Object[] objArr24 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr24[0])[0] = r7;
                        ((int[]) objArr24[1])[0] = i21;
                        try {
                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((~((-983311131) | i20)) | 913181030) * (-602)) + 1499565038 + (((~((-983311131) | r7)) | 839647490 | (~(1056844670 | i20))) * (-301)) + ((~(i20 | 913181030)) * 301))};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj9 == null) {
                                try {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    byte b18 = (byte) (-$$a[14]);
                                    byte b19 = (byte) (b18 - 1);
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    a(b18, b19, b19, objArr26);
                                    obj9 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    java.lang.Throwable cause4 = th.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th;
                                }
                            }
                            ((int[]) objArr24[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr25)).intValue();
                            return objArr24;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                        }
                    } catch (java.lang.Throwable unused2) {
                        r8 = str3;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause5 = th6.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th6;
                }
            } else {
                r7 = i;
                longBufferArr = longBufferArr2;
                r8 = str3;
            }
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
            try {
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b("峔僊䓳磴沞悉ᒷ࣬㱞ぃ⑱\ud87a찜쀆\uf42f\ue864鷦釻藩릂궄ꆨ喷", android.view.View.MeasureSpec.getSize(0) + 3089, objArr27);
                java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b("峒벃鱧ﰜ\udd98㵉ᴬ纑幊븻鿆ｅ\udf3f㣣ᡘ砍姷", android.view.View.resolveSizeAndState(0, 0, 0) + 57427, objArr28);
                java.lang.Object invoke = cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null);
                try {
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    b("峔僊䓳磴沞悉ᒷ࣬㱞ぃ⑱\ud87a찜쀆\uf42f\ue864鷦釻藩릂궄ꆨ喷", 3089 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr29);
                    java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    c(null, null, android.text.TextUtils.lastIndexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0082\u0089\u0085\u0088\u0082\u0081\u0085\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr30);
                    try {
                        java.lang.Object[] objArr31 = {cls11.getMethod(((java.lang.String) objArr30[0]).intern(), null).invoke(context, null), 64};
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        c(null, null, android.graphics.Color.blue(0) + 127, "\u008c\u0082\u0081\u0085\u008a\u0085\u0091\u0082\u0081\u0085\u0087\u0086\u0085\u0084\u008f\u0089\u0090\u008f\u0083\u008a\u0082\u0083\u008a\u008d\u0086\u008f\u008b\u008e\u008d\u008c\u008b\u008a\u0085", objArr32);
                        java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c(null, null, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u008d\u0093\u008a\u0092\u0082\u0081\u0085\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr33);
                        java.lang.Object invoke2 = cls12.getMethod(((java.lang.String) objArr33[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr31);
                        int i23 = i18;
                        int i24 = 0;
                        loop3: while (true) {
                            if (i24 >= i23) {
                                break;
                            }
                            int i25 = RecordsJson + 39;
                            SdkCoreAlternateContactlessPaymentDataImpl = i25 % 128;
                            if (i25 % 2 != 0) {
                                longBuffer = longBufferArr[i24];
                                z = longBuffer.capacity() == 4;
                            } else {
                                longBuffer = longBufferArr[i24];
                            }
                            if (z) {
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                c(null, null, 127 - (android.os.Process.myTid() >> 22), "\u009a\u0099\u0098\u0097\u0096\u0095\u0094", objArr34);
                                intern = ((java.lang.String) objArr34[0]).intern();
                                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 77) % 128;
                            } else {
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                b("峸劚䁖", android.view.KeyEvent.getDeadChar(0, 0) + 3691, objArr35);
                                intern = ((java.lang.String) objArr35[0]).intern();
                            }
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            b("峔腰\ue787없⩶ࢋ滓匶놎韙\uf475\uda98㣔ᵴ䎛ꆞ虵\ue483쪝⽔ඈ珑偬뚉铚北\udfa2㷒执䂅", 56747 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr36);
                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr36[0]).intern());
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            b("峆삕摀蠀ⷰ冬\uf576ᤸ뺘≗", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40010, objArr37);
                            java.lang.Object[] objArr38 = (java.lang.Object[]) cls13.getField(((java.lang.String) objArr37[0]).intern()).get(invoke2);
                            int length4 = objArr38.length;
                            int i26 = 0;
                            while (i26 < length4) {
                                java.lang.Object obj10 = objArr38[i26];
                                try {
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    java.lang.Object obj11 = invoke2;
                                    int i27 = i23;
                                    c(null, null, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0083\u009d\u0082\u0081\u008e \u0082\u0081\u0085\u009d\u009d\u0082\u0091\u008f\u009f\u0083\u008e\u008c\u009e\u0086\u0082\u009d\u008f\u0085\u009c\u0085\u009b", objArr39);
                                    java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr39[0]).intern());
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    java.lang.String str4 = intern;
                                    c(null, null, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u0082\u0086\u008a\u0085\u0083\u009d\u008a\u0092\u0083\u0082\u0081", objArr40);
                                    java.lang.Object invoke3 = cls14.getMethod(((java.lang.String) objArr40[0]).intern(), java.lang.String.class).invoke(null, intern);
                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 109) % 128;
                                    try {
                                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                                        b("峔ꎾꈛꋨꅎꀥꂏꝘꟾꙗꔩꖖꑬꓺꭇꩰꪕꥭꦁꢙ꼸꾛깵껇궹객겅덷", 65381 - android.text.TextUtils.getCapsMode(r8, 0, 0), objArr41);
                                        java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr41[0]).intern());
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        c(null, null, 127 - android.view.View.resolveSize(0, 0), "\u009f\u0085\u008c\u008c\u0096\u0082\u0083\u009f¡\u008d\u0083", objArr42);
                                        try {
                                            java.lang.Object[] objArr43 = {cls15.getMethod(((java.lang.String) objArr42[0]).intern(), null).invoke(obj10, null)};
                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                            c(null, null, android.text.TextUtils.lastIndexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0083\u009d\u0082\u0081\u008e \u0082\u0081\u0085\u009d\u009d\u0082\u0091\u008f\u009f\u0083\u008e\u008c\u009e\u0086\u0082\u009d\u008f\u0085\u009c\u0085\u009b", objArr44);
                                            java.lang.Class<?> cls16 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                            c(null, null, 127 - android.text.TextUtils.getCapsMode(r8, 0, 0), "\u0083\u009d\u0082\u0081\u008e\u008b", objArr45);
                                            if (java.nio.ByteBuffer.wrap((byte[]) cls16.getMethod(((java.lang.String) objArr45[0]).intern(), byte[].class).invoke(invoke3, objArr43)).asLongBuffer().equals(longBuffer.rewind())) {
                                                break loop3;
                                            }
                                            i26++;
                                            invoke2 = obj11;
                                            intern = str4;
                                            i23 = i27;
                                        } catch (java.lang.Throwable th7) {
                                            java.lang.Throwable cause6 = th7.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th7;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        java.lang.Throwable cause7 = th8.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th8;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    java.lang.Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            }
                            i24++;
                            i23 = i23;
                            java.lang.Object[] objArr212 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr212[0])[0] = r7;
                            ((int[]) objArr212[1])[0] = r7 ^ 2;
                            java.lang.Object[] objArr222 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((((~r7) | (-217394047)) * 1444) - 1571247232) + ((((~(922716811 | r7)) | (-1056943104)) | (~(973775349 | r7))) * (-1444))) - 1955288740)};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr212[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr222)).intValue();
                            return objArr212;
                        }
                    } catch (java.lang.Throwable th10) {
                        java.lang.Throwable cause9 = th10.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th10;
                    }
                } catch (java.lang.Throwable th11) {
                    java.lang.Throwable cause10 = th11.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th11;
                }
            } catch (java.lang.Throwable th12) {
                java.lang.Throwable cause11 = th12.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th12;
            }
        } catch (java.lang.Throwable th13) {
            java.lang.Throwable cause12 = th13.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th13;
        }
    }
}
