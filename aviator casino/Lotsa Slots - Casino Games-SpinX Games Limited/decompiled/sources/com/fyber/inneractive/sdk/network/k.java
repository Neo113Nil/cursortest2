package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class k extends com.fyber.inneractive.sdk.network.i implements com.fyber.inneractive.sdk.network.h {
    @Override // com.fyber.inneractive.sdk.network.h
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.t0 t0Var, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.network.l a2;
        com.fyber.inneractive.sdk.util.IAlog.a("%s hurl network stack is in use", "HttpExecutorImpl");
        java.lang.String r = t0Var.r();
        java.net.URL url = new java.net.URL(r);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(r);
        android.util.Pair a3 = a(t0Var, arrayList, url, str, str2);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) a3.second;
        java.util.List list = (java.util.List) a3.first;
        if (httpURLConnection == null) {
            try {
                if (list.size() <= 0) {
                    throw new com.fyber.inneractive.sdk.network.q1();
                }
            } catch (java.net.SocketTimeoutException e) {
                throw new com.fyber.inneractive.sdk.network.t1(e);
            } catch (java.io.IOException e2) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed reading network response for url: %s msg: %s", httpURLConnection.getURL(), e2.getMessage());
                throw new com.fyber.inneractive.sdk.network.q1(e2);
            }
        }
        java.io.FilterInputStream filterInputStream = null;
        if (httpURLConnection == null) {
            a2 = com.fyber.inneractive.sdk.network.i.a(null, 200, "", null, null);
        } else {
            try {
                filterInputStream = com.fyber.inneractive.sdk.network.i.a(httpURLConnection.getInputStream(), android.text.TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (java.lang.Exception unused) {
            }
            a2 = com.fyber.inneractive.sdk.network.i.a(filterInputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LAST_MODIFIED));
        }
        com.fyber.inneractive.sdk.network.j jVar = new com.fyber.inneractive.sdk.network.j(httpURLConnection, a2.f3845a, (java.io.FilterInputStream) a2.c, a2.d, a2.e);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.f.add((java.lang.String) it.next());
        }
        return jVar;
    }

    public static android.util.Pair a(com.fyber.inneractive.sdk.network.t0 t0Var, java.util.ArrayList arrayList, java.net.URL url, java.lang.String str, java.lang.String str2) {
        java.lang.String headerField;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            t0Var.getClass();
            if (!(!(t0Var instanceof com.fyber.inneractive.sdk.network.h1))) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            com.fyber.inneractive.sdk.network.l1 p = t0Var.p();
            httpURLConnection.setConnectTimeout(p.f3847a);
            httpURLConnection.setReadTimeout(p.b);
            a(httpURLConnection, com.google.common.net.HttpHeaders.USER_AGENT, str);
            a(httpURLConnection, com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE, str2);
            a(httpURLConnection, com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "gzip");
            com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
            if (sVar != null && sVar.b.a("add_accept", 1, 0) == 1) {
                a(httpURLConnection, com.google.common.net.HttpHeaders.ACCEPT, "*/*");
            }
            java.util.Map l = t0Var.l();
            if (l != null) {
                for (java.lang.String str3 : l.keySet()) {
                    a(httpURLConnection, str3, (java.lang.String) l.get(str3));
                }
            }
            t0Var.c(java.lang.System.currentTimeMillis());
            if (t0Var.m() != com.fyber.inneractive.sdk.network.m0.POST && t0Var.m() != com.fyber.inneractive.sdk.network.m0.PUT) {
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                t0Var.a(java.lang.System.currentTimeMillis());
                com.fyber.inneractive.sdk.util.IAlog.a("%s (%s) response code - %d", t0Var.toString(), url, java.lang.Integer.valueOf(responseCode));
                if ((!(t0Var instanceof com.fyber.inneractive.sdk.network.h1)) && (((responseCode > 300 && responseCode < 304) || responseCode == 307 || responseCode == 308) && (headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION)) != null)) {
                    if (!headerField.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP) && !headerField.contains("://") && arrayList.size() > 0) {
                        android.net.Uri parse = android.net.Uri.parse((java.lang.String) arrayList.get(arrayList.size() - 1));
                        headerField = java.lang.String.format(headerField.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), headerField);
                    }
                    arrayList.add(headerField);
                    if (arrayList.size() <= 20) {
                        if (headerField.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP)) {
                            return a(t0Var, arrayList, new java.net.URL(headerField), str, str2);
                        }
                        return android.util.Pair.create(arrayList, null);
                    }
                    throw new com.fyber.inneractive.sdk.network.b("Url chain too big for us");
                }
                return new android.util.Pair(arrayList, httpURLConnection);
            }
            a(httpURLConnection, t0Var);
            int responseCode2 = httpURLConnection.getResponseCode();
            t0Var.a(java.lang.System.currentTimeMillis());
            com.fyber.inneractive.sdk.util.IAlog.a("%s (%s) response code - %d", t0Var.toString(), url, java.lang.Integer.valueOf(responseCode2));
            if (!(t0Var instanceof com.fyber.inneractive.sdk.network.h1)) {
            }
            return new android.util.Pair(arrayList, httpURLConnection);
        } catch (java.lang.Exception e) {
            t0Var.a(java.lang.System.currentTimeMillis());
            com.fyber.inneractive.sdk.util.IAlog.a("failed executing network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            throw new com.fyber.inneractive.sdk.network.b(e);
        }
    }

    public static void a(java.net.HttpURLConnection httpURLConnection, com.fyber.inneractive.sdk.network.t0 t0Var) {
        httpURLConnection.setRequestMethod(t0Var.m().key);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] f = t0Var.f();
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.CONTENT_LENGTH, "" + (f != null ? f.length : 0));
        httpURLConnection.setRequestProperty("Content-Type", t0Var.n());
        httpURLConnection.connect();
        java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(f);
        try {
            outputStream.close();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }
}
