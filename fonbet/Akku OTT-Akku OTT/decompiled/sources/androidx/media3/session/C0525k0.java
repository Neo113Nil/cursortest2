package androidx.media3.session;

import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* renamed from: androidx.media3.session.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0525k0 implements MediaControllerImplBase.RemoteSessionTask, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0525k0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$setVideoSurfaceHolder$72(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onTrackSelectionParametersChanged(i, (TrackSelectionParameters) this.a);
    }
}
