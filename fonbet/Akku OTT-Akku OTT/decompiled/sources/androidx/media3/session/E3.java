package androidx.media3.session;

import androidx.media3.common.Tracks;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class E3 implements MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ E3(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$sendSessionResultSuccess$1;
        lambda$sendSessionResultSuccess$1 = MediaSessionStub.lambda$sendSessionResultSuccess$1((MediaSessionStub.ControllerPlayerTask) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$sendSessionResultSuccess$1;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onTracksChanged(i, (Tracks) this.a);
    }
}
