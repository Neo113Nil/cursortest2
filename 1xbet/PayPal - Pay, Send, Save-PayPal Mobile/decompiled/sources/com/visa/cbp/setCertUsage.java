package com.visa.cbp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ConfirmReplenishRequest' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class setCertUsage {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final com.visa.cbp.setCertUsage BuildConfig;
    private static long Camera2StreamConfigurationMap;
    public static final com.visa.cbp.setCertUsage ConfirmReplenishRequest;
    public static final com.visa.cbp.setCertUsage ReplenishAckRequest;
    public static final com.visa.cbp.setCertUsage ReplenishRequest;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final /* synthetic */ com.visa.cbp.setCertUsage[] getHighSpeedVideoSizesFor;
    private static char getInputSizeshNQ4ISI;
    private static int getOutputMinFrameDuration;
    public static final com.visa.cbp.setCertUsage valueOf;
    public static final com.visa.cbp.setCertUsage values;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) ($$a != null ? 67 : 4);
        objArr[0] = new java.lang.String(bArr, 0);
    }

    private setCertUsage(java.lang.String str, int i) {
    }

    public static com.visa.cbp.setCertUsage valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 15) % 128;
        com.visa.cbp.setCertUsage setcertusage = (com.visa.cbp.setCertUsage) java.lang.Enum.valueOf(com.visa.cbp.setCertUsage.class, str);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 109) % 128;
        return setcertusage;
    }

    public static com.visa.cbp.setCertUsage[] values() {
        int i = getHighSpeedVideoSizes + 117;
        getHighSpeedVideoFpsRangesFor = i % 128;
        com.visa.cbp.setCertUsage[] setcertusageArr = getHighSpeedVideoSizesFor;
        if (i % 2 == 0) {
            return (com.visa.cbp.setCertUsage[]) setcertusageArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoFpsRanges = 1;
        getHighSpeedVideoFpsRangesFor = 0;
        getHighSpeedVideoSizes = 1;
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0000\u0000\u0000\u0000", "ዡ꯹诹", (char) (android.graphics.Color.rgb(0, 0, 0) + 16805222), "ﰆι昷멭", 922991100 + android.text.TextUtils.getTrimmedLength(""), objArr);
        com.visa.cbp.setCertUsage setcertusage = new com.visa.cbp.setCertUsage(((java.lang.String) objArr[0]).intern(), 0);
        ConfirmReplenishRequest = setcertusage;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0000\u0000\u0000\u0000", "쵊㛉\u1739ꟸ", (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 20021), "鲇Ɯ㕛ፎ", android.graphics.Color.alpha(0), objArr2);
        com.visa.cbp.setCertUsage setcertusage2 = new com.visa.cbp.setCertUsage(((java.lang.String) objArr2[0]).intern(), 1);
        BuildConfig = setcertusage2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0000\u0000\u0000\u0000", "윭讻\u2072㸯쐤㏝좔", (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "걐䆙巟枠", (-549348947) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        com.visa.cbp.setCertUsage setcertusage3 = new com.visa.cbp.setCertUsage(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = setcertusage3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0000\u0000\u0000\u0000", "栱鼬ƙ봟叶텩\udb28ᶧ", (char) android.graphics.Color.red(0), "\ufdea뿌\uf555䲆", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr4);
        com.visa.cbp.setCertUsage setcertusage4 = new com.visa.cbp.setCertUsage(((java.lang.String) objArr4[0]).intern(), 3);
        ReplenishAckRequest = setcertusage4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0000\u0000\u0000\u0000", "ꦊ看䂧ࢢꬳ糈짙", (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), "단ھ䃘谇", (-670646606) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
        com.visa.cbp.setCertUsage setcertusage5 = new com.visa.cbp.setCertUsage(((java.lang.String) objArr5[0]).intern(), 4);
        values = setcertusage5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0000\u0000\u0000\u0000", "䠰㾁়䌳卅\ueea5檊겣", (char) android.widget.ExpandableListView.getPackedPositionType(0L), "⪆鋶ഺ㛓", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr6);
        com.visa.cbp.setCertUsage setcertusage6 = new com.visa.cbp.setCertUsage(((java.lang.String) objArr6[0]).intern(), 5);
        ReplenishRequest = setcertusage6;
        getHighSpeedVideoSizesFor = new com.visa.cbp.setCertUsage[]{setcertusage, setcertusage2, setcertusage3, setcertusage4, setcertusage5, setcertusage6};
        int i = getHighSpeedVideoSizes + 93;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, char c, java.lang.String str3, int i, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 3) % 128;
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
        char[] cArr = charArray;
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 73) % 128;
        char[] cArr2 = charArray3;
        com.visa.cbp.AidInfo aidInfo = new com.visa.cbp.AidInfo();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        aidInfo.valueOf = 0;
        while (aidInfo.valueOf < length3) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
            try {
                java.lang.Object[] objArr2 = {aidInfo};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1983273232);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getTrimmedLength(""), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2000, 30 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getMethod("D", java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1983273232, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                try {
                    java.lang.Object[] objArr3 = {aidInfo};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1725818816);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(objArr4);
                        obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1725818816, obj2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    try {
                        java.lang.Object[] objArr5 = {aidInfo, java.lang.Integer.valueOf(cArr3[aidInfo.valueOf % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1422457014);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.KeyEvent.keyCodeFromString("") + 99, 25 - (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("A", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1422457014, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                        try {
                            java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(894413753);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.combineMeasuredStates(0, 0) + 30832), 1972 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 30 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).getMethod(com.visa.cbp.getEncExpo.warmup, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(894413753, obj4);
                            }
                            cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).charValue();
                            cArr3[intValue2] = aidInfo.BuildConfig;
                            cArr5[aidInfo.valueOf] = (char) ((((int) (getOutputMinFrameDuration ^ 1527987341865046008L)) ^ ((cArr3[intValue2] ^ charArray2[aidInfo.valueOf]) ^ (Camera2StreamConfigurationMap ^ 1527987341865046008L))) ^ ((char) (getInputSizeshNQ4ISI ^ 1527987341865046008L)));
                            aidInfo.valueOf++;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 7) % 128;
        objArr[0] = str4;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        $$a = new byte[]{2, com.google.common.base.Ascii.CAN, 98, 103};
        $$b = 40;
    }

    static void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = 1294520312;
        getInputSizeshNQ4ISI = (char) 16525;
        Camera2StreamConfigurationMap = 1527987341865046008L;
    }
}
