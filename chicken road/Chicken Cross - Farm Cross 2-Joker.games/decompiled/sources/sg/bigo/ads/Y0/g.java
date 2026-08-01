package sg.bigo.ads.Y0;

import android.content.Context;
import android.os.SystemClock;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.P.c f12633a;
    public final sg.bigo.ads.U0.j b;
    public final int c;
    public boolean d = false;
    public sg.bigo.ads.E1.k e;
    public long f;

    public g(sg.bigo.ads.P.c cVar) {
        this.f12633a = cVar;
        sg.bigo.ads.U0.j jVar = ((sg.bigo.ads.U0.b) cVar).z;
        this.b = jVar;
        this.c = jVar.f;
    }

    public final void a(Context context, String str, f fVar) {
        this.f = SystemClock.elapsedRealtime();
        fVar.a(str);
        sg.bigo.ads.E1.k a2 = sg.bigo.ads.E1.k.a(context);
        this.e = a2;
        if (a2 == null) {
            return;
        }
        a2.setWebChromeClient(new sg.bigo.ads.E1.g());
        this.e.setWebViewClient(new C5013c(this, fVar, str));
        this.e.setLeft(0);
        this.e.setTop(0);
        this.e.setRight(AbstractC4963u.c(context));
        this.e.setBottom(context.getResources().getDisplayMetrics().heightPixels - AbstractC4963u.a(context, 55));
        this.e.loadUrl(str);
    }
}
