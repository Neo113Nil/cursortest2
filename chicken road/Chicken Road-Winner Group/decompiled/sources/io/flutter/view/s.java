package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f9463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f9464b;

    public s(t tVar, long j3) {
        this.f9464b = tVar;
        this.f9463a = j3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long nanoTime = System.nanoTime() - j3;
        long j4 = nanoTime < 0 ? 0L : nanoTime;
        t tVar = this.f9464b;
        tVar.f9467b.onVsync(j4, tVar.f9466a, this.f9463a);
        tVar.f9468c = this;
    }
}
