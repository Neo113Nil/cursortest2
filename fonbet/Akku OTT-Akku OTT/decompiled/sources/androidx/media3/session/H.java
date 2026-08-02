package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaControllerImplLegacy;

/* loaded from: classes3.dex */
public final /* synthetic */ class H implements MediaControllerImplBase.RemoteSessionTask, ListenerSet.Event {
    public final /* synthetic */ Object a;

    public /* synthetic */ H(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplLegacy.lambda$updateControllerInfo$18((MediaControllerImplLegacy.ControllerInfo) this.a, (Player.Listener) obj);
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$seekToNextMediaItem$42(iMediaSession, i);
    }
}
