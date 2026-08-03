package io.flutter.view;

/* loaded from: classes.dex */
public final class r implements android.view.Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f7920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1.l f7921b;

    public r(M1.l lVar, long j2) {
        this.f7921b = lVar;
        this.f7920a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = java.lang.System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        M1.l lVar = this.f7921b;
        ((io.flutter.embedding.engine.FlutterJNI) lVar.f1088b).onVsync(j3, lVar.f1087a, this.f7920a);
        lVar.f1089c = this;
    }
}
