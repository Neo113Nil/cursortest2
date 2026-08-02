package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class llIIllIlII {
    public static boolean IlIllIlIIl;
    public static int llIIlIlIIl;

    public static void llIIlIlIIl(android.hardware.Camera camera, int i, int i2, boolean z) {
        if (camera != null) {
            if (IlIllIlIIl) {
                camera.setDisplayOrientation(z ? (((i2 - 270) + i) + 360) % 360 : (((i2 - 90) + i) + 360) % 360);
            } else {
                com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.llIIllIlII.class, "Set DisplayOrientationMethod not supported.", new java.lang.Object[0]);
            }
        }
    }
}
