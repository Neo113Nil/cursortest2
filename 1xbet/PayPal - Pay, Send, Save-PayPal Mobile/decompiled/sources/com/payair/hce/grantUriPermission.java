package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class grantUriPermission implements com.payair.hce.enforcePermission {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.grantUriPermission DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char valueOf;
    private static final /* synthetic */ com.payair.hce.grantUriPermission[] values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = b + 4;
        int i5 = 73 - (i * 8);
        int i6 = i2 * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i5 += -i8;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i8 = bArr[i4];
            i5 += -i8;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    private grantUriPermission(java.lang.String str) {
    }

    public static com.payair.hce.grantUriPermission valueOf(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson + 49;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.grantUriPermission granturipermission = (com.payair.hce.grantUriPermission) java.lang.Enum.valueOf(com.payair.hce.grantUriPermission.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return granturipermission;
        }
        throw null;
    }

    public static com.payair.hce.grantUriPermission[] values() {
        AlternateContactlessPaymentDataJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
        com.payair.hce.grantUriPermission[] granturipermissionArr = (com.payair.hce.grantUriPermission[]) values.clone();
        AlternateContactlessPaymentDataJson = (SdkCoreAlternateContactlessPaymentDataImpl + 113) % 128;
        return granturipermissionArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 44), "\u0005\u0002\u0007\u0000\u0005\u0007\u0004\u0003", 8 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        com.payair.hce.grantUriPermission granturipermission = new com.payair.hce.grantUriPermission(((java.lang.String) objArr[0]).intern());
        DigitizedCardProfile = granturipermission;
        values = new com.payair.hce.grantUriPermission[]{granturipermission};
        int i = AlternateContactlessPaymentDataJson + 55;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.enforcePermission
    public final com.payair.hce.enforceCallingPermission AlternateContactlessPaymentDataJson() {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = new com.payair.hce.enforceCallingOrSelfPermission();
        SdkCoreAlternateContactlessPaymentDataImpl = (AlternateContactlessPaymentDataJson + 59) % 128;
        return enforcecallingorselfpermission;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0186, code lost:
    
        r11 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), r3};
        r12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d3, code lost:
    
        if (r12 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d5, code lost:
    
        r12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.green(0), 3596 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024d, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r11)).intValue() != r3.SdkCoreAlternateContactlessPaymentDataImpl) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024f, code lost:
    
        com.payair.hce.grantUriPermission.$10 = (com.payair.hce.grantUriPermission.$11 + 91) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0259, code lost:
    
        r11 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r1), r3, java.lang.Integer.valueOf(r1), r3};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0295, code lost:
    
        if (r7 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0297, code lost:
    
        r7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 47, 2665 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18889));
        r12 = com.payair.hce.grantUriPermission.$$a[1];
        r13 = (byte) (r12 + 1);
        r15 = new java.lang.Object[1];
        b(r13, r13, r12, r15);
        r7 = r7.getMethod((java.lang.String) r15[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0311, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r11)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x031e, code lost:
    
        r11 = r3.AlternateContactlessPaymentDataJson;
        r12 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r3.values] = r4[r7];
        r5[r3.values + 1] = r4[(r11 * r1) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0337, code lost:
    
        if (r3.DigitizedCardProfile != r3.AlternateContactlessPaymentDataJson) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0339, code lost:
    
        r3.RecordsJson = ((r3.RecordsJson + r1) - 1) % r1;
        r3.SdkCoreAlternateContactlessPaymentDataImpl = ((r3.SdkCoreAlternateContactlessPaymentDataImpl + r1) - 1) % r1;
        r7 = r3.DigitizedCardProfile;
        r11 = r3.RecordsJson;
        r12 = r3.AlternateContactlessPaymentDataJson;
        r13 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r3.values] = r4[(r7 * r1) + r11];
        r5[r3.values + 1] = r4[(r12 * r1) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0361, code lost:
    
        r7 = r3.DigitizedCardProfile;
        r11 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r12 = r3.AlternateContactlessPaymentDataJson;
        r13 = r3.RecordsJson;
        r5[r3.values] = r4[(r7 * r1) + r11];
        r5[r3.values + 1] = r4[(r12 * r1) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016e, code lost:
    
        r5[r3.values] = (char) (r3.valueOf - r25);
        r5[r3.values + 1] = (char) (r3.writeReplace - r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = $10;
        $11 = (i4 + 119) % 128;
        if (str != null) {
            $11 = (i4 + 113) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr4 = writeReplace;
        int i5 = -1497284274;
        if (cArr4 != null) {
            int i6 = $10 + 89;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i5));
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.MotionEvent.axisFromString(""), android.text.TextUtils.getCapsMode("", 0, 0) + 2508, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 6802));
                        byte b2 = $$a[1];
                        byte b3 = (byte) (-b2);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b3, (byte) (b3 - 1), b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = -1497284274;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('a' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2508 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.View.MeasureSpec.getMode(0) + 6802));
            byte b4 = $$a[1];
            byte b5 = (byte) (-b4);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b5, (byte) (b5 - 1), b4, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr3[i2] - b);
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
                int i8 = $10 + 5;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values + 1];
                } else {
                    digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values + 1];
                }
                i7 = digitizedCardJson12.values + 2;
            }
        }
        for (int i9 = 0; i9 < i; i9++) {
            cArr5[i9] = (char) (cArr5[i9] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        $$b = 121;
    }

    static void valueOf() {
        writeReplace = new char[]{1490, 12318, 12291, 12297, 12299, 12303, 12313, 1489, 12292};
        valueOf = (char) 1491;
    }
}
