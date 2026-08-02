package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFontFeatureSettings extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.setFontFeatureSettings AlternateContactlessPaymentDataJson;
    private static com.payair.hce.setFontFeatureSettings DigitizedCardProfile;
    private static short[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getCiacDecline;
    private static int getProfileVersion;
    private static final byte[] valueOf;
    private static final byte[] writeReplace;
    private final byte[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 4 - (i * 2);
        int i4 = (b2 * 4) + 104;
        byte[] bArr = $$a;
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i3;
            int i9 = (-i3) + i6;
            int i10 = i8 + 1;
            i2 = i7;
            i4 = i9;
            i3 = i10;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i8 = i3;
            i3 = bArr[i3];
            i7 = i2 + 1;
            i6 = i11;
            int i92 = (-i3) + i6;
            int i102 = i8 + 1;
            i2 = i7;
            i4 = i92;
            i3 = i102;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (SdkCoreBusinessLogicModuleImpl + 55) % 128;
        getCiacDecline = i4;
        SdkCoreBusinessLogicModuleImpl = (i4 + 19) % 128;
        return java.lang.Boolean.FALSE;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        values();
        writeReplace = new byte[]{-1};
        valueOf = new byte[]{0};
        DigitizedCardProfile = new com.payair.hce.setFontFeatureSettings(false);
        AlternateContactlessPaymentDataJson = new com.payair.hce.setFontFeatureSettings(true);
        int i = getCiacDecline + 63;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private setFontFeatureSettings(byte[] bArr) {
        if (bArr.length != 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((-1161207560) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-1275716017) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 77, (byte) android.view.View.getDefaultSize(0, 0), (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        byte b = bArr[0];
        if (b == 0) {
            this.values = valueOf;
        } else if ((b & 255) == 255) {
            this.values = writeReplace;
        } else {
            this.values = com.payair.hce.getClientVersion.values(bArr);
        }
    }

    private setFontFeatureSettings(boolean z) {
        this.values = z ? writeReplace : valueOf;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        int i = (getCiacDecline + 125) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        getCiacDecline = (i + 59) % 128;
        return 3;
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i = getCiacDecline + 19;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            setmaxlines.AlternateContactlessPaymentDataJson(0, this.values);
        } else {
            setmaxlines.AlternateContactlessPaymentDataJson(1, this.values);
        }
    }

    @Override // com.payair.hce.setEms
    protected final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (setems instanceof com.payair.hce.setFontFeatureSettings) {
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 85) % 128;
            return this.values[0] == ((com.payair.hce.setFontFeatureSettings) setems).values[0];
        }
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 105) % 128;
        return false;
    }

    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            int i5 = 1;
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(RecordsJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            long j = 0;
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, android.view.KeyEvent.keyCodeFromString("") + 29, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i6 = intValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr != null) {
                    $11 = ($10 + 113) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        java.lang.Object[] objArr3 = new java.lang.Object[i5];
                        objArr3[0] = java.lang.Integer.valueOf(bArr[i7]);
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 32, android.text.TextUtils.indexOf("", "") + 5088, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i5 = 1;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getAid)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 27, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 29, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (getAid ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                $11 = ($10 + 75) % 128;
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (getAid ^ (-4897270311952305750L))) + i6;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getProfileVersion), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2364 - android.text.TextUtils.indexOf("", "", 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, (byte) 0, (byte) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        bArr5[i8] = (byte) (bArr4[i8] ^ (-4897270311952305750L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i4 = 1;
                    z = true;
                } else {
                    z = false;
                    i4 = 1;
                }
                gettrack2constructiondata.DigitizedCardProfile = i4;
                $10 = ($11 + 115) % 128;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z) {
                        $10 = ($11 + 15) % 128;
                        byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = IccPrivateKeyCrtComponentsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
            }
            java.lang.String obj5 = sb.toString();
            $11 = ($10 + 21) % 128;
            objArr[0] = obj5;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        int i = SdkCoreBusinessLogicModuleImpl + 3;
        int i2 = i % 128;
        getCiacDecline = i2;
        int i3 = i % 2;
        byte b = this.values[0];
        int i4 = i2 + 5;
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return b;
        }
        throw null;
    }

    public final java.lang.String toString() {
        if (this.values[0] != 0) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 95) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((-1161207573) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.green(0) - 1275715982, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 76, (byte) android.view.View.resolveSizeAndState(0, 0, 0), (short) android.view.KeyEvent.normalizeMetaState(0), objArr);
            return ((java.lang.String) objArr[0]).intern();
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionChild(0L) - 1161207586, (-1275715979) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 77, (byte) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (short) android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        int i = SdkCoreBusinessLogicModuleImpl + 93;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    static com.payair.hce.setFontFeatureSettings AlternateContactlessPaymentDataJson(byte[] bArr) {
        if (bArr.length != 1) {
            int touchSlop = android.view.ViewConfiguration.getTouchSlop();
            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
            int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((-1161207591) - (touchSlop >> 8), normalizeMetaState - 1275715973, (-77) - (windowTouchSlop >> 8), (byte) android.graphics.Color.blue(0), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        byte b = bArr[0];
        if (b == 0) {
            int i = SdkCoreBusinessLogicModuleImpl + 13;
            getCiacDecline = i % 128;
            if (i % 2 == 0) {
                return DigitizedCardProfile;
            }
            throw null;
        }
        if ((b & 255) != 255) {
            return new com.payair.hce.setFontFeatureSettings(bArr);
        }
        com.payair.hce.setFontFeatureSettings setfontfeaturesettings = AlternateContactlessPaymentDataJson;
        int i2 = SdkCoreBusinessLogicModuleImpl + 105;
        getCiacDecline = i2 % 128;
        if (i2 % 2 == 0) {
            return setfontfeaturesettings;
        }
        throw null;
    }

    static void values() {
        getAid = 1393414171;
        RecordsJson = 520368614;
        getProfileVersion = 1513270979;
        SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{125, -95, -29, com.google.common.base.Ascii.CAN, -81, -29, 17, 91, 81, -67, -24, 69, -69, 17, 69, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 83, -30, com.google.common.base.Ascii.SYN, 82, 93, -84, -83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -7, 17, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -93, -95, 65, -4, 17, 91, 81, -67, 18, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -87, 84, 19, 88, -83, -95, 81, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -95, -29, com.google.common.base.Ascii.CAN, -81, -29, 17, 91, 81, -67, -24, 69, -69, 17, 69, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 83, -30, com.google.common.base.Ascii.SYN, 82, 93, -84, -83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -7, 17, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -93, -95, 65, -4, 120, -89, 86, 83, 87, -86, -89};
    }

    static void init$0() {
        $$a = new byte[]{34, -19, 77, -23};
        $$b = 91;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1835049628, 1835049628, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
