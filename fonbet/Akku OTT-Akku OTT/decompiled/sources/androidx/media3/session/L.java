package androidx.media3.session;

import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements MediaControllerImplBase.RemoteSessionTask, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ L(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$decreaseDeviceVolume$59(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onSkipToNext$9(controllerInfo);
    }
}
