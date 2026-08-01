package sg.bigo.ads.h;

import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12949a;

    public z2(H2 h2) {
        this.f12949a = h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5163f0 abstractC5163f0 = this.f12949a.e;
        if (abstractC5163f0 != null) {
            ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) abstractC5163f0).D().e())).E = 3;
            this.f12949a.a(9, ((C5185l1) this.f12949a.e).a((C5202r0) null));
        }
    }
}
