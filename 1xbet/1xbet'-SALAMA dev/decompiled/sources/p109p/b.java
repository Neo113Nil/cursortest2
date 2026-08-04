package p109p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f15627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f15628c;

    public /* synthetic */ b(f fVar, Bundle bundle, int i7) {
        this.f15626a = i7;
        this.f15628c = fVar;
        this.f15627b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15626a) {
            case 0:
                this.f15628c.f15646b.onUnminimized(this.f15627b);
                break;
            case 1:
                this.f15628c.f15646b.onMessageChannelReady(this.f15627b);
                break;
            case 2:
                this.f15628c.f15646b.onWarmupCompleted(this.f15627b);
                break;
            default:
                this.f15628c.f15646b.onMinimized(this.f15627b);
                break;
        }
    }
}
