package sg.bigo.ads.h;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12839a;
    public final /* synthetic */ sg.bigo.ads.C.l b;
    public final /* synthetic */ sg.bigo.ads.P.c c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Y0 e;

    public M0(Context context, FrameLayout frameLayout, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar, Y0 y0) {
        this.e = y0;
        this.f12839a = context;
        this.b = lVar;
        this.c = cVar;
        this.d = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y0 y0 = this.e;
        Context context = this.f12839a;
        sg.bigo.ads.C.l lVar = this.b;
        sg.bigo.ads.P.c cVar = this.c;
        FrameLayout frameLayout = this.d;
        y0.getClass();
        P0 p0 = new P0(context, frameLayout, lVar, cVar, y0);
        V0 v0 = y0.M;
        if (v0 != null) {
            y0.N = v0.a(p0);
        } else {
            p0.run();
        }
    }
}
