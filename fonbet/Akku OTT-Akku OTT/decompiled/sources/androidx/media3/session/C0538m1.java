package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0538m1 implements MediaControllerImplBase.RemoteSessionTask, MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0538m1(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$getLibraryRoot$66;
        lambda$getLibraryRoot$66 = MediaSessionStub.lambda$getLibraryRoot$66((MediaLibraryService.LibraryParams) this.a, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i);
        return lambda$getLibraryRoot$66;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$seekBack$12(iMediaSession, i);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onSessionExtrasChanged(i, (Bundle) this.a);
    }
}
