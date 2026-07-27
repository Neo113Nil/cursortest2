package sg.bigo.ads.M;

import sg.bigo.ads.api.VideoController;

/* loaded from: classes3.dex */
public final class S implements VideoController.VideoLifeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f12436a;

    public S(W w) {
        this.f12436a = w;
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onMuteChange(boolean z) {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoEnd() {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPause() {
        this.f12436a.d.D();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPlay() {
        this.f12436a.d.E();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoStart() {
    }
}
