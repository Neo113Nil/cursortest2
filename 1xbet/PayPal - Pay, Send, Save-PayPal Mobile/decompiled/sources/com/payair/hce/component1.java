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
public final class component1 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.component1 AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.component1 DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static final /* synthetic */ com.payair.hce.component1[] RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static char getCvrMaskAnd;
    private static int getPaymentFci;
    public static final com.payair.hce.component1 valueOf;
    private static com.payair.hce.component1 values;
    public static final com.payair.hce.component1 writeReplace;
    private final int getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 110 - (b * 3);
        int i3 = s + 4;
        int i4 = 1 - (b2 * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            i = 0;
            int i7 = i3 + i6;
            i3 = i5;
            i2 = i7;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i3 + 1;
            i6 = bArr[i8];
            i3 = i2;
            i5 = i8;
            int i72 = i3 + i6;
            i3 = i5;
            i2 = i72;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        }
    }

    public static com.payair.hce.component1 valueOf(java.lang.String str) {
        int i = SdkCoreBusinessLogicModuleImpl + 91;
        getPaymentFci = i % 128;
        com.payair.hce.component1 component1Var = (com.payair.hce.component1) java.lang.Enum.valueOf(com.payair.hce.component1.class, str);
        if (i % 2 != 0) {
            return component1Var;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.component1[] values() {
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 39) % 128;
        com.payair.hce.component1[] component1VarArr = (com.payair.hce.component1[]) RecordsJson.clone();
        int i = SdkCoreBusinessLogicModuleImpl + 83;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            return component1VarArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getPaymentFci = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㪷餰\uf012။壝늤ꩋ阯ǉ闼揁\u1af9\uf3b8\u0fe6", android.graphics.Color.alpha(0) + 13, objArr);
        com.payair.hce.component1 component1Var = new com.payair.hce.component1(((java.lang.String) objArr[0]).intern(), 0, 0);
        DigitizedCardProfile = component1Var;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("壝늤ꩋ阯ǉ闼揁\u1af9\uf3b8\u0fe6", 9 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        com.payair.hce.component1 component1Var2 = new com.payair.hce.component1(((java.lang.String) objArr2[0]).intern(), 1, 1);
        AlternateContactlessPaymentDataJson = component1Var2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\udd04秡돚\ud88c슷垠ᡣ쐐\uf3b8\u0fe6", 9 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr3);
        com.payair.hce.component1 component1Var3 = new com.payair.hce.component1(((java.lang.String) objArr3[0]).intern(), 2, 2);
        valueOf = component1Var3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("쬒쯿虀廴퓔颵쎗糷樑ꃌ琇\u0efb蕐㗛Ⱓ\ue30f긆攘槢2", 19 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr4);
        values = new com.payair.hce.component1(((java.lang.String) objArr4[0]).intern(), 3, 3);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("봼ꄘ\ue3f5囙ܢ濪槢2", 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
        com.payair.hce.component1 component1Var4 = new com.payair.hce.component1(((java.lang.String) objArr5[0]).intern(), 4, 4);
        writeReplace = component1Var4;
        RecordsJson = new com.payair.hce.component1[]{component1Var, component1Var2, component1Var3, values, component1Var4};
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 11) % 128;
    }

    private component1(java.lang.String str, int i, int i2) {
        this.getProfileVersion = i2;
    }

    public static com.payair.hce.component1 DigitizedCardProfile(int i) {
        int i2 = (SdkCoreBusinessLogicModuleImpl + 71) % 128;
        getPaymentFci = i2;
        if (i == 0) {
            return DigitizedCardProfile;
        }
        if (i == 1) {
            return AlternateContactlessPaymentDataJson;
        }
        if (i == 2) {
            return valueOf;
        }
        if (i != 3) {
            com.payair.hce.component1 component1Var = writeReplace;
            SdkCoreBusinessLogicModuleImpl = (i2 + 85) % 128;
            return component1Var;
        }
        com.payair.hce.component1 component1Var2 = values;
        int i3 = i2 + 115;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 == 0) {
            return component1Var2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int AlternateContactlessPaymentDataJson() {
        int i = getPaymentFci;
        SdkCoreBusinessLogicModuleImpl = (i + 65) % 128;
        int i2 = this.getProfileVersion;
        SdkCoreBusinessLogicModuleImpl = (i + 79) % 128;
        return i2;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 13;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i3 = $11 + 35;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                int i4 = getproducttype.AlternateContactlessPaymentDataJson;
                throw new java.lang.ArithmeticException();
            }
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (IccPrivateKeyCrtComponentsJson ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getCvrMaskAnd)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 62, 1335 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        byte b = $$a[3];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, (byte) (b - 1), b, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAid)};
                    int i7 = charValue + i5;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 63, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1335, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                        byte b2 = $$a[3];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b2, (byte) (b2 - 1), b2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52, 3543 - android.graphics.Color.alpha(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{125, 17, -56, 0};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }

    static void valueOf() {
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 62263;
        getAid = (char) 38894;
        IccPrivateKeyCrtComponentsJson = (char) 15827;
        getCvrMaskAnd = (char) 46723;
    }
}
