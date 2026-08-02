package androidx.media3.session;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaControllerStub;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* renamed from: androidx.media3.session.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0539m2 implements MediaControllerStub.ControllerTask, MediaSessionImpl.RemoteControllerTask, MediaControllerImplBase.RemoteSessionTask {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0539m2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$setPlaybackParameters$15((PlaybackParameters) this.b, iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onAvailableCommandsChangedFromSession((SessionCommands) this.a, (Player.Commands) this.b);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onAvailableCommandsChangedFromSession(i, (SessionCommands) this.a, (Player.Commands) this.b);
    }
}
