package sg.bigo.ads.P;

import android.view.View;
import android.view.WindowInsets;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.e0.C5085c;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12484a;
    public final /* synthetic */ BaseAdActivityImpl b;

    public l(BaseAdActivityImpl baseAdActivityImpl, View view) {
        this.b = baseAdActivityImpl;
        this.f12484a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5085c c5085c;
        WindowInsets rootWindowInsets = this.f12484a.getRootWindowInsets();
        if (rootWindowInsets == null || (c5085c = this.b.c) == null) {
            return;
        }
        c5085c.a(rootWindowInsets);
    }
}
