package sg.bigo.ads.z;

import android.view.View;
import sg.bigo.ads.e.h;

/* renamed from: sg.bigo.ads.z.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5525c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f13423a;

    public RunnableC5525c(g gVar) {
        this.f13423a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        View view;
        if (h.a((h) this.f13423a.e) || (view = (gVar = this.f13423a).m) == null) {
            return;
        }
        gVar.o = false;
        view.setVisibility(8);
    }
}
