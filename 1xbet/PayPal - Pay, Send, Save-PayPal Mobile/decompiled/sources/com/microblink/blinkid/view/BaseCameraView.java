package com.microblink.blinkid.view;

/* loaded from: classes.dex */
public abstract class BaseCameraView extends android.view.ViewGroup {
    private com.microblink.blinkid.view.BaseCameraView.VisiblePartUpdateListener Camera2StreamConfigurationMap;
    protected int IIlIIIllIl;
    public boolean IlIllIlIIl;
    protected boolean IlIllIlllI;
    protected com.microblink.blinkid.hardware.orientation.Orientation IlIlllllII;
    protected android.view.View IllIIIIllI;
    protected com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII;
    protected com.microblink.blinkid.hardware.orientation.OrientationChangeListener IllIIlIIII;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private android.graphics.RectF getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private com.microblink.blinkid.secured.IlIllllllI getHighSpeedVideoSizesFor;
    private final android.os.Handler getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private com.microblink.blinkid.view.OrientationAllowedListener getOutputFormats;
    private int getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private final com.microblink.blinkid.secured.lIIlllIIlI getOutputSizes;
    private com.microblink.blinkid.hardware.orientation.Orientation getOutputSizeshNQ4ISI;
    private com.microblink.blinkid.secured.lIlIlIIIII getOutputStallDuration;
    private android.graphics.RectF[] getOutputStallDurationlomOqCM;
    private com.microblink.blinkid.view.OnSizeChangedListener getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedForhNQ4ISI;
    protected boolean lIIIIIlIlI;
    protected com.microblink.blinkid.view.CameraAspectMode lIIIIIllll;
    protected int lIlIIIIlIl;
    public com.microblink.blinkid.view.BaseCameraView.CameraViewState llIIIlllll;
    protected final java.util.concurrent.ConcurrentLinkedQueue llIIlIIIll;
    protected com.microblink.blinkid.view.OnActivityFlipListener llIIlIIlll;
    public com.microblink.blinkid.view.CameraEventsListener llIIlIlIIl;
    public float lllIIIlIlI;
    protected boolean lllIlIlIIl;
    private com.microblink.blinkid.hardware.accelerometer.ShakeCallback toString;

    /* loaded from: classes10.dex */
    public abstract class BaseCameraListener implements com.microblink.blinkid.secured.lIlIllIIlI {
        final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView getHighSpeedVideoFpsRanges;

        public BaseCameraListener(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
            this.getHighSpeedVideoFpsRanges = recognizerRunnerView;
        }

        @Override // com.microblink.blinkid.secured.lIlIllIIlI
        public abstract /* synthetic */ boolean canReceiveFrame();

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public final void onAutofocusFailed() {
            com.microblink.blinkid.view.CameraEventsListener cameraEventsListener = this.getHighSpeedVideoFpsRanges.llIIlIlIIl;
            if (cameraEventsListener != null) {
                cameraEventsListener.onAutofocusFailed();
            }
        }

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public final void onAutofocusStarted(android.graphics.Rect[] rectArr) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getHighSpeedVideoFpsRanges;
            if (recognizerRunnerView.llIIlIlIIl != null) {
                recognizerRunnerView.llIIlIlIIl(new com.microblink.blinkid.view.lIlIIIIlIl(this, rectArr));
            }
        }

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public final void onAutofocusStopped(android.graphics.Rect[] rectArr) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getHighSpeedVideoFpsRanges;
            if (recognizerRunnerView.llIIlIlIIl != null) {
                recognizerRunnerView.llIIlIlIIl(new com.microblink.blinkid.view.llIIlIIlll(this, rectArr));
            }
        }

        @Override // com.microblink.blinkid.secured.lIlIllIIlI
        public abstract /* synthetic */ void onCameraFrame(com.microblink.blinkid.secured.lIllIlIlII lillililii);

        @Override // com.microblink.blinkid.secured.lIlIllIIlI
        public abstract /* synthetic */ void onHighResFrame(com.microblink.blinkid.secured.lIllIlIlII lillililii);
    }

    /* loaded from: classes10.dex */
    public class BaseCameraViewEventsListener implements com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener {
        protected BaseCameraViewEventsListener() {
        }

        @Override // com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener
        public void onCameraPinchEvent(float f) {
            if (!com.microblink.blinkid.view.BaseCameraView.this.getOutputMinFrameDurationlomOqCM || com.microblink.blinkid.view.BaseCameraView.this.getHighSpeedVideoSizesFor == null) {
                return;
            }
            com.microblink.blinkid.view.BaseCameraView baseCameraView = com.microblink.blinkid.view.BaseCameraView.this;
            baseCameraView.setZoomLevel(baseCameraView.getHighSpeedVideoSizes + (f - 1.0f));
        }

        @Override // com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener
        public void onCameraTapEvent(float f, float f2) {
            if (!com.microblink.blinkid.view.BaseCameraView.this.getHighResolutionOutputSizeshNQ4ISI || com.microblink.blinkid.view.BaseCameraView.this.getHighSpeedVideoSizesFor == null || com.microblink.blinkid.view.BaseCameraView.this.getCurrentOrientation() == null) {
                return;
            }
            if (com.microblink.blinkid.view.BaseCameraView.this.getOutputStallDurationlomOqCM == null) {
                float f3 = f - 0.165f;
                float f4 = f2 - 0.165f;
                if (f3 > 1.0f || f4 > 1.0f) {
                    return;
                }
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                com.microblink.blinkid.view.BaseCameraView.this.setMeteringAreas(new android.graphics.RectF[]{new android.graphics.RectF(f3, f4, (f3 + 0.33f > 1.0f ? 1.0f - f3 : 0.33f) + f3, (f4 + 0.33f > 1.0f ? 1.0f - f4 : 0.33f) + f4)}, false);
            }
            com.microblink.blinkid.view.BaseCameraView.this.focusCamera();
        }
    }

    /* loaded from: classes10.dex */
    public class BaseOrientationChangeListener implements com.microblink.blinkid.hardware.orientation.OrientationChangeListener {
        protected BaseOrientationChangeListener() {
        }

        private static boolean getHighSpeedVideoFpsRanges(int i, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
            return i != 0 ? i != 1 ? i != 8 ? i == 9 && orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT : orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE : orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT;
        }

        @Override // com.microblink.blinkid.hardware.orientation.OrientationChangeListener
        public void onOrientationChange(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
            com.microblink.blinkid.view.BaseCameraView baseCameraView = com.microblink.blinkid.view.BaseCameraView.this;
            int i = baseCameraView.IIlIIIllIl;
            int i2 = 8;
            com.microblink.blinkid.util.Log.i(baseCameraView, "Orientation changed to {}, host screen orientation is {}", orientation, i != 0 ? i != 1 ? i != 8 ? i != 9 ? "unknown" : "reverse_portrait" : "reverse_landscape" : "portrait" : "landscape");
            com.microblink.blinkid.view.BaseCameraView baseCameraView2 = com.microblink.blinkid.view.BaseCameraView.this;
            com.microblink.blinkid.util.Log.i(baseCameraView2, "is host activity on sensor: {}", java.lang.Boolean.valueOf(baseCameraView2.lIlIIIIlIl()));
            com.microblink.blinkid.view.BaseCameraView baseCameraView3 = com.microblink.blinkid.view.BaseCameraView.this;
            com.microblink.blinkid.util.Log.i(baseCameraView3, "is flipped: {}", java.lang.Boolean.valueOf(getHighSpeedVideoFpsRanges(baseCameraView3.IIlIIIllIl, orientation)));
            if (com.microblink.blinkid.view.BaseCameraView.this.lIlIIIIlIl() && getHighSpeedVideoFpsRanges(com.microblink.blinkid.view.BaseCameraView.this.IIlIIIllIl, orientation)) {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.view.BaseCameraView.this, "Activity is flipped", new java.lang.Object[0]);
                com.microblink.blinkid.view.BaseCameraView baseCameraView4 = com.microblink.blinkid.view.BaseCameraView.this;
                if (baseCameraView4.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
                    int i3 = com.microblink.blinkid.secured.lllIlIlIIl.llIIlIlIIl[orientation.ordinal()];
                    if (i3 == 1) {
                        i2 = 0;
                    } else if (i3 != 2) {
                        i2 = i3 != 3 ? i3 != 4 ? -1 : 9 : 1;
                    }
                    baseCameraView4.IIlIIIllIl = i2;
                    com.microblink.blinkid.view.BaseCameraView baseCameraView5 = com.microblink.blinkid.view.BaseCameraView.this;
                    baseCameraView5.llIIlIlIIl(baseCameraView5.getContext().getResources().getConfiguration());
                    com.microblink.blinkid.view.OnActivityFlipListener onActivityFlipListener = com.microblink.blinkid.view.BaseCameraView.this.llIIlIIlll;
                    if (onActivityFlipListener != null) {
                        onActivityFlipListener.onActivityFlip();
                    }
                }
            }
            if (com.microblink.blinkid.view.BaseCameraView.this.llIIlIlIIl(orientation)) {
                com.microblink.blinkid.util.Log.v(com.microblink.blinkid.view.BaseCameraView.this, "{} orientation is allowed. Dispatching...", orientation);
                com.microblink.blinkid.view.BaseCameraView.this.getOutputSizeshNQ4ISI = orientation;
                com.microblink.blinkid.view.BaseCameraView baseCameraView6 = com.microblink.blinkid.view.BaseCameraView.this;
                if (baseCameraView6.lIIIIIlIlI) {
                    baseCameraView6.lllIIIlIlI();
                }
            }
        }
    }

    public enum CameraViewState {
        DESTROYED,
        CREATED,
        STARTED,
        RESUMED
    }

    /* loaded from: classes10.dex */
    public interface VisiblePartUpdateListener {
        void onVisiblePartUpdated(android.graphics.RectF rectF);
    }

    public BaseCameraView(android.content.Context context) {
        super(context);
        this.IlIllIlIIl = false;
        this.IllIIIllII = null;
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED;
        this.IIlIIIllIl = 1;
        this.lIIIIIllll = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL;
        this.lllIIIlIlI = 1.0f;
        this.IlIllIlllI = false;
        this.lllIlIlIIl = false;
        this.lIIIIIlIlI = false;
        this.llIIlIIIll = new java.util.concurrent.ConcurrentLinkedQueue();
        this.getOutputStallDuration = null;
        this.getOutputSizes = new com.microblink.blinkid.secured.lIIlllIIlI();
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputMinFrameDuration = 0;
        this.getInputSizeshNQ4ISI = false;
        this.getInputFormats = new android.os.Handler();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 0.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN;
        this.getHighSpeedVideoFpsRanges = false;
        getHighSpeedVideoFpsRanges(context);
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.IIlIIIllIl;
        if (i != 1) {
            return i != 8 ? i != 9 ? 0 : 270 : com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        return 90;
    }

    protected void IIlIIIllIl() {
    }

    protected boolean IlIllIlllI() {
        return true;
    }

    public void addOrientationChangeListener(com.microblink.blinkid.hardware.orientation.OrientationChangeListener orientationChangeListener) {
        com.microblink.blinkid.view.BaseCameraView.CameraViewState cameraViewState = this.llIIIlllll;
        if (cameraViewState != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED && cameraViewState != com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
            throw new java.lang.IllegalStateException("Method addOrientationChangeListener must be called before calling start()");
        }
        this.llIIlIIIll.add(orientationChangeListener);
    }

    public void changeConfiguration(android.content.res.Configuration configuration) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("ChangeConfiguration must be called from UI thread!");
        }
        com.microblink.blinkid.util.Log.i(this, "changeConfiguration: Context: {}", getContext());
        this.lIlIIIIlIl = configuration.orientation;
        this.IIlIIIllIl = IlIllIlIIl();
        llIIlIlIIl(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r1v27, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.microblink.blinkid.view.surface.lIlIIIIlIl] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.microblink.blinkid.view.surface.lIlIIIIlIl] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.microblink.blinkid.view.surface.lIlIIIIlIl] */
    public void create() {
        com.microblink.blinkid.secured.IlIllllllI lilliiliil;
        com.microblink.blinkid.view.surface.IllIIIllII illIIIllII;
        com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII;
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl;
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("It is not allowed to call create() on already created view (state is ");
            sb.append(this.llIIIlllll.name());
            sb.append(")");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("Create must be called from UI thread!");
        }
        if (getCameraFactorySettings().lIIIIIllll == null) {
            throw new java.lang.NullPointerException("You have to set camera factory settings before calling create()");
        }
        this.IlIllIlIIl = false;
        com.microblink.blinkid.util.Log.i(this, "Camera view create. Context = {}", getContext());
        if (this.llIIlIlIIl == null) {
            throw new java.lang.NullPointerException("Please set CameraEventsListener with method setCameraEventsListener before calling create method!");
        }
        this.getOutputSizeshNQ4ISI = this.IlIlllllII;
        this.IllIIlIIII = IllIIIIllI();
        this.getOutputStallDuration = new com.microblink.blinkid.secured.lIlIlIIIII(this.IllIIIllII, this.IllIIlIIII);
        llIIlIlIIl(this.getOutputSizes);
        android.content.Context context = getContext();
        com.microblink.blinkid.secured.IIIlllIlII iIIlllIlII = new com.microblink.blinkid.secured.IIIlllIlII(context);
        com.microblink.blinkid.view.recognition.llIIlIIlll llIIIlllll = llIIIlllll();
        com.microblink.blinkid.secured.lIIlllIIlI liillliili = this.getOutputSizes;
        com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = new com.microblink.blinkid.secured.IlIllIlIIl(context, new com.microblink.blinkid.secured.llllllIllI());
        com.microblink.blinkid.secured.llIIllllIl lliillllil = new com.microblink.blinkid.secured.llIIllllIl();
        if (liillliili.llIIlIIlll || ((IlIllIlIIl = (IllIIIllII = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII()).IlIllIlIIl()) != null && IllIIIllII.llIIlIlIIl(IlIllIlIIl.IllIIlIIII))) {
            com.microblink.blinkid.util.Log.i(iIIlllIlII, "Using camera1 manager because either settings or device blacklist expect using legacy camera API", new java.lang.Object[0]);
            lilliiliil = new com.microblink.blinkid.secured.lIllIIlIIl(ilIllIlIIl, lliillllil, llIIIlllll, liillliili);
        } else {
            com.microblink.blinkid.secured.IlIlllIIII.llIIlIlIIl();
            try {
                if (com.microblink.blinkid.secured.IllIllIllI.IlIllIlIIl(liillliili.IllIIIIllI, context)) {
                    com.microblink.blinkid.util.Log.i(iIIlllIlII, "Using camera2 manager", new java.lang.Object[0]);
                    lilliiliil = new com.microblink.blinkid.secured.IlIIIlIIIl(context, ilIllIlIIl, llIIIlllll, liillliili);
                } else {
                    com.microblink.blinkid.util.Log.i(iIIlllIlII, "Camera2 API not supported natively. Will use camera1 manager!", new java.lang.Object[0]);
                    lilliiliil = new com.microblink.blinkid.secured.lIllIIlIIl(ilIllIlIIl, lliillllil, llIIIlllll, liillliili);
                }
            } catch (android.util.AndroidException unused) {
                com.microblink.blinkid.util.Log.e(iIIlllIlII, "Failed to query camera capabilities when deciding which camera manager to use! Will use camera1 API", new java.lang.Object[0]);
                lilliiliil = new com.microblink.blinkid.secured.lIllIIlIIl(ilIllIlIIl, lliillllil, llIIIlllll, liillliili);
            }
        }
        this.getHighSpeedVideoSizesFor = lilliiliil;
        lilliiliil.llIIlIlIIl(this.toString);
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = this.IllIIIllII;
        com.microblink.blinkid.secured.lIIlllIIlI liillliili2 = this.getOutputSizes;
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl2 = ilIlIlllIl.IlIllIlIIl();
        if (IlIllIlIIl2 != null && ilIlIlllIl.llIIlIlIIl(IlIllIlIIl2.lIIIIIlIlI)) {
            com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IIIlIIlIll.class, "Creating CameraTextureView because of device list rule", new java.lang.Object[0]);
            illIIIllII = new com.microblink.blinkid.view.surface.lIlIIIIlIl(ilIlIlllIl.IlIllIlIIl);
        } else {
            int i = com.microblink.blinkid.secured.llIIlllIll.llIIlIlIIl[liillliili2.IIlIIIllIl.ordinal()];
            if (i == 1) {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IIIlIIlIll.class, "Creating CameraSurfaceView because explicitly asked to", new java.lang.Object[0]);
                illIIIllII = new com.microblink.blinkid.view.surface.IllIIIllII(ilIlIlllIl.IlIllIlIIl);
            } else if (i == 2) {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IIIlIIlIll.class, "Creating CameraTextureView because explicitly asked to", new java.lang.Object[0]);
                illIIIllII = new com.microblink.blinkid.view.surface.lIlIIIIlIl(ilIlIlllIl.IlIllIlIIl);
            } else if (ilIllllllI instanceof com.microblink.blinkid.secured.lIllIIlIIl) {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IIIlIIlIll.class, "Defaulting to CameraTextureView", new java.lang.Object[0]);
                illIIIllII = new com.microblink.blinkid.view.surface.lIlIIIIlIl(ilIlIlllIl.IlIllIlIIl);
            } else {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IIIlIIlIll.class, "Defaulting to CameraSurfaceView", new java.lang.Object[0]);
                illIIIllII = new com.microblink.blinkid.view.surface.IllIIIllII(ilIlIlllIl.IlIllIlIIl);
            }
        }
        this.IllIIIIllI = illIIIllII;
        illIIIllII.setAspectMode(this.lIIIIIllll);
        this.IllIIIIllI.setPreviewZoomScale(this.lllIIIlIlI);
        this.IllIIIIllI.setCameraViewEventListener(new com.microblink.blinkid.view.BaseCameraView.BaseCameraViewEventsListener());
        this.IllIIIIllI.setHostActivityOrientation(this.IIlIIIllIl);
        this.IllIIIIllI.setDeviceNaturalOrientationLandscape(this.getHighSpeedVideoFpsRanges);
        addView(this.IllIIIIllI.getView(), 0);
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    public void destroy() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("It is not allowed to call destroy() method on view that is not stopped. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("Destroy must be called from UI thread!");
        }
        com.microblink.blinkid.util.Log.i(this, "Camera view destroy. Context = {}", getContext());
        this.getHighSpeedVideoSizesFor.dispose();
        this.IllIIIIllI.dispose();
        this.IllIIIIllI = null;
        this.getHighSpeedVideoSizesFor = null;
        removeAllViews();
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        ?? r0 = this.IllIIIIllI;
        return (r0 == 0 || r0.getView() == null || !this.IllIIIIllI.getView().dispatchTouchEvent(motionEvent)) ? false : true;
    }

    public final void focusCamera() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            ilIllllllI.lIIIIIllll();
        }
    }

    public com.microblink.blinkid.view.CameraAspectMode getAspectMode() {
        return this.lIIIIIllll;
    }

    public com.microblink.blinkid.view.CameraEventsListener getCameraEventsListener() {
        return this.llIIlIlIIl;
    }

    protected com.microblink.blinkid.secured.lIIlllIIlI getCameraFactorySettings() {
        return this.getOutputSizes;
    }

    public final int getCameraPreviewHeight() {
        return this.getOutputMinFrameDuration;
    }

    public final int getCameraPreviewWidth() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    protected int getCameraSensorOrientation() {
        return this.getHighSpeedVideoSizesFor.IllIIIllII();
    }

    public final com.microblink.blinkid.view.BaseCameraView.CameraViewState getCameraViewState() {
        return this.llIIIlllll;
    }

    public final int getConfigurationOrientation() {
        return this.lIlIIIIlIl;
    }

    public com.microblink.blinkid.hardware.orientation.Orientation getCurrentOrientation() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final int getHighResFrameLimit() {
        return this.getOutputSizes.IlIllIlllI;
    }

    protected android.app.Activity getHostActivity() {
        for (android.content.Context context = getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public int getHostScreenOrientation() {
        return this.IIlIIIllIl;
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation getInitialOrientation() {
        return this.IlIlllllII;
    }

    public final com.microblink.blinkid.hardware.camera.CameraType getOpenedCameraType() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            return ilIllllllI.lIlIIIIlIl();
        }
        return null;
    }

    public float getPreviewZoomScale() {
        return this.lllIIIlIlI;
    }

    public android.graphics.RectF getVisiblePart() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final float getZoomLevel() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.Boolean isAutofocusSupported() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            return ilIllllllI.llIIlIIlll();
        }
        return null;
    }

    public final boolean isCameraActive() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean isCameraFocused() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            return ilIllllllI.llIIlIlIIl();
        }
        return false;
    }

    public final boolean isCameraTorchSupported() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            return ilIllllllI.IlIllIlllI();
        }
        return false;
    }

    public final boolean isDeviceShaking() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            return ilIllllllI.IlIllIlIIl();
        }
        com.microblink.blinkid.util.Log.e(this, "Camera manager is null! Defining that device is shaking!", new java.lang.Object[0]);
        return true;
    }

    public boolean isHighResFrameCaptureEnabled() {
        return this.getOutputSizes.lllIlIlIIl;
    }

    public final boolean isPinchToZoomAllowed() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final boolean isTapToFocusAllowed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected abstract boolean lIIIIIllll();

    protected abstract com.microblink.blinkid.view.recognition.llIIlIIlll llIIIlllll();

    protected void llIIlIIlll() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
    
        r1 = new java.lang.StringBuilder("Invalid metering area: ");
        r1.append(r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0174, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void lllIIIlIlI() {
        android.graphics.Rect rect;
        android.graphics.RectF rectF;
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI == null) {
            com.microblink.blinkid.util.Log.w(this, "CameraView is already disposed. Cannot set metering areas!", new java.lang.Object[0]);
            return;
        }
        android.graphics.RectF[] rectFArr = this.getOutputStallDurationlomOqCM;
        if (rectFArr == null) {
            ilIllllllI.llIIlIlIIl((android.graphics.Rect[]) null);
            return;
        }
        android.graphics.Rect[] rectArr = new android.graphics.Rect[rectFArr.length];
        int i = 0;
        while (true) {
            android.graphics.RectF[] rectFArr2 = this.getOutputStallDurationlomOqCM;
            if (i >= rectFArr2.length) {
                this.getHighSpeedVideoSizesFor.llIIlIlIIl(rectArr);
                return;
            }
            android.graphics.RectF rectF2 = rectFArr2[i];
            if (rectF2 == null) {
                throw new java.lang.NullPointerException("Metering area elements cannot be null!");
            }
            com.microblink.blinkid.util.Log.d(this, "Metering rect is for orientation {}!", this.getOutputSizeshNQ4ISI);
            int i2 = com.microblink.blinkid.secured.lllIlIlIIl.llIIlIlIIl[this.getOutputSizeshNQ4ISI.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    float height = rectF2.height();
                    float width = rectF2.width();
                    float f = rectF2.top;
                    float width2 = 1.0f - (rectF2.width() + rectF2.left);
                    rectF = new android.graphics.RectF(f, width2, height + f, width + width2);
                } else if (i2 == 4) {
                    float height2 = rectF2.height();
                    float width3 = rectF2.width();
                    float height3 = 1.0f - (rectF2.height() + rectF2.top);
                    float f2 = rectF2.left;
                    rectF = new android.graphics.RectF(height3, f2, height2 + height3, width3 + f2);
                }
                rectF2 = rectF;
            } else {
                float f3 = 1.0f - rectF2.right;
                float f4 = 1.0f - rectF2.bottom;
                rectF2 = new android.graphics.RectF(f3, f4, rectF2.width() + f3, rectF2.height() + f4);
            }
            com.microblink.blinkid.secured.IlIllllllI ilIllllllI2 = this.getHighSpeedVideoSizesFor;
            if (ilIllllllI2 != null) {
                com.microblink.blinkid.hardware.camera.CameraType lIlIIIIlIl = ilIllllllI2.lIlIIIIlIl();
                boolean llIIIlllll = this.getHighSpeedVideoSizesFor.llIIIlllll();
                if (lIlIIIIlIl != com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE) {
                    llIIIlllll = !llIIIlllll;
                }
                if (llIIIlllll) {
                    com.microblink.blinkid.util.Log.d(this, "Metering rect is sensor upside down!", new java.lang.Object[0]);
                    float f5 = 1.0f - rectF2.right;
                    float f6 = 1.0f - rectF2.bottom;
                    rectF2 = new android.graphics.RectF(f5, f6, rectF2.width() + f5, rectF2.height() + f6);
                    android.graphics.RectF rectF3 = this.getHighSpeedVideoFpsRangesFor;
                    float width4 = (rectF3.width() * rectF2.left) + rectF3.left;
                    android.graphics.RectF rectF4 = this.getHighSpeedVideoFpsRangesFor;
                    float height4 = (rectF4.height() * rectF2.top) + rectF4.top;
                    android.graphics.RectF rectF5 = new android.graphics.RectF(width4, height4, (this.getHighSpeedVideoFpsRangesFor.width() * rectF2.width()) + width4, (this.getHighSpeedVideoFpsRangesFor.height() * rectF2.height()) + height4);
                    int round = java.lang.Math.round(rectF5.left * 2000.0f) - 1000;
                    int round2 = java.lang.Math.round(rectF5.top * 2000.0f) - 1000;
                    rect = new android.graphics.Rect(round, round2, java.lang.Math.round(rectF5.width() * 2000.0f) + round, java.lang.Math.round(rectF5.height() * 2000.0f) + round2);
                    if (rect.left < -1000) {
                        rect.left = -1000;
                    }
                    if (rect.right > 1000) {
                        rect.right = 1000;
                    }
                    if (rect.top < -1000) {
                        rect.top = -1000;
                    }
                    if (rect.bottom > 1000) {
                        rect.bottom = 1000;
                    }
                    if (rect.isEmpty() || !rect.intersects(-1000, -1000, 1000, 1000)) {
                        break;
                    }
                    com.microblink.blinkid.util.Log.i(this, "Metering rect is {} (original rect was {})", rect, rectF5);
                    rectArr[i] = rect;
                    i++;
                }
            }
            com.microblink.blinkid.util.Log.d(this, "Metering rect is sensor normal!", new java.lang.Object[0]);
            android.graphics.RectF rectF32 = this.getHighSpeedVideoFpsRangesFor;
            float width42 = (rectF32.width() * rectF2.left) + rectF32.left;
            android.graphics.RectF rectF42 = this.getHighSpeedVideoFpsRangesFor;
            float height42 = (rectF42.height() * rectF2.top) + rectF42.top;
            android.graphics.RectF rectF52 = new android.graphics.RectF(width42, height42, (this.getHighSpeedVideoFpsRangesFor.width() * rectF2.width()) + width42, (this.getHighSpeedVideoFpsRangesFor.height() * rectF2.height()) + height42);
            int round3 = java.lang.Math.round(rectF52.left * 2000.0f) - 1000;
            int round22 = java.lang.Math.round(rectF52.top * 2000.0f) - 1000;
            rect = new android.graphics.Rect(round3, round22, java.lang.Math.round(rectF52.width() * 2000.0f) + round3, java.lang.Math.round(rectF52.height() * 2000.0f) + round22);
            if (rect.left < -1000) {
            }
            if (rect.right > 1000) {
            }
            if (rect.top < -1000) {
            }
            if (rect.bottom > 1000) {
            }
            if (rect.isEmpty()) {
                break;
            } else {
                break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r5v20, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5;
        int i6;
        int i7;
        int i8;
        com.microblink.blinkid.util.Log.d(this, "Camera preview ({} childs) layouting to: top: {} bottom: {}, left: {}, right: {} (changed: {}) ", java.lang.Integer.valueOf(getChildCount()), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i3), java.lang.Boolean.valueOf(z));
        if (getChildCount() == 0) {
            com.microblink.blinkid.util.Log.wtf(this, "Camera view has no children?!?", new java.lang.Object[0]);
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (i9 == 0 || i10 == 0) {
            com.microblink.blinkid.util.Log.wtf(this, "Layout size is 0x0?!?", new java.lang.Object[0]);
            return;
        }
        ?? r4 = this.IllIIIIllI;
        if (r4 == 0) {
            com.microblink.blinkid.util.Log.e(this, "Create not called. Cannot layout view!", new java.lang.Object[0]);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(r4.getView().getMeasuredWidth());
        int size2 = android.view.View.MeasureSpec.getSize(this.IllIIIIllI.getView().getMeasuredHeight());
        com.microblink.blinkid.util.Log.d(this, "Camera surface view size is {}x{}", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
        com.microblink.blinkid.util.Log.d(this, "Base camera view size: {}x{}", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10));
        int i11 = (i9 - size) / 2;
        int i12 = (i9 + size) / 2;
        int i13 = (i10 - size2) / 2;
        int i14 = (i10 + size2) / 2;
        if (this.lIIIIIllll == com.microblink.blinkid.view.CameraAspectMode.ASPECT_FIT) {
            com.microblink.blinkid.util.Log.d(this, "Layouting in ASPECT_FIT mode", new java.lang.Object[0]);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
            if (this.Camera2StreamConfigurationMap != null && !rectF.equals(this.getHighSpeedVideoFpsRangesFor)) {
                this.Camera2StreamConfigurationMap.onVisiblePartUpdated(rectF);
            }
            this.getHighSpeedVideoFpsRangesFor = rectF;
            i5 = i11;
            i7 = i12;
            i6 = i13;
            i8 = i14;
        } else {
            com.microblink.blinkid.util.Log.d(this, "Layouting in ASPECT_FILL mode", new java.lang.Object[0]);
            if (size <= 0 || size2 <= 0) {
                f = 1.0f;
                f2 = 1.0f;
                f3 = 0.0f;
                f4 = 0.0f;
            } else {
                float f5 = size;
                f = i9 / f5;
                float f6 = size2;
                f2 = i10 / f6;
                f4 = (-i11) / f5;
                f3 = (-i13) / f6;
            }
            if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(getContext())) {
                float f7 = f2;
                f2 = f;
                f = f7;
            } else {
                float f8 = f4;
                f4 = f3;
                f3 = f8;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            } else if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            } else if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            android.graphics.RectF rectF2 = new android.graphics.RectF(f3, f4, f + f3, (f2 <= 1.0f ? f2 < 0.0f ? 0.0f : f2 : 1.0f) + f4);
            if (this.Camera2StreamConfigurationMap != null && !rectF2.equals(this.getHighSpeedVideoFpsRangesFor)) {
                this.Camera2StreamConfigurationMap.onVisiblePartUpdated(rectF2);
            }
            this.getHighSpeedVideoFpsRangesFor = rectF2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Visible ROI: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
            com.microblink.blinkid.util.Log.d(this, sb.toString(), new java.lang.Object[0]);
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        this.isOutputSupportedForhNQ4ISI = i7 - i5;
        this.getOutputMinFrameDuration = i8 - i6;
        com.microblink.blinkid.util.Log.i(this, "Layouting camera surface view: Left: {}, Top: {}, Right: {}, Bottom: {}", java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i13), java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i14));
        this.IllIIIIllI.getView().layout(i11, i13, i12, i14);
        if (this.getValidOutputFormatsForInputhNQ4ISI != null) {
            if (this.getOutputSizeshNQ4ISI.isHorizontal()) {
                this.getValidOutputFormatsForInputhNQ4ISI.onSizeChanged(this.getOutputMinFrameDuration, this.isOutputSupportedForhNQ4ISI);
            } else {
                this.getValidOutputFormatsForInputhNQ4ISI.onSizeChanged(this.isOutputSupportedForhNQ4ISI, this.getOutputMinFrameDuration);
            }
        }
        for (int i15 = 1; i15 < getChildCount(); i15++) {
            android.view.View childAt = getChildAt(i15);
            com.microblink.blinkid.util.Log.i(this, "Layouting child {}: Left: {}, Top: {}, Right: {}, Bottom: {}", java.lang.Integer.valueOf(i15), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8));
            childAt.layout(i5, i6, i7, i8);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int resolveSize = android.view.View.resolveSize(getSuggestedMinimumWidth(), i);
        int resolveSize2 = android.view.View.resolveSize(getSuggestedMinimumHeight(), i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt != null) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(resolveSize, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(resolveSize2, 1073741824));
            }
        }
        com.microblink.blinkid.util.Log.d(this, "Measured dimension: {}x{}", java.lang.Integer.valueOf(resolveSize), java.lang.Integer.valueOf(resolveSize2));
        setMeasuredDimension(resolveSize, resolveSize2);
    }

    public void pause() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot pause view that has not been resumed. Please make sure that your view has been resumed with resume() method. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("Pause must be called from UI thread!");
        }
        com.microblink.blinkid.util.Log.i(this, "Camera view pause. Context = {}", getContext());
        com.microblink.blinkid.secured.lIlIlIIIII lililiiiii = this.getOutputStallDuration;
        if (lililiiiii != null) {
            lililiiiii.disable();
        }
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            ilIllllllI.lllIIIlIlI();
            this.getInputSizeshNQ4ISI = false;
        }
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED;
    }

    public void removeOrientationChangeListener(com.microblink.blinkid.hardware.orientation.OrientationChangeListener orientationChangeListener) {
        this.llIIlIIIll.remove(orientationChangeListener);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    public void resume() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot resume view that has not been started. Please call start() first. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("Resume must be called from UI thread!");
        }
        com.microblink.blinkid.util.Log.i(this, "Camera view resume. Context = {}", getContext());
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED;
        if (getContext().checkSelfPermission("android.permission.CAMERA") != 0) {
            this.llIIlIlIIl.onCameraPermissionDenied();
            return;
        }
        if (this.IlIllIlIIl) {
            return;
        }
        com.microblink.blinkid.secured.lIlIlIIIII lililiiiii = this.getOutputStallDuration;
        if (lililiiiii != null) {
            lililiiiii.enable();
        }
        android.content.Context context = getContext();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.microblink.blinkid.util.Log.e(this, "Will not open camera because activity is already finishing.", new java.lang.Object[0]);
            return;
        }
        if (IlIllIlllI()) {
            this.IllIIIIllI.setRotation(getHighResolutionOutputSizeshNQ4ISI());
            this.getOutputSizes.lIlIIIIlIl = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizesFor.llIIlIlIIl(getContext(), this.getOutputSizes, new com.microblink.blinkid.view.IllIIIIllI(this));
            return;
        }
        this.getInputSizeshNQ4ISI = false;
        this.IlIllIlIIl = true;
        com.microblink.blinkid.view.CameraEventsListener cameraEventsListener = this.llIIlIlIIl;
        if (cameraEventsListener != null) {
            cameraEventsListener.onError(new java.lang.Exception("Initialization failed!"));
        }
    }

    public void setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setAspectMode must be called before calling create()");
        }
        this.lIIIIIllll = cameraAspectMode;
        if (cameraAspectMode == null) {
            this.lIIIIIllll = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL;
        }
    }

    public void setCameraEventsListener(com.microblink.blinkid.view.CameraEventsListener cameraEventsListener) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setCameraEventsListener must be called before calling create()");
        }
        this.llIIlIlIIl = cameraEventsListener;
    }

    public final void setCameraFrameFactory(com.microblink.blinkid.secured.IIllIIllll iIllIIllll) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        this.getOutputSizes.lIIIIIllll = iIllIIllll;
    }

    public void setCameraType(com.microblink.blinkid.hardware.camera.CameraType cameraType) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setCameraType must be called before calling create()");
        }
        if (cameraType != null) {
            this.getOutputSizes.IllIIIIllI = cameraType;
        }
    }

    public final void setForceUseLegacyCamera(boolean z) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        this.getOutputSizes.llIIlIIlll = z;
    }

    public void setHighResFrameCaptureEnabled(boolean z) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        this.getOutputSizes.lllIlIlIIl = z;
    }

    public final void setHighResFrameLimit(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("High res frame limit has to be at least 1");
        }
        this.getOutputSizes.IlIllIlllI = i;
    }

    public void setInitialOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setInitialOrientation must be called before calling create()");
        }
        if (orientation != null) {
            this.IlIlllllII = orientation;
        }
    }

    public final void setMeteringAreas(android.graphics.RectF[] rectFArr, boolean z) {
        this.getOutputStallDurationlomOqCM = rectFArr;
        this.lIIIIIlIlI = z;
        lllIIIlIlI();
    }

    public final void setOnActivityFlipListener(com.microblink.blinkid.view.OnActivityFlipListener onActivityFlipListener) {
        this.llIIlIIlll = onActivityFlipListener;
    }

    public final void setOnSizeChangedListener(com.microblink.blinkid.view.OnSizeChangedListener onSizeChangedListener) {
        this.getValidOutputFormatsForInputhNQ4ISI = onSizeChangedListener;
    }

    public final void setOptimizeCameraForNearScan(boolean z) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        this.getOutputSizes.IlIllIlIIl = z;
    }

    public void setOrientationAllowedListener(com.microblink.blinkid.view.OrientationAllowedListener orientationAllowedListener) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setOrientationAllowedListener must be called before calling create()");
        }
        this.getOutputFormats = orientationAllowedListener;
    }

    public final void setPinchToZoomAllowed(boolean z) {
        this.getOutputMinFrameDurationlomOqCM = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    public void setPreviewZoomScale(float f) {
        this.lllIIIlIlI = f;
        ?? r0 = this.IllIIIIllI;
        if (r0 != 0) {
            r0.setPreviewZoomScale(f);
        }
    }

    public final void setRequestAutofocusOnShakingStopInContinousAutofocusMode(boolean z) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        this.getOutputSizes.lllIIIlIlI = z;
    }

    public final void setRequestedSurfaceViewForCameraDisplay(com.microblink.blinkid.view.surface.CameraSurface cameraSurface) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        this.getOutputSizes.IIlIIIllIl = cameraSurface;
    }

    public void setShakeListener(com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback) {
        this.toString = shakeCallback;
    }

    public final void setTapToFocusAllowed(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public final void setTorchState(boolean z, com.microblink.blinkid.hardware.SuccessCallback successCallback) {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            ilIllllllI.llIIlIlIIl(z, successCallback);
        } else {
            successCallback.onOperationDone(false);
        }
    }

    public final void setVideoResolutionPreset(com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("This method can only be called before calling create().");
        }
        com.microblink.blinkid.secured.lIIlllIIlI liillliili = this.getOutputSizes;
        if (videoResolutionPreset != null) {
            liillliili.llIIlIlIIl = videoResolutionPreset;
        } else {
            liillliili.llIIlIlIIl = com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT;
        }
    }

    public void setVisiblePartUpdateListener(com.microblink.blinkid.view.BaseCameraView.VisiblePartUpdateListener visiblePartUpdateListener) {
        this.Camera2StreamConfigurationMap = visiblePartUpdateListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setZoomLevel(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        this.getHighSpeedVideoSizes = f;
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            ilIllllllI.llIIlIlIIl(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    public void start() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot start view that has not been created. Please call create() first. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("Start must be called from UI thread!");
        }
        com.microblink.blinkid.util.Log.i(this, "Camera view start. Context = {}", getContext());
        this.IlIllIlIIl = false;
        this.IllIIIIllI.installCallback(this.getHighSpeedVideoSizesFor);
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    public void stop() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot stop view that has not been paused. Please call pause() method first. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new com.microblink.blinkid.view.exception.CalledFromWrongThreadException("Stop must be called from UI thread!");
        }
        com.microblink.blinkid.util.Log.i(this, "Camera view stop. Context = {}", getContext());
        this.IllIIIIllI.removeCallback();
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED;
    }

    protected final int IlIllIlIIl() {
        int rotation = (isInEditMode() ? (android.view.WindowManager) getContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME) : (android.view.WindowManager) getHostActivity().getApplicationContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay().getRotation();
        if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(getContext())) {
            com.microblink.blinkid.util.Log.d(this, "Activity is in portrait", new java.lang.Object[0]);
            if (rotation == 0) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 0", new java.lang.Object[0]);
                return 1;
            }
            if (rotation == 2) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 180", new java.lang.Object[0]);
                return 9;
            }
            if (rotation == 3) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 270", new java.lang.Object[0]);
                this.getHighSpeedVideoFpsRanges = true;
                return 1;
            }
            com.microblink.blinkid.util.Log.d(this, "Screen orientation is 90", new java.lang.Object[0]);
            this.getHighSpeedVideoFpsRanges = true;
            return 9;
        }
        com.microblink.blinkid.util.Log.d(this, "Activity is in landscape", new java.lang.Object[0]);
        if (rotation == 1) {
            com.microblink.blinkid.util.Log.d(this, "Screen orientation is 90", new java.lang.Object[0]);
            return 0;
        }
        if (rotation == 3) {
            com.microblink.blinkid.util.Log.d(this, "Screen orientation is 270", new java.lang.Object[0]);
            return 8;
        }
        if (rotation == 0) {
            com.microblink.blinkid.util.Log.d(this, "Screen orientation is 0", new java.lang.Object[0]);
            this.getHighSpeedVideoFpsRanges = true;
            return 0;
        }
        com.microblink.blinkid.util.Log.d(this, "Screen orientation is 180", new java.lang.Object[0]);
        this.getHighSpeedVideoFpsRanges = true;
        return 8;
    }

    protected com.microblink.blinkid.hardware.orientation.OrientationChangeListener IllIIIIllI() {
        return new com.microblink.blinkid.view.BaseCameraView.BaseOrientationChangeListener();
    }

    public final void IllIIIllII() {
        if (!this.getOutputSizes.lllIlIlIIl) {
            throw new java.lang.IllegalStateException("High res frame capture is not enabled!");
        }
        this.getHighSpeedVideoSizesFor.IIlIIIllIl();
    }

    protected final boolean lIlIIIIlIl() {
        if (this.IlIllIlllI) {
            return true;
        }
        if (this.lllIlIlIIl || getHostActivity().isInMultiWindowMode()) {
            try {
                return android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation") == 1;
            } catch (android.provider.Settings.SettingNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context) {
        this.lIlIIIIlIl = context.getResources().getConfiguration().orientation;
        int IlIllIlIIl = IlIllIlIIl();
        this.IIlIIIllIl = IlIllIlIIl;
        this.IlIlllllII = com.microblink.blinkid.hardware.orientation.Orientation.fromActivityInfoCode(IlIllIlIIl);
        if (!isInEditMode()) {
            com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII();
            this.IllIIIllII = IllIIIllII;
            int i = this.IIlIIIllIl;
            com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.llIIllIlII.class, "Initializing default orientation to: {}", java.lang.Integer.valueOf(i));
            com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl2 = IllIIIllII.IlIllIlIIl();
            if (IlIllIlIIl2 == null || !IllIIIllII.llIIlIlIIl(IlIllIlIIl2.IIlIIIllIl)) {
                com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl = i;
                com.microblink.blinkid.secured.llIIllIlII.IlIllIlIIl = true;
            } else {
                com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.llIIllIlII.class, "Display orientation is blacklisted!", new java.lang.Object[0]);
                com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl = 0;
                com.microblink.blinkid.secured.llIIllIlII.IlIllIlIIl = false;
            }
            com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.llIIllIlII.class, "Default orientation initialized to: {}", java.lang.Integer.valueOf(com.microblink.blinkid.secured.llIIllIlII.llIIlIlIIl));
            if (!com.microblink.blinkid.secured.llIIllIlII.IlIllIlIIl && this.IIlIIIllIl != 0) {
                throw new com.microblink.blinkid.view.exception.NonLandscapeOrientationNotSupportedException("This device does not support having camera on non-landscape oriented activity. Please set activity orientation to landscape!");
            }
            android.app.Activity hostActivity = getHostActivity();
            int requestedOrientation = hostActivity.getRequestedOrientation();
            this.IlIllIlllI = requestedOrientation == 10 || requestedOrientation == 4 || requestedOrientation == 6 || requestedOrientation == 7;
            int requestedOrientation2 = hostActivity.getRequestedOrientation();
            this.lllIlIlIIl = requestedOrientation2 == 2 || requestedOrientation2 == 12 || requestedOrientation2 == 11 || requestedOrientation2 == 13 || requestedOrientation2 == -1;
            return;
        }
        com.microblink.blinkid.view.surface.llIIlIIlll lliiliilll = new com.microblink.blinkid.view.surface.llIIlIIlll(getContext(), this.lIIIIIllll);
        this.IllIIIIllI = lliiliilll;
        addView(lliiliilll.getView(), 0);
    }

    public final void llIIlIlIIl(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
            runnable.run();
        } else {
            this.getInputFormats.post(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    protected void llIIlIlIIl(android.content.res.Configuration configuration) {
        this.IllIIIIllI.setRotation(getHighResolutionOutputSizeshNQ4ISI());
        this.IllIIIIllI.setHostActivityOrientation(this.IIlIIIllIl);
        this.IllIIIIllI.getView().dispatchConfigurationChanged(configuration);
    }

    public void llIIlIlIIl(com.microblink.blinkid.secured.lIIlllIIlI liillliili) {
        liillliili.IllIIIllII = lIIIIIllll();
    }

    public final boolean llIIlIlIIl() {
        com.microblink.blinkid.secured.IlIllllllI ilIllllllI = this.getHighSpeedVideoSizesFor;
        if (ilIllllllI != null) {
            return ilIllllllI.llIIIlllll();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    static android.graphics.Rect[] getHighSpeedVideoSizes(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, android.graphics.Rect[] rectArr) {
        if (rectArr == null || recognizerRunnerView.IllIIIIllI == null) {
            return null;
        }
        android.graphics.Rect[] rectArr2 = new android.graphics.Rect[rectArr.length];
        for (int i = 0; i < rectArr.length; i++) {
            android.graphics.Rect rect = rectArr[i];
            android.graphics.RectF rectF = new android.graphics.RectF((rect.left + 1000) / 2000.0f, (rect.top + 1000) / 2000.0f, (rect.right + 1000) / 2000.0f, (rect.bottom + 1000) / 2000.0f);
            com.microblink.blinkid.secured.IlIllllllI ilIllllllI = ((com.microblink.blinkid.view.BaseCameraView) recognizerRunnerView).getHighSpeedVideoSizesFor;
            if (ilIllllllI != null) {
                com.microblink.blinkid.hardware.camera.CameraType lIlIIIIlIl = ilIllllllI.lIlIIIIlIl();
                boolean llIIIlllll = ((com.microblink.blinkid.view.BaseCameraView) recognizerRunnerView).getHighSpeedVideoSizesFor.llIIIlllll();
                if (lIlIIIIlIl != com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE) {
                    llIIIlllll = !llIIIlllll;
                }
                if (llIIIlllll) {
                    float f = 1.0f - rectF.right;
                    float f2 = 1.0f - rectF.bottom;
                    rectF = new android.graphics.RectF(f, f2, rectF.width() + f, rectF.height() + f2);
                }
            }
            rectArr2[i] = recognizerRunnerView.IllIIIIllI.convertRectangleToActualRect(rectF);
        }
        return rectArr2;
    }

    public final boolean llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        com.microblink.blinkid.view.OrientationAllowedListener orientationAllowedListener = this.getOutputFormats;
        if (orientationAllowedListener != null) {
            return orientationAllowedListener.isOrientationAllowed(orientation);
        }
        return orientation == com.microblink.blinkid.hardware.orientation.Orientation.fromActivityInfoCode(this.IIlIIIllIl);
    }

    public BaseCameraView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IlIllIlIIl = false;
        this.IllIIIllII = null;
        this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED;
        this.IIlIIIllIl = 1;
        this.lIIIIIllll = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL;
        this.lllIIIlIlI = 1.0f;
        this.IlIllIlllI = false;
        this.lllIlIlIIl = false;
        this.lIIIIIlIlI = false;
        this.llIIlIIIll = new java.util.concurrent.ConcurrentLinkedQueue();
        this.getOutputStallDuration = null;
        this.getOutputSizes = new com.microblink.blinkid.secured.lIIlllIIlI();
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputMinFrameDuration = 0;
        this.getInputSizeshNQ4ISI = false;
        this.getInputFormats = new android.os.Handler();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 0.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN;
        this.getHighSpeedVideoFpsRanges = false;
        getHighSpeedVideoFpsRanges(context);
    }
}
