package sg.bigo.ads.D;

import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaView f12250a;
    public final /* synthetic */ g b;

    public e(g gVar, MediaView mediaView) {
        this.b = gVar;
        this.f12250a = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12250a.removeAllViews();
        super/*sg.bigo.ads.C.t*/.a(this.f12250a);
    }
}
