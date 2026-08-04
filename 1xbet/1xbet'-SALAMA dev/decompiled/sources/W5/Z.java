package W5;

import U5.AbstractC0439f;
import U5.C0437d;
import U5.EnumC0446m;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z extends U5.Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q0 f7097d;

    public Z(Q0 q1) {
        this.f7097d = q1;
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0439f n(H2.r rVar, C0437d c0437d) {
        return this.f7097d.f6979w.n(rVar, c0437d);
    }

    @Override // U5.Q
    public final boolean s(long j, TimeUnit timeUnit) {
        return this.f7097d.f6943N.await(j, timeUnit);
    }

    @Override // U5.Q
    public final void t() {
        this.f7097d.t();
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7097d, "delegate");
        return jVarU0.toString();
    }

    @Override // U5.Q
    public final EnumC0446m u() {
        return this.f7097d.u();
    }

    @Override // U5.Q
    public final void v(EnumC0446m enumC0446m, K4.t tVar) {
        this.f7097d.v(enumC0446m, tVar);
    }
}
