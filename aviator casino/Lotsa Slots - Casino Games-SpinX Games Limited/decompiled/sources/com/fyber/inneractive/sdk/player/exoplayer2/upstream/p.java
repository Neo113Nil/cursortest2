package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {
    public static final java.util.regex.Pattern o = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final java.util.concurrent.atomic.AtomicReference p = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4096a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.w e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.w f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.m g;
    public java.net.HttpURLConnection h;
    public java.io.InputStream i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;

    public p(java.lang.String str, com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar, int i, int i2, boolean z, com.fyber.inneractive.sdk.player.exoplayer2.upstream.w wVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.d = str;
        this.g = mVar;
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.w();
        this.b = i;
        this.c = i2;
        this.f4096a = z;
        this.e = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final android.net.Uri a() {
        java.net.HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    public final java.net.HttpURLConnection b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        java.net.URL url = new java.net.URL(kVar.f4091a.toString());
        long j = kVar.c;
        long j2 = kVar.d;
        int i = 0;
        boolean z = (kVar.f & 1) == 1;
        if (!this.f4096a) {
            return a(url, null, j, j2, z, true);
        }
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new java.net.NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i2));
            }
            java.net.HttpURLConnection a2 = a(url, null, j, j2, z, false);
            int responseCode = a2.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                return a2;
            }
            java.lang.String headerField = a2.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
            a2.disconnect();
            if (headerField == null) {
                throw new java.net.ProtocolException("Null location redirect");
            }
            java.net.URL url2 = new java.net.URL(url, headerField);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new java.net.ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i = i2;
            url = url2;
        }
    }

    public final void c() {
        if (this.m == this.k) {
            return;
        }
        byte[] bArr = (byte[]) p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.m;
            long j2 = this.k;
            if (j == j2) {
                p.set(bArr);
                return;
            }
            int read = this.i.read(bArr, 0, (int) java.lang.Math.min(j2 - j, bArr.length));
            if (java.lang.Thread.interrupted()) {
                throw new java.io.InterruptedIOException();
            }
            if (read == -1) {
                throw new java.io.EOFException();
            }
            long j3 = read;
            this.m += j3;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.d += j3;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.i != null) {
                java.net.HttpURLConnection httpURLConnection = this.h;
                long j = this.l;
                if (j != -1) {
                    j -= this.n;
                }
                a(httpURLConnection, j);
                try {
                    this.i.close();
                } catch (java.io.IOException e) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u(e);
                }
            }
        } finally {
            this.i = null;
            b();
            if (this.j) {
                this.j = false;
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        try {
            c();
            return a(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2 != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        long j;
        long parseLong;
        java.lang.String headerField;
        this.n = 0L;
        this.m = 0L;
        try {
            java.net.HttpURLConnection b = b(kVar);
            this.h = b;
            try {
                int responseCode = b.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    this.h.getHeaderFields();
                    b();
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.v vVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.v(responseCode);
                    if (responseCode != 416) {
                        throw vVar;
                    }
                    vVar.initCause(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i());
                    throw vVar;
                }
                this.h.getContentType();
                if (responseCode == 200) {
                    j = kVar.c;
                }
                j = 0;
                this.k = j;
                if ((kVar.f & 1) == 1) {
                    this.l = kVar.d;
                } else {
                    long j2 = kVar.d;
                    if (j2 != -1) {
                        this.l = j2;
                    } else {
                        java.net.HttpURLConnection httpURLConnection = this.h;
                        java.lang.String headerField2 = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                        if (!android.text.TextUtils.isEmpty(headerField2)) {
                            try {
                                parseLong = java.lang.Long.parseLong(headerField2);
                            } catch (java.lang.NumberFormatException unused) {
                                android.util.Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField2 + com.ironsource.X3.j.e);
                            }
                            headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                            if (!android.text.TextUtils.isEmpty(headerField)) {
                                java.util.regex.Matcher matcher = o.matcher(headerField);
                                if (matcher.find()) {
                                    try {
                                        long parseLong2 = (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                                        if (parseLong < 0) {
                                            parseLong = parseLong2;
                                        } else if (parseLong != parseLong2) {
                                            android.util.Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField2 + "] [" + headerField + com.ironsource.X3.j.e);
                                            parseLong = java.lang.Math.max(parseLong, parseLong2);
                                        }
                                    } catch (java.lang.NumberFormatException unused2) {
                                        android.util.Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField + com.ironsource.X3.j.e);
                                    }
                                }
                            }
                            this.l = parseLong != -1 ? parseLong - this.k : -1L;
                        }
                        parseLong = -1;
                        headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                        if (!android.text.TextUtils.isEmpty(headerField)) {
                        }
                        this.l = parseLong != -1 ? parseLong - this.k : -1L;
                    }
                }
                try {
                    this.i = this.h.getInputStream();
                    this.j = true;
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.g;
                    if (mVar != null) {
                        synchronized (mVar) {
                            if (mVar.b == 0) {
                                mVar.c = android.os.SystemClock.elapsedRealtime();
                            }
                            mVar.b++;
                        }
                    }
                    return this.l;
                } catch (java.io.IOException e) {
                    b();
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u(e);
                }
            } catch (java.io.IOException e2) {
                b();
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u("Unable to connect to " + kVar.f4091a.toString(), e2);
            }
        } catch (java.io.IOException e3) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u("Unable to connect to " + kVar.f4091a.toString(), e3);
        }
    }

    public final java.net.HttpURLConnection a(java.net.URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        java.util.Map map;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.w wVar = this.e;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.b == null) {
                    wVar.b = java.util.Collections.unmodifiableMap(new java.util.HashMap(wVar.f4100a));
                }
                map = wVar.b;
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        for (java.util.Map.Entry entry2 : this.f.a().entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            java.lang.String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, str);
        }
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.d);
        if (!z) {
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.l;
        if (j != -1) {
            long j2 = j - this.n;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) java.lang.Math.min(i2, j2);
        }
        int read = this.i.read(bArr, i, i2);
        if (read == -1) {
            if (this.l == -1) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        long j3 = read;
        this.n += j3;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.g;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.d += j3;
            }
        }
        return read;
    }

    public static void a(java.net.HttpURLConnection httpURLConnection, long j) {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        if (i == 19 || i == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    java.lang.reflect.Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final void b() {
        java.net.HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                android.util.Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.h = null;
        }
    }
}
