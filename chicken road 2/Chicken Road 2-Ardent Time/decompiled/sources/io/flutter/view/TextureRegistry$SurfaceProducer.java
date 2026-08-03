package io.flutter.view;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceProducer {
    android.view.Surface getForcedNewSurface();

    int getHeight();

    android.view.Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(io.flutter.view.p pVar);

    void setSize(int i2, int i3);
}
