package com.ironsource;

/* loaded from: classes5.dex */
public class Md extends com.ironsource.C3161m3 {
    private static final com.ironsource.Md d = new com.ironsource.Md();
    private com.ironsource.InterfaceC3241qb b = null;
    private com.ironsource.InterfaceC3241qb c = null;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5828a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        a(boolean z, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5828a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                if (!this.f5828a) {
                    ((com.ironsource.InterfaceC3258rb) interfaceC3241qb).a();
                    com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((com.ironsource.InterfaceC3258rb) interfaceC3241qb).d(md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdAvailable() adInfo = " + com.ironsource.Md.this.a(this.b));
            }
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3064gd f5829a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        b(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5829a = c3064gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.b(this.f5829a, md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f5829a + ", adInfo = " + com.ironsource.Md.this.a(this.b));
            }
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3064gd f5830a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        c(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5830a = c3064gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.b(this.f5830a, md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f5830a + ", adInfo = " + com.ironsource.Md.this.a(this.b));
            }
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f5831a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        d(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5831a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.a(this.f5831a, md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.ironsource.Md.this.a(this.b) + ", error = " + this.f5831a.getErrorMessage());
            }
        }
    }

    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f5832a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        e(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5832a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.a(this.f5832a, md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.ironsource.Md.this.a(this.b) + ", error = " + this.f5832a.getErrorMessage());
            }
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3064gd f5833a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        f(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5833a = c3064gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.a(this.f5833a, md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() placement = " + this.f5833a + ", adInfo = " + com.ironsource.Md.this.a(this.b));
            }
        }
    }

    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3064gd f5834a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        g(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5834a = c3064gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.a(this.f5834a, md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() placement = " + this.f5834a + ", adInfo = " + com.ironsource.Md.this.a(this.b));
            }
        }
    }

    class h implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f5835a;

        h(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5835a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                ((com.ironsource.InterfaceC3276sb) interfaceC3241qb).a(md.a(this.f5835a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.ironsource.Md.this.a(this.f5835a));
            }
        }
    }

    class i implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f5836a;

        i(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5836a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                ((com.ironsource.InterfaceC3276sb) interfaceC3241qb).a(md.a(this.f5836a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.ironsource.Md.this.a(this.f5836a));
            }
        }
    }

    class j implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f5837a;

        j(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f5837a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.InterfaceC3241qb interfaceC3241qb = com.ironsource.Md.this.c;
            if (interfaceC3241qb != null) {
                ((com.ironsource.InterfaceC3276sb) interfaceC3241qb).b(this.f5837a);
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f5837a.getErrorMessage());
            }
        }
    }

    class k implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f5838a;

        k(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f5838a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.InterfaceC3241qb interfaceC3241qb = com.ironsource.Md.this.b;
            if (interfaceC3241qb != null) {
                ((com.ironsource.InterfaceC3276sb) interfaceC3241qb).b(this.f5838a);
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f5838a.getErrorMessage());
            }
        }
    }

    class l implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f5839a;

        l(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5839a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.c(md.a(this.f5839a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.ironsource.Md.this.a(this.f5839a));
            }
        }
    }

    class m implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f5840a;

        m(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5840a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.c(md.a(this.f5840a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.ironsource.Md.this.a(this.f5840a));
            }
        }
    }

    class n implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f5841a;

        n(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5841a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.b(md.a(this.f5841a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.ironsource.Md.this.a(this.f5841a));
            }
        }
    }

    class o implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f5842a;

        o(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5842a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.b;
            if (interfaceC3241qb != null) {
                interfaceC3241qb.b(md.a(this.f5842a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.ironsource.Md.this.a(this.f5842a));
            }
        }
    }

    class p implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5843a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        p(boolean z, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f5843a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Md md = com.ironsource.Md.this;
            com.ironsource.InterfaceC3241qb interfaceC3241qb = md.c;
            if (interfaceC3241qb != null) {
                if (!this.f5843a) {
                    ((com.ironsource.InterfaceC3258rb) interfaceC3241qb).a();
                    com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((com.ironsource.InterfaceC3258rb) interfaceC3241qb).d(md.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdAvailable() adInfo = " + com.ironsource.Md.this.a(this.b));
            }
        }
    }

    private Md() {
    }

    public void b() {
    }

    public void c() {
    }

    public static com.ironsource.Md a() {
        return d;
    }

    public void b(com.ironsource.InterfaceC3241qb interfaceC3241qb) {
        this.c = interfaceC3241qb;
    }

    public void c(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.l(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.m(adInfo));
        }
    }

    public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.h(adInfo));
            return;
        }
        com.ironsource.InterfaceC3241qb interfaceC3241qb = this.b;
        if (interfaceC3241qb == null || !(interfaceC3241qb instanceof com.ironsource.InterfaceC3276sb)) {
            return;
        }
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.i(adInfo));
    }

    public void a(com.ironsource.InterfaceC3241qb interfaceC3241qb) {
        this.b = interfaceC3241qb;
    }

    public void b(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.n(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.o(adInfo));
        }
    }

    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.j(ironSourceError));
            return;
        }
        com.ironsource.InterfaceC3241qb interfaceC3241qb = this.b;
        if (interfaceC3241qb == null || !(interfaceC3241qb instanceof com.ironsource.InterfaceC3276sb)) {
            return;
        }
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.k(ironSourceError));
    }

    public void b(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.b(c3064gd, adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.c(c3064gd, adInfo));
        }
    }

    public void a(boolean z, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.p(z, adInfo));
            return;
        }
        com.ironsource.InterfaceC3241qb interfaceC3241qb = this.b;
        if (interfaceC3241qb == null || !(interfaceC3241qb instanceof com.ironsource.InterfaceC3258rb)) {
            return;
        }
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.a(z, adInfo));
    }

    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.d(ironSourceError, adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.e(ironSourceError, adInfo));
        }
    }

    public void a(com.ironsource.C3064gd c3064gd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.f(c3064gd, adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.Md.g(c3064gd, adInfo));
        }
    }

    private void a(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
