package o2;

import f2.C1945c;
import f2.C1948f;
import f2.m;
import n.AbstractC2107A;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f18633a;

    /* renamed from: b, reason: collision with root package name */
    public int f18634b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f18635c;

    /* renamed from: d, reason: collision with root package name */
    public String f18636d;

    /* renamed from: e, reason: collision with root package name */
    public C1948f f18637e;
    public C1948f f;

    /* renamed from: g, reason: collision with root package name */
    public long f18638g;

    /* renamed from: h, reason: collision with root package name */
    public long f18639h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public C1945c f18640j;

    /* renamed from: k, reason: collision with root package name */
    public int f18641k;

    /* renamed from: l, reason: collision with root package name */
    public int f18642l;

    /* renamed from: m, reason: collision with root package name */
    public long f18643m;

    /* renamed from: n, reason: collision with root package name */
    public long f18644n;

    /* renamed from: o, reason: collision with root package name */
    public long f18645o;

    /* renamed from: p, reason: collision with root package name */
    public long f18646p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18647q;

    /* renamed from: r, reason: collision with root package name */
    public int f18648r;

    static {
        m.f("WorkSpec");
    }

    public i(String str, String str2) {
        C1948f c1948f = C1948f.f16993c;
        this.f18637e = c1948f;
        this.f = c1948f;
        this.f18640j = C1945c.i;
        this.f18642l = 1;
        this.f18643m = 30000L;
        this.f18646p = -1L;
        this.f18648r = 1;
        this.f18633a = str;
        this.f18635c = str2;
    }

    public final long a() {
        int i;
        if (this.f18634b == 1 && (i = this.f18641k) > 0) {
            return Math.min(18000000L, this.f18642l == 2 ? this.f18643m * i : (long) Math.scalb(this.f18643m, i - 1)) + this.f18644n;
        }
        if (!c()) {
            long j5 = this.f18644n;
            if (j5 == 0) {
                j5 = System.currentTimeMillis();
            }
            return j5 + this.f18638g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = this.f18644n;
        if (j6 == 0) {
            j6 = this.f18638g + currentTimeMillis;
        }
        long j7 = this.i;
        long j8 = this.f18639h;
        if (j7 != j8) {
            return j6 + j8 + (j6 == 0 ? j7 * (-1) : 0L);
        }
        return j6 + (j6 != 0 ? j8 : 0L);
    }

    public final boolean b() {
        return !C1945c.i.equals(this.f18640j);
    }

    public final boolean c() {
        return this.f18639h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f18638g != iVar.f18638g || this.f18639h != iVar.f18639h || this.i != iVar.i || this.f18641k != iVar.f18641k || this.f18643m != iVar.f18643m || this.f18644n != iVar.f18644n || this.f18645o != iVar.f18645o || this.f18646p != iVar.f18646p || this.f18647q != iVar.f18647q || !this.f18633a.equals(iVar.f18633a) || this.f18634b != iVar.f18634b || !this.f18635c.equals(iVar.f18635c)) {
            return false;
        }
        String str = this.f18636d;
        if (str != null) {
            if (!str.equals(iVar.f18636d)) {
                return false;
            }
        } else if (iVar.f18636d != null) {
            return false;
        }
        return this.f18637e.equals(iVar.f18637e) && this.f.equals(iVar.f) && this.f18640j.equals(iVar.f18640j) && this.f18642l == iVar.f18642l && this.f18648r == iVar.f18648r;
    }

    public final int hashCode() {
        int i = L1.a.i((AbstractC2462i.b(this.f18634b) + (this.f18633a.hashCode() * 31)) * 31, 31, this.f18635c);
        String str = this.f18636d;
        int hashCode = (this.f.hashCode() + ((this.f18637e.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j5 = this.f18638g;
        int i5 = (hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f18639h;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.i;
        int b3 = (AbstractC2462i.b(this.f18642l) + ((((this.f18640j.hashCode() + ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.f18641k) * 31)) * 31;
        long j8 = this.f18643m;
        int i7 = (b3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f18644n;
        int i8 = (i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f18645o;
        int i9 = (i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f18646p;
        return AbstractC2462i.b(this.f18648r) + ((((i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f18647q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC2107A.u(new StringBuilder("{WorkSpec: "), this.f18633a, "}");
    }
}
