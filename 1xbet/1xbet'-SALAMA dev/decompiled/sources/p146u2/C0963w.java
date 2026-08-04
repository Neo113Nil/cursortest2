package p146u2;

import E3.Q;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p028d6.m;
import p031e1.k;
import p151v2.a;
import p151v2.t;
import p155w1.L;

/* JADX INFO: renamed from: u2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963w extends AbstractC0948g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final w f16860A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HttpURLConnection f16861B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InputStream f16862C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f16863D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f16864E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f16865F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f16866G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16868f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f16870y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final w f16871z;

    public C0963w(String str, int i7, int i8, boolean z4, w wVar) {
        super(true);
        this.f16870y = str;
        this.f16868f = i7;
        this.f16869x = i8;
        this.f16867e = z4;
        this.f16871z = wVar;
        this.f16860A = new w(20);
    }

    public static void r(HttpURLConnection httpURLConnection, long j) {
        int i7;
        if (httpURLConnection == null || (i7 = t.f17159a) < 19 || i7 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        try {
            InputStream inputStream = this.f16862C;
            if (inputStream != null) {
                long j = this.f16865F;
                long j3 = -1;
                if (j != -1) {
                    j3 = j - this.f16866G;
                }
                r(this.f16861B, j3);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i7 = t.f17159a;
                    throw new B(e7, 2000, 3);
                }
            }
            this.f16862C = null;
            i();
            if (this.f16863D) {
                this.f16863D = false;
                e();
            }
        } catch (Throwable th) {
            this.f16862C = null;
            i();
            if (this.f16863D) {
                this.f16863D = false;
                e();
            }
            throw th;
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.f16861B;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                a.l("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f16861B = null;
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final Map k() {
        HttpURLConnection httpURLConnection = this.f16861B;
        return httpURLConnection == null ? Q.f2012x : new m(httpURLConnection.getHeaderFields());
    }

    public final URL l(URL url, String str) throws B {
        if (str == null) {
            throw new B("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new B(L.i("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f16867e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new B("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e7) {
            throw new B(e7, 2001, 1);
        }
    }

    public final HttpURLConnection m(URL url, int i7, byte[] bArr, long j, long j3, boolean z4, boolean z7, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f16868f);
        httpURLConnection.setReadTimeout(this.f16869x);
        HashMap map2 = new HashMap();
        w wVar = this.f16871z;
        if (wVar != null) {
            map2.putAll(wVar.F());
        }
        map2.putAll(this.f16860A.F());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = E.f16716a;
        if (j == 0 && j3 == -1) {
            string = null;
        } else {
            StringBuilder sbJ = k.j("bytes=", "-", j);
            if (j3 != -1) {
                sbJ.append((j + j3) - 1);
            }
            string = sbJ.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f16870y;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setDoOutput(bArr != null);
        int i8 = C0958q.f16813i;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection n(C0958q c0958q) throws IOException {
        C0958q c0958q2 = c0958q;
        URL url = new URL(c0958q2.f16814a.toString());
        int i7 = 0;
        boolean z4 = (c0958q2.f16821h & 1) == 1;
        boolean z7 = this.f16867e;
        int i8 = c0958q2.f16815b;
        byte[] bArr = c0958q2.f16816c;
        long j = c0958q2.f16818e;
        long j3 = c0958q2.f16819f;
        if (!z7) {
            return m(url, i8, bArr, j, j3, z4, true, c0958q2.f16817d);
        }
        URL urlL = url;
        int i9 = i8;
        byte[] bArr2 = bArr;
        while (true) {
            int i10 = i7 + 1;
            if (i7 > 20) {
                throw new B(new NoRouteToHostException(k.d(i10, "Too many redirects: ")), 2001, 1);
            }
            Map map = c0958q2.f16817d;
            long j7 = j3;
            int i11 = i9;
            long j8 = j;
            HttpURLConnection httpURLConnectionM = m(urlL, i9, bArr2, j, j3, z4, false, map);
            int responseCode = httpURLConnectionM.getResponseCode();
            String headerField = httpURLConnectionM.getHeaderField("Location");
            if ((i11 == 1 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM.disconnect();
                urlL = l(urlL, headerField);
                i9 = i11;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM;
                }
                httpURLConnectionM.disconnect();
                urlL = l(urlL, headerField);
                bArr2 = null;
                i9 = 1;
            }
            c0958q2 = c0958q;
            i7 = i10;
            j3 = j7;
            j = j8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws B {
        HttpURLConnection httpURLConnection;
        boolean z4;
        long j;
        HttpURLConnection httpURLConnection2;
        long j3;
        long j7;
        long j8;
        long jMax;
        this.f16866G = 0L;
        this.f16865F = 0L;
        f();
        try {
            HttpURLConnection httpURLConnectionN = n(c0958q);
            this.f16861B = httpURLConnectionN;
            this.f16864E = httpURLConnectionN.getResponseCode();
            httpURLConnectionN.getResponseMessage();
            int i7 = this.f16864E;
            long j9 = c0958q.f16818e;
            long j10 = c0958q.f16819f;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionN.getHeaderFields();
                if (this.f16864E == 416) {
                    String headerField = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = E.f16716a;
                    if (TextUtils.isEmpty(headerField)) {
                        httpURLConnection = httpURLConnectionN;
                        httpURLConnection = httpURLConnectionN;
                        z4 = true;
                        j = -1;
                    } else {
                        Matcher matcher = E.f16717b.matcher(headerField);
                        if (matcher.matches()) {
                            httpURLConnection = httpURLConnectionN;
                            z4 = true;
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            httpURLConnection = httpURLConnectionN;
                            httpURLConnection = httpURLConnectionN;
                            z4 = true;
                            j = -1;
                        }
                    }
                    if (j9 == j) {
                        this.f16863D = z4;
                        g(c0958q);
                        if (j10 != -1) {
                            return j10;
                        }
                        return 0L;
                    }
                } else {
                    httpURLConnection = httpURLConnectionN;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i8 = t.f17159a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i9 = errorStream.read(bArr);
                            if (i9 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i9);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i10 = t.f17159a;
                    }
                } catch (IOException unused) {
                    int i11 = t.f17159a;
                }
                i();
                throw new D(this.f16864E, this.f16864E == 416 ? new C0955n(2008) : null, headerFields);
            }
            httpURLConnectionN.getContentType();
            if (this.f16864E != 200 || j9 == 0) {
                j9 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionN.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                httpURLConnection2 = httpURLConnectionN;
                j3 = j9;
                this.f16865F = j10;
            } else if (j10 != -1) {
                this.f16865F = j10;
                httpURLConnection2 = httpURLConnectionN;
                j3 = j9;
            } else {
                String headerField2 = httpURLConnectionN.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionN.getHeaderField("Content-Range");
                Pattern pattern2 = E.f16716a;
                if (TextUtils.isEmpty(headerField2)) {
                    j7 = -1;
                } else {
                    try {
                        j7 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        Log.e("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        j7 = -1;
                    }
                }
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection2 = httpURLConnectionN;
                    j3 = j9;
                    j8 = j7;
                    jMax = j8;
                } else {
                    Matcher matcher2 = E.f16716a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j11 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            httpURLConnection2 = httpURLConnectionN;
                            long j12 = (j11 - Long.parseLong(strGroup3)) + 1;
                            j3 = j9;
                            j8 = j7;
                            if (j8 < 0) {
                                jMax = j12;
                            } else if (j8 != j12) {
                                try {
                                    Log.w("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(j8, j12);
                                } catch (NumberFormatException unused3) {
                                    Log.e("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                    jMax = j8;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection2 = httpURLConnectionN;
                            j3 = j9;
                            j8 = j7;
                        }
                    } else {
                        httpURLConnection2 = httpURLConnectionN;
                        j3 = j9;
                        j8 = j7;
                    }
                    jMax = j8;
                }
                this.f16865F = jMax != -1 ? jMax - j3 : -1L;
            }
            try {
                this.f16862C = httpURLConnection2.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f16862C = new GZIPInputStream(this.f16862C);
                }
                this.f16863D = true;
                g(c0958q);
                try {
                    s(j3);
                    return this.f16865F;
                } catch (IOException e7) {
                    i();
                    if (e7 instanceof B) {
                        throw ((B) e7);
                    }
                    throw new B(e7, 2000, 1);
                }
            } catch (IOException e8) {
                i();
                throw new B(e8, 2000, 1);
            }
        } catch (IOException e9) {
            i();
            throw B.b(e9, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws B {
        int i9;
        if (i8 == 0) {
            return 0;
        }
        try {
            long j = this.f16865F;
            if (j != -1) {
                long j3 = j - this.f16866G;
                if (j3 != 0) {
                    i8 = (int) Math.min(i8, j3);
                    InputStream inputStream = this.f16862C;
                    int i10 = t.f17159a;
                    i9 = inputStream.read(bArr, i7, i8);
                    if (i9 == -1) {
                        this.f16866G += (long) i9;
                        b(i9);
                        return i9;
                    }
                }
            } else {
                InputStream inputStream2 = this.f16862C;
                int i11 = t.f17159a;
                i9 = inputStream2.read(bArr, i7, i8);
                if (i9 == -1) {
                    this.f16866G += (long) i9;
                    b(i9);
                    return i9;
                }
            }
            return -1;
        } catch (IOException e7) {
            int i12 = t.f17159a;
            throw B.b(e7, 2);
        }
    }

    public final void s(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f16862C;
            int i7 = t.f17159a;
            int i8 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new B(new InterruptedIOException(), 2000, 1);
            }
            if (i8 == -1) {
                throw new B();
            }
            j -= (long) i8;
            b(i8);
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        HttpURLConnection httpURLConnection = this.f16861B;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
