package A1;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f191f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p024d2.b f192x = p024d2.b.f12387f;

    public final long a(int i7, int i8) {
        p024d2.a aVarA = this.f192x.a(i7);
        if (aVarA.f12381b != -1) {
            return aVarA.f12384e[i8];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i7;
        p024d2.a aVarA;
        int i8;
        p024d2.b bVar = this.f192x;
        long j3 = this.f189d;
        bVar.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j >= j3) {
            return -1;
        }
        int i9 = bVar.f12393d;
        while (true) {
            i7 = bVar.f12390a;
            if (i9 >= i7 || ((bVar.a(i9).f12380a == Long.MIN_VALUE || bVar.a(i9).f12380a > j) && ((i8 = (aVarA = bVar.a(i9)).f12381b) == -1 || aVarA.a(-1) < i8))) {
                break;
            }
            i9++;
        }
        if (i9 < i7) {
            return i9;
        }
        return -1;
    }

    public final int c(long j) {
        p024d2.b bVar = this.f192x;
        long j3 = this.f189d;
        int i7 = bVar.f12390a - 1;
        while (i7 >= 0 && j != Long.MIN_VALUE) {
            long j7 = bVar.a(i7).f12380a;
            if (j7 != Long.MIN_VALUE) {
                if (j >= j7) {
                    break;
                }
                i7--;
            } else {
                if (j3 != -9223372036854775807L && j >= j3) {
                    break;
                }
                i7--;
            }
        }
        if (i7 >= 0) {
            p024d2.a aVarA = bVar.a(i7);
            int i8 = aVarA.f12381b;
            if (i8 == -1) {
                return i7;
            }
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = aVarA.f12383d[i9];
                if (i10 == 0 || i10 == 1) {
                    return i7;
                }
            }
        }
        return -1;
    }

    public final long d(int i7) {
        return this.f192x.a(i7).f12380a;
    }

    public final int e(int i7, int i8) {
        p024d2.a aVarA = this.f192x.a(i7);
        if (aVarA.f12381b != -1) {
            return aVarA.f12383d[i8];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !P0.class.equals(obj.getClass())) {
            return false;
        }
        P0 p5 = (P0) obj;
        return p151v2.t.a(this.f186a, p5.f186a) && p151v2.t.a(this.f187b, p5.f187b) && this.f188c == p5.f188c && this.f189d == p5.f189d && this.f190e == p5.f190e && this.f191f == p5.f191f && p151v2.t.a(this.f192x, p5.f192x);
    }

    public final int f(int i7) {
        return this.f192x.a(i7).a(-1);
    }

    public final boolean g(int i7) {
        return this.f192x.a(i7).f12386x;
    }

    public final void h(Object obj, Object obj2, int i7, long j, long j3, p024d2.b bVar, boolean z4) {
        this.f186a = obj;
        this.f187b = obj2;
        this.f188c = i7;
        this.f189d = j;
        this.f190e = j3;
        this.f192x = bVar;
        this.f191f = z4;
    }

    public final int hashCode() {
        Object obj = this.f186a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f187b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f188c) * 31;
        long j = this.f189d;
        int i7 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f190e;
        return this.f192x.hashCode() + ((((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f191f ? 1 : 0)) * 31);
    }
}
