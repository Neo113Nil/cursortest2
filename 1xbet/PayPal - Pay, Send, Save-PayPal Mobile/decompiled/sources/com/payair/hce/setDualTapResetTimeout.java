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
/* loaded from: classes10.dex */
final class setDualTapResetTimeout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setDualTapResetTimeout DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] getAid;
    private static int getProfileVersion;
    private static int valueOf;
    private static final /* synthetic */ com.payair.hce.setDualTapResetTimeout[] values;
    private org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit writeReplace = new org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 4 - (i * 3);
        int i6 = (i2 * 3) + 104;
        int i7 = (s * 3) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5++;
            i6 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i5++;
            i6 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    private setDualTapResetTimeout(java.lang.String str) {
    }

    public static com.payair.hce.setDualTapResetTimeout valueOf(java.lang.String str) {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 29) % 128;
        com.payair.hce.setDualTapResetTimeout setdualtapresettimeout = (com.payair.hce.setDualTapResetTimeout) java.lang.Enum.valueOf(com.payair.hce.setDualTapResetTimeout.class, str);
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 77) % 128;
        return setdualtapresettimeout;
    }

    public static com.payair.hce.setDualTapResetTimeout[] values() {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 105) % 128;
        com.payair.hce.setDualTapResetTimeout[] setdualtapresettimeoutArr = (com.payair.hce.setDualTapResetTimeout[]) values.clone();
        int i = IccPrivateKeyCrtComponentsJson + 41;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return setdualtapresettimeoutArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) (81 - android.widget.ExpandableListView.getPackedPositionChild(0L)), (-502627101) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 875197804 + android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf("", "", 0) - 46, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 126), objArr);
        com.payair.hce.setDualTapResetTimeout setdualtapresettimeout = new com.payair.hce.setDualTapResetTimeout(((java.lang.String) objArr[0]).intern());
        DigitizedCardProfile = setdualtapresettimeout;
        values = new com.payair.hce.setDualTapResetTimeout[]{setdualtapresettimeout};
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 69) % 128;
    }

    public final java.lang.String DigitizedCardProfile(java.lang.String str) {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        if (this.writeReplace.isValid(str)) {
            int i = 0;
            java.lang.String substring = str.substring(0, 2);
            java.lang.String substring2 = str.substring(2, str.length() - 1);
            int intValue = java.lang.Integer.valueOf(str.substring(1, 2), 10).intValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (i < substring2.length()) {
                int i2 = i + 1;
                intValue = (java.lang.Integer.valueOf(substring2.substring(i, i2), 10).intValue() + intValue) % 10;
                sb.append(intValue);
                i = i2;
            }
            try {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(substring);
                sb2.append((java.lang.Object) sb);
                org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit luhnCheckDigit = this.writeReplace;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(substring);
                sb3.append(sb.toString());
                sb2.append(luhnCheckDigit.calculate(sb3.toString()));
                java.lang.String obj = sb2.toString();
                if (!this.writeReplace.isValid(obj)) {
                    return null;
                }
                IccPrivateKeyCrtComponentsJson = (RecordsJson + 101) % 128;
                return obj;
            } catch (org.apache.commons.validator.routines.checkdigit.CheckDigitException e) {
                e.printStackTrace();
                return null;
            }
        }
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 81) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            int i6 = 1;
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            long j = 0;
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 27, 29 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 49) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i7 = $11 + 111;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        java.lang.Object[] objArr3 = new java.lang.Object[i6];
                        objArr3[0] = java.lang.Integer.valueOf(bArr[i8]);
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 32, android.text.TextUtils.getOffsetBefore("", 0) + 5088, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > j ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i6 = 1;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 27, 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (getAid[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i9 = ($10 + 121) % 128;
                $11 = i9;
                int i10 = (int) (valueOf ^ (-4897270311952305750L));
                if (z) {
                    $10 = (i9 + 35) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i10 + i4;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getProfileVersion), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", "", 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2364, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, 0, (short) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 53;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            bArr5[i11] = (byte) (bArr4[i11] | (-4897270311952305750L));
                            i11 <<= 1;
                        } else {
                            bArr5[i11] = (byte) (bArr4[i11] ^ (-4897270311952305750L));
                            i11++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 13;
                    $11 = i13 % 128;
                    if (i13 % 2 != 0) {
                        i5 = 1;
                        z2 = true;
                        gettrack2constructiondata.DigitizedCardProfile = i5;
                        $11 = ($10 + 37) % 128;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            $10 = ($11 + 89) % 128;
                            if (z2) {
                                byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getAid;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                }
                z2 = false;
                i5 = 1;
                gettrack2constructiondata.DigitizedCardProfile = i5;
                $11 = ($10 + 37) % 128;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
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

    static void AlternateContactlessPaymentDataJson() {
        valueOf = -724452546;
        AlternateContactlessPaymentDataJson = 520368540;
        getProfileVersion = 49367756;
        SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{-121, -100, -76, -108, Byte.MIN_VALUE, -116, -116, -86};
    }

    static void init$0() {
        $$a = new byte[]{64, -23, -58, -30};
        $$b = 12;
    }
}
