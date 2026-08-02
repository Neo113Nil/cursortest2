package androidx.media3.session;

import androidx.media3.common.MediaMetadata;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0483e0 implements MediaControllerImplBase.RemoteSessionTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0483e0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$subscribe$71;
        lambda$subscribe$71 = MediaSessionStub.lambda$subscribe$71((String) this.a, (MediaLibraryService.LibraryParams) this.b, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i);
        return lambda$subscribe$71;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$setPlaylistMetadata$28((MediaMetadata) this.b, iMediaSession, i);
    }
}
