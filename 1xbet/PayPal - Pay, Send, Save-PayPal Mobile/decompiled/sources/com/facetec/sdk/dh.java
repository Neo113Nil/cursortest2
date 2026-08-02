package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class dh extends com.facetec.sdk.au {
    android.os.Handler c;
    com.facetec.sdk.dh.c d;
    android.widget.ImageView e;
    private android.view.View f;
    private android.widget.RelativeLayout g;
    private android.widget.TextView h;
    private androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback i;
    private android.widget.ImageView j;

    /* renamed from: a, reason: collision with root package name */
    boolean f3509a = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3510o = false;
    final com.facetec.sdk.au.b b = new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.dh.this.d();
        }
    });

    public interface c {
        void r();
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_securing_camera_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.g = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.mainContainer);
        this.f = view.findViewById(com.facetec.sdk.R.id.mainBackgroundView);
        this.h = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageTextView);
        this.j = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.animationBackgroundImageView);
        this.e = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.animationForegroundImageView);
        com.facetec.sdk.dm.i(this.f);
        this.f.getBackground().setAlpha(com.facetec.sdk.dm.aW());
        float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        float bp = com.facetec.sdk.dm.bp();
        int d = com.facetec.sdk.dm.d();
        int round = java.lang.Math.round(com.facetec.sdk.ay.d(40) * bp * a2);
        this.g.setTranslationY(java.lang.Math.round(com.facetec.sdk.ay.d(-55) * a2));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.animationFrameLayout);
        frameLayout.getLayoutParams().height = round;
        frameLayout.getLayoutParams().width = round;
        int aM = com.facetec.sdk.dm.aM();
        final int aQ = com.facetec.sdk.dm.aQ();
        android.graphics.drawable.Drawable drawable = aM != 0 ? androidx.core.content.ContextCompat.getDrawable(getActivity(), aM) : null;
        if (aQ != 0) {
            this.j.setVisibility(8);
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.dh.this.e(aQ);
                }
            });
        } else if (aM != 0) {
            this.j.setVisibility(8);
            this.e.setImageDrawable(drawable);
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            rotateAnimation.setDuration(com.facetec.sdk.FaceTecSDK.f3366a.m.customAnimationImageRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.e.startAnimation(rotateAnimation);
        } else {
            this.j.setColorFilter(com.facetec.sdk.dm.q(getActivity()), android.graphics.PorterDuff.Mode.SRC_IN);
            this.e.setColorFilter(com.facetec.sdk.dm.p(getActivity()), android.graphics.PorterDuff.Mode.SRC_IN);
            android.view.animation.RotateAnimation rotateAnimation2 = new android.view.animation.RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation2.setDuration(1000L);
            rotateAnimation2.setInterpolator(new android.view.animation.LinearInterpolator());
            rotateAnimation2.setRepeatCount(-1);
            this.e.startAnimation(rotateAnimation2);
        }
        com.facetec.sdk.dp.e(this.h, com.facetec.sdk.dm.p(getActivity()));
        this.h.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.m.messageFont);
        com.facetec.sdk.dl.d(this.h, com.facetec.sdk.R.string.FaceTec_initializing_camera);
        this.h.setTextSize(2, a2 * 16.0f);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.h.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin = d;
        this.h.setLayoutParams(layoutParams);
        com.facetec.sdk.t.c(com.facetec.sdk.de.SECURING_CAMERA);
    }

    /* renamed from: com.facetec.sdk.dh$2, reason: invalid class name */
    final class AnonymousClass2 extends androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback {
        AnonymousClass2() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
            com.facetec.sdk.dh.this.e(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.dh.AnonymousClass2.this.b();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            com.facetec.sdk.dp.a(com.facetec.sdk.dh.this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i) {
        com.facetec.sdk.dh.AnonymousClass2 anonymousClass2 = new com.facetec.sdk.dh.AnonymousClass2();
        this.i = anonymousClass2;
        com.facetec.sdk.dp.d(this.e, i, anonymousClass2, true);
    }

    final void a() {
        if (this.f3509a && this.f3510o) {
            final com.facetec.sdk.au.b bVar = new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.dh.this.b();
                }
            });
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.dh.this.b(bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final com.facetec.sdk.au.b bVar) {
        this.g.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dh.this.c(bVar);
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final com.facetec.sdk.au.b bVar) {
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.dh$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dh.this.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.facetec.sdk.au.b bVar) {
        android.widget.RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (bVar != null) {
            bVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        com.facetec.sdk.dh.c cVar = this.d;
        if (cVar != null) {
            cVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f3510o = true;
        a();
    }
}
