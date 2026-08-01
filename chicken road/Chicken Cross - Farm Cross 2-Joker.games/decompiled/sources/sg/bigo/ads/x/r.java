package sg.bigo.ads.x;

import sg.bigo.ads.api.VideoController;

/* loaded from: classes3.dex */
public final class r implements VideoController.VideoLifeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f13380a;

    public r(s sVar) {
        this.f13380a = sVar;
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onMuteChange(boolean z) {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoEnd() {
        s sVar = this.f13380a;
        if (sVar.F) {
            return;
        }
        sVar.F = true;
        sVar.Z();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPause() {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPlay() {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoStart() {
    }
}
