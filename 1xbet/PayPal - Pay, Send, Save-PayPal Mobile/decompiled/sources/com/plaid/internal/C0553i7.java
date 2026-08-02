package com.plaid.internal;

/* renamed from: com.plaid.internal.i7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0553i7 implements com.plaid.internal.InterfaceC0627r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0680x0 f6444a;
    public final com.plaid.internal.C0532g4 b;
    public int c;

    public C0553i7(com.plaid.internal.C0532g4 c0532g4) {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        this.f6444a = new com.plaid.internal.C0680x0("socket-http-client");
        this.c = 0;
        this.b = c0532g4;
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final com.plaid.internal.InterfaceC0627r1.b a(com.plaid.internal.InterfaceC0627r1.a aVar) {
        java.net.Socket socket;
        java.net.Socket socket2;
        java.io.OutputStream outputStream;
        com.plaid.internal.C0645t1 c0645t1;
        com.plaid.internal.C0680x0 c0680x0 = this.f6444a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("request ");
        sb.append(aVar.b ? "POST" : "GET");
        sb.append(" ");
        sb.append(aVar.f6552a);
        com.plaid.internal.W3 w3 = com.plaid.internal.W3.DEBUG;
        c0680x0.a(w3, sb.toString(), new java.lang.Object[0]);
        try {
            if (new java.net.URL(aVar.f6552a).getProtocol().equals("https")) {
                throw new java.io.IOException("https not supported by this httpclient");
            }
        } catch (java.net.MalformedURLException unused) {
        }
        int i = aVar.c;
        if (i < 0) {
            i = this.c;
        }
        try {
            java.net.URL url = new java.net.URL(aVar.f6552a);
            android.net.Network network = this.b.f6419a;
            java.net.InetAddress byName = network.getByName(url.getHost());
            com.plaid.internal.C0680x0 c0680x02 = this.f6444a;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("host ");
            sb2.append(url.getHost());
            sb2.append(" resolved to ");
            sb2.append(byName);
            c0680x02.a(w3, sb2.toString(), new java.lang.Object[0]);
            javax.net.SocketFactory socketFactory = network.getSocketFactory();
            int port = url.getPort();
            if (port == -1) {
                port = url.getDefaultPort();
            }
            socket = socketFactory.createSocket(byName, port);
            try {
                socket.setSoTimeout(i);
                java.io.OutputStream outputStream2 = socket.getOutputStream();
                try {
                    if (aVar.b) {
                        c0645t1 = new com.plaid.internal.C0645t1(url, "POST");
                        com.plaid.internal.C0511e1 c0511e1 = com.plaid.internal.C0511e1.c;
                        c0645t1.c.put("accept".toLowerCase(), (java.lang.String) c0511e1.a("http.accept.post", "application/json", java.lang.String.class));
                        c0645t1.c.put("accept".toLowerCase(), (java.lang.String) c0511e1.a("http.accept.post", "application/json", java.lang.String.class));
                        c0645t1.f = aVar.d;
                        c0645t1.g = !c0511e1.a("http.no-gzip");
                    } else {
                        com.plaid.internal.C0645t1 c0645t12 = new com.plaid.internal.C0645t1(url, "GET");
                        c0645t12.c.put("accept".toLowerCase(), (java.lang.String) com.plaid.internal.C0511e1.c.a("http.accept.get", "application/json, */*", java.lang.String.class));
                        c0645t1 = c0645t12;
                    }
                    if (!com.plaid.internal.C0511e1.c.a("http.no-user-agent")) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                        sb3.append(android.os.Build.VERSION.RELEASE);
                        sb3.append(";device=");
                        java.lang.String str = android.os.Build.MANUFACTURER;
                        java.lang.String str2 = android.os.Build.MODEL;
                        if (!str2.toLowerCase().startsWith(str.toLowerCase())) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            sb4.append(str);
                            sb4.append(" ");
                            sb4.append(str2);
                            str2 = sb4.toString();
                        }
                        sb3.append(str2);
                        c0645t1.c.put("user-agent".toLowerCase(), sb3.toString());
                    }
                    c0645t1.a(outputStream2);
                    java.io.InputStream inputStream = socket.getInputStream();
                    com.plaid.internal.C0654u1 a2 = com.plaid.internal.C0654u1.a(inputStream);
                    inputStream.close();
                    com.plaid.internal.InterfaceC0627r1.b bVar = new com.plaid.internal.InterfaceC0627r1.b(a2.f6587a, a2.b, a2.d, a2.c);
                    com.plaid.internal.AbstractC0663v1.a(outputStream2);
                    com.plaid.internal.AbstractC0663v1.a(socket);
                    return bVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    socket2 = socket;
                    outputStream = outputStream2;
                    com.plaid.internal.AbstractC0663v1.a(outputStream);
                    com.plaid.internal.AbstractC0663v1.a(socket2);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                socket2 = socket;
                outputStream = null;
                com.plaid.internal.AbstractC0663v1.a(outputStream);
                com.plaid.internal.AbstractC0663v1.a(socket2);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            socket = null;
        }
    }

    @Override // com.plaid.internal.InterfaceC0627r1
    public final com.plaid.internal.EnumC0697z isConnected() {
        return null;
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
            this.f6444a.a(e, "couldn't release the network");
        }
    }
}
