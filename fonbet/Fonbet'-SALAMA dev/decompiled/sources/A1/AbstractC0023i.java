package A1;

import com.google.android.exoplayer2.Format$Builder;
import v2.AbstractC1664a;
import w1.V0;

/* renamed from: A1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0023i implements C0 {

    /* renamed from: B, reason: collision with root package name */
    public boolean f373B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f374C;

    /* renamed from: a, reason: collision with root package name */
    public final int f375a;

    /* renamed from: c, reason: collision with root package name */
    public G0 f377c;

    /* renamed from: d, reason: collision with root package name */
    public int f378d;

    /* renamed from: e, reason: collision with root package name */
    public B1.p f379e;

    /* renamed from: f, reason: collision with root package name */
    public int f380f;

    /* renamed from: x, reason: collision with root package name */
    public c2.W f381x;

    /* renamed from: y, reason: collision with root package name */
    public X[] f382y;

    /* renamed from: z, reason: collision with root package name */
    public long f383z;

    /* renamed from: b, reason: collision with root package name */
    public final V0 f376b = new V0(1, false);

    /* renamed from: A, reason: collision with root package name */
    public long f372A = Long.MIN_VALUE;

    public AbstractC0023i(int i7) {
        this.f375a = i7;
    }

    public static int e(int i7, int i8, int i9) {
        return i7 | i8 | i9 | 128;
    }

    public static int g(int i7) {
        return i7 & 128;
    }

    public static int h(int i7) {
        return i7 & 64;
    }

    public int A() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r f(Exception exc, X x4, boolean z4, int i7) {
        int i8;
        if (x4 != null && !this.f374C) {
            this.f374C = true;
            try {
                i8 = z(x4) & 7;
            } catch (r unused) {
            } finally {
                this.f374C = false;
            }
            return new r(1, exc, i7, j(), this.f378d, x4, x4 != null ? 4 : i8, z4);
        }
        i8 = 4;
        return new r(1, exc, i7, j(), this.f378d, x4, x4 != null ? 4 : i8, z4);
    }

    public v2.h i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.f372A == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j, boolean z4);

    public abstract void t(X[] xArr, long j, long j3);

    public final int u(V0 v02, D1.h hVar, int i7) {
        c2.W w7 = this.f381x;
        w7.getClass();
        int e7 = w7.e(v02, hVar, i7);
        if (e7 == -4) {
            if (hVar.f(4)) {
                this.f372A = Long.MIN_VALUE;
                return this.f373B ? -4 : -3;
            }
            long j = hVar.f1699f + this.f383z;
            hVar.f1699f = j;
            this.f372A = Math.max(this.f372A, j);
        } else if (e7 == -5) {
            X x4 = (X) v02.f17563c;
            x4.getClass();
            long j3 = x4.f287G;
            if (j3 != Long.MAX_VALUE) {
                Format$Builder a2 = x4.a();
                a2.f10541o = j3 + this.f383z;
                v02.f17563c = new X(a2);
            }
        }
        return e7;
    }

    public abstract void v(long j, long j3);

    public final void w(X[] xArr, c2.W w7, long j, long j3) {
        AbstractC1664a.h(!this.f373B);
        this.f381x = w7;
        if (this.f372A == Long.MIN_VALUE) {
            this.f372A = j;
        }
        this.f382y = xArr;
        this.f383z = j3;
        t(xArr, j, j3);
    }

    public final void x() {
        AbstractC1664a.h(this.f380f == 0);
        this.f376b.k();
        q();
    }

    public abstract int z(X x4);

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    @Override // A1.C0
    public void c(int i7, Object obj) {
    }

    public void o(boolean z4, boolean z7) {
    }

    public void y(float f7, float f8) {
    }
}
