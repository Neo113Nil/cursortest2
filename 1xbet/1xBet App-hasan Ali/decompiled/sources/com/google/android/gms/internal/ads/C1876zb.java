package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import r.C2328f;

/* renamed from: com.google.android.gms.internal.ads.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876zb extends C0709Wb {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f16590A;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f16591B;

    /* renamed from: C, reason: collision with root package name */
    public final Qt f16592C;

    /* renamed from: D, reason: collision with root package name */
    public PopupWindow f16593D;

    /* renamed from: E, reason: collision with root package name */
    public RelativeLayout f16594E;

    /* renamed from: F, reason: collision with root package name */
    public ViewGroup f16595F;

    /* renamed from: o, reason: collision with root package name */
    public String f16596o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16597p;

    /* renamed from: q, reason: collision with root package name */
    public int f16598q;

    /* renamed from: r, reason: collision with root package name */
    public int f16599r;

    /* renamed from: s, reason: collision with root package name */
    public int f16600s;

    /* renamed from: t, reason: collision with root package name */
    public int f16601t;

    /* renamed from: u, reason: collision with root package name */
    public int f16602u;

    /* renamed from: v, reason: collision with root package name */
    public int f16603v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f16604w;

    /* renamed from: x, reason: collision with root package name */
    public final C0733Ze f16605x;

    /* renamed from: y, reason: collision with root package name */
    public final Activity f16606y;

    /* renamed from: z, reason: collision with root package name */
    public C1586t f16607z;

    static {
        C2328f c2328f = new C2328f(7);
        Collections.addAll(c2328f, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(c2328f);
    }

    public C1876zb(C0733Ze c0733Ze, Qt qt) {
        super(9, c0733Ze, "resize");
        this.f16596o = "top-right";
        this.f16597p = true;
        this.f16598q = 0;
        this.f16599r = 0;
        this.f16600s = -1;
        this.f16601t = 0;
        this.f16602u = 0;
        this.f16603v = -1;
        this.f16604w = new Object();
        this.f16605x = c0733Ze;
        this.f16606y = c0733Ze.e();
        this.f16592C = qt;
    }

    public final void A(boolean z3) {
        synchronized (this.f16604w) {
            try {
                if (this.f16593D != null) {
                    if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.sa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        B(z3);
                    } else {
                        AbstractC0613Id.f.b(new P2.f(2, this, z3));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(boolean z3) {
        A7 a7 = F7.ta;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        C0733Ze c0733Ze = this.f16605x;
        if (booleanValue) {
            this.f16594E.removeView(c0733Ze);
            this.f16593D.dismiss();
        } else {
            this.f16593D.dismiss();
            this.f16594E.removeView(c0733Ze);
        }
        A7 a72 = F7.ua;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a72)).booleanValue()) {
            ViewParent parent = c0733Ze.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0733Ze);
            }
        }
        ViewGroup viewGroup = this.f16595F;
        if (viewGroup != null) {
            viewGroup.removeView(this.f16590A);
            if (((Boolean) d7.a(F7.va)).booleanValue()) {
                try {
                    this.f16595F.addView(c0733Ze);
                    c0733Ze.K0(this.f16607z);
                } catch (IllegalStateException e3) {
                    U2.j.g("Unable to add webview back to view hierarchy.", e3);
                }
            } else {
                this.f16595F.addView(c0733Ze);
                c0733Ze.K0(this.f16607z);
            }
        }
        if (z3) {
            x("default");
            Qt qt = this.f16592C;
            if (qt != null) {
                ((Vk) qt.f11282l).f11915c.n1(new Jh(4));
            }
        }
        this.f16593D = null;
        this.f16594E = null;
        this.f16595F = null;
        this.f16591B = null;
    }
}
