package com.fyber.inneractive.sdk.flow.storepromo.ui;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f3755a;
    public android.view.ViewGroup b;
    public final android.view.animation.Animation c;
    public final android.view.animation.Animation d;
    public com.fyber.inneractive.sdk.flow.storepromo.ui.b e;
    public com.fyber.inneractive.sdk.flow.storepromo.b f;
    public final float g;
    public int h = -1;
    public final com.fyber.inneractive.sdk.flow.storepromo.ui.a i = new com.fyber.inneractive.sdk.flow.storepromo.ui.a(this);

    public c(android.content.Context context, android.view.View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f;
        this.f3755a = view;
        this.c = android.view.animation.AnimationUtils.loadAnimation(context, com.fyber.inneractive.sdk.R.anim.store_promo_appear_anim);
        this.d = android.view.animation.AnimationUtils.loadAnimation(context, com.fyber.inneractive.sdk.R.anim.store_promo_disappear_anim);
        com.fyber.inneractive.sdk.config.o oVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b;
        oVar.getClass();
        try {
            f = java.lang.Float.parseFloat(oVar.a("dtx_store_promo_height", java.lang.Float.toString(0.7f)));
        } catch (java.lang.Throwable unused) {
            f = 0.7f;
        }
        this.g = java.lang.Math.max(f, 0.7f);
        this.f = bVar;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.fyber.inneractive.sdk.R.layout.dt_store_promo_layout, (android.view.ViewGroup) null);
        this.b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.b.setBackgroundColor(context.getResources().getColor(com.fyber.inneractive.sdk.R.color.dtx_store_promo_bg_fade));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f3755a.setLayoutParams(layoutParams2);
        this.b.setVisibility(8);
        android.view.ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.b.addView(this.f3755a);
        }
        if (this.e == null) {
            com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = new com.fyber.inneractive.sdk.flow.storepromo.ui.b(this);
            this.e = bVar2;
            com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(bVar2, new android.content.IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        android.view.View view;
        int c = com.fyber.inneractive.sdk.util.o.c();
        if (c == this.h || (view = this.f3755a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.h = c;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f3755a.getLayoutParams();
        layoutParams.height = c == 2 ? com.fyber.inneractive.sdk.util.o.e() : (int) (com.fyber.inneractive.sdk.util.o.d() * this.g);
        this.f3755a.setLayoutParams(layoutParams);
    }
}
