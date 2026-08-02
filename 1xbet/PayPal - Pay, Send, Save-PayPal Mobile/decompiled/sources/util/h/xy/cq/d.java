package util.h.xy.cq;

/* loaded from: classes5.dex */
final class d extends javax.net.ssl.HttpsURLConnection {
    private static boolean Camera2StreamConfigurationMap = false;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static boolean getOutputFormats;
    private static int[] getOutputMinFrameDuration;
    private final javax.net.ssl.HttpsURLConnection getOutputMinFrameDurationlomOqCM;
    private util.h.xy.cn.rb getOutputSizes;
    private final util.h.xy.cq.me getOutputSizeshNQ4ISI;
    private final java.io.ByteArrayOutputStream getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;

    static {
        getHighSpeedVideoSizes();
        getInputSizeshNQ4ISI = util.h.xy.cq.d.class.getName();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 17) % 128;
    }

    public d(java.net.URL url, util.h.xy.cq.me meVar) throws java.io.IOException {
        super(url);
        this.getOutputStallDurationlomOqCM = false;
        this.getOutputStallDuration = new java.io.ByteArrayOutputStream();
        this.getOutputMinFrameDurationlomOqCM = (javax.net.ssl.HttpsURLConnection) url.openConnection();
        this.getOutputSizeshNQ4ISI = meVar;
        this.getOutputSizes = new util.h.xy.cn.rb(new util.h.xy.cn.rb.ra[0]);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        int i4 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getOutputMinFrameDuration;
        if (iArr3 != null) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 3;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
                iArr2[i6] = (int) (iArr3[i6] ^ (-5569649899877129369L));
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputMinFrameDuration;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = getHighSpeedVideoSizes + 77;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % i4 == 0) {
                    i3 = length2;
                    iArr6[i7] = (int) (iArr5[i7] * (-5569649899877129369L));
                    i7 <<= 1;
                } else {
                    i3 = length2;
                    iArr6[i7] = (int) (iArr5[i7] ^ (-5569649899877129369L));
                    i7++;
                }
                length2 = i3;
                i4 = 2;
            }
            i2 = length2;
            iArr5 = iArr6;
        } else {
            i2 = length2;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, i2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i9 = 0; i9 < 16; i9++) {
                cVar.f2627 ^= iArr4[i9];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i10 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i10;
            }
            int i11 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i11;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i12 = cVar.f2627;
            int i13 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0093\u0092\u0091\u0090\u008f\u0087\u008e\u008d\u0087\u0086\u0082\u0083\u008c\u0085\u008b\u008b\u008a\u0089\u0087\u0083\u0085\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new java.lang.UnsupportedOperationException(((java.lang.String) objArr[0]).intern());
    }

    @Override // java.net.URLConnection
    public final java.io.OutputStream getOutputStream() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 83;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges();
            throw null;
        }
        java.io.OutputStream highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int i2 = getHighSpeedVideoSizesFor + 17;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    @Override // java.net.URLConnection
    public final void connect() throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 75;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap();
            int i2 = getHighSpeedVideoSizesFor + 83;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        Camera2StreamConfigurationMap();
        throw null;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(java.lang.String str, java.lang.String str2) {
        int i = (getHighSpeedVideoFpsRanges + 59) % 128;
        getHighSpeedVideoSizesFor = i;
        getHighSpeedVideoFpsRanges = (i + 69) % 128;
        java.lang.String trim = str.trim();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0088\u0085¤\u0083¢«¤\u008c\u0085\u0084\u0083\u008a\u0090", objArr);
        if (trim.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0087®\u0088¤\u008e\u00ad¤\u0086\u0085\u0081", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(str);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0086\u0082¯\u0085££¢\u0087\u0083\u0085\u0088\u0087\u0089¤\u0087\u0093\u0092\u0091\u0090\u008f\u0087\u008e\u008d\u0087\u0086\u0082\u0089\u008a\u0087\u0089¤\u0087\u0084¥¤\u0084¯\u0087", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM.setRequestProperty(str, str2);
        int i2 = getHighSpeedVideoSizesFor + 13;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 31;
        getHighSpeedVideoSizesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0093\u0092\u0091\u0090\u008f\u0087\u008e\u008d\u0087\u0086\u0082\u0083\u008c\u0085\u008b\u008b\u008a\u0089\u0087\u0083\u0085\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new java.lang.UnsupportedOperationException(((java.lang.String) objArr[0]).intern());
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.lang.String getCipherSuite() {
        int i = getHighSpeedVideoSizesFor + 15;
        getHighSpeedVideoFpsRanges = i % 128;
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 == 0) {
            return httpsURLConnection.getCipherSuite();
        }
        httpsURLConnection.getCipherSuite();
        throw null;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.cert.Certificate[] getLocalCertificates() {
        int i = getHighSpeedVideoFpsRanges + 33;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            this.getOutputMinFrameDurationlomOqCM.getLocalCertificates();
            throw null;
        }
        java.security.cert.Certificate[] localCertificates = this.getOutputMinFrameDurationlomOqCM.getLocalCertificates();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 125) % 128;
        return localCertificates;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.cert.Certificate[] getServerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 37) % 128;
        java.security.cert.Certificate[] serverCertificates = this.getOutputMinFrameDurationlomOqCM.getServerCertificates();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 11) % 128;
        return serverCertificates;
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        int i = getHighSpeedVideoSizesFor + 27;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            this.getOutputMinFrameDurationlomOqCM.disconnect();
        } else {
            this.getOutputMinFrameDurationlomOqCM.disconnect();
            throw null;
        }
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 45) % 128;
        boolean usingProxy = this.getOutputMinFrameDurationlomOqCM.usingProxy();
        int i = getHighSpeedVideoFpsRanges + 11;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return usingProxy;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(java.lang.String str) throws java.net.ProtocolException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 97) % 128;
        this.getOutputMinFrameDurationlomOqCM.setRequestMethod(str);
        int i = getHighSpeedVideoSizesFor + 29;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRanges = (i + 57) % 128;
        getHighSpeedVideoFpsRanges = (i + 23) % 128;
        java.lang.String trim = str.trim();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0088\u0085¤\u0083¢«¤\u008c\u0085\u0084\u0083\u008a\u0090", objArr);
        if (!trim.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            this.getOutputMinFrameDurationlomOqCM.addRequestProperty(str, str2);
            int i2 = (getHighSpeedVideoSizesFor + 23) % 128;
            getHighSpeedVideoFpsRanges = i2;
            getHighSpeedVideoSizesFor = (i2 + 57) % 128;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0087®\u0088¤\u008e\u00ad¤\u0086\u0085\u0081", objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(str);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0086\u0082¯\u0085££¢\u0087\u0083\u0085\u0088\u0087\u0089¤\u0087\u0093\u0092\u0091\u0090\u008f\u0087\u008e\u008d\u0087\u0086\u0082\u0089\u008a\u0087\u0089¤\u0087\u0084¥¤\u0084¯\u0087", objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 53) % 128;
        this.getOutputMinFrameDurationlomOqCM.setReadTimeout(i);
        int i2 = getHighSpeedVideoFpsRanges + 59;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 103) % 128;
        this.getOutputMinFrameDurationlomOqCM.setConnectTimeout(i);
        int i2 = getHighSpeedVideoSizesFor + 125;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoSizesFor = i % 128;
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 != 0) {
            return httpsURLConnection.getAllowUserInteraction();
        }
        httpsURLConnection.getAllowUserInteraction();
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 121;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 79;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                } else {
                    cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                    i3++;
                }
            }
            cArr = cArr2;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (!Camera2StreamConfigurationMap) {
            if (!getOutputFormats) {
                throw null;
            }
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 87) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 63) % 128;
        int connectTimeout = this.getOutputMinFrameDurationlomOqCM.getConnectTimeout();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 85) % 128;
        return connectTimeout;
    }

    @Override // java.net.URLConnection
    public final java.lang.Object getContent() throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 11;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap();
            java.lang.Object content = this.getOutputMinFrameDurationlomOqCM.getContent();
            int i2 = getHighSpeedVideoFpsRanges + 81;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                return content;
            }
            throw new java.lang.ArithmeticException();
        }
        Camera2StreamConfigurationMap();
        this.getOutputMinFrameDurationlomOqCM.getContent();
        throw null;
    }

    @Override // java.net.URLConnection
    public final java.lang.Object getContent(java.lang.Class[] clsArr) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 43;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            java.lang.Object content = this.getOutputMinFrameDurationlomOqCM.getContent(clsArr);
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 93) % 128;
            return content;
        }
        Camera2StreamConfigurationMap();
        this.getOutputMinFrameDurationlomOqCM.getContent(clsArr);
        throw null;
    }

    @Override // java.net.URLConnection
    public final java.lang.String getContentEncoding() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 89) % 128;
        try {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
        } catch (java.io.IOException unused) {
        }
        return this.getOutputMinFrameDurationlomOqCM.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        int i = getHighSpeedVideoSizesFor + 13;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap();
            int contentLength = this.getOutputMinFrameDurationlomOqCM.getContentLength();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 25) % 128;
            return contentLength;
        }
        Camera2StreamConfigurationMap();
        throw new java.lang.NullPointerException();
    }

    @Override // java.net.URLConnection
    public final java.lang.String getContentType() {
        int i = getHighSpeedVideoFpsRanges + 89;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            java.lang.String contentType = this.getOutputMinFrameDurationlomOqCM.getContentType();
            int i2 = getHighSpeedVideoSizesFor + 83;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                return contentType;
            }
            throw new java.lang.ArithmeticException();
        }
        Camera2StreamConfigurationMap();
        throw null;
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        int i = getHighSpeedVideoSizesFor + 125;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap();
            return this.getOutputMinFrameDurationlomOqCM.getDate();
        }
        Camera2StreamConfigurationMap();
        throw null;
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 37) % 128;
        boolean defaultUseCaches = this.getOutputMinFrameDurationlomOqCM.getDefaultUseCaches();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 19) % 128;
        return defaultUseCaches;
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 45) % 128;
        boolean doInput = this.getOutputMinFrameDurationlomOqCM.getDoInput();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
        return doInput;
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        int i = getHighSpeedVideoSizesFor + 71;
        getHighSpeedVideoFpsRanges = i % 128;
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 == 0) {
            return httpsURLConnection.getDoOutput();
        }
        httpsURLConnection.getDoOutput();
        throw null;
    }

    @Override // java.net.HttpURLConnection
    public final java.io.InputStream getErrorStream() {
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0091\u0099\u0093\u0098\u0097\u0096\u0095\u0090\u0094", objArr);
        java.lang.String decode = android.net.Uri.decode(httpsURLConnection.getHeaderField(((java.lang.String) objArr[0]).intern()));
        byte[] bArr = null;
        if (decode != null) {
            int i = getHighSpeedVideoFpsRanges + 19;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                if (!decode.isEmpty()) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 67) % 128;
                    bArr = util.h.xy.fa.mb.m26811(decode.getBytes());
                }
            } else {
                throw null;
            }
        }
        return new util.h.xy.cq.re(this.getOutputMinFrameDurationlomOqCM.getErrorStream(), this.getOutputSizeshNQ4ISI, bArr);
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        int i = getHighSpeedVideoSizesFor + 73;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 3) % 128;
            return this.getOutputMinFrameDurationlomOqCM.getExpiration();
        }
        Camera2StreamConfigurationMap();
        throw new java.lang.NullPointerException();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderField(int i) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 53) % 128;
        try {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 73) % 128;
        } catch (java.io.IOException unused) {
        }
        return this.getOutputMinFrameDurationlomOqCM.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public final java.lang.String getHeaderField(java.lang.String str) {
        try {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 3) % 128;
        } catch (java.io.IOException unused) {
        }
        java.lang.String headerField = this.getOutputMinFrameDurationlomOqCM.getHeaderField(str);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 15) % 128;
        return headerField;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(java.lang.String str, long j) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 35) % 128;
        try {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 79) % 128;
        } catch (java.io.IOException unused) {
        }
        return this.getOutputMinFrameDurationlomOqCM.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(java.lang.String str, int i) {
        int i2 = getHighSpeedVideoSizesFor + 11;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            Camera2StreamConfigurationMap();
            int headerFieldInt = this.getOutputMinFrameDurationlomOqCM.getHeaderFieldInt(str, i);
            int i3 = getHighSpeedVideoFpsRanges + 93;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 != 0) {
                return headerFieldInt;
            }
            throw new java.lang.ArithmeticException();
        }
        Camera2StreamConfigurationMap();
        throw null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderFieldKey(int i) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 59) % 128;
        try {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 1) % 128;
        } catch (java.io.IOException unused) {
        }
        return this.getOutputMinFrameDurationlomOqCM.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() {
        int i = getHighSpeedVideoFpsRanges + 91;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = this.getOutputMinFrameDurationlomOqCM.getHeaderFields();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 79) % 128;
            return headerFields;
        }
        Camera2StreamConfigurationMap();
        throw new java.lang.NullPointerException();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
        int i = getHighSpeedVideoFpsRanges + 63;
        getHighSpeedVideoSizesFor = i % 128;
        javax.net.ssl.HostnameVerifier hostnameVerifier = this.getOutputMinFrameDurationlomOqCM.getHostnameVerifier();
        if (i % 2 != 0) {
            return hostnameVerifier;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 35) % 128;
        long ifModifiedSince = this.getOutputMinFrameDurationlomOqCM.getIfModifiedSince();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 109) % 128;
        return ifModifiedSince;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        r1 = util.h.xy.cq.d.getHighSpeedVideoSizesFor + 97;
        util.h.xy.cq.d.getHighSpeedVideoFpsRanges = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r0.isEmpty() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r4 = util.h.xy.fa.mb.m26811(r0.getBytes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // java.net.URLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.InputStream getInputStream() throws java.io.IOException {
        java.lang.String decode;
        int i = getHighSpeedVideoSizesFor + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        byte[] bArr = null;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getDoubleTapTimeout() >>> 80) + 15, "\u0091\u0099\u0093\u0098\u0097\u0096\u0095\u0090\u0094", objArr);
            decode = android.net.Uri.decode(httpsURLConnection.getHeaderField(((java.lang.String) objArr[0]).intern()));
        } else {
            Camera2StreamConfigurationMap();
            javax.net.ssl.HttpsURLConnection httpsURLConnection2 = this.getOutputMinFrameDurationlomOqCM;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0091\u0099\u0093\u0098\u0097\u0096\u0095\u0090\u0094", objArr2);
            decode = android.net.Uri.decode(httpsURLConnection2.getHeaderField(((java.lang.String) objArr2[0]).intern()));
        }
        util.h.xy.cq.re reVar = new util.h.xy.cq.re(this.getOutputMinFrameDurationlomOqCM.getInputStream(), this.getOutputSizeshNQ4ISI, bArr);
        int i2 = getHighSpeedVideoSizesFor + 85;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return reVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        int i = getHighSpeedVideoFpsRanges + 41;
        getHighSpeedVideoSizesFor = i % 128;
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 != 0) {
            return httpsURLConnection.getInstanceFollowRedirects();
        }
        httpsURLConnection.getInstanceFollowRedirects();
        throw null;
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 117) % 128;
        try {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 125) % 128;
        } catch (java.io.IOException unused) {
        }
        return this.getOutputMinFrameDurationlomOqCM.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.Principal getLocalPrincipal() {
        int i = getHighSpeedVideoSizesFor + 15;
        getHighSpeedVideoFpsRanges = i % 128;
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 == 0) {
            return httpsURLConnection.getLocalPrincipal();
        }
        httpsURLConnection.getLocalPrincipal();
        throw null;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 15) % 128;
        java.security.Principal peerPrincipal = this.getOutputMinFrameDurationlomOqCM.getPeerPrincipal();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 87) % 128;
        return peerPrincipal;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.security.Permission getPermission() throws java.io.IOException {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        java.security.Permission permission = this.getOutputMinFrameDurationlomOqCM.getPermission();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 9) % 128;
        return permission;
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 109) % 128;
        int readTimeout = this.getOutputMinFrameDurationlomOqCM.getReadTimeout();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 117) % 128;
        return readTimeout;
    }

    @Override // java.net.HttpURLConnection
    public final java.lang.String getRequestMethod() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 41) % 128;
        java.lang.String requestMethod = this.getOutputMinFrameDurationlomOqCM.getRequestMethod();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 125) % 128;
        return requestMethod;
    }

    @Override // java.net.URLConnection
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 53) % 128;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestProperties = this.getOutputMinFrameDurationlomOqCM.getRequestProperties();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 111) % 128;
        return requestProperties;
    }

    @Override // java.net.URLConnection
    public final java.lang.String getRequestProperty(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 35;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM.getRequestProperty(str);
            throw null;
        }
        java.lang.String requestProperty = this.getOutputMinFrameDurationlomOqCM.getRequestProperty(str);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 13) % 128;
        return requestProperty;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 9;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap();
            return this.getOutputMinFrameDurationlomOqCM.getResponseCode();
        }
        Camera2StreamConfigurationMap();
        this.getOutputMinFrameDurationlomOqCM.getResponseCode();
        throw null;
    }

    @Override // java.net.HttpURLConnection
    public final java.lang.String getResponseMessage() throws java.io.IOException {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 119) % 128;
        Camera2StreamConfigurationMap();
        java.lang.String responseMessage = this.getOutputMinFrameDurationlomOqCM.getResponseMessage();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 63) % 128;
        return responseMessage;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final javax.net.ssl.SSLSocketFactory getSSLSocketFactory() {
        int i = getHighSpeedVideoSizesFor + 1;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM.getSSLSocketFactory();
            throw null;
        }
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.getOutputMinFrameDurationlomOqCM.getSSLSocketFactory();
        int i2 = getHighSpeedVideoSizesFor + 7;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return sSLSocketFactory;
        }
        throw null;
    }

    @Override // java.net.URLConnection
    public final java.net.URL getURL() {
        int i = getHighSpeedVideoFpsRanges + 73;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            this.getOutputMinFrameDurationlomOqCM.getURL();
            throw null;
        }
        java.net.URL url = this.getOutputMinFrameDurationlomOqCM.getURL();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 125) % 128;
        return url;
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        int i = getHighSpeedVideoSizesFor + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        boolean useCaches = this.getOutputMinFrameDurationlomOqCM.getUseCaches();
        if (i % 2 == 0) {
            return useCaches;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 81) % 128;
        this.getOutputMinFrameDurationlomOqCM.setAllowUserInteraction(z);
        int i = getHighSpeedVideoSizesFor + 117;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 119) % 128;
        this.getOutputMinFrameDurationlomOqCM.setChunkedStreamingMode(i);
        int i2 = getHighSpeedVideoSizesFor + 111;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM.setDoInput(z);
        } else {
            this.getOutputMinFrameDurationlomOqCM.setDoInput(z);
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 5) % 128;
        this.getOutputMinFrameDurationlomOqCM.setDoOutput(z);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 41) % 128;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        int i2 = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM.setFixedLengthStreamingMode(i);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 45) % 128;
        } else {
            this.getOutputMinFrameDurationlomOqCM.setFixedLengthStreamingMode(i);
            throw null;
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(javax.net.ssl.HostnameVerifier hostnameVerifier) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 85) % 128;
        this.getOutputMinFrameDurationlomOqCM.setHostnameVerifier(hostnameVerifier);
        int i = getHighSpeedVideoFpsRanges + 57;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
        this.getOutputMinFrameDurationlomOqCM.setIfModifiedSince(j);
        int i = getHighSpeedVideoFpsRanges + 41;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 125) % 128;
        this.getOutputMinFrameDurationlomOqCM.setInstanceFollowRedirects(z);
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        int i = getHighSpeedVideoFpsRanges + 101;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM.setSSLSocketFactory(sSLSocketFactory);
        } else {
            this.getOutputMinFrameDurationlomOqCM.setSSLSocketFactory(sSLSocketFactory);
            throw null;
        }
    }

    @Override // java.net.URLConnection
    public final java.lang.String toString() {
        int i = getHighSpeedVideoFpsRanges + 73;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String obj = this.getOutputMinFrameDurationlomOqCM.toString();
        int i2 = getHighSpeedVideoSizesFor + 9;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0334 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v52, types: [int] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Camera2StreamConfigurationMap() throws java.io.IOException {
        ?? r6;
        java.io.OutputStream outputStream;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 87) % 128;
            if (this.getOutputStallDurationlomOqCM) {
                return;
            }
            byte[] bArr4 = null;
            r5 = null;
            java.io.OutputStream outputStream2 = null;
            bArr4 = null;
            bArr4 = null;
            bArr4 = null;
            ?? r8 = -841369711;
            try {
                try {
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1766183174, 1677235236, -86997976, -841369711}, 5 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr);
                        boolean equals = ((java.lang.String) objArr[0]).intern().equals(this.getOutputMinFrameDurationlomOqCM.getURL().getProtocol());
                        if (!equals) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1268852636, 295855259, -840499977, 483186850, 1490631690, -1969099407, 1633515523, 113466027, -1185520048, 1592539346, -1075673181, 547275862, 1184329771, 1647012612, -1430315751, 1397864016, -107745609, 1798698262}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35, objArr2);
                            throw new java.net.ProtocolException(((java.lang.String) objArr2[0]).intern());
                        }
                        if (equals) {
                            try {
                                this.getOutputMinFrameDurationlomOqCM.setSSLSocketFactory(util.h.xy.cn.mb.m25978().getSocketFactory());
                                if (this.getOutputSizes.m25982(util.h.xy.cn.rb.ra.f1120)) {
                                    this.getOutputMinFrameDurationlomOqCM.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                                } else {
                                    this.getOutputMinFrameDurationlomOqCM.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 29) % 128;
                                }
                            } catch (util.h.xy.cn.b e) {
                                e.getMessage();
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-751903266, -1958830365, 275286992, -628497461, 2061036896, 202311372, 433313143, -112090334, 2015636073, 1002875485, -201721936, 1020189648, -1718523511, 1237163613, -1668195167, -15654223, 271854157, -828435693, -1997382437, 1046941219, 2130869809, -1089441188, 800712639, -2022845379, -1371319097, -1575006514, 953438495, 508966104}, 54 - android.graphics.Color.red(0), objArr3);
                                throw new java.net.ProtocolException(((java.lang.String) objArr3[0]).intern());
                            }
                        }
                        this.getOutputMinFrameDurationlomOqCM.setUseCaches(false);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u0096\u0093\u009b\u009a", objArr4);
                        if (((java.lang.String) objArr4[0]).intern().equals(this.getOutputMinFrameDurationlomOqCM.getRequestMethod())) {
                            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
                            this.getOutputMinFrameDurationlomOqCM.setDoOutput(true);
                        }
                        try {
                            if (util.h.xy.ck.ra.f1116.m25946()) {
                                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 19) % 128;
                                if (util.h.xy.ck.ra.f1116.m25949().mo25939()) {
                                    byte[] m25933 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107);
                                    byte[] m259332 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1104);
                                    java.util.Map<util.h.xy.ct.ma.b, byte[]> mo26035 = util.h.xy.ct.rc.m26047().mo26035(m25933, this.getOutputSizeshNQ4ISI.m26006(), util.h.xy.ct.ma.b.f1126.m26043() | util.h.xy.ct.ma.b.f1124.m26043());
                                    byte[] bArr5 = mo26035.get(util.h.xy.ct.ma.b.f1126);
                                    try {
                                        byte[] bArr6 = mo26035.get(util.h.xy.ct.ma.b.f1124);
                                        try {
                                            java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(m25933, m259332, bArr5);
                                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u0096\u0093\u009b\u009a", objArr5);
                                            if (((java.lang.String) objArr5[0]).intern().equals(this.getOutputMinFrameDurationlomOqCM.getRequestMethod())) {
                                                byte[] byteArray = this.getOutputStallDuration.toByteArray();
                                                java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(byteArray);
                                                java.lang.String highSpeedVideoFpsRanges = util.h.xy.cq.b.getHighSpeedVideoFpsRanges(new java.util.HashMap(highSpeedVideoFpsRangesFor));
                                                java.net.URL url = getURL();
                                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u009f\u009e\u009d\u0090\u0097\u0093\u0098\u009c\u0090\u0081\u0097", objArr6);
                                                java.lang.String highSpeedVideoSizes = util.h.xy.cq.b.getHighSpeedVideoSizes(url, highSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap2, ((java.lang.String) objArr6[0]).intern(), bArr6);
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0087\u0084\u0083\u008a\u0090\u009b", objArr7);
                                                sb.append(((java.lang.String) objArr7[0]).intern());
                                                sb.append(highSpeedVideoFpsRanges);
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.getCapsMode("", 0, 0), " ", objArr8);
                                                sb.append(((java.lang.String) objArr8[0]).intern());
                                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{410908373, 1644427667, 310420929, -167994630, -1119851535, -1854718078, -1373207928, -1795562349}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr9);
                                                sb.append(((java.lang.String) objArr9[0]).intern());
                                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{1598725898, -337686148}, 1 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr10);
                                                sb.append(((java.lang.String) objArr10[0]).intern());
                                                sb.append(highSpeedVideoSizes);
                                                java.lang.String obj4 = sb.toString();
                                                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 41) % 128;
                                                javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0088\u0085¤\u0083¥\u0082\u0088\u0088\u0085\u009c", objArr11);
                                                java.lang.String intern = ((java.lang.String) objArr11[0]).intern();
                                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.indexOf("", "", 0), "\u0082\u0089\u0085£\u009c", objArr12);
                                                httpsURLConnection.setRequestProperty(intern, ((java.lang.String) objArr12[0]).intern());
                                                javax.net.ssl.HttpsURLConnection httpsURLConnection2 = this.getOutputMinFrameDurationlomOqCM;
                                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 127, "\u0088\u0085¤\u0083¢«¤\u008c\u0085\u0084\u0083\u008a\u0090", objArr13);
                                                httpsURLConnection2.addRequestProperty(((java.lang.String) objArr13[0]).intern(), obj4);
                                                int i = getHighSpeedVideoFpsRanges + 113;
                                                getHighSpeedVideoSizesFor = i % 128;
                                                if (i % 2 == 0) {
                                                    throw new java.lang.NullPointerException();
                                                }
                                                if (byteArray != null) {
                                                    outputStream2 = this.getOutputMinFrameDurationlomOqCM.getOutputStream();
                                                    outputStream2.write(byteArray);
                                                    outputStream2.flush();
                                                }
                                            }
                                            r6 = outputStream2;
                                            bArr4 = bArr5;
                                            r8 = bArr6;
                                            this.getOutputMinFrameDurationlomOqCM.connect();
                                            this.getOutputStallDurationlomOqCM = true;
                                            util.h.xy.cv.ra.m26068(bArr4, r8);
                                            if (r6 != 0) {
                                                try {
                                                    r6.close();
                                                } catch (java.io.IOException unused) {
                                                }
                                            }
                                            return;
                                        } catch (util.h.xy.ck.rc unused2) {
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, 65 - android.graphics.Color.argb(0, 0, 0, 0), objArr14);
                                            throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr14[0]).intern());
                                        } catch (util.h.xy.cm.ma unused3) {
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, objArr15);
                                            throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr15[0]).intern());
                                        } catch (util.h.xy.ct.mc unused4) {
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, 65 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr16);
                                            throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr16[0]).intern());
                                        }
                                    } catch (util.h.xy.ck.rc unused5) {
                                    } catch (util.h.xy.cm.ma unused6) {
                                    } catch (util.h.xy.ct.mc unused7) {
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        r8 = 0;
                                        r6 = 0;
                                        bArr4 = bArr5;
                                        util.h.xy.cv.ra.m26068(bArr4, r8);
                                        if (r6 != 0) {
                                            try {
                                                r6.close();
                                                int i2 = getHighSpeedVideoFpsRanges + 67;
                                                getHighSpeedVideoSizesFor = i2 % 128;
                                                if (i2 % 2 == 0) {
                                                    int i3 = 5 / 5;
                                                }
                                            } catch (java.io.IOException unused8) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                            this.getOutputMinFrameDurationlomOqCM.connect();
                            this.getOutputStallDurationlomOqCM = true;
                            util.h.xy.cv.ra.m26068(bArr4, r8);
                            if (r6 != 0) {
                            }
                            return;
                        } catch (util.h.xy.ck.rc unused9) {
                            bArr3 = bArr4;
                            obj3 = r6;
                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, 65 - android.graphics.Color.argb(0, 0, 0, 0), objArr142);
                            throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr142[0]).intern());
                        } catch (util.h.xy.cm.ma unused10) {
                            bArr2 = bArr4;
                            obj2 = r6;
                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, objArr152);
                            throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr152[0]).intern());
                        } catch (util.h.xy.ct.mc unused11) {
                            bArr = bArr4;
                            obj = r6;
                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, 65 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr162);
                            throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr162[0]).intern());
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            util.h.xy.cv.ra.m26068(bArr4, r8);
                            if (r6 != 0) {
                            }
                            throw th;
                        }
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0096\u0093\u009b\u009a", objArr17);
                        if (((java.lang.String) objArr17[0]).intern().equals(this.getOutputMinFrameDurationlomOqCM.getRequestMethod())) {
                            int i4 = getHighSpeedVideoSizesFor + 83;
                            getHighSpeedVideoFpsRanges = i4 % 128;
                            if (i4 % 2 != 0) {
                                this.getOutputStallDuration.toByteArray();
                                throw null;
                            }
                            byte[] byteArray2 = this.getOutputStallDuration.toByteArray();
                            if (byteArray2 != null) {
                                int i5 = getHighSpeedVideoFpsRanges + 19;
                                getHighSpeedVideoSizesFor = i5 % 128;
                                r6 = i5 % 2;
                                try {
                                    if (r6 == 0) {
                                        java.io.OutputStream outputStream3 = this.getOutputMinFrameDurationlomOqCM.getOutputStream();
                                        outputStream3.write(byteArray2);
                                        outputStream3.flush();
                                        throw null;
                                    }
                                    java.io.OutputStream outputStream4 = this.getOutputMinFrameDurationlomOqCM.getOutputStream();
                                    outputStream4.write(byteArray2);
                                    outputStream4.flush();
                                    outputStream = outputStream4;
                                } catch (util.h.xy.ck.rc unused12) {
                                    bArr3 = null;
                                    obj3 = r6;
                                    java.lang.Object[] objArr1422 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, 65 - android.graphics.Color.argb(0, 0, 0, 0), objArr1422);
                                    throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr1422[0]).intern());
                                } catch (util.h.xy.cm.ma unused13) {
                                    bArr2 = null;
                                    obj2 = r6;
                                    java.lang.Object[] objArr1522 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, objArr1522);
                                    throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr1522[0]).intern());
                                } catch (util.h.xy.ct.mc unused14) {
                                    bArr = null;
                                    obj = r6;
                                    java.lang.Object[] objArr1622 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-1824671418, -1389956672, -321521417, -491224391, -868959575, -712523157, -994222516, -1616226023, 1485959098, 329508296, 2108324121, 1095163376, 216253134, -431358078, -1559413003, -744607134, -670215364, -1500071183, -367686664, -1077927, 31479500, -1334054769, 1928689639, -346623440, 1077280710, 1181679367, 547874701, 1380621718, -1453513774, 2120208810, 2062877307, -1438688519, -2089968333, -1375654884}, 65 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1622);
                                    throw getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr1622[0]).intern());
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    r8 = 0;
                                    util.h.xy.cv.ra.m26068(bArr4, r8);
                                    if (r6 != 0) {
                                    }
                                    throw th;
                                }
                            } else {
                                outputStream = null;
                            }
                            r8 = 0;
                            r6 = outputStream;
                        } else {
                            r6 = 0;
                            r8 = 0;
                        }
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause = th4.getCause();
                        if (cause == null) {
                            throw th4;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                }
            } catch (util.h.xy.ck.rc unused15) {
            } catch (util.h.xy.cm.ma unused16) {
            } catch (util.h.xy.ct.mc unused17) {
            } catch (java.lang.Throwable th6) {
                th = th6;
                r6 = 0;
                r8 = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0140, code lost:
    
        if (r2.equals(((java.lang.String) r6[0]).intern()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x016c, code lost:
    
        r2 = new java.util.HashMap();
        r11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), "\u008e\u0086\u0085\u008d\u0098£¨§", r11);
        r5 = ((java.lang.String) r11[0]).intern();
        r4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{566648432, -1571968110, 1428922904, -248177189}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 5, r4);
        r2.put(r5, util.h.xy.cq.b.Camera2StreamConfigurationMap(new java.lang.String(r19, ((java.lang.String) r4[0]).intern()).trim()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x016a, code lost:
    
        if (r2.equals(((java.lang.String) r6[0]).intern()) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.ck.rc, java.io.IOException, java.io.UnsupportedEncodingException {
        java.util.HashMap hashMap;
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.getOutputMinFrameDurationlomOqCM;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0082\u008b\u008e\u0096\u0098\u0083\u0088\u0082\u0083\u0088\u0085\u009c", objArr);
        java.lang.String requestProperty = httpsURLConnection.getRequestProperty(((java.lang.String) objArr[0]).intern());
        java.util.Map<java.lang.String, java.lang.String> map = null;
        if (requestProperty != null && this.getOutputStallDuration != null) {
            java.lang.String requestMethod = this.getOutputMinFrameDurationlomOqCM.getRequestMethod();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{2067460899, -1187411045}, 3 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
            if (!requestMethod.equals(((java.lang.String) objArr2[0]).intern())) {
                java.lang.String trim = requestProperty.trim();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1782905593, -1096761854, -780673719, -1691074792, -14600040, -331244073, -572581626, -1586112973, -1444334705, 994746316, 1428842218, 1183908768, -619180577, 1159871427, 1699215453, -1161966740, -1968099014, 272285464}, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, objArr3);
                if (trim.equals(((java.lang.String) objArr3[0]).intern())) {
                    map = util.h.xy.cq.b.getHighResolutionOutputSizeshNQ4ISI(bArr);
                } else {
                    java.lang.String trim2 = requestProperty.trim();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-1782905593, -1096761854, -780673719, -1691074792, -14600040, -331244073, -1865300730, -1679974698}, android.text.TextUtils.getCapsMode("", 0, 0) + 16, objArr4);
                    if (trim2.equals(((java.lang.String) objArr4[0]).intern())) {
                        hashMap = new java.util.HashMap();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u008e\u0086\u0085\u008d\u0098\u0088\u0085\u0089¡", objArr5);
                        java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{566648432, -1571968110, 1428922904, -248177189}, android.graphics.Color.rgb(0, 0, 0) + 16777221, objArr6);
                        hashMap.put(intern, util.h.xy.cq.b.Camera2StreamConfigurationMap(new java.lang.String(bArr, ((java.lang.String) objArr6[0]).intern()).trim()));
                    } else {
                        java.lang.String trim3 = requestProperty.trim();
                        int i = (getHighSpeedVideoSizesFor + 35) % 128;
                        getHighSpeedVideoFpsRanges = i;
                        int i2 = i + 31;
                        getHighSpeedVideoSizesFor = i2 % 128;
                        try {
                            if (i2 % 2 == 0) {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 1L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 1L ? 0 : -1)) + 126, "£¨§¦\u0088\u0085¤\u0083¢¥¤£\u008b\u008b¢", objArr7);
                            } else {
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 126, "£¨§¦\u0088\u0085¤\u0083¢¥¤£\u008b\u008b¢", objArr8);
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    map = hashMap;
                }
            }
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 49) % 128;
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.io.UnsupportedEncodingException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{783631260, -466101608, 425567501, 1954019209}, 5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{566648432, -1571968110, 1428922904, -248177189}, android.graphics.ImageFormat.getBitsPerPixel(0) + 6, objArr2);
        hashMap.put(intern, new java.lang.String(bArr, ((java.lang.String) objArr2[0]).intern()));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{410908373, 1644427667, 567928648, 871374594, 1948090263, -1568884270, 1425774746, 1712872608, 683482565, -1482303789}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 19, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{566648432, -1571968110, 1428922904, -248177189}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, objArr4);
        hashMap.put(intern2, new java.lang.String(bArr2, ((java.lang.String) objArr4[0]).intern()));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{410908373, 1644427667, 1374561085, 1499105121, 226982501, -1016649552}, android.view.KeyEvent.getDeadChar(0, 0) + 11, objArr5);
        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
        byte[] m26014 = this.getOutputSizeshNQ4ISI.m26014();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{566648432, -1571968110, 1428922904, -248177189}, 4 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
        hashMap.put(intern3, new java.lang.String(m26014, ((java.lang.String) objArr6[0]).intern()));
        long m26009 = this.getOutputSizeshNQ4ISI.m26009();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u008b¨¢\u0083\u0089\u0082¨¤\u0083©\u0084\u0083\u008a¢\u0085", objArr7);
        hashMap.put(((java.lang.String) objArr7[0]).intern(), java.lang.String.valueOf(m26009));
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{410908373, 1644427667, 310420929, -167994630, -1119851535, -1854718078, -1186846237, -923008651, -1043068701, 152748502, 270488188, -2045786566}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 23, objArr8);
        java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 128, "\u009f\u009e\u009d\u0090\u0097\u0093\u0098\u009c\u0090\u0081\u0097", objArr9);
        hashMap.put(intern4, ((java.lang.String) objArr9[0]).intern());
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0088\u0085¤\u0089\u008c\u0082ª©\u0084\u0083\u008a¢\u0086", objArr10);
        java.lang.String intern5 = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2120801444, -482612559}, 3 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr11);
        hashMap.put(intern5, ((java.lang.String) objArr11[0]).intern());
        try {
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{410908373, 1644427667, -1124249569, -101777478, -608729140, 2068489341}, 10 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr12);
            java.lang.String intern6 = ((java.lang.String) objArr12[0]).intern();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{566648432, -1571968110, 1428922904, -248177189}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, objArr13);
            hashMap.put(intern6, new java.lang.String(bArr3, ((java.lang.String) objArr13[0]).intern()));
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 83) % 128;
            return hashMap;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private java.io.OutputStream getHighSpeedVideoFpsRanges() throws java.io.IOException {
        if (this.getOutputStallDurationlomOqCM) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 127, "¬\u008c\u0082ª\u008c\u0082\u0089\u0087\u0085\u0083\u0087\u0086\u0082\u0083¥\u0082\u0088\u0088\u0085¥\u0087\u008e\u0086¢\u0082\u008c£\u0090", objArr);
                throw new java.net.ProtocolException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.getOutputStallDuration;
    }

    private static java.io.IOException getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.io.IOException iOException = new java.io.IOException(str);
        int i = getHighSpeedVideoSizesFor + 111;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return iOException;
        }
        throw null;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRangesFor = new char[]{64371, 64363, 64344, 64340, 64349, 64360, 64428, 64338, 64345, 64347, 64348, 64350, 64366, 64327, 64382, 64399, 64373, 64395, 64377, 64392, 64379, 64376, 64372, 64403, 64375, 64380, 64381, 64393, 64414, 64411, 64410, 64400, 64342, 64367, 64336, 64343, 64361, 64413, 64324, 64339, 64365, 64346, 64326, 64402, 64362, 64341, 64325};
        getInputFormats = -1074857012;
        getOutputFormats = true;
        Camera2StreamConfigurationMap = true;
        getOutputMinFrameDuration = new int[]{250073719, -268017399, 2084492349, 545987736, -704403298, -999850081, -1887957059, 1457736187, -998473081, -431826001, 770191132, -1898794849, -290030892, -786891360, 1074978359, -761063527, 194378120, 277632693};
    }
}
