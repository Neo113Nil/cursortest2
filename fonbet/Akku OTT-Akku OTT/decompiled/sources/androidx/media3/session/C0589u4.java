package androidx.media3.session;

import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0589u4 implements MediaSessionStub.MediaItemsWithStartPositionPlayerTask {
    @Override // androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask
    public final void run(PlayerWrapper playerWrapper, MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
        MediaUtils.setMediaItemsWithStartIndexAndPosition(playerWrapper, mediaItemsWithStartPosition);
    }
}
