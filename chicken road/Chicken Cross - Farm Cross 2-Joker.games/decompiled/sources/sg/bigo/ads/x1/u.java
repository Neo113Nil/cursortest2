package sg.bigo.ads.x1;

import android.content.Context;

/* loaded from: classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13404a;
    public final /* synthetic */ w b;

    public u(w wVar, Context context) {
        this.b = wVar;
        this.f13404a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.b;
        Context context = this.f13404a;
        w.a(wVar.d);
        sg.bigo.ads.w1.d.a(context, 0, wVar.c, new sg.bigo.ads.B0.d(wVar.d), wVar.e, wVar.i, wVar.h, false, wVar.g, wVar.f13406a, new v(wVar, context));
    }
}
