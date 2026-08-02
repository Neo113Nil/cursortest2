package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIllIIlIIl implements com.microblink.blinkid.secured.IlIllllllI {
    public com.microblink.blinkid.secured.lIIlllIIlI IIlIIIllIl;
    public com.microblink.blinkid.secured.IlIllIlIIl IlIllIlIIl;
    public com.microblink.blinkid.secured.llIIllllIl IlIlllllII;
    public final com.microblink.blinkid.secured.IIIIIIIIII IllIIIIllI;
    public com.microblink.blinkid.secured.lIlIllIIlI IllIIIllII;
    public com.microblink.blinkid.view.IllIIIIllI lIllIIlIIl;
    public com.microblink.blinkid.hardware.accelerometer.ShakeCallback lllIIIlIlI;
    public com.microblink.blinkid.secured.IlIlIlllIl lllIlIlIIl;
    public final com.microblink.blinkid.secured.IlIlIlIIIl lllllIlIll;
    public android.hardware.Camera llIIlIlIIl = null;
    public com.microblink.blinkid.secured.lIlIllIIll llIIIlllll = null;
    public volatile boolean lIlIIIIlIl = false;
    public com.microblink.blinkid.secured.IlIIIIIlll llIIlIIlll = null;
    public com.microblink.blinkid.hardware.accelerometer.ShakeCallback lIIIIIllll = null;
    public java.lang.Boolean IlIllIlllI = null;
    public boolean IllIIlIIII = false;
    public com.microblink.blinkid.secured.IlIllIIlIl lIIIIIlIlI = null;
    public android.hardware.Camera.Size llIIlIIIll = null;
    public com.microblink.blinkid.hardware.camera.CameraType IlIIlllIIl = null;
    public int llIllIIlll = 0;
    public final java.util.concurrent.atomic.AtomicBoolean lIlllIlIlI = new java.util.concurrent.atomic.AtomicBoolean(false);
    public java.lang.Boolean lllIIlIIlI = null;
    public int IlIIlIIIII = -1;
    public boolean IlllIIIllI = false;
    public volatile int IlIlIlIIlI = 1;
    public final com.microblink.blinkid.secured.llIllIIlll IlIIIIIlll = new com.microblink.blinkid.secured.llIllIIlll(this);
    public final com.microblink.blinkid.secured.lllllIlIll IIIIIIIIII = new com.microblink.blinkid.secured.lllllIlIll(this);

    public lIllIIlIIl(com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl, com.microblink.blinkid.secured.llIIllllIl lliillllil, com.microblink.blinkid.secured.lIlIllIIlI lililliili, com.microblink.blinkid.secured.lIIlllIIlI liillliili) {
        this.IlIllIlIIl = null;
        this.IllIIIllII = null;
        this.IIlIIIllIl = null;
        this.IlIlllllII = null;
        this.IlIllIlIIl = ilIllIlIIl;
        com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII();
        this.lllIlIlIIl = IllIIIllII;
        if (IllIIIllII.llIIlIlIIl == null) {
            throw new java.lang.IllegalArgumentException("Provided device manager must have device lists loaded!");
        }
        this.IllIIIllII = lililliili;
        this.IIlIIIllIl = liillliili;
        this.IlIlllllII = lliillllil;
        com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl2 = this.IlIllIlIIl;
        if (ilIllIlIIl2 == null) {
            throw new java.lang.NullPointerException("Camera manager requires accelerometer manager and camera strategy factory to be non-null");
        }
        if (lililliili == null) {
            throw new java.lang.NullPointerException("Camera delegate can't be null.");
        }
        if (liillliili == null) {
            this.IIlIIIllIl = new com.microblink.blinkid.secured.lIIlllIIlI();
        }
        ilIllIlIIl2.IlIllIlIIl = new com.microblink.blinkid.secured.lIlllIlIlI(this);
        this.lllIIIlIlI = liillliili.llIIIlllll;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = com.microblink.blinkid.secured.IIIIIllIll.IlIllIlIIl.llIIlIlIIl;
        this.lllllIlIll = ilIlIlIIIl;
        this.IllIIIIllI = new com.microblink.blinkid.secured.IIIIIIIIII(IllIIIllII, ilIlIlIIIl, new com.microblink.blinkid.secured.IlIIlllIIl(this));
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void IIlIIIllIl() {
        this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.lllIlIlIIl();
            }
        });
    }

    public final void IlIIlllIIl() {
        android.hardware.Camera camera;
        java.lang.Boolean bool;
        if (this.lIlIIIIlIl) {
            com.microblink.blinkid.util.Log.w(this, "Preview is already active", new java.lang.Object[0]);
            return;
        }
        try {
            com.microblink.blinkid.secured.IIIIIIIIII iiiiiiiiii = this.IllIIIIllI;
            if ((iiiiiiiiii.lIlIIIIlIl == null && iiiiiiiiii.llIIlIIlll == null) || iiiiiiiiii.llIIIlllll <= 0 || iiiiiiiiii.IllIIIIllI <= 0 || this.lIlIIIIlIl || (camera = this.llIIlIlIIl) == null) {
                com.microblink.blinkid.util.Log.d(this, "Camera still hasn't got surface or preview already active or camera is null (due to error). Cannot start preview!", new java.lang.Object[0]);
                com.microblink.blinkid.secured.IIIIIIIIII iiiiiiiiii2 = this.IllIIIIllI;
                com.microblink.blinkid.util.Log.d(this, "surface sane: {}; previewActive: {}, camera: {}", java.lang.Boolean.valueOf(!(iiiiiiiiii2.lIlIIIIlIl == null && iiiiiiiiii2.llIIlIIlll == null) && iiiiiiiiii2.llIIIlllll > 0 && iiiiiiiiii2.IllIIIIllI > 0), java.lang.Boolean.valueOf(this.lIlIIIIlIl), this.llIIlIlIIl);
                return;
            }
            iiiiiiiiii.llIIlIlIIl(camera);
            com.microblink.blinkid.secured.IlllIlllll illlIlllll = new com.microblink.blinkid.secured.IlllIlllll(this.llIIlIlIIl);
            if (this.llIIlIIIll == null) {
                llIIlIlIIl(iiiiiiiiii);
            }
            com.microblink.blinkid.view.IllIIIIllI illIIIIllI = this.lIllIIlIIl;
            android.hardware.Camera.Size size = this.llIIlIIIll;
            illIIIIllI.llIIlIlIIl(size.width, size.height);
            com.microblink.blinkid.util.Log.d(this, "Resuming camera with preview size {}x{}", java.lang.Integer.valueOf(this.llIIlIIIll.width), java.lang.Integer.valueOf(this.llIIlIIIll.height));
            android.hardware.Camera.Size size2 = this.llIIlIIIll;
            illlIlllll.llIIlIlIIl.setPreviewSize(size2.width, size2.height);
            illlIlllll.llIIlIlIIl(this.lllIlIlIIl.llIIlIlIIl(this.IIlIIIllIl.lIlIIIIlIl));
            this.lIIIIIlIlI = llIIlIlIIl(illlIlllll);
            try {
                com.microblink.blinkid.util.Log.v(this, "Setting following parameters to camera: {}", illlIlllll.llIIlIlIIl.flatten());
                this.llIIlIlIIl.setParameters(illlIlllll.llIIlIlIIl);
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.e(this, e, "Setting camera parameters failed!", new java.lang.Object[0]);
                com.microblink.blinkid.util.Log.e(this, "Preview width: {} height: {}", java.lang.Integer.valueOf(this.llIIlIIIll.width), java.lang.Integer.valueOf(this.llIIlIIIll.height));
            }
            android.hardware.Camera.Size size3 = this.llIIlIIIll;
            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(illlIlllll.llIIlIlIIl.getPreviewFormat());
            if (bitsPerPixel == -1) {
                bitsPerPixel = 24;
            }
            int i = ((size3.width * size3.height) * bitsPerPixel) / 8;
            this.llIIlIlIIl.setPreviewCallbackWithBuffer(this.IIIIIIIIII);
            int i2 = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII == 1 ? 1 : 3;
            android.hardware.Camera.Size size4 = this.llIIlIIIll;
            this.llIIlIIlll = new com.microblink.blinkid.secured.IlIIIIIlll(size4.width, size4.height, i, i2, this, this.IIlIIIllIl.lIIIIIllll);
            com.microblink.blinkid.hardware.camera.Camera1Frame[] camera1FrameArr = new com.microblink.blinkid.hardware.camera.Camera1Frame[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                camera1FrameArr[i3] = (com.microblink.blinkid.hardware.camera.Camera1Frame) this.llIIlIIlll.llIIlIlIIl.llIIlIlIIl();
            }
            for (int i4 = 0; i4 < i2; i4++) {
                camera1FrameArr[i4].IlIllIlIIl();
            }
            com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
            com.microblink.blinkid.util.Log.v(this, "Focus manager: {}", ilIllIIlIl);
            if (ilIllIIlIl == null) {
                throw new java.lang.IllegalStateException("Method prepareCameraParametersAndFocusManager did not prepare focus manager!");
            }
            ilIllIIlIl.llIIlIlIIl(this.llIIlIlIIl);
            ilIllIIlIl.IIlIIIllIl();
            this.llIIlIlIIl.startPreview();
            this.lIlIIIIlIl = true;
            if (this.llIIlIlIIl != null) {
                com.microblink.blinkid.secured.IlllIlllll illlIlllll2 = new com.microblink.blinkid.secured.IlllIlllll(this.llIIlIlIIl);
                java.util.List<java.lang.String> supportedFlashModes = illlIlllll2.llIIlIlIIl.getSupportedFlashModes();
                if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                    com.microblink.blinkid.util.Log.i(illlIlllll2, "Camera does not support torch!", new java.lang.Object[0]);
                    bool = java.lang.Boolean.FALSE;
                } else {
                    com.microblink.blinkid.util.Log.i(illlIlllll2, "Camera supports torch!", new java.lang.Object[0]);
                    bool = java.lang.Boolean.TRUE;
                }
                this.lllIIlIIlI = bool;
            }
            int i5 = this.llIIIlllll.IllIIIllII;
            if (i5 > 0) {
                com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.lllllIlIll;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.microblink.blinkid.secured.lIllIIlIIl.this.lIIIIIlIlI();
                    }
                };
                long j = i5;
                ilIlIlIIIl.llIIIlllll();
                if (ilIlIlIIIl.IllIIIIllI.get()) {
                    com.microblink.blinkid.util.Log.w(ilIlIlIIIl, "Processing queue {} is exiting, unable to post job to it", ilIlIlIIIl.llIIIlllll);
                } else {
                    ilIlIlIIIl.llIIlIlIIl.postDelayed(runnable, j);
                }
            } else {
                com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.IlIllIlIIl;
                if (ilIllIlIIl != null) {
                    ilIllIlIIl.llIIlIlIIl();
                }
            }
            this.lIllIIlIIl.llIIlIlIIl();
        } catch (java.lang.Throwable th) {
            if (this.lIlllIlIlI.get()) {
                return;
            }
            this.lIllIIlIIl.llIIlIlIIl(th);
            this.lIlIIIIlIl = false;
            this.llIIlIlIIl.release();
            this.llIIlIlIIl = null;
        }
    }

    public final void IlIllIlIIl(final int i) {
        this.llIllIIlll = i;
        if (this.lIlIIIIlIl) {
            this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.lIllIIlIIl.this.llIIlIlIIl(i);
                }
            });
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean IlIllIlllI() {
        java.lang.Boolean bool = this.lllIIlIIlI;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.microblink.blinkid.util.Log.e(this, "Camera not yet initialized. Unable to determine if torch is supported!", new java.lang.Object[0]);
        return false;
    }

    public final /* synthetic */ void IlIlllllII() {
        com.microblink.blinkid.util.Log.d(this, "Triggering autofocus", new java.lang.Object[0]);
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl == null || ilIllIIlIl.llIIlIIlll()) {
            return;
        }
        ilIllIIlIl.llIIlIlIIl(true);
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final com.microblink.blinkid.secured.IIIIlIIlIl IllIIIIllI() {
        return this.IllIIIIllI;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final int IllIIIllII() {
        return this.IlIIlIIIII;
    }

    public final void IllIIlIIII() {
        com.microblink.blinkid.secured.IlIIIIIlll ilIIIIIlll = this.llIIlIIlll;
        if (ilIIIIIlll != null) {
            com.microblink.blinkid.secured.IlIlIlIIlI ilIlIlIIlI = ilIIIIIlll.llIIlIlIIl;
            java.util.HashMap hashMap = ilIlIlIIlI.IllIIIIllI;
            if (hashMap != null) {
                java.util.Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((com.microblink.blinkid.hardware.camera.Camera1Frame) ilIlIlIIlI.IllIIIIllI.get((byte[]) it.next())).lIlIIIIlIl();
                }
                ilIlIlIIlI.IllIIIIllI.clear();
            }
            ilIlIlIIlI.IllIIIIllI = null;
            ilIIIIIlll.llIIlIlIIl = null;
        }
        this.llIIlIIlll = null;
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl != null) {
            ilIllIIlIl.dispose();
        }
        this.lIIIIIlIlI = null;
        this.IlIllIlIIl = null;
        this.IIlIIIllIl = null;
        this.IllIIIllII = null;
        this.IlIlllllII = null;
        this.lIIIIIllll = null;
        this.llIIlIIIll = null;
        this.IlIIlllIIl = null;
        this.lllIlIlIIl = null;
        this.lIllIIlIIl = null;
        this.lllIIIlIlI = null;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void dispose() {
        if (this.lIlllIlIlI.compareAndSet(false, true)) {
            this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.lIllIIlIIl.this.IllIIlIIII();
                }
            });
        }
    }

    public final void finalize() {
        dispose();
        super.finalize();
    }

    public final /* synthetic */ void lIIIIIlIlI() {
        com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.IlIllIlIIl;
        if (ilIllIlIIl != null) {
            ilIllIlIIl.llIIlIlIIl();
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void lIIIIIllll() {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl == null || ilIllIIlIl.llIIlIIlll()) {
            return;
        }
        this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.IlIlllllII();
            }
        });
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final com.microblink.blinkid.hardware.camera.CameraType lIlIIIIlIl() {
        return this.IlIIlllIIl;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean llIIIlllll() {
        return this.IlIIlIIIII == 270;
    }

    public final void llIIlIIIll() {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl != null) {
            com.microblink.blinkid.util.Log.i(this, "Pausing focus manager", new java.lang.Object[0]);
            ilIllIIlIl.llIIIlllll();
        }
        com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.IlIllIlIIl;
        if (ilIllIlIIl != null) {
            com.microblink.blinkid.util.Log.i(this, "Pausing accelerometer", new java.lang.Object[0]);
            com.microblink.blinkid.util.Log.v(ilIllIlIIl, "Unregistering accelerometer sensor listener {}", ilIllIlIIl);
            java.util.Timer timer = ilIllIlIIl.IIlIIIllIl;
            if (timer != null) {
                timer.cancel();
                ilIllIlIIl.IIlIIIllIl = null;
            }
            ilIllIlIIl.IllIIIIllI.unregisterListener(ilIllIlIIl);
        }
        android.hardware.Camera camera = this.llIIlIlIIl;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
            com.microblink.blinkid.util.Log.i(this, "Stopping camera preview", new java.lang.Object[0]);
            this.lIlIIIIlIl = false;
            this.llIIlIlIIl.stopPreview();
            if (!this.lIlllIlIlI.get()) {
                this.lIllIIlIIl.IlIllIlIIl();
            }
            com.microblink.blinkid.util.Log.i(this, "Releasing camera", new java.lang.Object[0]);
            this.llIIlIlIIl.release();
            com.microblink.blinkid.util.Log.i(this, "Camera released", new java.lang.Object[0]);
            this.llIIlIlIIl = null;
            this.lllIIlIIlI = null;
            this.IlIllIlllI = null;
        }
        this.llIIIlllll = null;
        this.IllIIlIIII = false;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final java.lang.Boolean llIIlIIlll() {
        return this.IlIllIlllI;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback) {
        this.lIIIIIllll = shakeCallback;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void lllIIIlIlI() {
        if (!this.IlllIIIllI) {
            com.microblink.blinkid.util.Log.i(this, "Stop preview has already been called. Ignoring this call!", new java.lang.Object[0]);
            return;
        }
        this.IlllIIIllI = false;
        com.microblink.blinkid.util.Log.i(this, "Camera1Manager.stopPreview", new java.lang.Object[0]);
        this.IllIIlIIII = true;
        this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.llIIlIIIll();
            }
        });
    }

    public final /* synthetic */ void lllIlIlIIl() {
        if (this.llIIlIlIIl == null || this.IlIlIlIIlI == 2 || !this.lIlIIIIlIl) {
            return;
        }
        this.IlIlIlIIlI = 2;
        this.llIIlIlIIl.takePicture(null, null, this.IlIIIIIlll);
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(final android.content.Context context, final com.microblink.blinkid.secured.lIIlllIIlI liillliili, com.microblink.blinkid.view.IllIIIIllI illIIIIllI) {
        if (this.IlllIIIllI) {
            com.microblink.blinkid.util.Log.i(this, "Start preview has already been called. Ignoring this call!", new java.lang.Object[0]);
            return;
        }
        com.microblink.blinkid.util.Log.i(this, "Camera1Manager.startPreview", new java.lang.Object[0]);
        this.IlllIIIllI = true;
        this.lIllIIlIIl = illIIIIllI;
        this.IIlIIIllIl = liillliili;
        this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.llIIlIlIIl(liillliili, context);
            }
        });
    }

    public final void IlIllIlIIl(float f) {
        if (this.llIIlIlIIl != null) {
            try {
                this.llIIlIlIIl.setParameters(new com.microblink.blinkid.secured.IlllIlllll(this.llIIlIlIIl).llIIlIlIIl(this.lllIlIlIIl.llIIlIlIIl(f)).llIIlIlIIl);
            } catch (java.lang.RuntimeException unused) {
                com.microblink.blinkid.util.Log.e(this, "Failed to set zoom level to {}", java.lang.Float.valueOf(f));
            }
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean IlIllIlIIl() {
        return this.IlIllIlIIl.IllIIIllII.get();
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.lIIlllIIlI liillliili, android.content.Context context) {
        try {
            com.microblink.blinkid.util.Log.i(this, "Opening camera...", new java.lang.Object[0]);
            android.hardware.Camera llIIlIlIIl = llIIlIlIIl(liillliili.IllIIIIllI);
            this.llIIlIlIIl = llIIlIlIIl;
            com.microblink.blinkid.secured.lIlIllIIll llIIlIlIIl2 = this.IlIlllllII.llIIlIlIIl(context, llIIlIlIIl, liillliili);
            this.llIIIlllll = llIIlIlIIl2;
            com.microblink.blinkid.util.Log.i(this, "Camera strategy: {}", llIIlIlIIl2);
            com.microblink.blinkid.util.Log.i(this, "Camera sensor orientation is {}", java.lang.Integer.valueOf(this.IlIIlIIIII));
            if (this.IlIIlIIIII == 0) {
                com.microblink.blinkid.hardware.camera.CameraType cameraType = this.IlIIlllIIl;
                if (cameraType == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE) {
                    this.IlIIlIIIII = 90;
                } else if (cameraType == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE) {
                    this.IlIIlIIIII = 270;
                }
            }
            int i = this.llIllIIlll;
            if (i != 0) {
                com.microblink.blinkid.util.Log.i(this, "Rotating camera preview by {} degrees!", java.lang.Integer.valueOf(i));
                com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl(this.llIIlIlIIl, this.llIllIIlll, this.IlIIlIIIII, this.IlIIlllIIl == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE);
            }
            IlIIlllIIl();
        } catch (java.lang.Throwable th) {
            android.hardware.Camera camera = this.llIIlIlIIl;
            if (camera != null) {
                camera.release();
                this.llIIlIlIIl = null;
            }
            if (this.lIlllIlIlI.get()) {
                return;
            }
            this.lIllIIlIIl.llIIlIlIIl(th);
        }
    }

    public final /* synthetic */ void IlIllIlIIl(android.graphics.Rect[] rectArr) {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl != null) {
            ilIllIIlIl.llIIlIlIIl(rectArr);
        }
    }

    public final /* synthetic */ void llIIlIlIIl(int i) {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl.llIIlIIlll()) {
            ilIllIIlIl.IllIIIllII();
        }
        com.microblink.blinkid.util.Log.i(this, "Rotating camera preview by {} degrees!", java.lang.Integer.valueOf(i));
        com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl(this.llIIlIlIIl, i, this.IlIIlIIIII, this.IlIIlllIIl == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE);
        this.llIllIIlll = i;
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final boolean llIIlIlIIl() {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        return ilIllIIlIl != null && ilIllIIlIl.IlIllIlIIl();
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(final boolean z, final com.microblink.blinkid.hardware.SuccessCallback successCallback) {
        if (!IlIllIlllI()) {
            com.microblink.blinkid.util.Log.e(this, "Camera does not support torch! Cannot change torch state!", new java.lang.Object[0]);
            if (successCallback != null) {
                successCallback.onOperationDone(false);
                return;
            }
            return;
        }
        this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.llIIlIlIIl(successCallback, z);
            }
        });
    }

    public final void llIIlIlIIl(com.microblink.blinkid.hardware.SuccessCallback successCallback, boolean z) {
        if (this.llIIlIlIIl == null) {
            com.microblink.blinkid.util.Log.e(this, "Camera not yet initialized. Unable to change torch state!", new java.lang.Object[0]);
            if (successCallback != null) {
                successCallback.onOperationDone(false);
            }
        }
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
        if (ilIllIIlIl != null && ilIllIIlIl.llIIlIIlll()) {
            ilIllIIlIl.IllIIIllII();
        }
        try {
            com.microblink.blinkid.secured.IlllIlllll illlIlllll = new com.microblink.blinkid.secured.IlllIlllll(this.llIIlIlIIl);
            illlIlllll.llIIlIlIIl(z);
            this.llIIlIlIIl.setParameters(illlIlllll.llIIlIlIIl);
            lIIIIIllll();
            if (successCallback != null) {
                successCallback.onOperationDone(true);
            }
        } catch (java.lang.RuntimeException unused) {
            if (successCallback != null) {
                successCallback.onOperationDone(false);
            }
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(final float f) {
        this.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.IlIllIlIIl(f);
            }
        });
    }

    @Override // com.microblink.blinkid.secured.IlIllllllI
    public final void llIIlIlIIl(final android.graphics.Rect[] rectArr) {
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = this.lllIlIlIIl;
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = ilIlIlllIl.IlIllIlIIl();
        if (IlIllIlIIl == null || !ilIlIlllIl.llIIlIlIIl(IlIllIlIIl.IlIllIlllI)) {
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.lllllIlIll;
            if (ilIlIlIIIl == null || this.lIIIIIlIlI == null) {
                return;
            }
            ilIlIlIIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.lIllIIlIIl.this.IlIllIlIIl(rectArr);
                }
            });
            return;
        }
        com.microblink.blinkid.util.Log.e(this, "Setting metering areas not supported on this device", new java.lang.Object[0]);
    }

    public final com.microblink.blinkid.secured.IlIllIIlIl llIIlIlIIl(com.microblink.blinkid.secured.IlllIlllll illlIlllll) {
        java.lang.String llIIlIlIIl;
        char c;
        com.microblink.blinkid.secured.IlIllIIlIl liliiiilil;
        com.microblink.blinkid.secured.lIIlllIIlI liillliili = this.IIlIIIllIl;
        boolean z = liillliili.IlIllIlIIl;
        if (z && liillliili.lIlIIIIlIl == 0.0f) {
            liillliili.lIlIIIIlIl = 0.2f;
        }
        if (z) {
            com.microblink.blinkid.util.Log.i(this, "Optimizing camera parameters for near scanning", new java.lang.Object[0]);
            llIIlIlIIl = illlIlllll.llIIlIlIIl(com.microblink.blinkid.secured.IlllIlllll.IlIllIlIIl);
        } else {
            llIIlIlIIl = illlIlllll.llIIlIlIIl(com.microblink.blinkid.secured.IlllIlllll.IllIIIllII);
        }
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = this.lllIlIlIIl;
        com.microblink.blinkid.secured.lIIlllIIlI liillliili2 = this.IIlIIIllIl;
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = this.IllIIIllII;
        llIIlIlIIl.hashCode();
        int hashCode = llIIlIlIIl.hashCode();
        if (hashCode == 3005871) {
            if (llIIlIlIIl.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 103652300) {
            if (hashCode == 910005312 && llIIlIlIIl.equals("continuous-picture")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (llIIlIlIIl.equals("macro")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            com.microblink.blinkid.util.Log.v(null, "Activated autofocus", new java.lang.Object[0]);
            liliiiilil = new com.microblink.blinkid.secured.lIlIIIIlIl(lililliili, ilIlIlllIl);
        } else if (c == 1) {
            com.microblink.blinkid.util.Log.v(null, "Activated macro focus mode", new java.lang.Object[0]);
            liliiiilil = new com.microblink.blinkid.secured.lIlIIIIlIl(lililliili, ilIlIlllIl);
        } else if (c != 2) {
            com.microblink.blinkid.util.Log.e(null, "Autofocus not supported", new java.lang.Object[0]);
            if (!liillliili2.IllIIIllII) {
                liliiiilil = new com.microblink.blinkid.secured.lIllIIIIIl();
            } else {
                throw new com.microblink.blinkid.hardware.camera.AutoFocusRequiredButNotSupportedException("Autofocus is required, but not supported on this camera");
            }
        } else {
            com.microblink.blinkid.util.Log.d(null, "Activated continous picture autofocus", new java.lang.Object[0]);
            liliiiilil = new com.microblink.blinkid.secured.lllllIIIlI(lililliili, ilIlIlllIl, z);
        }
        this.IlIllIlllI = java.lang.Boolean.valueOf(liliiiilil.llIIlIlIIl());
        illlIlllll.llIIlIlIIl(false);
        java.lang.String str = illlIlllll.llIIlIlIIl.get("phase-af-values");
        com.microblink.blinkid.util.Log.i(illlIlllll, "Supported Phase AutoFocus modes: {}", str);
        if (str != null) {
            for (java.lang.String str2 : str.split(",")) {
                if ("on".equals(str2)) {
                    com.microblink.blinkid.util.Log.i(illlIlllll, "Activating Phase Autofocus!", new java.lang.Object[0]);
                    illlIlllll.llIIlIlIIl.set("phase-af", "on");
                }
            }
        }
        illlIlllll.IlIllIlIIl();
        illlIlllll.llIIlIlIIl();
        illlIlllll.IllIIIIllI();
        int i = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
        java.lang.String str3 = android.os.Build.MODEL;
        if ("Nexus 4".equals(str3)) {
            illlIlllll.llIIIlllll();
        } else if (str3.contains("Glass")) {
            illlIlllll.IllIIIllII();
        } else {
            illlIlllll.llIIlIlIIl.setPreviewFrameRate(30);
        }
        com.microblink.blinkid.util.Log.v(this, "Final parameters: {}", illlIlllll.llIIlIlIIl.flatten());
        return liliiiilil;
    }

    public final android.hardware.Camera llIIlIlIIl(com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        boolean z = false;
        boolean z2 = false;
        for (int i5 = 0; i5 < numberOfCameras; i5++) {
            android.hardware.Camera.getCameraInfo(i5, cameraInfo);
            int i6 = cameraInfo.facing;
            if (i6 == 1) {
                if (i2 == -1) {
                    i4 = cameraInfo.orientation;
                    com.microblink.blinkid.util.Log.i(this, "Front facing orientation: {}", java.lang.Integer.valueOf(i4));
                    android.hardware.Camera open = android.hardware.Camera.open(i5);
                    boolean contains = new com.microblink.blinkid.secured.IlllIlllll(open).llIIlIlIIl.getSupportedFocusModes().contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    open.release();
                    z = contains;
                    i2 = i5;
                } else if (!z) {
                    android.hardware.Camera open2 = android.hardware.Camera.open(i5);
                    boolean contains2 = new com.microblink.blinkid.secured.IlllIlllll(open2).llIIlIlIIl.getSupportedFocusModes().contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    open2.release();
                    if (contains2) {
                        i4 = cameraInfo.orientation;
                        com.microblink.blinkid.util.Log.i(this, "Front facing orientation: {}", java.lang.Integer.valueOf(i4));
                        i2 = i5;
                        z = true;
                    }
                } else {
                    com.microblink.blinkid.util.Log.w(this, "Handling multiple front cameras with autofocus currently not supported! Will use the first found '{}'", java.lang.Integer.valueOf(i2));
                }
            } else if (i6 == 0) {
                if (i == -1) {
                    i3 = cameraInfo.orientation;
                    com.microblink.blinkid.util.Log.i(this, "Back facing orientation: {}", java.lang.Integer.valueOf(i3));
                    android.hardware.Camera open3 = android.hardware.Camera.open(i5);
                    boolean contains3 = new com.microblink.blinkid.secured.IlllIlllll(open3).llIIlIlIIl.getSupportedFocusModes().contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    open3.release();
                    z2 = contains3;
                    i = i5;
                } else if (!z2) {
                    android.hardware.Camera open4 = android.hardware.Camera.open(i5);
                    boolean contains4 = new com.microblink.blinkid.secured.IlllIlllll(open4).llIIlIlIIl.getSupportedFocusModes().contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    open4.release();
                    if (contains4) {
                        i3 = cameraInfo.orientation;
                        i = i5;
                        z2 = true;
                    }
                } else {
                    com.microblink.blinkid.util.Log.w(this, "Handling multiple back cameras with autofocus currently not supported. Will use the first found '{}'", java.lang.Integer.valueOf(i));
                }
            }
        }
        com.microblink.blinkid.hardware.camera.CameraType cameraType2 = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE;
        if (cameraType == cameraType2) {
            if (i >= 0) {
                this.IlIIlllIIl = cameraType2;
                this.IlIIlIIIII = i3;
                return android.hardware.Camera.open(i);
            }
            throw new java.lang.RuntimeException("Device does not have back facing camera!");
        }
        com.microblink.blinkid.hardware.camera.CameraType cameraType3 = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE;
        if (cameraType == cameraType3) {
            if (i2 >= 0) {
                this.IlIIlllIIl = cameraType3;
                this.IlIIlIIIII = i4;
                return android.hardware.Camera.open(i2);
            }
            throw new java.lang.RuntimeException("Device does not have front facing camera!");
        }
        if (i >= 0) {
            this.IlIIlllIIl = cameraType2;
            this.IlIIlIIIII = i3;
            return android.hardware.Camera.open(i);
        }
        if (i2 >= 0) {
            this.IlIIlllIIl = cameraType3;
            this.IlIIlIIIII = i4;
            return android.hardware.Camera.open(i2);
        }
        throw new java.lang.RuntimeException("Device does not have cameras!");
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.IIIIIIIIII iiiiiiiiii) {
        android.hardware.Camera.Size llIIlIlIIl = this.llIIIlllll.llIIlIlIIl(iiiiiiiiii.llIIIlllll, iiiiiiiiii.IllIIIIllI, this.IlIIlllIIl);
        this.llIIlIIIll = llIIlIlIIl;
        if (llIIlIlIIl != null) {
            int i = iiiiiiiiii.llIIIlllll;
            int i2 = iiiiiiiiii.IllIIIIllI;
            com.microblink.blinkid.util.Log.i(this, "For surface size {}x{} and preset {}, selected preview size is {}x{}", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), this.IIlIIIllIl.llIIlIlIIl, java.lang.Integer.valueOf(this.llIIlIIIll.width), java.lang.Integer.valueOf(this.llIIlIIIll.height));
            return;
        }
        throw new com.microblink.blinkid.hardware.camera.CameraResolutionTooSmallException("Camera preview size could not be chosen!");
    }

    public final void llIIlIlIIl(final com.microblink.blinkid.hardware.camera.Camera1Frame camera1Frame) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIllIIlIIl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.lIllIIlIIl.this.llIIlIlIIl(camera1Frame);
            }
        };
        if (this.lllllIlIll != null) {
            android.os.Looper myLooper = android.os.Looper.myLooper();
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.lllllIlIll;
            ilIlIlIIIl.llIIIlllll();
            if (myLooper == ilIlIlIIIl.llIIlIlIIl.getLooper()) {
                runnable.run();
            } else {
                this.lllllIlIll.llIIlIlIIl(runnable);
            }
        }
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.llIIlIIIll lliiliiill) {
        android.hardware.Camera camera = this.llIIlIlIIl;
        if (camera != null && !this.IllIIlIIII) {
            byte[] bArr = lliiliiill.llIIlIlIIl;
            if (bArr != null) {
                camera.addCallbackBuffer(bArr);
            }
            com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.lIIIIIlIlI;
            if (ilIllIIlIl != null) {
                ilIllIIlIl.IllIIIIllI();
                return;
            }
            return;
        }
        com.microblink.blinkid.util.Log.w(this, "Camera is released, cannot request another frame", new java.lang.Object[0]);
    }
}
