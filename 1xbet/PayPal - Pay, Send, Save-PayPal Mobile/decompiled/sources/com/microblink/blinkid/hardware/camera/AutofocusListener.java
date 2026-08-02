package com.microblink.blinkid.hardware.camera;

/* loaded from: classes10.dex */
public interface AutofocusListener {
    void onAutofocusFailed();

    void onAutofocusStarted(android.graphics.Rect[] rectArr);

    void onAutofocusStopped(android.graphics.Rect[] rectArr);
}
