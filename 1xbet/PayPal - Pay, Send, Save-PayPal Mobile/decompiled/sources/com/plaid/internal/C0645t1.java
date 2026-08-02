package com.plaid.internal;

/* renamed from: com.plaid.internal.t1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0645t1 {
    public static final com.plaid.internal.C0680x0 h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6572a;
    public final java.net.URL b;
    public final java.util.HashMap c;
    public final java.util.LinkedHashMap d;
    public final java.lang.String e;
    public java.lang.String f;
    public boolean g;

    /* renamed from: com.plaid.internal.t1$a */
    public final class a implements java.util.Comparator<java.lang.String> {
        @Override // java.util.Comparator
        public final int compare(java.lang.String str, java.lang.String str2) {
            java.lang.String str3 = str;
            java.lang.String str4 = str2;
            if (com.datadog.android.log.LogAttributes.HOST.equals(str3)) {
                return -1;
            }
            if (com.datadog.android.log.LogAttributes.HOST.equals(str4)) {
                return 1;
            }
            return str3.compareTo(str4);
        }
    }

    /* renamed from: com.plaid.internal.t1$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f6573a;
        public final boolean b;
        public final byte[] c;

        public b(java.lang.String str, boolean z) {
            this.f6573a = str;
            this.b = z;
            this.c = z ? com.plaid.internal.AbstractC0663v1.a(str) : str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
    }

    public C0645t1(java.net.URL url, java.lang.String str) {
        java.lang.String obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.c = hashMap;
        this.f6572a = "HTTP/1.1";
        this.e = str.toUpperCase();
        this.b = url;
        this.d = com.plaid.internal.AbstractC0663v1.b(url.toString());
        if (url.getPort() == -1) {
            obj = url.getHost();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(url.getHost());
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(url.getPort());
            obj = sb.toString();
        }
        hashMap.put(com.datadog.android.log.LogAttributes.HOST.toLowerCase(), obj);
        hashMap.put("connection".toLowerCase(), "close");
        hashMap.put("cache-control".toLowerCase(), "no-cache");
        hashMap.put("accept".toLowerCase(), "*/*");
        hashMap.put("accept-encoding".toLowerCase(), (java.lang.String) com.plaid.internal.C0511e1.c.a("http.accept-encoding", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, java.lang.String.class));
    }

    public static void a(java.io.OutputStream outputStream, com.plaid.internal.C0645t1.b bVar) {
        if (bVar.c.length > 0) {
            h.a(com.plaid.internal.W3.TRACE, bVar.b ? "Socket.gzip(`%s`)" : "Socket.write(`%s`)", bVar.f6573a.trim());
            outputStream.write(bVar.c);
        }
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        h = new com.plaid.internal.C0680x0("http-request");
    }

    public final void a(java.io.OutputStream outputStream) {
        com.plaid.internal.C0645t1.b bVar = new com.plaid.internal.C0645t1.b("", false);
        if (this.e.equals("GET")) {
            h.a(com.plaid.internal.W3.TRACE, "Sending GET Request", new java.lang.Object[0]);
        } else if (this.e.equals("POST")) {
            h.a(com.plaid.internal.W3.TRACE, "Sending POST Request", new java.lang.Object[0]);
            java.lang.String str = this.f;
            if (str != null && str.length() > 0) {
                bVar = new com.plaid.internal.C0645t1.b(this.f, this.g);
                if (this.g) {
                    this.c.put("content-encoding".toLowerCase(), com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
                } else {
                    this.c.remove("content-encoding");
                }
                this.c.put("content-length".toLowerCase(), java.lang.String.valueOf(bVar.c.length));
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.e);
        sb.append(" ");
        java.lang.String path = this.b.getPath();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z = true;
        for (java.util.Map.Entry entry : this.d.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb2.append("&");
            }
            sb2.append((java.lang.String) entry.getKey());
            sb2.append("=");
            try {
                sb2.append(java.net.URLEncoder.encode((java.lang.String) entry.getValue(), "utf-8"));
            } catch (java.io.UnsupportedEncodingException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }
        java.lang.String obj = sb2.toString();
        if (obj.length() > 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(this.b.getPath());
            sb3.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
            sb3.append(obj);
            path = sb3.toString();
        }
        if (path == null || path.length() == 0) {
            path = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
        }
        sb.append(path);
        sb.append(" ");
        sb.append(this.f6572a);
        sb.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        a(outputStream, new com.plaid.internal.C0645t1.b(sb.toString(), false));
        java.util.TreeSet treeSet = new java.util.TreeSet(new com.plaid.internal.C0645t1.a());
        treeSet.addAll(this.c.keySet());
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.lang.String[] split = str2.toLowerCase().split("-");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.String str3 : split) {
                if (str3.length() > 0) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(str3.substring(0, 1).toUpperCase());
                    sb4.append(str3.substring(1));
                    str3 = sb4.toString();
                }
                linkedList.add(str3);
            }
            java.lang.String join = android.text.TextUtils.join("-", linkedList);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(join);
            sb5.append(": ");
            sb5.append((java.lang.String) this.c.get(str2));
            sb5.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            a(outputStream, new com.plaid.internal.C0645t1.b(sb5.toString(), false));
        }
        a(outputStream, new com.plaid.internal.C0645t1.b(io.ktor.sse.ServerSentEventKt.END_OF_LINE, false));
        a(outputStream, bVar);
        outputStream.flush();
    }
}
