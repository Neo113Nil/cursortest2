package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class w0 extends com.fyber.inneractive.sdk.flow.x implements com.fyber.inneractive.sdk.external.NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public android.net.Uri l;
    public android.net.Uri m;
    public com.fyber.inneractive.sdk.external.MediaView n;
    public java.lang.Float o;
    public java.lang.Float p;
    public final java.util.ArrayList q;
    public com.fyber.inneractive.sdk.flow.nativead.r r;
    public com.fyber.inneractive.sdk.flow.t0 s;
    public final java.util.HashMap t;
    public com.fyber.inneractive.sdk.flow.nativead.j u;
    public com.fyber.inneractive.sdk.flow.nativead.a v;
    public final java.util.ArrayList w;
    public final java.util.ArrayList x;

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.q = new java.util.ArrayList();
        this.t = new java.util.HashMap();
        this.w = new java.util.ArrayList();
        this.x = new java.util.ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(java.lang.String str) {
        char c;
        com.fyber.inneractive.sdk.util.g gVar;
        if (str == null || str.trim().isEmpty()) {
            str = com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER;
        }
        com.fyber.inneractive.sdk.util.IAlog.c("%s : handleClick(): %s", "w0", str);
        if (this.u != null) {
            switch (str.hashCode()) {
                case -1884772963:
                    if (str.equals(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.RATING)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1840402880:
                    if (str.equals(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.MEDIA_VIEW)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 67056:
                    if (str.equals(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2241657:
                    if (str.equals(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.AD_ICON)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2521314:
                    if (str.equals("ROOT")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 75532016:
                    if (str.equals(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 79833656:
                    if (str.equals("TITLE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 428414940:
                    if (str.equals("DESCRIPTION")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_CTA;
                    break;
                case 1:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_TITLE;
                    break;
                case 2:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_DESCRIPTION;
                    break;
                case 3:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_RATING;
                    break;
                case 4:
                    if (!isVideoAd()) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_IMAGE;
                        break;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_VIDEO;
                        break;
                    }
                case 5:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ICON;
                    break;
                case 6:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ROOT;
                    break;
                default:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    break;
            }
            com.fyber.inneractive.sdk.flow.nativead.i iVar = (com.fyber.inneractive.sdk.flow.nativead.i) this.t.get(str);
            com.fyber.inneractive.sdk.flow.nativead.j jVar = this.u;
            if (iVar == null) {
                iVar = jVar.f3716a;
            }
            if (iVar == null) {
                jVar.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%s : No active link (no root and object related links), origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.d, gVar);
            } else {
                com.fyber.inneractive.sdk.flow.nativead.p pVar = jVar.c;
                pVar.getClass();
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar, iVar, false, gVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(com.fyber.inneractive.sdk.external.MediaView mediaView) {
        this.n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        return (this.m == null && this.n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.t0 t0Var = this.s;
        if (t0Var != null) {
            t0Var.destroy();
            this.s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.u;
        if (jVar != null) {
            jVar.b = null;
            jVar.c.f3722a = null;
            this.u = null;
        }
        if (this.v != null) {
            this.v = null;
        }
        java.util.Iterator it = this.q.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        java.util.Iterator it2 = this.q.iterator();
        while (it2.hasNext()) {
            android.view.View view2 = (android.view.View) it2.next();
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.r = null;
        this.q.clear();
        this.k = null;
        this.o = null;
        this.l = null;
        this.g = null;
        this.m = null;
        this.n = null;
        this.h = null;
        this.j = null;
        this.i = null;
        this.p = null;
        this.t.clear();
        this.w.clear();
        this.x.clear();
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.String getAdCallToAction() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.String getAdDescription() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.String getAdTitle() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.String getAdvertiserName() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final android.net.Uri getAppIcon() {
        return this.l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.Float getMediaAspectRatio() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final com.fyber.inneractive.sdk.external.MediaView getMediaView() {
        return this.n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.String getPrice() {
        return this.k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final java.lang.Float getRating() {
        return this.o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(android.view.ViewGroup viewGroup, com.fyber.inneractive.sdk.external.MediaView mediaView, android.widget.ImageView imageView, java.util.Collection collection) {
        this.q.clear();
        if (collection != null) {
            this.q.addAll(collection);
        }
        if (viewGroup != null && !this.q.contains(viewGroup)) {
            this.q.add(viewGroup);
        }
        if (mediaView != null && !this.q.contains(mediaView)) {
            this.q.add(mediaView);
        }
        if (imageView != null && !this.q.contains(imageView)) {
            this.q.add(imageView);
        }
        com.fyber.inneractive.sdk.external.MediaView mediaView2 = this.n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.r = new com.fyber.inneractive.sdk.flow.nativead.r(this.n.getContext(), this);
        java.util.Iterator it = this.q.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view != null) {
                view.setOnTouchListener(this.r);
            }
        }
    }
}
