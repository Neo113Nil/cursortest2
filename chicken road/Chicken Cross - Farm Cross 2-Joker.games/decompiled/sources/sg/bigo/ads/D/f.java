package sg.bigo.ads.D;

import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaView f12251a;
    public final /* synthetic */ g b;

    public f(g gVar, MediaView mediaView) {
        this.b = gVar;
        this.f12251a = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12251a.removeAllViews();
        this.b.u0.a(this.f12251a);
    }
}
