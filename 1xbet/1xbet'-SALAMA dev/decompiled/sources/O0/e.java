package O0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4836a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4837b;

    public e(ViewGroup viewGroup) {
        this.f4837b = viewGroup;
    }

    @Override // O0.n, O0.l
    public final void a() {
        P6.b.N(this.f4837b, false);
    }

    @Override // O0.n, O0.l
    public final void b() {
        P6.b.N(this.f4837b, false);
        this.f4836a = true;
    }

    @Override // O0.n, O0.l
    public final void d() {
        P6.b.N(this.f4837b, true);
    }

    @Override // O0.l
    public final void e(m mVar) {
        if (!this.f4836a) {
            P6.b.N(this.f4837b, false);
        }
        mVar.v(this);
    }
}
