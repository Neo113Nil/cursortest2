package p4;

import a4.AbstractC0470a;
import c4.AbstractC0542c;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class e0 extends AbstractC0470a implements U {

    /* renamed from: l, reason: collision with root package name */
    public static final e0 f18788l = new e0(r.f18819l);

    @Override // p4.U
    public final boolean b() {
        return true;
    }

    @Override // p4.U
    public final E f(boolean z3, boolean z5, E.q0 q0Var) {
        return f0.f18789k;
    }

    @Override // p4.U
    public final Object h(AbstractC0542c abstractC0542c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p4.U
    public final E p(i4.c cVar) {
        return f0.f18789k;
    }

    @Override // p4.U
    public final CancellationException s() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p4.U
    public final boolean start() {
        return false;
    }

    @Override // p4.U
    public final InterfaceC2271k t(b0 b0Var) {
        return f0.f18789k;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p4.U
    public final void d(CancellationException cancellationException) {
    }
}
