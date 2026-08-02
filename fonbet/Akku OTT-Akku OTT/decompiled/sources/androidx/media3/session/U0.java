package androidx.media3.session;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class U0 implements ListenerSet.Event, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ U0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onPlaybackParametersChanged((PlaybackParameters) this.a);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onRewind$15(controllerInfo);
    }
}
