package A1;

import d2.C0958a;
import d2.C0959b;

/* loaded from: classes.dex */
public final class P0 implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public Object f186a;

    /* renamed from: b, reason: collision with root package name */
    public Object f187b;

    /* renamed from: c, reason: collision with root package name */
    public int f188c;

    /* renamed from: d, reason: collision with root package name */
    public long f189d;

    /* renamed from: e, reason: collision with root package name */
    public long f190e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f191f;

    /* renamed from: x, reason: collision with root package name */
    public C0959b f192x = C0959b.f12381f;

    public final long a(int i7, int i8) {
        C0958a a2 = this.f192x.a(i7);
        if (a2.f12375b != -1) {
            return a2.f12378e[i8];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j) {
        C0958a a2;
        int i7;
        C0959b c0959b = this.f192x;
        long j3 = this.f189d;
        c0959b.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j >= j3) {
            return -1;
        }
        int i8 = c0959b.f12387d;
        while (true) {
            int i9 = c0959b.f12384a;
            if (i8 >= i9 || ((c0959b.a(i8).f12374a == Long.MIN_VALUE || c0959b.a(i8).f12374a > j) && ((i7 = (a2 = c0959b.a(i8)).f12375b) == -1 || a2.a(-1) < i7))) {
                break;
            }
            i8++;
        }
        return -1;
    }

    public final int c(long j) {
        C0959b c0959b = this.f192x;
        long j3 = this.f189d;
        int i7 = c0959b.f12384a - 1;
        while (i7 >= 0 && j != Long.MIN_VALUE) {
            long j7 = c0959b.a(i7).f12374a;
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
            C0958a a2 = c0959b.a(i7);
            int i8 = a2.f12375b;
            if (i8 == -1) {
                return i7;
            }
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = a2.f12377d[i9];
                if (i10 == 0 || i10 == 1) {
                    return i7;
                }
            }
        }
        return -1;
    }

    public final long d(int i7) {
        return this.f192x.a(i7).f12374a;
    }

    public final int e(int i7, int i8) {
        C0958a a2 = this.f192x.a(i7);
        if (a2.f12375b != -1) {
            return a2.f12377d[i8];
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
        P0 p02 = (P0) obj;
        return v2.t.a(this.f186a, p02.f186a) && v2.t.a(this.f187b, p02.f187b) && this.f188c == p02.f188c && this.f189d == p02.f189d && this.f190e == p02.f190e && this.f191f == p02.f191f && v2.t.a(this.f192x, p02.f192x);
    }

    public final int f(int i7) {
        return this.f192x.a(i7).a(-1);
    }

    public final boolean g(int i7) {
        return this.f192x.a(i7).f12380x;
    }

    public final void h(Object obj, Object obj2, int i7, long j, long j3, C0959b c0959b, boolean z4) {
        this.f186a = obj;
        this.f187b = obj2;
        this.f188c = i7;
        this.f189d = j;
        this.f190e = j3;
        this.f192x = c0959b;
        this.f191f = z4;
    }

    public final int hashCode() {
        Object obj = this.f186a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f187b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f188c) * 31;
        long j = this.f189d;
        int i7 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f190e;
        return this.f192x.hashCode() + ((((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f191f ? 1 : 0)) * 31);
    }
}
