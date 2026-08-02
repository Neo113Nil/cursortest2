package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class J0 implements ListenerSet.Event, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ J0(Serializable serializable) {
        this.a = serializable;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onPlayerError((PlaybackException) this.a);
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$addMediaItemsWithIndex$40;
        lambda$addMediaItemsWithIndex$40 = MediaSessionStub.lambda$addMediaItemsWithIndex$40((List) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$addMediaItemsWithIndex$40;
    }
}
