package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class M1 implements Consumer, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaControllerImplLegacy) this.a).lambda$updateControllerInfo$25((MediaControllerImplLegacy.ControllerInfo) this.b, (MediaController.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$onCustomCommand$24;
        lambda$onCustomCommand$24 = MediaSessionStub.lambda$onCustomCommand$24((SessionCommand) this.a, (Bundle) this.b, mediaSessionImpl, controllerInfo, i);
        return lambda$onCustomCommand$24;
    }
}
