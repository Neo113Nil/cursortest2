package androidx.media3.session;

import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;
import androidx.media3.session.MediaSessionStub;
import java.util.List;

/* renamed from: androidx.media3.session.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0487e4 implements MediaSessionLegacyStub.SessionTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0487e4(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$addMediaItems$38;
        lambda$addMediaItems$38 = MediaSessionStub.lambda$addMediaItems$38((List) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$addMediaItems$38;
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onSkipToNext$8(controllerInfo);
    }
}
