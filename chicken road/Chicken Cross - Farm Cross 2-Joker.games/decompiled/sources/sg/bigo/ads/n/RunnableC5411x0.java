package sg.bigo.ads.n;

import android.view.View;
import android.widget.Button;

/* renamed from: sg.bigo.ads.n.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5411x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13197a;
    public final /* synthetic */ Button b;
    public final /* synthetic */ C5413y0 c;

    public RunnableC5411x0(C5413y0 c5413y0, View view, Button button) {
        this.c = c5413y0;
        this.f13197a = view;
        this.b = button;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.c.d)) {
            return;
        }
        C5389m i = this.c.i();
        C5409w0 c5409w0 = new C5409w0(this);
        if (i.b) {
            this.c.a(this.b, c5409w0);
        } else {
            sg.bigo.ads.h.T.a(this.b, i.f13179a, c5409w0);
        }
    }
}
