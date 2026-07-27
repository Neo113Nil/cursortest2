package sg.bigo.ads.L;

import android.view.View;
import android.view.WindowInsets;
import sg.bigo.ads.e0.C5085c;

/* loaded from: classes3.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12403a;
    public final /* synthetic */ N b;

    public z(N n, View view) {
        this.b = n;
        this.f12403a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5085c c5085c;
        WindowInsets rootWindowInsets = this.f12403a.getRootWindowInsets();
        if (rootWindowInsets == null || (c5085c = this.b.i0) == null) {
            return;
        }
        c5085c.a(rootWindowInsets);
    }
}
