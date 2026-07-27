package sg.bigo.ads.z;

import sg.bigo.ads.e.h;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f13424a;

    public d(g gVar) {
        this.f13424a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (h.a((h) this.f13424a.e)) {
            return;
        }
        this.f13424a.g.setVisibility(0);
    }
}
