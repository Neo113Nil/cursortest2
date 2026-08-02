package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class lIlIllIIll {
    public final java.util.List IlIllIlIIl;
    public int IllIIIllII = 0;
    public final int llIIIlllll;
    public final android.hardware.Camera llIIlIlIIl;

    public lIlIllIIll(android.hardware.Camera camera) {
        this.llIIIlllll = 230400;
        if (camera == null) {
            com.microblink.blinkid.util.Log.e(this, "Camera cannot be null while initializing camera strategy", new java.lang.Object[0]);
            throw new java.lang.NullPointerException("Camera for CameraStragy cannot be null");
        }
        this.llIIlIlIIl = camera;
        this.llIIIlllll = 230400;
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        this.IlIllIlIIl = supportedPreviewSizes;
        if (com.microblink.blinkid.util.Log.getCurrentLogLevel().ordinal() >= com.microblink.blinkid.util.Log.LogLevel.LOG_VERBOSE.ordinal()) {
            if (supportedPreviewSizes == null) {
                com.microblink.blinkid.util.Log.d(this, "List of supported preview sizes is null!", new java.lang.Object[0]);
                return;
            }
            for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                com.microblink.blinkid.util.Log.d(this, "Camera supported preview size: {}x{}", java.lang.Integer.valueOf(size.width), java.lang.Integer.valueOf(size.height));
            }
        }
    }

    public abstract double llIIlIlIIl(android.hardware.Camera.Size size, double d, long j, com.microblink.blinkid.hardware.camera.CameraType cameraType);

    public abstract android.hardware.Camera.Size llIIlIlIIl(int i, int i2, com.microblink.blinkid.hardware.camera.CameraType cameraType);

    public abstract void llIIlIlIIl();

    public final boolean llIIlIlIIl(android.hardware.Camera.Size size, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        android.hardware.Camera.Size llIIlIlIIl = llIIlIlIIl(cameraType);
        boolean z = size.height * size.width >= this.llIIIlllll;
        boolean z2 = llIIlIlIIl != null && llIIlIlIIl.equals(size);
        if (com.microblink.blinkid.util.Log.getCurrentLogLevel().ordinal() >= com.microblink.blinkid.util.Log.LogLevel.LOG_VERBOSE.ordinal()) {
            com.microblink.blinkid.util.Log.v(this, "Resolution {}x{}: resolution high enough: {}, resolution specific for device: {}", java.lang.Integer.valueOf(size.width), java.lang.Integer.valueOf(size.height), java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
        return z || z2;
    }

    public final android.hardware.Camera.Size llIIlIlIIl(com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        com.microblink.blinkid.secured.IIIllIIlIl iIIllIIlIl;
        android.hardware.Camera camera;
        if (cameraType == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE) {
            com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII().IlIllIlIIl();
            if (IlIllIlIIl != null) {
                iIIllIIlIl = IlIllIlIIl.llIIIlllll;
            }
            iIIllIIlIl = null;
        } else {
            com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl2 = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII().IlIllIlIIl();
            if (IlIllIlIIl2 != null) {
                iIIllIIlIl = IlIllIlIIl2.IllIIIllII;
            }
            iIIllIIlIl = null;
        }
        if (iIIllIIlIl != null && (camera = this.llIIlIlIIl) != null) {
            java.util.Objects.requireNonNull(camera);
            android.hardware.Camera.Size size = new android.hardware.Camera.Size(camera, iIIllIIlIl.llIIlIlIIl, iIIllIIlIl.IlIllIlIIl);
            java.util.List list = this.IlIllIlIIl;
            if (list != null && list.contains(size)) {
                com.microblink.blinkid.util.Log.v(this, "Using device specific resolution {}x{}", java.lang.Integer.valueOf(iIIllIIlIl.llIIlIlIIl), java.lang.Integer.valueOf(iIIllIIlIl.IlIllIlIIl));
                return size;
            }
            com.microblink.blinkid.util.Log.w(this, "Device specific resolution {}x{} is not supported on Camera1 API. If possible, use Camera2 API.", java.lang.Integer.valueOf(iIIllIIlIl.llIIlIlIIl), java.lang.Integer.valueOf(iIIllIIlIl.IlIllIlIIl));
        }
        return null;
    }

    public final android.hardware.Camera.Size llIIlIlIIl(java.util.List list, double d, long j, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        java.util.Iterator it = list.iterator();
        android.hardware.Camera.Size size = null;
        double d2 = Double.POSITIVE_INFINITY;
        while (it.hasNext()) {
            android.hardware.Camera.Size size2 = (android.hardware.Camera.Size) it.next();
            if (size2.width % 4 == 0) {
                double llIIlIlIIl = llIIlIlIIl(size2, d, j, cameraType);
                if (llIIlIlIIl < d2) {
                    size = size2;
                    d2 = llIIlIlIIl;
                }
                com.microblink.blinkid.util.Log.v(this, "Compatibility for preview size {}x{} is {}", java.lang.Integer.valueOf(size2.width), java.lang.Integer.valueOf(size2.height), java.lang.Double.valueOf(llIIlIlIIl));
            }
        }
        return size;
    }
}
