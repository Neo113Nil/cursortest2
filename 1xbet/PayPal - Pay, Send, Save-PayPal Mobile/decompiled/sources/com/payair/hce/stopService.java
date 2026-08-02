package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class stopService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static final char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char valueOf;
    private static com.payair.hce.stopService values;
    private static final /* synthetic */ com.payair.hce.stopService[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b + 4;
        int i5 = 1 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            i2 = 0;
            i4 += -i6;
            bArr2[i2] = (byte) i4;
            i2++;
            i3++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i4 += -i6;
            bArr2[i2] = (byte) i4;
            i2++;
            i3++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i4 = 73 - (s * 8);
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i2++;
            i3++;
            if (i2 == i5) {
            }
        }
    }

    private stopService(java.lang.String str) {
    }

    public static com.payair.hce.stopService valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 97) % 128;
        com.payair.hce.stopService stopservice = (com.payair.hce.stopService) java.lang.Enum.valueOf(com.payair.hce.stopService.class, str);
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        return stopservice;
    }

    public static com.payair.hce.stopService[] values() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 73) % 128;
        com.payair.hce.stopService[] stopserviceArr = (com.payair.hce.stopService[]) writeReplace.clone();
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 59) % 128;
        return stopserviceArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        android.view.KeyEvent.keyCodeFromString("");
        android.text.TextUtils.getOffsetBefore("", 0);
        android.graphics.PointF.length(0.0f, 0.0f);
        android.view.ViewConfiguration.getKeyRepeatDelay();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 48), "\u001d!\u0017,\u000b'0\r", 8 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        com.payair.hce.stopService stopservice = new com.payair.hce.stopService(((java.lang.String) objArr[0]).intern());
        values = stopservice;
        writeReplace = new com.payair.hce.stopService[]{stopservice};
        DigitizedCardProfile = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 81;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static void writeReplace(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 41;
                IccPrivateKeyCrtComponentsJson = i2 % 128;
                if (i2 % 2 == 0) {
                    bArr[i] = 0;
                    i += 35;
                } else {
                    bArr[i] = 0;
                    i++;
                }
            }
            return;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 61) % 128;
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        if (str != null) {
            int i3 = $11 + 59;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        byte b2 = -1;
        int i4 = -1497284274;
        if (cArr3 != null) {
            $11 = ($10 + 59) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i4));
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.green(0), 2509 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6803));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 1, b2, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    b2 = -1;
                    i4 = -1497284274;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.KeyEvent.getDeadChar(0, 0) + 2508, (char) (6802 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 1, (byte) -1, 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 45;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 52;
                cArr5[i2] = (char) (cArr2[i2] - b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = 0;
            while (true) {
                digitizedCardJson12.values = i7;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                $10 = ($11 + 121) % 128;
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i8 = $11 + 51;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf % b);
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.writeReplace / b);
                    } else {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    }
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.indexOf("", "", 0) + 3596, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 97) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49, android.view.KeyEvent.getDeadChar(0, 0) + 2665, (char) (18888 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((short) 0, (byte) -1, 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i9 * charValue) + i10];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.RecordsJson;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[(i11 * charValue) + i12];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i13 * charValue) + i14];
                    } else {
                        int i15 = digitizedCardJson12.DigitizedCardProfile;
                        int i16 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i17 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i18 = digitizedCardJson12.RecordsJson;
                        cArr5[digitizedCardJson12.values] = cArr3[(i15 * charValue) + i16];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i17 * charValue) + i18];
                        $11 = ($10 + 7) % 128;
                    }
                }
                i7 = digitizedCardJson12.values + 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr5[i19] = (char) (cArr5[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    public static java.lang.String values(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 27) % 128;
        java.lang.String substring = AlternateContactlessPaymentDataJson(str).substring(r2.length() - 4);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 121;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return substring;
        }
        throw new java.lang.ArithmeticException();
    }

    public static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.lang.String substring;
        java.lang.Object obj;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 17;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            substring = str.substring(0, 30);
            byte combineMeasuredStates = (byte) (android.view.View.combineMeasuredStates(1, 1) * 110);
            android.text.TextUtils.indexOf("", "", 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(combineMeasuredStates, "㙋", 0, objArr);
            obj = objArr[0];
        } else {
            substring = str.substring(0, 19);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((byte) (111 - android.view.View.combineMeasuredStates(0, 0)), "㙋", 1 - android.text.TextUtils.indexOf("", "", 0), objArr2);
            obj = objArr2[0];
        }
        java.lang.String replaceAll = substring.replaceAll(((java.lang.String) obj).intern(), "");
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 97) % 128;
        return replaceAll;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r12.equals(((java.lang.String) r8[0]).intern()) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        r8 = new java.lang.Object[1];
        a((byte) (android.widget.ExpandableListView.getPackedPositionChild(0) + 70), "\u001f\u001c", 3 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        if (r12.startsWith(((java.lang.String) r8[0]).intern()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        r12 = r12.substring(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if ((r12.length() % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        r8 = new java.lang.Object[1];
        a((byte) (34 - android.os.Process.getGidForName("")), "㗍", 1 - android.view.View.resolveSize(0, 0), r8);
        r12 = ((java.lang.String) r8[0]).intern().concat(java.lang.String.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        r9 = new java.lang.Object[1];
        a((byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 29), "\u000e\u0012\u0012\u0001\u0000\u0015*\u0000% /\u001c\u0006\u001a#\u0016/\u0012㗛", 20 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f3, code lost:
    
        if (java.util.regex.Pattern.compile(((java.lang.String) r9[0]).intern(), 2).matcher(r12).matches() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:
    
        r1 = r12.length();
        r2 = new byte[r1 / 2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fd, code lost:
    
        if (r0 >= r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ff, code lost:
    
        r2[r0 / 2] = (byte) ((java.lang.Character.digit(r12.charAt(r0), 16) << 4) + java.lang.Character.digit(r12.charAt(r0 + 1), 16));
        r0 = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
    
        com.payair.hce.stopService.SdkCoreAlternateContactlessPaymentDataImpl = (com.payair.hce.stopService.IccPrivateKeyCrtComponentsJson + 9) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0126, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0127, code lost:
    
        r3 = new java.lang.Object[1];
        a((byte) (42 - android.graphics.Color.argb(0, 0, 0, 0)), ".\u0014\u0007%\u0014\u0006\u0003$\u0016\n\u001f)\u0001*\"-\u0011.$\u0011", 19 - android.view.MotionEvent.axisFromString(""), r3);
        r1 = new java.lang.StringBuilder(((java.lang.String) r3[0]).intern());
        r1.append(r12);
        r3 = new java.lang.Object[1];
        a((byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24), "㗠", 1 - android.view.KeyEvent.keyCodeFromString(""), r3);
        r1.append(((java.lang.String) r3[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0174, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r12.equals(((java.lang.String) r8[0]).intern()) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] writeReplace(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 119;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = 0;
        if (str != null && !str.isEmpty()) {
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 49;
            IccPrivateKeyCrtComponentsJson = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((byte) (127 << (android.media.AudioTrack.getMinVolume() > 1.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 1.0f ? 0 : -1))), "\u001f\u001c", 4 % (android.os.Process.myPid() * 91), objArr);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((byte) (69 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u001f\u001c", (android.os.Process.myPid() >> 22) + 2, objArr2);
            }
        }
        return new byte[0];
    }

    public static java.lang.String AlternateContactlessPaymentDataJson(byte[] bArr) {
        int i;
        int i2 = (SdkCoreAlternateContactlessPaymentDataImpl + 111) % 128;
        IccPrivateKeyCrtComponentsJson = i2;
        if (bArr != null) {
            try {
                char[] cArr = new char[bArr.length << 1];
                int i3 = 0;
                int i4 = 0;
                while (i3 < bArr.length) {
                    int i5 = SdkCoreAlternateContactlessPaymentDataImpl + 5;
                    IccPrivateKeyCrtComponentsJson = i5 % 128;
                    if (i5 % 2 == 0) {
                        byte b = bArr[i3];
                        char[] cArr2 = DigitizedCardProfile;
                        cArr[i4] = cArr2[(b / 5) & 56];
                        i = i4 + 227;
                        cArr[i4 + 104] = cArr2[b & 42];
                        i3 += 117;
                    } else {
                        byte b2 = bArr[i3];
                        char[] cArr3 = DigitizedCardProfile;
                        cArr[i4] = cArr3[(b2 >>> 4) & 15];
                        i = i4 + 2;
                        cArr[i4 + 1] = cArr3[b2 & com.google.common.base.Ascii.SI];
                        i3++;
                    }
                    i4 = i;
                }
                return new java.lang.String(cArr);
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 53), " \u000e\u0007%\u0014\u0006\u0003$ \u000e\u0018\u001b㘣", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
        }
        int i6 = i2 + 67;
        SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
        if (i6 % 2 == 0) {
            return "";
        }
        throw null;
    }

    public static byte[] valueOf(byte[] bArr) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        IccPrivateKeyCrtComponentsJson = i % 128;
        byte[] decode = i % 2 == 0 ? android.util.Base64.decode(bArr, 3) : android.util.Base64.decode(bArr, 2);
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 109) % 128;
        return decode;
    }

    static void init$0() {
        $$a = new byte[]{46, -52, 83, 98};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = new char[]{12345, 12334, 12325, 12349, 12299, 12311, 12303, 12329, 12335, 12348, 13265, 12321, 12347, 12326, 12300, 12305, 12313, 12386, 12324, 12385, 12308, 12343, 13264, 12346, 12322, 12398, 12351, 12337, 12291, 12327, 12410, 12344, 12292, 12403, 12338, 12331, 12408, 12318, 12394, 12332, 12320, 12297, 12391, 12350, 12328, 12333, 12387, 12330, 12323};
        valueOf = (char) 1495;
    }
}
