package util.h.xy.cs;

/* loaded from: classes5.dex */
final class ra implements util.h.xy.cs.b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int CoroutineDebuggingKt = 0;
    private static int accessartificialFrame = 0;
    private static int coroutineCreation = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static short[] getHighSpeedVideoFpsRanges = null;
    private static byte[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static long getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static char getOutputMinFrameDuration;
    private static final char[] getOutputMinFrameDurationlomOqCM;
    private static char getOutputSizes;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;
    private static final char[] getOutputStallDurationlomOqCM;
    private static char getValidOutputFormatsForInputhNQ4ISI;
    private static int isOutputSupportedFor;
    private static byte[] isOutputSupportedForhNQ4ISI;
    private static int toString;
    private static short[] unwrapAs;
    private final android.content.Context ArtificialStackFrames = util.h.xy.ci.ra.m25931().m25934();
    private char[] coroutineBoundary;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizes();
        getOutputSizeshNQ4ISI = util.h.xy.cs.b.class.getName();
        getOutputStallDurationlomOqCM = new char[]{4680, 13363, 22124, 30828, 39535};
        getOutputMinFrameDurationlomOqCM = new char[]{48247, 56943, 61554, 4641, 13412};
        getHighSpeedVideoSizes = (CoroutineDebuggingKt + 1) % 128;
    }

    ra() {
        this.coroutineBoundary = null;
        this.coroutineBoundary = Camera2StreamConfigurationMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x03f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // util.h.xy.cs.b
    /* renamed from: ˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo26024(java.lang.String str, byte[] bArr) throws util.h.xy.ct.mc, java.io.IOException {
        java.io.FileInputStream fileInputStream;
        java.lang.Object[] objArr;
        getHighSpeedVideoFpsRanges(true);
        java.io.OutputStream outputStream = null;
        if (mo26025(str)) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.text.TextUtils.getOffsetAfter("", 0) + 1075356568, (short) (36 - android.widget.ExpandableListView.getPackedPositionType(0L)), (byte) ((-121) - android.widget.ExpandableListView.getPackedPositionType(0L)), android.text.TextUtils.getTrimmedLength("") - 29, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 957270761, objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        try {
            try {
                objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1075356585, (short) (android.view.KeyEvent.getDeadChar(0, 0) + 41), (byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 109), android.view.View.MeasureSpec.getMode(0) - 44, android.graphics.Color.rgb(0, 0, 0) + 974047937, objArr);
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                if (outputStream == null) {
                    try {
                        outputStream.close();
                        throw th;
                    } catch (java.io.IOException unused2) {
                        throw th;
                    }
                }
                throw th;
            }
            try {
                java.lang.Object[] objArr3 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", (android.os.Process.myPid() >> 22) + 22, objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", android.graphics.Color.rgb(0, 0, 0) + 16777227, objArr5);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                android.content.Context context = this.ArtificialStackFrames;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 14, android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (24613 - android.view.MotionEvent.axisFromString("")), objArr6);
                fileInputStream = context.openFileInput(((java.lang.String) objArr6[0]).intern());
                try {
                    try {
                        java.lang.Object[] objArr7 = {fileInputStream, this.coroutineBoundary};
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - android.graphics.Color.blue(0), objArr8);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1907736216, (short) (49 - android.view.View.getDefaultSize(0, 0)), (byte) (83 - android.text.TextUtils.indexOf("", "", 0, 0)), (-5) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 1716535977, objArr9);
                        cls2.getMethod((java.lang.String) objArr9[0], java.io.InputStream.class, char[].class).invoke(invoke, objArr7);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1075356587, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17), (byte) ((-93) - android.text.TextUtils.indexOf("", "", 0)), android.graphics.Color.red(0) - 42, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 957270743, objArr10);
                        try {
                            java.lang.Object[] objArr11 = {((java.lang.String) objArr10[0]).intern()};
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢ﹽ닢饜堙ᤢ쐭\ue108钴轎֪鄟\uec21誺踊⋬⮎堘\udb8f윊\ue96b好荂㵊\ue291", 37 - android.text.TextUtils.indexOf("", ""), objArr12);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.FF, objArr13);
                            java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr13[0], java.lang.String.class).invoke(null, objArr11);
                            try {
                                java.lang.Object[] objArr14 = {new java.io.ByteArrayInputStream(bArr)};
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢ﹽ닢饜堙ᤢ쐭\ue108钴轎֪鄟\uec21誺踊⋬⮎堘\udb8f윊\ue96b好荂㵊\ue291", 37 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr15);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("Ⴋ\uf234⩪\u187a伵跡⋬⮎̼ﳭ饜堙\u20c5轑ᵈ殮✻\uf68f쇽\uf844", 19 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr16);
                                try {
                                    java.lang.Object[] objArr17 = {str, cls4.getMethod((java.lang.String) objArr16[0], java.io.InputStream.class).invoke(invoke2, objArr14)};
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", android.text.TextUtils.getOffsetAfter("", 0) + 22, objArr18);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI((-1907736213) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((-121) - android.view.View.resolveSizeAndState(0, 0, 0)), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1716535985, objArr19);
                                    java.lang.String str2 = (java.lang.String) objArr19[0];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI((-1907736196) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 113), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 75), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23, 1716535976 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr20);
                                    cls5.getMethod(str2, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr20[0])).invoke(invoke, objArr17);
                                    android.content.Context context2 = this.ArtificialStackFrames;
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, android.graphics.ImageFormat.getBitsPerPixel(0) + 1, (char) (android.graphics.Color.alpha(0) + 24614), objArr21);
                                    java.io.FileOutputStream openFileOutput = context2.openFileOutput(((java.lang.String) objArr21[0]).intern(), 0);
                                    try {
                                        try {
                                            java.lang.Object[] objArr22 = {openFileOutput, this.coroutineBoundary};
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", android.view.View.getDefaultSize(0, 0) + 22, objArr23);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI((-1924513382) - android.graphics.Color.rgb(0, 0, 0), (short) ((-34) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37), android.widget.ExpandableListView.getPackedPositionChild(0L) - 2, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1716535983, objArr24);
                                            cls6.getMethod((java.lang.String) objArr24[0], java.io.OutputStream.class, char[].class).invoke(invoke, objArr22);
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (java.io.IOException unused3) {
                                                }
                                            }
                                            if (openFileOutput != null) {
                                                try {
                                                    openFileOutput.close();
                                                } catch (java.io.IOException unused4) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            java.lang.Throwable cause2 = th3.getCause();
                                            if (cause2 == null) {
                                                throw th3;
                                            }
                                            throw cause2;
                                        }
                                    } catch (java.security.KeyStoreException unused5) {
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 61 - android.view.View.resolveSize(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 63258), objArr25);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr25[0]).intern());
                                    } catch (java.security.NoSuchAlgorithmException unused6) {
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr26);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr26[0]).intern());
                                    } catch (java.security.cert.CertificateException unused7) {
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, (char) (android.view.View.MeasureSpec.getMode(0) + 47244), objArr27);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr27[0]).intern());
                                    }
                                } catch (java.lang.Throwable th4) {
                                    java.lang.Throwable cause3 = th4.getCause();
                                    if (cause3 == null) {
                                        throw th4;
                                    }
                                    throw cause3;
                                }
                            } catch (java.lang.Throwable th5) {
                                java.lang.Throwable cause4 = th5.getCause();
                                if (cause4 == null) {
                                    throw th5;
                                }
                                throw cause4;
                            }
                        } catch (java.lang.Throwable th6) {
                            java.lang.Throwable cause5 = th6.getCause();
                            if (cause5 == null) {
                                throw th6;
                            }
                            throw cause5;
                        }
                    } catch (java.lang.Throwable th7) {
                        java.lang.Throwable cause6 = th7.getCause();
                        if (cause6 == null) {
                            throw th7;
                        }
                        throw cause6;
                    }
                } catch (java.security.KeyStoreException unused8) {
                    java.lang.Object[] objArr252 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 61 - android.view.View.resolveSize(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 63258), objArr252);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr252[0]).intern());
                } catch (java.security.NoSuchAlgorithmException unused9) {
                    java.lang.Object[] objArr262 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr262);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr262[0]).intern());
                } catch (java.security.cert.CertificateException unused10) {
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, (char) (android.view.View.MeasureSpec.getMode(0) + 47244), objArr272);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr272[0]).intern());
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    outputStream = null;
                    if (fileInputStream != null) {
                    }
                    if (outputStream == null) {
                    }
                }
            } catch (java.lang.Throwable th9) {
                java.lang.Throwable cause7 = th9.getCause();
                if (cause7 == null) {
                    throw th9;
                }
                throw cause7;
            }
        } catch (java.security.KeyStoreException unused11) {
        } catch (java.security.NoSuchAlgorithmException unused12) {
        } catch (java.security.cert.CertificateException unused13) {
        } catch (java.lang.Throwable th10) {
            th = th10;
            fileInputStream = null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 33;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getOutputSizes ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getValidOutputFormatsForInputhNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (accessartificialFrame ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = isOutputSupportedForhNQ4ISI;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (isOutputSupportedForhNQ4ISI[((int) (getOutputStallDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (accessartificialFrame ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (unwrapAs[((int) (getOutputStallDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (accessartificialFrame ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (toString ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = isOutputSupportedForhNQ4ISI;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = isOutputSupportedForhNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = unwrapAs;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getInputFormats ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 67;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i4 = bArr2 != null ? (byte) (((byte) (getHighSpeedVideoFpsRangesFor[((int) (coroutineCreation ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoFpsRanges[((int) (coroutineCreation ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (coroutineCreation ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (isOutputSupportedFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getHighSpeedVideoFpsRangesFor;
            if (bArr4 != null) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 25;
                Camera2StreamConfigurationMap = i8 % 128;
                if (i8 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i9 = 0; i9 < length; i9++) {
                    bArr[i9] = (byte) (bArr4[i9] ^ (-2689713159175858216L));
                }
                bArr4 = bArr;
            }
            boolean z = bArr4 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getHighSpeedVideoFpsRangesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoFpsRanges;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f1 A[Catch: KeyStoreException -> 0x03f3, IOException -> 0x03f6, CertificateException -> 0x03f9, NoSuchAlgorithmException -> 0x03fc, FileNotFoundException -> 0x03ff, UnrecoverableEntryException -> 0x041b, all -> 0x0498, TryCatch #43 {all -> 0x0498, blocks: (B:38:0x018e, B:40:0x0194, B:45:0x01d4, B:52:0x020e, B:54:0x0214, B:56:0x0215, B:60:0x0217, B:62:0x021d, B:63:0x021e, B:157:0x04ee, B:161:0x051b, B:162:0x054d, B:165:0x054f, B:167:0x0555, B:168:0x0556, B:188:0x041b, B:195:0x045d, B:196:0x0485, B:199:0x0487, B:201:0x048d, B:202:0x048e, B:205:0x0490, B:207:0x0496, B:208:0x0497, B:133:0x03d4, B:135:0x03da, B:136:0x03db, B:140:0x03eb, B:142:0x03f1, B:143:0x03f2, B:193:0x0448, B:159:0x04f4, B:191:0x0433), top: B:18:0x00af, inners: #26, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f2 A[Catch: KeyStoreException -> 0x03f3, IOException -> 0x03f6, CertificateException -> 0x03f9, NoSuchAlgorithmException -> 0x03fc, FileNotFoundException -> 0x03ff, UnrecoverableEntryException -> 0x041b, all -> 0x0498, TRY_LEAVE, TryCatch #43 {all -> 0x0498, blocks: (B:38:0x018e, B:40:0x0194, B:45:0x01d4, B:52:0x020e, B:54:0x0214, B:56:0x0215, B:60:0x0217, B:62:0x021d, B:63:0x021e, B:157:0x04ee, B:161:0x051b, B:162:0x054d, B:165:0x054f, B:167:0x0555, B:168:0x0556, B:188:0x041b, B:195:0x045d, B:196:0x0485, B:199:0x0487, B:201:0x048d, B:202:0x048e, B:205:0x0490, B:207:0x0496, B:208:0x0497, B:133:0x03d4, B:135:0x03da, B:136:0x03db, B:140:0x03eb, B:142:0x03f1, B:143:0x03f2, B:193:0x0448, B:159:0x04f4, B:191:0x0433), top: B:18:0x00af, inners: #26, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v15, types: [int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r3v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.io.FileOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Class] */
    @Override // util.h.xy.cs.b
    /* renamed from: ᐝ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo26027(char[] cArr, char[] cArr2) throws util.h.xy.ct.mc {
        java.lang.String str;
        java.lang.Integer num;
        char[] cArr3;
        java.io.InputStream inputStream;
        java.lang.Object obj;
        java.lang.String str2;
        int i;
        java.lang.Integer num2;
        java.lang.String str3;
        java.lang.Integer num3;
        android.content.Context context;
        java.lang.Throwable cause;
        ?? hasMoreElements;
        ?? r6 = 1;
        r6 = 1;
        r6 = 1;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        java.lang.String str4 = (java.lang.String) objArr[0];
        char[] Camera2StreamConfigurationMap2 = (cArr2 == null || cArr2.length == 0) ? Camera2StreamConfigurationMap() : (char[]) cArr2.clone();
        java.io.InputStream inputStream2 = null;
        try {
            float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            short windowTouchSlop = (short) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 41);
            byte maximumFlingVelocity = (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 109);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            int pressedStateDuration = (-44) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            ?? r18 = (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 1075356585;
            getHighSpeedVideoSizes(r18, windowTouchSlop, maximumFlingVelocity, pressedStateDuration, 957270721 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            try {
                java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                java.lang.Class<?> cls = java.lang.Class.forName(str4);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", 11 - android.view.KeyEvent.keyCodeFromString(""), objArr4);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr3);
                if (cArr == null) {
                    cArr3 = this.coroutineBoundary;
                    if (cArr3 == null) {
                        cArr3 = Camera2StreamConfigurationMap2;
                    }
                } else {
                    cArr3 = cArr;
                }
                getHighSpeedVideoFpsRanges(false);
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                try {
                    try {
                        try {
                            context = this.ArtificialStackFrames;
                            try {
                            } catch (java.security.cert.CertificateException unused) {
                                obj = "getThreadPriority";
                                str2 = "android.os.Process";
                                num2 = 0;
                                i = 0;
                            }
                        } catch (java.security.cert.CertificateException unused2) {
                            obj = "getThreadPriority";
                            str2 = "android.os.Process";
                            i = 0;
                            num2 = 0;
                        }
                        try {
                            try {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24613), objArr5);
                                java.io.FileInputStream openFileInput = context.openFileInput(((java.lang.String) objArr5[0]).intern());
                                try {
                                    java.lang.Object[] objArr6 = {openFileInput, cArr3};
                                    java.lang.Class<?> cls2 = java.lang.Class.forName(str4);
                                    try {
                                        try {
                                            try {
                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI((-1907736215) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (android.graphics.Color.alpha(0) + 49), (byte) (83 - android.view.View.resolveSizeAndState(0, 0, 0)), android.text.TextUtils.getOffsetBefore("", 0) - 4, 1716535977 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr7);
                                                cls2.getMethod((java.lang.String) objArr7[0], java.io.InputStream.class, char[].class).invoke(invoke, objArr6);
                                                try {
                                                    java.lang.Class<?> cls3 = java.lang.Class.forName(str4);
                                                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    short scrollBarSize = (short) (18 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                    byte packedPositionChild = (byte) (57 - android.widget.ExpandableListView.getPackedPositionChild(0L));
                                                    float length = android.graphics.PointF.length(0.0f, 0.0f);
                                                    ?? scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI(makeMeasureSpec - 1907736162, scrollBarSize, packedPositionChild, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) - 1, (scrollBarFadeDuration >> 16) + 1716535966, objArr8);
                                                    java.util.Enumeration enumeration = (java.util.Enumeration) cls3.getMethod((java.lang.String) objArr8[0], null).invoke(invoke, null);
                                                    while (true) {
                                                        hasMoreElements = enumeration.hasMoreElements();
                                                        if (hasMoreElements == 0) {
                                                            break;
                                                        }
                                                        java.lang.String str5 = (java.lang.String) enumeration.nextElement();
                                                        try {
                                                            java.lang.Object[] objArr9 = {str5, new java.security.KeyStore.PasswordProtection(cArr3)};
                                                            ?? cls4 = java.lang.Class.forName(str4);
                                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                            Camera2StreamConfigurationMap("Ⴋ\uf234ꈡ肴屧⪐Ԑ톶", 9 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr10);
                                                            java.lang.String str6 = (java.lang.String) objArr10[0];
                                                            scrollBarFadeDuration = new java.lang.Class[]{java.lang.String.class, java.security.KeyStore.ProtectionParameter.class};
                                                            java.lang.Object invoke2 = cls4.getMethod(str6, scrollBarFadeDuration).invoke(invoke, objArr9);
                                                            if (cArr3 != Camera2StreamConfigurationMap2) {
                                                                try {
                                                                    java.lang.Object[] objArr11 = {str5, invoke2, new java.security.KeyStore.PasswordProtection(cArr2)};
                                                                    java.lang.Class<?> cls5 = java.lang.Class.forName(str4);
                                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                                    Camera2StreamConfigurationMap("垞礁ꈡ肴屧⪐Ԑ톶", 8 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr12);
                                                                    cls5.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, objArr11);
                                                                } catch (java.lang.Throwable th2) {
                                                                    java.lang.Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th3) {
                                                            java.lang.Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    }
                                                    if (openFileInput != null) {
                                                        try {
                                                            openFileInput.close();
                                                        } catch (java.io.IOException unused3) {
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (cArr3 != Camera2StreamConfigurationMap2) {
                                                                try {
                                                                    android.content.Context context2 = this.ArtificialStackFrames;
                                                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRanges(13 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) (24614 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr13);
                                                                    hasMoreElements = context2.openFileOutput(((java.lang.String) objArr13[0]).intern(), 0);
                                                                    try {
                                                                        java.lang.Class<?> cls6 = java.lang.Class.forName(str4);
                                                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                                        getHighResolutionOutputSizeshNQ4ISI(((android.os.Process.getThreadPriority(0) + 20) >> 6) - 1907736166, (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 34), (byte) (37 - android.graphics.Color.alpha(0)), android.view.KeyEvent.keyCodeFromString("") - 3, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1716535984, objArr14);
                                                                        cls6.getMethod((java.lang.String) objArr14[0], java.io.OutputStream.class, char[].class).invoke(invoke, hasMoreElements, Camera2StreamConfigurationMap2);
                                                                        if (hasMoreElements != 0) {
                                                                            try {
                                                                                hasMoreElements.close();
                                                                            } catch (java.io.IOException unused4) {
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th4) {
                                                                        try {
                                                                            java.lang.Throwable cause4 = th4.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th4;
                                                                        } catch (java.io.IOException unused5) {
                                                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRanges(android.view.KeyEvent.normalizeMetaState(0) + 65, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 89, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr15);
                                                                            throw new util.h.xy.ct.mc(((java.lang.String) objArr15[0]).intern());
                                                                        } catch (java.security.KeyStoreException unused6) {
                                                                            try {
                                                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                                                getHighSpeedVideoSizes((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1075356677, (short) (android.text.TextUtils.getOffsetBefore("", 0) + 73), (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) - 75), 4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 51958 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr16);
                                                                                throw new util.h.xy.ct.mc(((java.lang.String) objArr16[0]).intern());
                                                                            } catch (java.lang.Throwable th5) {
                                                                                java.lang.Throwable cause5 = th5.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th5;
                                                                            }
                                                                        } catch (java.security.NoSuchAlgorithmException unused7) {
                                                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRanges(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 30, 13 - android.graphics.Color.green(0), (char) android.graphics.Color.blue(0), objArr17);
                                                                            throw new util.h.xy.ct.mc(((java.lang.String) objArr17[0]).intern());
                                                                        } catch (java.security.cert.CertificateException unused8) {
                                                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                                            getHighSpeedVideoSizes(1075356660 + (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (short) (android.view.View.getDefaultSize(0, 0) - 2), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 18), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 28, 957270722 - android.graphics.Color.red(0), objArr18);
                                                                            throw new util.h.xy.ct.mc(((java.lang.String) objArr18[0]).intern());
                                                                        }
                                                                    }
                                                                } catch (java.io.IOException unused9) {
                                                                } catch (java.security.KeyStoreException unused10) {
                                                                    hasMoreElements = 0;
                                                                } catch (java.security.NoSuchAlgorithmException unused11) {
                                                                } catch (java.security.cert.CertificateException unused12) {
                                                                } catch (java.lang.Throwable th6) {
                                                                    th = th6;
                                                                    scrollBarFadeDuration = 0;
                                                                    if (scrollBarFadeDuration != 0) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            char[] cArr4 = this.coroutineBoundary;
                                                            if (cArr4 != null) {
                                                                util.h.xy.cv.ra.m26067(cArr4);
                                                            }
                                                            this.coroutineBoundary = Camera2StreamConfigurationMap2;
                                                            return true;
                                                        } catch (java.lang.Throwable th7) {
                                                            th = th7;
                                                            scrollBarFadeDuration = hasMoreElements;
                                                            if (scrollBarFadeDuration != 0) {
                                                                try {
                                                                    scrollBarFadeDuration.close();
                                                                } catch (java.io.IOException unused13) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        th = th8;
                                                    }
                                                } catch (java.lang.Throwable th9) {
                                                    java.lang.Throwable cause6 = th9.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th9;
                                                }
                                            } catch (java.lang.Throwable th10) {
                                                th = th10;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th11) {
                                            th = th11;
                                        }
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                        cause = th.getCause();
                                        if (cause == null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                }
                            } catch (java.security.cert.CertificateException unused14) {
                                obj = "getThreadPriority";
                                str2 = "android.os.Process";
                                num2 = 0;
                                i = 0;
                                r6 = 0;
                                num3 = num2;
                                str3 = obj;
                                int indexOf = android.text.TextUtils.indexOf("", "", i);
                                try {
                                    java.lang.Class<?> cls7 = java.lang.Class.forName(str2);
                                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                    clsArr[i] = java.lang.Integer.TYPE;
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(1075356660 + indexOf, (short) ((-2) - ((((java.lang.Integer) cls7.getMethod(str3, clsArr).invoke(null, num3)).intValue() + 20) >> 6)), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 19), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 28, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 957270721, objArr19);
                                    throw new util.h.xy.ct.mc(((java.lang.String) objArr19[0]).intern());
                                } catch (java.lang.Throwable th14) {
                                    java.lang.Throwable cause7 = th14.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th14;
                                }
                            }
                        } catch (java.io.FileNotFoundException unused15) {
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1075356621, (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 59), (byte) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 106), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 6, 957270740 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr20);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr20[0]).intern());
                        } catch (java.io.IOException unused16) {
                            inputStream = 1;
                            if (inputStream == null) {
                                return false;
                            }
                            try {
                                inputStream.close();
                                return false;
                            } catch (java.io.IOException unused17) {
                                return false;
                            }
                        } catch (java.security.KeyStoreException unused18) {
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(1075356677 - android.text.TextUtils.getTrimmedLength(""), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 74), (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 75), 4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.MotionEvent.axisFromString("") + 957270727, objArr21);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr21[0]).intern());
                        } catch (java.security.NoSuchAlgorithmException unused19) {
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 13 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.view.View.resolveSize(0, 0), objArr22);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr22[0]).intern());
                        } catch (java.security.UnrecoverableEntryException unused20) {
                            try {
                                try {
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1075356727, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62), (byte) ((-123) - android.graphics.Color.red(0)), (-15) - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 957270741 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr23);
                                    throw new util.h.xy.ct.mc(((java.lang.String) objArr23[0]).intern());
                                } catch (java.lang.Throwable th15) {
                                    java.lang.Throwable cause8 = th15.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th15;
                                }
                            } catch (java.lang.Throwable th16) {
                                java.lang.Throwable cause9 = th16.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th16;
                            }
                        } catch (java.security.cert.CertificateException unused21) {
                            i = 0;
                            num3 = r18;
                            str3 = pressedStateDuration;
                            int indexOf2 = android.text.TextUtils.indexOf("", "", i);
                            java.lang.Class<?> cls72 = java.lang.Class.forName(str2);
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                            clsArr2[i] = java.lang.Integer.TYPE;
                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(1075356660 + indexOf2, (short) ((-2) - ((((java.lang.Integer) cls72.getMethod(str3, clsArr2).invoke(null, num3)).intValue() + 20) >> 6)), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 19), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 28, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 957270721, objArr192);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr192[0]).intern());
                        }
                    } catch (java.lang.Throwable th17) {
                        th = th17;
                        inputStream2 = r6;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.io.IOException unused22) {
                            }
                        }
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused23) {
                } catch (java.io.IOException unused24) {
                    inputStream = null;
                } catch (java.security.KeyStoreException unused25) {
                } catch (java.security.NoSuchAlgorithmException unused26) {
                } catch (java.security.UnrecoverableEntryException unused27) {
                    r6 = 0;
                } catch (java.lang.Throwable th18) {
                    th = th18;
                    inputStream2 = null;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th19) {
                str = "android.os.Process";
                num = 0;
                try {
                    java.lang.Throwable cause10 = th19.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th19;
                } catch (java.security.KeyStoreException unused28) {
                    try {
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(1075356591 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (android.view.KeyEvent.keyCodeFromString("") + 98), (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 32), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 17, 957270731 - ((((java.lang.Integer) java.lang.Class.forName(str).getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, num)).intValue() + 20) >> 6), objArr24);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr24[0]).intern());
                    } catch (java.lang.Throwable th20) {
                        java.lang.Throwable cause11 = th20.getCause();
                        if (cause11 != null) {
                            throw cause11;
                        }
                        throw th20;
                    }
                }
            }
        } catch (java.security.KeyStoreException unused29) {
            str = "android.os.Process";
            num = 0;
        }
    }

    @Override // util.h.xy.cs.b
    /* renamed from: ˋ */
    public final void mo26022() throws util.h.xy.ct.mc {
        try {
            if (getHighSpeedVideoFpsRanges()) {
                android.content.Context context = this.ArtificialStackFrames;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (24614 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr);
                if (!context.getFileStreamPath(((java.lang.String) objArr[0]).intern()).delete()) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(1075356757 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) ((-37) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 27), (-16777239) - android.graphics.Color.rgb(0, 0, 0), 957270724 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr2[0]).intern());
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            char[] cArr = this.coroutineBoundary;
            if (cArr != null) {
                util.h.xy.cv.ra.m26067(cArr);
            }
            this.coroutineBoundary = Camera2StreamConfigurationMap();
        } catch (java.io.IOException unused) {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(1075356780 - android.graphics.Color.green(0), (short) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) - 64), (byte) (android.text.TextUtils.indexOf("", "", 0, 0) - 66), (-13) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 957270722, objArr3);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr3[0]).intern());
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // util.h.xy.cs.b
    /* renamed from: ˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo26025(java.lang.String str) throws java.io.IOException, util.h.xy.ct.mc {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        if (str == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(1075356813 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (short) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 82), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 100), android.graphics.Color.rgb(0, 0, 0) + 16777196, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 957270730, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        getHighSpeedVideoFpsRanges(true);
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(1075356585 - android.view.Gravity.getAbsoluteGravity(0, 0), (short) (android.text.TextUtils.indexOf("", "") + 41), (byte) (109 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-43) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 957270721 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                try {
                    java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", android.view.KeyEvent.getDeadChar(0, 0) + 22, objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, objArr5);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                    android.content.Context context = this.ArtificialStackFrames;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(0) + 13, android.view.View.MeasureSpec.getMode(0), (char) (24614 - android.text.TextUtils.getOffsetBefore("", 0)), objArr6);
                    fileInputStream = context.openFileInput(((java.lang.String) objArr6[0]).intern());
                    try {
                        try {
                            java.lang.Object[] objArr7 = {fileInputStream, this.coroutineBoundary};
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - android.text.TextUtils.indexOf("", "", 0), objArr8);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((-1907736216) - android.view.View.combineMeasuredStates(0, 0), (short) (49 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 83), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 4, 1716535977 - android.view.View.MeasureSpec.getMode(0), objArr9);
                            cls2.getMethod((java.lang.String) objArr9[0], java.io.InputStream.class, char[].class).invoke(invoke, objArr7);
                            try {
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 21 - android.view.MotionEvent.axisFromString(""), objArr10);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\udef8鹭屧⪐⧖鋼\uebde픶ׅ蛕杉⦺졐痒", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 13, objArr11);
                                boolean booleanValue = ((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr11[0], java.lang.String.class).invoke(invoke, str)).booleanValue();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (java.io.IOException unused) {
                                    }
                                }
                                return booleanValue;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause2 = th3.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th3;
                            }
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause3 = th4.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th4;
                        }
                    } catch (java.security.KeyStoreException unused2) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(1075356856 - android.view.View.MeasureSpec.getSize(0), (short) (android.text.TextUtils.getTrimmedLength("") + 77), (byte) ((-115) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.graphics.Color.green(0) - 31, 957270731 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr12);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr12[0]).intern());
                    } catch (java.security.NoSuchAlgorithmException unused3) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(1075356840 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) ((-25) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (byte) (78 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (-30) - (android.view.ViewConfiguration.getTapTimeout() >> 16), 957270734 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr13);
                        throw new util.h.xy.ct.mc(((java.lang.String) objArr13[0]).intern());
                    } catch (java.security.cert.CertificateException unused4) {
                        try {
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 30, 31 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (47244 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr14);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr14[0]).intern());
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause4 = th5.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause5 = th6.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th6;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (java.security.KeyStoreException unused6) {
        } catch (java.security.NoSuchAlgorithmException unused7) {
        } catch (java.security.cert.CertificateException unused8) {
            fileInputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileInputStream2 = null;
            fileInputStream = fileInputStream2;
            if (fileInputStream != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0430 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x042b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // util.h.xy.cs.b
    /* renamed from: ᐝ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo26026(java.lang.String str) throws java.io.IOException, util.h.xy.ct.mc {
        java.io.FileInputStream fileInputStream;
        java.io.FileOutputStream fileOutputStream;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.io.FileOutputStream fileOutputStream2;
        java.lang.Object invoke;
        getHighSpeedVideoFpsRanges(true);
        if (mo26025(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(1075356568 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 36), (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 122), (-29) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0) + 957270762, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
            if (fileInputStream != null) {
            }
            if (fileOutputStream != null) {
            }
        }
        try {
            try {
                try {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41849, (short) (41 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), (byte) (109 - android.view.View.combineMeasuredStates(0, 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 43, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 957270722, objArr2);
                        try {
                            java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", (android.os.Process.myPid() >> 22) + 22, objArr4);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", 11 - android.graphics.Color.argb(0, 0, 0, 0), objArr5);
                            invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                            android.content.Context context = this.ArtificialStackFrames;
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(13 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (24614 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr6);
                            fileInputStream = context.openFileInput(((java.lang.String) objArr6[0]).intern());
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                        fileOutputStream = fileOutputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (java.io.IOException unused2) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (java.security.KeyStoreException unused3) {
                    fileInputStream = null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    fileInputStream = null;
                }
                try {
                    try {
                        java.lang.Object[] objArr7 = {fileInputStream, this.coroutineBoundary};
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 21 - android.os.Process.getGidForName(""), objArr8);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((-1907736216) - android.view.View.combineMeasuredStates(0, 0), (short) (android.graphics.Color.green(0) + 49), (byte) (83 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 5, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1716535976, objArr9);
                        cls2.getMethod((java.lang.String) objArr9[0], java.io.InputStream.class, char[].class).invoke(invoke, objArr7);
                        try {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(android.view.View.resolveSize(0, 0) + 1075356871, (short) (43 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 97), (-39) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 957270739 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
                            try {
                                java.lang.Object[] objArr11 = {((java.lang.String) objArr10[0]).intern()};
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢⾙육警瞤翹\ue312冔쮬償\u0c50뜝☏", 26 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr12);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12, objArr13);
                                byte[] bArr = new byte[16];
                                ((java.security.SecureRandom) cls3.getMethod((java.lang.String) objArr13[0], java.lang.String.class).invoke(null, objArr11)).nextBytes(bArr);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(1075356878 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 101), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 86), (-45) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 957270720 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr14);
                                try {
                                    java.lang.Object[] objArr15 = {str, new javax.crypto.spec.SecretKeySpec(bArr, ((java.lang.String) objArr14[0]).intern()), this.coroutineBoundary, null};
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - android.graphics.Color.alpha(0), objArr16);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("垞礁絋컅쎟\udc08鱬쫊庪莕㵊\ue291", android.text.TextUtils.getCapsMode("", 0, 0) + 11, objArr17);
                                    java.lang.String str2 = (java.lang.String) objArr17[0];
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌ㵊\ue291", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, objArr18);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uf094퍉\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢ﹽ닢饜堙ᤢ쐭\ue108钴轎֪鄟\uec21誺踊⋬⮎嬃첫", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, objArr19);
                                    cls4.getMethod(str2, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr18[0]), char[].class, java.lang.Class.forName((java.lang.String) objArr19[0])).invoke(invoke, objArr15);
                                    android.content.Context context2 = this.ArtificialStackFrames;
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(android.view.Gravity.getAbsoluteGravity(0, 0) + 13, android.view.KeyEvent.normalizeMetaState(0), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24614), objArr20);
                                    fileOutputStream2 = context2.openFileOutput(((java.lang.String) objArr20[0]).intern(), 0);
                                    try {
                                        try {
                                            java.lang.Object[] objArr21 = {fileOutputStream2, this.coroutineBoundary};
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", android.graphics.Color.argb(0, 0, 0, 0) + 22, objArr22);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0) - 1907736166, (short) ((android.os.Process.myTid() >> 22) - 34), (byte) (37 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 3, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1716535984, objArr23);
                                            cls5.getMethod((java.lang.String) objArr23[0], java.io.OutputStream.class, char[].class).invoke(invoke, objArr21);
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (java.io.IOException unused4) {
                                                }
                                            }
                                            if (fileOutputStream2 != null) {
                                                try {
                                                    fileOutputStream2.close();
                                                } catch (java.io.IOException unused5) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause2 = th5.getCause();
                                            if (cause2 == null) {
                                                throw th5;
                                            }
                                            throw cause2;
                                        }
                                    } catch (java.security.KeyStoreException unused6) {
                                        try {
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(android.graphics.Color.green(0) + 27, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 61, (char) (63257 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr24);
                                            throw new util.h.xy.ct.mc(((java.lang.String) objArr24[0]).intern());
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause3 = th6.getCause();
                                            if (cause3 == null) {
                                                throw th6;
                                            }
                                            throw cause3;
                                        }
                                    } catch (java.security.NoSuchAlgorithmException unused7) {
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(18 - android.view.View.getDefaultSize(0, 0), 13 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr25);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr25[0]).intern());
                                    } catch (java.security.cert.CertificateException unused8) {
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(android.text.TextUtils.getTrimmedLength("") + 30, android.view.KeyEvent.normalizeMetaState(0) + 31, (char) (47244 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr26);
                                        throw new util.h.xy.ct.mc(((java.lang.String) objArr26[0]).intern());
                                    }
                                } catch (java.lang.Throwable th7) {
                                    java.lang.Throwable cause4 = th7.getCause();
                                    if (cause4 == null) {
                                        throw th7;
                                    }
                                    throw cause4;
                                }
                            } catch (java.lang.Throwable th8) {
                                java.lang.Throwable cause5 = th8.getCause();
                                if (cause5 == null) {
                                    throw th8;
                                }
                                throw cause5;
                            }
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause6 = th9.getCause();
                            if (cause6 == null) {
                                throw th9;
                            }
                            throw cause6;
                        }
                    } catch (java.lang.Throwable th10) {
                        java.lang.Throwable cause7 = th10.getCause();
                        if (cause7 == null) {
                            throw th10;
                        }
                        throw cause7;
                    }
                } catch (java.security.KeyStoreException unused9) {
                    fileOutputStream2 = null;
                    java.lang.Object[] objArr242 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(android.graphics.Color.green(0) + 27, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 61, (char) (63257 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr242);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr242[0]).intern());
                } catch (java.security.NoSuchAlgorithmException unused10) {
                } catch (java.security.cert.CertificateException unused11) {
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    fileOutputStream = null;
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                }
            } catch (java.security.NoSuchAlgorithmException unused12) {
                obj2 = null;
                java.lang.Object[] objArr252 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(18 - android.view.View.getDefaultSize(0, 0), 13 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr252);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr252[0]).intern());
            } catch (java.security.cert.CertificateException unused13) {
                obj = null;
                java.lang.Object[] objArr262 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.text.TextUtils.getTrimmedLength("") + 30, android.view.KeyEvent.normalizeMetaState(0) + 31, (char) (47244 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr262);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr262[0]).intern());
            }
        } catch (java.security.NoSuchAlgorithmException unused14) {
            obj2 = null;
            java.lang.Object[] objArr2522 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(18 - android.view.View.getDefaultSize(0, 0), 13 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2522);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr2522[0]).intern());
        } catch (java.security.cert.CertificateException unused15) {
            obj = null;
            java.lang.Object[] objArr2622 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getTrimmedLength("") + 30, android.view.KeyEvent.normalizeMetaState(0) + 31, (char) (47244 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2622);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr2622[0]).intern());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x034b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // util.h.xy.cs.b
    /* renamed from: ˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] mo26023(java.lang.String str) throws java.io.IOException, util.h.xy.ct.mc {
        java.io.FileInputStream fileInputStream;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object invoke;
        if (!mo26025(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 19, android.view.View.getDefaultSize(0, 0) + 153, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 19035), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        getHighSpeedVideoFpsRanges(true);
        java.io.FileInputStream fileInputStream2 = null;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            try {
                try {
                    try {
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1075356584, (short) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 41), (byte) (109 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (-44) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 957270720, objArr2);
                            try {
                                java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - (android.os.Process.myTid() >> 22), objArr4);
                                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, objArr5);
                                invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                                android.content.Context context = this.ArtificialStackFrames;
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24613), objArr6);
                                fileInputStream = context.openFileInput(((java.lang.String) objArr6[0]).intern());
                            } catch (java.lang.Throwable th2) {
                                try {
                                    java.lang.Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                } catch (java.security.KeyStoreException unused) {
                                    obj2 = null;
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61, (char) (63257 - android.text.TextUtils.indexOf("", "", 0)), objArr7);
                                    throw new util.h.xy.ct.mc(((java.lang.String) objArr7[0]).intern());
                                } catch (java.security.NoSuchAlgorithmException unused2) {
                                    obj = null;
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getSize(0) + 18, 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                                    throw new util.h.xy.ct.mc(((java.lang.String) objArr8[0]).intern());
                                } catch (java.security.cert.CertificateException unused3) {
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr9);
                                    throw new util.h.xy.ct.mc(((java.lang.String) objArr9[0]).intern());
                                }
                            }
                        } catch (java.security.cert.CertificateException unused4) {
                            obj3 = null;
                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr92);
                            throw new util.h.xy.ct.mc(((java.lang.String) objArr92[0]).intern());
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } catch (java.security.cert.CertificateException unused6) {
                    obj3 = null;
                }
            } catch (java.security.KeyStoreException unused7) {
                obj2 = null;
            } catch (java.security.NoSuchAlgorithmException unused8) {
                obj = null;
            }
        } catch (java.security.UnrecoverableEntryException unused9) {
            fileInputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            fileInputStream2 = null;
            fileInputStream = fileInputStream2;
            if (fileInputStream != null) {
            }
            throw th;
        }
        try {
            try {
                java.lang.Object[] objArr10 = {fileInputStream, this.coroutineBoundary};
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr11);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-1907736216) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (49 - android.graphics.Color.blue(0)), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 83), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 4, (android.os.Process.myTid() >> 22) + 1716535977, objArr12);
                cls2.getMethod((java.lang.String) objArr12[0], java.io.InputStream.class, char[].class).invoke(invoke, objArr10);
                try {
                    java.lang.Object[] objArr13 = {str, new java.security.KeyStore.PasswordProtection(this.coroutineBoundary)};
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr14);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("Ⴋ\uf234ꈡ肴屧⪐Ԑ톶", 8 - android.text.TextUtils.indexOf("", "", 0), objArr15);
                    java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr15[0], java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, objArr13);
                    try {
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1907736155, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 108), (byte) ((-38) - (android.view.ViewConfiguration.getTapTimeout() >> 16)), 29 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 1716535975 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("Ⴋ\uf234뛟φ⒈\uedb5翹\ue312絋컅쎟\udc08", 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr17);
                        java.lang.Object invoke3 = cls4.getMethod((java.lang.String) objArr17[0], null).invoke(invoke2, null);
                        try {
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((-1907736120) - android.view.View.MeasureSpec.getSize(0), (short) (android.view.View.MeasureSpec.getMode(0) + 35), (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30), 3 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1716535972 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr18);
                            byte[] bArr = (byte[]) javax.crypto.SecretKey.class.getMethod((java.lang.String) objArr18[0], null).invoke(invoke3, null);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (java.io.IOException unused10) {
                                }
                            }
                            return bArr;
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause2 = th5.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th5;
                        }
                    } catch (java.lang.Throwable th6) {
                        java.lang.Throwable cause3 = th6.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    java.lang.Throwable cause4 = th7.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th7;
                }
            } catch (java.lang.Throwable th8) {
                java.lang.Throwable cause5 = th8.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th8;
            }
        } catch (java.security.KeyStoreException unused11) {
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61, (char) (63257 - android.text.TextUtils.indexOf("", "", 0)), objArr72);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr72[0]).intern());
        } catch (java.security.NoSuchAlgorithmException unused12) {
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getSize(0) + 18, 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr82);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr82[0]).intern());
        } catch (java.security.UnrecoverableEntryException unused13) {
            try {
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoSizes(1075356880 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (android.text.TextUtils.indexOf("", "", 0) - 107), (byte) ((-26) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 29, 957270739 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr19);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr19[0]).intern());
            } catch (java.lang.Throwable th9) {
                java.lang.Throwable cause6 = th9.getCause();
                if (cause6 != null) {
                    throw cause6;
                }
                throw th9;
            }
        } catch (java.security.cert.CertificateException unused14) {
            java.lang.Object[] objArr922 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr922);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr922[0]).intern());
        }
    }

    private boolean getHighSpeedVideoFpsRanges() throws java.io.IOException {
        CoroutineDebuggingKt = (getHighSpeedVideoSizes + 81) % 128;
        android.content.Context context = this.ArtificialStackFrames;
        int indexOf = android.text.TextUtils.indexOf("", "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(indexOf + 13, '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (24614 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr);
        boolean exists = context.getFileStreamPath(((java.lang.String) objArr[0]).intern()).exists();
        getHighSpeedVideoSizes = (CoroutineDebuggingKt + 49) % 128;
        return exists;
    }

    private static char[] Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = (CoroutineDebuggingKt + 117) % 128;
        char[] m26069 = util.h.xy.cv.ra.m26069(getOutputStallDurationlomOqCM, getOutputMinFrameDurationlomOqCM);
        int i = CoroutineDebuggingKt + 83;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return m26069;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(boolean z) throws util.h.xy.ct.mc {
        CoroutineDebuggingKt = (getHighSpeedVideoSizes + 81) % 128;
        if (z && this.coroutineBoundary == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(1075356899 + android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 76), (byte) (13 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-15) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 957270730 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr[0]).intern());
        }
        try {
            if (getHighSpeedVideoFpsRanges()) {
                return;
            }
            CoroutineDebuggingKt = (getHighSpeedVideoSizes + 125) % 128;
            if (this.coroutineBoundary == null) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(61 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 203, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr2[0]).intern());
            }
            java.io.OutputStream outputStream = null;
            try {
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(1075356585 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) (41 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (byte) (109 - android.view.View.resolveSize(0, 0)), (-43) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.graphics.ImageFormat.getBitsPerPixel(0) + 957270722, objArr3);
                    java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                    CoroutineDebuggingKt = (getHighSpeedVideoSizes + 1) % 128;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("Ⴋ\uf234᭚禍\uebde픶훛\uf67f酛鐅쇽\uf844", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr5);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, intern);
                        try {
                            java.lang.Object[] objArr6 = {null, this.coroutineBoundary};
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", android.graphics.Color.blue(0) + 22, objArr7);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1907736215, (short) (49 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (84 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), android.view.Gravity.getAbsoluteGravity(0, 0) - 4, (android.os.Process.myTid() >> 22) + 1716535977, objArr8);
                            cls2.getMethod((java.lang.String) objArr8[0], java.io.InputStream.class, char[].class).invoke(invoke, objArr6);
                            android.content.Context context = this.ArtificialStackFrames;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(13 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 24614), objArr9);
                            java.io.FileOutputStream openFileOutput = context.openFileOutput(((java.lang.String) objArr9[0]).intern(), 0);
                            try {
                                try {
                                    java.lang.Object[] objArr10 = {openFileOutput, this.coroutineBoundary};
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uf8b8主\ue3acꧥ罧ﬓ⒈\uedb5\u2fe5\ua7ee䇡\ue662ㄚ魢弸ꭌიퟝ棜ꈕ翹\ue312", 22 - android.view.View.MeasureSpec.getMode(0), objArr11);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetAfter("", 0) - 1907736166, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 33), (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36), (-3) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1716535984 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr12);
                                    cls3.getMethod((java.lang.String) objArr12[0], java.io.OutputStream.class, char[].class).invoke(invoke, objArr10);
                                    if (openFileOutput != null) {
                                        getHighSpeedVideoSizes = (CoroutineDebuggingKt + 89) % 128;
                                        try {
                                            openFileOutput.close();
                                        } catch (java.io.IOException unused) {
                                        }
                                    }
                                    int i = CoroutineDebuggingKt + 51;
                                    int i2 = i % 128;
                                    getHighSpeedVideoSizes = i2;
                                    if (i % 2 == 0) {
                                        throw new java.lang.ArithmeticException();
                                    }
                                    CoroutineDebuggingKt = (i2 + 65) % 128;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.security.KeyStoreException unused2) {
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 61, (char) (63257 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr13);
                                throw new util.h.xy.ct.mc(((java.lang.String) objArr13[0]).intern());
                            } catch (java.security.NoSuchAlgorithmException unused3) {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(18 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr14);
                                throw new util.h.xy.ct.mc(((java.lang.String) objArr14[0]).intern());
                            } catch (java.security.cert.CertificateException unused4) {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(1075356661 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 2), (byte) ((-19) - android.text.TextUtils.getTrimmedLength("")), (-30) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 957270722 - android.view.View.combineMeasuredStates(0, 0), objArr15);
                                throw new util.h.xy.ct.mc(((java.lang.String) objArr15[0]).intern());
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
                    th = th4;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    throw th;
                }
            } catch (java.security.KeyStoreException unused6) {
            } catch (java.security.NoSuchAlgorithmException unused7) {
            } catch (java.security.cert.CertificateException unused8) {
            } catch (java.lang.Throwable th5) {
                th = th5;
                outputStream = null;
                if (outputStream != null) {
                }
                throw th;
            }
        } catch (java.io.IOException unused9) {
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(56 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 265 - android.view.View.combineMeasuredStates(0, 0), (char) android.view.View.MeasureSpec.getSize(0), objArr16);
            throw new util.h.xy.ct.mc(((java.lang.String) objArr16[0]).intern());
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputFormats = (char) 6257;
        getOutputMinFrameDuration = (char) 65350;
        getOutputSizes = (char) 50983;
        getValidOutputFormatsForInputhNQ4ISI = (char) 1776;
        getOutputStallDuration = -1777030848;
        accessartificialFrame = -408873008;
        toString = 2114890267;
        isOutputSupportedForhNQ4ISI = new byte[]{-57, -88, -57, 46, 37, 45, com.google.common.base.Ascii.DC4, -53, -36, 58, 37, 33, 42, -40, -48, 41, 40, 9, -10, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -39, 10, -20, 1, 5, -100, 14, com.google.common.base.Ascii.SYN, -99, -98, -3, -10, 69, -99, -98, -99, -42, 86, -26, -108, 8, 14, -19, 1, 13, -90, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -10, 8, 32, -112, -40, -98, -6, 110, -50, 104, 109, -57, -88, 111, -73, 94, 113, -71, -117, 120, -80, 100, -80, 111, -125, 80, 32, 100, -76, 108, 86, 75, -71, -117, -126, -38, -86, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.CAN, 98, -125, 111, 99, -22, 114, com.google.common.base.Ascii.FS, -70, com.google.common.base.Ascii.CAN, 101, 35, com.google.common.base.Ascii.US, 40, com.google.common.base.Ascii.US, -53, 115, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 102, -40, -40, -40, -40, -40, -40, -40};
    }

    static void getHighSpeedVideoSizes() {
        coroutineCreation = 1481001904;
        getInputFormats = -408872969;
        isOutputSupportedFor = 558899801;
        getHighSpeedVideoFpsRangesFor = new byte[]{-116, -70, -79, -118, -88, 70, 36, -74, -72, -113, -120, -123, -80, 122, 36, -73, -127, -28, -29, 64, -98, 74, -69, -29, -91, -81, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, -95, -36, -31, -87, com.google.common.base.Ascii.EM, -95, 103, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 10, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -47, -23, -92, -93, 18, -36, -13, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 10, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -47, -14, 103, 16, 3, 40, -19, -125, -125, 78, 43, -13, -125, -21, -91, -77, 47, -112, -118, 91, 43, -23, com.visa.cbp.getEncExpo.onUnminimized, 80, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -21, 80, -40, -107, -10, -1, -124, -9, -72, 67, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -21, 80, 43, -19, -70, -123, -13, -115, -100, 40, -54, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 58, 114, Byte.MIN_VALUE, -58, -40, -51, -63, 40, -54, -62, 41, 58, 9, 37, -75, -35, -109, -27, 17, Byte.MIN_VALUE, -66, -115, 102, -39, 105, com.google.common.base.Ascii.CAN, 38, -75, -36, -80, -76, -122, 35, 68, com.google.common.base.Ascii.ESC, -37, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 36, -73, -40, -76, -87, 115, com.google.common.base.Ascii.ESC, -37, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 33, 39, -125, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 10, -75, 39, -76, -73, Byte.MAX_VALUE, com.visa.cbp.getEncExpo.IResultReceiver2, -83, -55, -73, 33, -85, -70, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -101, -28, -100, -107, 89, 39, -17, -97, -25, -67, -81, 59, -118, -72, -73, 34, -97, -32, -97, 82, 45, -25, 74, 39, -27, -120, -99, -17, -123, -43, -27, -35, -121, -107, 57, -20, -2, -115, 8, -25, -45, -30, 92, com.google.common.base.Ascii.ETB, -35, -84, com.google.common.base.Ascii.DC4, -47, -33, -27, -32, -3, 85, 37, 36, 82, 45, 43, -25, -99, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 37, 37, -32, -99, 85, 37, 93, 7, com.google.common.base.Ascii.NAK, -127, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 60, 13, -117, 38, 40, 36, 38, 36, -25, -118, -21, -97, 43, 56, -93, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 101, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -4, -95, 41, -24, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -4, -86, 110, 101, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 58, -23, -95, 110, 58, com.google.common.base.Ascii.EM, -4, 85, 2, 0, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.VT, -122, 10, -66, -121, com.google.common.base.Ascii.SYN, -122, com.visa.cbp.getEncExpo.onUnminimized, -41, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 97, -67, -18, com.visa.cbp.getEncExpo.startTransaction, 80, 59, -3, -1, com.visa.cbp.getEncExpo.registerForActivityResult, -32, -15, -90, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -23, com.visa.cbp.getEncExpo.registerForActivityResult, -15, -25, -14, -108, -110, -74, -87, -17, -116, -67, -74, -78, 101, 111, com.google.common.base.Ascii.GS, -84, -70, 93, -92, 91, -116, 88, -57, com.google.common.base.Ascii.SUB, 80, -59, 16, 82, -113, -118, 88, -78, -54, -27, -97, -79, -23, -109, -101, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -126, -111, -117, 87, -46, -105, Byte.MIN_VALUE, -127, 66, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -78, -25, 72, -39, -111, -127, com.visa.cbp.getEncExpo.registerForActivityResult, -81, 81, 45, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -70, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40};
        getHighSpeedVideoSizesFor = new char[]{64597, 47511, 30690, 11569, 60176, 41305, 24228, 5353, 53980, 34826, 18018, 942, 47502, 40015, 55743, 6019, 19713, 35632, 49527, 16015, 29846, 45800, 59444, 9804, 25493, 55743, 6133, 19739, 35670, 49532, 16065, 9422, 24889, 44893, 62858, 13216, 31230, 34306, 52313, 2660, 20640, 40642, 56150, 24866, 44927, 62870, 13278, 31225, 34380, 52305, 2657, 20653, 40584, 56089, 24879, 44853, 62850, 13272, 31219, 34367, 52292, 27466, 11948, 57547, 47646, 31801, 13950, 51594, 33679, 17892, 7982, 53522, 38024, 11953, 57596, 47621, 31827, 13927, 51595, 33743, 17851, 7978, 53596, 38023, 11955, 57573, 47637, 31747, 40020, 55742, 6086, 19722, 35637, 49521, 16004, 29890, 45804, 59452, 9739, 25523, 55682, 6076, 19722, 35654, 49522, 16005, 29891, 45814, 59452, 9803, 25497, 55782, 6126, 19712, 35678, 49508, 16125, 29912, 45581, 59447, 9800, 25502, 55716, 6066, 19729, 35675, 49447, 16053, 29889, 45593, 59429, 9853, 25480, 55708, 6084, 19771, 35656, 49440, 16000, 29910, 45594, 59446, 9842, 25542, 55753, 6121, 19752, 35673, 49290, 16035, 29933, 45578, 59488, 54833, 37870, 23937, 1801, 49530, 35616, 29913, 16030, 63730, 41581, 27679, 10709, 37814, 23970, 1868, 49420, 35641, 29903, 16027, 40002, 55733, 6097, 19718, 35628, 49522, 16014, 29909, 45800, 59436, 9806, 25562, 55726, 6131, 19738, 35666, 49525, 16064, 29917, 45805, 59425, 9732, 25493, 55715, 6073, 19726, 35668, 49535, 16051, 29896, 45662, 40010, 55733, 6106, 19794, 35606, 49504, 16008, 29892, 45804, 59512, 9795, 25499, 55742, 6076, 19725, 35675, 49524, 16014, 29843, 45803, 59451, 9797, 25492, 55730, 6128, 19742, 35674, 49534, 16056, 29896, 45663, 59435, 9815, 25493, 55725, 6066, 19719, 35665, 49505, 16057, 29915, 45597, 59499, 9838, 25477, 55769, 6063, 19768, 35672, 49516, 16054, 29826, 45596, 59447, 9783, 25477, 55755, 6125, 19770, 35678, 49304, 16040, 40020, 55742, 6082, 19728, 35625, 49521, 16071, 29890, 45798, 59512, 9796, 25482, 55720, 6130, 19791, 35601, 49457, 16003, 29889, 45799, 59444, 9808, 25490, 55782, 6098, 19725, 35650, 49450, 16014, 29912, 45584, 59452, 9796, 25552, 55717, 6139, 19721, 35665, 49447, 16033, 29888, 45580, 59427, 9786, 25508, 55795, 6063, 19771, 35657, 49507, 16054, 29906, 45569, 59437, 9848, 25480};
        getInputSizeshNQ4ISI = 5584474082327779792L;
    }
}
