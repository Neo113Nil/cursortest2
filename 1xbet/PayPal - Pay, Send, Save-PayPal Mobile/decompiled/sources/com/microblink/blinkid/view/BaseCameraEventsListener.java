package com.microblink.blinkid.view;

/* loaded from: classes.dex */
public interface BaseCameraEventsListener extends com.microblink.blinkid.hardware.camera.AutofocusListener {
    void onCameraPreviewStarted();

    void onCameraPreviewStopped();

    void onError(java.lang.Throwable th);
}
