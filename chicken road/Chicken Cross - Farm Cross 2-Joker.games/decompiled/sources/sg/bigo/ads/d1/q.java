package sg.bigo.ads.d1;

import sg.bigo.ads.api.VideoController;

/* loaded from: classes3.dex */
public final class q implements VideoController {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.r1.q f12739a;
    public VideoController.VideoLifeCallback b;
    public sg.bigo.ads.N.j c;
    public sg.bigo.ads.N.i d;
    public sg.bigo.ads.N.h e;

    public q(sg.bigo.ads.r1.q qVar) {
        this.f12739a = qVar;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final sg.bigo.ads.N.h getBackupLoadCallback() {
        return this.e;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final sg.bigo.ads.N.i getLoadHTMLCallback() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final sg.bigo.ads.N.j getProgressChangeListener() {
        return this.c;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final VideoController.VideoLifeCallback getVideoLifeCallback() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final boolean isMuted() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        return qVar.b();
    }

    @Override // sg.bigo.ads.api.VideoController
    public final boolean isPaused() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        return qVar.getPlayStatus() == 3;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final boolean isPlaying() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        return qVar.getPlayStatus() == 2;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void mute(boolean z) {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        qVar.setMute(z);
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void notifyBackupResourceReady() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        if (qVar instanceof sg.bigo.ads.r1.n) {
            ((sg.bigo.ads.r1.n) qVar).i();
        }
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void notifyPlayViewRegister() {
        sg.bigo.ads.n1.q.f13217a.a(this.f12739a);
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void notifyResourceReady() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        if (qVar instanceof sg.bigo.ads.r1.n) {
            ((sg.bigo.ads.r1.n) qVar).j();
        }
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void pause() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        qVar.i = true;
        qVar.a();
        qVar.a(8);
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void play() {
        sg.bigo.ads.n1.r rVar = sg.bigo.ads.n1.q.f13217a;
        sg.bigo.ads.r1.q qVar = this.f12739a;
        rVar.getClass();
        if (qVar.i) {
            qVar.a(9);
        }
        qVar.b(true);
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void setBackupLoadCallback(sg.bigo.ads.N.h hVar) {
        this.e = hVar;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void setLoadHTMLCallback(sg.bigo.ads.N.i iVar) {
        this.d = iVar;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void setNeedPauseWhenVisiblePercentEqual(boolean z) {
        sg.bigo.ads.r1.q qVar = this.f12739a;
        if (qVar != null) {
            qVar.setNeedPauseWhenVisiblePercentEqual(z);
        }
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void setProgressChangeListener(sg.bigo.ads.N.j jVar) {
        this.c = jVar;
    }

    @Override // sg.bigo.ads.api.VideoController
    public final void setVideoLifeCallback(VideoController.VideoLifeCallback videoLifeCallback) {
        this.b = videoLifeCallback;
    }
}
