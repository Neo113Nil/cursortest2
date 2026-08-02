package n0;

import W0.m;
import i0.C2006k;
import k0.C2022b;
import k0.C2023c;
import kotlin.jvm.internal.l;
import z0.C2733I;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2157b {

    /* renamed from: k, reason: collision with root package name */
    public J2.b f18352k;

    /* renamed from: l, reason: collision with root package name */
    public C2006k f18353l;

    /* renamed from: m, reason: collision with root package name */
    public float f18354m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public m f18355n = m.f6016k;

    public abstract void b(float f);

    public abstract void d(C2006k c2006k);

    public final void g(C2733I c2733i, long j5, float f, C2006k c2006k) {
        if (this.f18354m != f) {
            b(f);
            this.f18354m = f;
        }
        if (!l.a(this.f18353l, c2006k)) {
            d(c2006k);
            this.f18353l = c2006k;
        }
        m layoutDirection = c2733i.getLayoutDirection();
        if (this.f18355n != layoutDirection) {
            f(layoutDirection);
            this.f18355n = layoutDirection;
        }
        int i = (int) (j5 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (c2733i.d() >> 32)) - Float.intBitsToFloat(i);
        int i5 = (int) (j5 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c2733i.d() & 4294967295L)) - Float.intBitsToFloat(i5);
        C2022b c2022b = c2733i.f21647k;
        ((C2023c) c2022b.f17540l.f20432l).v(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i5) > 0.0f) {
                    i(c2733i);
                }
            } finally {
                ((C2023c) c2022b.f17540l.f20432l).v(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(C2733I c2733i);

    public void f(m mVar) {
    }
}
