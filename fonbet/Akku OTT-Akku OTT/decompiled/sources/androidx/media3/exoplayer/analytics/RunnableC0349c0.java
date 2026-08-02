package androidx.media3.exoplayer.analytics;

import com.google.firebase.installations.FirebaseInstallations;

/* renamed from: androidx.media3.exoplayer.analytics.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0349c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0349c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DefaultAnalyticsCollector) this.b).releaseInternal();
                break;
            default:
                ((FirebaseInstallations) this.b).lambda$getId$1();
                break;
        }
    }
}
