package b1;

import java.util.concurrent.CancellationException;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021i extends L implements InterfaceC0020h {

    /* renamed from: e, reason: collision with root package name */
    public final S f662e;

    public C0021i(S s2) {
        this.f662e = s2;
    }

    @Override // b1.InterfaceC0020h
    public final boolean c(Throwable th) {
        S j2 = j();
        if (th instanceof CancellationException) {
            return true;
        }
        return j2.n(th) && j2.v();
    }

    @Override // U0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return K0.i.f206a;
    }

    @Override // b1.N
    public final void k(Throwable th) {
        this.f662e.n(j());
    }
}
