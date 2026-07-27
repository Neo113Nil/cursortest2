package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.util.o;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public View f5408a;
    public ViewGroup b;
    public final Animation c;
    public final Animation d;
    public b e;
    public com.fyber.inneractive.sdk.flow.storepromo.b f;
    public final float g;
    public int h = -1;
    public final a i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f;
        this.f5408a = view;
        this.c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        r rVar = IAConfigManager.R.u.b;
        rVar.getClass();
        try {
            f = Float.parseFloat(rVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f = 0.7f;
        }
        this.g = Math.max(f, 0.7f);
        this.f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f5408a.setLayoutParams(layoutParams2);
        this.b.setVisibility(8);
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.b.addView(this.f5408a);
        }
        if (this.e == null) {
            b bVar2 = new b(this);
            this.e = bVar2;
            o.f5960a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int b = o.b();
        if (b == this.h || (view = this.f5408a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.h = b;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f5408a.getLayoutParams();
        layoutParams.height = b == 2 ? o.d() : (int) (o.c() * this.g);
        this.f5408a.setLayoutParams(layoutParams);
    }
}
