package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.session.MediaControllerStub;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* renamed from: androidx.media3.session.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0569r2 implements MediaControllerStub.ControllerTask, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ Bundle a;

    public /* synthetic */ C0569r2(Bundle bundle) {
        this.a = bundle;
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onExtrasChanged(this.a);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onSessionExtrasChanged(i, this.a);
    }
}
