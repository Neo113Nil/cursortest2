package U5;

import W5.AbstractC0486a1;

/* loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2.F f6563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H2.q f6564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f6566d;

    public o0(p0 p0Var, P2.F f7, H2.q qVar, long j) {
        this.f6566d = p0Var;
        this.f6563a = f7;
        this.f6564b = qVar;
        this.f6565c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6566d.execute(this.f6563a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6564b.toString());
        sb.append("(scheduled in SynchronizationContext with delay of ");
        return AbstractC0486a1.i(sb, this.f6565c, ")");
    }
}
