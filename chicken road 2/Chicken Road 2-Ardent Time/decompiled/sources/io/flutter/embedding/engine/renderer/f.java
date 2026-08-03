package io.flutter.embedding.engine.renderer;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f7649a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f7650b;

    public f(long j2, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f7649a = j2;
        this.f7650b = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f7650b;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f7649a);
        }
    }
}
