package com.ironsource;

/* renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3180n4 {
    private static final java.lang.String k = "1.0.6";
    public static java.lang.String l = "";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3362x7 f6477a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private com.ironsource.environment.ContextProvider f;
    public java.lang.Thread.UncaughtExceptionHandler g;
    public java.lang.String h;
    private java.lang.String i;
    private boolean j;

    /* renamed from: com.ironsource.n4$a */
    class a implements com.ironsource.InterfaceC2960b {
        a() {
        }

        @Override // com.ironsource.InterfaceC2960b
        public void a() {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            for (java.lang.Thread thread : allStackTraces.keySet()) {
                java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            com.ironsource.C3180n4.l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC2960b
        public void b() {
        }
    }

    /* renamed from: com.ironsource.n4$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f6479a;
        final /* synthetic */ java.lang.String b;

        b(android.content.Context context, java.lang.String str) {
            this.f6479a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.String J = com.ironsource.C3180n4.this.f6477a.J(this.f6479a);
                if (!android.text.TextUtils.isEmpty(J)) {
                    com.ironsource.C3180n4.this.c = J;
                }
                java.lang.String c = com.ironsource.C3180n4.this.f6477a.c(this.f6479a);
                if (!android.text.TextUtils.isEmpty(c)) {
                    com.ironsource.C3180n4.this.e = c;
                }
                android.content.SharedPreferences.Editor edit = this.f6479a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", com.ironsource.C3180n4.this.c);
                edit.putString("sId", this.b);
                edit.apply();
            } catch (java.lang.Exception e) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.n4$c */
    class c extends com.ironsource.RunnableC3198o4 {
        c(org.json.JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* renamed from: com.ironsource.n4$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile com.ironsource.C3180n4 f6480a = new com.ironsource.C3180n4();

        private d() {
        }
    }

    private C3180n4() {
        this.j = false;
        this.f6477a = com.ironsource.Jb.Y().a();
        this.f = com.ironsource.environment.ContextProvider.getInstance();
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = io.ktor.sse.ServerSentEventKt.SPACE;
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.ironsource.C3144l4(defaultUncaughtExceptionHandler));
    }

    static java.util.List<com.ironsource.K5> c() {
        return null;
    }

    public static com.ironsource.C3180n4 d() {
        return com.ironsource.C3180n4.d.f6480a;
    }

    public void a(java.util.HashSet<java.lang.String> hashSet, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, boolean z2) {
        android.content.Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            android.util.Log.d("automation_log", "init ISCrashReporter");
            if (!android.text.TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new com.ironsource.C2942a(i).a(z2).b(true).a(new com.ironsource.C3180n4.a()).start();
            }
            a(applicationContext, hashSet);
            new java.lang.Thread(new com.ironsource.C3180n4.b(applicationContext, str3)).start();
        }
        this.j = true;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("initialized");
    }

    public java.lang.String b() {
        return k;
    }

    java.lang.String e() {
        return this.i;
    }

    public void a(java.lang.Throwable th) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new com.ironsource.K5(new com.ironsource.C3162m4(th).b(), "" + java.lang.System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(android.content.Context context, java.util.HashSet<java.lang.String> hashSet) {
        java.lang.String a2 = a(a());
        if (a2.equals("none")) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        java.lang.String string = sharedPreferences.getString("String1", this.c);
        java.lang.String string2 = sharedPreferences.getString("sId", this.d);
        java.util.List<com.ironsource.K5> b2 = com.ironsource.E4.b();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("reportList size " + b2.size());
        for (com.ironsource.K5 k5 : b2) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String b3 = k5.b();
            java.lang.String e = k5.e();
            java.lang.String d2 = k5.d();
            java.lang.String packageName = context.getPackageName();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                android.app.ActivityManager.MemoryInfo o = this.f6477a.o(context);
                if (o != null) {
                    jSONObject2.put("availRam", this.f6477a.c(o));
                    jSONObject2.put(com.ironsource.M6.x, this.f6477a.b(o));
                    jSONObject2.put("mThreshold", this.f6477a.a(o));
                }
                java.lang.String t = this.f6477a.t();
                if (t != null) {
                    jSONObject2.put(com.ironsource.M6.z, t);
                }
                jSONObject2.put("crashDate", b3);
                jSONObject2.put("stacktraceCrash", e);
                jSONObject2.put("crashType", d2);
                jSONObject2.put("CrashReporterVersion", k);
                jSONObject2.put(com.ironsource.X3.j.q, "9.4.0");
                jSONObject2.put(com.ironsource.X3.j.x, this.f6477a.d(context));
                jSONObject2.put("appVersion", com.ironsource.E1.b(context, packageName));
                jSONObject2.put(com.ironsource.X3.j.n, this.f6477a.i());
                jSONObject2.put("network", a2);
                jSONObject2.put(com.ironsource.X3.j.p, this.f6477a.e());
                jSONObject2.put("deviceModel", this.f6477a.l());
                jSONObject2.put("totalRam", this.f6477a.r(context));
                jSONObject2.put(com.ironsource.Va.o, this.f6477a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f6477a.q());
                jSONObject2.put("systemProperties", java.lang.System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!android.text.TextUtils.isEmpty(this.e)) {
                    jSONObject2.put(com.ironsource.X3.j.M, java.lang.Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    java.util.Iterator<java.lang.String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (java.lang.Exception e2) {
                            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            if (jSONObject.length() == 0) {
                android.util.Log.d("ISCrashReport", " Is Empty");
            } else {
                new java.lang.Thread(new com.ironsource.C3180n4.c(jSONObject)).start();
            }
        }
        com.ironsource.E4.a();
    }

    android.content.Context a() {
        return this.f.getApplicationContext();
    }

    private java.lang.String a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return com.ironsource.T3.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return com.ironsource.T3.g;
                }
            } else {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return com.ironsource.T3.b;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return com.ironsource.T3.g;
                    }
                }
            }
            return "none";
        } catch (java.lang.Exception e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
