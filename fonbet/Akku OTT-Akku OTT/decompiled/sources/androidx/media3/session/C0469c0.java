package androidx.media3.session;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaControllerImplBase;

/* renamed from: androidx.media3.session.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0469c0 implements MediaControllerImplBase.RemoteSessionTask, Consumer {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0469c0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((PlayerWrapper) obj).setPlaylistMetadata((MediaMetadata) this.a);
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase) this.a).lambda$clearVideoSurface$69(iMediaSession, i);
    }
}
