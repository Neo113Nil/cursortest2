package androidx.media3.session;

import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;

/* renamed from: androidx.media3.session.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0564q3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MediaSession.ControllerInfo c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0564q3(MediaSessionImpl mediaSessionImpl, boolean z, MediaSession.ControllerInfo controllerInfo, Runnable runnable) {
        this.d = mediaSessionImpl;
        this.b = z;
        this.c = controllerInfo;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaSessionImpl) this.d).lambda$applyMediaButtonKeyEvent$33(this.b, this.c, (Runnable) this.e);
                break;
            default:
                ((MediaSessionLegacyStub.AnonymousClass1) this.d).lambda$onSuccess$0((MediaSession.MediaItemsWithStartPosition) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ RunnableC0564q3(MediaSessionLegacyStub.AnonymousClass1 anonymousClass1, MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z, MediaSession.ControllerInfo controllerInfo) {
        this.d = anonymousClass1;
        this.e = mediaItemsWithStartPosition;
        this.b = z;
        this.c = controllerInfo;
    }
}
