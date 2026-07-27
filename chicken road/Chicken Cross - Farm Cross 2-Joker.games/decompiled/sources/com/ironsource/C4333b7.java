package com.ironsource;

import android.text.TextUtils;
import com.ironsource.InterfaceC4369d7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4333b7 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8095a = 15000;
    private static final String b = "GET";
    private static final String c = "POST";
    private static final String d = "UTF-8";
    public static final String e = "ERROR:";
    private static final String f = "Bad Request - 400";
    private static final ExecutorService g = Executors.newSingleThreadExecutor();

    /* renamed from: com.ironsource.b7$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8096a;
        final /* synthetic */ String b;
        final /* synthetic */ InterfaceC4351c7 c;

        a(String str, String str2, InterfaceC4351c7 interfaceC4351c7) {
            this.f8096a = str;
            this.b = str2;
            this.c = interfaceC4351c7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            try {
                httpURLConnection = C4333b7.b(this.f8096a);
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        try {
                            C4333b7.a(this.b, outputStream);
                            int responseCode = httpURLConnection.getResponseCode();
                            boolean z = responseCode == 200;
                            if (!z) {
                                IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                            }
                            this.c.a(z);
                        } catch (Exception e) {
                            e = e;
                            C4491k4.d().a(e);
                            IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                            this.c.a(false);
                            C4333b7.a(outputStream, httpURLConnection, (BufferedReader) null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        C4333b7.a(outputStream, httpURLConnection, (BufferedReader) null);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    C4333b7.a(outputStream, httpURLConnection, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                outputStream = null;
            }
            C4333b7.a(outputStream, httpURLConnection, (BufferedReader) null);
        }
    }

    public static String a(String str) throws Exception {
        return a(str, (p.c) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String a(String str, p.c cVar) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e2;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (cVar != null) {
                        cVar.a("Bad Request - 400");
                    }
                    a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String a2 = a(bufferedReader2);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return a2;
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        C4491k4.d().a(e2);
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                e2 = e;
                bufferedReader2 = null;
                C4491k4.d().a(e2);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                BufferedReader bufferedReader32 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader32;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void a(String str, String str2, InterfaceC4351c7 interfaceC4351c7) {
        g.submit(new a(str, str2, interfaceC4351c7));
    }

    public static String a(String str, String str2, p.c cVar) {
        InterfaceC4369d7 a2 = a(str, str2);
        if (a2 instanceof InterfaceC4369d7.a) {
            InterfaceC4369d7.a aVar = (InterfaceC4369d7.a) a2;
            if (aVar.b()) {
                return null;
            }
            cVar.a(aVar.a());
            return null;
        }
        return ((InterfaceC4369d7.b) a2).d();
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
    public static InterfaceC4369d7 a(String str, String str2) {
        OutputStream outputStream;
        Exception e2;
        Exception e3;
        BufferedReader bufferedReader;
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
                            bufferedReader = new BufferedReader(new InputStreamReader(str.getInputStream()));
                            try {
                                String a2 = a(bufferedReader);
                                if (a2 != null) {
                                    InterfaceC4369d7.b bVar = new InterfaceC4369d7.b(a2);
                                    a(outputStream, (HttpURLConnection) str, bufferedReader);
                                    return bVar;
                                }
                                InterfaceC4369d7.a.c cVar = new InterfaceC4369d7.a.c();
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return cVar;
                            } catch (Exception e4) {
                                e3 = e4;
                                C4491k4.d().a(e3);
                                IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                                InterfaceC4369d7.a.C1323a c1323a = new InterfaceC4369d7.a.C1323a(e3);
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return c1323a;
                            }
                        }
                        InterfaceC4369d7.a.b bVar2 = new InterfaceC4369d7.a.b(responseCode, str.getResponseMessage());
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                        return bVar2;
                    } catch (Exception e5) {
                        e2 = e5;
                        e3 = e2;
                        bufferedReader = null;
                        C4491k4.d().a(e3);
                        IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                        InterfaceC4369d7.a.C1323a c1323a2 = new InterfaceC4369d7.a.C1323a(e3);
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return c1323a2;
                    } catch (Throwable th) {
                        th = th;
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) r1);
                        throw th;
                    }
                } catch (Exception e6) {
                    e2 = e6;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                r1 = str2;
                th = th3;
            }
        } catch (Exception e7) {
            e2 = e7;
            str = 0;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                C4491k4.d().a(e2);
                IronLog.INTERNAL.error("exception while closing output stream " + e2.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                C4491k4.d().a(e3);
                IronLog.INTERNAL.error("exception while closing reader " + e3.getMessage());
            }
        }
    }
}
