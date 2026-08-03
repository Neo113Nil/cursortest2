package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.x0 f4366a;
    public float b;
    public float c;
    public final float d;

    public y0(com.fyber.inneractive.sdk.web.x0 x0Var, android.content.Context context) {
        this.f4366a = x0Var;
        this.d = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f4366a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((com.fyber.inneractive.sdk.web.i) this.f4366a).i();
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((com.fyber.inneractive.sdk.web.i) this.f4366a).i();
                this.c = -1.0f;
                this.b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f = this.b;
                if (f >= 0.0f && this.c >= 0.0f) {
                    float round = java.lang.Math.round(java.lang.Math.abs(f - motionEvent.getX()));
                    float round2 = java.lang.Math.round(java.lang.Math.abs(this.c - motionEvent.getY()));
                    float f2 = this.d;
                    if (round < f2 && round2 < f2) {
                        com.fyber.inneractive.sdk.web.i iVar = (com.fyber.inneractive.sdk.web.i) this.f4366a;
                        iVar.getClass();
                        com.fyber.inneractive.sdk.util.IAlog.a("IAWebViewController onClicked()", new java.lang.Object[0]);
                        if (iVar.l != null) {
                            com.fyber.inneractive.sdk.util.IAlog.e("Native click detected in time. Processing pending click", new java.lang.Object[0]);
                            iVar.l.d();
                            com.fyber.inneractive.sdk.web.d dVar = iVar.m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
                            }
                            iVar.l = null;
                            iVar.i();
                        } else {
                            if (iVar.n != null) {
                                com.fyber.inneractive.sdk.util.r.b.postDelayed(iVar.n, com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("click_timeout", 1000, 1000));
                            }
                            iVar.j = true;
                        }
                    }
                    this.b = -1.0f;
                    this.c = -1.0f;
                }
            }
        }
        return false;
    }
}
