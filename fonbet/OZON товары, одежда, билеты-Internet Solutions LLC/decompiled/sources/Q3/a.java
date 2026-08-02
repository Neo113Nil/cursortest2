package Q3;

import N3.C3659j;
import N3.G;
import N3.InterfaceC3665p;
import N3.J;
import N3.q;
import N3.r;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes.dex */
public final class a implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f22945a = new C8050C(4);

    /* renamed from: b, reason: collision with root package name */
    private final J f22946b = new J(-1, -1, "image/avif");

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f22946b.a(j11, j12);
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f22946b.b(rVar);
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        C3659j c3659j = (C3659j) qVar;
        c3659j.i(4, false);
        C8050C c8050c = this.f22945a;
        c8050c.O(4);
        c3659j.d(c8050c.e(), 0, 4, false);
        if (c8050c.G() == 1718909296) {
            c8050c.O(4);
            c3659j.d(c8050c.e(), 0, 4, false);
            if (c8050c.G() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        return this.f22946b.f(qVar, g10);
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
