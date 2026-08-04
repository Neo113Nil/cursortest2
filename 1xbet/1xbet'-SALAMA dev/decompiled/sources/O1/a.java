package O1;

import F1.r;
import F1.s;
import F1.t;
import io.sentry.TransactionOptions;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f4920a;

    public a(b bVar) {
        this.f4920a = bVar;
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        b bVar = this.f4920a;
        long j3 = (((long) bVar.f4927d.f4965i) * j) / 1000000;
        long j7 = bVar.f4926c;
        long j8 = bVar.f4925b;
        t tVar = new t(j, p151v2.t.k(((((j7 - j8) * j3) / bVar.f4929f) + j8) - TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, j8, j7 - 1));
        return new r(tVar, tVar);
    }

    @Override // F1.s
    public final long i() {
        b bVar = this.f4920a;
        return (bVar.f4929f * 1000000) / ((long) bVar.f4927d.f4965i);
    }
}
