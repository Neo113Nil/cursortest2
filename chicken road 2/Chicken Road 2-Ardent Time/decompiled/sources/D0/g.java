package D0;

/* loaded from: classes.dex */
public final class g implements D0.b, D0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f201b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f202c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f203d;

    public g(D0.l lVar, Z0.h hVar, D0.m mVar) {
        this.f200a = 0;
        this.f201b = lVar;
        this.f202c = hVar;
        this.f203d = mVar;
    }

    @Override // D0.i
    public final void a(com.google.android.gms.tasks.Task task) {
        switch (this.f200a) {
            case 0:
                ((D0.l) this.f201b).execute(new D0.f(0, this, task));
                return;
            case 1:
                synchronized (this.f202c) {
                    try {
                        if (((D0.a) this.f203d) == null) {
                            return;
                        }
                        this.f201b.execute(new D0.f(1, this, task));
                        return;
                    } finally {
                    }
                }
            default:
                if (task.d()) {
                    synchronized (this.f202c) {
                        try {
                            if (((D0.b) this.f203d) != null) {
                                this.f201b.execute(new D0.f(2, this, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // D0.b
    public void onSuccess(java.lang.Object obj) {
        ((D0.m) this.f203d).f(obj);
    }

    public g(java.util.concurrent.Executor executor, D0.a aVar) {
        this.f200a = 1;
        this.f202c = new java.lang.Object();
        this.f201b = executor;
        this.f203d = aVar;
    }

    public g(java.util.concurrent.Executor executor, D0.b bVar) {
        this.f200a = 2;
        this.f202c = new java.lang.Object();
        this.f201b = executor;
        this.f203d = bVar;
    }
}
