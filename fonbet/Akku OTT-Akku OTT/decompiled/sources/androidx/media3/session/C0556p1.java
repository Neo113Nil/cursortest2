package androidx.media3.session;

import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0556p1 implements MediaControllerImplBase.RemoteSessionTask, MediaSessionImpl.RemoteControllerTask, MediaSessionStub.ControllerPlayerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0556p1(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$pause$6(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.setCustomLayout(i, (com.google.common.collect.G) this.a);
    }

    @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
    public void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        ((Consumer) this.a).accept(playerWrapper);
    }
}
