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
public final class clearHCEData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.clearHCEData AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static final /* synthetic */ com.payair.hce.clearHCEData[] valueOf;
    public static final com.payair.hce.clearHCEData values;
    public static final com.payair.hce.clearHCEData writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = 113 - s2;
        int i3 = b * 4;
        byte[] bArr = $$a;
        int i4 = 3 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i2 += -i5;
            i = i6;
            bArr2[i] = (byte) i2;
            i4++;
            i6 = i + 1;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i4];
            i2 += -i5;
            i = i6;
            bArr2[i] = (byte) i2;
            i4++;
            i6 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i4++;
            i6 = i + 1;
            if (i == i3) {
            }
        }
    }

    private clearHCEData(java.lang.String str, int i) {
    }

    public static com.payair.hce.clearHCEData valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 35;
        getAid = i % 128;
        com.payair.hce.clearHCEData clearhcedata = (com.payair.hce.clearHCEData) java.lang.Enum.valueOf(com.payair.hce.clearHCEData.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        getAid = (IccPrivateKeyCrtComponentsJson + 53) % 128;
        return clearhcedata;
    }

    public static com.payair.hce.clearHCEData[] values() {
        int i = getAid + 121;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.clearHCEData[] clearhcedataArr = valueOf;
        if (i % 2 == 0) {
            return (com.payair.hce.clearHCEData[]) clearhcedataArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue351ꭸ猾㯯쎫詳刷\u1ae1ꊽ", (android.os.Process.myPid() >> 22) + 18493, objArr);
        com.payair.hce.clearHCEData clearhcedata = new com.payair.hce.clearHCEData(((java.lang.String) objArr[0]).intern(), 0);
        values = clearhcedata;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\ue351ܨ⮞丟狡长맊\udda2쀻\ue484༆㏺", 58478 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        com.payair.hce.clearHCEData clearhcedata2 = new com.payair.hce.clearHCEData(((java.lang.String) objArr2[0]).intern(), 1);
        AlternateContactlessPaymentDataJson = clearhcedata2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\ue345꾿窙\u05fd탛挢⸘", 19681 - (android.os.Process.myTid() >> 22), objArr3);
        com.payair.hce.clearHCEData clearhcedata3 = new com.payair.hce.clearHCEData(((java.lang.String) objArr3[0]).intern(), 2);
        writeReplace = clearhcedata3;
        valueOf = new com.payair.hce.clearHCEData[]{clearhcedata, clearhcedata2, clearhcedata3};
        int i = IccPrivateKeyCrtComponentsJson + 101;
        getAid = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 99) % 128;
        if (str != null) {
            $11 = (i2 + 33) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 121) % 128;
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
            $11 = ($10 + 125) % 128;
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1890 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (3600 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 63, 1443 - android.graphics.Color.red(0), (char) (android.graphics.Color.alpha(0) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 1, objArr5);
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
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 64, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1443, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 0, (short) 0, (short) 1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void DigitizedCardProfile() {
        DigitizedCardProfile = -4396407838504938088L;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
    }
}
