package com.mastercard.mpsdk.card.profile;

/* loaded from: classes9.dex */
public class SdkCoreMChipCvmIssuerOptionsImpl implements com.payair.hce.createPackageContext, java.io.Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char AlternateContactlessPaymentDataJson = 0;
    private static char DigitizedCardProfile = 0;
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static final long serialVersionUID = -7045402231837189181L;
    private static char valueOf;
    private static char values;
    private static int writeReplace;
    private boolean ackAlwaysRequiredIfCurrencyNotProvided;
    private boolean ackAlwaysRequiredIfCurrencyProvided;
    private boolean ackAutomaticallyResetByApplication;
    private boolean ackPreEntryAllowed;
    private boolean pinAlwaysRequiredIfCurrencyNotProvided;
    private boolean pinAlwaysRequiredIfCurrencyProvided;
    private boolean pinAutomaticallyResetByApplication;
    private boolean pinPreEntryAllowed;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 38 - (b2 * 34);
        int i4 = b * 34;
        byte[] bArr = $$a;
        char[] cArr = new char[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            i2 = 0;
            i3++;
            i = (i6 + i5) - 2;
            int i7 = i;
            int i8 = i3;
            cArr[i2] = (char) i7;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i2++;
            i5 = bArr[i8];
            i6 = i7;
            i3 = i8;
            i3++;
            i = (i6 + i5) - 2;
            int i72 = i;
            int i82 = i3;
            cArr[i2] = (char) i72;
            if (i2 == i4) {
            }
        } else {
            i = (s * 653) + 65;
            i2 = 0;
            int i722 = i;
            int i822 = i3;
            cArr[i2] = (char) i722;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$d;
        int i3 = s * 3;
        int i4 = 4 - (b2 * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            i2 = i4;
            int i6 = i5;
            i = 0;
            i4 += -i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i++;
            i4 += -i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            i4 = 110 - (b * 2);
            i2 = i4;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    public SdkCoreMChipCvmIssuerOptionsImpl(com.payair.hce.createPackageContext createpackagecontext) {
        this.ackAlwaysRequiredIfCurrencyNotProvided = createpackagecontext.getAckAlwaysRequiredIfCurrencyNotProvided();
        this.ackAlwaysRequiredIfCurrencyProvided = createpackagecontext.getAckAlwaysRequiredIfCurrencyProvided();
        this.ackAutomaticallyResetByApplication = createpackagecontext.getAckAutomaticallyResetByApplication();
        this.ackPreEntryAllowed = createpackagecontext.getAckPreEntryAllowed();
        this.pinAlwaysRequiredIfCurrencyNotProvided = createpackagecontext.getPinAlwaysRequiredIfCurrencyNotProvided();
        this.pinAlwaysRequiredIfCurrencyProvided = createpackagecontext.getPinAlwaysRequiredIfCurrencyProvided();
        this.pinAutomaticallyResetByApplication = createpackagecontext.getPinAutomaticallyResetByApplication();
        this.pinPreEntryAllowed = createpackagecontext.getPinPreEntryAllowed();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckAlwaysRequiredIfCurrencyProvided() {
        int i = (IccPrivateKeyCrtComponentsJson + 65) % 128;
        writeReplace = i;
        boolean z = this.ackAlwaysRequiredIfCurrencyProvided;
        IccPrivateKeyCrtComponentsJson = (i + 83) % 128;
        return z;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinPreEntryAllowed() {
        int i = writeReplace + 47;
        int i2 = i % 128;
        IccPrivateKeyCrtComponentsJson = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.pinPreEntryAllowed;
        int i3 = i2 + 15;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
        int i = IccPrivateKeyCrtComponentsJson;
        writeReplace = (i + 23) % 128;
        boolean z = this.pinAlwaysRequiredIfCurrencyNotProvided;
        int i2 = i + 33;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
        int i = writeReplace;
        IccPrivateKeyCrtComponentsJson = (i + 37) % 128;
        boolean z = this.ackAlwaysRequiredIfCurrencyNotProvided;
        IccPrivateKeyCrtComponentsJson = (i + 21) % 128;
        return z;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckPreEntryAllowed() {
        int i = writeReplace;
        IccPrivateKeyCrtComponentsJson = (i + 89) % 128;
        boolean z = this.ackPreEntryAllowed;
        int i2 = i + 53;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckAutomaticallyResetByApplication() {
        int i = IccPrivateKeyCrtComponentsJson;
        writeReplace = (i + 15) % 128;
        boolean z = this.ackAutomaticallyResetByApplication;
        int i2 = i + 107;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinAutomaticallyResetByApplication() {
        int i = (writeReplace + 115) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        boolean z = this.pinAutomaticallyResetByApplication;
        int i2 = i + 111;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinAlwaysRequiredIfCurrencyProvided() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 83;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.pinAlwaysRequiredIfCurrencyProvided;
        writeReplace = (i + 15) % 128;
        return z;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char c;
        if (str != null) {
            $11 = ($10 + 73) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char c2 = 2;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c3 = cArr4[1];
                char c4 = cArr4[0];
                char c5 = (char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(valueOf);
                    objArr2[c2] = java.lang.Integer.valueOf(c4 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf((c4 + i2) ^ ((c4 << 4) + c5));
                    objArr2[0] = java.lang.Integer.valueOf(c3);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.getDefaultSize(0, 0), 1334 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (byte) 0, (short) 0, objArr3);
                        java.lang.String str2 = (java.lang.String) objArr3[0];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[4];
                        clsArr[0] = java.lang.Integer.TYPE;
                        clsArr[1] = java.lang.Integer.TYPE;
                        clsArr[c2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str2, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r11), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 62, 1335 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((byte) 0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                    i3++;
                    c2 = 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                c = 2;
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 3543 - android.graphics.Color.alpha(0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            } else {
                c = 2;
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $11 = ($10 + 71) % 128;
            c2 = c;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile = (char) 15836;
        values = (char) 64810;
        AlternateContactlessPaymentDataJson = (char) 48782;
        valueOf = (char) 57292;
    }

    static void init$1() {
        $$d = new byte[]{40, 78, 110, 117};
        $$e = 236;
    }

    static void init$0() {
        $$a = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 72;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:40|41)|(1:43)(4:87|88|89|(11:91|92|45|46|(1:48)(6:56|57|58|59|60|(2:62|(1:64)(5:65|66|67|68|(6:71|72|(1:74)|75|76|77))))|49|50|(1:52)|53|54|55)(1:93))|44|45|46|(0)(0)|49|50|(0)|53|54|55) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010d A[Catch: all -> 0x016a, TryCatch #7 {all -> 0x016a, blocks: (B:16:0x00c6, B:18:0x010d, B:19:0x0156), top: B:15:0x00c6, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0303 A[Catch: all -> 0x089e, TRY_ENTER, TryCatch #8 {all -> 0x089e, blocks: (B:25:0x0303, B:27:0x0312, B:28:0x0353, B:32:0x0422, B:34:0x0465, B:35:0x04b9, B:72:0x0708, B:74:0x0759, B:75:0x07ab, B:50:0x07e7, B:52:0x0834, B:53:0x0889, B:100:0x04e5, B:102:0x0533, B:103:0x0586, B:133:0x0255, B:135:0x029d, B:136:0x02e8, B:3:0x000f, B:9:0x0051, B:13:0x00ab, B:20:0x0162, B:107:0x016b, B:109:0x0171, B:110:0x0172, B:112:0x0173, B:113:0x007f, B:118:0x017a, B:125:0x022d, B:128:0x0236, B:130:0x023c, B:131:0x023d, B:121:0x0193, B:123:0x01db, B:124:0x0221, B:16:0x00c6, B:18:0x010d, B:19:0x0156), top: B:2:0x000f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0834 A[Catch: all -> 0x089e, TryCatch #8 {all -> 0x089e, blocks: (B:25:0x0303, B:27:0x0312, B:28:0x0353, B:32:0x0422, B:34:0x0465, B:35:0x04b9, B:72:0x0708, B:74:0x0759, B:75:0x07ab, B:50:0x07e7, B:52:0x0834, B:53:0x0889, B:100:0x04e5, B:102:0x0533, B:103:0x0586, B:133:0x0255, B:135:0x029d, B:136:0x02e8, B:3:0x000f, B:9:0x0051, B:13:0x00ab, B:20:0x0162, B:107:0x016b, B:109:0x0171, B:110:0x0172, B:112:0x0173, B:113:0x007f, B:118:0x017a, B:125:0x022d, B:128:0x0236, B:130:0x023c, B:131:0x023d, B:121:0x0193, B:123:0x01db, B:124:0x0221, B:16:0x00c6, B:18:0x010d, B:19:0x0156), top: B:2:0x000f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0647 A[Catch: Exception -> 0x07d0, TRY_LEAVE, TryCatch #1 {Exception -> 0x07d0, blocks: (B:46:0x061f, B:56:0x0647, B:59:0x0672, B:62:0x0682, B:65:0x06b1, B:68:0x06dd, B:80:0x07c1, B:81:0x07c7, B:84:0x07c9, B:85:0x07cf, B:67:0x06bb, B:58:0x0651), top: B:45:0x061f, inners: #0, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        int i4;
        java.lang.Object obj2;
        int i5 = 28;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("湤铨瀸捏氏版∻孊൩춥憖\uda0bຠ篠쇘赃㔹⊠く顓", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("\uf6dd䪝쁡⌘Ɫ\ue0d4땬灧\ueb9a\ue61f瀸捏氏版∻孊൩춥", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 18, objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
                i3 = 0;
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                int i6 = ~i;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((998244311 | i6) * (-369)) - 1838430672) + (((~((-292022802) | i6)) | 712906183) * (-369)) + (((~(i6 | (-285338129))) | (~(292022801 | i)) | 706221510) * 369))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b = $$a[14];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b, b, (byte) (b - 1), objArr6);
                    obj3 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
            }
            try {
                while (i3 < 2) {
                    int i7 = writeReplace + 83;
                    IccPrivateKeyCrtComponentsJson = i7 % 128;
                    if (i7 % 2 == 0) {
                        java.lang.String str2 = strArr[i3];
                        int deadChar = i5 / android.view.KeyEvent.getDeadChar(1, 1);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a("▼褠檔\ueb88柵鋚笮㤢ꞹ촧菑ሌ跿\uf3e6\ue1ceᘤ", deadChar, objArr7);
                        java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                        if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                            try {
                                java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-524299) | i)) | ((~(269345102 | r2)) | (-1004404687))) * 717) - 920427300) + (((~((~i) | (-524299))) | (-1004404687) | (~(269345102 | i))) * 717))};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj2 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte b2 = $$a[14];
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    b(b2, b2, (byte) (b2 - 1), objArr9);
                                    obj2 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                }
                                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr8)).intValue();
                                if (i != ((int[]) objArr[1])[0]) {
                                    return objArr;
                                }
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                                if (obj4 == null) {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2390, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 29420));
                                    byte b3 = $$a[14];
                                    byte b4 = (byte) (b3 - 1);
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    b(b4, b4, b3, objArr10);
                                    obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                                }
                                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                                long j = i;
                                long j2 = ~j;
                                long j3 = ~(longValue | (-1456598098));
                                long j4 = (~longValue) | 1456598097;
                                long j5 = (1435 * longValue) + 1042924238168L + ((longValue | 1456598097) * (-1434)) + (((~(j4 | j)) | (~(j2 | longValue)) | j3) * 717) + (((~(longValue | j)) | (~(j4 | j2)) | j3) * 717) + 1738682194;
                                int i8 = (int) (j5 >> 32);
                                int i9 = ~i;
                                if (((i8 & ((((~(i9 | 629826836)) | 2067053247) * (-90)) + 1687905420 + (((~(i | 629826836)) | 76170496) * (-45)) + ((629826836 | (~((-2067053248) | i)) | (~(2067053247 | i9))) * 45))) | (((int) j5) & (((((-1601634268) | r3) * (-814)) - 1578571397) + (((~(157722585 | i)) | (~(1594948995 | i9)) | 151037313) * 407) + (((~((-157722586) | i)) | 151037313 | (~((-1594948996) | i))) * 407)))) == 1) {
                                    objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-241529724) | i)) | 602275622) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 2032100090 + (((~((-241529724) | i9)) | 602275622) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj5 == null) {
                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 50, 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                        byte b5 = $$a[14];
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        b(b5, b5, (byte) (b5 - 1), objArr12);
                                        obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                                    c = 0;
                                    ((int[]) objArr2[3])[0] = intValue;
                                } else {
                                    objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                    java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i9 | (-783515027))) | 578911632) * 98) - 505750182) + (((~((-221413959) | i9)) | (-783515027) | (~(221413958 | i))) * (-49)) + (((~((-783515027) | i)) | (-800325591)) * 49))};
                                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj6 == null) {
                                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                        byte b6 = $$a[14];
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        b(b6, b6, (byte) (b6 - 1), objArr14);
                                        obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                    }
                                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                                    c = 0;
                                    ((int[]) objArr2[3])[0] = intValue2;
                                }
                                if (i != ((int[]) objArr2[1])[c]) {
                                    return objArr2;
                                }
                                try {
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    a("䨷巕鋯圗뢀薗൩춥\ue1afѵ䰪ஏ꼃騡氏版噛튢髷혁\ue731嫧Ɫ\ue0d4噛튢ǒƁ῎靗樷릡\ud9e1皴髷혁\ue731嫧൩춥", 41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr15);
                                    file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                                } catch (java.lang.Exception unused2) {
                                }
                                if (file2.canRead()) {
                                    java.io.FileReader fileReader = new java.io.FileReader(file2);
                                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                    try {
                                        str = bufferedReader.readLine();
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        a("䍹鴎䈾鉳", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, objArr16);
                                        if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                            IccPrivateKeyCrtComponentsJson = (writeReplace + 125) % 128;
                                            fileReader.close();
                                            bufferedReader.close();
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            a("ⶸ윬쪃럝夡兪⺉㗏焒饍媬福\ueae6㳹ಡ⸋뙋̥髷혁\ue731嫧焭䱻樷릡詅홞㛇\uf619く顓", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, objArr17);
                                            file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                            if (!file.canRead()) {
                                                try {
                                                    java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                    a("樇昧", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1, objArr18);
                                                    boolean equals = readLine.equals(((java.lang.String) objArr18[0]).intern());
                                                    IccPrivateKeyCrtComponentsJson = (writeReplace + 19) % 128;
                                                    if (equals) {
                                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                        a("䨷巕鋯圗뢀薗൩춥\ue1afѵ䰪ஏ꼃騡氏版噛튢髷혁\ue731嫧Ɫ\ue0d4噛튢髷혁\ue731嫧Ɫ\ue0d4ඈ뙋䎡ﾞ", 36 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr19);
                                                        java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                        if (file3.canRead()) {
                                                            try {
                                                                java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                                a("樇昧", 1 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr20);
                                                                if (readLine2.equals(((java.lang.String) objArr20[0]).intern()) && str != null) {
                                                                    writeReplace = (IccPrivateKeyCrtComponentsJson + 95) % 128;
                                                                    java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-245967981) | i9)) | 758961004) * (-602)) - 640129332) + (((~(i | (-245967981))) | 203948140 | (~(800980844 | i9))) * (-301)) + ((~(758961004 | i9)) * 301))};
                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj7 == null) {
                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                        byte b7 = $$a[14];
                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                        b(b7, b7, (byte) (b7 - 1), objArr23);
                                                                        obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                    }
                                                                    ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                    return objArr21;
                                                                }
                                                            } finally {
                                                            }
                                                        } else {
                                                            IccPrivateKeyCrtComponentsJson = (writeReplace + 3) % 128;
                                                        }
                                                    }
                                                } finally {
                                                }
                                            }
                                            java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i | (-566303302))) | 1 | (~(1004928983 | i9))) * 886) + 1627007630 + (((~(566303301 | i9)) | 438625683) * (-1772)) + ((~(438625683 | i9)) * 886))};
                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj == null) {
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                byte b8 = $$a[14];
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                b(b8, b8, (byte) (b8 - 1), objArr26);
                                                obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                            }
                                            ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                            return objArr24;
                                        }
                                        fileReader.close();
                                        bufferedReader.close();
                                    } finally {
                                    }
                                } else {
                                    writeReplace = (IccPrivateKeyCrtComponentsJson + 25) % 128;
                                }
                                str = null;
                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                a("ⶸ윬쪃럝夡兪⺉㗏焒饍媬福\ueae6㳹ಡ⸋뙋̥髷혁\ue731嫧焭䱻樷릡詅홞㛇\uf619く顓", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, objArr172);
                                file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                                if (!file.canRead()) {
                                }
                                java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i | (-566303302))) | 1 | (~(1004928983 | i9))) * 886) + 1627007630 + (((~(566303301 | i9)) | 438625683) * (-1772)) + ((~(438625683 | i9)) * 886))};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj == null) {
                                }
                                ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                                return objArr242;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        i3++;
                        i5 = 28;
                    } else {
                        java.lang.String str3 = strArr[i3];
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        a("▼褠檔\ueb88柵鋚笮㤢ꞹ촧菑ሌ跿\uf3e6\ue1ceᘤ", android.view.KeyEvent.getDeadChar(0, 0) + 16, objArr27);
                        java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                        if (((java.lang.Boolean) cls9.getMethod(str3, new java.lang.Class[0]).invoke(cls9, null)).booleanValue()) {
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                            java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-524299) | i)) | ((~(269345102 | r2)) | (-1004404687))) * 717) - 920427300) + (((~((~i) | (-524299))) | (-1004404687) | (~(269345102 | i))) * 717))};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj2 == null) {
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr82)).intValue();
                            if (i != ((int[]) objArr[1])[0]) {
                            }
                        } else {
                            i3++;
                            i5 = 28;
                        }
                    }
                }
                java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((440452436 | i) * 988) - 1201624748) + (((~(441501013 | i4)) | 562379394) * (-1976)) + (((~(i4 | 563427971)) | (~((-563427972) | i)) | 440452436) * 988))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.view.View.combineMeasuredStates(0, 0));
                    byte b9 = $$a[14];
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    b(b9, b9, (byte) (b9 - 1), objArr29);
                    obj8 = cls10.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
                if (i != ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
            i4 = ~i;
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
