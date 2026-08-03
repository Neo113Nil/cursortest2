package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public abstract class i1 extends com.fyber.inneractive.sdk.web.i {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final com.fyber.inneractive.sdk.web.c0 G;
    public com.fyber.inneractive.sdk.measurement.e H;
    public com.fyber.inneractive.sdk.measurement.tracker.e I;
    public final com.fyber.inneractive.sdk.web.e1 J;
    public final com.fyber.inneractive.sdk.web.f1 K;
    public final com.fyber.inneractive.sdk.web.g1 L;
    public final com.fyber.inneractive.sdk.web.h1 M;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public i1(boolean z, com.fyber.inneractive.sdk.web.c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z, rVar);
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = false;
        this.E = false;
        this.I = null;
        this.J = new com.fyber.inneractive.sdk.web.e1(this);
        this.K = new com.fyber.inneractive.sdk.web.f1(this);
        this.L = new com.fyber.inneractive.sdk.web.g1(this);
        this.M = new com.fyber.inneractive.sdk.web.h1(this);
        this.G = c0Var;
    }

    public final void a(java.util.ArrayList arrayList) {
        if (this.b != null) {
            java.lang.String obj = arrayList.toString();
            if (obj.length() < 2) {
                return;
            }
            java.lang.String str = "{" + obj.substring(1, obj.length() - 1) + "}";
            this.b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            com.fyber.inneractive.sdk.util.IAlog.e("Fire changes: %s", str);
        }
    }

    public void j() {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    public void k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.w, this.x));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.u, this.v));
        } else {
            int widthDp = this.b.getWidthDp();
            int heightDp = this.b.getHeightDp();
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(widthDp, heightDp));
        }
        com.fyber.inneractive.sdk.web.m mVar2 = this.b;
        int c = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.u);
        com.fyber.inneractive.sdk.web.m mVar3 = this.b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(c, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.v)));
        a(arrayList);
        a(new com.fyber.inneractive.sdk.mraid.d0(com.fyber.inneractive.sdk.mraid.f0.DEFAULT));
    }

    public final void l() {
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null) {
            this.C = true;
            if (this.A) {
                mVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            com.fyber.inneractive.sdk.util.r.b.postDelayed(this.J, 0L);
        }
    }

    public boolean m() {
        com.fyber.inneractive.sdk.web.c0 c0Var = this.G;
        return c0Var != null && c0Var.equals(com.fyber.inneractive.sdk.web.c0.INTERSTITIAL);
    }

    public void n() {
        com.fyber.inneractive.sdk.web.m mVar;
        if (this.C && this.D && this.A && (mVar = this.b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            com.fyber.inneractive.sdk.web.h1 h1Var = this.M;
            if (h1Var != null) {
                com.fyber.inneractive.sdk.util.r.b.postDelayed(h1Var, 5000L);
            }
            if (this.E) {
                this.b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    public void setAdDefaultSize(int i, int i2) {
        this.y = i;
        this.z = i2;
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.A = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.B = z;
    }

    public void setMuteMraidVideo(boolean z) {
        this.E = z;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.y yVar) {
        if (this.b != null) {
            java.lang.String str = "{" + yVar.toString() + "}";
            this.b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            com.fyber.inneractive.sdk.util.IAlog.e("Fire changes: %s", str);
        }
    }

    public void a(android.content.Context context, boolean z) {
        android.view.Window window;
        android.view.Window window2;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (context != null) {
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        boolean z2 = context instanceof android.app.Activity;
        if (z2 && (window2 = ((android.app.Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.top;
        android.view.View findViewById = (!z2 || (window = ((android.app.Activity) context).getWindow()) == null) ? null : window.findViewById(android.R.id.content);
        int top = findViewById != null ? findViewById.getTop() - i : 0;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        double d = i2;
        double d2 = 160.0d / displayMetrics.densityDpi;
        int i4 = (int) (d2 * d);
        int i5 = (int) (d2 * i3);
        int i6 = (i3 - i) - top;
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            i4 = this.b.getWidthDp();
            i5 = this.b.getHeightDp();
            i6 = (com.fyber.inneractive.sdk.util.o.b(this.b.getHeightDp()) - i) - top;
            this.u = this.w;
        } else {
            this.u = (int) ((160.0d / displayMetrics.densityDpi) * d);
        }
        this.v = (int) ((160.0d / displayMetrics.densityDpi) * i6);
        if (this.w == i4 && this.x == i5) {
            return;
        }
        this.w = i4;
        this.x = i5;
        a(new com.fyber.inneractive.sdk.mraid.c0(i4, i5));
        a(new com.fyber.inneractive.sdk.mraid.a0(this.u, this.v));
        a(new com.fyber.inneractive.sdk.mraid.z(this.u, this.v));
        int i7 = this.y;
        if (i7 > 0 && this.z > 0) {
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i7), com.fyber.inneractive.sdk.util.o.c(this.z)));
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar2 = this.b;
        if (mVar2 == null || mVar2.getWidth() <= 0 || this.b.getHeight() <= 0) {
            return;
        }
        a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.b.getHeight())));
    }
}
