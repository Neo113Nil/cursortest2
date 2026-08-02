package p;

import android.os.Bundle;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1515b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f15621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC1519f f15622c;

    public /* synthetic */ RunnableC1515b(BinderC1519f binderC1519f, Bundle bundle, int i7) {
        this.f15620a = i7;
        this.f15622c = binderC1519f;
        this.f15621b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15620a) {
            case 0:
                this.f15622c.f15640b.onUnminimized(this.f15621b);
                break;
            case 1:
                this.f15622c.f15640b.onMessageChannelReady(this.f15621b);
                break;
            case 2:
                this.f15622c.f15640b.onWarmupCompleted(this.f15621b);
                break;
            default:
                this.f15622c.f15640b.onMinimized(this.f15621b);
                break;
        }
    }
}
