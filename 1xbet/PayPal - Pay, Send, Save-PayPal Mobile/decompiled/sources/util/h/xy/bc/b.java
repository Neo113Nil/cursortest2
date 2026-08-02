package util.h.xy.bc;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static char[] getInputFormats;
    private static int getOutputFormats;
    private static char[] getOutputMinFrameDuration;
    private final util.h.xy.bc.ma getInputSizeshNQ4ISI;
    private java.net.HttpURLConnection getOutputStallDurationlomOqCM;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges = util.h.xy.bc.b.class.getName();
        getHighSpeedVideoSizesFor = util.h.xy.bc.b.class.getName();
        if (((java.net.CookieManager) java.net.CookieHandler.getDefault()) == null) {
            java.net.CookieHandler.setDefault(new java.net.CookieManager(null, java.net.CookiePolicy.ACCEPT_ALL));
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 79) % 128;
        }
        int i = getOutputFormats + 25;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.bc.b m25369() {
        util.h.xy.bc.b bVar = new util.h.xy.bc.b();
        int i = getHighResolutionOutputSizeshNQ4ISI + 119;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private b() {
        this(new util.h.xy.bc.ma(new util.h.xy.bc.ma.b[0]));
    }

    private b(util.h.xy.bc.ma maVar) {
        this.getInputSizeshNQ4ISI = maVar;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.az.ra m25370(util.h.xy.az.b bVar) throws util.h.xy.az.ma {
        if (!util.h.xy.bh.mb.m25472()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{0, 34, 79, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr);
            throw new util.h.xy.az.ma(((java.lang.String) objArr[0]).intern(), 5);
        }
        try {
            try {
                try {
                    try {
                        java.net.URL m25263 = bVar.m25263();
                        java.lang.String protocol = m25263.getProtocol();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((byte) (android.view.View.MeasureSpec.getSize(0) + 3), "\u0018\u0003\u0004\f㗬", android.view.View.getDefaultSize(0, 0) + 5, objArr2);
                        if (!((java.lang.String) objArr2[0]).intern().equals(protocol)) {
                            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 67) % 128;
                            if (!this.getInputSizeshNQ4ISI.m25371(util.h.xy.bc.ma.b.f920)) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (-android.widget.ExpandableListView.getPackedPositionChild(0L)), "\u0001\u0014\u001f\f \u0002\u0001\u0011 \u0019\r\u0019\u0019\u0013\u0018\u0002\r\b\u0012\u001f #\u0001\u0011\u0001\u0019\u0006\u0001 #㗷㗷\n\u0019\u000e\u0010", android.view.View.resolveSizeAndState(0, 0, 0) + 36, objArr3);
                                throw new util.h.xy.az.ma(((java.lang.String) objArr3[0]).intern(), 3);
                            }
                        }
                        int i = getHighResolutionOutputSizeshNQ4ISI + 119;
                        getOutputFormats = i % 128;
                        if (i % 2 != 0) {
                            throw new java.lang.NullPointerException();
                        }
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(true, new int[]{34, 14, 56, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000", objArr4);
                        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(true, new int[]{48, 5, 0, 0}, "\u0001\u0000\u0001\u0001\u0001", objArr5);
                        java.lang.System.setProperty(intern, ((java.lang.String) objArr5[0]).intern());
                        this.getOutputStallDurationlomOqCM = (java.net.HttpURLConnection) m25263.openConnection();
                        getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM, bVar.m25257().toString(), getHighResolutionOutputSizeshNQ4ISI(), getHighSpeedVideoFpsRanges());
                        util.h.xy.au.mf.m25169().m25188(bVar);
                        getHighSpeedVideoFpsRanges(bVar.m25259());
                        this.getOutputStallDurationlomOqCM.getRequestProperties();
                        getHighSpeedVideoFpsRanges(bVar);
                        bVar.m25257();
                        this.getOutputStallDurationlomOqCM.connect();
                        util.h.xy.az.ra raVar = new util.h.xy.az.ra(this.getOutputStallDurationlomOqCM);
                        raVar.m25279();
                        java.net.HttpURLConnection httpURLConnection = this.getOutputStallDurationlomOqCM;
                        if (httpURLConnection != null) {
                            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 15) % 128;
                            httpURLConnection.disconnect();
                            this.getOutputStallDurationlomOqCM = null;
                        }
                        raVar.m25281();
                        return raVar;
                    } catch (javax.net.ssl.SSLHandshakeException e) {
                        e.printStackTrace();
                        e.getMessage();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(false, new int[]{53, 44, 111, 28}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr6);
                        sb.append(((java.lang.String) objArr6[0]).intern());
                        sb.append(e);
                        throw new util.h.xy.az.ma(sb.toString(), 3);
                    }
                } catch (util.h.xy.az.ma e2) {
                    e2.printStackTrace();
                    e2.getMessage();
                    throw e2;
                }
            } catch (java.net.SocketTimeoutException e3) {
                e3.printStackTrace();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{53, 44, 111, 28}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr7);
                sb2.append(((java.lang.String) objArr7[0]).intern());
                sb2.append(e3);
                throw new util.h.xy.az.ma(sb2.toString(), 4);
            } catch (java.io.IOException e4) {
                e4.printStackTrace();
                e4.getMessage();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{53, 44, 111, 28}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr8);
                sb3.append(((java.lang.String) objArr8[0]).intern());
                sb3.append(e4);
                throw new util.h.xy.az.ma(sb3.toString(), 3);
            }
        } catch (java.lang.Throwable th) {
            java.net.HttpURLConnection httpURLConnection2 = this.getOutputStallDurationlomOqCM;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.getOutputStallDurationlomOqCM = null;
                int i2 = getOutputFormats + 39;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 / 4;
                }
            }
            throw th;
        }
    }

    private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 7) % 128;
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            int i6 = getHighSpeedVideoFpsRangesFor + 1;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                char[] cArr5 = new char[i2];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 1, i2);
                java.lang.System.arraycopy(cArr5, 0, cArr3, i2 << i4, i4);
                java.lang.System.arraycopy(cArr5, i4, cArr3, 1, i2 % i4);
            } else {
                char[] cArr6 = new char[i2];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i2);
                int i7 = i2 - i4;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i7, i4);
                java.lang.System.arraycopy(cArr6, i4, cArr3, 0, i7);
            }
        }
        if (z) {
            char[] cArr7 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 95) % 128;
                cArr7[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr7;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 21) % 128;
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @util.h.xy.a.a
    private void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> map) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 69;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                this.getOutputStallDurationlomOqCM.setRequestProperty(entry.getKey(), entry.getValue());
            }
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 71) % 128;
            return;
        }
        map.entrySet().iterator();
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizes);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 13) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 25) % 128;
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 17) % 128;
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @util.h.xy.a.a
    private void getHighSpeedVideoFpsRanges(util.h.xy.az.b bVar) {
        java.io.OutputStream outputStream;
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        if (bVar.m25262()) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 55;
            getOutputFormats = i % 128;
            java.io.OutputStream outputStream2 = null;
            try {
                try {
                    if (i % 2 == 0) {
                        this.getOutputStallDurationlomOqCM.setFixedLengthStreamingMode(bVar.m25260());
                        outputStream2 = this.getOutputStallDurationlomOqCM.getOutputStream();
                        bVar.m25261(outputStream2);
                        outputStream2.flush();
                    } else {
                        this.getOutputStallDurationlomOqCM.setFixedLengthStreamingMode(bVar.m25260());
                        outputStream = this.getOutputStallDurationlomOqCM.getOutputStream();
                        try {
                            bVar.m25261(outputStream);
                            outputStream.flush();
                            util.h.xy.az.c.m25265(outputStream);
                            throw null;
                        } catch (java.io.IOException | java.lang.ArrayIndexOutOfBoundsException | java.nio.BufferOverflowException | java.lang.Exception unused) {
                            outputStream2 = outputStream;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            util.h.xy.az.c.m25265(outputStream);
                            throw th;
                        }
                    }
                } catch (java.io.IOException | java.lang.ArrayIndexOutOfBoundsException | java.nio.BufferOverflowException | java.lang.Exception unused2) {
                }
                util.h.xy.az.c.m25265(outputStream2);
            } catch (java.lang.Throwable th2) {
                th = th2;
                outputStream = outputStream2;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 39) % 128;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.net.HttpURLConnection httpURLConnection, java.lang.String str, int i, int i2) throws java.net.ProtocolException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2), "\u0018\u0003\u0004\f㗬", android.text.TextUtils.getOffsetBefore("", 0) + 5, objArr);
        boolean equals = ((java.lang.String) objArr[0]).intern().equals(httpURLConnection.getURL().getProtocol());
        if (!equals) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (52 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), "\u0003\t\u0002\t\u001f \u000e\u001e\u0000\u0006!\u0013\u0013\u0001!\u001f\u000e\u0010 \r\u0019\u0001\u001d\u0005\u0017\"\u0005\u0002\u001e \u0014!\u0011\u001a㘱", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 36, objArr2);
                throw new java.net.ProtocolException(((java.lang.String) objArr2[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (equals) {
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) httpURLConnection;
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 117) % 128;
            httpsURLConnection.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 73;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            try {
                httpsURLConnection.setSSLSocketFactory(new util.h.xy.bc.ra(getHighSpeedVideoSizes().getSocketFactory()));
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 41;
                getOutputFormats = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } catch (util.h.xy.az.ma unused) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 63), "\u0016\u001e\u0011\u001a\u001e\u0001\r\u0001\u001f\f\u0002\u001e㘩", android.view.KeyEvent.keyCodeFromString("") + 13, objArr3);
                throw new java.net.ProtocolException(((java.lang.String) objArr3[0]).intern());
            }
        }
        httpURLConnection.setConnectTimeout(i2);
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(str);
        if (str != null && util.h.xy.az.b.EnumC0259b.f912.toString().equalsIgnoreCase(str)) {
            this.getOutputStallDurationlomOqCM.setDoOutput(true);
        }
        java.net.HttpURLConnection httpURLConnection2 = this.getOutputStallDurationlomOqCM;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 63), "\u0019\b㘲㘲\u000e\u0019\u0002\f\r\u0019", 10 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(true, new int[]{97, 5, 188, 0}, "\u0001\u0000\u0000\u0001\u0001", objArr5);
        httpURLConnection2.setRequestProperty(intern, ((java.lang.String) objArr5[0]).intern());
    }

    @util.h.xy.a.a
    private static javax.net.ssl.SSLContext getHighSpeedVideoSizes() throws util.h.xy.az.ma {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{102, 3, 2, 0}, "\u0000\u0000\u0001", objArr);
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance(((java.lang.String) objArr[0]).intern());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(util.h.xy.bc.a.getHighSpeedVideoFpsRanges);
            arrayList.add(util.h.xy.bc.a.getHighSpeedVideoFpsRangesFor);
            util.h.xy.df.mb.a aVar = new util.h.xy.df.mb.a();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{105, 17, 0, 16}, "\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
            sSLContext.init(null, new javax.net.ssl.TrustManager[]{new util.h.xy.df.a(aVar.m26275(((java.lang.String) objArr2[0]).intern(), arrayList).m26274())}, null);
            return sSLContext;
        } catch (java.security.KeyManagementException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.view.KeyEvent.normalizeMetaState(0) + 75), "\u0016\u001e\u0011\u001a\u000e\u0010\u001e\u0001\r\u0001\u001f\u0013\u0001\u001e\u0019\u000e\u0000\u0001\u000f\f\u0014 \u001e\u0004㙊", 26 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(e);
            throw new util.h.xy.az.ma(sb.toString(), 3);
        } catch (java.security.KeyStoreException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (75 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "\u0016\u001e\u0011\u001a\u000e\u0010\u001e\u0001\r\u0001\u001f\u0013\u0001\u001e\u0019\u000e\u0000\u0001\u000f\f\u0014 \u001e\u0004㙊", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25, objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            sb2.append(e2);
            throw new util.h.xy.az.ma(sb2.toString(), 3);
        } catch (java.security.NoSuchAlgorithmException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 75), "\u0016\u001e\u0011\u001a\u000e\u0010\u001e\u0001\r\u0001\u001f\u0013\u0001\u001e\u0019\u000e\u0000\u0001\u000f\f\u0014 \u001e\u0004㙊", 25 - android.text.TextUtils.indexOf("", ""), objArr5);
                sb3.append(((java.lang.String) objArr5[0]).intern());
                sb3.append(e3);
                throw new util.h.xy.az.ma(sb3.toString(), 3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 73;
        getOutputFormats = i % 128;
        try {
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (i % 2 == 0) {
            if (util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876) != null) {
                return ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25210();
            }
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 11) % 128;
            return 10000;
        }
        util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876);
        throw null;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        try {
            if (util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876) == null) {
                return 10000;
            }
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
            return ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25209();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 10000;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputFormats = new char[]{42353, 42294, 42432, 42464, 42470, 42464, 42471, 42478, 42469, 42464, 42464, 42469, 42445, 42450, 42450, 42444, 42474, 42472, 42475, 42440, 42443, 42397, 42436, 42436, 42470, 42469, 42466, 42471, 42470, 42397, 42471, 42446, 42443, 42480, 42259, 42488, 42490, 42495, 42435, 42493, 42495, 42432, 42493, 42457, 42458, 42487, 42481, 42491, 42351, 42289, 42290, 42299, 42302, 42266, 42471, 42371, 42378, 42372, 42378, 42476, 42469, 42374, 42373, 42373, 42376, 42375, 42372, 42479, 42468, 42368, 42376, 42476, 42469, 42375, 42375, 42431, 42369, 42374, 42431, 42397, 42454, 42440, 42389, 42368, 42368, 42373, 42382, 42375, 42368, 42374, 42368, 42475, 42476, 42375, 42428, 42370, 42370, 42445, 42101, 42096, 42100, 42110, 42358, 42255, 42252, 42312, 42353, 42252, 42291, 42297, 42299, 42293, 42289, 42294, 42298, 42288, 42287, 42289, 42260, 42262, 42289, 42257};
        getOutputMinFrameDuration = new char[]{41896, 41871, 41865, 41864, 41885, 41902, 41030, 41907, 41868, 41910, 41911, 41031, 41905, 41913, 41909, 41912, 41900, 41914, 41882, 41906, 41028, 41918, 41872, 41870, 41916, 41915, 41919, 41908, 41899, 41904, 41903, 41980, 41897, 41876, 41917, 41881};
        getHighSpeedVideoSizes = (char) 38464;
    }
}
