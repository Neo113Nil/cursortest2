package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class EE {

    /* renamed from: t, reason: collision with root package name */
    public static final C1603tG f8475t = new C1603tG(new Object(), -1);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0715Xa f8476a;

    /* renamed from: b, reason: collision with root package name */
    public final C1603tG f8477b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8478c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8479d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8480e;
    public final XD f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8481g;

    /* renamed from: h, reason: collision with root package name */
    public final TG f8482h;
    public final C1245lH i;

    /* renamed from: j, reason: collision with root package name */
    public final List f8483j;

    /* renamed from: k, reason: collision with root package name */
    public final C1603tG f8484k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8485l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8486m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8487n;

    /* renamed from: o, reason: collision with root package name */
    public final Y7 f8488o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f8489p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f8490q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f8491r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f8492s;

    public EE(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG, long j5, long j6, int i, XD xd, boolean z3, TG tg, C1245lH c1245lH, List list, C1603tG c1603tG2, boolean z5, int i5, int i6, Y7 y7, long j7, long j8, long j9, long j10) {
        this.f8476a = abstractC0715Xa;
        this.f8477b = c1603tG;
        this.f8478c = j5;
        this.f8479d = j6;
        this.f8480e = i;
        this.f = xd;
        this.f8481g = z3;
        this.f8482h = tg;
        this.i = c1245lH;
        this.f8483j = list;
        this.f8484k = c1603tG2;
        this.f8485l = z5;
        this.f8486m = i5;
        this.f8487n = i6;
        this.f8488o = y7;
        this.f8489p = j7;
        this.f8490q = j8;
        this.f8491r = j9;
        this.f8492s = j10;
    }

    public static EE g(C1245lH c1245lH) {
        C1291ma c1291ma = AbstractC0715Xa.f12197a;
        C1603tG c1603tG = f8475t;
        return new EE(c1291ma, c1603tG, -9223372036854775807L, 0L, 1, null, false, TG.f11645d, c1245lH, C1761wv.f16184o, c1603tG, false, 1, 0, Y7.f12279d, 0L, 0L, 0L, 0L);
    }

    public final EE a(C1603tG c1603tG) {
        return new EE(this.f8476a, this.f8477b, this.f8478c, this.f8479d, this.f8480e, this.f, this.f8481g, this.f8482h, this.i, this.f8483j, c1603tG, this.f8485l, this.f8486m, this.f8487n, this.f8488o, this.f8489p, this.f8490q, this.f8491r, this.f8492s);
    }

    public final EE b(C1603tG c1603tG, long j5, long j6, long j7, long j8, TG tg, C1245lH c1245lH, List list) {
        C1603tG c1603tG2 = this.f8484k;
        boolean z3 = this.f8485l;
        int i = this.f8486m;
        int i5 = this.f8487n;
        Y7 y7 = this.f8488o;
        long j9 = this.f8489p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new EE(this.f8476a, c1603tG, j6, j7, this.f8480e, this.f, this.f8481g, tg, c1245lH, list, c1603tG2, z3, i, i5, y7, j9, j8, j5, elapsedRealtime);
    }

    public final EE c(int i, int i5, boolean z3) {
        return new EE(this.f8476a, this.f8477b, this.f8478c, this.f8479d, this.f8480e, this.f, this.f8481g, this.f8482h, this.i, this.f8483j, this.f8484k, z3, i, i5, this.f8488o, this.f8489p, this.f8490q, this.f8491r, this.f8492s);
    }

    public final EE d(XD xd) {
        return new EE(this.f8476a, this.f8477b, this.f8478c, this.f8479d, this.f8480e, xd, this.f8481g, this.f8482h, this.i, this.f8483j, this.f8484k, this.f8485l, this.f8486m, this.f8487n, this.f8488o, this.f8489p, this.f8490q, this.f8491r, this.f8492s);
    }

    public final EE e(int i) {
        return new EE(this.f8476a, this.f8477b, this.f8478c, this.f8479d, i, this.f, this.f8481g, this.f8482h, this.i, this.f8483j, this.f8484k, this.f8485l, this.f8486m, this.f8487n, this.f8488o, this.f8489p, this.f8490q, this.f8491r, this.f8492s);
    }

    public final EE f(AbstractC0715Xa abstractC0715Xa) {
        return new EE(abstractC0715Xa, this.f8477b, this.f8478c, this.f8479d, this.f8480e, this.f, this.f8481g, this.f8482h, this.i, this.f8483j, this.f8484k, this.f8485l, this.f8486m, this.f8487n, this.f8488o, this.f8489p, this.f8490q, this.f8491r, this.f8492s);
    }

    public final boolean h() {
        return this.f8480e == 3 && this.f8485l && this.f8487n == 0;
    }
}
