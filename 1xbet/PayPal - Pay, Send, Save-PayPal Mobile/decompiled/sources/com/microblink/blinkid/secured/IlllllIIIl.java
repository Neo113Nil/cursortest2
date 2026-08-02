package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlllllIIIl {
    public static final java.util.concurrent.Semaphore lIIIIIllll = new java.util.concurrent.Semaphore(1);
    public final com.microblink.blinkid.secured.IllllIlIIl IlIllIlIIl;
    public com.microblink.blinkid.view.IllIIIIllI IllIIIIllI;
    public final android.hardware.camera2.CameraManager IllIIIllII;
    public com.microblink.blinkid.secured.IlIIlllIll lIlIIIIlIl;
    public android.hardware.camera2.CameraDevice llIIlIlIIl;
    public int llIIlIIlll = 1;
    public final com.microblink.blinkid.secured.lllIIIllII IIlIIIllIl = new com.microblink.blinkid.secured.lllIIIllII(this);
    public final com.microblink.blinkid.secured.IllllIIlII llIIIlllll = new com.microblink.blinkid.secured.IllllIIlII();

    public IlllllIIIl(android.content.Context context, com.microblink.blinkid.secured.IllllIlIIl illllIlIIl) {
        this.IlIllIlIIl = illllIlIIl;
        this.IllIIIllII = (android.hardware.camera2.CameraManager) context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
    }

    public final android.hardware.camera2.CaptureRequest.Builder IlIllIlIIl() {
        return this.llIIlIlIIl.createCaptureRequest(1);
    }

    public final void llIIlIlIIl(java.util.List list, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
        this.llIIlIlIIl.createCaptureSession(list, stateCallback, this.IlIllIlIIl.llIIlIlIIl());
    }

    public final android.hardware.camera2.CameraCharacteristics llIIlIlIIl(com.microblink.blinkid.hardware.camera.CameraType cameraType, com.microblink.blinkid.view.IllIIIIllI illIIIIllI, com.microblink.blinkid.secured.IlIIlllIll ilIIlllIll) {
        java.lang.Boolean bool;
        int intValue;
        java.lang.Boolean bool2;
        int intValue2;
        java.lang.Boolean bool3;
        this.IllIIIIllI = illIIIIllI;
        this.lIlIIIIlIl = ilIIlllIll;
        com.microblink.blinkid.secured.IllllIIlII illllIIlII = this.llIIIlllll;
        android.hardware.camera2.CameraManager cameraManager = this.IllIIIllII;
        java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Available camera count: ");
        sb.append(cameraIdList.length);
        com.microblink.blinkid.util.Log.i(illllIIlII, sb.toString(), new java.lang.Object[0]);
        int length = cameraIdList.length;
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.Boolean bool4 = null;
        java.lang.Boolean bool5 = null;
        while (i2 < length) {
            java.lang.String str3 = cameraIdList[i2];
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str3);
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            android.hardware.camera2.CameraManager cameraManager2 = cameraManager;
            if (num == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Device returned null for lens facing of camera '");
                sb2.append(str3);
                sb2.append("'. This is a bug in device, as it does not implement Camera API as it is supposed to.");
                throw new java.lang.RuntimeException(sb2.toString());
            }
            java.lang.String[] strArr = cameraIdList;
            int i4 = length;
            if (num.intValue() == 0) {
                if (str2 == null) {
                    java.lang.Integer num2 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                    if (num2 == null) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Device returned null for sensor orientation of camera '");
                        sb3.append(str3);
                        sb3.append("'. This is a bug in device, as it does not implement Camera API as it is supposed to.");
                        throw new java.lang.RuntimeException(sb3.toString());
                    }
                    intValue2 = num2.intValue();
                    com.microblink.blinkid.util.Log.i(illllIIlII, "Front facing orientation is {}", num2);
                    java.lang.Float f = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
                    bool3 = java.lang.Boolean.valueOf((f == null || f.floatValue() == 0.0f) ? false : true);
                } else if (bool4.booleanValue()) {
                    com.microblink.blinkid.util.Log.w(illllIIlII, "Handling multiple front cameras with autofocus currently not supported! Will use the first found '{}'", str2);
                } else {
                    java.lang.Float f2 = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
                    if (f2 != null && f2.floatValue() != 0.0f) {
                        java.lang.Integer num3 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                        if (num3 == null) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Device returned null for sensor orientation of camera '");
                            sb4.append(str3);
                            sb4.append("'. This is a bug in device, as it does not implement Camera API as it is supposed to.");
                            throw new java.lang.RuntimeException(sb4.toString());
                        }
                        intValue2 = num3.intValue();
                        com.microblink.blinkid.util.Log.i(illllIIlII, "Front facing orientation is {}", num3);
                        bool3 = java.lang.Boolean.TRUE;
                    }
                }
                bool4 = bool3;
                i3 = intValue2;
                str2 = str3;
                i2++;
                cameraManager = cameraManager2;
                cameraIdList = strArr;
                length = i4;
            } else if (num.intValue() == 1) {
                bool = bool4;
                com.microblink.blinkid.util.Log.i(illllIIlII, "Back face camera found", new java.lang.Object[0]);
                if (str == null) {
                    java.lang.Integer num4 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                    if (num4 == null) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Device returned null for sensor orientation of camera '");
                        sb5.append(str3);
                        sb5.append("'. This is a bug in device, as it does not implement Camera API as it is supposed to.");
                        throw new java.lang.RuntimeException(sb5.toString());
                    }
                    intValue = num4.intValue();
                    com.microblink.blinkid.util.Log.i(illllIIlII, "Back facing orientation is {}", num4);
                    java.lang.Float f3 = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
                    bool2 = java.lang.Boolean.valueOf((f3 == null || f3.floatValue() == 0.0f) ? false : true);
                } else {
                    if (bool5.booleanValue()) {
                        com.microblink.blinkid.util.Log.w(illllIIlII, "Handling multiple back cameras with autofocus currently not supported. Will use the first found '{}'", str);
                    } else {
                        java.lang.Float f4 = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
                        if (f4 != null && f4.floatValue() != 0.0f) {
                            java.lang.Integer num5 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                            if (num5 == null) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Device returned null for sensor orientation of camera '");
                                sb6.append(str3);
                                sb6.append("'. This is a bug in device, as it does not implement Camera API as it is supposed to.");
                                throw new java.lang.RuntimeException(sb6.toString());
                            }
                            intValue = num5.intValue();
                            com.microblink.blinkid.util.Log.i(illllIIlII, "Back facing orientation is {}", num5);
                            bool2 = java.lang.Boolean.TRUE;
                        }
                    }
                    bool4 = bool;
                    i2++;
                    cameraManager = cameraManager2;
                    cameraIdList = strArr;
                    length = i4;
                }
                bool5 = bool2;
                i = intValue;
                str = str3;
                bool4 = bool;
                i2++;
                cameraManager = cameraManager2;
                cameraIdList = strArr;
                length = i4;
            }
            bool = bool4;
            bool4 = bool;
            i2++;
            cameraManager = cameraManager2;
            cameraIdList = strArr;
            length = i4;
        }
        if (cameraType == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_DEFAULT) {
            if (str != null) {
                illllIIlII.llIIlIlIIl = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE;
                illllIIlII.IlIllIlIIl = i;
            } else {
                illllIIlII.llIIlIlIIl = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE;
                illllIIlII.IlIllIlIIl = i3;
                str = str2;
            }
            if (str == null) {
                illllIIlII.llIIlIlIIl = null;
                throw new java.lang.RuntimeException("Device does not have cameras!");
            }
        } else {
            com.microblink.blinkid.hardware.camera.CameraType cameraType2 = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE;
            if (cameraType == cameraType2) {
                illllIIlII.llIIlIlIIl = cameraType2;
                illllIIlII.IlIllIlIIl = i;
                if (str == null) {
                    illllIIlII.llIIlIlIIl = null;
                    throw new java.lang.RuntimeException("Device does not have back facing camera!");
                }
            } else {
                com.microblink.blinkid.hardware.camera.CameraType cameraType3 = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE;
                if (cameraType == cameraType3) {
                    illllIIlII.llIIlIlIIl = cameraType3;
                    illllIIlII.IlIllIlIIl = i3;
                    if (str2 == null) {
                        illllIIlII.llIIlIlIIl = null;
                        throw new java.lang.RuntimeException("Device does not have front facing camera!");
                    }
                    str = str2;
                } else {
                    str = null;
                }
            }
        }
        com.microblink.blinkid.util.Log.i(illllIIlII, "Selected camera ID is {}", str);
        com.microblink.blinkid.util.Log.i(illllIIlII, "Camera sensor orientation is {}", java.lang.Integer.valueOf(illllIIlII.IlIllIlIIl));
        if (str == null) {
            throw new java.lang.RuntimeException("Unable to select camera. External cameras are currently not supported.");
        }
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("WAIT TO OPEN ");
            sb7.append(hashCode());
            com.microblink.blinkid.util.Log.d(this, sb7.toString(), new java.lang.Object[0]);
            if (!lIIIIIllll.tryAcquire(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.DELAY, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return null;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append("AQUIRED OPEN LOCK ");
            sb8.append(hashCode());
            com.microblink.blinkid.util.Log.d(this, sb8.toString(), new java.lang.Object[0]);
            this.IllIIIllII.openCamera(str, this.IIlIIIllIl, this.IlIllIlIIl.llIIlIlIIl());
            return this.IllIIIllII.getCameraCharacteristics(str);
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.RuntimeException("Interrupted while trying to lock camera opening.", e);
        }
    }

    public final void llIIlIlIIl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CLOSING ");
        sb.append(hashCode());
        com.microblink.blinkid.util.Log.d(this, sb.toString(), new java.lang.Object[0]);
        android.hardware.camera2.CameraDevice cameraDevice = this.llIIlIlIIl;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.llIIlIlIIl = null;
            llIIlIlIIl(1);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CLOSED ");
            sb2.append(hashCode());
            com.microblink.blinkid.util.Log.d(this, sb2.toString(), new java.lang.Object[0]);
            lIIIIIllll.release();
        }
    }

    public final void llIIlIlIIl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SState ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : com.payair.model.TokenStatusKt.TOKEN_ACTIVE : "NEEDS_CLOSING" : "CLOSING" : "OPENING" : com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        sb.append(" ");
        sb.append(hashCode());
        com.microblink.blinkid.util.Log.d(this, sb.toString(), new java.lang.Object[0]);
        this.llIIlIIlll = i;
    }
}
