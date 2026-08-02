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
public final class getApplication {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.getApplication[] AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char getProfileVersion;
    private static char valueOf;
    public static final com.payair.hce.getApplication writeReplace;
    private android.app.Application DigitizedCardProfile;
    private com.payair.hce.checkPermission values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        byte[] bArr = $$a;
        int i5 = (s * 4) + 110;
        int i6 = 1 - (b * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = (-i4) + i8;
            i2 = i3;
            int i10 = i7;
            i5 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i7 = i11;
            i4 = bArr[i11];
            i8 = i12;
            int i92 = (-i4) + i8;
            i2 = i3;
            int i102 = i7;
            i5 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    private getApplication(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ᡧǗ\uedf1\ueda2带읢", android.view.View.resolveSize(0, 0) + 6, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getApplication.class.getName());
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
    }

    public static com.payair.hce.getApplication valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (getAid + 65) % 128;
        com.payair.hce.getApplication getapplication = (com.payair.hce.getApplication) java.lang.Enum.valueOf(com.payair.hce.getApplication.class, str);
        int i = IccPrivateKeyCrtComponentsJson + 55;
        getAid = i % 128;
        if (i % 2 == 0) {
            return getapplication;
        }
        throw null;
    }

    public static com.payair.hce.getApplication[] values() {
        getAid = (IccPrivateKeyCrtComponentsJson + 119) % 128;
        com.payair.hce.getApplication[] getapplicationArr = (com.payair.hce.getApplication[]) AlternateContactlessPaymentDataJson.clone();
        int i = getAid + 61;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return getapplicationArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("礒濽滎\ue3f5ᆭ㬗甴ᣕ", 8 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        com.payair.hce.getApplication getapplication = new com.payair.hce.getApplication(((java.lang.String) objArr[0]).intern());
        writeReplace = getapplication;
        AlternateContactlessPaymentDataJson = new com.payair.hce.getApplication[]{getapplication};
        int i = getAid + 83;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final com.payair.hce.getApplication j_(android.app.Application application) {
        int i = (getAid + 25) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        this.DigitizedCardProfile = application;
        com.payair.hce.getApplication getapplication = writeReplace;
        getAid = (i + 67) % 128;
        return getapplication;
    }

    public final com.payair.hce.getTheme DigitizedCardProfile() throws java.lang.IllegalArgumentException {
        IccPrivateKeyCrtComponentsJson = (getAid + 13) % 128;
        if (this.DigitizedCardProfile == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("廀⫥峂ꟈ\ue15e鴂ꬑ\uda0c溏虼莀슂ꃅ㝖踫絾㊝勿쵘唱倜췄ꦷꗽ똿ఄ梅\uf803", 28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        com.payair.hce.onTrimMemory ontrimmemory = new com.payair.hce.onTrimMemory(this.DigitizedCardProfile);
        getAid = (IccPrivateKeyCrtComponentsJson + 111) % 128;
        return ontrimmemory;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i2 = $10 + 49;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            } else {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            }
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $11 = ($10 + 41) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 63, 1335 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(-1, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1334, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(-1, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3543, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i7 = $11 + 117;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void init$0() {
        $$a = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    static void writeReplace() {
        valueOf = (char) 29489;
        RecordsJson = (char) 56438;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 5615;
        getProfileVersion = (char) 43201;
    }
}
