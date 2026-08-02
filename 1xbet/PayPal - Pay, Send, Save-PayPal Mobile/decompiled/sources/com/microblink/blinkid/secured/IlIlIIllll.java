package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIlIIllll extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIlIIIl llIIlIlIIl;

    public IlIlIIllll(com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl) {
        this.llIIlIlIIl = ilIIIlIIIl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (r0.llIIIlllll.get() == false) goto L38;
     */
    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        boolean z;
        int i;
        int i2;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        com.microblink.blinkid.util.Log.v(this.llIIlIlIIl, "Capture completed", new java.lang.Object[0]);
        com.microblink.blinkid.secured.IIIlIIIIII iIIlIIIIII = this.llIIlIlIIl.IllIIIIllI;
        if (iIIlIIIIII.IlIllIlIIl.get() != null) {
            int incrementAndGet = iIIlIIIIII.llIIIlllll.incrementAndGet();
            java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.FLASH_STATE);
            com.microblink.blinkid.util.Log.d(iIIlIIIIII, "Torch state is {}", num);
            if (num == null || num.intValue() == 2) {
                if (!iIIlIIIIII.IllIIIllII.get()) {
                    ((com.microblink.blinkid.hardware.SuccessCallback) iIIlIIIIII.IlIllIlIIl.getAndSet(null)).onOperationDone(true);
                } else if (incrementAndGet > 30) {
                    com.microblink.blinkid.hardware.SuccessCallback successCallback = (com.microblink.blinkid.hardware.SuccessCallback) iIIlIIIIII.IlIllIlIIl.getAndSet(null);
                    iIIlIIIIII.IllIIIllII.set(true);
                    successCallback.onOperationDone(false);
                }
            } else if (num.intValue() == 3) {
                if (iIIlIIIIII.IllIIIllII.get()) {
                    ((com.microblink.blinkid.hardware.SuccessCallback) iIIlIIIIII.IlIllIlIIl.getAndSet(null)).onOperationDone(true);
                } else if (incrementAndGet > 30) {
                    com.microblink.blinkid.hardware.SuccessCallback successCallback2 = (com.microblink.blinkid.hardware.SuccessCallback) iIIlIIIIII.IlIllIlIIl.getAndSet(null);
                    iIIlIIIIII.IllIIIllII.set(false);
                    successCallback2.onOperationDone(false);
                }
            }
        }
        com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl = this.llIIlIlIIl;
        com.microblink.blinkid.secured.IllIIIIllI illIIIIllI = ilIIIlIIIl.llIIlIIlll;
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = ilIIIlIIIl.lllIIIlIlI;
        com.microblink.blinkid.secured.lIlllIIlll lillliilll = ilIIIlIIIl.lIlIIIIlIl;
        java.lang.Integer num2 = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if (num2 == null) {
            com.microblink.blinkid.util.Log.wtf(illIIIIllI, "Focus state is null! This is a bug in device!", new java.lang.Object[0]);
        } else {
            switch (num2.intValue()) {
                case 0:
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Focus is currently inactive", new java.lang.Object[0]);
                    int i3 = illIIIIllI.IllIIIllII;
                    if (i3 == 3 || i3 == 1) {
                        lililliili.onAutofocusStopped(lillliilll.IllIIIIllI);
                    }
                    z = false;
                    break;
                case 1:
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Focus in progress...", new java.lang.Object[0]);
                    i = illIIIIllI.IllIIIllII;
                    if (i != 3 && i != 1) {
                        lililliili.onAutofocusStarted(lillliilll.IllIIIIllI);
                    }
                    z = false;
                    break;
                case 2:
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Focused", new java.lang.Object[0]);
                    i2 = illIIIIllI.IllIIIllII;
                    if (i2 != 3 || i2 == 1) {
                        lililliili.onAutofocusStopped(lillliilll.IllIIIIllI);
                    }
                    z = false;
                    break;
                case 3:
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Active scan in progress...", new java.lang.Object[0]);
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Focus in progress...", new java.lang.Object[0]);
                    i = illIIIIllI.IllIIIllII;
                    if (i != 3) {
                        lililliili.onAutofocusStarted(lillliilll.IllIIIIllI);
                    }
                    z = false;
                    break;
                case 4:
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Focus locked", new java.lang.Object[0]);
                    if (!illIIIIllI.llIIIlllll.get()) {
                        if (illIIIIllI.IllIIIllII != 4) {
                            lililliili.onAutofocusStopped(lillliilll.IllIIIIllI);
                        }
                        z = true;
                        break;
                    }
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Focused", new java.lang.Object[0]);
                    i2 = illIIIIllI.IllIIIllII;
                    if (i2 != 3) {
                    }
                    lililliili.onAutofocusStopped(lillliilll.IllIIIIllI);
                    z = false;
                    break;
                case 5:
                case 6:
                    com.microblink.blinkid.util.Log.v(illIIIIllI, "Focus state: Unfocused", new java.lang.Object[0]);
                    int i4 = illIIIIllI.IllIIIllII;
                    if (i4 == 3 || i4 == 1) {
                        lililliili.onAutofocusStopped(lillliilll.IllIIIIllI);
                        lililliili.onAutofocusFailed();
                    }
                    break;
                default:
                    z = false;
                    break;
            }
            illIIIIllI.IllIIIllII = num2.intValue();
            if (z) {
                com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl2 = this.llIIlIlIIl;
                try {
                    ilIIIlIIIl2.IlIlllllII.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
                    ilIIIlIIIl2.lIlllIlIlI();
                    ilIIIlIIIl2.llIIlIIlll.llIIIlllll.set(true);
                } catch (java.lang.Exception e) {
                    com.microblink.blinkid.util.Log.w(ilIIIlIIIl2, e, "Failed to resume continuous autofocus", new java.lang.Object[0]);
                }
            }
        }
        if (com.microblink.blinkid.util.Log.getCurrentLogLevel().ordinal() >= com.microblink.blinkid.util.Log.LogLevel.LOG_VERBOSE.ordinal()) {
            java.lang.Integer num3 = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE);
            if (num3 != null) {
                int intValue = num3.intValue();
                if (intValue == 0) {
                    com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE inactive", new java.lang.Object[0]);
                } else if (intValue == 1) {
                    com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE searching", new java.lang.Object[0]);
                } else if (intValue == 2) {
                    com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE converged", new java.lang.Object[0]);
                } else if (intValue == 3) {
                    com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE locked", new java.lang.Object[0]);
                } else if (intValue == 4) {
                    com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE flash required", new java.lang.Object[0]);
                } else if (intValue == 5) {
                    com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE precapture", new java.lang.Object[0]);
                }
            } else {
                com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "AE null", new java.lang.Object[0]);
            }
            com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "ISO: {}", totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY));
            com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Exposure time: {}", totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME));
            com.microblink.blinkid.util.Log.v(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Frame duration: {}", totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_FRAME_DURATION));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        com.microblink.blinkid.util.Log.v(this.llIIlIlIIl, "Capture started", new java.lang.Object[0]);
        if (this.llIIlIlIIl.IlIlIlIIlI.compareAndSet(false, true)) {
            this.llIIlIlIIl.IlIllIlllI.llIIlIlIIl();
        }
    }
}
