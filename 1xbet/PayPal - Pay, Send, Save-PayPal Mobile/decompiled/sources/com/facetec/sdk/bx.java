package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class bx extends com.facetec.sdk.bg {
    static boolean n = false;
    private com.facetec.sdk.bf.e l;

    /* renamed from: o, reason: collision with root package name */
    private android.os.Handler f3445o;
    private com.facetec.sdk.bp q;
    private android.os.Handler s;
    private com.facetec.sdk.bp t;
    private int r = 0;
    private final java.lang.Runnable p = new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda12
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.bx.this.E();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v() {
    }

    @Override // com.facetec.sdk.bg
    protected final boolean f() {
        return true;
    }

    @Override // com.facetec.sdk.bg
    protected final void i() {
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ android.animation.Animator onCreateAnimator(int i, boolean z, int i2) {
        return super.onCreateAnimator(i, z, i2);
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    static com.facetec.sdk.bx e(com.facetec.sdk.bf.e eVar, boolean z) {
        com.facetec.sdk.bx bxVar = new com.facetec.sdk.bx();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PERMISSION_STATUS", eVar.ordinal());
        bundle.putBoolean("IDSCAN_ONLY_MODE", z);
        bxVar.setArguments(bundle);
        n = false;
        return bxVar;
    }

    @Override // com.facetec.sdk.bg, com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.l = com.facetec.sdk.bf.e.values()[getArguments().getInt("PERMISSION_STATUS")];
        this.h = getArguments().getBoolean("IDSCAN_ONLY_MODE");
        r();
        boolean z = this.l == com.facetec.sdk.bf.e.NOT_GRANTED;
        com.facetec.sdk.bp bpVar = new com.facetec.sdk.bp();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putSerializable("screenType", com.facetec.sdk.bp.b.GENERIC);
        bundle2.putSerializable("isCameraPermissionsShowing", java.lang.Boolean.valueOf(z));
        if (z) {
            bundle2.putInt(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, com.facetec.sdk.R.string.FaceTec_camera_permission_header);
        }
        bpVar.setArguments(bundle2);
        this.t = bpVar;
        int i = com.facetec.sdk.R.string.FaceTec_instructions_header_ready_1;
        int i2 = com.facetec.sdk.R.string.FaceTec_instructions_message_ready_2;
        com.facetec.sdk.bp.b bVar = com.facetec.sdk.bp.b.READY_OVAL;
        com.facetec.sdk.bp bpVar2 = new com.facetec.sdk.bp();
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, i);
        bundle3.putInt("message", i2);
        bundle3.putSerializable("screenType", bVar);
        bpVar2.setArguments(bundle3);
        this.q = bpVar2;
    }

    @Override // com.facetec.sdk.bg
    protected final void o() {
        super.o();
        this.c.setVisibility(4);
    }

    @Override // com.facetec.sdk.bg
    protected final void e() {
        com.facetec.sdk.t.e = com.facetec.sdk.as.m;
        this.f.setVisibility(8);
        e(this.t);
        if (this.f3445o == null) {
            this.f3445o = new android.os.Handler();
        }
        this.f3445o.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bx.this.I();
            }
        }));
    }

    private void s() {
        android.os.Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        com.facetec.sdk.eb.b(h(), com.facetec.sdk.eb.c.GET_READY_PRESS_BUTTON_DELAYED);
    }

    private void t() {
        android.os.Handler handler = this.f3445o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3445o = null;
        }
    }

    private void r() {
        if (this.f3445o == null) {
            this.f3445o = new android.os.Handler();
        }
        this.f3445o.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bx.this.G();
            }
        }), androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
    }

    private void e(boolean z) {
        this.d.d(com.facetec.sdk.dm.aW(), 500, 500);
        if (z) {
            this.b.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bx.this.D();
                }
            })).start();
            this.r++;
        } else {
            com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_im_ready);
        }
        this.f3417a.setEnabled(true);
        c(true);
        b(true, 500, 0);
        if (com.facetec.sdk.eb.d()) {
            this.e.a(true, false);
        } else {
            this.e.a(false, true);
            new android.os.Handler().postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bx.this.z();
                }
            }), 4500L);
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            com.facetec.sdk.eb.b(h(), com.facetec.sdk.eb.c.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            android.os.Handler handler = new android.os.Handler();
            this.s = handler;
            handler.postDelayed(this.p, 4500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        if (this.q == null || !c()) {
            return;
        }
        e(this.q);
        this.d.e();
        com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_im_ready);
        this.b.animate().alpha(0.0f).setDuration(500L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.j = true;
        if (this.e.isEnabled()) {
            return;
        }
        this.e.a(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        this.f3417a.setImportantForAccessibility(1);
    }

    final void q() {
        if (c()) {
            r();
            this.l = com.facetec.sdk.bf.e.GRANTED;
            final com.facetec.sdk.bl g = g();
            if (g != null && this.h) {
                final com.facetec.sdk.au.b bVar = new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.y();
                    }
                });
                e(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bx.this.d(bVar);
                    }
                });
            } else {
                d(true);
            }
        }
    }

    private void d(boolean z) {
        this.q = com.facetec.sdk.bp.e(com.facetec.sdk.R.string.FaceTec_instructions_header_ready_1, com.facetec.sdk.R.string.FaceTec_instructions_message_ready_2, com.facetec.sdk.bp.b.READY_OVAL, this.d.j().top, this.d.j().bottom, 0);
        if (z) {
            e((android.content.Context) getActivity(), false);
            com.facetec.sdk.dp.d(this.e, com.facetec.sdk.FaceTecSDK.f3366a.g.buttonTextNormalColor);
        } else {
            this.e.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
            this.e.setEnabled(false);
            e(this.q);
            this.d.c.setAlpha(255);
            this.d.e();
            a(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bx.this.A();
                }
            }, 1000L);
        }
        this.r = 2;
        e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        if (this.d != null) {
            this.d.c(1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(java.lang.Runnable runnable) {
        a(runnable, 500);
    }

    private boolean x() {
        return this.l != com.facetec.sdk.bf.e.GRANTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_im_ready);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f3417a.setEnabled(true);
        c(true);
        this.e.a(true, true);
    }

    private void e(com.facetec.sdk.bp bpVar) {
        getFragmentManager().beginTransaction().setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).replace(com.facetec.sdk.R.id.centerContentFrameLayout, bpVar).commitAllowingStateLoss();
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final void onPause() {
        super.onPause();
        t();
        s();
    }

    @Override // com.facetec.sdk.bg, android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.t = null;
        this.q = null;
    }

    @Override // com.facetec.sdk.bg
    protected final void b() {
        t();
        s();
        this.g = null;
        com.facetec.sdk.bf h = h();
        if (h == null) {
            return;
        }
        if (x()) {
            h.p();
        } else {
            h.m();
        }
    }

    @Override // com.facetec.sdk.bg
    protected final void d() {
        this.f3417a.setImportantForAccessibility(2);
        if ((this.q != null) & c()) {
            com.facetec.sdk.bp bpVar = this.q;
            if (bpVar.d != null) {
                bpVar.d.setImportantForAccessibility(2);
            }
            if (bpVar.j != null) {
                bpVar.j.setImportantForAccessibility(2);
            }
        }
        com.facetec.sdk.bf h = h();
        if (h == null) {
            return;
        }
        if (x()) {
            h.d();
        } else {
            this.e.a(false, true);
            this.e.setVisibility(4);
            n = true;
            t();
            s();
            a((java.lang.Runnable) new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bx.this.y();
                }
            }), 300);
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        com.facetec.sdk.bf h = h();
        if (h != null) {
            h.k();
            com.facetec.sdk.t.c(h, com.facetec.sdk.c.GET_READY_IM_READY_PRESSED, (java.lang.String) null, (java.lang.Throwable) null);
        }
    }

    @Override // com.facetec.sdk.bg
    protected final void l() {
        com.facetec.sdk.bf h = h();
        if (h == null) {
            return;
        }
        if (x()) {
            if (this.l == com.facetec.sdk.bf.e.NOT_GRANTED) {
                t();
                h.d();
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(android.net.Uri.fromParts("package", h.getPackageName(), null));
                h.startActivity(intent);
                h.p();
            }
        } else {
            if (this.r >= 2) {
                super.l();
            } else {
                android.os.Handler handler = new android.os.Handler();
                int i = this.r;
                if (i == 0) {
                    this.r = i + 1;
                }
                if (this.r == 1) {
                    getFragmentManager().beginTransaction().setCustomAnimations(com.facetec.sdk.R.anim.facetec_slide_in_left, com.facetec.sdk.R.anim.facetec_slide_out_left).replace(com.facetec.sdk.R.id.centerContentFrameLayout, this.q, "centerContentFrameLayout").commitAllowingStateLoss();
                    this.d.d();
                    handler.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.bx.this.C();
                        }
                    }), 900L);
                }
                handler.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bx.this.w();
                    }
                }), 900L);
            }
            this.r++;
        }
        m();
    }

    @Override // com.facetec.sdk.bg
    protected final void a() {
        new android.os.Handler().post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bx.this.u();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.d.b();
        com.facetec.sdk.bp bpVar = this.q;
        if (bpVar != null) {
            bpVar.c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.e.a(false, true);
        this.f3417a.setEnabled(false);
        c(false);
        com.facetec.sdk.bf h = h();
        if (h != null) {
            if (x()) {
                h.p();
            } else {
                h.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.facetec.sdk.bl g = g();
        if (g != null) {
            if (!x()) {
                if (!this.h) {
                    d(false);
                    g.v();
                } else {
                    t();
                    s();
                    a(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda11
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.bx.v();
                        }
                    }, 300);
                    g.y();
                    return;
                }
            } else {
                this.f3417a.setImportantForAccessibility(2);
                com.facetec.sdk.t.c(g(), com.facetec.sdk.c.CAMERA_PERMISSION_SHOWN, (java.lang.String) null, (java.lang.Throwable) null);
                getActivity();
                if (com.facetec.sdk.dm.aS() != 0) {
                    android.widget.ImageView imageView = this.t.e;
                    android.app.Activity activity = getActivity();
                    getActivity();
                    imageView.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(activity, com.facetec.sdk.dm.aS()));
                    this.t.e.setVisibility(0);
                } else {
                    this.t.e.setVisibility(8);
                }
                this.t.f3432a.setVisibility(0);
                com.facetec.sdk.dl.d(this.t.b, com.facetec.sdk.R.string.FaceTec_camera_permission_header);
                if (this.l == com.facetec.sdk.bf.e.NOT_GRANTED) {
                    com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_camera_permission_enable_camera);
                    this.t.b(com.facetec.sdk.R.string.FaceTec_camera_permission_message_enroll);
                } else {
                    com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_camera_permission_launch_settings);
                    this.t.b(com.facetec.sdk.R.string.FaceTec_camera_permission_message_auth);
                }
                this.t.b.setVisibility(0);
                this.t.c.setVisibility(0);
                this.e.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                this.e.setEnabled(true);
                if (!com.facetec.sdk.FaceTecSDK.f3366a.f3361o.hideForCameraPermissions) {
                    b(true, 500, 0);
                }
                com.facetec.sdk.bl g2 = g();
                if (g2 != null) {
                    g2.n = true;
                    com.facetec.sdk.cq.M(com.facetec.sdk.as.ag, true);
                }
                new android.os.Handler().postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bx$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bx.this.B();
                    }
                }), 1000L);
                com.facetec.sdk.t.c(com.facetec.sdk.de.CAMERA_PERMISSION);
                g.v();
            }
            this.c.setVisibility(0);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.c, (android.util.Property<android.view.ViewGroup, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(500L);
            animatorSet.play(ofFloat);
            animatorSet.start();
            com.facetec.sdk.t.c(com.facetec.sdk.de.INITIAL_FACE_SCAN_GET_READY);
            com.facetec.sdk.t.c(h(), com.facetec.sdk.c.GET_READY_IM_READY_SHOWN_AND_READY, (java.lang.String) null, (java.lang.Throwable) null);
        }
    }
}
