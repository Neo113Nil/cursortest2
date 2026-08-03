package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6435a = "1";
    private final java.lang.String b = "102";
    private final java.lang.String c = "102";
    private final java.lang.String d = "GenericNotifications";
    private com.ironsource.mediationsdk.f e;
    private com.ironsource.mediationsdk.IronSource.a f;
    private com.ironsource.C3267s2 g;
    private com.ironsource.U1 h;
    private com.ironsource.mediationsdk.ISBannerSize i;

    public e(com.ironsource.mediationsdk.f fVar) {
        this.e = fVar;
    }

    @java.lang.Deprecated
    public void a(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, com.ironsource.C2963b2 c2963b2, int i, com.ironsource.C2953aa c2953aa, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, c2963b2, i, c2953aa);
    }

    public void a(android.content.Context context, com.ironsource.mediationsdk.h hVar, com.ironsource.U1 u1) {
        try {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, hVar, u1));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (u1 != null) {
                u1.a(1000, e.getMessage(), 0, com.ironsource.C2945a2.f6130a.a(this.e.a(), 1000), 0L);
            }
        }
    }

    public static class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected com.ironsource.U1 f6436a;
        protected com.ironsource.mediationsdk.d.a b;
        protected int c;
        protected java.lang.String d;
        protected long e;
        protected int f;
        private int h;
        private final java.net.URL k;
        private final org.json.JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        protected java.lang.String i = "";
        protected int j = 0;
        protected java.lang.String g = a((java.lang.Integer) null);

        public a(com.ironsource.U1 u1, java.net.URL url, org.json.JSONObject jSONObject, boolean z, com.ironsource.C3267s2 c3267s2) {
            this.f6436a = u1;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = c3267s2.g();
            this.o = c3267s2.m();
            this.p = c3267s2.o();
            this.q = c3267s2.p();
            this.h = c3267s2.d();
            this.r = c3267s2.n();
        }

        private void a(long j, long j2) {
            long time = j - (new java.util.Date().getTime() - j2);
            if (time > 0) {
                android.os.SystemClock.sleep(time);
            }
        }

        protected boolean b() {
            long time;
            com.ironsource.mediationsdk.logger.IronLog ironLog;
            int responseCode;
            this.e = new java.util.Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                java.net.HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = a(java.lang.Integer.valueOf(this.c));
                        return false;
                    }
                    try {
                        time = new java.util.Date().getTime();
                        java.lang.String str = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        com.ironsource.mediationsdk.utils.IronSourceUtils.i(str);
                        httpURLConnection = a(this.k, this.o);
                        ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.l);
                        a(httpURLConnection, this.l, this.p);
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (java.net.SocketTimeoutException e) {
                        com.ironsource.C3180n4.d().a(e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (java.lang.Throwable th) {
                        com.ironsource.C3180n4.d().a(th);
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = a(java.lang.Integer.valueOf(this.c));
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            a(a(httpURLConnection), this.m, this.q);
                            httpURLConnection.disconnect();
                            return true;
                        } catch (org.json.JSONException e2) {
                            com.ironsource.C3180n4.d().a(e2);
                            if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                                this.c = 1003;
                                this.d = "Auction decryption error";
                            } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                                this.c = 1002;
                                this.d = "Auction parsing error";
                            } else {
                                this.c = 1008;
                                this.d = "Auction decompression error";
                            }
                            this.g = a(java.lang.Integer.valueOf(this.c));
                            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                            httpURLConnection.disconnect();
                            return false;
                        }
                    }
                    this.c = 1001;
                    java.lang.String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.d = str2;
                    ironLog.error(str2);
                    httpURLConnection.disconnect();
                    if (this.f < this.n - 1) {
                        a(this.o, time);
                    }
                    this.f++;
                }
            } catch (java.lang.Exception e3) {
                com.ironsource.C3180n4.d().a(e3);
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = a(java.lang.Integer.valueOf(this.c));
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean b = b();
            com.ironsource.U1 u1 = this.f6436a;
            if (u1 == null) {
                return;
            }
            a(b, u1, new java.util.Date().getTime() - this.e);
        }

        private java.lang.String a() {
            if (this.h == 2) {
                return com.ironsource.C3127k5.b().d();
            }
            return com.ironsource.C3127k5.b().c();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(java.net.HttpURLConnection httpURLConnection, org.json.JSONObject jSONObject, boolean z) throws java.lang.Exception {
            java.lang.String a2;
            java.lang.String e;
            java.lang.String format;
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(outputStream, "UTF-8");
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    a2 = com.ironsource.C3127k5.b().a();
                } catch (org.json.JSONException e2) {
                    com.ironsource.C3180n4.d().a(e2);
                    this.i = e2.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("get encrypted session key exception " + e2.getMessage());
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                java.lang.String a3 = a();
                if (!z) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                    e = com.ironsource.I9.a(a3, jSONObject2);
                } else {
                    e = com.ironsource.I9.e(a3, jSONObject2);
                }
                if (this.h != 2) {
                    format = java.lang.String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a2, e);
                } else {
                    format = java.lang.String.format("{\"request\" : \"%1$s\"}", e);
                }
                bufferedWriter.write(format);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                outputStream.close();
            }
            a2 = "";
            java.lang.String jSONObject22 = jSONObject.toString();
            java.lang.String a32 = a();
            if (!z) {
            }
            if (this.h != 2) {
            }
            bufferedWriter.write(format);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private java.net.HttpURLConnection a(java.net.URL url, long j) throws java.io.IOException {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        protected org.json.JSONObject a(org.json.JSONObject jSONObject, boolean z) throws org.json.JSONException {
            java.lang.String str;
            java.lang.String a2 = a();
            if (this.h == 2) {
                str = com.facebook.appevents.UserDataStore.CITY;
            } else {
                str = com.ironsource.Ve.n;
            }
            java.lang.String string = jSONObject.getString(str);
            if (z) {
                return b(a2, string);
            }
            return a(a2, string);
        }

        protected void a(java.lang.String str, boolean z, boolean z2) throws org.json.JSONException {
            if (!android.text.TextUtils.isEmpty(str)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (z) {
                    jSONObject = a(jSONObject, z2);
                }
                com.ironsource.mediationsdk.d.a a2 = com.ironsource.mediationsdk.d.b().a(jSONObject);
                this.b = a2;
                this.c = a2.c();
                this.d = this.b.d();
                return;
            }
            throw new org.json.JSONException("empty response");
        }

        private org.json.JSONObject a(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
            java.lang.String b = com.ironsource.I9.b(str, str2);
            if (!android.text.TextUtils.isEmpty(b)) {
                return new org.json.JSONObject(b);
            }
            throw new org.json.JSONException("decryption error");
        }

        private java.lang.String a(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(httpURLConnection.getInputStream());
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        protected void a(boolean z, com.ironsource.U1 u1, long j) {
            if (z) {
                u1.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                u1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        private java.lang.String a(java.lang.Integer num) {
            return com.ironsource.C2945a2.f6130a.a(this.r, num);
        }

        private org.json.JSONObject b(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            java.lang.String d = com.ironsource.I9.d(str, str2);
            if (d != null) {
                return new org.json.JSONObject(d);
            }
            throw new org.json.JSONException("decompression error");
        }
    }

    @java.lang.Deprecated
    public e(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.C3267s2 c3267s2, com.ironsource.U1 u1) {
        this.f = aVar;
        this.g = c3267s2;
        this.h = u1;
    }

    @java.lang.Deprecated
    public void a(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, com.ironsource.C2963b2 c2963b2, int i, com.ironsource.C2953aa c2953aa) {
        try {
            boolean g = com.ironsource.mediationsdk.utils.IronSourceUtils.g();
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.e.a(this.h, new java.net.URL(this.g.a(false)), a(map, list, c2963b2, i, g, c2953aa), g, this.g));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            this.h.a(1000, e.getMessage(), 0, com.ironsource.C2945a2.f6130a.a(this.g.n(), 1000), 0L);
        }
    }

    public void a(com.ironsource.C3232q2 c3232q2, int i, com.ironsource.C3232q2 c3232q22, java.lang.String str) {
        java.util.Iterator<java.lang.String> it = c3232q2.b().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.d.b().a("reportImpression", c3232q2.c(), com.ironsource.mediationsdk.d.b().a(it.next(), i, c3232q2, "", "", str));
        }
        if (c3232q22 != null) {
            java.util.Iterator<java.lang.String> it2 = c3232q22.b().iterator();
            while (it2.hasNext()) {
                com.ironsource.mediationsdk.d.b().a("reportImpression", "GenericNotifications", com.ironsource.mediationsdk.d.b().a(it2.next(), i, c3232q2, "", "102", str));
            }
        }
    }

    public void a(com.ironsource.C3232q2 c3232q2, int i, com.ironsource.C3232q2 c3232q22) {
        java.util.Iterator<java.lang.String> it = c3232q2.h().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.d.b().a("reportLoadSuccess", c3232q2.c(), com.ironsource.mediationsdk.d.b().a(it.next(), i, c3232q2, "", "", ""));
        }
        if (c3232q22 != null) {
            java.util.Iterator<java.lang.String> it2 = c3232q22.h().iterator();
            while (it2.hasNext()) {
                com.ironsource.mediationsdk.d.b().a("reportLoadSuccess", "GenericNotifications", com.ironsource.mediationsdk.d.b().a(it2.next(), i, c3232q2, "", "102", ""));
            }
        }
    }

    public void a(java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.u> copyOnWriteArrayList, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.C3232q2> concurrentHashMap, int i, com.ironsource.C3232q2 c3232q2, com.ironsource.C3232q2 c3232q22) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.ironsource.mediationsdk.u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, c3232q2, c3232q22);
    }

    public void a(java.util.ArrayList<java.lang.String> arrayList, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.C3232q2> concurrentHashMap, int i, com.ironsource.C3232q2 c3232q2, com.ironsource.C3232q2 c3232q22) {
        int j = c3232q22.j();
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (!next.equals(c3232q22.c())) {
                com.ironsource.C3232q2 c3232q23 = concurrentHashMap.get(next);
                int j2 = c3232q23.j();
                java.lang.String i2 = c3232q23.i();
                java.lang.String str = j2 < j ? "1" : "102";
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("instance=" + c3232q23.c() + ", instancePriceOrder= " + j2 + ", loseReasonCode=" + str + ", winnerInstance=" + c3232q22.c() + ", winnerInstancePriceOrder=" + j);
                java.util.Iterator<java.lang.String> it2 = c3232q23.g().iterator();
                while (it2.hasNext()) {
                    com.ironsource.mediationsdk.d.b().a("reportAuctionLose", c3232q23.c(), com.ironsource.mediationsdk.d.b().a(it2.next(), i, c3232q22, i2, str, ""));
                }
            }
        }
        if (c3232q2 != null) {
            java.util.Iterator<java.lang.String> it3 = c3232q2.g().iterator();
            while (it3.hasNext()) {
                com.ironsource.mediationsdk.d.b().a("reportAuctionLose", "GenericNotifications", com.ironsource.mediationsdk.d.b().a(it3.next(), i, c3232q22, "", "102", ""));
            }
        }
    }

    private org.json.JSONObject a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, com.ironsource.C2963b2 c2963b2, int i, boolean z, com.ironsource.C2953aa c2953aa) throws org.json.JSONException {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.f);
        hVar.a(map);
        hVar.a(list);
        hVar.a(c2963b2);
        hVar.a(i);
        hVar.a(this.i);
        hVar.a(c2953aa);
        hVar.b(z);
        return com.ironsource.mediationsdk.d.b().a(hVar);
    }

    public boolean a() {
        return this.e.b();
    }
}
