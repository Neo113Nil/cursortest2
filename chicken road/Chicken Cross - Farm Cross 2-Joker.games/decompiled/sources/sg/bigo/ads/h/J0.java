package sg.bigo.ads.h;

import android.content.Context;
import android.os.SystemClock;
import android.widget.FrameLayout;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class J0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12831a;
    public final /* synthetic */ sg.bigo.ads.C.l b;
    public final /* synthetic */ sg.bigo.ads.P.c c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Y0 e;

    public J0(Y0 y0, Context context, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar, FrameLayout frameLayout, int i, boolean z) {
        this.e = y0;
        this.f12831a = context;
        this.b = lVar;
        this.c = cVar;
        this.d = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y0 y0 = this.e;
        Context context = this.f12831a;
        sg.bigo.ads.C.l lVar = this.b;
        sg.bigo.ads.P.c cVar = this.c;
        FrameLayout frameLayout = this.d;
        if (!y0.r) {
            P0 p0 = new P0(context, frameLayout, lVar, cVar, y0);
            V0 v0 = y0.M;
            if (v0 != null) {
                y0.N = v0.a(p0);
            } else {
                p0.run();
            }
            y0.i = frameLayout;
            return;
        }
        FrameLayout frameLayout2 = y0.j;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            y0.a(frameLayout);
            frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        y0.i = frameLayout2;
        y0.r = false;
        if ((cVar instanceof InterfaceC5087a) && y0.y == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y0.y = elapsedRealtime;
            ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).L0 = elapsedRealtime;
        }
        X0 x0 = y0.L;
        int i = y0.w;
        boolean z = y0.v;
        x0.getClass();
        sg.bigo.ads.s1.b.b(X0.a(i, z), y0.x, "1", cVar);
    }
}
