package m1;

import d1.C0950c;
import d1.C0954g;
import d1.n;
import e1.k;
import io.sentry.TransactionOptions;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f15216a;

    /* renamed from: b, reason: collision with root package name */
    public int f15217b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f15218c;

    /* renamed from: d, reason: collision with root package name */
    public String f15219d;

    /* renamed from: e, reason: collision with root package name */
    public C0954g f15220e;

    /* renamed from: f, reason: collision with root package name */
    public C0954g f15221f;

    /* renamed from: g, reason: collision with root package name */
    public long f15222g;

    /* renamed from: h, reason: collision with root package name */
    public long f15223h;

    /* renamed from: i, reason: collision with root package name */
    public long f15224i;
    public C0950c j;

    /* renamed from: k, reason: collision with root package name */
    public int f15225k;

    /* renamed from: l, reason: collision with root package name */
    public int f15226l;

    /* renamed from: m, reason: collision with root package name */
    public long f15227m;

    /* renamed from: n, reason: collision with root package name */
    public long f15228n;

    /* renamed from: o, reason: collision with root package name */
    public long f15229o;

    /* renamed from: p, reason: collision with root package name */
    public long f15230p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15231q;

    /* renamed from: r, reason: collision with root package name */
    public int f15232r;

    static {
        n.g("WorkSpec");
    }

    public i(String str, String str2) {
        C0954g c0954g = C0954g.f12356c;
        this.f15220e = c0954g;
        this.f15221f = c0954g;
        this.j = C0950c.f12342i;
        this.f15226l = 1;
        this.f15227m = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.f15230p = -1L;
        this.f15232r = 1;
        this.f15216a = str;
        this.f15218c = str2;
    }

    public final long a() {
        int i7;
        if (this.f15217b == 1 && (i7 = this.f15225k) > 0) {
            return Math.min(18000000L, this.f15226l == 2 ? this.f15227m * i7 : (long) Math.scalb(this.f15227m, i7 - 1)) + this.f15228n;
        }
        if (!c()) {
            long j = this.f15228n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.f15222g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.f15228n;
        if (j3 == 0) {
            j3 = this.f15222g + currentTimeMillis;
        }
        long j7 = this.f15224i;
        long j8 = this.f15223h;
        if (j7 != j8) {
            return j3 + j8 + (j3 == 0 ? j7 * (-1) : 0L);
        }
        return j3 + (j3 != 0 ? j8 : 0L);
    }

    public final boolean b() {
        return !C0950c.f12342i.equals(this.j);
    }

    public final boolean c() {
        return this.f15223h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15222g != iVar.f15222g || this.f15223h != iVar.f15223h || this.f15224i != iVar.f15224i || this.f15225k != iVar.f15225k || this.f15227m != iVar.f15227m || this.f15228n != iVar.f15228n || this.f15229o != iVar.f15229o || this.f15230p != iVar.f15230p || this.f15231q != iVar.f15231q || !this.f15216a.equals(iVar.f15216a) || this.f15217b != iVar.f15217b || !this.f15218c.equals(iVar.f15218c)) {
            return false;
        }
        String str = this.f15219d;
        if (str == null ? iVar.f15219d == null : str.equals(iVar.f15219d)) {
            return this.f15220e.equals(iVar.f15220e) && this.f15221f.equals(iVar.f15221f) && this.j.equals(iVar.j) && this.f15226l == iVar.f15226l && this.f15232r == iVar.f15232r;
        }
        return false;
    }

    public final int hashCode() {
        int d7 = AbstractC1663a.d((t.e.e(this.f15217b) + (this.f15216a.hashCode() * 31)) * 31, 31, this.f15218c);
        String str = this.f15219d;
        int hashCode = (this.f15221f.hashCode() + ((this.f15220e.hashCode() + ((d7 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f15222g;
        int i7 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f15223h;
        int i8 = (i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f15224i;
        int e7 = (t.e.e(this.f15226l) + ((((this.j.hashCode() + ((i8 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.f15225k) * 31)) * 31;
        long j8 = this.f15227m;
        int i9 = (e7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f15228n;
        int i10 = (i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f15229o;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f15230p;
        return t.e.e(this.f15232r) + ((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f15231q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return k.i(new StringBuilder("{WorkSpec: "), this.f15216a, "}");
    }
}
