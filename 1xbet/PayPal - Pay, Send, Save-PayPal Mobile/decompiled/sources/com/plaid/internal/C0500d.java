package com.plaid.internal;

/* renamed from: com.plaid.internal.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0500d implements com.plaid.internal.InterfaceC0627r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0680x0 f6389a;
    public final com.plaid.internal.C0532g4 b;
    public int c;

    public C0500d(com.plaid.internal.C0532g4 c0532g4) {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        this.f6389a = new com.plaid.internal.C0680x0("http-client");
        this.c = 0;
        this.b = c0532g4;
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final void a() {
        try {
            com.plaid.internal.C0532g4 c0532g4 = this.b;
            if (c0532g4.d) {
                return;
            }
            c0532g4.d = true;
            c0532g4.b.run();
        } catch (java.lang.Exception e) {
            this.f6389a.a(e, "couldn't release the network");
        }
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final com.plaid.internal.EnumC0697z isConnected() {
        com.plaid.internal.C0532g4 c0532g4 = this.b;
        return c0532g4.d ? com.plaid.internal.EnumC0697z.NO : c0532g4.c;
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final com.plaid.internal.InterfaceC0627r1.b a(com.plaid.internal.InterfaceC0627r1.a aVar) {
        java.io.InputStream errorStream;
        byte[] bytes;
        java.io.OutputStream outputStream;
        com.plaid.internal.C0680x0 c0680x0 = this.f6389a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("request ");
        sb.append(aVar.b ? "POST" : "GET");
        sb.append(" ");
        sb.append(aVar.f6552a);
        c0680x0.a(com.plaid.internal.W3.DEBUG, sb.toString(), new java.lang.Object[0]);
        int i = aVar.c;
        if (i < 0) {
            i = this.c;
        }
        java.net.HttpURLConnection httpURLConnection = null;
        java.io.OutputStream outputStream2 = null;
        java.lang.String str = null;
        try {
            java.net.HttpURLConnection httpURLConnection2 = (java.net.HttpURLConnection) this.b.f6419a.openConnection(new java.net.URL(aVar.f6552a));
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty(com.google.common.net.HttpHeaders.CONNECTION, "close");
                httpURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                com.plaid.internal.C0511e1 c0511e1 = com.plaid.internal.C0511e1.c;
                if (!c0511e1.a("http.no-user-agent")) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb2.append(android.os.Build.VERSION.RELEASE);
                    sb2.append(";device=");
                    java.lang.String str2 = android.os.Build.MANUFACTURER;
                    java.lang.String str3 = android.os.Build.MODEL;
                    if (!str3.toLowerCase().startsWith(str2.toLowerCase())) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(str2);
                        sb3.append(" ");
                        sb3.append(str3);
                        str3 = sb3.toString();
                    }
                    sb2.append(str3);
                    httpURLConnection2.setRequestProperty("user-agent", sb2.toString());
                }
                if (aVar.b) {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Accept", (java.lang.String) c0511e1.a("http.accept.post", "application/json", java.lang.String.class));
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection2.setDoOutput(true);
                    boolean a2 = c0511e1.a("http.no-gzip");
                    if (!a2) {
                        bytes = com.plaid.internal.AbstractC0663v1.a(aVar.d);
                    } else {
                        bytes = aVar.d.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                    }
                    if (!a2) {
                        httpURLConnection2.setRequestProperty("Content-Encoding", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
                    }
                    httpURLConnection2.setRequestProperty("Content-Length", java.lang.String.valueOf(bytes.length));
                    try {
                        outputStream = httpURLConnection2.getOutputStream();
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                    try {
                        outputStream.write(bytes, 0, bytes.length);
                        com.plaid.internal.AbstractC0663v1.a(outputStream);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        outputStream2 = outputStream;
                        com.plaid.internal.AbstractC0663v1.a(outputStream2);
                        throw th;
                    }
                } else {
                    httpURLConnection2.setRequestProperty("Accept", (java.lang.String) c0511e1.a("http.accept.get", "application/json, */*", java.lang.String.class));
                }
                httpURLConnection2.connect();
                try {
                    errorStream = httpURLConnection2.getInputStream();
                } catch (java.io.FileNotFoundException unused) {
                    errorStream = httpURLConnection2.getErrorStream();
                }
                int responseCode = httpURLConnection2.getResponseCode();
                java.lang.String responseMessage = httpURLConnection2.getResponseMessage();
                if (errorStream != null) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = errorStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    str = new java.lang.String(byteArrayOutputStream.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);
                }
                com.plaid.internal.InterfaceC0627r1.b bVar = new com.plaid.internal.InterfaceC0627r1.b(responseCode, responseMessage, str, httpURLConnection2.getHeaderFields());
                httpURLConnection2.disconnect();
                return bVar;
            } catch (java.lang.Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }
}
