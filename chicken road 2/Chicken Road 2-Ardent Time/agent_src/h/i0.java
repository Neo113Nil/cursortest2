package h;

/* loaded from: classes.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3182a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3183b;

    public i0(h.n0 n0Var) {
        this.f3183b = n0Var;
        n0Var.f3206a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.f3182a) {
            case 0:
                h.j0 j0Var = ((androidx.appcompat.widget.Toolbar) this.f3183b).f2130I;
                g.k kVar = j0Var == null ? null : j0Var.f3185b;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                h.n0 n0Var = (h.n0) this.f3183b;
                if (n0Var.f3216k != null) {
                    n0Var.getClass();
                    break;
                }
                break;
        }
    }

    public i0(androidx.appcompat.widget.Toolbar toolbar) {
        this.f3183b = toolbar;
    }
}
