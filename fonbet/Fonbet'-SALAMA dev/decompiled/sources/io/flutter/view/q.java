package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes2.dex */
public final class q implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f14346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f14347b;

    public q(r rVar, long j) {
        this.f14347b = rVar;
        this.f14346a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long nanoTime = System.nanoTime() - j;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        r rVar = this.f14347b;
        ((FlutterJNI) rVar.f14351b).onVsync(j3, rVar.f14350a, this.f14346a);
        rVar.f14352c = this;
    }
}
