package io.flutter.embedding.engine;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FlutterOverlaySurface {
    private final int id;
    private final android.view.Surface surface;

    public FlutterOverlaySurface(int i2, android.view.Surface surface) {
        this.id = i2;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public android.view.Surface getSurface() {
        return this.surface;
    }
}
