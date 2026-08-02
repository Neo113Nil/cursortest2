package com.daon.sdk.face.module;

/* loaded from: classes7.dex */
public interface Module {
    java.lang.String getName();

    boolean isSupported(com.daon.sdk.face.license.License license);

    void onConfigurationChanged(android.os.Bundle bundle);

    void onImageSizeChanged(int i, int i2);

    default void reset() {
    }

    void stop();
}
