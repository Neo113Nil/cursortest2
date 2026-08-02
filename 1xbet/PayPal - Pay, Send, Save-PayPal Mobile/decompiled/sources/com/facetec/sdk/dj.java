package com.facetec.sdk;

/* loaded from: classes8.dex */
final class dj {
    final java.lang.ref.WeakReference<com.facetec.sdk.bf> d;

    dj(android.app.Activity activity) {
        this.d = new java.lang.ref.WeakReference<>((com.facetec.sdk.bf) activity);
    }

    final void e() {
        final com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.d.get();
        faceTecSessionActivity.x = (android.widget.ImageView) faceTecSessionActivity.findViewById(com.facetec.sdk.R.id.customLocationBackButton);
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM || com.facetec.sdk.FaceTecSDK.f3366a.f3361o.b == null) {
            return;
        }
        faceTecSessionActivity.x.setAlpha(0.0f);
        faceTecSessionActivity.x.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.f3361o.b.left));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.f3361o.b.top);
        ((android.view.ViewGroup.LayoutParams) layoutParams).width = (int) com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.f3361o.b.right);
        ((android.view.ViewGroup.LayoutParams) layoutParams).height = (int) com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.f3361o.b.bottom);
        faceTecSessionActivity.x.setLayoutParams(layoutParams);
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.customImage != 0) {
            faceTecSessionActivity.x.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(faceTecSessionActivity, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue()));
        }
        faceTecSessionActivity.x.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.dj$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facetec.sdk.dj.a(com.facetec.sdk.FaceTecSessionActivity.this, view);
            }
        });
        faceTecSessionActivity.x.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.dj$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean a2;
                a2 = com.facetec.sdk.dj.a(com.facetec.sdk.FaceTecSessionActivity.this, view, motionEvent);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity, android.view.View view) {
        faceTecSessionActivity.x.setAlpha(1.0f);
        faceTecSessionActivity.onBackPressed();
        faceTecSessionActivity.x.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            faceTecSessionActivity.x.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > faceTecSessionActivity.x.getWidth() + faceTecSessionActivity.x.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > faceTecSessionActivity.x.getHeight() + faceTecSessionActivity.x.getTop() + 10) {
            faceTecSessionActivity.x.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            faceTecSessionActivity.x.performClick();
        }
        return true;
    }
}
