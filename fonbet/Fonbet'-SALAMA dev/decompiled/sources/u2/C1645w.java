package u2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import d6.C0979m;
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
import v2.AbstractC1664a;

/* renamed from: u2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645w extends AbstractC1630g {

    /* renamed from: A, reason: collision with root package name */
    public final com.google.android.gms.common.internal.w f16854A;

    /* renamed from: B, reason: collision with root package name */
    public HttpURLConnection f16855B;

    /* renamed from: C, reason: collision with root package name */
    public InputStream f16856C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16857D;

    /* renamed from: E, reason: collision with root package name */
    public int f16858E;

    /* renamed from: F, reason: collision with root package name */
    public long f16859F;

    /* renamed from: G, reason: collision with root package name */
    public long f16860G;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16861e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16862f;

    /* renamed from: x, reason: collision with root package name */
    public final int f16863x;

    /* renamed from: y, reason: collision with root package name */
    public final String f16864y;

    /* renamed from: z, reason: collision with root package name */
    public final com.google.android.gms.common.internal.w f16865z;

    public C1645w(String str, int i7, int i8, boolean z4, com.google.android.gms.common.internal.w wVar) {
        super(true);
        this.f16864y = str;
        this.f16862f = i7;
        this.f16863x = i8;
        this.f16861e = z4;
        this.f16865z = wVar;
        this.f16854A = new com.google.android.gms.common.internal.w(20);
    }

    public static void r(HttpURLConnection httpURLConnection, long j) {
        int i7;
        if (httpURLConnection == null || (i7 = v2.t.f17153a) < 19 || i7 > 20) {
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

    @Override // u2.InterfaceC1636m
    public final void close() {
        try {
            InputStream inputStream = this.f16856C;
            if (inputStream != null) {
                long j = this.f16859F;
                long j3 = -1;
                if (j != -1) {
                    j3 = j - this.f16860G;
                }
                r(this.f16855B, j3);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i7 = v2.t.f17153a;
                    throw new C1622B(e7, 2000, 3);
                }
            }
        } finally {
            this.f16856C = null;
            i();
            if (this.f16857D) {
                this.f16857D = false;
                e();
            }
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.f16855B;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                AbstractC1664a.l("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f16855B = null;
        }
    }

    @Override // u2.InterfaceC1636m
    public final Map k() {
        HttpURLConnection httpURLConnection = this.f16855B;
        return httpURLConnection == null ? E3.Q.f2012x : new C0979m(httpURLConnection.getHeaderFields());
    }

    public final URL l(URL url, String str) {
        if (str == null) {
            throw new C1622B("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C1622B(w1.L.i("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f16861e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C1622B("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e7) {
            throw new C1622B(e7, 2001, 1);
        }
    }

    public final HttpURLConnection m(URL url, int i7, byte[] bArr, long j, long j3, boolean z4, boolean z7, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f16862f);
        httpURLConnection.setReadTimeout(this.f16863x);
        HashMap hashMap = new HashMap();
        com.google.android.gms.common.internal.w wVar = this.f16865z;
        if (wVar != null) {
            hashMap.putAll(wVar.F());
        }
        hashMap.putAll(this.f16854A.F());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = E.f16710a;
        if (j == 0 && j3 == -1) {
            sb = null;
        } else {
            StringBuilder j7 = e1.k.j("bytes=", "-", j);
            if (j3 != -1) {
                j7.append((j + j3) - 1);
            }
            sb = j7.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str2 = this.f16864y;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setDoOutput(bArr != null);
        int i8 = C1640q.f16807i;
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection n(C1640q c1640q) {
        C1640q c1640q2 = c1640q;
        URL url = new URL(c1640q2.f16808a.toString());
        int i7 = 0;
        boolean z4 = (c1640q2.f16815h & 1) == 1;
        boolean z7 = this.f16861e;
        int i8 = c1640q2.f16809b;
        byte[] bArr = c1640q2.f16810c;
        long j = c1640q2.f16812e;
        long j3 = c1640q2.f16813f;
        if (!z7) {
            return m(url, i8, bArr, j, j3, z4, true, c1640q2.f16811d);
        }
        URL url2 = url;
        int i9 = i8;
        byte[] bArr2 = bArr;
        while (true) {
            int i10 = i7 + 1;
            if (i7 > 20) {
                throw new C1622B(new NoRouteToHostException(e1.k.d(i10, "Too many redirects: ")), 2001, 1);
            }
            Map map = c1640q2.f16811d;
            long j7 = j3;
            int i11 = i9;
            long j8 = j;
            HttpURLConnection m7 = m(url2, i9, bArr2, j, j3, z4, false, map);
            int responseCode = m7.getResponseCode();
            String headerField = m7.getHeaderField("Location");
            if ((i11 == 1 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                m7.disconnect();
                url2 = l(url2, headerField);
                i9 = i11;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                m7.disconnect();
                url2 = l(url2, headerField);
                bArr2 = null;
                i9 = 1;
            }
            c1640q2 = c1640q;
            i7 = i10;
            j3 = j7;
            j = j8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130 A[Catch: IOException -> 0x013b, TRY_LEAVE, TryCatch #6 {IOException -> 0x013b, blocks: (B:19:0x0128, B:21:0x0130), top: B:18:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    @Override // u2.InterfaceC1636m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(C1640q c1640q) {
        HttpURLConnection httpURLConnection;
        boolean z4;
        long parseLong;
        HttpURLConnection httpURLConnection2;
        long j;
        long parseLong2;
        long j3;
        long j7;
        long parseLong3;
        this.f16860G = 0L;
        this.f16859F = 0L;
        f();
        try {
            HttpURLConnection n2 = n(c1640q);
            this.f16855B = n2;
            this.f16858E = n2.getResponseCode();
            n2.getResponseMessage();
            int i7 = this.f16858E;
            long j8 = c1640q.f16812e;
            long j9 = c1640q.f16813f;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = n2.getHeaderFields();
                if (this.f16858E == 416) {
                    httpURLConnection = n2;
                    String headerField = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = E.f16710a;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = E.f16711b.matcher(headerField);
                        if (matcher.matches()) {
                            z4 = true;
                            String group = matcher.group(1);
                            group.getClass();
                            parseLong = Long.parseLong(group);
                            if (j8 == parseLong) {
                                this.f16857D = z4;
                                g(c1640q);
                                if (j9 != -1) {
                                    return j9;
                                }
                                return 0L;
                            }
                        }
                    }
                    z4 = true;
                    parseLong = -1;
                    if (j8 == parseLong) {
                    }
                } else {
                    httpURLConnection = n2;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i8 = v2.t.f17153a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i9 = v2.t.f17153a;
                    }
                } catch (IOException unused) {
                    int i10 = v2.t.f17153a;
                }
                i();
                throw new D(this.f16858E, this.f16858E == 416 ? new C1637n(2008) : null, headerFields);
            }
            n2.getContentType();
            if (this.f16858E != 200 || j8 == 0) {
                j8 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(n2.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection2 = n2;
                j = j8;
                this.f16859F = j9;
            } else if (j9 != -1) {
                this.f16859F = j9;
                httpURLConnection2 = n2;
                j = j8;
            } else {
                String headerField2 = n2.getHeaderField("Content-Length");
                String headerField3 = n2.getHeaderField("Content-Range");
                Pattern pattern2 = E.f16710a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        parseLong2 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        Log.e("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = E.f16710a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong4 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection2 = n2;
                                parseLong3 = (parseLong4 - Long.parseLong(group3)) + 1;
                                j = j8;
                                j3 = parseLong2;
                            } catch (NumberFormatException unused3) {
                                httpURLConnection2 = n2;
                                j = j8;
                                j3 = parseLong2;
                            }
                            if (j3 < 0) {
                                j7 = parseLong3;
                            } else {
                                if (j3 != parseLong3) {
                                    try {
                                        Log.w("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j7 = Math.max(j3, parseLong3);
                                    } catch (NumberFormatException unused4) {
                                        Log.e("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        j7 = j3;
                                        this.f16859F = j7 == -1 ? j7 - j : -1L;
                                        this.f16856C = httpURLConnection2.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.f16857D = true;
                                        g(c1640q);
                                        try {
                                            s(j);
                                            return this.f16859F;
                                        } catch (IOException e7) {
                                            i();
                                            if (e7 instanceof C1622B) {
                                                throw ((C1622B) e7);
                                            }
                                            throw new C1622B(e7, 2000, 1);
                                        }
                                    }
                                }
                                j7 = j3;
                            }
                            this.f16859F = j7 == -1 ? j7 - j : -1L;
                        }
                    }
                    httpURLConnection2 = n2;
                    j = j8;
                    j3 = parseLong2;
                    j7 = j3;
                    this.f16859F = j7 == -1 ? j7 - j : -1L;
                }
                parseLong2 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection2 = n2;
                j = j8;
                j3 = parseLong2;
                j7 = j3;
                this.f16859F = j7 == -1 ? j7 - j : -1L;
            }
            try {
                this.f16856C = httpURLConnection2.getInputStream();
                if (equalsIgnoreCase) {
                    this.f16856C = new GZIPInputStream(this.f16856C);
                }
                this.f16857D = true;
                g(c1640q);
                s(j);
                return this.f16859F;
            } catch (IOException e8) {
                i();
                throw new C1622B(e8, 2000, 1);
            }
        } catch (IOException e9) {
            i();
            throw C1622B.b(e9, 1);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j = this.f16859F;
            if (j != -1) {
                long j3 = j - this.f16860G;
                if (j3 != 0) {
                    i8 = (int) Math.min(i8, j3);
                }
                return -1;
            }
            InputStream inputStream = this.f16856C;
            int i9 = v2.t.f17153a;
            int read = inputStream.read(bArr, i7, i8);
            if (read == -1) {
                return -1;
            }
            this.f16860G += read;
            b(read);
            return read;
        } catch (IOException e7) {
            int i10 = v2.t.f17153a;
            throw C1622B.b(e7, 2);
        }
    }

    public final void s(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.f16856C;
            int i7 = v2.t.f17153a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new C1622B(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new C1622B();
            }
            j -= read;
            b(read);
        }
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        HttpURLConnection httpURLConnection = this.f16855B;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
