package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIIIlIIII {
    public boolean llIIlIlIIl = false;
    public boolean IlIllIlIIl = false;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001a, code lost:
    
        r6.llIIlIlIIl = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void llIIlIlIIl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        int i = 0;
        if (com.microblink.blinkid.secured.IlIlllIIII.llIIlIlIIl()) {
            try {
                int[] iArr = (int[]) cameraCharacteristics.get(com.microblink.blinkid.secured.llllIlllIl.IlIllIlIIl);
                if (iArr != null) {
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (iArr[i2] == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
                com.microblink.blinkid.util.Log.i(this, "Unable to query device for OIS operation mode availability", new java.lang.Object[0]);
                this.llIIlIlIIl = false;
            }
            com.microblink.blinkid.util.Log.i(this, "Samsung optical image stabilisation picture mode supported: {}", java.lang.Boolean.valueOf(this.llIIlIlIIl));
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            int length2 = iArr2.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                if (iArr2[i] == 1) {
                    this.IlIllIlIIl = true;
                    break;
                }
                i++;
            }
        }
        com.microblink.blinkid.util.Log.i(this, "Optical image stabilisation supported: {}", java.lang.Boolean.valueOf(this.IlIllIlIIl));
    }

    public final void llIIlIlIIl(android.hardware.camera2.CaptureRequest.Builder builder) {
        if (this.IlIllIlIIl) {
            com.microblink.blinkid.util.Log.d(this, "Activating optical image stabilisation", new java.lang.Object[0]);
            builder.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
            if (this.llIIlIlIIl) {
                com.microblink.blinkid.util.Log.d(this, "Activating Samsung picture mode for optical image stabilisation", new java.lang.Object[0]);
                builder.set(com.microblink.blinkid.secured.llIllIlIlI.IlIllIlIIl, 0);
            }
        }
    }
}
