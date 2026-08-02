package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class Dy extends Lt implements JA {

    /* renamed from: A, reason: collision with root package name */
    public long f8431A;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8432o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8433p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8434q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8435r;

    /* renamed from: s, reason: collision with root package name */
    public final Er f8436s;

    /* renamed from: t, reason: collision with root package name */
    public final Er f8437t;

    /* renamed from: u, reason: collision with root package name */
    public Ww f8438u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f8439v;

    /* renamed from: w, reason: collision with root package name */
    public InputStream f8440w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8441x;

    /* renamed from: y, reason: collision with root package name */
    public int f8442y;

    /* renamed from: z, reason: collision with root package name */
    public long f8443z;

    public /* synthetic */ Dy(String str, int i, int i5, boolean z3, Er er) {
        super(true);
        this.f8435r = str;
        this.f8433p = i;
        this.f8434q = i5;
        this.f8432o = z3;
        this.f8436s = er;
        this.f8437t = new Er(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018b A[Catch: IOException -> 0x0196, TRY_LEAVE, TryCatch #1 {IOException -> 0x0196, blocks: (B:24:0x0183, B:26:0x018b), top: B:23:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(Ww ww) {
        URL url;
        long j5;
        long j6;
        boolean z3;
        Dy dy;
        HttpURLConnection httpURLConnection;
        boolean z5;
        long parseLong;
        long j7;
        long parseLong2;
        long j8;
        long j9;
        String group;
        Dy dy2 = this;
        int i = 1;
        dy2.f8438u = ww;
        long j10 = 0;
        dy2.f8431A = 0L;
        dy2.f8443z = 0L;
        g(ww);
        try {
            url = new URL(ww.f12125a.toString());
            j5 = ww.f12127c;
            j6 = ww.f12128d;
            z3 = false;
        } catch (IOException e3) {
            e = e3;
        }
        try {
            if (dy2.f8432o) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 > 20) {
                        throw new Cz(2001, 1, new NoRouteToHostException("Too many redirects: " + i6));
                    }
                    dy = this;
                    HttpURLConnection l5 = dy.l(url, j5, j6, z3, false, ww.f12126b);
                    int responseCode = l5.getResponseCode();
                    String headerField = l5.getHeaderField("Location");
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnection = l5;
                        break;
                    }
                    long j11 = j10;
                    l5.disconnect();
                    url = dy.m(url, headerField);
                    i5 = i6;
                    j10 = j11;
                    z3 = false;
                    i = 1;
                }
            } else {
                httpURLConnection = dy2.l(url, j5, j6, false, true, ww.f12126b);
                dy = this;
            }
            dy.f8439v = httpURLConnection;
            dy.f8442y = httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            int i7 = dy.f8442y;
            long j12 = ww.f12127c;
            long j13 = ww.f12128d;
            if (i7 < 200 || i7 > 299) {
                long j14 = j10;
                httpURLConnection.getHeaderFields();
                if (dy.f8442y == 416) {
                    String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC0793bB.f12774a;
                    if (!TextUtils.isEmpty(headerField2)) {
                        Matcher matcher = AbstractC0793bB.f12775b.matcher(headerField2);
                        if (matcher.matches()) {
                            z5 = true;
                            String group2 = matcher.group(1);
                            group2.getClass();
                            parseLong = Long.parseLong(group2);
                            if (j12 == parseLong) {
                                dy.f8441x = z5;
                                k(ww);
                                return j13 != -1 ? j13 : j14;
                            }
                        }
                    }
                    z5 = true;
                    parseLong = -1;
                    if (j12 == parseLong) {
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        Sv.a(errorStream);
                    } else {
                        int i8 = AbstractC1260lo.f14419a;
                    }
                } catch (IOException unused) {
                    int i9 = AbstractC1260lo.f14419a;
                }
                dy.n();
                throw new C0792bA(dy.f8442y, dy.f8442y == 416 ? new C1806xv() : null);
            }
            httpURLConnection.getContentType();
            if (dy.f8442y != 200 || j12 == j10) {
                j12 = j10;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                j7 = j10;
                dy.f8443z = j13;
            } else if (j13 != -1) {
                dy.f8443z = j13;
                j7 = j10;
            } else {
                ?? headerField3 = httpURLConnection.getHeaderField("Content-Length");
                String headerField4 = httpURLConnection.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC0793bB.f12774a;
                if (TextUtils.isEmpty(headerField3)) {
                    j7 = j10;
                } else {
                    try {
                        j7 = j10;
                        parseLong2 = Long.parseLong(headerField3);
                    } catch (NumberFormatException unused2) {
                        j7 = j10;
                        JB.f("HttpUtil", "Unexpected Content-Length [" + ((String) headerField3) + "]");
                    }
                    if (!TextUtils.isEmpty(headerField4)) {
                        Matcher matcher2 = AbstractC0793bB.f12774a.matcher(headerField4);
                        if (matcher2.matches()) {
                            try {
                                group = matcher2.group(2);
                            } catch (NumberFormatException unused3) {
                                headerField3 = parseLong2;
                            }
                            if (group == null) {
                                throw null;
                            }
                            long parseLong3 = Long.parseLong(group);
                            String group3 = matcher2.group(i);
                            if (group3 == null) {
                                throw null;
                            }
                            long j15 = parseLong2;
                            long parseLong4 = (parseLong3 - Long.parseLong(group3)) + 1;
                            if (parseLong2 < j7) {
                                j9 = parseLong4;
                            } else if (j15 != parseLong4) {
                                try {
                                    JB.l("HttpUtil", "Inconsistent headers [" + ((String) headerField3) + "] [" + headerField4 + "]");
                                    j9 = Math.max(j15, parseLong4);
                                } catch (NumberFormatException unused4) {
                                    headerField3 = j15;
                                    JB.f("HttpUtil", "Unexpected Content-Range [" + headerField4 + "]");
                                    j8 = headerField3;
                                    j9 = j8;
                                    dy.f8443z = j9 == -1 ? j9 - j12 : -1L;
                                    dy.f8440w = httpURLConnection.getInputStream();
                                    if (equalsIgnoreCase) {
                                    }
                                    dy.f8441x = true;
                                    k(ww);
                                    if (j12 != j7) {
                                    }
                                    return dy.f8443z;
                                }
                            } else {
                                j8 = j15;
                                j9 = j8;
                            }
                            dy.f8443z = j9 == -1 ? j9 - j12 : -1L;
                        }
                    }
                    j8 = parseLong2;
                    j9 = j8;
                    dy.f8443z = j9 == -1 ? j9 - j12 : -1L;
                }
                parseLong2 = -1;
                if (!TextUtils.isEmpty(headerField4)) {
                }
                j8 = parseLong2;
                j9 = j8;
                dy.f8443z = j9 == -1 ? j9 - j12 : -1L;
            }
            try {
                dy.f8440w = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    dy.f8440w = new GZIPInputStream(dy.f8440w);
                }
                dy.f8441x = true;
                k(ww);
                if (j12 != j7) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (j12 > j7) {
                            int min = (int) Math.min(j12, 4096L);
                            InputStream inputStream = dy.f8440w;
                            int i10 = AbstractC1260lo.f14419a;
                            int read = inputStream.read(bArr, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new Cz(2000, 1, new InterruptedIOException());
                            }
                            if (read == -1) {
                                throw new Cz();
                            }
                            j12 -= read;
                            dy.B(read);
                        }
                    } catch (IOException e5) {
                        dy.n();
                        if (e5 instanceof Cz) {
                            throw ((Cz) e5);
                        }
                        throw new Cz(2000, 1, e5);
                    }
                }
                return dy.f8443z;
            } catch (IOException e6) {
                dy.n();
                throw new Cz(2000, 1, e6);
            }
        } catch (IOException e7) {
            e = e7;
            dy2 = this;
            dy2.n();
            throw Cz.a(1, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lt, com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        HttpURLConnection httpURLConnection = this.f8439v;
        return httpURLConnection == null ? Cv.f8103q : new C1270ly(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j5 = this.f8443z;
            if (j5 != -1) {
                long j6 = j5 - this.f8431A;
                if (j6 == 0) {
                    return -1;
                }
                i5 = (int) Math.min(i5, j6);
            }
            InputStream inputStream = this.f8440w;
            int i6 = AbstractC1260lo.f14419a;
            int read = inputStream.read(bArr, i, i5);
            if (read != -1) {
                this.f8431A += read;
                B(read);
                return read;
            }
            return -1;
        } catch (IOException e3) {
            int i7 = AbstractC1260lo.f14419a;
            throw Cz.a(2, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f8439v;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        Ww ww = this.f8438u;
        if (ww != null) {
            return ww.f12125a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        try {
            InputStream inputStream = this.f8440w;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    int i = AbstractC1260lo.f14419a;
                    throw new Cz(2000, 3, e3);
                }
            }
        } finally {
            this.f8440w = null;
            n();
            if (this.f8441x) {
                this.f8441x = false;
                f();
            }
            this.f8439v = null;
            this.f8438u = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection l(URL url, long j5, long j6, boolean z3, boolean z5, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f8433p);
        httpURLConnection.setReadTimeout(this.f8434q);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f8436s.q());
        hashMap.putAll(this.f8437t.q());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j5 == 0) {
            if (j6 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.f8435r;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z3 ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z5);
                httpURLConnection.setDoOutput(false);
                int i = Ww.f;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j5 = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j5);
        sb2.append("-");
        if (j6 != -1) {
            sb2.append((j5 + j6) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.f8435r;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z3 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z5);
        httpURLConnection.setDoOutput(false);
        int i5 = Ww.f;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL m(URL url, String str) {
        if (str == null) {
            throw new Cz(2001, 1, "Null location redirect");
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new Cz(2001, 1, "Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
            }
            if (this.f8432o || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new Cz(2001, 1, "Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")");
        } catch (MalformedURLException e3) {
            throw new Cz(2001, 1, e3);
        }
    }

    public final void n() {
        HttpURLConnection httpURLConnection = this.f8439v;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                JB.g("DefaultHttpDataSource", "Unexpected error while disconnecting", e3);
            }
        }
    }
}
