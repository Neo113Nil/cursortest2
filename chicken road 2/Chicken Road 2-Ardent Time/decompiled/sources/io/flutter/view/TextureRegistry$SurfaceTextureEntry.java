package io.flutter.view;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    default void setOnTrimMemoryListener(io.flutter.view.o oVar) {
    }

    android.graphics.SurfaceTexture surfaceTexture();
}
