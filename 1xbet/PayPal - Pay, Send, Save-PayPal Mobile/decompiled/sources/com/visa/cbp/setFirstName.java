package com.visa.cbp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BuildConfig' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class setFirstName {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final com.visa.cbp.setFirstName BuildConfig;
    private static char[] Camera2StreamConfigurationMap;
    public static final com.visa.cbp.setFirstName ConfirmReplenishRequest;
    public static final com.visa.cbp.setFirstName ReplenishAckRequest;
    public static final com.visa.cbp.setFirstName ReplenishRequest;
    public static final com.visa.cbp.setFirstName ReplenishResponse;
    public static final com.visa.cbp.setFirstName getEncryptionMetaData;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static boolean getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.visa.cbp.setFirstName[] getHighSpeedVideoSizes;
    private static long getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static final java.util.HashMap<java.lang.String, com.visa.cbp.setFirstName> getInputSizeshNQ4ISI;
    private static boolean getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static int getOutputStallDuration;
    public static final com.visa.cbp.setFirstName getSignature;
    public static final com.visa.cbp.setFirstName getTokenInfo;
    public static final com.visa.cbp.setFirstName getTvls;
    public static final com.visa.cbp.setFirstName setEncryptionMetaData;
    public static final com.visa.cbp.setFirstName setSignature;
    public static final com.visa.cbp.setFirstName setTokenInfo;
    public static final com.visa.cbp.setFirstName setTvls;
    public static final com.visa.cbp.setFirstName valueOf;
    public static final com.visa.cbp.setFirstName values;
    private final java.lang.String getOutputSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 2;
        int i4 = 122 - s;
        byte[] bArr = $$a;
        int i5 = 4 - (b * 2);
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            int i9 = (-i5) + i6;
            int i10 = i8 + 1;
            i2 = i7;
            i4 = i9;
            i5 = i10;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i8 = i5;
            i5 = bArr[i5];
            i6 = i11;
            int i92 = (-i5) + i6;
            int i102 = i8 + 1;
            i2 = i7;
            i4 = i92;
            i5 = i102;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 0 - i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 0 - i3) {
            }
        }
    }

    public static com.visa.cbp.setFirstName valueOf(java.lang.String str) {
        getInputFormats = (getOutputMinFrameDuration + 67) % 128;
        com.visa.cbp.setFirstName setfirstname = (com.visa.cbp.setFirstName) java.lang.Enum.valueOf(com.visa.cbp.setFirstName.class, str);
        int i = getInputFormats + 65;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return setfirstname;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.visa.cbp.setFirstName[] values() {
        int i = getInputFormats + 63;
        getOutputMinFrameDuration = i % 128;
        com.visa.cbp.setFirstName[] setfirstnameArr = getHighSpeedVideoSizes;
        if (i % 2 == 0) {
            return (com.visa.cbp.setFirstName[]) setfirstnameArr.clone();
        }
        throw null;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges = 0;
        getHighResolutionOutputSizeshNQ4ISI = 1;
        getOutputMinFrameDuration = 0;
        getInputFormats = 1;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u0081\u0084\u0087\u0082\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\u0088\u0089\u0089\u0089\u0089\u0089\u0089\u0088", objArr2);
        com.visa.cbp.setFirstName setfirstname = new com.visa.cbp.setFirstName(intern, 0, ((java.lang.String) objArr2[0]).intern());
        BuildConfig = setfirstname;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ꄄꅀ䤶绵襨н\ue632ꋦ罟欮쐅胓", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u008a\u0089\u0089\u0089\u0089\u0089\u0089\u0088", objArr4);
        com.visa.cbp.setFirstName setfirstname2 = new com.visa.cbp.setFirstName(intern2, 1, ((java.lang.String) objArr4[0]).intern());
        ReplenishAckRequest = setfirstname2;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0082\u008c\u0087\u008b\u0081\u0084\u0082\u0085\u0084\u0083\u0082\u0081", objArr5);
        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("酈酹ᦫ⸝⮰奍䒌\uffef你㮳暤\uddd4", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
        com.visa.cbp.setFirstName setfirstname3 = new com.visa.cbp.setFirstName(intern3, 2, ((java.lang.String) objArr6[0]).intern());
        valueOf = setfirstname3;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0082\u0092\u008d\u008f\u008c\u0092\u0082\u008e\u0092\u0091\u0081\u0082\u0085\u0084\u0083\u0082\u0081\u0090\u0090\u008f\u008e\u008d\u0082", objArr7);
        java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ⲽⲌ߇ぱ뤱\udbad혍紏\uf295◟\uf425弳", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr8);
        com.visa.cbp.setFirstName setfirstname4 = new com.visa.cbp.setFirstName(intern4, 3, ((java.lang.String) objArr8[0]).intern());
        ConfirmReplenishRequest = setfirstname4;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("曋暏☴ᇳ뽓ꅩ퀌\u07bf뢖л\uf23e▀\udabe\ue20c鐡쏭ﳌ", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr9);
        java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("視祖낒蜤߀Ⱨ棼諅⑉銊䫔꣸", android.os.Process.myPid() >> 22, objArr10);
        com.visa.cbp.setFirstName setfirstname5 = new com.visa.cbp.setFirstName(intern5, 4, ((java.lang.String) objArr10[0]).intern());
        values = setfirstname5;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0082\u0085\u008d\u008f\u008d", objArr11);
        java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ㆦ㆗飳꽅ᰪ䴃猖\ueba1\uef8e뫫儾즟", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr12);
        com.visa.cbp.setFirstName setfirstname6 = new com.visa.cbp.setFirstName(intern6, 5, ((java.lang.String) objArr12[0]).intern());
        getTokenInfo = setfirstname6;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䜛䝐\ue3c7퐈嬲滠㑺", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr13);
        java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("㢦㢗胖띠绽옴ᇁ悖\ue68eꋎ㏩䊩", (-16777216) - android.graphics.Color.rgb(0, 0, 0), objArr14);
        com.visa.cbp.setFirstName setfirstname7 = new com.visa.cbp.setFirstName(intern7, 6, ((java.lang.String) objArr14[0]).intern());
        ReplenishRequest = setfirstname7;
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("烪点\ue491퍓\u0ace\uf4ff斋利", android.text.TextUtils.indexOf("", "", 0), objArr15);
        java.lang.String intern8 = ((java.lang.String) objArr15[0]).intern();
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0093\u0089\u0089\u0089\u0089\u0089\u0089\u0088", objArr16);
        com.visa.cbp.setFirstName setfirstname8 = new com.visa.cbp.setFirstName(intern8, 7, ((java.lang.String) objArr16[0]).intern());
        getTvls = setfirstname8;
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ᶺ᷶鰁ꯈ쫋㹩ꖀ颲쏬븄螪몐ꇚ報\ue1b9峸螷", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr17);
        java.lang.String intern9 = ((java.lang.String) objArr17[0]).intern();
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("掙推췉奔钄虐﮸\u20f2붱\uefd1\ud990˃", android.text.TextUtils.indexOf("", "", 0, 0), objArr18);
        com.visa.cbp.setFirstName setfirstname9 = new com.visa.cbp.setFirstName(intern9, 8, ((java.lang.String) objArr18[0]).intern());
        setTvls = setfirstname9;
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("Ṙḟ揊吉▲\uf290䫪呑쀅䇅检癿ꈺ\ua7f1ແ逜葓薂Ⲵ눏晫﮿슑\uec2c䡳\ud9b2", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr19);
        java.lang.String intern10 = ((java.lang.String) objArr19[0]).intern();
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("娣娒㼸ࢎ\udaeb㗛뗗鍹萋ᴠ韾녁", android.view.View.resolveSizeAndState(0, 0, 0), objArr20);
        com.visa.cbp.setFirstName setfirstname10 = new com.visa.cbp.setFirstName(intern10, 9, ((java.lang.String) objArr20[0]).intern());
        setTokenInfo = setfirstname10;
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u008b\u0094\u0082\u008b\u008d\u008f\u0085", objArr21);
        java.lang.String intern11 = ((java.lang.String) objArr21[0]).intern();
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("⡩⡘쒳\uf305귫秡싗\udf43\uf641\ue6ab\ue0feﵺ", android.text.TextUtils.getCapsMode("", 0, 0), objArr22);
        com.visa.cbp.setFirstName setfirstname11 = new com.visa.cbp.setFirstName(intern11, 10, ((java.lang.String) objArr22[0]).intern());
        getSignature = setfirstname11;
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0086\u0085\u0091\u0095\u0090\u0090\u0091\u0085", objArr23);
        java.lang.String intern12 = ((java.lang.String) objArr23[0]).intern();
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\udff7\udfc6镬ꋚ甮떙ᨒጻǟ띴㠻\u3101", android.view.View.MeasureSpec.getSize(0), objArr24);
        com.visa.cbp.setFirstName setfirstname12 = new com.visa.cbp.setFirstName(intern12, 11, ((java.lang.String) objArr24[0]).intern());
        setEncryptionMetaData = setfirstname12;
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\udbf7\udbbd⾐ᡁ㐎䮤孑\ued70ֽඐ祧콝枂\ueba5ὤ⤣䇭", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr25);
        java.lang.String intern13 = ((java.lang.String) objArr25[0]).intern();
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0096\u0088\u0089\u0089\u0089\u0089\u0089\u0088", objArr26);
        com.visa.cbp.setFirstName setfirstname13 = new com.visa.cbp.setFirstName(intern13, 12, ((java.lang.String) objArr26[0]).intern());
        getEncryptionMetaData = setfirstname13;
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("㫘㪒絫䪺嫅庅㖚\uf851\ue492彫ឬ\uda6e蚼류熼㰔ꃄ", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr27);
        java.lang.String intern14 = ((java.lang.String) objArr27[0]).intern();
        java.lang.Object[] objArr28 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("뽍뽼ㆿ؉嚋䶨㦷\ueb0a慥Ꭷᮞ줶", android.view.KeyEvent.keyCodeFromString(""), objArr28);
        com.visa.cbp.setFirstName setfirstname14 = new com.visa.cbp.setFirstName(intern14, 13, ((java.lang.String) objArr28[0]).intern());
        ReplenishResponse = setfirstname14;
        java.lang.Object[] objArr29 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ᕩᔬഘ㫆㳢㊕厾鑎쬣⼙熒뙶ꤖ줾រ倖轵\ueb4d", android.view.View.MeasureSpec.getMode(0), objArr29);
        java.lang.String intern15 = ((java.lang.String) objArr29[0]).intern();
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(126 - android.view.MotionEvent.axisFromString(""), "\u0097\u0088\u0089\u0089\u0089\u0089\u0089\u0088", objArr30);
        com.visa.cbp.setFirstName setfirstname15 = new com.visa.cbp.setFirstName(intern15, 14, ((java.lang.String) objArr30[0]).intern());
        setSignature = setfirstname15;
        getHighSpeedVideoSizes = new com.visa.cbp.setFirstName[]{setfirstname, setfirstname2, setfirstname3, setfirstname4, setfirstname5, setfirstname6, setfirstname7, setfirstname8, setfirstname9, setfirstname10, setfirstname11, setfirstname12, setfirstname13, setfirstname14, setfirstname15};
        getInputSizeshNQ4ISI = new java.util.HashMap<>();
        com.visa.cbp.setFirstName[] values2 = values();
        int length = values2.length;
        int i = 0;
        while (i < length) {
            int i2 = getOutputMinFrameDuration + 39;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                com.visa.cbp.setFirstName setfirstname16 = values2[i];
                getInputSizeshNQ4ISI.put(setfirstname16.valueOf(), setfirstname16);
                i++;
            } else {
                com.visa.cbp.setFirstName setfirstname17 = values2[i];
                getInputSizeshNQ4ISI.put(setfirstname17.valueOf(), setfirstname17);
                i += 42;
            }
            int i3 = getInputFormats + 5;
            getOutputMinFrameDuration = i3 % 128;
            int i4 = i3 % 2;
        }
        getInputFormats = (getOutputMinFrameDuration + 31) % 128;
    }

    private setFirstName(java.lang.String str, int i, java.lang.String str2) {
        this.getOutputSizes = str2;
    }

    public final java.lang.String valueOf() {
        int i = (getOutputMinFrameDuration + 125) % 128;
        getInputFormats = i;
        java.lang.String str = this.getOutputSizes;
        getOutputMinFrameDuration = (i + 11) % 128;
        return str;
    }

    public static com.visa.cbp.setFirstName ConfirmReplenishRequest(java.lang.String str) {
        getOutputMinFrameDuration = (getInputFormats + 103) % 128;
        com.visa.cbp.setFirstName setfirstname = getInputSizeshNQ4ISI.get(str);
        getInputFormats = (getOutputMinFrameDuration + 27) % 128;
        return setfirstname;
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr2 = Camera2StreamConfigurationMap;
        if (cArr2 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 111;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i2])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.resolveSize(0, 0) + 30832), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1971, 29 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                    }
                    cArr[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 1) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getOutputStallDuration)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getCapsMode("", 0, 0), android.text.TextUtils.indexOf("", "", 0) + 959, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 20);
                byte b = $$a[0];
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(b, b, (byte) (b | com.google.common.base.Ascii.VT), objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (!getHighSpeedVideoFpsRangesFor) {
                if (!getOutputFormats) {
                    throw null;
                }
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 89) % 128;
            setmac.BuildConfig = bytes.length;
            char[] cArr3 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                cArr3[setmac.valueOf] = (char) (cArr2[bytes[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                try {
                    java.lang.Object[] objArr5 = {setmac, setmac};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 257 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777241);
                        byte b2 = $$a[0];
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(b2, b2, (byte) (b2 | 6), objArr6);
                        obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighSpeedVideoFpsRanges + 105) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i2 + 43;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        com.visa.cbp.getSignature getsignature = new com.visa.cbp.getSignature();
        char[] valueOf2 = com.visa.cbp.getSignature.valueOf(getHighSpeedVideoSizesFor ^ 525091148651277305L, charArray, i);
        getsignature.valueOf = 4;
        while (getsignature.valueOf < valueOf2.length) {
            getsignature.ConfirmReplenishRequest = getsignature.valueOf - 4;
            int i4 = getsignature.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(valueOf2[getsignature.valueOf] ^ valueOf2[getsignature.valueOf % 4]), java.lang.Long.valueOf(getsignature.ConfirmReplenishRequest), java.lang.Long.valueOf(getHighSpeedVideoSizesFor)};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-330680783);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1467 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 21 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    byte b = $$a[0];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-330680783, obj);
                }
                valueOf2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                try {
                    java.lang.Object[] objArr4 = {getsignature, getsignature};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(81232025);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (49744 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.os.Process.myPid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 30);
                        byte b2 = $$a[0];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(b2, b2, (byte) (b2 | 56), objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(81232025, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
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
        }
        java.lang.String str2 = new java.lang.String(valueOf2, 4, valueOf2.length - 4);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 11) % 128;
        objArr[0] = str2;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        $$a = new byte[]{0, -73, -23, 1};
        $$b = 193;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats = true;
        getHighSpeedVideoFpsRangesFor = true;
        getOutputStallDuration = 514420699;
        Camera2StreamConfigurationMap = new char[]{28575, 28574, 28545, 28562, 28572, 28564, 28546, 28586, 28587, 28589, 28559, 28555, 28553, 28557, 28552, 28567, 28570, 28556, 28579, 28547, 28573, 28588, 28590};
        getHighSpeedVideoSizesFor = -7238903727785599873L;
    }
}
