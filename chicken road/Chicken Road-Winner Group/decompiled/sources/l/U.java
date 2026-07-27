package l;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f9754b;

    public /* synthetic */ U(SearchView searchView, int i3) {
        this.f9753a = i3;
        this.f9754b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9753a) {
            case 0:
                this.f9754b.q();
                break;
            default:
                I.c cVar = this.f9754b.f1995O;
                if (cVar instanceof f0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
