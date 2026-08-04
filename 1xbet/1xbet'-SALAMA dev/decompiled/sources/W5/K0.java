package W5;

import U5.AbstractC0438e;
import U5.AbstractC0439f;
import U5.C0437d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends AbstractC0438e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N0 f6841d;

    public K0(N0 n2) {
        this.f6841d = n2;
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0439f n(H2.r rVar, C0437d c0437d) {
        Q0 q1 = this.f6841d.f6886g;
        Logger logger = Q0.f6922g0;
        q1.getClass();
        Executor executor = c0437d.f6475b;
        Executor executor2 = executor == null ? q1.f6967k : executor;
        Q0 q7 = this.f6841d.f6886g;
        C0537s c0537s = new C0537s(rVar, executor2, c0437d, q7.f6959d0, q7.f6942M ? null : this.f6841d.f6886g.f6966i.f7260a.f7514d, this.f6841d.f6886g.f6945P);
        this.f6841d.f6886g.getClass();
        c0537s.f7339p = this.f6841d.f6886g.f6973q;
        return c0537s;
    }
}
