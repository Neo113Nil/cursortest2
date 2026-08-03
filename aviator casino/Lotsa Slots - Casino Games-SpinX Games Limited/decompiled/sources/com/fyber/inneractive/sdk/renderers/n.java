package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class n extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.util.a0 {
    public com.fyber.inneractive.sdk.renderers.k A;
    public android.widget.ImageView B;
    public com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController l;
    public com.fyber.inneractive.sdk.ui.IAmraidWebViewController m;
    public com.fyber.inneractive.sdk.renderers.h n;
    public android.view.ViewGroup p;
    public com.fyber.inneractive.sdk.renderers.l q;
    public com.fyber.inneractive.sdk.renderers.i s;
    public com.fyber.inneractive.sdk.renderers.d y;
    public com.fyber.inneractive.sdk.renderers.j z;
    public long k = 0;
    public boolean o = false;
    public long r = 0;
    public int t = 0;
    public long u = 0;
    public boolean v = false;
    public boolean w = true;
    public boolean x = false;

    public final void I() {
        if (this.s != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%scancelling refreen runnable", com.fyber.inneractive.sdk.util.IAlog.a(this));
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.s);
            this.s = null;
        }
    }

    public final void J() {
        com.fyber.inneractive.sdk.renderers.d dVar = this.y;
        if (dVar != null) {
            dVar.g = false;
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.j);
        }
        if (this.m != null) {
            I();
            com.fyber.inneractive.sdk.flow.x xVar = this.b;
            if (xVar != null) {
                ((com.fyber.inneractive.sdk.flow.q0) xVar).destroy();
            }
            this.m = null;
            this.b = null;
            android.view.ViewGroup viewGroup = this.p;
            if (viewGroup != null) {
                viewGroup.removeView(this.q);
            }
            com.fyber.inneractive.sdk.renderers.l lVar = this.q;
            if (lVar != null) {
                lVar.removeAllViews();
                this.q = null;
            }
        }
        this.v = false;
    }

    public final int K() {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        int intValue;
        int i = this.t;
        if (i == -1) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sreturning disable value for banner refresh", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return 0;
        }
        if (i <= 0) {
            com.fyber.inneractive.sdk.config.s0 s0Var = this.f3675a.getAdContent().d;
            if (s0Var != null && (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).c) != null) {
                java.lang.Integer num = l0Var.f3619a;
                com.fyber.inneractive.sdk.util.IAlog.a("%sreturning refreshConfig = %d", com.fyber.inneractive.sdk.util.IAlog.a(this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return 0;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sreturning overriden refresh interval = %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.t));
        intValue = this.t;
        return intValue * 1000;
    }

    public final boolean L() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            com.fyber.inneractive.sdk.flow.q0 q0Var = (com.fyber.inneractive.sdk.flow.q0) xVar;
            if (q0Var.d != null && ((com.fyber.inneractive.sdk.config.r0) q0Var.d).c != null && ((com.fyber.inneractive.sdk.config.r0) q0Var.d).c.b != null && ((com.fyber.inneractive.sdk.config.r0) q0Var.d).c.b.isFullscreenUnit()) {
                return true;
            }
        }
        return false;
    }

    public final void M() {
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController;
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.b == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%srefreshing ad", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if ((!this.m.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) && (inneractiveAdViewUnitController = this.l) != null) {
            this.r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    public final void N() {
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.b) == null || !mVar.getIsVisible() || this.r == 0 || this.m.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            return;
        }
        if (!this.w) {
            if (this.k < java.lang.System.currentTimeMillis() - this.r) {
                this.u = 1L;
            } else {
                this.u = this.k - (java.lang.System.currentTimeMillis() - this.r);
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Long.valueOf(this.u));
        a(false, this.u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof com.fyber.inneractive.sdk.flow.q0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(android.view.View view) {
        return view != null && view.equals(this.p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) ? false : true;
        }
        return true;
    }

    public final void d(boolean z) {
        if (this.s != null) {
            this.w = z;
            I();
            this.u = this.k - (java.lang.System.currentTimeMillis() - this.r);
            com.fyber.inneractive.sdk.util.IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Long.valueOf(this.u), java.lang.Long.valueOf(this.k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null && (mVar = iAmraidWebViewController.b) != null) {
            com.fyber.inneractive.sdk.renderers.j jVar = this.z;
            if (jVar != null) {
                mVar.removeOnLayoutChangeListener(jVar);
            }
            com.fyber.inneractive.sdk.renderers.k kVar = this.A;
            if (kVar != null) {
                mVar.removeOnAttachStateChangeListener(kVar);
            }
        }
        this.B = null;
        I();
        J();
        this.n = null;
        com.fyber.inneractive.sdk.util.z.f4321a.f4285a.remove(this);
        com.fyber.inneractive.sdk.renderers.i iVar = this.s;
        if (iVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(iVar);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(android.view.View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            com.iab.omid.library.fyber.adsession.AdSession adSession = eVar.f3791a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int n() {
        return this.m.e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void s() {
        com.fyber.inneractive.sdk.renderers.d dVar = this.y;
        if (dVar != null) {
            dVar.g = false;
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.j);
        }
        com.fyber.inneractive.sdk.renderers.l lVar = this.q;
        if (lVar != null) {
            lVar.removeAllViews();
            this.q = null;
        }
        android.view.ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final android.view.View x() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int y() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.m.e0) : com.fyber.inneractive.sdk.util.o.c(this.m.b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int z() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.m.d0) : com.fyber.inneractive.sdk.util.o.c(this.m.b.getWidth());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        int i;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        com.fyber.inneractive.sdk.renderers.l lVar;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        if (inneractiveAdSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sYou must set the spot to render before calling renderAd", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        this.o = false;
        this.e = false;
        if (viewGroup != null) {
            this.p = viewGroup;
            this.l = (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.x) {
            J();
            if (!(this.f3675a.getAdContent() instanceof com.fyber.inneractive.sdk.flow.q0)) {
                com.fyber.inneractive.sdk.util.IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f3675a.getAdContent());
                return;
            }
            this.b = (com.fyber.inneractive.sdk.flow.q0) this.f3675a.getAdContent();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((com.fyber.inneractive.sdk.flow.q0) xVar).i : null;
        this.m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.n == null) {
                this.n = new com.fyber.inneractive.sdk.renderers.h(this);
            }
            iAmraidWebViewController.setListener(this.n);
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = ((com.fyber.inneractive.sdk.flow.q0) this.b).f3765a;
            int i2 = -1;
            if (L()) {
                com.fyber.inneractive.sdk.renderers.l lVar2 = new com.fyber.inneractive.sdk.renderers.l(this.p.getContext(), 1.5f);
                this.q = lVar2;
                com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController2 = this.m;
                android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
                com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.b;
                if (mVar != null) {
                    lVar2.addView(mVar, layoutParams);
                    com.fyber.inneractive.sdk.util.l0.f4298a.a(lVar2.getContext(), iAmraidWebViewController2.b, iAmraidWebViewController2);
                    com.fyber.inneractive.sdk.web.m mVar2 = iAmraidWebViewController2.b;
                    if (mVar2 != null) {
                        mVar2.setTapListener(iAmraidWebViewController2);
                    }
                }
                this.p.addView(this.q, new android.view.ViewGroup.LayoutParams(-2, -2));
            } else {
                this.q = new com.fyber.inneractive.sdk.renderers.l(this.p.getContext(), 0.0f);
                com.fyber.inneractive.sdk.flow.q0 q0Var = (com.fyber.inneractive.sdk.flow.q0) this.b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) q0Var.b;
                com.fyber.inneractive.sdk.util.h1 a2 = a(fVar.e, fVar.f, q0Var.d);
                this.m.setAdDefaultSize(a2.f4294a, a2.b);
                com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController3 = this.m;
                android.view.View view = iAmraidWebViewController3.b;
                if (view != null || com.fyber.inneractive.sdk.util.o.f4302a == null) {
                    android.view.ViewParent parent = view != null ? view.getParent() : null;
                    if (parent instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) parent).removeView(view);
                    }
                    android.widget.RelativeLayout.LayoutParams a3 = com.fyber.inneractive.sdk.util.v.a(a2.f4294a, a2.b, 13);
                    com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController4 = this.m;
                    com.fyber.inneractive.sdk.renderers.l lVar3 = this.q;
                    com.fyber.inneractive.sdk.web.m mVar3 = iAmraidWebViewController4.b;
                    if (mVar3 != null) {
                        lVar3.addView(mVar3, a3);
                        com.fyber.inneractive.sdk.util.l0.f4298a.a(lVar3.getContext(), iAmraidWebViewController4.b, iAmraidWebViewController4);
                        com.fyber.inneractive.sdk.web.m mVar4 = iAmraidWebViewController4.b;
                        if (mVar4 != null) {
                            mVar4.setTapListener(iAmraidWebViewController4);
                        }
                    }
                    this.p.addView(this.q);
                    com.fyber.inneractive.sdk.renderers.l lVar4 = this.q;
                    android.view.ViewGroup.LayoutParams layoutParams2 = lVar4.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    lVar4.setLayoutParams(layoutParams2);
                    com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = this.f3675a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.p) != null) {
                        android.content.Context context = viewGroup2.getContext();
                        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, this.f3675a.getAdContent().f3765a, this.f3675a.getAdContent().b, this.f3675a.getAdContent().c);
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.fyber.inneractive.sdk.R.layout.ia_layout_fyber_ad_identifier_relative, this.p, false);
                        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner = com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier iFyberAdIdentifier = gVar.d;
                        iFyberAdIdentifier.k = corner;
                        iFyberAdIdentifier.a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController5 = this.m;
                        if (iAmraidWebViewController5 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController5.b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (android.view.ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && x() != null) {
                            android.view.ViewGroup.LayoutParams layoutParams3 = x().getLayoutParams();
                            com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController6 = this.m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController6.a(viewGroup4, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
                        }
                    }
                    com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot3 = this.f3675a;
                    if (inneractiveAdSpot3 != null && (inneractiveAdSpot3 instanceof com.fyber.inneractive.sdk.flow.h0) && this.m != null && this.q != null && view != null && (bVar = ((com.fyber.inneractive.sdk.flow.h0) inneractiveAdSpot3).m) != null) {
                        android.widget.ImageView imageView = bVar.f4262a;
                        this.B = imageView;
                        if (imageView != null) {
                            if (L()) {
                                i = -1;
                            } else {
                                i2 = a2.f4294a;
                                i = a2.b;
                            }
                            if (this.z == null) {
                                com.fyber.inneractive.sdk.renderers.j jVar = new com.fyber.inneractive.sdk.renderers.j(this);
                                this.z = jVar;
                                view.addOnLayoutChangeListener(jVar);
                            }
                            if (this.A == null) {
                                com.fyber.inneractive.sdk.renderers.k kVar = new com.fyber.inneractive.sdk.renderers.k(this);
                                this.A = kVar;
                                view.addOnAttachStateChangeListener(kVar);
                            }
                            this.B.setLayoutParams(com.fyber.inneractive.sdk.util.v.a(i2, i, 13));
                            this.q.addView(this.B);
                            com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController7 = this.m;
                            com.fyber.inneractive.sdk.util.h1 h1Var = new com.fyber.inneractive.sdk.util.h1(i2, i);
                            iAmraidWebViewController7.o0 = bVar;
                            iAmraidWebViewController7.p0 = h1Var;
                            android.widget.ImageView imageView2 = bVar.f4262a;
                            if (imageView2 != null) {
                                iAmraidWebViewController7.a(imageView2, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark);
                            }
                        }
                    }
                } else if (this.x) {
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.p.getContext());
                    frameLayout.setBackgroundResource(com.fyber.inneractive.sdk.R.color.ia_blank_background);
                    this.p.removeAllViews();
                    this.p.addView(frameLayout, new android.widget.FrameLayout.LayoutParams(a2.f4294a, a2.b, 17));
                } else {
                    this.x = true;
                    iAmraidWebViewController3.b = iAmraidWebViewController3.a(((com.fyber.inneractive.sdk.flow.q0) this.b).c);
                    try {
                        iAmraidWebViewController3.h();
                        iAmraidWebViewController3.b.loadDataWithBaseURL(iAmraidWebViewController3.p, iAmraidWebViewController3.q, "text/html", com.ironsource.B5.O, null);
                    } catch (java.lang.Throwable unused) {
                        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.p.getContext());
                        frameLayout2.setBackgroundResource(com.fyber.inneractive.sdk.R.color.ia_blank_background);
                        this.p.removeAllViews();
                        this.p.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(a2.f4294a, a2.b, 17));
                    }
                }
            }
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            com.fyber.inneractive.sdk.response.f fVar2 = xVar2 != null ? (com.fyber.inneractive.sdk.response.f) ((com.fyber.inneractive.sdk.flow.q0) xVar2).b : null;
            if (fVar2 != null && (lVar = this.q) != null) {
                com.fyber.inneractive.sdk.renderers.d dVar = new com.fyber.inneractive.sdk.renderers.d(fVar2, lVar, new com.fyber.inneractive.sdk.renderers.g(this));
                this.y = dVar;
                dVar.h = false;
                dVar.d = 1;
                dVar.e = 0.0f;
                int i3 = fVar2.s;
                if (i3 >= 1) {
                    dVar.d = java.lang.Math.min(i3, 100);
                }
                float f = fVar2.t;
                if (f >= -1.0f) {
                    dVar.e = f;
                }
                if (dVar.e >= 0.0f) {
                    com.fyber.inneractive.sdk.util.IAlog.a("IAVisibilityTracker: startTrackingVisibility", new java.lang.Object[0]);
                    dVar.c = 0.0f;
                    dVar.f = java.lang.System.currentTimeMillis();
                    dVar.g = true;
                    dVar.a();
                }
            }
        } else {
            com.fyber.inneractive.sdk.util.IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", xVar);
        }
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f4321a;
        if (b0Var.f4285a.contains(this)) {
            return;
        }
        b0Var.f4285a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void p() {
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.util.IAlog.a("%sgot onAdRefreshFailed", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (!mVar.getIsVisible() || com.fyber.inneractive.sdk.util.z.f4321a.b || this.m.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.u = 1L;
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", com.fyber.inneractive.sdk.util.IAlog.a(this));
        long K = K();
        this.k = K;
        if (K != 0) {
            a(false, 10000L);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int d() {
        return this.m.d0;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(android.view.View view) {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    public final void a(boolean z, long j) {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.m mVar;
        if (!android.text.TextUtils.isEmpty(this.f3675a.getMediationNameString()) || j == 0 || (this.f3675a.getSelectedUnitController() instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController) || this.t == -1 || (iAmraidWebViewController = this.m) == null || (mVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (!mVar.getIsVisible()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sstartRefreshTimer called but ad is not visible", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        this.r = java.lang.System.currentTimeMillis();
        this.k = z ? this.k : j;
        com.fyber.inneractive.sdk.util.IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Long.valueOf(j), java.lang.Long.valueOf(this.k));
        if (j > 1) {
            com.fyber.inneractive.sdk.renderers.i iVar = this.s;
            if (iVar != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(iVar);
            }
            I();
            com.fyber.inneractive.sdk.renderers.i iVar2 = new com.fyber.inneractive.sdk.renderers.i(this);
            this.s = iVar2;
            com.fyber.inneractive.sdk.util.r.b.postDelayed(iVar2, j);
            return;
        }
        M();
    }

    public static com.fyber.inneractive.sdk.util.h1 a(int i, int i2, com.fyber.inneractive.sdk.config.s0 s0Var) {
        int a2;
        int a3;
        com.fyber.inneractive.sdk.config.l0 l0Var;
        com.fyber.inneractive.sdk.util.IAlog.a("View layout params: response width and height: %d, %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (i > 0 && i2 > 0) {
            a2 = com.fyber.inneractive.sdk.util.o.a(i);
            a3 = com.fyber.inneractive.sdk.util.o.a(i2);
        } else {
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER;
            if (s0Var != null && (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).c) != null) {
                unitDisplayType = l0Var.b;
            }
            if (unitDisplayType.equals(com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT)) {
                a2 = com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.renderers.m.RECTANGLE_WIDTH.value);
                a3 = com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.renderers.m.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.k.m()) {
                a2 = com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.renderers.m.BANNER_TABLET_WIDTH.value);
                a3 = com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.renderers.m.BANNER_TABLET_HEIGHT.value);
            } else {
                a2 = com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.renderers.m.BANNER_WIDTH.value);
                a3 = com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.renderers.m.BANNER_HEIGHT.value);
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.e("View layout params: final scaled width and height: %d, %d", java.lang.Integer.valueOf(a2), java.lang.Integer.valueOf(a3));
        return new com.fyber.inneractive.sdk.util.h1(a2, a3);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i) {
        this.t = i;
    }
}
