package z;

import z0.q0;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2678B extends b0.o implements q0 {

    /* renamed from: y, reason: collision with root package name */
    public float f21464y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21465z;

    @Override // z0.q0
    public final Object e0(Object obj) {
        C2684H c2684h = obj instanceof C2684H ? (C2684H) obj : null;
        if (c2684h == null) {
            c2684h = new C2684H();
            c2684h.f21479a = 0.0f;
            c2684h.f21480b = true;
        }
        c2684h.f21479a = this.f21464y;
        c2684h.f21480b = this.f21465z;
        return c2684h;
    }
}
