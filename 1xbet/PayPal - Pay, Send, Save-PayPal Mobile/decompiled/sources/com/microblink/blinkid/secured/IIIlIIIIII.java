package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIlIIIIII {
    public boolean llIIlIlIIl = false;
    public final java.util.concurrent.atomic.AtomicReference IlIllIlIIl = new java.util.concurrent.atomic.AtomicReference(null);
    public java.util.concurrent.atomic.AtomicBoolean IllIIIllII = new java.util.concurrent.atomic.AtomicBoolean(false);
    public java.util.concurrent.atomic.AtomicInteger llIIIlllll = new java.util.concurrent.atomic.AtomicInteger(0);

    public final void llIIlIlIIl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        java.lang.Boolean bool = (java.lang.Boolean) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            throw new java.lang.RuntimeException("Unable to obtain information about LED torch availability. This is a bug in device!");
        }
        this.llIIlIlIIl = bool.booleanValue();
    }
}
