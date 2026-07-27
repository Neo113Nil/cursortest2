package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f10119a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f10120b;

    public g(long j2, FlutterJNI flutterJNI) {
        this.f10119a = j2;
        this.f10120b = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f10120b;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f10119a);
        }
    }
}
