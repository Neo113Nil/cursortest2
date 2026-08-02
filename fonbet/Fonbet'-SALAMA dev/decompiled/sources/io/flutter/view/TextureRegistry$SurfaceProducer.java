package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public interface TextureRegistry$SurfaceProducer {
    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(p pVar);

    void setSize(int i7, int i8);
}
