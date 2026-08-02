package A0;

import a.AbstractC0444a;
import android.os.Build;
import android.view.ViewParent;
import h0.C1988b;
import k0.C2022b;
import l0.C2041b;
import l0.InterfaceC2043d;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class W0 implements z0.m0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f402A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f403B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f405D;

    /* renamed from: k, reason: collision with root package name */
    public C2041b f407k;

    /* renamed from: l, reason: collision with root package name */
    public final i0.u f408l;

    /* renamed from: m, reason: collision with root package name */
    public final F f409m;

    /* renamed from: n, reason: collision with root package name */
    public i4.e f410n;

    /* renamed from: o, reason: collision with root package name */
    public z0.d0 f411o;

    /* renamed from: p, reason: collision with root package name */
    public long f412p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f413q;

    /* renamed from: s, reason: collision with root package name */
    public float[] f415s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f416t;

    /* renamed from: x, reason: collision with root package name */
    public int f420x;

    /* renamed from: z, reason: collision with root package name */
    public i0.D f422z;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f414r = i0.z.a();

    /* renamed from: u, reason: collision with root package name */
    public W0.c f417u = AbstractC2425d.a();

    /* renamed from: v, reason: collision with root package name */
    public W0.m f418v = W0.m.f6016k;

    /* renamed from: w, reason: collision with root package name */
    public final C2022b f419w = new C2022b();

    /* renamed from: y, reason: collision with root package name */
    public long f421y = i0.N.f17263b;

    /* renamed from: C, reason: collision with root package name */
    public boolean f404C = true;

    /* renamed from: E, reason: collision with root package name */
    public final A.B f406E = new A.B(5, this);

    public W0(C2041b c2041b, i0.u uVar, F f, i4.e eVar, z0.d0 d0Var) {
        this.f407k = c2041b;
        this.f408l = uVar;
        this.f409m = f;
        this.f410n = eVar;
        this.f411o = d0Var;
        long j5 = Integer.MAX_VALUE;
        this.f412p = (j5 & 4294967295L) | (j5 << 32);
    }

    public final float[] a() {
        float[] fArr = this.f415s;
        if (fArr == null) {
            fArr = i0.z.a();
            this.f415s = fArr;
        }
        if (this.f403B) {
            this.f403B = false;
            float[] b3 = b();
            if (this.f404C) {
                return b3;
            }
            if (!Z.y(b3, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z3 = this.f402A;
        float[] fArr = this.f414r;
        if (z3) {
            C2041b c2041b = this.f407k;
            long j5 = c2041b.f17684v;
            if ((9223372034707292159L & j5) == 9205357640488583168L) {
                j5 = AbstractC0444a.L(AbstractC0444a.d0(this.f412p));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
            InterfaceC2043d interfaceC2043d = c2041b.f17665a;
            float s2 = interfaceC2043d.s();
            float g5 = interfaceC2043d.g();
            float w5 = interfaceC2043d.w();
            float D5 = interfaceC2043d.D();
            float J = interfaceC2043d.J();
            float d5 = interfaceC2043d.d();
            float H5 = interfaceC2043d.H();
            double d6 = w5 * 0.017453292519943295d;
            float sin = (float) Math.sin(d6);
            float cos = (float) Math.cos(d6);
            float f = -sin;
            float f5 = (g5 * cos) - (1.0f * sin);
            float f6 = (1.0f * cos) + (g5 * sin);
            double d7 = D5 * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d7);
            float cos2 = (float) Math.cos(d7);
            float f7 = -sin2;
            float f8 = sin * sin2;
            float f9 = sin * cos2;
            float f10 = cos * sin2;
            float f11 = cos * cos2;
            float f12 = (f6 * sin2) + (s2 * cos2);
            float f13 = (f6 * cos2) + ((-s2) * sin2);
            double d8 = J * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d8);
            float cos3 = (float) Math.cos(d8);
            float f14 = -sin3;
            float f15 = (cos3 * f8) + (f14 * cos2);
            float f16 = ((f8 * sin3) + (cos2 * cos3)) * d5;
            float f17 = sin3 * cos * d5;
            float f18 = ((sin3 * f9) + (cos3 * f7)) * d5;
            float f19 = f15 * H5;
            float f20 = cos * cos3 * H5;
            float f21 = ((cos3 * f9) + (f14 * f7)) * H5;
            float f22 = f10 * 1.0f;
            float f23 = f * 1.0f;
            float f24 = f11 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f16;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = f19;
                fArr[5] = f20;
                fArr[6] = f21;
                fArr[7] = 0.0f;
                fArr[8] = f22;
                fArr[9] = f23;
                fArr[10] = f24;
                fArr[11] = 0.0f;
                float f25 = -intBitsToFloat;
                fArr[12] = ((f16 * f25) - (intBitsToFloat2 * f19)) + f12 + intBitsToFloat;
                fArr[13] = ((f17 * f25) - (intBitsToFloat2 * f20)) + f5 + intBitsToFloat2;
                fArr[14] = ((f25 * f18) - (intBitsToFloat2 * f21)) + f13;
                fArr[15] = 1.0f;
            }
            this.f402A = false;
            this.f404C = i0.F.l(fArr);
        }
        return fArr;
    }

    public final long c(long j5, boolean z3) {
        float[] b3;
        if (z3) {
            b3 = a();
            if (b3 == null) {
                return 9187343241974906880L;
            }
        } else {
            b3 = b();
        }
        return this.f404C ? j5 : i0.z.b(j5, b3);
    }

    public final void d(long j5) {
        F f = this.f409m;
        if (f.f247p) {
            f.O(-4.0f);
        }
        C2041b c2041b = this.f407k;
        if (!W0.j.a(c2041b.f17682t, j5)) {
            c2041b.f17682t = j5;
            long j6 = c2041b.f17683u;
            c2041b.f17665a.C((int) (j5 >> 32), (int) (j5 & 4294967295L), j6);
        }
        if (Build.VERSION.SDK_INT < 26) {
            f.invalidate();
            return;
        }
        ViewParent parent = f.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(f, f);
        }
    }

    public final void e(long j5) {
        if (W0.l.a(j5, this.f412p)) {
            return;
        }
        F f = this.f409m;
        if (f.f247p) {
            f.O(-4.0f);
        }
        this.f412p = j5;
        if (this.f416t || this.f413q) {
            return;
        }
        f.invalidate();
        if (true != this.f416t) {
            this.f416t = true;
            f.z(this, true);
        }
    }

    public final void f() {
        F f = this.f409m;
        boolean z3 = f.f247p;
        if (this.f416t) {
            if (!i0.N.a(this.f421y, i0.N.f17263b) && !W0.l.a(this.f407k.f17683u, this.f412p)) {
                C2041b c2041b = this.f407k;
                float b3 = i0.N.b(this.f421y) * ((int) (this.f412p >> 32));
                float c5 = i0.N.c(this.f421y) * ((int) (this.f412p & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c5) & 4294967295L) | (Float.floatToRawIntBits(b3) << 32);
                if (!C1988b.b(c2041b.f17684v, floatToRawIntBits)) {
                    c2041b.f17684v = floatToRawIntBits;
                    c2041b.f17665a.L(floatToRawIntBits);
                }
            }
            C2041b c2041b2 = this.f407k;
            W0.c cVar = this.f417u;
            W0.m mVar = this.f418v;
            long j5 = this.f412p;
            boolean a5 = W0.l.a(c2041b2.f17683u, j5);
            InterfaceC2043d interfaceC2043d = c2041b2.f17665a;
            if (!a5) {
                c2041b2.f17683u = j5;
                long j6 = c2041b2.f17682t;
                interfaceC2043d.C((int) (j6 >> 32), (int) (4294967295L & j6), j5);
                if (c2041b2.i == 9205357640488583168L) {
                    c2041b2.f17670g = true;
                    c2041b2.a();
                }
            }
            c2041b2.f17666b = cVar;
            c2041b2.f17667c = mVar;
            c2041b2.f17668d = this.f406E;
            interfaceC2043d.f(cVar, mVar, c2041b2, c2041b2.f17669e);
            if (this.f416t) {
                this.f416t = false;
                f.z(this, false);
            }
        }
    }

    @Override // z0.m0
    public final void invalidate() {
        if (this.f416t || this.f413q) {
            return;
        }
        F f = this.f409m;
        f.invalidate();
        if (true != this.f416t) {
            this.f416t = true;
            f.z(this, true);
        }
    }
}
