package sg.bigo.ads.h;

import android.view.View;

/* loaded from: classes3.dex */
public final class U1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12857a;
    public final /* synthetic */ C5149b2 b;

    public U1(C5149b2 c5149b2, View view) {
        this.b = c5149b2;
        this.f12857a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.b.e)) {
            return;
        }
        AbstractC5140Q.a(this.f12857a);
    }
}
