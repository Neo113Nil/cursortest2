package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class d {
    public final android.widget.RelativeLayout b;
    public final com.fyber.inneractive.sdk.renderers.g i;
    public float c = 0.0f;
    public int d = 1;
    public float e = 0.0f;
    public long f = 0;
    public boolean g = false;
    public boolean h = false;
    public final com.fyber.inneractive.sdk.renderers.b j = new com.fyber.inneractive.sdk.renderers.b(this);

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.j f4235a = new com.fyber.inneractive.sdk.util.j(4, new com.fyber.inneractive.sdk.renderers.c());

    public d(com.fyber.inneractive.sdk.response.f fVar, android.widget.RelativeLayout relativeLayout, com.fyber.inneractive.sdk.renderers.g gVar) {
        this.b = relativeLayout;
        this.i = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        java.lang.String str;
        com.fyber.inneractive.sdk.util.IAlog.a("IAVisibilityTracker: onCheckVisibility", new java.lang.Object[0]);
        float f = this.d / 100.0f;
        com.fyber.inneractive.sdk.util.j jVar = this.f4235a;
        java.lang.Object poll = jVar.f4295a.poll();
        if (poll == null) {
            poll = jVar.b.a();
        }
        android.graphics.Rect rect = (android.graphics.Rect) poll;
        android.widget.RelativeLayout relativeLayout = this.b;
        float width = (relativeLayout.getParent() != null && relativeLayout.isShown() && relativeLayout.hasWindowFocus() && relativeLayout.getGlobalVisibleRect(rect)) ? (rect.width() * rect.height()) / (relativeLayout.getWidth() * relativeLayout.getHeight()) : 0.0f;
        this.f4235a.f4295a.offer(rect);
        this.c = width;
        if (width >= f) {
            float f2 = this.e * 1000.0f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.f;
            if (f2 < currentTimeMillis - j && j != 0) {
                z = true;
                com.fyber.inneractive.sdk.util.IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", java.lang.Boolean.valueOf(z), java.lang.Float.valueOf(f));
                if (z || !this.g) {
                    if (this.g) {
                        return;
                    }
                    float f3 = this.c;
                    if (f3 < f) {
                        this.f = 0L;
                    } else if (f3 >= f && this.f == 0) {
                        this.f = java.lang.System.currentTimeMillis();
                    }
                    android.os.Handler handler = com.fyber.inneractive.sdk.util.r.b;
                    handler.removeCallbacks(this.j);
                    handler.postDelayed(this.j, 50L);
                    return;
                }
                if (this.i == null || this.h) {
                    return;
                }
                this.h = true;
                com.fyber.inneractive.sdk.util.IAlog.a("BannerVisibilityTracker | firing viewable", new java.lang.Object[0]);
                com.fyber.inneractive.sdk.renderers.n nVar = this.i.f4238a;
                nVar.getClass();
                try {
                    com.fyber.inneractive.sdk.flow.x xVar = nVar.b;
                    if (xVar == null || ((com.fyber.inneractive.sdk.flow.q0) xVar).b == null || (str = ((com.fyber.inneractive.sdk.response.f) ((com.fyber.inneractive.sdk.flow.q0) xVar).b).u) == null || str.trim().length() <= 0) {
                        return;
                    }
                    com.fyber.inneractive.sdk.util.IAlog.e("%sfiring banner mrc visibility impression!", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
                    com.fyber.inneractive.sdk.util.IAlog.d("MRC_VISIBILITY_IMPRESSION", new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.network.z0.b(str);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
        }
        z = false;
        com.fyber.inneractive.sdk.util.IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", java.lang.Boolean.valueOf(z), java.lang.Float.valueOf(f));
        if (z) {
        }
        if (this.g) {
        }
    }
}
