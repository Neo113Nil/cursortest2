package com.google.android.gms.internal.ads;

import a.AbstractC0444a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Pj {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f11092k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final T2.I f11093a;

    /* renamed from: b, reason: collision with root package name */
    public final Wq f11094b;

    /* renamed from: c, reason: collision with root package name */
    public final Ij f11095c;

    /* renamed from: d, reason: collision with root package name */
    public final Gj f11096d;

    /* renamed from: e, reason: collision with root package name */
    public final Wj f11097e;
    public final C0765ak f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f11098g;

    /* renamed from: h, reason: collision with root package name */
    public final Qw f11099h;
    public final B8 i;

    /* renamed from: j, reason: collision with root package name */
    public final Ej f11100j;

    public Pj(T2.I i, Wq wq, Ij ij, Gj gj, Wj wj, C0765ak c0765ak, Executor executor, Qw qw, Ej ej) {
        this.f11093a = i;
        this.f11094b = wq;
        this.i = wq.i;
        this.f11095c = ij;
        this.f11096d = gj;
        this.f11097e = wj;
        this.f = c0765ak;
        this.f11098g = executor;
        this.f11099h = qw;
        this.f11100j = ej;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk) {
        if (interfaceViewOnClickListenerC0810bk == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC0810bk.c().getContext();
        if (AbstractC0444a.o0(context, this.f11095c.f9599a)) {
            if (!(context instanceof Activity)) {
                U2.j.d("Activity context is needed for policy validator.");
                return;
            }
            C0765ak c0765ak = this.f;
            if (c0765ak == null || interfaceViewOnClickListenerC0810bk.g() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(c0765ak.a(interfaceViewOnClickListenerC0810bk.g(), windowManager), AbstractC0444a.h0());
            } catch (C0719Xe e3) {
                T2.G.n("web view can not be obtained", e3);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z3) {
        View view;
        View view2;
        if (z3) {
            view2 = this.f11096d.G();
        } else {
            Gj gj = this.f11096d;
            synchronized (gj) {
                view = gj.f9239p;
            }
            view2 = view;
        }
        if (view2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view2.getParent() instanceof ViewGroup) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        viewGroup.addView(view2, ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8725M3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
