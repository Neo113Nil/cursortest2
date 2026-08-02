package androidx.media3.exoplayer.source.preload;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* renamed from: androidx.media3.exoplayer.source.preload.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0438d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0438d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DefaultPreloadManager) this.b).lambda$releaseInternal$1();
                break;
            default:
                ((UserMetadata) this.b).serializeUserDataIfNeeded();
                break;
        }
    }
}
