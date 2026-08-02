package androidx.media3.session;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class K2 implements Executor {
    public final /* synthetic */ MediaLibrarySessionImpl a;

    public /* synthetic */ K2(MediaLibrarySessionImpl mediaLibrarySessionImpl) {
        this.a = mediaLibrarySessionImpl;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postOrRunOnApplicationHandler(runnable);
    }
}
