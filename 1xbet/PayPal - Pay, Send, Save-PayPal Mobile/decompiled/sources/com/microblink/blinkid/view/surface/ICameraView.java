package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public interface ICameraView {
    public static final float PREVIEW_SCALE_NO_ZOOM = 1.0f;

    public interface CameraViewEventListener {
        void onCameraPinchEvent(float f);

        void onCameraTapEvent(float f, float f2);
    }

    android.graphics.Rect convertRectangleToActualRect(android.graphics.RectF rectF);

    void dispose();

    android.view.View getView();

    int getVisibleHeight();

    int getVisibleWidth();

    void installCallback(com.microblink.blinkid.secured.IlIllllllI ilIllllllI);

    void removeCallback();

    void setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode);

    void setCameraViewEventListener(com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener);

    void setDeviceNaturalOrientationLandscape(boolean z);

    void setHostActivityOrientation(int i);

    void setPreviewSize(int i, int i2);

    void setPreviewZoomScale(float f);

    void setRotation(int i);
}
