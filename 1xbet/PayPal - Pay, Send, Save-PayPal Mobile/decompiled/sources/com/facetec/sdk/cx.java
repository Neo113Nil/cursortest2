package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class cx extends com.facetec.sdk.bg {
    static boolean n = false;
    com.facetec.sdk.dd l;
    private com.facetec.sdk.bp p;
    private android.os.Handler s;

    /* renamed from: o, reason: collision with root package name */
    int f3483o = 0;
    private int q = 500;
    private int r = 300;

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ android.animation.Animator onCreateAnimator(int i, boolean z, int i2) {
        return super.onCreateAnimator(i, z, i2);
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    static com.facetec.sdk.cx q() {
        com.facetec.sdk.cx cxVar = new com.facetec.sdk.cx();
        cxVar.setArguments(new android.os.Bundle());
        n = false;
        cxVar.m = true;
        return cxVar;
    }

    @Override // com.facetec.sdk.bg, com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Handler handler = new android.os.Handler();
        this.s = handler;
        handler.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.O();
            }
        }), androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
        if (com.facetec.sdk.cq.e(h(), false).length != 0) {
            com.facetec.sdk.t.e = com.facetec.sdk.as.l;
            this.l = new com.facetec.sdk.dd();
            getFragmentManager().beginTransaction().setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).add(com.facetec.sdk.R.id.centerContentFrameLayout, this.l).commitAllowingStateLoss();
            com.facetec.sdk.t.c(com.facetec.sdk.de.RETRY_SIDE_BY_SIDE);
            com.facetec.sdk.cf.b = true;
            com.facetec.sdk.cq.z(true);
            return;
        }
        com.facetec.sdk.t.e = com.facetec.sdk.as.m;
        this.f3483o = 1;
        com.facetec.sdk.t.c(com.facetec.sdk.de.RETRY_GET_READY);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        com.facetec.sdk.bf h = h();
        if (h != null) {
            h.n();
        }
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final void onPause() {
        super.onPause();
        x();
        v();
    }

    @Override // com.facetec.sdk.bg
    protected final void e() {
        com.facetec.sdk.bf h = h();
        if (h != null && com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            com.facetec.sdk.eb.b(h, com.facetec.sdk.eb.c.RETRY);
        }
        com.facetec.sdk.dd ddVar = this.l;
        if (ddVar != null) {
            ddVar.i.setAlpha(0.0f);
            ddVar.h.setAlpha(0.0f);
            ddVar.j.setAlpha(0.0f);
            ddVar.e.setAlpha(0.0f);
            ddVar.g.setAlpha(0.0f);
            ddVar.f.setAlpha(0.0f);
            this.e.setVisibility(4);
            this.e.setAlpha(0.0f);
        }
        this.f.setVisibility(8);
        this.e.setEnabled(false);
        this.f3417a.setEnabled(false);
        c(false);
        this.d.d(com.facetec.sdk.dm.aW(), 0, 0);
        if (this.s == null) {
            android.os.Handler handler = new android.os.Handler();
            this.s = handler;
            handler.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cx.this.S();
                }
            }), androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
        }
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.E();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        com.facetec.sdk.bf h = h();
        if (h != null) {
            h.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        com.facetec.sdk.bl g = g();
        if (g != null) {
            g.v();
        }
        android.graphics.RectF j = this.d.j();
        this.p = com.facetec.sdk.bp.e(com.facetec.sdk.R.string.FaceTec_instructions_header_ready_1, com.facetec.sdk.R.string.FaceTec_instructions_message_ready_2, com.facetec.sdk.bp.b.READY_OVAL, j.top, j.bottom, this.e.getId());
        if (this.f3483o == 1) {
            getFragmentManager().beginTransaction().setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).replace(com.facetec.sdk.R.id.centerContentFrameLayout, this.p).commitAllowingStateLoss();
            com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_im_ready);
            this.d.c.setAlpha(255);
            this.d.e();
            a(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cx.this.N();
                }
            }, 500L);
            this.e.setAlpha(0.0f);
            this.e.setVisibility(0);
            this.e.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cx.this.L();
                }
            })).start();
            b(true, 500, 300);
            if (com.facetec.sdk.eb.d()) {
                this.e.setEnabled(true);
                return;
            } else {
                y();
                return;
            }
        }
        if (this.l == null) {
            return;
        }
        com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_try_again);
        this.l.d(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.F();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.d.c(500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        d(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.J();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        if (g() != null) {
            D();
            this.f3417a.setEnabled(true);
            c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (((int[]) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -230834020, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 230834030)).length != 0) {
            d(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cx.this.M();
                }
            }, 10L);
        }
        d(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.K();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        com.facetec.sdk.di diVar = this.l.k;
        if (diVar.f3512a.length != 0) {
            diVar.c = 0;
            diVar.e = true;
            diVar.a();
            diVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        if (g() != null) {
            this.e.a(true, true);
            this.f3417a.setEnabled(true);
            c(true);
        }
    }

    @Override // com.facetec.sdk.bg
    protected final void b() {
        if (this.f3483o == 0) {
            u();
            com.facetec.sdk.cq.V();
            this.f3483o++;
        } else {
            com.facetec.sdk.bf h = h();
            if (h != null) {
                h.l();
            }
            x();
            v();
        }
    }

    @Override // com.facetec.sdk.bg
    protected final boolean f() {
        return this.f3483o == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void D() {
        this.e.setImportantForAccessibility(1);
        this.f3417a.setImportantForAccessibility(1);
    }

    private void u() {
        if (com.facetec.sdk.eb.d()) {
            this.e.a(true, false);
        } else {
            y();
        }
        b(false, 500, 0);
        this.e.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        d(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.I();
            }
        }, 800L);
        com.facetec.sdk.t.e = com.facetec.sdk.as.m;
        a(this.p);
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.D();
            }
        }, 1000L);
        this.d.d();
        com.facetec.sdk.t.c(h(), com.facetec.sdk.c.GET_READY_IM_READY_SHOWN_AND_READY_RETRY, (java.lang.String) null, (java.lang.Throwable) null);
        com.facetec.sdk.t.c(com.facetec.sdk.de.RETRY_GET_READY);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_im_ready);
        this.e.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        b(true, 500, 0);
        d(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.G();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f3417a.setEnabled(true);
        c(true);
    }

    private void y() {
        new android.os.Handler().postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.A();
            }
        }), 4500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.j = true;
        if (this.e.isEnabled()) {
            return;
        }
        this.e.a(true, true);
    }

    @Override // com.facetec.sdk.bg
    protected final void d() {
        v();
        if (this.f3483o == 0) {
            u();
            com.facetec.sdk.cq.V();
            if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                com.facetec.sdk.eb.b(h(), com.facetec.sdk.eb.c.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            }
            d(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cx.this.C();
                }
            }, 1000L);
        } else {
            n = true;
            x();
            a((java.lang.Runnable) new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cx.this.B();
                }
            }), 500);
        }
        this.f3483o++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        com.facetec.sdk.bf h = h();
        if (h != null) {
            h.j();
            com.facetec.sdk.t.c(h, com.facetec.sdk.c.GET_READY_IM_READY_PRESSED_RETRY, (java.lang.String) null, (java.lang.Throwable) null);
        }
        m();
    }

    public final boolean s() {
        return this.f3483o == 1;
    }

    public final void r() {
        if (this.s == null) {
            this.s = new android.os.Handler();
        }
        this.s.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.z();
            }
        }), androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        com.facetec.sdk.bf h = h();
        if (h != null) {
            h.n();
        }
    }

    private void x() {
        android.os.Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.s = null;
        }
    }

    private void v() {
        com.facetec.sdk.dd ddVar = this.l;
        if (ddVar == null || ddVar.k == null) {
            return;
        }
        this.l.k.e();
    }

    private void a(com.facetec.sdk.bp bpVar) {
        if (bpVar == null) {
            return;
        }
        getFragmentManager().beginTransaction().setCustomAnimations(com.facetec.sdk.R.anim.facetec_slide_in_left, com.facetec.sdk.R.anim.facetec_slide_out_left).replace(com.facetec.sdk.R.id.centerContentFrameLayout, bpVar, "centerContentFrameLayout").commitAllowingStateLoss();
    }

    @Override // com.facetec.sdk.bg
    protected final void a() {
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.w();
            }
        });
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        com.facetec.sdk.dd ddVar = this.l;
        if (ddVar == null) {
            com.facetec.sdk.bp bpVar = this.p;
            if (bpVar != null) {
                bpVar.c(false);
                return;
            }
            return;
        }
        if (ddVar.c()) {
            com.facetec.sdk.ay.d(new java.util.ArrayList(java.util.Arrays.asList(ddVar.i)), java.lang.Integer.valueOf(ddVar.i.getCurrentTextColor()).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dm.j(ddVar.getActivity())).intValue()).start();
            com.facetec.sdk.ay.d(new java.util.ArrayList(java.util.Arrays.asList(ddVar.h, ddVar.g, ddVar.f, ddVar.m, ddVar.n)), java.lang.Integer.valueOf(ddVar.h.getCurrentTextColor()).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dm.i(ddVar.getActivity())).intValue()).start();
            com.facetec.sdk.ay.d(new java.util.ArrayList(java.util.Arrays.asList(ddVar.f3502a, ddVar.b)), ddVar.l, com.facetec.sdk.dm.k(), java.lang.Integer.valueOf(com.facetec.sdk.dp.e(ddVar.getActivity(), com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenImageBorderColor)).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dm.r(ddVar.getActivity())).intValue()).start();
            com.facetec.sdk.ay.e(ddVar.d, java.lang.Integer.valueOf(com.facetec.sdk.dp.e(ddVar.getActivity(), com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenOvalStrokeColor)).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dm.t(ddVar.getActivity())).intValue()).start();
        }
    }

    @Override // com.facetec.sdk.bg
    protected final void i() {
        android.widget.ImageView j = j();
        if (j == null || !j.isEnabled() || n) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.l.e().setImportantForAccessibility(1);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.l.e().setAccessibilityHeading(true);
        }
        this.e.setImportantForAccessibility(1);
        this.f3417a.setImportantForAccessibility(1);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.l.e().setScreenReaderFocusable(true);
        }
        this.l.e().sendAccessibilityEvent(8);
        this.e.setAlpha(0.0f);
        this.e.setVisibility(0);
        this.e.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cx$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cx.this.H();
            }
        })).start();
        b(true, 500, 300);
    }
}
