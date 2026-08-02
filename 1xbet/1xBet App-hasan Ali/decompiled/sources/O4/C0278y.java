package O4;

import L4.InterfaceC0228k;
import java.io.IOException;

/* renamed from: O4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278y extends y4.B {

    /* renamed from: l, reason: collision with root package name */
    public final y4.B f4240l;

    /* renamed from: m, reason: collision with root package name */
    public final L4.C f4241m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f4242n;

    public C0278y(y4.B b3) {
        this.f4240l = b3;
        this.f4241m = N4.b.k(new C0277x(this, b3.f()));
    }

    @Override // y4.B
    public final long b() {
        return this.f4240l.b();
    }

    @Override // y4.B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4240l.close();
    }

    @Override // y4.B
    public final y4.q d() {
        return this.f4240l.d();
    }

    @Override // y4.B
    public final InterfaceC0228k f() {
        return this.f4241m;
    }
}
