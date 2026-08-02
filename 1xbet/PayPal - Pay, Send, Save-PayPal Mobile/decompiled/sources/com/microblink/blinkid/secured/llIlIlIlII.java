package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIlIlIlII extends com.microblink.blinkid.secured.lIlIllIIll {
    public llIlIlIlII(android.hardware.Camera camera) {
        super(camera);
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final void llIIlIlIIl() {
        com.microblink.blinkid.util.Log.i(this, "Using LQ strategy", new java.lang.Object[0]);
    }

    public final java.lang.String toString() {
        return "LQ camera strategy";
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final double llIIlIlIIl(android.hardware.Camera.Size size, double d, long j, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        if (!llIIlIlIIl(size, cameraType)) {
            return Double.POSITIVE_INFINITY;
        }
        return (java.lang.Math.abs(((size.width * size.height) / j) - 1.0d) * 1000.0d) + (java.lang.Math.abs((size.width / size.height) - d) * 2000.0d);
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final android.hardware.Camera.Size llIIlIlIIl(int i, int i2, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        if (this.IlIllIlIIl == null) {
            return null;
        }
        android.hardware.Camera.Size llIIlIlIIl = llIIlIlIIl(cameraType);
        if (llIIlIlIIl != null) {
            return llIIlIlIIl;
        }
        if (com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl == 1) {
            i2 = i;
            i = i2;
        }
        return llIIlIlIIl(this.IlIllIlIIl, i / i2, 384000L, cameraType);
    }
}
