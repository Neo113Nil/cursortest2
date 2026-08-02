package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class bp extends com.facetec.sdk.au {

    /* renamed from: a, reason: collision with root package name */
    android.widget.LinearLayout f3432a;
    android.widget.TextView b;
    android.widget.TextView c;
    android.widget.LinearLayout d;
    android.widget.ImageView e;
    android.graphics.drawable.GradientDrawable f;
    android.view.View g;
    android.graphics.drawable.GradientDrawable i;
    android.widget.RelativeLayout j;
    private android.widget.TextView k;
    private android.widget.TextView l;
    private android.widget.TextView m;
    private android.widget.TextView n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f3433o;
    private android.widget.RelativeLayout p;
    private com.facetec.sdk.i q;
    private android.widget.RelativeLayout r;
    private android.widget.TextView s;
    boolean h = false;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener t = new com.facetec.sdk.bp.AnonymousClass4();

    protected enum b {
        GENERIC,
        READY_OVAL
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_guidance_center_content_fragment, viewGroup, false);
        this.g = inflate;
        return inflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f3432a = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.iconLayout);
        this.e = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.iconImageView);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.genericHeaderView);
        this.b = textView;
        com.facetec.sdk.dm.c(textView);
        this.b.setTypeface(com.facetec.sdk.bo.b);
        this.b.setLineSpacing(0.0f, 1.1f);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.feedbackIconsHeader);
        this.l = textView2;
        com.facetec.sdk.dm.c(textView2);
        this.l.setTypeface(com.facetec.sdk.bo.b);
        this.l.setLineSpacing(0.0f, 1.1f);
        this.c = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageView1);
        this.f3433o = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageView2);
        this.c.setTypeface(com.facetec.sdk.bo.c);
        this.f3433o.setTypeface(com.facetec.sdk.bo.c);
        com.facetec.sdk.dm.c(this.c);
        com.facetec.sdk.dm.c(this.f3433o);
        this.c.setLineSpacing(0.0f, 1.1f);
        this.f3433o.setLineSpacing(0.0f, 1.1f);
        this.p = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.readyScreenContent);
        this.k = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.readyScreenHeader1);
        this.n = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.readyScreenHeader2);
        this.m = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.readyScreenSubtext1);
        this.s = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.readyScreenSubtext2);
        this.r = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.readyScreenHeaderOuterContainer);
        this.j = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.readyScreenSubtextOuterContainer);
        this.d = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.readyScreenHeaderInnerContainer);
        this.q = (com.facetec.sdk.i) view.findViewById(com.facetec.sdk.R.id.readyScreenSubtextInnerContainer);
        this.d.setImportantForAccessibility(1);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.d.setAccessibilityHeading(true);
        }
        this.j.setImportantForAccessibility(1);
        this.r.setImportantForAccessibility(2);
        this.k.setImportantForAccessibility(2);
        this.n.setImportantForAccessibility(2);
        this.m.setImportantForAccessibility(2);
        this.s.setImportantForAccessibility(2);
        this.k.setTypeface(com.facetec.sdk.dm.N());
        this.n.setTypeface(com.facetec.sdk.dm.N());
        this.m.setTypeface(com.facetec.sdk.dm.K());
        this.s.setTypeface(com.facetec.sdk.dm.K());
        this.k.setTextColor(com.facetec.sdk.dm.h(getActivity()));
        this.n.setTextColor(com.facetec.sdk.dm.h(getActivity()));
        this.m.setTextColor(com.facetec.sdk.dm.f(getActivity()));
        this.s.setTextColor(com.facetec.sdk.dm.f(getActivity()));
        this.k.setLineSpacing(0.0f, 1.1f);
        this.n.setLineSpacing(0.0f, 1.1f);
        this.m.setLineSpacing(0.0f, 1.1f);
        this.s.setLineSpacing(0.0f, 1.1f);
        float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        float f = 28.0f * a2;
        this.k.setTextSize(2, f);
        this.n.setTextSize(2, f);
        float f2 = 20.0f * a2;
        this.m.setTextSize(2, f2);
        this.s.setTextSize(2, f2);
        this.b.setTextSize(2, f);
        this.l.setTextSize(2, f);
        this.c.setTextSize(2, f2);
        int d = com.facetec.sdk.dm.d();
        view.setPadding(d, d, d, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.setMarginStart(d);
        layoutParams.setMarginEnd(d);
        this.r.setLayoutParams(layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams2.setMarginStart(d);
        layoutParams2.setMarginEnd(d);
        this.j.setLayoutParams(layoutParams2);
        com.facetec.sdk.bp.b bVar = (com.facetec.sdk.bp.b) getArguments().get("screenType");
        int i = getArguments().getInt(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER);
        if (bVar == com.facetec.sdk.bp.b.GENERIC) {
            com.facetec.sdk.dl.d(this.b, i);
        } else {
            com.facetec.sdk.dl.d(this.l, i);
        }
        if (bVar == com.facetec.sdk.bp.b.GENERIC) {
            com.facetec.sdk.dl.d(this.c, getArguments().getInt("message"));
        } else if (bVar == com.facetec.sdk.bp.b.READY_OVAL) {
            this.p.setVisibility(0);
            com.facetec.sdk.dp.e(this.k, com.facetec.sdk.dm.c(true, false));
            com.facetec.sdk.dp.e(this.n, com.facetec.sdk.dm.b(true, false));
            com.facetec.sdk.dp.e(this.m, com.facetec.sdk.dm.a(true, false));
            com.facetec.sdk.dp.e(this.s, com.facetec.sdk.dm.e(true, false));
            android.content.res.Resources resources = getResources();
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) resources.getDrawable(com.facetec.sdk.R.drawable.facetec_ready_header_background).mutate();
            this.i = gradientDrawable;
            gradientDrawable.setCornerRadius(com.facetec.sdk.ay.d(com.facetec.sdk.dm.D()) * com.facetec.sdk.dm.b());
            com.facetec.sdk.dp.b(getActivity(), this.i, com.facetec.sdk.dm.V());
            android.graphics.drawable.GradientDrawable gradientDrawable2 = (android.graphics.drawable.GradientDrawable) resources.getDrawable(com.facetec.sdk.R.drawable.facetec_ready_subtext_background).mutate();
            this.f = gradientDrawable2;
            gradientDrawable2.setCornerRadius(com.facetec.sdk.ay.d(com.facetec.sdk.dm.D()) * com.facetec.sdk.dm.b());
            com.facetec.sdk.dp.b(getActivity(), this.f, com.facetec.sdk.dm.V());
            this.r.getViewTreeObserver().addOnGlobalLayoutListener(this.t);
        }
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f3432a.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams3).height = java.lang.Math.round(com.facetec.sdk.ay.d(78) * a2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = d;
        this.f3432a.setLayoutParams(layoutParams3);
        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) this.b.getLayoutParams())).bottomMargin = d;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getArguments().getBoolean("isCameraPermissionsShowing")) {
            this.b.setImportantForAccessibility(1);
            this.b.sendAccessibilityEvent(8);
            this.b.performAccessibilityAction(64, null);
            return;
        }
        this.j.setImportantForAccessibility(1);
        android.widget.RelativeLayout relativeLayout = this.j;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) this.m.getText());
        sb.append(" ");
        sb.append((java.lang.Object) this.s.getText());
        relativeLayout.setContentDescription(sb.toString());
        this.d.setImportantForAccessibility(1);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.d.setScreenReaderFocusable(true);
            this.j.setScreenReaderFocusable(true);
        }
        this.d.sendAccessibilityEvent(8);
        this.d.performAccessibilityAction(64, null);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b();
    }

    final void b() {
        android.widget.RelativeLayout relativeLayout = this.r;
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.t);
        }
    }

    /* renamed from: com.facetec.sdk.bp$4, reason: invalid class name */
    final class AnonymousClass4 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass4() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            com.facetec.sdk.bp.this.b();
            if (com.facetec.sdk.bp.this.h) {
                return;
            }
            com.facetec.sdk.bp.this.h = true;
            com.facetec.sdk.bp.this.r.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bp$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bp.AnonymousClass4.this.e();
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            boolean z;
            boolean z2;
            int i;
            float a2 = com.facetec.sdk.dm.a();
            int round = java.lang.Math.round(com.facetec.sdk.dm.d() * com.facetec.sdk.dm.b());
            int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(35) * com.facetec.sdk.dm.b() * a2);
            int round3 = java.lang.Math.round(com.facetec.sdk.ay.d(5) * com.facetec.sdk.dm.b() * a2);
            float f = com.facetec.sdk.bp.this.getArguments().getFloat("bottomOval");
            int i2 = round3 << 1;
            float f2 = i2;
            float f3 = (com.facetec.sdk.bp.this.getArguments().getFloat("topOval") - (round << 1)) - f2;
            float measuredHeight = (com.facetec.sdk.bp.this.g.getMeasuredHeight() - f) - f2;
            int measuredHeight2 = com.facetec.sdk.bp.this.d.getMeasuredHeight() - i2;
            int floor = (int) java.lang.Math.floor(f3);
            if (f3 < measuredHeight2) {
                floor = (round3 << 2) + measuredHeight2;
                z = true;
            } else {
                z = false;
            }
            int measuredHeight3 = com.facetec.sdk.bp.this.q.getMeasuredHeight() - i2;
            int floor2 = (int) java.lang.Math.floor(measuredHeight);
            if (measuredHeight < measuredHeight3) {
                floor2 = measuredHeight3 + (round3 << 2);
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = (z && com.facetec.sdk.dm.bm()) ? round2 : 0;
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, floor);
            layoutParams.setMargins(i3, 0, i3, 0);
            layoutParams.addRule(10);
            com.facetec.sdk.bp.this.r.setLayoutParams(layoutParams);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, floor2);
            layoutParams2.setMargins(0, 0, 0, round3);
            layoutParams2.addRule(12);
            com.facetec.sdk.bp.this.j.setLayoutParams(layoutParams2);
            if (z) {
                com.facetec.sdk.bp.this.d.setPadding(round3, round3, round3, round3);
                com.facetec.sdk.bp.this.d.setBackground(com.facetec.sdk.bp.this.i);
                com.facetec.sdk.bp.this.d.invalidate();
            }
            if (z2) {
                com.facetec.sdk.bp.this.q.setPadding(round3, round3, round3, round3);
                com.facetec.sdk.bp.this.q.setBackground(com.facetec.sdk.bp.this.f);
                com.facetec.sdk.bp.this.q.invalidate();
            }
            if (com.facetec.sdk.FaceTecSDK.f3366a.f3360a) {
                com.facetec.sdk.bp.this.q.setOnClickRunnable(new java.lang.Runnable() { // from class: com.facetec.sdk.bp$4$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bp.AnonymousClass4.this.a();
                    }
                });
            }
            int floor3 = (int) java.lang.Math.floor((floor / 2.0d) / 1.3d);
            int floor4 = (int) java.lang.Math.floor((floor2 / 2.0d) / 1.3d);
            int width = com.facetec.sdk.bp.this.r.getWidth();
            int width2 = com.facetec.sdk.bp.this.j.getWidth();
            if (z) {
                floor3 = (int) java.lang.Math.floor((floor - i2) / 2.0d);
                width -= i2;
                i = width;
            } else {
                if (!com.facetec.sdk.dm.bm()) {
                    round2 = 0;
                }
                i = width - (round2 << 1);
            }
            if (z2) {
                floor4 = (int) java.lang.Math.floor((floor2 - i2) / 2.0d);
                width2 = com.facetec.sdk.bp.this.j.getWidth() - i2;
            }
            com.facetec.sdk.ay.d dVar = new com.facetec.sdk.ay.d(i, floor3);
            com.facetec.sdk.ay.d dVar2 = new com.facetec.sdk.ay.d(width, floor3);
            com.facetec.sdk.ay.d dVar3 = new com.facetec.sdk.ay.d(width2, floor4);
            int round4 = java.lang.Math.round(com.facetec.sdk.ay.c(8));
            int round5 = java.lang.Math.round(com.facetec.sdk.ay.c(40));
            int round6 = java.lang.Math.round(com.facetec.sdk.ay.c(5));
            int round7 = java.lang.Math.round(com.facetec.sdk.ay.c(36));
            int c = com.facetec.sdk.ay.c(com.facetec.sdk.bp.this.k, dVar, round4, round5);
            int c2 = com.facetec.sdk.ay.c(com.facetec.sdk.bp.this.n, dVar2, round4, round5);
            int c3 = com.facetec.sdk.ay.c(com.facetec.sdk.bp.this.m, dVar3, round6, round7);
            int c4 = com.facetec.sdk.ay.c(com.facetec.sdk.bp.this.s, dVar3, round6, round7);
            int min = java.lang.Math.min(c, c2);
            int round8 = (int) java.lang.Math.round(min * 0.85d);
            if (c3 >= round8) {
                c3 = round8;
            }
            if (c4 >= c3) {
                c4 = c3;
            }
            float f4 = min;
            com.facetec.sdk.bp.this.k.setTextSize(0, f4);
            com.facetec.sdk.bp.this.n.setTextSize(0, f4);
            float f5 = c4;
            com.facetec.sdk.bp.this.m.setTextSize(0, f5);
            com.facetec.sdk.bp.this.s.setTextSize(0, f5);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(java.lang.String.valueOf(com.facetec.sdk.bp.this.k.getText()));
            sb.append((java.lang.Object) com.facetec.sdk.bp.this.n.getText());
            com.facetec.sdk.bp.this.d.setContentDescription(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) com.facetec.sdk.bp.this.getActivity();
            if (blVar != null) {
                blVar.x();
            }
        }
    }

    static com.facetec.sdk.bp e(int i, int i2, com.facetec.sdk.bp.b bVar, float f, float f2, int i3) {
        com.facetec.sdk.bp bpVar = new com.facetec.sdk.bp();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, i);
        bundle.putInt("message", i2);
        bundle.putSerializable("screenType", bVar);
        bundle.putFloat("topOval", f);
        bundle.putFloat("bottomOval", f2);
        bundle.putInt("retryActionButtonId", i3);
        bpVar.setArguments(bundle);
        return bpVar;
    }

    final void b(int i) {
        java.lang.String[] split = com.facetec.sdk.dl.d(i).split("\n\n");
        if (split.length == 2) {
            this.c.setText(split[0]);
            this.f3433o.setText(split[1]);
            this.f3433o.setVisibility(0);
        } else {
            com.facetec.sdk.dl.d(this.c, i);
            this.f3433o.setVisibility(8);
        }
    }

    final void c(boolean z) {
        android.widget.TextView textView;
        if (!c() || (textView = this.k) == null || this.n == null || this.m == null || this.s == null) {
            return;
        }
        com.facetec.sdk.ay.d(new java.util.ArrayList(java.util.Arrays.asList(this.k, this.n)), java.lang.Integer.valueOf(textView.getCurrentTextColor()).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dm.h(getActivity())).intValue()).start();
        com.facetec.sdk.ay.d(new java.util.ArrayList(java.util.Arrays.asList(this.m, this.s)), java.lang.Integer.valueOf(this.m.getCurrentTextColor()).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dm.f(getActivity())).intValue()).start();
        if (z) {
            if (this.d.getBackground() == null && this.q.getBackground() == null) {
                return;
            }
            com.facetec.sdk.ay.e(new java.util.ArrayList(java.util.Arrays.asList(this.i, this.f)), new java.util.ArrayList(java.util.Arrays.asList(this.d, this.q)), java.lang.Integer.valueOf(com.facetec.sdk.dp.e(getActivity(), com.facetec.sdk.FaceTecSDK.f3366a.g.readyScreenTextBackgroundColor)).intValue(), java.lang.Integer.valueOf(com.facetec.sdk.dp.e(getActivity(), com.facetec.sdk.dm.V())).intValue()).start();
        }
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
