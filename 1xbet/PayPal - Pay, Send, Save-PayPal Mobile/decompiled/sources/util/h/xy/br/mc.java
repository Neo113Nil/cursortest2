package util.h.xy.br;

/* loaded from: classes18.dex */
public class mc {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static boolean getHighSpeedVideoSizes = false;
    private static int getHighSpeedVideoSizesFor = 0;
    private static final java.lang.String getInputFormats;
    private static byte[] getInputSizeshNQ4ISI = null;
    private static int getOutputFormats = 0;
    private static boolean getOutputMinFrameDuration = false;
    private static java.security.Provider getOutputMinFrameDurationlomOqCM = null;
    private static final byte[] getOutputSizes;
    private static int getOutputSizeshNQ4ISI = 0;
    private static int getOutputStallDuration = 1;
    private static char[] getOutputStallDurationlomOqCM;
    private static char[] getValidOutputFormatsForInputhNQ4ISI;
    private static int isOutputSupportedForhNQ4ISI;
    private static short[] unwrapAs;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] f1034;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] f1035;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges();
        getInputFormats = "mc";
        getOutputSizes = new byte[]{-83, -61, 110, -117, 99, 37, 113, -83, -61, 110, -117, 99, 37, 113, 113};
        f1035 = null;
        f1034 = null;
        int i = getOutputStallDuration + 117;
        isOutputSupportedForhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            jArr[rbVar.f2651] = (((char) (getValidOutputFormatsForInputhNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        objArr[0] = str;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25610(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(context.openFileOutput(str, 32768));
            outputStreamWriter.write(str2);
            outputStreamWriter.close();
        } catch (java.lang.Exception unused) {
        }
        getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 37) % 128;
    }

    static long getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.String str) {
        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 21) % 128;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i = 0;
            while (i < 19) {
                int i2 = isOutputSupportedForhNQ4ISI + 67;
                getOutputStallDuration = i2 % 128;
                if (i2 % 2 == 0) {
                    util.h.xy.br.b.f1030.m25595(context, str);
                    i += 43;
                } else {
                    util.h.xy.br.b.f1030.m25595(context, str);
                    i++;
                }
            }
            return java.lang.System.currentTimeMillis() - currentTimeMillis;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    static long getHighSpeedVideoFpsRangesFor() {
        long currentTimeMillis;
        int i;
        int i2 = getOutputStallDuration + 101;
        isOutputSupportedForhNQ4ISI = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (i3 != 0) {
                currentTimeMillis = java.lang.System.currentTimeMillis();
                i = 1;
            } else {
                currentTimeMillis = java.lang.System.currentTimeMillis();
                i = 0;
            }
            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 31) % 128;
            while (i < 3) {
                util.h.xy.br.b.f1030.m25593();
                i++;
            }
            return java.lang.System.currentTimeMillis() - currentTimeMillis;
        } catch (java.lang.Exception unused) {
            return i3;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputStallDurationlomOqCM;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRanges);
        if (getOutputMinFrameDuration) {
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getHighSpeedVideoSizes) {
            throw null;
        }
        throw null;
    }

    static long getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 113) % 128;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (int i2 = 0; i2 < i; i2++) {
                util.h.xy.br.b.f1030.m25591(context, str, str2.getBytes());
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 65) % 128;
            return currentTimeMillis2 - currentTimeMillis;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    static long Camera2StreamConfigurationMap() {
        getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 75) % 128;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (int i = 0; i <= 0; i++) {
                getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 109) % 128;
                util.h.xy.br.b.f1030.m25596();
            }
            return java.lang.System.currentTimeMillis() - currentTimeMillis;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getInputSizeshNQ4ISI;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getInputSizeshNQ4ISI[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (unwrapAs[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getInputSizeshNQ4ISI;
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
                    byte[] bArr5 = getInputSizeshNQ4ISI;
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

    static long getHighResolutionOutputSizeshNQ4ISI() {
        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 49) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - intValue, (-16777216) - android.graphics.Color.rgb(0, 0, 0), (char) (42337 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr);
            if (!getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr[0]).intern())) {
                int i = isOutputSupportedForhNQ4ISI + 29;
                getOutputStallDuration = i % 128;
                if (i % 2 != 0) {
                    getOutputFormats();
                } else {
                    getOutputFormats();
                    throw new java.lang.ArithmeticException();
                }
            }
            long j = 0;
            for (int i2 = 0; i2 <= 0; i2++) {
                j = m25608(getOutputSizes);
            }
            return j;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighSpeedVideoSizes(android.content.Context context) {
        synchronized (util.h.xy.br.mc.class) {
            getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 5) % 128;
            try {
                util.h.xy.br.b.f1030.m25592(context);
                util.h.xy.br.b.f1030.m25597();
                isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 33) % 128;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            }
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 33) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 15, android.view.MotionEvent.axisFromString("") + 15, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40992), objArr);
            try {
                java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr3);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-809218426) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (android.view.KeyEvent.getDeadChar(0, 0) - 15), ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 12, android.text.TextUtils.getCapsMode("", 0, 0) - 1437216513, objArr4);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 105) % 128;
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\u0091\u0082\u008f\u0090", objArr6);
                    cls2.getMethod((java.lang.String) objArr6[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 103) % 128;
                    try {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.os.Process.myPid() >> 22) + 127, "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr7);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((-809218416) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-49) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), android.text.TextUtils.getOffsetAfter("", 0) - 12, (-1437216517) - android.text.TextUtils.getTrimmedLength(""), objArr8);
                        boolean booleanValue = ((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class).invoke(invoke, str)).booleanValue();
                        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 63) % 128;
                        return booleanValue;
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
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            return false;
        }
    }

    private static java.security.Signature getHighSpeedVideoSizesFor() throws java.security.NoSuchAlgorithmException {
        java.security.Provider[] providers = java.security.Security.getProviders();
        int length = providers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            java.security.Provider provider = providers[i];
            provider.getName();
            java.lang.String name2 = provider.getName();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(27 - android.graphics.Color.green(0), 29 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31701), objArr);
            if (!name2.equals(((java.lang.String) objArr[0]).intern())) {
                getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 17) % 128;
                java.lang.String name3 = provider.getName();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(11 - android.view.View.MeasureSpec.getSize(0), android.view.View.combineMeasuredStates(0, 0) + 56, (char) (8697 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr2);
                if (name3.equals(((java.lang.String) objArr2[0]).intern())) {
                    continue;
                } else {
                    isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 9) % 128;
                    java.lang.String name4 = provider.getName();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(17 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 67, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 35210), objArr3);
                    if (name4.equals(((java.lang.String) objArr3[0]).intern())) {
                        continue;
                    } else {
                        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 107) % 128;
                        java.lang.String name5 = provider.getName();
                        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 65) % 128;
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(11 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), 83 - android.view.View.combineMeasuredStates(0, 0), (char) (46865 - android.view.KeyEvent.keyCodeFromString("")), objArr4);
                            if (name5.equals(((java.lang.String) objArr4[0]).intern())) {
                                continue;
                            } else {
                                java.lang.String name6 = provider.getName();
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(15 - android.view.Gravity.getAbsoluteGravity(0, 0), 14 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (40992 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr5);
                                if (name6.equals(((java.lang.String) objArr5[0]).intern())) {
                                    continue;
                                } else {
                                    java.lang.String name7 = provider.getName();
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, 94 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr6);
                                    if (name7.equals(((java.lang.String) objArr6[0]).intern())) {
                                        continue;
                                    } else {
                                        java.lang.String name8 = provider.getName();
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(12 - android.graphics.Color.red(0), 113 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51699), objArr7);
                                        if (!name8.equals(((java.lang.String) objArr7[0]).intern())) {
                                            provider.getName();
                                            getOutputMinFrameDurationlomOqCM = provider;
                                            java.security.Security.removeProvider(provider.getName());
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
            }
            i++;
        }
        java.security.Provider provider2 = getOutputMinFrameDurationlomOqCM;
        if (provider2 != null) {
            provider2.getName();
        }
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 13, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 125, (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr8);
        java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 117) % 128;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 809218403, (short) android.view.KeyEvent.keyCodeFromString(""), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 12, (-1437216510) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr9[0]);
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((-809218426) - android.text.TextUtils.getOffsetAfter("", 0), (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 15), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 12, android.view.View.MeasureSpec.getMode(0) - 1437216513, objArr10);
        java.security.Signature signature = (java.security.Signature) cls.getMethod((java.lang.String) objArr10[0], java.lang.String.class).invoke(null, intern);
        if (signature != null) {
            getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 97) % 128;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getSize(0) - 809218402, (short) android.view.KeyEvent.keyCodeFromString(""), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 126), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 12, android.view.Gravity.getAbsoluteGravity(0, 0) - 1437216510, objArr11);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0089\u0086\u0091\u008a\u0083\u008f\u0089\u0093\u008b\u0086\u0092", objArr12);
            ((java.security.Provider) cls2.getMethod((java.lang.String) objArr12[0], null).invoke(signature, null)).getName();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) - 809218402, (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (124 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-12) - android.text.TextUtils.indexOf("", ""), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 1437216510, objArr13);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, "\u0096\u0095\u008b\u008a\u0089\u008f\u0092\u0090\u0094\u008b\u0086\u0092", objArr14);
            cls3.getMethod((java.lang.String) objArr14[0], null).invoke(signature, null);
        }
        return signature;
    }

    private static void getOutputFormats() {
        java.lang.Object newInstance;
        java.lang.Object[] objArr;
        java.security.cert.X509Certificate m27541;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0089\u0086\u0091\u0090\u008a\u0088¢¡\u009b\u008f\u008a\u008b\u0087\u0086\u008b\u008f\u0089\u0093\u008c\u0086\u008d\u0084\u0086\u0089\u008f\u008b\u0085\u008c\u0086 \u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0091\u008a\u008f\u0089\u0091\u009b\u0082", objArr2);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String str = (java.lang.String) objArr2[0];
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 15, 14 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (40992 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr3);
            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 39) % 128;
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-809218426) - android.view.KeyEvent.normalizeMetaState(0), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-16) - android.view.MotionEvent.axisFromString("")), (-12) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1437216513, objArr5);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, intern);
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.red(0), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr6);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.indexOf("", ""), "\u0091\u0082\u008f\u0090", objArr7);
                    cls2.getMethod((java.lang.String) objArr7[0], java.io.InputStream.class, char[].class).invoke(invoke, null, null);
                    try {
                        try {
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 844, 138 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.graphics.Color.red(0) + 59219), objArr8);
                            try {
                                java.lang.Object[] objArr9 = {android.util.Base64.decode(((java.lang.String) objArr8[0]).intern(), 0)};
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0087\u0086\u0097\u008e\u008c\u0086\u008d\u0091\u0086\u0091\u008f\u0087\u009b\u009a\u0099\u008e\u0098\u008d\u0093\u0084\u0087\u0086\u0097\u0085\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr10);
                                newInstance = java.lang.Class.forName((java.lang.String) objArr10[0]).getDeclaredConstructor(byte[].class).newInstance(objArr9);
                                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int i = getOutputStallDuration + 71;
                                isOutputSupportedForhNQ4ISI = i % 128;
                                int i2 = i % 2;
                                try {
                                    objArr = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(indexOf + 4, indexOf2 + 983, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr);
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
                        } catch (java.security.InvalidKeyException | java.security.KeyStoreException unused) {
                        }
                        try {
                            java.lang.Object[] objArr11 = {((java.lang.String) objArr[0]).intern()};
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((-809218380) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) android.text.TextUtils.getOffsetBefore("", 0), (byte) (android.graphics.Color.blue(0) - 119), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 12, (-1437216510) - android.graphics.Color.green(0), objArr12);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 809218426, (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 15), android.text.TextUtils.getOffsetAfter("", 0) - 12, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1437216513, objArr13);
                            java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr13[0], java.lang.String.class).invoke(null, objArr11);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 809218379, (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 119), (-12) - (android.os.Process.myTid() >> 22), (-1437216511) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr14);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0086\u008b\u0082\u0083\u008a\u0089\u0093\u0086\u008b\u0082\u0089\u0086\u009b\u0086\u0092", objArr15);
                                java.lang.String str2 = (java.lang.String) objArr15[0];
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((-809218355) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) android.widget.ExpandableListView.getPackedPositionType(0L), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 115), android.widget.ExpandableListView.getPackedPositionChild(0L) - 11, (-1437216510) - android.view.View.resolveSizeAndState(0, 0, 0), objArr16);
                                java.lang.Object invoke3 = cls4.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr16[0])).invoke(invoke2, newInstance);
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(3 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 983, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr17);
                                try {
                                    java.lang.Object[] objArr18 = {((java.lang.String) objArr17[0]).intern()};
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor((-809218329) - android.text.TextUtils.getCapsMode("", 0, 0), (short) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 119), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 12, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1437216510, objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 809218425, (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((-15) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-12) - android.graphics.Color.blue(0), (-1437216513) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr20);
                                    java.lang.Object invoke4 = cls5.getMethod((java.lang.String) objArr20[0], java.lang.String.class).invoke(null, objArr18);
                                    isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 75) % 128;
                                    try {
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor((-809218328) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) android.text.TextUtils.indexOf("", ""), (byte) ((-119) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 13, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 1437216510, objArr21);
                                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0089\u008a\u0082\u0093\u008c\u0086\u008d\u009b\u0086\u0092", objArr22);
                                        java.security.KeyPair keyPair = (java.security.KeyPair) cls6.getMethod((java.lang.String) objArr22[0], null).invoke(invoke4, null);
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 125, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr23);
                                        try {
                                            java.lang.Object[] objArr24 = {((java.lang.String) objArr23[0]).intern()};
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 809218401, (short) android.text.TextUtils.getCapsMode("", 0, 0), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + io.ktor.util.date.GMTDateParser.MONTH), (-12) - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 1437216509, objArr25);
                                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor((-809218426) - android.view.View.resolveSizeAndState(0, 0, 0), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 14), (-12) - android.text.TextUtils.indexOf("", "", 0, 0), (-1437216514) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr26);
                                            java.security.Signature signature = (java.security.Signature) cls7.getMethod((java.lang.String) objArr26[0], java.lang.String.class).invoke(null, objArr24);
                                            try {
                                                if (signature != null) {
                                                    try {
                                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((-809218401) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (byte) (125 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.os.Process.myPid() >> 22) - 12, android.graphics.Color.green(0) - 1437216510, objArr27);
                                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, "\u0089\u0086\u0091\u008a\u0083\u008f\u0089\u0093\u008b\u0086\u0092", objArr28);
                                                        ((java.security.Provider) cls8.getMethod((java.lang.String) objArr28[0], null).invoke(signature, null)).getName();
                                                        try {
                                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor((-809218402) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (125 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (-12) - (android.os.Process.myTid() >> 22), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1437216511, objArr29);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            getHighResolutionOutputSizeshNQ4ISI((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, "\u0096\u0095\u008b\u008a\u0089\u008f\u0092\u0090\u0094\u008b\u0086\u0092", objArr30);
                                                            cls9.getMethod((java.lang.String) objArr30[0], null).invoke(signature, null);
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
                                                m27541 = util.h.xy.u.mc.f2436.m27541(signature, keyPair);
                                            } catch (java.security.InvalidKeyException | java.security.cert.CertificateException | util.h.xy.ee.ra e) {
                                                e.getMessage();
                                                m27541 = util.h.xy.u.mc.f2436.m27541(getHighSpeedVideoSizesFor(), keyPair);
                                            }
                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getTrimmedLength("") - 809218299, (short) android.text.TextUtils.indexOf("", "", 0), (byte) ((-84) - android.widget.ExpandableListView.getPackedPositionType(0L)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 13, android.graphics.Color.alpha(0) - 1437216510, objArr31);
                                            java.lang.Object[] objArr32 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr31[0]), 1);
                                            objArr32[0] = m27541;
                                            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 39) % 128;
                                            try {
                                                java.lang.Object[] objArr33 = {invoke3, objArr32};
                                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(android.os.Process.getGidForName("") - 809218268, (short) (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) ((-83) - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (-13) - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1437216510, objArr34);
                                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor((android.os.Process.myPid() >> 22) - 809218231, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (byte) ((-5) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-12) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.graphics.Color.argb(0, 0, 0, 0) - 1437216510, objArr35);
                                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u009f\u0086\u008b\u0082\u0087\u008a\u009e\u008a\u008b\u0089\u0086\u0098\u0084\u008b\u0089\u0086\u0087\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081\u009d\u009c", objArr36);
                                                java.lang.Object newInstance2 = cls10.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr35[0]), java.lang.Class.forName((java.lang.String) objArr36[0])).newInstance(objArr33);
                                                try {
                                                    java.lang.Object newInstance3 = java.lang.Class.forName(str).getDeclaredConstructor(java.lang.Integer.TYPE).newInstance(4);
                                                    try {
                                                        java.lang.Class<?> cls11 = java.lang.Class.forName(str);
                                                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 809218208, (short) android.text.TextUtils.indexOf("", "", 0), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 80), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 13, android.graphics.ImageFormat.getBitsPerPixel(0) - 1437216500, objArr37);
                                                        cls11.getMethod((java.lang.String) objArr37[0], java.lang.Boolean.TYPE).invoke(newInstance3, bool);
                                                        java.lang.String[] strArr = new java.lang.String[1];
                                                        try {
                                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 985, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), objArr38);
                                                            strArr[0] = ((java.lang.String) objArr38[0]).intern();
                                                            try {
                                                                java.lang.Class<?> cls12 = java.lang.Class.forName(str);
                                                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                getHighResolutionOutputSizeshNQ4ISI((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u0085\u008b\u0085\u0086\u0092\u008a£\u008b\u0086\u0085", objArr39);
                                                                cls12.getMethod((java.lang.String) objArr39[0], java.lang.String[].class).invoke(newInstance3, strArr);
                                                                java.lang.String[] strArr2 = new java.lang.String[2];
                                                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRangesFor(9 - android.widget.ExpandableListView.getPackedPositionType(0L), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 944, (char) (7636 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr40);
                                                                strArr2[0] = ((java.lang.String) objArr40[0]).intern();
                                                                try {
                                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(0, 0) + 12, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1001, (char) (1218 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr41);
                                                                    strArr2[1] = ((java.lang.String) objArr41[0]).intern();
                                                                    try {
                                                                        java.lang.Object[] objArr42 = {strArr2};
                                                                        java.lang.Class<?> cls13 = java.lang.Class.forName(str);
                                                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) - 809218178, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 80), (android.view.ViewConfiguration.getTapTimeout() >> 16) - 12, (-1437216501) - android.view.KeyEvent.normalizeMetaState(0), objArr43);
                                                                        cls13.getMethod((java.lang.String) objArr43[0], java.lang.String[].class).invoke(newInstance3, objArr42);
                                                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor(5 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1013, (char) (17529 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr44);
                                                                        java.lang.String[] strArr3 = {((java.lang.String) objArr44[0]).intern()};
                                                                        try {
                                                                            java.lang.Class<?> cls14 = java.lang.Class.forName(str);
                                                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRangesFor((-809218157) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) android.graphics.Color.red(0), (byte) (59 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (-12) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (-1437216501) - android.view.KeyEvent.keyCodeFromString(""), objArr45);
                                                                            cls14.getMethod((java.lang.String) objArr45[0], java.lang.String[].class).invoke(newInstance3, strArr3);
                                                                            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 55) % 128;
                                                                            try {
                                                                                java.lang.Class<?> cls15 = java.lang.Class.forName(str);
                                                                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0, 0) + 127, "\u0091\u0086\u0089\u008a\u0088¦\u0086¤\u009b\u008f\u008a\u008b\u0097\u008c\u0089\u0087\u009b\u009a\u0091\u0086¥\u008a\u0096\u008f\u0091\u009b\u0082¤\u008b\u0086\u0085", objArr46);
                                                                                cls15.getMethod((java.lang.String) objArr46[0], java.lang.Boolean.TYPE).invoke(newInstance3, bool);
                                                                                getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 115) % 128;
                                                                                try {
                                                                                    java.lang.Class<?> cls16 = java.lang.Class.forName(str);
                                                                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                                                    getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u0091\u0090\u008a\u0088§", objArr47);
                                                                                    java.lang.Object invoke5 = cls16.getMethod((java.lang.String) objArr47[0], null).invoke(newInstance3, null);
                                                                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                                                    getHighSpeedVideoFpsRangesFor(15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, (char) (42337 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr48);
                                                                                    try {
                                                                                        java.lang.Object[] objArr49 = {((java.lang.String) objArr48[0]).intern(), newInstance2, invoke5};
                                                                                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                                                        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr50);
                                                                                        java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr50[0]);
                                                                                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                                                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u008c\u0089\u008b\u009b\u009a\u008b\u0086\u0085", objArr51);
                                                                                        cls17.getMethod((java.lang.String) objArr51[0], java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, objArr49);
                                                                                    } catch (java.lang.Throwable th5) {
                                                                                        java.lang.Throwable cause5 = th5.getCause();
                                                                                        if (cause5 == null) {
                                                                                            throw th5;
                                                                                        }
                                                                                        throw cause5;
                                                                                    }
                                                                                } catch (java.lang.Throwable th6) {
                                                                                    java.lang.Throwable cause6 = th6.getCause();
                                                                                    if (cause6 == null) {
                                                                                        throw th6;
                                                                                    }
                                                                                    throw cause6;
                                                                                }
                                                                            } catch (java.lang.Throwable th7) {
                                                                                java.lang.Throwable cause7 = th7.getCause();
                                                                                if (cause7 == null) {
                                                                                    throw th7;
                                                                                }
                                                                                throw cause7;
                                                                            }
                                                                        } catch (java.lang.Throwable th8) {
                                                                            java.lang.Throwable cause8 = th8.getCause();
                                                                            if (cause8 == null) {
                                                                                throw th8;
                                                                            }
                                                                            throw cause8;
                                                                        }
                                                                    } catch (java.lang.Throwable th9) {
                                                                        java.lang.Throwable cause9 = th9.getCause();
                                                                        if (cause9 == null) {
                                                                            throw th9;
                                                                        }
                                                                        throw cause9;
                                                                    }
                                                                } catch (java.lang.Throwable th10) {
                                                                    java.lang.Throwable cause10 = th10.getCause();
                                                                    if (cause10 == null) {
                                                                        throw th10;
                                                                    }
                                                                    throw cause10;
                                                                }
                                                            } catch (java.lang.Throwable th11) {
                                                                java.lang.Throwable cause11 = th11.getCause();
                                                                if (cause11 == null) {
                                                                    throw th11;
                                                                }
                                                                throw cause11;
                                                            }
                                                        } catch (java.lang.Throwable th12) {
                                                            java.lang.Throwable cause12 = th12.getCause();
                                                            if (cause12 == null) {
                                                                throw th12;
                                                            }
                                                            throw cause12;
                                                        }
                                                    } catch (java.lang.Throwable th13) {
                                                        java.lang.Throwable cause13 = th13.getCause();
                                                        if (cause13 == null) {
                                                            throw th13;
                                                        }
                                                        throw cause13;
                                                    }
                                                } catch (java.lang.Throwable th14) {
                                                    java.lang.Throwable cause14 = th14.getCause();
                                                    if (cause14 == null) {
                                                        throw th14;
                                                    }
                                                    throw cause14;
                                                }
                                            } catch (java.lang.Throwable th15) {
                                                java.lang.Throwable cause15 = th15.getCause();
                                                if (cause15 == null) {
                                                    throw th15;
                                                }
                                                throw cause15;
                                            }
                                        } catch (java.lang.Throwable th16) {
                                            java.lang.Throwable cause16 = th16.getCause();
                                            if (cause16 == null) {
                                                throw th16;
                                            }
                                            throw cause16;
                                        }
                                    } catch (java.lang.Throwable th17) {
                                        java.lang.Throwable cause17 = th17.getCause();
                                        if (cause17 == null) {
                                            throw th17;
                                        }
                                        throw cause17;
                                    }
                                } catch (java.lang.Throwable th18) {
                                    java.lang.Throwable cause18 = th18.getCause();
                                    if (cause18 == null) {
                                        throw th18;
                                    }
                                    throw cause18;
                                }
                            } catch (java.lang.Throwable th19) {
                                java.lang.Throwable cause19 = th19.getCause();
                                if (cause19 == null) {
                                    throw th19;
                                }
                                throw cause19;
                            }
                        } catch (java.lang.Throwable th20) {
                            java.lang.Throwable cause20 = th20.getCause();
                            if (cause20 == null) {
                                throw th20;
                            }
                            throw cause20;
                        }
                    } finally {
                        getInputFormats();
                    }
                } catch (java.lang.Throwable th21) {
                    java.lang.Throwable cause21 = th21.getCause();
                    if (cause21 == null) {
                        throw th21;
                    }
                    throw cause21;
                }
            } catch (java.lang.Throwable th22) {
                java.lang.Throwable cause22 = th22.getCause();
                if (cause22 == null) {
                    throw th22;
                }
                throw cause22;
            }
        } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException | java.security.spec.InvalidKeySpecException unused2) {
        }
    }

    private static void getInputFormats() {
        int i = isOutputSupportedForhNQ4ISI + 73;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.security.Provider provider = getOutputMinFrameDurationlomOqCM;
        if (provider != null) {
            provider.getName();
            java.security.Security.insertProviderAt(getOutputMinFrameDurationlomOqCM, 1);
            getOutputMinFrameDurationlomOqCM = null;
            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 5) % 128;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static long m25608(byte[] bArr) {
        int i = getOutputStallDuration + 71;
        isOutputSupportedForhNQ4ISI = i % 128;
        try {
            try {
                if (i % 2 == 0) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.security.Signature inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 809218401, (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (android.graphics.Color.alpha(0) + 125), (-12) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (-1437216510) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.os.Process.getGidForName("") + 128, "\u0086\u008b\u0082\u0091\u0097\u0088", objArr2);
                        cls.getMethod((java.lang.String) objArr2[0], byte[].class).invoke(inputSizeshNQ4ISI, bArr);
                        getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 51) % 128;
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((-809218402) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 126), android.view.KeyEvent.getDeadChar(0, 0) - 12, (-1437216509) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u009b\u0092\u008a\u0085", objArr4);
                            cls2.getMethod((java.lang.String) objArr4[0], null).invoke(inputSizeshNQ4ISI, null);
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            getInputFormats();
                            return currentTimeMillis2 - currentTimeMillis;
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
                }
                getInputSizeshNQ4ISI();
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th3) {
                getInputFormats();
                throw th3;
            }
        } catch (java.io.IOException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException e) {
            e.printStackTrace();
            getInputFormats();
            return 150L;
        }
    }

    private static java.security.Signature getInputSizeshNQ4ISI() throws java.security.KeyStoreException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.UnrecoverableEntryException, java.security.InvalidKeyException {
        java.security.Signature signature;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.argb(0, 0, 0, 0) - 809218402, (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (125 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), (-12) - android.view.KeyEvent.normalizeMetaState(0), (-1437216511) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        java.lang.String str = (java.lang.String) objArr2[0];
        int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
        int i = getOutputStallDuration + 25;
        isOutputSupportedForhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 5;
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(15 - indexOf, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 14, (char) (40992 - android.text.TextUtils.getTrimmedLength("")), objArr3);
            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
            getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 13) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.View.MeasureSpec.getMode(0) + 127, "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-809218425) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) android.view.KeyEvent.normalizeMetaState(0), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) - 15), android.os.Process.getGidForName("") - 11, (-1437216513) - android.text.TextUtils.getOffsetAfter("", 0), objArr5);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, intern);
            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 105) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr6);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.keyCodeFromString("") + 127, "\u0091\u0082\u008f\u0090", objArr7);
            cls2.getMethod((java.lang.String) objArr7[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777216, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 42337), objArr8);
            java.lang.String intern2 = ((java.lang.String) objArr8[0]).intern();
            getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 11) % 128;
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.resolveSize(0, 0), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr9);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u008c\u0089\u008b\u009b\u009a\u008b\u0086\u0092", objArr10);
            java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, intern2, null);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 809218270, (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-16777299) - android.graphics.Color.rgb(0, 0, 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 11, (-1437216510) - (android.os.Process.myPid() >> 22), objArr11);
            if (!java.lang.Class.forName((java.lang.String) objArr11[0]).isInstance(invoke2)) {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SUB, 1018 - android.view.View.MeasureSpec.getSize(0), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr12);
                throw new java.lang.RuntimeException(((java.lang.String) objArr12[0]).intern());
            }
            try {
                objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(13 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 125, (char) android.view.View.MeasureSpec.getSize(0), objArr);
            } catch (java.security.NoSuchAlgorithmException unused) {
                signature = null;
            }
            try {
                java.lang.Object[] objArr13 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Class<?> cls4 = java.lang.Class.forName(str);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-809218426) - android.view.View.getDefaultSize(0, 0), (short) android.graphics.Color.red(0), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) - 15), (-12) - android.view.View.resolveSizeAndState(0, 0, 0), (-1437216514) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr14);
                signature = (java.security.Signature) cls4.getMethod((java.lang.String) objArr14[0], java.lang.String.class).invoke(null, objArr13);
                if (signature != null) {
                    try {
                        try {
                            java.lang.Class<?> cls5 = java.lang.Class.forName(str);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.resolveSize(0, 0), "\u0089\u0086\u0091\u008a\u0083\u008f\u0089\u0093\u008b\u0086\u0092", objArr15);
                            cls5.getMethod((java.lang.String) objArr15[0], null).invoke(signature, null);
                            try {
                                java.lang.Class<?> cls6 = java.lang.Class.forName(str);
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0096\u0095\u008b\u008a\u0089\u008f\u0092\u0090\u0094\u008b\u0086\u0092", objArr16);
                                cls6.getMethod((java.lang.String) objArr16[0], null).invoke(signature, null);
                                isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 61) % 128;
                                try {
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 809218269, (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.os.Process.getGidForName("") - 82), (-12) - android.view.View.MeasureSpec.getMode(0), (-1437216509) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr17);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u008c\u0086\u008d\u0086\u008b\u0082\u0083\u008a\u0089\u0093\u008b\u0086\u0092", objArr18);
                                    try {
                                        java.lang.Object[] objArr19 = {cls7.getMethod((java.lang.String) objArr18[0], null).invoke(invoke2, null)};
                                        java.lang.Class<?> cls8 = java.lang.Class.forName(str);
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u009b\u0092\u008a\u008e\u008b\u008a\u009b\u008a", objArr20);
                                        java.lang.String str2 = (java.lang.String) objArr20[0];
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor((-809218232) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) (android.os.Process.getGidForName("") + 1), (byte) ((-6) - android.text.TextUtils.getTrimmedLength("")), (-12) - (android.os.Process.myPid() >> 22), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 1437216510, objArr21);
                                        cls8.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr21[0])).invoke(signature, objArr19);
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
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    } catch (java.security.InvalidKeyException e) {
                        if (e.getMessage() != null) {
                            java.lang.String message = e.getMessage();
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(70 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IDS_BASE_VALUE, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr22);
                            if (message.contains(((java.lang.String) objArr22[0]).intern())) {
                                e.getMessage();
                                signature = getHighSpeedVideoSizesFor();
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 809218269, (short) (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) ((-83) - android.view.KeyEvent.getDeadChar(0, 0)), (-12) - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.getCapsMode("", 0, 0) - 1437216510, objArr23);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0) + 127, "\u008c\u0086\u008d\u0086\u008b\u0082\u0083\u008a\u0089\u0093\u008b\u0086\u0092", objArr24);
                                java.lang.Object[] objArr25 = {cls9.getMethod((java.lang.String) objArr24[0], null).invoke(invoke2, null)};
                                java.lang.Class<?> cls10 = java.lang.Class.forName(str);
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, "\u009b\u0092\u008a\u008e\u008b\u008a\u009b\u008a", objArr26);
                                java.lang.String str3 = (java.lang.String) objArr26[0];
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 809218231, (short) android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 7), (-13) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) - 1437216510, objArr27);
                                cls10.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr27[0])).invoke(signature, objArr25);
                            }
                        }
                        e.getMessage();
                        java.lang.Object[] objArr232 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 809218269, (short) (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) ((-83) - android.view.KeyEvent.getDeadChar(0, 0)), (-12) - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.getCapsMode("", 0, 0) - 1437216510, objArr232);
                        java.lang.Class<?> cls92 = java.lang.Class.forName((java.lang.String) objArr232[0]);
                        java.lang.Object[] objArr242 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0) + 127, "\u008c\u0086\u008d\u0086\u008b\u0082\u0083\u008a\u0089\u0093\u008b\u0086\u0092", objArr242);
                        java.lang.Object[] objArr252 = {cls92.getMethod((java.lang.String) objArr242[0], null).invoke(invoke2, null)};
                        java.lang.Class<?> cls102 = java.lang.Class.forName(str);
                        java.lang.Object[] objArr262 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, "\u009b\u0092\u008a\u008e\u008b\u008a\u009b\u008a", objArr262);
                        java.lang.String str32 = (java.lang.String) objArr262[0];
                        java.lang.Object[] objArr272 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 809218231, (short) android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 7), (-13) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) - 1437216510, objArr272);
                        cls102.getMethod(str32, java.lang.Class.forName((java.lang.String) objArr272[0])).invoke(signature, objArr252);
                    }
                } else {
                    signature = getHighSpeedVideoSizesFor();
                    if (signature == null) {
                        throw new java.security.NoSuchAlgorithmException();
                    }
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-809218269) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (short) android.view.KeyEvent.keyCodeFromString(""), (byte) ((-83) - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 13, (-1437216510) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr28);
                    java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u008c\u0086\u008d\u0086\u008b\u0082\u0083\u008a\u0089\u0093\u008b\u0086\u0092", objArr29);
                    java.lang.Object invoke3 = cls11.getMethod((java.lang.String) objArr29[0], null).invoke(invoke2, null);
                    isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 79) % 128;
                    java.lang.Class<?> cls12 = java.lang.Class.forName(str);
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u009b\u0092\u008a\u008e\u008b\u008a\u009b\u008a", objArr30);
                    java.lang.String str4 = (java.lang.String) objArr30[0];
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-809218230) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 7), (-13) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1437216509, objArr31);
                    cls12.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr31[0])).invoke(signature, invoke3);
                }
                return signature;
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25609(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int length = (util.h.xy.v.ra.f2620.length() + 1) / 2;
        byte[] bArr = new byte[length];
        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 35) % 128;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) java.lang.Integer.parseInt(util.h.xy.v.ra.f2620.substring(i2, i2 + 2), 16);
        }
        int length2 = (util.h.xy.v.ra.f2616.length() + 1) / 2;
        byte[] bArr2 = new byte[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = i3 * 2;
            bArr2[i3] = (byte) java.lang.Integer.parseInt(util.h.xy.v.ra.f2616.substring(i4, i4 + 2), 16);
        }
        byte[] bArr3 = new byte[length];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            bArr3[i5] = (byte) (bArr[i6] ^ bArr2[i5 % length2]);
            i5++;
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 10, 1112 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (34716 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr);
        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern());
        byte[] outputMinFrameDuration = getOutputMinFrameDuration();
        int length3 = string.getBytes().length;
        int length4 = outputMinFrameDuration.length;
        byte[][] bArr4 = {bArr3, string.getBytes(), outputMinFrameDuration};
        byte[] bArr5 = new byte[length + length3 + length4];
        int i7 = 0;
        for (int i8 = 0; i8 < 3; i8++) {
            byte[] bArr6 = bArr4[i8];
            if (bArr6 != null) {
                getOutputStallDuration = (isOutputSupportedForhNQ4ISI + 45) % 128;
                java.lang.System.arraycopy(bArr6, 0, bArr5, i7, bArr6.length);
                i7 += bArr6.length;
            }
        }
        util.h.xy.ar.b.m25074(bArr3);
        util.h.xy.ar.b.m25098(string.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        util.h.xy.ar.b.m25074(outputMinFrameDuration);
        util.h.xy.ar.b.m25098(bArr5);
        return bArr5;
    }

    private static byte[] getOutputMinFrameDuration() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        android.security.keystore.KeyPermanentlyInvalidatedException keyPermanentlyInvalidatedException;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        synchronized (util.h.xy.br.mc.class) {
            isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 119) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.alpha(0) + 127, "\u0089\u0086\u0095\u0097\u008a\u0098\u0084\u008f\u008b\u0097\u008c\u0089\u0087\u0084¨\u0082\u0083\u0082\u0081", objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            byte[] bArr4 = f1034;
            if (bArr4 != null) {
                return bArr4;
            }
            try {
                try {
                    char c = f1035 == null ? (char) 1 : (char) 2;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(15 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 14 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (40991 - android.view.MotionEvent.axisFromString("")), objArr2);
                    try {
                        java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.View.MeasureSpec.getSize(0) + 127, "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr4);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) - 809218426, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (byte) ((-15) - android.text.TextUtils.getCapsMode("", 0, 0)), (-12) - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.getTrimmedLength("") - 1437216513, objArr5);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 79) % 128;
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(127 - (android.os.Process.myPid() >> 22), "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr6);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0091\u0082\u008f\u0090", objArr7);
                            cls2.getMethod((java.lang.String) objArr7[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 1122, (char) (5515 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr8);
                            try {
                                java.lang.Object[] objArr9 = {((java.lang.String) objArr8[0]).intern()};
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr10);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((-809218415) - android.view.View.getDefaultSize(0, 0), (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 50), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 13, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 1437216517, objArr11);
                                if (!((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr11[0], java.lang.String.class).invoke(invoke, objArr9)).booleanValue()) {
                                    try {
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(7 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1122, (char) (5515 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr12);
                                        util.h.xy.al.mc.m25014(((java.lang.String) objArr12[0]).intern());
                                    } catch (android.security.keystore.KeyPermanentlyInvalidatedException e) {
                                        keyPermanentlyInvalidatedException = e;
                                        bArr = null;
                                        try {
                                            f1035 = bArr;
                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1121, (char) (5515 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr13);
                                            util.h.xy.al.mc.m25013(((java.lang.String) objArr13[0]).intern());
                                        } catch (java.lang.Exception unused) {
                                        }
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(26 - android.text.TextUtils.getOffsetBefore("", 0), 1146 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (15627 - android.graphics.Color.green(0)), objArr14);
                                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr14[0]).intern(), keyPermanentlyInvalidatedException);
                                    }
                                }
                                try {
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 17, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1128, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37979), objArr15);
                                    try {
                                        java.lang.Object[] objArr16 = {((java.lang.String) objArr15[0]).intern()};
                                        java.lang.Class<?> cls4 = java.lang.Class.forName(str);
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(android.graphics.ImageFormat.getBitsPerPixel(0) - 809218425, (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) ((android.os.Process.myTid() >> 22) - 15), (-12) - android.view.View.MeasureSpec.getSize(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 1437216513, objArr17);
                                        java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr17[0], java.lang.String.class).invoke(null, objArr16);
                                        isOutputSupportedForhNQ4ISI = (getOutputStallDuration + 29) % 128;
                                        try {
                                            java.lang.Class<?> cls5 = java.lang.Class.forName(str);
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0089\u0086\u0091\u008a\u0083\u008f\u0089\u0093\u008b\u0086\u0092", objArr18);
                                            ((java.security.Provider) cls5.getMethod((java.lang.String) objArr18[0], null).invoke(invoke2, null)).getName();
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(7 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1121 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.KeyEvent.keyCodeFromString("") + 5515), objArr19);
                                            try {
                                                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern(), null};
                                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u0086\u0089\u008f\u008b\u008e\u008c\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr21);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 809218137, (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-103) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.os.Process.myPid() >> 22) - 12, (-1437216513) - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr22);
                                                javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) cls6.getMethod((java.lang.String) objArr22[0], java.lang.String.class, char[].class).invoke(invoke, objArr20);
                                                if (c == 1) {
                                                    int i = (isOutputSupportedForhNQ4ISI + 11) % 128;
                                                    getOutputStallDuration = i;
                                                    bArr3 = new byte[16];
                                                    isOutputSupportedForhNQ4ISI = (i + 1) % 128;
                                                    try {
                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((-809218131) - android.view.KeyEvent.getDeadChar(0, 0), (short) android.text.TextUtils.indexOf("", ""), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 95), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 12, android.text.TextUtils.indexOf("", "") - 1437216510, objArr23);
                                                        ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr23[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr3);
                                                        try {
                                                            java.lang.Object[] objArr24 = {1, secretKey};
                                                            java.lang.Class<?> cls7 = java.lang.Class.forName(str);
                                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u008b\u008a\u009b\u008a", objArr25);
                                                            java.lang.String str2 = (java.lang.String) objArr25[0];
                                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor((-809218105) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (101 - android.view.View.resolveSizeAndState(0, 0, 0)), android.text.TextUtils.getTrimmedLength("") - 12, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1437216511, objArr26);
                                                            cls7.getMethod(str2, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr26[0])).invoke(invoke2, objArr24);
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
                                                } else {
                                                    byte[] bArr5 = f1035;
                                                    int i2 = bArr5[0];
                                                    if (i2 == 0 && bArr5[1] == 0) {
                                                        int i3 = isOutputSupportedForhNQ4ISI + 13;
                                                        getOutputStallDuration = i3 % 128;
                                                        if (i3 % 2 == 0) {
                                                            byte[] bArr6 = new byte[1];
                                                            f1035 = bArr6;
                                                            return bArr6;
                                                        }
                                                        byte[] bArr7 = new byte[0];
                                                        f1035 = bArr7;
                                                        return bArr7;
                                                    }
                                                    byte[] bArr8 = new byte[i2];
                                                    int i4 = 0;
                                                    while (true) {
                                                        bArr2 = f1035;
                                                        if (i4 >= bArr2[0]) {
                                                            break;
                                                        }
                                                        bArr8[i4] = bArr2[i4 + 2];
                                                        i4++;
                                                    }
                                                    bArr3 = new byte[bArr2[1]];
                                                    int i5 = 0;
                                                    while (true) {
                                                        byte[] bArr9 = f1035;
                                                        if (i5 >= bArr9[1]) {
                                                            break;
                                                        }
                                                        bArr3[i5] = bArr9[bArr9[0] + 2 + i5];
                                                        i5++;
                                                    }
                                                    try {
                                                        java.lang.Object[] objArr27 = {128, bArr8};
                                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor(android.graphics.ImageFormat.getBitsPerPixel(0) - 809218087, (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) ((-58) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (-12) - android.graphics.Color.argb(0, 0, 0, 0), (-1437216509) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr28);
                                                        try {
                                                            java.lang.Object[] objArr29 = {2, secretKey, java.lang.Class.forName((java.lang.String) objArr28[0]).getDeclaredConstructor(java.lang.Integer.TYPE, byte[].class).newInstance(objArr27)};
                                                            java.lang.Class<?> cls8 = java.lang.Class.forName(str);
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            getHighResolutionOutputSizeshNQ4ISI(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u008b\u008a\u009b\u008a", objArr30);
                                                            java.lang.String str3 = (java.lang.String) objArr30[0];
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRangesFor((-809218105) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) android.text.TextUtils.indexOf("", "", 0, 0), (byte) (android.text.TextUtils.getTrimmedLength("") + 101), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 13, (-1437216510) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr31);
                                                            cls8.getMethod(str3, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr31[0]), java.security.spec.AlgorithmParameterSpec.class).invoke(invoke2, objArr29);
                                                        } catch (java.lang.Throwable th3) {
                                                            java.lang.Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        java.lang.Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                                try {
                                                    java.lang.Class<?> cls9 = java.lang.Class.forName(str);
                                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "\u0090\u0082\u009b\u008a©\u008f\u0091", objArr32);
                                                    byte[] bArr10 = (byte[]) cls9.getMethod((java.lang.String) objArr32[0], byte[].class).invoke(invoke2, bArr3);
                                                    if (c != 1) {
                                                        f1034 = bArr10;
                                                        int i6 = isOutputSupportedForhNQ4ISI + 21;
                                                        getOutputStallDuration = i6 % 128;
                                                        if (i6 % 2 != 0) {
                                                            return bArr10;
                                                        }
                                                        throw null;
                                                    }
                                                    int i7 = isOutputSupportedForhNQ4ISI;
                                                    getOutputStallDuration = (i7 + 55) % 128;
                                                    getOutputStallDuration = (i7 + 103) % 128;
                                                    try {
                                                        java.lang.Class<?> cls10 = java.lang.Class.forName(str);
                                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "«ª\u008b\u0086\u0092", objArr33);
                                                        byte[] bArr11 = (byte[]) cls10.getMethod((java.lang.String) objArr33[0], null).invoke(invoke2, null);
                                                        byte[] bArr12 = new byte[bArr10.length + bArr11.length + 2];
                                                        bArr12[0] = (byte) bArr11.length;
                                                        bArr12[1] = (byte) bArr10.length;
                                                        for (int i8 = 0; i8 < bArr11.length; i8++) {
                                                            bArr12[i8 + 2] = bArr11[i8];
                                                        }
                                                        int i9 = 0;
                                                        while (i9 < bArr10.length) {
                                                            int i10 = getOutputStallDuration + 75;
                                                            isOutputSupportedForhNQ4ISI = i10 % 128;
                                                            if (i10 % 2 != 0) {
                                                                bArr12[(bArr11.length >> i9) >>> 3] = bArr10[i9];
                                                                i9 += 35;
                                                            } else {
                                                                bArr12[bArr11.length + i9 + 2] = bArr10[i9];
                                                                i9++;
                                                            }
                                                        }
                                                        f1035 = bArr12;
                                                        return bArr3;
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    java.lang.Throwable cause6 = th6.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th6;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                java.lang.Throwable cause7 = th7.getCause();
                                                if (cause7 != null) {
                                                    throw cause7;
                                                }
                                                throw th7;
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            java.lang.Throwable cause8 = th8.getCause();
                                            if (cause8 != null) {
                                                throw cause8;
                                            }
                                            throw th8;
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        java.lang.Throwable cause9 = th9.getCause();
                                        if (cause9 != null) {
                                            throw cause9;
                                        }
                                        throw th9;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    java.lang.Throwable cause10 = th10.getCause();
                                    if (cause10 != null) {
                                        throw cause10;
                                    }
                                    throw th10;
                                }
                            } catch (java.lang.Throwable th11) {
                                java.lang.Throwable cause11 = th11.getCause();
                                if (cause11 != null) {
                                    throw cause11;
                                }
                                throw th11;
                            }
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause12 = th12.getCause();
                            if (cause12 != null) {
                                throw cause12;
                            }
                            throw th12;
                        }
                    } catch (java.lang.Throwable th13) {
                        java.lang.Throwable cause13 = th13.getCause();
                        if (cause13 != null) {
                            throw cause13;
                        }
                        throw th13;
                    }
                } catch (android.security.keystore.KeyPermanentlyInvalidatedException e2) {
                    keyPermanentlyInvalidatedException = e2;
                    bArr = null;
                }
            } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableKeyException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e3) {
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1172, (char) android.graphics.Color.blue(0), objArr34);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr34[0]).intern(), e3);
            }
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputStallDurationlomOqCM = new char[]{64160, 64185, 64148, 64236, 64171, 64165, 64187, 64149, 64168, 64161, 64170, 64145, 64195, 64203, 64175, 64162, 64186, 64167, 64206, 64217, 64166, 64173, 64174, 64219, 64214, 64197, 64172, 64179, 64194, 64164, 64211, 64163, 64250, 64216, 64218, 64200, 64144, 64169, 64184, 64150, 64196, 64193, 64180};
        getHighSpeedVideoFpsRanges = -1074857186;
        getHighSpeedVideoSizes = true;
        getOutputMinFrameDuration = true;
        getHighSpeedVideoSizesFor = -677730654;
        getOutputFormats = -408873005;
        getOutputSizeshNQ4ISI = -1307887440;
        getInputSizeshNQ4ISI = new byte[]{-40, 43, -36, 36, -60, 40, 44, com.google.common.base.Ascii.FF, -4, 38, -41, -38, 4, -18, -21, kotlin.io.encoding.Base64.padSymbol, -40, 19, 19, com.google.common.base.Ascii.RS, -5, 16, -23, com.google.common.base.Ascii.SUB, -44, 86, 88, -92, -74, 86, -94, 91, -77, Byte.MIN_VALUE, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -82, 82, 88, -73, 91, 87, -32, 104, 78, -80, 82, -43, 86, 82, -86, 64, 83, 74, -100, 69, 75, 76, -28, 84, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -90, -84, 67, -81, -93, com.google.common.base.Ascii.DC4, -100, -70, 68, -90, -41, -85, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 72, -113, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 72, -98, -85, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -88, 16, -32, 80, 94, -94, -88, 71, -85, -89, 16, -104, -66, 64, -94, -53, 83, -85, 67, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 93, -89, 89, 78, -123, 89, 88, 65, -121, 68, 74, 77, -27, 85, 91, -89, -83, 66, -82, -94, com.google.common.base.Ascii.NAK, -99, -69, 69, -89, -53, -123, 103, -118, -114, com.visa.cbp.getEncExpo.IResultReceiver, -119, -127, 118, 121, 86, 97, -50, 118, 121, 118, 65, -63, 113, Byte.MAX_VALUE, -125, -119, 102, -118, -122, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -71, -97, 97, -125, -61, 114, -117, 115, 92, -71, 97, 111, -109, -124, 102, -98, 120, -126, 87, 89, -54, -122, 118, -114, 84, -81, 97, 111, 104, com.visa.cbp.getEncExpo.startTransaction, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 126, -126, -120, 103, -117, -121, 48, -72, -98, com.visa.cbp.getEncExpo.IResultReceiver2, -126, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 56, -60, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -55, 47, -43, 0, 0, -105, 39, 41, -43, -33, 48, -36, -48, 103, -17, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -43, -54, -120, -124, 126, -125, 115, 123, 100, -109, -120, 113, -126, 100, -119, -115, -126, 113, 126, -118, -125, -120, 67, -72, 122, -123, 105, -106, 120, -123, -46, -124, 113, -115, -115, -120, -117, com.visa.cbp.getEncExpo.registerForActivityResult, 106, com.visa.cbp.getEncExpo.IResultReceiver, -114, 125, -116, Byte.MAX_VALUE, -113, -121, 125, -95, 89, -121, 122, -47, -17, com.google.common.base.Ascii.SUB, -26, -26, -29, -32, -14, 8, 16, com.google.common.base.Ascii.RS, -30, com.visa.cbp.getEncExpo.onUnminimized, 16, -28, com.google.common.base.Ascii.GS, -11, 60, -20, 17, 35, 85, 91, -106, 78, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -41, 70, -77, 78, -75, -73, 85, 75, 69, -86, 70, -86, -99, 13, -67, -77, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 69, -86, 70, 74, -3, 117, 83, -83, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -34, -87, -89, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 8, -72, -74, 74, 64, -81, 67, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -8, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 86, -88, 74, com.visa.cbp.getEncExpo.kernelVersion, -32, -21, 3, -1, 19, -17, 17, -26, 18, -15, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC4, -30, 7, -43, -32, -21, -29, 91, -95, -27, com.google.common.base.Ascii.SUB, -23, com.google.common.base.Ascii.EM, 17, 43, -88, 9, -11, com.google.common.base.Ascii.VT, -23};
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[1184];
        java.nio.ByteBuffer.wrap("9+h<\u009bkÊ\u0094}Ð¯.Þ~\u0001°°ãâ8\u0015\u0003DZ÷\u0080&Ü<`mv\u009e7ÏøxªªUÛ\u0013\u0004åµ\u008cçY\u0010HA&òâ#¶MZç\u0095¶\u0083EÂ\u0014\r£_q \u0000æß\u0010ny<¬Ë½\u009aÓ)\u0017øC\u0096¯%Áô\u0007\u0083JQ¹à\u009d¿ËN\u0018\u001d@«¤zù\t+Øz½ºì¬\u001fíN\"ùp+\u008fZÉ\u0085:4`f©\u0091\u0091\u0015ÈD×·\u008bæTQ?\u0083÷ò©-l\u009c\u0013Îø9Þh\u008eÛN\n\ndð×®+XzH\u0089\u0010ØÖo\u009b½cÌ?\u0013Õ¢\u008bðB\u0007o\u009cJÍV>\u001coÒØ¤\nr{3¤ü\u0015¦Gi°_á9RÈ\u0083\u009díL^\"\u008fþøº*fU§\u0004£÷ì¦9\u0011\\Ã\u008b²Üm/ÜO\u008e\u009dy»(å\u009cRÍp>2o\u0098ØÐ\n*{ ¤ç\u0015½Gh°iá!Rì{\u001f*\"Ùi\u0088º?Òí\u001e\u009cMC\u009fòÛ \u0017W)\u0006oµ¼dÐ\n'¹thª\u001fðÍ9|.#\u001fÒ\u0088\u0081\u00847\u000fæK\u0095\u0092DÝê\u0017\u0099/Hfÿ¯®ö\\3\u0003g²øaî\u00171Æ\bun$\u009fËûy\u0014(Mß\u0080\u008eß<8ã+\u0092gA£ðð¦\u001cUo\u0004²«ÝY\u0011\b=¿}n\u0099\u001dÀÃ6r`!÷Ðø\u0086\u001b5$äS\u008bº:\u008aè\u001b\u009fLN¼ý©£\u0014RJ\u0001L°\u0089gð\u0015:ÄOk\u0097\u001aÒÈ\u001e\u007fX.DÝ\u009e\u008cþ2Cái\u0090£Gúõn¤UK\u0018ú\u00ad©ð_M\u000e\u0004½¡lÂ\u0012\u0011ÁlpB'ËÖî\u0084I+pÚù\u0089õ?\u0019îd\u009dTL\u0091óö¡+P\\\u0007\u0083¶åd8\u000bwº\u0019i\u0087\u0018ÅÎ?}~,¹Óó\u008140Yçæ\u0096ÓEÉëJ\u009a\u001dIùøæ®%]Y\fã³\u0083bÒ\u00102Ç}v\u009e%³Ë$z()\u0083ØÝ\u008fÕ=<ìq\u0093ÿBÂðz§tV¶\u0005ª´ÌZI\tZ¸±oÌ\u001d\fÌps\u0082\"¶ÑÀ\u0087D6}å\u0097\u0094Ð:'éj\u0098³O¢þÍ¬%SX\u0002¾±ïg\u0012\u0016VÅ\u008ct\u0083\u001bÇÉ\txy/ÚÞÙ\u008c%3/âæ\u0091ß@åö\u000e¥`T\u009bû¼©\"X2\u000f\u008e¾¥mæ\u0013.ÂIq\u0093 ÿÖ\u0011\u0085N4£ÛÇ\u008a\u009a8\u0000ï\u0006\u009e§M¿ó\"¢iQè\u0000¢·ïe\u0000\u0014q»·jó\u0018\nÏE~\u009a-ñÜö\u0082&1Và©\u0097ãE8ôC\u009b\u0092J¡ùÝ¯'^M\r\u009d¼\u0088b%\u0011LÀ\u008ewù&ÿÔ\"{\f*\u009aÙö\u008f\u001e>cí¾\u009cÁBkñ\b zW\u0098\u0006â´>[U\n§¹ßo\u0002\u001e8Í\u0018|¹#âÑ+\u0080Q7¬æë\u0094g;:êO\u0099©Hìþ\u001c\u00adc\\\u008b\u0003×±z`\\\u0017LÆ\u009euÇ\u001b\bÊyy\u0089(ÍÞ\u000f\u008d%<uãÏ\u0092\u0083@\u0019÷f¦\u0083U§û\u001aª^Yw\b\u0090¿îm\u001e\u001c@ÃþrÞ \u000e×!\u0086n5\u0088äë\u008aH9{è\u0091\u009fîM\u0000ü#£`R¤\u0001é·\u0010f>\u0015®ÄÙj2\u0019bÈR\u007f´.\u0095Ü\\\u0083K2¼áú\u00970FuõY¤®KÈù\u000e¨D_\u008c\u000eÓ¼\u0010cp\u0012CÁ®pþ&\u0001Õb\u0084ù+ÓÙ\u0013\u0088c?Gî\u009c\u009d\u008fC8òA¡\u0099Pø\u0006oµod\u001e\u000bÐº\u0096h\u000e\u001f\tÎ½}ó#\u001aÒs\u0081\\0\u008eç\u0094\u0095\u001bDSë\u0096\u009a°H8ÿ`®´]Ü\fï²4aZ\u0010½Çóu\u0011$BË¥z\u008b)àß&\u008e@=®ìÿ\u0092vAJð\u009a§«Vç\u00041«|Zæ\t¿¿sn|\u001d£Ì\u009fs\u0096!\u0012ÐP\u0087\u008b6áäs\u008bK:\u009aéÚ\u0098×N\u0005ýJ¬¤SÑ\u0001n°]g\u00ad\u0016¶ÅÄk\u000f\u001a\fÉÛxú.\u0005Ýq\u008cà3\u0089âÌ\u0090ZG_ö·¥ÞKtúi©æXÕ\u000fø½\u0019lP\u0013ÄÂãpo'[Ö³\u0085þ4\u0099Ú-\u0089H8Åïö\u009d\u000bLióª¢¨Qä\u0007?¶ze®\u0014Ûº\u0000i6\u0018©ÏË~ç,)Ó\b\u0082¼1Ýç#\u0096vE¾ôÇ\u009bÄI\u0017øD¯\u008f^Ê\fx³Bb\u008f\u0011ÆÀèv*%GÔ\u008b{\u0088)\u001bØO\u008f\u008e>áíç\u0093\u001aB\u0010ñ\u008c åV%\u00057´\u0091[þ\t5¸=os\u001e\u008aÍôs\"\"pÑ¶\u0080ô6få\u0012\u0094{;¯êÖ\u0098;O6þª\u00adÓS3\u0002\u001d±d`³\u0017ÙÅ\u001atz\u001b´Êõxa/\u0004Þ\u0010\u008dº<Çâ\u0004\u0091H@ù÷þ¥gT\u0019û\u0013ªµYÈ\u000f%¾^mò\u001cÍÂ:q\u0004 \u0015×·\u0086Õ4=Ûk\u008a\u00929Ðï\u0010\u009e\nM\u0005ü\u0080£ÀQ\u0006\u0000`·µfÏ\u00147»XjH\u0019\u0088ÈÃ~7-dÜ\u0085\u0083ô1\u0016à@\u0097yF\u0088õ\u008a\u009b.Jgù\u0095¨ò^\u000e\ri¼^cÓ\u0012ËÀ\rwd&§Õ²{w*KÙ\u001f\u0088\u008e?èí!\u009csC¨òç ;W@\u0006\u0018µ\u0095dë\n\u0018¹\u0018h\u0087\u001fæÍ3|f#CÒ¨\u0081ö7\u0016æ\u0005\u0095\u0098Däêm\u0099}HXÿß®Ú\\4\u0003H²\u009daô\u0017\u0013Æduª$ßËéyL(\u0001ß¹\u008e¯<mãW\u0092¢A§ðÙ¦\u001fU\u0004\u0004ú«ÍYw\b^¿¦n§\u001d\u0096Ã%r\u001f!ùÐé\u0086\u00155{ää\u008b¯:Ìè>\u009f\fN¥ýÿ£9Ro\u0001¸°¶gÜ\u0015-ÄKk\u009a\u001aùÈ1\u007fz.¤Ý¦\u008cô2\u0013á\t\u0090¡Gæõ ¤ZKäúÆ©\u009d_\u0007\u000eP½\u0097l½\u0012 Áop¶'ÝÖò\u00840+kÚ´\u0089Þ?(îE\u009d¿LÅóÆ¡\u0007P{\u0007¢¶¿dp\u000bzº¶ià\u0018çÎ(}s,\u009aÓÏ\u0081;0Dçì\u0096£E\u009cë\u000e\u009aRI¼øä®\u001f]Y\f²³¢bà\u0010\u0011Ç\u000fv¶%ýËczu)´Ø¼\u008fÕ=Nìl\u0093±Béð\u0013§GV´\u0005Õ´ÀZ:\t\u0011¸ÌoÖ\u001d\u0007Ì]s\u00ad\"ÍÐ\u001e\u0087:6Må\u008a\u0094ã:\u001bé3\u0098¯OÉý#¬GSs\u0002\u008a±\u0084g<\u0016\\ÅótÖ\u001a\u0005É-xB/\u0088ÞÛ\u008c53yâ\u008c\u0091ÀG\u0004ö\"¥`TÓûà©4XJ\u000fð¾ªl`\u0013\u0016Â\u001cq¨ ëÖ\u001b\u0085~4\u008bÛú\u0089a8\u0002ïF\u009e\u008dMòó\u0013¢eQó\u0000Û¶ae)\u0014Z»\u0096jÛ\u0018GÏo~\u0083-þÓ2\u0082V1IàÕ\u0097þE;ô\u007f\u009b\u008aJøø ¯\"^@\r»\u009cSÍk>2\u009cRÍp>2o\u0087Ø×\n){a\u0081\u009cÐ\u0084#ðr\u0018ÅR\u0017«fí¹3\b}\u0098\u0090É²:ñk8Ü\u0015\u000e\u008d\u007f÷ +\u0011lC¨´\u0094åÔØ)\u0089\u000bzH+\u0081\u009c¬\u009cQÍJ>\u001coÈØ\u0089\ny{:¤®\u0015 Gn°\u001bá\u0000RÈ\u0083\u0090ím^?\u008fôø¾*j\u009bTÄ\u00125\u008cf\u008cÐ{\u0001 \u009cRÍM>\u0003oÚØ\u0089\nu{2¤ê\u0015éGk°^á\u000bR\u008d\u0083Ìí~^8\u008fõøº*l\u009bSÄ\u00115\u0082f\u0094Ð{\u0001:rå£¹\rk~I¯\r\u0018\u0081I\u008d»Dä!Uà\u0086¾ðj!N\u0092\u0012Ã\u0080,¨\u009eNÏ?8ài¢Ûm\u0004[u=¦Ô\u0017\u0091Ap².ãúL¾¾bïlX*\u0089ñú»$P\u00954Æâ7®arÒ$\u00033lÖÝ\u0093\u000f\f\u001büJÊ¹\u008bèD_\u0016\u008déü¯#M\u0092<Àø\u0089áØÙ+\u009ezEÍ\u000b\u001fún¾\b\u001cY!ª|ûÙLþ\u009e\u0003ïF0ý\u0081ÛÓ3$7uOÆ\u0095\u0017Üy*Êd\u001bª¡Aðv\u0003!Ròåº7XF\u000e\u0099À(\u009dzB\u008d~Ü/oç¾£Ð]c\u0019²ÛÅ\u0097\u0017M¦uù!\bâ[¾íG<\u001dOÉ\u009cBÍq>#oâØ \nN{\b¤Ë\u0015\u009bGR°tá ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1184);
        getValidOutputFormatsForInputhNQ4ISI = cArr;
        Camera2StreamConfigurationMap = -6351042938344911560L;
    }
}
