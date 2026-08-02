package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ck extends com.facetec.sdk.au {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int[] C;
    private android.widget.EditText D;

    /* renamed from: a, reason: collision with root package name */
    org.json.JSONObject f3465a;
    android.widget.RelativeLayout b;
    android.widget.LinearLayout c;
    android.widget.ScrollView d;
    com.facetec.sdk.e e;
    android.widget.ImageView f;
    int g;
    android.widget.LinearLayout h;
    android.graphics.drawable.Drawable i;
    android.widget.TextView j;
    int m;
    final float n;
    final int p;
    private android.view.View q;
    private android.widget.LinearLayout r;
    private android.view.View s;
    final float t;
    private android.widget.RelativeLayout v;
    private android.view.View x;
    private android.widget.TextView y;
    boolean k = false;

    /* renamed from: o, reason: collision with root package name */
    boolean f3466o = true;
    boolean l = true;
    private boolean u = true;
    private boolean w = false;
    private boolean z = false;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener A = new com.facetec.sdk.ck.AnonymousClass2();
    private float B = com.facetec.sdk.dm.a();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, short s) {
        int i3;
        int i4 = 73 - (i2 * 3);
        int i5 = s * 4;
        byte[] bArr = $$a;
        int i6 = 4 - (i * 3);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i4 = (-i4) + i8;
            i6++;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new java.lang.String(bArr2, 0);
            }
            int i10 = i3 + 1;
            i8 = i4;
            i4 = bArr[i6];
            i9 = i10;
            i4 = (-i4) + i8;
            i6++;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{89, 125, 6, 47};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    }

    public ck() {
        float b = com.facetec.sdk.dm.b();
        this.n = b;
        this.t = this.B * b;
        this.p = com.facetec.sdk.dm.d();
    }

    private static void E(int[] iArr, int i, java.lang.Object[] objArr) {
        com.facetec.sdk.hl hlVar = new com.facetec.sdk.hl();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = C;
        int i2 = -915298838;
        int i3 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i4])};
                    java.lang.Object d = com.facetec.sdk.al.d(i2);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28976), android.view.KeyEvent.keyCodeFromString("") + 1693, 24 - android.graphics.Color.argb(0, 0, 0, 0), 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    iArr3[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
                    i4++;
                    i2 = -915298838;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = C;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[0] = java.lang.Integer.valueOf(iArr5[i5]);
                java.lang.Object d2 = com.facetec.sdk.al.d(-915298838);
                if (d2 == null) {
                    char scrollBarSize = (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 28976);
                    float complexToFloat = android.util.TypedValue.complexToFloat(0);
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    java.lang.Class[] clsArr = new java.lang.Class[i3];
                    clsArr[0] = java.lang.Integer.TYPE;
                    d2 = com.facetec.sdk.al.c(scrollBarSize, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 1693, (keyRepeatTimeout >> 16) + 24, 1855905554, false, "H", clsArr);
                }
                iArr6[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                i5++;
                i3 = 1;
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        hlVar.d = 0;
        while (hlVar.d < iArr.length) {
            int i6 = 16;
            cArr[0] = (char) (iArr[hlVar.d] >> 16);
            cArr[1] = (char) iArr[hlVar.d];
            cArr[2] = (char) (iArr[hlVar.d + 1] >> 16);
            char c = 3;
            cArr[3] = (char) iArr[hlVar.d + 1];
            hlVar.c = (cArr[0] << 16) + cArr[1];
            hlVar.e = (cArr[2] << 16) + cArr[3];
            com.facetec.sdk.hl.d(iArr4);
            int i7 = 0;
            while (i7 < i6) {
                hlVar.c ^= iArr4[i7];
                int c2 = com.facetec.sdk.hl.c(hlVar.c);
                java.lang.Object[] objArr4 = new java.lang.Object[4];
                objArr4[c] = hlVar;
                objArr4[2] = hlVar;
                objArr4[1] = java.lang.Integer.valueOf(c2);
                objArr4[0] = hlVar;
                java.lang.Object d3 = com.facetec.sdk.al.d(-1807501612);
                if (d3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    d3 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", "", 0), android.view.View.MeasureSpec.getSize(0) + 407, 25 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 866962476, false, $$c(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).intValue();
                hlVar.c = hlVar.e;
                hlVar.e = intValue;
                i7++;
                i6 = 16;
                c = 3;
            }
            int i8 = hlVar.c;
            hlVar.c = hlVar.e;
            hlVar.e = i8;
            hlVar.e ^= iArr4[16];
            hlVar.c ^= iArr4[17];
            int i9 = hlVar.c;
            int i10 = hlVar.e;
            cArr[0] = (char) (hlVar.c >>> 16);
            cArr[1] = (char) hlVar.c;
            cArr[2] = (char) (hlVar.e >>> 16);
            cArr[3] = (char) hlVar.e;
            com.facetec.sdk.hl.d(iArr4);
            cArr2[hlVar.d * 2] = cArr[0];
            cArr2[(hlVar.d * 2) + 1] = cArr[1];
            cArr2[(hlVar.d * 2) + 2] = cArr[2];
            cArr2[(hlVar.d * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {hlVar, hlVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-260749244);
            if (d4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                d4 = com.facetec.sdk.al.c((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 18698), android.graphics.Color.green(0) + 1787, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 25, 1469723324, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static com.facetec.sdk.ck e(org.json.JSONObject jSONObject) {
        com.facetec.sdk.ck ckVar = new com.facetec.sdk.ck();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("ocrDataJSONString", jSONObject.toString());
        ckVar.setArguments(bundle);
        return ckVar;
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_ocr_confirmation_fragment, viewGroup, false);
        this.s = inflate;
        return inflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        super.onViewCreated(view, bundle);
        android.app.Activity activity = getActivity();
        try {
            if (getArguments() != null && (string = getArguments().getString("ocrDataJSONString")) != null) {
                this.f3465a = new org.json.JSONObject(string);
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        this.q = view.findViewById(com.facetec.sdk.R.id.backgroundView);
        this.e = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.confirmButton);
        this.d = (android.widget.ScrollView) view.findViewById(com.facetec.sdk.R.id.mainContentScrollView);
        this.c = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.scrollableContentLayout);
        this.r = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.dynamicContentLayout);
        this.y = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.mainHeaderTextView);
        this.x = view.findViewById(com.facetec.sdk.R.id.mainHeaderDividerLineView);
        this.b = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.scrollDownIndicatorLayout);
        this.h = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.scrollDownIndicatorContentLayout);
        this.j = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.scrollDownIndicatorTextView);
        this.f = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.scrollDownIndicatorImageView);
        this.v = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.outsetActionButtonLayout);
        this.f3466o = com.facetec.sdk.FaceTecSDK.f3366a.f.enableFixedConfirmButton;
        this.u = com.facetec.sdk.FaceTecSDK.f3366a.f.enableScrollIndicatorTextAnimation;
        this.l = com.facetec.sdk.FaceTecSDK.f3366a.f.enableScrollIndicator;
        this.w = com.facetec.sdk.FaceTecSDK.f3366a.f.customScrollIndicatorAnimation == 0;
        this.m = com.facetec.sdk.dp.e(getActivity(), com.facetec.sdk.dm.aC());
        this.g = com.facetec.sdk.dp.e(getActivity(), com.facetec.sdk.dm.ay());
        int round = java.lang.Math.round(this.t * 20.0f);
        android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.f.mainHeaderFont;
        int e2 = com.facetec.sdk.dp.e(activity, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1308371391, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1308371412)).intValue());
        int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 731013102, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -731013079)).intValue()));
        int max = java.lang.Math.max(round2 == 0 ? 0 : 1, java.lang.Math.round(round2 * this.n));
        int e3 = com.facetec.sdk.dp.e(activity, com.facetec.sdk.dm.au());
        com.facetec.sdk.dl.d(this.y, com.facetec.sdk.R.string.FaceTec_idscan_ocr_confirmation_main_header);
        this.y.setTextColor(e2);
        this.y.setTypeface(typeface);
        this.y.setTextSize(round);
        ((android.widget.LinearLayout.LayoutParams) this.y.getLayoutParams()).setMargins(0, 0, 0, this.p);
        this.x.getLayoutParams().height = max;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.x.getLayoutParams();
        int i = this.p;
        layoutParams.setMargins(i, 0, i, 0);
        this.x.setBackgroundColor(e3);
        int round3 = java.lang.Math.round(com.facetec.sdk.ay.d(50) * this.t);
        this.e.getLayoutParams().height = round3;
        if (this.f3466o) {
            this.c.removeView(this.e);
            this.v.addView(this.e);
            this.v.setVisibility(0);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.e.getLayoutParams();
            int i2 = this.p;
            layoutParams2.setMargins(i2, 0, i2, i2);
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.e.getLayoutParams();
            int i3 = this.p;
            layoutParams3.setMargins(i3, i3 << 1, i3, 0);
        }
        com.facetec.sdk.dl.d(this.e, com.facetec.sdk.R.string.FaceTec_action_confirm);
        this.e.setEnabled(true);
        this.e.e();
        this.e.b(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.g();
            }
        }));
        if (this.f3466o) {
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) this.d.getLayoutParams();
            int i4 = this.p;
            layoutParams4.setMargins(0, i4, 0, (i4 << 1) + round3);
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) this.d.getLayoutParams();
            int i5 = this.p;
            layoutParams5.setMargins(0, i5, 0, i5);
        }
        com.facetec.sdk.dm.c(this.q);
        this.q.getBackground().setAlpha(com.facetec.sdk.dm.aW());
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(activity, com.facetec.sdk.R.drawable.facetec_scrollbar_vertical_track);
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(activity, com.facetec.sdk.R.drawable.facetec_scrollbar_vertical_thumb);
        int d = com.facetec.sdk.dp.d(e2, 128);
        int round4 = java.lang.Math.round(com.facetec.sdk.ay.d(10) * this.t);
        int round5 = java.lang.Math.round(com.facetec.sdk.ay.d(5) * this.t);
        if (drawable != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) drawable;
            gradientDrawable.setColor(0);
            gradientDrawable.setCornerRadius(round5);
        }
        if (drawable2 != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = (android.graphics.drawable.GradientDrawable) drawable2;
            gradientDrawable2.setColor(d);
            gradientDrawable2.setCornerRadius(round5);
        }
        this.c.setScrollBarSize(round4);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.c.setVerticalScrollbarTrackDrawable(drawable);
            this.c.setVerticalScrollbarThumbDrawable(drawable2);
        }
        this.c.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda10
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                boolean a2;
                a2 = com.facetec.sdk.ck.this.a(view2, motionEvent);
                return a2;
            }
        });
        final org.json.JSONObject jSONObject = this.f3465a;
        final android.app.Activity activity2 = getActivity();
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.b(activity2, jSONObject);
            }
        });
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.e.a(false, true);
        final com.facetec.sdk.au.b bVar = new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.k();
            }
        });
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.a(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) getActivity();
        if (blVar != null) {
            blVar.a(this.f3465a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.EditText editText;
        if (motionEvent.getAction() == 0 && (editText = this.D) != null && editText.isFocused()) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.D.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.D.clearFocus();
                e(view);
            }
        }
        return false;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        android.widget.ScrollView scrollView = this.d;
        if (scrollView != null) {
            scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.v.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).start();
        this.e.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).start();
        this.d.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.i();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.b.getVisibility() == 0) {
            this.b.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ck.this.j();
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.facetec.sdk.au.b bVar) {
        this.v.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        this.e.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        this.d.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).withEndAction(bVar).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03af A[Catch: JSONException -> 0x0452, TryCatch #6 {JSONException -> 0x0452, blocks: (B:84:0x0366, B:86:0x03fa, B:111:0x03a9, B:113:0x03af, B:114:0x03b0, B:148:0x044c), top: B:83:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b0 A[Catch: JSONException -> 0x0452, TryCatch #6 {JSONException -> 0x0452, blocks: (B:84:0x0366, B:86:0x03fa, B:111:0x03a9, B:113:0x03af, B:114:0x03b0, B:148:0x044c), top: B:83:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04d3 A[LOOP:2: B:90:0x04cd->B:92:0x04d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0502 A[LOOP:3: B:95:0x04fc->B:97:0x0502, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void b(android.content.Context context, org.json.JSONObject jSONObject) {
        int i;
        java.util.ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        android.view.ViewTreeObserver viewTreeObserver;
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        final int i5;
        int i6;
        int i7;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        android.graphics.Typeface typeface;
        int i13;
        org.json.JSONArray jSONArray;
        android.graphics.drawable.LayerDrawable layerDrawable;
        android.graphics.Typeface typeface2;
        java.lang.String str4;
        java.lang.String str5;
        int i14;
        int i15;
        int i16;
        int i17;
        android.graphics.Typeface typeface3;
        android.graphics.drawable.LayerDrawable layerDrawable2;
        org.json.JSONArray jSONArray2;
        com.facetec.sdk.bb bbVar;
        java.lang.String str6;
        android.graphics.Typeface typeface4;
        int i18;
        org.json.JSONArray jSONArray3;
        int i19;
        android.graphics.Typeface typeface5;
        com.facetec.sdk.bb bbVar2;
        android.widget.LinearLayout.LayoutParams layoutParams;
        float f;
        int i20;
        android.graphics.Typeface typeface6;
        java.lang.Throwable cause;
        java.lang.Class<?> cls;
        final android.graphics.Typeface typeface7;
        final android.graphics.Typeface typeface8;
        final boolean z;
        final int i21;
        android.content.Context context2 = context;
        java.lang.String str7 = "uiFieldDescriptionText";
        java.lang.String str8 = "fieldFriendlyName";
        java.lang.String str9 = "groupFriendlyName";
        int round = java.lang.Math.round(com.facetec.sdk.ay.d(30) * this.t);
        int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(100) * this.t);
        int round3 = java.lang.Math.round(this.t * 16.0f);
        int round4 = java.lang.Math.round(this.t * 12.0f);
        android.graphics.Typeface typeface9 = com.facetec.sdk.FaceTecSDK.f3366a.f.sectionHeaderFont;
        int e = com.facetec.sdk.dp.e(context2, com.facetec.sdk.dm.av());
        android.graphics.Typeface typeface10 = com.facetec.sdk.FaceTecSDK.f3366a.f.fieldLabelFont;
        int e2 = com.facetec.sdk.dp.e(context2, com.facetec.sdk.dm.at());
        android.graphics.Typeface typeface11 = com.facetec.sdk.FaceTecSDK.f3366a.f.inputFieldFont;
        int e3 = com.facetec.sdk.dp.e(context2, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1969056405, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1969056421)).intValue());
        int e4 = com.facetec.sdk.dp.e(context2, com.facetec.sdk.dm.c(context));
        android.graphics.Typeface typeface12 = typeface11;
        int round5 = java.lang.Math.round(com.facetec.sdk.ay.d(com.facetec.sdk.dm.s()));
        int i22 = e4;
        int i23 = e3;
        int max = java.lang.Math.max(round5 == 0 ? 0 : 1, java.lang.Math.round(this.n * round5));
        int round6 = java.lang.Math.round(com.facetec.sdk.ay.d(com.facetec.sdk.dm.L()));
        int i24 = round;
        int max2 = java.lang.Math.max(round6 == 0 ? 0 : 1, java.lang.Math.round(this.n * round6));
        int e5 = com.facetec.sdk.dp.e(context2, com.facetec.sdk.dm.aA());
        int e6 = com.facetec.sdk.dp.e(context2, com.facetec.sdk.dm.aB());
        android.graphics.Typeface typeface13 = typeface10;
        android.graphics.drawable.LayerDrawable layerDrawable3 = (android.graphics.drawable.LayerDrawable) androidx.core.content.ContextCompat.getDrawable(context2, com.facetec.sdk.R.drawable.facetec_ocr_input_background);
        int i25 = e2;
        if (layerDrawable3 != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) layerDrawable3.findDrawableByLayerId(com.facetec.sdk.R.id.gradientDrawable);
            gradientDrawable.setStroke(max, e5);
            gradientDrawable.setCornerRadius(max2);
            gradientDrawable.setColor(e6);
            if (com.facetec.sdk.FaceTecSDK.f3366a.f.showInputFieldBottomBorderOnly) {
                int i26 = -max;
                layerDrawable3.setLayerInset(0, i26, i26, i26, 0);
                gradientDrawable.setCornerRadius(0.0f);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        try {
            optJSONArray = jSONObject.optJSONArray("groups");
        } catch (org.json.JSONException e7) {
            e = e7;
            i = round4;
            arrayList = arrayList3;
        }
        if (optJSONArray == null) {
            return;
        }
        int i27 = 0;
        while (i27 < optJSONArray.length()) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i27);
            if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("fields")) != null) {
                if (optJSONArray2.length() > 0) {
                    i5 = i27;
                    java.lang.String optString = optJSONObject.optString("groupKey");
                    org.json.JSONArray jSONArray4 = optJSONArray;
                    java.lang.String d = d(optString, null, str9, optJSONObject.optString(str9));
                    com.facetec.sdk.bb bbVar3 = new com.facetec.sdk.bb(context2);
                    str3 = str9;
                    android.graphics.drawable.LayerDrawable layerDrawable4 = layerDrawable3;
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    int i28 = this.p;
                    java.util.ArrayList arrayList4 = arrayList3;
                    try {
                        layoutParams2.setMargins(i28, i28, i28, java.lang.Math.round(i28 / 2.0f));
                        layoutParams2.gravity = 17;
                        bbVar3.setLayoutParams(layoutParams2);
                        bbVar3.setTextSize(round3);
                        bbVar3.setText(d);
                        bbVar3.setTextColor(e);
                        bbVar3.setTypeface(typeface9);
                        this.r.addView(bbVar3);
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < optJSONArray2.length()) {
                            org.json.JSONObject jSONObject2 = optJSONArray2.getJSONObject(i29);
                            java.lang.String optString2 = jSONObject2.optString("fieldKey");
                            org.json.JSONArray jSONArray5 = optJSONArray2;
                            java.lang.String d2 = d(optString, optString2, str8, jSONObject2.optString(str8));
                            com.facetec.sdk.bb bbVar4 = bbVar3;
                            java.lang.String d3 = d(optString, optString2, str7, jSONObject2.optString(str7));
                            java.lang.String str10 = optString;
                            if (d3 == null) {
                                d3 = "";
                            }
                            int i31 = e;
                            java.lang.String upperCase = jSONObject2.optString("scannedValue").toUpperCase(getResources().getConfiguration().locale);
                            if (jSONObject2.optBoolean("uiEditable")) {
                                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context2);
                                try {
                                    linearLayout.setOrientation(0);
                                    typeface5 = typeface9;
                                    str4 = str7;
                                    android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                                    int i32 = this.p;
                                    str5 = str8;
                                    layoutParams3.setMargins(i32, i32 / 4, i32, i32 / 4);
                                    linearLayout.setLayoutParams(layoutParams3);
                                    bbVar2 = new com.facetec.sdk.bb(context2);
                                    layoutParams = new android.widget.LinearLayout.LayoutParams(round2, -2);
                                } catch (org.json.JSONException e8) {
                                    e = e8;
                                    i2 = 0;
                                    i = round4;
                                }
                                try {
                                    layoutParams.setMargins(0, 0, 0, 0);
                                    layoutParams.setMarginEnd(this.p / 2);
                                    bbVar2.setLayoutParams(layoutParams);
                                    f = round4;
                                    bbVar2.setTextSize(f);
                                    bbVar2.setText(d2);
                                    i20 = i25;
                                    bbVar2.setTextColor(i20);
                                    typeface6 = typeface13;
                                    bbVar2.setTypeface(typeface6);
                                    bbVar2.setMaxLines(1);
                                    bbVar2.setSingleLine(true);
                                    bbVar2.setEllipsize(android.text.TextUtils.TruncateAt.END);
                                    bbVar2.setTextDirection(5);
                                    arrayList = arrayList4;
                                } catch (org.json.JSONException e9) {
                                    e = e9;
                                    i = round4;
                                    i2 = 0;
                                    arrayList = arrayList4;
                                    e.printStackTrace();
                                    int round7 = java.lang.Math.round(com.facetec.sdk.ay.c(i));
                                    int round8 = java.lang.Math.round(com.facetec.sdk.ay.d(120) * this.t);
                                    i3 = i2;
                                    int i33 = i3;
                                    while (i3 < arrayList.size()) {
                                    }
                                    int min = java.lang.Math.min(round8, i33);
                                    while (i4 < arrayList.size()) {
                                    }
                                    viewTreeObserver = this.d.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                    }
                                }
                                try {
                                    arrayList.add(bbVar2);
                                    linearLayout.addView(bbVar2);
                                    final android.widget.EditText editText = new android.widget.EditText(context2);
                                    int i34 = this.p / 4;
                                    int i35 = i34 << 1;
                                    editText.setPadding(i34, i35, i34, i35);
                                    int i36 = i24;
                                    android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, i36);
                                    try {
                                        layoutParams4.setMargins(0, 0, 0, 0);
                                        editText.setLayoutParams(layoutParams4);
                                        int i37 = i23;
                                        editText.setTextColor(i37);
                                        editText.setTextSize(f);
                                        int i38 = i22;
                                        editText.setHintTextColor(i38);
                                        editText.setText(upperCase);
                                        editText.setHint(d3);
                                        android.graphics.Typeface typeface14 = typeface12;
                                        editText.setTypeface(typeface14);
                                        android.graphics.drawable.LayerDrawable layerDrawable5 = layerDrawable4;
                                        editText.setBackground(layerDrawable5);
                                        editText.setTextDirection(5);
                                        android.text.InputFilter[] filters = editText.getFilters();
                                        android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[filters.length + 1];
                                        i17 = i36;
                                        typeface12 = typeface14;
                                        try {
                                            java.lang.Object[] objArr = new java.lang.Object[5];
                                            objArr[4] = java.lang.Integer.valueOf(filters.length);
                                            objArr[3] = 0;
                                            objArr[2] = inputFilterArr;
                                            objArr[1] = 0;
                                            try {
                                                objArr[0] = filters;
                                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                                E(new int[]{-1701349626, 73536680, 1676273197, -608677943, -1970145682, 1822305145, 1574363681, -1539396291}, 16 - android.view.KeyEvent.normalizeMetaState(0), objArr2);
                                                cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                            }
                                            try {
                                                int i39 = round4;
                                                try {
                                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                    E(new int[]{-1508496129, -1535616329, 1618943345, 458017550, -602710873, -653826623}, android.text.TextUtils.getOffsetAfter("", 0) + 9, objArr3);
                                                    try {
                                                        cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                                                        try {
                                                            inputFilterArr[filters.length] = new android.text.InputFilter.AllCaps();
                                                            editText.setFilters(inputFilterArr);
                                                            editText.setInputType(4096);
                                                            editText.setImeOptions(6);
                                                            typeface7 = com.facetec.sdk.FaceTecSDK.f3366a.f.inputFieldFont;
                                                            typeface8 = com.facetec.sdk.FaceTecSDK.f3366a.f.inputFieldPlaceholderFont;
                                                            z = typeface7 != typeface8;
                                                            i16 = i37;
                                                            i15 = i38;
                                                            jSONArray2 = jSONArray5;
                                                            typeface3 = typeface6;
                                                            i2 = 0;
                                                            str6 = str10;
                                                            jSONArray3 = jSONArray4;
                                                            i19 = i20;
                                                            layerDrawable2 = layerDrawable5;
                                                            bbVar = bbVar4;
                                                            i18 = round2;
                                                            typeface4 = typeface5;
                                                            i14 = round3;
                                                            i = i39;
                                                            i21 = i29;
                                                        } catch (org.json.JSONException e10) {
                                                            e = e10;
                                                            i2 = 0;
                                                            i = i39;
                                                        }
                                                        try {
                                                            editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.facetec.sdk.ck.5
                                                                @Override // android.text.TextWatcher
                                                                public final void afterTextChanged(android.text.Editable editable) {
                                                                }

                                                                @Override // android.text.TextWatcher
                                                                public final void beforeTextChanged(java.lang.CharSequence charSequence, int i40, int i41, int i42) {
                                                                }

                                                                @Override // android.text.TextWatcher
                                                                public final void onTextChanged(java.lang.CharSequence charSequence, int i40, int i41, int i42) {
                                                                    if (z) {
                                                                        if (charSequence.length() == 0) {
                                                                            editText.setTypeface(typeface8);
                                                                        } else {
                                                                            android.graphics.Typeface typeface15 = editText.getTypeface();
                                                                            android.graphics.Typeface typeface16 = typeface7;
                                                                            if (typeface15 != typeface16) {
                                                                                editText.setTypeface(typeface16);
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        com.facetec.sdk.ck.this.f3465a.optJSONArray("groups").optJSONObject(i5).optJSONArray("fields").optJSONObject(i21).putOpt("userUpdatedValue", charSequence.toString());
                                                                    } catch (org.json.JSONException e11) {
                                                                        e11.printStackTrace();
                                                                    }
                                                                }
                                                            });
                                                            editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda16
                                                                @Override // android.view.View.OnFocusChangeListener
                                                                public final void onFocusChange(android.view.View view, boolean z2) {
                                                                    com.facetec.sdk.ck.this.e(editText, view, z2);
                                                                }
                                                            });
                                                            editText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda1
                                                                @Override // android.widget.TextView.OnEditorActionListener
                                                                public final boolean onEditorAction(android.widget.TextView textView, int i40, android.view.KeyEvent keyEvent) {
                                                                    boolean a2;
                                                                    a2 = com.facetec.sdk.ck.this.a(editText, textView, i40, keyEvent);
                                                                    return a2;
                                                                }
                                                            });
                                                            linearLayout.addView(editText);
                                                            this.r.addView(linearLayout);
                                                            i30++;
                                                        } catch (org.json.JSONException e11) {
                                                            e = e11;
                                                            e.printStackTrace();
                                                            int round72 = java.lang.Math.round(com.facetec.sdk.ay.c(i));
                                                            int round82 = java.lang.Math.round(com.facetec.sdk.ay.d(120) * this.t);
                                                            i3 = i2;
                                                            int i332 = i3;
                                                            while (i3 < arrayList.size()) {
                                                            }
                                                            int min2 = java.lang.Math.min(round82, i332);
                                                            while (i4 < arrayList.size()) {
                                                            }
                                                            viewTreeObserver = this.d.getViewTreeObserver();
                                                            if (viewTreeObserver.isAlive()) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th2) {
                                                        th = th2;
                                                        cause = th.getCause();
                                                        if (cause == null) {
                                                            throw th;
                                                        }
                                                        throw cause;
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    cause = th.getCause();
                                                    if (cause == null) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (org.json.JSONException e12) {
                                        e = e12;
                                        i2 = 0;
                                        i = round4;
                                    }
                                } catch (org.json.JSONException e13) {
                                    e = e13;
                                    i = round4;
                                    i2 = 0;
                                    e.printStackTrace();
                                    int round722 = java.lang.Math.round(com.facetec.sdk.ay.c(i));
                                    int round822 = java.lang.Math.round(com.facetec.sdk.ay.d(120) * this.t);
                                    i3 = i2;
                                    int i3322 = i3;
                                    while (i3 < arrayList.size()) {
                                    }
                                    int min22 = java.lang.Math.min(round822, i3322);
                                    while (i4 < arrayList.size()) {
                                    }
                                    viewTreeObserver = this.d.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                    }
                                }
                            } else {
                                i = round4;
                                str4 = str7;
                                str5 = str8;
                                i14 = round3;
                                i15 = i22;
                                i16 = i23;
                                i17 = i24;
                                typeface3 = typeface13;
                                layerDrawable2 = layerDrawable4;
                                arrayList = arrayList4;
                                jSONArray2 = jSONArray5;
                                bbVar = bbVar4;
                                str6 = str10;
                                typeface4 = typeface9;
                                i18 = round2;
                                int i40 = i25;
                                jSONArray3 = jSONArray4;
                                i19 = i40;
                            }
                            i29++;
                            context2 = context;
                            bbVar3 = bbVar;
                            typeface9 = typeface4;
                            optJSONArray2 = jSONArray2;
                            optString = str6;
                            round2 = i18;
                            round4 = i;
                            e = i31;
                            round3 = i14;
                            str8 = str5;
                            arrayList4 = arrayList;
                            i24 = i17;
                            layerDrawable4 = layerDrawable2;
                            i22 = i15;
                            str7 = str4;
                            typeface13 = typeface3;
                            i23 = i16;
                            org.json.JSONArray jSONArray6 = jSONArray3;
                            i25 = i19;
                            jSONArray4 = jSONArray6;
                        }
                        i6 = e;
                        i7 = round4;
                        str = str7;
                        str2 = str8;
                        i8 = round2;
                        i9 = round3;
                        i10 = i22;
                        i11 = i23;
                        i12 = i24;
                        typeface = typeface13;
                        layerDrawable = layerDrawable4;
                        arrayList2 = arrayList4;
                        com.facetec.sdk.bb bbVar5 = bbVar3;
                        typeface2 = typeface9;
                        int i41 = i25;
                        jSONArray = jSONArray4;
                        i13 = i41;
                        if (i30 == 0) {
                            this.r.removeView(bbVar5);
                        }
                    } catch (org.json.JSONException e14) {
                        e = e14;
                        i = round4;
                        arrayList = arrayList4;
                    }
                } else {
                    i5 = i27;
                    i6 = e;
                    i7 = round4;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    arrayList2 = arrayList3;
                    i8 = round2;
                    i9 = round3;
                    i10 = i22;
                    i11 = i23;
                    i12 = i24;
                    typeface = typeface13;
                    i13 = i25;
                    jSONArray = optJSONArray;
                    layerDrawable = layerDrawable3;
                    typeface2 = typeface9;
                }
                i27 = i5 + 1;
                context2 = context;
                arrayList3 = arrayList2;
                typeface9 = typeface2;
                layerDrawable3 = layerDrawable;
                str9 = str3;
                optJSONArray = jSONArray;
                round2 = i8;
                round4 = i7;
                e = i6;
                str7 = str;
                round3 = i9;
                str8 = str2;
                i25 = i13;
                i24 = i12;
                typeface13 = typeface;
                i22 = i10;
                i23 = i11;
            }
            return;
        }
        i = round4;
        arrayList = arrayList3;
        i2 = 0;
        int round7222 = java.lang.Math.round(com.facetec.sdk.ay.c(i));
        int round8222 = java.lang.Math.round(com.facetec.sdk.ay.d(120) * this.t);
        i3 = i2;
        int i33222 = i3;
        while (i3 < arrayList.size()) {
            i33222 = java.lang.Math.max(i33222, com.facetec.sdk.ay.b(((android.widget.TextView) arrayList.get(i3)).getText().toString(), round7222, com.facetec.sdk.FaceTecSDK.f3366a.f.fieldLabelFont).e());
            i3++;
        }
        int min222 = java.lang.Math.min(round8222, i33222);
        for (i4 = i2; i4 < arrayList.size(); i4++) {
            ((android.widget.TextView) arrayList.get(i4)).getLayoutParams().width = min222;
        }
        viewTreeObserver = this.d.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.A);
    }

    /* renamed from: com.facetec.sdk.ck$2, reason: invalid class name */
    final class AnonymousClass2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass2() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            android.app.Activity activity;
            android.view.ViewTreeObserver viewTreeObserver = com.facetec.sdk.ck.this.d.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (activity = com.facetec.sdk.ck.this.getActivity()) != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                com.facetec.sdk.ck.this.d.getHitRect(rect);
                boolean localVisibleRect = com.facetec.sdk.ck.this.e.getLocalVisibleRect(rect);
                boolean z = com.facetec.sdk.ck.this.d.getHeight() < com.facetec.sdk.ck.this.c.getHeight();
                if (z && ((!localVisibleRect || com.facetec.sdk.ck.this.f3466o) && com.facetec.sdk.ck.this.l)) {
                    if (!com.facetec.sdk.ck.this.f3466o) {
                        com.facetec.sdk.ck.this.e.setEnabled(false);
                    }
                    viewTreeObserver.addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.facetec.sdk.ck$2$$ExternalSyntheticLambda1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            com.facetec.sdk.ck.AnonymousClass2.this.b();
                        }
                    });
                    int round = java.lang.Math.round(com.facetec.sdk.ay.d(40) * com.facetec.sdk.ck.this.t);
                    int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(5) * com.facetec.sdk.ck.this.t) << 2;
                    com.facetec.sdk.ck.this.h.getLayoutParams().width = -2;
                    com.facetec.sdk.ck.this.h.getLayoutParams().height = round;
                    ((android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.ck.this.h.getLayoutParams()).setMargins(round2, 0, round2, 0);
                    if (com.facetec.sdk.ck.this.f3466o) {
                        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.ck.this.b.getLayoutParams())).bottomMargin = com.facetec.sdk.ck.this.e.getHeight() + (com.facetec.sdk.ck.this.p << 1);
                    } else {
                        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.ck.this.b.getLayoutParams())).bottomMargin = com.facetec.sdk.ck.this.p;
                    }
                    if (com.facetec.sdk.FaceTecSDK.f3366a.f.showScrollIndicatorImage) {
                        int round3 = java.lang.Math.round(com.facetec.sdk.ay.d(30) * com.facetec.sdk.ck.this.t);
                        com.facetec.sdk.ck.this.f.getLayoutParams().width = round3;
                        com.facetec.sdk.ck.this.f.getLayoutParams().height = round3;
                        com.facetec.sdk.ck.b(com.facetec.sdk.ck.this);
                    } else {
                        com.facetec.sdk.ck.this.f.getLayoutParams().width = 0;
                        com.facetec.sdk.ck.this.f.getLayoutParams().height = 0;
                        com.facetec.sdk.ck.this.f.setVisibility(8);
                    }
                    float f = com.facetec.sdk.ck.this.t;
                    android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.f.scrollIndicatorFont;
                    com.facetec.sdk.dl.d(com.facetec.sdk.ck.this.j, com.facetec.sdk.R.string.FaceTec_idscan_ocr_confirmation_scroll_message);
                    com.facetec.sdk.ck.this.j.setTextSize(f * 16.0f);
                    com.facetec.sdk.ck.this.j.setTextColor(com.facetec.sdk.ck.this.m);
                    com.facetec.sdk.ck.this.j.setTypeface(typeface);
                    ((android.widget.LinearLayout.LayoutParams) com.facetec.sdk.ck.this.j.getLayoutParams()).setMarginEnd(com.facetec.sdk.ck.this.p / 2);
                    float round4 = com.facetec.sdk.dm.v() == -1.0f ? round / 2.0f : java.lang.Math.round(com.facetec.sdk.ay.d(java.lang.Math.round(r3)) * com.facetec.sdk.ck.this.n);
                    com.facetec.sdk.ck.this.i = androidx.core.content.ContextCompat.getDrawable(activity, com.facetec.sdk.R.drawable.facetec_scroll_down_indicator);
                    if (com.facetec.sdk.ck.this.i != null) {
                        ((android.graphics.drawable.GradientDrawable) com.facetec.sdk.ck.this.i).setStroke(java.lang.Math.round(com.facetec.sdk.ay.d(com.facetec.sdk.dm.y()) * com.facetec.sdk.ck.this.n), com.facetec.sdk.dp.e(activity, com.facetec.sdk.dm.ax()));
                        ((android.graphics.drawable.GradientDrawable) com.facetec.sdk.ck.this.i).setCornerRadius(round4);
                        ((android.graphics.drawable.GradientDrawable) com.facetec.sdk.ck.this.i).setColor(com.facetec.sdk.ck.this.g);
                        com.facetec.sdk.ck.this.b.setBackground(com.facetec.sdk.ck.this.i);
                    }
                    com.facetec.sdk.ck.this.b.setElevation(com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.f.scrollIndicatorElevation));
                    com.facetec.sdk.ck.this.b.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
                    com.facetec.sdk.ck.this.b.setClipToOutline(false);
                    com.facetec.sdk.ck.this.b.requestLayout();
                    com.facetec.sdk.ck.this.b.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.ck$2$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            com.facetec.sdk.ck.AnonymousClass2.this.e(view);
                        }
                    });
                    com.facetec.sdk.ck.this.b.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.ck$2$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                            boolean b;
                            b = com.facetec.sdk.ck.AnonymousClass2.this.b(view, motionEvent);
                            return b;
                        }
                    });
                    com.facetec.sdk.ck.this.b.setVisibility(0);
                } else if (!z && !com.facetec.sdk.ck.this.f3466o) {
                    ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) com.facetec.sdk.ck.this.e.getLayoutParams())).topMargin += java.lang.Math.max(0, com.facetec.sdk.ck.this.d.getHeight() - com.facetec.sdk.ck.this.c.getHeight());
                    com.facetec.sdk.ck.this.e.requestLayout();
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            int scrollY = com.facetec.sdk.ck.this.d.getScrollY();
            int height = com.facetec.sdk.ck.this.d.getHeight();
            int bottom = com.facetec.sdk.ck.this.c.getBottom();
            if (!com.facetec.sdk.ck.this.e.isEnabled() && bottom <= height + scrollY) {
                com.facetec.sdk.ck.this.e.a(true, true);
            }
            if (!com.facetec.sdk.ck.this.k || scrollY <= 0) {
                return;
            }
            com.facetec.sdk.ck.e(com.facetec.sdk.ck.this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(android.view.View view) {
            com.facetec.sdk.ck.this.d.post(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ck.AnonymousClass2.this.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.facetec.sdk.ck.this.b.setEnabled(false);
            com.facetec.sdk.ck.this.e.setEnabled(true);
            com.facetec.sdk.ck.e(com.facetec.sdk.ck.this);
            com.facetec.sdk.ck.this.d.fullScroll(130);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean b(android.view.View view, android.view.MotionEvent motionEvent) {
            if (!com.facetec.sdk.ck.this.b.isEnabled()) {
                return true;
            }
            if (motionEvent.getAction() == 0) {
                com.facetec.sdk.ck.a(com.facetec.sdk.ck.this, true);
            } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > com.facetec.sdk.ck.this.b.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > com.facetec.sdk.ck.this.b.getHeight()) {
                com.facetec.sdk.ck.a(com.facetec.sdk.ck.this, false);
            } else if (motionEvent.getAction() == 1) {
                com.facetec.sdk.ck.this.b.performClick();
            }
            return true;
        }
    }

    /* renamed from: com.facetec.sdk.ck$4, reason: invalid class name */
    final class AnonymousClass4 extends androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback {
        AnonymousClass4() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
            com.facetec.sdk.ck.this.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ck.AnonymousClass4.this.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.facetec.sdk.dp.a(com.facetec.sdk.ck.this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        com.facetec.sdk.ck.AnonymousClass4 anonymousClass4 = new com.facetec.sdk.ck.AnonymousClass4();
        if (i != 0) {
            com.facetec.sdk.dp.d(this.f, i, anonymousClass4, false);
        } else {
            this.f.setColorFilter(com.facetec.sdk.dm.aC(), android.graphics.PorterDuff.Mode.SRC_IN);
            com.facetec.sdk.dp.d(this.f, com.facetec.sdk.R.drawable.facetec_animated_double_down_chevron, anonymousClass4, false);
        }
        this.f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void h() {
        if (this.k) {
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ck.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.j.animate().alpha(0.0f).setStartDelay(2000L).setDuration(300L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.d();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.j.animate().alpha(1.0f).setStartDelay(0L).setDuration(300L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.h();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        this.g = intValue;
        ((android.graphics.drawable.GradientDrawable) this.i).setColor(intValue);
        this.b.setBackground(this.i);
        this.b.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        this.m = intValue;
        this.j.setTextColor(intValue);
        this.j.postInvalidate();
        if (this.w) {
            this.f.setColorFilter(this.m, android.graphics.PorterDuff.Mode.SRC_IN);
            this.f.postInvalidate();
        }
    }

    private void e(java.lang.String str) {
        if (this.z) {
            return;
        }
        com.facetec.sdk.at.a(str);
    }

    private static java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            return jSONObject.getString(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        org.json.JSONArray jSONArray;
        java.lang.String str5;
        java.lang.String str6 = str;
        org.json.JSONObject jSONObject = com.facetec.sdk.bj.h;
        java.lang.String str7 = null;
        if (jSONObject != null) {
            try {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("groups");
                if (optJSONArray == null) {
                    e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing \"groups\" key. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                } else if (optJSONArray.length() == 0) {
                    e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON has an empty array for the value of the \"groups\" key. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                } else {
                    int i = 0;
                    while (i < optJSONArray.length()) {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        java.lang.String b = b(jSONObject2, "groupKey");
                        if (b != null && !b.isEmpty()) {
                            if (b.equals(str6)) {
                                if (str2 == null) {
                                    str7 = b(jSONObject2, str3);
                                    if (str7 == null) {
                                        try {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                                            sb.append(str3);
                                            sb.append("\" key-value pair in the group object with a \"groupKey\" value of \"");
                                            sb.append(str6);
                                            sb.append("\". Falling back to use \"groupKey\" value of \"");
                                            sb.append(str6);
                                            sb.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                            com.facetec.sdk.at.a(sb.toString());
                                            str7 = str6;
                                        } catch (org.json.JSONException e) {
                                            e = e;
                                            e.printStackTrace();
                                            e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is in an invalid format. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                            str7 = str6;
                                            if (str7 != null) {
                                            }
                                        }
                                    }
                                    if (this.z) {
                                        break;
                                    }
                                }
                                org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("fields");
                                if (optJSONArray2 == null) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"fields\" key-value pair in the group object with a \"groupKey\" value of \"");
                                    sb2.append(str6);
                                    sb2.append("\". Falling back to use internal default values for all OCR strings in this group's fields. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                    e(sb2.toString());
                                } else if (optJSONArray2.length() == 0) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON has an empty array for the value of the \"fields\" key in the group object with a \"groupKey\" value of \"");
                                    sb3.append(str6);
                                    sb3.append("\". Falling back to use internal default values for all OCR strings in this group's fields. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                    e(sb3.toString());
                                } else {
                                    int i2 = 0;
                                    while (i2 < optJSONArray2.length()) {
                                        org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                                        jSONArray = optJSONArray;
                                        java.lang.String b2 = b(jSONObject3, "fieldKey");
                                        if (b2 != null && !b2.isEmpty()) {
                                            if (b2.equals(str2)) {
                                                java.lang.String b3 = b(jSONObject3, str3);
                                                if (b3 == null) {
                                                    try {
                                                        if (str3.equals("uiFieldDescriptionText")) {
                                                            b3 = b(jSONObject3, "fieldFriendlyName");
                                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                                                            sb4.append(str3);
                                                            sb4.append("\" key-value pair in the field object with a \"fieldKey\" value of \"");
                                                            sb4.append(str2);
                                                            sb4.append("\". Falling back to use \"");
                                                            sb4.append("fieldFriendlyName");
                                                            sb4.append("\" value of \"");
                                                            sb4.append(b3);
                                                            sb4.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                            com.facetec.sdk.at.a(sb4.toString());
                                                            str5 = "fieldFriendlyName";
                                                            if (b3 != null) {
                                                                try {
                                                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                                                                    sb5.append(str5);
                                                                    sb5.append("\" key-value pair in the field object with a \"fieldKey\" value of \"");
                                                                    sb5.append(str2);
                                                                    sb5.append("\". Falling back to use \"fieldKey\" value of \"");
                                                                    sb5.append(str2);
                                                                    sb5.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                                    com.facetec.sdk.at.a(sb5.toString());
                                                                    str7 = str2;
                                                                } catch (org.json.JSONException e2) {
                                                                    e = e2;
                                                                    str6 = str2;
                                                                    e.printStackTrace();
                                                                    e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is in an invalid format. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                                    str7 = str6;
                                                                    if (str7 != null) {
                                                                    }
                                                                }
                                                            } else {
                                                                str7 = b3;
                                                            }
                                                            if (this.z) {
                                                            }
                                                        }
                                                    } catch (org.json.JSONException e3) {
                                                        e = e3;
                                                        str7 = b3;
                                                        str6 = str7;
                                                        e.printStackTrace();
                                                        e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is in an invalid format. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                        str7 = str6;
                                                        if (str7 != null) {
                                                        }
                                                    }
                                                }
                                                str5 = str3;
                                                if (b3 != null) {
                                                }
                                                if (this.z) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            i2++;
                                            optJSONArray = jSONArray;
                                        }
                                        e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"fieldKey\" key-value pair from an object in the \"fields\" array. Falling back to use internal default value for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                        i2++;
                                        optJSONArray = jSONArray;
                                    }
                                }
                            }
                            jSONArray = optJSONArray;
                            i++;
                            optJSONArray = jSONArray;
                        }
                        jSONArray = optJSONArray;
                        e("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"groupKey\" key-value pair from an object in the \"groups\" array. Falling back to use internal default value for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                        i++;
                        optJSONArray = jSONArray;
                    }
                }
                if (str7 == null) {
                    if (str2 == null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                        sb6.append(str3);
                        sb6.append("\" key-value pair in the group object with a \"groupKey\" value of \"");
                        sb6.append(str6);
                        sb6.append("\". Falling back to use internal default value of \"");
                        sb6.append(str4);
                        sb6.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                        com.facetec.sdk.at.a(sb6.toString());
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                        sb7.append(str3);
                        sb7.append("\" key-value pair in the field object with a \"fieldKey\" value of \"");
                        sb7.append(str2);
                        sb7.append("\" within the \"fields\" array of the group object with a \"groupKey\" value of \"");
                        sb7.append(str6);
                        sb7.append("\". Falling back to use internal default value of \"");
                        sb7.append(str4);
                        sb7.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                        com.facetec.sdk.at.a(sb7.toString());
                    }
                }
                if (!this.z) {
                    this.z = true;
                }
            } catch (org.json.JSONException e4) {
                e = e4;
            }
        }
        return str7 != null ? str4 : str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(android.widget.EditText editText, android.view.View view, boolean z) {
        if (editText == null) {
            return;
        }
        if (z) {
            this.D = editText;
            editText.setCursorVisible(true);
        } else {
            this.D = null;
            editText.setCursorVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.widget.EditText editText, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (editText == null) {
            return false;
        }
        editText.setCursorVisible(false);
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            e(textView);
        }
        return false;
    }

    private void e(android.view.View view) {
        ((android.view.inputmethod.InputMethodManager) getActivity().getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f.setImageDrawable(null);
        this.b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.k) {
            return;
        }
        this.k = true;
        com.facetec.sdk.dp.a(this.f);
        if (this.u) {
            h();
        }
    }

    static /* synthetic */ void b(final com.facetec.sdk.ck ckVar) {
        final int aO = com.facetec.sdk.dm.aO();
        ckVar.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.d(aO);
            }
        });
    }

    static /* synthetic */ void a(final com.facetec.sdk.ck ckVar, boolean z) {
        android.app.Activity activity;
        int aC;
        int i = ckVar.g;
        int e = com.facetec.sdk.dp.e(ckVar.getActivity(), z ? com.facetec.sdk.dm.az() : com.facetec.sdk.dm.ay());
        int i2 = ckVar.m;
        if (z) {
            activity = ckVar.getActivity();
            aC = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1553326369, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1553326370)).intValue();
        } else {
            activity = ckVar.getActivity();
            aC = com.facetec.sdk.dm.aC();
        }
        int e2 = com.facetec.sdk.dp.e(activity, aC);
        if (i != e) {
            android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(e));
            ofObject.setDuration(200L);
            ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    com.facetec.sdk.ck.this.c(valueAnimator);
                }
            });
            ofObject.start();
        }
        if (i2 != e2) {
            android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(e2));
            ofObject2.setDuration(200L);
            ofObject2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    com.facetec.sdk.ck.this.b(valueAnimator);
                }
            });
            ofObject2.start();
        }
    }

    static /* synthetic */ void e(final com.facetec.sdk.ck ckVar) {
        ckVar.k = false;
        ckVar.b.animate().alpha(0.0f).setDuration(300L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.ck$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ck.this.a();
            }
        }).start();
    }

    static {
        init$0();
        C = new int[]{-1158965129, 1484443302, 1552536623, 1225293829, 951817779, 119179766, 1684164893, 126805517, -1456442220, 1719769088, 401887192, 1005056868, 1720955276, 1170399493, -136641323, -618244246, -1014317735, 1591297596};
    }
}
