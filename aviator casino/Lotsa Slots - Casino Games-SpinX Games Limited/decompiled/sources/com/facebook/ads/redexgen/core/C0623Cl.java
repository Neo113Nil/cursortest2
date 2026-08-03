package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Cl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0623Cl implements com.facebook.ads.redexgen.core.InterfaceC1587fv {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final java.lang.String A09;
    public com.facebook.ads.redexgen.core.InterfaceC1047Tc A00;
    public java.util.concurrent.Executor A01;
    public boolean A02;
    public com.facebook.ads.redexgen.core.C1592g0 A03;
    public final com.facebook.ads.redexgen.core.InterfaceC1597g5 A04 = new com.facebook.ads.redexgen.core.C0631Cu();
    public final com.facebook.ads.redexgen.core.InterfaceC1602gA A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1603gB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final com.facebook.ads.redexgen.core.InterfaceC1586fu A01(com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) throws com.facebook.ads.redexgen.core.C1600g8 {
        com.facebook.ads.redexgen.core.C1600g8 c1600g8;
        java.lang.String A072 = A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 7, 86);
        java.net.HttpURLConnection httpURLConnection = null;
        com.facebook.ads.redexgen.core.C0624Cm c0624Cm = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                java.net.HttpURLConnection A082 = A08(abstractC1599g7.A05(), com.facebook.ads.redexgen.core.XD.A04() ? A09() : null);
                A0H(A082, abstractC1599g7);
                A0G(A082, abstractC1599g7);
                if (this.A06.AAZ()) {
                    this.A06.ABt(A082, abstractC1599g7.A06());
                }
                A082.connect();
                this.A02 = true;
                java.util.Set<java.lang.String> A01 = this.A03.A01();
                java.util.Set<java.lang.String> A02 = this.A03.A02();
                boolean z2 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof javax.net.ssl.HttpsURLConnection) && (z2 || z)) {
                    try {
                        com.facebook.ads.redexgen.core.AbstractC1604gC.A03((javax.net.ssl.HttpsURLConnection) A082, A01, A02);
                    } catch (java.security.cert.CertificateException e) {
                        this.A00.ABz(A072, com.facebook.ads.redexgen.core.AbstractC1048Td.A1z, new com.facebook.ads.redexgen.core.C1049Te(e));
                    } catch (java.lang.Exception e2) {
                        this.A00.ABz(A072, com.facebook.ads.redexgen.core.AbstractC1048Td.A1y, new com.facebook.ads.redexgen.core.C1049Te(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC1599g7.A06() != null) {
                    A00(A082, abstractC1599g7.A06());
                }
                com.facebook.ads.redexgen.core.C0624Cm A06 = A082.getDoInput() ? A06(A082) : new com.facebook.ads.redexgen.core.C0624Cm(A082, null);
                if (this.A06.AAZ()) {
                    this.A06.ABu(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (java.lang.Throwable th) {
                if (this.A06.AAZ()) {
                    this.A06.ABu(c0624Cm);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Exception e3) {
            try {
                try {
                    c0624Cm = A05(null);
                } catch (java.lang.Throwable unused) {
                    if (c0624Cm == null || c0624Cm.A9C() <= 0) {
                        throw new com.facebook.ads.redexgen.core.C1600g8(e3, c0624Cm);
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(c0624Cm);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c0624Cm;
                }
            } catch (java.lang.Exception unused2) {
                android.util.Log.e(getClass().getSimpleName(), A07(117, 13, 98), e3);
                if (0 != 0 && c0624Cm.A9C() > 0) {
                    if (this.A06.AAZ()) {
                        this.A06.ABu(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                c1600g8 = new com.facebook.ads.redexgen.core.C1600g8(e3, null);
            }
            if (A08[7].length() == 19) {
                throw new java.lang.RuntimeException();
            }
            A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
            if (c0624Cm == null || c0624Cm.A9C() <= 0) {
                c1600g8 = new com.facebook.ads.redexgen.core.C1600g8(e3, c0624Cm);
                throw c1600g8;
            }
            if (this.A06.AAZ()) {
                this.A06.ABu(c0624Cm);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            return c0624Cm;
        }
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, com.google.common.base.Ascii.SO, 102, 100, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 9, 77, 79, com.google.common.base.Ascii.RS, 93, 75, 76, 82, com.google.common.base.Ascii.RS, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 80, 75, 120, 116, com.google.common.base.Ascii.ETB, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.SYN, 7, 4, com.google.common.base.Ascii.FS, 1, com.google.common.base.Ascii.CAN, 83, com.google.common.base.Ascii.SYN, 1, 1, com.google.common.base.Ascii.FS, 1, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 4, 111, 122, com.google.common.base.Ascii.SYN, 7, 7, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, 3, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 88, com.google.common.base.Ascii.SI, 90, 0, 0, 0, 90, 17, com.google.common.base.Ascii.CAN, 5, com.google.common.base.Ascii.SUB, 90, 2, 5, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CAN, 19, com.google.common.base.Ascii.DC2, 19, 76, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 5, 4, com.google.common.base.Ascii.DC2, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 81, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 83, 120, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, com.google.common.base.Ascii.ESC, 7, 7, 3, 93, 3, 1, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, 10, 35, com.google.common.base.Ascii.FS, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.A72() != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r3 = r9.A72().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (r30.A04 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        r7.ABo(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.InterfaceC1586fu A0J(com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) throws com.facebook.ads.redexgen.core.C1600g8 {
        long j;
        com.facebook.ads.redexgen.core.InterfaceC1586fu A01;
        int i = 0;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int A012 = abstractC1599g7.A02().A01();
        long A03 = abstractC1599g7.A02().A03();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() + abstractC1599g7.A02().A04();
        while (true) {
            if (i >= A012 || currentTimeMillis2 <= java.lang.System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.AAZ()) {
                    java.lang.String str = (i + 1) + A07(37, 4, 97) + A012 + A07(56, 9, 27) + abstractC1599g7.A05();
                }
                currentTimeMillis = java.lang.System.currentTimeMillis();
                A01 = A01(abstractC1599g7);
            } catch (com.facebook.ads.redexgen.core.C1600g8 e) {
                if (A0I(e, currentTimeMillis, abstractC1599g7)) {
                    int i2 = A012 - 1;
                    if (A08[1].charAt(0) == 'l') {
                        throw new java.lang.RuntimeException();
                    }
                    A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                    if (i < i2) {
                        continue;
                    }
                }
                if (!this.A05.ADs(e) || i >= A012 - 1) {
                    com.facebook.ads.redexgen.core.InterfaceC1586fu A00 = e.A00();
                    com.facebook.ads.redexgen.core.InterfaceC1047Tc interfaceC1047Tc = this.A00;
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                    } else {
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    }
                    interfaceC1047Tc.ABo(currentTimeMillis, currentTimeMillis3, j, abstractC1599g7.A04 == null ? 0L : abstractC1599g7.A04.length, A00 == null ? 0 : A00.A9C(), e);
                    throw e;
                }
                if (A03 > 0) {
                    try {
                        java.lang.Thread.sleep(A03);
                    } catch (java.lang.InterruptedException e2) {
                        this.A00.ABo(currentTimeMillis, java.lang.System.currentTimeMillis() - currentTimeMillis, 0L, abstractC1599g7.A04 != null ? abstractC1599g7.A04.length : 0L, 0, e2);
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.ABo(currentTimeMillis, java.lang.System.currentTimeMillis() - currentTimeMillis, A01.A72().length, abstractC1599g7.A04 == null ? 0L : abstractC1599g7.A04.length, A01.A9C(), null);
                return A01;
            }
            continue;
            i++;
        }
    }

    static {
        A0A();
        A09 = com.facebook.ads.redexgen.core.InterfaceC1587fv.class.getSimpleName();
    }

    public C0623Cl(com.facebook.ads.redexgen.core.C1592g0 c1592g0, com.facebook.ads.redexgen.core.InterfaceC1047Tc interfaceC1047Tc, java.util.concurrent.Executor executor) {
        A0B();
        this.A03 = c1592g0;
        this.A06 = new com.facebook.ads.redexgen.core.C0622Ck(c1592g0.A04());
        final com.facebook.ads.redexgen.core.InterfaceC1603gB interfaceC1603gB = this.A06;
        this.A05 = new com.facebook.ads.redexgen.core.AbstractC0630Ct(interfaceC1603gB) { // from class: com.facebook.ads.redexgen.X.2i
        };
        this.A01 = executor;
        this.A00 = interfaceC1047Tc;
    }

    private final int A00(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.lang.Exception {
        java.io.OutputStream outputStream = null;
        try {
            outputStream = this.A05.AGn(httpURLConnection);
            if (outputStream != null) {
                this.A05.AL8(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused) {
                }
            }
            return responseCode;
        } catch (java.lang.Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final com.facebook.ads.redexgen.core.InterfaceC1586fu A02(com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) {
        if (this.A03.A04()) {
            A0C(abstractC1599g7);
        }
        com.facebook.ads.redexgen.core.InterfaceC1586fu interfaceC1586fu = null;
        try {
            interfaceC1586fu = A01(abstractC1599g7);
            return interfaceC1586fu;
        } catch (com.facebook.ads.redexgen.core.C1600g8 hre) {
            this.A05.ADs(hre);
            return interfaceC1586fu;
        } catch (java.lang.Exception e) {
            this.A05.ADs(new com.facebook.ads.redexgen.core.C1600g8(e, interfaceC1586fu));
            return interfaceC1586fu;
        }
    }

    private final com.facebook.ads.redexgen.core.InterfaceC1586fu A03(java.lang.String str, com.facebook.ads.redexgen.core.C1601g9 c1601g9, com.facebook.ads.redexgen.core.C1595g3 c1595g3) {
        return A02(new com.facebook.ads.redexgen.core.C0626Co(str, c1601g9, c1595g3));
    }

    private final com.facebook.ads.redexgen.core.InterfaceC1586fu A04(java.lang.String str, java.lang.String str2, byte[] bArr, com.facebook.ads.redexgen.core.C1595g3 c1595g3) {
        return A02(new com.facebook.ads.redexgen.core.C0625Cn(str, null, str2, bArr, c1595g3));
    }

    private final com.facebook.ads.redexgen.core.C0624Cm A05(java.net.HttpURLConnection httpURLConnection) throws java.lang.Exception {
        java.io.InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AHT(inputStream);
            }
            com.facebook.ads.redexgen.core.C0624Cm c0624Cm = new com.facebook.ads.redexgen.core.C0624Cm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused) {
                }
            }
            return c0624Cm;
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final com.facebook.ads.redexgen.core.C0624Cm A06(java.net.HttpURLConnection httpURLConnection) throws java.lang.Exception {
        java.io.InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AGm(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AHT(inputStream);
            }
            com.facebook.ads.redexgen.core.C0624Cm c0624Cm = new com.facebook.ads.redexgen.core.C0624Cm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused) {
                }
            }
            return c0624Cm;
        } catch (java.lang.Throwable th) {
            java.lang.String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final java.net.HttpURLConnection A08(java.lang.String str, java.net.Proxy proxy) throws java.io.IOException {
        try {
            new java.net.URL(str);
            android.net.TrafficStats.setThreadStatsTag(61453);
            return this.A05.AGl(str, proxy);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static java.net.Proxy A09() {
        java.net.Proxy proxy = java.net.Proxy.NO_PROXY;
        java.lang.String property = java.lang.System.getProperty(A07(192, 14, 1));
        java.lang.String proxyAddress = java.lang.System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = java.lang.Integer.parseInt(proxyAddress);
            } catch (java.lang.NumberFormatException unused) {
                return proxy;
            }
        }
        if (!android.text.TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (com.facebook.ads.redexgen.core.C0623Cl.class) {
            if (java.net.CookieHandler.getDefault() == null) {
                java.net.CookieHandler.setDefault(new java.net.CookieManager());
            }
        }
    }

    private void A0C(com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(A07(182, 10, 43));
        boolean equals = abstractC1599g7.A03().equals(com.facebook.ads.redexgen.core.EnumC1598g6.A06);
        java.lang.String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = abstractC1599g7.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new java.lang.RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new java.lang.String(abstractC1599g7.A06(), java.nio.charset.Charset.forName(A07(130, 5, 83))));
                sb.append(A072);
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : abstractC1599g7.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 10));
        sb.append(abstractC1599g7.A05());
        sb.append(A072);
        java.lang.String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE) + 1);
    }

    private void A0D(com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7, com.facebook.ads.redexgen.core.InterfaceC1588fw interfaceC1588fw) {
        this.A04.A6y(this, interfaceC1588fw, this.A01).A04(abstractC1599g7);
        if (this.A03.A04()) {
            A0C(abstractC1599g7);
        }
    }

    private void A0E(java.lang.String str, int i, int i2) {
        java.lang.String str2 = A09 + A07(12, 6, 47) + i + A07(65, 1, 96) + i2;
        if (str.length() > 4000) {
            str.substring(0, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            A0E(str.substring(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE), i + 1, i2);
        }
    }

    private void A0F(java.lang.String str, java.lang.String str2, byte[] bArr, com.facebook.ads.redexgen.core.InterfaceC1588fw interfaceC1588fw, com.facebook.ads.redexgen.core.C1595g3 c1595g3) {
        com.facebook.ads.redexgen.core.C0625Cn req = new com.facebook.ads.redexgen.core.C0625Cn(str, null, str2, bArr, c1595g3);
        A0D(req, interfaceC1588fw);
    }

    private void A0G(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) {
        java.util.Map<java.lang.String, java.lang.String> A06 = abstractC1599g7.A02().A06();
        com.facebook.ads.redexgen.core.InterfaceC1585ft A05 = abstractC1599g7.A02().A05();
        for (java.lang.String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            java.util.Map<java.lang.String, java.lang.String> A6g = A05.A6g(this.A03.A03());
            for (java.lang.String str2 : A6g.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6g.get(str2));
            }
        }
    }

    private final void A0H(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C1595g3 A02 = abstractC1599g7.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AH6(httpURLConnection, abstractC1599g7.A03(), abstractC1599g7.A04());
    }

    private final boolean A0I(java.lang.Throwable th, long j, com.facebook.ads.redexgen.core.AbstractC1599g7 abstractC1599g7) {
        com.facebook.ads.redexgen.core.C1595g3 A02 = abstractC1599g7.A02();
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - j) + 10;
        if (this.A06.AAZ()) {
            java.lang.String str = A07(67, 15, 118) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            long A022 = A02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new java.lang.RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return currentTimeMillis >= A022;
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final com.facebook.ads.redexgen.core.C1592g0 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1587fv
    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.InterfaceC1586fu AGw(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> parameters) {
        return A03(str, new com.facebook.ads.redexgen.core.C1601g9(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1587fv
    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.InterfaceC1586fu AGx(java.lang.String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1587fv
    public final void AGy(java.lang.String str, byte[] bArr, com.facebook.ads.redexgen.core.InterfaceC1588fw interfaceC1588fw) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC1588fw, this.A03.A00());
    }
}
