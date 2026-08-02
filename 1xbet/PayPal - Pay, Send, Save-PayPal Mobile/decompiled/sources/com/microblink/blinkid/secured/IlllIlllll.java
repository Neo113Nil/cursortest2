package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlllIlllll {
    public static final java.util.List IllIIIIllI;
    public static final java.util.List llIIIlllll;
    public final android.hardware.Camera.Parameters llIIlIlIIl;
    public static final java.util.List IlIllIlIIl = java.util.Arrays.asList("continuous-picture", "macro", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
    public static final java.util.List IllIIIllII = java.util.Arrays.asList("continuous-picture", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "macro");

    static {
        java.util.Arrays.asList("macro", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        llIIIlllll = java.util.Arrays.asList("macro", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        IllIIIIllI = java.util.Collections.singletonList(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
    }

    public IlllIlllll(android.hardware.Camera camera) {
        this.llIIlIlIIl = camera.getParameters();
    }

    public final void IlIllIlIIl() {
        java.util.List<java.lang.String> supportedWhiteBalance = this.llIIlIlIIl.getSupportedWhiteBalance();
        if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            com.microblink.blinkid.util.Log.w(this, "Automatic white balance not supported!!!", new java.lang.Object[0]);
        } else {
            this.llIIlIlIIl.setWhiteBalance(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            com.microblink.blinkid.util.Log.v(this, "Activated automatic white balance correction", new java.lang.Object[0]);
        }
    }

    public final void IllIIIIllI() {
        this.llIIlIlIIl.setPictureFormat(256);
        this.llIIlIlIIl.setJpegQuality(100);
        java.util.List<android.hardware.Camera.Size> supportedPictureSizes = this.llIIlIlIIl.getSupportedPictureSizes();
        if (supportedPictureSizes.isEmpty()) {
            return;
        }
        android.hardware.Camera.Size size = supportedPictureSizes.get(0);
        int i = size.height * size.width;
        for (android.hardware.Camera.Size size2 : supportedPictureSizes) {
            int i2 = size2.height * size2.width;
            if (i2 > i) {
                size = size2;
                i = i2;
            }
        }
        this.llIIlIlIIl.setPictureSize(size.width, size.height);
    }

    public final void IllIIIllII() {
        this.llIIlIlIIl.setPreviewFpsRange(com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY, com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY);
    }

    public final void llIIIlllll() {
        this.llIIlIlIIl.setRecordingHint(true);
        this.llIIlIlIIl.setPictureSize(3264, 2448);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.microblink.blinkid.secured.IlllIlllll llIIlIlIIl(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        this.llIIlIlIIl.setZoom(java.lang.Math.round(f * this.llIIlIlIIl.getMaxZoom()));
        return this;
    }

    public final java.lang.String toString() {
        return this.llIIlIlIIl.flatten();
    }

    public final void llIIlIlIIl() {
        if (this.llIIlIlIIl.isVideoStabilizationSupported()) {
            com.microblink.blinkid.util.Log.i(this, "Enabling video stabilization", new java.lang.Object[0]);
            this.llIIlIlIIl.setVideoStabilization(true);
        }
    }

    public final boolean llIIlIlIIl(boolean z) {
        if (z) {
            this.llIIlIlIIl.setFlashMode("torch");
            return true;
        }
        java.util.List<java.lang.String> supportedFlashModes = this.llIIlIlIIl.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            this.llIIlIlIIl.setFlashMode(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            return true;
        }
        com.microblink.blinkid.util.Log.e(this, "Flash mode OFF not supported!!!!", new java.lang.Object[0]);
        return false;
    }

    public final java.lang.String llIIlIlIIl(java.util.List list) {
        java.util.List<java.lang.String> supportedFocusModes = this.llIIlIlIIl.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return "noSupport";
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (supportedFocusModes.contains(str)) {
                this.llIIlIlIIl.setFocusMode(str);
                return str;
            }
        }
        return "noSupport";
    }
}
