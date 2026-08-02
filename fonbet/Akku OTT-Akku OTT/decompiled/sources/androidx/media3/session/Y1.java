package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y1 implements ListenerSet.Event, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ Y1(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplLegacy.lambda$updateControllerInfo$17((MediaControllerImplLegacy.ControllerInfo) this.a, (Player.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onStop$6(controllerInfo);
    }
}
