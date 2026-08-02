package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class CmsDApiResponseEncrypted {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int getAid;
    private static int valueOf;
    private static boolean values;
    private static char[] writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorCode")
    private java.lang.String errorCode;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorDescription")
    private java.lang.String errorDescription;
    protected final com.payair.hce.checkPermission mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    @com.payair.hce.setSelectionFromTop(valueOf = "responseHost")
    private java.lang.String responseHost;

    @com.payair.hce.setSelectionFromTop(valueOf = "responseId")
    private java.lang.String responseId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (i * 3);
        int i5 = 118 - (s2 * 4);
        int i6 = (s * 3) + 1;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i5 = i6;
            i5 += i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 += i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public CmsDApiResponseEncrypted() {
    }

    public CmsDApiResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.responseHost = str;
        this.responseId = str2;
        this.errorCode = str3;
        this.errorDescription = str4;
    }

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    public boolean isSuccess() {
        if (this.errorCode == null && this.errorDescription == null) {
            getAid = (valueOf + 5) % 128;
            return true;
        }
        valueOf = (getAid + 23) % 128;
        return false;
    }

    public java.lang.String getResponseId() {
        int i = valueOf;
        int i2 = i + 119;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.responseId;
        getAid = (i + 105) % 128;
        return str;
    }

    public void setResponseId(java.lang.String str) {
        int i = getAid;
        valueOf = (i + 63) % 128;
        this.responseId = str;
        valueOf = (i + 31) % 128;
    }

    public java.lang.String getResponseHost() {
        int i = getAid;
        valueOf = (i + 29) % 128;
        java.lang.String str = this.responseHost;
        valueOf = (i + 35) % 128;
        return str;
    }

    public void setResponseHost(java.lang.String str) {
        int i = getAid;
        valueOf = (i + 79) % 128;
        this.responseHost = str;
        valueOf = (i + 5) % 128;
    }

    public java.lang.String getErrorCode() {
        int i = getAid;
        int i2 = i + 27;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.errorCode;
        int i3 = i + 43;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setErrorCode(java.lang.String str) {
        int i = (valueOf + 7) % 128;
        getAid = i;
        this.errorCode = str;
        valueOf = (i + 83) % 128;
    }

    public java.lang.String getErrorDescription() {
        int i = valueOf;
        getAid = (i + 67) % 128;
        java.lang.String str = this.errorDescription;
        getAid = (i + 93) % 128;
        return str;
    }

    public void setErrorDescription(java.lang.String str) {
        int i = getAid;
        valueOf = (i + 69) % 128;
        this.errorDescription = str;
        valueOf = (i + 21) % 128;
    }

    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(null, 126 - android.os.Process.getGidForName(""), null, "\u0086\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = valueOf + 7;
        getAid = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted cmsDApiResponseEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        getAid = (valueOf + 55) % 128;
        return cmsDApiResponseEncrypted;
    }

    public java.lang.String toString() {
        int i = valueOf;
        int i2 = i + 35;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getAid = (i + 45) % 128;
        return "CmsDApiResponseEncrypted";
    }

    private static void c(java.lang.String str, int i, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        int i2;
        java.lang.String str3 = str2;
        $10 = ($11 + 75) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = writeReplace;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)) + 46, android.text.TextUtils.getOffsetAfter("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.os.Process.getGidForName("") + 46338))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46, android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.text.TextUtils.getCapsMode("", 0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (AlternateContactlessPaymentDataJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 43, 1630 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter("", 0));
                    byte b = (byte) ($$d[0] - 1);
                    byte b2 = b;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(b, b2, b2, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                int i4 = $11 + 121;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!values) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i6 = $11 + 29;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values >> 1) - getumdgeneration.valueOf] + i] << intValue);
                    i2 = getumdgeneration.valueOf - 1;
                } else {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    i2 = getumdgeneration.valueOf + 1;
                }
                getumdgeneration.valueOf = i2;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $11 = ($10 + 33) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1629 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.os.Process.myPid() >> 22));
                byte b3 = (byte) ($$d[0] - 1);
                byte b4 = b3;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d(b3, b4, b4, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        getAid = 1;
        writeReplace = new char[]{11095, 11051, 11038, 11241, 11036, 11246};
        DigitizedCardProfile = -143185027;
        values = true;
        AlternateContactlessPaymentDataJson = true;
    }

    static void init$0() {
        $$d = new byte[]{1, 58, com.google.common.base.Ascii.FF, Byte.MIN_VALUE};
        $$e = 126;
    }
}
