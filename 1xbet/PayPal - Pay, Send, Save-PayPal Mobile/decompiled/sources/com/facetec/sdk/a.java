package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class a extends com.facetec.sdk.au {

    /* renamed from: a, reason: collision with root package name */
    private android.view.View f3373a;
    private android.view.View b;
    private android.widget.FrameLayout c;
    private android.widget.ImageView d;
    private android.view.View e;
    private android.widget.TextView g;

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_additional_review_fragment, viewGroup, false);
        this.e = inflate;
        return inflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        android.app.Activity activity = getActivity();
        this.f3373a = view.findViewById(com.facetec.sdk.R.id.backgroundView);
        this.b = view.findViewById(com.facetec.sdk.R.id.contentLayout);
        this.c = (android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.iconFrameLayout);
        this.d = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.iconImageView);
        this.g = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageTextView);
        float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        int d = com.facetec.sdk.dm.d();
        int round = java.lang.Math.round(com.facetec.sdk.ay.d(80) * com.facetec.sdk.dm.bp() * a2);
        int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(-55) * a2);
        int round3 = java.lang.Math.round(a2 * 24.0f);
        android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.h.messageFont;
        int e = com.facetec.sdk.dp.e(activity, com.facetec.sdk.dm.O());
        getActivity();
        int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -122880092, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 122880123)).intValue();
        int bd = com.facetec.sdk.dm.bd();
        if (bd != 0) {
            com.facetec.sdk.dp.d(this.d, bd, null, false);
        } else if (intValue != 0) {
            this.d.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(activity, intValue));
        } else {
            this.d.setVisibility(8);
        }
        this.b.setTranslationY(round2);
        this.c.getLayoutParams().height = round;
        this.c.getLayoutParams().width = round;
        ((android.widget.RelativeLayout.LayoutParams) this.c.getLayoutParams()).setMargins(0, d, 0, 0);
        com.facetec.sdk.dl.d(this.g, com.facetec.sdk.R.string.FaceTec_idscan_additional_review_message);
        this.g.setTextColor(e);
        this.g.setTypeface(typeface);
        this.g.setTextSize(round3);
        ((android.widget.RelativeLayout.LayoutParams) this.g.getLayoutParams()).setMargins(0, d, 0, d);
        com.facetec.sdk.dm.a(this.f3373a);
        this.f3373a.getBackground().setAlpha(com.facetec.sdk.dm.aW());
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.a.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.a.this.d();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        com.facetec.sdk.dp.a(this.d);
        this.b.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.a$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.a.this.b();
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.a.this.e();
            }
        }, com.facetec.sdk.dm.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.b.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.a.this.i();
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) getActivity();
        if (blVar != null) {
            com.facetec.sdk.t.c(blVar, com.facetec.sdk.c.ADDITIONAL_REVIEW_BUTTON_PRESSED, (java.lang.String) null, (java.lang.Throwable) null);
            blVar.A();
        }
    }
}
