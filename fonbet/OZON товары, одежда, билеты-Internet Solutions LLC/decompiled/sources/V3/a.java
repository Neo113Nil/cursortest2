package V3;

import N3.G;
import N3.InterfaceC3665p;
import N3.J;
import N3.q;
import N3.r;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3665p f27959a;

    public a(int i11) {
        if ((i11 & 1) != 0) {
            this.f27959a = new J(65496, 2, "image/jpeg");
        } else {
            this.f27959a = new b();
        }
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f27959a.a(j11, j12);
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f27959a.b(rVar);
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        return this.f27959a.d(qVar);
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        return this.f27959a.f(qVar, g10);
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
        this.f27959a.release();
    }
}
