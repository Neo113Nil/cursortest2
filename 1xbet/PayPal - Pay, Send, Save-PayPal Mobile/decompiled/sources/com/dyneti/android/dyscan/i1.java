package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3311a;
    public final java.util.concurrent.ExecutorService c = java.util.concurrent.Executors.newSingleThreadExecutor();
    public java.lang.String b = null;

    public i1(android.content.Context context) {
        this.f3311a = context;
    }

    public final java.lang.String a() {
        if (this.b == null) {
            return null;
        }
        try {
            return (java.lang.String) this.c.submit(new java.util.concurrent.Callable() { // from class: com.dyneti.android.dyscan.i1$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.dyneti.android.dyscan.i1.this.b();
                }
            }).get();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String b() {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://api.dyneti.com/custom/");
            sb.append(this.b);
            java.io.BufferedReader a2 = a(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = a2.readLine();
                if (readLine == null) {
                    return sb2.toString();
                }
                sb2.append(readLine);
            }
        } catch (java.net.MalformedURLException | java.io.IOException unused) {
            return null;
        }
    }

    public final java.lang.String c() {
        java.io.File cacheDir = this.f3311a.getCacheDir();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gcc-");
        sb.append(this.b);
        sb.append(".json");
        java.io.File file = new java.io.File(cacheDir, sb.toString());
        if (!file.exists()) {
            return null;
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public final java.lang.String d() {
        try {
            return (java.lang.String) this.c.submit(new java.util.concurrent.Callable() { // from class: com.dyneti.android.dyscan.i1$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.dyneti.android.dyscan.i1.this.c();
                }
            }).get();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void b(java.lang.String str) {
        try {
            java.io.File cacheDir = this.f3311a.getCacheDir();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("gcc-");
            sb.append(this.b);
            sb.append(".json");
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(cacheDir, sb.toString())));
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (java.io.IOException unused) {
        }
    }

    public final void c(final java.lang.String str) {
        try {
            this.c.submit(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.i1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.dyneti.android.dyscan.i1.this.b(str);
                }
            }).get();
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.io.BufferedReader a(java.lang.String str) {
        android.net.TrafficStats.setThreadStatsTag((int) java.lang.Thread.currentThread().getId());
        javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(str).openConnection();
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(120000);
        httpsURLConnection.setRequestMethod("GET");
        return new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.BufferedInputStream(httpsURLConnection.getInputStream())));
    }
}
