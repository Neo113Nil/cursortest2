package androidx.media3.session;

import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;
import java.util.List;

/* renamed from: androidx.media3.session.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0516i5 implements MediaSessionStub.MediaItemPlayerTask {
    @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
    public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        playerWrapper.addMediaItems(list);
    }
}
