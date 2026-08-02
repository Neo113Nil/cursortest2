package com.facetec.sdk;

/* loaded from: classes8.dex */
abstract class bg extends com.facetec.sdk.au {
    private com.facetec.sdk.bz A;
    private com.facetec.sdk.cn.e D;

    /* renamed from: a, reason: collision with root package name */
    protected android.widget.ImageView f3417a;
    protected android.widget.RelativeLayout b;
    protected android.view.ViewGroup c;
    protected com.facetec.sdk.bh d;
    protected com.facetec.sdk.e e;
    protected android.view.View f;
    protected android.animation.Animator g;
    protected android.view.ViewGroup i;
    private android.widget.ImageView l;
    private android.widget.TextView n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f3418o;
    private android.widget.TextView p;
    private android.widget.TextView q;
    private android.widget.ImageView r;
    private android.widget.TextView s;
    private android.widget.TextView t;
    private android.view.View u;
    private android.animation.Animator v;
    private android.os.Handler x;
    private android.animation.AnimatorSet y;
    private java.lang.Runnable z;
    private boolean w = false;
    protected boolean j = false;
    protected boolean h = false;
    protected boolean m = false;
    boolean k = false;
    private android.os.Handler C = new android.os.Handler(android.os.Looper.getMainLooper());
    private com.facetec.sdk.au.b B = null;
    private final com.facetec.sdk.bz.d H = new com.facetec.sdk.bz.d() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda1
        @Override // com.facetec.sdk.bz.d
        public final void onDarkLightDetected() {
            com.facetec.sdk.bg.this.H();
        }
    };
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener I = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.bg.3
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (com.facetec.sdk.bg.this.k) {
                return;
            }
            com.facetec.sdk.bg.this.k = true;
            float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
            int d = (int) (com.facetec.sdk.ay.d(50) * a2);
            int d2 = (int) (com.facetec.sdk.ay.d(35) * a2);
            int d3 = com.facetec.sdk.dm.d();
            float f = d3 / 2.0f;
            int round = java.lang.Math.round(f);
            int round2 = java.lang.Math.round(f);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bg.this.i.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, d3);
            com.facetec.sdk.bg.this.i.setLayoutParams(layoutParams);
            com.facetec.sdk.bg.this.e.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int) ((com.facetec.sdk.dp.b().width * com.facetec.sdk.dm.b()) - (d3 << 1)), d));
            com.facetec.sdk.bg.this.e.requestLayout();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bg.this.f3417a.getLayoutParams();
            layoutParams2.setMargins(round, round, 0, 0);
            layoutParams2.setMarginStart(round);
            layoutParams2.setMarginEnd(round);
            com.facetec.sdk.bg.this.f3417a.setLayoutParams(layoutParams2);
            com.facetec.sdk.bg.this.f3417a.setPadding(round2, round2, round2, round2);
            com.facetec.sdk.bg.this.f3417a.getLayoutParams().height = d2;
            com.facetec.sdk.bg.this.f3417a.getLayoutParams().width = d2;
            com.facetec.sdk.bg.this.f3417a.requestLayout();
            com.facetec.sdk.bg.this.f.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        }
    };

    protected abstract void a();

    protected abstract void b();

    protected abstract void d();

    protected abstract void e();

    protected abstract boolean f();

    protected abstract void i();

    protected bg() {
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        x();
        com.facetec.sdk.e eVar = this.e;
        if (eVar != null) {
            eVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.I);
        }
    }

    final com.facetec.sdk.bf h() {
        return (com.facetec.sdk.bf) getActivity();
    }

    final com.facetec.sdk.bl g() {
        return (com.facetec.sdk.bl) getActivity();
    }

    private com.facetec.sdk.cn r() {
        com.facetec.sdk.bl g = g();
        if (g != null) {
            return g.f3415a;
        }
        return null;
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onPause() {
        java.lang.Runnable runnable;
        super.onPause();
        this.u.removeCallbacks(null);
        android.animation.AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.os.Handler handler = this.x;
        if (handler == null || (runnable = this.z) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    @Override // android.app.Fragment
    public android.animation.Animator onCreateAnimator(int i, boolean z, int i2) {
        android.animation.Animator animator;
        android.animation.Animator animator2;
        return (!z || (animator2 = this.v) == null) ? (z || (animator = this.g) == null) ? super.onCreateAnimator(i, z, i2) : animator : animator2;
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_guidance_fragment, viewGroup, false);
        this.u = inflate;
        return inflate;
    }

    @Override // android.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.facetec.sdk.az.e = false;
        this.f = view.findViewById(com.facetec.sdk.R.id.centerContentView);
        this.d = (com.facetec.sdk.bh) view.findViewById(com.facetec.sdk.R.id.zoomDialogBackground);
        this.i = (android.view.ViewGroup) view.findViewById(com.facetec.sdk.R.id.bottomLayout);
        this.c = (android.view.ViewGroup) view.findViewById(com.facetec.sdk.R.id.zoomDialogForeground);
        this.f3417a = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.backButton);
        this.f3418o = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.zoomDialogIconSubtext);
        this.l = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.iconImageView);
        this.n = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.zoomDialogHeader);
        this.q = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageView1);
        this.p = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageView2);
        this.t = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.zoomDialogText3);
        this.s = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.zoomDialogText4);
        this.e = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.zoomDialogActionButton);
        this.b = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.guidanceTransitionView);
        com.facetec.sdk.bl g = g();
        if (r() != null && g != null && g.a() == com.facetec.sdk.bf.e.GRANTED && !this.h) {
            e(g, this.m);
        }
        this.r = g.x;
        o();
    }

    final android.widget.ImageView j() {
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            return this.r;
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            return this.f3417a;
        }
        return null;
    }

    final void c(boolean z) {
        if (c() && com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.r.setEnabled(z);
        }
    }

    final void b(final boolean z, int i, int i2) {
        final android.widget.ImageView j;
        if (c() && (j = j()) != null) {
            float f = z ? 1.0f : 0.0f;
            if (i == 0 && i2 == 0) {
                j.setAlpha(f);
                j.setVisibility(z ? 0 : 8);
            } else {
                if (z) {
                    j.setVisibility(0);
                }
                j.animate().alpha(f).setDuration(i).setStartDelay(i2).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bg.this.a(z, j);
                    }
                })).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, android.widget.ImageView imageView) {
        if (c() && !z) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.facetec.sdk.bl g = g();
        if (g != null) {
            g.N.a(java.lang.Boolean.TRUE);
        }
    }

    private void b(com.facetec.sdk.cv cvVar) {
        if (f()) {
            if (com.facetec.sdk.eb.d()) {
                if (this.e.isEnabled()) {
                    return;
                }
                this.e.a(true, true);
                return;
            }
            int i = com.facetec.sdk.bg.AnonymousClass1.b[cvVar.ordinal()];
            if (i == 1) {
                if (this.e.isEnabled()) {
                    return;
                }
                this.e.a(true, true);
            } else if (i == 2 && this.e.isEnabled() && !this.j) {
                this.e.a(false, true);
            }
        }
    }

    private void s() {
        x();
        com.facetec.sdk.cn r = r();
        if (r != null) {
            r.b(this.D);
            this.D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(com.facetec.sdk.cs csVar, com.facetec.sdk.cr crVar, com.facetec.sdk.ct ctVar, com.facetec.sdk.cv cvVar) {
        com.facetec.sdk.bl g;
        if (this.w || !c() || (g = g()) == null) {
            return;
        }
        if (csVar == com.facetec.sdk.cs.TIMEOUT_GO_TO_RETRY) {
            if (g.f3415a != null) {
                com.facetec.sdk.cn cnVar = g.f3415a;
                if (com.facetec.sdk.cn.k() && f()) {
                    s();
                    q().run();
                    return;
                }
            }
            b(cvVar);
            s();
            g.h();
            return;
        }
        if (csVar == com.facetec.sdk.cs.DETECTING_LIGHT_MODE) {
            b(cvVar);
            int i = com.facetec.sdk.bg.AnonymousClass1.c[crVar.ordinal()];
            if (i == 2) {
                g.N.b();
            } else if (i == 3) {
                g.N.a(java.lang.Boolean.FALSE);
            }
            if (cvVar == com.facetec.sdk.cv.ENABLE) {
                boolean f = f();
                boolean z = this.j;
                boolean isEnabled = this.e.isEnabled();
                boolean z2 = this.B != null;
                if (f && z && isEnabled && !z2) {
                    t();
                    com.facetec.sdk.au.b q = q();
                    this.B = q;
                    this.C.postDelayed(q, 2000L);
                    return;
                }
                return;
            }
            t();
            return;
        }
        s();
    }

    private com.facetec.sdk.au.b q() {
        return new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bg.this.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        t();
        if (g() == null || g().G) {
            return;
        }
        boolean f = f();
        boolean z = this.j || com.facetec.sdk.eb.d();
        boolean isEnabled = this.e.isEnabled();
        if (f && z && isEnabled) {
            D();
        }
    }

    private void t() {
        this.C.removeCallbacksAndMessages(null);
        this.B = null;
    }

    private void y() {
        this.x = new android.os.Handler();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bg.this.C();
            }
        };
        this.z = runnable;
        this.x.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (c() && !this.e.d && !this.w && this.e.isEnabled()) {
            this.e.a(true, false);
        }
        this.x.postDelayed(this.z, 5000L);
    }

    protected final void e(final android.content.Context context, final boolean z) {
        com.facetec.sdk.bl g = g();
        if (g != null) {
            g.H = com.facetec.sdk.bl.d.PRE_SESSION_STARTED;
        }
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bg.this.b(context, z);
            }
        }, 20L);
        y();
        if (com.facetec.sdk.FaceTecSDK.e == com.facetec.sdk.FaceTecSDK.b.NORMAL) {
            if (r() != null) {
                v();
            }
            a(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bg.this.B();
                }
            }, 185L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.content.Context context, boolean z) {
        com.facetec.sdk.cn r = r();
        if (r != null) {
            com.facetec.sdk.cn.e eVar = new com.facetec.sdk.cn.e() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda5
                @Override // com.facetec.sdk.cn.e
                public final void onPreSessionProgress(com.facetec.sdk.cs csVar, com.facetec.sdk.cr crVar, com.facetec.sdk.ct ctVar, com.facetec.sdk.cv cvVar) {
                    com.facetec.sdk.bg.this.e(csVar, crVar, ctVar, cvVar);
                }
            };
            this.D = eVar;
            r.c(eVar);
            if (r.b(context, z) || g() == null) {
                return;
            }
            g().d(com.facetec.sdk.as.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        com.facetec.sdk.cn r = r();
        com.facetec.sdk.bz bzVar = this.A;
        if (bzVar == null || r == null) {
            return;
        }
        bzVar.d(this.H, r);
    }

    private void v() {
        if (g() == null) {
            return;
        }
        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bg.this.A();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.A = com.facetec.sdk.bz.a(g());
    }

    private void x() {
        com.facetec.sdk.bz bzVar = this.A;
        if (bzVar != null) {
            bzVar.c();
            this.A = null;
        }
    }

    final void n() {
        if (this.f3417a == null || com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            return;
        }
        this.f3417a.setImageResource(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue());
    }

    final void k() {
        if (c()) {
            com.facetec.sdk.e eVar = this.e;
            if (eVar == null || this.f3417a == null) {
                com.facetec.sdk.t.c(g(), com.facetec.sdk.c.NON_FATAL_ERROR, "XML views are null unexpectedly. [0]", (java.lang.Throwable) null);
            } else {
                eVar.b();
            }
            a();
        }
    }

    protected final void m() {
        this.w = false;
    }

    protected void o() {
        this.f3417a.setEnabled(false);
        c(false);
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f3417a.setImageResource(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue());
        }
        int i = com.facetec.sdk.bg.AnonymousClass1.d[com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d.ordinal()];
        if (i == 2) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f3417a.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.f3417a.setLayoutParams(layoutParams);
        } else if (i == 3 || i == 4) {
            this.f3417a.setVisibility(8);
        }
        float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        com.facetec.sdk.dm.d(this.b);
        this.f3418o.setTypeface(com.facetec.sdk.bo.c);
        float f = 20.0f * a2;
        this.f3418o.setTextSize(2, f);
        com.facetec.sdk.dm.c(this.f3418o);
        this.f3418o.setLineSpacing(0.0f, 1.1f);
        this.n.setTypeface(com.facetec.sdk.bo.b);
        com.facetec.sdk.dm.c(this.n);
        this.n.setTypeface(com.facetec.sdk.bo.b);
        this.n.setTextSize(2, a2 * 28.0f);
        this.n.setLineSpacing(0.0f, 1.1f);
        this.q.setTypeface(com.facetec.sdk.bo.c);
        this.p.setTypeface(com.facetec.sdk.bo.c);
        this.t.setTypeface(com.facetec.sdk.bo.c);
        this.s.setTypeface(com.facetec.sdk.bo.c);
        this.q.setTextSize(2, f);
        this.p.setTextSize(2, f);
        this.t.setTextSize(2, f);
        this.s.setTextSize(2, f);
        this.q.setLineSpacing(0.0f, 1.1f);
        this.p.setLineSpacing(0.0f, 1.1f);
        this.t.setLineSpacing(0.0f, 1.1f);
        this.s.setLineSpacing(0.0f, 1.1f);
        com.facetec.sdk.dm.c(this.q);
        com.facetec.sdk.dm.c(this.p);
        com.facetec.sdk.dm.c(this.t);
        com.facetec.sdk.dm.c(this.s);
        this.e.setEnabled(false);
        this.e.a();
        this.e.setAlpha(0.0f);
        this.f.setAlpha(0.0f);
        b(false, 0, 0);
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.I);
        com.facetec.sdk.ay.c(getActivity());
        this.f3417a.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facetec.sdk.bg.this.c(view);
            }
        });
        this.f3417a.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean c;
                c = com.facetec.sdk.bg.this.c(view, motionEvent);
                return c;
            }
        });
        this.e.b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bg.this.D();
            }
        }));
        this.u.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bg.this.u();
            }
        }));
    }

    /* renamed from: com.facetec.sdk.bg$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.facetec.sdk.cr.values().length];
            c = iArr2;
            try {
                iArr2[com.facetec.sdk.cr.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                c[com.facetec.sdk.cr.DARK_AS_POSSIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                c[com.facetec.sdk.cr.BRIGHT_AS_POSSIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[com.facetec.sdk.cv.values().length];
            b = iArr3;
            try {
                iArr3[com.facetec.sdk.cv.ENABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                b[com.facetec.sdk.cv.DISABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.view.View view) {
        this.f3417a.setAlpha(1.0f);
        this.f3417a.setEnabled(false);
        c(false);
        this.e.a(false, true);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3417a.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > this.f3417a.getWidth() + this.f3417a.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > this.f3417a.getHeight() + this.f3417a.getTop() + 10) {
            this.f3417a.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f3417a.performClick();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (getActivity() != null) {
            c(true);
            this.f3417a.setEnabled(true);
            this.e.setEnabled(true);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void D() {
        this.w = true;
        this.f3417a.setEnabled(false);
        c(false);
        this.e.a(false, true);
        this.g = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 1.0f, 0.0f).setDuration(1000L);
        l();
    }

    protected final void a(final java.lang.Runnable runnable, int i) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.y = animatorSet;
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(this.c, (android.util.Property<android.view.ViewGroup, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f));
        this.y.setDuration(i);
        this.y.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.bg$$ExternalSyntheticLambda12
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                runnable.run();
            }
        });
        this.y.start();
    }

    protected void l() {
        d();
    }

    protected static void p() {
        com.facetec.sdk.cf.b = false;
        com.facetec.sdk.cq.z(false);
    }
}
