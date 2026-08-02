package com.payair.hce;

/* loaded from: classes4.dex */
public final class requestChangeWalletPin implements com.payair.hce.getNumberOfAvailableCredentialsForToken {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getCvrMaskAnd;
    private static char getGpoResponse;
    private static int getPaymentFci;
    private com.payair.hce.getAppVersion AlternateContactlessPaymentDataJson;
    private com.payair.hce.createMCBP DigitizedCardProfile;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> RecordsJson;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.transactionCanBeResumed getAid;
    private com.payair.hce.transactionCanBeResumed getProfileVersion;
    private com.payair.hce.transactionCanBeResumed valueOf;
    private com.payair.hce.clearAllWalletAppData values;
    private com.payair.hce.getAppVersion writeReplace;

    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2 = i + 102;
        byte[] bArr = $$a;
        int i3 = b * 2;
        int i4 = 3 - (s * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i2 += bArr[i8];
            i4 = i8;
            i6 = i7;
        }
    }

    public requestChangeWalletPin(com.payair.hce.clearAllWalletAppData clearallwalletappdata, com.payair.hce.getAppVersion getappversion, com.payair.hce.createMCBP createmcbp, com.payair.hce.getAppVersion getappversion2) {
        this.values = clearallwalletappdata;
        this.AlternateContactlessPaymentDataJson = getappversion;
        this.DigitizedCardProfile = createmcbp;
        this.writeReplace = getappversion2;
    }

    public requestChangeWalletPin(com.payair.hce.clearAllWalletAppData clearallwalletappdata, com.payair.hce.getAppVersion getappversion, com.payair.hce.createMCBP createmcbp, com.payair.hce.getAppVersion getappversion2, com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.transactionCanBeResumed transactioncanberesumed3, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2) {
        this(clearallwalletappdata, getappversion, createmcbp, getappversion2);
        this.getAid = transactioncanberesumed2;
        this.getProfileVersion = transactioncanberesumed3;
        this.SdkCoreAlternateContactlessPaymentDataImpl = list;
        this.RecordsJson = list2;
        this.valueOf = transactioncanberesumed;
    }

    @Override // com.payair.hce.getNumberOfAvailableCredentialsForToken
    public final com.payair.hce.createMCBP valueOf() {
        int i = (getCvrMaskAnd + 93) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        com.payair.hce.createMCBP createmcbp = this.DigitizedCardProfile;
        int i2 = i + 87;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return createmcbp;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getNumberOfAvailableCredentialsForToken
    public final com.payair.hce.getAppVersion DigitizedCardProfile() {
        int i = getCvrMaskAnd + 25;
        int i2 = i % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        if (i % 2 != 0) {
            throw null;
        }
        com.payair.hce.getAppVersion getappversion = this.writeReplace;
        getCvrMaskAnd = (i2 + 101) % 128;
        return getappversion;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int i2 = $11 + 119;
        $10 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str3 != null) {
            cArr = str3.toCharArray();
            $11 = ($10 + 65) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            $10 = ($11 + 61) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            $11 = ($10 + 91) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        char[] cArr6 = cArr3;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr4.length;
        char[] cArr7 = new char[length];
        int length2 = cArr6.length;
        char[] cArr8 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr7, 0, length);
        java.lang.System.arraycopy(cArr6, 0, cArr8, 0, length2);
        cArr7[0] = (char) (cArr7[0] ^ c);
        cArr8[2] = (char) (cArr8[2] + ((char) i));
        int length3 = cArr5.length;
        char[] cArr9 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 21) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(72 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1179 - android.graphics.Color.blue(0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, (short) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, android.graphics.Color.green(0) + 3443, (char) (3831 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr7[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 26, 1864 - android.graphics.Color.alpha(0), (char) (41775 - android.graphics.Color.green(0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((byte) 0, 3, (short) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr7[intValue2] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 3133 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((byte) 0, length4, (byte) (length4 - 4), objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr8[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr7[intValue2] = getwalletdata.values;
                cArr9[getwalletdata.writeReplace] = (char) ((((cArr5[getwalletdata.writeReplace] ^ cArr7[intValue2]) ^ (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((int) (getPaymentFci ^ 1263759066225628708L))) ^ ((char) (getGpoResponse ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr9);
    }

    public final java.lang.String toString() {
        com.payair.hce.setMaximumPinTry.valueOf();
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.KeyEvent.keyCodeFromString("");
        android.os.Process.getGidForName("");
        android.widget.ExpandableListView.getPackedPositionGroup(0L);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata = this.values;
        new java.lang.Object[]{clearallwalletappdata != null ? clearallwalletappdata.toString() : ""};
        android.view.KeyEvent.getModifierMetaStateMask();
        android.view.View.MeasureSpec.getMode(0);
        java.lang.Object obj = this.AlternateContactlessPaymentDataJson;
        if (obj == null) {
            obj = "";
        } else {
            SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 93) % 128;
        }
        new java.lang.Object[]{obj};
        android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        android.view.KeyEvent.keyCodeFromString("");
        java.lang.Object obj2 = this.DigitizedCardProfile;
        if (obj2 == null) {
            getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 43) % 128;
            obj2 = "";
        }
        new java.lang.Object[]{obj2};
        android.text.TextUtils.indexOf("", "");
        android.widget.ExpandableListView.getPackedPositionType(0L);
        java.lang.Object obj3 = this.writeReplace;
        if (obj3 == null) {
            obj3 = "";
        }
        new java.lang.Object[]{obj3};
        android.view.KeyEvent.getMaxKeyCode();
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "蝩彋੬藹ു튞ꄹꘇ奘閘뾒涅\ue7d7燚石➊\udbeaꃪ댮", "⨸蔶䗶\uf0ff", android.view.KeyEvent.getDeadChar(0, 0) - 159042006, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65349), objArr);
        return ((java.lang.String) objArr[0]).intern();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getCvrMaskAnd = 1;
        IccPrivateKeyCrtComponentsJson = 1263759066225628708L;
        getPaymentFci = -804334044;
        getGpoResponse = (char) 16204;
    }

    static void init$0() {
        $$a = new byte[]{57, -61, -44, -120};
        $$b = 41;
    }
}
