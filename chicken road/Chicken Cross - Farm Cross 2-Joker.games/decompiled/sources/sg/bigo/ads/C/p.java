package sg.bigo.ads.C;

import android.graphics.Bitmap;
import android.util.Pair;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.t2;
import sg.bigo.ads.h.z2;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class p implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pair f12236a;
    public final /* synthetic */ q b;

    public p(q qVar, Pair pair) {
        this.b = qVar;
        this.f12236a = pair;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        ((sg.bigo.ads.U0.k) this.b.f12237a.c).U0 = 1;
        if (((Boolean) this.f12236a.second).booleanValue()) {
            VideoController videoController = this.b.f12237a.e.getVideoController();
            if (videoController == null || videoController.getLoadHTMLCallback() == null) {
                ((sg.bigo.ads.U0.k) this.b.f12237a.c).P0 = true;
                return;
            }
            H2 h2 = ((t2) videoController.getLoadHTMLCallback()).f12929a;
            if (h2.Q0() || !h2.I0()) {
                return;
            }
            AbstractC5446j.a(2, new z2(h2));
        }
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) this.b.f12237a.c;
        kVar.U0 = 2;
        kVar.V0 = new Pair(bitmap, yVar.e);
        VideoController videoController = this.b.f12237a.e.getVideoController();
        if (videoController != null) {
            videoController.notifyBackupResourceReady();
        }
    }
}
