package com.plaid.internal;

/* renamed from: com.plaid.internal.u1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0654u1 {
    public static final com.plaid.internal.C0680x0 e;

    /* renamed from: a, reason: collision with root package name */
    public final int f6587a;
    public final java.lang.String b;
    public final java.util.HashMap c;
    public final java.lang.String d;

    public C0654u1(int i, java.lang.String str, java.util.HashMap hashMap, java.lang.String str2) {
        this.f6587a = i;
        this.b = str;
        this.c = hashMap;
        this.d = str2;
    }

    public static com.plaid.internal.C0654u1 a(java.io.InputStream inputStream) {
        java.lang.String a2;
        java.lang.String str;
        com.plaid.internal.O6 o6 = new com.plaid.internal.O6(inputStream);
        do {
            a2 = o6.a();
            if (a2 == null) {
                throw new java.io.IOException("empty response");
            }
        } while (a2.length() < 10);
        e.a(com.plaid.internal.W3.TRACE, "HttpResponse: ".concat(a2), new java.lang.Object[0]);
        java.lang.String[] split = a2.split(" ");
        if (split.length > 0) {
            java.lang.String str2 = split[0];
        }
        int parseInt = split.length > 1 ? java.lang.Integer.parseInt(split[1]) : 500;
        if (split.length > 2) {
            str = android.text.TextUtils.join(" ", java.util.Arrays.copyOfRange(split, 2, split.length));
        } else if (parseInt == 204) {
            str = "No Content";
        } else if (parseInt == 404) {
            str = "Not Found";
        } else if (parseInt == 410) {
            str = "Gone";
        } else if (parseInt != 500) {
            switch (parseInt) {
                case 200:
                    str = com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton;
                    break;
                case 201:
                    str = "Created";
                    break;
                case 202:
                    str = "Accepted";
                    break;
                default:
                    str = "Unknown Error";
                    break;
            }
        } else {
            str = "Internal Server Error";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String a3 = o6.a();
        if (a3 == null) {
            throw new java.io.IOException("unexpected end of response");
        }
        int length = a3.length();
        while (length > 0) {
            com.plaid.internal.C0680x0 c0680x0 = e;
            c0680x0.a(com.plaid.internal.W3.TRACE, a3, new java.lang.Object[0]);
            java.lang.String[] split2 = a3.split(io.ktor.sse.ServerSentEventKt.COLON);
            if (split2.length > 1) {
                java.lang.String lowerCase = split2[0].trim().toLowerCase();
                java.lang.String trim = a3.substring(split2[0].length() + 1).trim();
                java.util.List list = (java.util.List) hashMap.get(lowerCase);
                if (list == null) {
                    list = new java.util.LinkedList();
                    hashMap.put(lowerCase, list);
                }
                list.add(trim);
            } else {
                c0680x0.a(com.plaid.internal.W3.ERROR, "Invalid header line received: ".concat(a3), new java.lang.Object[0]);
            }
            a3 = o6.a();
            if (a3 == null) {
                throw new java.io.IOException("unexpected end of response");
            }
            length = a3.length();
        }
        e.a(com.plaid.internal.W3.TRACE, a3, new java.lang.Object[0]);
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.lang.String str4 = (java.lang.String) ((java.util.List) entry.getValue()).get(0);
            if ("transfer-encoding".equals(str3)) {
                if ("chunked".equalsIgnoreCase(str4)) {
                    z = true;
                } else if (com.statsig.androidsdk.HttpUtils.ENCODING_GZIP.equalsIgnoreCase(str4)) {
                    z2 = true;
                }
            } else if ("content-length".equals(str3)) {
                i = java.lang.Integer.parseInt((java.lang.String) ((java.util.List) entry.getValue()).get(0));
            }
            if ("content-encoding".equals(entry.getKey()) && com.statsig.androidsdk.HttpUtils.ENCODING_GZIP.equalsIgnoreCase(str4)) {
                z2 = true;
            }
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(4096);
        if (z) {
            e.a(com.plaid.internal.W3.TRACE, "read chunked", new java.lang.Object[0]);
            while (true) {
                java.lang.String a4 = o6.a();
                if (a4 != null) {
                    int parseInt2 = java.lang.Integer.parseInt(a4.trim(), 16);
                    com.plaid.internal.C0680x0 c0680x02 = e;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("read chunk of ");
                    sb.append(parseInt2);
                    sb.append(" bytes");
                    c0680x02.a(com.plaid.internal.W3.TRACE, sb.toString(), new java.lang.Object[0]);
                    if (parseInt2 != 0) {
                        byte[] bArr = new byte[parseInt2];
                        byteArrayOutputStream.write(bArr, 0, o6.f5872a.read(bArr, 0, parseInt2));
                        o6.a();
                    }
                }
            }
        } else {
            if (i >= 0) {
                e.a(com.plaid.internal.W3.TRACE, "read body of content-length=".concat(java.lang.String.valueOf(i)), new java.lang.Object[0]);
                byte[] bArr2 = new byte[i];
                int i2 = 0;
                do {
                    int read = o6.f5872a.read(bArr2, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    }
                    byteArrayOutputStream.write(bArr2);
                } while (i2 != i);
                byteArrayOutputStream.write(bArr2);
            } else {
                e.a(com.plaid.internal.W3.TRACE, "read body of unknown content-length", new java.lang.Object[0]);
                byte[] bArr3 = new byte[256];
                for (int read2 = o6.f5872a.read(bArr3, 0, 256); read2 > 0; read2 = o6.f5872a.read(bArr3, 0, 256)) {
                    byteArrayOutputStream.write(bArr3, 0, read2);
                }
            }
            if (z2) {
                e.a(com.plaid.internal.W3.TRACE, "decompress response bytes", new java.lang.Object[0]);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = new java.io.ByteArrayOutputStream(byteArray.length * 4);
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArray);
                java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream, 32);
                byte[] bArr4 = new byte[32];
                while (true) {
                    int read3 = gZIPInputStream.read(bArr4);
                    if (read3 != -1) {
                        byteArrayOutputStream.write(bArr4, 0, read3);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    }
                }
            }
        }
        return new com.plaid.internal.C0654u1(parseInt, str, hashMap, byteArrayOutputStream.toString());
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        e = new com.plaid.internal.C0680x0("http-response");
    }
}
