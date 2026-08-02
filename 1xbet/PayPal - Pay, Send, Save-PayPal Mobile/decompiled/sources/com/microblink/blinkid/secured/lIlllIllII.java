package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class lIlllIllII {
    public static android.hardware.camera2.CaptureRequest.Key IlIllIlIIl(java.lang.String str, java.lang.Class cls) {
        if (com.microblink.blinkid.secured.IlIlIIlIII.llIIlIlIIl(cls)) {
            throw new java.lang.IllegalArgumentException("Including a type variable in a type reference is not allowed");
        }
        cls.hashCode();
        if (!com.microblink.blinkid.secured.IlIlllIIII.llIIlIlIIl()) {
            return null;
        }
        try {
            return (android.hardware.camera2.CaptureRequest.Key) com.microblink.blinkid.secured.lIIllIllIl.llIIlIlIIl(new java.lang.Object[]{str, cls, 1});
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIlllIllII.class, e, "Failed to create Camera Key", new java.lang.Object[0]);
            return null;
        }
    }

    public static android.hardware.camera2.CameraCharacteristics.Key llIIlIlIIl(java.lang.String str, java.lang.Class cls) {
        if (com.microblink.blinkid.secured.IlIlIIlIII.llIIlIlIIl(cls)) {
            throw new java.lang.IllegalArgumentException("Including a type variable in a type reference is not allowed");
        }
        cls.hashCode();
        if (!com.microblink.blinkid.secured.IlIlllIIII.llIIlIlIIl()) {
            return null;
        }
        try {
            return (android.hardware.camera2.CameraCharacteristics.Key) com.microblink.blinkid.secured.lIIllIllIl.llIIlIlIIl(new java.lang.Object[]{str, cls, 0});
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIlllIllII.class, e, "Fail to create Camera Key.", new java.lang.Object[0]);
            return null;
        }
    }
}
