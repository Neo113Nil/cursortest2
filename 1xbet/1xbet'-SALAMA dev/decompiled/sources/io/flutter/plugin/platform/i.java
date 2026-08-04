package io.flutter.plugin.platform;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public interface i {
    long a();

    void b(int i7, int i8);

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
