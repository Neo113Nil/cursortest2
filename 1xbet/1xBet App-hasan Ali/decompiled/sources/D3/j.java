package D3;

import A0.C;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f956k;

    /* renamed from: l, reason: collision with root package name */
    public final m f957l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f958m;

    /* renamed from: n, reason: collision with root package name */
    public final i f959n;

    public j(m mVar, i iVar, int i) {
        this.f956k = i;
        switch (i) {
            case 1:
                this.f958m = new Object();
                this.f957l = mVar;
                this.f959n = iVar;
                break;
            default:
                this.f958m = new Object();
                this.f957l = mVar;
                this.f959n = iVar;
                break;
        }
    }

    private final void b(o oVar) {
        if (oVar.f969d) {
            synchronized (this.f958m) {
                try {
                    if (this.f959n == null) {
                        return;
                    }
                    m mVar = this.f957l;
                    C c5 = new C(2, this);
                    mVar.getClass();
                    c5.run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // D3.k
    public final void a(o oVar) {
        switch (this.f956k) {
            case 0:
                b(oVar);
                return;
            default:
                if (oVar.d()) {
                    synchronized (this.f958m) {
                        try {
                            if (this.f959n != null) {
                                m mVar = this.f957l;
                                h hVar = new h(4, this, oVar);
                                mVar.getClass();
                                hVar.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }
}
