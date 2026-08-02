package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class RequestSessionRequest extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int getAid;
    private static char valueOf;
    private static char values;
    private static char writeReplace;
    private final com.payair.hce.checkPermission mLogUtils;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentAppInstanceId")
    private java.lang.String paymentAppInstanceId;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentAppProviderId")
    private java.lang.String paymentAppProviderId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 3) + 110;
        byte[] bArr = $$d;
        int i5 = (i * 4) + 1;
        int i6 = 3 - (s2 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i4 = i5;
            i3 = 0;
            i4 += i6;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i6 + 1;
            i7 = i8;
            i6 = bArr[i8];
            i4 += i6;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public RequestSessionRequest(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, bArr, str2);
        this.mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
        this.paymentAppInstanceId = str3;
        this.paymentAppProviderId = str4;
    }

    public RequestSessionRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str, null, null);
        this.mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
        this.paymentAppProviderId = str2;
        this.paymentAppInstanceId = str3;
    }

    public java.lang.String getPaymentAppProviderId() {
        int i = getAid;
        DigitizedCardProfile = (i + 107) % 128;
        java.lang.String str = this.paymentAppProviderId;
        DigitizedCardProfile = (i + 65) % 128;
        return str;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest setPaymentAppProviderId(java.lang.String str) {
        int i = getAid;
        int i2 = i + 77;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            this.paymentAppProviderId = str;
            int i3 = i + 79;
            DigitizedCardProfile = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }
        this.paymentAppProviderId = str;
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getPaymentAppInstanceId() {
        int i = (DigitizedCardProfile + 21) % 128;
        getAid = i;
        java.lang.String str = this.paymentAppInstanceId;
        DigitizedCardProfile = (i + 71) % 128;
        return str;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest setPaymentAppInstanceId(java.lang.String str) {
        int i = getAid;
        DigitizedCardProfile = (i + 97) % 128;
        this.paymentAppInstanceId = str;
        DigitizedCardProfile = (i + 49) % 128;
        return this;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest
    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        c("\u0cf5쿁ݤ㌉쥎\uee23쨋\u0fec", (-16777209) - android.graphics.Color.rgb(0, 0, 0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = DigitizedCardProfile + 73;
        getAid = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        int i3 = i2 + 111;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i2 + 49;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char[] cArr5 = cArr3;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (valueOf ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.KeyEvent.normalizeMetaState(0) + 1335, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 0, (short) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 2144259807102049818L))) ^ r11), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i7 = charValue + i5;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 62, 1335 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, (short) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr5;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr6 = cArr3;
            cArr6[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr6[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myTid() >> 22), 3544 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            cArr3 = cArr6;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest valueOf(java.lang.String str) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest requestSessionRequest = (com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, str, com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest.class}, -982165709, 982165716, java.lang.System.identityHashCode(setonitemselectedlistener));
        DigitizedCardProfile = (getAid + 5) % 128;
        return requestSessionRequest;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest
    public java.lang.String toString() {
        int i = DigitizedCardProfile + 69;
        getAid = i % 128;
        if (i % 2 != 0) {
            super.getMobileKeysetId();
            return getClass().getSimpleName();
        }
        super.getMobileKeysetId();
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        getAid = 1;
        values = (char) 33454;
        writeReplace = (char) 60145;
        valueOf = (char) 32974;
        AlternateContactlessPaymentDataJson = (char) 2890;
    }

    static void init$0() {
        $$d = new byte[]{89, 43, 98, -67};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
    }
}
