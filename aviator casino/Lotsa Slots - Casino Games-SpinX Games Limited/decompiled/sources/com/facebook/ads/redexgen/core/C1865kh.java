package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1865kh implements com.facebook.ads.redexgen.core.InterfaceC0854Ll {
    public static java.lang.String A07;
    public static byte[] A08;
    public static java.lang.String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public java.io.InputStream A01;
    public java.net.HttpURLConnection A02;
    public final java.lang.String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile java.lang.String A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, Byte.MAX_VALUE, 110, 121, 121, 126, 123, Byte.MAX_VALUE, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SO, 77, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 77, 90, 71, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SO, 71, 93, com.google.common.base.Ascii.SO, 79, 76, 93, 75, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, com.google.common.base.Ascii.CAN, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, com.google.common.base.Ascii.NAK, 41, 41, 45, 8, 47, 49, com.google.common.base.Ascii.RS, 50, 51, 51, 56, 62, 41, 52, 50, 51, com.google.common.base.Ascii.NAK, 34, 34, 63, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, 63, 112, 54, 34, 63, kotlin.io.encoding.Base64.padSymbol, 112, com.google.common.base.Ascii.ESC, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, kotlin.io.encoding.Base64.padSymbol, 49, 48, 48, 59, kotlin.io.encoding.Base64.padSymbol, 42, 55, 49, 48, 126, 56, 49, 44, 126, 35, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.DC4, 70, com.google.common.base.Ascii.DC4, 3, 7, 2, com.google.common.base.Ascii.SI, 8, 1, 70, 2, 7, com.google.common.base.Ascii.DC2, 7, 70, 0, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.VT, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 71, 0, 63, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, com.google.common.base.Ascii.US, 92, 80, 81, 75, 90, 81, 75, com.google.common.base.Ascii.US, 86, 81, 89, 80, com.google.common.base.Ascii.US, 89, 77, 80, 82, com.google.common.base.Ascii.US, 106, 93, 89, 92, 81, 86, 95, com.google.common.base.Ascii.CAN, 75, 87, 77, 74, 91, 93, com.google.common.base.Ascii.CAN, 33, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, 85, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, 85, 7, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.FS, 7, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, 1, 6, 79, 85, 92, 6, com.google.common.base.Ascii.FS, 81, 85, 81, 89, 6, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, 5, 8, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, 65, 99};
    }

    static {
        A04();
        A07 = com.facebook.ads.redexgen.core.C1865kh.class.getSimpleName();
    }

    public C1865kh(java.lang.String str) {
        this(str, com.facebook.ads.redexgen.core.C0852Lj.A01(str));
    }

    public C1865kh(java.lang.String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C1865kh(java.lang.String str, java.lang.String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0853Lk.A00(str);
        this.A06 = str2;
    }

    private int A00(java.net.HttpURLConnection httpURLConnection, int i, int i2) throws java.io.IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        if (r6 != 302) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r6 != 303) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r6 != 302) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.net.HttpURLConnection A02(int i, int i2) throws java.io.IOException, com.facebook.ads.redexgen.core.C1871kn {
        java.net.HttpURLConnection httpURLConnection;
        boolean z;
        int code = 0;
        java.lang.String str = this.A03;
        do {
            java.lang.String str2 = A01(234, 16, 75) + (i > 0 ? A01(19, 13, 66) + i : A01(0, 0, 127)) + A01(15, 4, 5) + str;
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(A01(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 5, 3), A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, 6, 120) + i + A01(50, 1, 44));
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                if (A09[3].length() != 13) {
                    throw new java.lang.RuntimeException();
                }
                A09[0] = "1Ss55MOjwkg";
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.A04 = responseCode;
            if (responseCode != 301) {
                java.lang.String[] strArr = A09;
                java.lang.String url = strArr[4];
                java.lang.String str3 = strArr[6];
                int length = url.length();
                int redirectCount = str3.length();
                if (length == redirectCount) {
                    java.lang.String[] strArr2 = A09;
                    strArr2[1] = "p6lJtanqIpTVtR8wvrkpKJ2zYO";
                    strArr2[5] = "gJMCNOhCywWTIArSLN7pAqKg27";
                }
                if (z) {
                    str = httpURLConnection.getHeaderField(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 8, 45));
                    code++;
                    httpURLConnection.disconnect();
                }
                if (code <= 5) {
                    java.lang.String url2 = A01(293, 20, 113) + code;
                    throw new com.facebook.ads.redexgen.core.C1871kn(url2);
                }
            }
            z = true;
            if (z) {
            }
            if (code <= 5) {
            }
        } while (z);
        return httpURLConnection;
    }

    private void A03() throws com.facebook.ads.redexgen.core.C1871kn {
        java.lang.String str = A01(255, 23, 59) + this.A03;
        java.net.HttpURLConnection httpURLConnection = null;
        java.io.InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, 10000);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                android.util.Log.i(A07, A01(74, 18, 83) + this.A03 + A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                com.facebook.ads.redexgen.core.C0852Lj.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (java.io.IOException e) {
                android.util.Log.e(A07, A01(129, 25, 84) + this.A03, e);
                com.facebook.ads.redexgen.core.C0852Lj.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.C0852Lj.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws com.facebook.ads.redexgen.core.C1871kn {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new java.io.BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1871kn(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final void AGj(int i) throws com.facebook.ads.redexgen.core.C1871kn {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final void close() throws com.facebook.ads.redexgen.core.C1871kn {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (java.lang.NullPointerException e) {
                throw new com.facebook.ads.redexgen.core.C1871kn(A01(92, 37, 89), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final synchronized int length() throws com.facebook.ads.redexgen.core.C1871kn {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final int read(byte[] bArr) throws com.facebook.ads.redexgen.core.C1871kn {
        java.io.InputStream inputStream = this.A01;
        java.lang.String A01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (java.io.InterruptedIOException e) {
                final java.lang.String str = A01(278, 15, 60) + this.A03 + A01(0, 15, 15);
                throw new com.facebook.ads.redexgen.core.C1871kn(str, e) { // from class: com.facebook.ads.redexgen.X.8K
                };
            } catch (java.io.IOException e2) {
                throw new com.facebook.ads.redexgen.core.C1871kn(A01 + this.A03, e2);
            }
        }
        throw new com.facebook.ads.redexgen.core.C1871kn(A01 + this.A03 + A01(51, 23, 42));
    }

    public final java.lang.String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
