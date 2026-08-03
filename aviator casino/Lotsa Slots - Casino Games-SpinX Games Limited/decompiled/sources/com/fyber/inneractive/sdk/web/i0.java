package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public abstract class i0 extends com.fyber.inneractive.sdk.web.i1 {
    public static final java.lang.String[] q0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public com.fyber.inneractive.sdk.mraid.f0 N;
    public final com.fyber.inneractive.sdk.web.z O;
    public final com.fyber.inneractive.sdk.web.d0 P;
    public final com.fyber.inneractive.sdk.web.c0 Q;
    public android.view.ViewGroup R;
    public com.fyber.inneractive.sdk.web.m S;
    public boolean T;
    public int U;
    public com.fyber.inneractive.sdk.web.e0 V;
    public com.fyber.inneractive.sdk.ui.IAcloseButton W;
    public boolean X;
    public float Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public com.fyber.inneractive.sdk.config.enums.Orientation f0;
    public int g0;
    public android.widget.FrameLayout h0;
    public android.widget.FrameLayout i0;
    public android.widget.FrameLayout j0;
    public int k0;
    public int l0;
    public com.fyber.inneractive.sdk.web.t m0;
    public final com.fyber.inneractive.sdk.web.p n0;
    public com.fyber.inneractive.sdk.rtb.watermark.b o0;
    public com.fyber.inneractive.sdk.util.h1 p0;

    public i0(boolean z, com.fyber.inneractive.sdk.web.c0 c0Var, com.fyber.inneractive.sdk.web.z zVar, com.fyber.inneractive.sdk.web.d0 d0Var, com.fyber.inneractive.sdk.measurement.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z, c0Var, rVar);
        this.N = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
        this.T = false;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = com.fyber.inneractive.sdk.config.enums.Orientation.NONE;
        this.H = eVar;
        this.Q = c0Var;
        this.O = zVar;
        this.P = d0Var;
        this.n0 = new com.fyber.inneractive.sdk.web.p(this);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public void a(boolean z) {
        a(new com.fyber.inneractive.sdk.mraid.g0(z));
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.r(this));
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this.n0);
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.s(this));
    }

    public final void d(boolean z) {
        try {
            android.app.Activity activity = (android.app.Activity) com.fyber.inneractive.sdk.util.o.a(this.b);
            if (activity != null) {
                if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                    activity.setRequestedOrientation(this.U);
                } else {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                }
            }
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed to modify the device orientation.", new java.lang.Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.util.g1 g() {
        com.fyber.inneractive.sdk.web.m mVar;
        return (this.N != com.fyber.inneractive.sdk.mraid.f0.EXPANDED || (mVar = this.S) == null) ? super.g() : mVar.getLastClickedLocation();
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void h() {
        super.h();
        android.widget.FrameLayout frameLayout = this.i0;
        if (frameLayout != null && this.j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.j0.removeAllViewsInLayout();
            android.view.ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(this.j0);
            }
        }
        this.N = com.fyber.inneractive.sdk.mraid.f0.LOADING;
        android.content.Context a2 = com.fyber.inneractive.sdk.util.o.a(this.b);
        this.U = a2 instanceof android.app.Activity ? ((android.app.Activity) a2).getRequestedOrientation() : -1;
        this.i0 = new android.widget.FrameLayout(a2);
        this.j0 = new android.widget.FrameLayout(a2);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(a2);
        frameLayout2.setBackgroundColor(-858993460);
        this.h0 = frameLayout2;
        a(a2, false);
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            mVar.setOnKeyListener(new com.fyber.inneractive.sdk.web.q(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void j() {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.Z, this.a0));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.b0, this.c0));
        } else {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.b.getWidthDp(), this.b.getHeightDp()));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.b.getWidthDp(), this.b.getHeightDp()));
        }
        com.fyber.inneractive.sdk.web.m mVar2 = this.b;
        int c = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.b0);
        com.fyber.inneractive.sdk.web.m mVar3 = this.b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(c, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.c0)));
        a(arrayList);
        com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        this.N = f0Var;
        a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final boolean m() {
        com.fyber.inneractive.sdk.web.c0 c0Var = this.Q;
        return c0Var != null && c0Var.equals(com.fyber.inneractive.sdk.web.c0.INTERSTITIAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        android.view.ViewGroup viewGroup;
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.web.m mVar2;
        android.view.ViewGroup viewGroup2;
        com.fyber.inneractive.sdk.web.j1 j1Var;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        com.fyber.inneractive.sdk.web.m mVar3;
        com.fyber.inneractive.sdk.mraid.f0 f0Var;
        android.view.ViewGroup viewGroup3 = this.R;
        android.view.ViewGroup viewGroup4 = null;
        if (viewGroup3 != null) {
            android.view.View findViewById = viewGroup3.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
            if (findViewById instanceof android.view.ViewGroup) {
                viewGroup = (android.view.ViewGroup) findViewById;
                if (viewGroup != null) {
                    com.fyber.inneractive.sdk.web.m mVar4 = this.b;
                    if (mVar4 != null) {
                        android.view.View findViewById2 = mVar4.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
                        if (findViewById2 instanceof android.view.ViewGroup) {
                            viewGroup4 = (android.view.ViewGroup) findViewById2;
                        }
                    }
                } else {
                    viewGroup4 = viewGroup;
                }
                this.T = false;
                if (!p() || (f0Var = this.N) == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                    c(false);
                    mVar = this.b;
                    if (mVar != null) {
                        com.fyber.inneractive.sdk.mraid.f0 f0Var2 = this.N;
                        if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.EXPANDED) {
                            android.widget.FrameLayout frameLayout = this.i0;
                            if (frameLayout != null && this.j0 != null) {
                                frameLayout.removeAllViewsInLayout();
                                this.j0.removeAllViewsInLayout();
                                android.view.ViewGroup viewGroup5 = this.R;
                                if (viewGroup5 != null) {
                                    viewGroup5.removeView(this.j0);
                                }
                            }
                            android.widget.FrameLayout frameLayout2 = this.h0;
                            if (frameLayout2 != null && (viewGroup2 = (android.view.ViewGroup) frameLayout2.getParent()) != null) {
                                viewGroup2.addView(this.b, this.g0);
                                com.fyber.inneractive.sdk.web.m mVar5 = this.b;
                                int i = this.k0;
                                int i2 = this.l0;
                                android.view.ViewGroup.LayoutParams layoutParams = mVar5.getLayoutParams();
                                layoutParams.width = i;
                                layoutParams.height = i2;
                                mVar5.setLayoutParams(layoutParams);
                                com.fyber.inneractive.sdk.util.o.a(this.b, 17);
                                viewGroup2.removeView(this.h0);
                                viewGroup2.invalidate();
                                this.b.requestLayout();
                            }
                            this.d0 = this.k0;
                            this.e0 = this.l0;
                        } else if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                            int i3 = this.k0;
                            this.d0 = i3;
                            int i4 = this.l0;
                            this.e0 = i4;
                            android.view.ViewGroup.LayoutParams layoutParams2 = mVar.getLayoutParams();
                            layoutParams2.width = i3;
                            layoutParams2.height = i4;
                            mVar.setLayoutParams(layoutParams2);
                            com.fyber.inneractive.sdk.util.o.a(this.b, 17);
                        }
                    }
                    if (viewGroup4 != null && (mVar2 = this.b) != null) {
                        viewGroup4.setLayoutParams(mVar2.getLayoutParams());
                        if (p()) {
                            com.fyber.inneractive.sdk.util.v.a(viewGroup4);
                            this.b.addView(viewGroup4);
                        }
                    }
                    this.N = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
                    d(false);
                    a(new com.fyber.inneractive.sdk.mraid.d0(this.N));
                } else if (f0Var == com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
                    com.fyber.inneractive.sdk.mraid.f0 f0Var3 = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
                    this.N = f0Var3;
                    a(new com.fyber.inneractive.sdk.mraid.d0(f0Var3));
                }
                if (viewGroup4 != null) {
                    viewGroup4.setPadding(0, 0, 0, 0);
                }
                j1Var = this.g;
                if (j1Var != null) {
                    ((com.fyber.inneractive.sdk.web.b0) j1Var).onClose();
                }
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    r();
                }
                bVar = this.o0;
                if (bVar != null || bVar.f4262a == null || (mVar3 = this.b) == null || mVar3.getParent() == null || this.p0 == null) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.o0.f4262a);
                android.widget.ImageView imageView = this.o0.f4262a;
                com.fyber.inneractive.sdk.util.h1 h1Var = this.p0;
                imageView.setLayoutParams(com.fyber.inneractive.sdk.util.v.a(h1Var.f4294a, h1Var.b, 13));
                ((android.view.ViewGroup) this.b.getParent()).addView(this.o0.f4262a);
                return;
            }
        }
        viewGroup = null;
        if (viewGroup != null) {
        }
        this.T = false;
        if (p()) {
        }
        c(false);
        mVar = this.b;
        if (mVar != null) {
        }
        if (viewGroup4 != null) {
            viewGroup4.setLayoutParams(mVar2.getLayoutParams());
            if (p()) {
            }
        }
        this.N = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        d(false);
        a(new com.fyber.inneractive.sdk.mraid.d0(this.N));
        if (viewGroup4 != null) {
        }
        j1Var = this.g;
        if (j1Var != null) {
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
        }
        bVar = this.o0;
        if (bVar != null) {
        }
    }

    public final boolean p() {
        return this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
    }

    public final void q() {
        com.fyber.inneractive.sdk.measurement.tracker.e bVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.measurement.e eVar2 = this.H;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.web.m mVar = this.b;
            com.fyber.inneractive.sdk.flow.x xVar = this.s;
            boolean z = false;
            com.fyber.inneractive.sdk.util.IAlog.a("omsdk initMraidSession", new java.lang.Object[0]);
            com.iab.omid.library.fyber.adsession.Partner partner = eVar2.e;
            if (partner == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("omsdk partner is null", new java.lang.Object[0]);
                bVar = null;
            } else {
                if (xVar != null && (eVar = xVar.b) != null && eVar.G) {
                    z = true;
                }
                eVar2.f.getClass();
                bVar = z ? new com.fyber.inneractive.sdk.measurement.tracker.b(partner, mVar) : new com.fyber.inneractive.sdk.measurement.tracker.a(partner, mVar);
                bVar.a(mVar);
            }
            this.I = bVar;
        }
        com.fyber.inneractive.sdk.web.g gVar = this.f;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void r() {
        try {
            if (!(com.fyber.inneractive.sdk.util.o.a(this.b) instanceof android.app.Activity) || this.m0 == null) {
                return;
            }
            ((android.app.Activity) com.fyber.inneractive.sdk.util.o.a(this.b)).getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.m0);
            this.m0 = null;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void setAdDefaultSize(int i, int i2) {
        this.k0 = i;
        this.l0 = i2;
        this.d0 = i;
        this.e0 = i2;
    }

    public void setOrientationProperties(boolean z, java.lang.String str) {
        if ("portrait".equals(str)) {
            this.f0 = com.fyber.inneractive.sdk.config.enums.Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f0 = com.fyber.inneractive.sdk.config.enums.Orientation.LANDSCAPE;
        } else {
            this.f0 = com.fyber.inneractive.sdk.config.enums.Orientation.NONE;
        }
        com.fyber.inneractive.sdk.web.j1 j1Var = this.g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).a(z, this.f0);
        }
    }

    public void setResizeProperties() {
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void b(boolean z) {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this.n0);
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.s(this));
        com.fyber.inneractive.sdk.web.m mVar2 = this.S;
        if (mVar2 != null && mVar2.getParent() != null && (this.S.getParent() instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) this.S.getParent()).removeView(this.S);
            this.S = null;
        }
        android.widget.FrameLayout frameLayout = this.i0;
        if (frameLayout != null && this.j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.j0.removeAllViewsInLayout();
            android.view.ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(this.j0);
            }
        }
        this.i0 = null;
        this.j0 = null;
        this.h0 = null;
        this.f4339a = false;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
        if (bVar != null) {
            com.fyber.inneractive.sdk.util.v.a(bVar.f4262a);
            this.o0 = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            r();
        }
        super.b(z);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public boolean a(android.webkit.WebView webView, java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("%shandle url for: %s webView = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), str, webView);
        if (this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED && !android.text.TextUtils.isEmpty(str) && webView.equals(this.S) && !this.T) {
            this.T = true;
            return false;
        }
        return super.a(webView, str);
    }

    public final void c(boolean z) {
        if (this.R == null) {
            return;
        }
        if (z) {
            int b = com.fyber.inneractive.sdk.util.o.b(35);
            if (this.W == null) {
                com.fyber.inneractive.sdk.ui.IAcloseButton iAcloseButton = new com.fyber.inneractive.sdk.ui.IAcloseButton(com.fyber.inneractive.sdk.util.o.a(this.b), b);
                this.W = iAcloseButton;
                iAcloseButton.setOnClickListener(new com.fyber.inneractive.sdk.web.o(this));
            }
            com.fyber.inneractive.sdk.util.v.a(this.W);
            android.widget.FrameLayout frameLayout = this.j0;
            if (frameLayout != null) {
                frameLayout.addView(this.W);
                com.fyber.inneractive.sdk.ui.IAcloseButton iAcloseButton2 = this.W;
                android.view.ViewGroup.LayoutParams layoutParams = iAcloseButton2.getLayoutParams();
                layoutParams.width = b;
                layoutParams.height = b;
                iAcloseButton2.setLayoutParams(layoutParams);
                com.fyber.inneractive.sdk.util.o.a(this.W, 53);
                com.fyber.inneractive.sdk.ui.IAcloseButton iAcloseButton3 = this.W;
                int b2 = com.fyber.inneractive.sdk.util.o.b(10);
                int b3 = com.fyber.inneractive.sdk.util.o.b(10);
                android.view.ViewGroup.LayoutParams layoutParams2 = iAcloseButton3.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.topMargin = b2;
                    marginLayoutParams.rightMargin = b3;
                    marginLayoutParams.bottomMargin = 0;
                    iAcloseButton3.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.j0;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.W);
            }
        }
        com.fyber.inneractive.sdk.web.j1 j1Var = this.g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).b(z);
        }
        this.X = !z;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void a(android.content.Context context, boolean z) {
        android.view.Window window;
        android.view.Window window2;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.Y = displayMetrics.density;
        android.graphics.Rect rect = new android.graphics.Rect();
        boolean z2 = context instanceof android.app.Activity;
        if (z2 && (window2 = ((android.app.Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.top;
        android.view.View findViewById = (!z2 || (window = ((android.app.Activity) context).getWindow()) == null) ? null : window.findViewById(android.R.id.content);
        int top = findViewById != null ? findViewById.getTop() - i : 0;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        double d = i2;
        double d2 = 160.0d / displayMetrics.densityDpi;
        int i4 = (int) (d2 * d);
        int i5 = (int) (d2 * i3);
        int i6 = (i3 - i) - top;
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            i4 = this.b.getWidthDp();
            i5 = this.b.getHeightDp();
            int b = (com.fyber.inneractive.sdk.util.o.b(this.b.getHeightDp()) - i) - top;
            this.b0 = this.Z;
            this.c0 = (int) ((160.0d / displayMetrics.densityDpi) * b);
        } else {
            double d3 = 160.0d / displayMetrics.densityDpi;
            this.b0 = (int) (d * d3);
            this.c0 = (int) (d3 * i6);
        }
        if (this.Z == i4 && this.a0 == i5) {
            return;
        }
        this.Z = i4;
        this.a0 = i5;
        if (z) {
            a(new com.fyber.inneractive.sdk.mraid.c0(i4, i5));
            a(new com.fyber.inneractive.sdk.mraid.a0(this.b0, this.c0));
            a(new com.fyber.inneractive.sdk.mraid.z(this.b0, this.c0));
            int i7 = this.d0;
            if (i7 > 0 && this.e0 > 0) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i7), com.fyber.inneractive.sdk.util.o.c(this.e0)));
                return;
            }
            com.fyber.inneractive.sdk.web.m mVar2 = this.b;
            if (mVar2 == null || mVar2.getWidth() <= 0 || this.b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.b.getHeight())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.String str, int i, int i2, boolean z, boolean z2) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        float f;
        int i3;
        android.widget.FrameLayout frameLayout;
        com.fyber.inneractive.sdk.web.d0 d0Var;
        int i4;
        com.fyber.inneractive.sdk.web.j1 j1Var;
        android.widget.ImageView imageView;
        if (this.b == null || this.O == com.fyber.inneractive.sdk.web.z.DISABLED || this.N != com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
            return;
        }
        if (str != null && !android.webkit.URLUtil.isValidUrl(str)) {
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        try {
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.b.getRootView().findViewById(android.R.id.content);
            this.R = viewGroup3;
            if (viewGroup3 == null) {
                com.fyber.inneractive.sdk.util.IAlog.f("Couldn't find content in the view tree", new java.lang.Object[0]);
                a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                this.m0 = new com.fyber.inneractive.sdk.web.t(this);
                if (com.fyber.inneractive.sdk.util.o.a(this.b) instanceof android.app.Activity) {
                    ((android.app.Activity) com.fyber.inneractive.sdk.util.o.a(this.b)).getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.m0);
                }
            }
            this.X = z;
            com.fyber.inneractive.sdk.web.j1 j1Var2 = this.g;
            if (j1Var2 != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var2).b(z);
            }
            d(z2);
            if (this.e0 >= 0) {
                this.e0 = com.fyber.inneractive.sdk.util.o.b(i2);
            }
            if (this.d0 >= 0) {
                this.d0 = com.fyber.inneractive.sdk.util.o.b(i);
            }
            com.fyber.inneractive.sdk.web.m mVar = this.b;
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) mVar.getParent();
            if (viewGroup4 != null) {
                android.view.View findViewById = viewGroup4.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
                if (findViewById instanceof android.view.ViewGroup) {
                    viewGroup = (android.view.ViewGroup) findViewById;
                    if (str == null) {
                        com.fyber.inneractive.sdk.web.m mVar2 = new com.fyber.inneractive.sdk.web.m();
                        this.S = mVar2;
                        mVar2.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_webview_mraid);
                        this.S.loadUrl(str);
                        this.S.setWebChromeClient(this.c);
                        this.S.setWebViewClient(this.d);
                        mVar = this.S;
                        mVar.setOnKeyListener(new com.fyber.inneractive.sdk.web.u(this));
                    } else {
                        com.fyber.inneractive.sdk.web.m mVar3 = this.b;
                        if (mVar3 != null && (viewGroup2 = (android.view.ViewGroup) mVar3.getParent()) != null) {
                            int childCount = viewGroup2.getChildCount();
                            int i5 = 0;
                            while (i5 < childCount && viewGroup2.getChildAt(i5) != this.b) {
                                i5++;
                            }
                            android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) viewGroup2.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
                            this.g0 = i5;
                            com.fyber.inneractive.sdk.util.v.a(viewGroup5);
                            android.widget.FrameLayout frameLayout2 = this.h0;
                            if (frameLayout2 != null) {
                                com.fyber.inneractive.sdk.util.v.a(frameLayout2);
                                viewGroup2.addView(this.h0, i5);
                                android.widget.FrameLayout frameLayout3 = this.h0;
                                int width = this.b.getWidth();
                                int height = this.b.getHeight();
                                android.view.ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                                layoutParams.width = width;
                                layoutParams.height = height;
                                frameLayout3.setLayoutParams(layoutParams);
                                com.fyber.inneractive.sdk.util.o.a(this.h0, 17);
                            }
                            viewGroup2.removeView(this.b);
                        }
                    }
                    f = this.Y;
                    i3 = (int) ((50.0f * f) + 0.5f);
                    if (i2 >= 0 && i >= 0) {
                        i = (int) (i * f);
                        i2 = (int) (i2 * f);
                        if (i < i3) {
                            i = i3;
                        }
                        if (i2 < i3) {
                            i2 = i3;
                        }
                    }
                    if (this.j0 != null && this.i0 != null) {
                        android.view.View view = new android.view.View(com.fyber.inneractive.sdk.util.o.a(this.b));
                        view.setBackgroundColor(com.fyber.inneractive.sdk.util.o.a(this.b).getResources().getColor(com.fyber.inneractive.sdk.R.color.ia_mraid_expanded_dimmed_bk));
                        view.setOnTouchListener(new com.fyber.inneractive.sdk.web.n());
                        this.j0.addView(view);
                        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        view.setLayoutParams(layoutParams2);
                        com.fyber.inneractive.sdk.util.v.a(mVar);
                        this.i0.addView(mVar);
                        android.view.ViewGroup.LayoutParams layoutParams3 = mVar.getLayoutParams();
                        layoutParams3.width = -1;
                        layoutParams3.height = -1;
                        mVar.setLayoutParams(layoutParams3);
                        com.fyber.inneractive.sdk.util.v.a(this.i0);
                        this.j0.addView(this.i0);
                        android.widget.FrameLayout frameLayout4 = this.i0;
                        android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout4.getLayoutParams();
                        layoutParams4.width = i;
                        layoutParams4.height = i2;
                        frameLayout4.setLayoutParams(layoutParams4);
                        com.fyber.inneractive.sdk.util.o.a(this.i0, 17);
                    }
                    frameLayout = this.j0;
                    if (frameLayout != null) {
                        com.fyber.inneractive.sdk.util.v.a(frameLayout);
                        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
                        if (bVar != null && (imageView = bVar.f4262a) != null) {
                            com.fyber.inneractive.sdk.util.v.a(imageView);
                            android.widget.ImageView imageView2 = this.o0.f4262a;
                            android.view.ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                            layoutParams5.width = -1;
                            layoutParams5.height = -1;
                            imageView2.setLayoutParams(layoutParams5);
                            this.j0.addView(this.o0.f4262a);
                        }
                        this.R.addView(this.j0);
                        android.widget.FrameLayout frameLayout5 = this.j0;
                        android.view.ViewGroup.LayoutParams layoutParams6 = frameLayout5.getLayoutParams();
                        layoutParams6.width = -1;
                        layoutParams6.height = -1;
                        frameLayout5.setLayoutParams(layoutParams6);
                    }
                    if (!mVar.hasFocus()) {
                        mVar.requestFocus();
                    }
                    d0Var = this.P;
                    if (d0Var != com.fyber.inneractive.sdk.web.d0.ALWAYS_VISIBLE || (!this.X && d0Var != com.fyber.inneractive.sdk.web.d0.ALWAYS_HIDDEN)) {
                        c(true);
                    }
                    com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
                    this.N = f0Var;
                    a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
                    i4 = this.d0;
                    if (i4 != -1 && this.e0 != -1) {
                        a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i4), com.fyber.inneractive.sdk.util.o.c(this.e0)));
                    }
                    a(com.fyber.inneractive.sdk.mraid.k.EXPAND);
                    if (viewGroup != null) {
                        int dimension = (int) viewGroup.getContext().getResources().getDimension(com.fyber.inneractive.sdk.R.dimen.ia_identifier_padding);
                        viewGroup.setPadding(dimension, 0, 0, dimension);
                        viewGroup.setLayoutParams(this.R.getLayoutParams());
                        this.R.addView(viewGroup);
                    }
                    j1Var = this.g;
                    if (j1Var == null) {
                        ((com.fyber.inneractive.sdk.web.b0) j1Var).d();
                        return;
                    }
                    return;
                }
            }
            viewGroup = null;
            if (str == null) {
            }
            f = this.Y;
            i3 = (int) ((50.0f * f) + 0.5f);
            if (i2 >= 0) {
                i = (int) (i * f);
                i2 = (int) (i2 * f);
                if (i < i3) {
                }
                if (i2 < i3) {
                }
            }
            if (this.j0 != null) {
                android.view.View view2 = new android.view.View(com.fyber.inneractive.sdk.util.o.a(this.b));
                view2.setBackgroundColor(com.fyber.inneractive.sdk.util.o.a(this.b).getResources().getColor(com.fyber.inneractive.sdk.R.color.ia_mraid_expanded_dimmed_bk));
                view2.setOnTouchListener(new com.fyber.inneractive.sdk.web.n());
                this.j0.addView(view2);
                android.view.ViewGroup.LayoutParams layoutParams22 = view2.getLayoutParams();
                layoutParams22.width = -1;
                layoutParams22.height = -1;
                view2.setLayoutParams(layoutParams22);
                com.fyber.inneractive.sdk.util.v.a(mVar);
                this.i0.addView(mVar);
                android.view.ViewGroup.LayoutParams layoutParams32 = mVar.getLayoutParams();
                layoutParams32.width = -1;
                layoutParams32.height = -1;
                mVar.setLayoutParams(layoutParams32);
                com.fyber.inneractive.sdk.util.v.a(this.i0);
                this.j0.addView(this.i0);
                android.widget.FrameLayout frameLayout42 = this.i0;
                android.view.ViewGroup.LayoutParams layoutParams42 = frameLayout42.getLayoutParams();
                layoutParams42.width = i;
                layoutParams42.height = i2;
                frameLayout42.setLayoutParams(layoutParams42);
                com.fyber.inneractive.sdk.util.o.a(this.i0, 17);
            }
            frameLayout = this.j0;
            if (frameLayout != null) {
            }
            if (!mVar.hasFocus()) {
            }
            d0Var = this.P;
            if (d0Var != com.fyber.inneractive.sdk.web.d0.ALWAYS_VISIBLE) {
            }
            c(true);
            com.fyber.inneractive.sdk.mraid.f0 f0Var2 = com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
            this.N = f0Var2;
            a(new com.fyber.inneractive.sdk.mraid.d0(f0Var2));
            i4 = this.d0;
            if (i4 != -1) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i4), com.fyber.inneractive.sdk.util.o.c(this.e0)));
            }
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND);
            if (viewGroup != null) {
            }
            j1Var = this.g;
            if (j1Var == null) {
            }
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Couldn't find content in the view tree", new java.lang.Object[0]);
            a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public static java.util.HashMap a(java.util.Map map) {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                java.util.Date a2 = a((java.lang.String) map.get("start"));
                if (a2 != null) {
                    hashMap.put("beginTime", java.lang.Long.valueOf(a2.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        java.util.Date a3 = a((java.lang.String) map.get("end"));
                        if (a3 != null) {
                            hashMap.put("endTime", java.lang.Long.valueOf(a3.getTime()));
                        } else {
                            throw new java.lang.IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)) {
                        hashMap.put("eventLocation", map.get(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION));
                    }
                    if (map.containsKey("summary")) {
                        hashMap.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        hashMap.put("availability", java.lang.Integer.valueOf(com.ironsource.X3.i.T.equals(map.get("transparency")) ? 1 : 0));
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if (map.containsKey("frequency")) {
                        java.lang.String str2 = (java.lang.String) map.get("frequency");
                        int parseInt = map.containsKey("interval") ? java.lang.Integer.parseInt((java.lang.String) map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb.append("FREQ=WEEKLY;");
                                if (parseInt != -1) {
                                    sb.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    java.lang.String str3 = (java.lang.String) map.get("daysInWeek");
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    java.lang.String[] split = str3.split(",");
                                    for (java.lang.String str4 : split) {
                                        int parseInt2 = java.lang.Integer.parseInt(str4);
                                        if (parseInt2 == 7) {
                                            parseInt2 = 0;
                                        }
                                        if (!zArr[parseInt2]) {
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                            switch (parseInt2) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of week ", parseInt2));
                                            }
                                            sb3.append(str);
                                            sb3.append(",");
                                            sb2.append(sb3.toString());
                                            zArr[parseInt2] = true;
                                        }
                                    }
                                    if (split.length != 0) {
                                        sb2.deleteCharAt(sb2.length() - 1);
                                        java.lang.String sb4 = sb2.toString();
                                        if (sb4 == null) {
                                            throw new java.lang.IllegalArgumentException("invalid ");
                                        }
                                        sb.append("BYDAY=" + sb4 + ";");
                                    } else {
                                        throw new java.lang.IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb.append("FREQ=MONTHLY;");
                                if (parseInt != -1) {
                                    sb.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    java.lang.String str5 = (java.lang.String) map.get("daysInMonth");
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    java.lang.String[] split2 = str5.split(",");
                                    for (java.lang.String str6 : split2) {
                                        int parseInt3 = java.lang.Integer.parseInt(str6);
                                        int i = parseInt3 + 31;
                                        if (!zArr2[i]) {
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                            if (parseInt3 != 0 && parseInt3 >= -31 && parseInt3 <= 31) {
                                                sb6.append("" + parseInt3);
                                                sb6.append(",");
                                                sb5.append(sb6.toString());
                                                zArr2[i] = true;
                                            } else {
                                                throw new java.lang.IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of month ", parseInt3));
                                            }
                                        }
                                    }
                                    if (split2.length != 0) {
                                        sb5.deleteCharAt(sb5.length() - 1);
                                        java.lang.String sb7 = sb5.toString();
                                        if (sb7 == null) {
                                            throw new java.lang.IllegalArgumentException();
                                        }
                                        sb.append("BYMONTHDAY=" + sb7 + ";");
                                    } else {
                                        throw new java.lang.IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new java.lang.IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    java.lang.String sb8 = sb.toString();
                    if (!android.text.TextUtils.isEmpty(sb8)) {
                        hashMap.put("rrule", sb8);
                    }
                    return hashMap;
                }
                throw new java.lang.IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new java.lang.IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new java.lang.IllegalArgumentException("Missing start and description fields");
    }

    public static java.util.Date a(java.lang.String str) {
        java.util.Date date = null;
        int i = 0;
        while (true) {
            java.lang.String[] strArr = q0;
            if (i >= 2) {
                break;
            }
            try {
                date = new java.text.SimpleDateFormat(strArr[i], java.util.Locale.getDefault()).parse(str);
            } catch (java.text.ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i++;
        }
        return date;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar, java.lang.String str) {
        java.lang.String a2 = kVar.a();
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireErrorEvent('" + a2 + "', '" + str + "');");
        }
    }

    public static java.util.LinkedHashMap a(java.net.URI uri) {
        int i;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (java.lang.String str : rawQuery.split(com.ironsource.X3.j.c)) {
                int indexOf = str.indexOf(com.ironsource.X3.j.b);
                linkedHashMap.put(indexOf > 0 ? java.net.URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : java.net.URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    public final void a(android.view.View view, com.fyber.inneractive.sdk.measurement.tracker.d dVar) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        if (view == null || (eVar = this.I) == null) {
            return;
        }
        eVar.getClass();
        try {
            com.iab.omid.library.fyber.adsession.AdSession adSession = eVar.f3791a;
            if (adSession != null) {
                if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton) {
                    adSession.addFriendlyObstruction(view, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.CLOSE_AD, dVar.name());
                } else if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.Watermark) {
                    adSession.addFriendlyObstruction(view, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.NOT_VISIBLE, dVar.name());
                } else {
                    adSession.addFriendlyObstruction(view, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.OTHER, dVar.name());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.BANNER_RESIZE_EXPAND;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.r;
        com.fyber.inneractive.sdk.flow.x xVar = this.s;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        org.json.JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b;
        wVar.a("action", kVar.a()).a((java.lang.String) null);
    }
}
