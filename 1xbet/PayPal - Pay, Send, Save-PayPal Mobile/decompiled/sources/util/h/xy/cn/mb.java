package util.h.xy.cn;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static boolean getHighSpeedVideoSizes = false;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static boolean getInputFormats;
    private static char[] getInputSizeshNQ4ISI;
    private static long getOutputFormats;
    private static int getOutputMinFrameDuration;
    private final util.h.xy.cn.rb getOutputStallDurationlomOqCM;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizesFor = util.h.xy.cn.mb.class.getName();
        if (((java.net.CookieManager) java.net.CookieHandler.getDefault()) == null) {
            java.net.CookieHandler.setDefault(new java.net.CookieManager(null, java.net.CookiePolicy.ACCEPT_ALL));
            int i = getHighSpeedVideoFpsRangesFor + 97;
            getHighSpeedVideoFpsRanges = i % 128;
            int i2 = i % 2;
        }
        int i3 = getHighSpeedVideoFpsRangesFor + 5;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 103;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 63) % 128;
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 3) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    public mb() {
        this(new util.h.xy.cn.rb(new util.h.xy.cn.rb.ra[0]));
    }

    public mb(util.h.xy.cn.rb rbVar) {
        this.getOutputStallDurationlomOqCM = rbVar;
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getInputSizeshNQ4ISI;
        if (cArr2 != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 105;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i3 = 0;
            while (i3 < length) {
                int i4 = (Camera2StreamConfigurationMap + 103) % 128;
                getHighResolutionOutputSizeshNQ4ISI = i4;
                cArr[i3] = (char) (cArr2[i3] ^ (-3299939579226817547L));
                i3++;
                Camera2StreamConfigurationMap = (i4 + 71) % 128;
            }
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDuration);
        if (!getHighSpeedVideoSizes) {
            if (!getInputFormats) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.cn.ma m25981(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map2) throws util.h.xy.cn.b {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 49) % 128;
        util.h.xy.cn.ma m25980 = m25980(str, map, bArr, str2, map2, 10000);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 47) % 128;
        return m25980;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.cn.ma m25980(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map2, int i) throws util.h.xy.cn.b {
        if (str == null || str.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("磑阾\udf6a碄ྷꖄ룶鐯뜒闗\ue874撁\ue7fe䕢\ud85a㔭ᙔ㓖িՂ䘡\ue422祃", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            throw new util.h.xy.cn.b(((java.lang.String) objArr[0]).intern());
        }
        if (str2 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 97;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!str2.isEmpty()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("節畵爗\ufaea\uea49䛘ᖓ", android.view.View.combineMeasuredStates(0, 0), objArr2);
                if (!str2.equals(((java.lang.String) objArr2[0]).intern())) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("뜜폌Ღ띌見\ue06b笥懦", android.view.KeyEvent.getDeadChar(0, 0), objArr3);
                    if (!str2.equals(((java.lang.String) objArr3[0]).intern())) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(127 - android.view.View.getDefaultSize(0, 0), "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                        sb.append(((java.lang.String) objArr4[0]).intern());
                        sb.append(str2);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\ue0fcꇏ麾\ue0dc煪鉉更\ueaa6⽼ꈴꦻᩂ翌犈駜䯦蹹ͣ", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr5);
                        sb.append(((java.lang.String) objArr5[0]).intern());
                        throw new util.h.xy.cn.b(sb.toString());
                    }
                }
                if (map != null) {
                    int i3 = getHighSpeedVideoFpsRangesFor + 113;
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % 2 != 0) {
                        map.isEmpty();
                        throw null;
                    }
                    if (!map.isEmpty()) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("溠ꗓ軲溟㟠", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr6);
                        sb2.append(((java.lang.String) objArr6[0]).intern());
                        sb2.append(getHighSpeedVideoFpsRangesFor(map));
                        str = sb2.toString();
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 37) % 128;
                    }
                }
                util.h.xy.cn.ma highSpeedVideoSizes = getHighSpeedVideoSizes(str, bArr, str2, map2, i);
                int i4 = getHighSpeedVideoFpsRanges + 101;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 != 0) {
                    return highSpeedVideoSizes;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u008e\u0083\u008d\u008c\u0082\u0087\u0082\u008b\u0087\u0083\u0085\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
        throw new util.h.xy.cn.b(((java.lang.String) objArr7[0]).intern());
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.String> map) throws util.h.xy.cn.b {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 29) % 128;
            for (java.lang.String str : map.keySet()) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 105) % 128;
                if (str == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0092\u0092\u0091\u008a\u0087\u0082\u008b\u0087\u0083\u0085\u008a\u008a\u0089\u0088\u0087\u0090\u008e\u0082\u008f", objArr);
                    throw new util.h.xy.cn.b(((java.lang.String) objArr[0]).intern());
                }
                java.lang.String str2 = map.get(str);
                if (str2 == null) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0092\u0092\u0091\u008a\u0087\u0082\u008b\u0087\u0083\u0085\u008a\u008a\u0089\u0088\u0087\u0090\u0082\u0091\u0092\u0089\u0093", objArr2);
                    throw new util.h.xy.cn.b(((java.lang.String) objArr2[0]).intern());
                }
                stringBuffer.append(getHighSpeedVideoFpsRangesFor(str));
                stringBuffer.append('=');
                stringBuffer.append(getHighSpeedVideoFpsRangesFor(str2));
                stringBuffer.append(kotlin.text.Typography.amp);
            }
            java.lang.String substring = stringBuffer.substring(0, stringBuffer.length() > 0 ? stringBuffer.length() - 1 : 0);
            stringBuffer.delete(0, stringBuffer.length());
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 45) % 128;
            return substring;
        } catch (java.lang.Throwable th) {
            stringBuffer.delete(0, stringBuffer.length());
            throw th;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) throws util.h.xy.cn.b {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 61) % 128;
        if (str != null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - android.view.View.MeasureSpec.getMode(0), "\u0098\u0097\u0096\u0095\u0094", objArr);
                return java.net.URLEncoder.encode(str, ((java.lang.String) objArr[0]).intern());
            } catch (java.io.UnsupportedEncodingException e) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0089\u0083\u0089\u0086\u0087\u0082\u0086\u0085\u0088\u008a\u0082\u0087\u0085\u0083\u0087\u0086\u0082\u0092\u0099\u0089\u0096", objArr2);
                throw new util.h.xy.cn.b(((java.lang.String) objArr2[0]).intern(), e);
            }
        }
        int i2 = i + 119;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0057, code lost:
    
        if (((java.lang.String) r9[0]).intern().equals(r11) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private util.h.xy.cn.ma getHighSpeedVideoSizes(java.lang.String str, byte[] bArr, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, int i) throws util.h.xy.cn.b {
        java.lang.Throwable th;
        java.io.IOException e;
        java.net.SocketTimeoutException e2;
        javax.net.ssl.HttpsURLConnection.setFollowRedirects(false);
        java.net.HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    java.net.URL url = new java.net.URL(str);
                    int i2 = getHighSpeedVideoFpsRangesFor + 115;
                    getHighSpeedVideoFpsRanges = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.String protocol = url.getProtocol();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("궵젌틗귝ፆﮐ땳袎扦", android.view.ViewConfiguration.getPressedStateDuration() << 107, objArr);
                        if (!((java.lang.String) objArr[0]).intern().equals(protocol)) {
                            if (!this.getOutputStallDurationlomOqCM.m25982(util.h.xy.cn.rb.ra.f1121)) {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u0086\u0082£\u0085\u0092\u0092\u0089\u0087\u0083\u0085\u008a\u0087\u0082\u009d\u0089\u0087\u0090\u008a\u0085\u0099\u0083\u0088\u0082\u008a\u008a\u0085\u0088\u0087\u0082\u009d\u0091\u0088\u0082\u0090\u008a\u0094", objArr2);
                                throw new util.h.xy.cn.b(((java.lang.String) objArr2[0]).intern());
                            }
                        }
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 35) % 128;
                        str = (java.net.HttpURLConnection) url.openConnection();
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("궵젌틗귝ፆﮐ땳袎扦", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr3);
                            boolean equals = ((java.lang.String) objArr3[0]).intern().equals(str.getURL().getProtocol());
                            if (!equals) {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("Օ蔬鹅ԝ忸뚐療쐐쪆蚄\ua958㓕驦噰饵敢毐⟄䢀唓㮰\uf720㠵薩ଛ위\uebe7\uf665\ud8d9铁\udb94⛓ꡰ摄謗ᚕ砼㖨竱", android.view.View.resolveSizeAndState(0, 0, 0), objArr4);
                                throw new java.net.ProtocolException(((java.lang.String) objArr4[0]).intern());
                            }
                            if (equals) {
                                int i3 = getHighSpeedVideoFpsRanges + 23;
                                getHighSpeedVideoFpsRangesFor = i3 % 128;
                                try {
                                    if (i3 % 2 == 0) {
                                        javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) str;
                                        getHighSpeedVideoFpsRangesFor(httpsURLConnection);
                                        getHighSpeedVideoSizes(httpsURLConnection);
                                        throw new java.lang.ArithmeticException();
                                    }
                                    javax.net.ssl.HttpsURLConnection httpsURLConnection2 = (javax.net.ssl.HttpsURLConnection) str;
                                    getHighSpeedVideoFpsRangesFor(httpsURLConnection2);
                                    getHighSpeedVideoSizes(httpsURLConnection2);
                                } catch (util.h.xy.cn.b unused) {
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("꒸ﯕ椄꓾ʼ졜ຽ饨欸\uf829帛槄㮋⢘湠㠱쨨", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr5);
                                    throw new java.net.ProtocolException(((java.lang.String) objArr5[0]).intern());
                                }
                            }
                            str.setConnectTimeout(i);
                            str.setReadTimeout(i);
                            str.setUseCaches(false);
                            str.setRequestMethod(str2);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("뜜폌Ღ띌見\ue06b笥懦", android.text.TextUtils.indexOf("", "", 0, 0), objArr6);
                            if (str2.equals(((java.lang.String) objArr6[0]).intern())) {
                                str.setDoOutput(true);
                            }
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 121) % 128;
                            Camera2StreamConfigurationMap(str, map);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u008a\u0085\u0099\u0083\u0088\u0082\u008a\u008a\u0085\u009a", objArr7);
                            java.lang.String intern = ((java.lang.String) objArr7[0]).intern();
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("绪셴墶纩\ue0b4\uf2f0㼉筿넯", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr8);
                            str.setRequestProperty(intern, ((java.lang.String) objArr8[0]).intern());
                            getHighSpeedVideoFpsRangesFor(str, bArr);
                            str.connect();
                            util.h.xy.cn.ma highSpeedVideoSizes = getHighSpeedVideoSizes((java.net.HttpURLConnection) str);
                            if (str != 0) {
                                str.disconnect();
                            }
                            return highSpeedVideoSizes;
                        } catch (java.net.SocketTimeoutException e3) {
                            e2 = e3;
                            try {
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(128 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), "\u009f\u0082\u0083\u0091\u0088\u0082\u009e\u0082\u0087\u008c\u009d\u0085\u009c\u009d\u0082\u008d\u0087\u0085\u0083\u0087\u0086\u0082\u0092\u0099\u0089\u009c\u0087\u009b\u0083\u0091\u0085\u0082\u008c\u0099\u0095", objArr9);
                                throw new util.h.xy.cn.b(((java.lang.String) objArr9[0]).intern(), e2);
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        } catch (java.io.IOException e4) {
                            e = e4;
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("䱙浬\u1777䰟頶廥烎Ϣ莜満‧\uf31a퍶빤ဗꊫ⋋쿂솨鋜犴ἤ녂䉶䈜⼇拲㆚釼", android.graphics.Color.green(0), objArr10);
                            throw new util.h.xy.cn.b(((java.lang.String) objArr10[0]).intern(), e);
                        }
                    }
                    java.lang.String protocol2 = url.getProtocol();
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("궵젌틗귝ፆﮐ땳袎扦", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr11);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (java.net.SocketTimeoutException e5) {
                e2 = e5;
                str = 0;
            } catch (java.io.IOException e6) {
                e = e6;
            }
        } catch (java.lang.Throwable th4) {
            httpURLConnection = str;
            th = th4;
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    private static util.h.xy.cn.ma getHighSpeedVideoSizes(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i = 0;
        while (true) {
            java.lang.String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
            java.lang.String headerField = httpURLConnection.getHeaderField(i);
            if (headerFieldKey == null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 53) % 128;
                if (headerField == null) {
                    break;
                }
            }
            hashMap.put(headerFieldKey, headerField);
            i++;
        }
        int responseCode = httpURLConnection.getResponseCode();
        java.lang.String responseMessage = httpURLConnection.getResponseMessage();
        try {
            try {
                bufferedInputStream = new java.io.BufferedInputStream(httpURLConnection.getInputStream());
                int i2 = getHighSpeedVideoFpsRanges + 51;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    getHighSpeedVideoFpsRangesFor(bufferedInputStream);
                    bufferedInputStream.close();
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.io.IOException unused) {
            }
        } catch (java.io.IOException unused2) {
            bufferedInputStream = new java.io.BufferedInputStream(httpURLConnection.getErrorStream());
        }
        httpURLConnection = getHighSpeedVideoFpsRangesFor(bufferedInputStream);
        bufferedInputStream.close();
        return new util.h.xy.cn.ma(hashMap, httpURLConnection, responseCode, responseMessage);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.io.IOException {
        java.io.OutputStream outputStream;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 105) % 128;
        if (bArr != null) {
            getHighSpeedVideoFpsRangesFor = (i + 101) % 128;
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            try {
                outputStream = httpURLConnection.getOutputStream();
            } catch (java.io.IOException unused) {
                outputStream = null;
            }
            try {
                outputStream.write(bArr);
                outputStream.flush();
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            } catch (java.io.IOException unused2) {
                if (outputStream != null) {
                    outputStream.close();
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                }
            }
        }
    }

    private static void Camera2StreamConfigurationMap(java.net.HttpURLConnection httpURLConnection, java.util.Map<java.lang.String, java.lang.String> map) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 113;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (map != null) {
            int i3 = i + 27;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                map.entrySet().iterator();
                throw new java.lang.ArithmeticException();
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        java.util.Map<java.lang.String, java.lang.String> m25947 = util.h.xy.ck.ra.f1116.m25947();
        if (m25947 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : m25947.entrySet()) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 121) % 128;
                httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private static void getHighSpeedVideoSizes(javax.net.ssl.HttpsURLConnection httpsURLConnection) throws util.h.xy.cn.b {
        httpsURLConnection.setSSLSocketFactory(new util.h.xy.cn.ra(Camera2StreamConfigurationMap().getSocketFactory()));
        int i = getHighSpeedVideoFpsRanges + 109;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static javax.net.ssl.SSLContext m25978() throws util.h.xy.cn.b {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 31) % 128;
        javax.net.ssl.SSLContext Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        int i = getHighSpeedVideoFpsRanges + 87;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static javax.net.ssl.SSLContext Camera2StreamConfigurationMap() throws util.h.xy.cn.b {
        try {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - android.text.TextUtils.getTrimmedLength(""), "¡ \u0095", objArr);
                javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance(((java.lang.String) objArr[0]).intern());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(util.h.xy.cn.a.Camera2StreamConfigurationMap);
                arrayList.add(util.h.xy.cn.a.getHighResolutionOutputSizeshNQ4ISI);
                util.h.xy.df.mb.a aVar = new util.h.xy.df.mb.a();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(127 - android.graphics.Color.red(0), "\u0085\u0099\u009f\u0086\u0091\u0085\u0092\u0088\u0090\u0082\u0092\u0089\u0084\u0083\u009f¢¢", objArr2);
                sSLContext.init(null, new javax.net.ssl.TrustManager[]{new util.h.xy.df.a(aVar.m26275(((java.lang.String) objArr2[0]).intern(), arrayList).m26274())}, null);
                int i = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (i + 15) % 128;
                int i2 = i + 9;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    return sSLContext;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.security.KeyManagementException unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ᩥ㪣낙ᨣ锩प휠\u0efd햠㥏蟉︅蕊\ue9ab럮꾴瓱顋晊鿔⒗䢿ᚠ佷ᐬ磈씈㲅쟀", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
            throw getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern());
        } catch (java.security.KeyStoreException unused2) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ᩥ㪣낙ᨣ锩प휠\u0efd햠㥏蟉︅蕊\ue9ab럮꾴瓱顋晊鿔⒗䢿ᚠ佷ᐬ磈씈㲅쟀", android.view.View.MeasureSpec.getMode(0), objArr4);
            throw getHighSpeedVideoFpsRanges(((java.lang.String) objArr4[0]).intern());
        } catch (java.security.NoSuchAlgorithmException unused3) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ᩥ㪣낙ᨣ锩प휠\u0efd햠㥏蟉︅蕊\ue9ab럮꾴瓱顋晊鿔⒗䢿ᚠ佷ᐬ磈씈㲅쟀", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22, objArr5);
            throw getHighSpeedVideoFpsRanges(((java.lang.String) objArr5[0]).intern());
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 17) % 128;
        httpsURLConnection.setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        int i = getHighSpeedVideoFpsRangesFor + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(1024);
        int read = inputStream.read(bArr);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 69) % 128;
        while (read != -1) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 17) % 128;
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25979(java.net.URI uri) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 5) % 128;
        java.net.CookieStore cookieStore = ((java.net.CookieManager) java.net.CookieHandler.getDefault()).getCookieStore();
        java.util.Iterator<java.net.HttpCookie> it = cookieStore.get(uri).iterator();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 73) % 128;
        while (it.hasNext()) {
            cookieStore.remove(uri, it.next());
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 37) % 128;
        }
    }

    private static util.h.xy.cn.b getHighSpeedVideoFpsRanges(java.lang.String str) {
        util.h.xy.cn.b bVar = new util.h.xy.cn.b(str);
        int i = getHighSpeedVideoFpsRangesFor + 11;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputFormats = -1311258037398811712L;
        getInputSizeshNQ4ISI = new char[]{64386, 64378, 64363, 64359, 64364, 64379, 64447, 64376, 64382, 64365, 64377, 64354, 64367, 64342, 64384, 64360, 64362, 64355, 64373, 64394, 64395, 64389, 64418, 64407, 64358, 64408, 64419, 64357, 64361, 64343, 64429, 64387, 64392, 64417, 64340};
        getOutputMinFrameDuration = -1074856993;
        getInputFormats = true;
        getHighSpeedVideoSizes = true;
    }
}
