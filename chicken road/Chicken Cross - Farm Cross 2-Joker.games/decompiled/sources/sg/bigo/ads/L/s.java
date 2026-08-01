package sg.bigo.ads.L;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12396a;
    public final /* synthetic */ N b;

    public s(N n, ViewGroup viewGroup) {
        this.b = n;
        this.f12396a = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n = this.b;
        if (n.u) {
            return;
        }
        n.F();
        N.a(this.b, this.f12396a);
    }
}
