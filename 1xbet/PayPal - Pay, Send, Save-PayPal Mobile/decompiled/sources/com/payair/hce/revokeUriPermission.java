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
public final class revokeUriPermission {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.enforcePermission AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static final /* synthetic */ com.payair.hce.revokeUriPermission[] valueOf;
    private static com.payair.hce.revokeUriPermission values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (s2 * 3);
        int i4 = (i * 4) + 118;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 += -i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i3 + 1;
            int i9 = i2 + 1;
            i6 = i8;
            i3 = bArr[i8];
            i7 = i9;
            i4 += -i3;
            i3 = i6;
            i2 = i7;
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

    private revokeUriPermission(java.lang.String str) {
    }

    public static com.payair.hce.revokeUriPermission valueOf(java.lang.String str) {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
        com.payair.hce.revokeUriPermission revokeuripermission = (com.payair.hce.revokeUriPermission) java.lang.Enum.valueOf(com.payair.hce.revokeUriPermission.class, str);
        int i = getAid + 103;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return revokeuripermission;
        }
        throw null;
    }

    public static com.payair.hce.revokeUriPermission[] values() {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
        com.payair.hce.revokeUriPermission[] revokeuripermissionArr = (com.payair.hce.revokeUriPermission[]) valueOf.clone();
        int i = getAid + 23;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return revokeuripermissionArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(null, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr);
        com.payair.hce.revokeUriPermission revokeuripermission = new com.payair.hce.revokeUriPermission(((java.lang.String) objArr[0]).intern());
        values = revokeuripermission;
        valueOf = new com.payair.hce.revokeUriPermission[]{revokeuripermission};
        AlternateContactlessPaymentDataJson = null;
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    public static void values(com.payair.hce.enforcePermission enforcepermission) {
        int i = getAid + 121;
        int i2 = i % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i2;
        if (i % 2 == 0) {
            AlternateContactlessPaymentDataJson = enforcepermission;
            getAid = (i2 + 105) % 128;
        } else {
            AlternateContactlessPaymentDataJson = enforcepermission;
            throw new java.lang.ArithmeticException();
        }
    }

    public static com.payair.hce.enforceCallingPermission valueOf() {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 45) % 128;
        com.payair.hce.enforceCallingPermission AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 93) % 128;
        return AlternateContactlessPaymentDataJson2;
    }

    private static void a(java.lang.String str, int i, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr2 = DigitizedCardProfile;
        long j = 0;
        int i2 = 2;
        int i3 = 1;
        if (cArr2 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 57;
                $11 = i6 % 128;
                if (i6 % i2 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i3];
                        objArr2[0] = java.lang.Integer.valueOf(cArr2[i5]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46, 285 - android.widget.ExpandableListView.getPackedPositionChild(j), (char) (46337 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[i5])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.View.MeasureSpec.getMode(0), (android.os.Process.myPid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                j = 0;
                i2 = 2;
                i3 = 1;
            }
            cArr2 = cArr;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 287 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (46337 - android.view.KeyEvent.getDeadChar(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (RecordsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 101) % 128;
                cArr3[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 44, 1629 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, (short) 0, (short) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
                $11 = ($10 + 55) % 128;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 121) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj5 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 43, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1630, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(0, (short) 0, (short) 0, objArr8);
                obj5 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{Byte.MAX_VALUE, -61, 58, -113};
        $$b = 238;
    }

    static void writeReplace() {
        DigitizedCardProfile = new char[]{10964, 10923, 10926, 10913, 10972, 10974, 10960};
        writeReplace = -143185379;
        IccPrivateKeyCrtComponentsJson = true;
        RecordsJson = true;
    }
}
