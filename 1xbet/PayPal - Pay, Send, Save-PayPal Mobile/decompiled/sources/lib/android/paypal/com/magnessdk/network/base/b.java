package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
class b implements lib.android.paypal.com.magnessdk.network.base.MagnesNetworking {
    private android.net.Uri Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> getInputSizeshNQ4ISI;
    private java.util.List<java.net.HttpCookie> getOutputMinFrameDuration;
    private java.lang.String getHighSpeedVideoFpsRangesFor = null;
    private final lib.android.paypal.com.magnessdk.network.base.g getHighSpeedVideoSizes = lib.android.paypal.com.magnessdk.network.base.g.getHighSpeedVideoFpsRanges();
    private java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setUri(android.net.Uri uri) {
        this.Camera2StreamConfigurationMap = uri;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setCookies(java.util.List<java.net.HttpCookie> list) {
        this.getOutputMinFrameDuration = list;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public byte[] getResponseContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public java.lang.String getPayPalDebugId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public java.util.List<java.lang.String> getCookies(java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getInputSizeshNQ4ISI;
        if (map == null || map.isEmpty() || str == null || str.isEmpty()) {
            return null;
        }
        return this.getInputSizeshNQ4ISI.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int execute(byte[] bArr) {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        ?? r3;
        java.io.OutputStream outputStream;
        java.lang.Object obj;
        javax.net.ssl.HttpsURLConnection httpsURLConnection2;
        java.io.OutputStream outputStream2 = null;
        try {
            httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(this.Camera2StreamConfigurationMap.toString()).openConnection();
            try {
                httpsURLConnection.setReadTimeout(lib.android.paypal.com.magnessdk.c.h.a.HTTP_READ_TIMEOUT.b());
                httpsURLConnection.setConnectTimeout(lib.android.paypal.com.magnessdk.c.h.a.HTTP_CONNECT_TIMEOUT.b());
                httpsURLConnection.setRequestMethod(lib.android.paypal.com.magnessdk.c.h.EnumC0225c.POST.toString());
                httpsURLConnection.setSSLSocketFactory(this.getHighSpeedVideoSizes);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setFixedLengthStreamingMode(bArr.length);
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
                }
                outputStream = httpsURLConnection.getOutputStream();
            } catch (java.lang.Exception e) {
                e = e;
                outputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                outputStream = null;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            httpsURLConnection = null;
            outputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            httpsURLConnection = null;
            r3 = 0;
            outputStream = outputStream2;
            lib.android.paypal.com.magnessdk.f.a(getClass(), r3);
            lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
            if (httpsURLConnection != null) {
            }
            throw th;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            this.getInputSizeshNQ4ISI = httpsURLConnection.getHeaderFields();
            int responseCode = httpsURLConnection.getResponseCode();
            this.getHighSpeedVideoFpsRangesFor = httpsURLConnection.getHeaderField(lib.android.paypal.com.magnessdk.c.b.b);
            if (responseCode == 200) {
                r3 = new java.io.BufferedInputStream(httpsURLConnection.getInputStream());
                try {
                    byte[] bArr2 = new byte[lib.android.paypal.com.magnessdk.c.h.a.READ_BYTE.b()];
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    while (true) {
                        int read = r3.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    this.getHighSpeedVideoFpsRanges = byteArrayOutputStream.toByteArray();
                    outputStream2 = r3;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    httpsURLConnection2 = httpsURLConnection;
                    try {
                        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
                        int b = lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_FAILED.b();
                        lib.android.paypal.com.magnessdk.f.a(getClass(), r3);
                        lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        return b;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        httpsURLConnection = httpsURLConnection2;
                        obj = r3;
                        outputStream2 = outputStream;
                        r3 = obj;
                        outputStream = outputStream2;
                        lib.android.paypal.com.magnessdk.f.a(getClass(), r3);
                        lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    lib.android.paypal.com.magnessdk.f.a(getClass(), r3);
                    lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
                    if (httpsURLConnection != null) {
                    }
                    throw th;
                }
            } else {
                this.getHighSpeedVideoFpsRanges = new byte[0];
            }
            lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream2);
            lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
            httpsURLConnection.disconnect();
            return responseCode;
        } catch (java.lang.Exception e4) {
            e = e4;
            r3 = 0;
            httpsURLConnection2 = httpsURLConnection;
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            int b2 = lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_FAILED.b();
            lib.android.paypal.com.magnessdk.f.a(getClass(), r3);
            lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
            if (httpsURLConnection2 != null) {
            }
            return b2;
        } catch (java.lang.Throwable th5) {
            th = th5;
            obj = null;
            outputStream2 = outputStream;
            r3 = obj;
            outputStream = outputStream2;
            lib.android.paypal.com.magnessdk.f.a(getClass(), r3);
            lib.android.paypal.com.magnessdk.f.a(getClass(), outputStream);
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }
}
