package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jf {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2700 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2703;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2705 = {777529049, -445050213, 1051987069, -210384315, -1520647526, -923434848, -388811378, 70463851, 1971679432, 589646508, 348072701, -360958552, -965884002, -922189606, 471650386, 235305070, -1341288195, 1121399519};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2702 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2701 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2704 = 27295;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r3 >= 400) goto L9;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.ironsource.adqualitysdk.sdk.i.jd m8135(org.json.JSONObject jSONObject, java.lang.String str) {
        java.net.HttpURLConnection m8131;
        long m8356;
        java.lang.String m8137;
        int responseCode;
        java.lang.String responseMessage;
        int i = 2 % 2;
        int i2 = f2703 + 35;
        f2700 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8131 = m8131(str);
                byte[] m8134 = m8134(m8131, jSONObject);
                m8356 = com.ironsource.adqualitysdk.sdk.i.ke.m8356();
                m8142(m8131, m8134);
                m8137 = m8137(m8131);
                responseCode = m8131.getResponseCode();
                responseMessage = m8131.getResponseMessage();
                if (responseCode >= 5376) {
                    m8131.disconnect();
                }
                com.ironsource.adqualitysdk.sdk.i.jd jdVar = new com.ironsource.adqualitysdk.sdk.i.jd(m8137, responseCode, responseMessage, com.ironsource.adqualitysdk.sdk.i.ke.m8356() - m8356);
                int i3 = f2703 + 109;
                f2700 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 78 / 0;
                }
                return jdVar;
            }
            m8131 = m8131(str);
            byte[] m81342 = m8134(m8131, jSONObject);
            m8356 = com.ironsource.adqualitysdk.sdk.i.ke.m8356();
            m8142(m8131, m81342);
            m8137 = m8137(m8131);
            responseCode = m8131.getResponseCode();
            responseMessage = m8131.getResponseMessage();
        } catch (java.lang.Throwable th) {
            java.lang.String intern = m8140(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, 8 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8139((char) (44816 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "溿䖲ྙ綯", "\ue688긫뙴樥醴瓲폡㻆칱徯꾀\ue773낽䤖휎쓢讝弹Ύⶫ萻\uf391㠢\ue0fe龄ᾝ\uf664\udf37", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
            sb.append(th.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8532(intern, sb.toString(), th);
            return null;
        }
        java.lang.String intern2 = m8140(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, 8 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(m8139((char) (44816 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "溿䖲ྙ綯", "\ue688긫뙴樥醴瓲폡㻆칱徯꾀\ue773낽䤖휎쓢讝弹Ύⶫ萻\uf391㠢\ue0fe龄ᾝ\uf664\udf37", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb2.append(th.getLocalizedMessage());
        com.ironsource.adqualitysdk.sdk.i.m.m8532(intern2, sb2.toString(), th);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5 >= 400) goto L10;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.ironsource.adqualitysdk.sdk.i.jd m8138(java.lang.String str) {
        java.net.HttpURLConnection m8133;
        long m8356;
        java.lang.String m8137;
        int responseCode;
        java.lang.String responseMessage;
        int i = 2 % 2;
        int i2 = f2700 + 65;
        f2703 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8133 = m8133(str);
                m8356 = com.ironsource.adqualitysdk.sdk.i.ke.m8356();
                m8137 = m8137(m8133);
                responseCode = m8133.getResponseCode();
                responseMessage = m8133.getResponseMessage();
                if (responseCode >= 30118) {
                    int i3 = f2700 + 59;
                    f2703 = i3 % 128;
                    if (i3 % 2 == 0) {
                        m8133.disconnect();
                        int i4 = f2700 + 47;
                        f2703 = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        m8133.disconnect();
                        throw null;
                    }
                }
                return new com.ironsource.adqualitysdk.sdk.i.jd(m8137, responseCode, responseMessage, com.ironsource.adqualitysdk.sdk.i.ke.m8356() - m8356);
            }
            m8133 = m8133(str);
            m8356 = com.ironsource.adqualitysdk.sdk.i.ke.m8356();
            m8137 = m8137(m8133);
            responseCode = m8133.getResponseCode();
            responseMessage = m8133.getResponseMessage();
        } catch (java.lang.Throwable th) {
            java.lang.String intern = m8140(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, 7 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8140(new int[]{927225483, 637520133, 1187850471, -1745922011, 1424555418, 188892864, -732652938, -2020350892, -1372508385, 1902585592, -709570317, -1390816468, 562056447, -590956699}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26).intern());
            sb.append(th.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8532(intern, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8142(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.io.IOException {
        int i = 2 % 2;
        httpURLConnection.connect();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m8141(dataOutputStream);
        int i2 = f2703 + 67;
        f2700 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (m8144(r10) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (m8144(r10) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0063, code lost:
    
        r9.setRequestProperty(m8139((char) (15436 - android.graphics.Color.blue(0)), "\u0000\u0000\u0000\u0000", "玓윺䳺︼", "撎鏾⾋\uf473铲\uf2f0문楁\u0004گ抚푏杌ｩ뻷랳", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), m8139((char) (24621 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), "\u0000\u0000\u0000\u0000", "ڌﶮⶖ덠", "촲⛒ࡅ昘", android.graphics.Color.green(0)).intern());
        r1 = m8132(r1);
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m8134(java.net.HttpURLConnection httpURLConnection, org.json.JSONObject jSONObject) throws org.json.JSONException, java.io.UnsupportedEncodingException {
        byte[] bytes;
        int i = 2 % 2;
        int i2 = f2703 + 51;
        f2700 = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.String m8143 = m8143(jSONObject);
            bytes = m8143.getBytes(m8139((char) (18594 % android.view.KeyEvent.getDeadChar(1, 0)), "\u0000\u0000\u0000\u0000", "\udc70Ά嶷Ď", "\uf2ca㜓ꌡ섋揔", (-1222657060) % (android.view.ViewConfiguration.getEdgeSlop() >> 93)).intern());
        } else {
            java.lang.String m81432 = m8143(jSONObject);
            bytes = m81432.getBytes(m8139((char) (3677 - android.view.KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", "\udc70Ά嶷Ď", "\uf2ca㜓ꌡ섋揔", (-1222657060) - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern());
        }
        int i3 = f2703 + 61;
        f2700 = i3 % 128;
        if (i3 % 2 != 0) {
            return bytes;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.net.HttpURLConnection m8131(java.lang.String str) throws java.io.IOException {
        int i = 2 % 2;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setRequestMethod(m8139((char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44597), "\u0000\u0000\u0000\u0000", "쌎\udbc3㖩鶮", "்㪉㲜섊", (-1) - android.text.TextUtils.lastIndexOf("", '0', 0)).intern());
        httpURLConnection.setRequestProperty(m8140(new int[]{-77275737, -1398504272, -1427219234, -1813192374, 1592349327, -442647392}, 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m8140(new int[]{1446984398, 1074853980, 1807664080, 671645330, 2113965368, 1584918440, -2146721375, -731787300, 1360842251, 1420397865, 92204963, 863076686, 1146677413, 531049206, -1784590993, 1052142629}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i2 = f2703 + 17;
        f2700 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return httpURLConnection;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.net.HttpURLConnection m8133(java.lang.String str) throws java.io.IOException {
        int i = 2 % 2;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setRequestMethod(m8139((char) (16279 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), "\u0000\u0000\u0000\u0000", "软潄靬\uee3f", "暡駯稐", 1819231375 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        int i2 = f2700 + 17;
        f2703 = i2 % 128;
        if (i2 % 2 == 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8137(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream inputStream;
        java.io.BufferedReader bufferedReader;
        int i = 2 % 2;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                try {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    int i2 = f2700 + 35;
                    f2703 = i2 % 128;
                    int i3 = i2 % 2;
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (stringBuffer.length() > 0) {
                                int i4 = f2703 + 13;
                                f2700 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    stringBuffer.append('7');
                                } else {
                                    stringBuffer.append('\r');
                                }
                            }
                            stringBuffer.append(readLine);
                        } else {
                            return stringBuffer.toString();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        com.ironsource.adqualitysdk.sdk.i.m.m8532(m8140(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, android.graphics.Color.blue(0) + 8).intern(), m8139((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", "\ued56沶ﮎ鯜", "煫≤뢺ㅷ鷧譨魱캙梟ⷂ䶊闖敯㐈➧\ufafa쐁缅㷝륑懍雵", android.text.TextUtils.getCapsMode("", 0, 0)).intern(), th);
                        return null;
                    } finally {
                        m8141(inputStream);
                        m8141(bufferedReader);
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8141(java.io.Closeable closeable) {
        int i = 2 % 2;
        int i2 = f2700 + 45;
        int i3 = i2 % 128;
        f2703 = i3;
        int i4 = i2 % 2;
        if (closeable != null) {
            int i5 = i3 + 79;
            f2700 = i5 % 128;
            int i6 = i5 % 2;
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8144(java.lang.String str) {
        int i = 2 % 2;
        if (str.length() <= 256) {
            return false;
        }
        int i2 = f2703 + 17;
        int i3 = i2 % 128;
        f2700 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        f2703 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m8132(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.util.zip.GZIPOutputStream gZIPOutputStream;
        int i = 2 % 2;
        java.util.zip.GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i2 = f2703 + 43;
            f2700 = i2 % 128;
            if (i2 % 2 != 0) {
                return byteArray;
            }
            super.hashCode();
            throw null;
        } catch (java.lang.Exception e2) {
            e = e2;
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (java.lang.Exception unused) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8143(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        java.lang.String jSONObject2 = jSONObject.toString();
        java.lang.String m8383 = com.ironsource.adqualitysdk.sdk.i.kg.m8383(jSONObject2);
        java.lang.String substring = jSONObject2.substring(0, jSONObject2.lastIndexOf(125));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(m8140(new int[]{-843653862, 1631784646, -52937495, 1598305464}, 7 - android.graphics.Color.green(0)).intern());
        sb.append(m8383);
        sb.append(m8139((char) (android.graphics.Color.blue(0) + 54264), "\u0000\u0000\u0000\u0000", "켅뷍\uf885㟓", "辳艷", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1).intern());
        java.lang.String obj = sb.toString();
        int i2 = f2700 + 87;
        f2703 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.String m8136(com.ironsource.adqualitysdk.sdk.i.jd jdVar) {
        int i = 2 % 2;
        int i2 = f2700;
        int i3 = i2 + 11;
        f2703 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (jdVar == null) {
            int i4 = i2 + 105;
            f2703 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        java.lang.String m8127 = jdVar.m8127();
        int i6 = f2700 + 65;
        f2703 = i6 % 128;
        int i7 = i6 % 2;
        return m8127;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8140(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2705.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
            }
            str = new java.lang.String(cArr2, 0, i);
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8139(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2702) ^ f2701) ^ f2704);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
