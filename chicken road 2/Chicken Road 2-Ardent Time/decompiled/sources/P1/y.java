package P1;

/* loaded from: classes.dex */
public final class y extends V1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P1.z f1564m;

    public y(P1.z this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1564m = this$0;
    }

    @Override // V1.e
    public final void j() {
        this.f1564m.e(P1.EnumC0054b.CANCEL);
        P1.r rVar = this.f1564m.f1566b;
        synchronized (rVar) {
            long j2 = rVar.f1525n;
            long j3 = rVar.f1524m;
            if (j2 < j3) {
                return;
            }
            rVar.f1524m = j3 + 1;
            rVar.f1526o = java.lang.System.nanoTime() + 1000000000;
            rVar.f1519h.c(new L1.b(kotlin.jvm.internal.i.h(" ping", rVar.f1514c), rVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new java.net.SocketTimeoutException("timeout");
        }
    }
}
