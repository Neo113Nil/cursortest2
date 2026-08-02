package androidx.media3.session;

import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaControllerStub;

/* renamed from: androidx.media3.session.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0498g1 implements MediaControllerImplBase.RemoteSessionTask, MediaControllerStub.ControllerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0498g1(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$clearMediaItems$36(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.notifyPeriodicSessionPositionInfoChanged((SessionPositionInfo) this.a);
    }
}
