package com.ironsource;

/* loaded from: classes5.dex */
public final class Uf {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Pf f6002a;

    public static final class c implements com.ironsource.Aa {
        c() {
        }

        @Override // com.ironsource.Aa
        public void b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.b, com.unity3d.mediation.LevelPlay.AdFormat.BANNER, com.ironsource.Yf.f6105a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Aa
        public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.f, com.unity3d.mediation.LevelPlay.AdFormat.BANNER, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void e(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.j, com.unity3d.mediation.LevelPlay.AdFormat.BANNER, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void f(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.m, com.unity3d.mediation.LevelPlay.AdFormat.BANNER, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void g(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.k, com.unity3d.mediation.LevelPlay.AdFormat.BANNER, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.Aa
        public void h(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.l, com.unity3d.mediation.LevelPlay.AdFormat.BANNER, com.ironsource.Yf.f6105a.a(adInfo));
        }
    }

    public Uf(com.ironsource.Pf javaScriptEvaluator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f6002a = javaScriptEvaluator;
    }

    private final void b() {
        com.ironsource.Tf tf = com.ironsource.Tf.f5986a;
        tf.a((com.ironsource.InterfaceC3026eb) null);
        tf.a((com.ironsource.InterfaceC3241qb) null);
        tf.a((com.ironsource.Aa) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.b().c(false);
        com.ironsource.Tf.f5986a.e();
    }

    public final void d() {
        com.ironsource.Tf tf = com.ironsource.Tf.f5986a;
        tf.a(new com.ironsource.Uf.a());
        tf.a(new com.ironsource.Uf.b());
        tf.a(new com.ironsource.Uf.c());
    }

    public final void a() {
        b();
        c();
    }

    public static final class a implements com.ironsource.InterfaceC3026eb {
        a() {
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.f6030a, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.b, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void c(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.c, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.f, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void e(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.d, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.e, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC3026eb
        public void b(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.g, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(adInfo));
        }
    }

    public static final class b implements com.ironsource.InterfaceC3276sb, com.ironsource.InterfaceC3258rb {
        b() {
        }

        @Override // com.ironsource.InterfaceC3276sb
        public void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.f6030a, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3276sb
        public void b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.b, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC3241qb
        public void c(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.c, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3258rb
        public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.h, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3258rb
        public void a() {
            com.ironsource.Uf.this.a(com.ironsource.Vf.n, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(new java.lang.Object[0]));
        }

        @Override // com.ironsource.InterfaceC3241qb
        public void b(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.i, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(com.ironsource.Tf.f5986a.a(c3064gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC3241qb
        public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.e, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC3241qb
        public void a(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.f, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(com.ironsource.Tf.f5986a.a(c3064gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC3241qb
        public void b(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.ironsource.Uf.this.a(com.ironsource.Vf.g, com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.lang.String str, com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.util.List<? extends java.lang.Object> list) {
        this.f6002a.a(str, adFormat, list);
    }
}
