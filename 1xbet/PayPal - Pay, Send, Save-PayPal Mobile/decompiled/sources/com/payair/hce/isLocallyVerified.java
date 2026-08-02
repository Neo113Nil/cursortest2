package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class isLocallyVerified {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.isLocallyVerified AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int getAid;
    private static int getProfileVersion;
    public static final com.payair.hce.isLocallyVerified valueOf;
    private static final /* synthetic */ com.payair.hce.isLocallyVerified[] values;
    public static final com.payair.hce.isLocallyVerified writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 1 - (s * 3);
        byte[] bArr = $$a;
        int i6 = 4 - (i2 * 2);
        int i7 = i + 112;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7 += i8;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i7 += i8;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    private isLocallyVerified(java.lang.String str, int i) {
    }

    public static com.payair.hce.isLocallyVerified valueOf(java.lang.String str) {
        int i = getAid + 11;
        getProfileVersion = i % 128;
        com.payair.hce.isLocallyVerified islocallyverified = (com.payair.hce.isLocallyVerified) java.lang.Enum.valueOf(com.payair.hce.isLocallyVerified.class, str);
        if (i % 2 == 0) {
            return islocallyverified;
        }
        throw null;
    }

    public static com.payair.hce.isLocallyVerified[] values() {
        getProfileVersion = (getAid + 19) % 128;
        com.payair.hce.isLocallyVerified[] islocallyverifiedArr = (com.payair.hce.isLocallyVerified[]) values.clone();
        getProfileVersion = (getAid + 57) % 128;
        return islocallyverifiedArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        getAid = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ꍍ綑ố㼭\ud873拏", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 57036, objArr);
        com.payair.hce.isLocallyVerified islocallyverified = new com.payair.hce.isLocallyVerified(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = islocallyverified;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("ꍊ\uf1faخ孔\ue99e", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21168, objArr2);
        com.payair.hce.isLocallyVerified islocallyverified2 = new com.payair.hce.isLocallyVerified(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = islocallyverified2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("ꍛ潣㬃윩鏍忶殒", 52258 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr3);
        com.payair.hce.isLocallyVerified islocallyverified3 = new com.payair.hce.isLocallyVerified(((java.lang.String) objArr3[0]).intern(), 2);
        writeReplace = islocallyverified3;
        values = new com.payair.hce.isLocallyVerified[]{islocallyverified, islocallyverified2, islocallyverified3};
        getProfileVersion = (getAid + 71) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = ($11 + 95) % 128;
        $10 = i2;
        if (str != null) {
            int i3 = i2 + 95;
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
            $11 = ($10 + 57) % 128;
            int i4 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 31, 1890 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3600));
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1442, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, (short) 0, objArr5);
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
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        $11 = ($10 + 3) % 128;
        while (getdsrpdata.valueOf < cArr2.length) {
            $10 = ($11 + 5) % 128;
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 64, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1443, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 0, (short) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10};
        $$b = 167;
    }

    static void writeReplace() {
        DigitizedCardProfile = -3313625610207963770L;
    }
}
