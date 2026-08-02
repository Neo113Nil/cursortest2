package com.visa.cbp;

/* loaded from: classes5.dex */
public class setTicketMetaData extends com.visa.cbp.sdk.facade.data.TvlEntry {
    public static final byte[] $$d = null;
    public static final int $$e = 0;
    private static int Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static long getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private com.visa.cbp.sdk.facade.data.TokenKey getOutputFormats;

    private static void getHighSpeedVideoSizes(byte b, java.lang.Object[] objArr) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) ($$d != null ? 122 - (b * 56) : 3);
        objArr[0] = new java.lang.String(bArr, 0);
    }

    public com.visa.cbp.sdk.facade.data.TokenKey ReplenishAckRequest() {
        int i = (Camera2StreamConfigurationMap + 33) % 128;
        getHighSpeedVideoSizes = i;
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = this.getOutputFormats;
        int i2 = i + 111;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return tokenKey;
        }
        throw null;
    }

    public void values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        int i = getHighSpeedVideoSizes + 61;
        Camera2StreamConfigurationMap = i % 128;
        this.getOutputFormats = tokenKey;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String values() {
        int i = Camera2StreamConfigurationMap + 69;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        int i3 = i2 + 43;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void ReplenishAckRequest(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 83;
        Camera2StreamConfigurationMap = i % 128;
        this.getHighSpeedVideoSizesFor = str;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.visa.cbp.sdk.facade.data.TvlEntry
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("亠\uec58\u197e仔蘏쵥䉥粨\ue62e＋摋ꖔ\u1f5a垀", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.getOutputFormats);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("餜싋삂餼ꢏᓒ\ua7e7餻㆕톾붷䀼좨祒\ue6df㟿掆\ua633", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(getTimeStamp());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("밳塒♰밓㈖\uf220鼹ꇤᒽ䬺孒磔\ued97\ue3c3#༥䛲㳨\ue90cꘔ´喟凭絳\uf036\ueeb8ښᐑ", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(getUnpredictableNumber());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("铛䅂郂铻⬆䒒\u1aae⑧㱏刹\ueda8ﴆ", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(getAtc());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("띵ꈥ欀띕졡뽐≝ᲁῧ녜ᘾ얦\ue6d4ᦾ䵄뉜䶺욓ꑄ᭬ᒅ꿸\u1cca쁕", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append(getTransactionType());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("돓ɽᐗ돳根쁇⧗\u171cᭁᄜ椷츫\ue27c맢㉕맞䤞暟\udb27", android.text.TextUtils.getCapsMode("", 0, 0), objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        sb.append(getCryptogram());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("뫨ౄ\u19cb뫈昀춛㷋̂ቸἵ撡\uda63", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr7);
        sb.append(((java.lang.String) objArr7[0]).intern());
        sb.append(this.getHighSpeedVideoSizesFor);
        java.lang.String obj = sb.toString();
        int i = Camera2StreamConfigurationMap + 33;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        int i2 = getHighSpeedVideoFpsRanges + 73;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 2;
        }
        com.visa.cbp.getSignature getsignature = new com.visa.cbp.getSignature();
        char[] valueOf = com.visa.cbp.getSignature.valueOf(getHighSpeedVideoFpsRangesFor ^ 525091148651277305L, charArray, i);
        getsignature.valueOf = 4;
        while (getsignature.valueOf < valueOf.length) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            getsignature.ConfirmReplenishRequest = getsignature.valueOf - 4;
            int i4 = getsignature.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(valueOf[getsignature.valueOf] ^ valueOf[getsignature.valueOf % 4]), java.lang.Long.valueOf(getsignature.ConfirmReplenishRequest), java.lang.Long.valueOf(getHighSpeedVideoFpsRangesFor)};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-330680783);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.view.View.MeasureSpec.getMode(0) + 1467, android.view.KeyEvent.keyCodeFromString("") + 20);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-330680783, obj);
                }
                valueOf[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                try {
                    java.lang.Object[] objArr4 = {getsignature, getsignature};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(81232025);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.KeyEvent.normalizeMetaState(0) + 49745), 124 - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) 1, objArr5);
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
        objArr[0] = new java.lang.String(valueOf, 4, valueOf.length - 4);
    }

    static void getHighSpeedVideoSizes() {
        $$d = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.SI, -9, com.google.common.base.Ascii.RS};
        $$e = 57;
    }

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = 0;
        getHighResolutionOutputSizeshNQ4ISI = 1;
        Camera2StreamConfigurationMap = 0;
        getHighSpeedVideoSizes = 1;
        getHighSpeedVideoFpsRangesFor = 7600260690747310529L;
    }
}
