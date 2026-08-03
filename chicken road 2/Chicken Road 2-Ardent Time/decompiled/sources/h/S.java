package h;

/* loaded from: classes.dex */
public final class S implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3112b;

    public /* synthetic */ S(androidx.appcompat.widget.SearchView searchView, int i2) {
        this.f3111a = i2;
        this.f3112b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3111a) {
            case 0:
                this.f3112b.q();
                break;
            default:
                D.c cVar = this.f3112b.f2058S;
                if (cVar instanceof h.d0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
