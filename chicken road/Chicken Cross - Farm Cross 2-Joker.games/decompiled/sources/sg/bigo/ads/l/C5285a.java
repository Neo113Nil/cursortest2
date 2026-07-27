package sg.bigo.ads.l;

import sg.bigo.ads.h.s2;

/* renamed from: sg.bigo.ads.l.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5285a implements sg.bigo.ads.api.c {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.api.c f13050a;
    public final /* synthetic */ C5289e b;

    public C5285a(C5289e c5289e, s2 s2Var) {
        this.b = c5289e;
        this.f13050a = s2Var;
    }

    @Override // sg.bigo.ads.api.c
    public final void a() {
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // sg.bigo.ads.api.c
    public final void b() {
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onMuteChange(boolean z) {
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.onMuteChange(z);
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoEnd() {
        C5289e c5289e = this.b;
        c5289e.d = true;
        C5289e.a(c5289e);
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.onVideoEnd();
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPause() {
        this.b.a(true);
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.onVideoPause();
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPlay() {
        this.b.b(true);
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.onVideoPlay();
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoStart() {
        sg.bigo.ads.api.c cVar = this.f13050a;
        if (cVar != null) {
            cVar.onVideoStart();
        }
    }
}
