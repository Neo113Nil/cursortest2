package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
class a implements lib.android.paypal.com.magnessdk.network.base.MagnesNetworking {
    private byte[] getHighSpeedVideoFpsRangesFor;
    private android.net.Uri getHighSpeedVideoSizes;
    private java.util.List<java.net.HttpCookie> getInputFormats;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> getInputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges = null;
    private final lib.android.paypal.com.magnessdk.network.base.g getHighResolutionOutputSizeshNQ4ISI = lib.android.paypal.com.magnessdk.network.base.g.getHighSpeedVideoFpsRanges();
    private java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = new java.util.HashMap();

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setUri(android.net.Uri uri) {
        this.getHighSpeedVideoSizes = uri;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        this.Camera2StreamConfigurationMap = map;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setCookies(java.util.List<java.net.HttpCookie> list) {
        this.getInputFormats = list;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public byte[] getResponseContent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public java.lang.String getPayPalDebugId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public java.util.List<java.lang.String> getCookies(java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getInputSizeshNQ4ISI;
        if (map == null || map.isEmpty() || str == null || str.isEmpty()) {
            return null;
        }
        return this.getInputSizeshNQ4ISI.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int execute(byte[] bArr) {
        java.lang.Throwable th;
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Exception e;
        try {
            httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(this.getHighSpeedVideoSizes.toString()).openConnection();
        } catch (java.lang.Exception e2) {
            e = e2;
            httpsURLConnection = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            httpsURLConnection = null;
            bufferedInputStream = null;
        }
        try {
            httpsURLConnection.setReadTimeout(lib.android.paypal.com.magnessdk.c.h.a.HTTP_READ_TIMEOUT.b());
            httpsURLConnection.setConnectTimeout(lib.android.paypal.com.magnessdk.c.h.a.HTTP_CONNECT_TIMEOUT.b());
            httpsURLConnection.setRequestMethod(lib.android.paypal.com.magnessdk.c.h.EnumC0225c.GET.toString());
            java.util.List<java.net.HttpCookie> list = this.getInputFormats;
            if (list != null && list.size() > 0) {
                httpsURLConnection.setRequestProperty("Cookie", android.text.TextUtils.join(";", this.getInputFormats));
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.Camera2StreamConfigurationMap.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
            }
            this.getInputSizeshNQ4ISI = httpsURLConnection.getHeaderFields();
            int responseCode = httpsURLConnection.getResponseCode();
            this.getHighSpeedVideoFpsRanges = httpsURLConnection.getHeaderField(lib.android.paypal.com.magnessdk.c.b.b);
            if (responseCode == 200) {
                bufferedInputStream = new java.io.BufferedInputStream(httpsURLConnection.getInputStream());
                try {
                    try {
                        byte[] bArr2 = new byte[lib.android.paypal.com.magnessdk.c.h.a.READ_BYTE.b()];
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        while (true) {
                            int read = bufferedInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        this.getHighSpeedVideoFpsRangesFor = byteArrayOutputStream.toByteArray();
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
                        int b = lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_FAILED.b();
                        lib.android.paypal.com.magnessdk.f.a(getClass(), bufferedInputStream);
                        lib.android.paypal.com.magnessdk.f.a(getClass(), null);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        return b;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    lib.android.paypal.com.magnessdk.f.a(getClass(), bufferedInputStream);
                    lib.android.paypal.com.magnessdk.f.a(getClass(), null);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } else {
                this.getHighSpeedVideoFpsRangesFor = new byte[0];
                bufferedInputStream = null;
            }
            lib.android.paypal.com.magnessdk.f.a(getClass(), bufferedInputStream);
            lib.android.paypal.com.magnessdk.f.a(getClass(), null);
            httpsURLConnection.disconnect();
            return responseCode;
        } catch (java.lang.Exception e4) {
            e = e4;
            bufferedInputStream = null;
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            int b2 = lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_FAILED.b();
            lib.android.paypal.com.magnessdk.f.a(getClass(), bufferedInputStream);
            lib.android.paypal.com.magnessdk.f.a(getClass(), null);
            if (httpsURLConnection != null) {
            }
            return b2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            lib.android.paypal.com.magnessdk.f.a(getClass(), bufferedInputStream);
            lib.android.paypal.com.magnessdk.f.a(getClass(), null);
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }
}
