package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class activateCardForToken {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.activateCardForToken[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    public static final com.payair.hce.activateCardForToken valueOf;
    public static final com.payair.hce.activateCardForToken values;
    public static final com.payair.hce.activateCardForToken writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 113 - i;
        int i6 = 1 - (i2 * 3);
        byte[] bArr = $$a;
        int i7 = b + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            i5 = i6;
            i4 = 0;
            i5 += -i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i7 + 1;
            i8 = i9;
            i7 = bArr[i9];
            i5 += -i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    private activateCardForToken(java.lang.String str, int i) {
    }

    public static com.payair.hce.activateCardForToken valueOf(java.lang.String str) {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
        com.payair.hce.activateCardForToken activatecardfortoken = (com.payair.hce.activateCardForToken) java.lang.Enum.valueOf(com.payair.hce.activateCardForToken.class, str);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 125;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return activatecardfortoken;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.activateCardForToken[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 85;
        RecordsJson = i % 128;
        com.payair.hce.activateCardForToken[] activatecardfortokenArr = AlternateContactlessPaymentDataJson;
        if (i % 2 != 0) {
            return (com.payair.hce.activateCardForToken[]) activatecardfortokenArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("掠\udba2볎釳爛圲⡀ઇ\uefab샖ꗫ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 8923, objArr);
        com.payair.hce.activateCardForToken activatecardfortoken = new com.payair.hce.activateCardForToken(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = activatecardfortoken;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("沈㽶畂ꭟ", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50707, objArr2);
        com.payair.hce.activateCardForToken activatecardfortoken2 = new com.payair.hce.activateCardForToken(((java.lang.String) objArr2[0]).intern(), 1);
        values = activatecardfortoken2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("不㢛窋", 49664 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        com.payair.hce.activateCardForToken activatecardfortoken3 = new com.payair.hce.activateCardForToken(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = activatecardfortoken3;
        AlternateContactlessPaymentDataJson = new com.payair.hce.activateCardForToken[]{activatecardfortoken, activatecardfortoken2, activatecardfortoken3};
        int i = RecordsJson + 57;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 5) % 128;
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
            $10 = ($11 + 109) % 128;
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.indexOf("", "", 0, 0), 1890 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (3600 - (android.view.ViewConfiguration.getTouchSlop() >> 8)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (byte) -1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1443, (char) (android.view.View.combineMeasuredStates(0, 0) + 29682));
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (-b);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b, b2, (byte) (b2 + 1), objArr5);
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
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1442, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 29682));
                byte b3 = (byte) ($$b & 7);
                byte b4 = (byte) (-b3);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(b3, b4, (byte) (b4 + 1), objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i3 = $10 + 35;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void DigitizedCardProfile() {
        DigitizedCardProfile = 5014871781899997118L;
    }

    static void init$0() {
        $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114};
        $$b = 193;
    }
}
