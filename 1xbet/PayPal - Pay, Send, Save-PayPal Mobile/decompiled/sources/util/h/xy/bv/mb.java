package util.h.xy.bv;

/* loaded from: classes5.dex */
public class mb {
    private static char[] Camera2StreamConfigurationMap = null;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static boolean getHighSpeedVideoSizes = false;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static long getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;
    private static java.lang.Object getOutputStallDurationlomOqCM;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int isOutputSupportedFor;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputMinFrameDuration = util.h.xy.bv.mb.class.getName();
        getOutputStallDurationlomOqCM = new java.lang.Object();
        getInputFormats = (getInputSizeshNQ4ISI + 73) % 128;
    }

    public mb() {
    }

    public mb(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM = str;
        this.isOutputSupportedFor = util.h.xy.cb.mb.m25851();
        this.getOutputSizes = util.h.xy.cb.mb.m25856();
    }

    /* renamed from: ˎ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", "", 0), "\u008c\u008b\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("䞳斡乬", (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33553), 400947120 - android.view.KeyEvent.keyCodeFromString(""), "뀴\ue5f7ሗ劃", "\u0000\u0000\u0000\u0000", objArr2);
        hashMap.put(intern, ((java.lang.String) objArr2[0]).intern());
        int i = getInputSizeshNQ4ISI + 13;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return hashMap;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25692() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 13;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709() {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> highSpeedVideoSizes = getHighSpeedVideoSizes(false);
        if (!highSpeedVideoSizes.isSuccessful()) {
            int i = getInputSizeshNQ4ISI + 19;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                highSpeedVideoSizes.getResult();
                throw null;
            }
            if (highSpeedVideoSizes.getResult() == null && highSpeedVideoSizes.getErrorCode() == 401) {
                highSpeedVideoSizes = getHighSpeedVideoSizes(true);
                getInputSizeshNQ4ISI = (getInputFormats + 109) % 128;
            }
        }
        util.h.xy.bv.rb result = highSpeedVideoSizes.getResult();
        if (result != null) {
            result.m25742();
            result.m25749();
        }
        if (highSpeedVideoSizes.isSuccessful()) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691 = mo25691(result);
            getInputFormats = (getInputSizeshNQ4ISI + 3) % 128;
            return mo25691;
        }
        int i2 = getInputFormats + 1;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoSizes;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 105) % 128;
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 109) % 128;
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
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 69) % 128;
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ r2[rcVar.f2652]) ^ (getOutputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(rbVar, true, null);
        getInputFormats = (getInputSizeshNQ4ISI + 49) % 128;
        return raVar;
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 93) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getOutputStallDuration);
        if (!getHighResolutionOutputSizeshNQ4ISI) {
            if (!getHighSpeedVideoSizes) {
                throw null;
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 63) % 128;
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fe, code lost:
    
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0200, code lost:
    
        r5.close();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x02eb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> getHighSpeedVideoSizes(boolean z) {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        byte[] bArr;
        byte[] bArr2;
        java.io.OutputStream outputStream;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        util.h.xy.an.ra raVar;
        util.h.xy.an.ra raVar2;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> asyncResult;
        javax.net.ssl.HttpsURLConnection httpsURLConnection2;
        byte[] highSpeedVideoFpsRanges;
        java.io.OutputStream outputStream2 = null;
        java.io.OutputStream outputStream3 = null;
        r5 = null;
        byte[] bArr6 = null;
        javax.net.ssl.HttpsURLConnection httpsURLConnection3 = null;
        javax.net.ssl.HttpsURLConnection httpsURLConnection4 = null;
        javax.net.ssl.HttpsURLConnection httpsURLConnection5 = null;
        javax.net.ssl.HttpsURLConnection httpsURLConnection6 = null;
        javax.net.ssl.HttpsURLConnection httpsURLConnection7 = null;
        try {
            try {
                if (util.h.xy.cg.a.m25906() != null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("鋐瓖\ue64a₧鵏똴틁놭횯᪔\ud840⺮\uebb4젡℻湈䖡\ue812唑茅涌\u1942担说ꄺ껂", (char) (31569 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), android.view.KeyEvent.getDeadChar(0, 0), "饎츗公\uf57b", "\u0000\u0000\u0000\u0000", objArr);
                    return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), -101);
                }
                synchronized (getOutputStallDurationlomOqCM) {
                    try {
                        util.h.xy.bv.rb m25618 = util.h.xy.bs.ma.m25618(z);
                        if (m25618.m25745() != util.h.xy.bv.rb.ra.f1062) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("\uf14a췵凞\uf69eᏛ繿脸䱒\uf044뀾赠䢶ꃃ馪빒왌骛\uf22c䌄ꐡﯯ뒍냛嫡兩䅝섨㡍୩燙䗱褬㜥棄ỷ\u0ad4ﴴ\ue346馅ꛍ怾堚띧耟䡀\uf6dbꢀ☢덠摏邆ኡ\u0ffd㐨⁙\uf5be쐡︢", (char) (36110 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "㎗⽻ົ邍", "\u0000\u0000\u0000\u0000", objArr2);
                            return new util.h.xy.an.ra(m25618, false, ((java.lang.String) objArr2[0]).intern(), m25618.m25751());
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(util.h.xy.cb.mb.m25855());
                        sb.append(this.getOutputMinFrameDurationlomOqCM);
                        httpsURLConnection2 = util.h.xy.ck.ra.f1116.m25951(new java.net.URL(sb.toString()));
                        try {
                            if (!(httpsURLConnection2 instanceof javax.net.ssl.HttpsURLConnection)) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u0095\u0097\u0086\u008f\u0082\u0090\u008a\u0086\u0098\u0094\u0090\u008c\u0086\u0090\u0095\u0088\u0083\u008b\u0097\u0097\u0096\u008a\u0086\u0095\u0090\u008a\u0086\u0090\u008c\u008b\u0086\u0094\u008e\u0088\u008c\u008c\u008b\u008e\u0090\u0093\u0092\u0092\u0091\u0090\u0088\u0089\u008f\u008e\u0088\u008a\u008c\u008d", objArr3);
                                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr3[0]).intern());
                            }
                            java.util.Map<java.lang.String, java.lang.String> mo25692 = mo25692();
                            if (mo25692 != null) {
                                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mo25692.entrySet()) {
                                    entry.getKey();
                                    entry.getValue();
                                    httpsURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                                }
                            }
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(127 - android.graphics.Color.alpha(0), "\u0088\u0085\u009b\u0092\u009a\u0094\u008c\u0088\u0094\u008c\u008b\u0099", objArr4);
                            java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u008c\u008b\u008a\u009d\u009c\u008c\u008b\u0086\u0094\u0096\u008e\u0086\u0097\u0085\u0085\u0096", objArr5);
                            httpsURLConnection2.setRequestProperty(intern, ((java.lang.String) objArr5[0]).intern());
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0094\u0088\u0097\u0097\u0096 \u009a\u0093\u009f\u0099\u009a\u009e", objArr6);
                            httpsURLConnection2.setRequestProperty(((java.lang.String) objArr6[0]).intern(), getHighSpeedVideoSizes());
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0094\u008c\u0088¢\u0084\u009a\u0089\u0088\u008a¡", objArr7);
                            httpsURLConnection2.setRequestProperty(((java.lang.String) objArr7[0]).intern(), Camera2StreamConfigurationMap());
                            try {
                                byte[] bytes = util.h.xy.bh.mb.m25474(util.h.xy.ag.a.m24556().m24558()).getBytes();
                                if (bytes != null && bytes.length > 0) {
                                    java.lang.String str = new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8);
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("\ue134퐴悀粰\ue008ﰙ놇၌奁꒺䎩", (char) android.view.View.resolveSize(0, 0), 1717371915 + (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "௰崄०僚", "\u0000\u0000\u0000\u0000", objArr8);
                                    httpsURLConnection2.setRequestProperty(((java.lang.String) objArr8[0]).intern(), str);
                                }
                            } catch (java.lang.Exception e) {
                                e.getMessage();
                            }
                            try {
                                byte[] m25469 = util.h.xy.bh.mb.m25469();
                                if (m25469 != null && m25469.length > 0) {
                                    java.lang.String str2 = new java.lang.String(m25469, java.nio.charset.StandardCharsets.UTF_8);
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("ᘝ⛩\udac9莻៱⤱\uddab﹞\ue8a3\udf23\u1fb5ᆩ뫾钃Ր∋㗧扯僲", (char) (1234 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-1204234081) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "齉㣘트\ue104", "\u0000\u0000\u0000\u0000", objArr9);
                                    httpsURLConnection2.setRequestProperty(((java.lang.String) objArr9[0]).intern(), str2);
                                }
                            } catch (java.lang.Exception e2) {
                                e2.getMessage();
                            }
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("㒹\ud84e䩍訨", (char) (android.view.KeyEvent.getDeadChar(0, 0) + 38046), android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "Ⲥᱢ黻ኔ", "\u0000\u0000\u0000\u0000", objArr10);
                            httpsURLConnection2.setRequestMethod(((java.lang.String) objArr10[0]).intern());
                            httpsURLConnection2.setConnectTimeout(this.isOutputSupportedFor);
                            httpsURLConnection2.setReadTimeout(this.getOutputSizes);
                            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                            try {
                                outputStream3 = httpsURLConnection2.getOutputStream();
                                outputStream3.write(highSpeedVideoFpsRanges);
                                int m25852 = util.h.xy.cb.mb.m25852();
                                int m25850 = util.h.xy.cb.mb.m25850();
                                while (true) {
                                    asyncResult = Camera2StreamConfigurationMap(httpsURLConnection2);
                                    if ((asyncResult.getErrorCode() == 504 || asyncResult.getErrorCode() == 408) && m25852 > 0) {
                                        getHighResolutionOutputSizeshNQ4ISI(m25850);
                                        m25852--;
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                outputStream = outputStream3;
                                bArr6 = highSpeedVideoFpsRanges;
                                try {
                                    throw th;
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                                    e = e3;
                                    bArr5 = bArr6;
                                    httpsURLConnection3 = httpsURLConnection2;
                                    e.getMessage();
                                    asyncResult = new util.h.xy.an.ra<>(e.getMessage(), -1);
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException unused) {
                                        }
                                    }
                                    if (httpsURLConnection3 != null) {
                                        httpsURLConnection3.disconnect();
                                    }
                                    if (bArr5 != null) {
                                        util.h.xy.ar.b.m25095(bArr5);
                                    }
                                    return asyncResult;
                                } catch (java.net.MalformedURLException e4) {
                                    e = e4;
                                    bArr4 = bArr6;
                                    httpsURLConnection4 = httpsURLConnection2;
                                    e.getMessage();
                                    asyncResult = new util.h.xy.an.ra<>(e.getMessage(), -1);
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                    if (httpsURLConnection4 != null) {
                                        httpsURLConnection4.disconnect();
                                    }
                                    if (bArr4 != null) {
                                        util.h.xy.ar.b.m25095(bArr4);
                                    }
                                    return asyncResult;
                                } catch (java.io.IOException e5) {
                                    e = e5;
                                    bArr = bArr6;
                                    httpsURLConnection5 = httpsURLConnection2;
                                    try {
                                        e.getMessage();
                                        asyncResult = new util.h.xy.an.ra<>(e.getMessage(), -101);
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (java.io.IOException unused3) {
                                            }
                                        }
                                        if (httpsURLConnection5 != null) {
                                            httpsURLConnection5.disconnect();
                                        }
                                        if (bArr != null) {
                                            util.h.xy.ar.b.m25095(bArr);
                                        }
                                        return asyncResult;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        httpsURLConnection = httpsURLConnection5;
                                        outputStream2 = outputStream;
                                        if (outputStream2 != null) {
                                        }
                                        if (httpsURLConnection != null) {
                                        }
                                        if (bArr == null) {
                                        }
                                    }
                                } catch (util.h.xy.ci.ma e6) {
                                    e = e6;
                                    bArr3 = bArr6;
                                    httpsURLConnection6 = httpsURLConnection2;
                                    e.getMessage();
                                    asyncResult = new util.h.xy.an.ra<>(e.getMessage(), -102);
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException unused4) {
                                        }
                                    }
                                    if (httpsURLConnection6 != null) {
                                        httpsURLConnection6.disconnect();
                                    }
                                    if (bArr3 != null) {
                                        util.h.xy.ar.b.m25095(bArr3);
                                    }
                                    return asyncResult;
                                } catch (util.h.xy.ck.rc e7) {
                                    e = e7;
                                    bArr2 = bArr6;
                                    httpsURLConnection7 = httpsURLConnection2;
                                    e.getMessage();
                                    e.getMessage();
                                    util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
                                    if (e.m25957() != null) {
                                        dVar = e.m25957();
                                    }
                                    switch (util.h.xy.bv.mb.AnonymousClass3.getHighResolutionOutputSizeshNQ4ISI[dVar.ordinal()]) {
                                        case 1:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -104);
                                            getInputSizeshNQ4ISI = (getInputFormats + 11) % 128;
                                            asyncResult = raVar;
                                            break;
                                        case 2:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -105);
                                            asyncResult = raVar;
                                            break;
                                        case 3:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -109);
                                            asyncResult = raVar;
                                            break;
                                        case 4:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -107);
                                            asyncResult = raVar;
                                            break;
                                        case 5:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -108);
                                            asyncResult = raVar;
                                            break;
                                        case 6:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -103);
                                            getInputFormats = (getInputSizeshNQ4ISI + 117) % 128;
                                            asyncResult = raVar;
                                            break;
                                        case 7:
                                            raVar2 = new util.h.xy.an.ra(e.getMessage(), -102);
                                            asyncResult = raVar2;
                                            break;
                                        case 8:
                                            raVar = new util.h.xy.an.ra(e.getMessage(), -106);
                                            asyncResult = raVar;
                                            break;
                                        default:
                                            raVar2 = new util.h.xy.an.ra(e.getMessage(), -102);
                                            asyncResult = raVar2;
                                            break;
                                    }
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException unused5) {
                                        }
                                    }
                                    if (httpsURLConnection7 != null) {
                                        httpsURLConnection7.disconnect();
                                    }
                                    if (bArr2 != null) {
                                        util.h.xy.ar.b.m25095(bArr2);
                                    }
                                    return asyncResult;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    bArr = bArr6;
                                    outputStream2 = outputStream;
                                    httpsURLConnection = httpsURLConnection2;
                                    if (outputStream2 != null) {
                                    }
                                    if (httpsURLConnection != null) {
                                    }
                                    if (bArr == null) {
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            outputStream = null;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        outputStream = null;
                        httpsURLConnection2 = null;
                    }
                }
                throw th;
            } catch (java.lang.Throwable th6) {
                th = th6;
                httpsURLConnection = null;
                bArr = -101;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (java.io.IOException unused6) {
                    }
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                if (bArr == null) {
                    throw th;
                }
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e8) {
            e = e8;
            bArr5 = null;
            outputStream = null;
        } catch (java.net.MalformedURLException e9) {
            e = e9;
            bArr4 = null;
            outputStream = null;
        } catch (java.io.IOException e10) {
            e = e10;
            bArr = null;
            outputStream = null;
        } catch (util.h.xy.ci.ma e11) {
            e = e11;
            bArr3 = null;
            outputStream = null;
        } catch (util.h.xy.ck.rc e12) {
            e = e12;
            bArr2 = null;
            outputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            httpsURLConnection = null;
            bArr = null;
        }
        if (httpsURLConnection2 != null) {
            httpsURLConnection2.disconnect();
        }
        if (highSpeedVideoFpsRanges != null) {
            util.h.xy.ar.b.m25095(highSpeedVideoFpsRanges);
        }
        return asyncResult;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(long j) {
        int i = getInputFormats + 109;
        getInputSizeshNQ4ISI = i % 128;
        try {
        } catch (java.lang.InterruptedException e) {
            e.getMessage();
        }
        if (i % 2 == 0) {
            java.lang.Thread.sleep(j);
            int i2 = getInputSizeshNQ4ISI + 17;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.Thread.sleep(j);
        throw null;
    }

    private static java.lang.String getHighSpeedVideoSizes() {
        java.lang.String intern;
        java.lang.String m25006;
        int i = getInputSizeshNQ4ISI + 53;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(6052 >>> (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "«¨ª©¨§¦\u008c\u008b\u0086\u008a\u0089\u0088\u0087¥¤£\u008a\u0085\u008e", objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            m25006 = util.h.xy.al.e.m25006();
            if (m25006 == null) {
                return intern;
            }
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "«¨ª©¨§¦\u008c\u008b\u0086\u008a\u0089\u0088\u0087¥¤£\u008a\u0085\u008e", objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            m25006 = util.h.xy.al.e.m25006();
            if (m25006 == null) {
                return intern;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(intern);
        char size = (char) (47282 - android.view.View.MeasureSpec.getSize(0));
        getInputFormats = (getInputSizeshNQ4ISI + 101) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ꏁ틿\udf2eኣ᷆乕瓞꽓倉鱘♁鐂\uea3fㅔ\uefb0꿣ណ촙", size, (-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), "䮎士눑炸", "\u0000\u0000\u0000\u0000", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(m25006);
            return sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "®\u0088\u008a\u0096\u0088\u0097\u0088\u00ad¬\u0090", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = getInputSizeshNQ4ISI + 93;
        getInputFormats = i % 128;
        int i2 = i % 2;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ꮹ膓뽡䧙\u2fe9工", (char) (3762 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "槃\u2429돣ꠎ", "\u0000\u0000\u0000\u0000", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "©«\u008e\u0089¨", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern().substring(1));
            sb.append(intern);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ጞ㶿泽ᆕ⋏﵁桟\ufde5㑦\udefd", (char) android.view.KeyEvent.keyCodeFromString(""), android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "訲ᛥ봃귪", "\u0000\u0000\u0000\u0000", objArr4);
            sb2.append(java.lang.System.getProperty(((java.lang.String) objArr4[0]).intern()));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("慢깯㟹孅篴鵂巂멥쁷ﺢᎨ", (char) android.text.TextUtils.getOffsetBefore("", 0), 1319321881 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "ᨚꍁ㱎\u175b", "\u0000\u0000\u0000\u0000", objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(obj);
            return sb2.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.BufferedReader] */
    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> Camera2StreamConfigurationMap(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream inputStream;
        ?? r8;
        ?? r2;
        util.h.xy.an.ra raVar;
        util.h.xy.an.ra raVar2;
        java.io.Reader reader;
        java.io.InputStream inputStream2 = null;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                java.lang.String str = "";
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        r8 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                    } catch (java.io.IOException e) {
                        e = e;
                    } catch (org.json.JSONException e2) {
                        e = e2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r8 = 0;
                    }
                    try {
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        while (str != null) {
                            stringBuffer.append(str);
                            str = r8.readLine();
                            getInputSizeshNQ4ISI = (getInputFormats + 47) % 128;
                        }
                        util.h.xy.bv.rb rbVar = new util.h.xy.bv.rb(responseCode);
                        java.lang.String obj = stringBuffer.toString();
                        int i = getInputFormats;
                        int i2 = i + 27;
                        getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                        if (obj != null) {
                            int i3 = i + 75;
                            getInputSizeshNQ4ISI = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            if (obj.length() != 0) {
                                org.json.JSONObject jSONObject = new org.json.JSONObject(obj);
                                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    getInputSizeshNQ4ISI = (getInputFormats + 81) % 128;
                                    java.lang.String next = keys.next();
                                    java.lang.String string = jSONObject.getString(next);
                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u008a\u008f\u0094\u0096\u0094\u008a", objArr);
                                    if (next.equals(((java.lang.String) objArr[0]).intern())) {
                                        rbVar.m25744(string.equalsIgnoreCase(util.h.xy.bv.rb.ra.f1062.toString()) ? util.h.xy.bv.rb.ra.f1062 : util.h.xy.bv.rb.ra.f1061);
                                    } else {
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(android.graphics.Color.blue(0) + 127, "\u008c\u008b\u008a\u0096\u0088\u00ad\u008a\u008f\u0094\u0096\u0094\u008a", objArr2);
                                        if (next.equals(((java.lang.String) objArr2[0]).intern())) {
                                            rbVar.m25743(java.lang.Integer.parseInt(string));
                                        } else {
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "¢\u008a°\u008a\u008f\u0094\u0096\u0094\u008a", objArr3);
                                            if (next.equals(((java.lang.String) objArr3[0]).intern())) {
                                                rbVar.m25748(string);
                                            } else {
                                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(127 - android.graphics.Color.green(0), "\u008b±\u008c\u008d\u0097\u0096\u008c\u008b\u0086\u0094\u0086\u0095\u0095\u0084\u008a\u008f\u0094\u0096\u0094\u008a", objArr4);
                                                if (next.equals(((java.lang.String) objArr4[0]).intern())) {
                                                    int i4 = getInputFormats + 77;
                                                    getInputSizeshNQ4ISI = i4 % 128;
                                                    if (i4 % 2 != 0) {
                                                        rbVar.m25746(getHighSpeedVideoFpsRangesFor(string));
                                                        throw new java.lang.ArithmeticException();
                                                    }
                                                    rbVar.m25746(getHighSpeedVideoFpsRangesFor(string));
                                                } else {
                                                    rbVar.m25747().put(next, string);
                                                }
                                            }
                                        }
                                    }
                                }
                                inputStream2 = inputStream;
                                raVar2 = new util.h.xy.an.ra(rbVar, true, null);
                                reader = r8;
                            }
                        }
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0097\u0097\u008f\u008c\u0090\u0089\u008b\u0090\u009b\u0094\u0085\u0081\u0088\u0090\u008a\u0086\u0090¢\u008c\u0086\u0089\u0094\u008a\u0090\u0088\u008a\u008c\u008b\u0085\u008a\u0088\u00ad", objArr5);
                        throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
                    } catch (java.io.IOException e3) {
                        e = e3;
                        inputStream2 = r8;
                        r2 = inputStream2;
                        inputStream2 = inputStream;
                        e.getMessage();
                        raVar = new util.h.xy.an.ra(e.getMessage());
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.io.IOException e4) {
                                e = e4;
                                e.printStackTrace();
                                return raVar;
                            }
                        }
                        if (r2 != 0) {
                            r2.close();
                        }
                        return raVar;
                    } catch (org.json.JSONException e5) {
                        e = e5;
                        inputStream2 = r8;
                        r2 = inputStream2;
                        inputStream2 = inputStream;
                        e.getMessage();
                        raVar = new util.h.xy.an.ra(e.getMessage());
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.io.IOException e6) {
                                e = e6;
                                e.printStackTrace();
                                return raVar;
                            }
                        }
                        if (r2 != 0) {
                            getInputSizeshNQ4ISI = (getInputFormats + 93) % 128;
                            r2.close();
                        }
                        return raVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        java.lang.Throwable th3 = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.io.IOException e7) {
                                e7.printStackTrace();
                                throw th3;
                            }
                        }
                        if (r8 == 0) {
                            throw th3;
                        }
                        r8.close();
                        throw th3;
                    }
                }
                if (responseCode == 401) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("궜別䲋駊骵\ued1a欛䵴쇲碤ꂔ玛㡉룋㌢핅蕦῾⓾\ue3af\uf7e8䎀\uf236\udf45鵉\ue0ae은㑉\u0e77㞝捶ढ㾌긢猺龧̚\uf2bf\uf649\ue37a撛ᚳ렮㶳⢦㵾沪㚇ɣ\u17eb䧊㣑잲", (char) (55534 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 132529114, "☄ᧄ\ueff8˘", "\u0000\u0000\u0000\u0000", objArr6);
                    raVar2 = new util.h.xy.an.ra(((java.lang.String) objArr6[0]).intern(), responseCode);
                } else if (responseCode == 408 || responseCode == 504) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("쏧癹\u1a9d\ufb1bꪄ䃣\ue429빘ن뷋\uec8c뵋錩ꅘ۴ୈꥸ觿\udc28敮菥笅㈖䋮∤ﳤ搿<냟뫫䇤Ǣꭜ泷렳\ue413\uec8a²峟\ueb35\uaafa\uf6dd﹣\ue946褚媼禭娰쑌\uf41fᑐ簛忶\u0601\ude73", (char) (10822 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 1524240699, "엠◮䚥\uf02a", "\u0000\u0000\u0000\u0000", objArr7);
                    raVar2 = new util.h.xy.an.ra(((java.lang.String) objArr7[0]).intern(), responseCode);
                } else {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.getOffsetAfter("", 0), "\u0089\u008b\u0089\u0089\u0088\u0090\u0081\u0088\u0094\u008a\u009b\u008a\u0090\u0089\u0088¯\u0089\u0088£", objArr8);
                    raVar2 = new util.h.xy.an.ra(((java.lang.String) objArr8[0]).intern(), responseCode);
                }
                reader = null;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e8) {
                        e8.printStackTrace();
                        return raVar2;
                    }
                }
                if (reader == null) {
                    return raVar2;
                }
                int i5 = getInputFormats + 45;
                getInputSizeshNQ4ISI = i5 % 128;
                if (i5 % 2 == 0) {
                    reader.close();
                    return raVar2;
                }
                reader.close();
                throw new java.lang.NullPointerException();
            } catch (java.lang.Throwable th4) {
                th = th4;
                r8 = r2;
                inputStream = inputStream2;
            }
        } catch (java.io.IOException e9) {
            e = e9;
            r2 = 0;
        } catch (org.json.JSONException e10) {
            e = e10;
            r2 = 0;
        } catch (java.lang.Throwable th5) {
            th = th5;
            inputStream = null;
            r8 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r5.isEmpty() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r7 = util.h.xy.bv.mb.getInputFormats + 71;
        util.h.xy.bv.mb.getInputSizeshNQ4ISI = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if ((r7 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r5.charAt(0) != '4') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r6 = util.h.xy.bv.mb.getInputSizeshNQ4ISI + 93;
        util.h.xy.bv.mb.getInputFormats = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if ((r6 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r5.charAt(r5.length() << 1) != ')') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        r2.put(r4, new org.json.JSONArray(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        util.h.xy.bv.mb.getInputSizeshNQ4ISI = (util.h.xy.bv.mb.getInputFormats + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        r2.put(r4, r0.get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (r5.charAt(r5.length() - 1) != ']') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
    
        if (r5.charAt(0) != '[') goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] getHighSpeedVideoFpsRanges() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        org.json.JSONObject jSONObject;
        java.util.Iterator<java.lang.String> it;
        java.util.Map<java.lang.String, java.lang.String> mo25690 = mo25690();
        byte[] bArr = null;
        if (mo25690 == null) {
            return null;
        }
        try {
            jSONObject = new org.json.JSONObject();
            it = mo25690.keySet().iterator();
        } catch (org.json.JSONException unused) {
            return bArr;
        }
        while (it.hasNext()) {
            java.lang.String next = it.next();
            java.lang.String str = mo25690.get(next);
            if (str != null && !str.isEmpty() && str.charAt(0) == '{') {
                int i = getInputFormats + 29;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    if (str.charAt(str.length()) == 7) {
                        try {
                            jSONObject.put(next, new org.json.JSONObject(str));
                        } catch (org.json.JSONException unused2) {
                            jSONObject.put(next, mo25690.get(next));
                        }
                    }
                } else {
                    if (str.charAt(str.length() - 1) != '}') {
                    }
                    jSONObject.put(next, new org.json.JSONObject(str));
                }
                return bArr;
            }
            jSONObject.put(next, mo25690.get(next));
        }
        bArr = jSONObject.toString().getBytes();
        mo25690.clear();
        return bArr;
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor(java.lang.String str) throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        getInputSizeshNQ4ISI = (getInputFormats + 25) % 128;
        while (keys.hasNext()) {
            getInputSizeshNQ4ISI = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            java.lang.String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }

    /* renamed from: util.h.xy.bv.mb$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.ck.d.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[util.h.xy.ck.d.f1115.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1112.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1110.ordinal()] = 3;
                int i = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i & 69) + (i | 69)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1108.ordinal()] = 4;
                int i2 = getHighSpeedVideoFpsRangesFor;
                int i3 = (i2 & 125) + (i2 | 125);
                getHighSpeedVideoSizes = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1109.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1111.ordinal()] = 6;
                int i5 = getHighSpeedVideoFpsRangesFor;
                int i6 = (i5 & 27) + (i5 | 27);
                getHighSpeedVideoSizes = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1114.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.ck.d.f1113.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        Camera2StreamConfigurationMap = new char[]{64252, 64267, 64230, 64296, 64249, 64240, 64263, 64244, 64251, 64250, 64254, 64255, 64272, 64266, 64228, 64329, 64273, 64261, 64281, 64229, 64245, 64264, 64253, 64241, 64298, 64316, 64224, 64318, 64243, 64257, 64299, 64262, 64260, 64246, 64282, 64277, 64274, 64300, 64295, 64319, 64312, 64315, 64313, 64305, 64283, 64304, 64231, 64284, 64247};
        getOutputStallDuration = -1074857111;
        getHighSpeedVideoSizes = true;
        getHighResolutionOutputSizeshNQ4ISI = true;
        getOutputSizeshNQ4ISI = 2457411417541981002L;
        getOutputFormats = 294925130;
        getHighSpeedVideoSizesFor = (char) 26374;
    }
}
