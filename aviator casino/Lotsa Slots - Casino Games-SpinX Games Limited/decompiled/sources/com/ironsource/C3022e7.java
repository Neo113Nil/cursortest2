package com.ironsource;

/* renamed from: com.ironsource.e7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3022e7 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6211a = 15000;
    private static final java.lang.String b = "GET";
    private static final java.lang.String c = "POST";
    private static final java.lang.String d = "UTF-8";
    public static final java.lang.String e = "ERROR:";
    private static final java.lang.String f = "Bad Request - 400";
    private static final java.util.concurrent.ExecutorService g = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: com.ironsource.e7$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6212a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ironsource.InterfaceC3040f7 c;

        a(java.lang.String str, java.lang.String str2, com.ironsource.InterfaceC3040f7 interfaceC3040f7) {
            this.f6212a = str;
            this.b = str2;
            this.c = interfaceC3040f7;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.net.HttpURLConnection httpURLConnection;
            java.io.OutputStream outputStream;
            java.io.OutputStream outputStream2;
            try {
                try {
                    httpURLConnection = com.ironsource.C3022e7.b(this.f6212a);
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                try {
                    outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        com.ironsource.C3022e7.a(this.b, outputStream2);
                        int responseCode = httpURLConnection.getResponseCode();
                        boolean z = responseCode == 200;
                        if (!z) {
                            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                        }
                        this.c.a(z);
                    } catch (java.lang.Exception e) {
                        e = e;
                        com.ironsource.C3180n4.d().a(e);
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                        this.c.a(false);
                        com.ironsource.C3022e7.a(outputStream2, httpURLConnection, (java.io.BufferedReader) null);
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    outputStream2 = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    outputStream = null;
                    com.ironsource.C3022e7.a(outputStream, httpURLConnection, (java.io.BufferedReader) null);
                    throw th;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                httpURLConnection = null;
                outputStream2 = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                httpURLConnection = null;
                outputStream = null;
            }
            com.ironsource.C3022e7.a(outputStream2, httpURLConnection, (java.io.BufferedReader) null);
        }
    }

    public static java.lang.String a(java.lang.String str) throws java.lang.Exception {
        return a(str, (com.ironsource.mediationsdk.p.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.net.HttpURLConnection b(java.lang.String str) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static java.lang.String a(java.lang.String str, com.ironsource.mediationsdk.p.b bVar) {
        java.net.HttpURLConnection httpURLConnection;
        java.io.BufferedReader bufferedReader;
        java.lang.Exception e2;
        java.io.BufferedReader bufferedReader2;
        java.lang.Throwable th;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (bVar != null) {
                        bVar.a("Bad Request - 400");
                    }
                    a((java.io.OutputStream) null, httpURLConnection, (java.io.BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    java.lang.String a2 = a(bufferedReader2);
                    a((java.io.OutputStream) null, httpURLConnection, bufferedReader2);
                    return a2;
                } catch (java.lang.Exception e3) {
                    e2 = e3;
                    try {
                        com.ironsource.C3180n4.d().a(e2);
                        a((java.io.OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (java.lang.Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        java.io.BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        a((java.io.OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    a((java.io.OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                e2 = e;
                bufferedReader2 = null;
                com.ironsource.C3180n4.d().a(e2);
                a((java.io.OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                bufferedReader = null;
                java.io.BufferedReader bufferedReader32 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader32;
                a((java.io.OutputStream) null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            httpURLConnection = null;
        } catch (java.lang.Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, com.ironsource.InterfaceC3040f7 interfaceC3040f7) {
        g.submit(new com.ironsource.C3022e7.a(str, str2, interfaceC3040f7));
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.p.b bVar) {
        com.ironsource.InterfaceC3058g7 a2 = a(str, str2);
        if (a2 instanceof com.ironsource.InterfaceC3058g7.a) {
            com.ironsource.InterfaceC3058g7.a aVar = (com.ironsource.InterfaceC3058g7.a) a2;
            if (aVar.b()) {
                return null;
            }
            bVar.a(aVar.a());
            return null;
        }
        return ((com.ironsource.InterfaceC3058g7.b) a2).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static com.ironsource.InterfaceC3058g7 a(java.lang.String str, java.lang.String str2) {
        java.io.OutputStream outputStream;
        java.lang.Exception e2;
        java.lang.Exception e3;
        java.io.BufferedReader bufferedReader;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                str = b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStream = str.getOutputStream();
                    try {
                        a(str2, outputStream);
                        int responseCode = str.getResponseCode();
                        if (responseCode == 200) {
                            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(str.getInputStream()));
                            try {
                                java.lang.String a2 = a(bufferedReader);
                                if (a2 != null) {
                                    com.ironsource.InterfaceC3058g7.b bVar = new com.ironsource.InterfaceC3058g7.b(a2);
                                    a(outputStream, (java.net.HttpURLConnection) str, bufferedReader);
                                    return bVar;
                                }
                                com.ironsource.InterfaceC3058g7.a.c cVar = new com.ironsource.InterfaceC3058g7.a.c();
                                a(outputStream, (java.net.HttpURLConnection) str, bufferedReader);
                                return cVar;
                            } catch (java.lang.Exception e4) {
                                e3 = e4;
                                com.ironsource.C3180n4.d().a(e3);
                                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                                com.ironsource.InterfaceC3058g7.a.C0151a c0151a = new com.ironsource.InterfaceC3058g7.a.C0151a(e3);
                                a(outputStream, (java.net.HttpURLConnection) str, bufferedReader);
                                return c0151a;
                            }
                        }
                        com.ironsource.InterfaceC3058g7.a.b bVar2 = new com.ironsource.InterfaceC3058g7.a.b(responseCode, str.getResponseMessage());
                        a(outputStream, (java.net.HttpURLConnection) str, (java.io.BufferedReader) null);
                        return bVar2;
                    } catch (java.lang.Exception e5) {
                        e2 = e5;
                        e3 = e2;
                        bufferedReader = null;
                        com.ironsource.C3180n4.d().a(e3);
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                        com.ironsource.InterfaceC3058g7.a.C0151a c0151a2 = new com.ironsource.InterfaceC3058g7.a.C0151a(e3);
                        a(outputStream, (java.net.HttpURLConnection) str, bufferedReader);
                        return c0151a2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        a(outputStream, (java.net.HttpURLConnection) str, (java.io.BufferedReader) r1);
                        throw th;
                    }
                } catch (java.lang.Exception e6) {
                    e2 = e6;
                    outputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (java.lang.Throwable th3) {
                r1 = str2;
                th = th3;
            }
        } catch (java.lang.Exception e7) {
            e2 = e7;
            str = 0;
            outputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            str = 0;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static java.lang.String a(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        java.lang.String sb2 = sb.toString();
        if (android.text.TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(java.io.OutputStream outputStream, java.net.HttpURLConnection httpURLConnection, java.io.BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception while closing output stream " + e2.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException e3) {
                com.ironsource.C3180n4.d().a(e3);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception while closing reader " + e3.getMessage());
            }
        }
    }
}
