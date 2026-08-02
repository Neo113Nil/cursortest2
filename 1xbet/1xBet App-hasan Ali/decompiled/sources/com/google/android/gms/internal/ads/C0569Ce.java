package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.google.android.gms.internal.ads.Ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569Ce extends Lt implements JA {

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f8022D = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: E, reason: collision with root package name */
    public static final AtomicReference f8023E = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public long f8024A;

    /* renamed from: B, reason: collision with root package name */
    public int f8025B;

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f8026C;

    /* renamed from: o, reason: collision with root package name */
    public final C0561Be f8027o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8028p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8029q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8030r;

    /* renamed from: s, reason: collision with root package name */
    public final Er f8031s;

    /* renamed from: t, reason: collision with root package name */
    public HttpURLConnection f8032t;

    /* renamed from: u, reason: collision with root package name */
    public InputStream f8033u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8034v;

    /* renamed from: w, reason: collision with root package name */
    public int f8035w;

    /* renamed from: x, reason: collision with root package name */
    public long f8036x;

    /* renamed from: y, reason: collision with root package name */
    public long f8037y;

    /* renamed from: z, reason: collision with root package name */
    public long f8038z;

    public C0569Ce(String str, C0614Ie c0614Ie, int i, int i5, int i6) {
        super(true);
        this.f8027o = new C0561Be(this);
        this.f8026C = new HashSet();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f8030r = str;
        this.f8031s = new Er(4);
        this.f8028p = i;
        this.f8029q = i5;
        this.f8025B = i6;
        if (c0614Ie != null) {
            d(c0614Ie);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021a A[Catch: IOException -> 0x0033, TryCatch #2 {IOException -> 0x0033, blocks: (B:3:0x000d, B:4:0x001a, B:6:0x0020, B:8:0x002a, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:19:0x0085, B:21:0x009f, B:22:0x00b1, B:23:0x00b6, B:37:0x00eb, B:94:0x020f, B:96:0x021a, B:98:0x022b, B:104:0x0234, B:105:0x0243, B:108:0x024b, B:109:0x0252, B:113:0x0253, B:114:0x0269), top: B:2:0x000d }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(Ww ww) {
        long j5;
        long j6;
        int responseCode;
        String headerField;
        int responseCode2;
        long parseLong;
        String headerField2;
        long j7 = 0;
        this.f8024A = 0L;
        this.f8038z = 0L;
        try {
            URL url = new URL(ww.f12125a.toString());
            int i = 0;
            while (true) {
                int i5 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i5);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f8027o);
                }
                httpURLConnection.setConnectTimeout(this.f8028p);
                httpURLConnection.setReadTimeout(this.f8029q);
                for (Map.Entry entry : this.f8031s.q().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                long j8 = ww.f12127c;
                long j9 = j7;
                long j10 = ww.f12128d;
                if (j8 != j7) {
                    j5 = -1;
                    j6 = j8;
                } else if (j10 != -1) {
                    j5 = -1;
                    j6 = j9;
                } else {
                    j5 = -1;
                    httpURLConnection.setRequestProperty("User-Agent", this.f8030r);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f8032t = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f8035w = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f8032t.getHeaderFields();
                                l();
                                int i6 = this.f8035w;
                                int i7 = AbstractC1260lo.f14419a;
                                C0792bA c0792bA = new C0792bA(i6, null);
                                if (this.f8035w == 416) {
                                    throw c0792bA;
                                }
                                c0792bA.initCause(new C1806xv());
                                throw c0792bA;
                            }
                            if (responseCode2 != 200 || j8 == j7) {
                                j8 = j9;
                            }
                            this.f8036x = j8;
                            if (j10 != j5) {
                                this.f8037y = j10;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f8032t;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        U2.j.f("Unexpected Content-Length [" + headerField3 + "]");
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f8022D.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < j9) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    U2.j.i("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                U2.j.f("Unexpected Content-Range [" + headerField2 + "]");
                                            }
                                        }
                                    }
                                    this.f8037y = parseLong == j5 ? parseLong - this.f8036x : j5;
                                }
                                parseLong = j5;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f8037y = parseLong == j5 ? parseLong - this.f8036x : j5;
                            }
                            try {
                                this.f8033u = this.f8032t.getInputStream();
                                this.f8034v = true;
                                k(ww);
                                return this.f8037y;
                            } catch (IOException e3) {
                                l();
                                throw new Cz(2000, 1, e3);
                            }
                        } catch (IOException e5) {
                            l();
                            throw new Cz("Unable to connect to ".concat(String.valueOf(ww.f12125a.toString())), e5, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i5;
                    j7 = j9;
                }
                String str = "bytes=" + j6 + "-";
                if (j10 != j5) {
                    str = str + (j6 + j10 + j5);
                }
                httpURLConnection.setRequestProperty("Range", str);
                httpURLConnection.setRequestProperty("User-Agent", this.f8030r);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f8032t = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f8035w = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f8032t.getHeaderFields();
                    l();
                    int i62 = this.f8035w;
                    int i72 = AbstractC1260lo.f14419a;
                    C0792bA c0792bA2 = new C0792bA(i62, null);
                    if (this.f8035w == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e6) {
            throw new Cz("Unable to connect to ".concat(String.valueOf(ww.f12125a.toString())), e6, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lt, com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        HttpURLConnection httpURLConnection = this.f8032t;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        try {
            if (this.f8038z != this.f8036x) {
                AtomicReference atomicReference = f8023E;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j5 = this.f8038z;
                    long j6 = this.f8036x;
                    if (j5 == j6) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.f8033u.read(bArr2, 0, (int) Math.min(j6 - j5, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f8038z += read;
                    B(read);
                }
            }
            if (i5 == 0) {
                return 0;
            }
            long j7 = this.f8037y;
            if (j7 != -1) {
                long j8 = j7 - this.f8024A;
                if (j8 == 0) {
                    return -1;
                }
                i5 = (int) Math.min(i5, j8);
            }
            int read2 = this.f8033u.read(bArr, i, i5);
            if (read2 == -1) {
                if (this.f8037y != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.f8024A += read2;
            B(read2);
            return read2;
        } catch (IOException e3) {
            throw new Cz(2000, 2, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f8032t;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        HashSet hashSet = this.f8026C;
        try {
            InputStream inputStream = this.f8033u;
            if (inputStream != null) {
                int i = AbstractC1260lo.f14419a;
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    throw new Cz(2000, 3, e3);
                }
            }
        } finally {
            this.f8033u = null;
            l();
            if (this.f8034v) {
                this.f8034v = false;
                f();
            }
            hashSet.clear();
        }
    }

    public final void l() {
        HttpURLConnection httpURLConnection = this.f8032t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                U2.j.g("Unexpected error while disconnecting", e3);
            }
            this.f8032t = null;
        }
    }
}
