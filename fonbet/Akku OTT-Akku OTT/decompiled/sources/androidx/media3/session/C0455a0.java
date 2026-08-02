package androidx.media3.session;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0455a0 implements ListenerSet.Event, MediaControllerImplBase.RemoteSessionTask, MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0455a0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onPlaybackParametersChanged((PlaybackParameters) this.a);
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$sendSessionResultWhenReady$3;
        lambda$sendSessionResultWhenReady$3 = MediaSessionStub.lambda$sendSessionResultWhenReady$3((MediaSessionStub.SessionTask) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$sendSessionResultWhenReady$3;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$increaseDeviceVolume$55(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.setCustomLayout(i, (com.google.common.collect.G) this.a);
    }
}
