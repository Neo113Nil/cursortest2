package com.payair.hce;

/* loaded from: classes4.dex */
public final class VisaTokenization implements com.payair.hce.hashCode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getProfileVersion;
    private final byte[] DigitizedCardProfile;
    private final java.lang.String[] valueOf;
    private int values = com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY;
    private final java.util.List<java.lang.String> writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 4;
        int i4 = (s3 * 4) + 110;
        byte[] bArr = $$a;
        int i5 = (s2 * 4) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i2 = 0;
            int i8 = i3 + i7;
            i = i2;
            int i9 = i6;
            i4 = i8;
            i3 = i9;
            int i10 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i6 = i10;
            i3 = bArr[i10];
            i7 = i11;
            int i82 = i3 + i7;
            i = i2;
            int i92 = i6;
            i4 = i82;
            i3 = i92;
            int i102 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i1022 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public VisaTokenization(java.util.List<java.lang.String> list, byte[] bArr, java.lang.String[] strArr) {
        this.writeReplace = list;
        this.DigitizedCardProfile = bArr;
        this.valueOf = strArr;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char c;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char c2 = 2;
        char[] cArr2 = new char[2];
        $10 = ($11 + 71) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                $11 = ($10 + 31) % 128;
                char c3 = cArr2[1];
                char c4 = cArr2[0];
                char c5 = (char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson);
                    objArr2[c2] = java.lang.Integer.valueOf(c4 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf(((c4 << 4) + c5) ^ (c4 + i2));
                    objArr2[0] = java.lang.Integer.valueOf(c3);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1336, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b = $$a[c2];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAid)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 62, android.text.TextUtils.getTrimmedLength("") + 1335, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte b4 = $$a[2];
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = b4;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b5, b6, b6, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
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
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                c = 2;
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 53, 3543 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            } else {
                c = 2;
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            c2 = c;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @Override // com.payair.hce.hashCode
    public final com.payair.hce.equals DigitizedCardProfile(com.payair.hce.component6 component6Var, java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws com.payair.hce.component5 {
        com.payair.hce.onOptionsItemSelected setcontentview;
        try {
            java.net.URL url = new java.net.URL(str);
            java.lang.String protocol = url.getProtocol();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("씲쨝㗫\ue205\ud811⼻", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 5, objArr);
            if (protocol.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                setcontentview = new com.payair.hce.registerForContextMenu(url, component6Var, this.values, this.DigitizedCardProfile, this.writeReplace, this.valueOf, hashMap);
                RecordsJson = (getProfileVersion + 91) % 128;
            } else {
                setcontentview = new com.payair.hce.setContentView(url, component6Var, this.values, this.writeReplace, hashMap);
            }
            if (str2 != null) {
                getProfileVersion = (RecordsJson + 75) % 128;
                setcontentview.valueOf(str2);
            }
            return setcontentview.values();
        } catch (java.lang.Exception e) {
            throw new com.payair.hce.component5(e.getMessage());
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson = (char) 42113;
        getAid = (char) 62712;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 2004;
        IccPrivateKeyCrtComponentsJson = (char) 27777;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
        $$b = 59;
    }
}
