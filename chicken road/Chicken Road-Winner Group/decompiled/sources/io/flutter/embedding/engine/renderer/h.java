package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f9139a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f9140b;

    public h(long j3, FlutterJNI flutterJNI) {
        this.f9139a = j3;
        this.f9140b = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f9140b;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f9139a);
        }
    }
}
