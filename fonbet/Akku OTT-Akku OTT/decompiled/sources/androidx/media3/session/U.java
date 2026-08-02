package androidx.media3.session;

import android.view.Surface;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class U implements MediaControllerImplBase.RemoteSessionTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ U(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$handleMediaItemsWithStartPositionWhenReady$9;
        lambda$handleMediaItemsWithStartPositionWhenReady$9 = MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$9((MediaSessionStub.SessionTask) this.a, (MediaSessionStub.MediaItemsWithStartPositionPlayerTask) this.b, mediaSessionImpl, controllerInfo, i);
        return lambda$handleMediaItemsWithStartPositionWhenReady$9;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$setVideoSurface$70((Surface) this.b, iMediaSession, i);
    }
}
