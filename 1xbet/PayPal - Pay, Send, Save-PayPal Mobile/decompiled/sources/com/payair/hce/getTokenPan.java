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
public final class getTokenPan {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getTokenPan AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static short[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static byte[] getProfileVersion;
    private static int valueOf;
    public static final com.payair.hce.getTokenPan values;
    private static final /* synthetic */ com.payair.hce.getTokenPan[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 3) + 104;
        int i4 = (s * 3) + 4;
        int i5 = i * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i6;
            int i7 = i4;
            int i8 = 0;
            i3 += -i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i4];
            i3 += -i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private getTokenPan(java.lang.String str, int i) {
    }

    public static com.payair.hce.getTokenPan valueOf(java.lang.String str) {
        getAid = (IccPrivateKeyCrtComponentsJson + 125) % 128;
        com.payair.hce.getTokenPan gettokenpan = (com.payair.hce.getTokenPan) java.lang.Enum.valueOf(com.payair.hce.getTokenPan.class, str);
        int i = getAid + 71;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return gettokenpan;
        }
        throw null;
    }

    public static com.payair.hce.getTokenPan[] values() {
        IccPrivateKeyCrtComponentsJson = (getAid + 3) % 128;
        com.payair.hce.getTokenPan[] gettokenpanArr = (com.payair.hce.getTokenPan[]) writeReplace.clone();
        IccPrivateKeyCrtComponentsJson = (getAid + 75) % 128;
        return gettokenpanArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) android.view.View.MeasureSpec.getMode(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 744612283, android.graphics.Color.rgb(0, 0, 0) - 1572692126, (-44) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) (android.graphics.Color.alpha(0) + 4), objArr);
        com.payair.hce.getTokenPan gettokenpan = new com.payair.hce.getTokenPan(((java.lang.String) objArr[0]).intern(), 0);
        values = gettokenpan;
        short keyRepeatTimeout = (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
        long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(keyRepeatTimeout, (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 744612300, (-1589469338) - (scrollBarFadeDuration >> 16), (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)) - 45, (byte) ((-66) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
        com.payair.hce.getTokenPan gettokenpan2 = new com.payair.hce.getTokenPan(((java.lang.String) objArr2[0]).intern(), 1);
        AlternateContactlessPaymentDataJson = gettokenpan2;
        writeReplace = new com.payair.hce.getTokenPan[]{gettokenpan, gettokenpan2};
        int i = getAid + 31;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 29, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            long j = 0;
            if (z) {
                $11 = ($10 + 7) % 128;
                byte[] bArr2 = getProfileVersion;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 31, 5088 - android.widget.ExpandableListView.getPackedPositionGroup(j), (char) (1 - (android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1))))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr3[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                        j = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    $10 = ($11 + 101) % 128;
                    byte[] bArr4 = getProfileVersion;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 27, 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                    $10 = ($11 + 89) % 128;
                } else {
                    intValue = (short) (((short) (RecordsJson[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i7 = $11;
                $10 = (i7 + 57) % 128;
                int i8 = (int) (valueOf ^ (-4897270311952305750L));
                if (z) {
                    $10 = (i7 + 117) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i8 + i4;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myTid() >> 22), 2365 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.red(0));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, (byte) 0, (short) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = getProfileVersion;
                if (bArr5 != null) {
                    int i9 = $11 + 109;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (bArr5[i5] ^ (-4897270311952305750L));
                        i5++;
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        byte[] bArr6 = getProfileVersion;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = RecordsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
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

    static void init$0() {
        $$a = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$b = 108;
    }

    static void writeReplace() {
        valueOf = 1102663988;
        DigitizedCardProfile = 520368513;
        SdkCoreAlternateContactlessPaymentDataImpl = -862310622;
        getProfileVersion = new byte[]{115, -82, 94, -81, 115, 17, -22, -6};
    }
}
