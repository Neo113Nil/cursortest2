package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class da extends com.facetec.sdk.au {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char E;
    private static char F;
    private static char G;
    private static char J;

    /* renamed from: a, reason: collision with root package name */
    android.widget.ImageView f3492a;
    android.widget.RelativeLayout b;
    android.widget.TextView c;
    android.widget.RelativeLayout d;
    android.widget.ImageView e;
    private android.view.View f;
    android.widget.ImageView g;
    private android.widget.TextView h;
    com.facetec.sdk.e j;
    private android.widget.ProgressBar k;
    private android.widget.ImageView l;
    private android.widget.ImageView m;
    private android.widget.TextView n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.RelativeLayout f3493o;
    private android.widget.ImageView p;
    private android.animation.ObjectAnimator q;
    private android.widget.TextView r;
    private android.widget.LinearLayout s;
    private android.widget.RelativeLayout t;
    private android.os.Handler v;
    boolean i = false;
    private boolean u = false;
    private boolean w = false;
    private boolean y = false;
    private boolean x = false;
    private long C = -1;
    private com.facetec.sdk.da.b A = com.facetec.sdk.da.b.UPLOAD_STARTED;
    private com.facetec.sdk.da.c D = com.facetec.sdk.da.c.DEFAULT;
    private final android.os.Handler z = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean B = false;
    private final com.facetec.sdk.au.b I = new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda17
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.da.this.s();
        }
    });
    private android.view.ViewTreeObserver.OnGlobalLayoutListener H = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.da.2
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (com.facetec.sdk.da.this.i) {
                return;
            }
            com.facetec.sdk.da.this.i = true;
            com.facetec.sdk.da.this.b();
            float a2 = com.facetec.sdk.dm.a();
            float b2 = com.facetec.sdk.dm.b();
            int d = com.facetec.sdk.dm.d();
            int d2 = (int) (com.facetec.sdk.ay.d(35) * b2 * a2);
            float f = d / 2.0f;
            int round = java.lang.Math.round(f);
            int round2 = java.lang.Math.round(f);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.da.this.g.getLayoutParams();
            layoutParams.setMargins(round, round, 0, 0);
            layoutParams.setMarginStart(round);
            layoutParams.setMarginEnd(round);
            com.facetec.sdk.da.this.g.setLayoutParams(layoutParams);
            com.facetec.sdk.da.this.g.setPadding(round2, round2, round2, round2);
            com.facetec.sdk.da.this.g.getLayoutParams().height = d2;
            com.facetec.sdk.da.this.g.getLayoutParams().width = d2;
            com.facetec.sdk.da.this.g.requestLayout();
        }
    };

    enum b {
        UPLOAD_STARTED,
        STILL_UPLOADING,
        UPLOAD_COMPLETE_AWAITING_RESPONSE,
        UPLOAD_COMPLETE_AWAITING_PROCESSING
    }

    enum c {
        DEFAULT,
        FRONT_SIDE,
        BACK_SIDE,
        USER_CONFIRMED_INFO,
        NFC,
        SKIPPED_NFC
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b2, byte b3, short s) {
        int i;
        int i2;
        int i3 = (b3 * 3) + 1;
        int i4 = 112 - (s * 3);
        byte[] bArr = $$a;
        int i5 = (b2 * 4) + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            i2 = 0;
            int i8 = i5 + i7;
            int i9 = i6 + 1;
            i = i2;
            i4 = i8;
            i5 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i10 = i4;
            i6 = i5;
            i5 = i10;
            int i82 = i5 + i7;
            int i92 = i6 + 1;
            i = i2;
            i4 = i82;
            i5 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -25, 39, -86};
        $$b = 89;
    }

    private static void K(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr = new char[charArray.length];
        hoVar.b = 0;
        char[] cArr2 = new char[2];
        while (hoVar.b < charArray.length) {
            cArr2[0] = charArray[hoVar.b];
            cArr2[1] = charArray[hoVar.b + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c2 = cArr2[1];
                char c3 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf((c3 + i2) ^ ((c3 << 4) + ((char) (E ^ 2174069992062419062L)))), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(J)};
                    java.lang.Object d = com.facetec.sdk.al.d(1497828241);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 211, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (G ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(F)};
                    int i4 = charValue + i2;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(0), 211 - android.graphics.Color.blue(0), 22 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[hoVar.b] = cArr2[0];
            cArr[hoVar.b + 1] = cArr2[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d3 = com.facetec.sdk.al.d(-2113314280);
            if (d3 == null) {
                byte b2 = (byte) 0;
                d3 = com.facetec.sdk.al.c((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 31542), android.widget.ExpandableListView.getPackedPositionType(0L) + 1913, 24 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 635836640, false, $$c(b2, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d3).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.facetec.sdk.bf bfVar = (com.facetec.sdk.bf) getActivity();
        if (bfVar != null) {
            bfVar.q();
        }
    }

    static com.facetec.sdk.da a(boolean z, com.facetec.sdk.da.c cVar) {
        com.facetec.sdk.da daVar = new com.facetec.sdk.da();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isIDScan", z);
        bundle.putSerializable("uploadType", cVar);
        daVar.setArguments(bundle);
        return daVar;
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Handler handler = new android.os.Handler();
        this.v = handler;
        handler.postDelayed(this.I, androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_results_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.u = getArguments().getBoolean("isIDScan");
        this.D = (com.facetec.sdk.da.c) getArguments().get("uploadType");
        this.A = com.facetec.sdk.da.b.UPLOAD_STARTED;
        this.e = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.activityIndicatorImageView);
        this.k = (android.widget.ProgressBar) view.findViewById(com.facetec.sdk.R.id.uploadProgressBar);
        this.h = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.progressTextView);
        this.n = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.resultTextView);
        this.f = view.findViewById(com.facetec.sdk.R.id.zoomResultBackground);
        this.t = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.progressBarLayout);
        this.b = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.zoomResultLayout);
        this.f3493o = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.zoomResultContainer);
        this.l = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.resultAnimationBackground);
        this.m = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.resultAnimationForeground);
        this.s = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.devModeTagLayout);
        this.r = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.devModeTagTextView);
        this.p = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.devModeTagImageView);
        this.f3492a = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.nfcIcon);
        this.c = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.nfcStatus);
        this.d = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.nfcLayout);
        this.g = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.nfcBackButton);
        com.facetec.sdk.t.a(getActivity(), com.facetec.sdk.c.RESULT_SCREEN_SHOWN, this.D);
        if (c()) {
            this.g.setEnabled(true);
            if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                this.g.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(getActivity(), ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue()));
            }
            int i = com.facetec.sdk.da.AnonymousClass5.f3494a[com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d.ordinal()];
            if (i == 2) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams.removeRule(20);
                layoutParams.addRule(21);
                this.g.setLayoutParams(layoutParams);
            } else if (i == 3 || i == 4) {
                this.g.setVisibility(8);
            }
            this.g.getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            this.g.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda33
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.facetec.sdk.da.this.e(view2);
                }
            });
            this.g.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda34
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    boolean b2;
                    b2 = com.facetec.sdk.da.this.b(view2, motionEvent);
                    return b2;
                }
            });
        }
        if (com.facetec.sdk.bj.c() && com.facetec.sdk.FaceTecSDK.f3366a.c && !getActivity().getPackageName().contains("com.facetec.zoomlogin") && !getActivity().getPackageName().contains("om.facetec.photoidmatchtester")) {
            float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
            this.r.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.h.messageFont);
            this.r.setTextSize(2, 14.0f * a2);
            com.facetec.sdk.dm.d(this.r);
            this.p.setColorFilter(com.facetec.sdk.dm.S(), android.graphics.PorterDuff.Mode.SRC_IN);
            this.p.getLayoutParams().height = (int) (com.facetec.sdk.ay.d(18) * a2);
            this.p.getLayoutParams().width = (int) (com.facetec.sdk.ay.d(18) * a2);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.s.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = com.facetec.sdk.dm.d();
            ((android.view.ViewGroup.LayoutParams) layoutParams2).height = (int) (com.facetec.sdk.ay.d(26) * a2);
            this.s.setLayoutParams(layoutParams2);
            this.s.requestLayout();
            this.s.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.facetec.sdk.da.this.b(view2);
                }
            });
            this.s.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    boolean e;
                    e = com.facetec.sdk.da.this.e(view2, motionEvent);
                    return e;
                }
            });
            this.s.setVisibility(0);
        }
        com.facetec.sdk.dm.i(this.f);
        if (!this.u) {
            this.f.getBackground().setAlpha(com.facetec.sdk.dm.aW());
        }
        float a3 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        float bp = com.facetec.sdk.dm.bp();
        int d = com.facetec.sdk.dm.d();
        int round = java.lang.Math.round(com.facetec.sdk.ay.d(80) * bp * a3);
        int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(130) * a3);
        int round3 = java.lang.Math.round(com.facetec.sdk.ay.d(-55) * a3);
        int round4 = java.lang.Math.round(com.facetec.sdk.ay.d(6) * a3);
        int round5 = java.lang.Math.round(com.facetec.sdk.ay.d(50) * a3);
        com.facetec.sdk.e eVar = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.nfcSkipButton);
        this.j = eVar;
        eVar.c();
        this.j.setText(com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_action_skip_nfc));
        this.j.setEnabled(false);
        this.j.b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.q();
            }
        }));
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.j.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams3).height = round5;
        layoutParams3.setMargins(d, 0, d, d);
        this.j.setLayoutParams(layoutParams3);
        this.f3493o.setTranslationY(round3);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.resultFrame);
        frameLayout.getLayoutParams().height = round;
        frameLayout.getLayoutParams().width = round;
        this.f3492a.getLayoutParams().height = round2;
        android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) getResources().getDrawable(com.facetec.sdk.R.drawable.facetec_progress_bar);
        layerDrawable.mutate();
        android.graphics.drawable.Drawable drawable = layerDrawable.getDrawable(0);
        android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.ScaleDrawable) layerDrawable.getDrawable(1)).getDrawable();
        android.graphics.drawable.Drawable findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(com.facetec.sdk.R.id.progressFill);
        android.graphics.drawable.Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(com.facetec.sdk.R.id.progressGlow);
        float f = round4 / 2.0f;
        ((android.graphics.drawable.GradientDrawable) drawable).setCornerRadius(f);
        ((android.graphics.drawable.GradientDrawable) findDrawableByLayerId).setCornerRadius(f);
        ((android.graphics.drawable.GradientDrawable) findDrawableByLayerId2).setCornerRadius(f);
        com.facetec.sdk.dm.b(this.k, drawable);
        com.facetec.sdk.dm.b(this.k, findDrawableByLayerId, findDrawableByLayerId2);
        this.k.setProgressDrawable(layerDrawable);
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.k.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams4).height = round4;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin = d;
        this.k.setLayoutParams(layoutParams4);
        this.k.setVisibility(0);
        com.facetec.sdk.dm.d(this.h);
        com.facetec.sdk.dm.d(this.n);
        com.facetec.sdk.dm.d(this.c);
        this.h.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.h.messageFont);
        this.n.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.h.messageFont);
        this.c.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.h.messageFont);
        if (this.u) {
            this.h.setText(a(this.A, this.D));
        } else {
            com.facetec.sdk.dl.d(this.h, com.facetec.sdk.R.string.FaceTec_result_facescan_upload_message);
            this.n.setImportantForAccessibility(1);
            this.h.setImportantForAccessibility(1);
            android.widget.TextView textView = this.h;
            textView.setContentDescription(textView.getText().toString());
            this.h.performAccessibilityAction(64, null);
            this.h.sendAccessibilityEvent(8);
        }
        float f2 = a3 * 24.0f;
        this.h.setTextSize(2, f2);
        this.c.setTextSize(2, f2);
        this.n.setTextSize(2, f2);
        android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) this.h.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).topMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = d;
        this.h.setLayoutParams(layoutParams5);
        android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) this.n.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).topMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = d;
        this.n.setLayoutParams(layoutParams6);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) this.c.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).topMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = d;
        this.c.setLayoutParams(layoutParams7);
        android.view.ViewGroup.LayoutParams layoutParams8 = this.e.getLayoutParams();
        layoutParams8.height = round;
        layoutParams8.width = round;
        this.e.setLayoutParams(layoutParams8);
        int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1593082181, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1593082147)).intValue();
        final int bl = com.facetec.sdk.dm.bl();
        if (bl != 0) {
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.d(bl);
                }
            });
            this.e.setVisibility(0);
        } else if (intValue != 0) {
            this.e.setImageResource(intValue);
            this.e.clearAnimation();
            this.e.setVisibility(0);
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            rotateAnimation.setDuration(com.facetec.sdk.FaceTecSDK.f3366a.h.customActivityIndicatorRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.e.startAnimation(rotateAnimation);
        } else {
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.f();
                }
            });
        }
        boolean z = this.u && com.facetec.sdk.FaceTecCustomization.q != null;
        this.w = z;
        if (z) {
            this.z.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.r();
                }
            }));
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.h.showUploadProgressBar) {
            this.k.setVisibility(0);
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.p();
                }
            });
        } else {
            this.k.setVisibility(4);
        }
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.t();
            }
        });
        com.facetec.sdk.t.c(com.facetec.sdk.de.RESULT_UPLOAD);
        this.B = ((com.facetec.sdk.FaceTecSessionActivity) getActivity()).r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity != null) {
            faceTecSessionActivity.q.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        android.widget.ProgressBar progressBar = this.k;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), 3000);
        this.q = ofInt;
        ofInt.setDuration(3000L);
        this.q.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f3493o.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
        this.s.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
    }

    final android.widget.RelativeLayout a() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(android.view.View view) {
        ((com.facetec.sdk.FaceTecSessionActivity) getActivity()).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > this.g.getWidth() + this.g.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > this.g.getHeight() + this.g.getTop() + 10) {
            this.g.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.g.setAlpha(1.0f);
            this.g.performClick();
        }
        return true;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b();
    }

    final void b() {
        android.widget.ImageView imageView = this.g;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this.H);
        }
        this.H = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        this.s.setEnabled(false);
        this.s.setClickable(false);
        startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://dev.facetec.com/removing-development-mode-watermark")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.s.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > this.s.getWidth() + this.s.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > this.s.getHeight() + 10) {
            this.s.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.s.performClick();
        }
        return true;
    }

    final void e(final java.lang.String str) {
        if (!c() || this.w) {
            return;
        }
        b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.a(str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        if (this.x) {
            return;
        }
        if (this.k == null || r0.getProgress() / this.k.getMax() < 0.9d) {
            this.h.setText(str);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                K("⟧\uea23䫒㨔륗핈ꆁ큎ற宩뾻峇痊镨Ⓝ뾬", android.text.TextUtils.getOffsetAfter("", 0) + 16, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                K("㖃쒻ꜛ븳岇̛ॄଜ", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, objArr2);
                this.C = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    final void d(float f) {
        if (c()) {
            float progress = this.k.getProgress() / this.k.getMax();
            if (f > 1.0f || progress >= f) {
                return;
            }
            if (f == 1.0f && !this.y) {
                this.y = true;
                if (this.w) {
                    this.z.post(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda30
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.da.this.k();
                        }
                    }));
                }
            }
            float f2 = (f * 10000.0f) - 1000.0f;
            if (f2 > this.k.getProgress()) {
                android.animation.ObjectAnimator objectAnimator = this.q;
                if (objectAnimator != null) {
                    objectAnimator.end();
                    this.q = null;
                }
                this.k.setProgress(java.lang.Math.round(f2), true);
            }
            this.v.removeCallbacks(this.I);
            this.v.postDelayed(this.I, androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
        }
    }

    private long e() {
        if (this.C == -1) {
            return 0L;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            K("⟧\uea23䫒㨔륗핈ꆁ큎ற宩뾻峇痊镨Ⓝ뾬", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            K("㖃쒻ꜛ븳岇̛ॄଜ", 8 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
            long longValue = (((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000) - this.C;
            if (longValue < 1000) {
                return 1000 - longValue;
            }
            return 0L;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void b(com.facetec.sdk.au.b bVar) {
        this.z.postDelayed(bVar, e());
    }

    private void c(final boolean z) {
        this.z.removeCallbacksAndMessages(null);
        b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.a(z);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (this.h != null) {
            java.lang.String a2 = a(this.A, this.D);
            if (a2.equals(this.h.getText().toString())) {
                return;
            }
            try {
                if (!z) {
                    this.h.setText(a2);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    K("⟧\uea23䫒㨔륗핈ꆁ큎ற宩뾻峇痊镨Ⓝ뾬", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - ' ', objArr);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    K("㖃쒻ꜛ븳岇̛ॄଜ", android.view.MotionEvent.axisFromString("") + 9, objArr2);
                    this.C = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000;
                    return;
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                K("⟧\uea23䫒㨔륗핈ꆁ큎ற宩뾻峇痊镨Ⓝ뾬", 16 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                K("㖃쒻ꜛ븳岇̛ॄଜ", 8 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                this.C = (((java.lang.Long) cls2.getMethod((java.lang.String) objArr4[0], null).invoke(null, null)).longValue() / 1000000) + 1000;
                this.h.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda23
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.da.this.n();
                    }
                })).start();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.h.setText(a(this.A, this.D));
        this.h.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (this.x) {
            return;
        }
        this.z.removeCallbacksAndMessages(null);
        this.z.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.g();
            }
        }), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.A = com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_RESPONSE;
        b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.o();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (this.z == null || this.x) {
            return;
        }
        c(true);
        d();
        this.z.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.m();
            }
        }), 3000L);
    }

    private java.lang.String a(com.facetec.sdk.da.b bVar, com.facetec.sdk.da.c cVar) {
        if (!this.u) {
            return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_facescan_upload_message);
        }
        if (com.facetec.sdk.FaceTecCustomization.q == null) {
            return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_upload_message);
        }
        com.facetec.sdk.dt dtVar = com.facetec.sdk.dt.UNKNOWN;
        int i = com.facetec.sdk.da.AnonymousClass5.e[cVar.ordinal()];
        if (i == 2) {
            int i2 = com.facetec.sdk.da.AnonymousClass5.c[bVar.ordinal()];
            if (i2 == 1) {
                dtVar = com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_UPLOAD_STARTED;
            } else if (i2 == 2) {
                dtVar = com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_STILL_UPLOADING;
            } else if (i2 == 3) {
                dtVar = com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i2 == 4) {
                dtVar = com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 3) {
            int i3 = com.facetec.sdk.da.AnonymousClass5.c[bVar.ordinal()];
            if (i3 == 1) {
                dtVar = com.facetec.sdk.dt.IDSCAN_BACK_SIDE_UPLOAD_STARTED;
            } else if (i3 == 2) {
                dtVar = com.facetec.sdk.dt.IDSCAN_BACK_SIDE_STILL_UPLOADING;
            } else if (i3 == 3) {
                dtVar = com.facetec.sdk.dt.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i3 == 4) {
                dtVar = com.facetec.sdk.dt.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 4) {
            int i4 = com.facetec.sdk.da.AnonymousClass5.c[bVar.ordinal()];
            if (i4 == 1) {
                dtVar = com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED;
            } else if (i4 == 2) {
                dtVar = com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING;
            } else if (i4 == 3) {
                dtVar = com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i4 == 4) {
                dtVar = com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 5) {
            int i5 = com.facetec.sdk.da.AnonymousClass5.c[bVar.ordinal()];
            if (i5 == 1) {
                dtVar = com.facetec.sdk.dt.NFC_UPLOAD_STARTED;
            } else if (i5 == 2) {
                dtVar = com.facetec.sdk.dt.NFC_STILL_UPLOADING;
            } else if (i5 == 3) {
                dtVar = com.facetec.sdk.dt.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i5 == 4) {
                dtVar = com.facetec.sdk.dt.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 6) {
            int i6 = com.facetec.sdk.da.AnonymousClass5.c[bVar.ordinal()];
            if (i6 == 1) {
                dtVar = com.facetec.sdk.dt.SKIPPED_NFC_UPLOAD_STARTED;
            } else if (i6 == 2) {
                dtVar = com.facetec.sdk.dt.SKIPPED_NFC_STILL_UPLOADING;
            } else if (i6 == 3) {
                dtVar = com.facetec.sdk.dt.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i6 == 4) {
                dtVar = com.facetec.sdk.dt.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        }
        java.lang.String d = com.facetec.sdk.dm.d(dtVar);
        if (d != null) {
            return d;
        }
        if (bVar == com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_PROCESSING) {
            return a(com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_RESPONSE, cVar);
        }
        if (bVar == com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_RESPONSE || bVar == com.facetec.sdk.da.b.STILL_UPLOADING) {
            return a(com.facetec.sdk.da.b.UPLOAD_STARTED, cVar);
        }
        if (this.u) {
            if (cVar == com.facetec.sdk.da.c.NFC) {
                return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_nfc_upload_message);
            }
            return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_upload_message);
        }
        return com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_facescan_upload_message);
    }

    /* renamed from: com.facetec.sdk.da$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3494a;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.da.c.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.da.c.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.da.c.FRONT_SIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                e[com.facetec.sdk.da.c.BACK_SIDE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                e[com.facetec.sdk.da.c.USER_CONFIRMED_INFO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                e[com.facetec.sdk.da.c.NFC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                e[com.facetec.sdk.da.c.SKIPPED_NFC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.facetec.sdk.da.b.values().length];
            c = iArr2;
            try {
                iArr2[com.facetec.sdk.da.b.UPLOAD_STARTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                c[com.facetec.sdk.da.b.STILL_UPLOADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                c[com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_RESPONSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                c[com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_PROCESSING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            f3494a = iArr3;
            try {
                iArr3[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f3494a[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f3494a[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f3494a[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }

    private void d(final com.facetec.sdk.au.b bVar) {
        if (!c() || this.k.getProgress() == this.k.getMax() || !com.facetec.sdk.FaceTecSDK.f3366a.h.showUploadProgressBar) {
            bVar.run();
        } else {
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.g(bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(final com.facetec.sdk.au.b bVar) {
        android.animation.ObjectAnimator objectAnimator = this.q;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.q = null;
        }
        android.widget.ProgressBar progressBar = this.k;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), this.k.getMax());
        ofInt.setDuration(500L);
        ofInt.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda18
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.da.d(com.facetec.sdk.au.b.this, animator);
            }
        });
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.facetec.sdk.au.b bVar, android.animation.Animator animator) {
        if (bVar != null) {
            bVar.run();
        }
    }

    private void d() {
        if (c() && com.facetec.sdk.FaceTecSDK.f3366a.h.showUploadProgressBar) {
            final com.facetec.sdk.au.b bVar = null;
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.a(bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.facetec.sdk.au.b bVar) {
        this.k.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(bVar).start();
    }

    final void a(boolean z, java.lang.String str, java.lang.Runnable runnable) {
        e(z, false, str, runnable);
    }

    final void e(final boolean z, final boolean z2, java.lang.String str, final java.lang.Runnable runnable) {
        if (getActivity() == null || !c()) {
            return;
        }
        android.widget.TextView textView = this.h;
        if (textView != null) {
            textView.setImportantForAccessibility(2);
        }
        i();
        if (!this.u) {
            if (str == null) {
                str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_success_message);
            }
            this.n.setText(str);
            if (z) {
                this.n.setContentDescription(str);
                this.n.performAccessibilityAction(64, null);
                this.n.sendAccessibilityEvent(8);
                this.n.announceForAccessibility(str);
            }
        } else if (z) {
            if (str == null) {
                str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_success_message);
            }
            this.n.setText(str);
        } else {
            if (str == null) {
                str = com.facetec.sdk.dl.d(com.facetec.sdk.R.string.FaceTec_result_idscan_unsuccess_message);
            }
            this.n.setText(str);
        }
        this.x = true;
        d((java.lang.Runnable) new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.e(z, runnable, z2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z, java.lang.Runnable runnable, boolean z2) {
        d();
        if (z) {
            d(true, new com.facetec.sdk.au.b(runnable));
            return;
        }
        if (z2) {
            final com.facetec.sdk.au.b bVar = new com.facetec.sdk.au.b(runnable);
            if (getActivity() == null || !c()) {
                return;
            }
            final int bg = com.facetec.sdk.dm.bg();
            final int i = com.facetec.sdk.R.drawable.facetec_internal_warning;
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.c(bg, i, bVar);
                }
            });
            return;
        }
        if (this.u) {
            d(false, new com.facetec.sdk.au.b(runnable));
        } else {
            a((java.lang.Runnable) new com.facetec.sdk.au.b(runnable));
        }
    }

    private void i() {
        this.v.removeCallbacks(this.I);
        this.z.removeCallbacksAndMessages(null);
    }

    public final void d(final java.lang.Runnable runnable) {
        if (c()) {
            i();
            this.x = true;
            b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.o(runnable);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(java.lang.Runnable runnable) {
        d(new com.facetec.sdk.au.b(runnable));
    }

    /* renamed from: com.facetec.sdk.da$4, reason: invalid class name */
    final class AnonymousClass4 extends androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback {
        AnonymousClass4() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
            com.facetec.sdk.da.this.e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.AnonymousClass4.this.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.facetec.sdk.dp.a(com.facetec.sdk.da.this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        com.facetec.sdk.dp.d(this.e, i, new com.facetec.sdk.da.AnonymousClass4(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        com.facetec.sdk.dp.d(this.e, com.facetec.sdk.R.drawable.facetec_animated_activity_indicator_vector_drawable, null, true);
        this.e.setColorFilter(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1666036405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1666036366)).intValue(), android.graphics.PorterDuff.Mode.SRC_IN);
        this.e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, int i2, final com.facetec.sdk.au.b bVar) {
        this.b.setVisibility(0);
        this.l.setImageDrawable(null);
        this.l.clearColorFilter();
        this.l.invalidate();
        this.m.clearColorFilter();
        this.m.invalidate();
        if (i != 0) {
            com.facetec.sdk.dp.d(this.m, i, null, true);
        } else {
            android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(getActivity(), i2);
            this.m.setColorFilter(com.facetec.sdk.dp.e(getActivity(), com.facetec.sdk.dm.S()), android.graphics.PorterDuff.Mode.SRC_IN);
            this.m.setImageDrawable(drawable);
        }
        com.facetec.sdk.dp.d(this.t, 0.0f, null);
        com.facetec.sdk.dp.d(this.b, 1.0f, new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.e(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.facetec.sdk.au.b bVar) {
        this.n.animate().alpha(1.0f).setDuration(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1907064309, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1907064277)).intValue()).setStartDelay(0L).setListener(null).start();
        a(bVar, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1907064309, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1907064277)).intValue());
    }

    private void d(final boolean z, final com.facetec.sdk.au.b bVar) {
        if (getActivity() == null || !c()) {
            return;
        }
        final int aV = z ? com.facetec.sdk.dm.aV() : com.facetec.sdk.dm.aT();
        final boolean z2 = aV != 0;
        final int bo = z ? com.facetec.sdk.dm.bo() : ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 2112962249, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -2112962211)).intValue();
        final boolean z3 = bo != 0;
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.c(z2, z3, bo, aV, z, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z, boolean z2, int i, int i2, boolean z3, final com.facetec.sdk.au.b bVar) {
        this.b.setVisibility(0);
        if (z || z2) {
            this.l.setImageDrawable(null);
            this.l.clearColorFilter();
            this.l.invalidate();
        }
        this.m.clearColorFilter();
        this.m.invalidate();
        if (z2) {
            com.facetec.sdk.dp.d(this.m, i, null, false);
        } else {
            if (z) {
                this.l.setImageResource(i2);
                this.l.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(0L).setStartDelay(0L).setListener(null).start();
                this.l.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
            } else {
                this.l.setColorFilter(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -672508872, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{getActivity()}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 672508915)).intValue(), android.graphics.PorterDuff.Mode.SRC_IN);
                com.facetec.sdk.dp.d(this.l, com.facetec.sdk.R.drawable.facetec_animated_result_background, null, true);
            }
            int i3 = z3 ? com.facetec.sdk.R.drawable.facetec_animated_success_foreground : com.facetec.sdk.R.drawable.facetec_animated_unsuccess_foreground;
            this.m.setColorFilter(com.facetec.sdk.dm.o(getActivity()), android.graphics.PorterDuff.Mode.SRC_IN);
            com.facetec.sdk.dp.d(this.m, i3, null, false);
        }
        com.facetec.sdk.dp.a(this.m);
        com.facetec.sdk.dp.d(this.t, 0.0f, null);
        com.facetec.sdk.dp.d(this.b, 1.0f, new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.c(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.facetec.sdk.au.b bVar) {
        this.e.setImageDrawable(null);
        this.n.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        a(bVar, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -519311050, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 519311076)).intValue());
    }

    final void a(final java.lang.Runnable runnable) {
        if (getActivity() == null) {
            return;
        }
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.f(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final java.lang.Runnable runnable) {
        this.s.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
        com.facetec.sdk.dp.d(this.f3493o, 0.0f, new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.g(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(final java.lang.Runnable runnable) {
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.k(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(java.lang.Runnable runnable) {
        android.widget.RelativeLayout relativeLayout = this.f3493o;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    final void c(java.lang.Runnable runnable) {
        if (c()) {
            this.b.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).withEndAction(new com.facetec.sdk.au.b(runnable)).start();
        }
    }

    final void b(final java.lang.Runnable runnable) {
        if (c()) {
            a(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.h(runnable);
                }
            }), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(java.lang.Runnable runnable) {
        this.f.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).withEndAction(runnable).start();
    }

    final void j(final java.lang.Runnable runnable) {
        if (c()) {
            this.s.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
            this.b.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
            this.h.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
            this.e.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.da.this.i(runnable);
                }
            })).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(java.lang.Runnable runnable) {
        this.s.setVisibility(8);
        this.b.setVisibility(8);
        this.h.setVisibility(8);
        this.e.setVisibility(4);
        this.d.setAlpha(0.0f);
        this.t.setAlpha(0.0f);
        this.t.setVisibility(0);
        this.d.setVisibility(0);
        if (!this.B) {
            this.j.setVisibility(0);
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.z.removeCallbacksAndMessages(null);
        this.x = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.z.removeCallbacksAndMessages(null);
        if (this.x) {
            return;
        }
        this.A = com.facetec.sdk.da.b.UPLOAD_COMPLETE_AWAITING_PROCESSING;
        c(true);
        this.z.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.j();
            }
        }), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        if (this.x) {
            return;
        }
        this.z.removeCallbacksAndMessages(null);
        this.A = com.facetec.sdk.da.b.STILL_UPLOADING;
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.x) {
            return;
        }
        this.z.removeCallbacksAndMessages(null);
        d(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.h();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.x) {
            return;
        }
        this.z.removeCallbacksAndMessages(null);
        this.A = com.facetec.sdk.da.b.UPLOAD_STARTED;
        c(false);
        this.z.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.da$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.da.this.l();
            }
        }), this.u ? 8000L : androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
    }

    static {
        init$0();
        G = (char) 23063;
        F = (char) 42458;
        E = (char) 25574;
        J = (char) 13788;
    }
}
