package com.ironsource;

/* renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3357x2 extends com.ironsource.C3161m3 {
    private static final com.ironsource.C3357x2 d = new com.ironsource.C3357x2();
    private com.ironsource.Aa b = null;
    private com.ironsource.Aa c = null;

    /* renamed from: com.ironsource.x2$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6814a;

        a(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6814a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.b;
            if (aa != null) {
                aa.g(c3357x2.a(this.f6814a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + com.ironsource.C3357x2.this.a(this.f6814a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6815a;

        b(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6815a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.c;
            if (aa != null) {
                aa.d(c3357x2.a(this.f6815a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.ironsource.C3357x2.this.a(this.f6815a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$c */
    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6816a;

        c(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6816a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.b;
            if (aa != null) {
                aa.d(c3357x2.a(this.f6816a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.ironsource.C3357x2.this.a(this.f6816a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$d */
    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6817a;

        d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6817a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.c;
            if (aa != null) {
                aa.e(c3357x2.a(this.f6817a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoaded() adInfo = " + com.ironsource.C3357x2.this.a(this.f6817a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$e */
    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6818a;

        e(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6818a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.b;
            if (aa != null) {
                aa.e(c3357x2.a(this.f6818a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoaded() adInfo = " + com.ironsource.C3357x2.this.a(this.f6818a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$f */
    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f6819a;

        f(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f6819a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Aa aa = com.ironsource.C3357x2.this.c;
            if (aa != null) {
                aa.b(this.f6819a);
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f6819a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.x2$g */
    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError f6820a;

        g(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f6820a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Aa aa = com.ironsource.C3357x2.this.b;
            if (aa != null) {
                aa.b(this.f6820a);
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f6820a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.x2$h */
    class h implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6821a;

        h(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6821a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.c;
            if (aa != null) {
                aa.h(c3357x2.a(this.f6821a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + com.ironsource.C3357x2.this.a(this.f6821a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$i */
    class i implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6822a;

        i(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6822a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.b;
            if (aa != null) {
                aa.h(c3357x2.a(this.f6822a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + com.ironsource.C3357x2.this.a(this.f6822a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$j */
    class j implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6823a;

        j(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6823a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.c;
            if (aa != null) {
                aa.f(c3357x2.a(this.f6823a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + com.ironsource.C3357x2.this.a(this.f6823a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$k */
    class k implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6824a;

        k(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6824a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.b;
            if (aa != null) {
                aa.f(c3357x2.a(this.f6824a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + com.ironsource.C3357x2.this.a(this.f6824a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$l */
    class l implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f6825a;

        l(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f6825a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3357x2 c3357x2 = com.ironsource.C3357x2.this;
            com.ironsource.Aa aa = c3357x2.c;
            if (aa != null) {
                aa.g(c3357x2.a(this.f6825a));
                com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + com.ironsource.C3357x2.this.a(this.f6825a));
            }
        }
    }

    private C3357x2() {
    }

    public static com.ironsource.C3357x2 a() {
        return d;
    }

    public void b(com.ironsource.Aa aa) {
        this.c = aa;
    }

    public void c(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.l(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.a(adInfo));
        }
    }

    public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.d(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.e(adInfo));
        }
    }

    public void e(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.j(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.k(adInfo));
        }
    }

    public void f(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.h(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.i(adInfo));
        }
    }

    public void a(com.ironsource.Aa aa) {
        this.b = aa;
    }

    public com.ironsource.Aa b() {
        return this.b;
    }

    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.f(ironSourceError));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.g(ironSourceError));
        }
    }

    public void b(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.b(adInfo));
        } else if (this.b != null) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3357x2.c(adInfo));
        }
    }
}
