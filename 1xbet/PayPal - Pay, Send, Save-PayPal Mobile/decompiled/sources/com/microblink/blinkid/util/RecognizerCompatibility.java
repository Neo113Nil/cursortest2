package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public class RecognizerCompatibility {
    private static com.microblink.blinkid.util.RecognizerCompatibilityStatus getHighSpeedVideoSizes;

    public static boolean cameraHasAutofocus(com.microblink.blinkid.hardware.camera.CameraType cameraType, android.content.Context context) {
        return com.microblink.blinkid.secured.IllIllIllI.llIIlIlIIl(cameraType, context.getApplicationContext());
    }

    public static com.microblink.blinkid.util.RecognizerCompatibilityStatus getRecognizerCompatibilityStatus(android.content.Context context) {
        if (getHighSpeedVideoSizes == null) {
            try {
                com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
                if (com.microblink.blinkid.secured.IlIlIlllIl.IllIIIIllI == null) {
                    com.microblink.blinkid.secured.IlIlIlllIl.IllIIIIllI = new com.microblink.blinkid.secured.IlIlIlllIl(context.getApplicationContext());
                }
                com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII();
                if (!com.microblink.blinkid.hardware.MicroblinkDeviceManager.IllIIIllII) {
                    com.microblink.blinkid.util.Log.e(com.microblink.blinkid.util.RecognizerCompatibility.class, "Device has ARMv7 processor without NEON support. These processors are not supported!", new java.lang.Object[0]);
                    getHighSpeedVideoSizes = com.microblink.blinkid.util.RecognizerCompatibilityStatus.PROCESSOR_ARCHITECTURE_NOT_SUPPORTED;
                } else if (com.microblink.blinkid.secured.IlIlIlllIl.IllIIIIllI() < 21) {
                    com.microblink.blinkid.util.Log.e(com.microblink.blinkid.util.RecognizerCompatibility.class, "Device is running an unsupported Android version!", new java.lang.Object[0]);
                    getHighSpeedVideoSizes = com.microblink.blinkid.util.RecognizerCompatibilityStatus.UNSUPPORTED_ANDROID_VERSION;
                } else if (IllIIIllII.llIIlIlIIl()) {
                    getHighSpeedVideoSizes = com.microblink.blinkid.util.RecognizerCompatibilityStatus.RECOGNIZER_SUPPORTED;
                } else {
                    com.microblink.blinkid.util.Log.e(com.microblink.blinkid.util.RecognizerCompatibility.class, "Device does not have a camera", new java.lang.Object[0]);
                    getHighSpeedVideoSizes = com.microblink.blinkid.util.RecognizerCompatibilityStatus.NO_CAMERA;
                }
            } catch (java.lang.Throwable th) {
                com.microblink.blinkid.util.Log.e(com.microblink.blinkid.util.RecognizerCompatibility.class, th, "Unable to load native library. Native recognizer will not be supported!", new java.lang.Object[0]);
                getHighSpeedVideoSizes = com.microblink.blinkid.util.RecognizerCompatibilityStatus.PROCESSOR_ARCHITECTURE_NOT_SUPPORTED;
            }
        }
        return getHighSpeedVideoSizes;
    }
}
