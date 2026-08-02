package u;

import a.AbstractC0444a;

/* renamed from: u.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2433D implements InterfaceC2431B {

    /* renamed from: a, reason: collision with root package name */
    public final int f19654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19655b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2477y f19656c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19657d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19658e;

    public C2433D(int i, int i5, InterfaceC2477y interfaceC2477y) {
        this.f19654a = i;
        this.f19655b = i5;
        this.f19656c = interfaceC2477y;
        this.f19657d = i * 1000000;
        this.f19658e = i5 * 1000000;
    }

    @Override // u.InterfaceC2464k
    public final C0 a(A0 a02) {
        return new m2.g(this);
    }

    @Override // u.InterfaceC2431B
    public final float b(long j5, float f, float f5, float f6) {
        float u5 = this.f19654a == 0 ? 1.0f : AbstractC0444a.u(j5 - this.f19658e, 0L, this.f19657d) / this.f19657d;
        if (u5 < 0.0f) {
            u5 = 0.0f;
        }
        float a5 = this.f19656c.a(u5 <= 1.0f ? u5 : 1.0f);
        A0 a02 = B0.f19645a;
        return (f5 * a5) + ((1 - a5) * f);
    }

    @Override // u.InterfaceC2431B
    public final float c(long j5, float f, float f5, float f6) {
        long u5 = AbstractC0444a.u(j5 - this.f19658e, 0L, this.f19657d);
        if (u5 < 0) {
            return 0.0f;
        }
        if (u5 == 0) {
            return f6;
        }
        return (b(u5, f, f5, f6) - b(u5 - 1000000, f, f5, f6)) * 1000.0f;
    }

    @Override // u.InterfaceC2431B
    public final long d(float f, float f5, float f6) {
        return (this.f19655b + this.f19654a) * 1000000;
    }

    @Override // u.InterfaceC2431B
    public final float e(float f, float f5, float f6) {
        return c(d(f, f5, f6), f, f5, f6);
    }
}
