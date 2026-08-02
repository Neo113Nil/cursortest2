package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class deleteDatabase {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getApplicationLifeCycleData;
    private static int getCardLayoutDescription;
    private static byte[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getDualTapResetTimeout;
    private static int getGpoResponse;
    private static short[] getPaymentFci;
    private static char[] getProfileVersion;
    protected java.lang.String AlternateContactlessPaymentDataJson;
    protected com.payair.hce.deleteSharedPreferences DigitizedCardProfile;
    protected java.util.HashMap<java.lang.String, java.lang.String> IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.getPackageResourcePath RecordsJson;
    private int SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.checkPermission getAid = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    protected com.payair.hce.sendOrderedBroadcast valueOf;
    protected java.lang.String values;
    protected com.payair.hce.deleteFile writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static void g(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i = (s * 3) + 4;
        int i2 = b * 3;
        int i3 = s2 + 104;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        ?? r7 = i3;
        if (bArr == null) {
            i++;
            r7 = i + i3;
        }
        while (true) {
            byte b2 = r7;
            int i5 = i;
            i4++;
            bArr2[i4] = b2;
            if (i4 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i = i5 + 1;
                r7 = b2 + bArr[i5];
            }
        }
    }

    abstract com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException;

    public abstract void writeReplace();

    private static void f(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(getApplicationLifeCycleData)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 43, 2073 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (60037 - android.text.TextUtils.getCapsMode("", 0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    g((byte) 0, (short) 0, (short) 11, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 53, 3542 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 53, android.text.TextUtils.getCapsMode("", 0, 0) + 3543, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public deleteDatabase(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        this.valueOf = sendorderedbroadcast;
        this.RecordsJson = getpackageresourcepath;
        this.values = str;
        this.writeReplace = deletefile;
        this.DigitizedCardProfile = deletesharedpreferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getpackageresourcepath.AlternateContactlessPaymentDataJson());
        java.lang.Object[] objArr = new java.lang.Object[1];
        d(new int[]{0, 1, 0, 0}, "\u0001", true, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.sendStickyOrderedBroadcast.DigitizedCardProfile);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        d(new int[]{0, 1, 0, 0}, "\u0001", true, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(com.payair.hce.sendStickyOrderedBroadcast.valueOf);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        d(new int[]{0, 1, 0, 0}, "\u0001", true, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(com.payair.hce.sendStickyOrderedBroadcast.writeReplace);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        d(new int[]{0, 1, 0, 0}, "\u0001", true, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        this.AlternateContactlessPaymentDataJson = sb.toString();
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        this.IccPrivateKeyCrtComponentsJson = hashMap;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        e((short) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.view.View.getDefaultSize(0, 0) - 928724871, 1065940289 - android.view.View.combineMeasuredStates(0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 83, (byte) (android.graphics.Color.alpha(0) + 80), objArr5);
        java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        e((short) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-928724840) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1065940300 - android.text.TextUtils.indexOf("", ""), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 79, (byte) (-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr6);
        hashMap.put(intern, ((java.lang.String) objArr6[0]).intern());
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = this.IccPrivateKeyCrtComponentsJson;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        e((short) android.text.TextUtils.indexOf("", ""), android.os.Process.getGidForName("") - 928724872, 1065940314 + (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 87, (byte) (17 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr7);
        java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        e((short) android.view.View.MeasureSpec.getSize(0), android.widget.ExpandableListView.getPackedPositionChild(0L) - 928724840, 1065940300 - android.text.TextUtils.indexOf("", ""), (-77) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf("", "", 0, 0) - 1), objArr8);
        hashMap2.put(intern2, ((java.lang.String) objArr8[0]).intern());
    }

    public final java.lang.String valueOf() {
        int i = (getCardLayoutDescription + 125) % 128;
        getDualTapResetTimeout = i;
        java.lang.String str = this.values;
        getCardLayoutDescription = (i + 23) % 128;
        return str;
    }

    public final java.lang.String values(java.lang.String str) throws java.security.GeneralSecurityException {
        java.lang.Object obj;
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
        com.payair.hce.setStatusMessage setstatusmessage = (com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast));
        if (setstatusmessage.writeReplace()) {
            com.payair.hce.isAutomaticTimeEnabled values = setstatusmessage.values();
            this.RecordsJson.getAid();
            int IccPrivateKeyCrtComponentsJson = this.RecordsJson.IccPrivateKeyCrtComponentsJson();
            com.payair.hce.getPackageResourcePath getpackageresourcepath = this.RecordsJson;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast2));
            com.payair.hce.isSessionAvailable values2 = values.values();
            com.payair.hce.isSessionAvailable valueOf = values.valueOf();
            byte[] bytes = str.getBytes();
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
            com.payair.hce.accessisAutomaticTimeEnabled valueOf2 = onnewtoken.valueOf(values2, valueOf, bytes, getpackageresourcepath.writeReplace(), IccPrivateKeyCrtComponentsJson);
            return android.util.Base64.encodeToString((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf2)), 2);
        }
        int i = getCardLayoutDescription + 35;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            d(new int[]{1, 59, 42, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            d(new int[]{1, 59, 42, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr2);
            obj = objArr2[0];
        }
        java.lang.String intern = ((java.lang.String) obj).intern();
        getDualTapResetTimeout = (getCardLayoutDescription + 19) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            f("\u000e\u0003\f\u000f�\uffff￭\u0006\ufffb\f\uffff\b\uffff￡\uffc8\u0013\u000e\u0003\f\u000f�\uffff\r\uffc8\ufffb\u0010\ufffb\u0004\b\t\u0003\u000e\n\uffff�\u0012\uffdf\u0013", true, android.view.KeyEvent.keyCodeFromString("") + 102, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 39, (android.os.Process.myPid() >> 22) + 28, objArr3);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(intern));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b2, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c8, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c6, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c4, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        char c;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getCvrMaskAnd)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 29, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 13) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i6 = $10 + 43;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = getCiacDecline;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i7])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, 5088 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getCiacDecline;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 29 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (getCvrMaskAnd ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (getPaymentFci[i2 + ((int) (SdkCoreBusinessLogicModuleImpl ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getCvrMaskAnd ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    i4 = ((i2 * intValue) >>> 5) % ((int) (SdkCoreBusinessLogicModuleImpl ^ (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (SdkCoreBusinessLogicModuleImpl ^ (-4897270311952305750L)));
                }
                gettrack2constructiondata.writeReplace = i4 + i5;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getGpoResponse), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 28, 2363 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.view.View.getDefaultSize(0, 0));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    g((byte) 0, (short) 0, (short) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = getCiacDecline;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4897270311952305750L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i10 = $10 + 113;
                    $11 = i10 % 128;
                    if (i10 % 2 != 0) {
                        z2 = true;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z2) {
                                int i11 = $10 + 83;
                                $11 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    byte[] bArr6 = getCiacDecline;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace;
                                    c = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson >>> (((byte) (((byte) (bArr6[r8] / (-4897270311952305750L))) >>> s)) ^ b));
                                } else {
                                    byte[] bArr7 = getCiacDecline;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    c = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                                }
                                gettrack2constructiondata.values = c;
                            } else {
                                short[] sArr = getPaymentFci;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                }
                z2 = false;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void d(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = $11 + 117;
        $10 = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = getProfileVersion;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                $10 = ($11 + 79) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(i3) + 30, 2806 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3), (char) (android.os.Process.myTid() >> 22));
                        java.lang.Object[] objArr3 = new java.lang.Object[i5];
                        g((byte) 0, (short) 0, (short) 5, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
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
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                $10 = ($11 + 17) % 128;
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2835, (char) android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        g((byte) 0, (short) 0, (short) 3, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, 2880 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.os.Process.getGidForName("") + 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        g((byte) 0, (short) 0, $$d[0], objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 34, android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myTid() >> 22))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            $11 = ($10 + 43) % 128;
            char[] cArr5 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                $10 = ($11 + 45) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace(java.lang.String str) throws java.security.GeneralSecurityException {
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData writeReplace = this.RecordsJson.writeReplace();
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
        com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast));
        byte[] bytes = writeReplace.getMobileKeysetId().getBytes();
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
        byte[] writeReplace2 = onnewtoken.writeReplace(writeReplace, bytes, (com.payair.hce.updateRNSInformation) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 389581613, -389581611, java.lang.System.identityHashCode(sendorderedbroadcast2)));
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace2);
        com.payair.hce.getPackageResourcePath getpackageresourcepath = this.RecordsJson;
        com.payair.hce.getPackageResourcePath.writeReplace(new java.lang.Object[]{getpackageresourcepath}, 1982198121, -1982198121, java.lang.System.identityHashCode(getpackageresourcepath));
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest cmsDApiRequest = new com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest(writeReplace.getMobileKeysetId(), writeReplace2, str);
        int i = getDualTapResetTimeout + 15;
        getCardLayoutDescription = i % 128;
        if (i % 2 != 0) {
            return cmsDApiRequest;
        }
        throw null;
    }

    public final byte[] AlternateContactlessPaymentDataJson(byte[] bArr) throws com.payair.hce.VisaReperso, java.security.GeneralSecurityException {
        getCardLayoutDescription = (getDualTapResetTimeout + 13) % 128;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponse valueOf = com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponse.valueOf(bArr);
        if (!valueOf.isSuccess()) {
            new java.lang.Object[]{valueOf.getErrorCode(), valueOf.getErrorDescription()};
            throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
        }
        byte[] valueOf2 = com.payair.hce.stopService.valueOf(valueOf.getEncryptedData().getBytes(java.nio.charset.Charset.defaultCharset()));
        int parseInt = java.lang.Integer.parseInt(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(java.util.Arrays.copyOfRange(valueOf2, 0, 3)).writeReplace(), 16);
        if (this.RecordsJson.DigitizedCardProfile() < parseInt) {
            this.RecordsJson.valueOf(parseInt);
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            com.payair.hce.setStatusMessage setstatusmessage = (com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast));
            if (!setstatusmessage.writeReplace()) {
                getCardLayoutDescription = (getDualTapResetTimeout + 57) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                d(new int[]{1, 59, 42, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                getDualTapResetTimeout = (getCardLayoutDescription + 77) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    f("\u000e\u0003\f\u000f�\uffff￭\u0006\ufffb\f\uffff\b\uffff￡\uffc8\u0013\u000e\u0003\f\u000f�\uffff\r\uffc8\ufffb\u0010\ufffb\u0004\b\t\u0003\u000e\n\uffff�\u0012\uffdf\u0013", true, 103 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.graphics.Color.red(0) + 38, 28 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(intern));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            com.payair.hce.isAutomaticTimeEnabled values = setstatusmessage.values();
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            byte[] values2 = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast2))).values(values.values(), values.valueOf(), new com.payair.hce.accessisAutomaticTimeEnabled(valueOf2), this.RecordsJson.writeReplace());
            int i = getCardLayoutDescription + 111;
            getDualTapResetTimeout = i % 128;
            if (i % 2 == 0) {
                return values2;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        d(new int[]{60, 28, 45, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", true, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        d(new int[]{88, 16, 192, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001", false, objArr4);
        throw new com.payair.hce.VisaReperso(intern2, ((java.lang.String) objArr4[0]).intern());
    }

    public static boolean AlternateContactlessPaymentDataJson(com.payair.hce.equals equalsVar) {
        if (equalsVar.DigitizedCardProfile() == 200) {
            return false;
        }
        int i = getCardLayoutDescription + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            equalsVar.writeReplace();
            throw null;
        }
        if (equalsVar.writeReplace() != null && equalsVar.writeReplace().length > 0) {
            return false;
        }
        getCardLayoutDescription = (getDualTapResetTimeout + 29) % 128;
        return true;
    }

    protected final void DigitizedCardProfile(com.payair.hce.equals equalsVar) throws com.payair.hce.VisaReperso {
        if (equalsVar.DigitizedCardProfile() != 401) {
            int DigitizedCardProfile = equalsVar.DigitizedCardProfile();
            if (DigitizedCardProfile != 302) {
                int i = getDualTapResetTimeout;
                getCardLayoutDescription = (i + 125) % 128;
                if (DigitizedCardProfile != 500 && DigitizedCardProfile != 408) {
                    int i2 = i + 107;
                    int i3 = i2 % 128;
                    getCardLayoutDescription = i3;
                    if (i2 % 2 != 0 ? DigitizedCardProfile != 504 : DigitizedCardProfile != 10763) {
                        if (DigitizedCardProfile != 503) {
                            getDualTapResetTimeout = (i3 + 121) % 128;
                            if (DigitizedCardProfile != 1107) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                d(new int[]{205, 33, 117, 14}, null, true, objArr);
                                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                e((short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-928724871) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1065940321, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 85, (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 45), objArr2);
                                throw new com.payair.hce.VisaReperso(intern, ((java.lang.String) objArr2[0]).intern());
                            }
                        }
                    }
                }
            }
            equalsVar.DigitizedCardProfile();
            this.SdkCoreAlternateContactlessPaymentDataImpl = (equalsVar.DigitizedCardProfile() != 503 || equalsVar.valueOf() == 0) ? -1 : equalsVar.valueOf() * 1000;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            d(new int[]{151, 38, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", true, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            d(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 16, 0, 14}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", true, objArr4);
            throw new com.payair.hce.VisaReperso(intern2, ((java.lang.String) objArr4[0]).intern());
        }
        getCardLayoutDescription = (getDualTapResetTimeout + 107) % 128;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        d(new int[]{104, 32, 0, 20}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", false, objArr5);
        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        d(new int[]{136, 15, 0, 8}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", false, objArr6);
        throw new com.payair.hce.VisaReperso(intern3, ((java.lang.String) objArr6[0]).intern());
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.deleteDatabase deletedatabase = (com.payair.hce.deleteDatabase) objArr[0];
        int i = getCardLayoutDescription + 51;
        getDualTapResetTimeout = i % 128;
        int i2 = deletedatabase.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i % 2 == 0) {
            return java.lang.Integer.valueOf(i2);
        }
        throw new java.lang.ArithmeticException();
    }

    static void getAid() {
        getApplicationLifeCycleData = 1889207137;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDualTapResetTimeout = 0;
        getCardLayoutDescription = 1;
        getAid();
        getProfileVersion = new char[]{16857, 16888, 16717, 16726, 16729, 16725, 16725, 16731, 16734, 16706, 16730, 16726, 16728, 16726, 16831, 16828, 16732, 16733, 16733, 16735, 16733, 16728, 16728, 16731, 16722, 16829, 16804, 16733, 16731, 16802, 16830, 16731, 16726, 16723, 16726, 16731, 16730, 16803, 16813, 16827, 16831, 16817, 16821, 16826, 16817, 16816, 16818, 16821, 16827, 16824, 16829, 16828, 16824, 16820, 16712, 16818, 16827, 16818, 16820, 16820, 16867, 16822, 16732, 16726, 16729, 16730, 16723, 16725, 16726, 16829, 16824, 16726, 16727, 16720, 16720, 16721, 16712, 16784, 16787, 16827, 16821, 16813, 16826, 16720, 16825, 16808, 16819, 16827, 16719, 16583, 16604, 16607, 16607, 16578, 16581, 16598, 16600, 16581, 16576, 16606, 16585, 16580, 16581, 16587, 16890, 16810, 16804, 16775, 16780, 16800, 16826, 16802, 16803, 16805, 16810, 16780, 16782, 16804, 16772, 16895, 16774, 16798, 16782, 16886, 16770, 16784, 16808, 16780, 16775, 16802, 16802, 16829, 16800, 16802, 16800, 16777, 16865, 16796, 16768, 16794, 16770, 16771, 16773, 16778, 16773, 16770, 16770, 16797, 16768, 16770, 16768, 16882, 16827, 16829, 16802, 16805, 16775, 16775, 16830, 16804, 16781, 16780, 16806, 16809, 16815, 16812, 16808, 16804, 16800, 16830, 16806, 16782, 16775, 16800, 16778, 16778, 16802, 16806, 16782, 16780, 16810, 16806, 16804, 16811, 16813, 16781, 16780, 16808, 16784, 16879, 16783, 16780, 16776, 16772, 16768, 16798, 16774, 16798, 16786, 16795, 16797, 16770, 16773, 16773, 16774, 16731, 16685, 16682, 16656, 16679, 16676, 16662, 16660, 16675, 16660, 16731, 16752, 16651, 16760, 16749, 16663, 16660, 16687, 16687, 16660, 16662, 16685, 16664, 16662, 16731, 16685, 16660, 16660, 16665, 16731, 16678, 16664, 16659};
        SdkCoreBusinessLogicModuleImpl = -546096363;
        getCvrMaskAnd = 520368628;
        getGpoResponse = 677316192;
        getCiacDecline = new byte[]{com.google.common.base.Ascii.SI, 13, -33, -35, 67, -4, -13, com.google.common.base.Ascii.VT, -4, 5, -42, -86, -87, 92, 110, -108, -86, 83, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 70, -85, -81, -88, -87, 85, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -80, -71, -69, com.visa.cbp.getEncExpo.registerForActivityResult, 120, 126, Byte.MIN_VALUE, -123, 114, -118, 121, -86, -86, -86, -86};
    }

    static void init$0() {
        $$d = new byte[]{7, -117, -88, 7};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue();
    }
}
