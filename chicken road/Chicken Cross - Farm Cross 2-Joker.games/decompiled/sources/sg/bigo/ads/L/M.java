package sg.bigo.ads.L;

import android.view.ViewGroup;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class M implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12377a;
    public final /* synthetic */ N b;

    public M(N n, ViewGroup viewGroup) {
        this.b = n;
        this.f12377a = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5241m c5241m;
        N n = this.b;
        if (n.u) {
            return;
        }
        AbstractC5446j.a(n.f0);
        sg.bigo.ads.M.E e = this.b.S;
        if (e != null && (c5241m = e.b) != null && c5241m.e == this) {
            c5241m.e = null;
        }
        AbstractC5446j.b(new L(this));
    }
}
