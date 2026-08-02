package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.je, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160je implements InterfaceC1402ov {

    /* renamed from: k, reason: collision with root package name */
    public final Context f14112k;

    /* renamed from: l, reason: collision with root package name */
    public final Dy f14113l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14114m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14115n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14116o;

    /* renamed from: p, reason: collision with root package name */
    public InputStream f14117p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14118q;

    /* renamed from: r, reason: collision with root package name */
    public Uri f14119r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C1459q6 f14120s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14121t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14122u = false;

    /* renamed from: v, reason: collision with root package name */
    public Ww f14123v;

    public C1160je(Context context, Dy dy, String str, int i) {
        this.f14112k = context;
        this.f14113l = dy;
        this.f14114m = str;
        this.f14115n = i;
        new AtomicLong(-1L);
        this.f14116o = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        if (this.f14118q) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f14118q = true;
        Uri uri = ww.f12125a;
        this.f14119r = uri;
        this.f14123v = ww;
        this.f14120s = C1459q6.a(uri);
        A7 a7 = F7.h4;
        Q2.r rVar = Q2.r.f5053d;
        C1369o6 c1369o6 = null;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            if (this.f14120s != null) {
                this.f14120s.f15102r = ww.f12127c;
                C1459q6 c1459q6 = this.f14120s;
                String str = this.f14114m;
                c1459q6.f15103s = str != null ? str : "";
                this.f14120s.f15104t = this.f14115n;
                c1369o6 = P2.o.f4767B.i.f(this.f14120s);
            }
            if (c1369o6 != null && c1369o6.e()) {
                this.f14121t = c1369o6.g();
                this.f14122u = c1369o6.f();
                if (!f()) {
                    this.f14117p = c1369o6.b();
                    return -1L;
                }
            }
        } else if (this.f14120s != null) {
            this.f14120s.f15102r = ww.f12127c;
            C1459q6 c1459q62 = this.f14120s;
            String str2 = this.f14114m;
            c1459q62.f15103s = str2 != null ? str2 : "";
            this.f14120s.f15104t = this.f14115n;
            long longValue = (this.f14120s.f15101q ? (Long) rVar.f5056c.a(F7.f8846j4) : (Long) rVar.f5056c.a(F7.f8840i4)).longValue();
            P2.o.f4767B.f4776j.getClass();
            SystemClock.elapsedRealtime();
            C1548s6 p5 = C1543s1.p(this.f14112k, this.f14120s);
            try {
                try {
                    try {
                        C1683v6 c1683v6 = (C1683v6) p5.f10334k.get(longValue, TimeUnit.MILLISECONDS);
                        c1683v6.getClass();
                        this.f14121t = c1683v6.f15962c;
                        this.f14122u = c1683v6.f15964e;
                        if (!f()) {
                            this.f14117p = c1683v6.f15960a;
                        }
                    } catch (InterruptedException unused) {
                        p5.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    p5.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            P2.o.f4767B.f4776j.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f14120s != null) {
            Map map = ww.f12126b;
            long j5 = ww.f12127c;
            long j6 = ww.f12128d;
            int i = ww.f12129e;
            Uri parse = Uri.parse(this.f14120s.f15095k);
            if (parse == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            this.f14123v = new Ww(parse, map, j5, j6, i);
        }
        return this.f14113l.a(this.f14123v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final /* synthetic */ Map b() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void d(RB rb) {
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (!this.f14118q) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f14117p;
        return inputStream != null ? inputStream.read(bArr, i, i5) : this.f14113l.e(bArr, i, i5);
    }

    public final boolean f() {
        if (!this.f14116o) {
            return false;
        }
        A7 a7 = F7.f8852k4;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() || this.f14121t) {
            return ((Boolean) rVar.f5056c.a(F7.f8858l4)).booleanValue() && !this.f14122u;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f14119r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        if (!this.f14118q) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f14118q = false;
        this.f14119r = null;
        InputStream inputStream = this.f14117p;
        if (inputStream == null) {
            this.f14113l.j();
        } else {
            AbstractC2309b.c(inputStream);
            this.f14117p = null;
        }
    }
}
