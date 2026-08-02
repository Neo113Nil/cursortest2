package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0618z3 implements MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0618z3(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$setRating$26;
        lambda$setRating$26 = MediaSessionStub.lambda$setRating$26((Rating) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$setRating$26;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onAvailableCommandsChangedFromPlayer(i, (Player.Commands) this.a);
    }
}
