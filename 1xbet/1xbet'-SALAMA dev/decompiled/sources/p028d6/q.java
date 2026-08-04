package p028d6;

import U5.AbstractC0442i;
import U5.l0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC0442i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12469b;

    public q(r rVar) {
        this.f12469b = rVar;
    }

    @Override // U5.AbstractC0442i
    public final void m(l0 l0Var) {
        l lVar = this.f12469b.f12470a;
        boolean zE = l0Var.e();
        o oVar = lVar.f12449a;
        if (oVar.f12464e == null && oVar.f12465f == null) {
            return;
        }
        if (zE) {
            ((AtomicLong) lVar.f12450b.f12447b).getAndIncrement();
        } else {
            ((AtomicLong) lVar.f12450b.f12448c).getAndIncrement();
        }
    }
}
