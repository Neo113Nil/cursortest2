package com.payair.hce;

/* loaded from: classes4.dex */
public class bindService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static final java.lang.String[] valueOf;
    private static char[] values;
    private static final java.text.SimpleDateFormat writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (s * 3);
        int i4 = b * 4;
        int i5 = 118 - (s2 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i3 += -i5;
            i2 = i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i8;
            i5 = bArr[i8];
            i3 += -i5;
            i2 = i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = i5;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson();
        android.view.View.MeasureSpec.getSize(0);
        android.view.KeyEvent.getMaxKeyCode();
        android.text.TextUtils.getTrimmedLength("");
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, null, null, "\u008f\u008f\u008f\u008f\u008f\u008e\u008e\u008e\u008d\u008c\u008c\u008a\u008b\u008b\u008a\u0089\u0089\u0088\u0082\u0088\u0087\u0087\u0085\u0086\u0086\u0085\u0084\u0084\u0084\u0084", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0088\u008f\u0088\u008c\u008c\u008a\u008b\u008b\u008a\u0089\u0089\u0088\u0082\u0088\u0087\u0087\u0085\u0086\u0086\u0085\u0084\u0084\u0084\u0084", objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, null, null, "\u0088\u008f\u0088\u008e\u008e\u008e\u008d\u008c\u008c\u008a\u008b\u008b\u008a\u0089\u0089\u0088\u0082\u0088\u0087\u0087\u0085\u0086\u0086\u0085\u0084\u0084\u0084\u0084", objArr3);
        valueOf = new java.lang.String[]{intern, intern2, ((java.lang.String) objArr3[0]).intern()};
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(126 - android.view.MotionEvent.axisFromString(""), null, null, "\u008f\u008f\u008f\u008f\u008f\u008e\u008e\u008e\u008d\u008c\u008c\u008a\u008b\u008b\u008a\u0089\u0089\u0088\u0082\u0088\u0087\u0087\u0085\u0086\u0086\u0085\u0084\u0084\u0084\u0084", objArr4);
        writeReplace = new java.text.SimpleDateFormat(((java.lang.String) objArr4[0]).intern(), java.util.Locale.ENGLISH);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, null, "\u0095\u0096\u0095\u008e\u0094\u0093\u0082\u0081\u0085\u0092\u0091\u008e\u0090\u0086", objArr5);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr5[0]).intern());
        sb.append(com.payair.hce.bindService.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static boolean valueOf(java.lang.String str) {
        int i = (RecordsJson + 67) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        if (str != null) {
            int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            RecordsJson = i2 % 128;
            if (i2 % 2 != 0) {
                if (str.length() != 0) {
                    try {
                        if (new java.util.Date(java.lang.System.currentTimeMillis()).compareTo(DigitizedCardProfile(str)) > 0) {
                            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 73) % 128;
                        } else {
                            int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 71;
                            RecordsJson = i3 % 128;
                            return i3 % 2 != 0;
                        }
                    } catch (java.text.ParseException e) {
                        new java.lang.Object[]{e.getMessage()};
                        e.getMessage();
                    }
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        return false;
    }

    public static java.lang.String DigitizedCardProfile(java.util.Date date) {
        java.lang.String format;
        synchronized (com.payair.hce.bindService.class) {
            int i = RecordsJson + 63;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                format = writeReplace.format(date);
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
            } else {
                writeReplace.format(date);
                throw new java.lang.ArithmeticException();
            }
        }
        return format;
    }

    private static java.util.Date DigitizedCardProfile(java.lang.String str) throws java.text.ParseException {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u0083\u0082\u0081", objArr);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(((java.lang.String) objArr[0]).intern()));
        java.lang.String[] strArr = valueOf;
        int length = strArr.length;
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 67) % 128;
        java.text.ParseException e = null;
        for (int i = 0; i < length; i++) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 93;
            RecordsJson = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    simpleDateFormat.applyPattern(strArr[i]);
                    return simpleDateFormat.parse(str);
                }
                simpleDateFormat.applyPattern(strArr[i]);
                simpleDateFormat.parse(str);
                throw null;
            } catch (java.text.ParseException e2) {
                e = e2;
            }
        }
        throw e;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $11 = ($10 + 67) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 49) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr4 = values;
        if (cArr4 != null) {
            $10 = ($11 + 49) % 128;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr5[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 285 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (46337 - android.view.View.MeasureSpec.getMode(0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getAid) {
            int i3 = $11 + 1;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                getumdgeneration.values = bArr2.length;
                cArr2 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 1;
            } else {
                getumdgeneration.values = bArr2.length;
                cArr2 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
            }
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr2[getumdgeneration.valueOf] = (char) (cArr4[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.getDefaultSize(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1628, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr2);
            return;
        }
        if (!DigitizedCardProfile) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr4[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr3.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $10 = ($11 + 83) % 128;
            cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1629 - android.text.TextUtils.indexOf("", ""), (char) android.view.View.MeasureSpec.getMode(0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, (byte) 0, (short) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static void AlternateContactlessPaymentDataJson() {
        values = new char[]{11093, 11090, 11075, 11017, 11133, 11101, 11042, 11111, 11078, 11080, 11069, 11059, 11132, 11091, 11048, 11102, 11074, 11099, 11097, 11098, 11118, 11018};
        AlternateContactlessPaymentDataJson = -143185266;
        DigitizedCardProfile = true;
        getAid = true;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$b = 26;
    }
}
