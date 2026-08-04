package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f14353b;

    public q(r rVar, long j) {
        this.f14353b = rVar;
        this.f14352a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long jNanoTime = System.nanoTime() - j;
        long j3 = jNanoTime < 0 ? 0L : jNanoTime;
        r rVar = this.f14353b;
        ((FlutterJNI) rVar.f14357b).onVsync(j3, rVar.f14356a, this.f14352a);
        rVar.f14358c = this;
    }
}
