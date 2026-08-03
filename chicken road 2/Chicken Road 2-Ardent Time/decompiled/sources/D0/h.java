package D0;

/* loaded from: classes.dex */
public final class h implements D0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* renamed from: b, reason: collision with root package name */
    public final D0.k f205b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f206c;

    /* renamed from: d, reason: collision with root package name */
    public final D0.g f207d;

    public h(D0.k kVar, D0.g gVar, int i2) {
        this.f204a = i2;
        switch (i2) {
            case 1:
                this.f206c = new java.lang.Object();
                this.f205b = kVar;
                this.f207d = gVar;
                break;
            default:
                this.f206c = new java.lang.Object();
                this.f205b = kVar;
                this.f207d = gVar;
                break;
        }
    }

    @Override // D0.i
    public final void a(com.google.android.gms.tasks.Task task) {
        switch (this.f204a) {
            case 0:
                if (((D0.m) task).f216d) {
                    synchronized (this.f206c) {
                        try {
                            if (this.f207d != null) {
                                D0.k kVar = this.f205b;
                                C.b bVar = new C.b(1, this);
                                kVar.getClass();
                                bVar.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                if (task.d() || ((D0.m) task).f216d) {
                    return;
                }
                synchronized (this.f206c) {
                    try {
                        if (this.f207d != null) {
                            this.f205b.getClass();
                            synchronized (this.f206c) {
                                try {
                                    D0.g gVar = this.f207d;
                                    if (gVar != null) {
                                        java.lang.Exception b2 = task.b();
                                        p0.AbstractC0966r.c(b2);
                                        ((D0.m) gVar.f203d).e(b2);
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
