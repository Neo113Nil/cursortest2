package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03581k extends com.facebook.ads.redexgen.core.AQ implements com.facebook.ads.redexgen.core.AJ {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"oHtrkf711", "OALAWpvM4V43TAH4yIQoOhxEEr6GacAE", "Hh5EFVgHa3Asp8lHlYejA", "RFLx7idHDwwo1808RkkCK", "SJ5smVJpw", "R3kqAJTnVJNs7pGyArjUElZegIjSHDR8", "bae9e6aq2V8bVVKZmWDXAczRXcgESOJG", "FE1YY4rUq5RhzOvKgv0QhVD"};

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    public static final java.util.regex.Pattern A0I;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Meta Specific, added in D30556310")
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public com.facebook.ads.redexgen.core.C04565i A04;
    public com.facebook.ads.redexgen.core.InterfaceC1867kj<java.lang.String> A05;
    public java.io.InputStream A06;
    public java.net.HttpURLConnection A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final com.facebook.ads.redexgen.core.C04625o A0B;
    public final com.facebook.ads.redexgen.core.C04625o A0C;
    public final java.lang.String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Meta Specific, added in D4001689 for 'Handling loopback Address'")
    private java.net.HttpURLConnection A05(java.net.URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException {
        java.net.HttpURLConnection A06 = java.net.InetAddress.getByName(url.getHost()).isLoopbackAddress() ? A06(url, java.net.Proxy.NO_PROXY) : A04(url);
        A06.setConnectTimeout(this.A09);
        A06.setReadTimeout(this.A0A);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (this.A0B != null) {
            hashMap.putAll(this.A0B.A00());
        }
        hashMap.putAll(this.A0C.A00());
        hashMap.putAll(map);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            A06.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String A03 = com.facebook.ads.redexgen.core.AbstractC04635p.A03(j, j2);
        if (A03 != null) {
            A06.setRequestProperty(A02(172, 5, 115), A03);
        }
        if (this.A0D != null) {
            A06.setRequestProperty(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 10, 51), this.A0D);
        }
        A06.setRequestProperty(A02(5, 15, 86), z ? A02(490, 4, 104) : A02(503, 8, 3));
        A06.setInstanceFollowRedirects(z2);
        A06.setDoOutput(bArr != null);
        A06.setRequestMethod(com.facebook.ads.redexgen.core.C04565i.A01(i));
        if (bArr != null) {
            A06.setFixedLengthStreamingMode(bArr.length);
            A06.connect();
            java.io.OutputStream outputStream = A06.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A06.connect();
        }
        return A06;
    }

    public static void A09() {
        A0G = new byte[]{-93, -9, -14, -93, 126, -89, -55, -55, -53, -42, -38, -109, -85, -44, -55, -43, -54, -49, -44, -51, -90, -46, -47, -41, -56, -47, -41, -112, -88, -47, -58, -46, -57, -52, -47, -54, -65, -21, -22, -16, -31, -22, -16, -87, -56, -31, -22, -29, -16, -28, -113, -69, -70, -64, -79, -70, -64, 121, -98, -83, -70, -77, -79, 126, -97, -96, -101, -81, -90, -82, -126, -82, -82, -86, 126, -101, -82, -101, -115, -87, -81, -84, -99, -97, -67, -30, -20, -38, -27, -27, -24, -16, -34, -35, -103, -36, -21, -24, -20, -20, -90, -23, -21, -24, -19, -24, -36, -24, -27, -103, -21, -34, -35, -30, -21, -34, -36, -19, -103, -95, 121, -98, -109, -97, -98, -93, -103, -93, -92, -107, -98, -92, 80, -104, -107, -111, -108, -107, -94, -93, 80, -117, -122, -87, -99, -101, -82, -93, -87, -88, -53, -14, -23, -23, -99, -23, -20, -32, -34, -15, -26, -20, -21, -99, -17, -30, -31, -26, -17, -30, -32, -15, -43, -28, -15, -22, -24, -56, -29, -29, -108, -31, -43, -30, -19, -108, -26, -39, -40, -35, -26, -39, -41, -24, -25, -82, -108, -97, -72, -81, -62, -70, -81, -83, -66, -81, -82, 106, -115, -71, -72, -66, -81, -72, -66, 119, -106, -81, -72, -79, -66, -78, 106, -91, 122, -109, -118, -99, -107, -118, -120, -103, -118, -119, 69, 104, -108, -109, -103, -118, -109, -103, 82, 119, -122, -109, -116, -118, 69, Byte.MIN_VALUE, 113, -118, -127, -108, -116, -127, Byte.MAX_VALUE, -112, -127, Byte.MIN_VALUE, 60, -127, -114, -114, -117, -114, 60, -109, -124, -123, -120, -127, 60, Byte.MIN_VALUE, -123, -113, Byte.MAX_VALUE, -117, -118, -118, -127, Byte.MAX_VALUE, -112, -123, -118, -125, -100, -75, -70, -68, -73, -73, -74, -71, -69, -84, -85, 103, -73, -71, -74, -69, -74, -86, -74, -77, 103, -71, -84, -85, -80, -71, -84, -86, -69, -127, 103, -104, -74, -88, -75, 112, -124, -86, -88, -79, -73, -47, 111, 50, 109, 116, 120, -113, -118, 123, -119, 54, 62, 114, 122, 65, 63, 67, 62, 114, 122, 65, 63, 69, 62, 114, 122, 65, 63, 58, -126, -114, -116, 77, Byte.MIN_VALUE, -115, -125, -111, -114, -120, -125, 77, -114, -118, -121, -109, -109, -113, 77, -120, -115, -109, -124, -111, -115, Byte.MIN_VALUE, -117, 77, -121, -109, -109, -113, 77, 103, -109, -109, -113, 115, -111, Byte.MIN_VALUE, -115, -110, -113, -114, -111, -109, 67, 98, -121, -108, -115, -118, -124, -125, 104, -115, -113, -108, -109, 114, -109, -111, -124, Byte.MIN_VALUE, -116, -73, -61, -63, -126, -75, -62, -72, -58, -61, -67, -72, -126, -61, -65, -68, -56, -56, -60, -126, -67, -62, -56, -71, -58, -62, -75, -64, -126, -68, -56, -56, -60, -126, -100, -56, -56, -60, -88, -58, -75, -62, -57, -60, -61, -58, -56, 120, -102, -67, -52, -71, -72, -96, -71, -62, -69, -56, -68, -99, -62, -60, -55, -56, -89, -56, -58, -71, -75, -63, -33, -14, -31, -24, -29, -17, -17, -21, -57, -45, -45, -49, -46, 124, 119, 120, -127, -121, 124, -121, -116, 2, -5, -14, 5, -3, -14, -16, 1, -14, -15, -46, -5, -15, -36, -13, -42, -5, -3, 2, 1};
    }

    static {
        A09();
        A0I = java.util.regex.Pattern.compile(A02(331, 25, 6));
    }

    @java.lang.Deprecated
    public C03581k() {
        this(null, 8000, 8000);
    }

    @java.lang.Deprecated
    public C03581k(java.lang.String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @java.lang.Deprecated
    public C03581k(java.lang.String str, int i, int i2, boolean z, com.facebook.ads.redexgen.core.C04625o c04625o) {
        this(str, i, i2, z, c04625o, null, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<java.lang.String> */
    public C03581k(java.lang.String str, int i, int i2, boolean z, com.facebook.ads.redexgen.core.C04625o c04625o, com.facebook.ads.redexgen.core.InterfaceC1867kj<java.lang.String> interfaceC1867kj, boolean z2) {
        super(true);
        this.A00 = -1;
        this.A0D = str;
        this.A09 = i;
        this.A0A = i2;
        this.A0E = z;
        this.A0B = c04625o;
        this.A05 = interfaceC1867kj;
        this.A0C = new com.facebook.ads.redexgen.core.C04625o();
        this.A0F = z2;
    }

    private int A00(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A03 != -1) {
            long bytesRemaining = this.A03 - this.A02;
            if (bytesRemaining == 0) {
                return -1;
            }
            i2 = (int) java.lang.Math.min(i2, bytesRemaining);
        }
        int read = ((java.io.InputStream) com.facebook.ads.redexgen.core.C5C.A0f(this.A06)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.A02 += read;
        A0F(read);
        return read;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    public static long A01(java.net.HttpURLConnection httpURLConnection) {
        long j = -1;
        java.lang.String headerField = httpURLConnection.getHeaderField(A02(36, 14, 108));
        boolean isEmpty = android.text.TextUtils.isEmpty(headerField);
        java.lang.String A02 = A02(327, 1, 100);
        java.lang.String A022 = A02(63, 21, 42);
        if (!isEmpty) {
            try {
                j = java.lang.Long.parseLong(headerField);
            } catch (java.lang.NumberFormatException unused) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A05(A022, A02(197, 27, 58) + headerField + A02);
            }
        }
        java.lang.String headerField2 = httpURLConnection.getHeaderField(A02(50, 13, 60));
        if (!android.text.TextUtils.isEmpty(headerField2)) {
            java.util.regex.Matcher matcher = A0I.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long parseLong = (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                    if (j < 0) {
                        return parseLong;
                    }
                    if (j != parseLong) {
                        com.facebook.ads.redexgen.core.AbstractC04284g.A07(A022, A02(120, 22, 32) + headerField + A02(328, 3, 2) + headerField2 + A02);
                        j = java.lang.Math.max(j, parseLong);
                        return j;
                    }
                    return j;
                } catch (java.lang.NumberFormatException unused2) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A05(A022, A02(224, 26, 21) + headerField2 + A02);
                    return j;
                }
            }
            return j;
        }
        return j;
    }

    private java.net.HttpURLConnection A03(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        java.net.HttpURLConnection A05;
        java.net.URL url = new java.net.URL(c04565i.A06.toString());
        int i = c04565i.A01;
        byte[] bArr = c04565i.A0A;
        long j = c04565i.A04;
        long j2 = c04565i.A03;
        boolean A06 = c04565i.A06(1);
        if (!this.A0E && !this.A0F) {
            java.util.Map<java.lang.String, java.lang.String> map = c04565i.A09;
            java.lang.String[] strArr = A0H;
            if (strArr[2].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0H[1] = "MDuHDm4cbdnEm3n4Ii2p7N8pDyl3ksX4";
            return A05(url, i, bArr, j, j2, A06, true, map);
        }
        int responseCode = 0;
        while (true) {
            int i2 = responseCode + 1;
            if (responseCode > 20) {
                throw new com.facebook.ads.redexgen.core.C2122p5(new java.net.NoRouteToHostException(A02(177, 20, 100) + i2), c04565i, 2001, 1);
            }
            java.net.URL url2 = url;
            A05 = A05(url, i, bArr, j, j2, A06, false, c04565i.A09);
            int responseCode2 = A05.getResponseCode();
            java.lang.String headerField = A05.getHeaderField(A02(142, 8, 42));
            if ((i == 1 || i == 3) && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303 || responseCode2 == 307 || responseCode2 == 308)) {
                A05.disconnect();
                url = A07(url2, headerField, c04565i);
            } else {
                if (i != 2 || (responseCode2 != 300 && responseCode2 != 301 && responseCode2 != 302 && responseCode2 != 303)) {
                    break;
                }
                A05.disconnect();
                if (!(this.A0F && responseCode2 == 302)) {
                    i = 1;
                    bArr = null;
                }
                url = A07(url2, headerField, c04565i);
            }
            responseCode = i2;
        }
        return A05;
    }

    private final java.net.HttpURLConnection A04(java.net.URL url) throws java.io.IOException {
        return (java.net.HttpURLConnection) url.openConnection();
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    private final java.net.HttpURLConnection A06(java.net.URL url, java.net.Proxy proxy) throws java.io.IOException {
        return (java.net.HttpURLConnection) url.openConnection(proxy);
    }

    private java.net.URL A07(java.net.URL url, java.lang.String str, com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C2122p5 {
        if (str == null) {
            throw new com.facebook.ads.redexgen.core.C2122p5(A02(androidx.compose.material.TextFieldImplKt.AnimationDuration, 22, 109), c04565i, 2001, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!A02(498, 5, 79).equals(protocol) && !A02(494, 4, 107).equals(protocol)) {
                throw new com.facebook.ads.redexgen.core.C2122p5(A02(286, 31, 55) + protocol, c04565i, 2001, 1);
            }
            if (!this.A0E && !protocol.equals(url.getProtocol())) {
                throw new com.facebook.ads.redexgen.core.C2122p5(A02(84, 36, 105) + url.getProtocol() + A02(0, 4, 115) + protocol + A02(4, 1, 69), c04565i, 2001, 1);
            }
            return url2;
        } catch (java.net.MalformedURLException e) {
            throw new com.facebook.ads.redexgen.core.C2122p5(e, c04565i, 2001, 1);
        }
    }

    private void A08() {
        if (this.A07 != null) {
            try {
                this.A07.disconnect();
            } catch (java.lang.Exception e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A02(63, 21, 42), A02(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 36, 12), e);
            }
            this.A07 = null;
        }
    }

    private void A0A(long j, com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((java.io.InputStream) com.facebook.ads.redexgen.core.C5C.A0f(this.A06)).read(bArr, 0, (int) java.lang.Math.min(j, bArr.length));
            if (!java.lang.Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j -= read;
                    A0F(read);
                } else {
                    throw new com.facebook.ads.redexgen.core.C2122p5(c04565i, 2008, 1);
                }
            } else {
                throw new com.facebook.ads.redexgen.core.C2122p5(new java.io.InterruptedIOException(), c04565i, 2000, 1);
            }
        }
    }

    public static void A0B(java.net.HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null) {
            int i = com.facebook.ads.redexgen.core.C5C.A02;
            if (A0H[5].charAt(19) == 'a') {
                throw new java.lang.RuntimeException();
            }
            A0H[7] = "Vr7TSbIm52LxE4LVc9eYFTM";
            if (i < 19 || com.facebook.ads.redexgen.core.C5C.A02 > 20) {
                return;
            }
            try {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                java.lang.String name = inputStream.getClass().getName();
                if (A02(356, 65, 15).equals(name) || A02(okhttp3.internal.http.StatusLine.HTTP_MISDIRECTED_REQUEST, 69, 68).equals(name)) {
                    java.lang.reflect.Method declaredMethod = ((java.lang.Class) com.facebook.ads.redexgen.core.AbstractC04203y.A01(inputStream.getClass().getSuperclass())).getDeclaredMethod(A02(androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, 20, 125), new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new java.lang.Object[0]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static boolean A0C(java.net.HttpURLConnection httpURLConnection) {
        java.lang.String headerField = httpURLConnection.getHeaderField(A02(20, 16, 83));
        java.lang.String contentEncoding = A02(490, 4, 104);
        return contentEncoding.equalsIgnoreCase(headerField);
    }

    public final void A0I(java.lang.String str, java.lang.String str2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(str);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(str2);
        this.A0C.A01(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.AQ, com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
        if (this.A07 == null) {
            return com.facebook.ads.redexgen.core.AbstractC2088oX.A04();
        }
        return new com.facebook.ads.redexgen.core.AN(this.A07.getHeaderFields());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        if (this.A07 == null) {
            return null;
        }
        return android.net.Uri.parse(this.A07.getURL().toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("customizations: (1) loop commented 'Append headers from data spec' (D6487388,D6506073) (2) ischunkedTransfer (D15078204)")
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C2122p5 {
        byte[] bArr;
        com.facebook.ads.redexgen.core.C04495b c04495b;
        this.A04 = c04565i;
        long j = 0;
        this.A02 = 0L;
        this.A03 = 0L;
        A0G(c04565i);
        if (c04565i.A07 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : c04565i.A07.A0P.entrySet()) {
                A0I(entry.getKey(), entry.getValue());
            }
        }
        try {
            this.A07 = A03(c04565i);
            java.net.HttpURLConnection httpURLConnection = this.A07;
            this.A01 = httpURLConnection.getResponseCode();
            java.lang.String responseMessage = httpURLConnection.getResponseMessage();
            int i = this.A01;
            java.lang.String A02 = A02(50, 13, 60);
            if (i < 200 || this.A01 > 299) {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = httpURLConnection.getHeaderFields();
                if (this.A01 == 416) {
                    if (c04565i.A04 == com.facebook.ads.redexgen.core.AbstractC04635p.A00(httpURLConnection.getHeaderField(A02))) {
                        this.A08 = true;
                        A0H(c04565i);
                        if (c04565i.A03 != -1) {
                            return c04565i.A03;
                        }
                        return 0L;
                    }
                }
                java.io.InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? com.facebook.ads.redexgen.core.C5C.A1F(errorStream) : com.facebook.ads.redexgen.core.C5C.A07;
                } catch (java.io.IOException unused) {
                    bArr = com.facebook.ads.redexgen.core.C5C.A07;
                }
                A08();
                if (this.A01 == 416) {
                    c04495b = new com.facebook.ads.redexgen.core.C04495b(2008);
                } else {
                    c04495b = null;
                }
                throw new com.facebook.ads.redexgen.core.AK(this.A01, responseMessage, c04495b, headers, c04565i, bArr);
            }
            java.lang.String contentType = httpURLConnection.getContentType();
            if (this.A05 == null || this.A05.A4C(contentType)) {
                if (this.A01 == 200 && c04565i.A04 != 0) {
                    j = c04565i.A04;
                }
                boolean A0C = A0C(httpURLConnection);
                if (A0C) {
                    this.A03 = c04565i.A03;
                } else {
                    int i2 = (A01(httpURLConnection) > (-1L) ? 1 : (A01(httpURLConnection) == (-1L) ? 0 : -1));
                    if (c04565i.A03 != -1) {
                        this.A03 = c04565i.A03;
                    } else {
                        long A01 = com.facebook.ads.redexgen.core.AbstractC04635p.A01(httpURLConnection.getHeaderField(A02(36, 14, 108)), httpURLConnection.getHeaderField(A02));
                        this.A03 = A01 != -1 ? A01 - j : -1L;
                    }
                }
                try {
                    this.A06 = httpURLConnection.getInputStream();
                    if (A0C) {
                        this.A06 = new java.util.zip.GZIPInputStream(this.A06);
                    }
                    this.A08 = true;
                    A0H(c04565i);
                    try {
                        A0A(j, c04565i);
                        return this.A03;
                    } catch (java.io.IOException e) {
                        A08();
                        if (!(e instanceof com.facebook.ads.redexgen.core.C2122p5)) {
                            throw new com.facebook.ads.redexgen.core.C2122p5(e, c04565i, 2000, 1);
                        }
                        throw ((com.facebook.ads.redexgen.core.C2122p5) e);
                    }
                } catch (java.io.IOException e2) {
                    A08();
                    throw new com.facebook.ads.redexgen.core.C2122p5(e2, c04565i, 2000, 1);
                }
            }
            A08();
            java.io.IOException e3 = new com.facebook.ads.redexgen.core.AL(contentType, c04565i);
            throw e3;
        } catch (java.io.IOException e4) {
            A08();
            throw com.facebook.ads.redexgen.core.C2122p5.A04(e4, c04565i, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() throws com.facebook.ads.redexgen.core.C2122p5 {
        try {
            java.io.InputStream inputStream = this.A06;
            if (inputStream != null) {
                A0B(this.A07, this.A03 != -1 ? this.A03 - this.A02 : -1L);
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    throw new com.facebook.ads.redexgen.core.C2122p5(e, (com.facebook.ads.redexgen.core.C04565i) com.facebook.ads.redexgen.core.C5C.A0f(this.A04), 2000, 3);
                }
            }
        } finally {
            this.A06 = null;
            A08();
            if (this.A08) {
                this.A08 = false;
                A0E();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws com.facebook.ads.redexgen.core.C2122p5 {
        try {
            return A00(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw com.facebook.ads.redexgen.core.C2122p5.A04(e, (com.facebook.ads.redexgen.core.C04565i) com.facebook.ads.redexgen.core.C5C.A0f(this.A04), 2);
        }
    }
}
