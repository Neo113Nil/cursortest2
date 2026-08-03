package com.ironsource;

/* renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2987c8 extends com.ironsource.C3161m3 {
    private static final com.ironsource.C2987c8 d = new com.ironsource.C2987c8();
    private com.ironsource.InterfaceC3026eb b = null;
    private com.ironsource.InterfaceC3026eb c = null;

    /* renamed from: com.ironsource.c8$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6172a;

        a(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6172a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.e(c2987c8.a(this.f6172a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + com.ironsource.C2987c8.this.a(this.f6172a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f6173a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6173a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.a(this.f6173a, c2987c8.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.ironsource.C2987c8.this.a(this.b) + ", error = " + this.f6173a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$c */
    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f6174a;
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo b;

        c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6174a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.a(this.f6174a, c2987c8.a(this.b));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.ironsource.C2987c8.this.a(this.b) + ", error = " + this.f6174a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$d */
    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6175a;

        d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6175a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.d(c2987c8.a(this.f6175a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.ironsource.C2987c8.this.a(this.f6175a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$e */
    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6176a;

        e(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6176a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.d(c2987c8.a(this.f6176a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.ironsource.C2987c8.this.a(this.f6176a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$f */
    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6177a;

        f(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6177a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.a(c2987c8.a(this.f6177a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.ironsource.C2987c8.this.a(this.f6177a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$g */
    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6178a;

        g(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6178a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.a(c2987c8.a(this.f6178a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.ironsource.C2987c8.this.a(this.f6178a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$h */
    class h implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f6179a;

        h(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f6179a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.InterfaceC3026eb interfaceC3026eb = com.ironsource.C2987c8.this.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.b(this.f6179a);
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f6179a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$i */
    class i implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f6180a;

        i(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f6180a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.InterfaceC3026eb interfaceC3026eb = com.ironsource.C2987c8.this.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.b(this.f6180a);
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f6180a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$j */
    class j implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6181a;

        j(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6181a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.c(c2987c8.a(this.f6181a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.ironsource.C2987c8.this.a(this.f6181a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$k */
    class k implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6182a;

        k(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6182a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.c(c2987c8.a(this.f6182a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.ironsource.C2987c8.this.a(this.f6182a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$l */
    class l implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6183a;

        l(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6183a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.b(c2987c8.a(this.f6183a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.ironsource.C2987c8.this.a(this.f6183a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$m */
    class m implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6184a;

        m(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6184a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.b;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.b(c2987c8.a(this.f6184a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.ironsource.C2987c8.this.a(this.f6184a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$n */
    class n implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6185a;

        n(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6185a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2987c8 c2987c8 = com.ironsource.C2987c8.this;
            com.ironsource.InterfaceC3026eb interfaceC3026eb = c2987c8.c;
            if (interfaceC3026eb != null) {
                interfaceC3026eb.e(c2987c8.a(this.f6185a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + com.ironsource.C2987c8.this.a(this.f6185a));
            }
        }
    }

    private C2987c8() {
    }

    public static synchronized com.ironsource.C2987c8 a() {
        com.ironsource.C2987c8 c2987c8;
        synchronized (com.ironsource.C2987c8.class) {
            c2987c8 = d;
        }
        return c2987c8;
    }

    public synchronized void b(com.ironsource.InterfaceC3026eb interfaceC3026eb) {
        this.c = interfaceC3026eb;
    }

    public void c(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.l(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.m(adInfo));
        }
    }

    public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.j(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.k(adInfo));
        }
    }

    public void e(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.f(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.g(adInfo));
        }
    }

    public void f(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.n(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.a(adInfo));
        }
    }

    public synchronized void a(com.ironsource.InterfaceC3026eb interfaceC3026eb) {
        this.b = interfaceC3026eb;
    }

    public void b(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.d(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.e(adInfo));
        }
    }

    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.h(ironSourceError));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.i(ironSourceError));
        }
    }

    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.b(ironSourceError, adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C2987c8.c(ironSourceError, adInfo));
        }
    }

    private void a(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
