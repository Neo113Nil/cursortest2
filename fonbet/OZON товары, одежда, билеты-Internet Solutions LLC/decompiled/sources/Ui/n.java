package Ui;

import Bl0.g0;
import Ui.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4069c f27811a;

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        C4069c c4069c = this.f27811a;
        if (c4069c.f27736e == null) {
            if (c4069c.d0().D0()) {
                c4069c.d0().V0(false);
                Ii.e a02 = c4069c.a0();
                a02.f12568d.post(new g0(c4069c, 1));
                return;
            }
            return;
        }
        if (c4069c.b0().getShimmersCount() <= 0) {
            return;
        }
        uVar = c4069c.f27737f;
        int i11 = o.a.f27813a[uVar.ordinal()];
        if (i11 == 1) {
            c4069c.f27737f = u.READY_TO_RESTORE_SCROLL;
            c4069c.b0().n();
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new Sc.o();
            }
            C4069c.S(c4069c);
        }
    }
}
