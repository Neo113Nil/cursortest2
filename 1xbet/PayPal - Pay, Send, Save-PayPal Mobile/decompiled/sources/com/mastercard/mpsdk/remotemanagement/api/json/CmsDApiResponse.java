package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class CmsDApiResponse {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static long values;

    @com.payair.hce.setSelectionFromTop(valueOf = "encryptedData")
    private java.lang.String encryptedData;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorCode")
    private java.lang.String errorCode;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorDescription")
    private java.lang.String errorDescription;
    private final com.payair.hce.checkPermission mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s2 + 4;
        int i4 = 113 - i;
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i3;
            i2 = 0;
            int i9 = i8;
            i4 = i3 + i7;
            i3 = i9;
            int i10 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i10];
            int i11 = i4;
            i8 = i10;
            i3 = i11;
            int i92 = i8;
            i4 = i3 + i7;
            i3 = i92;
            int i102 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponse valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponse cmsDApiResponse = (com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponse) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponse.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        AlternateContactlessPaymentDataJson = (valueOf + 15) % 128;
        return cmsDApiResponse;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 63) % 128;
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
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.indexOf("", "", 0), (android.os.Process.myTid() >> 22) + 1890, (char) (3600 - android.graphics.Color.argb(0, 0, 0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (short) -1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.widget.ExpandableListView.getPackedPositionType(0L), android.view.View.MeasureSpec.getSize(0) + 1443, (char) (android.os.Process.getGidForName("") + 29683));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (short) -1, 1, objArr5);
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
            int i3 = $10 + 77;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 65, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1444, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 29682));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, (short) -1, 1, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj4 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 64, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1443, (char) ((android.os.Process.myTid() >> 22) + 29682));
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b((short) 0, (short) -1, 1, objArr9);
                obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public java.lang.String getErrorCode() {
        int i = valueOf + 81;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return this.errorCode;
        }
        throw null;
    }

    public void setErrorCode(java.lang.String str) {
        int i = valueOf;
        AlternateContactlessPaymentDataJson = (i + 81) % 128;
        this.errorCode = str;
        AlternateContactlessPaymentDataJson = (i + 5) % 128;
    }

    public java.lang.String getErrorDescription() {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (i + 47) % 128;
        java.lang.String str = this.errorDescription;
        int i2 = i + 11;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setErrorDescription(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson + 61;
        valueOf = i % 128;
        if (i % 2 == 0) {
            this.errorDescription = str;
        } else {
            this.errorDescription = str;
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getEncryptedData() {
        int i = (valueOf + 93) % 128;
        AlternateContactlessPaymentDataJson = i;
        java.lang.String str = this.encryptedData;
        int i2 = i + 59;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setEncryptedData(java.lang.String str) {
        int i = valueOf + 41;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            this.encryptedData = str;
        } else {
            this.encryptedData = str;
            throw null;
        }
    }

    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("쮭ᘂ炲勪뵊龣臨", 56747 - android.view.KeyEvent.normalizeMetaState(0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        int i = AlternateContactlessPaymentDataJson + 19;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile;
        }
        throw new java.lang.ArithmeticException();
    }

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    public boolean isSuccess() {
        int i = valueOf + 39;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (this.errorCode != null || this.errorDescription != null) {
            return false;
        }
        valueOf = (i2 + 41) % 128;
        return true;
    }

    public java.lang.String toString() {
        int i = (AlternateContactlessPaymentDataJson + 11) % 128;
        valueOf = i;
        int i2 = i + 43;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return "CmsDApiResponse";
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        values = 8889826898045943055L;
    }

    static void init$0() {
        $$a = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10};
        $$b = 108;
    }
}
