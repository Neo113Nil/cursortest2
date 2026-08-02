package androidx.media3.session;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class V1 implements ListenerSet.IterationFinishedEvent, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ V1(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((MediaControllerImplLegacy) this.a).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onError(i, (SessionError) this.a);
    }
}
