package androidx.media3.session;

import androidx.media3.common.MediaItem;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0501g4 implements MediaSessionLegacyStub.SessionTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0501g4(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$addMediaItem$34;
        lambda$addMediaItem$34 = MediaSessionStub.lambda$addMediaItem$34((MediaItem) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$addMediaItem$34;
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onPlay$4(controllerInfo);
    }
}
