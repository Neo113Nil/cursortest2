package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class p1 extends com.fyber.inneractive.sdk.network.i implements com.fyber.inneractive.sdk.network.h {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.OkHttpClient f3852a = new okhttp3.OkHttpClient().newBuilder().build();

    public static java.util.HashMap b(okhttp3.Response response) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (response != null) {
            okhttp3.Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                java.lang.String name = headers.name(i);
                hashMap.put(name, java.util.Collections.singletonList(headers.get(name)));
            }
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.t0 t0Var, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(t0Var.r());
            android.util.Pair a2 = a(t0Var.r(), t0Var, arrayList, str, str2);
            java.lang.Object obj = a2.second;
            java.lang.String message = obj != null ? ((okhttp3.Response) obj).message() : "";
            java.io.FilterInputStream a3 = a((okhttp3.Response) a2.second);
            java.lang.Object obj2 = a2.second;
            int code = obj2 == null ? -1 : ((okhttp3.Response) obj2).code();
            java.util.HashMap b = b((okhttp3.Response) a2.second);
            okhttp3.Response response = (okhttp3.Response) a2.second;
            com.fyber.inneractive.sdk.network.o1 o1Var = new com.fyber.inneractive.sdk.network.o1(com.fyber.inneractive.sdk.network.i.a(a3, code, message, b, response != null ? response.headers().get(com.google.common.net.HttpHeaders.LAST_MODIFIED) : null), (okhttp3.Response) a2.second);
            java.util.Iterator it = ((java.util.List) a2.first).iterator();
            while (it.hasNext()) {
                o1Var.f.add((java.lang.String) it.next());
            }
            return o1Var;
        } catch (com.fyber.inneractive.sdk.network.b e) {
            com.fyber.inneractive.sdk.util.IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e.getMessage());
            throw e;
        } catch (java.lang.Exception e2) {
            com.fyber.inneractive.sdk.util.IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e2.getMessage());
            throw e2;
        }
    }

    public final android.util.Pair a(java.lang.String str, com.fyber.inneractive.sdk.network.t0 t0Var, java.util.ArrayList arrayList, java.lang.String str2, java.lang.String str3) {
        java.lang.String header;
        com.fyber.inneractive.sdk.network.l1 p = t0Var.p();
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        a(builder, com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "gzip");
        a(builder, com.google.common.net.HttpHeaders.USER_AGENT, str2);
        a(builder, com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE, str3);
        java.util.Map l = t0Var.l();
        if (l != null) {
            for (java.lang.String str4 : l.keySet()) {
                a(builder, str4, (java.lang.String) l.get(str4));
            }
        }
        builder.url(str);
        if (t0Var.m() == com.fyber.inneractive.sdk.network.m0.POST || t0Var.m() == com.fyber.inneractive.sdk.network.m0.PUT) {
            byte[] f = t0Var.f();
            if (f != null) {
                builder.post(okhttp3.RequestBody.create(f, okhttp3.MediaType.parse(t0Var.n())));
            } else {
                throw new java.lang.Exception("Could not create ok http request. post payload is null");
            }
        }
        okhttp3.Request build = builder.build();
        boolean z = !(t0Var instanceof com.fyber.inneractive.sdk.network.h1);
        okhttp3.OkHttpClient.Builder followSslRedirects = this.f3852a.newBuilder().followRedirects(z).followSslRedirects(z);
        long j = p.f3847a;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        okhttp3.OkHttpClient build2 = followSslRedirects.connectTimeout(j, timeUnit).readTimeout(p.b, timeUnit).build();
        t0Var.c(java.lang.System.currentTimeMillis());
        com.fyber.inneractive.sdk.util.IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.g);
        try {
            try {
                okhttp3.Response execute = build2.newCall(build).execute();
                if (!(!(t0Var instanceof com.fyber.inneractive.sdk.network.h1)) && (((execute.code() > 300 && execute.code() < 304) || execute.code() == 307 || execute.code() == 308) && (header = execute.header(com.google.common.net.HttpHeaders.LOCATION, "")) != null)) {
                    if (!header.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP) && !header.contains("://") && arrayList.size() > 0) {
                        android.net.Uri parse = android.net.Uri.parse((java.lang.String) arrayList.get(arrayList.size() - 1));
                        header = java.lang.String.format(header.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), header);
                    }
                    arrayList.add(header);
                    if (arrayList.size() <= 5) {
                        android.util.Pair a2 = a(header, t0Var, arrayList, str2, str3);
                        t0Var.a(java.lang.System.currentTimeMillis());
                        com.fyber.inneractive.sdk.util.IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                        return a2;
                    }
                    throw new com.fyber.inneractive.sdk.network.b("Url chain too big for us");
                }
                android.util.Pair pair = new android.util.Pair(arrayList, execute);
                t0Var.a(java.lang.System.currentTimeMillis());
                com.fyber.inneractive.sdk.util.IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                return pair;
            } catch (java.lang.Exception e) {
                throw new com.fyber.inneractive.sdk.network.b(e);
            }
        } catch (java.lang.Throwable th) {
            t0Var.a(java.lang.System.currentTimeMillis());
            com.fyber.inneractive.sdk.util.IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
            throw th;
        }
    }

    public static java.io.FilterInputStream a(okhttp3.Response response) {
        if (response == null) {
            return null;
        }
        try {
            if (response.body() == null) {
                return null;
            }
            return com.fyber.inneractive.sdk.network.i.a(response.body().byteStream(), android.text.TextUtils.equals("gzip", response.headers().get("content-encoding")));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void a(okhttp3.Request.Builder builder, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
