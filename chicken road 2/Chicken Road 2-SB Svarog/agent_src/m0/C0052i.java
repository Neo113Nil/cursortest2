package m0;

import java.util.concurrent.CancellationException;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052i extends M implements InterfaceC0051h {

    /* renamed from: f, reason: collision with root package name */
    public final T f928f;

    public C0052i(T t2) {
        this.f928f = t2;
    }

    @Override // m0.InterfaceC0051h
    public final boolean e(Throwable th) {
        T n2 = n();
        if (th instanceof CancellationException) {
            return true;
        }
        return n2.o(th) && n2.w();
    }

    @Override // f0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return W.g.f394a;
    }

    @Override // m0.O
    public final void o(Throwable th) {
        this.f928f.o(n());
    }
}
