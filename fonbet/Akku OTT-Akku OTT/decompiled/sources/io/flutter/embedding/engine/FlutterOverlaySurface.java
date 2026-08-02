package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class FlutterOverlaySurface {

    /* renamed from: id, reason: collision with root package name */
    private final int f121id;

    @NonNull
    private final Surface surface;

    public FlutterOverlaySurface(int i, @NonNull Surface surface) {
        this.f121id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.f121id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
