package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.v;

/* loaded from: classes4.dex */
public abstract class s extends e {
    public final int j;
    public final int k;
    public final int l;
    public ViewGroup m;
    public Button n;
    public int o;
    public int p;
    public boolean q;
    public ViewGroup r;
    public ViewGroup s;
    public final h1 t;
    public h1 u;
    public TextView v;
    public final com.fyber.inneractive.sdk.config.global.r w;
    public final String x;
    public final h1 y;

    public s(Context context, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context);
        this.o = -1;
        this.p = -1;
        this.q = false;
        this.t = new h1(0, 0);
        this.y = new h1(0, 0);
        IAlog.a("%sctor called", IAlog.a(this));
        int tickFractions = getTickFractions();
        this.k = tickFractions;
        this.j = getMaxTickFactor();
        this.l = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.w = rVar;
        this.x = str;
    }

    public abstract void a(int i, int i2);

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2);

    public abstract void a(boolean z);

    public void a(boolean z, int i, int i2) {
        this.o = i;
        this.p = i2;
        this.q = z;
    }

    public abstract void a(boolean z, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z, String str);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean c() {
        return this.r.getVisibility() == 0 || this.s.getChildCount() > 0;
    }

    public abstract void d(boolean z);

    public void destroy() {
        i();
        setVisibility(8);
        if (this.g != null) {
            this.g = null;
        }
        this.i = null;
        IAlog.a("%sdestroyed called", IAlog.a(this));
    }

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract void g();

    public abstract void g(boolean z);

    public ViewGroup getDefaultEndCardContainer() {
        return this.r;
    }

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public ViewGroup getTextureHost() {
        return this.m;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.p;
    }

    public int getVideoWidth() {
        return this.o;
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a(this.y, size, size2);
        h1 h1Var = this.y;
        int i3 = h1Var.f5951a;
        if (i3 <= 0 || h1Var.b <= 0) {
            h1Var.f5951a = size;
            h1Var.b = size2;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.y.b, 1073741824);
            i = makeMeasureSpec;
        }
        if (!this.t.equals(this.y)) {
            h1 h1Var2 = this.t;
            h1 h1Var3 = this.y;
            h1Var2.getClass();
            h1Var2.f5951a = h1Var3.f5951a;
            h1Var2.b = h1Var3.b;
            o();
        }
        super.onMeasure(i, i2);
    }

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            n nVar = this.g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            ViewGroup viewGroup = fVar.c;
            v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.e, dVar.c);
        }
    }

    public final void a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new r(new GestureDetector(view.getContext(), new q(this, view, new int[2], i))));
        }
    }
}
