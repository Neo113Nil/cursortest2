package sg.bigo.ads.C;

import android.content.Context;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12221a;
    public final /* synthetic */ B b;

    public A(B b, int i) {
        this.b = b;
        this.f12221a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12221a;
        if (i != 0) {
            B b = this.b;
            b.e.a(b.f12222a, 1006, i, "Invalid VPAID media files.");
            return;
        }
        B b2 = this.b;
        z zVar = new z(this);
        b2.getClass();
        sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
        Context context = b2.b;
        InterfaceC5087a interfaceC5087a = b2.c;
        if (nVar.b.get()) {
            if (AbstractC5446j.c == Thread.currentThread()) {
                nVar.a(context, interfaceC5087a, (sg.bigo.ads.n1.m) zVar, true);
            } else {
                AbstractC5446j.a(1, null, new sg.bigo.ads.n1.g(nVar, context, interfaceC5087a, zVar), 0L);
            }
        }
    }
}
