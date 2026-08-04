package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f8355b;

    public /* synthetic */ H0(SearchView searchView, int i7) {
        this.f8354a = i7;
        this.f8355b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8354a) {
            case 0:
                this.f8355b.t();
                break;
            default:
                Y.c cVar = this.f8355b.f8440i0;
                if (cVar instanceof U0) {
                    cVar.b(null);
                }
                break;
        }
    }
}
