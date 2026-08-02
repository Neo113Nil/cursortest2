package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaControllerStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class O implements ListenerSet.Event, MediaControllerImplBase.RemoteSessionTask, MediaControllerStub.ControllerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ O(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) this.a);
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$seekToNext$44(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onConnected((ConnectionState) this.a);
    }
}
