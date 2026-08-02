package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllIIIIllI {
    public int IllIIIllII;
    public java.util.concurrent.atomic.AtomicBoolean llIIIlllll;
    public boolean llIIlIlIIl = false;
    public boolean IlIllIlIIl = false;

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void llIIlIlIIl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl) {
        boolean z;
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl;
        java.lang.Float f = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f != null) {
            com.microblink.blinkid.util.Log.v(this, "Minimum focus distance: {}", f);
            if (f.floatValue() == 0.0f) {
                z = true;
                com.microblink.blinkid.util.Log.i(this, "Camera has fixed lens: {}", java.lang.Boolean.valueOf(z));
                this.llIIlIlIIl = !z;
                if (com.microblink.blinkid.secured.IlIlllIIII.llIIlIlIIl()) {
                    return;
                }
                try {
                    java.lang.Boolean bool = (java.lang.Boolean) cameraCharacteristics.get(com.microblink.blinkid.secured.llllIlllIl.llIIlIlIIl);
                    if (bool != null) {
                        if (bool.booleanValue() && ((IlIllIlIIl = ilIlIlllIl.IlIllIlIIl()) == null || (!ilIlIlllIl.llIIlIlIIl(IlIllIlIIl.lllIlIlIIl)))) {
                            com.microblink.blinkid.util.Log.i(this, "Samsung Phase AF is supported, but buggy on this device. Will not enabled it!", new java.lang.Object[0]);
                            bool = java.lang.Boolean.FALSE;
                        }
                        this.IlIllIlIIl = bool.booleanValue();
                    }
                } catch (java.lang.IllegalArgumentException unused) {
                    com.microblink.blinkid.util.Log.i(this, "Unable to query device for PAF availability", new java.lang.Object[0]);
                    this.IlIllIlIIl = false;
                }
                com.microblink.blinkid.util.Log.i(this, "Samsung Phase AF supported: {}", java.lang.Boolean.valueOf(this.IlIllIlIIl));
                return;
            }
        }
        z = false;
        com.microblink.blinkid.util.Log.i(this, "Camera has fixed lens: {}", java.lang.Boolean.valueOf(z));
        this.llIIlIlIIl = !z;
        if (com.microblink.blinkid.secured.IlIlllIIII.llIIlIlIIl()) {
        }
    }

    public final void llIIlIlIIl(android.hardware.camera2.CaptureRequest.Builder builder) {
        if (this.llIIlIlIIl) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
        } else {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 0);
        }
        if (this.IlIllIlIIl) {
            com.microblink.blinkid.util.Log.d(this, "Activating Samsung Phase AF", new java.lang.Object[0]);
            builder.set(com.microblink.blinkid.secured.llIllIlIlI.llIIlIlIIl, 1);
        }
    }
}
