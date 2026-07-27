package B0;

import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import s0.C1416d;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f173a;

    /* renamed from: b, reason: collision with root package name */
    public int f174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f175c;

    /* renamed from: d, reason: collision with root package name */
    public String f176d;

    /* renamed from: e, reason: collision with root package name */
    public s0.g f177e;

    /* renamed from: f, reason: collision with root package name */
    public final s0.g f178f;

    /* renamed from: g, reason: collision with root package name */
    public long f179g;

    /* renamed from: h, reason: collision with root package name */
    public final long f180h;

    /* renamed from: i, reason: collision with root package name */
    public final long f181i;

    /* renamed from: j, reason: collision with root package name */
    public C1416d f182j;

    /* renamed from: k, reason: collision with root package name */
    public final int f183k;

    /* renamed from: l, reason: collision with root package name */
    public final int f184l;

    /* renamed from: m, reason: collision with root package name */
    public final long f185m;

    /* renamed from: n, reason: collision with root package name */
    public long f186n;

    /* renamed from: o, reason: collision with root package name */
    public final long f187o;

    /* renamed from: p, reason: collision with root package name */
    public final long f188p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f189q;

    /* renamed from: r, reason: collision with root package name */
    public final int f190r;

    /* renamed from: s, reason: collision with root package name */
    public final int f191s;

    /* renamed from: t, reason: collision with root package name */
    public final int f192t;

    static {
        kotlin.jvm.internal.i.d(s0.s.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public q(String id, int i2, String workerClassName, String str, s0.g input, s0.g output, long j2, long j6, long j7, C1416d constraints, int i3, int i6, long j8, long j9, long j10, long j11, boolean z, int i7, int i8, int i9) {
        kotlin.jvm.internal.i.e(id, "id");
        AbstractC0279e.k(i2, "state");
        kotlin.jvm.internal.i.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(output, "output");
        kotlin.jvm.internal.i.e(constraints, "constraints");
        AbstractC0279e.k(i6, "backoffPolicy");
        AbstractC0279e.k(i7, "outOfQuotaPolicy");
        this.f173a = id;
        this.f174b = i2;
        this.f175c = workerClassName;
        this.f176d = str;
        this.f177e = input;
        this.f178f = output;
        this.f179g = j2;
        this.f180h = j6;
        this.f181i = j7;
        this.f182j = constraints;
        this.f183k = i3;
        this.f184l = i6;
        this.f185m = j8;
        this.f186n = j9;
        this.f187o = j10;
        this.f188p = j11;
        this.f189q = z;
        this.f190r = i7;
        this.f191s = i8;
        this.f192t = i9;
    }

    public final long a() {
        int i2;
        if (this.f174b == 1 && (i2 = this.f183k) > 0) {
            long j2 = this.f185m;
            long scalb = this.f184l == 2 ? j2 * i2 : (long) Math.scalb(j2, i2 - 1);
            long j6 = this.f186n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return scalb + j6;
        }
        if (!c()) {
            long j7 = this.f186n;
            if (j7 == 0) {
                j7 = System.currentTimeMillis();
            }
            return j7 + this.f179g;
        }
        int i3 = this.f191s;
        long j8 = this.f186n;
        if (i3 == 0) {
            j8 += this.f179g;
        }
        long j9 = this.f181i;
        long j10 = this.f180h;
        if (j9 != j10) {
            r1 = i3 == 0 ? (-1) * j9 : 0L;
            j8 += j10;
        } else if (i3 != 0) {
            r1 = j10;
        }
        return j8 + r1;
    }

    public final boolean b() {
        return !kotlin.jvm.internal.i.a(C1416d.f11761i, this.f182j);
    }

    public final boolean c() {
        return this.f180h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.i.a(this.f173a, qVar.f173a) && this.f174b == qVar.f174b && kotlin.jvm.internal.i.a(this.f175c, qVar.f175c) && kotlin.jvm.internal.i.a(this.f176d, qVar.f176d) && kotlin.jvm.internal.i.a(this.f177e, qVar.f177e) && kotlin.jvm.internal.i.a(this.f178f, qVar.f178f) && this.f179g == qVar.f179g && this.f180h == qVar.f180h && this.f181i == qVar.f181i && kotlin.jvm.internal.i.a(this.f182j, qVar.f182j) && this.f183k == qVar.f183k && this.f184l == qVar.f184l && this.f185m == qVar.f185m && this.f186n == qVar.f186n && this.f187o == qVar.f187o && this.f188p == qVar.f188p && this.f189q == qVar.f189q && this.f190r == qVar.f190r && this.f191s == qVar.f191s && this.f192t == qVar.f192t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f3 = o.f(this.f175c, (O.j.b(this.f174b) + (this.f173a.hashCode() * 31)) * 31, 31);
        String str = this.f176d;
        int hashCode = (Long.hashCode(this.f188p) + ((Long.hashCode(this.f187o) + ((Long.hashCode(this.f186n) + ((Long.hashCode(this.f185m) + ((O.j.b(this.f184l) + ((Integer.hashCode(this.f183k) + ((this.f182j.hashCode() + ((Long.hashCode(this.f181i) + ((Long.hashCode(this.f180h) + ((Long.hashCode(this.f179g) + ((this.f178f.hashCode() + ((this.f177e.hashCode() + ((f3 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.f189q;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return Integer.hashCode(this.f192t) + ((Integer.hashCode(this.f191s) + ((O.j.b(this.f190r) + ((hashCode + i2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return o.l(new StringBuilder("{WorkSpec: "), this.f173a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ q(String str, int i2, String str2, String str3, s0.g gVar, s0.g gVar2, long j2, long j6, long j7, C1416d c1416d, int i3, int i6, long j8, long j9, long j10, long j11, boolean z, int i7, int i8, int i9, int i10) {
        this(str, r5, str2, r7, r8, r9, (i9 & 64) != 0 ? 0L : j2, (i9 & 128) != 0 ? 0L : j6, (i9 & 256) != 0 ? 0L : j7, (i9 & 512) != 0 ? C1416d.f11761i : c1416d, (i9 & 1024) != 0 ? 0 : i3, (i9 & 2048) != 0 ? 1 : i6, (i9 & Base64Utils.IO_BUFFER_SIZE) != 0 ? 30000L : j8, (i9 & 8192) != 0 ? 0L : j9, (i9 & 16384) != 0 ? 0L : j10, (32768 & i9) != 0 ? -1L : j11, (65536 & i9) != 0 ? false : z, (131072 & i9) != 0 ? 1 : i7, (i9 & 262144) != 0 ? 0 : i8, 0);
        s0.g gVar3;
        s0.g gVar4;
        int i11 = (i9 & 2) != 0 ? 1 : i2;
        String str4 = (i9 & 8) != 0 ? null : str3;
        if ((i9 & 16) != 0) {
            s0.g EMPTY = s0.g.f11777c;
            kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
            gVar3 = EMPTY;
        } else {
            gVar3 = gVar;
        }
        if ((i9 & 32) != 0) {
            s0.g EMPTY2 = s0.g.f11777c;
            kotlin.jvm.internal.i.d(EMPTY2, "EMPTY");
            gVar4 = EMPTY2;
        } else {
            gVar4 = gVar2;
        }
    }
}
