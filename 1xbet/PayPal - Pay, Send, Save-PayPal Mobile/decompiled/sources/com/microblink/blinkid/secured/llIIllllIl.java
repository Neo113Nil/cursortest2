package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIIllllIl {
    public final com.microblink.blinkid.secured.lIlIllIIll llIIlIlIIl(android.content.Context context, android.hardware.Camera camera, com.microblink.blinkid.secured.lIIlllIIlI liillliili) {
        com.microblink.blinkid.secured.lIlIllIIll iIllIIlllI;
        if (context == null) {
            com.microblink.blinkid.util.Log.e(this, "Device manager must be set to create CameraStrategy", new java.lang.Object[0]);
            throw new java.lang.NullPointerException("Device manager must be set to create CameraStrategy");
        }
        if (camera == null) {
            com.microblink.blinkid.util.Log.e(this, "Cannot create strategy for null camera!", new java.lang.Object[0]);
            throw new java.lang.NullPointerException("Cannot create strategy for null camera!");
        }
        if (liillliili == null) {
            com.microblink.blinkid.util.Log.e(this, "Cannot create strategy with empty settings", new java.lang.Object[0]);
            throw new java.lang.NullPointerException("Cannot create strategy with empty settings");
        }
        com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset = liillliili.llIIlIlIIl;
        if (videoResolutionPreset == com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT) {
            java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            if (supportedPreviewSizes != null) {
                for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                    if (java.lang.Math.min(size.width, size.height) >= 720) {
                        com.microblink.blinkid.util.Log.i(this, "Device camera is HD ready!", new java.lang.Object[0]);
                        iIllIIlllI = new com.microblink.blinkid.secured.IllIllllII(camera);
                        break;
                    }
                }
                com.microblink.blinkid.util.Log.i(this, "Device camera is not HD ready!", new java.lang.Object[0]);
            }
            iIllIIlllI = new com.microblink.blinkid.secured.llIlIlIlII(camera);
        } else {
            iIllIIlllI = new com.microblink.blinkid.secured.IIllIIlllI(camera, videoResolutionPreset);
        }
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII().IlIllIlIIl();
        int i = IlIllIlIIl == null ? -1 : IlIllIlIIl.IllIIIIllI;
        if (i != -1) {
            iIllIIlllI.IllIIIllII = i;
        } else {
            java.util.List<java.lang.String> supportedFocusModes = camera.getParameters().getSupportedFocusModes();
            if (supportedFocusModes == null || !supportedFocusModes.contains("continuous-picture")) {
                iIllIIlllI.IllIIIllII = 300;
            } else {
                iIllIIlllI.IllIIIllII = 0;
            }
        }
        iIllIIlllI.llIIlIlIIl();
        return iIllIIlllI;
    }
}
