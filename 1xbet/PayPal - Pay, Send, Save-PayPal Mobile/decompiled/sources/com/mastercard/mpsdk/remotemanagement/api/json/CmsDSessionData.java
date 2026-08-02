package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class CmsDSessionData implements com.payair.hce.DeviceNotSecureException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char valueOf;
    private static char values;
    private static char writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "expiryTimestamp")
    private java.lang.String expiryTimestamp;

    @com.payair.hce.setSelectionFromTop(valueOf = "isRedigitization")
    private boolean isRedigitization;
    private final com.payair.hce.checkPermission mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private java.lang.String mobileKeysetId;

    @com.payair.hce.setSelectionFromTop(valueOf = "pendingAction")
    private java.lang.String pendingAction;

    @com.payair.hce.setSelectionFromTop(valueOf = "sessionCode")
    private byte[] sessionCode;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    @com.payair.hce.setSelectionFromTop(valueOf = "validForSeconds")
    private int validForSeconds;

    @com.payair.hce.setSelectionFromTop(valueOf = "version")
    private java.lang.String version;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = (b * 3) + 4;
        byte[] bArr = $$a;
        int i4 = (i * 3) + 110;
        int i5 = s * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            i4 = i6;
            i2 = 0;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i2++;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public final java.lang.String getVersion() {
        int i = AlternateContactlessPaymentDataJson + 31;
        IccPrivateKeyCrtComponentsJson = i % 128;
        java.lang.String str = this.version;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setVersion(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson;
        AlternateContactlessPaymentDataJson = (i + 55) % 128;
        this.version = str;
        AlternateContactlessPaymentDataJson = (i + 65) % 128;
    }

    @Override // com.payair.hce.DeviceNotSecureException
    public final byte[] getSessionCode() {
        int i = IccPrivateKeyCrtComponentsJson + 99;
        AlternateContactlessPaymentDataJson = i % 128;
        byte[] bArr = this.sessionCode;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setSessionCode(byte[] bArr) {
        int i = IccPrivateKeyCrtComponentsJson + 13;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            this.sessionCode = bArr;
        } else {
            this.sessionCode = bArr;
            throw null;
        }
    }

    public final java.lang.String getExpiryTimestamp() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 11;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.expiryTimestamp;
        int i3 = i + 63;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 11;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
            int i3 = $10 + 73;
            $11 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            $11 = ($10 + 37) % 128;
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (values ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i7 = c2 + i5;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.MeasureSpec.getSize(0), 1334 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i8 = charValue + i5;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1335 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 53, 3543 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    public final void setExpiryTimestamp(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 105;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            this.expiryTimestamp = str;
            int i3 = i + 119;
            IccPrivateKeyCrtComponentsJson = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.expiryTimestamp = str;
        throw null;
    }

    public final int getValidForSeconds() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 5;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.validForSeconds;
        int i4 = i + 109;
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    public final void setValidForSeconds(int i) {
        int i2 = AlternateContactlessPaymentDataJson;
        IccPrivateKeyCrtComponentsJson = (i2 + 23) % 128;
        this.validForSeconds = i;
        IccPrivateKeyCrtComponentsJson = (i2 + 87) % 128;
    }

    public final java.lang.String getPendingAction() {
        int i = AlternateContactlessPaymentDataJson;
        IccPrivateKeyCrtComponentsJson = (i + 103) % 128;
        java.lang.String str = this.pendingAction;
        int i2 = i + 59;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setPendingAction(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson;
        AlternateContactlessPaymentDataJson = (i + 57) % 128;
        this.pendingAction = str;
        int i2 = i + 99;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final java.lang.String getTokenUniqueReference() {
        int i = IccPrivateKeyCrtComponentsJson;
        AlternateContactlessPaymentDataJson = (i + 95) % 128;
        java.lang.String str = this.tokenUniqueReference;
        int i2 = i + 11;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setTokenUniqueReference(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson;
        AlternateContactlessPaymentDataJson = (i + 117) % 128;
        this.tokenUniqueReference = str;
        AlternateContactlessPaymentDataJson = (i + 33) % 128;
    }

    public boolean getIsRedigitization() {
        int i = AlternateContactlessPaymentDataJson;
        IccPrivateKeyCrtComponentsJson = (i + 63) % 128;
        boolean z = this.isRedigitization;
        int i2 = i + 79;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setIsRedigitization(boolean z) {
        int i = (IccPrivateKeyCrtComponentsJson + 33) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.isRedigitization = z;
        IccPrivateKeyCrtComponentsJson = (i + 25) % 128;
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.payair.hce.bindServiceAsUser bindserviceasuser = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("䤸జ\u0b97띓\ufb3d羜␏ଚ递괝嵔⓱", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, objArr);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, bindserviceasuser, new java.lang.String[]{((java.lang.String) objArr[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData = (com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener2));
        int i = AlternateContactlessPaymentDataJson + 59;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return cmsDSessionData;
        }
        throw null;
    }

    public final java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("渆\uf357ᤗ첲謂ਯ铞ﭩ", 6 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        if (!this.isRedigitization) {
            AlternateContactlessPaymentDataJson = (IccPrivateKeyCrtComponentsJson + 113) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("㓞阤심᬴\ue67a娘\uaafd损ﻚ\ueb71䗦홱ﻚ\ueb71꜌䓘", 16 - (android.os.Process.myTid() >> 22), objArr2);
            setchilddivider.valueOf(((java.lang.String) objArr2[0]).intern());
            AlternateContactlessPaymentDataJson = (IccPrivateKeyCrtComponentsJson + 115) % 128;
        }
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.checkCallingOrSelfPermission(), byte[].class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        return setchilddivider.DigitizedCardProfile(this);
    }

    public java.lang.String toString() {
        AlternateContactlessPaymentDataJson = (IccPrivateKeyCrtComponentsJson + 11) % 128;
        com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.sessionCode).writeReplace();
        IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 49) % 128;
        return "CmsDSessionData";
    }

    public java.lang.String getMobileKeysetId() {
        int i = AlternateContactlessPaymentDataJson + 15;
        IccPrivateKeyCrtComponentsJson = i % 128;
        java.lang.String str = this.mobileKeysetId;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setMobileKeysetId(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson + 95;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            this.mobileKeysetId = str;
        } else {
            this.mobileKeysetId = str;
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile = (char) 58069;
        valueOf = (char) 58455;
        values = (char) 28766;
        writeReplace = (char) 19255;
    }

    static void init$0() {
        $$a = new byte[]{68, 85, -28, -99};
        $$b = 8;
    }
}
