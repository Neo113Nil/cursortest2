package sg.bigo.ads.K0;

import android.view.View;

/* loaded from: classes3.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View.OnLayoutChangeListener f12350a;
    public final /* synthetic */ U b;

    public T(U u, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.b = u;
        this.f12350a = onLayoutChangeListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.removeOnLayoutChangeListener(this.f12350a);
    }
}
