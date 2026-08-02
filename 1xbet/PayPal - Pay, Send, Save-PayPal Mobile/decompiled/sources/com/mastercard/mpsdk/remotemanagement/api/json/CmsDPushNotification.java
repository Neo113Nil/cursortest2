package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class CmsDPushNotification {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int getProfileVersion;
    private static int valueOf;
    private static char[] values;
    private static boolean writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "encryptedData")
    private java.lang.String encryptedData;
    private final com.payair.hce.checkPermission mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    @com.payair.hce.setSelectionFromTop(valueOf = "mobileKeysetId")
    private java.lang.String mobileKeysetId;

    @com.payair.hce.setSelectionFromTop(valueOf = "responseHost")
    private java.lang.String responseHost;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 1 - (i * 2);
        int i5 = 118 - (s * 3);
        int i6 = b + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = (-i6) + i7;
            i2 = i3;
            int i10 = i8;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i6 + 1;
            int i12 = i5;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = (-i6) + i7;
            i2 = i3;
            int i102 = i8;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public final java.lang.String getResponseHost() {
        int i = valueOf + 15;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return this.responseHost;
        }
        throw null;
    }

    public final void setResponseHost(java.lang.String str) {
        int i = getProfileVersion;
        valueOf = (i + 33) % 128;
        this.responseHost = str;
        valueOf = (i + 47) % 128;
    }

    public final java.lang.String getMobileKeysetId() {
        int i = valueOf + 41;
        getProfileVersion = i % 128;
        java.lang.String str = this.mobileKeysetId;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setMobileKeysetId(java.lang.String str) {
        int i = (getProfileVersion + 105) % 128;
        valueOf = i;
        this.mobileKeysetId = str;
        int i2 = i + 107;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification valueOf(java.lang.String str) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification cmsDPushNotification = (com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, str, com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification.class}, -982165709, 982165716, java.lang.System.identityHashCode(setonitemselectedlistener));
        int i = getProfileVersion + 83;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return cmsDPushNotification;
        }
        throw null;
    }

    public final java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - android.text.TextUtils.getOffsetAfter("", 0), null, null, "\u0086\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        valueOf = (getProfileVersion + 17) % 128;
        return DigitizedCardProfile2;
    }

    public java.lang.String getEncryptedData() {
        int i = valueOf;
        int i2 = i + 57;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.encryptedData;
        int i3 = i + 83;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setEncryptedData(java.lang.String str) {
        int i = valueOf;
        getProfileVersion = (i + 21) % 128;
        this.encryptedData = str;
        getProfileVersion = (i + 9) % 128;
    }

    public java.lang.String toString() {
        int i = getProfileVersion + 109;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return "CmsDPushNotification";
        }
        throw null;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $10 + 111;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr4 = values;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 117) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 46, 286 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (46336 - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr5[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 46, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (writeReplace) {
            int i4 = $11 + 109;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                getumdgeneration.values = bArr2.length;
                cArr2 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 1;
            } else {
                getumdgeneration.values = bArr2.length;
                cArr2 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
            }
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr2[getumdgeneration.valueOf] = (char) (cArr4[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 43, android.view.View.combineMeasuredStates(0, 0) + 1629, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (byte) -1, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            java.lang.String str4 = new java.lang.String(cArr2);
            $10 = ($11 + 39) % 128;
            objArr[0] = str4;
            return;
        }
        if (!DigitizedCardProfile) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr4[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr3.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $11 = ($10 + 25) % 128;
            cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1628, (char) android.view.View.combineMeasuredStates(0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, (byte) -1, (short) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        getProfileVersion = 1;
        values = new char[]{11043, 11047, 11242, 11237, 11240, 11258};
        AlternateContactlessPaymentDataJson = -143185079;
        DigitizedCardProfile = true;
        writeReplace = true;
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
    }
}
