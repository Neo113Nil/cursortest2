package util.h.xy.cw;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final byte[] getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static final byte[] getOutputFormats;
    private static long getOutputMinFrameDuration;
    private static int getOutputSizeshNQ4ISI;
    private final android.content.Context getOutputSizes;
    private final java.lang.String getOutputStallDurationlomOqCM;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI();
        getInputSizeshNQ4ISI = util.h.xy.cw.d.Camera2StreamConfigurationMap;
        getOutputFormats = util.h.xy.cw.d.getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = util.h.xy.cw.d.getHighSpeedVideoFpsRanges;
        getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 27) % 128;
    }

    ma(java.lang.String str) throws util.h.xy.da.b {
        if (str == null || str.length() == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("￦\n\u0015\t\u0006\u0013\uffc1\u0010\u000f\u0006\uffc1\u0010\u0007\uffc1\u001a\u0010\u0016\u0013\uffc1\u0011\u0002\u0013\u0002\u000e\u0006\u0015\u0006\u0013\u0014\uffc1\n\u0014\uffc1\u0006\u000e\u0011\u0015\u001a\uffc1\u0010\u0013\uffc1\u000f\u0016\r\r", android.view.View.combineMeasuredStates(0, 0) + 46, 46 - android.text.TextUtils.getCapsMode("", 0, 0), android.graphics.Color.green(0) + 110, false, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10308);
        }
        this.getOutputSizes = util.h.xy.da.mc.m26262().m26264();
        this.getOutputStallDurationlomOqCM = str;
    }

    private static char[] Camera2StreamConfigurationMap() {
        getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 13) % 128;
        byte[] m26117 = util.h.xy.cy.ma.m26117(getInputSizeshNQ4ISI, getInputFormats);
        char[] m26118 = util.h.xy.cy.ma.m26118(m26117);
        util.h.xy.cy.ma.m26113(m26117);
        getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 125) % 128;
        return m26118;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getOutputMinFrameDuration ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static java.security.KeyStore getHighSpeedVideoFpsRanges(java.io.FileInputStream fileInputStream) throws util.h.xy.da.b {
        getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 33) % 128;
        try {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufff8\t\u0001", 3 - android.text.TextUtils.indexOf("", "", 0, 0), 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 89, true, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 113) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("Ÿ姎\u09de\uf0b2∛ᗲԹ晰ⅹ\udcb6쬛", (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), 1943817877 - android.widget.ExpandableListView.getPackedPositionType(0L), "镍\udc4e\udd73菳", "\u0000\u0000\u0000\u0000", objArr3);
                    java.security.KeyStore keyStore = (java.security.KeyStore) cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, intern);
                    char[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
                    getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 93) % 128;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) android.view.View.combineMeasuredStates(0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0), "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("᷎櫆灃ᐃ", (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 40788), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "鼱傰啐殟", "\u0000\u0000\u0000\u0000", objArr5);
                        cls2.getMethod((java.lang.String) objArr5[0], java.io.InputStream.class, char[].class).invoke(keyStore, fileInputStream, Camera2StreamConfigurationMap2);
                        util.h.xy.cy.ma.m26114(Camera2StreamConfigurationMap2);
                        return keyStore;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u000f\b\u0007ￒ\n\u0011\f\u0017\u0004\b\u0015\u0006ￒ\n\u0011\f\u0007\u0004\b\u0015ￃ\u0011\u0012ￃ\u0015\u0012\u0015\u0015￨\u0007\u0004\b\u0015ￃ\u0015\u0012ￃ\u0007\b\u0017\u0004\b\u0015\u0006ￃ\b\u0005ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u000f\f￩ￃￄ\b\u0015\u0012\u0017\u0016\u001c\b\u000eￃ\b\u000b\u0017ￃ\n\u0011\f\u0017\b", 79 - android.view.Gravity.getAbsoluteGravity(0, 0), 29 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.getOffsetAfter("", 0) + 108, true, objArr6);
                throw new util.h.xy.da.b(((java.lang.String) objArr6[0]).intern(), 10601);
            }
        } catch (java.lang.Throwable th3) {
            util.h.xy.cy.ma.m26114(null);
            throw th3;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 81) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoFpsRangesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 99) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 103) % 128;
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m26086(java.lang.String str) throws util.h.xy.da.b {
        if (str == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("￦\n\u0015\t\u0006\u0013\uffc1\u0010\u000f\u0006\uffc1\u0010\u0007\uffc1\u001a\u0010\u0016\u0013\uffc1\u0011\u0002\u0013\u0002\u000e\u0006\u0015\u0006\u0013\u0014\uffc1\n\u0014\uffc1\u0006\u000e\u0011\u0015\u001a\uffc1\u0010\u0013\uffc1\u000f\u0016\r\r", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 46, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 45, 110 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), false, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10309);
        }
        try {
            java.io.FileInputStream openFileInput = this.getOutputSizes.openFileInput(this.getOutputStallDurationlomOqCM);
            try {
                java.security.KeyStore highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(openFileInput);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.resolveSize(0, 0), "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("倽䍪쩾浲槶鎥崧橂䔐బ\udc19蜟∵", (char) (61963 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.View.resolveSize(0, 0) - 308513404, "萜鱵೭\ue5f2", "\u0000\u0000\u0000\u0000", objArr3);
                    boolean booleanValue = ((java.lang.Boolean) cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(highSpeedVideoFpsRanges, str)).booleanValue();
                    if (openFileInput != null) {
                        getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 57) % 128;
                        openFileInput.close();
                        getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 103) % 128;
                    }
                    return booleanValue;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } finally {
            }
        } catch (java.lang.Exception unused) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000f\b\u0007ￒ\n\u0011\f\u0017\u0004\b\u0015\u0006ￒ\n\u0011\f\u0007\u0004\b\u0015ￃ\u0011\u0012ￃ\u0015\u0012\u0015\u0015￨\u0007\u0004\b\u0015ￃ\u0015\u0012ￃ\u0007\b\u0017\u0004\b\u0015\u0006ￃ\b\u0005ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u000f\f￩ￃￄ\b\u0015\u0012\u0017\u0016\u001c\b\u000eￃ\b\u000b\u0017ￃ\n\u0011\f\u0017\b", 79 - android.view.View.combineMeasuredStates(0, 0), 29 - android.graphics.Color.red(0), 108 - android.text.TextUtils.indexOf("", "", 0, 0), true, objArr4);
            throw new util.h.xy.da.b(((java.lang.String) objArr4[0]).intern(), 10602);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26084(java.lang.String str) throws util.h.xy.da.b {
        char[] cArr;
        char[] cArr2 = null;
        try {
            try {
                if (!m26086(str)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\r\u0002\uffc1\u001a\u0006￬\u0015\u0014\n\u0019\u0006\uffc1\u0015\u0010\u000f\uffc1\u0014\u0002\n", 19 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 6 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 110 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr);
                    throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
                }
                try {
                    try {
                        java.io.FileInputStream openFileInput = this.getOutputSizes.openFileInput(this.getOutputStallDurationlomOqCM);
                        try {
                            java.security.KeyStore highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(openFileInput);
                            byte[] m26117 = util.h.xy.cy.ma.m26117(getInputSizeshNQ4ISI, getOutputFormats);
                            cArr2 = util.h.xy.cy.ma.m26118(m26117);
                            util.h.xy.cy.ma.m26113(m26117);
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr2);
                                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("\ue90a\uf343▖뿋욁醅", (char) (32327 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "㬔ಘ䝣\ue37e", "\u0000\u0000\u0000\u0000", objArr3);
                                byte[] encoded = ((javax.crypto.spec.SecretKeySpec) cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class, char[].class).invoke(highSpeedVideoFpsRanges, str, cArr2)).getEncoded();
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                util.h.xy.cy.ma.m26114(cArr2);
                                return encoded;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            cArr = cArr2;
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                if (openFileInput == null) {
                                    throw th3;
                                }
                                try {
                                    openFileInput.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    try {
                                        th2.addSuppressed(th4);
                                        throw th3;
                                    } catch (java.lang.Exception unused) {
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("\u000f\b\u0007ￒ\n\u0011\f\u0017\u0004\b\u0015\u0006ￒ\n\u0011\f\u0007\u0004\b\u0015ￃ\u0011\u0012ￃ\u0015\u0012\u0015\u0015￨\u0007\u0004\b\u0015ￃ\u0015\u0012ￃ\u0007\b\u0017\u0004\b\u0015\u0006ￃ\b\u0005ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u000f\f￩ￃￄ\b\u0015\u0012\u0017\u0016\u001c\b\u000eￃ\b\u000b\u0017ￃ\n\u0011\f\u0017\b", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 79, 29 - android.view.Gravity.getAbsoluteGravity(0, 0), 109 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, objArr4);
                                        throw new util.h.xy.da.b(((java.lang.String) objArr4[0]).intern(), 10605);
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        util.h.xy.cy.ma.m26114(cArr);
                                        throw th;
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        cArr = null;
                    }
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Throwable th7) {
                java.lang.Throwable cause2 = th7.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th7;
            }
        } catch (java.lang.Exception unused3) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000f\b\u0007ￒ\n\u0011\f\u0017\u0004\b\u0015\u0006ￒ\n\u0011\f\u0007\u0004\b\u0015ￃ\u0011\u0012ￃ\u0015\u0012\u0015\u0015￨\u0007\u0004\b\u0015ￃ\u0015\u0012ￃ\u0007\b\u0017\u0004\b\u0015\u0006ￃ\b\u0005ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u000f\f￩ￃￄ\b\u0015\u0012\u0017\u0016\u001c\b\u000eￃ\b\u000b\u0017ￃ\n\u0011\f\u0017\b", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 80, 29 - android.text.TextUtils.getCapsMode("", 0, 0), android.view.View.MeasureSpec.getSize(0) + 108, true, objArr5);
            throw new util.h.xy.da.b(((java.lang.String) objArr5[0]).intern(), 10604);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26083(java.lang.String str, byte[] bArr) throws util.h.xy.da.b {
        getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 55) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufff8\t\u0001", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 88 - android.graphics.ImageFormat.getBitsPerPixel(0), true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 119) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("Ÿ姎\u09de\uf0b2∛ᗲԹ晰ⅹ\udcb6쬛", (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1943817877 - android.text.TextUtils.indexOf("", "", 0), "镍\udc4e\udd73菳", "\u0000\u0000\u0000\u0000", objArr3);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, intern);
                char[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
                getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 15) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.KeyEvent.normalizeMetaState(0), "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("᷎櫆灃ᐃ", (char) (40789 - android.view.View.MeasureSpec.getMode(0)), android.view.View.combineMeasuredStates(0, 0), "鼱傰啐殟", "\u0000\u0000\u0000\u0000", objArr5);
                    cls2.getMethod((java.lang.String) objArr5[0], java.io.InputStream.class, char[].class).invoke(invoke, null, Camera2StreamConfigurationMap2);
                    if (str != null) {
                        int i = getHighSpeedVideoSizesFor + 69;
                        getOutputSizeshNQ4ISI = i % 128;
                        if (i % 2 != 0) {
                            util.h.xy.cy.ma.m26119(bArr);
                            throw new java.lang.ArithmeticException();
                        }
                        if (!util.h.xy.cy.ma.m26119(bArr)) {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("�\ufff9\u000b", android.view.MotionEvent.axisFromString("") + 4, 2 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 87 - android.view.View.combineMeasuredStates(0, 0), true, objArr6);
                            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, ((java.lang.String) objArr6[0]).intern());
                            getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 119) % 128;
                            try {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("쎕龎峩추宏硈쯀Ꟁ曮\u0dfa玒㾪⛏\u0b0d\u0ef8פּ襤࠷璼ቬ뢕垴杠ۏ\udf7f旬ȐᏙ㊇睃˸料\uf6cc륃ئ\uf481Ꞁ", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 399606170, "晟\u2e7e\udbe8ሹ", "\u0000\u0000\u0000\u0000", objArr7);
                                java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(javax.crypto.SecretKey.class).newInstance(secretKeySpec);
                                byte[] m26117 = util.h.xy.cy.ma.m26117(getInputSizeshNQ4ISI, getOutputFormats);
                                char[] m26118 = util.h.xy.cy.ma.m26118(m26117);
                                util.h.xy.cy.ma.m26113(m26117);
                                java.security.KeyStore.PasswordProtection passwordProtection = new java.security.KeyStore.PasswordProtection(m26118);
                                util.h.xy.cy.ma.m26114(m26118);
                                int i2 = getOutputSizeshNQ4ISI;
                                int i3 = i2 + 109;
                                getHighSpeedVideoSizesFor = i3 % 128;
                                if (i3 % 2 == 0) {
                                    throw null;
                                }
                                getHighSpeedVideoSizesFor = (i2 + 103) % 128;
                                try {
                                    java.lang.Object[] objArr8 = {str, newInstance, passwordProtection};
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr9);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("\uec19补㫦⎈ꛍ섑讅菪", (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, "꼾ȝ绲쎚", "\u0000\u0000\u0000\u0000", objArr10);
                                    cls3.getMethod((java.lang.String) objArr10[0], java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, objArr8);
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
                    }
                    getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 21) % 128;
                    try {
                        try {
                            java.io.FileOutputStream openFileOutput = this.getOutputSizes.openFileOutput(this.getOutputStallDurationlomOqCM, 0);
                            getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 17) % 128;
                            try {
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("\u196fПꇀ좊睑ꙇ룞\ud9af佚\uf2f3㡩金鑙\u0e00ꅌꔔ\uab19䥸\u41551纡\ueacb", (char) android.text.TextUtils.indexOf("", ""), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, "䙍㆗裏ᡮ", "\u0000\u0000\u0000\u0000", objArr11);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("娎ᐆⱠ\uee07獏", (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 48323), (-1316087623) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "렉踘슱뺼", "\u0000\u0000\u0000\u0000", objArr12);
                                cls4.getMethod((java.lang.String) objArr12[0], java.io.OutputStream.class, char[].class).invoke(invoke, openFileOutput, Camera2StreamConfigurationMap2);
                                if (openFileOutput != null) {
                                    openFileOutput.close();
                                }
                                util.h.xy.cy.ma.m26114(Camera2StreamConfigurationMap2);
                            } catch (java.lang.Throwable th3) {
                                try {
                                    java.lang.Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                } catch (java.lang.Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (java.lang.Throwable th5) {
                                        if (openFileOutput == null) {
                                            throw th5;
                                        }
                                        try {
                                            openFileOutput.close();
                                            getOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 17) % 128;
                                            throw th5;
                                        } catch (java.lang.Throwable th6) {
                                            th4.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Exception unused) {
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\u000f\b\u0007ￒ\n\u0011\f\u0017\u0004\b\u0015\u0006ￒ\n\u0011\f\u0007\u0004\b\u0015ￃ\u0011\u0012ￃ\u0015\u0012\u0015\u0015￨\u0007\u0004\b\u0015ￃ\u0015\u0012ￃ\u0007\b\u0017\u0004\b\u0015\u0006ￃ\b\u0005ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u000f\f￩ￃￄ\b\u0015\u0012\u0017\u0016\u001c\b\u000eￃ\b\u000b\u0017ￃ\n\u0011\f\u0017\b", 79 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 29 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 108 - android.graphics.Color.green(0), true, objArr13);
                            throw new util.h.xy.da.b(((java.lang.String) objArr13[0]).intern(), 10602);
                        }
                    } catch (java.lang.Throwable th7) {
                        util.h.xy.cy.ma.m26114(Camera2StreamConfigurationMap2);
                        throw th7;
                    }
                } catch (java.lang.Throwable th8) {
                    java.lang.Throwable cause4 = th8.getCause();
                    if (cause4 == null) {
                        throw th8;
                    }
                    throw cause4;
                }
            } catch (java.lang.Throwable th9) {
                java.lang.Throwable cause5 = th9.getCause();
                if (cause5 == null) {
                    throw th9;
                }
                throw cause5;
            }
        } catch (java.lang.Exception unused2) {
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000f\b\u0007ￒ\n\u0011\f\u0017\u0004\b\u0015\u0006ￒ\n\u0011\f\u0007\u0004\b\u0015ￃ\u0011\u0012ￃ\u0015\u0012\u0015\u0015￨\u0007\u0004\b\u0015ￃ\u0015\u0012ￃ\u0007\b\u0017\u0004\b\u0015\u0006ￃ\b\u0005ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u000f\f￩ￃￄ\b\u0015\u0012\u0017\u0016\u001c\b\u000eￃ\b\u000b\u0017ￃ\n\u0011\f\u0017\b", android.view.View.resolveSizeAndState(0, 0, 0) + 79, 29 - android.text.TextUtils.indexOf("", ""), android.view.KeyEvent.keyCodeFromString("") + 108, true, objArr14);
            throw new util.h.xy.da.b(((java.lang.String) objArr14[0]).intern(), 10606);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final boolean m26085() {
        getHighSpeedVideoSizesFor = (getOutputSizeshNQ4ISI + 47) % 128;
        boolean deleteFile = this.getOutputSizes.deleteFile(this.getOutputStallDurationlomOqCM);
        int i = getHighSpeedVideoSizesFor + 117;
        getOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return deleteFile;
        }
        throw null;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = 2457411417541981002L;
        Camera2StreamConfigurationMap = -563101119;
        getHighResolutionOutputSizeshNQ4ISI = (char) 13130;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor = -1231763815;
    }
}
