package com.payair.hce;

/* loaded from: classes4.dex */
public class McbpGcmListenerService extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] getAid;
    private static int getProfileVersion;
    private static boolean values;
    private static int writeReplace;
    private final android.content.Context valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = i + 6;
        int i6 = 79 - b;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i4 = 0;
            i6++;
            i2 = (i8 + (-i7)) - 2;
            i3 = i4;
            int i9 = i2;
            int i10 = i6;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i9;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i10];
            i8 = i9;
            i6 = i10;
            i6++;
            i2 = (i8 + (-i7)) - 2;
            i3 = i4;
            int i92 = i2;
            int i102 = i6;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i92;
            if (i4 == i5) {
            }
        } else {
            i2 = b2 + 65;
            i3 = 0;
            int i922 = i2;
            int i1022 = i6;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i922;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s + 6;
        int i5 = b + 65;
        byte[] bArr = $$d;
        int i6 = 715 - i;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i5 = i6;
            i3 = 0;
            i6++;
            i5 = i5 + (-i7) + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 = i5 + (-i7) + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 118 - i2;
        int i6 = (b * 3) + 1;
        int i7 = 4 - (i * 2);
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            int i10 = i7;
            int i11 = (-i7) + i8;
            int i12 = i10 + 1;
            i3 = i9;
            i5 = i11;
            i7 = i12;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i5;
            i10 = i7;
            i7 = bArr[i7];
            i9 = i4;
            i8 = i13;
            int i112 = (-i7) + i8;
            int i122 = i10 + 1;
            i3 = i9;
            i5 = i112;
            i7 = i122;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

    public McbpGcmListenerService(android.content.Context context) {
        this.valueOf = context;
    }

    private static void b(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(RecordsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 2073, (char) (60037 - android.graphics.Color.argb(0, 0, 0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((byte) 0, 0, 3, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myPid() >> 22), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3544, (char) android.view.View.getDefaultSize(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i5 = $11 + 39;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            int i7 = $10 + 3;
            while (true) {
                $11 = i7 % 128;
                if (digitizedCardJson11.DigitizedCardProfile >= i3) {
                    break;
                }
                $11 = ($10 + 21) % 128;
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 3543 - android.text.TextUtils.indexOf("", "", 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                i7 = $10 + 49;
            }
            cArr = cArr3;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        $11 = ($10 + 39) % 128;
        objArr[0] = str2;
    }

    private static void e(java.lang.String str, int[] iArr, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 89) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $10 + 1;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr4 = AlternateContactlessPaymentDataJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            $11 = ($10 + 113) % 128;
            int i3 = 0;
            while (i3 < length) {
                $11 = ($10 + 63) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.lastIndexOf("", c, 0), 286 - android.view.View.MeasureSpec.getSize(0), (char) (46337 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr5[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (DigitizedCardProfile) {
            int i4 = $11 + 77;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
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
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 43, android.os.Process.getGidForName("") + 1630, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f((byte) 0, 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr2);
            return;
        }
        if (!values) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 105) % 128;
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
            cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1629, (char) android.view.KeyEvent.keyCodeFromString(""));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f((byte) 0, 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r0[r1.writeReplace] == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0155, code lost:
    
        r6 = r1.writeReplace;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015c, code lost:
    
        r14 = new java.lang.Object[]{java.lang.Integer.valueOf(r2[r1.writeReplace]), java.lang.Integer.valueOf(r4)};
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0179, code lost:
    
        if (r4 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017b, code lost:
    
        r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.widget.ExpandableListView.getPackedPositionType(0), 2880 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        r12 = new java.lang.Object[1];
        f((byte) 0, 0, 7, r12);
        r4 = r4.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c8, code lost:
    
        r3[r6] = ((java.lang.Character) ((java.lang.reflect.Method) r4).invoke(null, r14)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ca, code lost:
    
        r4 = r3[r1.writeReplace];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ce, code lost:
    
        r6 = new java.lang.Object[]{r1, r1};
        r8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01df, code lost:
    
        if (r8 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
    
        r8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0219, code lost:
    
        ((java.lang.reflect.Method) r8).invoke(null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        r6 = r1.writeReplace;
        r10 = r2[r1.writeReplace];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        r15 = new java.lang.Object[2];
        r15[r8] = java.lang.Integer.valueOf(r4);
        r15[0] = java.lang.Integer.valueOf(r10);
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0) + 45, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2836, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
        r12 = new java.lang.Object[1];
        f((byte) 0, 0, 11, r12);
        r4 = r4.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0152, code lost:
    
        r3[r6] = ((java.lang.Character) ((java.lang.reflect.Method) r4).invoke(null, r15)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        if (r0[r1.writeReplace] == 1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = ($10 + 93) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = getAid;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(i3) + 29, 2807 - android.text.TextUtils.getOffsetBefore("", i3), (char) (android.os.Process.myPid() >> 22));
                        java.lang.Object[] objArr3 = new java.lang.Object[i5];
                        f((byte) 0, 0, 9, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr2 != null) {
            int i10 = $10 + 3;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i6];
                i2 = 1;
            } else {
                cArr = new char[i6];
                i2 = 0;
            }
            getaccounttype.writeReplace = i2;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                int i11 = $11 + 105;
                $10 = i11 % 128;
                char c2 = i11 % 2 != 0 ? (char) 1 : (char) 1;
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i12, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr4, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                $11 = ($10 + 59) % 128;
                cArr6[getaccounttype.writeReplace] = cArr4[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr6;
        }
        if (i7 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                int i14 = $11 + 51;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] % iArr[3]);
                    i13 = getaccounttype.writeReplace;
                } else {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                    i13 = getaccounttype.writeReplace + 1;
                }
            }
        }
        java.lang.String str3 = new java.lang.String(cArr4);
        int i15 = $10 + 35;
        $11 = i15 % 128;
        if (i15 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x11f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x1311  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x149f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x14d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x159e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x159f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x1586  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x139f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0c35  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        java.lang.Integer num;
        android.content.Context baseContext;
        int intValue;
        byte[] bArr;
        java.lang.Object[] objArr;
        long j;
        android.content.Context baseContext2;
        java.util.Map<java.lang.String, java.lang.String> map;
        android.content.Context context;
        java.lang.Object[] objArr2;
        int i;
        int i2;
        java.util.Map<java.lang.String, java.lang.String> map2;
        int i3;
        android.content.Context context2;
        java.lang.Object invoke;
        int i4 = getProfileVersion + 87;
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1582, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
            byte b = $$a[24];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(b, (byte) (b | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr3);
            cls.getField((java.lang.String) objArr3[0]).getLong(null);
            throw null;
        }
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 48, 1581 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0));
        byte[] bArr2 = $$a;
        byte b2 = bArr2[24];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(b2, (byte) (b2 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr4);
        long j2 = cls2.getField((java.lang.String) objArr4[0]).getLong(null);
        try {
            try {
                try {
                    if (j2 != -1) {
                        int i5 = getProfileVersion;
                        SdkCoreAlternateContactlessPaymentDataImpl = (((i5 | 23) << 1) - (i5 ^ 23)) % 128;
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i6 = lastIndexOf * (-103);
                        int i7 = ((i6 ^ (-23484)) | (i6 & (-23484))) << 1;
                        int i8 = -((i6 & 23483) | ((~i6) & (-23484)));
                        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                        int i10 = ~lastIndexOf;
                        int i11 = (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) | ((~i10) & (-229));
                        int i12 = i10 & (-229);
                        int i13 = ~((i11 ^ i12) | (i12 & i11));
                        int i14 = ~((identityHashCode & (-229)) | (identityHashCode ^ (-229)));
                        int i15 = -(-(((i13 ^ i14) | (i13 & i14)) * 104));
                        int i16 = ~identityHashCode;
                        int i17 = i16 & (i16 | identityHashCode);
                        int i18 = i17 ^ lastIndexOf;
                        int i19 = i17 & lastIndexOf;
                        int i20 = (i19 & i18) | (i19 ^ i18);
                        int i21 = i20 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
                        int i22 = (i20 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) & (~i21);
                        int i23 = (i22 ^ i21) | (i22 & i21);
                        int i24 = (i9 & i15) + (i15 | i9);
                        int i25 = ~i23;
                        int i26 = (i24 - (~(-(-((i25 & (i23 | i25)) * (-104)))))) - 1;
                        int i27 = lastIndexOf ^ identityHashCode;
                        int i28 = lastIndexOf & identityHashCode;
                        int i29 = -(-(((i27 ^ i28) | (i28 & i27)) * 104));
                        int i30 = ((~i29) & i26) | ((~i26) & i29);
                        int i31 = -(-((i29 & i26) << 1));
                        int i32 = -android.view.View.combineMeasuredStates(0, 0);
                        int identityHashCode2 = java.lang.System.identityHashCode(this);
                        int i33 = i32 * 595;
                        int i34 = i33 & (-1187);
                        int i35 = ~i32;
                        int i36 = i35 & 1;
                        int i37 = (~i36) & (i35 | 1);
                        int i38 = ~((i36 & i37) | (i36 ^ i37));
                        int i39 = ~identityHashCode2;
                        int i40 = i39 & (i39 | identityHashCode2);
                        int i41 = i40 & 1;
                        int i42 = (i40 | 1) & (~i41);
                        int i43 = ~((i41 & i42) | (i41 ^ i42));
                        int i44 = i38 & i43;
                        num = 0;
                        int i45 = (((((~i34) & (i33 | (-1187))) - (~(i34 << 1))) - 1) - (~((((i43 | i38) & (~i44)) | i44) * (-1188)))) - 1;
                        int i46 = (i35 | i32) & i35;
                        int i47 = ~((i46 ^ 1) | (i46 & 1));
                        int i48 = ~((identityHashCode2 ^ (-2)) | (identityHashCode2 & (-2)));
                        int i49 = ((~i48) & i47) | ((~i47) & i48);
                        int i50 = i47 & i48;
                        int i51 = (i50 ^ i49) | (i50 & i49);
                        int i52 = i39 | i32;
                        int i53 = ~i52;
                        int i54 = (i52 | i53) & i53;
                        int i55 = -(~(((i51 ^ i54) | (i51 & i54)) * 594));
                        int i56 = (-2) - (~(((i45 | i55) << 1) - (i55 ^ i45)));
                        int i57 = ~(i39 | (-2));
                        int i58 = (i35 & (-2)) | (i32 & 1);
                        int i59 = i32 & (-2);
                        int i60 = ~((i58 ^ i59) | (i58 & i59));
                        int i61 = i57 & i60;
                        int i62 = (i57 | i60) & (~i61);
                        int i63 = (i62 ^ i61) | (i62 & i61);
                        int i64 = i56 & (((i63 ^ i53) | (i53 & i63)) * 594);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, ((i30 | i31) << 1) - (i31 ^ i30), (i64 - (~(-(-((i56 ^ r2) | i64))))) - 1, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr5);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr6);
                        if (j2 + 1985 >= ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr6[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                            int i65 = SdkCoreAlternateContactlessPaymentDataImpl;
                            int i66 = ((i65 ^ 80) + ((i65 & 80) << 1)) - 1;
                            getProfileVersion = i66 % 128;
                            if (i66 % 2 == 0) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 49, 1581 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.getDefaultSize(0, 0));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                a(bArr2[7], (byte) 69, bArr2[34], objArr7);
                                java.lang.Object[] objArr8 = {cls4.getField((java.lang.String) objArr7[0]).get(null), 259126190, 1};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                if (obj == null) {
                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getCapsMode("", 0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 4905, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj);
                                }
                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                            } else {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 1581 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                a(bArr2[7], (byte) 69, bArr2[34], objArr9);
                                java.lang.Object[] objArr10 = {cls5.getField((java.lang.String) objArr9[0]).get(null), 259126190, null};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 4905 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj2);
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr10);
                            }
                            objArr = (java.lang.Object[]) invoke;
                            int i67 = SdkCoreAlternateContactlessPaymentDataImpl;
                            int i68 = i67 ^ 15;
                            getProfileVersion = ((((i67 & 15) | i68) << 1) - i68) % 128;
                            bArr = bArr2;
                            if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add((java.lang.String) objArr[2]);
                                arrayList.add((java.lang.String) objArr[3]);
                                int i69 = SdkCoreAlternateContactlessPaymentDataImpl;
                                int i70 = i69 & 111;
                                int i71 = i69 | 111;
                                getProfileVersion = ((i70 ^ i71) + ((i71 & i70) << 1)) % 128;
                            }
                            java.util.Map<java.lang.String, java.lang.String> data = remoteMessage.getData();
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 429, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 31611));
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            a(bArr[7], (byte) 69, bArr[34], objArr11);
                            j = cls6.getField((java.lang.String) objArr11[0]).getLong(null);
                            if (j != -1) {
                                int i72 = SdkCoreAlternateContactlessPaymentDataImpl;
                                getProfileVersion = (((i72 | 121) << 1) - (i72 ^ 121)) % 128;
                                long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                int indexOf = android.text.TextUtils.indexOf("", "") & 1;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, (indexOf - (~(-(-((r3 ^ 1) | indexOf))))) - 1, android.view.View.combineMeasuredStates(0, 0) + 22, objArr12);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr13);
                                if (j + 2032 >= ((java.lang.Long) cls7.getDeclaredMethod((java.lang.String) objArr13[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 13) % 128;
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 430, (char) (31610 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                    byte b3 = bArr[11];
                                    byte b4 = (byte) (b3 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    a(b3, b4, (byte) (b4 + 3), objArr14);
                                    java.lang.Object[] objArr15 = {cls8.getField((java.lang.String) objArr14[0]).get(null), -992839718, num};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 33, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4619, (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj3);
                                    }
                                    objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj3).invoke(null, objArr15);
                                    int i73 = (-2) - (~(getProfileVersion + 50));
                                    SdkCoreAlternateContactlessPaymentDataImpl = i73 % 128;
                                    if (i73 % 2 != 0) {
                                        int i74 = 5 / 4;
                                    }
                                    map = data;
                                    i = ((int[]) objArr2[1])[0];
                                    i2 = ((int[]) objArr2[0])[0];
                                    if (i2 == i) {
                                        int i75 = getProfileVersion;
                                        SdkCoreAlternateContactlessPaymentDataImpl = (((i75 & (-12)) | ((~i75) & 11)) + ((i75 & 11) << 1)) % 128;
                                        java.lang.Object[] objArr16 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[0]), num};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.widget.ExpandableListView.getPackedPositionType(0L), 4618 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr16);
                                        int i76 = getProfileVersion;
                                        SdkCoreAlternateContactlessPaymentDataImpl = ((-2) - (~((i76 & 58) + (i76 | 58)))) % 128;
                                    } else {
                                        int i77 = i & i2;
                                        long j3 = (~i77) & ((i ^ i2) | i77);
                                        int i78 = getProfileVersion;
                                        SdkCoreAlternateContactlessPaymentDataImpl = (i78 + 47) % 128;
                                        int i79 = i78 ^ 71;
                                        SdkCoreAlternateContactlessPaymentDataImpl = (((((i78 & 71) | i79) << 1) - (~(-i79))) - 1) % 128;
                                        try {
                                            java.lang.Object[] objArr17 = {java.lang.Long.valueOf(j3 ^ (-5766252242105532416L)), -1342560157L};
                                            byte[] bArr3 = $$d;
                                            byte b5 = bArr3[164];
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            d(b5, b5, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED, objArr18);
                                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                            byte b6 = bArr3[25];
                                            byte b7 = bArr3[5];
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            d(b6, b7, (short) (b7 | 556), objArr19);
                                            cls9.getMethod((java.lang.String) objArr19[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr17);
                                            java.lang.Object[] objArr20 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[0]), num};
                                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                            if (obj5 == null) {
                                                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, 4617 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj5);
                                            }
                                            ((java.lang.reflect.Method) obj5).invoke(null, objArr20);
                                            int i80 = getProfileVersion;
                                            SdkCoreAlternateContactlessPaymentDataImpl = ((i80 ^ 113) + ((i80 & 113) << 1)) % 128;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    map2 = map;
                                    if (!map2.containsKey("payload")) {
                                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 105) % 128;
                                        if (!com.payair.logic.notifications.FirebaseNotificationHandlerImpl.TITLE_MDES.equals(map2.get("title"))) {
                                            int i81 = getProfileVersion;
                                            int i82 = i81 & 83;
                                            int i83 = (i81 | 83) & (~i82);
                                            int i84 = -(-(i82 << 1));
                                            int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                                            SdkCoreAlternateContactlessPaymentDataImpl = i85 % 128;
                                            if (i85 % 2 != 0) {
                                                throw null;
                                            }
                                            return;
                                        }
                                    }
                                    if (!com.payair.hce.setClickable.AlternateContactlessPaymentDataJson()) {
                                        int i86 = getProfileVersion;
                                        int i87 = i86 & 125;
                                        int i88 = ((i86 | 125) & (~i87)) + (i87 << 1);
                                        SdkCoreAlternateContactlessPaymentDataImpl = i88 % 128;
                                        if (i88 % 2 != 0) {
                                            map2.get("payload");
                                            throw new java.lang.ArithmeticException();
                                        }
                                        java.lang.String str = map2.get("payload");
                                        if (str == null) {
                                            str = map2.get("notificationData");
                                        }
                                        if (getBaseContext() != null) {
                                            int i89 = getProfileVersion;
                                            int i90 = ((i89 & (-10)) | ((~i89) & 9)) + ((i89 & 9) << 1);
                                            SdkCoreAlternateContactlessPaymentDataImpl = i90 % 128;
                                            if (i90 % 2 != 0) {
                                                getBaseContext();
                                                throw null;
                                            }
                                            context2 = getBaseContext();
                                            int i91 = SdkCoreAlternateContactlessPaymentDataImpl;
                                            int i92 = i91 & 113;
                                            int i93 = (i91 | 113) & (~i92);
                                            int i94 = i92 << 1;
                                            getProfileVersion = (((i93 | i94) << 1) - (i93 ^ i94)) % 128;
                                        } else {
                                            context2 = this.valueOf;
                                            int i95 = getProfileVersion;
                                            int i96 = ((i95 ^ 61) | (i95 & 61)) << 1;
                                            int i97 = -((i95 & (-62)) | ((~i95) & 61));
                                            SdkCoreAlternateContactlessPaymentDataImpl = (((i96 | i97) << 1) - (i97 ^ i96)) % 128;
                                        }
                                        com.payair.hce.setAccessibilityLiveRegion.writeReplace(new java.lang.Object[]{str, context2}, -1332113624, 1332113624, (int) java.lang.System.currentTimeMillis());
                                        int i98 = getProfileVersion;
                                        int i99 = (i98 ^ 90) + ((i98 & 90) << 1);
                                        SdkCoreAlternateContactlessPaymentDataImpl = ((~i99) + (i99 << 1)) % 128;
                                    }
                                    int i100 = SdkCoreAlternateContactlessPaymentDataImpl;
                                    int i101 = i100 & 37;
                                    int i102 = (i100 | 37) & (~i101);
                                    int i103 = i101 << 1;
                                    i3 = (i102 & i103) + (i102 | i103);
                                    getProfileVersion = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                            }
                            baseContext2 = getBaseContext();
                            if (baseContext2 == null) {
                                int i104 = SdkCoreAlternateContactlessPaymentDataImpl;
                                int i105 = (i104 | 71) << 1;
                                int i106 = -((i104 & (-72)) | ((~i104) & 71));
                                getProfileVersion = ((i105 & i106) + (i106 | i105)) % 128;
                                int i107 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int i108 = (i107 | 226) << 1;
                                int i109 = -(i107 ^ 226);
                                int i110 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int i111 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int i112 = i111 & 25;
                                int i113 = (i111 | 25) & (~i112);
                                int i114 = -(-(i112 << 1));
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                b("\u0000\uffdeￋ\r\r\ufffeￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\u0001\ufffe\u0002\u000f\u0005\ufff1\u0016\u0011\u0006\u0013\u0006\u0011", true, (i108 & i109) + (i109 | i108), 13 - (~i110), ((i113 | i114) << 1) - (i113 ^ i114), objArr21);
                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                int i115 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int i116 = i115 & 282;
                                int i117 = (i115 | 282) & (~i116);
                                int i118 = -(-(i116 << 1));
                                int i119 = -android.view.KeyEvent.keyCodeFromString("");
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                b("\ufff9\u0004\u0005\uffff\n\ufff7\ufff9\uffff\u0002\u0006\u0006ￗ\n\u0004\ufffb\b\b\u000b", true, (i117 & i118) + (i117 | i118), (((~i119) & 1) | (i119 & (-2))) + ((i119 & 1) << 1), 18 - android.text.TextUtils.getOffsetAfter("", 0), objArr22);
                                baseContext2 = (android.content.Context) cls10.getMethod((java.lang.String) objArr22[0], new java.lang.Class[0]).invoke(null, null);
                                int i120 = getProfileVersion;
                                int i121 = i120 & 55;
                                int i122 = (i120 ^ 55) | i121;
                                SdkCoreAlternateContactlessPaymentDataImpl = ((i121 ^ i122) + ((i122 & i121) << 1)) % 128;
                            }
                            if (baseContext2 != null) {
                                int i123 = getProfileVersion;
                                int i124 = ((i123 ^ 53) | (i123 & 53)) << 1;
                                int i125 = -((i123 & (-54)) | ((~i123) & 53));
                                int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                                SdkCoreAlternateContactlessPaymentDataImpl = i126 % 128;
                                if (i126 % 2 != 0) {
                                    baseContext2.getApplicationContext();
                                    throw null;
                                }
                                baseContext2 = baseContext2.getApplicationContext();
                                int i127 = SdkCoreAlternateContactlessPaymentDataImpl;
                                getProfileVersion = ((((i127 ^ 121) | (i127 & 121)) << 1) - ((i127 & (-122)) | ((~i127) & 121))) % 128;
                            }
                            int i128 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                            int identityHashCode3 = java.lang.System.identityHashCode(this);
                            int i129 = i128 * 866;
                            int i130 = ((-195264) ^ i129) + ((i129 & (-195264)) << 1);
                            int i131 = ~i128;
                            int i132 = (i131 | i128) & i131;
                            int i133 = ~identityHashCode3;
                            int i134 = (i133 | identityHashCode3) & i133;
                            int i135 = i132 ^ i134;
                            int i136 = i132 & i134;
                            int i137 = ~((i136 ^ i135) | (i135 & i136));
                            int i138 = -(-(((i137 ^ (-227)) | (i137 & (-227))) * (-865)));
                            int i139 = (i130 ^ i138) + ((i130 & i138) << 1);
                            int i140 = (i131 & identityHashCode3) | (i128 & i133);
                            int i141 = identityHashCode3 & i128;
                            int i142 = (~((i141 ^ i140) | (i140 & i141))) * 865;
                            int i143 = ((~i133) & (-227)) | (i133 & 226);
                            int i144 = i133 & (-227);
                            int i145 = ~((i143 ^ i144) | (i143 & i144));
                            int i146 = ~((i128 ^ i134) | (i128 & i134));
                            int i147 = ((~i146) & i145) | ((~i145) & i146);
                            int i148 = i146 & i145;
                            int i149 = -android.graphics.Color.argb(0, 0, 0, 0);
                            int identityHashCode4 = java.lang.System.identityHashCode(this);
                            int i150 = i149 * (-55);
                            int i151 = (i150 | (-605)) << 1;
                            int i152 = -((i150 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR) | ((~i150) & (-605)));
                            int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                            int i154 = i149 & identityHashCode4;
                            int i155 = ~identityHashCode4;
                            int i156 = ~(((identityHashCode4 | i149) & (~i154)) | i154);
                            int i157 = i156 ^ 11;
                            int i158 = i156 & 11;
                            int i159 = -(-(((i158 ^ i157) | (i158 & i157)) * 56));
                            int i160 = i153 & i159;
                            int i161 = (i159 ^ i153) | i160;
                            int i162 = ((i160 | i161) << 1) - (i161 ^ i160);
                            int i163 = i149 & 11;
                            int i164 = (~i163) & (i149 | 11);
                            int i165 = (~((i163 ^ i164) | (i163 & i164))) * (-56);
                            int i166 = i162 & i165;
                            int i167 = (i165 ^ i162) | i166;
                            int i168 = (i166 ^ i167) + ((i167 & i166) << 1);
                            int i169 = i155 ^ 11;
                            int i170 = i155 & 11;
                            int i171 = (i169 ^ i170) | (i170 & i169);
                            int i172 = ~i171;
                            int i173 = (i171 | i172) & i172;
                            int i174 = ((~i173) & i149) | ((~i149) & i173);
                            int i175 = i149 & i173;
                            int i176 = -(-(((i175 ^ i174) | (i175 & i174)) * 56));
                            int i177 = ((~i176) & i168) | ((~i168) & i176);
                            int i178 = (i176 & i168) << 1;
                            int i179 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i180 = i179 ^ 16;
                            int i181 = -(-((i179 & 16) << 1));
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, ((((i139 ^ i142) - (~((i142 & i139) << 1))) - 1) - (~(((i148 ^ i147) | (i148 & i147)) * 865))) - 1, (i177 ^ i178) + ((i178 & i177) << 1), ((i180 | i181) << 1) - (i181 ^ i180), objArr23);
                            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            int i182 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                            int identityHashCode5 = java.lang.System.identityHashCode(this);
                            int i183 = i182 * (-500);
                            int i184 = (114999 & i183) | ((~i183) & (-115000));
                            int i185 = (i183 & (-115000)) << 1;
                            int i186 = (i184 & i185) + (i185 | i184);
                            int i187 = (i182 ^ (-231)) | (i182 & (-231));
                            int i188 = ~i187;
                            int i189 = (i187 | i188) & i188;
                            int i190 = ~i182;
                            int i191 = i190 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
                            int i192 = (~i191) & (i190 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
                            int i193 = (i191 ^ i192) | (i191 & i192);
                            int i194 = i193 & identityHashCode5;
                            int i195 = (i193 | identityHashCode5) & (~i194);
                            int i196 = ~((i195 ^ i194) | (i195 & i194));
                            int i197 = ((~i196) & i189) | ((~i189) & i196);
                            int i198 = i189 & i196;
                            int i199 = ((i198 ^ i197) | (i198 & i197)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                            int i200 = ((~i199) & i186) | ((~i186) & i199);
                            int i201 = -(-((i199 & i186) << 1));
                            int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                            int i203 = i190 & (-231);
                            int i204 = (~i203) & (i190 | (-231));
                            int i205 = (~((i203 ^ i204) | (i203 & i204))) * 1002;
                            int i206 = (((i202 ^ i205) | (i202 & i205)) << 1) - (((~i205) & i202) | ((~i202) & i205));
                            int i207 = ~identityHashCode5;
                            int i208 = ((~i207) & i190) | ((~i190) & i207);
                            int i209 = i190 & i207;
                            int i210 = (i209 ^ i208) | (i209 & i208);
                            int i211 = i210 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
                            int i212 = (i210 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) & (~i211);
                            int i213 = -(-((~((i212 ^ i211) | (i212 & i211))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            int i214 = i206 ^ i213;
                            int i215 = -(~(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                            int i216 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                            int i217 = ((i216 ^ 17) | (i216 & 17)) << 1;
                            int i218 = -(((~i216) & 17) | (i216 & (-18)));
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, (((i213 & i206) | i214) << 1) - i214, (-2) - (~((i215 & 7) + (i215 | 7))), ((i217 | i218) << 1) - (i218 ^ i217), objArr24);
                            int intValue2 = ((java.lang.Integer) cls11.getMethod((java.lang.String) objArr24[0], java.lang.Object.class).invoke(null, this)).intValue();
                            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int identityHashCode6 = java.lang.System.identityHashCode(this);
                            int i219 = scrollBarFadeDuration * (-432);
                            int i220 = ((87235 & i219) + (i219 | 87235)) - 1;
                            int i221 = ~scrollBarFadeDuration;
                            int i222 = ~identityHashCode6;
                            int i223 = i221 & i222;
                            int i224 = (i222 | i221) & (~i223);
                            int i225 = (i223 ^ i224) | (i224 & i223);
                            int i226 = (i225 & (-202)) | ((~i225) & 201);
                            int i227 = i225 & 201;
                            int i228 = (~((i227 ^ i226) | (i227 & i226))) * 433;
                            int i229 = i220 & i228;
                            int i230 = -(-((i220 ^ i228) | i229));
                            int i231 = (i222 & (-202)) | (identityHashCode6 & 201);
                            int i232 = identityHashCode6 & (-202);
                            int i233 = (i231 ^ i232) | (i231 & i232);
                            int i234 = ~i233;
                            int i235 = (i233 | i234) & i234;
                            int i236 = i221 ^ identityHashCode6;
                            int i237 = identityHashCode6 & i221;
                            int i238 = scrollBarFadeDuration & 201;
                            int i239 = (scrollBarFadeDuration | 201) & (~i238);
                            int i240 = (i239 ^ i238) | (i239 & i238);
                            int i241 = -(android.os.Process.myTid() >> 22);
                            int identityHashCode7 = java.lang.System.identityHashCode(this);
                            int i242 = i241 * (-559);
                            int i243 = ((i242 ^ 25806) | (i242 & 25806)) << 1;
                            int i244 = -((i242 & (-25807)) | ((~i242) & 25806));
                            int i245 = ((i243 | i244) << 1) - (i244 ^ i243);
                            int i246 = ~identityHashCode7;
                            int i247 = ~i241;
                            map = data;
                            int i248 = (i246 & i247) | ((~i246) & i241);
                            int i249 = i246 & i241;
                            int i250 = (~((i249 & i248) | (i248 ^ i249))) * (-560);
                            context = baseContext2;
                            int i251 = ((~i250) & i245) | ((~i245) & i250);
                            int i252 = (i250 & i245) << 1;
                            int i253 = (i251 ^ i252) + ((i252 & i251) << 1);
                            int i254 = (i241 & (-47)) | (i247 & (-47)) | (i241 & 46);
                            int i255 = (i254 & i246) | ((~i254) & identityHashCode7);
                            int i256 = i254 & identityHashCode7;
                            int i257 = (i256 ^ i255) | (i256 & i255);
                            int i258 = ~i257;
                            int i259 = ((i257 | i258) & i258) * (-560);
                            int i260 = i253 ^ i259;
                            int i261 = ((i259 & i253) | i260) << 1;
                            int i262 = -i260;
                            int i263 = i247 & 46;
                            int i264 = (i247 | 46) & (~i263);
                            int i265 = (identityHashCode7 | i246) & i246;
                            int i266 = i265 & 46;
                            int i267 = (i265 | 46) & (~i266);
                            int i268 = -(-(((~((i263 ^ i264) | (i263 & i264))) | (~((i267 & i266) | (i267 ^ i266)))) * 560));
                            int i269 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int identityHashCode8 = java.lang.System.identityHashCode(this);
                            int i270 = i269 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                            int i271 = (i270 ^ (-17073)) + ((i270 & (-17073)) << 1);
                            int i272 = ~i269;
                            int i273 = (i272 ^ (-64)) | (i272 & (-64));
                            int i274 = ~identityHashCode8;
                            int i275 = i273 & i274;
                            int i276 = (i274 | i273) & (~i275);
                            int i277 = (i276 ^ i275) | (i276 & i275);
                            int i278 = ~i277;
                            int i279 = (i277 | i278) & i278;
                            int i280 = i269 & 63;
                            int i281 = (~i280) & (i269 | 63);
                            int i282 = (i280 ^ i281) | (i280 & i281);
                            int i283 = i282 & identityHashCode8;
                            int i284 = (i282 | identityHashCode8) & (~i283);
                            int i285 = ~((i284 ^ i283) | (i284 & i283));
                            int i286 = -(-(((i279 ^ i285) | (i279 & i285)) * (-272)));
                            int i287 = i271 & i286;
                            int i288 = (i287 - (~(-(-((i286 ^ i271) | i287))))) - 1;
                            int i289 = i272 & 63;
                            int i290 = (~i289) & (i272 | 63);
                            int i291 = (i289 ^ i290) | (i289 & i290);
                            int i292 = ~i291;
                            int i293 = (i291 | i292) & i292;
                            int i294 = (i272 | i269) & i272;
                            int i295 = i294 ^ identityHashCode8;
                            int i296 = i294 & identityHashCode8;
                            int i297 = ~((i296 ^ i295) | (i296 & i295));
                            int i298 = ((~i297) & i293) | ((~i293) & i297);
                            int i299 = i293 & i297;
                            int i300 = -(-(((i299 ^ i298) | (i299 & i298)) * (-272)));
                            int i301 = i269 ^ identityHashCode8;
                            int i302 = i269 & identityHashCode8;
                            int i303 = ~((i301 ^ i302) | (i302 & i301));
                            int i304 = ((i288 ^ i300) + ((i300 & i288) << 1)) - (~(((i303 & 63) | (i303 ^ 63)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            int i305 = (((i229 ^ i230) + ((i230 & i229) << 1)) - (~(((i221 ^ i235) | (i221 & i235)) * (-433)))) - 1;
                            int i306 = ~i240;
                            b("\ufff0￩\u001d￩\u001b\u001c￮\u001d\u001a\u001b￪￪￨\u001d\u001b\u001b￩￭\u001c￬\u001a￫\ufff0￫￪\u001d￬￮\u0019￮\ufff0￫￮\u0018\u001c\ufff0￩\ufff0\u001a￫￪\u001c￨￭\u001a\u0019￬\u0019\u0018￫\u001b\u001c\uffe7\uffe7￨\u001c\u001d\ufff0\u001a\u0019\u001c\u0019￩\uffe7", true, (i305 - (~(((i306 & (i240 | i306)) | (~((i237 & i236) | (i237 ^ i236)))) * 433))) - 1, (-2) - (~(((i261 ^ i262) + ((i261 & i262) << 1)) - (~i268))), (~i304) + (i304 << 1), objArr25);
                            java.lang.String str2 = (java.lang.String) objArr25[0];
                            int i307 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                            int identityHashCode9 = java.lang.System.identityHashCode(this);
                            int i308 = deadChar * (-464);
                            int i309 = (-34373) ^ i308;
                            int i310 = (i308 & (-34373)) << 1;
                            int i311 = (i309 & i310) + (i310 | i309);
                            int i312 = ~deadChar;
                            int i313 = (deadChar | i312) & i312;
                            int i314 = identityHashCode9 & 37;
                            int i315 = (identityHashCode9 ^ 37) | i314;
                            int i316 = ~i315;
                            int i317 = (i315 | i316) & i316;
                            int i318 = ((~i317) & i313) | ((~i313) & i317);
                            int i319 = i317 & i313;
                            int i320 = ((i319 ^ i318) | (i319 & i318)) * (-465);
                            int i321 = i311 & i320;
                            int i322 = (i311 | i320) & (~i321);
                            int i323 = -(-(i321 << 1));
                            int i324 = (i322 & i323) + (i322 | i323);
                            int i325 = ~identityHashCode9;
                            int i326 = (i312 & i325) | ((~i312) & identityHashCode9);
                            int i327 = i312 & identityHashCode9;
                            int i328 = ~((i327 ^ i326) | (i327 & i326));
                            int i329 = i328 & 37;
                            int i330 = (i328 | 37) & (~i329);
                            int i331 = -(-(((i330 ^ i329) | (i330 & i329)) * 930));
                            int i332 = i324 & i331;
                            int i333 = (i331 | i324) & (~i332);
                            int i334 = i332 << 1;
                            int i335 = (i333 ^ i334) + ((i333 & i334) << 1);
                            int i336 = (identityHashCode9 & (-38)) | (i325 & 37);
                            int i337 = (i336 ^ i314) | (i336 & i314);
                            int i338 = -(-(((i337 ^ i313) | (i337 & i313)) * 465));
                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i339 = makeMeasureSpec & 64;
                            int i340 = (makeMeasureSpec ^ 64) | i339;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            b("\u001f￬￪\u001c\ufff2￮ ￮\ufff3\u001b￭￫￪\ufff1\uffef ￮\ufff1 \u001e￭\u001b￪\ufff1\ufff3\ufff2￬\u001e\ufff2\u001d\u001b \u001f  \u001e\ufff3\u001c￮\uffef￭\u001e￭\ufff1\u001d\ufff1\ufff2￬\ufff2\uffef\ufff0 \ufff1\ufff2￬\u001b\ufff2\u001f￪\ufff3 ￫￮\u001f", false, 197 - (~i307), (((i335 ^ i338) | (i335 & i338)) << 1) - (((~i338) & i335) | ((~i335) & i338)), (i339 ^ i340) + ((i340 & i339) << 1), objArr26);
                            java.lang.String str3 = (java.lang.String) objArr26[0];
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            c("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{15, 64, 0, 0}, objArr27);
                            java.lang.String str4 = (java.lang.String) objArr27[0];
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            c("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{79, 64, 136, 0}, objArr28);
                            java.lang.Object[] objArr29 = {context, new java.lang.String[]{str2, str3, str4, (java.lang.String) objArr28[0]}, java.lang.Integer.valueOf(intValue2), num, -992839718};
                            byte[] bArr4 = $$d;
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            d((byte) (bArr4[526] - 1), bArr4[164], 629, objArr30);
                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                            byte b8 = bArr4[10];
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            d(b8, (byte) (b8 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE), 634, objArr31);
                            java.lang.String str5 = (java.lang.String) objArr31[0];
                            int i341 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int identityHashCode10 = java.lang.System.identityHashCode(this);
                            int i342 = i341 * 960;
                            int i343 = (-241542) ^ i342;
                            int i344 = -(-((i342 & (-241542)) << 1));
                            int i345 = (i343 & i344) + (i344 | i343);
                            int i346 = ~identityHashCode10;
                            int i347 = i346 ^ androidx.compose.runtime.ComposerKt.defaultsKey;
                            int i348 = i346 & androidx.compose.runtime.ComposerKt.defaultsKey;
                            int i349 = (i347 ^ i348) | (i348 & i347);
                            int i350 = ~i349;
                            int i351 = (i349 | i350) & i350;
                            int i352 = ((~i341) & identityHashCode10) | (i341 & i346);
                            int i353 = i341 & identityHashCode10;
                            int i354 = ~((i352 & i353) | (i352 ^ i353));
                            int i355 = i351 ^ i354;
                            int i356 = i351 & i354;
                            int i357 = -(~(-(-(((i356 ^ i355) | (i356 & i355)) * 959))));
                            int i358 = 121791 - (~(((i345 | i357) << 1) - (i357 ^ i345)));
                            int i359 = identityHashCode10 & androidx.compose.runtime.ComposerKt.defaultsKey;
                            int i360 = (identityHashCode10 | androidx.compose.runtime.ComposerKt.defaultsKey) & (~i359);
                            int i361 = ~((i359 ^ i360) | (i360 & i359));
                            int i362 = (identityHashCode10 | i346) & i346;
                            int i363 = i362 & i341;
                            int i364 = (i341 | i362) & (~i363);
                            int i365 = ~((i364 ^ i363) | (i364 & i363));
                            int i366 = ((~i365) & i361) | ((~i361) & i365);
                            int i367 = i365 & i361;
                            int i368 = -(-(((i367 ^ i366) | (i367 & i366)) * 959));
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            e(null, null, (i358 & i368) + (i368 | i358), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr32);
                            objArr2 = (java.lang.Object[]) cls12.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr32[0]), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr29);
                            int i369 = ((int[]) objArr2[1])[0];
                            int i370 = ((int[]) objArr2[0])[0];
                            if (context != null) {
                                int i371 = getProfileVersion;
                                int i372 = i371 & 63;
                                int i373 = (i371 ^ 63) | i372;
                                SdkCoreAlternateContactlessPaymentDataImpl = ((i372 & i373) + (i373 | i372)) % 128;
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 27, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 429, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 31610));
                                byte b9 = bArr[11];
                                byte b10 = (byte) (b9 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                a(b9, b10, (byte) (b10 + 3), objArr33);
                                cls13.getField((java.lang.String) objArr33[0]).set(null, objArr2);
                                try {
                                    long packedPositionForChild2 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                    int i374 = (-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))) & 1;
                                    int i375 = -android.text.TextUtils.indexOf("", "");
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, 226 - (packedPositionForChild2 > 0L ? 1 : (packedPositionForChild2 == 0L ? 0 : -1)), (i374 - (~((r0 ^ 1) | i374))) - 1, (i375 & 22) + (i375 | 22), objArr34);
                                    java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr35);
                                    long longValue = ((java.lang.Long) cls14.getDeclaredMethod((java.lang.String) objArr35[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.os.Process.myPid() >> 22) + 429, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 31610));
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    a(bArr[7], (byte) 69, bArr[34], objArr36);
                                    cls15.getField((java.lang.String) objArr36[0]).set(null, java.lang.Long.valueOf(longValue));
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 43) % 128;
                                } catch (java.lang.Exception unused) {
                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                }
                            }
                            i = ((int[]) objArr2[1])[0];
                            i2 = ((int[]) objArr2[0])[0];
                            if (i2 == i) {
                            }
                            map2 = map;
                            if (!map2.containsKey("payload")) {
                            }
                            if (!com.payair.hce.setClickable.AlternateContactlessPaymentDataJson()) {
                            }
                            int i1002 = SdkCoreAlternateContactlessPaymentDataImpl;
                            int i1012 = i1002 & 37;
                            int i1022 = (i1002 | 37) & (~i1012);
                            int i1032 = i1012 << 1;
                            i3 = (i1022 & i1032) + (i1022 | i1032);
                            getProfileVersion = i3 % 128;
                            if (i3 % 2 == 0) {
                            }
                        }
                    } else {
                        num = 0;
                    }
                    java.lang.Object[] objArr37 = {baseContext, java.lang.Integer.valueOf(intValue), num, 259126190};
                    byte[] bArr5 = $$d;
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    d((byte) (bArr5[0] - 1), bArr5[164], 711, objArr38);
                    java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr38[0]);
                    byte b11 = bArr5[10];
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    d(b11, (byte) (b11 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE), 634, objArr39);
                    java.lang.String str6 = (java.lang.String) objArr39[0];
                    int i376 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int identityHashCode11 = java.lang.System.identityHashCode(this);
                    int i377 = i376 * (-519);
                    int i378 = ((65646 ^ i377) | (65646 & i377)) << 1;
                    int i379 = -((i377 & (-65647)) | ((~i377) & 65646));
                    int i380 = (i378 & i379) + (i379 | i378);
                    int i381 = ~i376;
                    int i382 = (i381 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i381 & androidx.compose.runtime.ComposerKt.defaultsKey);
                    int i383 = ~identityHashCode11;
                    int i384 = (~i382) & i383;
                    int i385 = ~i383;
                    int i386 = i384 | (i385 & i382);
                    int i387 = i382 & i383;
                    int i388 = (i387 ^ i386) | (i386 & i387);
                    int i389 = ~i388;
                    int i390 = (i388 | i389) & i389;
                    int i391 = ~((identityHashCode11 ^ 126) | (identityHashCode11 & 126));
                    int i392 = i390 & i391;
                    bArr = bArr2;
                    int i393 = -(-((((i390 | i391) & (~i392)) | i392) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                    int i394 = (i385 & androidx.compose.runtime.ComposerKt.defaultsKey) | (i383 & 126);
                    int i395 = i383 & androidx.compose.runtime.ComposerKt.defaultsKey;
                    int i396 = (i394 ^ i395) | (i394 & i395);
                    int i397 = ~i396;
                    int i398 = (i396 | i397) & i397;
                    int i399 = i376 ^ identityHashCode11;
                    int i400 = i376 & identityHashCode11;
                    int i401 = ~((i399 ^ i400) | (i399 & i400));
                    int i402 = i398 ^ i401;
                    int i403 = i398 & i401;
                    int i404 = (((i380 & i393) + (i393 | i380)) - (~(-(~(-(-(((i403 & i402) | (i402 ^ i403)) * (-1040)))))))) - 2;
                    int i405 = (i383 | identityHashCode11) & i383;
                    int i406 = ((~i405) & i381) | ((~i381) & i405);
                    int i407 = i405 & i381;
                    int i408 = (i407 ^ i406) | (i407 & i406);
                    int i409 = ~i408;
                    int i410 = (i408 | i409) & i409;
                    int i411 = i376 & androidx.compose.runtime.ComposerKt.defaultsKey;
                    int i412 = (i376 | androidx.compose.runtime.ComposerKt.defaultsKey) & (~i411);
                    int i413 = (i411 & i412) | (i412 ^ i411);
                    int i414 = ~i413;
                    int i415 = (i413 | i414) & i414;
                    int i416 = i410 & i415;
                    int i417 = (i410 | i415) & (~i416);
                    int i418 = (i417 ^ i416) | (i417 & i416);
                    int i419 = (i376 & i383) | (identityHashCode11 & i381);
                    int i420 = ~((i419 ^ i400) | (i419 & i400));
                    int i421 = -(-(((i420 ^ i418) | (i418 & i420)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                    int i422 = i404 & i421;
                    int i423 = -(-((i421 ^ i404) | i422));
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    e(null, null, (i422 & i423) + (i423 | i422), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr40);
                    java.lang.Object[] objArr41 = (java.lang.Object[]) cls16.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr40[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr37);
                    if (baseContext != null) {
                        int i424 = getProfileVersion;
                        int i425 = i424 & 69;
                        SdkCoreAlternateContactlessPaymentDataImpl = (((((i424 ^ 69) | i425) << 1) - (~(-((i424 | 69) & (~i425))))) - 1) % 128;
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 48, android.widget.ExpandableListView.getPackedPositionType(0L) + 1581, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        a(bArr[7], (byte) 69, bArr[34], objArr42);
                        cls17.getField((java.lang.String) objArr42[0]).set(null, objArr41);
                        try {
                            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                            int i426 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                            int i427 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int identityHashCode12 = java.lang.System.identityHashCode(this);
                            int i428 = (i427 * 595) - 24927;
                            int i429 = ~i427;
                            int i430 = (i429 | i427) & i429;
                            int i431 = ~(((~i430) & 21) | (i430 & (-22)) | (i430 & 21));
                            int i432 = ~identityHashCode12;
                            int i433 = i432 & 21;
                            int i434 = (~i433) & (i432 | 21);
                            int i435 = ~((i433 ^ i434) | (i433 & i434));
                            int i436 = ((~i435) & i431) | ((~i431) & i435);
                            int i437 = i431 & i435;
                            int i438 = ((i437 ^ i436) | (i437 & i436)) * (-1188);
                            int i439 = (i428 ^ i438) + ((i428 & i438) << 1);
                            int i440 = i429 & 21;
                            int i441 = ~(i440 | ((~i440) & (i429 | 21)));
                            int i442 = identityHashCode12 & (-22);
                            int i443 = (~i442) & (identityHashCode12 | (-22));
                            int i444 = ~((i442 & i443) | (i443 ^ i442));
                            int i445 = i441 & i444;
                            int i446 = ((i441 | i444) & (~i445)) | i445;
                            int i447 = (identityHashCode12 | i432) & i432;
                            int i448 = (i429 & i447) | ((~i447) & i427);
                            int i449 = i447 & i427;
                            int i450 = ~((i449 ^ i448) | (i449 & i448));
                            int i451 = i446 & i450;
                            int i452 = (i450 | i446) & (~i451);
                            int i453 = -(~(-(-(((i452 ^ i451) | (i452 & i451)) * 594))));
                            int i454 = ((i439 & i453) + (i453 | i439)) - 1;
                            int i455 = ~((i432 ^ (-22)) | (i432 & (-22)));
                            int i456 = i427 & (-22);
                            int i457 = (i427 | (-22)) & (~i456);
                            int i458 = ~((i456 ^ i457) | (i457 & i456));
                            int i459 = (i455 ^ i458) | (i455 & i458);
                            int i460 = i432 ^ i427;
                            int i461 = i427 & i432;
                            int i462 = (i461 ^ i460) | (i461 & i460);
                            int i463 = ~i462;
                            int i464 = (i462 | i463) & i463;
                            int i465 = i459 ^ i464;
                            int i466 = i464 & i459;
                            int i467 = -(-(((i466 ^ i465) | (i466 & i465)) * 594));
                            int i468 = i454 & i467;
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, capsMode + 227, i426, (((i454 ^ i467) | i468) << 1) - ((i467 | i454) & (~i468)), objArr43);
                            java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr44);
                            long longValue2 = ((java.lang.Long) cls18.getDeclaredMethod((java.lang.String) objArr44[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 48, android.view.KeyEvent.normalizeMetaState(0) + 1581, (char) (android.os.Process.myTid() >> 22));
                            byte b12 = bArr[24];
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            a(b12, (byte) (b12 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr45);
                            cls19.getField((java.lang.String) objArr45[0]).set(null, java.lang.Long.valueOf(longValue2));
                            int i469 = getProfileVersion;
                            int i470 = (i469 & (-32)) | ((~i469) & 31);
                            int i471 = (i469 & 31) << 1;
                            SdkCoreAlternateContactlessPaymentDataImpl = ((i470 & i471) + (i471 | i470)) % 128;
                        } catch (java.lang.Exception unused2) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                    }
                    objArr = objArr41;
                    if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
                    }
                    java.util.Map<java.lang.String, java.lang.String> data2 = remoteMessage.getData();
                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 429, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 31611));
                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                    a(bArr[7], (byte) 69, bArr[34], objArr112);
                    j = cls62.getField((java.lang.String) objArr112[0]).getLong(null);
                    if (j != -1) {
                    }
                    baseContext2 = getBaseContext();
                    if (baseContext2 == null) {
                    }
                    if (baseContext2 != null) {
                    }
                    int i1282 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int identityHashCode32 = java.lang.System.identityHashCode(this);
                    int i1292 = i1282 * 866;
                    int i1302 = ((-195264) ^ i1292) + ((i1292 & (-195264)) << 1);
                    int i1312 = ~i1282;
                    int i1322 = (i1312 | i1282) & i1312;
                    int i1332 = ~identityHashCode32;
                    int i1342 = (i1332 | identityHashCode32) & i1332;
                    int i1352 = i1322 ^ i1342;
                    int i1362 = i1322 & i1342;
                    int i1372 = ~((i1362 ^ i1352) | (i1352 & i1362));
                    int i1382 = -(-(((i1372 ^ (-227)) | (i1372 & (-227))) * (-865)));
                    int i1392 = (i1302 ^ i1382) + ((i1302 & i1382) << 1);
                    int i1402 = (i1312 & identityHashCode32) | (i1282 & i1332);
                    int i1412 = identityHashCode32 & i1282;
                    int i1422 = (~((i1412 ^ i1402) | (i1402 & i1412))) * 865;
                    int i1432 = ((~i1332) & (-227)) | (i1332 & 226);
                    int i1442 = i1332 & (-227);
                    int i1452 = ~((i1432 ^ i1442) | (i1432 & i1442));
                    int i1462 = ~((i1282 ^ i1342) | (i1282 & i1342));
                    int i1472 = ((~i1462) & i1452) | ((~i1452) & i1462);
                    int i1482 = i1462 & i1452;
                    int i1492 = -android.graphics.Color.argb(0, 0, 0, 0);
                    int identityHashCode42 = java.lang.System.identityHashCode(this);
                    int i1502 = i1492 * (-55);
                    int i1512 = (i1502 | (-605)) << 1;
                    int i1522 = -((i1502 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR) | ((~i1502) & (-605)));
                    int i1532 = ((i1512 | i1522) << 1) - (i1522 ^ i1512);
                    int i1542 = i1492 & identityHashCode42;
                    int i1552 = ~identityHashCode42;
                    int i1562 = ~(((identityHashCode42 | i1492) & (~i1542)) | i1542);
                    int i1572 = i1562 ^ 11;
                    int i1582 = i1562 & 11;
                    int i1592 = -(-(((i1582 ^ i1572) | (i1582 & i1572)) * 56));
                    int i1602 = i1532 & i1592;
                    int i1612 = (i1592 ^ i1532) | i1602;
                    int i1622 = ((i1602 | i1612) << 1) - (i1612 ^ i1602);
                    int i1632 = i1492 & 11;
                    int i1642 = (~i1632) & (i1492 | 11);
                    int i1652 = (~((i1632 ^ i1642) | (i1632 & i1642))) * (-56);
                    int i1662 = i1622 & i1652;
                    int i1672 = (i1652 ^ i1622) | i1662;
                    int i1682 = (i1662 ^ i1672) + ((i1672 & i1662) << 1);
                    int i1692 = i1552 ^ 11;
                    int i1702 = i1552 & 11;
                    int i1712 = (i1692 ^ i1702) | (i1702 & i1692);
                    int i1722 = ~i1712;
                    int i1732 = (i1712 | i1722) & i1722;
                    int i1742 = ((~i1732) & i1492) | ((~i1492) & i1732);
                    int i1752 = i1492 & i1732;
                    int i1762 = -(-(((i1752 ^ i1742) | (i1752 & i1742)) * 56));
                    int i1772 = ((~i1762) & i1682) | ((~i1682) & i1762);
                    int i1782 = (i1762 & i1682) << 1;
                    int i1792 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                    int i1802 = i1792 ^ 16;
                    int i1812 = -(-((i1792 & 16) << 1));
                    java.lang.Object[] objArr232 = new java.lang.Object[1];
                    b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, ((((i1392 ^ i1422) - (~((i1422 & i1392) << 1))) - 1) - (~(((i1482 ^ i1472) | (i1482 & i1472)) * 865))) - 1, (i1772 ^ i1782) + ((i1782 & i1772) << 1), ((i1802 | i1812) << 1) - (i1812 ^ i1802), objArr232);
                    java.lang.Class<?> cls112 = java.lang.Class.forName((java.lang.String) objArr232[0]);
                    int i1822 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int identityHashCode52 = java.lang.System.identityHashCode(this);
                    int i1832 = i1822 * (-500);
                    int i1842 = (114999 & i1832) | ((~i1832) & (-115000));
                    int i1852 = (i1832 & (-115000)) << 1;
                    int i1862 = (i1842 & i1852) + (i1852 | i1842);
                    int i1872 = (i1822 ^ (-231)) | (i1822 & (-231));
                    int i1882 = ~i1872;
                    int i1892 = (i1872 | i1882) & i1882;
                    int i1902 = ~i1822;
                    int i1912 = i1902 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
                    int i1922 = (~i1912) & (i1902 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
                    int i1932 = (i1912 ^ i1922) | (i1912 & i1922);
                    int i1942 = i1932 & identityHashCode52;
                    int i1952 = (i1932 | identityHashCode52) & (~i1942);
                    int i1962 = ~((i1952 ^ i1942) | (i1952 & i1942));
                    int i1972 = ((~i1962) & i1892) | ((~i1892) & i1962);
                    int i1982 = i1892 & i1962;
                    int i1992 = ((i1982 ^ i1972) | (i1982 & i1972)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                    int i2002 = ((~i1992) & i1862) | ((~i1862) & i1992);
                    int i2012 = -(-((i1992 & i1862) << 1));
                    int i2022 = (i2002 ^ i2012) + ((i2012 & i2002) << 1);
                    int i2032 = i1902 & (-231);
                    int i2042 = (~i2032) & (i1902 | (-231));
                    int i2052 = (~((i2032 ^ i2042) | (i2032 & i2042))) * 1002;
                    int i2062 = (((i2022 ^ i2052) | (i2022 & i2052)) << 1) - (((~i2052) & i2022) | ((~i2022) & i2052));
                    int i2072 = ~identityHashCode52;
                    int i2082 = ((~i2072) & i1902) | ((~i1902) & i2072);
                    int i2092 = i1902 & i2072;
                    int i2102 = (i2092 ^ i2082) | (i2092 & i2082);
                    int i2112 = i2102 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
                    int i2122 = (i2102 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) & (~i2112);
                    int i2132 = -(-((~((i2122 ^ i2112) | (i2122 & i2112))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                    int i2142 = i2062 ^ i2132;
                    int i2152 = -(~(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    int i2162 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                    int i2172 = ((i2162 ^ 17) | (i2162 & 17)) << 1;
                    int i2182 = -(((~i2162) & 17) | (i2162 & (-18)));
                    java.lang.Object[] objArr242 = new java.lang.Object[1];
                    b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, (((i2132 & i2062) | i2142) << 1) - i2142, (-2) - (~((i2152 & 7) + (i2152 | 7))), ((i2172 | i2182) << 1) - (i2182 ^ i2172), objArr242);
                    int intValue22 = ((java.lang.Integer) cls112.getMethod((java.lang.String) objArr242[0], java.lang.Object.class).invoke(null, this)).intValue();
                    int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    int identityHashCode62 = java.lang.System.identityHashCode(this);
                    int i2192 = scrollBarFadeDuration2 * (-432);
                    int i2202 = ((87235 & i2192) + (i2192 | 87235)) - 1;
                    int i2212 = ~scrollBarFadeDuration2;
                    int i2222 = ~identityHashCode62;
                    int i2232 = i2212 & i2222;
                    int i2242 = (i2222 | i2212) & (~i2232);
                    int i2252 = (i2232 ^ i2242) | (i2242 & i2232);
                    int i2262 = (i2252 & (-202)) | ((~i2252) & 201);
                    int i2272 = i2252 & 201;
                    int i2282 = (~((i2272 ^ i2262) | (i2272 & i2262))) * 433;
                    int i2292 = i2202 & i2282;
                    int i2302 = -(-((i2202 ^ i2282) | i2292));
                    int i2312 = (i2222 & (-202)) | (identityHashCode62 & 201);
                    int i2322 = identityHashCode62 & (-202);
                    int i2332 = (i2312 ^ i2322) | (i2312 & i2322);
                    int i2342 = ~i2332;
                    int i2352 = (i2332 | i2342) & i2342;
                    int i2362 = i2212 ^ identityHashCode62;
                    int i2372 = identityHashCode62 & i2212;
                    int i2382 = scrollBarFadeDuration2 & 201;
                    int i2392 = (scrollBarFadeDuration2 | 201) & (~i2382);
                    int i2402 = (i2392 ^ i2382) | (i2392 & i2382);
                    int i2412 = -(android.os.Process.myTid() >> 22);
                    int identityHashCode72 = java.lang.System.identityHashCode(this);
                    int i2422 = i2412 * (-559);
                    int i2432 = ((i2422 ^ 25806) | (i2422 & 25806)) << 1;
                    int i2442 = -((i2422 & (-25807)) | ((~i2422) & 25806));
                    int i2452 = ((i2432 | i2442) << 1) - (i2442 ^ i2432);
                    int i2462 = ~identityHashCode72;
                    int i2472 = ~i2412;
                    map = data2;
                    int i2482 = (i2462 & i2472) | ((~i2462) & i2412);
                    int i2492 = i2462 & i2412;
                    int i2502 = (~((i2492 & i2482) | (i2482 ^ i2492))) * (-560);
                    context = baseContext2;
                    int i2512 = ((~i2502) & i2452) | ((~i2452) & i2502);
                    int i2522 = (i2502 & i2452) << 1;
                    int i2532 = (i2512 ^ i2522) + ((i2522 & i2512) << 1);
                    int i2542 = (i2412 & (-47)) | (i2472 & (-47)) | (i2412 & 46);
                    int i2552 = (i2542 & i2462) | ((~i2542) & identityHashCode72);
                    int i2562 = i2542 & identityHashCode72;
                    int i2572 = (i2562 ^ i2552) | (i2562 & i2552);
                    int i2582 = ~i2572;
                    int i2592 = ((i2572 | i2582) & i2582) * (-560);
                    int i2602 = i2532 ^ i2592;
                    int i2612 = ((i2592 & i2532) | i2602) << 1;
                    int i2622 = -i2602;
                    int i2632 = i2472 & 46;
                    int i2642 = (i2472 | 46) & (~i2632);
                    int i2652 = (identityHashCode72 | i2462) & i2462;
                    int i2662 = i2652 & 46;
                    int i2672 = (i2652 | 46) & (~i2662);
                    int i2682 = -(-(((~((i2632 ^ i2642) | (i2632 & i2642))) | (~((i2672 & i2662) | (i2672 ^ i2662)))) * 560));
                    int i2692 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int identityHashCode82 = java.lang.System.identityHashCode(this);
                    int i2702 = i2692 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                    int i2712 = (i2702 ^ (-17073)) + ((i2702 & (-17073)) << 1);
                    int i2722 = ~i2692;
                    int i2732 = (i2722 ^ (-64)) | (i2722 & (-64));
                    int i2742 = ~identityHashCode82;
                    int i2752 = i2732 & i2742;
                    int i2762 = (i2742 | i2732) & (~i2752);
                    int i2772 = (i2762 ^ i2752) | (i2762 & i2752);
                    int i2782 = ~i2772;
                    int i2792 = (i2772 | i2782) & i2782;
                    int i2802 = i2692 & 63;
                    int i2812 = (~i2802) & (i2692 | 63);
                    int i2822 = (i2802 ^ i2812) | (i2802 & i2812);
                    int i2832 = i2822 & identityHashCode82;
                    int i2842 = (i2822 | identityHashCode82) & (~i2832);
                    int i2852 = ~((i2842 ^ i2832) | (i2842 & i2832));
                    int i2862 = -(-(((i2792 ^ i2852) | (i2792 & i2852)) * (-272)));
                    int i2872 = i2712 & i2862;
                    int i2882 = (i2872 - (~(-(-((i2862 ^ i2712) | i2872))))) - 1;
                    int i2892 = i2722 & 63;
                    int i2902 = (~i2892) & (i2722 | 63);
                    int i2912 = (i2892 ^ i2902) | (i2892 & i2902);
                    int i2922 = ~i2912;
                    int i2932 = (i2912 | i2922) & i2922;
                    int i2942 = (i2722 | i2692) & i2722;
                    int i2952 = i2942 ^ identityHashCode82;
                    int i2962 = i2942 & identityHashCode82;
                    int i2972 = ~((i2962 ^ i2952) | (i2962 & i2952));
                    int i2982 = ((~i2972) & i2932) | ((~i2932) & i2972);
                    int i2992 = i2932 & i2972;
                    int i3002 = -(-(((i2992 ^ i2982) | (i2992 & i2982)) * (-272)));
                    int i3012 = i2692 ^ identityHashCode82;
                    int i3022 = i2692 & identityHashCode82;
                    int i3032 = ~((i3012 ^ i3022) | (i3022 & i3012));
                    int i3042 = ((i2882 ^ i3002) + ((i3002 & i2882) << 1)) - (~(((i3032 & 63) | (i3032 ^ 63)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                    java.lang.Object[] objArr252 = new java.lang.Object[1];
                    int i3052 = (((i2292 ^ i2302) + ((i2302 & i2292) << 1)) - (~(((i2212 ^ i2352) | (i2212 & i2352)) * (-433)))) - 1;
                    int i3062 = ~i2402;
                    b("\ufff0￩\u001d￩\u001b\u001c￮\u001d\u001a\u001b￪￪￨\u001d\u001b\u001b￩￭\u001c￬\u001a￫\ufff0￫￪\u001d￬￮\u0019￮\ufff0￫￮\u0018\u001c\ufff0￩\ufff0\u001a￫￪\u001c￨￭\u001a\u0019￬\u0019\u0018￫\u001b\u001c\uffe7\uffe7￨\u001c\u001d\ufff0\u001a\u0019\u001c\u0019￩\uffe7", true, (i3052 - (~(((i3062 & (i2402 | i3062)) | (~((i2372 & i2362) | (i2372 ^ i2362)))) * 433))) - 1, (-2) - (~(((i2612 ^ i2622) + ((i2612 & i2622) << 1)) - (~i2682))), (~i3042) + (i3042 << 1), objArr252);
                    java.lang.String str22 = (java.lang.String) objArr252[0];
                    int i3072 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0);
                    int identityHashCode92 = java.lang.System.identityHashCode(this);
                    int i3082 = deadChar2 * (-464);
                    int i3092 = (-34373) ^ i3082;
                    int i3102 = (i3082 & (-34373)) << 1;
                    int i3112 = (i3092 & i3102) + (i3102 | i3092);
                    int i3122 = ~deadChar2;
                    int i3132 = (deadChar2 | i3122) & i3122;
                    int i3142 = identityHashCode92 & 37;
                    int i3152 = (identityHashCode92 ^ 37) | i3142;
                    int i3162 = ~i3152;
                    int i3172 = (i3152 | i3162) & i3162;
                    int i3182 = ((~i3172) & i3132) | ((~i3132) & i3172);
                    int i3192 = i3172 & i3132;
                    int i3202 = ((i3192 ^ i3182) | (i3192 & i3182)) * (-465);
                    int i3212 = i3112 & i3202;
                    int i3222 = (i3112 | i3202) & (~i3212);
                    int i3232 = -(-(i3212 << 1));
                    int i3242 = (i3222 & i3232) + (i3222 | i3232);
                    int i3252 = ~identityHashCode92;
                    int i3262 = (i3122 & i3252) | ((~i3122) & identityHashCode92);
                    int i3272 = i3122 & identityHashCode92;
                    int i3282 = ~((i3272 ^ i3262) | (i3272 & i3262));
                    int i3292 = i3282 & 37;
                    int i3302 = (i3282 | 37) & (~i3292);
                    int i3312 = -(-(((i3302 ^ i3292) | (i3302 & i3292)) * 930));
                    int i3322 = i3242 & i3312;
                    int i3332 = (i3312 | i3242) & (~i3322);
                    int i3342 = i3322 << 1;
                    int i3352 = (i3332 ^ i3342) + ((i3332 & i3342) << 1);
                    int i3362 = (identityHashCode92 & (-38)) | (i3252 & 37);
                    int i3372 = (i3362 ^ i3142) | (i3362 & i3142);
                    int i3382 = -(-(((i3372 ^ i3132) | (i3372 & i3132)) * 465));
                    int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i3392 = makeMeasureSpec2 & 64;
                    int i3402 = (makeMeasureSpec2 ^ 64) | i3392;
                    java.lang.Object[] objArr262 = new java.lang.Object[1];
                    b("\u001f￬￪\u001c\ufff2￮ ￮\ufff3\u001b￭￫￪\ufff1\uffef ￮\ufff1 \u001e￭\u001b￪\ufff1\ufff3\ufff2￬\u001e\ufff2\u001d\u001b \u001f  \u001e\ufff3\u001c￮\uffef￭\u001e￭\ufff1\u001d\ufff1\ufff2￬\ufff2\uffef\ufff0 \ufff1\ufff2￬\u001b\ufff2\u001f￪\ufff3 ￫￮\u001f", false, 197 - (~i3072), (((i3352 ^ i3382) | (i3352 & i3382)) << 1) - (((~i3382) & i3352) | ((~i3352) & i3382)), (i3392 ^ i3402) + ((i3402 & i3392) << 1), objArr262);
                    java.lang.String str32 = (java.lang.String) objArr262[0];
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    c("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{15, 64, 0, 0}, objArr272);
                    java.lang.String str42 = (java.lang.String) objArr272[0];
                    java.lang.Object[] objArr282 = new java.lang.Object[1];
                    c("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{79, 64, 136, 0}, objArr282);
                    java.lang.Object[] objArr292 = {context, new java.lang.String[]{str22, str32, str42, (java.lang.String) objArr282[0]}, java.lang.Integer.valueOf(intValue22), num, -992839718};
                    byte[] bArr42 = $$d;
                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                    d((byte) (bArr42[526] - 1), bArr42[164], 629, objArr302);
                    java.lang.Class<?> cls122 = java.lang.Class.forName((java.lang.String) objArr302[0]);
                    byte b82 = bArr42[10];
                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                    d(b82, (byte) (b82 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE), 634, objArr312);
                    java.lang.String str52 = (java.lang.String) objArr312[0];
                    int i3412 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int identityHashCode102 = java.lang.System.identityHashCode(this);
                    int i3422 = i3412 * 960;
                    int i3432 = (-241542) ^ i3422;
                    int i3442 = -(-((i3422 & (-241542)) << 1));
                    int i3452 = (i3432 & i3442) + (i3442 | i3432);
                    int i3462 = ~identityHashCode102;
                    int i3472 = i3462 ^ androidx.compose.runtime.ComposerKt.defaultsKey;
                    int i3482 = i3462 & androidx.compose.runtime.ComposerKt.defaultsKey;
                    int i3492 = (i3472 ^ i3482) | (i3482 & i3472);
                    int i3502 = ~i3492;
                    int i3512 = (i3492 | i3502) & i3502;
                    int i3522 = ((~i3412) & identityHashCode102) | (i3412 & i3462);
                    int i3532 = i3412 & identityHashCode102;
                    int i3542 = ~((i3522 & i3532) | (i3522 ^ i3532));
                    int i3552 = i3512 ^ i3542;
                    int i3562 = i3512 & i3542;
                    int i3572 = -(~(-(-(((i3562 ^ i3552) | (i3562 & i3552)) * 959))));
                    int i3582 = 121791 - (~(((i3452 | i3572) << 1) - (i3572 ^ i3452)));
                    int i3592 = identityHashCode102 & androidx.compose.runtime.ComposerKt.defaultsKey;
                    int i3602 = (identityHashCode102 | androidx.compose.runtime.ComposerKt.defaultsKey) & (~i3592);
                    int i3612 = ~((i3592 ^ i3602) | (i3602 & i3592));
                    int i3622 = (identityHashCode102 | i3462) & i3462;
                    int i3632 = i3622 & i3412;
                    int i3642 = (i3412 | i3622) & (~i3632);
                    int i3652 = ~((i3642 ^ i3632) | (i3642 & i3632));
                    int i3662 = ((~i3652) & i3612) | ((~i3612) & i3652);
                    int i3672 = i3652 & i3612;
                    int i3682 = -(-(((i3672 ^ i3662) | (i3672 & i3662)) * 959));
                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                    e(null, null, (i3582 & i3682) + (i3682 | i3582), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr322);
                    objArr2 = (java.lang.Object[]) cls122.getMethod(str52, java.lang.Class.forName((java.lang.String) objArr322[0]), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr292);
                    int i3692 = ((int[]) objArr2[1])[0];
                    int i3702 = ((int[]) objArr2[0])[0];
                    if (context != null) {
                    }
                    i = ((int[]) objArr2[1])[0];
                    i2 = ((int[]) objArr2[0])[0];
                    if (i2 == i) {
                    }
                    map2 = map;
                    if (!map2.containsKey("payload")) {
                    }
                    if (!com.payair.hce.setClickable.AlternateContactlessPaymentDataJson()) {
                    }
                    int i10022 = SdkCoreAlternateContactlessPaymentDataImpl;
                    int i10122 = i10022 & 37;
                    int i10222 = (i10022 | 37) & (~i10122);
                    int i10322 = i10122 << 1;
                    i3 = (i10222 & i10322) + (i10222 | i10322);
                    getProfileVersion = i3 % 128;
                    if (i3 % 2 == 0) {
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
                baseContext = getBaseContext();
                if (baseContext == null) {
                    int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int identityHashCode13 = java.lang.System.identityHashCode(this);
                    int i472 = (((lastIndexOf2 * 51) - 11172) - (~(-(-(((lastIndexOf2 ^ identityHashCode13) | (lastIndexOf2 & identityHashCode13)) * (-50)))))) - 1;
                    int i473 = ~lastIndexOf2;
                    int i474 = i473 & (-229);
                    int i475 = ((i473 | (-229)) & (~i474)) | i474;
                    int i476 = i475 & identityHashCode13;
                    int i477 = (i475 | identityHashCode13) & (~i476);
                    int i478 = ~identityHashCode13;
                    int i479 = ~((i477 ^ i476) | (i477 & i476));
                    int i480 = i478 ^ (-229);
                    int i481 = i478 & (-229);
                    int i482 = (i480 ^ i481) | (i480 & i481);
                    int i483 = ~((i473 & i482) | ((~i482) & lastIndexOf2) | (i482 & lastIndexOf2));
                    int i484 = i479 & i483;
                    int i485 = (i483 | i479) & (~i484);
                    int i486 = -(-(((i485 ^ i484) | (i485 & i484)) * 50));
                    int i487 = ((i472 | i486) << 1) - (i472 ^ i486);
                    int i488 = (identityHashCode13 | i478) & i478;
                    int i489 = ~((i488 & (-229)) | (i488 ^ (-229)));
                    int i490 = (lastIndexOf2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) | i474;
                    int i491 = lastIndexOf2 & (-229);
                    int i492 = (i490 ^ i491) | (i491 & i490);
                    int i493 = ~i492;
                    int i494 = (i492 | i493) & i493;
                    int i495 = i489 ^ i494;
                    int i496 = i489 & i494;
                    int i497 = (i496 ^ i495) | (i496 & i495);
                    int i498 = ~((lastIndexOf2 ^ i488) | (i488 & lastIndexOf2));
                    int i499 = -(~(((i498 ^ i497) | (i498 & i497)) * 50));
                    int i500 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int i501 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int identityHashCode14 = java.lang.System.identityHashCode(this);
                    int i502 = i501 * (-518);
                    int i503 = i502 ^ (-13986);
                    int i504 = -(-((i502 & (-13986)) << 1));
                    int i505 = (i503 & i504) + (i504 | i503);
                    int i506 = ~i501;
                    int i507 = ~identityHashCode14;
                    int i508 = (~i507) & i506;
                    int i509 = ~i506;
                    int i510 = i508 | (i509 & i507);
                    int i511 = i506 & i507;
                    int i512 = ~((i510 ^ i511) | (i510 & i511));
                    int i513 = i512 & 27;
                    int i514 = (i512 | 27) & (~i513);
                    int i515 = ((i514 ^ i513) | (i514 & i513)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                    int i516 = (i507 | identityHashCode14) & i507;
                    int i517 = (i509 & i516) | ((~i516) & i506);
                    int i518 = i516 & i506;
                    int i519 = (i517 ^ i518) | (i518 & i517);
                    int i520 = i519 & 27;
                    int i521 = (i519 | 27) & (~i520);
                    int i522 = (i521 ^ i520) | (i521 & i520);
                    int i523 = ~i522;
                    int i524 = (i522 | i523) & i523;
                    int i525 = (i506 & 27) | (i501 & (-28));
                    int i526 = i501 & 27;
                    int i527 = (i525 ^ i526) | (i525 & i526);
                    int i528 = (i507 & i527) | ((~i527) & identityHashCode14);
                    int i529 = i527 & identityHashCode14;
                    int i530 = ~((i529 ^ i528) | (i529 & i528));
                    int i531 = ((((i505 ^ i515) - (~(-(-((i505 & i515) << 1))))) - 1) - (~(((i530 ^ i524) | (i530 & i524)) * (-519)))) - 1;
                    int i532 = ~((identityHashCode14 ^ 27) | (identityHashCode14 & 27));
                    int i533 = ((i501 ^ i532) | (i501 & i532)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                    b("\u0000\uffdeￋ\r\r\ufffeￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\u0001\ufffe\u0002\u000f\u0005\ufff1\u0016\u0011\u0006\u0013\u0006\u0011", true, (((i487 | i499) << 1) - (i499 ^ i487)) - 1, (i500 ^ 14) + ((i500 & 14) << 1), (i531 & i533) + (i533 | i531), objArr46);
                    java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr46[0]);
                    int axisFromString = android.view.MotionEvent.axisFromString("");
                    int i534 = axisFromString & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                    int i535 = (axisFromString | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) & (~i534);
                    int i536 = i534 << 1;
                    int i537 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                    int identityHashCode15 = java.lang.System.identityHashCode(this);
                    int i538 = (touchSlop * 765) - 27486;
                    int i539 = ~identityHashCode15;
                    int i540 = i539 & touchSlop;
                    int i541 = ~(i540 | ((i539 | touchSlop) & (~i540)));
                    int i542 = i541 & 18;
                    int i543 = (i541 | 18) & (~i542);
                    int i544 = -(-(((i543 ^ i542) | (i543 & i542)) * 764));
                    int i545 = (i538 & i544) + (i538 | i544);
                    int i546 = ~touchSlop;
                    int i547 = i546 & (i546 | touchSlop);
                    int i548 = i547 ^ 18;
                    int i549 = i547 & 18;
                    int i550 = ~((i548 ^ i549) | (i549 & i548));
                    int i551 = ~((i539 ^ 18) | (i539 & 18));
                    int i552 = ((~i551) & i550) | ((~i550) & i551);
                    int i553 = i550 & i551;
                    int i554 = -(-(((i553 ^ i552) | (i553 & i552)) * (-1528)));
                    int i555 = i545 ^ i554;
                    int i556 = ((i554 & i545) | i555) << 1;
                    int i557 = -i555;
                    int i558 = ((~i547) & 18) | (i547 & (-19));
                    int i559 = ~((i558 ^ i549) | (i549 & i558));
                    int i560 = ~((touchSlop & (-19)) | (touchSlop ^ (-19)));
                    int i561 = (i559 ^ i560) | (i559 & i560);
                    int i562 = (identityHashCode15 | i539) & i539;
                    int i563 = i562 & touchSlop;
                    int i564 = (touchSlop | i562) & (~i563);
                    int i565 = ~((i564 ^ i563) | (i564 & i563));
                    int i566 = ((~i565) & i561) | ((~i561) & i565);
                    int i567 = i565 & i561;
                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                    b("\ufff9\u0004\u0005\uffff\n\ufff7\ufff9\uffff\u0002\u0006\u0006ￗ\n\u0004\ufffb\b\b\u000b", true, ((i535 | i536) << 1) - (i535 ^ i536), i537, (((i556 ^ i557) + ((i556 & i557) << 1)) - (~(-(-(((i567 ^ i566) | (i567 & i566)) * 764))))) - 1, objArr47);
                    baseContext = (android.content.Context) cls20.getMethod((java.lang.String) objArr47[0], new java.lang.Class[0]).invoke(null, null);
                    int i568 = getProfileVersion;
                    int i569 = i568 & 107;
                    int i570 = (i568 | 107) & (~i569);
                    int i571 = -(-(i569 << 1));
                    SdkCoreAlternateContactlessPaymentDataImpl = ((i570 & i571) + (i570 | i571)) % 128;
                }
                if (baseContext != null) {
                    int i572 = getProfileVersion;
                    int i573 = (i572 ^ 111) + ((i572 & 111) << 1);
                    SdkCoreAlternateContactlessPaymentDataImpl = i573 % 128;
                    if (i573 % 2 != 0) {
                        baseContext.getApplicationContext();
                        throw new java.lang.ArithmeticException();
                    }
                    baseContext = baseContext.getApplicationContext();
                    int i574 = SdkCoreAlternateContactlessPaymentDataImpl;
                    getProfileVersion = ((i574 ^ 49) + ((i574 & 49) << 1)) % 128;
                }
                int i575 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int identityHashCode16 = java.lang.System.identityHashCode(this);
                int i576 = i575 * 659;
                int i577 = (-2) - (~(((-147824) ^ i576) + ((i576 & (-147824)) << 1)));
                int i578 = ~i575;
                int i579 = (i578 ^ 225) | (i578 & 225);
                int i580 = ~i579;
                int i581 = (i579 | i580) & i580;
                int i582 = i575 ^ (-226);
                int i583 = i575 & (-226);
                int i584 = (i583 & i582) | (i582 ^ i583);
                int i585 = ~i584;
                int i586 = ((i581 ^ i585) | (i581 & i585) | (~(i575 | identityHashCode16))) * (-658);
                int i587 = i577 & i586;
                int i588 = -(-(((i584 | i585) & i585) * 658));
                int i589 = ~(i582 | i583);
                int i590 = i575 ^ identityHashCode16;
                int i591 = i575 & identityHashCode16;
                int i592 = (i591 ^ i590) | (i591 & i590);
                int i593 = ~i592;
                int i594 = (i592 | i593) & i593;
                int i595 = ((~i594) & i589) | ((~i589) & i594);
                int i596 = i594 & i589;
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                int identityHashCode17 = java.lang.System.identityHashCode(this);
                int i597 = combineMeasuredStates * 934;
                int i598 = ~combineMeasuredStates;
                int i599 = ~identityHashCode17;
                int i600 = i598 & i599;
                int i601 = (i598 | i599) & (~i600);
                int i602 = ~((i601 ^ i600) | (i601 & i600));
                int i603 = i602 & (-12);
                int i604 = (-2) - (~((((i597 ^ (-10251)) + ((i597 & (-10251)) << 1)) - 1) - (~((((i602 | (-12)) & (~i603)) | i603) * (-933)))));
                int i605 = (identityHashCode17 | i599) & i599;
                int i606 = ((~i605) & (-12)) | (i605 & 11);
                int i607 = i605 & (-12);
                int i608 = ~((i607 ^ i606) | (i607 & i606));
                int i609 = ~((combineMeasuredStates & (-12)) | (combineMeasuredStates ^ (-12)));
                int i610 = -(~((((~i608) & i609) | ((~i609) & i608) | (i608 & i609)) * 933));
                int i611 = ((i604 ^ i610) + ((i610 & i604) << 1)) - 1;
                int i612 = combineMeasuredStates & 11;
                int i613 = (combineMeasuredStates | 11) & (~i612);
                int i614 = (~((i612 ^ i613) | (i613 & i612))) * 933;
                int i615 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i616 = ((~i615) & 16) | (i615 & (-17));
                int i617 = (i615 & 16) << 1;
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, (((((i577 | i586) & (~i587)) + (i587 << 1)) - (~i588)) - 1) + (((i596 ^ i595) | (i596 & i595)) * 658), ((i611 | i614) << 1) - (i614 ^ i611), (i616 & i617) + (i617 | i616), objArr48);
                java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr48[0]);
                int i618 = -android.view.View.combineMeasuredStates(0, 0);
                int i619 = ((i618 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) | (i618 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)) << 1;
                int i620 = -(((~i618) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) | (i618 & (-231)));
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                int i621 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int i622 = i621 & 15;
                int i623 = (i621 ^ 15) | i622;
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, (i619 & i620) + (i620 | i619), (((~packedPositionType) & 7) | (packedPositionType & (-8))) + ((packedPositionType & 7) << 1), ((i622 | i623) << 1) - (i623 ^ i622), objArr49);
                intValue = ((java.lang.Integer) cls21.getMethod((java.lang.String) objArr49[0], java.lang.Object.class).invoke(null, this)).intValue();
                int i624 = getProfileVersion;
                SdkCoreAlternateContactlessPaymentDataImpl = ((((i624 ^ 89) | (i624 & 89)) << 1) - ((i624 & (-90)) | ((~i624) & 89))) % 128;
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05dd A[Catch: all -> 0x08f7, TryCatch #1 {all -> 0x08f7, blocks: (B:9:0x0100, B:11:0x0118, B:12:0x0152, B:16:0x02f1, B:18:0x0306, B:19:0x033e, B:25:0x04e3, B:27:0x04ff, B:28:0x053c, B:34:0x0713, B:36:0x072b, B:37:0x0763, B:41:0x0772, B:43:0x078b, B:44:0x07c3, B:49:0x086d, B:51:0x0886, B:52:0x08c5, B:61:0x05ba, B:63:0x05dd, B:64:0x062c, B:76:0x03bc, B:78:0x03d1, B:79:0x0405, B:81:0x01c5, B:83:0x01df, B:84:0x0214), top: B:4:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0345  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(android.content.Context context) {
        java.lang.Object[] writeReplace$5f5b6fcf;
        int i;
        int i2;
        long j;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        int i3;
        int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 105;
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            super.attachBaseContext(context);
            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.graphics.Color.alpha(0), 922 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
            byte[] bArr = $$a;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(bArr[7], (byte) 69, bArr[34], objArr2);
            cls.getField((java.lang.String) objArr2[0]).getLong(null);
            throw new java.lang.ArithmeticException();
        }
        super.attachBaseContext(context);
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 44, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 921, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
        byte[] bArr2 = $$a;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(bArr2[7], (byte) 69, bArr2[34], objArr3);
        long j2 = cls2.getField((java.lang.String) objArr3[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        if (j2 != -1) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, 227 - (android.os.Process.myTid() >> 22), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 22, objArr4);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr5);
                            if (j2 + 4611686018427387856L >= ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 63) % 128;
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 922, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                byte b = bArr2[11];
                                byte b2 = (byte) (b | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a(b, b2, (byte) (b2 + 3), objArr6);
                                java.lang.Object[] objArr7 = {cls4.getField((java.lang.String) objArr6[0]).get(null), -968409836, 0};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 46, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4860, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj2);
                                }
                                writeReplace$5f5b6fcf = (java.lang.Object[]) ((java.lang.reflect.Method) obj2).invoke(null, objArr7);
                                i = ((int[]) writeReplace$5f5b6fcf[1])[0];
                                i2 = ((int[]) writeReplace$5f5b6fcf[0])[0];
                                if (i2 != i) {
                                    java.lang.Object[] objArr8 = {writeReplace$5f5b6fcf, java.lang.Integer.valueOf(((int[]) writeReplace$5f5b6fcf[3])[0]), 0};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 45, (android.os.Process.myTid() >> 22) + 4860, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj3);
                                    }
                                    ((java.lang.reflect.Method) obj3).invoke(null, objArr8);
                                } else {
                                    new java.util.ArrayList().add((java.lang.String) writeReplace$5f5b6fcf[2]);
                                    long j3 = i ^ i2;
                                    getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 95) % 128;
                                    try {
                                        java.lang.Object[] objArr9 = {java.lang.Long.valueOf(j3 ^ (-4845972283946172416L)), -1128290848L};
                                        byte[] bArr3 = $$d;
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        d(bArr3[253], bArr3[164], 540, objArr10);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                        byte b3 = bArr3[25];
                                        byte b4 = bArr3[5];
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        d(b3, b4, (short) (b4 | 556), objArr11);
                                        cls5.getMethod((java.lang.String) objArr11[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr9);
                                        java.lang.Object[] objArr12 = {writeReplace$5f5b6fcf, java.lang.Integer.valueOf(((int[]) writeReplace$5f5b6fcf[3])[0]), 0};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 45, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4861, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr12);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 707 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 34285));
                                byte b5 = bArr2[24];
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                a(b5, (byte) (b5 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr13);
                                j = cls6.getField((java.lang.String) objArr13[0]).getLong(null);
                                if (j != -1) {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, 227 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 1, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 22, objArr14);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr15);
                                    if (j + 1960 >= ((java.lang.Long) cls7.getDeclaredMethod((java.lang.String) objArr15[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 707 - android.text.TextUtils.indexOf("", "", 0), (char) (android.os.Process.getGidForName("") + 34285));
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        a(bArr2[60], (byte) (-bArr2[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr16);
                                        java.lang.Object[] objArr17 = {cls8.getField((java.lang.String) objArr16[0]).get(null), -1579474402, 0};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj5 == null) {
                                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 4717, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj5);
                                        }
                                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr17);
                                        i3 = ((int[]) objArr[1])[0];
                                        if (((int[]) objArr[0])[0] == i3) {
                                            int i5 = getProfileVersion + 101;
                                            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                java.lang.Object[] objArr18 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[48])[1]), 0};
                                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                if (obj6 == null) {
                                                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.resolveSize(0, 0), 4717 - android.view.View.resolveSize(0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj6);
                                                }
                                                ((java.lang.reflect.Method) obj6).invoke(null, objArr18);
                                                return;
                                            }
                                            java.lang.Object[] objArr19 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj7 == null) {
                                                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.argb(0, 0, 0, 0) + 4717, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                                            }
                                            ((java.lang.reflect.Method) obj7).invoke(null, objArr19);
                                            return;
                                        }
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add((java.lang.String) objArr[2]);
                                        arrayList.add((java.lang.String) objArr[3]);
                                        arrayList.add((java.lang.String) objArr[4]);
                                        arrayList.add((java.lang.String) objArr[5]);
                                        arrayList.add((java.lang.String) objArr[6]);
                                        arrayList.add((java.lang.String) objArr[7]);
                                        arrayList.add((java.lang.String) objArr[8]);
                                        java.lang.Object[] objArr20 = {java.lang.Long.valueOf((i3 ^ r4) ^ 6756286575140667392L), 1573070553L};
                                        byte[] bArr4 = $$d;
                                        byte b6 = bArr4[240];
                                        byte b7 = bArr4[164];
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        d(b6, b7, (short) (b7 | 461), objArr21);
                                        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                        byte b8 = bArr4[25];
                                        byte b9 = bArr4[5];
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        d(b8, b9, (short) (b9 | 556), objArr22);
                                        cls9.getMethod((java.lang.String) objArr22[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr20);
                                        java.lang.Object[] objArr23 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj8 == null) {
                                            obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.widget.ExpandableListView.getPackedPositionType(0L), 4717 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj8);
                                        }
                                        ((java.lang.reflect.Method) obj8).invoke(null, objArr23);
                                        return;
                                    }
                                }
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, 226 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr24);
                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, 230 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, 15 - android.view.MotionEvent.axisFromString(""), objArr25);
                                java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(((java.lang.Integer) cls10.getMethod((java.lang.String) objArr25[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -1579474402};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                if (obj == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 48, android.text.TextUtils.getTrimmedLength("") + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 34284));
                                    byte b10 = bArr2[24];
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    a(b10, (byte) (b10 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr27);
                                    obj = cls11.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj);
                                }
                                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr26);
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.os.Process.getGidForName("") + 708, (char) (34283 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a(bArr2[60], (byte) (-bArr2[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr28);
                                cls12.getField((java.lang.String) objArr28[0]).set(null, objArr);
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, 227 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.KeyEvent.keyCodeFromString("") + 1, 21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr29);
                                java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr30);
                                long longValue = ((java.lang.Long) cls13.getDeclaredMethod((java.lang.String) objArr30[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 47, 707 - android.text.TextUtils.indexOf("", "", 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 34285));
                                byte b11 = bArr2[24];
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                a(b11, (byte) (b11 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr31);
                                cls14.getField((java.lang.String) objArr31[0]).set(null, java.lang.Long.valueOf(longValue));
                                i3 = ((int[]) objArr[1])[0];
                                if (((int[]) objArr[0])[0] == i3) {
                                }
                            }
                        }
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, 227 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.KeyEvent.keyCodeFromString("") + 1, 21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr292);
                        java.lang.Class<?> cls132 = java.lang.Class.forName((java.lang.String) objArr292[0]);
                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                        c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr302);
                        long longValue2 = ((java.lang.Long) cls132.getDeclaredMethod((java.lang.String) objArr302[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls142 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 47, 707 - android.text.TextUtils.indexOf("", "", 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 34285));
                        byte b112 = bArr2[24];
                        java.lang.Object[] objArr312 = new java.lang.Object[1];
                        a(b112, (byte) (b112 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr312);
                        cls142.getField((java.lang.String) objArr312[0]).set(null, java.lang.Long.valueOf(longValue2));
                        i3 = ((int[]) objArr[1])[0];
                        if (((int[]) objArr[0])[0] == i3) {
                        }
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, 227 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, 22 - android.view.KeyEvent.keyCodeFromString(""), objArr32);
                    java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr33);
                    long longValue3 = ((java.lang.Long) cls15.getDeclaredMethod((java.lang.String) objArr33[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 922, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    a(bArr2[7], (byte) 69, bArr2[34], objArr34);
                    cls16.getField((java.lang.String) objArr34[0]).set(null, java.lang.Long.valueOf(longValue3));
                    i = ((int[]) writeReplace$5f5b6fcf[1])[0];
                    i2 = ((int[]) writeReplace$5f5b6fcf[0])[0];
                    if (i2 != i) {
                    }
                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 707 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 34285));
                    byte b52 = bArr2[24];
                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                    a(b52, (byte) (b52 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr132);
                    j = cls62.getField((java.lang.String) objArr132[0]).getLong(null);
                    if (j != -1) {
                    }
                    java.lang.Object[] objArr242 = new java.lang.Object[1];
                    b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, 226 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr242);
                    java.lang.Class<?> cls102 = java.lang.Class.forName((java.lang.String) objArr242[0]);
                    java.lang.Object[] objArr252 = new java.lang.Object[1];
                    b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, 230 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, 15 - android.view.MotionEvent.axisFromString(""), objArr252);
                    java.lang.Object[] objArr262 = {java.lang.Integer.valueOf(((java.lang.Integer) cls102.getMethod((java.lang.String) objArr252[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -1579474402};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                    if (obj == null) {
                    }
                    objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr262);
                    java.lang.Class cls122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.os.Process.getGidForName("") + 708, (char) (34283 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr282 = new java.lang.Object[1];
                    a(bArr2[60], (byte) (-bArr2[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr282);
                    cls122.getField((java.lang.String) objArr282[0]).set(null, objArr);
                } catch (java.lang.Exception unused2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 226, 11 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 16 - android.view.KeyEvent.getDeadChar(0, 0), objArr35);
                java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 7 - android.graphics.Color.red(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 17, objArr36);
                int intValue = ((java.lang.Integer) cls17.getMethod((java.lang.String) objArr36[0], java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr37 = {-568390716};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj9 == null) {
                    obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 49, 873 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.graphics.Color.rgb(0, 0, 0) + 16793171))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj9);
                }
                writeReplace$5f5b6fcf = com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8.writeReplace$5f5b6fcf(intValue, ((java.lang.reflect.Constructor) obj9).newInstance(objArr37), -968409836);
                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 44, android.text.TextUtils.getTrimmedLength("") + 922, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte b12 = bArr2[11];
                byte b13 = (byte) (b12 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                a(b12, b13, (byte) (b13 + 3), objArr38);
                cls18.getField((java.lang.String) objArr38[0]).set(null, writeReplace$5f5b6fcf);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x1b60  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x1d51  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x1f75  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x20ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x23a9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x2418  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x21ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x21d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x2302  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1fd9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1c44  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1a0a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x1a1e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x1aae  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x1b4e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x176b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1595  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x15b3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x126f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1283  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x131a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x144b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x109a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0ed2  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0eeb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0f7a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x06ea A[Catch: all -> 0x2544, TryCatch #4 {all -> 0x2544, blocks: (B:7:0x019e, B:9:0x01bf, B:10:0x01fc, B:15:0x032f, B:17:0x034c, B:18:0x038b, B:26:0x051e, B:28:0x053f, B:29:0x059c, B:31:0x06db, B:33:0x06ea, B:34:0x071c, B:36:0x0738, B:37:0x076c, B:39:0x077b, B:41:0x078a, B:42:0x07bb, B:44:0x07e7, B:45:0x0849, B:51:0x0a24, B:53:0x0a45, B:54:0x0a81, B:61:0x0bee, B:63:0x0c0a, B:64:0x0c4a, B:70:0x0e64, B:72:0x0e82, B:73:0x0ebf, B:79:0x1038, B:81:0x1055, B:82:0x1091, B:89:0x11f8, B:91:0x1219, B:92:0x125a, B:103:0x151a, B:105:0x153b, B:106:0x1580, B:111:0x16fb, B:113:0x1718, B:114:0x175d, B:122:0x198e, B:124:0x19af, B:125:0x19f3, B:133:0x1b75, B:135:0x1b91, B:136:0x1bd1, B:144:0x1de3, B:146:0x1e04, B:147:0x1e41, B:152:0x1f7c, B:154:0x1f99, B:155:0x1fd1, B:161:0x214b, B:163:0x216c, B:164:0x21a8, B:169:0x23b9, B:171:0x23d5, B:172:0x2411, B:178:0x2482, B:180:0x249e, B:181:0x24d9, B:220:0x2050, B:222:0x206d, B:223:0x20a8, B:236:0x1be1, B:238:0x1bfe, B:239:0x1c3c, B:243:0x1cb5, B:245:0x1cd2, B:246:0x1d0b, B:265:0x1770, B:267:0x1783, B:268:0x17c4, B:270:0x17ce, B:272:0x17e1, B:273:0x181a, B:277:0x1890, B:279:0x18ad, B:280:0x18e9, B:321:0x1106, B:323:0x1123, B:324:0x115e, B:344:0x0c5c, B:346:0x0c79, B:347:0x0cb4, B:351:0x0d66, B:353:0x0d83, B:354:0x0dc2, B:356:0x0ab0, B:358:0x0ad5, B:359:0x0b29, B:369:0x08b4, B:371:0x08c3, B:372:0x08f5, B:374:0x0921, B:375:0x097e, B:377:0x05c7, B:379:0x05e9, B:380:0x063b, B:392:0x040e, B:394:0x042b, B:395:0x0466, B:397:0x022d, B:399:0x0248, B:400:0x027d), top: B:2:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x101c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0ee7  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0ad5 A[Catch: all -> 0x2544, TryCatch #4 {all -> 0x2544, blocks: (B:7:0x019e, B:9:0x01bf, B:10:0x01fc, B:15:0x032f, B:17:0x034c, B:18:0x038b, B:26:0x051e, B:28:0x053f, B:29:0x059c, B:31:0x06db, B:33:0x06ea, B:34:0x071c, B:36:0x0738, B:37:0x076c, B:39:0x077b, B:41:0x078a, B:42:0x07bb, B:44:0x07e7, B:45:0x0849, B:51:0x0a24, B:53:0x0a45, B:54:0x0a81, B:61:0x0bee, B:63:0x0c0a, B:64:0x0c4a, B:70:0x0e64, B:72:0x0e82, B:73:0x0ebf, B:79:0x1038, B:81:0x1055, B:82:0x1091, B:89:0x11f8, B:91:0x1219, B:92:0x125a, B:103:0x151a, B:105:0x153b, B:106:0x1580, B:111:0x16fb, B:113:0x1718, B:114:0x175d, B:122:0x198e, B:124:0x19af, B:125:0x19f3, B:133:0x1b75, B:135:0x1b91, B:136:0x1bd1, B:144:0x1de3, B:146:0x1e04, B:147:0x1e41, B:152:0x1f7c, B:154:0x1f99, B:155:0x1fd1, B:161:0x214b, B:163:0x216c, B:164:0x21a8, B:169:0x23b9, B:171:0x23d5, B:172:0x2411, B:178:0x2482, B:180:0x249e, B:181:0x24d9, B:220:0x2050, B:222:0x206d, B:223:0x20a8, B:236:0x1be1, B:238:0x1bfe, B:239:0x1c3c, B:243:0x1cb5, B:245:0x1cd2, B:246:0x1d0b, B:265:0x1770, B:267:0x1783, B:268:0x17c4, B:270:0x17ce, B:272:0x17e1, B:273:0x181a, B:277:0x1890, B:279:0x18ad, B:280:0x18e9, B:321:0x1106, B:323:0x1123, B:324:0x115e, B:344:0x0c5c, B:346:0x0c79, B:347:0x0cb4, B:351:0x0d66, B:353:0x0d83, B:354:0x0dc2, B:356:0x0ab0, B:358:0x0ad5, B:359:0x0b29, B:369:0x08b4, B:371:0x08c3, B:372:0x08f5, B:374:0x0921, B:375:0x097e, B:377:0x05c7, B:379:0x05e9, B:380:0x063b, B:392:0x040e, B:394:0x042b, B:395:0x0466, B:397:0x022d, B:399:0x0248, B:400:0x027d), top: B:2:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0738 A[Catch: all -> 0x2544, TryCatch #4 {all -> 0x2544, blocks: (B:7:0x019e, B:9:0x01bf, B:10:0x01fc, B:15:0x032f, B:17:0x034c, B:18:0x038b, B:26:0x051e, B:28:0x053f, B:29:0x059c, B:31:0x06db, B:33:0x06ea, B:34:0x071c, B:36:0x0738, B:37:0x076c, B:39:0x077b, B:41:0x078a, B:42:0x07bb, B:44:0x07e7, B:45:0x0849, B:51:0x0a24, B:53:0x0a45, B:54:0x0a81, B:61:0x0bee, B:63:0x0c0a, B:64:0x0c4a, B:70:0x0e64, B:72:0x0e82, B:73:0x0ebf, B:79:0x1038, B:81:0x1055, B:82:0x1091, B:89:0x11f8, B:91:0x1219, B:92:0x125a, B:103:0x151a, B:105:0x153b, B:106:0x1580, B:111:0x16fb, B:113:0x1718, B:114:0x175d, B:122:0x198e, B:124:0x19af, B:125:0x19f3, B:133:0x1b75, B:135:0x1b91, B:136:0x1bd1, B:144:0x1de3, B:146:0x1e04, B:147:0x1e41, B:152:0x1f7c, B:154:0x1f99, B:155:0x1fd1, B:161:0x214b, B:163:0x216c, B:164:0x21a8, B:169:0x23b9, B:171:0x23d5, B:172:0x2411, B:178:0x2482, B:180:0x249e, B:181:0x24d9, B:220:0x2050, B:222:0x206d, B:223:0x20a8, B:236:0x1be1, B:238:0x1bfe, B:239:0x1c3c, B:243:0x1cb5, B:245:0x1cd2, B:246:0x1d0b, B:265:0x1770, B:267:0x1783, B:268:0x17c4, B:270:0x17ce, B:272:0x17e1, B:273:0x181a, B:277:0x1890, B:279:0x18ad, B:280:0x18e9, B:321:0x1106, B:323:0x1123, B:324:0x115e, B:344:0x0c5c, B:346:0x0c79, B:347:0x0cb4, B:351:0x0d66, B:353:0x0d83, B:354:0x0dc2, B:356:0x0ab0, B:358:0x0ad5, B:359:0x0b29, B:369:0x08b4, B:371:0x08c3, B:372:0x08f5, B:374:0x0921, B:375:0x097e, B:377:0x05c7, B:379:0x05e9, B:380:0x063b, B:392:0x040e, B:394:0x042b, B:395:0x0466, B:397:0x022d, B:399:0x0248, B:400:0x027d), top: B:2:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x077b A[Catch: all -> 0x2544, TryCatch #4 {all -> 0x2544, blocks: (B:7:0x019e, B:9:0x01bf, B:10:0x01fc, B:15:0x032f, B:17:0x034c, B:18:0x038b, B:26:0x051e, B:28:0x053f, B:29:0x059c, B:31:0x06db, B:33:0x06ea, B:34:0x071c, B:36:0x0738, B:37:0x076c, B:39:0x077b, B:41:0x078a, B:42:0x07bb, B:44:0x07e7, B:45:0x0849, B:51:0x0a24, B:53:0x0a45, B:54:0x0a81, B:61:0x0bee, B:63:0x0c0a, B:64:0x0c4a, B:70:0x0e64, B:72:0x0e82, B:73:0x0ebf, B:79:0x1038, B:81:0x1055, B:82:0x1091, B:89:0x11f8, B:91:0x1219, B:92:0x125a, B:103:0x151a, B:105:0x153b, B:106:0x1580, B:111:0x16fb, B:113:0x1718, B:114:0x175d, B:122:0x198e, B:124:0x19af, B:125:0x19f3, B:133:0x1b75, B:135:0x1b91, B:136:0x1bd1, B:144:0x1de3, B:146:0x1e04, B:147:0x1e41, B:152:0x1f7c, B:154:0x1f99, B:155:0x1fd1, B:161:0x214b, B:163:0x216c, B:164:0x21a8, B:169:0x23b9, B:171:0x23d5, B:172:0x2411, B:178:0x2482, B:180:0x249e, B:181:0x24d9, B:220:0x2050, B:222:0x206d, B:223:0x20a8, B:236:0x1be1, B:238:0x1bfe, B:239:0x1c3c, B:243:0x1cb5, B:245:0x1cd2, B:246:0x1d0b, B:265:0x1770, B:267:0x1783, B:268:0x17c4, B:270:0x17ce, B:272:0x17e1, B:273:0x181a, B:277:0x1890, B:279:0x18ad, B:280:0x18e9, B:321:0x1106, B:323:0x1123, B:324:0x115e, B:344:0x0c5c, B:346:0x0c79, B:347:0x0cb4, B:351:0x0d66, B:353:0x0d83, B:354:0x0dc2, B:356:0x0ab0, B:358:0x0ad5, B:359:0x0b29, B:369:0x08b4, B:371:0x08c3, B:372:0x08f5, B:374:0x0921, B:375:0x097e, B:377:0x05c7, B:379:0x05e9, B:380:0x063b, B:392:0x040e, B:394:0x042b, B:395:0x0466, B:397:0x022d, B:399:0x0248, B:400:0x027d), top: B:2:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x1031  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x145d  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        char c;
        java.lang.Object[] objArr;
        char c2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object invoke;
        java.lang.Object obj;
        java.lang.Object obj2;
        int intValue;
        java.lang.Object obj3;
        long j;
        java.lang.Object obj4;
        java.lang.Object[] objArr2;
        java.lang.String str5;
        char c3;
        char c4;
        int i;
        long j2;
        android.content.Context baseContext;
        java.lang.String str6;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        int i2;
        long j3;
        android.content.Context baseContext2;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object[] objArr5;
        java.lang.Object[] objArr6;
        java.lang.Long valueOf;
        java.lang.Class cls;
        java.lang.Object obj5;
        long j4;
        android.content.Context baseContext3;
        java.lang.String str9;
        char c5;
        java.lang.Object[] objArr7;
        char c6;
        int i3;
        java.lang.String str10;
        java.lang.String str11;
        long j5;
        java.lang.String str12;
        android.content.Context baseContext4;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.Object[] objArr8;
        java.lang.Object[] objArr9;
        int i4;
        long j6;
        java.lang.Object[] objArr10;
        int i5;
        char c7;
        int i6;
        long j7;
        android.content.Context baseContext5;
        java.lang.Object[] objArr11;
        int i7;
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 95) % 128;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b("\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, android.text.TextUtils.getOffsetAfter("", 0) + 227, 1 - android.graphics.Color.alpha(0), 22 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr12);
        java.lang.String str15 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 15, 0, 3}, objArr13);
        java.lang.String str16 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b("\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", false, 226 - android.graphics.Color.alpha(0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, 16 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr14);
        java.lang.String str17 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        b("\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013", true, 230 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 7 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 17, objArr15);
        java.lang.String str18 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        b("\u0000\uffdeￋ\r\r\ufffeￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\u0001\ufffe\u0002\u000f\u0005\ufff1\u0016\u0011\u0006\u0013\u0006\u0011", true, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 227, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, 25 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr16);
        java.lang.String str19 = (java.lang.String) objArr16[0];
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        b("\ufff9\u0004\u0005\uffff\n\ufff7\ufff9\uffff\u0002\u0006\u0006ￗ\n\u0004\ufffb\b\b\u000b", true, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr17);
        java.lang.String str20 = (java.lang.String) objArr17[0];
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        e(null, null, 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr18);
        java.lang.String str21 = (java.lang.String) objArr18[0];
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 44, 922 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.getDefaultSize(0, 0));
        byte[] bArr = $$a;
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        a(bArr[7], (byte) 69, bArr[34], objArr19);
        long j8 = cls2.getField((java.lang.String) objArr19[0]).getLong(null);
        try {
            if (j8 == -1 || j8 + 4611686018427387822L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                str = str19;
                str2 = str20;
                int intValue2 = ((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str18, java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr20 = {1769877109};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 872, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 15956))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj6);
                }
                java.lang.Object[] AlternateContactlessPaymentDataJson$4956fc2a = com.mastercard.mpsdk.card.profile.SdkCoreAlternateContactlessPaymentDataImpl.AlternateContactlessPaymentDataJson$4956fc2a(intValue2, ((java.lang.reflect.Constructor) obj6).newInstance(objArr20));
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 922, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                byte b = bArr[11];
                byte b2 = (byte) (b | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                num = 1;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                a(b, b2, (byte) (b2 + 3), objArr21);
                cls3.getField((java.lang.String) objArr21[0]).set(null, AlternateContactlessPaymentDataJson$4956fc2a);
                try {
                    try {
                        long longValue = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.ImageFormat.getBitsPerPixel(0), android.view.View.getDefaultSize(0, 0) + 922, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(bArr[7], (byte) 69, bArr[34], objArr22);
                        c = 0;
                        cls4.getField((java.lang.String) objArr22[0]).set(null, java.lang.Long.valueOf(longValue));
                        objArr = AlternateContactlessPaymentDataJson$4956fc2a;
                        c2 = 1;
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, 922 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                byte b3 = bArr[11];
                byte b4 = (byte) (b3 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                str = str19;
                str2 = str20;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                a(b3, b4, (byte) (b4 + 3), objArr23);
                java.lang.Object[] objArr24 = {cls5.getField((java.lang.String) objArr23[0]).get(null), 1735383130, 0};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.view.View.combineMeasuredStates(0, 0), 4860 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj7);
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr24);
                num = 1;
                c2 = 1;
                c = 0;
            }
            int i8 = ((int[]) objArr[c2])[c];
            if (((int[]) objArr[c])[c] == i8) {
                int i9 = ((int[]) objArr[3])[c];
                java.lang.Object[] objArr25 = new java.lang.Object[3];
                objArr25[2] = 0;
                objArr25[1] = java.lang.Integer.valueOf(i9);
                objArr25[c] = objArr;
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                if (obj8 == null) {
                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 4859 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj8);
                }
                ((java.lang.reflect.Method) obj8).invoke(null, objArr25);
                str3 = str18;
            } else {
                new java.util.ArrayList().add((java.lang.String) objArr[2]);
                try {
                    java.lang.Object[] objArr26 = {java.lang.Long.valueOf((i8 ^ r7) ^ (-6309979249054842880L)), -1469156532L};
                    byte[] bArr2 = $$d;
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    d(bArr2[134], bArr2[164], 444, objArr27);
                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                    byte b5 = bArr2[25];
                    byte b6 = bArr2[5];
                    str3 = str18;
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    d(b5, b6, (short) (b6 | 556), objArr28);
                    cls6.getMethod((java.lang.String) objArr28[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr26);
                    java.lang.Object[] objArr29 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                    if (obj9 == null) {
                        obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 4859 - android.os.Process.getGidForName(""), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj9);
                    }
                    ((java.lang.reflect.Method) obj9).invoke(null, objArr29);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 754, (char) (45561 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            a(29, bArr[85], bArr[11], objArr30);
            long j9 = cls7.getField((java.lang.String) objArr30[0]).getLong(null);
            try {
                try {
                    try {
                        if (j9 != -1) {
                            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 67) % 128;
                            if (j9 + 4611686018427387808L >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, android.view.View.resolveSizeAndState(0, 0, 0) + 754, (char) (45560 - android.graphics.Color.red(0)));
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr31);
                                java.lang.Object[] objArr32 = {cls8.getField((java.lang.String) objArr31[0]).get(null), -1289568059, 0};
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                if (obj10 == null) {
                                    obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 4790, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 4750 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (33702 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj10);
                                }
                                obj = ((java.lang.reflect.Method) obj10).invoke(null, objArr32);
                                str4 = str3;
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 40, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4749, (char) (33701 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)))).getMethod("values", null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj2);
                                }
                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, null)).intValue();
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, 4750 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (33700 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("DigitizedCardProfile", null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj3);
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, null)).intValue() != intValue) {
                                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj11 == null) {
                                        obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4750 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 33701))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj11);
                                    }
                                    java.lang.Object[] objArr33 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(obj, null)).intValue()), 0};
                                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj12 == null) {
                                        obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4791, (char) (android.graphics.Color.rgb(0, 0, 0) + 16808368))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, 4750 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (33701 - android.view.View.getDefaultSize(0, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj12);
                                    }
                                    ((java.lang.reflect.Method) obj12).invoke(null, objArr33);
                                } else {
                                    java.lang.Object[] objArr34 = {java.lang.Long.valueOf((intValue ^ r7) ^ (-7847799165630283776L)), -1827206083L};
                                    byte[] bArr3 = $$d;
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    d(bArr3[69], bArr3[164], 406, objArr35);
                                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    d(bArr3[97], bArr3[2], 384, objArr36);
                                    cls9.getMethod((java.lang.String) objArr36[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr34);
                                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj13 == null) {
                                        obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4750 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "") + 33701))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj13);
                                    }
                                    java.lang.Object[] objArr37 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(obj, null)).intValue()), 0};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj14 == null) {
                                        obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\b', 4790 - android.text.TextUtils.getOffsetAfter("", 0), (char) (31153 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 40, 4750 - android.view.KeyEvent.normalizeMetaState(0), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj14);
                                    }
                                    ((java.lang.reflect.Method) obj14).invoke(null, objArr37);
                                }
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.KeyEvent.keyCodeFromString(""), 707 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (34284 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                byte b7 = bArr[24];
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                a(b7, (byte) (b7 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr38);
                                j = cls10.getField((java.lang.String) objArr38[0]).getLong(null);
                                if (j != -1 || j + 1958 < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str4, java.lang.Object.class).invoke(null, this)).intValue()), 0, -545704489};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                    if (obj4 == null) {
                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, android.os.Process.getGidForName("") + 708, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34283));
                                        byte b8 = bArr[24];
                                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                                        a(b8, (byte) (b8 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr40);
                                        obj4 = cls11.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj4);
                                    }
                                    java.lang.Object[] objArr41 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr39);
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 708, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 34284));
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr42);
                                    cls12.getField((java.lang.String) objArr42[0]).set(null, objArr41);
                                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 47, 707 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (34284 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                    byte b9 = bArr[24];
                                    objArr2 = objArr41;
                                    str5 = str4;
                                    c3 = 1;
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    a(b9, (byte) (b9 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr43);
                                    c4 = 0;
                                    cls13.getField((java.lang.String) objArr43[0]).set(null, java.lang.Long.valueOf(longValue2));
                                } else {
                                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 47, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 34284));
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr44);
                                    java.lang.Object[] objArr45 = {cls14.getField((java.lang.String) objArr44[0]).get(null), -545704489, 0};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                    if (obj15 == null) {
                                        obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.Process.myPid() >> 22) + 4717, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj15);
                                    }
                                    objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj15).invoke(null, objArr45);
                                    str5 = str4;
                                    c3 = 1;
                                    c4 = 0;
                                }
                                i = ((int[]) objArr2[c3])[c4];
                                if (((int[]) objArr2[c4])[c4] != i) {
                                    int i10 = getProfileVersion + 29;
                                    SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        java.lang.Object[] objArr46 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[105])[0]), num};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj16 == null) {
                                            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4717, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj16);
                                        }
                                        ((java.lang.reflect.Method) obj16).invoke(null, objArr46);
                                    } else {
                                        java.lang.Object[] objArr47 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj17 == null) {
                                            obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.getDefaultSize(0, 0), 4716 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj17);
                                        }
                                        ((java.lang.reflect.Method) obj17).invoke(null, objArr47);
                                    }
                                } else {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add((java.lang.String) objArr2[2]);
                                    arrayList.add((java.lang.String) objArr2[3]);
                                    arrayList.add((java.lang.String) objArr2[4]);
                                    arrayList.add((java.lang.String) objArr2[5]);
                                    arrayList.add((java.lang.String) objArr2[6]);
                                    arrayList.add((java.lang.String) objArr2[7]);
                                    arrayList.add((java.lang.String) objArr2[8]);
                                    java.lang.Object[] objArr48 = {java.lang.Long.valueOf((i ^ r6) ^ (-5720550143648858112L)), -1331919371L};
                                    byte[] bArr4 = $$d;
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    d(bArr4[139], bArr4[164], 373, objArr49);
                                    java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr49[0]);
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    d(bArr4[97], bArr4[2], 384, objArr50);
                                    cls15.getMethod((java.lang.String) objArr50[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr48);
                                    java.lang.Object[] objArr51 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                    if (obj18 == null) {
                                        obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34, 4717 - android.graphics.Color.alpha(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj18);
                                    }
                                    ((java.lang.reflect.Method) obj18).invoke(null, objArr51);
                                }
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 51, 584 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.graphics.Color.rgb(0, 0, 0) + 16801507));
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                a(bArr[7], (byte) 69, bArr[34], objArr52);
                                j2 = cls16.getField((java.lang.String) objArr52[0]).getLong(null);
                                if (j2 != -1 || j2 + 1885 < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    baseContext = getBaseContext();
                                    if (baseContext != null) {
                                        str6 = str2;
                                        baseContext = (android.content.Context) java.lang.Class.forName(str).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
                                    } else {
                                        str6 = str2;
                                    }
                                    if (baseContext != null) {
                                        baseContext = baseContext.getApplicationContext();
                                    }
                                    java.lang.String str22 = str5;
                                    java.lang.Object[] objArr53 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str22, java.lang.Object.class).invoke(null, this)).intValue()), -1511446721};
                                    byte[] bArr5 = $$d;
                                    str5 = str22;
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    d(bArr5[136], bArr5[164], 349, objArr54);
                                    java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr54[0]);
                                    byte b10 = bArr5[10];
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    d(b10, (byte) (b10 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE), 634, objArr55);
                                    java.lang.Object[] objArr56 = (java.lang.Object[]) cls17.getMethod((java.lang.String) objArr55[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr53);
                                    if (baseContext == null) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 585 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((-16752925) - android.graphics.Color.rgb(0, 0, 0)));
                                        byte b11 = bArr[11];
                                        byte b12 = (byte) (b11 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        a(b11, b12, (byte) (b12 + 3), objArr57);
                                        cls18.getField((java.lang.String) objArr57[0]).set(null, objArr56);
                                        try {
                                            long longValue3 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.getTrimmedLength("") + 584, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 24291));
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a(bArr[7], (byte) 69, bArr[34], objArr58);
                                            cls19.getField((java.lang.String) objArr58[0]).set(null, java.lang.Long.valueOf(longValue3));
                                            objArr4 = objArr56;
                                            i2 = ((int[]) objArr4[1])[0];
                                            if (((int[]) objArr4[0])[0] != i2) {
                                                java.lang.Object[] objArr59 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), 0};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj19 == null) {
                                                    obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 4830 - android.view.View.MeasureSpec.getSize(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj19);
                                                }
                                                ((java.lang.reflect.Method) obj19).invoke(null, objArr59);
                                            } else {
                                                java.lang.Object[] objArr60 = {java.lang.Long.valueOf((i2 ^ r10) ^ 5483932299298865152L), 1276826975L};
                                                byte[] bArr6 = $$d;
                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                d(bArr6[69], bArr6[164], 326, objArr61);
                                                java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr61[0]);
                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                d(bArr6[97], bArr6[2], 384, objArr62);
                                                cls20.getMethod((java.lang.String) objArr62[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr60);
                                                java.lang.Object[] objArr63 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), 0};
                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj20 == null) {
                                                    obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 30, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4831, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj20);
                                                }
                                                ((java.lang.reflect.Method) obj20).invoke(null, objArr63);
                                            }
                                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.getDefaultSize(0, 0), 1581 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", ""));
                                            byte b13 = bArr[24];
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            a(b13, (byte) (b13 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr64);
                                            j3 = cls21.getField((java.lang.String) objArr64[0]).getLong(null);
                                            try {
                                                if (j3 != -1 || j3 + 4611686018427387864L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                    baseContext2 = getBaseContext();
                                                    if (baseContext2 == null) {
                                                        baseContext2 = (android.content.Context) java.lang.Class.forName(str).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
                                                    }
                                                    if (baseContext2 != null) {
                                                        baseContext2 = baseContext2.getApplicationContext();
                                                    }
                                                    java.lang.String str23 = str5;
                                                    java.lang.Object[] objArr65 = {baseContext2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str23, java.lang.Object.class).invoke(null, this)).intValue()), 0, 1139225628};
                                                    byte[] bArr7 = $$d;
                                                    str7 = "valueOf";
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    d(bArr7[2], bArr7[164], 304, objArr66);
                                                    java.lang.Class<?> cls22 = java.lang.Class.forName((java.lang.String) objArr66[0]);
                                                    byte b14 = bArr7[251];
                                                    byte b15 = (byte) (b14 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE);
                                                    str8 = str23;
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    d(b14, b15, (short) (b15 | com.visa.cbp.getEncExpo.startTransaction), objArr67);
                                                    objArr5 = (java.lang.Object[]) cls22.getMethod((java.lang.String) objArr67[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr65);
                                                    if (baseContext2 == null) {
                                                        int i11 = SdkCoreAlternateContactlessPaymentDataImpl + 53;
                                                        getProfileVersion = i11 % 128;
                                                        try {
                                                            if (i11 % 2 == 0) {
                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSizeAndState(0, 0, 0), 1581 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                                a(bArr[7], (byte) 69, bArr[34], objArr68);
                                                                cls23.getField((java.lang.String) objArr68[0]).set(null, objArr5);
                                                                valueOf = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue());
                                                                cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1581, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                byte b16 = bArr[24];
                                                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                a(b16, (byte) (b16 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr69);
                                                                obj5 = objArr69[0];
                                                            } else {
                                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1580, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                                a(bArr[7], (byte) 69, bArr[34], objArr70);
                                                                cls24.getField((java.lang.String) objArr70[0]).set(null, objArr5);
                                                                valueOf = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, 1581 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.getTrimmedLength(""));
                                                                byte b17 = bArr[24];
                                                                java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                                a(b17, (byte) (b17 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr71);
                                                                obj5 = objArr71[0];
                                                            }
                                                            cls.getField((java.lang.String) obj5).set(null, valueOf);
                                                            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[1])[0]) {
                                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                arrayList2.add((java.lang.String) objArr5[2]);
                                                                arrayList2.add((java.lang.String) objArr5[3]);
                                                            }
                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, 667 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40024));
                                                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                            a(29, bArr[85], bArr[11], objArr72);
                                                            j4 = cls25.getField((java.lang.String) objArr72[0]).getLong(null);
                                                            if (j4 != -1 || j4 + 4611686018427387840L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                baseContext3 = getBaseContext();
                                                                if (baseContext3 == null) {
                                                                    int i12 = SdkCoreAlternateContactlessPaymentDataImpl + 31;
                                                                    getProfileVersion = i12 % 128;
                                                                    int i13 = i12 % 2;
                                                                    baseContext3 = (android.content.Context) java.lang.Class.forName(str).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
                                                                }
                                                                if (baseContext3 != null) {
                                                                    baseContext3 = baseContext3.getApplicationContext();
                                                                }
                                                                str9 = str8;
                                                                java.lang.Object[] objArr73 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, this)).intValue()), 0, -1244459902};
                                                                byte[] bArr8 = $$d;
                                                                byte b18 = bArr8[17];
                                                                byte b19 = bArr8[164];
                                                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                d(b18, b19, (short) (b19 | 205), objArr74);
                                                                java.lang.Class<?> cls26 = java.lang.Class.forName((java.lang.String) objArr74[0]);
                                                                byte b20 = bArr8[65];
                                                                byte b21 = bArr8[10];
                                                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                                d(b20, b21, (short) (b21 | 179), objArr75);
                                                                java.lang.Object[] objArr76 = (java.lang.Object[]) cls26.getMethod((java.lang.String) objArr75[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr73);
                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 667 - (android.os.Process.myPid() >> 22), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40023));
                                                                byte b22 = bArr[24];
                                                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                                a(b22, (byte) (b22 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr77);
                                                                cls27.getField((java.lang.String) objArr77[0]).set(null, objArr76);
                                                                long longValue4 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 667, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 40024));
                                                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                                a(29, bArr[85], bArr[11], objArr78);
                                                                c5 = 0;
                                                                cls28.getField((java.lang.String) objArr78[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                                objArr7 = objArr76;
                                                                c6 = 1;
                                                            } else {
                                                                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 37) % 128;
                                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 40, 667 - android.view.View.getDefaultSize(0, 0), (char) (40024 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                                                byte b23 = bArr[24];
                                                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                a(b23, (byte) (b23 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr79);
                                                                java.lang.Object[] objArr80 = {cls29.getField((java.lang.String) objArr79[0]).get(null), -1244459902, 0};
                                                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                if (obj21 == null) {
                                                                    obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4684, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj21);
                                                                }
                                                                objArr7 = (java.lang.Object[]) ((java.lang.reflect.Method) obj21).invoke(null, objArr80);
                                                                str9 = str8;
                                                                c6 = 1;
                                                                c5 = 0;
                                                            }
                                                            i3 = ((int[]) objArr7[c6])[c5];
                                                            if (((int[]) objArr7[c5])[c5] != i3) {
                                                                int i14 = ((int[]) objArr7[4])[c5];
                                                                java.lang.Object[] objArr81 = new java.lang.Object[3];
                                                                objArr81[2] = 0;
                                                                objArr81[1] = java.lang.Integer.valueOf(i14);
                                                                objArr81[c5] = objArr7;
                                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                if (obj22 == null) {
                                                                    obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4683, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj22);
                                                                }
                                                                ((java.lang.reflect.Method) obj22).invoke(null, objArr81);
                                                                str10 = str17;
                                                                str11 = str9;
                                                            } else {
                                                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                java.lang.Object[] objArr82 = {objArr7};
                                                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                                if (obj23 == null) {
                                                                    str11 = str9;
                                                                    str10 = str17;
                                                                    obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, 4685 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("values", java.lang.Object[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj23);
                                                                } else {
                                                                    str10 = str17;
                                                                    str11 = str9;
                                                                }
                                                                arrayList3.add(((java.lang.reflect.Method) obj23).invoke(null, objArr82));
                                                                java.lang.Object[] objArr83 = {objArr7};
                                                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                                if (obj24 == null) {
                                                                    obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, 4683 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("writeReplace", java.lang.Object[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj24);
                                                                }
                                                                arrayList3.add(((java.lang.reflect.Method) obj24).invoke(null, objArr83));
                                                                java.lang.Object[] objArr84 = {java.lang.Long.valueOf((i3 ^ r8) ^ 6964134744267161600L), 1621463983L};
                                                                byte[] bArr9 = $$d;
                                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                d(bArr9[544], bArr9[164], 145, objArr85);
                                                                java.lang.Class<?> cls30 = java.lang.Class.forName((java.lang.String) objArr85[0]);
                                                                byte b24 = bArr9[251];
                                                                byte b25 = (byte) (b24 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE);
                                                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                d(b24, b25, (short) (b25 | com.visa.cbp.getEncExpo.startTransaction), objArr86);
                                                                cls30.getMethod((java.lang.String) objArr86[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr84);
                                                                java.lang.Object[] objArr87 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[4])[0]), 0};
                                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                if (obj25 == null) {
                                                                    obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 33, 4684 - (android.os.Process.myTid() >> 22), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj25);
                                                                }
                                                                ((java.lang.reflect.Method) obj25).invoke(null, objArr87);
                                                            }
                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 24291));
                                                            byte b26 = bArr[24];
                                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                            a(b26, (byte) (b26 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr88);
                                                            j5 = cls31.getField((java.lang.String) objArr88[0]).getLong(null);
                                                            try {
                                                                if (j5 != -1 || j5 + 1936 < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                    str12 = str7;
                                                                    baseContext4 = getBaseContext();
                                                                    if (baseContext4 == null) {
                                                                        baseContext4 = (android.content.Context) java.lang.Class.forName(str).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
                                                                    }
                                                                    if (baseContext4 != null) {
                                                                        baseContext4 = baseContext4.getApplicationContext();
                                                                    }
                                                                    str13 = str11;
                                                                    java.lang.Object[] objArr89 = {baseContext4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue()), 834900735};
                                                                    byte[] bArr10 = $$d;
                                                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                    d(bArr10[92], bArr10[164], 105, objArr90);
                                                                    java.lang.Class<?> cls32 = java.lang.Class.forName((java.lang.String) objArr90[0]);
                                                                    byte b27 = bArr10[25];
                                                                    byte b28 = bArr10[5];
                                                                    str14 = str6;
                                                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                    d(b27, b28, (short) (b28 | 556), objArr91);
                                                                    objArr8 = (java.lang.Object[]) cls32.getMethod((java.lang.String) objArr91[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr89);
                                                                    if (baseContext4 == null) {
                                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 584 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 24291));
                                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                        a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr92);
                                                                        cls33.getField((java.lang.String) objArr92[0]).set(null, objArr8);
                                                                        try {
                                                                            long longValue5 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.KeyEvent.keyCodeFromString(""), 584 - android.text.TextUtils.indexOf("", ""), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24292));
                                                                            byte b29 = bArr[24];
                                                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                            a(b29, (byte) (b29 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr93);
                                                                            cls34.getField((java.lang.String) objArr93[0]).set(null, java.lang.Long.valueOf(longValue5));
                                                                            i4 = ((int[]) objArr8[1])[0];
                                                                            if (((int[]) objArr8[0])[0] != i4) {
                                                                                int i15 = getProfileVersion + 105;
                                                                                SdkCoreAlternateContactlessPaymentDataImpl = i15 % 128;
                                                                                if (i15 % 2 != 0) {
                                                                                    java.lang.Object[] objArr94 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[5])[1]), num};
                                                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj26 == null) {
                                                                                        obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, android.view.View.getDefaultSize(0, 0) + 4830, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod(str12, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj26);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj26).invoke(null, objArr94);
                                                                                } else {
                                                                                    java.lang.Object[] objArr95 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                                                                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj27 == null) {
                                                                                        obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31, android.view.View.resolveSizeAndState(0, 0, 0) + 4830, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod(str12, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj27);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj27).invoke(null, objArr95);
                                                                                }
                                                                            } else {
                                                                                java.lang.Object[] objArr96 = {java.lang.Long.valueOf((i4 ^ r9) ^ (-189803181859930112L)), -44191993L};
                                                                                byte[] bArr11 = $$d;
                                                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                                d(bArr11[65], bArr11[164], bArr11[530], objArr97);
                                                                                java.lang.Class<?> cls35 = java.lang.Class.forName((java.lang.String) objArr97[0]);
                                                                                byte b30 = bArr11[65];
                                                                                byte b31 = bArr11[10];
                                                                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                                d(b30, b31, (short) (b31 | 179), objArr98);
                                                                                cls35.getMethod((java.lang.String) objArr98[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr96);
                                                                                java.lang.Object[] objArr99 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                                                                                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj28 == null) {
                                                                                    obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 30, android.view.KeyEvent.getDeadChar(0, 0) + 4830, (char) android.text.TextUtils.indexOf("", ""))).getMethod(str12, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj28);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj28).invoke(null, objArr99);
                                                                            }
                                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 52, 584 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (24339 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                            a(29, bArr[85], bArr[11], objArr100);
                                                                            j6 = cls36.getField((java.lang.String) objArr100[0]).getLong(null);
                                                                            if (j6 != -1) {
                                                                                int i16 = SdkCoreAlternateContactlessPaymentDataImpl + 37;
                                                                                getProfileVersion = i16 % 128;
                                                                                if (i16 % 2 != 0 ? j6 + 2049 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j6 / 2049 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 584, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24290));
                                                                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                                    a((byte) (-bArr[23]), bArr[11], bArr[22], objArr101);
                                                                                    java.lang.Object[] objArr102 = {cls37.getField((java.lang.String) objArr101[0]).get(null), -1852727949, 0};
                                                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj29 == null) {
                                                                                        obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31, 4829 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod(str12, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj29);
                                                                                    }
                                                                                    objArr10 = (java.lang.Object[]) ((java.lang.reflect.Method) obj29).invoke(null, objArr102);
                                                                                    c7 = 1;
                                                                                    i5 = 0;
                                                                                    i6 = ((int[]) objArr10[c7])[i5];
                                                                                    if (((int[]) objArr10[i5])[i5] == i6) {
                                                                                        int i17 = ((int[]) objArr10[3])[i5];
                                                                                        java.lang.Object[] objArr103 = new java.lang.Object[3];
                                                                                        objArr103[2] = 0;
                                                                                        objArr103[1] = java.lang.Integer.valueOf(i17);
                                                                                        objArr103[i5] = objArr10;
                                                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                        if (obj30 == null) {
                                                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.KeyEvent.getDeadChar(i5, i5), 4830 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.View.resolveSizeAndState(i5, i5, i5));
                                                                                            java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                                                                                            clsArr[i5] = java.lang.Object[].class;
                                                                                            clsArr[1] = java.lang.Integer.TYPE;
                                                                                            clsArr[2] = java.lang.Integer.TYPE;
                                                                                            obj30 = cls38.getMethod(str12, clsArr);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
                                                                                        }
                                                                                        ((java.lang.reflect.Method) obj30).invoke(null, objArr103);
                                                                                    } else {
                                                                                        new java.util.ArrayList().add((java.lang.String) objArr10[2]);
                                                                                        java.lang.Object[] objArr104 = {java.lang.Long.valueOf((i6 ^ r8) ^ 2438595522005565440L), 567779749L};
                                                                                        byte[] bArr12 = $$d;
                                                                                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                                        d(bArr12[69], bArr12[164], 326, objArr105);
                                                                                        java.lang.Class<?> cls39 = java.lang.Class.forName((java.lang.String) objArr105[0]);
                                                                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                                        d(bArr12[97], bArr12[2], 384, objArr106);
                                                                                        cls39.getMethod((java.lang.String) objArr106[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr104);
                                                                                        java.lang.Object[] objArr107 = {objArr10, java.lang.Integer.valueOf(((int[]) objArr10[3])[0]), 0};
                                                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                        if (obj31 == null) {
                                                                                            obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 30, android.view.View.getDefaultSize(0, 0) + 4830, (char) android.graphics.Color.alpha(0))).getMethod(str12, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                                                                                        }
                                                                                        ((java.lang.reflect.Method) obj31).invoke(null, objArr107);
                                                                                    }
                                                                                    super.onCreate();
                                                                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.red(0) + 429, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 31610));
                                                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                                    a(bArr[7], (byte) 69, bArr[34], objArr108);
                                                                                    j7 = cls40.getField((java.lang.String) objArr108[0]).getLong(null);
                                                                                    if (j7 != -1 || j7 + 4611686018427387846L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                        baseContext5 = getBaseContext();
                                                                                        if (baseContext5 == null) {
                                                                                            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 25) % 128;
                                                                                            baseContext5 = (android.content.Context) java.lang.Class.forName(str).getMethod(str14, new java.lang.Class[0]).invoke(null, null);
                                                                                        }
                                                                                        if (baseContext5 != null) {
                                                                                            baseContext5 = baseContext5.getApplicationContext();
                                                                                        }
                                                                                        int intValue3 = ((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue();
                                                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                                        b("\ufff0￩\u001d￩\u001b\u001c￮\u001d\u001a\u001b￪￪￨\u001d\u001b\u001b￩￭\u001c￬\u001a￫\ufff0￫￪\u001d￬￮\u0019￮\ufff0￫￮\u0018\u001c\ufff0￩\ufff0\u001a￫￪\u001c￨￭\u001a\u0019￬\u0019\u0018￫\u001b\u001c\uffe7\uffe7￨\u001c\u001d\ufff0\u001a\u0019\u001c\u0019￩\uffe7", true, android.view.KeyEvent.normalizeMetaState(0) + 201, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, 64 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr109);
                                                                                        java.lang.String str24 = (java.lang.String) objArr109[0];
                                                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                                        b("\u001f￬￪\u001c\ufff2￮ ￮\ufff3\u001b￭￫￪\ufff1\uffef ￮\ufff1 \u001e￭\u001b￪\ufff1\ufff3\ufff2￬\u001e\ufff2\u001d\u001b \u001f  \u001e\ufff3\u001c￮\uffef￭\u001e￭\ufff1\u001d\ufff1\ufff2￬\ufff2\uffef\ufff0 \ufff1\ufff2￬\u001b\ufff2\u001f￪\ufff3 ￫￮\u001f", false, 198 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 37 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 64 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr110);
                                                                                        java.lang.String str25 = (java.lang.String) objArr110[0];
                                                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                                        c("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{15, 64, 0, 0}, objArr111);
                                                                                        java.lang.String str26 = (java.lang.String) objArr111[0];
                                                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                        c("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{79, 64, 136, 0}, objArr112);
                                                                                        java.lang.Object[] objArr113 = {baseContext5, new java.lang.String[]{str24, str25, str26, (java.lang.String) objArr112[0]}, java.lang.Integer.valueOf(intValue3), 0, 273271868};
                                                                                        byte[] bArr13 = $$d;
                                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                        d(bArr13[134], bArr13[164], bArr13[10], objArr114);
                                                                                        java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr114[0]);
                                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                        d(bArr13[97], bArr13[2], 384, objArr115);
                                                                                        java.lang.Object[] objArr116 = (java.lang.Object[]) cls41.getMethod((java.lang.String) objArr115[0], java.lang.Class.forName(str21), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr113);
                                                                                        int i18 = ((int[]) objArr116[1])[0];
                                                                                        int i19 = ((int[]) objArr116[0])[0];
                                                                                        if (baseContext5 != null) {
                                                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 27, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 429, (char) (android.graphics.Color.blue(0) + 31610));
                                                                                            byte b32 = bArr[11];
                                                                                            byte b33 = (byte) (b32 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                            a(b32, b33, (byte) (b33 + 3), objArr117);
                                                                                            cls42.getField((java.lang.String) objArr117[0]).set(null, objArr116);
                                                                                            try {
                                                                                                long longValue6 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 27, 429 - android.graphics.Color.argb(0, 0, 0, 0), (char) (31610 - android.graphics.Color.argb(0, 0, 0, 0)));
                                                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                                a(bArr[7], (byte) 69, bArr[34], objArr118);
                                                                                                cls43.getField((java.lang.String) objArr118[0]).set(null, java.lang.Long.valueOf(longValue6));
                                                                                            } catch (java.lang.Exception unused2) {
                                                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                            }
                                                                                        }
                                                                                        objArr11 = objArr116;
                                                                                    } else {
                                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 27, android.view.View.MeasureSpec.getSize(0) + 429, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 31610));
                                                                                        byte b34 = bArr[11];
                                                                                        byte b35 = (byte) (b34 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                        a(b34, b35, (byte) (b35 + 3), objArr119);
                                                                                        java.lang.Object[] objArr120 = {cls44.getField((java.lang.String) objArr119[0]).get(null), 273271868, 0};
                                                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                        if (obj32 == null) {
                                                                                            obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4619, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj32);
                                                                                        }
                                                                                        objArr11 = (java.lang.Object[]) ((java.lang.reflect.Method) obj32).invoke(null, objArr120);
                                                                                    }
                                                                                    i7 = ((int[]) objArr11[1])[0];
                                                                                    if (((int[]) objArr11[0])[0] == i7) {
                                                                                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 61) % 128;
                                                                                        java.lang.Object[] objArr121 = {objArr11, java.lang.Integer.valueOf(((int[]) objArr11[2])[0]), 0};
                                                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                        if (obj33 == null) {
                                                                                            obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 33, android.graphics.Color.rgb(0, 0, 0) + 16781834, (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj33);
                                                                                        }
                                                                                        ((java.lang.reflect.Method) obj33).invoke(null, objArr121);
                                                                                        return;
                                                                                    }
                                                                                    java.lang.Object[] objArr122 = {java.lang.Long.valueOf((i7 ^ r6) ^ (-8504273406311530496L)), -1980055515L};
                                                                                    byte[] bArr14 = $$d;
                                                                                    byte b36 = bArr14[164];
                                                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                    d(b36, b36, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED, objArr123);
                                                                                    java.lang.Class<?> cls45 = java.lang.Class.forName((java.lang.String) objArr123[0]);
                                                                                    byte b37 = bArr14[25];
                                                                                    byte b38 = bArr14[5];
                                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                    d(b37, b38, (short) (b38 | 556), objArr124);
                                                                                    cls45.getMethod((java.lang.String) objArr124[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr122);
                                                                                    java.lang.Object[] objArr125 = {objArr11, java.lang.Integer.valueOf(((int[]) objArr11[2])[0]), 0};
                                                                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                                                    if (obj34 == null) {
                                                                                        obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.combineMeasuredStates(0, 0), 4618 - android.view.View.combineMeasuredStates(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj34);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj34).invoke(null, objArr125);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            java.lang.Object[] objArr126 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue()), -1852727949};
                                                                            byte[] bArr15 = $$d;
                                                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                            d(bArr15[555], bArr15[164], bArr15[326], objArr127);
                                                                            java.lang.Class<?> cls46 = java.lang.Class.forName((java.lang.String) objArr127[0]);
                                                                            byte b39 = bArr15[251];
                                                                            byte b40 = (byte) (b39 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE);
                                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                            d(b39, b40, (short) (b40 | com.visa.cbp.getEncExpo.startTransaction), objArr128);
                                                                            objArr10 = (java.lang.Object[]) cls46.getMethod((java.lang.String) objArr128[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr126);
                                                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 51, 584 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24291));
                                                                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                            a((byte) (-bArr[23]), bArr[11], bArr[22], objArr129);
                                                                            cls47.getField((java.lang.String) objArr129[0]).set(null, objArr10);
                                                                            long longValue7 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51, 584 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                                            java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                            a(29, bArr[85], bArr[11], objArr130);
                                                                            i5 = 0;
                                                                            cls48.getField((java.lang.String) objArr130[0]).set(null, java.lang.Long.valueOf(longValue7));
                                                                            c7 = 1;
                                                                            i6 = ((int[]) objArr10[c7])[i5];
                                                                            if (((int[]) objArr10[i5])[i5] == i6) {
                                                                            }
                                                                            super.onCreate();
                                                                            java.lang.Class cls402 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.red(0) + 429, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 31610));
                                                                            java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                                                            a(bArr[7], (byte) 69, bArr[34], objArr1082);
                                                                            j7 = cls402.getField((java.lang.String) objArr1082[0]).getLong(null);
                                                                            if (j7 != -1) {
                                                                            }
                                                                            baseContext5 = getBaseContext();
                                                                            if (baseContext5 == null) {
                                                                            }
                                                                            if (baseContext5 != null) {
                                                                            }
                                                                            int intValue32 = ((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue();
                                                                            java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                                            b("\ufff0￩\u001d￩\u001b\u001c￮\u001d\u001a\u001b￪￪￨\u001d\u001b\u001b￩￭\u001c￬\u001a￫\ufff0￫￪\u001d￬￮\u0019￮\ufff0￫￮\u0018\u001c\ufff0￩\ufff0\u001a￫￪\u001c￨￭\u001a\u0019￬\u0019\u0018￫\u001b\u001c\uffe7\uffe7￨\u001c\u001d\ufff0\u001a\u0019\u001c\u0019￩\uffe7", true, android.view.KeyEvent.normalizeMetaState(0) + 201, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, 64 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1092);
                                                                            java.lang.String str242 = (java.lang.String) objArr1092[0];
                                                                            java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                                                            b("\u001f￬￪\u001c\ufff2￮ ￮\ufff3\u001b￭￫￪\ufff1\uffef ￮\ufff1 \u001e￭\u001b￪\ufff1\ufff3\ufff2￬\u001e\ufff2\u001d\u001b \u001f  \u001e\ufff3\u001c￮\uffef￭\u001e￭\ufff1\u001d\ufff1\ufff2￬\ufff2\uffef\ufff0 \ufff1\ufff2￬\u001b\ufff2\u001f￪\ufff3 ￫￮\u001f", false, 198 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 37 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 64 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr1102);
                                                                            java.lang.String str252 = (java.lang.String) objArr1102[0];
                                                                            java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                                            c("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{15, 64, 0, 0}, objArr1112);
                                                                            java.lang.String str262 = (java.lang.String) objArr1112[0];
                                                                            java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                                            c("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{79, 64, 136, 0}, objArr1122);
                                                                            java.lang.Object[] objArr1132 = {baseContext5, new java.lang.String[]{str242, str252, str262, (java.lang.String) objArr1122[0]}, java.lang.Integer.valueOf(intValue32), 0, 273271868};
                                                                            byte[] bArr132 = $$d;
                                                                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                                            d(bArr132[134], bArr132[164], bArr132[10], objArr1142);
                                                                            java.lang.Class<?> cls412 = java.lang.Class.forName((java.lang.String) objArr1142[0]);
                                                                            java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                                            d(bArr132[97], bArr132[2], 384, objArr1152);
                                                                            java.lang.Object[] objArr1162 = (java.lang.Object[]) cls412.getMethod((java.lang.String) objArr1152[0], java.lang.Class.forName(str21), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1132);
                                                                            int i182 = ((int[]) objArr1162[1])[0];
                                                                            int i192 = ((int[]) objArr1162[0])[0];
                                                                            if (baseContext5 != null) {
                                                                            }
                                                                            objArr11 = objArr1162;
                                                                            i7 = ((int[]) objArr11[1])[0];
                                                                            if (((int[]) objArr11[0])[0] == i7) {
                                                                            }
                                                                        } catch (java.lang.Exception unused3) {
                                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                        }
                                                                    } else {
                                                                        objArr9 = objArr8;
                                                                    }
                                                                } else {
                                                                    java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24290));
                                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                    a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr131);
                                                                    java.lang.Object[] objArr132 = {cls49.getField((java.lang.String) objArr131[0]).get(null), 834900735, 0};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                    if (obj35 == null) {
                                                                        str12 = str7;
                                                                        obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30, 4830 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod(str12, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj35);
                                                                    } else {
                                                                        str12 = str7;
                                                                    }
                                                                    objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj35).invoke(null, objArr132);
                                                                    str14 = str6;
                                                                    str13 = str11;
                                                                }
                                                                long longValue72 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls482 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51, 584 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                                java.lang.Object[] objArr1302 = new java.lang.Object[1];
                                                                a(29, bArr[85], bArr[11], objArr1302);
                                                                i5 = 0;
                                                                cls482.getField((java.lang.String) objArr1302[0]).set(null, java.lang.Long.valueOf(longValue72));
                                                                c7 = 1;
                                                                i6 = ((int[]) objArr10[c7])[i5];
                                                                if (((int[]) objArr10[i5])[i5] == i6) {
                                                                }
                                                                super.onCreate();
                                                                java.lang.Class cls4022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.red(0) + 429, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 31610));
                                                                java.lang.Object[] objArr10822 = new java.lang.Object[1];
                                                                a(bArr[7], (byte) 69, bArr[34], objArr10822);
                                                                j7 = cls4022.getField((java.lang.String) objArr10822[0]).getLong(null);
                                                                if (j7 != -1) {
                                                                }
                                                                baseContext5 = getBaseContext();
                                                                if (baseContext5 == null) {
                                                                }
                                                                if (baseContext5 != null) {
                                                                }
                                                                int intValue322 = ((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue();
                                                                java.lang.Object[] objArr10922 = new java.lang.Object[1];
                                                                b("\ufff0￩\u001d￩\u001b\u001c￮\u001d\u001a\u001b￪￪￨\u001d\u001b\u001b￩￭\u001c￬\u001a￫\ufff0￫￪\u001d￬￮\u0019￮\ufff0￫￮\u0018\u001c\ufff0￩\ufff0\u001a￫￪\u001c￨￭\u001a\u0019￬\u0019\u0018￫\u001b\u001c\uffe7\uffe7￨\u001c\u001d\ufff0\u001a\u0019\u001c\u0019￩\uffe7", true, android.view.KeyEvent.normalizeMetaState(0) + 201, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, 64 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10922);
                                                                java.lang.String str2422 = (java.lang.String) objArr10922[0];
                                                                java.lang.Object[] objArr11022 = new java.lang.Object[1];
                                                                b("\u001f￬￪\u001c\ufff2￮ ￮\ufff3\u001b￭￫￪\ufff1\uffef ￮\ufff1 \u001e￭\u001b￪\ufff1\ufff3\ufff2￬\u001e\ufff2\u001d\u001b \u001f  \u001e\ufff3\u001c￮\uffef￭\u001e￭\ufff1\u001d\ufff1\ufff2￬\ufff2\uffef\ufff0 \ufff1\ufff2￬\u001b\ufff2\u001f￪\ufff3 ￫￮\u001f", false, 198 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 37 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 64 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr11022);
                                                                java.lang.String str2522 = (java.lang.String) objArr11022[0];
                                                                java.lang.Object[] objArr11122 = new java.lang.Object[1];
                                                                c("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{15, 64, 0, 0}, objArr11122);
                                                                java.lang.String str2622 = (java.lang.String) objArr11122[0];
                                                                java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                                                c("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{79, 64, 136, 0}, objArr11222);
                                                                java.lang.Object[] objArr11322 = {baseContext5, new java.lang.String[]{str2422, str2522, str2622, (java.lang.String) objArr11222[0]}, java.lang.Integer.valueOf(intValue322), 0, 273271868};
                                                                byte[] bArr1322 = $$d;
                                                                java.lang.Object[] objArr11422 = new java.lang.Object[1];
                                                                d(bArr1322[134], bArr1322[164], bArr1322[10], objArr11422);
                                                                java.lang.Class<?> cls4122 = java.lang.Class.forName((java.lang.String) objArr11422[0]);
                                                                java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                                                d(bArr1322[97], bArr1322[2], 384, objArr11522);
                                                                java.lang.Object[] objArr11622 = (java.lang.Object[]) cls4122.getMethod((java.lang.String) objArr11522[0], java.lang.Class.forName(str21), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11322);
                                                                int i1822 = ((int[]) objArr11622[1])[0];
                                                                int i1922 = ((int[]) objArr11622[0])[0];
                                                                if (baseContext5 != null) {
                                                                }
                                                                objArr11 = objArr11622;
                                                                i7 = ((int[]) objArr11[1])[0];
                                                                if (((int[]) objArr11[0])[0] == i7) {
                                                                }
                                                            } catch (java.lang.Exception unused4) {
                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                            }
                                                            objArr8 = objArr9;
                                                            i4 = ((int[]) objArr8[1])[0];
                                                            if (((int[]) objArr8[0])[0] != i4) {
                                                            }
                                                            java.lang.Class cls362 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 52, 584 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (24339 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                            java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                            a(29, bArr[85], bArr[11], objArr1002);
                                                            j6 = cls362.getField((java.lang.String) objArr1002[0]).getLong(null);
                                                            if (j6 != -1) {
                                                            }
                                                            java.lang.Object[] objArr1262 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue()), -1852727949};
                                                            byte[] bArr152 = $$d;
                                                            java.lang.Object[] objArr1272 = new java.lang.Object[1];
                                                            d(bArr152[555], bArr152[164], bArr152[326], objArr1272);
                                                            java.lang.Class<?> cls462 = java.lang.Class.forName((java.lang.String) objArr1272[0]);
                                                            byte b392 = bArr152[251];
                                                            byte b402 = (byte) (b392 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE);
                                                            java.lang.Object[] objArr1282 = new java.lang.Object[1];
                                                            d(b392, b402, (short) (b402 | com.visa.cbp.getEncExpo.startTransaction), objArr1282);
                                                            objArr10 = (java.lang.Object[]) cls462.getMethod((java.lang.String) objArr1282[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1262);
                                                            java.lang.Class cls472 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 51, 584 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24291));
                                                            java.lang.Object[] objArr1292 = new java.lang.Object[1];
                                                            a((byte) (-bArr[23]), bArr[11], bArr[22], objArr1292);
                                                            cls472.getField((java.lang.String) objArr1292[0]).set(null, objArr10);
                                                        } catch (java.lang.Exception unused5) {
                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                        }
                                                    } else {
                                                        objArr6 = objArr5;
                                                    }
                                                } else {
                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.blue(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1582, (char) android.view.View.combineMeasuredStates(0, 0));
                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                    a(bArr[7], (byte) 69, bArr[34], objArr133);
                                                    java.lang.Object[] objArr134 = {cls50.getField((java.lang.String) objArr133[0]).get(null), 1139225628, 0};
                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                    if (obj36 == null) {
                                                        obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, 4905 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj36);
                                                    }
                                                    objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj36).invoke(null, objArr134);
                                                    str8 = str5;
                                                    str7 = "valueOf";
                                                }
                                                long longValue42 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls282 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 667, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 40024));
                                                java.lang.Object[] objArr782 = new java.lang.Object[1];
                                                a(29, bArr[85], bArr[11], objArr782);
                                                c5 = 0;
                                                cls282.getField((java.lang.String) objArr782[0]).set(null, java.lang.Long.valueOf(longValue42));
                                                objArr7 = objArr76;
                                                c6 = 1;
                                                i3 = ((int[]) objArr7[c6])[c5];
                                                if (((int[]) objArr7[c5])[c5] != i3) {
                                                }
                                                java.lang.Class cls312 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 24291));
                                                byte b262 = bArr[24];
                                                java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                a(b262, (byte) (b262 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr882);
                                                j5 = cls312.getField((java.lang.String) objArr882[0]).getLong(null);
                                                if (j5 != -1) {
                                                }
                                                str12 = str7;
                                                baseContext4 = getBaseContext();
                                                if (baseContext4 == null) {
                                                }
                                                if (baseContext4 != null) {
                                                }
                                                str13 = str11;
                                                java.lang.Object[] objArr892 = {baseContext4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str10).getMethod(str13, java.lang.Object.class).invoke(null, this)).intValue()), 834900735};
                                                byte[] bArr102 = $$d;
                                                java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                d(bArr102[92], bArr102[164], 105, objArr902);
                                                java.lang.Class<?> cls322 = java.lang.Class.forName((java.lang.String) objArr902[0]);
                                                byte b272 = bArr102[25];
                                                byte b282 = bArr102[5];
                                                str14 = str6;
                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                d(b272, b282, (short) (b282 | 556), objArr912);
                                                objArr8 = (java.lang.Object[]) cls322.getMethod((java.lang.String) objArr912[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr892);
                                                if (baseContext4 == null) {
                                                }
                                            } catch (java.lang.Exception unused6) {
                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                            }
                                            objArr5 = objArr6;
                                            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[1])[0]) {
                                            }
                                            java.lang.Class cls252 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, 667 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40024));
                                            java.lang.Object[] objArr722 = new java.lang.Object[1];
                                            a(29, bArr[85], bArr[11], objArr722);
                                            j4 = cls252.getField((java.lang.String) objArr722[0]).getLong(null);
                                            if (j4 != -1) {
                                            }
                                            baseContext3 = getBaseContext();
                                            if (baseContext3 == null) {
                                            }
                                            if (baseContext3 != null) {
                                            }
                                            str9 = str8;
                                            java.lang.Object[] objArr732 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, this)).intValue()), 0, -1244459902};
                                            byte[] bArr82 = $$d;
                                            byte b182 = bArr82[17];
                                            byte b192 = bArr82[164];
                                            java.lang.Object[] objArr742 = new java.lang.Object[1];
                                            d(b182, b192, (short) (b192 | 205), objArr742);
                                            java.lang.Class<?> cls262 = java.lang.Class.forName((java.lang.String) objArr742[0]);
                                            byte b202 = bArr82[65];
                                            byte b212 = bArr82[10];
                                            java.lang.Object[] objArr752 = new java.lang.Object[1];
                                            d(b202, b212, (short) (b212 | 179), objArr752);
                                            java.lang.Object[] objArr762 = (java.lang.Object[]) cls262.getMethod((java.lang.String) objArr752[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr732);
                                            java.lang.Class cls272 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 667 - (android.os.Process.myPid() >> 22), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40023));
                                            byte b222 = bArr[24];
                                            java.lang.Object[] objArr772 = new java.lang.Object[1];
                                            a(b222, (byte) (b222 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr772);
                                            cls272.getField((java.lang.String) objArr772[0]).set(null, objArr762);
                                        } catch (java.lang.Exception unused7) {
                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                        }
                                    } else {
                                        objArr3 = objArr56;
                                    }
                                } else {
                                    java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 584 - android.view.View.combineMeasuredStates(0, 0), (char) (24291 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                                    byte b41 = bArr[11];
                                    byte b42 = (byte) (b41 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                    a(b41, b42, (byte) (b42 + 3), objArr135);
                                    java.lang.Object[] objArr136 = {cls51.getField((java.lang.String) objArr135[0]).get(null), -1511446721, 0};
                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                    if (obj37 == null) {
                                        obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.Color.green(0), 4830 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj37);
                                    }
                                    objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj37).invoke(null, objArr136);
                                    str6 = str2;
                                }
                                objArr4 = objArr3;
                                i2 = ((int[]) objArr4[1])[0];
                                if (((int[]) objArr4[0])[0] != i2) {
                                }
                                java.lang.Class cls212 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.getDefaultSize(0, 0), 1581 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", ""));
                                byte b132 = bArr[24];
                                java.lang.Object[] objArr642 = new java.lang.Object[1];
                                a(b132, (byte) (b132 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr642);
                                j3 = cls212.getField((java.lang.String) objArr642[0]).getLong(null);
                                if (j3 != -1) {
                                }
                                baseContext2 = getBaseContext();
                                if (baseContext2 == null) {
                                }
                                if (baseContext2 != null) {
                                }
                                java.lang.String str232 = str5;
                                java.lang.Object[] objArr652 = {baseContext2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str232, java.lang.Object.class).invoke(null, this)).intValue()), 0, 1139225628};
                                byte[] bArr72 = $$d;
                                str7 = "valueOf";
                                java.lang.Object[] objArr662 = new java.lang.Object[1];
                                d(bArr72[2], bArr72[164], 304, objArr662);
                                java.lang.Class<?> cls222 = java.lang.Class.forName((java.lang.String) objArr662[0]);
                                byte b142 = bArr72[251];
                                byte b152 = (byte) (b142 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE);
                                str8 = str232;
                                java.lang.Object[] objArr672 = new java.lang.Object[1];
                                d(b142, b152, (short) (b152 | com.visa.cbp.getEncExpo.startTransaction), objArr672);
                                objArr5 = (java.lang.Object[]) cls222.getMethod((java.lang.String) objArr672[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr652);
                                if (baseContext2 == null) {
                                }
                            }
                        }
                        java.lang.Object[] objArr532 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str22, java.lang.Object.class).invoke(null, this)).intValue()), -1511446721};
                        byte[] bArr52 = $$d;
                        str5 = str22;
                        java.lang.Object[] objArr542 = new java.lang.Object[1];
                        d(bArr52[136], bArr52[164], 349, objArr542);
                        java.lang.Class<?> cls172 = java.lang.Class.forName((java.lang.String) objArr542[0]);
                        byte b102 = bArr52[10];
                        java.lang.Object[] objArr552 = new java.lang.Object[1];
                        d(b102, (byte) (b102 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE), 634, objArr552);
                        java.lang.Object[] objArr562 = (java.lang.Object[]) cls172.getMethod((java.lang.String) objArr552[0], java.lang.Class.forName(str21), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr532);
                        if (baseContext == null) {
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                    long longValue22 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 47, 707 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (34284 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    byte b92 = bArr[24];
                    objArr2 = objArr41;
                    str5 = str4;
                    c3 = 1;
                    java.lang.Object[] objArr432 = new java.lang.Object[1];
                    a(b92, (byte) (b92 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr432);
                    c4 = 0;
                    cls132.getField((java.lang.String) objArr432[0]).set(null, java.lang.Long.valueOf(longValue22));
                    i = ((int[]) objArr2[c3])[c4];
                    if (((int[]) objArr2[c4])[c4] != i) {
                    }
                    java.lang.Class cls162 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 51, 584 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.graphics.Color.rgb(0, 0, 0) + 16801507));
                    java.lang.Object[] objArr522 = new java.lang.Object[1];
                    a(bArr[7], (byte) 69, bArr[34], objArr522);
                    j2 = cls162.getField((java.lang.String) objArr522[0]).getLong(null);
                    if (j2 != -1) {
                    }
                    baseContext = getBaseContext();
                    if (baseContext != null) {
                    }
                    if (baseContext != null) {
                    }
                    java.lang.String str222 = str5;
                } catch (java.lang.Exception unused8) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                long longValue8 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 47, 754 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (45560 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                java.lang.Object[] objArr137 = new java.lang.Object[1];
                a(29, bArr[85], bArr[11], objArr137);
                cls52.getField((java.lang.String) objArr137[0]).set(null, java.lang.Long.valueOf(longValue8));
                obj = invoke;
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                if (obj2 == null) {
                }
                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, null)).intValue();
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                if (obj3 == null) {
                }
                if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, null)).intValue() != intValue) {
                }
                java.lang.Class cls102 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.KeyEvent.keyCodeFromString(""), 707 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (34284 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                byte b72 = bArr[24];
                java.lang.Object[] objArr382 = new java.lang.Object[1];
                a(b72, (byte) (b72 | 74), org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, objArr382);
                j = cls102.getField((java.lang.String) objArr382[0]).getLong(null);
                if (j != -1) {
                }
                java.lang.Object[] objArr392 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str4, java.lang.Object.class).invoke(null, this)).intValue()), 0, -545704489};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                if (obj4 == null) {
                }
                java.lang.Object[] objArr412 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr392);
                java.lang.Class cls122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 708, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 34284));
                java.lang.Object[] objArr422 = new java.lang.Object[1];
                a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr422);
                cls122.getField((java.lang.String) objArr422[0]).set(null, objArr412);
            } catch (java.lang.Exception unused9) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
            str4 = str3;
            java.lang.Object[] objArr138 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str4, java.lang.Object.class).invoke(null, this)).intValue()), -1289568059};
            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
            if (obj38 == null) {
                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46, 754 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.indexOf("", "") + 45560));
                java.lang.Object[] objArr139 = new java.lang.Object[1];
                a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr139);
                obj38 = cls53.getMethod((java.lang.String) objArr139[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj38);
            }
            invoke = ((java.lang.reflect.Method) obj38).invoke(null, objArr138);
            java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, android.text.TextUtils.getTrimmedLength("") + 754, (char) (45559 - android.os.Process.getGidForName("")));
            java.lang.Object[] objArr140 = new java.lang.Object[1];
            a(bArr[60], (byte) (-bArr[45]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr140);
            cls54.getField((java.lang.String) objArr140[0]).set(null, invoke);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$2() {
        $$g = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
        $$h = 114;
    }

    static void DigitizedCardProfile() {
        RecordsJson = 1889207265;
        getAid = new char[]{16890, 16805, 16807, 16811, 16806, 16808, 16806, 16831, 16802, 16810, 16789, 16789, 16813, 16808, 16830, 16892, 16813, 16813, 16811, 16768, 16890, 16775, 16770, 16893, 16893, 16891, 16892, 16895, 16773, 16810, 16771, 16891, 16893, 16773, 16770, 16771, 16771, 16768, 16813, 16815, 16813, 16810, 16771, 16889, 16886, 16770, 16770, 16889, 16768, 16773, 16890, 16768, 16768, 16889, 16893, 16894, 16775, 16772, 16888, 16888, 16893, 16893, 16892, 16892, 16892, 16772, 16811, 16770, 16892, 16775, 16812, 16771, 16773, 16770, 16890, 16892, 16888, 16886, 16769, 16827, 16667, 16667, 16666, 16754, 16669, 16677, 16670, 16669, 16664, 16667, 16669, 16666, 16664, 16667, 16677, 16679, 16666, 16753, 16664, 16665, 16753, 16754, 16756, 16757, 16753, 16654, 16753, 16752, 16756, 16756, 16755, 16754, 16759, 16668, 16675, 16666, 16666, 16667, 16757, 16757, 16667, 16664, 16667, 16677, 16674, 16667, 16753, 16655, 16755, 16668, 16667, 16754, 16756, 16756, 16759, 16757, 16756, 16756, 16754, 16752, 16754, 16757, 16754};
    }

    static void init$1() {
        byte[] bArr = new byte[753];
        java.lang.System.arraycopy("Iu6+õ\u0003@Â\rï\u0000\u0010ô\u0010\u0003ð\u000f7Âþþ\u0010ú>½\u000eùÿü\u0010ù\rô\u000eû\u0003ù\tøûGÎò\b<Åø\u0005\u0002Aáàü\f\u0004î*ß\u0004ú\u000e÷\u000bû\u0002\u001dîõý\u0011ó\u00000Ø\fòú\ný\u0010\u0002\u0016öø\u0011óõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò-äý\u0003\u0000õQ¯\u0016öø\u0011\u0017êõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò!ã\u0012ôü\u0013ÿð\fû\u0002,Ò\u000e\u0002\u0000øû\f\töúÜ\u0003ÿö\fð\u0016\u0002\"ãð\u000f\u0015ß\u0004\nþþ\bõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò4Í\u0002\u0006\u001dëð\u0016\u0012ðî\u0005!Ü\n\f\u000fïö\r%à\u0000\u0006í\nù\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò%èü.Í\u0002\u0006\u0003\rî\f\u0007\u0003ö\u0001ô(îó\u000fò3Ê9Ò\u0001\u0005\u0004\u0007\u0003î\fû\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8ßðé\u0019ùø\u001eã\u000fô/äî\u0014\u001eäó\u0011\u0017Ýþ\u0005Iðõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò)äü\nó\u0006\nö\u0010\u0014îö\u0005\fÿÿõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò%ß\u000eó\u0001\u000f\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò4Ï\u0001\u000fò\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Æ\u0006\u0000øû\f\u0004îõ\u0003@Â\rï\u0000\u0010ô\u0010\u0003ð\u000f7Âþþ\u0010ú>Ì\u0003ð\u000f7¿ÿ\u0004\nþþ\b8¹F\u0004Ýîùÿü\u0010\u0016ðé\r\tøû1äî\u0014\f&èØ\u0005\u0002\u0016öø\u0011\u0017êõ\u0003@Â\rï\u0000\u0010ô\u0010\u0003ð\u000f7Âþþ\u0010ú>Ì\u0003ð\u000f7¿ÿ\u0004\nþþ\b8¼\u0010ú>ëÜ\u0003ÿö\fð\u0016\u0002\"ãð\u000f\u001bØ\u0005\u0002Kô\u000eó\u000fòÖù\u0010ô\u0005\u000eî\u0010#Õ\u0002û\u0014ÿð\t\bó\u0001$ðé\r\tøû1äî\u0014\u0018Ø\u0005\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìò\u000e\u0005î\u0010#Õ\u0002\tþ\u0003ó\u0004\u0012î\fû\u0002,Õ\u0002û\u0010î\u0005õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò%ß\u0004\fð\u0013ð2Õ\u0002\tþ\u0003õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8À\u0000\fø Þ0Ò\u000e\u0005î\u0010\"äî\u0014\u0000\u0002ï\u000fõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò2Û\tÿ à\u0003ø\u0004ü\n\u0017â\u001fá\u0004ûP¯\u0016öø\u0011óõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8ìÕ\u0002û\u0014ÿð\t\bó\u0001$ðé\r\tøû1äî\u0014>ò".getBytes("ISO-8859-1"), 0, bArr, 0, 753);
        $$d = bArr;
        $$e = 227;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getProfileVersion = 1;
        DigitizedCardProfile();
        AlternateContactlessPaymentDataJson = new char[]{11062, 11013, 11019, 11033, 11012, 11022, 11077, 11016, 11035, 11018, 11048, 11039};
        writeReplace = -143185257;
        values = true;
        DigitizedCardProfile = true;
        int i = getProfileVersion + 101;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{98, -72, 105, -100, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized, 3, 7, -13, 13, 17, -21, -13, 2, 9, -4, -4, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -19, -9, 38, -46, -5, com.google.common.base.Ascii.VT, 34, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.SYN, -38, -5, 2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }
}
