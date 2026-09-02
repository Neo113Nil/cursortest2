package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f845b;

    public s(t tVar, long j2) {
        this.f845b = tVar;
        this.f844a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        t tVar = this.f845b;
        tVar.f849b.onVsync(j3, tVar.f848a, this.f844a);
        tVar.f850c = this;
    }
}
