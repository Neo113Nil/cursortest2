package androidx.media3.session;

import androidx.media3.common.MediaMetadata;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0599w2 implements com.google.common.util.concurrent.h, MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0599w2(Object obj) {
        this.a = obj;
    }

    @Override // com.google.common.util.concurrent.h
    public com.google.common.util.concurrent.u apply(Object obj) {
        com.google.common.util.concurrent.u lambda$createMediaItemToBrowserItemAsyncFunction$15;
        lambda$createMediaItemToBrowserItemAsyncFunction$15 = ((MediaLibraryServiceLegacyStub) this.a).lambda$createMediaItemToBrowserItemAsyncFunction$15((LibraryResult) obj);
        return lambda$createMediaItemToBrowserItemAsyncFunction$15;
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$replaceMediaItems$48;
        lambda$replaceMediaItems$48 = MediaSessionStub.lambda$replaceMediaItems$48((com.google.common.collect.G) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$replaceMediaItems$48;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onPlaylistMetadataChanged(i, (MediaMetadata) this.a);
    }
}
