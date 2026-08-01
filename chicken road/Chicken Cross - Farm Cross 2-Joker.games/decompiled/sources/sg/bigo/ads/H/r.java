package sg.bigo.ads.H;

import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.h.C5185l1;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12319a;

    public r(s sVar) {
        this.f12319a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f12319a;
        if (!sVar.l0 && !sVar.w && sVar.z != null && sVar.R0()) {
            sVar.w = true;
            ((C5185l1) sVar.e).D().a((sg.bigo.ads.U.j) null, 8, 22);
        }
        if (this.f12319a.k0()) {
            this.f12319a.o(1);
            return;
        }
        VideoController W = this.f12319a.W();
        if (W != null) {
            W.play();
        }
    }
}
