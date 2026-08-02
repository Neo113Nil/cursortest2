package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class setPpseFci {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static int AlternateContactlessPaymentDataJson;
    public static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static final /* synthetic */ com.payair.hce.setPpseFci[] getProfileVersion;
    private static com.payair.hce.setPpseFci valueOf;
    public static int values;
    public static int writeReplace;

    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i = 3 - (b * 2);
        int i2 = 73 - (b3 * 8);
        int i3 = b2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            i++;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 = (-bArr[i]) + i2;
                i5 = i6;
            }
        }
    }

    private setPpseFci(java.lang.String str) {
    }

    public static com.payair.hce.setPpseFci valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 105;
        RecordsJson = i % 128;
        com.payair.hce.setPpseFci setppsefci = (com.payair.hce.setPpseFci) java.lang.Enum.valueOf(com.payair.hce.setPpseFci.class, str);
        if (i % 2 != 0) {
            return setppsefci;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setPpseFci[] values() {
        int i = IccPrivateKeyCrtComponentsJson + 121;
        RecordsJson = i % 128;
        com.payair.hce.setPpseFci[] setppsefciArr = getProfileVersion;
        if (i % 2 != 0) {
            return (com.payair.hce.setPpseFci[]) setppsefciArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (16 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0002\u0000\u0005\u0006\b\u0001\u0003\b", 8 - (android.os.Process.myPid() >> 22), objArr);
        com.payair.hce.setPpseFci setppsefci = new com.payair.hce.setPpseFci(((java.lang.String) objArr[0]).intern());
        valueOf = setppsefci;
        getProfileVersion = new com.payair.hce.setPpseFci[]{setppsefci};
        DigitizedCardProfile = 0;
        values = 1;
        AlternateContactlessPaymentDataJson = 2;
        writeReplace = 3;
        int i = IccPrivateKeyCrtComponentsJson + 97;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        r13 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), r2};
        r14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0197, code lost:
    
        if (r14 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0199, code lost:
    
        r14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", r4, 0, 0) + 30, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3596, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0211, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r14).invoke(null, r13)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0215, code lost:
    
        r11 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r2, java.lang.Integer.valueOf(r5), r2};
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0250, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0252, code lost:
    
        r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0) + 48, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 2664, (char) (18888 - android.os.Process.getGidForName("")));
        r14 = new java.lang.Object[1];
        b((byte) 0, (byte) 0, (byte) 0, r14);
        r4 = r4.getMethod((java.lang.String) r14[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02bc, code lost:
    
        r4 = ((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r11)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02c9, code lost:
    
        r11 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r2.values] = r3[r4];
        r6[r2.values + 1] = r3[(r11 * r5) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02e2, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02e4, code lost:
    
        com.payair.hce.setPpseFci.$11 = (com.payair.hce.setPpseFci.$10 + 37) % 128;
        r2.RecordsJson = ((r2.RecordsJson + r5) - 1) % r5;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r5) - 1) % r5;
        r4 = r2.DigitizedCardProfile;
        r11 = r2.RecordsJson;
        r13 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r2.values] = r3[(r4 * r5) + r11];
        r6[r2.values + 1] = r3[(r13 * r5) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0314, code lost:
    
        r4 = r2.DigitizedCardProfile;
        r11 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r13 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.RecordsJson;
        r6[r2.values] = r3[(r4 * r5) + r11];
        r6[r2.values + 1] = r3[(r13 * r5) + r14];
        com.payair.hce.setPpseFci.$11 = (com.payair.hce.setPpseFci.$10 + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
    
        r6[r2.values] = (char) (r2.valueOf - r30);
        r6[r2.values + 1] = (char) (r2.writeReplace - r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012f, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        if (str != null) {
            $11 = ($10 + 31) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 49, android.view.KeyEvent.keyCodeFromString("") + 2508, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6803));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (byte) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2508 - android.graphics.Color.blue(0), (char) (6802 - android.view.KeyEvent.keyCodeFromString("")));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((byte) 0, (byte) 0, (byte) 1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = 0;
            while (true) {
                digitizedCardJson12.values = i4;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                int i5 = $11 + 27;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                }
                i4 = digitizedCardJson12.values + 2;
                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            cArr5[i6] = (char) (cArr5[i6] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{1490, 12291, 12292, 12313, 1489, 12297, 12303, 12299, 12318};
        getAid = (char) 1491;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, -26, -116};
        $$b = 92;
    }
}
