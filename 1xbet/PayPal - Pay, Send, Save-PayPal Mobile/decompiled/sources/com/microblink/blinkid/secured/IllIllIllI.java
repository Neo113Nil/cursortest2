package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IllIllIllI {
    public static boolean IlIllIlIIl(com.microblink.blinkid.hardware.camera.CameraType cameraType, android.content.Context context) {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getApplicationContext().getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        if (cameraManager == null) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Cannot obtain camera manager from context!", new java.lang.Object[0]);
            return false;
        }
        java.lang.String llIIlIlIIl = llIIlIlIIl(cameraManager, cameraType);
        if (llIIlIlIIl == null) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Cannot obtain information for camera type {}", cameraType);
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) cameraManager.getCameraCharacteristics(llIIlIlIIl).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null) {
            com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Supported hardware level is 'null'", new java.lang.Object[0]);
            return false;
        }
        com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Camera 2 supported HW level is '{}'", num.intValue() == 1 ? a.b.m : num.intValue() == 0 ? "limited" : "legacy");
        return num.intValue() != 2;
    }

    public static boolean llIIlIlIIl(com.microblink.blinkid.hardware.camera.CameraType cameraType, android.content.Context context) {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getApplicationContext().getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        boolean z = false;
        if (cameraManager == null) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Cannot obtain camera manager from context!", new java.lang.Object[0]);
            return false;
        }
        try {
            java.lang.String llIIlIlIIl = llIIlIlIIl(cameraManager, cameraType);
            if (llIIlIlIIl == null) {
                com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Cannot obtain information for camera type {}", cameraType);
                return false;
            }
            java.lang.Float f = (java.lang.Float) cameraManager.getCameraCharacteristics(llIIlIlIIl).get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
            if (f != null) {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IlIIIlIIIl.class, "{} minimum focus distance: {}", cameraType, f);
                if (f.floatValue() == 0.0f) {
                    z = true;
                }
            }
            return !z;
        } catch (android.hardware.camera2.CameraAccessException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
    
        if (r5 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String llIIlIlIIl(android.hardware.camera2.CameraManager cameraManager, com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        java.lang.Integer num;
        try {
            java.lang.String str = null;
            java.lang.String str2 = null;
            for (java.lang.String str3 : cameraManager.getCameraIdList()) {
                try {
                    num = (java.lang.Integer) cameraManager.getCameraCharacteristics(str3).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                } catch (android.hardware.camera2.CameraAccessException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to access camera with ID ");
                    sb.append(str3);
                    sb.append(". Skipping it...");
                    com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIIIlIIIl.class, e, sb.toString(), new java.lang.Object[0]);
                } catch (java.lang.AssertionError unused) {
                    com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "There was assertion error when calling getCameraCharacteristics. This is probably a bug in device!", new java.lang.Object[0]);
                    return null;
                } catch (java.lang.NullPointerException unused2) {
                    com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "There was a NullPointerException when calling getCameraCharacteristics. This is probably a bug in device!", new java.lang.Object[0]);
                    return null;
                } catch (java.lang.NumberFormatException unused3) {
                    com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "There was a NumberFormatException when calling getCameraCharacteristics. This is probably a bug in device!", new java.lang.Object[0]);
                    return null;
                } catch (java.lang.Throwable th) {
                    com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, th, "There was unhandled exception when calling getCameraCharacteristics. This is probably a bug in device!", new java.lang.Object[0]);
                    return null;
                }
                if (num == null) {
                    com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Obtained null value for lens facing info. This is a bug in device!", new java.lang.Object[0]);
                    return null;
                }
                if (num.intValue() == 0) {
                    if (str2 == null) {
                        str2 = str3;
                    }
                } else if (num.intValue() == 1 && str == null) {
                    str = str3;
                }
            }
            if (cameraType != com.microblink.blinkid.hardware.camera.CameraType.CAMERA_DEFAULT) {
                if (cameraType != com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE) {
                    if (cameraType != com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE) {
                        return null;
                    }
                    return str2;
                }
                return str;
            }
        } catch (java.lang.AssertionError unused4) {
            com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "There was assertion error when calling getCameraIdList. This is probably a bug in device!", new java.lang.Object[0]);
            return null;
        } catch (java.lang.NullPointerException unused5) {
            com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "There was a NullPointerException when calling getCameraIdList. This is probably a bug in device!", new java.lang.Object[0]);
            return null;
        } catch (java.lang.NumberFormatException unused6) {
            com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, "There was a NumberFormatException when calling getCameraIdList. This is probably a bug in device!", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Throwable th2) {
            com.microblink.blinkid.util.Log.w(com.microblink.blinkid.secured.IlIIIlIIIl.class, th2, "There was unhandled exception when calling getCameraIdList. This is probably a bug in device!", new java.lang.Object[0]);
            return null;
        }
    }
}
