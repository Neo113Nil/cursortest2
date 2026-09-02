package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f566b;

    /* renamed from: c, reason: collision with root package name */
    public final FlutterJNI f567c;

    public f(long j2, FlutterJNI flutterJNI) {
        this.f566b = j2;
        this.f567c = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f567c;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f566b);
        }
    }
}
