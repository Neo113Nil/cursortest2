package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f8601b;

    public /* synthetic */ a1(Toolbar toolbar, int i7) {
        this.f8600a = i7;
        this.f8601b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8600a) {
            case 0:
                d1 d1Var = this.f8601b.f8543g0;
                m.m mVar = d1Var == null ? null : d1Var.f8613b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f8601b.n();
                break;
        }
    }
}
