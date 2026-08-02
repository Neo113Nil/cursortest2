package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class az extends com.facetec.sdk.au {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static char C;
    private static int E;
    private static char F;
    private static char G;
    private static int H;
    private static char I;
    private static int L;
    private static int N;
    public static boolean e;

    /* renamed from: a, reason: collision with root package name */
    private android.widget.TextView f3410a;
    public android.widget.ImageView b;
    com.facetec.sdk.ct c;
    private android.widget.LinearLayout d;
    private com.facetec.sdk.az.e f;
    private android.view.View g;
    private com.facetec.sdk.dc i;
    private com.facetec.sdk.cy j;
    private android.os.Handler l;
    private android.os.Handler m;
    private android.os.Handler n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.FrameLayout f3411o;
    private java.util.concurrent.Semaphore v;
    private android.os.Handler x;
    private boolean h = false;
    private boolean k = false;
    private boolean s = false;
    private boolean r = false;
    private boolean p = false;
    private boolean t = false;
    private com.facetec.sdk.cm q = null;
    private boolean u = false;
    private final int y = (int) com.facetec.sdk.ay.d(12);
    private boolean w = false;
    private boolean A = false;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener B = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.az.3
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            com.facetec.sdk.az.e(com.facetec.sdk.az.this);
            if (com.facetec.sdk.az.b(com.facetec.sdk.az.this)) {
                return;
            }
            com.facetec.sdk.az.d(com.facetec.sdk.az.this);
            float a2 = com.facetec.sdk.dm.a();
            float b = com.facetec.sdk.dm.b();
            int d = com.facetec.sdk.dm.d();
            int d2 = (int) (com.facetec.sdk.ay.d(35) * b * a2);
            float f = d / 2.0f;
            int round = java.lang.Math.round(f);
            int round2 = java.lang.Math.round(f);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.az.this.b.getLayoutParams();
            layoutParams.setMargins(round, round, 0, 0);
            layoutParams.setMarginStart(round);
            layoutParams.setMarginEnd(round);
            com.facetec.sdk.az.this.b.setLayoutParams(layoutParams);
            com.facetec.sdk.az.this.b.setPadding(round2, round2, round2, round2);
            com.facetec.sdk.az.this.b.getLayoutParams().height = d2;
            com.facetec.sdk.az.this.b.getLayoutParams().width = d2;
            com.facetec.sdk.az.this.b.requestLayout();
        }
    };
    private final java.lang.Runnable z = new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.az.this.k();
        }
    };
    private final com.facetec.sdk.cn.e D = new com.facetec.sdk.cn.e() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda10
        @Override // com.facetec.sdk.cn.e
        public final void onPreSessionProgress(com.facetec.sdk.cs csVar, com.facetec.sdk.cr crVar, com.facetec.sdk.ct ctVar, com.facetec.sdk.cv cvVar) {
            com.facetec.sdk.az.this.b(csVar, crVar, ctVar, cvVar);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b, short s, int i) {
        int i2;
        int i3 = (b * 2) + 112;
        int i4 = 4 - (i * 3);
        byte[] bArr = $$c;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 += i6;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i4];
            i2++;
            i3 += i6;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void J(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s2 * 3;
        int i4 = s + 97;
        int i5 = i + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            i4 = (-i4) + i8;
            i5 = i7;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            int i10 = i5 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = bArr[i10];
            i8 = i4;
            i4 = i11;
            i9 = i2 + 1;
            i7 = i10;
            i4 = (-i4) + i8;
            i5 = i7;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            int i102 = i5 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i1022 = i5 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object a(int i, int i2, int i3, java.lang.Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~i5) | i7;
        int i9 = (~i3) | (~i8);
        int i10 = i5 | i7;
        int i11 = ~(i8 | i3);
        int i12 = i + i3 + i6 + (1075552530 * i2) + ((-1519595880) * i4);
        int i13 = i12 * i12;
        int i14 = (251836610 * i) + 257048825 + (251838484 * i3) + (i9 * 937) + (i10 * (-937)) + (i11 * 937) + (251837547 * i6) + (1710852742 * i2) + ((-1855850104) * i4) + ((-1244921856) * i13);
        switch (((i * (-1050772794)) - 1639710720) + (i3 * (-2116975300)) + (i9 * (-533101253)) + (i10 * 533101253) + (i11 * (-533101253)) + (i6 * (-1583874048)) + (i2 * (-189792256)) + (i4 * 1111490560) + (i13 * 1415839744) + (i14 * i14 * (-1300496384))) {
            case 1:
                return b(objArr);
            case 2:
                return e(objArr);
            case 3:
                return c(objArr);
            case 4:
                return a(objArr);
            case 5:
                return i(objArr);
            case 6:
                return f(objArr);
            case 7:
                com.facetec.sdk.az azVar = (com.facetec.sdk.az) objArr[0];
                E = (H + 125) % 128;
                azVar.e();
                E = (H + 89) % 128;
                return null;
            case 8:
                final com.facetec.sdk.az azVar2 = (com.facetec.sdk.az) objArr[0];
                com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) azVar2.getActivity();
                if (blVar != null) {
                    blVar.N.e();
                }
                final com.facetec.sdk.bf h = azVar2.h();
                if (azVar2.c()) {
                    E = (H + 105) % 128;
                    if (h != null) {
                        azVar2.f();
                        com.facetec.sdk.cg.d(h);
                        if (azVar2.s) {
                            E = (H + 73) % 128;
                            com.facetec.sdk.ap.e(h, com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_FAIL);
                        }
                        a(-1443584754, com.facetec.sdk.ob.c(), 1443584754, new java.lang.Object[]{azVar2, new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda6
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.az.this.e(h);
                            }
                        }), false}, com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c());
                        H = (E + 99) % 128;
                    }
                }
                return null;
            default:
                return d(objArr);
        }
    }

    static void init$0() {
        $$a = new byte[]{2, 98, -91, -34};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
    }

    static void init$1() {
        $$c = new byte[]{74, -4, 35, -5};
        $$d = 63;
    }

    static /* synthetic */ void a(com.facetec.sdk.az azVar) {
        com.facetec.sdk.dc dcVar;
        int i = H + 77;
        E = i % 128;
        int i2 = 2;
        if (i % 2 != 0) {
            com.facetec.sdk.eb.b();
            dcVar = azVar.i;
            i2 = 5;
        } else {
            com.facetec.sdk.eb.b();
            dcVar = azVar.i;
        }
        dcVar.setImportantForAccessibility(i2);
        azVar.i.setOnTouchListener(null);
    }

    static /* synthetic */ boolean b(com.facetec.sdk.az azVar) {
        int i = (H + 11) % 128;
        E = i;
        boolean z = azVar.t;
        H = (i + 69) % 128;
        return z;
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        com.facetec.sdk.az azVar = (com.facetec.sdk.az) objArr[0];
        int i = (H + 111) % 128;
        E = i;
        azVar.t = true;
        int i2 = i + 63;
        H = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return true;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        L = 0;
        N = 1;
        E = 0;
        H = 1;
        d();
        e = false;
        L = (N + 17) % 128;
    }

    static com.facetec.sdk.az a() {
        com.facetec.sdk.az azVar = new com.facetec.sdk.az();
        E = (H + 73) % 128;
        return azVar;
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.s = false;
        this.r = false;
        this.p = false;
        this.v = new java.util.concurrent.Semaphore(1);
        E = (H + 57) % 128;
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        E = (H + 55) % 128;
        android.view.View inflate = layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_facescan_fragment, viewGroup, false);
        E = (H + 121) % 128;
        return inflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        com.facetec.sdk.dc dcVar;
        android.view.View.OnTouchListener onTouchListener;
        super.onViewCreated(view, bundle);
        final com.facetec.sdk.bf h = h();
        com.facetec.sdk.cn j = j();
        if (j == null) {
            return;
        }
        com.facetec.sdk.t.e = com.facetec.sdk.as.f3400o;
        com.facetec.sdk.az.e eVar = new com.facetec.sdk.az.e();
        this.f = eVar;
        j.d(eVar);
        com.facetec.sdk.cs o2 = j.o();
        com.facetec.sdk.ct m = j.m();
        com.facetec.sdk.cl s = j.s();
        if (o2 != com.facetec.sdk.cs.READY_TO_START_FACESCAN_SESSION) {
            j.c(this.D);
        }
        this.d = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.zoomLogoContainer);
        this.f3410a = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.zoomLogoText);
        java.lang.String packageName = h.getPackageName();
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.securityWatermark);
        int i = com.facetec.sdk.az.AnonymousClass1.f3412a[com.facetec.sdk.FaceTecSDK.f3366a.securityWatermarkImage.ordinal()];
        if (i == 1) {
            imageView.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(getActivity(), com.facetec.sdk.R.drawable.facetec_internal_zoom_watermark));
        } else if (i == 2) {
            imageView.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(getActivity(), com.facetec.sdk.R.drawable.facetec_internal_facetec_watermark));
        } else if (i == 3) {
            imageView.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(getActivity(), com.facetec.sdk.R.drawable.facetec_internal_facetec_powered_by_watermark));
        }
        float a2 = com.facetec.sdk.dm.a();
        imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, (int) (com.facetec.sdk.dp.d().heightPixels * com.facetec.sdk.dm.b() * 0.15f * a2)));
        this.f3410a.setVisibility(0);
        this.f3410a.setTextSize(com.facetec.sdk.dm.b() * 8.0f * a2);
        if (packageName.contains("com.facetec.zoomlogin")) {
            this.f3410a.setText("v9.7.108");
        } else {
            android.widget.TextView textView = this.f3410a;
            if (android.os.Build.CPU_ABI.equals("arm64-v8a")) {
                H = (E + 17) % 128;
                str = " 64-bit";
            } else {
                str = "";
            }
            textView.setText("v9.7.108".concat(str));
        }
        this.d.setPadding(0, 0, 0, 12);
        this.i = (com.facetec.sdk.dc) view.findViewById(com.facetec.sdk.R.id.zoomOval);
        this.g = view.findViewById(com.facetec.sdk.R.id.instructionsBackground);
        this.b = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.backButton);
        com.facetec.sdk.cy cyVar = (com.facetec.sdk.cy) view.findViewById(com.facetec.sdk.R.id.zoomProgressBar);
        this.j = cyVar;
        cyVar.setVisibility(4);
        cyVar.f3484a = (android.widget.TextView) cyVar.findViewById(com.facetec.sdk.R.id.feedbackText);
        cyVar.f3484a.setImportantForAccessibility(2);
        androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults(cyVar.f3484a, 1);
        androidx.core.widget.TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(cyVar.f3484a, 5, 50, 1, 2);
        int a3 = com.facetec.sdk.cy.a(s);
        cyVar.b = s;
        if (o2 != com.facetec.sdk.cs.READY_TO_START_FACESCAN_SESSION) {
            switch (com.facetec.sdk.cy.AnonymousClass3.b[m.ordinal()]) {
                case 1:
                    cyVar.e = com.facetec.sdk.ct.FRAME_YOUR_FACE;
                    break;
                case 2:
                    cyVar.e = com.facetec.sdk.ct.FRAME_YOUR_FACE;
                    break;
                case 3:
                    cyVar.e = com.facetec.sdk.ct.WEARING_SUNGLASSES;
                    break;
                case 4:
                    cyVar.e = com.facetec.sdk.ct.BAD_POSE;
                    break;
                case 5:
                    cyVar.e = com.facetec.sdk.ct.TOO_BRIGHT;
                    break;
                case 6:
                    cyVar.e = com.facetec.sdk.ct.TOO_DARK;
                    break;
                case 7:
                    cyVar.e = com.facetec.sdk.ct.MAKING_FACE;
                    break;
                case 8:
                    cyVar.e = com.facetec.sdk.ct.HOLD_STEADY_3;
                    break;
                case 9:
                    cyVar.e = com.facetec.sdk.ct.HOLD_STEADY_2;
                    break;
                case 10:
                    cyVar.e = com.facetec.sdk.ct.HOLD_STEADY_1;
                    break;
                case 11:
                    cyVar.e = com.facetec.sdk.ct.MOVE_CLOSER;
                    break;
                case 12:
                    cyVar.e = com.facetec.sdk.ct.MOVE_AWAY;
                    break;
            }
            a3 = com.facetec.sdk.cy.a(cyVar.e);
        }
        com.facetec.sdk.eb.d(a3);
        com.facetec.sdk.dl.d(cyVar.f3484a, a3);
        cyVar.f3484a.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.l.textFont);
        com.facetec.sdk.dm.a(cyVar.f3484a);
        android.graphics.drawable.GradientDrawable x = com.facetec.sdk.dm.x(cyVar.getContext());
        cyVar.c = cyVar.findViewById(com.facetec.sdk.R.id.zoomFeedbackContainer);
        cyVar.c.setBackground(x);
        cyVar.setPadding(10, 10, 10, 15);
        cyVar.c.setElevation(com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.l.elevation));
        cyVar.c.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        cyVar.c.setClipToOutline(false);
        cyVar.c.requestLayout();
        cyVar.f = android.animation.ObjectAnimator.ofFloat(cyVar.f3484a, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        cyVar.f.setDuration(500L);
        cyVar.f.addListener(cyVar.h);
        cyVar.j = android.animation.ObjectAnimator.ofFloat(cyVar.f3484a, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 1.0f);
        cyVar.j.setDuration(500L);
        float d = com.facetec.sdk.ay.d(com.facetec.sdk.dm.g().height);
        float b = com.facetec.sdk.dm.b();
        float d2 = com.facetec.sdk.ay.d(com.facetec.sdk.dm.g().width);
        float b2 = com.facetec.sdk.dm.b();
        cyVar.f3484a.getLayoutParams().height = (int) (d * b);
        cyVar.f3484a.getLayoutParams().width = (int) (d2 * b2);
        int round = java.lang.Math.round(com.facetec.sdk.ay.d(10) * com.facetec.sdk.dm.b() * com.facetec.sdk.dm.a());
        cyVar.f3484a.setPadding(round, java.lang.Math.round(round * 1.1f), round, round);
        cyVar.f3484a.requestLayout();
        com.facetec.sdk.cy cyVar2 = this.j;
        if (cyVar2.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) cyVar2.getLayoutParams();
            ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 212228493, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -212228465)).intValue();
            layoutParams.addRule(13, -1);
            layoutParams.setMargins(0, 0, 0, 0);
            cyVar2.requestLayout();
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.transitionView);
        this.f3411o = frameLayout;
        com.facetec.sdk.dm.e(frameLayout);
        this.n = new android.os.Handler(android.os.Looper.getMainLooper());
        this.l = new android.os.Handler();
        if (o2 == com.facetec.sdk.cs.READY_TO_START_FACESCAN_SESSION) {
            int i2 = E + 17;
            H = i2 % 128;
            if (i2 % 2 != 0) {
                d((android.content.Context) h);
            } else {
                d((android.content.Context) h);
                throw null;
            }
        }
        if (com.facetec.sdk.eb.d()) {
            int i3 = H + 27;
            E = i3 % 128;
            if (i3 % 2 != 0) {
                ((com.facetec.sdk.FaceTecSessionActivity) h).setTitle(" ");
                this.i.setImportantForAccessibility(0);
                this.i.setContentDescription(h.getString(com.facetec.sdk.R.string.FaceTec_accessibility_tap_guidance));
                dcVar = this.i;
                onTouchListener = new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                        boolean e2;
                        e2 = com.facetec.sdk.az.e(h, view2, motionEvent);
                        return e2;
                    }
                };
            } else {
                ((com.facetec.sdk.FaceTecSessionActivity) h).setTitle(" ");
                this.i.setImportantForAccessibility(1);
                this.i.setContentDescription(h.getString(com.facetec.sdk.R.string.FaceTec_accessibility_tap_guidance));
                dcVar = this.i;
                onTouchListener = new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                        boolean e2;
                        e2 = com.facetec.sdk.az.e(h, view2, motionEvent);
                        return e2;
                    }
                };
            }
            dcVar.setOnTouchListener(onTouchListener);
        }
        this.b.setEnabled(true);
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            E = (H + 41) % 128;
            int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue();
            if (intValue == 0) {
                intValue = com.facetec.sdk.R.drawable.facetec_cancel;
                com.facetec.sdk.t.c(h, com.facetec.sdk.c.CANCEL_BUTTON_RESOURCE_ID_ERROR, (java.lang.String) null, (java.lang.Throwable) null);
            }
            this.b.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(h, intValue));
        }
        int i4 = com.facetec.sdk.az.AnonymousClass1.e[com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d.ordinal()];
        if (i4 == 2) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.b.getLayoutParams();
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21);
            this.b.setLayoutParams(layoutParams2);
        } else if (i4 == 3 || i4 == 4) {
            this.b.setVisibility(8);
        }
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this.B);
        this.b.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.facetec.sdk.az.this.b(h, view2);
            }
        });
        this.b.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda14
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                boolean a4;
                a4 = com.facetec.sdk.az.this.a(view2, motionEvent);
                return a4;
            }
        });
        com.facetec.sdk.bf h2 = h();
        if (h2 != null) {
            H = (E + 37) % 128;
            h2.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.az.this.n();
                }
            });
        }
        this.k = false;
        this.i.setVisibility(0);
        this.i.setAlpha(1.0f);
        this.f3411o.setAlpha(0.0f);
        this.b.setAlpha(0.0f);
        new android.os.Handler().postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.this.p();
            }
        }), 0L);
    }

    private static void K(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 53) % 128;
            cArr = str.toCharArray();
            $11 = ($10 + 73) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr3 = new char[cArr2.length];
        hoVar.b = 0;
        char[] cArr4 = new char[2];
        while (hoVar.b < cArr2.length) {
            cArr4[0] = cArr2[hoVar.b];
            cArr4[1] = cArr2[hoVar.b + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (G ^ 2174069992062419062L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(I)};
                    java.lang.Object d = com.facetec.sdk.al.d(1497828241);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 211, 22 - android.widget.ExpandableListView.getPackedPositionChild(0L), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (C ^ 2174069992062419062L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(F)};
                    int i4 = charValue + i2;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 211 - android.view.KeyEvent.normalizeMetaState(0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                    i3++;
                    int i5 = $11 + 87;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[hoVar.b] = cArr4[0];
            cArr3[hoVar.b + 1] = cArr4[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d3 = com.facetec.sdk.al.d(-2113314280);
            if (d3 == null) {
                byte b = (byte) 0;
                d3 = com.facetec.sdk.al.c((char) (android.view.View.MeasureSpec.getSize(0) + 31541), 1912 - android.graphics.ImageFormat.getBitsPerPixel(0), 24 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 635836640, false, $$e(b, b, b), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d3).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    /* renamed from: com.facetec.sdk.az$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3412a;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                e[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                e[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.facetec.sdk.FaceTecSecurityWatermarkImage.values().length];
            f3412a = iArr2;
            try {
                iArr2[com.facetec.sdk.FaceTecSecurityWatermarkImage.FACETEC_ZOOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f3412a[com.facetec.sdk.FaceTecSecurityWatermarkImage.FACETEC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f3412a[com.facetec.sdk.FaceTecSecurityWatermarkImage.FACETEC_POWERED_BY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.facetec.sdk.bf bfVar, android.view.View view) {
        int i = H + 95;
        E = i % 128;
        if (i % 2 == 0) {
            if (this.s) {
                com.facetec.sdk.ap.e(bfVar, com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_FAIL);
                int i2 = H + 59;
                E = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 4;
                }
            }
            bfVar.o();
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        int i = E + 1;
        H = i % 128;
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            if (motionEvent.getAction() == 0) {
                this.b.setAlpha(0.4f);
            } else {
                if (motionEvent.getAction() != 3 && motionEvent.getX() >= 0.0f && motionEvent.getX() <= this.b.getWidth() + this.b.getLeft() + 10) {
                    int i2 = E + 91;
                    H = i2 % 128;
                    if (i2 % 2 != 0 ? motionEvent.getY() >= 0.0f : motionEvent.getY() >= 1.0f) {
                        if (motionEvent.getY() <= this.b.getHeight() + this.b.getTop() + 10) {
                            if (motionEvent.getAction() == 1) {
                                this.b.setAlpha(1.0f);
                                this.b.setEnabled(false);
                                if (h() == null) {
                                    return false;
                                }
                                this.b.performClick();
                            }
                        }
                    }
                }
                this.b.setAlpha(1.0f);
            }
            int i3 = H + 51;
            E = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        motionEvent.getAction();
        throw null;
    }

    private void e() {
        int i = E + 15;
        H = i % 128;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
            if (this.b == null) {
                return;
            }
        } else if (this.b == null) {
            return;
        }
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.B);
        E = (H + 113) % 128;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        E = (H + 85) % 128;
        super.onDestroy();
        e();
        int i = H + 19;
        E = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r4 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        return super.onCreateAnimator(r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r3 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 1.0f, 0.0f).setDuration(400L);
        com.facetec.sdk.az.E = (com.facetec.sdk.az.H + 61) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return r3;
     */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.animation.Animator onCreateAnimator(int i, boolean z, int i2) {
        int i3 = E + 29;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
    }

    private com.facetec.sdk.bf h() {
        int i = H + 113;
        E = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        com.facetec.sdk.bf bfVar = (com.facetec.sdk.bf) getActivity();
        int i2 = H + 93;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return bfVar;
    }

    private com.facetec.sdk.cn j() {
        H = (E + 43) % 128;
        com.facetec.sdk.bf h = h();
        if (h == null) {
            return null;
        }
        E = (H + 51) % 128;
        return h.f3415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0057, code lost:
    
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void p() {
        this.i.setVisibility(0);
        this.j.a();
        this.i.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
        this.f3411o.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT) {
            E = (H + 75) % 128;
        }
        this.b.setVisibility(0);
        this.b.animate().alpha(1.0f).setDuration(500L).setStartDelay(50L).setListener(null).start();
        int i = H + 19;
        E = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 4;
        }
        com.facetec.sdk.bf h = h();
        if (h == null) {
            return;
        }
        h.c.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        this.n.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.this.q();
            }
        }), 500L);
        this.n.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.this.t();
            }
        }), 1150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        int i = E + 39;
        H = i % 128;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.h) {
            return;
        }
        this.d.setAlpha(0.0f);
        if (com.facetec.sdk.bd.h) {
            this.d.setVisibility(4);
        } else {
            E = (H + 47) % 128;
            this.d.setVisibility(0);
            E = (H + 61) % 128;
        }
        this.f3410a.setAlpha(0.0f);
        this.w = false;
        this.i.d(false);
        int g = this.i.g() - (this.y << 1);
        if ((((int) this.i.b.bottom) - this.d.getHeight()) - (this.y << 1) >= g) {
            H = (E + 125) % 128;
            if (com.facetec.sdk.dm.c() < 1.4d) {
                this.d.setY(g);
            }
        }
        this.d.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        com.facetec.sdk.az azVar = (com.facetec.sdk.az) objArr[0];
        int i = H;
        E = (i + 21) % 128;
        azVar.k = true;
        int i2 = i + 99;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.content.Context context, com.facetec.sdk.bl blVar) {
        int i = H + 105;
        E = i % 128;
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            j();
            throw null;
        }
        com.facetec.sdk.cn j = j();
        if (j != null) {
            int i2 = H + 23;
            E = i2 % 128;
            if (i2 % 2 != 0) {
                j.e(context, blVar.h);
                obj.hashCode();
                throw null;
            }
            if (!j.e(context, blVar.h)) {
                H = (E + 89) % 128;
                com.facetec.sdk.bf h = h();
                if (h != null) {
                    E = (H + 57) % 128;
                    h.d(com.facetec.sdk.as.q);
                }
            }
        }
        int i3 = E + 101;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0.H = com.facetec.sdk.bl.d.FACESCAN_SESSION_STARTED;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(final android.content.Context context) {
        final com.facetec.sdk.bl blVar;
        int i = E + 41;
        H = i % 128;
        if (i % 2 == 0) {
            com.facetec.sdk.t.e = com.facetec.sdk.as.k;
            this.h = true;
            blVar = (com.facetec.sdk.bl) getActivity();
        } else {
            com.facetec.sdk.t.e = com.facetec.sdk.as.k;
            this.h = false;
            blVar = (com.facetec.sdk.bl) getActivity();
        }
        this.n.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.this.d(context, blVar);
            }
        }), 20L);
        com.facetec.sdk.t.c(com.facetec.sdk.de.FACE_SCAN_UNZOOMED);
        H = (E + 77) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        H = (E + 51) % 128;
        this.b.setImageResource(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue());
        this.i.c();
        E = (H + 83) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        E = (H + 105) % 128;
        this.v.release();
        int i = E + 41;
        H = i % 128;
        if (i % 2 == 0) {
            int i2 = 1 / 0;
        }
    }

    @Override // android.app.Fragment
    public final void onPause() {
        int i = H + 3;
        E = i % 128;
        if (i % 2 == 0) {
            super.onPause();
            android.os.Handler handler = this.n;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            android.os.Handler handler2 = this.l;
            if (handler2 != null) {
                E = (H + 55) % 128;
                handler2.removeCallbacksAndMessages(null);
            }
            android.os.Handler handler3 = this.m;
            if (handler3 != null) {
                handler3.removeCallbacksAndMessages(null);
            }
            com.facetec.sdk.cy cyVar = this.j;
            if (cyVar != null) {
                H = (E + 125) % 128;
                if (cyVar.i != null) {
                    cyVar.i.removeCallbacksAndMessages(null);
                    cyVar.i = null;
                }
            }
            android.os.Handler handler4 = this.x;
            if (handler4 != null) {
                handler4.removeCallbacksAndMessages(null);
                this.x = null;
                return;
            }
            return;
        }
        super.onPause();
        throw null;
    }

    private static /* synthetic */ java.lang.Object f(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        if (((android.view.MotionEvent) objArr[2]).getAction() == 1) {
            com.facetec.sdk.eb.b(context, com.facetec.sdk.eb.c.BLIND_USER_ASSIST_FACESCAN_FEEDBACK);
            H = (E + 117) % 128;
        }
        int i = E + 93;
        H = i % 128;
        if (i % 2 != 0) {
            return true;
        }
        throw null;
    }

    protected final class e implements com.facetec.sdk.cn.d {
        protected e() {
        }

        @Override // com.facetec.sdk.cn.d
        public final void d(com.facetec.sdk.cm cmVar, com.facetec.sdk.cl clVar) {
            com.facetec.sdk.az.a(com.facetec.sdk.az.this, cmVar, clVar);
        }

        @Override // com.facetec.sdk.cn.d
        public final void d() {
            com.facetec.sdk.az.a(com.facetec.sdk.az.this);
            com.facetec.sdk.az.c(com.facetec.sdk.az.this);
        }

        @Override // com.facetec.sdk.cn.d
        public final void a() {
            com.facetec.sdk.az.a(com.facetec.sdk.az.this);
            com.facetec.sdk.az.f(com.facetec.sdk.az.this);
        }

        @Override // com.facetec.sdk.cn.d
        public final void b() {
            com.facetec.sdk.az.a(com.facetec.sdk.az.this);
            com.facetec.sdk.az.j(com.facetec.sdk.az.this);
        }

        @Override // com.facetec.sdk.cn.d
        public final void e() {
            com.facetec.sdk.az.a(com.facetec.sdk.az.this);
            com.facetec.sdk.az.i(com.facetec.sdk.az.this);
        }
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        com.facetec.sdk.az azVar = (com.facetec.sdk.az) objArr[0];
        final com.facetec.sdk.bf bfVar = (com.facetec.sdk.bf) objArr[1];
        azVar.n.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.g(com.facetec.sdk.bf.this);
            }
        }));
        int i = H + 15;
        E = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(com.facetec.sdk.bf bfVar) {
        int i = E + 85;
        H = i % 128;
        bfVar.f();
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.facetec.sdk.bf bfVar) {
        H = (E + 1) % 128;
        bfVar.e();
        H = (E + 23) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final com.facetec.sdk.bf bfVar) {
        this.n.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.b(com.facetec.sdk.bf.this);
            }
        }));
        H = (E + 117) % 128;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        com.facetec.sdk.bf bfVar = (com.facetec.sdk.bf) objArr[0];
        int i = H + 29;
        E = i % 128;
        bfVar.c();
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.facetec.sdk.bf bfVar) {
        E = (H + 51) % 128;
        bfVar.i();
        int i = E + 55;
        H = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final com.facetec.sdk.bf bfVar) {
        this.n.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.a(com.facetec.sdk.bf.this);
            }
        }));
        int i = E + 57;
        H = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void f() {
        H = (E + 51) % 128;
        com.facetec.sdk.cn j = j();
        if (j != null) {
            j.e(this.f);
            this.f = null;
            H = (E + 113) % 128;
        }
    }

    private void i() {
        if (this.u) {
            return;
        }
        int i = H + 117;
        E = i % 128;
        if (i % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.s) {
            this.i.a();
            this.u = true;
            H = (E + 63) % 128;
        }
    }

    private void d(com.facetec.sdk.cm cmVar, com.facetec.sdk.cl clVar) {
        synchronized (this) {
            if (cmVar == com.facetec.sdk.cm.ZOOM_FAR) {
                g();
            }
            if (clVar == com.facetec.sdk.cl.HOLD_STEADY) {
                E = (H + 99) % 128;
                this.i.a();
                this.u = true;
            }
            com.facetec.sdk.cy cyVar = this.j;
            if (clVar != cyVar.b) {
                H = (E + 109) % 128;
                if (!cyVar.g) {
                    cyVar.b = clVar;
                    cyVar.e(com.facetec.sdk.cy.a(clVar));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5 != r0.d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        com.facetec.sdk.az.H = (com.facetec.sdk.az.E + 69) % 128;
        r0.d = r5;
        r0.g = false;
        com.facetec.sdk.eb.d(r0.d);
        com.facetec.sdk.dl.d(r0.f3484a, r0.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r5 != r0.d) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(com.facetec.sdk.ct ctVar) {
        synchronized (this) {
            E = (H + 117) % 128;
            g();
            com.facetec.sdk.cy cyVar = this.j;
            if (ctVar != cyVar.e && !cyVar.g) {
                cyVar.e = ctVar;
                int a2 = com.facetec.sdk.cy.a(ctVar);
                if (!cyVar.g) {
                    int i = H + 37;
                    E = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 12 / 0;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r2.i.f();
        com.facetec.sdk.az.H = (com.facetec.sdk.az.E + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r2.i.h() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r2.i.h() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g() {
        int i = E + 67;
        H = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
        int i3 = E + 73;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        java.lang.Object[] objArr;
        char c;
        java.lang.Object[] objArr2;
        java.lang.Object d = com.facetec.sdk.al.d(-1876633077);
        if (d == null) {
            char maximumDrawingCacheSize = (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1537);
            int size = android.view.View.MeasureSpec.getSize(0);
            int size2 = android.view.View.MeasureSpec.getSize(0);
            byte b = (byte) ($$a[0] - 1);
            byte b2 = (byte) (-b);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            J(b, b2, (byte) (b2 + 1), objArr3);
            d = com.facetec.sdk.al.c(maximumDrawingCacheSize, size + 708, 22 - size2, 936091891, false, (java.lang.String) objArr3[0], null);
        }
        long j = ((java.lang.reflect.Field) d).getLong(null);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        K("톋ᗆ許갮谕㢙풉膊텘ﲕ肒\ude46䲶冿べ骕희꧃쌋嬚ଭ\u0ad9", 22 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        K("䟽곎Ứ튟⺼衦蠬郉쀆뢲\u0bdf泜ⵟꪶ횒\uf268", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, objArr5);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d2 = com.facetec.sdk.al.d(-1877556598);
        if (d2 == null) {
            char packedPositionType = (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 1537);
            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
            int blue = android.graphics.Color.blue(0);
            byte b3 = (byte) 0;
            byte b4 = (byte) (b3 - 1);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            J(b3, b4, (byte) (b4 + 1), objArr6);
            d2 = com.facetec.sdk.al.c(packedPositionType, normalizeMetaState + 708, 22 - blue, 939112562, false, (java.lang.String) objArr6[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d2).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d3 = com.facetec.sdk.al.d(-1874786035);
            if (d3 == null) {
                char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16778753);
                long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                byte b5 = (byte) ($$a[0] + 1);
                byte b6 = (byte) (b5 - 4);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                J(b5, b6, (byte) (b6 + 1), objArr7);
                d3 = com.facetec.sdk.al.c(rgb, 708 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 21, 934179829, false, (java.lang.String) objArr7[0], null);
            }
            java.lang.Object[] objArr8 = (java.lang.Object[]) ((java.lang.reflect.Field) d3).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (java.lang.String[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}};
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = ~identityHashCode;
            int i2 = (~((-630516963) | i)) | 68455584 | (~(965305158 | i));
            int i3 = (((~(identityHashCode | (-403243781))) | i2) * 590) + 1639282096 + (i2 * (-1180)) + (((~(i | 630516962)) | (~((-965305159) | i))) * 590) + 962455294;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            c = 3;
        } else {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            K("\ue0f1瀫괢甎\ue90f凘톋ᗆ彮ㄺ蚧蒘獂➆\ue0ee黬", 16 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            K("蛷澋旻什\uaad5⫏麚\ueea5풙㨼衈ߌ㉼ᴒ楗\uf781", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr10);
            try {
                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr10[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 962455294};
                java.lang.Object d4 = com.facetec.sdk.al.d(1329445289);
                if (d4 == null) {
                    char lastIndexOf = (char) (1536 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                    float complexToFloat = android.util.TypedValue.complexToFloat(0);
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    byte b7 = (byte) ($$a[0] + 1);
                    byte b8 = (byte) (b7 - 4);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    J(b7, b8, (byte) (b8 + 1), objArr12);
                    d4 = com.facetec.sdk.al.c(lastIndexOf, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 708, (keyRepeatTimeout >> 16) + 22, -388840623, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d4).invoke(null, objArr11);
                java.lang.Object d5 = com.facetec.sdk.al.d(-1874786035);
                if (d5 == null) {
                    char red = (char) (1537 - android.graphics.Color.red(0));
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    byte b9 = (byte) ($$a[0] + 1);
                    byte b10 = (byte) (b9 - 4);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    J(b9, b10, (byte) (b10 + 1), objArr13);
                    d5 = com.facetec.sdk.al.c(red, (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 21 - indexOf, 934179829, false, (java.lang.String) objArr13[0], null);
                }
                ((java.lang.reflect.Field) d5).set(null, objArr);
                try {
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    K("톋ᗆ許갮谕㢙풉膊텘ﲕ肒\ude46䲶冿べ骕희꧃쌋嬚ଭ\u0ad9", 22 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr14);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    K("䟽곎Ứ튟⺼衦蠬郉쀆뢲\u0bdf泜ⵟꪶ횒\uf268", 15 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr15);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr15[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d6 = com.facetec.sdk.al.d(-1877556598);
                    if (d6 == null) {
                        char blue2 = (char) (android.graphics.Color.blue(0) + 1537);
                        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 - 1);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        J(b11, b12, (byte) (b12 + 1), objArr16);
                        d6 = com.facetec.sdk.al.c(blue2, 707 - bitsPerPixel, 22 - combineMeasuredStates, 939112562, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d6).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1876633077);
                    if (d7 == null) {
                        char c2 = (char) (1537 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                        byte b13 = (byte) ($$a[0] - 1);
                        byte b14 = (byte) (-b13);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        J(b13, b14, (byte) (b14 + 1), objArr17);
                        d7 = com.facetec.sdk.al.c(c2, 707 - lastIndexOf2, (-16777194) - rgb2, 936091891, false, (java.lang.String) objArr17[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                    c = 3;
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[c];
        int i6 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i7 = ((int[]) obj2)[0];
        if (i7 != i6) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr[2];
            if (strArr != null) {
                for (java.lang.String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new java.lang.RuntimeException(java.lang.String.valueOf(i7));
        }
        int i8 = ((int[]) objArr[0])[0];
        java.lang.Object[] objArr18 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj)[0]}};
        int i9 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
        int i10 = i8 + (((r1 | 1589653288) * 614) - 1619976680) + (((~((-518987433) | i9)) | 515903016 | (~(1076834688 | i9))) * (-1228)) + (((~(i9 | (-3084417))) | (~(1592737704 | i9))) * 614);
        int i11 = (i10 << 13) ^ i10;
        int i12 = i11 ^ (i11 >>> 17);
        ((int[]) objArr18[0])[0] = i12 ^ (i12 << 5);
        H = (E + 87) % 128;
        java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
        if (d8 == null) {
            char combineMeasuredStates2 = (char) (android.view.View.combineMeasuredStates(0, 0) + 1537);
            int argb = android.graphics.Color.argb(0, 0, 0, 0);
            int lastIndexOf3 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            byte b15 = (byte) ($$a[0] - 1);
            byte b16 = (byte) (-b15);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            J(b15, b16, (byte) (b16 + 1), objArr19);
            d8 = com.facetec.sdk.al.c(combineMeasuredStates2, 708 - argb, 21 - lastIndexOf3, 936091891, false, (java.lang.String) objArr19[0], null);
        }
        long j2 = ((java.lang.reflect.Field) d8).getLong(null);
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        K("톋ᗆ許갮谕㢙풉膊텘ﲕ肒\ude46䲶冿べ骕희꧃쌋嬚ଭ\u0ad9", android.text.TextUtils.getCapsMode("", 0, 0) + 22, objArr20);
        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr20[0]);
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        K("䟽곎Ứ튟⺼衦蠬郉쀆뢲\u0bdf泜ⵟꪶ횒\uf268", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 15, objArr21);
        long longValue3 = ((java.lang.Long) cls4.getDeclaredMethod((java.lang.String) objArr21[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d9 = com.facetec.sdk.al.d(-1877556598);
        if (d9 == null) {
            char c3 = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1536);
            float minVolume = android.media.AudioTrack.getMinVolume();
            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte b17 = (byte) 0;
            byte b18 = (byte) (b17 - 1);
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            J(b17, b18, (byte) (b18 + 1), objArr22);
            d9 = com.facetec.sdk.al.c(c3, 708 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 'F' - mirror, 939112562, false, (java.lang.String) objArr22[0], null);
        }
        if (j2 == ((longValue3 - ((((java.lang.reflect.Field) d9).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d10 = com.facetec.sdk.al.d(-1874786035);
            if (d10 == null) {
                char c4 = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1537);
                int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                byte b19 = (byte) ($$a[0] + 1);
                byte b20 = (byte) (b19 - 4);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                J(b19, b20, (byte) (b20 + 1), objArr23);
                d10 = com.facetec.sdk.al.c(c4, 708 - packedPositionGroup, (maxKeyCode >> 16) + 22, 934179829, false, (java.lang.String) objArr23[0], null);
            }
            java.lang.Object[] objArr24 = (java.lang.Object[]) ((java.lang.reflect.Field) d10).get(null);
            objArr2 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr24[1])[0]}, (java.lang.String[]) objArr24[2], new int[]{((int[]) objArr24[3])[0]}};
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i13 = ((((~((-816068081) | identityHashCode2)) | (-1056849913)) * (-502)) - 1649366280) + ((~((~identityHashCode2) | (-277095873))) * (-502)) + (((~(identityHashCode2 | (-779754041))) | (-816068081)) * 502) + 1084119892;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr2[0])[0] = i15 ^ (i15 << 5);
        } else {
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            K("\ue0f1瀫괢甎\ue90f凘톋ᗆ彮ㄺ蚧蒘獂➆\ue0ee黬", android.view.Gravity.getAbsoluteGravity(0, 0) + 16, objArr25);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr25[0]);
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            K("蛷澋旻什\uaad5⫏麚\ueea5풙㨼衈ߌ㉼ᴒ楗\uf781", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr26);
            java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(((java.lang.Integer) cls5.getMethod((java.lang.String) objArr26[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 1084119892};
            java.lang.Object d11 = com.facetec.sdk.al.d(1329445289);
            if (d11 == null) {
                char keyRepeatDelay = (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1537);
                int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                int blue3 = android.graphics.Color.blue(0);
                byte b21 = (byte) ($$a[0] + 1);
                byte b22 = (byte) (b21 - 4);
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                J(b21, b22, (byte) (b22 + 1), objArr28);
                d11 = com.facetec.sdk.al.c(keyRepeatDelay, 708 - (scrollBarSize >> 8), 22 - blue3, -388840623, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) d11).invoke(null, objArr27);
            java.lang.Object d12 = com.facetec.sdk.al.d(-1874786035);
            if (d12 == null) {
                char c5 = (char) (1538 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
                int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                byte b23 = (byte) ($$a[0] + 1);
                byte b24 = (byte) (b23 - 4);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                J(b23, b24, (byte) (b24 + 1), objArr29);
                d12 = com.facetec.sdk.al.c(c5, 708 - (maxKeyCode2 >> 16), 22 - (scrollBarSize2 >> 8), 934179829, false, (java.lang.String) objArr29[0], null);
            }
            ((java.lang.reflect.Field) d12).set(null, objArr2);
            try {
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                K("톋ᗆ許갮谕㢙풉膊텘ﲕ肒\ude46䲶冿べ骕희꧃쌋嬚ଭ\u0ad9", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 22, objArr30);
                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                K("䟽곎Ứ튟⺼衦蠬郉쀆뢲\u0bdf泜ⵟꪶ횒\uf268", 15 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr31);
                long longValue4 = ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr31[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Object d13 = com.facetec.sdk.al.d(-1877556598);
                if (d13 == null) {
                    char c6 = (char) (1538 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                    float minVolume2 = android.media.AudioTrack.getMinVolume();
                    byte b25 = (byte) 0;
                    byte b26 = (byte) (b25 - 1);
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    J(b25, b26, (byte) (b26 + 1), objArr32);
                    d13 = com.facetec.sdk.al.c(c6, 708 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 22 - (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)), 939112562, false, (java.lang.String) objArr32[0], null);
                }
                ((java.lang.reflect.Field) d13).set(null, java.lang.Long.valueOf(longValue4));
                java.lang.Object d14 = com.facetec.sdk.al.d(-1876633077);
                if (d14 == null) {
                    char gidForName = (char) (1536 - android.os.Process.getGidForName(""));
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    byte b27 = (byte) ($$a[0] - 1);
                    byte b28 = (byte) (-b27);
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    J(b27, b28, (byte) (b28 + 1), objArr33);
                    d14 = com.facetec.sdk.al.c(gidForName, 708 - makeMeasureSpec, (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 21, 936091891, false, (java.lang.String) objArr33[0], null);
                }
                ((java.lang.reflect.Field) d14).set(null, java.lang.Long.valueOf(longValue4 >> 11));
            } catch (java.lang.Exception unused2) {
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.Object obj3 = objArr2[3];
        int i16 = ((int[]) obj3)[0];
        java.lang.Object obj4 = objArr2[1];
        int i17 = ((int[]) obj4)[0];
        if (i17 == i16) {
            E = (H + 39) % 128;
            int i18 = ((int[]) objArr2[0])[0];
            java.lang.Object[] objArr34 = {new int[1], new int[]{((int[]) obj4)[0]}, (java.lang.String[]) objArr2[2], new int[]{((int[]) obj3)[0]}};
            int identityHashCode3 = java.lang.System.identityHashCode(this);
            int i19 = ~identityHashCode3;
            int i20 = i18 + (((~((-320567071) | identityHashCode3)) | (~(1275255050 | i19))) * (-1808)) + 1846314696 + (((~((-151819) | identityHashCode3)) | (~(1595670302 | i19))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(identityHashCode3 | (-1275255051))) | 320415252 | (~(i19 | 320567070))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr34[0])[0] = i22 ^ (i22 << 5);
            return;
        }
        int i23 = 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String[] strArr2 = (java.lang.String[]) objArr2[2];
        if (strArr2 != null) {
            while (i23 < strArr2.length) {
                int i24 = H + 59;
                E = i24 % 128;
                if (i24 % 2 != 0) {
                    arrayList2.add(strArr2[i23]);
                    i23 += 3;
                } else {
                    arrayList2.add(strArr2[i23]);
                    i23++;
                }
                int i25 = H + 83;
                E = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 3 / 5;
                }
            }
        }
        throw new java.lang.RuntimeException(java.lang.String.valueOf(i17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        H = (E + 33) % 128;
        this.j.d();
        H = (E + 5) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        H = (E + 113) % 128;
        if (com.facetec.sdk.cq.j() == com.facetec.sdk.cm.ZOOM_CLOSE) {
            int i = H + 47;
            E = i % 128;
            if (i % 2 != 0) {
                com.facetec.sdk.eb.b(h(), com.facetec.sdk.eb.c.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
                int i2 = 46 / 0;
            } else {
                com.facetec.sdk.eb.b(h(), com.facetec.sdk.eb.c.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
            }
        }
        int i3 = H + 117;
        E = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void b() {
        java.util.concurrent.Semaphore semaphore;
        if (c() && (semaphore = this.v) != null) {
            H = (E + 73) % 128;
            try {
                if (semaphore.tryAcquire(2000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    int i = H + 39;
                    E = i % 128;
                    if (i % 2 == 0) {
                        this.v.release();
                    } else {
                        this.v.release();
                        throw null;
                    }
                }
            } catch (java.lang.InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static /* synthetic */ java.lang.Object i(java.lang.Object[] objArr) {
        com.facetec.sdk.az azVar = (com.facetec.sdk.az) objArr[0];
        com.facetec.sdk.cs csVar = (com.facetec.sdk.cs) objArr[1];
        com.facetec.sdk.ct ctVar = (com.facetec.sdk.ct) objArr[3];
        if (csVar == com.facetec.sdk.cs.TIMEOUT_GO_TO_RETRY) {
            com.facetec.sdk.cn j = azVar.j();
            if (j != null) {
                j.i();
                j.b(azVar.D);
            }
            com.facetec.sdk.bf h = azVar.h();
            if (h != null) {
                int i = H + 45;
                E = i % 128;
                if (i % 2 != 0) {
                    h.h();
                    int i2 = 81 / 0;
                } else {
                    h.h();
                }
            }
            return null;
        }
        if (azVar.k && csVar != com.facetec.sdk.cs.DETECTING_LIGHT_MODE) {
            if (csVar == com.facetec.sdk.cs.DETECTING_FACE_FEEDBACK) {
                if (azVar.c()) {
                    E = (H + 39) % 128;
                    if (!azVar.h) {
                        azVar.c = ctVar;
                        azVar.e(ctVar);
                        H = (E + 5) % 128;
                        return null;
                    }
                }
            } else {
                com.facetec.sdk.cn j2 = azVar.j();
                if (j2 != null) {
                    j2.i();
                    j2.b(azVar.D);
                    H = (E + 47) % 128;
                }
                azVar.d((android.content.Context) azVar.h());
            }
        }
        return null;
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        int i;
        final com.facetec.sdk.az azVar = (com.facetec.sdk.az) objArr[0];
        java.lang.Runnable runnable = (java.lang.Runnable) objArr[1];
        boolean booleanValue = ((java.lang.Boolean) objArr[2]).booleanValue();
        E = (H + 11) % 128;
        azVar.i();
        if (booleanValue) {
            i = 400;
        } else {
            int i2 = H + 75;
            E = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 3;
            }
            i = 300;
        }
        com.facetec.sdk.dc dcVar = azVar.i;
        if (dcVar.m != null) {
            int i4 = E + 73;
            H = i4 % 128;
            if (i4 % 2 == 0) {
                dcVar.m.cancel();
                throw null;
            }
            dcVar.m.cancel();
        }
        if (dcVar.i != null) {
            int i5 = E + 13;
            H = i5 % 128;
            if (i5 % 2 == 0) {
                dcVar.i.cancel();
                int i6 = 83 / 0;
            } else {
                dcVar.i.cancel();
            }
        }
        if (dcVar.n != null) {
            dcVar.n.cancel();
        }
        azVar.i.a(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.az.this.l();
            }
        }), booleanValue);
        try {
            azVar.v.acquire();
        } catch (java.lang.InterruptedException e2) {
            e2.printStackTrace();
        }
        azVar.b.setVisibility(4);
        azVar.g.setVisibility(4);
        com.facetec.sdk.dm.i(azVar.f3411o);
        azVar.f3411o.animate().alpha(1.0f).setDuration(i + 100).setStartDelay(0L).setListener(null).start();
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(i);
        duration.playTogether(android.animation.ObjectAnimator.ofFloat(azVar.d, (android.util.Property<android.widget.LinearLayout, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(azVar.j, (android.util.Property<com.facetec.sdk.cy, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(azVar.b, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(azVar.j, (android.util.Property<com.facetec.sdk.cy, java.lang.Float>) android.view.View.TRANSLATION_Y, (-azVar.j.getHeight()) / 2));
        duration.start();
        runnable.run();
        return null;
    }

    static /* synthetic */ void a(final com.facetec.sdk.az azVar, com.facetec.sdk.cm cmVar, com.facetec.sdk.cl clVar) {
        com.facetec.sdk.bf h = azVar.h();
        if (azVar.c()) {
            int i = H + 73;
            E = i % 128;
            if (i % 2 != 0) {
                int i2 = 72 / 0;
                if (h == null) {
                    return;
                }
            } else if (h == null) {
                return;
            }
            java.lang.Object obj = null;
            if (azVar.i.h()) {
                int i3 = E + 51;
                H = i3 % 128;
                if (i3 % 2 == 0) {
                    com.facetec.sdk.cl clVar2 = com.facetec.sdk.cl.HOLD_STEADY;
                    obj.hashCode();
                    throw null;
                }
                if (clVar == com.facetec.sdk.cl.HOLD_STEADY && !azVar.w) {
                    int i4 = H + 51;
                    E = i4 % 128;
                    if (i4 % 2 != 0) {
                        azVar.f3410a.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                        azVar.w = false;
                    } else {
                        azVar.f3410a.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                        azVar.w = true;
                    }
                }
            }
            if (!azVar.s && clVar != com.facetec.sdk.cl.FACE_NOT_FOUND) {
                azVar.s = true;
                if (!azVar.r) {
                    H = (E + 111) % 128;
                    azVar.r = true;
                    com.facetec.sdk.cg.a(h);
                }
                h.g();
            }
            if (azVar.c()) {
                int i5 = H;
                int i6 = i5 + 59;
                E = i6 % 128;
                if (i6 % 2 != 0) {
                    boolean z = azVar.h;
                    obj.hashCode();
                    throw null;
                }
                if (azVar.h) {
                    return;
                }
                E = (i5 + 73) % 128;
                com.facetec.sdk.cm cmVar2 = azVar.q;
                if (cmVar2 != cmVar) {
                    E = (i5 + 99) % 128;
                    if (cmVar2 != null) {
                        azVar.i();
                    }
                    azVar.q = cmVar;
                    azVar.u = false;
                }
                if (cmVar == com.facetec.sdk.cm.ZOOM_CLOSE) {
                    com.facetec.sdk.t.e = com.facetec.sdk.as.n;
                    if (!azVar.i.h()) {
                        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.az.this.o();
                            }
                        });
                        com.facetec.sdk.dc dcVar = azVar.i;
                        dcVar.setOvalHasExpanded(true);
                        dcVar.a(dcVar.m);
                        if (com.facetec.sdk.eb.d()) {
                            H = (E + 97) % 128;
                            com.facetec.sdk.eb.a(azVar.h(), azVar.getString(com.facetec.sdk.R.string.FaceTec_accessibility_feedback_move_phone_closer));
                        }
                        if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                            com.facetec.sdk.eb.b(azVar.h(), com.facetec.sdk.eb.c.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC);
                            android.os.Handler handler = new android.os.Handler();
                            azVar.x = handler;
                            handler.postDelayed(azVar.z, 4500L);
                        }
                        if (com.facetec.sdk.FaceTecSDK.f3366a.l.enablePulsatingText) {
                            android.os.Handler handler2 = new android.os.Handler();
                            azVar.m = handler2;
                            handler2.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.az.this.m();
                                }
                            }), 3000L);
                        }
                        com.facetec.sdk.t.c(com.facetec.sdk.de.FACE_SCAN_ZOOMED);
                    }
                }
                azVar.d(cmVar, clVar);
            }
        }
    }

    static /* synthetic */ void f(com.facetec.sdk.az azVar) {
        H = (E + 33) % 128;
        azVar.A = false;
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) azVar.getActivity();
        if (blVar != null) {
            blVar.N.e();
        }
        final com.facetec.sdk.bf h = azVar.h();
        if (h != null) {
            azVar.f();
            if (azVar.r) {
                int i = E + 55;
                H = i % 128;
                if (i % 2 == 0) {
                    com.facetec.sdk.cg.b(h);
                    azVar.r = true;
                } else {
                    com.facetec.sdk.cg.b(h);
                    azVar.r = false;
                }
            }
            if (azVar.p) {
                try {
                    azVar.p = false;
                    H = (E + 37) % 128;
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                }
            }
            com.facetec.sdk.ap.e(h, com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_SUCCESS);
            azVar.n.post(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.az.c(com.facetec.sdk.bf.this);
                }
            });
        }
    }

    static /* synthetic */ void j(final com.facetec.sdk.az azVar) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) azVar.getActivity();
        if (blVar != null) {
            H = (E + 59) % 128;
            blVar.N.e();
        }
        final com.facetec.sdk.bf h = azVar.h();
        if (azVar.c()) {
            E = (H + 103) % 128;
            if (h == null) {
                return;
            }
            azVar.f();
            com.facetec.sdk.cg.d(h);
            if (azVar.s) {
                int i = H + 59;
                E = i % 128;
                if (i % 2 == 0) {
                    com.facetec.sdk.ap.e(h, com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_FAIL);
                } else {
                    com.facetec.sdk.ap.e(h, com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_FAIL);
                    throw null;
                }
            }
            a(-1443584754, com.facetec.sdk.ob.c(), 1443584754, new java.lang.Object[]{azVar, new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.az.this.j(h);
                }
            }), false}, com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c());
        }
    }

    static /* synthetic */ void i(final com.facetec.sdk.az azVar) {
        final com.facetec.sdk.bf h;
        if (!azVar.A) {
            int i = E + 71;
            H = i % 128;
            if (i % 2 == 0) {
                azVar.A = false;
                h = azVar.h();
                if (!azVar.c()) {
                    return;
                }
            } else {
                azVar.A = true;
                h = azVar.h();
                if (!azVar.c()) {
                    return;
                }
            }
            int i2 = E + 69;
            H = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (h == null) {
                return;
            }
            a(-1443584754, com.facetec.sdk.ob.c(), 1443584754, new java.lang.Object[]{azVar, new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.az$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.az.this.d(h);
                }
            }), true}, com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c());
        }
        E = (H + 53) % 128;
    }

    static void d() {
        C = (char) 13757;
        F = (char) 63303;
        G = (char) 3946;
        I = (char) 17332;
    }

    static /* synthetic */ void c(com.facetec.sdk.az azVar) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        a(1519787320, com.facetec.sdk.ob.c(), -1519787312, new java.lang.Object[]{azVar}, com.facetec.sdk.ob.c(), c, c2);
    }

    static /* synthetic */ boolean d(com.facetec.sdk.az azVar) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        return ((java.lang.Boolean) a(197541708, com.facetec.sdk.ob.c(), -197541705, new java.lang.Object[]{azVar}, com.facetec.sdk.ob.c(), c, c2)).booleanValue();
    }

    static /* synthetic */ void e(com.facetec.sdk.az azVar) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        a(1651130749, com.facetec.sdk.ob.c(), -1651130742, new java.lang.Object[]{azVar}, com.facetec.sdk.ob.c(), c, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        a(-338406226, com.facetec.sdk.ob.c(), 338406228, new java.lang.Object[]{this}, com.facetec.sdk.ob.c(), c, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(android.content.Context context, android.view.View view, android.view.MotionEvent motionEvent) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        return ((java.lang.Boolean) a(-1832005620, com.facetec.sdk.ob.c(), 1832005626, new java.lang.Object[]{context, view, motionEvent}, com.facetec.sdk.ob.c(), c, c2)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(com.facetec.sdk.bf bfVar) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        a(1017276920, com.facetec.sdk.ob.c(), -1017276916, new java.lang.Object[]{this, bfVar}, com.facetec.sdk.ob.c(), c, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.facetec.sdk.bf bfVar) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        a(812653919, com.facetec.sdk.ob.c(), -812653918, new java.lang.Object[]{bfVar}, com.facetec.sdk.ob.c(), c, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.facetec.sdk.cs csVar, com.facetec.sdk.cr crVar, com.facetec.sdk.ct ctVar, com.facetec.sdk.cv cvVar) {
        int c = com.facetec.sdk.ob.c();
        int c2 = com.facetec.sdk.ob.c();
        a(1713583306, com.facetec.sdk.ob.c(), -1713583301, new java.lang.Object[]{this, csVar, crVar, ctVar, cvVar}, com.facetec.sdk.ob.c(), c, c2);
    }

    private void e(java.lang.Runnable runnable, boolean z) {
        a(-1443584754, com.facetec.sdk.ob.c(), 1443584754, new java.lang.Object[]{this, runnable, java.lang.Boolean.valueOf(z)}, com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c(), com.facetec.sdk.ob.c());
    }
}
