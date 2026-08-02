package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.Ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628Ke extends Lt implements JA {

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f10152F = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: A, reason: collision with root package name */
    public long f10153A;

    /* renamed from: B, reason: collision with root package name */
    public long f10154B;

    /* renamed from: C, reason: collision with root package name */
    public long f10155C;

    /* renamed from: D, reason: collision with root package name */
    public final long f10156D;

    /* renamed from: E, reason: collision with root package name */
    public final long f10157E;

    /* renamed from: o, reason: collision with root package name */
    public final int f10158o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10159p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10160q;

    /* renamed from: r, reason: collision with root package name */
    public final Er f10161r;

    /* renamed from: s, reason: collision with root package name */
    public Ww f10162s;

    /* renamed from: t, reason: collision with root package name */
    public HttpURLConnection f10163t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f10164u;

    /* renamed from: v, reason: collision with root package name */
    public InputStream f10165v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10166w;

    /* renamed from: x, reason: collision with root package name */
    public int f10167x;

    /* renamed from: y, reason: collision with root package name */
    public long f10168y;

    /* renamed from: z, reason: collision with root package name */
    public long f10169z;

    public C0628Ke(String str, C0614Ie c0614Ie, int i, int i5, long j5, long j6) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f10160q = str;
        this.f10161r = new Er(4);
        this.f10158o = i;
        this.f10159p = i5;
        this.f10164u = new ArrayDeque();
        this.f10156D = j5;
        this.f10157E = j6;
        if (c0614Ie != null) {
            d(c0614Ie);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        this.f10162s = ww;
        this.f10169z = 0L;
        long j5 = ww.f12127c;
        long j6 = ww.f12128d;
        long j7 = this.f10156D;
        if (j6 != -1) {
            j7 = Math.min(j7, j6);
        }
        this.f10153A = j5;
        HttpURLConnection l5 = l(1, j5, (j7 + j5) - 1);
        this.f10163t = l5;
        String headerField = l5.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f10152F.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j6 != -1) {
                        this.f10168y = j6;
                        this.f10154B = Math.max(parseLong, (this.f10153A + j6) - 1);
                    } else {
                        this.f10168y = parseLong2 - this.f10153A;
                        this.f10154B = parseLong2 - 1;
                    }
                    this.f10155C = parseLong;
                    this.f10166w = true;
                    k(ww);
                    return this.f10168y;
                } catch (NumberFormatException unused) {
                    U2.j.f("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new C0621Je(2000, 1, "Invalid content range: ".concat(String.valueOf(headerField)));
    }

    @Override // com.google.android.gms.internal.ads.Lt, com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        HttpURLConnection httpURLConnection = this.f10163t;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j5 = this.f10168y;
            long j6 = this.f10169z;
            if (j5 - j6 == 0) {
                return -1;
            }
            long j7 = this.f10153A + j6;
            long j8 = i5;
            long j9 = j7 + j8 + this.f10157E;
            long j10 = this.f10155C;
            long j11 = j10 + 1;
            if (j9 > j11) {
                long j12 = this.f10154B;
                if (j10 < j12) {
                    long min = Math.min(j12, Math.max(((this.f10156D + j11) - r4) - 1, (j11 + j8) - 1));
                    l(2, j11, min);
                    this.f10155C = min;
                    j10 = min;
                }
            }
            int read = this.f10165v.read(bArr, i, (int) Math.min(j8, ((j10 + 1) - this.f10153A) - this.f10169z));
            if (read == -1) {
                throw new EOFException();
            }
            this.f10169z += read;
            B(read);
            return read;
        } catch (IOException e3) {
            throw new Cz(2000, 2, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f10163t;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        try {
            InputStream inputStream = this.f10165v;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    throw new Cz(2000, 3, e3);
                }
            }
        } finally {
            this.f10165v = null;
            m();
            if (this.f10166w) {
                this.f10166w = false;
                f();
            }
        }
    }

    public final HttpURLConnection l(int i, long j5, long j6) {
        String uri = this.f10162s.f12125a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f10158o);
            httpURLConnection.setReadTimeout(this.f10159p);
            for (Map.Entry entry : this.f10161r.q().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j5 + "-" + j6);
            httpURLConnection.setRequestProperty("User-Agent", this.f10160q);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f10164u.add(httpURLConnection);
            String uri2 = this.f10162s.f12125a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f10167x = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    m();
                    throw new C0621Je(2000, i, AbstractC2107A.q("Response code: ", this.f10167x));
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f10165v != null) {
                        inputStream = new SequenceInputStream(this.f10165v, inputStream);
                    }
                    this.f10165v = inputStream;
                    return httpURLConnection;
                } catch (IOException e3) {
                    m();
                    throw new Cz(2000, i, e3);
                }
            } catch (IOException e5) {
                m();
                throw new Cz("Unable to connect to ".concat(String.valueOf(uri2)), e5, 2000, i);
            }
        } catch (IOException e6) {
            throw new Cz("Unable to connect to ".concat(String.valueOf(uri)), e6, 2000, i);
        }
    }

    public final void m() {
        while (true) {
            ArrayDeque arrayDeque = this.f10164u;
            if (arrayDeque.isEmpty()) {
                this.f10163t = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e3) {
                    U2.j.g("Unexpected error while disconnecting", e3);
                }
            }
        }
    }
}
