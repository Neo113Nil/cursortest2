package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class bt extends com.facetec.sdk.au {

    /* renamed from: a, reason: collision with root package name */
    private android.widget.FrameLayout f3435a;
    private android.view.View c;
    private android.view.View d;
    private android.view.View e;
    private android.widget.TextView f;
    private android.widget.ImageView h;
    private android.widget.ImageView i;
    private android.widget.RelativeLayout j;
    private android.animation.ObjectAnimator g = null;

    /* renamed from: o, reason: collision with root package name */
    private android.animation.ObjectAnimator f3436o = null;
    boolean b = false;
    private boolean m = false;
    private boolean n = false;

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_id_feedback_fragment, viewGroup, false);
        this.e = inflate;
        return inflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        android.app.Activity activity = getActivity();
        this.c = view.findViewById(com.facetec.sdk.R.id.backgroundView);
        this.d = view.findViewById(com.facetec.sdk.R.id.contentLayout);
        this.f3435a = (android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.iconFrameLayout);
        this.j = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.iconImageContainer);
        this.i = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.frontIconImageView);
        this.h = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.backIconImageView);
        this.f = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageTextView);
        float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        int d = com.facetec.sdk.dm.d();
        int round = java.lang.Math.round(com.facetec.sdk.ay.d(80) * com.facetec.sdk.dm.bp() * a2);
        int round2 = java.lang.Math.round(com.facetec.sdk.ay.d(-55) * a2);
        int round3 = java.lang.Math.round(a2 * 24.0f);
        android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.h.messageFont;
        int e = com.facetec.sdk.dp.e(activity, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -2099501144, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 2099501158)).intValue());
        int aX = com.facetec.sdk.dm.aX();
        int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 210173370, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -210173350)).intValue();
        int be = com.facetec.sdk.dm.be();
        if (be != 0) {
            com.facetec.sdk.dp.d(this.i, be, null, false);
            this.h.setVisibility(8);
            this.m = true;
        } else if (aX != 0 && intValue != 0) {
            android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(activity, com.facetec.sdk.R.drawable.facetec_internal_id_card_front);
            android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(activity, aX);
            android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(activity, intValue);
            if (drawable != null && drawable2 != null && drawable3 != null && com.facetec.sdk.ay.e(drawable, drawable2)) {
                drawable2.setColorFilter(e, android.graphics.PorterDuff.Mode.SRC_IN);
                drawable3.setColorFilter(e, android.graphics.PorterDuff.Mode.SRC_IN);
            }
            this.i.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(activity, aX));
            this.h.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(activity, intValue));
            this.n = true;
        } else {
            this.j.setVisibility(8);
        }
        this.d.setTranslationY(round2);
        this.f3435a.getLayoutParams().height = round;
        this.f3435a.getLayoutParams().width = round;
        ((android.widget.RelativeLayout.LayoutParams) this.f3435a.getLayoutParams()).setMargins(0, d, 0, 0);
        if (!com.facetec.sdk.dl.d(getActivity(), com.facetec.sdk.R.string.FaceTec_idscan_feedback_flip_id_to_back_message)) {
            this.f.setVisibility(8);
        } else {
            com.facetec.sdk.dl.d(this.f, com.facetec.sdk.R.string.FaceTec_idscan_feedback_flip_id_to_back_message);
            this.f.setTextColor(e);
            this.f.setTypeface(typeface);
            this.f.setTextSize(round3);
            ((android.widget.RelativeLayout.LayoutParams) this.f.getLayoutParams()).setMargins(0, d, 0, d);
        }
        com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1818774409, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{this.c, java.lang.Integer.valueOf(com.facetec.sdk.dm.Q())}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1818774431);
        this.c.getBackground().setAlpha(com.facetec.sdk.dm.aW());
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.g != null) {
            return;
        }
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bt.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bt.this.d();
            }
        }, 700L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.g != null) {
            return;
        }
        if (this.j.getVisibility() == 8 && this.f.getVisibility() == 8) {
            e();
            return;
        }
        if (this.m) {
            com.facetec.sdk.dp.a(this.i);
        } else if (this.n) {
            d(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bt.this.b();
                }
            }, 1000L);
        }
        this.g = com.facetec.sdk.dp.d(this.d, 1.0f, new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bt.this.a();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bt.this.h();
            }
        }), com.facetec.sdk.dm.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        android.app.Activity activity = getActivity();
        if (activity == null || !activity.hasWindowFocus()) {
            return;
        }
        a(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bt.this.e();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(getActivity(), com.facetec.sdk.R.animator.facetec_front_id_flip_animator);
        android.animation.AnimatorSet animatorSet2 = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(getActivity(), com.facetec.sdk.R.animator.facetec_back_id_flip_animator);
        animatorSet.setTarget(this.i);
        animatorSet2.setTarget(this.h);
        animatorSet.start();
        animatorSet2.start();
    }

    final void a(final java.lang.Runnable runnable) {
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bt.this.b(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final java.lang.Runnable runnable) {
        if (this.f3436o != null && runnable != null) {
            runnable.run();
        } else {
            this.f3436o = com.facetec.sdk.dp.d(this.d, 0.0f, new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bt$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bt.this.d(runnable);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(java.lang.Runnable runnable) {
        this.b = true;
        android.view.View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.b = true;
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) getActivity();
        if (blVar == null || !blVar.hasWindowFocus()) {
            return;
        }
        blVar.z();
    }
}
