package com.facetec.sdk;

/* loaded from: classes8.dex */
final class af extends com.facetec.sdk.ai {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static java.lang.Boolean Q;
    private static java.lang.Boolean R;
    private static android.view.Surface S;
    private static /* synthetic */ boolean T;
    private static int U;
    private static int V;
    private static final byte[] X = null;
    private static final int Y = 0;
    private android.hardware.camera2.CameraCaptureSession A;
    private int B;
    private android.hardware.camera2.CameraDevice C;
    private android.os.HandlerThread D;
    private android.os.Handler G;
    private java.lang.Object H;
    private android.hardware.camera2.CaptureRequest.Builder I;
    private final android.view.TextureView.SurfaceTextureListener W;
    private final java.lang.ref.WeakReference<com.facetec.sdk.bf> p;
    private final com.facetec.sdk.ao v;
    private java.lang.String x;
    private final com.facetec.sdk.h y;
    private android.hardware.camera2.CameraCharacteristics z;
    private final com.facetec.sdk.ee w = new com.facetec.sdk.ee() { // from class: com.facetec.sdk.af$$ExternalSyntheticLambda2
        @Override // com.facetec.sdk.ee
        public final void oia(java.lang.Object obj) {
            com.facetec.sdk.af.this.e(obj);
        }
    };
    private final java.util.concurrent.Semaphore u = new java.util.concurrent.Semaphore(1);
    private boolean E = false;
    private boolean F = false;
    private boolean L = false;
    boolean m = false;
    int n = 0;
    int q = 0;
    int t = 0;
    private boolean K = false;
    int s = 0;
    private boolean M = false;
    private boolean J = false;
    private boolean N = false;
    private android.hardware.camera2.CameraCaptureSession.StateCallback P = new android.hardware.camera2.CameraCaptureSession.StateCallback() { // from class: com.facetec.sdk.af.1
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            com.facetec.sdk.bc.c("CTCCST");
            com.facetec.sdk.af.e(com.facetec.sdk.af.this, cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            com.facetec.sdk.af.b(com.facetec.sdk.af.this, com.facetec.sdk.c.CAMERA_CONFIGURE_FAILED_DEFAULT, "");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            super.onReady(cameraCaptureSession);
            com.facetec.sdk.af.e(com.facetec.sdk.af.this);
            if (!com.facetec.sdk.af.this.J || com.facetec.sdk.af.this.I == null || com.facetec.sdk.af.this.A == null) {
                return;
            }
            com.facetec.sdk.af.c(com.facetec.sdk.af.this);
            try {
                com.facetec.sdk.af.this.A.setRepeatingRequest(com.facetec.sdk.af.this.I.build(), com.facetec.sdk.af.this.r, null);
            } catch (java.lang.Exception unused) {
            }
        }
    };
    android.hardware.camera2.CameraCaptureSession.CaptureCallback r = new android.hardware.camera2.CameraCaptureSession.CaptureCallback() { // from class: com.facetec.sdk.af.2
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (!com.facetec.sdk.af.this.m) {
                com.facetec.sdk.af.this.m = true;
            }
            if (com.facetec.sdk.af.this.t > 1) {
                com.facetec.sdk.af afVar = com.facetec.sdk.af.this;
                com.facetec.sdk.c cVar = com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_DEFAULT;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Capture Complete After No Data Consec. Fails:  ");
                sb.append(com.facetec.sdk.af.this.q);
                com.facetec.sdk.af.b(afVar, cVar, sb.toString());
            }
            com.facetec.sdk.af.this.q = 0;
            com.facetec.sdk.af.this.t = 0;
            com.facetec.sdk.af.this.s = 0;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (captureFailure.getReason() == 1) {
                return;
            }
            if (com.facetec.sdk.af.this.n == 0) {
                if (!com.facetec.sdk.af.this.m && !captureFailure.wasImageCaptured()) {
                    com.facetec.sdk.af.b(com.facetec.sdk.af.this, com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_DEFAULT, "Fallback To Legacy Camera");
                    com.facetec.sdk.af.b(com.facetec.sdk.af.this, com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_ATTEMPT_FALLBACK, com.facetec.sdk.ai.g());
                }
            } else if (com.facetec.sdk.af.this.t == 1 && !captureFailure.wasImageCaptured()) {
                com.facetec.sdk.af afVar = com.facetec.sdk.af.this;
                com.facetec.sdk.c cVar = com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_DEFAULT;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Detected No Data Consec. Fails:  ");
                sb.append(com.facetec.sdk.af.this.t + 1);
                sb.append(" | Consec. Fails:  ");
                sb.append(com.facetec.sdk.af.this.q + 1);
                sb.append(" | Captured: ");
                sb.append(captureFailure.wasImageCaptured());
                com.facetec.sdk.af.b(afVar, cVar, sb.toString());
            } else if (com.facetec.sdk.af.this.q == 20) {
                com.facetec.sdk.af afVar2 = com.facetec.sdk.af.this;
                com.facetec.sdk.c cVar2 = com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_DEFAULT;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Camera Capture Hang Detected -- Consec. Fails:  ");
                sb2.append(com.facetec.sdk.af.this.q + 1);
                sb2.append(" | Captured: ");
                sb2.append(captureFailure.wasImageCaptured());
                com.facetec.sdk.af.b(afVar2, cVar2, sb2.toString());
            }
            if (!captureFailure.wasImageCaptured()) {
                com.facetec.sdk.af.this.t++;
            }
            com.facetec.sdk.af.this.n++;
            com.facetec.sdk.af.this.q++;
            com.facetec.sdk.k.e = java.lang.Math.max(com.facetec.sdk.af.this.q, com.facetec.sdk.k.e);
            com.facetec.sdk.k.i = java.lang.Math.max(com.facetec.sdk.af.this.t, com.facetec.sdk.k.i);
        }
    };
    private final android.hardware.camera2.CameraDevice.StateCallback O = new android.hardware.camera2.CameraDevice.StateCallback() { // from class: com.facetec.sdk.af.3
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            com.facetec.sdk.bc.c("CTOT");
            com.facetec.sdk.af.c(com.facetec.sdk.af.this, cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            com.facetec.sdk.af.e(com.facetec.sdk.af.this, cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(android.hardware.camera2.CameraDevice cameraDevice, int i) {
            com.facetec.sdk.af.a(com.facetec.sdk.af.this, cameraDevice, i);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            com.facetec.sdk.af.g(com.facetec.sdk.af.this);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aa(short s, byte b2, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s2 + 97;
        int i3 = 4 - (b2 * 4);
        int i4 = s * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i2;
            i = 0;
            i2 = i5;
            i2 += i6;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i3];
            i2 += i6;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{87, -7, 5, -116};
        $$b = 4;
    }

    @Override // com.facetec.sdk.ai
    final void a(boolean z) {
    }

    @Override // com.facetec.sdk.ai
    final void c(android.hardware.Camera.PictureCallback pictureCallback) {
    }

    @Override // com.facetec.sdk.ai
    final void d(android.view.ViewGroup viewGroup) {
    }

    @Override // com.facetec.sdk.ai
    final void d(boolean z) {
    }

    @Override // com.facetec.sdk.ai
    final void d(boolean z, android.view.ViewGroup viewGroup) {
    }

    static {
        init$0();
        m();
        V = 0;
        U = 1;
        T = true;
        S = null;
        R = null;
        Q = null;
    }

    static /* synthetic */ boolean c(com.facetec.sdk.af afVar) {
        afVar.J = false;
        return false;
    }

    static /* synthetic */ void e(com.facetec.sdk.af afVar, android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        boolean z = false;
        try {
            try {
                z = afVar.u.tryAcquire(2L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Exception e) {
                com.facetec.sdk.n.b(e);
                if (!z) {
                    return;
                }
            }
            if (afVar.C != null && afVar.A == null) {
                afVar.A = cameraCaptureSession;
                if (!com.facetec.sdk.bd.h) {
                    if (afVar.c(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 4)) {
                        afVar.I.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 4);
                    }
                } else if (afVar.c(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 3)) {
                    afVar.I.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 3);
                }
                if (afVar.c(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, 1)) {
                    afVar.I.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
                }
                com.facetec.sdk.bc.a("CTPRT");
                if (afVar.i && afVar.N) {
                    afVar.A.setRepeatingRequest(afVar.I.build(), afVar.r, null);
                } else {
                    afVar.J = true;
                }
                com.facetec.sdk.bc.c("CTPRT");
                if (!z) {
                    return;
                }
                afVar.u.release();
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                afVar.u.release();
            }
            throw th;
        }
    }

    static /* synthetic */ boolean e(com.facetec.sdk.af afVar) {
        afVar.N = true;
        return true;
    }

    af(android.app.Activity activity) throws com.facetec.sdk.ak {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = new android.view.TextureView.SurfaceTextureListener() { // from class: com.facetec.sdk.af.5
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
                com.facetec.sdk.af.b(com.facetec.sdk.af.this, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
                com.facetec.sdk.af.this.c(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                try {
                    com.facetec.sdk.af.this.b(false);
                    return true;
                } catch (java.lang.Exception unused) {
                    return true;
                }
            }
        };
        this.W = surfaceTextureListener;
        this.p = new java.lang.ref.WeakReference<>((com.facetec.sdk.bf) activity);
        if (!com.facetec.sdk.bd.h) {
            this.v = h();
        } else {
            this.v = f();
        }
        com.facetec.sdk.h hVar = new com.facetec.sdk.h(activity);
        this.y = hVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraBackground");
        this.D = handlerThread;
        handlerThread.start();
        this.G = new android.os.Handler(this.D.getLooper());
        if (hVar.isAvailable()) {
            b(activity, hVar.getWidth(), hVar.getHeight());
        } else {
            hVar.setSurfaceTextureListener(surfaceTextureListener);
        }
    }

    @Override // com.facetec.sdk.ai
    public final android.view.View b() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(android.util.Size size, android.util.Size size2) {
        return java.lang.Integer.compare(size.getHeight() * size.getWidth(), size2.getHeight() * size2.getWidth());
    }

    private void b(android.app.Activity activity) throws android.hardware.camera2.CameraAccessException, com.facetec.sdk.ak {
        a(activity, f(activity));
    }

    private void e(android.app.Activity activity) throws android.hardware.camera2.CameraAccessException, com.facetec.sdk.ak {
        a(activity, g(activity));
    }

    private void a(android.app.Activity activity, com.facetec.sdk.af.b bVar) throws android.hardware.camera2.CameraAccessException, com.facetec.sdk.ak {
        if (bVar != null) {
            java.lang.String str = bVar.c;
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = bVar.f3382a;
            android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = bVar.b;
            int intValue = ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.B = intValue;
            j = intValue;
            activity.getWindowManager().getDefaultDisplay().getSize(new android.graphics.Point());
            activity.getWindowManager().getDefaultDisplay().getRealSize(new android.graphics.Point());
            if (com.facetec.sdk.dp.a((android.content.Context) activity).getConfiguration().orientation == 2) {
                this.y.setAspectRatio(this.v.b, this.v.c);
            } else {
                this.y.setAspectRatio(this.v.c, this.v.b);
            }
            a(activity, streamConfigurationMap);
            this.x = str;
            this.z = cameraCharacteristics;
            return;
        }
        throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.FRONT_FACING_NOT_FOUND);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        android.hardware.camera2.CameraCharacteristics f3382a;
        android.hardware.camera2.params.StreamConfigurationMap b;
        java.lang.String c;
        boolean e = false;

        b() {
        }
    }

    private static com.facetec.sdk.af.b g(android.content.Context context) throws com.facetec.sdk.ak {
        return a(context, 1);
    }

    private static com.facetec.sdk.af.b f(android.content.Context context) throws com.facetec.sdk.ak {
        return a(context, 0);
    }

    private static android.hardware.camera2.CameraManager j(android.content.Context context) {
        return (android.hardware.camera2.CameraManager) context.getApplicationContext().getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
    }

    private static com.facetec.sdk.af.b a(android.content.Context context, int i) throws com.facetec.sdk.ak {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        android.hardware.camera2.CameraManager j = j(context);
        try {
            java.lang.String[] cameraIdList = j.getCameraIdList();
            android.hardware.camera2.CameraAccessException e = null;
            for (java.lang.String str : cameraIdList) {
                try {
                    android.hardware.camera2.CameraCharacteristics cameraCharacteristics = j.getCameraCharacteristics(str);
                    java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                    if ((num == null || num.intValue() == i || (android.os.Build.MODEL.equals("Lenovo YT3-850F") && cameraIdList.length == 1)) && (streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                        java.lang.Integer num2 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        com.facetec.sdk.af.b bVar = new com.facetec.sdk.af.b();
                        bVar.c = str;
                        bVar.f3382a = cameraCharacteristics;
                        bVar.b = streamConfigurationMap;
                        if (num2.intValue() != 2) {
                            bVar.e = true;
                        }
                        return bVar;
                    }
                } catch (android.hardware.camera2.CameraAccessException e2) {
                    e = e2;
                    e.getMessage();
                }
            }
            if (e == null) {
                return null;
            }
            throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.ACCESS_ERROR, e);
        } catch (android.hardware.camera2.CameraAccessException e3) {
            throw new com.facetec.sdk.ak(e3);
        }
    }

    static boolean e(android.content.Context context) throws com.facetec.sdk.ak {
        synchronized (com.facetec.sdk.af.class) {
            if (R == null) {
                com.facetec.sdk.af.b f = f(context);
                if (f == null) {
                    return false;
                }
                R = java.lang.Boolean.valueOf(f.e);
            }
            return R.booleanValue();
        }
    }

    static boolean d(android.content.Context context) throws com.facetec.sdk.ak {
        synchronized (com.facetec.sdk.af.class) {
            if (Q == null) {
                com.facetec.sdk.af.b g = g(context);
                if (g == null) {
                    return false;
                }
                Q = java.lang.Boolean.valueOf(g.e);
            }
            return Q.booleanValue();
        }
    }

    private void b(android.app.Activity activity, int i, int i2) throws com.facetec.sdk.ak {
        if (this.F) {
            return;
        }
        if (androidx.core.app.ActivityCompat.checkSelfPermission(activity, "android.permission.CAMERA") != 0) {
            throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.PERMISSION_DENIED);
        }
        try {
            if (!com.facetec.sdk.bd.h) {
                b(activity);
            } else {
                e(activity);
            }
            c(i, i2);
            android.hardware.camera2.CameraManager j = j(activity);
            if (j == null) {
                throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.PERMISSION_DENIED);
            }
            try {
                if (!this.u.tryAcquire(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.DELAY, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.OPEN_TIMEOUT);
                }
                com.facetec.sdk.bc.a("CTOT");
                com.facetec.sdk.bc.a("CTFFT");
                try {
                    com.facetec.sdk.t.c(activity, com.facetec.sdk.c.OPEN_FRONT_CAMERA2, (java.lang.String) null, (java.lang.Throwable) null);
                    j.openCamera(this.x, this.O, (android.os.Handler) null);
                } catch (java.lang.Exception e) {
                    this.u.release();
                    throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.UNKNOWN, e.getMessage());
                }
            } catch (java.lang.InterruptedException e2) {
                com.facetec.sdk.n.b(e2);
                throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.LOCK_OPEN_TIMEOUT, e2);
            }
        } catch (android.hardware.camera2.CameraAccessException e3) {
            throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.UNKNOWN, e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) throws com.facetec.sdk.ak {
        boolean z2;
        try {
            z2 = this.u.tryAcquire(z ? 1L : 10L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            com.facetec.sdk.n.b(e);
            z2 = false;
        }
        try {
            try {
                android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.A;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.A = null;
                }
                android.hardware.camera2.CameraDevice cameraDevice = this.C;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.C = null;
                }
            } finally {
                if (z2) {
                    this.u.release();
                }
            }
        } catch (java.lang.Exception e2) {
            throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.CLOSE_ERROR, e2);
        }
    }

    @Override // com.facetec.sdk.ai
    final void a() {
        if (this.M) {
            if (this.K) {
                n();
                return;
            }
            android.hardware.camera2.CameraDevice cameraDevice = this.C;
            if (cameraDevice != null) {
                c(cameraDevice);
            } else {
                d(com.facetec.sdk.as.au);
            }
        }
    }

    private void n() {
        if (this.M) {
            int i = this.s;
            if (i > 0) {
                d(com.facetec.sdk.as.ao);
                return;
            }
            this.M = false;
            this.s = i + 1;
            if (this.y.isAvailable()) {
                try {
                    com.facetec.sdk.bf bfVar = this.p.get();
                    if (bfVar != null) {
                        b(bfVar, this.y.getWidth(), this.y.getHeight());
                        return;
                    }
                    return;
                } catch (com.facetec.sdk.ak unused) {
                    d(com.facetec.sdk.as.ar);
                    return;
                }
            }
            d(com.facetec.sdk.as.aw);
        }
    }

    private void d(java.lang.String str) {
        com.facetec.sdk.bf bfVar = this.p.get();
        if (bfVar != null) {
            bfVar.b("Camera2 device error: UNRECOVERABLE");
            com.facetec.sdk.c cVar = com.facetec.sdk.c.CAMERA2_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera2 device error: UNRECOVERABLE | ");
            sb.append(str);
            sb.append(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR);
            sb.append(g());
            com.facetec.sdk.t.c(bfVar, cVar, sb.toString(), (java.lang.Throwable) null);
        }
    }

    private void c(android.hardware.camera2.CameraDevice cameraDevice) {
        this.u.release();
        cameraDevice.close();
        this.C = null;
    }

    private boolean c(android.hardware.camera2.CameraCharacteristics.Key<int[]> key, int i) {
        int[] iArr = (int[]) this.z.get(key);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        com.facetec.sdk.bf bfVar = this.p.get();
        if (this.y == null || bfVar == null) {
            return;
        }
        int rotation = bfVar.getWindowManager().getDefaultDisplay().getRotation();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = i;
        float f2 = i2;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, this.v.c, this.v.b);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.FILL);
            float max = java.lang.Math.max(f2 / this.v.c, f / this.v.b);
            matrix.postScale(max, max, centerX, centerY);
            matrix.postRotate((rotation - 2) * 90, centerX, centerY);
        } else if (2 == rotation) {
            matrix.postRotate(180.0f, centerX, centerY);
        }
        this.y.setTransform(matrix);
    }

    static com.facetec.sdk.ao h(android.content.Context context) throws com.facetec.sdk.ak {
        return e(context, f(context));
    }

    static com.facetec.sdk.ao i(android.content.Context context) throws com.facetec.sdk.ak {
        return e(context, g(context));
    }

    private static com.facetec.sdk.ao e(android.content.Context context, com.facetec.sdk.af.b bVar) throws com.facetec.sdk.ak {
        float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bVar == null) {
            throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.FRONT_FACING_NOT_FOUND);
        }
        android.util.Size[] outputSizes = bVar.b.getOutputSizes(android.graphics.SurfaceTexture.class);
        if (outputSizes.length == 0) {
            throw new com.facetec.sdk.ak(com.facetec.sdk.ak.e.NO_OUTPUT_SIZES);
        }
        java.util.Arrays.sort(outputSizes, new java.util.Comparator() { // from class: com.facetec.sdk.af$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int b2;
                b2 = com.facetec.sdk.af.b((android.util.Size) obj, (android.util.Size) obj2);
                return b2;
            }
        });
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(outputSizes[0].getWidth());
        sb.append("x");
        sb.append(outputSizes[0].getHeight());
        com.facetec.sdk.ai.c = sb.toString();
        com.facetec.sdk.k.e(outputSizes);
        com.facetec.sdk.ay.a(context).getDefaultDisplay().getRealSize(new android.graphics.Point());
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (android.util.Size size : outputSizes) {
                float width = size.getWidth();
                float height = size.getHeight();
                if (width <= 1920.0f && height <= 1080.0f) {
                    float f2 = width / height;
                    if (f2 >= f && f2 <= 1.9f && width >= 640.0f && width <= r3.y && height <= r3.x) {
                        arrayList.add(size);
                    }
                }
            }
            if (arrayList.size() > 0) {
                break;
            }
        }
        if (arrayList.size() > 0) {
            return new com.facetec.sdk.ao(((android.util.Size) arrayList.get(0)).getWidth(), ((android.util.Size) arrayList.get(0)).getHeight());
        }
        return new com.facetec.sdk.ao(outputSizes[0].getWidth(), outputSizes[0].getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(android.util.Size size, android.util.Size size2) {
        return (size2.getWidth() * size2.getHeight()) - (size.getWidth() * size.getHeight());
    }

    private org.json.JSONObject d(android.hardware.camera2.CaptureRequest.Builder builder) {
        java.lang.Integer num = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.EDGE_MODE);
        java.lang.Integer num2 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE);
        java.lang.Integer num3 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.TONEMAP_MODE);
        java.lang.Integer num4 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.SHADING_MODE);
        java.lang.Integer num5 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE);
        java.lang.Integer num6 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE);
        java.lang.Integer num7 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE);
        java.lang.Integer num8 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE);
        java.lang.Integer num9 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE);
        java.lang.Integer num10 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE);
        java.lang.Integer num11 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_MODE);
        java.lang.Integer num12 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE);
        java.lang.Integer num13 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_EFFECT_MODE);
        java.lang.Integer num14 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
        java.lang.Integer num15 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.HOT_PIXEL_MODE);
        java.lang.Integer num16 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE);
        android.util.Range range = (android.util.Range) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.z;
        int i = -1;
        int i2 = -1;
        android.util.Range[] rangeArr = cameraCharacteristics != null ? (android.util.Range[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES) : null;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            i = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.SENSOR_PIXEL_MODE);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            i2 = (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.CONTROL_EXTENDED_SCENE_MODE);
        }
        int i3 = android.os.Build.VERSION.SDK_INT >= 28 ? (java.lang.Integer) builder.get(android.hardware.camera2.CaptureRequest.DISTORTION_CORRECTION_MODE) : -1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("edgeMode", java.lang.Integer.valueOf(a(num)));
            jSONObject.put("noiseReductionMode", a(num2));
            jSONObject.put("toneMapMode", a(num3));
            jSONObject.put("shaderMode", a(num4));
            jSONObject.put("colorCorrectionAberrationMode", a(num5));
            jSONObject.put("colorCorrectionMode", a(num6));
            jSONObject.put("afMode", a(num7));
            jSONObject.put("aeMode", a(num8));
            jSONObject.put("aeAntiBandingMode", a(num9));
            jSONObject.put("awbMode", a(num10));
            jSONObject.put("controlMode", a(num11));
            jSONObject.put("controlSceneMode", a(num12));
            jSONObject.put("controlEffectMode", a(num13));
            jSONObject.put("videoStabilizationMode", a(num14));
            jSONObject.put("hotPixelMode", a(num15));
            jSONObject.put("lensOpticalStabilizationMode", a(num16));
            jSONObject.put("sensorPixelMode", a(i));
            jSONObject.put("controlExtendedSceneMode", a(i2));
            jSONObject.put("distortionCorrectionMode", a(i3));
            if (rangeArr != null) {
                jSONObject.put("availableAETargetFPSRange", new org.json.JSONObject(java.util.Arrays.toString(rangeArr)));
            }
            if (range != null) {
                jSONObject.put("aeTargetFPSRange", new org.json.JSONObject(java.lang.String.valueOf(range)));
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    private static int a(java.lang.Integer num) {
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.facetec.sdk.ai
    final void d() {
        java.lang.Object obj = this.H;
        try {
            java.lang.Object d = com.facetec.sdk.al.d(-1183233842);
            if (d == null) {
                char capsMode = (char) android.text.TextUtils.getCapsMode("", 0, 0);
                int mode = android.view.View.MeasureSpec.getMode(0);
                int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                byte b2 = (byte) ($$b - 4);
                byte b3 = b2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                aa(b2, b3, (byte) (b3 + 2), objArr);
                d = com.facetec.sdk.al.c(capsMode, 24 - mode, (jumpTapTimeout >> 16) + 24, 513159734, false, (java.lang.String) objArr[0], new java.lang.Class[0]);
            }
            ((java.lang.reflect.Method) d).invoke(obj, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.facetec.sdk.ai
    public final void c(boolean z) {
        android.os.HandlerThread handlerThread = this.D;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.D.join();
                this.D = null;
                this.G.removeCallbacksAndMessages(null);
                this.G = null;
            } catch (java.lang.InterruptedException e) {
                com.facetec.sdk.n.b(e);
            }
        }
        try {
            b(z);
        } catch (java.lang.Exception unused) {
        }
        java.lang.Object obj = this.H;
        if (obj != null) {
            try {
                java.lang.Object d = com.facetec.sdk.al.d(-1183234803);
                if (d == null) {
                    char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                    byte b2 = (byte) ($$b - 4);
                    byte b3 = b2;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    aa(b2, b3, (byte) (b3 + 1), objArr);
                    d = com.facetec.sdk.al.c(keyRepeatTimeout, 23 - lastIndexOf, (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 24, 513163253, false, (java.lang.String) objArr[0], new java.lang.Class[0]);
                }
                ((java.lang.reflect.Method) d).invoke(obj, null);
                this.H = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.F = true;
    }

    @Override // com.facetec.sdk.ai
    final void e() {
        android.hardware.camera2.CaptureRequest.Builder builder;
        try {
            builder = this.C.createCaptureRequest(2);
        } catch (java.lang.Exception e) {
            com.facetec.sdk.by.d(this.p.get(), com.facetec.sdk.as.as, e);
            builder = null;
        }
        boolean z = false;
        if (builder != null) {
            try {
                java.lang.Object obj = this.H;
                try {
                    java.lang.Object d = com.facetec.sdk.al.d(-1183235764);
                    if (d == null) {
                        char indexOf = (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                        byte b2 = (byte) ($$b - 4);
                        byte b3 = b2;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        aa(b2, b3, b3, objArr);
                        d = com.facetec.sdk.al.c(indexOf, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 23, 24 - (edgeSlop >> 16), 513162164, false, (java.lang.String) objArr[0], new java.lang.Class[0]);
                    }
                    builder.addTarget((android.view.Surface) ((java.lang.reflect.Method) d).invoke(obj, null));
                    this.A.capture(builder.build(), null, this.G);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                z = true;
            } catch (java.lang.Exception e2) {
                com.facetec.sdk.by.d(this.p.get(), com.facetec.sdk.as.av, e2);
            }
        }
        com.facetec.sdk.by.a(com.facetec.sdk.by.a.d, z);
    }

    static /* synthetic */ void b(com.facetec.sdk.af afVar, com.facetec.sdk.c cVar, java.lang.String str) {
        com.facetec.sdk.bf bfVar = afVar.p.get();
        if (bfVar != null) {
            com.facetec.sdk.t.c(bfVar, cVar, str, (java.lang.Throwable) null);
        }
    }

    static /* synthetic */ void c(com.facetec.sdk.af afVar, android.hardware.camera2.CameraDevice cameraDevice) {
        java.util.List<android.view.Surface> asList;
        com.facetec.sdk.bc.a("CTCPT");
        afVar.C = cameraDevice;
        afVar.K = false;
        try {
            try {
                try {
                    if (afVar.H != null) {
                        android.graphics.SurfaceTexture surfaceTexture = afVar.y.getSurfaceTexture();
                        if (!T && surfaceTexture == null) {
                            throw new java.lang.AssertionError();
                        }
                        surfaceTexture.setDefaultBufferSize(afVar.v.b, afVar.v.c);
                        android.view.Surface surface = new android.view.Surface(surfaceTexture);
                        java.lang.Object obj = afVar.H;
                        try {
                            java.lang.Object d = com.facetec.sdk.al.d(-1183235764);
                            if (d == null) {
                                char c = (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int threadPriority = android.os.Process.getThreadPriority(0);
                                int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                byte b2 = (byte) ($$b - 4);
                                byte b3 = b2;
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                aa(b2, b3, b3, objArr);
                                d = com.facetec.sdk.al.c(c, ((threadPriority + 20) >> 6) + 24, 24 - packedPositionGroup, 513162164, false, (java.lang.String) objArr[0], new java.lang.Class[0]);
                            }
                            android.view.Surface surface2 = (android.view.Surface) ((java.lang.reflect.Method) d).invoke(obj, null);
                            android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = afVar.C.createCaptureRequest(1);
                            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_MODE, 1);
                            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK, java.lang.Boolean.FALSE);
                            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK, java.lang.Boolean.FALSE);
                            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                            if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.e)) {
                                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE, 0);
                            } else if (afVar.c(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES, 11)) {
                                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE, 11);
                            }
                            if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.j)) {
                                if (createCaptureRequest.get(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT) != null) {
                                    createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 4);
                                }
                                if (createCaptureRequest.get(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE) != null) {
                                    createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE, 0);
                                }
                            }
                            if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.b)) {
                                if (createCaptureRequest.get(android.hardware.camera2.CaptureRequest.EDGE_MODE) != null) {
                                    createCaptureRequest.set(android.hardware.camera2.CaptureRequest.EDGE_MODE, 0);
                                }
                                if (createCaptureRequest.get(android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE) != null) {
                                    createCaptureRequest.set(android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE, 0);
                                }
                            }
                            afVar.I = createCaptureRequest;
                            createCaptureRequest.addTarget(surface);
                            afVar.I.addTarget(surface2);
                            android.view.Surface surface3 = S;
                            if (surface3 != null) {
                                afVar.I.addTarget(surface3);
                            }
                            if (!afVar.L && com.facetec.sdk.bj.c()) {
                                afVar.L = true;
                                com.facetec.sdk.k.b = afVar.d(afVar.I);
                            }
                            com.facetec.sdk.bc.a("CTCCST");
                            android.view.Surface surface4 = S;
                            if (surface4 == null) {
                                asList = java.util.Arrays.asList(surface, surface2);
                            } else {
                                asList = java.util.Arrays.asList(surface, surface2, surface4);
                            }
                            afVar.C.createCaptureSession(asList, afVar.P, null);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                } catch (android.hardware.camera2.CameraAccessException e) {
                    com.facetec.sdk.n.b(e);
                }
            } catch (java.lang.IllegalStateException unused) {
                if (afVar.p.get() != null) {
                    afVar.p.get().b(com.facetec.sdk.c.CAMERA_ALREADY_CLOSED.toString());
                    com.facetec.sdk.t.c(afVar.p.get(), com.facetec.sdk.c.CAMERA_ALREADY_CLOSED, (java.lang.String) null, (java.lang.Throwable) null);
                }
            }
            afVar.u.release();
            com.facetec.sdk.bc.c("CTCPT");
        } catch (java.lang.Throwable th2) {
            afVar.u.release();
            throw th2;
        }
    }

    static /* synthetic */ void e(com.facetec.sdk.af afVar, android.hardware.camera2.CameraDevice cameraDevice) {
        afVar.c(cameraDevice);
        if (k) {
            return;
        }
        afVar.M = true;
    }

    static /* synthetic */ void a(com.facetec.sdk.af afVar, android.hardware.camera2.CameraDevice cameraDevice, int i) {
        afVar.c(cameraDevice);
        com.facetec.sdk.bf bfVar = afVar.p.get();
        if (bfVar != null) {
            if (k) {
                bfVar.b("Camera2 device error: ".concat(java.lang.String.valueOf(i)));
            } else {
                afVar.M = true;
            }
            com.facetec.sdk.t.c(bfVar, com.facetec.sdk.c.CAMERA2_ERROR, "Camera2 device error: ".concat(java.lang.String.valueOf(i)), (java.lang.Throwable) null);
        }
    }

    static /* synthetic */ void g(com.facetec.sdk.af afVar) {
        afVar.K = true;
        if (k && afVar.M) {
            afVar.n();
        }
    }

    static /* synthetic */ void b(com.facetec.sdk.af afVar, int i, int i2) {
        com.facetec.sdk.bf bfVar = afVar.p.get();
        if (bfVar != null) {
            try {
                afVar.b(bfVar, i, i2);
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.c cVar = com.facetec.sdk.c.CAMERA2_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera2 SurfaceTexture error: ");
                sb.append(th.getMessage());
                com.facetec.sdk.t.c(bfVar, cVar, sb.toString(), th);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Camera 2 SurfaceTexture error: ");
                sb2.append(th.getMessage());
                bfVar.b(sb2.toString());
            }
        }
    }

    private static void Z(short s, short s2, byte b2, java.lang.Object[] objArr) {
        int i = 2169 - s;
        byte[] bArr = X;
        int i2 = b2 + 44;
        byte[] bArr2 = new byte[s2 + 1];
        int i3 = -1;
        if (bArr == null) {
            i3 = -1;
            i2 = (-i) + i2;
            i = i;
        }
        while (true) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == s2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3 = i4;
            i2 = (-bArr[i5]) + i2;
            i = i5;
        }
    }

    static void m() {
        byte[] bArr = new byte[2195];
        java.lang.System.arraycopy("&\u0081¯<ü\u0005ø\bÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fø\bô\fÿô\rÿü\u0001\u0004ø\bÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ó\rû\u0000\u0005ÿüý\bÿüü\tÿüû\nÿüú\u000bûÿ\u0006ÿüù\fûþ\u0007ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006ûÿ\u0006ûý\bÿûÿ\u0007ø\bÿûþ\bÿûý\tø\bûü\tÿûü\nÿû\u0000\u0006ûû\nûú\u000bÿûû\u000bûù\fÿû\u0000\u0006ÿûú\fûø\rú\u0002\u0004ú\u0001\u0005ú\u0000\u0006ÿûù\rúÿ\u0007ú\u0000\u0006ÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0001\u0006ÿú\u0000\u0007ÿ÷\nÿö\u000búü\nÿúÿ\bûú\u000bÿõ\fÿûú\fúû\u000búú\fÿûù\rúÿ\u0007ú\u0000\u0006ÿúþ\tÿúý\nÿúü\u000bÿúü\u000bÿúû\fúù\rù\u0003\u0004ú\u0000\u0006ÿúú\rúÿ\u0007ú\u0000\u0006ÿù\u0004\u0004ÿù\u0003\u0005ÿù\u0002\u0006ÿú\u0000\u0007ø\bÿû\u0006ù\u0002\u0005ûú\u000bÿù\u0001\u0007ÿù\u0000\bÿùÿ\tÿùþ\nù\u0000\u0007ÿùý\u000bùÿ\bÿùý\u000bÿùü\fô\fÿùû\rûü\tÿùû\rÿø\u0005\u0004ùþ\tÿø\u0004\u0005ùý\nÿø\u0004\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010\të\u00153Â\u000bó\u00079¼\rÿ8Üíÿ\u0001ó\r÷\u000bþ\u0002ñü\u0005ø\bÿû\u0006ÿú\u0007ÿù\bÿø\tø\bô\fÿ÷\nø\bÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ø\bÿö\u000bø\bÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿüý\bûû\nûú\u000bÿüü\tûù\fÿüû\núÿ\u0007ùú\rÿüú\u000bÿüù\fø\u0004\u0004ø\u0003\u0005ú\u0002\u0004ú\u0001\u0005ú\u0000\u0006ÿüø\rúÿ\u0007ú\u0000\u0006ÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006ÿû\u0000\u0006ÿûÿ\u0007ø\u0002\u0006ø\u0003\u0005ø\u0001\u0007ÿûþ\búÿ\u0007ú\u0000\u0006ÿûý\tÿûü\nÿûû\u000bÿûû\u000bÿûú\fø\u0000\bÿûù\røÿ\tÿûù\rÿú\u0003\u0004ô\fÿú\u0002\u0005ûü\tÿú\u0002ü\u0005ûÿ\u0006ÿû\u0006ÿú\u0007ó\rû\u0000\u0005ÿù\bÿø\tÿ÷\nøþ\nÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006øý\u000bÿüþ\u0007øü\føû\rÿüý\b÷\u0005\u0004÷\u0003\u0006ÿüü\tÿüû\nÿüú\u000bÿüù\f÷\u0002\u0007ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006÷\u0001\b÷\u0000\tÿûÿ\u0007ÿû\u0002\u0004ÿûþ\b÷ÿ\n÷þ\u000bÿûý\tÿûü\n÷ý\fÿûû\u000bÿûú\fÿûù\rô\fÿú\u0003\u0004÷ü\rÿú\u0002\u0005ô\fø\u0003\u0005ÿú\u0001\u0006ö\u0006\u0004ö\u0005\u0005÷þ\u000bö\u0004\u0006ÿú\u0000\u0007ÿúÿ\bûú\u000bö\u0003\u0007ÿúþ\tÿúý\nÿúü\u000bö\u0001\tÿúü\u000bö\u0000\nÿüý\bö\u0005\u0005ÿúû\fúÿ\u0007ÿúú\rÿù\u0004\u0004ÿù\u0003\u0005öþ\fÿù\u0002\u0006ÿù\u0003\u0005ÿù\u0001\u0007ô\fÿù\u0000\bûü\tÿùÿ\töý\rÿùþ\n÷\u0005\u0004ÿùý\u000bÿùü\fÿùû\rÿø\u0005\u0004ÿø\u0004\u0005ø\bûÿ\u0006õ\u0007\u0004ÿø\u0003\u0006ÿø\u0002\u0007õ\u0006\u0005ÿø\u0001\bõ\u0005\u0006ÿø\u0000\tÿøÿ\nõ\u0004\u0007÷\u0001\bÿø\u0000\tÿøþ\u000bõ\u0003\bõ\u0002\tõ\u0001\nÿüø\rõ\u0001\nÿûÿ\u0007õ\u0000\u000bõÿ\fúü\nû\u0000\u0005õþ\rô\b\u0004ô\u0007\u0005ô\u0006\u0006ÿøý\fô\u0005\u0007ÿøü\rÿ÷\u0006\u0004ÿ÷\u0005\u0005ô\u0004\bô\u0003\tó\rô\u0002\nÿûÿ\u0007ô\u0001\u000bÿüø\rô\u0000\fú\u0002\u0004ôÿ\rÿ÷\u0004\u0006ÿ÷\u0003\u0007ÿ÷\u0002\bó\b\u0005ÿ÷\u0001\tÿ÷\u0000\nÿ÷ÿ\u000bô\u0001\u000bÿüø\ró\u0007\u0006ÿûÿ\u0007õ\u0004\u0007ó\u0006\u0007ó\u0005\bÿ÷þ\fó\u0003\nÿ÷ý\rÿö\u0007\u0004ÿö\u0006\u0005ó\u0001\fó\u0000\ró\u0003\nÿö\u0005\u0006ÿ÷\u0002\bÿ÷\u0005\u0005û\u0001\u0000\u0004ÿøý\fûÿ\u0006ÿö\u0004\u0007ÿö\u0003\bÿö\u0002\tû\u0001ÿ\u0005ÿö\u0002\tÿö\u0001\nûÿ\u0006ÿö\u0000\u000bû\u0001þ\u0006ÿøÿ\nûÿ\u0006ÿøþ\u000bÿø\u0001\bû\u0000\u0005ÿö\u0001\nûÿ\u0006ÿüø\rûÿ\u0006ÿûÿ\u0007ÿöÿ\fÿöþ\rÿüù\fûÿ\u0006ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006ûÿ\u0006ÿûÿ\u0007ÿû\u0002\u0004ÿûþ\bÿõ\b\u0004û\u0001ý\u0007ÿõ\u0007\u0005ÿõ\u0006\u0006ø\bÿõ\u0005\u0007ÿõ\u0004\bÿõ\u0003\tÿõ\u0002\nø\bÿõ\u0001\u000bø\bÿõ\u0000\fÿõÿ\rÿõ\u0002\nÿô\t\u0004ó\rû\u0000\u0005ÿô\b\u0005ûÿ\u0006ÿô\u0007\u0006ÿô\u0006\u0007ûú\u000bûÿ\u0006ÿô\u0005\bÿüÿ\u0006úÿ\u0007û\u0001ü\bûú\u000bÿô\u0004\túÿ\u0007úÿ\u0007û\u0001û\tÿú\u0001\u0006úÿ\u0007úÿ\u0007û\u0001û\tÿùÿ\tÿô\u0003\nû\u0001ú\nø\u0003\u0005ø\u0001\u0007ÿô\u0002\u000búÿ\u0007ú\u0000\u0006ÿô\u0001\fÿô\u0000\rÿü\u0001\u0000\u0004ÿü\u0001\u0000\u0004ÿô\u0003\nû\u0001ù\u000bø\u0003\u0005ú\u0002\u0004úú\fÿô\u0002\u000búÿ\u0007ú\u0000\u0006ÿü\u0001ÿ\u0005ÿü\u0001þ\u0006ÿü\u0001ý\u0007ûü\tÿú\u0003\u0004ÿü\u0001ü\bû\u0001ø\fù\u0003\u0004ú\u0000\u0006ÿü\u0001û\túÿ\u0007ú\u0000\u0006ÿü\u0001ú\nÿü\u0001ù\u000bÿü\u0001ø\fÿü\u0001ø\fÿü\u0001ü\bû\u0001÷\rúú\fÿü\u0001û\tû\u0001ü\bÿü\u0001÷\rÿü\u0000\u0001\u0004ÿü\u0000\u0000\u0005û\u0000\u0001\u0004ÿúü\u000bÿô\u0003\nû\u0000\u0000\u0005ø\u0003\u0005ú\u0002\u0004úú\fÿô\u0002\u000bû\u0001ü\bÿü\u0000ÿ\u0006ÿü\u0000þ\u0007ÿü\u0000ý\bÿü\u0000ý\bÿô\u0003\nû\u0000ÿ\u0006úú\fÿô\u0002\u000búÿ\u0007ú\u0000\u0006ÿü\u0000ü\tÿü\u0000û\nÿü\u0000ú\u000bÿüÿ\u0006õ\u0001\nû\u0000\u0005û\u0000þ\u0007øÿ\tû\u0000ý\bÿö\u0002\tÿô\u0003\nû\u0000ü\tû\u0000û\núú\fÿô\u0002\u000búÿ\u0007ú\u0000\u0006ÿü\u0000ù\fÿü\u0000ø\rÿüÿ\u0002\u0004ÿüÿ\u0006öþ\fû\u0000ú\u000bû\u0000ù\fÿüÿ\u0001\u0005ÿù\u0003\u0005ÿù\u0001\u0007ÿüÿ\u0000\u0006û\u0000ø\rÿüÿÿ\u0007ûÿ\u0002\u0004ÿüÿÿ\u0007ÿüÿþ\bûÿ\u0001\u0005ÿüÿý\tø\u0000\bÿüÿý\tÿüÿü\nø\u0000\bÿüÿû\u000bûÿ\u0000\u0006ÿüÿûó\nò\u0003\u0006\u00056¼\r÷\nÿóÿ\u0010ñ\tùüFíÕ\u0000ý\f\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Æ\u0007ï\u000eí\u0016ï\r7Ë\u0002ô\bó\u0011/\u0004¾\u000fï\u0011ôúEÛß\u0002\r\u0004ô*Ô\u0001\bý\u0002ò\u0003\u0011í\u000bú\u0001!ìñ\u0002ñ%Ú\u0001\u0004û\u0001!êï\u0015ò\të\u00153¹\u0001\u000bý>æçî\u000b\u001bìñ\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007%Í\fý\bÿóó\nò\u0003\u0006\u00056¹\u0001\u000bý>Ûêï\u0015\u0002ñ\u001dî\u0005ð\fñ\u0000\u000b÷\n\u0002ñ,ãü\u0002ÿô\të\u00153¹\u0001\u000bý>íßïÿ\u0002\u0011þï'ìñ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079àÙ\b\u000býóû\u0001\nï\u0015\të\u00153¹\u0001\u000bý>íÏ\u0000\u0011è\u0006\u0004ýþ\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9\të\u00153¹\u0001\u000bý>ëÔ\u0002ý\u000fï\u0011í\u0005ý\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007\u0002ñ'èò\u0000\u0012ú\u0002\të\u00153Â\u000bó\u00079ÜÝ\u0007ú\u000bü\b Í\u0015þõü\u000bú\u0001".getBytes("ISO-8859-1"), 0, bArr, 0, 2195);
        X = bArr;
        Y = 59;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0f27  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0f5b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0f6a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0f75  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0f8b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(android.content.Context context, android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) throws com.facetec.sdk.ak {
        int[] iArr;
        java.lang.Throwable th;
        java.lang.Object[] objArr;
        int i;
        java.lang.Object[] objArr2;
        int i2;
        int i3;
        java.lang.Object obj;
        int i4;
        int i5;
        int i6;
        java.lang.Throwable th2;
        java.lang.Class<?>[] clsArr;
        java.lang.Throwable th3;
        java.lang.Object obj2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        java.lang.Object obj3;
        int i12;
        int i13;
        java.lang.Object invoke;
        int i14;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i15;
        com.facetec.sdk.ds dsVar = new com.facetec.sdk.ds(this, context, streamConfigurationMap);
        byte[] bArr = X;
        int i16 = 1;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Z((short) 1530, (short) 1223, bArr[38], objArr3);
        char c = 0;
        java.lang.String str = (java.lang.String) objArr3[0];
        short s = (short) 1808;
        short s2 = bArr[44];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Z(s, s2, (byte) s2, objArr4);
        try {
            java.lang.Object[] objArr5 = {(java.lang.String) objArr4[0]};
            char c2 = 1967;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Z(s, bArr[393], bArr[1967], objArr6);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Z((short) 1793, bArr[39], (byte) (-bArr[1963]), objArr7);
            java.lang.String str2 = (java.lang.String) objArr7[0];
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            Z(s, bArr[393], bArr[1967], objArr8);
            java.lang.Object[] objArr9 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr8[0])).invoke(str, objArr5);
            int[] iArr2 = new int[objArr9.length];
            int i17 = 0;
            while (i17 < objArr9.length) {
                java.lang.Object[] objArr10 = {objArr9[i17]};
                short s3 = (short) 1789;
                byte[] bArr2 = X;
                short s4 = bArr2[400];
                byte b2 = bArr2[c2];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Z(s3, s4, b2, objArr11);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[c]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                Z((short) 1773, bArr2[10], (byte) 74, objArr12);
                java.lang.String str3 = (java.lang.String) objArr12[c];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                Z(s, bArr2[393], bArr2[1967], objArr13);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr13[0])).invoke(null, objArr10);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                Z(s3, bArr2[400], bArr2[1967], objArr14);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                Z((short) 1767, bArr2[13], (byte) (Y + 2), objArr15);
                iArr2[i17] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr15[0], null).invoke(invoke2, null)).intValue();
                i17++;
                c = 0;
                c2 = 1967;
            }
            int i18 = 0;
            java.lang.Class<?>[] clsArr2 = null;
            while (true) {
                int i19 = i18 + 1;
                try {
                    i3 = 157;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    iArr = iArr2;
                }
                switch (dsVar.d(iArr2[i18])) {
                    case androidx.compose.runtime.ComposerKt.defaultsKey /* -127 */:
                        iArr = iArr2;
                        i4 = 328;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -126:
                        iArr = iArr2;
                        dsVar.d(32);
                        int i20 = dsVar.d;
                        if (i20 == 19 || i20 != 36) {
                            i4 = 151;
                            i3 = i4;
                        }
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -125:
                        iArr = iArr2;
                        i4 = 323;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -124:
                        iArr = iArr2;
                        dsVar.d(32);
                        int i21 = dsVar.d;
                        if (i21 != 36 && i21 == 74) {
                            i3 = 13;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = 9;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -123:
                        iArr = iArr2;
                        i4 = 318;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -122:
                        iArr = iArr2;
                        dsVar.d(32);
                        if (dsVar.d != 50) {
                            i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
                            i3 = i4;
                        }
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -121:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i4 = 317;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -120:
                        iArr = iArr2;
                        i4 = 73;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -119:
                        iArr = iArr2;
                        i4 = 312;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -118:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i4 = 310;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -117:
                        iArr = iArr2;
                        i4 = 163;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -116:
                        iArr = iArr2;
                        i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -115:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -114:
                        iArr = iArr2;
                        i4 = 225;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -113:
                        iArr = iArr2;
                        i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -112:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i4 = 283;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -111:
                        iArr = iArr2;
                        i4 = 63;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING /* -110 */:
                        iArr = iArr2;
                        i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -109:
                        iArr = iArr2;
                        dsVar.d(24);
                        if (dsVar.d == 0) {
                            i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -108:
                        iArr = iArr2;
                        i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -107:
                        iArr = iArr2;
                        i4 = 263;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -106:
                        iArr = iArr2;
                        dsVar.d(24);
                        if (dsVar.d == 0) {
                            i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -105:
                        iArr = iArr2;
                        int i22 = i16;
                        dsVar.c = i22;
                        dsVar.d(i22);
                        dsVar.d(7);
                        U = dsVar.d;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -104:
                        iArr = iArr2;
                        i5 = V;
                        dsVar.c = i5;
                        i6 = 3;
                        dsVar.d(i6);
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -103:
                        iArr = iArr2;
                        i4 = 45;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -102:
                        iArr = iArr2;
                        i4 = 251;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -101:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i4 = 250;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -100:
                        i18 = 1;
                        i16 = 1;
                    case -99:
                        iArr = iArr2;
                        i4 = 239;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -98:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i4 = 238;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -97:
                        iArr = iArr2;
                        int i23 = i16;
                        dsVar.c = i23;
                        dsVar.d(i23);
                        dsVar.d(7);
                        V = dsVar.d;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -96:
                        iArr = iArr2;
                        i5 = U;
                        dsVar.c = i5;
                        i6 = 3;
                        dsVar.d(i6);
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -95:
                        iArr = iArr2;
                        i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -94:
                        iArr = iArr2;
                        int i24 = i16;
                        try {
                            dsVar.c = i24;
                            dsVar.d(i24);
                            try {
                                dsVar.d(2);
                                try {
                                    java.lang.Object[] objArr16 = {dsVar.f};
                                    try {
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        Z(r9[44], (short) (-X[1969]), r9[1967], objArr17);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        Z(r9[1972], r9[2167], r9[1967], objArr18);
                                        try {
                                            dsVar.h = cls4.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr18[0])).newInstance(objArr16);
                                            i6 = 6;
                                            dsVar.d(i6);
                                            i4 = i19;
                                            i3 = i4;
                                            i = 1;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                            th = th;
                                            byte[] bArr3 = X;
                                            objArr = new java.lang.Object[1];
                                            Z(bArr3[1972], bArr3[2167], bArr3[1967], objArr);
                                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                            }
                                            i = 1;
                                            objArr2 = new java.lang.Object[1];
                                            Z(bArr3[1972], bArr3[2167], bArr3[1967], objArr2);
                                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                            }
                                            if (i18 < 297) {
                                            }
                                            if (i18 < 313) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        java.lang.Throwable th7 = th;
                                        java.lang.Throwable cause = th7.getCause();
                                        if (cause == null) {
                                            throw th7;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                th = th;
                                byte[] bArr32 = X;
                                objArr = new java.lang.Object[1];
                                Z(bArr32[1972], bArr32[2167], bArr32[1967], objArr);
                                if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                }
                                i = 1;
                                objArr2 = new java.lang.Object[1];
                                Z(bArr32[1972], bArr32[2167], bArr32[1967], objArr2);
                                if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                }
                                if (i18 < 297) {
                                }
                                if (i18 < 313) {
                                }
                            }
                        } catch (java.lang.Throwable th10) {
                            th2 = th10;
                            th = th2;
                            byte[] bArr322 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr322[1972], bArr322[2167], bArr322[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr322[1972], bArr322[2167], bArr322[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -93:
                        iArr = iArr2;
                        int i25 = i16;
                        try {
                            dsVar.c = i25;
                            dsVar.d(i25);
                            dsVar.d(2);
                            dsVar.h = com.facetec.sdk.ay.c((java.lang.String) dsVar.f);
                            dsVar.d(6);
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                        } catch (java.lang.Throwable th11) {
                            th2 = th11;
                            th = th2;
                            byte[] bArr3222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr3222[1972], bArr3222[2167], bArr3222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr3222[1972], bArr3222[2167], bArr3222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -92:
                        iArr = iArr2;
                        int i26 = i16;
                        try {
                            dsVar.c = i26;
                            dsVar.d(i26);
                            dsVar.d(2);
                            java.lang.Object obj6 = dsVar.f;
                            try {
                                byte[] bArr4 = X;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                Z(bArr4[1972], bArr4[2167], bArr4[1967], objArr19);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                short s5 = bArr4[19];
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                Z(s5, s5, (byte) Y, objArr20);
                                try {
                                    try {
                                        dsVar.h = cls5.getMethod((java.lang.String) objArr20[0], null).invoke(obj6, null);
                                        clsArr2 = null;
                                        dsVar.d(6);
                                        i4 = i19;
                                        i3 = i4;
                                        i = 1;
                                    } catch (java.lang.Throwable th12) {
                                        th2 = th12;
                                        clsArr2 = null;
                                        th = th2;
                                        byte[] bArr32222 = X;
                                        objArr = new java.lang.Object[1];
                                        Z(bArr32222[1972], bArr32222[2167], bArr32222[1967], objArr);
                                        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                        }
                                        i = 1;
                                        objArr2 = new java.lang.Object[1];
                                        Z(bArr32222[1972], bArr32222[2167], bArr32222[1967], objArr2);
                                        if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                        }
                                        if (i18 < 297) {
                                        }
                                        if (i18 < 313) {
                                        }
                                    }
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                    java.lang.Throwable th14 = th;
                                    java.lang.Throwable cause2 = th14.getCause();
                                    if (cause2 == null) {
                                        throw th14;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th15) {
                                th = th15;
                            }
                        } catch (java.lang.Throwable th16) {
                            clsArr = null;
                            th3 = th16;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr322222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr322222[1972], bArr322222[2167], bArr322222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr322222[1972], bArr322222[2167], bArr322222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -91:
                        iArr = iArr2;
                        int i27 = i16;
                        dsVar.c = i27;
                        dsVar.d(i27);
                        dsVar.d(2);
                        com.facetec.sdk.n.b((java.lang.Throwable) dsVar.f);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.NetworkConstants.PAST_90_DAYS /* -90 */:
                        return;
                    case -89:
                        iArr = iArr2;
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(2);
                        java.lang.Object obj7 = dsVar.f;
                        dsVar.d(2);
                        try {
                            java.lang.Object[] objArr21 = {(com.facetec.sdk.ee) dsVar.f};
                            java.lang.Object d = com.facetec.sdk.al.d(-1708259942);
                            if (d == null) {
                                char threadPriority = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                int defaultSize = android.view.View.getDefaultSize(0, 0);
                                int indexOf = android.text.TextUtils.indexOf("", "", 0);
                                byte b3 = (byte) ($$b - 4);
                                byte b4 = b3;
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                aa(b3, b4, b4, objArr22);
                                d = com.facetec.sdk.al.c(threadPriority, defaultSize + 24, indexOf + 24, 1036091234, false, (java.lang.String) objArr22[0], new java.lang.Class[]{com.facetec.sdk.ee.class});
                            }
                            ((java.lang.reflect.Method) d).invoke(obj7, objArr21);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th17) {
                            java.lang.Throwable cause3 = th17.getCause();
                            if (cause3 == null) {
                                throw th17;
                            }
                            throw cause3;
                        }
                    case -88:
                        iArr = iArr2;
                        int i28 = i16;
                        dsVar.c = i28;
                        dsVar.d(i28);
                        dsVar.d(2);
                        obj2 = ((com.facetec.sdk.af) dsVar.f).w;
                        dsVar.h = obj2;
                        i8 = 6;
                        dsVar.d(i8);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -87:
                        iArr = iArr2;
                        int i29 = i16;
                        dsVar.c = i29;
                        dsVar.d(i29);
                        dsVar.d(2);
                        obj2 = ((com.facetec.sdk.af) dsVar.f).H;
                        dsVar.h = obj2;
                        i8 = 6;
                        dsVar.d(i8);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -86:
                        iArr = iArr2;
                        i7 = 206;
                        i19 = i7;
                        i18 = i19;
                        clsArr2 = null;
                        i = 1;
                        i16 = i;
                        iArr2 = iArr;
                    case -85:
                        iArr = iArr2;
                        i7 = 200;
                        i19 = i7;
                        i18 = i19;
                        clsArr2 = null;
                        i = 1;
                        i16 = i;
                        iArr2 = iArr;
                    case -84:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i19 = 199;
                        }
                        i7 = i19;
                        i19 = i7;
                        i18 = i19;
                        clsArr2 = null;
                        i = 1;
                        i16 = i;
                        iArr2 = iArr;
                    case -83:
                        iArr = iArr2;
                        int i30 = i16;
                        dsVar.c = i30;
                        dsVar.d(i30);
                        dsVar.d(2);
                        dsVar.c = ((com.facetec.sdk.af) dsVar.f).E ? 1 : 0;
                        i8 = 3;
                        dsVar.d(i8);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -82:
                        iArr = iArr2;
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(2);
                        com.facetec.sdk.af afVar = (com.facetec.sdk.af) dsVar.f;
                        dsVar.d(2);
                        afVar.H = dsVar.f;
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -81:
                        iArr = iArr2;
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(2);
                        android.content.Context context2 = (android.content.Context) dsVar.f;
                        dsVar.d(2);
                        try {
                            java.lang.Object[] objArr23 = {context2, (android.util.Size) dsVar.f};
                            java.lang.Object d2 = com.facetec.sdk.al.d(555092276);
                            if (d2 == null) {
                                d2 = com.facetec.sdk.al.c((char) android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, android.view.Gravity.getAbsoluteGravity(0, 0) + 24, -2030472244, false, null, new java.lang.Class[]{android.content.Context.class, android.util.Size.class});
                            }
                            obj2 = ((java.lang.reflect.Constructor) d2).newInstance(objArr23);
                            dsVar.h = obj2;
                            i8 = 6;
                            dsVar.d(i8);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th18) {
                            java.lang.Throwable cause4 = th18.getCause();
                            if (cause4 == null) {
                                throw th18;
                            }
                            throw cause4;
                        }
                    case -80:
                        iArr = iArr2;
                        int i31 = i16;
                        dsVar.c = i31;
                        dsVar.d(i31);
                        dsVar.d(2);
                        com.facetec.sdk.k.f = (java.lang.String) dsVar.f;
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -79:
                        iArr = iArr2;
                        int i32 = i16;
                        dsVar.c = i32;
                        dsVar.d(i32);
                        dsVar.d(2);
                        com.facetec.sdk.ai.e = (com.facetec.sdk.ao) dsVar.f;
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -78:
                        iArr = iArr2;
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(7);
                        int i33 = dsVar.d;
                        dsVar.d(7);
                        obj2 = new com.facetec.sdk.ao(i33, dsVar.d);
                        dsVar.h = obj2;
                        i8 = 6;
                        dsVar.d(i8);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -77:
                        iArr = iArr2;
                        int i34 = i16;
                        dsVar.c = i34;
                        dsVar.d(i34);
                        dsVar.d(2);
                        obj2 = com.facetec.sdk.br.e((android.util.Size[]) dsVar.f);
                        dsVar.h = obj2;
                        i8 = 6;
                        dsVar.d(i8);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -76:
                        iArr = iArr2;
                        i19 = 175;
                        i18 = i19;
                        clsArr2 = null;
                        i = 1;
                        i16 = i;
                        iArr2 = iArr;
                    case -75:
                        iArr = iArr2;
                        i19 = 165;
                        i18 = i19;
                        clsArr2 = null;
                        i = 1;
                        i16 = i;
                        iArr2 = iArr;
                    case -74:
                        iArr = iArr2;
                        i19 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE;
                        i18 = i19;
                        clsArr2 = null;
                        i = 1;
                        i16 = i;
                        iArr2 = iArr;
                    case -73:
                        iArr = iArr2;
                        try {
                            dsVar.d(10);
                            if (dsVar.d == 0) {
                                i19 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
                            }
                            i18 = i19;
                            clsArr2 = null;
                            i = 1;
                        } catch (java.lang.Throwable th19) {
                            th = th19;
                            th3 = th;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr3222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr3222222[1972], bArr3222222[2167], bArr3222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                break;
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr3222222[1972], bArr3222222[2167], bArr3222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                break;
                            }
                            if (i18 < 297) {
                                break;
                            }
                            if (i18 < 313) {
                            }
                        }
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -72:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i19 = 156;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -71:
                        iArr = iArr2;
                        i9 = 329;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -70:
                        iArr = iArr2;
                        i9 = com.visa.cbp.getCertUsage.getAucAID;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -69:
                        iArr = iArr2;
                        dsVar.d(97);
                        if (dsVar.d == 0) {
                            i19 = 150;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -68:
                        iArr = iArr2;
                        dsVar.b = 3.0f;
                        dsVar.d(95);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -67:
                        iArr = iArr2;
                        i9 = 319;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -66:
                        iArr = iArr2;
                        i9 = 321;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -65:
                        iArr = iArr2;
                        dsVar.d(90);
                        if (dsVar.d == 0) {
                            i19 = 138;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -64:
                        i18 = 157;
                        i16 = 1;
                    case -63:
                        iArr = iArr2;
                        i9 = 135;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -62:
                        iArr = iArr2;
                        dsVar.d(67);
                        if (dsVar.d == 0) {
                            i19 = 134;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -61:
                        iArr = iArr2;
                        i9 = 159;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -60:
                        iArr = iArr2;
                        i9 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -59:
                        iArr = iArr2;
                        dsVar.d(51);
                        if (dsVar.d == 0) {
                            i19 = 121;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -58:
                        iArr = iArr2;
                        i9 = 118;
                        i18 = i9;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -57:
                        iArr = iArr2;
                        int i35 = i16;
                        dsVar.c = i35;
                        dsVar.d(i35);
                        dsVar.d(2);
                        i10 = ((com.facetec.sdk.ao) dsVar.f).c;
                        dsVar.c = i10;
                        i11 = 3;
                        dsVar.d(i11);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -56:
                        iArr = iArr2;
                        int i36 = i16;
                        dsVar.c = i36;
                        dsVar.d(i36);
                        dsVar.d(2);
                        i10 = ((com.facetec.sdk.ao) dsVar.f).b;
                        dsVar.c = i10;
                        i11 = 3;
                        dsVar.d(i11);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -55:
                        try {
                            iArr = iArr2;
                            int i37 = i16;
                            dsVar.c = i37;
                            dsVar.d(i37);
                            dsVar.d(2);
                            obj = ((com.facetec.sdk.af) dsVar.f).v;
                            dsVar.h = obj;
                            i11 = 6;
                            dsVar.d(i11);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                        } catch (java.lang.Throwable th20) {
                            th = th20;
                            th3 = th;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr32222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr32222222[1972], bArr32222222[2167], bArr32222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr32222222[1972], bArr32222222[2167], bArr32222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -54:
                        iArr = iArr2;
                        try {
                            dsVar.c = 2;
                            dsVar.d(1);
                            dsVar.d(7);
                            int i38 = dsVar.d;
                            dsVar.d(7);
                            try {
                                java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(dsVar.d)};
                                try {
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    Z((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, r4[400], (byte) (-X[1909]), objArr25);
                                    obj = java.lang.Class.forName((java.lang.String) objArr25[0]).getDeclaredConstructor(java.lang.Integer.TYPE, java.lang.Integer.TYPE).newInstance(objArr24);
                                    dsVar.h = obj;
                                    i11 = 6;
                                    dsVar.d(i11);
                                    clsArr2 = null;
                                    i4 = i19;
                                    i3 = i4;
                                    i = 1;
                                } catch (java.lang.Throwable th21) {
                                    th = th21;
                                    java.lang.Throwable th22 = th;
                                    java.lang.Throwable cause5 = th22.getCause();
                                    if (cause5 == null) {
                                        throw th22;
                                    }
                                    throw cause5;
                                }
                            } catch (java.lang.Throwable th23) {
                                th = th23;
                            }
                        } catch (java.lang.Throwable th24) {
                            th = th24;
                            th3 = th;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr322222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr322222222[1972], bArr322222222[2167], bArr322222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr322222222[1972], bArr322222222[2167], bArr322222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -53:
                        iArr = iArr2;
                        try {
                            dsVar.c = 2;
                            dsVar.d(1);
                            dsVar.d(2);
                            java.lang.Object obj8 = dsVar.f;
                            dsVar.d(2);
                            try {
                                java.lang.Object[] objArr26 = {obj8, dsVar.f};
                                short s6 = (short) 82;
                                byte[] bArr5 = X;
                                try {
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    Z(s6, bArr5[393], bArr5[1967], objArr27);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                    Z((short) 67, bArr5[179], (byte) (-bArr5[1963]), objArr28);
                                    java.lang.String str4 = (java.lang.String) objArr28[0];
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    Z((short) (Y + 5), bArr5[2167], bArr5[1915], objArr29);
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    Z((short) (bArr5[1915] - 1), (short) (-bArr5[424]), bArr5[1967], objArr30);
                                    cls6.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr29[0]), java.lang.Class.forName((java.lang.String) objArr30[0])).invoke(null, objArr26);
                                    clsArr2 = null;
                                    i4 = i19;
                                    i3 = i4;
                                    i = 1;
                                } catch (java.lang.Throwable th25) {
                                    th = th25;
                                    java.lang.Throwable th26 = th;
                                    try {
                                        java.lang.Throwable cause6 = th26.getCause();
                                        if (cause6 == null) {
                                            throw th26;
                                        }
                                        throw cause6;
                                    } catch (java.lang.Throwable th27) {
                                        th = th27;
                                        th3 = th;
                                        clsArr = null;
                                        th = th3;
                                        clsArr2 = clsArr;
                                        byte[] bArr3222222222 = X;
                                        objArr = new java.lang.Object[1];
                                        Z(bArr3222222222[1972], bArr3222222222[2167], bArr3222222222[1967], objArr);
                                        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                        }
                                        i = 1;
                                        objArr2 = new java.lang.Object[1];
                                        Z(bArr3222222222[1972], bArr3222222222[2167], bArr3222222222[1967], objArr2);
                                        if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                        }
                                        if (i18 < 297) {
                                        }
                                        if (i18 < 313) {
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th28) {
                                th = th28;
                            }
                        } catch (java.lang.Throwable th29) {
                            th = th29;
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -52:
                        iArr = iArr2;
                        obj3 = new java.util.Comparator() { // from class: com.facetec.sdk.af$$ExternalSyntheticLambda1
                            @Override // java.util.Comparator
                            public final int compare(java.lang.Object obj9, java.lang.Object obj10) {
                                int d3;
                                d3 = com.facetec.sdk.af.d((android.util.Size) obj9, (android.util.Size) obj10);
                                return d3;
                            }
                        };
                        dsVar.h = obj3;
                        i11 = 6;
                        dsVar.d(i11);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -51:
                        iArr = iArr2;
                        i12 = 166;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -50:
                        iArr = iArr2;
                        i12 = 89;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -49:
                        iArr = iArr2;
                        dsVar.d(24);
                        if (dsVar.d == 0) {
                            i19 = 88;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -48:
                        iArr = iArr2;
                        i13 = com.facetec.sdk.bd.e;
                        dsVar.c = i13;
                        i11 = 3;
                        dsVar.d(i11);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -47:
                        iArr = iArr2;
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(2);
                        com.facetec.sdk.by.a aVar = (com.facetec.sdk.by.a) dsVar.f;
                        dsVar.d(7);
                        com.facetec.sdk.by.a(aVar, dsVar.d != 0);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -46:
                        iArr = iArr2;
                        obj3 = com.facetec.sdk.by.a.f3448a;
                        dsVar.h = obj3;
                        i11 = 6;
                        dsVar.d(i11);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -45:
                        iArr = iArr2;
                        i12 = 81;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -44:
                        iArr = iArr2;
                        i12 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -43:
                        iArr = iArr2;
                        i12 = 79;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -42:
                        iArr = iArr2;
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i19 = 76;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -41:
                        iArr = iArr2;
                        i12 = 77;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -40:
                        iArr = iArr2;
                        i12 = 301;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -39:
                        iArr = iArr2;
                        dsVar.d(67);
                        if (dsVar.d == 0) {
                            i19 = 72;
                        }
                        i18 = i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -38:
                        iArr = iArr2;
                        int i39 = i16;
                        dsVar.c = i39;
                        dsVar.d(i39);
                        dsVar.d(2);
                        java.lang.Object obj9 = dsVar.f;
                        short s7 = (short) 137;
                        try {
                            byte[] bArr6 = X;
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            Z(s7, (short) (-bArr6[1944]), bArr6[1967], objArr31);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            Z((short) 85, bArr6[179], (byte) (-bArr6[1963]), objArr32);
                            i13 = ((java.lang.Integer) cls7.getMethod((java.lang.String) objArr32[0], null).invoke(obj9, null)).intValue();
                            dsVar.c = i13;
                            i11 = 3;
                            dsVar.d(i11);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th30) {
                            java.lang.Throwable cause7 = th30.getCause();
                            if (cause7 == null) {
                                throw th30;
                            }
                            throw cause7;
                        }
                    case -37:
                        iArr = iArr2;
                        i12 = 65;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -36:
                        iArr = iArr2;
                        i12 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE;
                        i18 = i12;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -35:
                        try {
                            iArr = iArr2;
                            dsVar.d(64);
                            if (dsVar.d == 0) {
                                i19 = 62;
                            }
                            i18 = i19;
                            iArr2 = iArr;
                            clsArr2 = null;
                            i16 = 1;
                        } catch (java.lang.Throwable th31) {
                            th = th31;
                            th3 = th;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr32222222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr32222222222[1972], bArr32222222222[2167], bArr32222222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th) || i18 < 192 || i18 >= 200) {
                                i = 1;
                                objArr2 = new java.lang.Object[1];
                                Z(bArr32222222222[1972], bArr32222222222[2167], bArr32222222222[1967], objArr2);
                                if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th) && i18 >= 200 && i18 < 206) {
                                    i2 = 207;
                                } else if (i18 < 297 && i18 < 301) {
                                    i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE;
                                } else {
                                    if (i18 < 313) {
                                        throw th;
                                    }
                                    if (i18 >= 318) {
                                        throw th;
                                    }
                                    i2 = 311;
                                }
                            } else {
                                i2 = 207;
                                i = 1;
                            }
                            dsVar.h = th;
                            dsVar.d(37);
                            i3 = i2;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        }
                        break;
                    case -34:
                        try {
                            dsVar.c = 3;
                            dsVar.d(1);
                            dsVar.d(2);
                            java.lang.Object obj10 = dsVar.f;
                            dsVar.d(2);
                            java.lang.Object obj11 = dsVar.f;
                            dsVar.d(2);
                            try {
                                java.lang.Object[] objArr33 = {obj11, dsVar.f};
                                byte[] bArr7 = X;
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                Z((short) 137, (short) (-bArr7[1944]), bArr7[1967], objArr34);
                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                Z((short) 87, bArr7[91], (byte) (-bArr7[419]), objArr35);
                                java.lang.String str5 = (java.lang.String) objArr35[0];
                                java.lang.Class<?>[] clsArr3 = new java.lang.Class[2];
                                short s8 = (short) 117;
                                iArr = iArr2;
                                try {
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    Z(s8, bArr7[393], bArr7[1967], objArr36);
                                    clsArr3[0] = java.lang.Class.forName((java.lang.String) objArr36[0]);
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    Z(s8, bArr7[393], bArr7[1967], objArr37);
                                    clsArr3[1] = java.lang.Class.forName((java.lang.String) objArr37[0]);
                                    obj3 = cls8.getMethod(str5, clsArr3).invoke(obj10, objArr33);
                                    dsVar.h = obj3;
                                    i11 = 6;
                                    dsVar.d(i11);
                                    clsArr2 = null;
                                    i4 = i19;
                                    i3 = i4;
                                    i = 1;
                                } catch (java.lang.Throwable th32) {
                                    th = th32;
                                    java.lang.Throwable th33 = th;
                                    java.lang.Throwable cause8 = th33.getCause();
                                    if (cause8 == null) {
                                        throw th33;
                                    }
                                    throw cause8;
                                }
                            } catch (java.lang.Throwable th34) {
                                th = th34;
                            }
                        } catch (java.lang.Throwable th35) {
                            th = th35;
                            iArr = iArr2;
                            th3 = th;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr322222222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr322222222222[1972], bArr322222222222[2167], bArr322222222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr322222222222[1972], bArr322222222222[2167], bArr322222222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -33:
                        int i40 = i16;
                        dsVar.c = i40;
                        dsVar.d(i40);
                        dsVar.d(7);
                        try {
                            java.lang.Object[] objArr38 = new java.lang.Object[i40];
                            objArr38[0] = java.lang.Integer.valueOf(dsVar.d);
                            byte[] bArr8 = X;
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            Z((short) 1789, bArr8[400], bArr8[1967], objArr39);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr39[0]);
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            Z((short) 1773, bArr8[10], (byte) 74, objArr40);
                            invoke = cls9.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE).invoke(null, objArr38);
                            dsVar.h = invoke;
                            iArr = iArr2;
                            i11 = 6;
                            dsVar.d(i11);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th36) {
                            java.lang.Throwable cause9 = th36.getCause();
                            if (cause9 == null) {
                                throw th36;
                            }
                            throw cause9;
                        }
                    case -32:
                        i14 = 52;
                        i18 = i14;
                        iArr = iArr2;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -31:
                        int i41 = i16;
                        try {
                            dsVar.c = i41;
                            dsVar.d(i41);
                            dsVar.d(2);
                            java.lang.Object obj12 = dsVar.f;
                            short s9 = (short) 102;
                            try {
                                byte[] bArr9 = X;
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                Z(s9, bArr9[393], bArr9[1967], objArr41);
                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr41[0]);
                                try {
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    Z((short) 1767, bArr9[13], (byte) (Y + 2), objArr42);
                                    dsVar.c = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr42[0], null).invoke(obj12, null)).intValue();
                                    iArr = iArr2;
                                    i11 = 3;
                                    dsVar.d(i11);
                                    clsArr2 = null;
                                    i4 = i19;
                                    i3 = i4;
                                    i = 1;
                                } catch (java.lang.Throwable th37) {
                                    th = th37;
                                    java.lang.Throwable th38 = th;
                                    java.lang.Throwable cause10 = th38.getCause();
                                    if (cause10 == null) {
                                        throw th38;
                                    }
                                    throw cause10;
                                }
                            } catch (java.lang.Throwable th39) {
                                th = th39;
                            }
                        } catch (java.lang.Throwable th40) {
                            th = th40;
                            th3 = th;
                            iArr = iArr2;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr3222222222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr3222222222222[1972], bArr3222222222222[2167], bArr3222222222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr3222222222222[1972], bArr3222222222222[2167], bArr3222222222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -30:
                        i14 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                        i18 = i14;
                        iArr = iArr2;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -29:
                        i14 = 47;
                        i18 = i14;
                        iArr = iArr2;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -28:
                        i14 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                        i18 = i14;
                        iArr = iArr2;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -27:
                        dsVar.d(10);
                        iArr = iArr2;
                        i18 = dsVar.d == 0 ? 44 : i19;
                        iArr2 = iArr;
                        clsArr2 = null;
                        i16 = 1;
                    case -26:
                        int i42 = i16;
                        dsVar.c = i42;
                        dsVar.d(i42);
                        dsVar.d(2);
                        invoke = dsVar.f;
                        dsVar.h = invoke;
                        iArr = iArr2;
                        i11 = 6;
                        dsVar.d(i11);
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -25:
                        dsVar.c = 2;
                        dsVar.d(i16);
                        dsVar.d(2);
                        java.lang.Object obj13 = dsVar.f;
                        dsVar.d(2);
                        try {
                            java.lang.Object[] objArr43 = {dsVar.f};
                            java.lang.Object[] objArr44 = new java.lang.Object[i16];
                            Z((short) 137, (short) (-X[1944]), r11[1967], objArr44);
                            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr44[0]);
                            java.lang.Object[] objArr45 = new java.lang.Object[i16];
                            Z((short) 1738, r11[91], (byte) Y, objArr45);
                            java.lang.String str6 = (java.lang.String) objArr45[0];
                            java.lang.Class<?>[] clsArr4 = new java.lang.Class[i16];
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            Z((short) 117, r11[393], r11[1967], objArr46);
                            clsArr4[0] = java.lang.Class.forName((java.lang.String) objArr46[0]);
                            invoke = cls11.getMethod(str6, clsArr4).invoke(obj13, objArr43);
                            dsVar.h = invoke;
                            iArr = iArr2;
                            i11 = 6;
                            dsVar.d(i11);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th41) {
                            java.lang.Throwable cause11 = th41.getCause();
                            if (cause11 == null) {
                                throw th41;
                            }
                            throw cause11;
                        }
                    case -24:
                        dsVar.c = i16;
                        dsVar.d(i16);
                        dsVar.d(2);
                        obj4 = dsVar.f.toString();
                        dsVar.h = obj4;
                        dsVar.d(6);
                        iArr = iArr2;
                        clsArr2 = null;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -23:
                        dsVar.c = i16;
                        dsVar.d(i16);
                        dsVar.d(2);
                        java.lang.Object obj14 = dsVar.f;
                        short s10 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
                        try {
                            java.lang.Object[] objArr47 = new java.lang.Object[i16];
                            Z(s10, r10[400], (byte) (-X[1909]), objArr47);
                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr47[0]);
                            java.lang.Object[] objArr48 = new java.lang.Object[i16];
                            Z((short) 145, r10[7], (byte) Y, objArr48);
                            dsVar.c = ((java.lang.Integer) cls12.getMethod((java.lang.String) objArr48[0], null).invoke(obj14, null)).intValue();
                            iArr = iArr2;
                            i11 = 3;
                            dsVar.d(i11);
                            clsArr2 = null;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th42) {
                            java.lang.Throwable cause12 = th42.getCause();
                            if (cause12 == null) {
                                throw th42;
                            }
                            throw cause12;
                        }
                    case -22:
                        try {
                            dsVar.c = 2;
                            dsVar.d(i16);
                            dsVar.d(2);
                            java.lang.Object obj15 = dsVar.f;
                            dsVar.d(2);
                            try {
                                java.lang.Object[] objArr49 = {dsVar.f};
                                short s11 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
                                byte[] bArr10 = X;
                                java.lang.Object[] objArr50 = new java.lang.Object[i16];
                                Z(s11, bArr10[401], bArr10[1967], objArr50);
                                java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr50[0]);
                                java.lang.Object[] objArr51 = new java.lang.Object[i16];
                                Z((short) 150, bArr10[5], (byte) (-bArr10[1909]), objArr51);
                                java.lang.String str7 = (java.lang.String) objArr51[0];
                                java.lang.Class<?>[] clsArr5 = new java.lang.Class[i16];
                                java.lang.Object[] objArr52 = new java.lang.Object[i16];
                                Z(s, bArr10[393], bArr10[1967], objArr52);
                                clsArr5[0] = java.lang.Class.forName((java.lang.String) objArr52[0]);
                                obj4 = cls13.getMethod(str7, clsArr5).invoke(obj15, objArr49);
                                dsVar.h = obj4;
                                dsVar.d(6);
                                iArr = iArr2;
                                clsArr2 = null;
                                i4 = i19;
                                i3 = i4;
                                i = 1;
                            } catch (java.lang.Throwable th43) {
                                java.lang.Throwable cause13 = th43.getCause();
                                if (cause13 == null) {
                                    throw th43;
                                }
                                throw cause13;
                            }
                        } catch (java.lang.Throwable th44) {
                            th = th44;
                            th3 = th;
                            iArr = iArr2;
                            clsArr = null;
                            th = th3;
                            clsArr2 = clsArr;
                            byte[] bArr32222222222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr32222222222222[1972], bArr32222222222222[2167], bArr32222222222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr32222222222222[1972], bArr32222222222222[2167], bArr32222222222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -21:
                        obj5 = "x";
                        dsVar.h = obj5;
                        i15 = 6;
                        dsVar.d(i15);
                        iArr = iArr2;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -20:
                        dsVar.c = 2;
                        dsVar.d(i16);
                        dsVar.d(2);
                        java.lang.Object obj16 = dsVar.f;
                        dsVar.d(7);
                        try {
                            java.lang.Object[] objArr53 = new java.lang.Object[i16];
                            objArr53[0] = java.lang.Integer.valueOf(dsVar.d);
                            short s12 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
                            byte[] bArr11 = X;
                            java.lang.Object[] objArr54 = new java.lang.Object[i16];
                            Z(s12, bArr11[401], bArr11[1967], objArr54);
                            java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr54[0]);
                            java.lang.Object[] objArr55 = new java.lang.Object[i16];
                            Z((short) 150, bArr11[5], (byte) (-bArr11[1909]), objArr55);
                            java.lang.String str8 = (java.lang.String) objArr55[0];
                            java.lang.Class<?>[] clsArr6 = new java.lang.Class[i16];
                            clsArr6[0] = java.lang.Integer.TYPE;
                            obj5 = cls14.getMethod(str8, clsArr6).invoke(obj16, objArr53);
                            dsVar.h = obj5;
                            i15 = 6;
                            dsVar.d(i15);
                            iArr = iArr2;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th45) {
                            java.lang.Throwable cause14 = th45.getCause();
                            if (cause14 == null) {
                                throw th45;
                            }
                            throw cause14;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dsVar.c = i16;
                        dsVar.d(i16);
                        dsVar.d(2);
                        java.lang.Object obj17 = dsVar.f;
                        short s13 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
                        try {
                            java.lang.Object[] objArr56 = new java.lang.Object[i16];
                            Z(s13, r12[400], (byte) (-X[1909]), objArr56);
                            java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr56[0]);
                            java.lang.Object[] objArr57 = new java.lang.Object[i16];
                            Z((short) 157, r12[13], (byte) Y, objArr57);
                            dsVar.c = ((java.lang.Integer) cls15.getMethod((java.lang.String) objArr57[0], clsArr2).invoke(obj17, clsArr2)).intValue();
                            i15 = 3;
                            dsVar.d(i15);
                            iArr = iArr2;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th46) {
                            java.lang.Throwable cause15 = th46.getCause();
                            if (cause15 == null) {
                                throw th46;
                            }
                            throw cause15;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        short s14 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
                        try {
                            byte[] bArr12 = X;
                            java.lang.Object[] objArr58 = new java.lang.Object[i16];
                            Z(s14, bArr12[401], bArr12[1967], objArr58);
                            obj5 = java.lang.Class.forName((java.lang.String) objArr58[0]).getDeclaredConstructor(clsArr2).newInstance(clsArr2);
                            dsVar.h = obj5;
                            i15 = 6;
                            dsVar.d(i15);
                            iArr = iArr2;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th47) {
                            java.lang.Throwable cause16 = th47.getCause();
                            if (cause16 == null) {
                                throw th47;
                            }
                            throw cause16;
                        }
                    case -17:
                        i18 = 67;
                    case -16:
                        i18 = 26;
                    case -15:
                        dsVar.d(51);
                        if (dsVar.d == 0) {
                            i19 = 25;
                        }
                        i18 = i19;
                    case -14:
                        i18 = 21;
                    case -13:
                        short s15 = (short) 211;
                        try {
                            byte[] bArr13 = X;
                            java.lang.Object[] objArr59 = new java.lang.Object[i16];
                            Z(s15, bArr13[400], bArr13[1967], objArr59);
                            obj5 = java.lang.Class.forName((java.lang.String) objArr59[0]).getDeclaredConstructor(clsArr2).newInstance(clsArr2);
                            dsVar.h = obj5;
                            i15 = 6;
                            dsVar.d(i15);
                            iArr = iArr2;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th48) {
                            java.lang.Throwable cause17 = th48.getCause();
                            if (cause17 == null) {
                                throw th48;
                            }
                            throw cause17;
                        }
                    case -12:
                        dsVar.d(25);
                        throw ((java.lang.Throwable) dsVar.f);
                    case -11:
                        dsVar.c = i16;
                        dsVar.d(i16);
                        dsVar.d(2);
                        obj5 = new com.facetec.sdk.ak((com.facetec.sdk.ak.e) dsVar.f);
                        dsVar.h = obj5;
                        i15 = 6;
                        dsVar.d(i15);
                        iArr = iArr2;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -10:
                        obj5 = com.facetec.sdk.ak.e.NO_OUTPUT_SIZES;
                        dsVar.h = obj5;
                        i15 = 6;
                        dsVar.d(i15);
                        iArr = iArr2;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                    case -9:
                        i18 = 16;
                    case -8:
                        i18 = 13;
                    case -7:
                        dsVar.d(24);
                        if (dsVar.d == 0) {
                            i19 = 12;
                        }
                        i18 = i19;
                    case -6:
                        i18 = 324;
                    case -5:
                        i18 = 326;
                    case -4:
                        dsVar.d(38);
                        if (dsVar.d == 0) {
                            i19 = 8;
                        }
                        i18 = i19;
                    case -3:
                        dsVar.c = 2;
                        dsVar.d(i16);
                        dsVar.d(2);
                        java.lang.Object obj18 = dsVar.f;
                        dsVar.d(2);
                        try {
                            java.lang.Object[] objArr60 = {(java.lang.Class) dsVar.f};
                            short s16 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                            short s17 = (short) (-X[1909]);
                            java.lang.Object[] objArr61 = new java.lang.Object[i16];
                            Z(s16, s17, (byte) s17, objArr61);
                            java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr61[0]);
                            java.lang.Object[] objArr62 = new java.lang.Object[i16];
                            Z((short) 224, r13[35], (byte) Y, objArr62);
                            java.lang.String str9 = (java.lang.String) objArr62[0];
                            java.lang.Class<?>[] clsArr7 = new java.lang.Class[i16];
                            clsArr7[0] = java.lang.Class.class;
                            obj5 = cls16.getMethod(str9, clsArr7).invoke(obj18, objArr60);
                            dsVar.h = obj5;
                            i15 = 6;
                            dsVar.d(i15);
                            iArr = iArr2;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                            i18 = i3;
                            i16 = i;
                            iArr2 = iArr;
                        } catch (java.lang.Throwable th49) {
                            java.lang.Throwable cause18 = th49.getCause();
                            if (cause18 == null) {
                                throw th49;
                            }
                            throw cause18;
                        }
                    case -2:
                        short s18 = (short) 307;
                        try {
                            java.lang.Object[] objArr63 = new java.lang.Object[i16];
                            Z(s18, r10[405], (byte) (-X[1909]), objArr63);
                            dsVar.h = java.lang.Class.forName((java.lang.String) objArr63[0]);
                            dsVar.d(6);
                            iArr = iArr2;
                            i4 = i19;
                            i3 = i4;
                            i = 1;
                        } catch (java.lang.Throwable th50) {
                            th = th50;
                            iArr = iArr2;
                            byte[] bArr322222222222222 = X;
                            objArr = new java.lang.Object[1];
                            Z(bArr322222222222222[1972], bArr322222222222222[2167], bArr322222222222222[1967], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            i = 1;
                            objArr2 = new java.lang.Object[1];
                            Z(bArr322222222222222[1972], bArr322222222222222[2167], bArr322222222222222[1967], objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i18 < 297) {
                            }
                            if (i18 < 313) {
                            }
                        }
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                        break;
                    case -1:
                        i18 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                    default:
                        iArr = iArr2;
                        i4 = i19;
                        i3 = i4;
                        i = 1;
                        i18 = i3;
                        i16 = i;
                        iArr2 = iArr;
                }
            }
        } catch (java.lang.Throwable th51) {
            java.lang.Throwable cause19 = th51.getCause();
            if (cause19 == null) {
                throw th51;
            }
            throw cause19;
        }
    }

    @Override // com.facetec.sdk.ai
    final void c() {
        int i;
        com.facetec.sdk.ds dsVar = new com.facetec.sdk.ds(this);
        byte[] bArr = X;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Z((short) 1736, (short) 206, bArr[38], objArr);
        char c = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s = (short) 1808;
        short s2 = bArr[44];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Z(s, s2, (byte) s2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = 1967;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Z(s, bArr[393], bArr[1967], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Z((short) 1793, bArr[39], (byte) (-bArr[1963]), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Z(s, bArr[393], bArr[1967], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                short s3 = (short) 1789;
                byte[] bArr2 = X;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                Z(s3, bArr2[400], bArr2[c2], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Z((short) 1773, bArr2[10], (byte) 74, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Z(s, bArr2[393], bArr2[1967], objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                Z(s3, bArr2[400], bArr2[1967], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                Z((short) 1767, bArr2[13], (byte) (Y + 2), objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c2 = 1967;
                c = 0;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int i5 = 20;
                switch (dsVar.d(iArr[i3])) {
                    case -31:
                        i3 = 58;
                    case -30:
                        dsVar.d(32);
                        if (dsVar.d == 0) {
                            i5 = 6;
                        }
                    case -29:
                        i3 = 53;
                    case -28:
                        dsVar.d(32);
                        i3 = dsVar.d != 0 ? i5 : 42;
                    case -27:
                        i3 = 14;
                    case -26:
                        i3 = 52;
                    case -25:
                        dsVar.d(24);
                        i3 = dsVar.d == 0 ? 51 : i4;
                    case -24:
                        dsVar.c = 1;
                        dsVar.d(1);
                        dsVar.d(7);
                        U = dsVar.d;
                    case -23:
                        i = V;
                        dsVar.c = i;
                        dsVar.d(3);
                    case -22:
                        i3 = 24;
                    case -21:
                        i3 = 41;
                    case -20:
                        dsVar.d(5);
                        if (dsVar.d == 0) {
                            i3 = 40;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dsVar.c = 1;
                        dsVar.d(1);
                        dsVar.d(7);
                        V = dsVar.d;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i = U;
                        dsVar.c = i;
                        dsVar.d(3);
                    case -17:
                    case -16:
                        return;
                    case -15:
                        i3 = 1;
                    case -14:
                        i3 = 29;
                    case -13:
                        i3 = 26;
                    case -12:
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(2);
                        java.lang.Object obj = dsVar.f;
                        dsVar.d(2);
                        try {
                            java.lang.Object[] objArr14 = {(com.facetec.sdk.ee) dsVar.f};
                            java.lang.Object d = com.facetec.sdk.al.d(-1708259942);
                            if (d == null) {
                                char c3 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int myTid = android.os.Process.myTid();
                                int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                                byte b2 = (byte) ($$b - 4);
                                byte b3 = b2;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                aa(b2, b3, b3, objArr15);
                                d = com.facetec.sdk.al.c(c3, 24 - (myTid >> 22), (windowTouchSlop >> 8) + 24, 1036091234, false, (java.lang.String) objArr15[0], new java.lang.Class[]{com.facetec.sdk.ee.class});
                            }
                            ((java.lang.reflect.Method) d).invoke(obj, objArr14);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    case -11:
                        dsVar.c = 1;
                        dsVar.d(1);
                        dsVar.d(2);
                        dsVar.h = ((com.facetec.sdk.af) dsVar.f).w;
                        dsVar.d(6);
                        i3 = i4;
                    case -10:
                        i4 = 54;
                    case -9:
                        i4 = 56;
                    case -8:
                        dsVar.d(38);
                        if (dsVar.d == 0) {
                            i4 = 13;
                        }
                    case -7:
                        dsVar.c = 1;
                        dsVar.d(1);
                        dsVar.d(2);
                        dsVar.h = ((com.facetec.sdk.af) dsVar.f).H;
                        dsVar.d(6);
                        i3 = i4;
                    case -6:
                        dsVar.c = 2;
                        dsVar.d(1);
                        dsVar.d(2);
                        com.facetec.sdk.af afVar = (com.facetec.sdk.af) dsVar.f;
                        dsVar.d(7);
                        afVar.E = dsVar.d != 0;
                        i3 = i4;
                    case -5:
                        i3 = 59;
                    case -4:
                        i3 = 61;
                    case -3:
                        dsVar.d(24);
                        if (dsVar.d == 0) {
                            i3 = 5;
                        }
                    case -2:
                        dsVar.c = 1;
                        dsVar.d(1);
                        dsVar.d(2);
                        dsVar.c = ((com.facetec.sdk.af) dsVar.f).E ? 1 : 0;
                        dsVar.d(3);
                        i3 = i4;
                    case -1:
                        i3 = 21;
                    default:
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d1, code lost:
    
        r1.c = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0325, code lost:
    
        r1.d(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0178, code lost:
    
        r1.h = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01bd, code lost:
    
        r1.d(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x020e, code lost:
    
        r1.h = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02b8, code lost:
    
        r1.d(6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0490 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022a A[Catch: all -> 0x036b, TryCatch #8 {all -> 0x036b, blocks: (B:20:0x020e, B:21:0x02b8, B:65:0x0224, B:67:0x022a, B:68:0x022b, B:19:0x0234, B:95:0x0247, B:111:0x026e, B:113:0x0283, B:128:0x02a6, B:130:0x02bd, B:131:0x02d1, B:132:0x0325, B:134:0x02d4, B:136:0x02f4, B:139:0x0311, B:145:0x031d, B:147:0x0329, B:149:0x033e, B:162:0x035c, B:163:0x036a), top: B:18:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b A[Catch: all -> 0x036b, TryCatch #8 {all -> 0x036b, blocks: (B:20:0x020e, B:21:0x02b8, B:65:0x0224, B:67:0x022a, B:68:0x022b, B:19:0x0234, B:95:0x0247, B:111:0x026e, B:113:0x0283, B:128:0x02a6, B:130:0x02bd, B:131:0x02d1, B:132:0x0325, B:134:0x02d4, B:136:0x02f4, B:139:0x0311, B:145:0x031d, B:147:0x0329, B:149:0x033e, B:162:0x035c, B:163:0x036a), top: B:18:0x0234 }] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(java.lang.Object obj) {
        ?? r13;
        java.lang.Object obj2;
        int i;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i2;
        java.lang.Object obj5;
        java.lang.Throwable cause;
        com.facetec.sdk.ds dsVar = new com.facetec.sdk.ds(this, obj);
        byte[] bArr = X;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Z((short) 2166, (short) 358, bArr[38], objArr);
        char c = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s = (short) 1808;
        short s2 = bArr[44];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Z(s, s2, (byte) s2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = 1967;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Z(s, bArr[393], bArr[1967], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Z((short) 1793, bArr[39], (byte) (-bArr[1963]), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Z(s, bArr[393], bArr[1967], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                short s3 = (short) 1789;
                byte[] bArr2 = X;
                short s4 = bArr2[400];
                byte b2 = bArr2[c2];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                Z(s3, s4, b2, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Z((short) 1773, bArr2[10], (byte) 74, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Z(s, bArr2[393], bArr2[1967], objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                Z(s3, bArr2[400], bArr2[1967], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                Z((short) 1767, bArr2[13], (byte) (Y + 2), objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i3++;
                c = 0;
                c2 = 1967;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (true) {
                    i4 = i5 + 1;
                    try {
                        r13 = 32;
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                    switch (dsVar.d(iArr[i5])) {
                        case -51:
                            i5 = 101;
                        case -50:
                            dsVar.d(32);
                            if (dsVar.d == 62) {
                                break;
                            }
                            i5 = 9;
                        case -49:
                            i5 = 96;
                        case -48:
                            dsVar.d(32);
                            if (dsVar.d == 0) {
                                break;
                            } else {
                                i5 = 9;
                            }
                        case -47:
                            i5 = 91;
                        case -46:
                            try {
                                dsVar.d(32);
                                i5 = 54;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (i5 < 59) {
                                }
                                if (i5 < 86) {
                                }
                                throw th;
                            }
                            if (dsVar.d != 54) {
                                i4 = 84;
                                break;
                            } else {
                                i5 = 1;
                            }
                            break;
                        case -45:
                            i5 = 97;
                        case -44:
                            i5 = 99;
                        case -43:
                            obj2 = null;
                            dsVar.d(5);
                            if (dsVar.d == 0) {
                                i4 = 90;
                                break;
                            }
                            break;
                        case -42:
                            i5 = 92;
                        case -41:
                            i5 = 94;
                        case -40:
                            obj2 = null;
                            dsVar.d(5);
                            if (dsVar.d == 0) {
                                i4 = 82;
                                break;
                            }
                            break;
                        case -39:
                            obj2 = null;
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(7);
                            V = dsVar.d;
                            break;
                        case -38:
                            obj2 = null;
                            i = U;
                            dsVar.c = i;
                            dsVar.d(3);
                            break;
                        case -37:
                            i5 = 43;
                        case -36:
                            i5 = 72;
                        case -35:
                            obj2 = null;
                            dsVar.d(24);
                            if (dsVar.d == 0) {
                                i4 = 71;
                                break;
                            }
                            break;
                        case -34:
                            obj2 = null;
                            try {
                                dsVar.c = 1;
                                dsVar.d(1);
                                try {
                                    dsVar.d(2);
                                    i = dsVar.f.hashCode();
                                    dsVar.c = i;
                                    dsVar.d(3);
                                    break;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    if (i5 < 59 && i5 < 63) {
                                        i5 = 56;
                                    } else {
                                        if (i5 < 86 || i5 >= 91) {
                                            throw th;
                                        }
                                        i5 = 83;
                                    }
                                    dsVar.h = th;
                                    dsVar.d(37);
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                if (i5 < 59) {
                                }
                                if (i5 < 86) {
                                }
                                throw th;
                            }
                            break;
                        case -33:
                            dsVar.d(25);
                            throw ((java.lang.Throwable) dsVar.f);
                        case -32:
                            i4 = 6;
                            break;
                        case -31:
                            i4 = 57;
                            break;
                        case -30:
                            dsVar.d(24);
                            if (dsVar.d != 0) {
                                break;
                            } else {
                                i4 = 55;
                                break;
                            }
                        case -29:
                            obj4 = null;
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(7);
                            U = dsVar.d;
                            break;
                        case -28:
                            obj4 = null;
                            i2 = V;
                            break;
                        case -27:
                            i4 = 73;
                            break;
                        case -26:
                            obj4 = null;
                            dsVar.c = 2;
                            dsVar.d(1);
                            dsVar.d(2);
                            com.facetec.sdk.ai aiVar = (com.facetec.sdk.ai) dsVar.f;
                            dsVar.d(7);
                            aiVar.h = dsVar.d != 0;
                            break;
                        case -25:
                            obj4 = null;
                            dsVar.c = 3;
                            dsVar.d(1);
                            dsVar.d(2);
                            com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) dsVar.f;
                            dsVar.d(2);
                            java.lang.Object obj6 = dsVar.f;
                            dsVar.d(7);
                            cnVar.b$6962e6(obj6, dsVar.d);
                            break;
                        case -24:
                            obj4 = null;
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(2);
                            i2 = ((com.facetec.sdk.af) dsVar.f).B;
                            break;
                        case -23:
                            obj4 = null;
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(2);
                            obj5 = dsVar.f;
                            break;
                        case -22:
                            return;
                        case -21:
                            i4 = 30;
                            break;
                        case -20:
                            i4 = 29;
                            break;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            dsVar.d(10);
                            if (dsVar.d != 0) {
                                break;
                            } else {
                                i4 = 28;
                                break;
                            }
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            obj4 = null;
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(2);
                            obj5 = ((com.facetec.sdk.bf) dsVar.f).f3415a;
                            break;
                        case -17:
                            i4 = 63;
                            break;
                        case -16:
                            i4 = 23;
                            break;
                        case -15:
                            i4 = 22;
                            break;
                        case -14:
                            dsVar.d(10);
                            if (dsVar.d != 0) {
                                break;
                            } else {
                                i4 = 21;
                                break;
                            }
                        case -13:
                            try {
                                obj4 = null;
                                dsVar.c = 1;
                                dsVar.d(1);
                                dsVar.d(2);
                                obj5 = (com.facetec.sdk.bl) dsVar.f;
                                break;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                if (i5 < 59) {
                                }
                                if (i5 < 86) {
                                }
                                throw th;
                            }
                            break;
                        case -12:
                            try {
                                dsVar.c = 1;
                                dsVar.d(1);
                                dsVar.d(2);
                                java.lang.Object obj7 = dsVar.f;
                                short s5 = (short) 1760;
                                try {
                                    byte[] bArr3 = X;
                                    try {
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        Z(s5, bArr3[401], bArr3[1967], objArr14);
                                        try {
                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            Z((short) 1738, bArr3[91], (byte) Y, objArr15);
                                            try {
                                                obj4 = null;
                                                try {
                                                    obj5 = cls4.getMethod((java.lang.String) objArr15[0], null).invoke(obj7, null);
                                                    break;
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    cause = th.getCause();
                                                    if (cause == null) {
                                                        throw th;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        cause = th.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                r13 = 0;
                                if (i5 < 59) {
                                }
                                if (i5 < 86) {
                                }
                                throw th;
                            }
                            break;
                        case -11:
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(2);
                            obj3 = ((com.facetec.sdk.af) dsVar.f).p;
                            break;
                        case -10:
                            i();
                            break;
                        case -9:
                            dsVar.c = 2;
                            dsVar.d(1);
                            dsVar.d(2);
                            com.facetec.sdk.ai aiVar2 = (com.facetec.sdk.ai) dsVar.f;
                            dsVar.d(7);
                            aiVar2.i = dsVar.d != 0;
                            break;
                        case -8:
                            i4 = 9;
                            break;
                        case -7:
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(2);
                            com.facetec.sdk.bc.c((java.lang.String) dsVar.f);
                            break;
                        case -6:
                            obj3 = "CTFFT";
                            break;
                        case -5:
                            i4 = 102;
                            break;
                        case -4:
                            i4 = 104;
                            break;
                        case -3:
                            dsVar.d(5);
                            if (dsVar.d != 0) {
                                break;
                            } else {
                                i4 = 5;
                                break;
                            }
                        case -2:
                            dsVar.c = 1;
                            dsVar.d(1);
                            dsVar.d(2);
                            dsVar.c = ((com.facetec.sdk.ai) dsVar.f).h ? 1 : 0;
                            dsVar.d(3);
                            break;
                        case -1:
                            i5 = 40;
                    }
                }
                i4 = 45;
            }
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause2 = th12.getCause();
            if (cause2 == null) {
                throw th12;
            }
            throw cause2;
        }
    }
}
