package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class DyScanView extends android.widget.LinearLayout implements com.dyneti.android.dyscan.f, android.view.View.OnTouchListener {
    public static final int EXIT_REASON_AUTH_FAILURE = 2;
    public static final int EXIT_REASON_CAMERA_ERROR = 4;
    public static final int EXIT_REASON_CANCELLED = 1;
    public static final int EXIT_REASON_PERMISSIONS_NOT_GRANTED = 3;
    public static final int EXIT_REASON_SCAN_LOG_ERROR = 5;
    public float A;
    public com.dyneti.android.dyscan.d1 A0;
    public java.lang.String B;
    public volatile android.graphics.Bitmap B0;
    public java.lang.String C;
    public final android.os.Handler C0;
    public android.widget.TextView D;
    public final android.widget.TextView E;
    public boolean F;
    public boolean G;
    public int H;
    public float I;
    public java.lang.String J;
    public java.lang.String K;
    public float L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: a, reason: collision with root package name */
    public com.dyneti.android.dyscan.a0 f3284a;
    public com.dyneti.android.dyscan.DyScanView.DyScanResultListener a0;
    public boolean b;
    public boolean b0;
    public final androidx.camera.view.PreviewView c;
    public java.lang.String c0;
    public int d;
    public boolean d0;
    public int e;
    public java.lang.String e0;
    public int f;
    public boolean f0;
    public final com.dyneti.android.dyscan.t g;
    public boolean g0;
    public boolean h;
    public boolean h0;
    public final java.lang.Object i;
    public boolean i0;
    public final com.dyneti.android.dyscan.h2 j;
    public java.lang.String j0;
    public int k;
    public boolean k0;
    public final long l;
    public java.lang.String l0;
    public boolean m;
    public boolean m0;
    public final com.dyneti.android.dyscan.l2 n;
    public java.lang.String n0;

    /* renamed from: o, reason: collision with root package name */
    public final com.dyneti.android.dyscan.CornerView f3285o;
    public java.lang.String o0;
    public final com.dyneti.android.dyscan.BGView p;
    public boolean p0;
    public final com.dyneti.android.dyscan.FocusRingView q;
    public java.lang.Boolean q0;
    public boolean r;
    public java.lang.Boolean r0;
    public final com.dyneti.android.dyscan.OverlayView s;
    public java.lang.Boolean s0;
    public final com.dyneti.android.dyscan.OverlayView t;
    public java.lang.Boolean t0;
    public final android.widget.ImageView u;
    public com.dyneti.android.dyscan.m2 u0;
    public final java.lang.String v;
    public com.dyneti.android.dyscan.h v0;
    public boolean w;
    public final com.dyneti.android.dyscan.t1 w0;
    public boolean x;
    public boolean x0;
    public java.lang.String y;
    public final com.dyneti.android.dyscan.i1 y0;
    public int z;
    public com.dyneti.android.dyscan.h1 z0;

    public interface DyScanResultListener {
        void onFailure(int i);

        default void onProgressUpdate(com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate) {
        }

        void onSuccess(com.dyneti.android.dyscan.CreditCard creditCard);
    }

    public DyScanView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.h = false;
        this.i = new java.lang.Object();
        this.k = 0;
        this.m = true;
        this.r = false;
        this.v = java.util.Locale.getDefault().getLanguage();
        this.w = false;
        this.x = true;
        this.y = "";
        this.z = -1;
        this.A = 18.0f;
        this.B = null;
        this.C = com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;
        this.F = true;
        this.G = true;
        int i = com.dyneti.android.dyscan.j0.f3313a;
        this.H = i;
        this.I = 0.4f;
        this.J = "4242 4242 4242 4242";
        this.K = "11/11";
        this.L = 15.0f;
        this.M = true;
        int i2 = com.dyneti.android.dyscan.j0.b;
        this.N = i2;
        int i3 = com.dyneti.android.dyscan.j0.c;
        this.O = i3;
        int i4 = com.dyneti.android.dyscan.j0.d;
        this.P = i4;
        this.Q = -7829368;
        this.R = 115;
        com.dyneti.android.dyscan.g0 g0Var = com.dyneti.android.dyscan.DyScan.b;
        this.S = false;
        this.T = 1000;
        com.dyneti.android.dyscan.g0 g0Var2 = com.dyneti.android.dyscan.DyScan.b;
        this.U = false;
        this.V = false;
        this.W = false;
        this.b0 = false;
        this.c0 = "Enter your card number manually";
        this.d0 = true;
        this.e0 = "Align your card to this frame";
        this.f0 = false;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.k0 = false;
        this.p0 = false;
        this.q0 = null;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.r0 = bool;
        this.s0 = bool;
        this.t0 = bool;
        this.x0 = false;
        this.C0 = new android.os.Handler(android.os.Looper.myLooper());
        this.y0 = new com.dyneti.android.dyscan.i1(getContext());
        this.l = android.os.SystemClock.elapsedRealtime();
        com.dyneti.android.dyscan.t1 a2 = com.dyneti.android.dyscan.t1.a();
        this.w0 = a2;
        a2.f3341a = android.os.SystemClock.elapsedRealtime();
        a2.h = null;
        a2.g = null;
        setOrientation(0);
        setGravity(16);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.dyneti.android.dyscan.R.layout.dyscan_view_dyscan, (android.view.ViewGroup) this, true);
        androidx.camera.view.PreviewView previewView = (androidx.camera.view.PreviewView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_view_finder);
        this.c = previewView;
        previewView.setImplementationMode(androidx.camera.view.PreviewView.ImplementationMode.COMPATIBLE);
        com.dyneti.android.dyscan.l2 l2Var = new com.dyneti.android.dyscan.l2(this);
        this.n = l2Var;
        this.g = new com.dyneti.android.dyscan.t(a2, l2Var, this);
        this.j = new com.dyneti.android.dyscan.h2(getContext());
        com.dyneti.android.dyscan.OverlayView overlayView = (com.dyneti.android.dyscan.OverlayView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_ResultOverlayView);
        this.s = overlayView;
        overlayView.setVisibility(4);
        overlayView.getHighSpeedVideoFpsRangesFor = l2Var;
        com.dyneti.android.dyscan.OverlayView overlayView2 = (com.dyneti.android.dyscan.OverlayView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_HintOverlayView);
        this.t = overlayView2;
        overlayView2.setVisibility(4);
        overlayView2.getHighSpeedVideoFpsRangesFor = l2Var;
        com.dyneti.android.dyscan.CornerView cornerView = (com.dyneti.android.dyscan.CornerView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_CornerView);
        this.f3285o = cornerView;
        cornerView.setVisibility(4);
        cornerView.getOutputMinFrameDurationlomOqCM = l2Var;
        com.dyneti.android.dyscan.BGView bGView = (com.dyneti.android.dyscan.BGView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_BackgroundView);
        this.p = bGView;
        bGView.setVisibility(4);
        bGView.getInputSizeshNQ4ISI = l2Var;
        bGView.setOnTouchListener(this);
        this.q = (com.dyneti.android.dyscan.FocusRingView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_focusRing);
        this.u = (android.widget.ImageView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_dynetiLogo);
        this.D = (android.widget.TextView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_HelperTextView);
        this.E = (android.widget.TextView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_OverlayTextView);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.dyneti.android.dyscan.R.styleable.DyScanView, 0, 0);
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_isChallenge)) {
            setIsChallenge(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_isChallenge, false));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_vibrateOnCompletion)) {
            setVibrateOnCompletion(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_vibrateOnCompletion, true));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerThickness)) {
            setCornerThickness(obtainStyledAttributes.getFloat(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerThickness, 15.0f));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_showCorners)) {
            setShowCorners(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_showCorners, true));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_roundCorners)) {
            setRoundCorners(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_roundCorners, true));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_expandCorners)) {
            setExpandCorners(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_expandCorners, false));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_chopCorners)) {
            setChopCorners(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_chopCorners, false));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerInactiveColor)) {
            setCornerInactiveColor(obtainStyledAttributes.getColor(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerInactiveColor, i2));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerActiveColor)) {
            setCornerActiveColor(obtainStyledAttributes.getColor(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerActiveColor, i3));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerCompletedColor)) {
            setCornerCompletedColor(obtainStyledAttributes.getColor(com.dyneti.android.dyscan.R.styleable.DyScanView_cornerCompletedColor, i4));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_bgColor)) {
            setBgColor(obtainStyledAttributes.getColor(com.dyneti.android.dyscan.R.styleable.DyScanView_bgColor, -7829368));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_bgOpacity)) {
            setBgOpacity(obtainStyledAttributes.getInt(com.dyneti.android.dyscan.R.styleable.DyScanView_bgOpacity, 115));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_lightTorchWhenDark)) {
            setLightTorchWhenDark(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_lightTorchWhenDark, false));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_showResultOverlay)) {
            int i5 = com.dyneti.android.dyscan.R.styleable.DyScanView_showResultOverlay;
            com.dyneti.android.dyscan.g0 g0Var3 = com.dyneti.android.dyscan.DyScan.b;
            setShowResultOverlay(obtainStyledAttributes.getBoolean(i5, false));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_resultOverlayAnimationMs)) {
            setResultOverlayAnimationTimeMs(obtainStyledAttributes.getInteger(com.dyneti.android.dyscan.R.styleable.DyScanView_resultOverlayAnimationMs, 1000));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_resultOverlayAlwaysHorizontal)) {
            int i6 = com.dyneti.android.dyscan.R.styleable.DyScanView_resultOverlayAlwaysHorizontal;
            com.dyneti.android.dyscan.g0 g0Var4 = com.dyneti.android.dyscan.DyScan.b;
            setResultOverlayAlwaysHorizontal(obtainStyledAttributes.getBoolean(i6, false));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_showDynetiLogo)) {
            setShowDynetiLogo(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_showDynetiLogo, true));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cardFrameContentDescription)) {
            setCardFrameContentDescription(obtainStyledAttributes.getString(com.dyneti.android.dyscan.R.styleable.DyScanView_cardFrameContentDescription));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_showCardOverlay)) {
            setShowCardOverlay(obtainStyledAttributes.getBoolean(com.dyneti.android.dyscan.R.styleable.DyScanView_showCardOverlay, true));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayColor)) {
            setCardOverlayColor(obtainStyledAttributes.getColor(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayColor, i));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayOpacity)) {
            setCardOverlayOpacity(obtainStyledAttributes.getFloat(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayOpacity, 0.4f));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayNumber)) {
            setCardOverlayNumber(obtainStyledAttributes.getString(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayNumber));
        }
        if (obtainStyledAttributes.hasValue(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayDate)) {
            setCardOverlayDate(obtainStyledAttributes.getString(com.dyneti.android.dyscan.R.styleable.DyScanView_cardOverlayDate));
        }
        obtainStyledAttributes.recycle();
        java.lang.String str = com.dyneti.android.dyscan.DyScan.f3281a;
        this.j0 = android.text.TextUtils.isEmpty(str) ? util.h.xy.cb.b.f1091 : str;
        new com.dyneti.android.dyscan.e(this, "GET", null, null, null).execute(new com.dyneti.android.dyscan.d[0]);
        d();
        previewView.post(new com.dyneti.android.dyscan.z0(this));
    }

    public final /* synthetic */ void a(com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate) {
        this.a0.onProgressUpdate(dyScanProgressUpdate);
    }

    public final void b() {
        if (this.e == this.c.getHeight() && this.f == this.E.getHeight()) {
            return;
        }
        this.e = this.c.getHeight();
        this.f = this.E.getHeight();
        this.u.setTranslationY(this.n.b());
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setTranslationY(this.n.a());
        }
        android.widget.TextView textView2 = this.E;
        com.dyneti.android.dyscan.l2 l2Var = this.n;
        textView2.setTranslationY((l2Var.f() - l2Var.c) - this.E.getHeight());
        com.dyneti.android.dyscan.BGView bGView = this.p;
        bGView.getHighResolutionOutputSizeshNQ4ISI = this.Q;
        bGView.getInputFormats = this.R;
        bGView.postInvalidate();
        if (this.G) {
            this.t.setVisibility(0);
            com.dyneti.android.dyscan.OverlayView overlayView = this.t;
            com.dyneti.android.dyscan.x xVar = new com.dyneti.android.dyscan.x(this.J);
            com.dyneti.android.dyscan.o0 o0Var = new com.dyneti.android.dyscan.o0(this.K);
            overlayView.getHighResolutionOutputSizeshNQ4ISI = xVar;
            overlayView.Camera2StreamConfigurationMap = o0Var;
            overlayView.postInvalidate();
            this.t.setAlpha(this.I);
            this.t.getHighSpeedVideoFpsRanges.setColor(this.H);
        }
        if (this.M) {
            this.f3285o.getHighSpeedVideoSizes.setStrokeWidth(this.L);
            com.dyneti.android.dyscan.CornerView cornerView = this.f3285o;
            cornerView.getOutputFormats = this.P;
            cornerView.getInputFormats = this.O;
            cornerView.getHighSpeedVideoSizesFor = this.N;
            cornerView.setContentDescription(this.e0);
            this.f3285o.postInvalidate();
        }
        getActivity().runOnUiThread(new com.dyneti.android.dyscan.c1(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r7.o0.equals(r0) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(com.dyneti.android.dyscan.c2 c2Var) {
        android.app.Activity activity;
        boolean equals;
        boolean z = true;
        if (!this.b && this.t0.booleanValue() && android.os.SystemClock.elapsedRealtime() - this.l > 5000) {
            this.b = true;
            android.app.Activity activity2 = getActivity();
            final com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate = new com.dyneti.android.dyscan.DyScanProgressUpdate("", "", false, true);
            if (activity2 != null) {
                activity2.runOnUiThread(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.dyneti.android.dyscan.DyScanView.this.a(dyScanProgressUpdate);
                    }
                });
            }
        }
        com.dyneti.android.dyscan.y yVar = c2Var.b;
        if (yVar == null) {
            return;
        }
        java.lang.String lastFour = com.dyneti.android.dyscan.DyScanProgressUpdate.lastFour(yVar.b);
        java.lang.String name2 = com.dyneti.android.dyscan.DyScanProgressUpdate.network(c2Var.b.f3352a).name();
        if (lastFour.isEmpty() || name2.isEmpty()) {
            return;
        }
        java.lang.String a2 = c2Var.b.a();
        if (this.m0) {
            java.lang.String str = this.n0;
            if (str == null || this.o0 == null) {
                if (str != null) {
                    equals = str.equals(a2);
                } else {
                    java.lang.String str2 = this.o0;
                    if (str2 != null) {
                        equals = str2.equals(lastFour);
                    }
                }
                z = true ^ equals;
            } else if (str.equals(a2)) {
            }
            final com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate2 = new com.dyneti.android.dyscan.DyScanProgressUpdate(lastFour, name2, z, false);
            activity = getActivity();
            if (activity == null) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.dyneti.android.dyscan.DyScanView.this.b(dyScanProgressUpdate2);
                    }
                });
                return;
            }
            return;
        }
        z = false;
        final com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate22 = new com.dyneti.android.dyscan.DyScanProgressUpdate(lastFour, name2, z, false);
        activity = getActivity();
        if (activity == null) {
        }
    }

    public final void d() {
        java.lang.String str;
        if (this.g0 && this.h0 && this.j0 != null) {
            if (com.dyneti.android.dyscan.DyScan.isFraudVersion()) {
                this.A0 = new com.dyneti.android.dyscan.d1();
            }
            if (this.s0.booleanValue()) {
                com.dyneti.android.dyscan.i1 i1Var = this.y0;
                com.dyneti.android.dyscan.h1 h1Var = new com.dyneti.android.dyscan.h1();
                java.lang.String d = i1Var.d();
                if (d == null || !h1Var.b(d)) {
                    java.lang.String a2 = i1Var.a();
                    if (a2 == null || !h1Var.b(a2)) {
                        try {
                            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(i1Var.f3311a.getResources().openRawResource(com.dyneti.android.dyscan.R.raw.default_gift_card_config)));
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            while (true) {
                                java.lang.String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    sb.append(readLine);
                                }
                            }
                            bufferedReader.close();
                            str = sb.toString();
                        } catch (java.io.IOException unused) {
                            str = null;
                        }
                        if (str != null) {
                            h1Var.b(str);
                        }
                    } else {
                        i1Var.c(a2);
                    }
                }
                this.z0 = h1Var;
            }
            try {
                android.content.Context context = getContext();
                com.dyneti.android.dyscan.l2 l2Var = this.n;
                com.dyneti.android.dyscan.t1 t1Var = this.w0;
                boolean z = this.m0;
                java.lang.String str2 = this.n0;
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = this.o0;
                this.f3284a = new com.dyneti.android.dyscan.a0(context, l2Var, t1Var, z, str3, str4 == null ? "" : str4);
            } catch (java.io.IOException e) {
                a(e.getMessage());
            }
            a();
        }
    }

    public final android.app.Activity getActivity() {
        for (android.content.Context context = getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public final float getCaptureAspectRatio() {
        if (this.B0 != null) {
            return this.B0.getWidth() / this.B0.getHeight();
        }
        return 1.777f;
    }

    public final boolean isTorchEnabled() {
        com.dyneti.android.dyscan.t tVar = this.g;
        if (tVar != null) {
            return tVar.c();
        }
        return false;
    }

    public final boolean isVertical() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        this.w0.f3342o.a();
        this.g0 = true;
        super.onAttachedToWindow();
        d();
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) getActivity().getSystemService("sensor");
        com.dyneti.android.dyscan.m2 m2Var = new com.dyneti.android.dyscan.m2(sensorManager);
        this.u0 = m2Var;
        m2Var.b();
        com.dyneti.android.dyscan.h hVar = new com.dyneti.android.dyscan.h(sensorManager);
        this.v0 = hVar;
        hVar.a();
    }

    public final void onDestroy() {
        org.tensorflow.lite.Interpreter interpreter;
        org.tensorflow.lite.Interpreter interpreter2;
        this.w0.s.a();
        synchronized (this.i) {
            com.dyneti.android.dyscan.a0.f = false;
        }
        com.dyneti.android.dyscan.a0 a0Var = this.f3284a;
        if (a0Var != null) {
            com.dyneti.android.dyscan.x1 x1Var = a0Var.b;
            if (x1Var != null && (interpreter2 = x1Var.e) != null) {
                interpreter2.close();
                x1Var.e = null;
                x1Var.d = null;
            }
            com.dyneti.android.dyscan.k1 k1Var = a0Var.f3288a;
            if (k1Var != null && (interpreter = k1Var.e) != null) {
                interpreter.close();
                k1Var.e = null;
                k1Var.d = null;
            }
        }
        com.dyneti.android.dyscan.t tVar = this.g;
        if (tVar != null) {
            tVar.d.shutdown();
        }
        if (!this.i0) {
            if (this.h0) {
                a("user quit");
            } else {
                a("never got permissions");
            }
        }
        com.dyneti.android.dyscan.m2 m2Var = this.u0;
        if (m2Var != null) {
            m2Var.c();
        }
        com.dyneti.android.dyscan.h hVar = this.v0;
        if (hVar != null) {
            hVar.b();
        }
        com.dyneti.android.dyscan.d1 d1Var = this.A0;
        if (d1Var != null) {
            d1Var.f3297a.close(1000, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.w0.p.a();
        super.onDetachedFromWindow();
        if (this.i0) {
            return;
        }
        if (this.h0) {
            a("user quit");
        } else {
            a("never got permissions");
        }
    }

    public final void onPause() {
        androidx.camera.core.ImageAnalysis imageAnalysis;
        this.w0.r.a();
        com.dyneti.android.dyscan.t tVar = this.g;
        if (tVar == null || (imageAnalysis = tVar.f) == null) {
            return;
        }
        imageAnalysis.clearAnalyzer();
    }

    public final void onPermissionsGranted() {
        com.dyneti.android.dyscan.t1 t1Var = this.w0;
        if (t1Var.j == null) {
            t1Var.j = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - t1Var.f3341a);
        }
        this.h0 = true;
        d();
    }

    public final void onResume() {
        this.w0.q.a();
        if (!this.h0 || this.g == null) {
            return;
        }
        a();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        com.dyneti.android.dyscan.t tVar = this.g;
        if (tVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "");
            tVar.f3322a = true;
            com.dyneti.android.dyscan.t.m = true;
            com.dyneti.android.dyscan.t.n++;
            tVar.a(tVar.e.getWidth() * 0.5f, tVar.e.getHeight() * 0.5f);
        }
        return true;
    }

    public final void setAwaitScanStorage(java.lang.Boolean bool) {
        this.r0 = bool;
    }

    public final void setBgColor(int i) {
        this.Q = i;
    }

    public final void setBgOpacity(int i) {
        this.R = i;
    }

    public final void setCardFrameContentDescription(java.lang.String str) {
        this.e0 = str;
    }

    public final void setCardOverlayColor(int i) {
        this.H = i;
    }

    public final void setCardOverlayDate(java.lang.String str) {
        this.K = str;
    }

    public final void setCardOverlayNumber(java.lang.String str) {
        this.J = str;
    }

    public final void setCardOverlayOpacity(float f) {
        this.I = f;
    }

    public final void setChopCorners(boolean z) {
        this.f3285o.getOutputSizes = z;
    }

    public final void setClientField(java.lang.String str) {
        this.w0.c = str;
    }

    public final void setCornerActiveColor(int i) {
        this.O = i;
    }

    public final void setCornerCompletedColor(int i) {
        this.P = i;
    }

    public final void setCornerInactiveColor(int i) {
        this.N = i;
    }

    public final void setCornerThickness(float f) {
        this.L = f;
    }

    public final void setDetectWrongCard(boolean z) {
        this.m0 = z;
    }

    public final void setExpandCorners(boolean z) {
        this.f3285o.getOutputMinFrameDuration = z;
    }

    public final void setExpectedBIN(java.lang.String str) {
        this.n0 = str;
    }

    public final void setExpectedLastFourDigits(java.lang.String str) {
        this.o0 = str;
    }

    public final void setGiftCardConfig(java.lang.String str) {
        this.y0.b = str;
    }

    public final void setGiftCardMode(java.lang.Boolean bool) {
        this.s0 = bool;
    }

    public final void setIsChallenge(boolean z) {
        this.k0 = z;
    }

    public final void setIsReactNative(boolean z) {
        this.w0.b = z;
        this.w = z;
    }

    public final void setLightTorchWhenDark(boolean z) {
        this.W = z;
    }

    public final void setNeedsReview(boolean z) {
        this.f0 = z;
    }

    public final void setOverlayText(java.lang.String str) {
        this.E.setText(str);
        if (java.util.Objects.equals(str, "")) {
            return;
        }
        this.E.setVisibility(0);
    }

    public final void setOverlayTextColor(int i) {
        this.E.setTextColor(i);
    }

    public final void setOverlayTextFont(int i) {
        this.E.setTypeface(androidx.core.content.res.ResourcesCompat.getFont(getContext(), i));
    }

    public final void setOverlayTextFontSize(float f) {
        this.E.setTextSize(f);
        b();
    }

    public final void setPromptIfFewDigits(java.lang.Boolean bool) {
        this.t0 = bool;
    }

    public final void setResultListener(com.dyneti.android.dyscan.DyScanView.DyScanResultListener dyScanResultListener) {
        this.a0 = dyScanResultListener;
    }

    public final void setResultOverlayAlwaysHorizontal(boolean z) {
        this.U = z;
    }

    public final void setResultOverlayAnimationTimeMs(int i) {
        this.T = i;
    }

    public final void setRoundCorners(boolean z) {
        this.f3285o.getInputSizeshNQ4ISI = z;
        this.p.getOutputFormats = z;
    }

    public final void setShowCardOverlay(boolean z) {
        this.G = z;
    }

    public final void setShowCorners(boolean z) {
        this.M = z;
    }

    public final void setShowDynetiLogo(boolean z) {
        this.d0 = z;
        this.u.setVisibility(z ? 0 : 4);
    }

    public final void setShowResultOverlay(boolean z) {
        this.S = z;
    }

    public final void setSidewaysScanningEnabled(boolean z) {
        this.q0 = java.lang.Boolean.valueOf(z);
        this.p0 = z && !this.V;
    }

    public final void setTorchEnabled(boolean z) {
        com.dyneti.android.dyscan.t tVar;
        if (!com.dyneti.android.dyscan.a0.f || this.W || isTorchEnabled() == z || (tVar = this.g) == null) {
            return;
        }
        tVar.d();
    }

    public final void setUserId(java.lang.String str) {
        this.l0 = str;
    }

    public final void setVertical(boolean z) {
        this.r = z;
        this.p.postInvalidate();
        if (this.M) {
            this.f3285o.postInvalidate();
        }
        this.u.setTranslationY(this.n.b());
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setTranslationY(this.n.a());
        }
        android.widget.TextView textView2 = this.E;
        com.dyneti.android.dyscan.l2 l2Var = this.n;
        textView2.setTranslationY((l2Var.f() - l2Var.c) - this.E.getHeight());
        if (this.G) {
            this.t.setVisibility(0);
        }
        this.t.postInvalidate();
    }

    public final void setVibrateOnCompletion(boolean z) {
        this.F = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.dyneti.android.dyscan.c2 c2Var) {
        final com.dyneti.android.dyscan.DyScanView dyScanView;
        com.dyneti.android.dyscan.t tVar;
        int i;
        int i2;
        java.util.ArrayList arrayList;
        com.dyneti.android.dyscan.CreditCard creditCard;
        double[] dArr;
        int[] iArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        com.dyneti.android.dyscan.e eVar;
        com.dyneti.android.dyscan.d dVar;
        com.dyneti.android.dyscan.CreditCard creditCard2;
        boolean z3;
        boolean z4;
        com.dyneti.android.dyscan.k2 i2Var;
        com.dyneti.android.dyscan.n1 n1Var;
        final com.dyneti.android.dyscan.k a2;
        byte[] bArr;
        com.dyneti.android.dyscan.e eVar2;
        final com.dyneti.android.dyscan.l lVar;
        final byte[] bArr2;
        final byte[] bArr3;
        android.graphics.Bitmap bitmap;
        byte[] bArr4;
        java.util.ArrayList arrayList2;
        com.dyneti.android.dyscan.e eVar3;
        int parseInt;
        java.lang.String c;
        int parseInt2;
        com.dyneti.android.dyscan.p0 p0Var;
        int i5;
        boolean z5;
        com.dyneti.android.dyscan.y yVar = c2Var.b;
        if (yVar == null || !yVar.c || yVar.f3352a == com.dyneti.android.dyscan.w.other || !c2Var.k.booleanValue() || this.x0) {
            dyScanView = this;
            if (dyScanView.M) {
                dyScanView.f3285o.getHighSpeedVideoFpsRanges(c2Var.f3295a, false);
            }
        } else {
            com.dyneti.android.dyscan.p0 p0Var2 = c2Var.c;
            if (p0Var2 != null) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(p0Var2.f3330a);
                i = calendar.get(2) + 1;
                com.dyneti.android.dyscan.p0 p0Var3 = c2Var.c;
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                calendar2.setTime(p0Var3.f3330a);
                i2 = calendar2.get(1);
            } else {
                i = 0;
                i2 = 0;
            }
            if (com.dyneti.android.dyscan.DyScan.isFraudVersion()) {
                java.util.Collections.singletonList("440066");
                java.lang.String a3 = c2Var.b.a();
                java.lang.String c2 = c2Var.b.c();
                java.lang.String str = this.n0;
                if (str != null && this.o0 != null) {
                    a3.equals(str);
                    c2.equals(this.o0);
                } else if (str == null) {
                    java.lang.String str2 = this.o0;
                    if (str2 != null) {
                        c2.equals(str2);
                    }
                } else {
                    a3.equals(str);
                }
                boolean z6 = c2Var.b.g;
                throw null;
            }
            com.dyneti.android.dyscan.CreditCard creditCard3 = new com.dyneti.android.dyscan.CreditCard(c2Var.b.b, i, i2, c2Var.j);
            if ((this.s0.booleanValue() && !this.z0.a(creditCard3.getCardNumber())) || (this.m0 && creditCard3.getDeclineReasons() != null && creditCard3.getDeclineReasons().isNumberMismatch())) {
                return;
            }
            this.x0 = true;
            boolean equals = c2Var.j.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP);
            if (this.M) {
                this.f3285o.getHighSpeedVideoFpsRanges(c2Var.f3295a, true);
            }
            com.dyneti.android.dyscan.h2 h2Var = this.j;
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            try {
                arrayList = h2Var.a();
            } catch (org.json.JSONException unused) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(java.lang.Long.valueOf(currentTimeMillis));
            java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList).toString();
            com.dyneti.android.dyscan.m0 m0Var = h2Var.f3309a;
            com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
            h2Var.b.edit().putString("dyscan_sac", jSONArray).apply();
            if (this.F) {
                ((android.os.Vibrator) getActivity().getSystemService("vibrator")).vibrate(android.os.VibrationEffect.createOneShot(400L, -1));
            }
            synchronized (this.i) {
                com.dyneti.android.dyscan.a0.f = false;
            }
            com.dyneti.android.dyscan.a2 a2Var = new com.dyneti.android.dyscan.a2(getActivity());
            com.dyneti.android.dyscan.e eVar4 = new com.dyneti.android.dyscan.e(this, "POST", this.g.a(), this.u0, this.v0);
            double[] dArr2 = new double[0];
            double[] dArr3 = new double[0];
            int[] iArr2 = new int[0];
            com.dyneti.android.dyscan.y yVar2 = c2Var.b;
            if (yVar2.c) {
                java.lang.String a4 = yVar2.a();
                if (a4 != null) {
                    try {
                        parseInt = java.lang.Integer.parseInt(a4);
                    } catch (java.lang.NumberFormatException unused2) {
                    }
                    c = c2Var.b.c();
                    if (c != null) {
                        try {
                            parseInt2 = java.lang.Integer.parseInt(c);
                        } catch (java.lang.NumberFormatException unused3) {
                        }
                        p0Var = c2Var.c;
                        if (p0Var != null) {
                            com.dyneti.android.dyscan.l lVar2 = p0Var.c;
                            creditCard = creditCard3;
                            i5 = parseInt;
                            dArr3 = new double[]{lVar2.f3318a, lVar2.c, lVar2.b, lVar2.d};
                            z5 = true;
                        } else {
                            i5 = parseInt;
                            creditCard = creditCard3;
                            z5 = false;
                        }
                        com.dyneti.android.dyscan.y yVar3 = c2Var.b;
                        int[] iArr3 = yVar3.e;
                        com.dyneti.android.dyscan.l lVar3 = yVar3.i;
                        int i6 = i5;
                        dArr = new double[]{lVar3.f3318a, lVar3.c, lVar3.b, lVar3.d};
                        i4 = parseInt2;
                        dArr3 = dArr3;
                        z2 = z5;
                        iArr = iArr3;
                        i3 = i6;
                        z = true;
                    }
                    parseInt2 = 0;
                    p0Var = c2Var.c;
                    if (p0Var != null) {
                    }
                    com.dyneti.android.dyscan.y yVar32 = c2Var.b;
                    int[] iArr32 = yVar32.e;
                    com.dyneti.android.dyscan.l lVar32 = yVar32.i;
                    int i62 = i5;
                    dArr = new double[]{lVar32.f3318a, lVar32.c, lVar32.b, lVar32.d};
                    i4 = parseInt2;
                    dArr3 = dArr3;
                    z2 = z5;
                    iArr = iArr32;
                    i3 = i62;
                    z = true;
                }
                parseInt = 0;
                c = c2Var.b.c();
                if (c != null) {
                }
                parseInt2 = 0;
                p0Var = c2Var.c;
                if (p0Var != null) {
                }
                com.dyneti.android.dyscan.y yVar322 = c2Var.b;
                int[] iArr322 = yVar322.e;
                com.dyneti.android.dyscan.l lVar322 = yVar322.i;
                int i622 = i5;
                dArr = new double[]{lVar322.f3318a, lVar322.c, lVar322.b, lVar322.d};
                i4 = parseInt2;
                dArr3 = dArr3;
                z2 = z5;
                iArr = iArr322;
                i3 = i622;
                z = true;
            } else {
                creditCard = creditCard3;
                dArr = dArr2;
                iArr = iArr2;
                i3 = 0;
                i4 = 0;
                z = false;
                z2 = false;
            }
            java.util.Collections.sort(c2Var.f3295a, com.dyneti.android.dyscan.f2.d);
            int min = java.lang.Math.min(c2Var.f3295a.size(), 4);
            double[] dArr4 = new double[min * 4];
            java.util.Iterator it = c2Var.f3295a.subList(0, min).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                com.dyneti.android.dyscan.l lVar4 = ((com.dyneti.android.dyscan.f2) it.next()).c;
                java.util.Iterator it2 = it;
                double[] dArr5 = dArr3;
                int i8 = i4;
                boolean z7 = equals;
                int i9 = i3;
                com.dyneti.android.dyscan.a2 a2Var2 = a2Var;
                double[] dArr6 = {lVar4.f3318a, lVar4.c, lVar4.b, lVar4.d};
                i7 = i7;
                int i10 = 0;
                for (int i11 = 4; i10 < i11; i11 = 4) {
                    dArr4[i7] = dArr6[i10];
                    i7++;
                    i10++;
                }
                it = it2;
                dArr3 = dArr5;
                i4 = i8;
                equals = z7;
                i3 = i9;
                a2Var = a2Var2;
            }
            boolean z8 = equals;
            int i12 = i3;
            double[] dArr7 = dArr3;
            int i13 = i4;
            com.dyneti.android.dyscan.a2 a2Var3 = a2Var;
            eVar4.f3298a.a("scanSuccessful", z);
            eVar4.f3298a.a("hasDate", z2);
            if (i12 != 0) {
                eVar4.f3298a.a("cardBIN", i12);
            }
            if (i13 != 0) {
                eVar4.f3298a.a("lastFourDigits", i13);
            }
            if (com.dyneti.android.dyscan.DyScan.isEuVersion()) {
                eVar4.f3298a.b("cardNumberLocation", dArr);
            }
            eVar4.f3298a.b("expirationDateLocation", dArr7);
            eVar4.f3298a.b("cornerLocation", dArr4);
            eVar4.f3298a.b("cardFormat", iArr);
            eVar4.f3298a.a("tapeScore", 0.0d);
            eVar4.f3298a.a("cardOrientation", c2Var.j);
            if (com.dyneti.android.dyscan.DyScan.isFraudVersion()) {
                java.lang.String str3 = "";
                java.util.Iterator it3 = c2Var.e.iterator();
                while (it3.hasNext()) {
                    com.dyneti.android.dyscan.f2 f2Var = (com.dyneti.android.dyscan.f2) it3.next();
                    if (android.text.TextUtils.isEmpty(str3)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str3);
                        sb.append(f2Var.b);
                        str3 = sb.toString();
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str3);
                        sb2.append(",");
                        sb2.append(f2Var.b);
                        str3 = sb2.toString();
                    }
                }
                eVar4.f3298a.a("logoNames", str3);
                eVar4.f3298a.a("hasSpacing", c2Var.f);
                eVar4.f3298a.a("hasLogo", c2Var.g);
                eVar4.f3298a.a("hasCorners", c2Var.h);
            }
            eVar4.f3298a.a("isQuickRead", c2Var.b.g);
            dyScanView = this;
            dyScanView.a(eVar4.f3298a, a2Var3);
            eVar4.b();
            eVar4.f3298a.a("scanId", creditCard.getScanId());
            com.dyneti.android.dyscan.d dVar2 = new com.dyneti.android.dyscan.d() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda0
                @Override // com.dyneti.android.dyscan.d
                public final com.dyneti.android.dyscan.n1 a(java.lang.String str4, java.lang.Boolean bool) {
                    return com.dyneti.android.dyscan.DyScanView.this.a(str4, bool);
                }
            };
            if (!com.dyneti.android.dyscan.DyScan.isEuVersion()) {
                eVar4.f3298a.a("cardNumberLimitedHash", com.dyneti.android.dyscan.z.a(c2Var.b));
                synchronized (dyScanView.i) {
                    a2 = dyScanView.f3284a.a(c2Var.d, c2Var.b);
                }
                if (a2 != null) {
                    android.graphics.Canvas canvas = new android.graphics.Canvas(a2.f3316a);
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setColor(-16777216);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it4 = a2.b.j.iterator();
                    while (it4.hasNext()) {
                        arrayList3.addAll(((com.dyneti.android.dyscan.d0) it4.next()).c);
                    }
                    java.util.ArrayList arrayList4 = a2.c;
                    int i14 = 6;
                    if (arrayList4.size() == 0) {
                        java.util.Iterator it5 = arrayList3.iterator();
                        int i15 = 0;
                        while (it5.hasNext()) {
                            com.dyneti.android.dyscan.l lVar5 = (com.dyneti.android.dyscan.l) it5.next();
                            if (i15 >= i14 && i15 < arrayList3.size() - 4) {
                                float f = lVar5.b;
                                float f2 = lVar5.f3318a;
                                float f3 = lVar5.c;
                                float f4 = a2.e;
                                float f5 = lVar5.d;
                                if (java.lang.Math.abs(f4) > 0.001f) {
                                    float f6 = ((f - f2) * 1.5f) / 2.0f;
                                    f2 -= f6;
                                    f += f6;
                                }
                                float f7 = (f2 * 720.0f) - 0.0f;
                                float f8 = ((f3 + f4) * 454.0f) - 0.0f;
                                float f9 = (f * 720.0f) + 0.0f;
                                float f10 = ((f5 + f4) * 454.0f) + 0.0f;
                                if (f7 < 0.0f) {
                                    f7 = 0.0f;
                                }
                                if (f8 < 0.0f) {
                                    f8 = 0.0f;
                                }
                                if (f9 >= 720.0f) {
                                    f9 = 719.0f;
                                }
                                if (f10 >= 454.0f) {
                                    f10 = 453.0f;
                                }
                                canvas.drawRect(new android.graphics.RectF(f7, f8, f9, f10), paint);
                            }
                            i15++;
                            i14 = 6;
                        }
                    }
                    java.util.Iterator it6 = a2.d.iterator();
                    while (it6.hasNext()) {
                        com.dyneti.android.dyscan.l lVar6 = ((com.dyneti.android.dyscan.f2) it6.next()).c;
                        float f11 = lVar6.b;
                        float f12 = lVar6.f3318a;
                        float f13 = lVar6.d;
                        float f14 = lVar6.c;
                        float f15 = ((f11 - f12) * 1.5f) / 2.0f;
                        float f16 = ((f13 - f14) * 0.2f) / 2.0f;
                        float f17 = ((f12 - f15) * 720.0f) - 0.0f;
                        float f18 = ((f14 - f16) * 454.0f) - 0.0f;
                        float f19 = ((f11 + f15) * 720.0f) + 0.0f;
                        float f20 = ((f13 + f16) * 454.0f) + 0.0f;
                        if (f17 < 0.0f) {
                            f17 = 0.0f;
                        }
                        if (f18 < 0.0f) {
                            f18 = 0.0f;
                        }
                        if (f19 >= 720.0f) {
                            f19 = 719.0f;
                        }
                        if (f20 >= 454.0f) {
                            f20 = 453.0f;
                        }
                        canvas.drawRect(new android.graphics.RectF(f17, f18, f19, f20), paint);
                    }
                    java.util.Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        com.dyneti.android.dyscan.l lVar7 = ((com.dyneti.android.dyscan.f2) it7.next()).c;
                        float f21 = (lVar7.f3318a * 720.0f) - 0.0f;
                        float f22 = (lVar7.c * 454.0f) - 0.0f;
                        float f23 = (lVar7.b * 720.0f) + 0.0f;
                        float f24 = (lVar7.d * 454.0f) + 0.0f;
                        if (f21 < 0.0f) {
                            f21 = 0.0f;
                        }
                        if (f22 < 0.0f) {
                            f22 = 0.0f;
                        }
                        if (f23 >= 720.0f) {
                            f23 = 719.0f;
                        }
                        if (f24 >= 454.0f) {
                            f24 = 453.0f;
                        }
                        canvas.drawRect(new android.graphics.RectF(f21, f22, f23, f24), paint);
                    }
                    byte[] a5 = com.dyneti.android.dyscan.j.a(a2.f3316a);
                    if (z8) {
                        android.graphics.Bitmap bitmap2 = c2Var.l;
                        com.dyneti.android.dyscan.l2 l2Var = dyScanView.n;
                        float f25 = l2Var.g;
                        float f26 = l2Var.h;
                        float f27 = l2Var.e;
                        float f28 = l2Var.f;
                        android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmap2);
                        android.graphics.Paint paint2 = new android.graphics.Paint();
                        paint2.setColor(-16777216);
                        paint2.setStyle(android.graphics.Paint.Style.FILL);
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.util.Iterator it8 = a2.b.j.iterator();
                        while (it8.hasNext()) {
                            arrayList5.addAll(((com.dyneti.android.dyscan.d0) it8.next()).c);
                        }
                        java.util.ArrayList arrayList6 = a2.c;
                        if (arrayList6.size() == 0) {
                            java.util.Iterator it9 = arrayList5.iterator();
                            int i16 = 0;
                            while (it9.hasNext()) {
                                java.util.Iterator it10 = it9;
                                com.dyneti.android.dyscan.l lVar8 = (com.dyneti.android.dyscan.l) it9.next();
                                if (i16 < 6) {
                                    bitmap = bitmap2;
                                    bArr4 = a5;
                                    arrayList2 = arrayList5;
                                    eVar3 = eVar4;
                                } else if (i16 < arrayList5.size() - 4) {
                                    float f29 = lVar8.b;
                                    arrayList2 = arrayList5;
                                    float f30 = lVar8.f3318a;
                                    bArr4 = a5;
                                    float f31 = lVar8.c;
                                    eVar3 = eVar4;
                                    float f32 = a2.e;
                                    float f33 = lVar8.d;
                                    if (java.lang.Math.abs(f32) > 0.001f) {
                                        float f34 = ((f29 - f30) * 1.5f) / 2.0f;
                                        f30 -= f34;
                                        f29 += f34;
                                    }
                                    bitmap = bitmap2;
                                    com.dyneti.android.dyscan.j.a(canvas2, new com.dyneti.android.dyscan.l(f31 + f32, f30, f33 + f32, f29), paint2, f25, f26, f27, f28);
                                } else {
                                    bitmap = bitmap2;
                                    bArr4 = a5;
                                    arrayList2 = arrayList5;
                                    eVar3 = eVar4;
                                }
                                i16++;
                                arrayList5 = arrayList2;
                                it9 = it10;
                                a5 = bArr4;
                                bitmap2 = bitmap;
                                eVar4 = eVar3;
                            }
                        }
                        android.graphics.Bitmap bitmap3 = bitmap2;
                        bArr = a5;
                        eVar2 = eVar4;
                        java.util.Iterator it11 = a2.d.iterator();
                        while (it11.hasNext()) {
                            com.dyneti.android.dyscan.l lVar9 = ((com.dyneti.android.dyscan.f2) it11.next()).c;
                            float f35 = lVar9.b;
                            float f36 = lVar9.f3318a;
                            float f37 = lVar9.d;
                            float f38 = lVar9.c;
                            float f39 = ((f35 - f36) * 1.5f) / 2.0f;
                            float f40 = ((f37 - f38) * 0.2f) / 2.0f;
                            com.dyneti.android.dyscan.j.a(canvas2, new com.dyneti.android.dyscan.l(f38 - f40, f36 - f39, f37 + f40, f35 + f39), paint2, f25, f26, f27, f28);
                        }
                        java.util.Iterator it12 = arrayList6.iterator();
                        while (it12.hasNext()) {
                            com.dyneti.android.dyscan.j.a(canvas2, ((com.dyneti.android.dyscan.f2) it12.next()).c, paint2, f25, f26, f27, f28);
                        }
                        float height = dyScanView.n.h / bitmap3.getHeight();
                        float width = dyScanView.n.g / bitmap3.getWidth();
                        com.dyneti.android.dyscan.l2 l2Var2 = dyScanView.n;
                        float height2 = (l2Var2.f + l2Var2.h) / bitmap3.getHeight();
                        com.dyneti.android.dyscan.l2 l2Var3 = dyScanView.n;
                        com.dyneti.android.dyscan.l lVar10 = new com.dyneti.android.dyscan.l(height, width, height2, (l2Var3.e + l2Var3.g) / bitmap3.getWidth());
                        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap3, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, (int) ((bitmap3.getHeight() / bitmap3.getWidth()) * 281.0d), true);
                        bArr3 = com.dyneti.android.dyscan.j.a(bitmap3);
                        lVar = lVar10;
                        bArr2 = com.dyneti.android.dyscan.j.a(createScaledBitmap);
                    } else {
                        bArr = a5;
                        eVar2 = eVar4;
                        lVar = new com.dyneti.android.dyscan.l(0.0f, 0.0f, 1.0f, 1.0f);
                        bArr2 = null;
                        bArr3 = null;
                    }
                    final com.dyneti.android.dyscan.e eVar5 = eVar2;
                    final byte[] bArr5 = bArr;
                    dVar2 = new com.dyneti.android.dyscan.d() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda1
                        @Override // com.dyneti.android.dyscan.d
                        public final com.dyneti.android.dyscan.n1 a(java.lang.String str4, java.lang.Boolean bool) {
                            return com.dyneti.android.dyscan.DyScanView.this.a(eVar5, bArr5, bArr2, bArr3, a2, lVar, str4, bool);
                        }
                    };
                    eVar = eVar2;
                    eVar.f3298a.a("isSingleFrameDetection", a2.f);
                    dVar = dVar2;
                    if (com.dyneti.android.dyscan.DyScan.isFraudVersion()) {
                        creditCard2 = creditCard;
                    } else {
                        try {
                            java.lang.String a6 = com.dyneti.android.dyscan.b2.a(eVar.f3298a.f3326a);
                            eVar.f3298a.a("payloadId", a6);
                            creditCard2 = creditCard;
                            try {
                                creditCard2.g = a6;
                            } catch (java.lang.Exception e) {
                                e = e;
                                e.getMessage();
                                eVar.f3298a.a("customerUserId", dyScanView.l0);
                                if (dyScanView.r0.booleanValue()) {
                                }
                                z3 = true;
                                eVar.execute(dVar);
                                z4 = true;
                                dyScanView.i0 = z3;
                                if (z4) {
                                }
                                tVar = dyScanView.g;
                                if (tVar == null) {
                                }
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            creditCard2 = creditCard;
                        }
                    }
                    eVar.f3298a.a("customerUserId", dyScanView.l0);
                    if (dyScanView.r0.booleanValue() || !com.dyneti.android.dyscan.DyScan.isFraudVersion()) {
                        z3 = true;
                        eVar.execute(dVar);
                        z4 = true;
                    } else {
                        try {
                            i2Var = (com.dyneti.android.dyscan.k2) eVar.execute(dVar).get();
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e3) {
                            i2Var = new com.dyneti.android.dyscan.i2(e3);
                        }
                        boolean a7 = i2Var.a();
                        if (a7 && (n1Var = ((com.dyneti.android.dyscan.j2) i2Var).f3315a) != null && n1Var.a()) {
                            java.lang.Boolean bool = ((com.dyneti.android.dyscan.m1) n1Var).f3324a;
                            if (bool != null) {
                                com.dyneti.android.dyscan.DeclineReasons declineReasons = creditCard2.getDeclineReasons();
                                declineReasons.d = declineReasons.a("generatedImage", bool.booleanValue());
                            }
                        } else if (!a7) {
                            onPause();
                            onDestroy();
                            dyScanView.a0.onFailure(5);
                        }
                        z4 = a7;
                        z3 = true;
                    }
                    dyScanView.i0 = z3;
                    if (z4) {
                        dyScanView.a(c2Var, creditCard2);
                    }
                }
            }
            eVar = eVar4;
            dVar = dVar2;
            if (com.dyneti.android.dyscan.DyScan.isFraudVersion()) {
            }
            eVar.f3298a.a("customerUserId", dyScanView.l0);
            if (dyScanView.r0.booleanValue()) {
            }
            z3 = true;
            eVar.execute(dVar);
            z4 = true;
            dyScanView.i0 = z3;
            if (z4) {
            }
        }
        tVar = dyScanView.g;
        if (tVar == null) {
            com.dyneti.android.dyscan.FocusRingView focusRingView = dyScanView.q;
            focusRingView.b = tVar.f3322a;
            focusRingView.postInvalidate();
        }
    }

    public final void c() {
        synchronized (this.i) {
            com.dyneti.android.dyscan.a0.f = true;
        }
    }

    public final /* synthetic */ void b(com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate) {
        this.a0.onProgressUpdate(dyScanProgressUpdate);
    }

    public final void b(com.dyneti.android.dyscan.c2 c2Var) {
        this.s.setVisibility(0);
        com.dyneti.android.dyscan.OverlayView overlayView = this.s;
        overlayView.getInputFormats = this.U;
        com.dyneti.android.dyscan.y yVar = c2Var.b;
        com.dyneti.android.dyscan.p0 p0Var = c2Var.c;
        overlayView.getHighResolutionOutputSizeshNQ4ISI = yVar;
        overlayView.Camera2StreamConfigurationMap = p0Var;
        overlayView.postInvalidate();
        this.s.animate().setDuration(this.T).alpha(1.0f);
        this.t.animate().setDuration(this.T / 2).alpha(0.0f);
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.animate().setDuration(this.T / 2).alpha(0.0f);
        }
    }

    public final com.dyneti.android.dyscan.n1 a(java.lang.String str, java.lang.Boolean bool) {
        com.dyneti.android.dyscan.d1 d1Var = this.A0;
        if (d1Var == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("command", "persist");
        jSONObject.put("scanId", str);
        okhttp3.WebSocket webSocket = d1Var.f3297a;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        webSocket.send(jSONObject2);
        return null;
    }

    public final com.dyneti.android.dyscan.n1 a(com.dyneti.android.dyscan.e eVar, byte[] bArr, byte[] bArr2, byte[] bArr3, com.dyneti.android.dyscan.k kVar, com.dyneti.android.dyscan.l lVar, java.lang.String str, java.lang.Boolean bool) {
        com.dyneti.android.dyscan.d1 d1Var = this.A0;
        if (d1Var != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("command", "persist");
            jSONObject.put("scanId", str);
            okhttp3.WebSocket webSocket = d1Var.f3297a;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            webSocket.send(jSONObject2);
        }
        if (com.dyneti.android.dyscan.DyScan.isFraudVersion() && this.r0.booleanValue()) {
            if (java.lang.Boolean.TRUE.equals(bool)) {
                return eVar.b(bArr, bArr2, bArr3, str, kVar.g, lVar, this.r0.booleanValue());
            }
            eVar.a(bArr, bArr2, bArr3, str, kVar.g, lVar, this.r0.booleanValue());
            return null;
        }
        eVar.a(bArr, bArr2, bArr3, str, kVar.g, lVar, this.r0.booleanValue());
        return null;
    }

    public final void a(final com.dyneti.android.dyscan.c2 c2Var, final com.dyneti.android.dyscan.CreditCard creditCard) {
        final android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.dyneti.android.dyscan.DyScanView.this.a(c2Var, handler, creditCard);
                }
            });
        }
    }

    public final /* synthetic */ void a(final com.dyneti.android.dyscan.c2 c2Var, android.os.Handler handler, final com.dyneti.android.dyscan.CreditCard creditCard) {
        if (this.S) {
            android.app.Activity activity = getActivity();
            if (activity != null) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.dyneti.android.dyscan.DyScanView.this.b(c2Var);
                    }
                });
            }
            handler.postDelayed(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.dyneti.android.dyscan.DyScanView.this.a(creditCard);
                }
            }, this.T);
            return;
        }
        this.a0.onSuccess(creditCard);
    }

    public final /* synthetic */ void a(com.dyneti.android.dyscan.CreditCard creditCard) {
        com.dyneti.android.dyscan.DyScanView.DyScanResultListener dyScanResultListener = this.a0;
        if (dyScanResultListener != null) {
            dyScanResultListener.onSuccess(creditCard);
        }
    }

    public final void a(com.dyneti.android.dyscan.n2 n2Var, com.dyneti.android.dyscan.a2 a2Var) {
        java.lang.String str;
        java.lang.Integer num;
        n2Var.b("androidTextureViewSize", new int[]{this.c.getWidth(), this.c.getHeight()});
        n2Var.a("lastBrightness", this.k);
        com.dyneti.android.dyscan.t tVar = this.g;
        n2Var.a("isTorchOn", tVar != null && tVar.c());
        n2Var.a("lowPowerModeEnabled", com.dyneti.android.dyscan.r2.a(getActivity()));
        android.app.Activity activity = getActivity();
        java.lang.Boolean bool = null;
        try {
            str = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = null;
        }
        n2Var.a("androidAppVersionName", str);
        android.app.Activity activity2 = getActivity();
        try {
            num = java.lang.Integer.valueOf(activity2.getPackageManager().getPackageInfo(activity2.getPackageName(), 0).versionCode);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            num = null;
        }
        n2Var.a("androidAppVersionCode", num);
        android.app.Activity activity3 = getActivity();
        try {
            bool = java.lang.Boolean.valueOf((activity3.getPackageManager().getApplicationInfo(activity3.getPackageName(), 0).flags & 2) != 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
        }
        n2Var.a("isAppDebug", bool);
        n2Var.a("androidNumInstalledApps", a2Var.f3290a.getInstalledApplications(0).size());
        if (a2Var.b == null) {
            a2Var.a();
        }
        n2Var.a("androidFirstInstallTime", a2Var.b);
        if (a2Var.c == null) {
            a2Var.a();
        }
        n2Var.b("androidCommonApps", a2Var.c);
        if (a2Var.d == null) {
            a2Var.a();
        }
        n2Var.b("androidSuspiciousApps", a2Var.d);
        new com.dyneti.android.dyscan.q2(getActivity()).a(n2Var);
        if (a2Var.e == null) {
            a2Var.a();
        }
        android.util.SparseIntArray sparseIntArray = a2Var.e;
        n2Var.a("androidAudioCount", sparseIntArray.get(1));
        n2Var.a("androidGameCount", sparseIntArray.get(0));
        n2Var.a("androidImageCount", sparseIntArray.get(3));
        n2Var.a("androidMapsCount", sparseIntArray.get(6));
        n2Var.a("androidNewsCount", sparseIntArray.get(5));
        n2Var.a("androidProductivityCount", sparseIntArray.get(7));
        n2Var.a("androidSocialCount", sparseIntArray.get(4));
        n2Var.a("androidUndefinedCount", sparseIntArray.get(-1));
        n2Var.a("androidVideoCount", sparseIntArray.get(2));
    }

    public final void a() {
        this.g.a(new com.dyneti.android.dyscan.a1(this), new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScanView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.dyneti.android.dyscan.DyScanView.this.c();
            }
        });
    }

    public final void a(java.lang.String str) {
        com.dyneti.android.dyscan.e eVar = new com.dyneti.android.dyscan.e(this, "POST", this.g.a(), this.u0, this.v0);
        eVar.f3298a.a("scanSuccessful", false);
        eVar.f3298a.a("error", str);
        a(eVar.f3298a, new com.dyneti.android.dyscan.a2(getActivity()));
        eVar.execute(new com.dyneti.android.dyscan.d[0]);
        this.i0 = true;
    }
}
