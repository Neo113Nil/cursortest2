package sg.bigo.ads.h;

import android.content.Context;

/* loaded from: classes3.dex */
public final class G0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12821a;
    public final /* synthetic */ sg.bigo.ads.C.l b;
    public final /* synthetic */ sg.bigo.ads.P.c c;
    public final /* synthetic */ Y0 d;

    public G0(Y0 y0, Context context, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar) {
        this.d = y0;
        this.f12821a = context;
        this.b = lVar;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f12821a, this.b, this.c, 0);
    }
}
