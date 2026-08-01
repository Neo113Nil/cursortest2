package sg.bigo.ads.t;

import android.view.View;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13310a;

    public h(i iVar) {
        this.f13310a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        View view;
        if (sg.bigo.ads.e.h.a(this.f13310a.A) || (view = (iVar = this.f13310a).m0) == null) {
            return;
        }
        iVar.o0 = false;
        view.setVisibility(8);
    }
}
