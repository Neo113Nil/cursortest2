package com.payair.hce;

/* loaded from: classes4.dex */
public class onTimeout implements com.payair.hce.initContext {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getAid;
    private static long values;
    private static int writeReplace;
    private final com.payair.hce.sendRequest AlternateContactlessPaymentDataJson;
    private final com.payair.hce.getPackageName DigitizedCardProfile;
    private com.payair.hce.checkPermission valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 113 - b2;
        int i4 = 4 - (s * 4);
        int i5 = 1 - (b * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4++;
            i3 = (-i3) + i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i3;
            i3 = bArr[i4];
            i4++;
            i3 = (-i3) + i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public onTimeout(com.payair.hce.getPackageName getpackagename, com.payair.hce.sendRequest sendrequest) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ㆋۙ弙鐷\uecb0□", 14148 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onTimeout.class.getName());
        this.valueOf = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.DigitizedCardProfile = getpackagename;
        this.AlternateContactlessPaymentDataJson = sendrequest;
    }

    @Override // com.payair.hce.initContext
    public final boolean values() {
        int i = getAid + 35;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return this.DigitizedCardProfile.valueOf();
        }
        this.DigitizedCardProfile.valueOf();
        throw null;
    }

    @Override // com.payair.hce.initContext
    public final boolean valueOf() {
        getAid = (writeReplace + 45) % 128;
        boolean writeReplace2 = this.DigitizedCardProfile.writeReplace();
        int i = getAid + 23;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return writeReplace2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.initContext
    public final long DigitizedCardProfile() {
        writeReplace = (getAid + 23) % 128;
        long AlternateContactlessPaymentDataJson = this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
        int i = getAid + 69;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    @Override // com.payair.hce.initContext
    public final boolean AlternateContactlessPaymentDataJson() {
        int i = getAid + 65;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return this.DigitizedCardProfile.values();
        }
        this.DigitizedCardProfile.values();
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 79;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 65) % 128;
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1891, (char) (3600 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 64, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1443, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29681));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (byte) 1, objArr5);
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
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.text.TextUtils.indexOf("", ""), 1443 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29681));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, (byte) 0, (byte) 1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        getAid = 1;
        values = 5804660897325795152L;
    }

    static void init$0() {
        $$a = new byte[]{57, -61, -44, -120};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
    }
}
