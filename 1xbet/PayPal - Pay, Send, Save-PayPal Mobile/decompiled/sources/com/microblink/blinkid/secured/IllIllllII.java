package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllIllllII extends com.microblink.blinkid.secured.lIlIllIIll {
    public IllIllllII(android.hardware.Camera camera) {
        super(camera);
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final void llIIlIlIIl() {
        com.microblink.blinkid.util.Log.i(this, "Using HQ strategy", new java.lang.Object[0]);
    }

    public final java.lang.String toString() {
        return "HQ camera strategy!";
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final double llIIlIlIIl(android.hardware.Camera.Size size, double d, long j, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        if (llIIlIlIIl(size, cameraType)) {
            return java.lang.Math.abs(((size.width * size.height) / j) - 1.0d) * 1200.0d;
        }
        return Double.POSITIVE_INFINITY;
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final android.hardware.Camera.Size llIIlIlIIl(int i, int i2, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        if (this.IlIllIlIIl == null) {
            return null;
        }
        com.microblink.blinkid.util.Log.v(this, "surface size is: {}x{}", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        android.hardware.Camera.Size llIIlIlIIl = llIIlIlIIl(cameraType);
        if (llIIlIlIIl != null) {
            return llIIlIlIIl;
        }
        if (com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl == 1) {
            i2 = i;
            i = i2;
        }
        return llIIlIlIIl(this.IlIllIlIIl, i / i2, 2073600L, cameraType);
    }
}
