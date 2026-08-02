package com.payair.hce;

/* loaded from: classes4.dex */
public class onTaskRemoved implements com.payair.hce.getAttributionTag {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static int getProfileVersion;
    private com.payair.hce.accessgetCoroutineScopep AlternateContactlessPaymentDataJson;
    private com.payair.hce.setErrors DigitizedCardProfile;
    private com.payair.hce.checkPermission RecordsJson;
    private com.payair.hce.getClassLoader valueOf;
    private com.payair.hce.getErrors values;
    private com.payair.hce.updateRNSInformation writeReplace;

    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i * 2;
        int i3 = 115 - (s * 2);
        int i4 = b + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i4 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i7];
                i4 = i7;
                i6 = i8;
            }
        }
    }

    public onTaskRemoved(com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep, com.payair.hce.getClassLoader getclassloader, com.payair.hce.setErrors seterrors, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.getErrors geterrors) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "7ￛ\u000e\uffff\u0006ￛ", 253 - android.text.TextUtils.indexOf("", "", 0, 0), 3 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 7 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onTaskRemoved.class.getName());
        this.RecordsJson = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.AlternateContactlessPaymentDataJson = accessgetcoroutinescopep;
        this.valueOf = getclassloader;
        this.DigitizedCardProfile = seterrors;
        this.writeReplace = updaternsinformation;
        this.values = geterrors;
    }

    @Override // com.payair.hce.getSharedPreferences
    public final com.payair.hce.lambdasendUpdateRNSInformation0 valueOf() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 43) % 128;
        com.payair.hce.lambdasendUpdateRNSInformation0 writeReplace = this.DigitizedCardProfile.writeReplace();
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 111) % 128;
        return writeReplace;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        $10 = i4;
        if (str != null) {
            $11 = (i4 + 23) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        $10 = ($11 + 105) % 128;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(getAid)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 44, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2073, (char) (60038 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 0, (byte) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3543 - android.view.View.resolveSize(0, 0), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $11 = ($10 + 99) % 128;
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.argb(0, 0, 0, 0), 3544 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.getAttributionTag
    public final boolean values() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 97) % 128;
        boolean IccPrivateKeyCrtComponentsJson2 = this.DigitizedCardProfile.IccPrivateKeyCrtComponentsJson();
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 27) % 128;
        return IccPrivateKeyCrtComponentsJson2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        getAid = 1889207257;
    }

    static void init$0() {
        $$a = new byte[]{107, 13, -60, -69};
        $$b = 32;
    }
}
