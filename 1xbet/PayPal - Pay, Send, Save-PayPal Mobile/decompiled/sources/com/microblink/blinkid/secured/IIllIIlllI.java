package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIllIIlllI extends com.microblink.blinkid.secured.lIlIllIIll {
    public final com.microblink.blinkid.hardware.camera.VideoResolutionPreset IllIIIIllI;

    public IIllIIlllI(android.hardware.Camera camera, com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset) {
        super(camera);
        this.IllIIIIllI = videoResolutionPreset;
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final void llIIlIlIIl() {
        com.microblink.blinkid.util.Log.i(this, "Using VideoPreset strategy with preset: {}", this.IllIIIIllI);
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final double llIIlIlIIl(android.hardware.Camera.Size size, double d, long j, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        if (!llIIlIlIIl(size, cameraType)) {
            return Double.POSITIVE_INFINITY;
        }
        return (java.lang.Math.abs((size.width / size.height) - d) * 1100.0d) + (java.lang.Math.abs(((size.width * size.height) / j) - 1.0d) * 1200.0d);
    }

    @Override // com.microblink.blinkid.secured.lIlIllIIll
    public final android.hardware.Camera.Size llIIlIlIIl(int i, int i2, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        android.hardware.Camera.Size llIIlIlIIl;
        android.hardware.Camera.Size size = null;
        if (this.IlIllIlIIl == null) {
            return null;
        }
        com.microblink.blinkid.util.Log.v(this, "surface size is: {}x{}", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (this.IllIIIIllI == com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT && (llIIlIlIIl = llIIlIlIIl(cameraType)) != null) {
            return llIIlIlIIl;
        }
        if (this.IllIIIIllI != com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_MAX_AVAILABLE) {
            long round = java.lang.Math.round(r10.getIdealHeight() * 1.7777777777777777d);
            com.microblink.blinkid.util.Log.i(this, "Ideal camera resolution is {}x{}", java.lang.Long.valueOf(round), java.lang.Integer.valueOf(this.IllIIIIllI.getIdealHeight()));
            return llIIlIlIIl(this.IlIllIlIIl, 1.7777777777777777d, this.IllIIIIllI.getIdealHeight() * round, cameraType);
        }
        long j = 0;
        for (android.hardware.Camera.Size size2 : this.IlIllIlIIl) {
            int i3 = size2.width;
            if (i3 % 4 == 0) {
                long j2 = i3 * size2.height;
                if (j2 > j) {
                    size = size2;
                    j = j2;
                }
            }
        }
        return size;
    }
}
