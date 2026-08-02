package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIIIlIIIl implements com.microblink.blinkid.secured.IlIllllllI {
    public final com.microblink.blinkid.secured.IlllllIIIl IIIIIIIIII;
    public final com.microblink.blinkid.secured.llIIIlIIII IIlIIIllIl;
    public android.hardware.camera2.CaptureRequest IlIIlllIIl;
    public com.microblink.blinkid.secured.lIIlllIIlI IlIllIlIIl;
    public com.microblink.blinkid.view.IllIIIIllI IlIllIlllI;
    public android.hardware.camera2.CaptureRequest.Builder IlIlllllII;
    public final com.microblink.blinkid.secured.IIIlIIIIII IllIIIIllI;
    public final com.microblink.blinkid.hardware.accelerometer.ShakeCallback IllIIlIIII;
    public android.hardware.camera2.CameraCaptureSession lIIIIIlIlI;
    public final com.microblink.blinkid.secured.lIllIlIlIl lIIIIIllll;
    public final com.microblink.blinkid.secured.lIlllIIlll lIlIIIIlIl;
    public com.microblink.blinkid.secured.lIlIIllIll lIllIIlIIl;
    public com.microblink.blinkid.secured.IlIlIlIIIl lIlllIlIlI;
    public final com.microblink.blinkid.secured.lIlIIIlIll llIIIlllll;
    public final com.microblink.blinkid.secured.IIIIIIIlII llIIlIIIll;
    public final com.microblink.blinkid.secured.IllIIIIllI llIIlIIlll;
    public com.microblink.blinkid.secured.IlIllIlIIl llIIlIlIIl;
    public final com.microblink.blinkid.secured.IIIIIIIlII llIllIIlll;
    public final com.microblink.blinkid.secured.lIlIllIIlI lllIIIlIlI;
    public android.hardware.camera2.CaptureRequest lllllIlIll;
    public com.microblink.blinkid.hardware.accelerometer.ShakeCallback lllIlIlIIl = com.microblink.blinkid.hardware.accelerometer.ShakeCallback.EMPTY;
    public boolean lllIIlIIlI = false;
    public boolean IlIIlIIIII = false;
    public boolean IlllIIIllI = false;
    public java.util.concurrent.atomic.AtomicBoolean IlIlIlIIlI = new java.util.concurrent.atomic.AtomicBoolean(false);
    public boolean IlIIIIIlll = false;
    public final com.microblink.blinkid.secured.IlIlIIllll IIlIlllIIl = new com.microblink.blinkid.secured.IlIlIIllll(this);
    public com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII();

    public IlIIIlIIIl(android.content.Context context, com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl, com.microblink.blinkid.secured.lIlIllIIlI lililliili, com.microblink.blinkid.secured.lIIlllIIlI liillliili) {
        this.llIIlIlIIl = null;
        this.IlIllIlIIl = null;
        this.lllIIIlIlI = null;
        this.llIIlIlIIl = ilIllIlIIl;
        this.lllIIIlIlI = lililliili;
        this.IlIllIlIIl = liillliili;
        this.IllIIlIIII = liillliili.llIIIlllll;
        if (lililliili == null) {
            throw new java.lang.NullPointerException("Camera delegate can't be null.");
        }
        ilIllIlIIl.IlIllIlIIl = new com.microblink.blinkid.secured.IIllllllll(this);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera2Control ");
        sb.append(hashCode());
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl(sb.toString());
        this.lIlllIlIlI = ilIlIlIIIl;
        ilIlIlIIIl.start();
        this.lIllIIlIIl = new com.microblink.blinkid.secured.lIlIIllIll();
        this.IIIIIIIIII = new com.microblink.blinkid.secured.IlllllIIIl(context, this.lIlllIlIlI);
        this.IllIIIIllI = new com.microblink.blinkid.secured.IIIlIIIIII();
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = this.IllIIIllII;
        this.lIlIIIIlIl = new com.microblink.blinkid.secured.lIlllIIlll(ilIlIlllIl);
        this.llIIlIIlll = new com.microblink.blinkid.secured.IllIIIIllI();
        this.IIlIIIllIl = new com.microblink.blinkid.secured.llIIIlIIII();
        this.lIIIIIllll = new com.microblink.blinkid.secured.lIllIlIlIl(ilIlIlllIl);
        com.microblink.blinkid.secured.lIlIllllII lilillllii = com.microblink.blinkid.secured.lIlIllllII.IllIIIllII;
        this.llIIlIIIll = new com.microblink.blinkid.secured.IIIIIIIlII(lilillllii.llIIlIlIIl, new com.microblink.blinkid.secured.lIlIIlIIll(this));
        this.llIllIIlll = new com.microblink.blinkid.secured.IIIIIIIlII(lilillllii.IlIllIlIIl, new com.microblink.blinkid.secured.llIlIlIlIl(this));
        this.llIIIlllll = new com.microblink.blinkid.secured.lIlIIIlIll(this.lIlllIlIlI, new com.microblink.blinkid.secured.lIIIlIIllI(this));
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void IIlIIIllIl() {
        llIIlIlIIl(this.lllllIlIll);
    }

    public final void IlIIlllIIl() {
        if (this.llIIlIlIIl != null) {
            com.microblink.blinkid.util.Log.i(this, "Pausing accelerometer", new java.lang.Object[0]);
            com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.llIIlIlIIl;
            com.microblink.blinkid.util.Log.v(ilIllIlIIl, "Unregistering accelerometer sensor listener {}", ilIllIlIIl);
            java.util.Timer timer = ilIllIlIIl.IIlIIIllIl;
            if (timer != null) {
                timer.cancel();
                ilIllIlIIl.IIlIIIllIl = null;
            }
            ilIllIlIIl.IllIIIIllI.unregisterListener(ilIllIlIIl);
        }
        if (this.IIIIIIIIII.llIIlIlIIl != null) {
            if (this.lIIIIIlIlI != null) {
                com.microblink.blinkid.util.Log.i(this, "Closing preview session", new java.lang.Object[0]);
                this.lIIIIIlIlI.close();
                this.lIIIIIlIlI = null;
            }
            this.IlIllIlllI.IlIllIlIIl();
            com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII = this.llIIlIIIll;
            iIIIIIIlII.lIlIIIIlIl.set(true);
            if (iIIIIIIlII.IllIIIIllI.get() == 0) {
                iIIIIIIlII.llIIlIlIIl();
            }
            com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII2 = this.llIllIIlll;
            iIIIIIIlII2.lIlIIIIlIl.set(true);
            if (iIIIIIIlII2.IllIIIIllI.get() == 0) {
                iIIIIIIlII2.llIIlIlIIl();
            }
            com.microblink.blinkid.util.Log.i(this, "Closing camera device", new java.lang.Object[0]);
            this.IIIIIIIIII.llIIlIlIIl();
            com.microblink.blinkid.util.Log.i(this, "Closed", new java.lang.Object[0]);
        }
    }

    public final void IlIllIlIIl(boolean z, com.microblink.blinkid.hardware.SuccessCallback successCallback) {
        android.hardware.camera2.CaptureRequest.Builder builder = this.IlIlllllII;
        if (builder == null || this.lIIIIIlIlI == null) {
            return;
        }
        if (z) {
            builder.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, 2);
        } else {
            builder.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
        }
        try {
            lIlllIlIlI();
            com.microblink.blinkid.secured.IIIlIIIIII iIIlIIIIII = this.IllIIIIllI;
            iIIlIIIIII.IllIIIllII.set(z);
            iIIlIIIIII.IlIllIlIIl.set(successCallback);
            iIIlIIIIII.llIIIlllll.set(0);
        } catch (android.hardware.camera2.CameraAccessException | java.lang.IllegalStateException unused) {
            successCallback.onOperationDone(false);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean IlIllIlllI() {
        return this.IllIIIIllI.llIIlIlIIl;
    }

    public final /* synthetic */ void IlIlllllII() {
        if (this.lIIIIIlIlI == null || this.IlIlllllII == null) {
            return;
        }
        try {
            lIlllIlIlI();
        } catch (android.hardware.camera2.CameraAccessException e) {
            com.microblink.blinkid.util.Log.w(this, e, "Failed to set capture request with new parameters", new java.lang.Object[0]);
        } catch (java.lang.IllegalStateException e2) {
            com.microblink.blinkid.util.Log.w(this, e2, "Failed to set capture request with new parameters - capture session is already closed", new java.lang.Object[0]);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final com.microblink.blinkid.secured.IIIIlIIlIl IllIIIIllI() {
        return this.llIIIlllll;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final int IllIIIllII() {
        return this.IIIIIIIIII.llIIIlllll.IlIllIlIIl;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void dispose() {
        if (this.IlllIIIllI) {
            return;
        }
        this.IlllIIIllI = true;
        this.lIlllIlIlI.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IlIIIlIIIl.this.lllIlIlIIl();
            }
        });
    }

    public final void lIIIIIlIlI() {
        if (this.IlIlllllII == null || this.lIIIIIlIlI == null || this.lIlllIlIlI == null || !this.lllIIlIIlI) {
            com.microblink.blinkid.util.Log.w(this, "Cannot trigger autofocus. Camera session is closed!", new java.lang.Object[0]);
            return;
        }
        com.microblink.blinkid.util.Log.d(this, "Triggering autofocus", new java.lang.Object[0]);
        com.microblink.blinkid.secured.lIIlllIIlI liillliili = this.IlIllIlIIl;
        if (liillliili == null || !liillliili.IlIllIlIIl) {
            this.IlIlllllII.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 1);
        } else {
            this.IlIlllllII.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 2);
        }
        try {
            android.hardware.camera2.CaptureRequest.Builder builder = this.IlIlllllII;
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 0);
            lIlllIlIlI();
            this.llIIlIIlll.llIIIlllll.set(false);
            this.IlIlllllII.set(key, 1);
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.lIIIIIlIlI;
            android.hardware.camera2.CaptureRequest build = this.IlIlllllII.build();
            com.microblink.blinkid.secured.IlIlIIllll ilIlIIllll = this.IIlIlllIIl;
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.lIlllIlIlI;
            ilIlIlIIIl.llIIIlllll();
            cameraCaptureSession.capture(build, ilIlIIllll, ilIlIlIIIl.llIIlIlIIl);
            this.IlIlllllII.set(key, 0);
        } catch (java.lang.Exception unused) {
            this.lllIIIlIlI.onAutofocusFailed();
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void lIIIIIllll() {
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl;
        if (!this.llIIlIIlll.llIIlIlIIl) {
            com.microblink.blinkid.util.Log.w(this, "Autofocus not supported, unable to trigger it", new java.lang.Object[0]);
        } else if (this.IlIlllllII == null || this.lIIIIIlIlI == null || (ilIlIlIIIl = this.lIlllIlIlI) == null) {
            com.microblink.blinkid.util.Log.w(this, "Cannot trigger autofocus. Camera session is closed!", new java.lang.Object[0]);
        } else {
            ilIlIlIIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.IlIIIlIIIl.this.lIIIIIlIlI();
                }
            });
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final com.microblink.blinkid.hardware.camera.CameraType lIlIIIIlIl() {
        return this.IIIIIIIIII.llIIIlllll.llIIlIlIIl;
    }

    public final void lIllIIlIIl() {
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.IIIIIIIIII;
        if (illlllIIIl.llIIlIlIIl == null || illlllIIIl.llIIlIIlll != 5 || this.lIIIIIlIlI == null) {
            return;
        }
        try {
            this.IlIlllllII.set(android.hardware.camera2.CaptureRequest.CONTROL_MODE, 1);
            this.llIIlIIlll.llIIlIlIIl(this.IlIlllllII);
            this.IlIlllllII.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
            this.IlIlllllII.set(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE, 1);
            this.IIlIIIllIl.llIIlIlIIl(this.IlIlllllII);
            com.microblink.blinkid.secured.lIIlllIIlI liillliili = this.IlIllIlIIl;
            if (liillliili.IlIllIlIIl && liillliili.lIlIIIIlIl == 0.0f) {
                liillliili.lIlIIIIlIl = 0.2f;
            }
            this.lIlIIIIlIl.llIIlIlIIl(this.IlIlllllII, liillliili.lIlIIIIlIl);
            lIlllIlIlI();
            com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.llIIlIlIIl;
            if (ilIllIlIIl != null) {
                ilIllIlIIl.llIIlIlIIl();
            }
            for (int i = 0; i < 3; i++) {
                llIIlIlIIl(this.IlIIlllIIl);
            }
        } catch (android.hardware.camera2.CameraAccessException e) {
            com.microblink.blinkid.util.Log.e(this, e, "Failed to start capturing frames", new java.lang.Object[0]);
            this.IlIllIlllI.llIIlIlIIl(e);
        } catch (java.lang.IllegalStateException e2) {
            com.microblink.blinkid.util.Log.wtf(this, e2, "Camera session was just created and is already invalid?!?", new java.lang.Object[0]);
            this.IlIllIlllI.llIIlIlIIl(e2);
        }
    }

    public final void lIlllIlIlI() {
        android.media.ImageReader imageReader = this.llIIlIIIll.llIIlIlIIl;
        android.view.Surface surface = imageReader == null ? null : imageReader.getSurface();
        if (surface != null) {
            this.IlIlllllII.addTarget(surface);
            this.IlIIlllIIl = this.IlIlllllII.build();
            this.IlIlllllII.removeTarget(surface);
        }
        android.media.ImageReader imageReader2 = this.llIllIIlll.llIIlIlIIl;
        android.view.Surface surface2 = imageReader2 != null ? imageReader2.getSurface() : null;
        if (surface2 != null) {
            this.IlIlllllII.addTarget(surface2);
            this.lllllIlIll = this.IlIlllllII.build();
            this.IlIlllllII.removeTarget(surface2);
        }
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.lIIIIIlIlI;
        android.hardware.camera2.CaptureRequest build = this.IlIlllllII.build();
        com.microblink.blinkid.secured.IlIlIIllll ilIlIIllll = this.IIlIlllIIl;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.lIlllIlIlI;
        ilIlIlIIIl.llIIIlllll();
        cameraCaptureSession.setRepeatingRequest(build, ilIlIIllll, ilIlIlIIIl.llIIlIlIIl);
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean llIIIlllll() {
        return this.IIIIIIIIII.llIIIlllll.IlIllIlIIl == 270;
    }

    public final void llIIlIIIll() {
        try {
            lllllIlIll();
        } catch (java.lang.Throwable th) {
            com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.IIIIIIIIII;
            illlllIIIl.llIIIlllll.llIIlIlIIl = null;
            illlllIIIl.llIIlIlIIl(1);
            this.IlIllIlllI.llIIlIlIIl(th);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final java.lang.Boolean llIIlIIlll() {
        if (this.IlIlIlIIlI.get()) {
            return java.lang.Boolean.valueOf(this.llIIlIIlll.llIIlIlIIl);
        }
        return null;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback) {
        if (shakeCallback == null) {
            this.lllIlIlIIl = com.microblink.blinkid.hardware.accelerometer.ShakeCallback.EMPTY;
        } else {
            this.lllIlIlIIl = shakeCallback;
        }
    }

    /* renamed from: llIllIIlll, reason: merged with bridge method [inline-methods] */
    public final void IllIIlIIII() {
        if (this.IlIIIIIlll) {
            com.microblink.blinkid.util.Log.i(this, "Preview is already starting... Ignoring this call...", new java.lang.Object[0]);
            return;
        }
        android.hardware.camera2.CameraDevice cameraDevice = this.IIIIIIIIII.llIIlIlIIl;
        if (cameraDevice != null) {
            com.microblink.blinkid.secured.lIlIIIlIll liliiilill = this.llIIIlllll;
            if ((liliiilill.IllIIIllII != null && liliiilill.llIIIlllll) || liliiilill.IllIIIIllI != null) {
                try {
                    this.IlIIIIIlll = true;
                    android.view.Surface IllIIIllII = liliiilill.IllIIIllII();
                    com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII = this.llIIlIIIll;
                    com.microblink.blinkid.secured.lIllIlIlIl lillililil = this.lIIIIIllll;
                    com.microblink.blinkid.secured.IIllIIllll iIllIIllll = this.IlIllIlIIl.lIIIIIllll;
                    android.util.Size size = lillililil.IllIIIllII;
                    android.media.ImageReader newInstance = android.media.ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 3);
                    iIIIIIIlII.llIIlIlIIl = newInstance;
                    com.microblink.blinkid.secured.lIlIIlIlll liliililll = iIIIIIIlII.IIlIIIllIl;
                    com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = iIIIIIIlII.IlIllIlIIl;
                    ilIlIlIIIl.llIIIlllll();
                    newInstance.setOnImageAvailableListener(liliililll, ilIlIlIIIl.llIIlIlIIl);
                    iIIIIIIlII.IllIIIllII = new com.microblink.blinkid.secured.IIIllIlIIl(3, iIllIIllll);
                    com.microblink.blinkid.secured.lIIlllIIlI liillliili = this.IlIllIlIIl;
                    if (liillliili.lllIlIlIIl) {
                        com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII2 = this.llIllIIlll;
                        com.microblink.blinkid.secured.lIllIlIlIl lillililil2 = this.lIIIIIllll;
                        int i = liillliili.IlIllIlllI;
                        com.microblink.blinkid.secured.IIllIIllll iIllIIllll2 = liillliili.lIIIIIllll;
                        android.util.Size size2 = lillililil2.llIIIlllll;
                        android.media.ImageReader newInstance2 = android.media.ImageReader.newInstance(size2.getWidth(), size2.getHeight(), lillililil2.IllIIIIllI, i);
                        iIIIIIIlII2.llIIlIlIIl = newInstance2;
                        com.microblink.blinkid.secured.lIlIIlIlll liliililll2 = iIIIIIIlII2.IIlIIIllIl;
                        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl2 = iIIIIIIlII2.IlIllIlIIl;
                        ilIlIlIIIl2.llIIIlllll();
                        newInstance2.setOnImageAvailableListener(liliililll2, ilIlIlIIIl2.llIIlIlIIl);
                        iIIIIIIlII2.IllIIIllII = new com.microblink.blinkid.secured.IIIllIlIIl(i, iIllIIllll2);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(IllIIIllII);
                    android.media.ImageReader imageReader = this.llIIlIIIll.llIIlIlIIl;
                    android.view.Surface surface = null;
                    android.view.Surface surface2 = imageReader == null ? null : imageReader.getSurface();
                    if (surface2 != null) {
                        arrayList.add(surface2);
                    }
                    android.media.ImageReader imageReader2 = this.llIllIIlll.llIIlIlIIl;
                    if (imageReader2 != null) {
                        surface = imageReader2.getSurface();
                    }
                    if (surface != null) {
                        arrayList.add(surface);
                    }
                    android.hardware.camera2.CaptureRequest.Builder IlIllIlIIl = this.IIIIIIIIII.IlIllIlIIl();
                    this.IlIlllllII = IlIllIlIIl;
                    IlIllIlIIl.addTarget(IllIIIllII);
                    this.lllIIlIIlI = false;
                    this.IIIIIIIIII.llIIlIlIIl(arrayList, new com.microblink.blinkid.secured.IIlIlIIlll(this));
                    return;
                } catch (android.hardware.camera2.CameraAccessException e) {
                    this.IlIIIIIlll = false;
                    this.IlIllIlllI.llIIlIlIIl(e);
                    return;
                } catch (java.lang.IllegalStateException e2) {
                    this.IlIIIIIlll = false;
                    this.IlIllIlllI.llIIlIlIIl(e2);
                    return;
                }
            }
        }
        boolean z = cameraDevice != null;
        com.microblink.blinkid.secured.lIlIIIlIll liliiilill2 = this.llIIIlllll;
        com.microblink.blinkid.util.Log.w(this, "Cannot start preview. CameraDevice: {}, surface ready: {}, PreviewSize: {}", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf((liliiilill2.IllIIIllII != null && liliiilill2.llIIIlllll) || liliiilill2.IllIIIIllI != null), this.lIIIIIllll.IllIIIllII);
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void lllIIIlIlI() {
        if (!this.IlIIlIIIII) {
            com.microblink.blinkid.util.Log.i(this, "Stop preview has already been called. Ignoring this call!", new java.lang.Object[0]);
            return;
        }
        this.IlIIlIIIII = false;
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.IIIIIIIIII;
        if (illlllIIIl.llIIlIIlll == 2) {
            illlllIIIl.llIIlIlIIl(4);
        } else {
            illlllIIIl.llIIlIlIIl(3);
        }
        com.microblink.blinkid.util.Log.i(this, "Camera2Manager.stopPreview", new java.lang.Object[0]);
        this.lIlllIlIlI.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IlIIIlIIIl.this.IlIIlllIIl();
            }
        });
    }

    public final /* synthetic */ void lllIlIlIIl() {
        this.llIIlIlIIl = null;
        this.IlIllIlIIl = null;
        this.lIllIIlIIl = null;
        this.IllIIIllII = null;
        this.llIIlIIIll.llIIlIlIIl();
        this.llIllIIlll.llIIlIlIIl();
        this.lIlllIlIlI.IllIIIllII();
        this.lIlllIlIlI = null;
    }

    public final void lllllIlIll() {
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.IIIIIIIIII;
        if (illlllIIIl.llIIlIIlll != 1) {
            com.microblink.blinkid.util.Log.i(this, "Camera is already being opened.", new java.lang.Object[0]);
            return;
        }
        illlllIIIl.llIIlIlIIl(2);
        try {
            android.hardware.camera2.CameraCharacteristics llIIlIlIIl = this.IIIIIIIIII.llIIlIlIIl(this.IlIllIlIIl.IllIIIIllI, this.IlIllIlllI, new com.microblink.blinkid.secured.IlIIlllIll() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda1
                @Override // com.microblink.blinkid.secured.IlIIlllIll
                public final void llIIlIlIIl() {
                    com.microblink.blinkid.secured.IlIIIlIIIl.this.IllIIlIIII();
                }
            });
            if (llIIlIlIIl != null) {
                this.llIIlIIlll.llIIlIlIIl(llIIlIlIIl, this.IllIIIllII);
                if (!this.llIIlIIlll.llIIlIlIIl && this.IlIllIlIIl.IllIIIllII) {
                    throw new com.microblink.blinkid.hardware.camera.AutoFocusRequiredButNotSupportedException("Autofocus is required, but not supported on this device");
                }
                this.IIlIIIllIl.llIIlIlIIl(llIIlIlIIl);
                this.lIlIIIIlIl.llIIlIlIIl(llIIlIlIIl);
                this.IllIIIIllI.llIIlIlIIl(llIIlIlIIl);
                this.lIIIIIllll.llIIlIlIIl(llIIlIlIIl, this.IlIllIlIIl);
                android.util.Size size = this.lIIIIIllll.IllIIIllII;
                this.IlIllIlllI.llIIlIlIIl(size.getWidth(), size.getHeight());
                this.llIIIlllll.llIIlIlIIl(this.lIIIIIllll.llIIlIlIIl(), this.lIllIIlIIl);
            }
        } catch (android.hardware.camera2.CameraAccessException e) {
            this.IlIllIlllI.llIIlIlIIl(e);
        } catch (java.lang.NullPointerException e2) {
            int i = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
            com.microblink.blinkid.util.Log.e(this, e2, "Camera2 API not supported on this device: {}", new com.microblink.blinkid.secured.IllllIIIIl(android.os.Build.DEVICE, android.os.Build.MODEL));
            this.IlIllIlllI.llIIlIlIIl(e2);
        } catch (java.lang.SecurityException e3) {
            com.microblink.blinkid.util.Log.e(this, e3, "User has not granted permission to use camera!", new java.lang.Object[0]);
            this.IlIllIlllI.llIIlIlIIl(e3);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(float f) {
        android.hardware.camera2.CaptureRequest.Builder builder = this.IlIlllllII;
        if (builder == null || this.lIIIIIlIlI == null) {
            return;
        }
        this.lIlIIIIlIl.llIIlIlIIl(builder, f);
        llIIlIlIIl(this.lIlIIIIlIl.IllIIIIllI);
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(android.content.Context context, com.microblink.blinkid.secured.lIIlllIIlI liillliili, com.microblink.blinkid.view.IllIIIIllI illIIIIllI) {
        if (this.IlIIlIIIII) {
            com.microblink.blinkid.util.Log.i(this, "Start preview has already been called. Ignoring this call!", new java.lang.Object[0]);
            return;
        }
        this.llIIlIIIll.llIIlIlIIl();
        this.llIllIIlll.llIIlIlIIl();
        com.microblink.blinkid.util.Log.i(this, "Camera2Manager.startPreview", new java.lang.Object[0]);
        this.IlIIlIIIII = true;
        this.IlIllIlllI = illIIIIllI;
        this.IlIllIlIIl = liillliili;
        this.IlIlIlIIlI = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.llIIlIIIll.lIlIIIIlIl = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.llIllIIlll.lIlIIIIlIl = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.IlIIIIIlll = false;
        com.microblink.blinkid.secured.IIIlIIIIII iIIlIIIIII = this.IllIIIIllI;
        iIIlIIIIII.IllIIIllII = new java.util.concurrent.atomic.AtomicBoolean(false);
        iIIlIIIIII.llIIIlllll = new java.util.concurrent.atomic.AtomicInteger(0);
        com.microblink.blinkid.secured.IllIIIIllI illIIIIllI2 = this.llIIlIIlll;
        illIIIIllI2.llIIIlllll = new java.util.concurrent.atomic.AtomicBoolean(true);
        illIIIIllI2.IllIIIllII = 0;
        this.lIlllIlIlI.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IlIIIlIIIl.this.llIIlIIIll();
            }
        });
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean IlIllIlIIl() {
        return this.llIIlIlIIl.IllIIIllII.get();
    }

    public final void llIIlIlIIl(android.hardware.camera2.CaptureRequest captureRequest) {
        try {
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.lIIIIIlIlI;
            if (cameraCaptureSession != null) {
                com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.lIlllIlIlI;
                ilIlIlIIIl.llIIIlllll();
                cameraCaptureSession.capture(captureRequest, null, ilIlIlIIIl.llIIlIlIIl);
                return;
            }
            com.microblink.blinkid.util.Log.v(this, "Session is already closed. Cannot capture another frame.", new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(this, e, "Failed to capture frame", new java.lang.Object[0]);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(final boolean z, final com.microblink.blinkid.hardware.SuccessCallback successCallback) {
        if (this.IlIlllllII == null || this.lIIIIIlIlI == null) {
            return;
        }
        this.lIlllIlIlI.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IlIIIlIIIl.this.IlIllIlIIl(z, successCallback);
            }
        });
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean llIIlIlIIl() {
        int i = this.llIIlIIlll.IllIIIllII;
        return i == 4 || i == 2;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(android.graphics.Rect[] rectArr) {
        if (this.IlIlllllII == null || this.lIIIIIlIlI == null) {
            return;
        }
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = this.IllIIIllII;
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = ilIlIlllIl.IlIllIlIIl();
        if (IlIllIlIIl != null && ilIlIlllIl.llIIlIlIIl(IlIllIlIIl.IlIllIlllI)) {
            return;
        }
        this.lIlIIIIlIl.llIIlIlIIl(this.IlIlllllII, rectArr);
        this.lIlllIlIlI.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IlIIIlIIIl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IlIIIlIIIl.this.IlIlllllII();
            }
        });
    }
}
