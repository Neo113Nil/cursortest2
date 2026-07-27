package sg.bigo.ads.C;

import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12235a;
    public final /* synthetic */ sg.bigo.ads.Q.c b;
    public final /* synthetic */ sg.bigo.ads.P.c c;
    public final /* synthetic */ t d;

    public o(t tVar, String str, sg.bigo.ads.Q.c cVar, InterfaceC5087a interfaceC5087a) {
        this.d = tVar;
        this.f12235a = str;
        this.b = cVar;
        this.c = interfaceC5087a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.b, this.c, t.a(this.d, this.f12235a), false);
    }
}
