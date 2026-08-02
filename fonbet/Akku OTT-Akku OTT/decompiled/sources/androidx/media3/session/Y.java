package androidx.media3.session;

import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaControllerStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y implements MediaControllerImplBase.RemoteSessionTask, MediaControllerStub.ControllerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y(int i, SessionError sessionError) {
        this.a = i;
        this.b = sessionError;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.b).lambda$decreaseDeviceVolume$61(this.a, iMediaSession, i);
    }

    public /* synthetic */ Y(MediaControllerImplBase mediaControllerImplBase, int i) {
        this.b = mediaControllerImplBase;
        this.a = i;
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onError(this.a, (SessionError) this.b);
    }
}
