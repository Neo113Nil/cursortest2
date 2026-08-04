package p088m1;

import io.sentry.TransactionOptions;
import p023d1.c;
import p023d1.g;
import p023d1.n;
import p031e1.k;
import p136t.e;
import p150v0.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15223b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f15226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f15227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15230i;
    public c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f15233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f15235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15238r;

    static {
        n.g("WorkSpec");
    }

    public i(String str, String str2) {
        g gVar = g.f12362c;
        this.f15226e = gVar;
        this.f15227f = gVar;
        this.j = c.f12348i;
        this.f15232l = 1;
        this.f15233m = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.f15236p = -1L;
        this.f15238r = 1;
        this.f15222a = str;
        this.f15224c = str2;
    }

    public final long a() {
        int i7;
        if (this.f15223b == 1 && (i7 = this.f15231k) > 0) {
            return Math.min(18000000L, this.f15232l == 2 ? this.f15233m * ((long) i7) : (long) Math.scalb(this.f15233m, i7 - 1)) + this.f15234n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f15234n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f15228g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f15234n;
        if (j == 0) {
            j = this.f15228g + jCurrentTimeMillis2;
        }
        long j3 = this.f15230i;
        long j7 = this.f15229h;
        if (j3 != j7) {
            return j + j7 + (j == 0 ? j3 * (-1) : 0L);
        }
        return j + (j != 0 ? j7 : 0L);
    }

    public final boolean b() {
        return !c.f12348i.equals(this.j);
    }

    public final boolean c() {
        return this.f15229h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15228g != iVar.f15228g || this.f15229h != iVar.f15229h || this.f15230i != iVar.f15230i || this.f15231k != iVar.f15231k || this.f15233m != iVar.f15233m || this.f15234n != iVar.f15234n || this.f15235o != iVar.f15235o || this.f15236p != iVar.f15236p || this.f15237q != iVar.f15237q || !this.f15222a.equals(iVar.f15222a) || this.f15223b != iVar.f15223b || !this.f15224c.equals(iVar.f15224c)) {
            return false;
        }
        String str = this.f15225d;
        if (str == null ? iVar.f15225d == null : str.equals(iVar.f15225d)) {
            return this.f15226e.equals(iVar.f15226e) && this.f15227f.equals(iVar.f15227f) && this.j.equals(iVar.j) && this.f15232l == iVar.f15232l && this.f15238r == iVar.f15238r;
        }
        return false;
    }

    public final int hashCode() {
        int iD = a.d((e.e(this.f15223b) + (this.f15222a.hashCode() * 31)) * 31, 31, this.f15224c);
        String str = this.f15225d;
        int iHashCode = (this.f15227f.hashCode() + ((this.f15226e.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f15228g;
        int i7 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f15229h;
        int i8 = (i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f15230i;
        int iE = (e.e(this.f15232l) + ((((this.j.hashCode() + ((i8 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.f15231k) * 31)) * 31;
        long j8 = this.f15233m;
        int i9 = (iE + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f15234n;
        int i10 = (i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f15235o;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f15236p;
        return e.e(this.f15238r) + ((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f15237q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return k.i(new StringBuilder("{WorkSpec: "), this.f15222a, "}");
    }
}
