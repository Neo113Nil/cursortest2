package D3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i implements k, d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f952k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f953l;

    /* renamed from: m, reason: collision with root package name */
    public final Executor f954m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f955n;

    public /* synthetic */ i(Executor executor, a aVar, o oVar, int i) {
        this.f952k = i;
        this.f954m = executor;
        this.f955n = aVar;
        this.f953l = oVar;
    }

    private final void c(o oVar) {
        synchronized (this.f955n) {
        }
        this.f954m.execute(new h(2, this, oVar));
    }

    @Override // D3.k
    public final void a(o oVar) {
        switch (this.f952k) {
            case 0:
                ((ExecutorService) this.f954m).execute(new h(0, this, oVar));
                return;
            case 1:
                ((n) this.f954m).execute(new h(1, this, oVar));
                return;
            case 2:
                c(oVar);
                return;
            default:
                if (oVar.d() || oVar.f969d) {
                    return;
                }
                synchronized (this.f955n) {
                    try {
                        if (((d) this.f953l) != null) {
                            this.f954m.execute(new h(3, this, oVar));
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // D3.d
    public void b(Exception exc) {
        ((o) this.f953l).e(exc);
    }

    public i(Executor executor, c cVar) {
        this.f952k = 2;
        this.f955n = new Object();
        this.f954m = executor;
        this.f953l = cVar;
    }

    public i(Executor executor, d dVar) {
        this.f952k = 3;
        this.f955n = new Object();
        this.f954m = executor;
        this.f953l = dVar;
    }
}
