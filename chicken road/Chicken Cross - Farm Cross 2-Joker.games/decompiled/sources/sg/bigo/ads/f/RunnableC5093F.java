package sg.bigo.ads.f;

import sg.bigo.ads.BigoAdSdk;

/* renamed from: sg.bigo.ads.f.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5093F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5094G f12758a;

    public RunnableC5093F(C5094G c5094g) {
        this.f12758a = c5094g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5095H c5095h = this.f12758a.c;
        sg.bigo.ads.N.d f = c5095h.k.c.f();
        if (f == null) {
            return;
        }
        f.c = 1;
        sg.bigo.ads.X0.o[] oVarArr = new sg.bigo.ads.X0.o[1];
        oVarArr[0] = BigoAdSdk.a(f, new C5091D(c5095h, oVarArr));
    }
}
