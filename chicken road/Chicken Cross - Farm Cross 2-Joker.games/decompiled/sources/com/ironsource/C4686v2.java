package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4686v2 extends C4472j3 {
    private static final C4686v2 d = new C4686v2();
    private Aa b = null;
    private Aa c = null;

    /* renamed from: com.ironsource.v2$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8715a;

        a(AdInfo adInfo) {
            this.f8715a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.b;
            if (aa != null) {
                aa.g(c4686v2.a(this.f8715a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4686v2.this.a(this.f8715a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8716a;

        b(AdInfo adInfo) {
            this.f8716a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.c;
            if (aa != null) {
                aa.d(c4686v2.a(this.f8716a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4686v2.this.a(this.f8716a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8717a;

        c(AdInfo adInfo) {
            this.f8717a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.b;
            if (aa != null) {
                aa.d(c4686v2.a(this.f8717a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4686v2.this.a(this.f8717a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8718a;

        d(AdInfo adInfo) {
            this.f8718a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.c;
            if (aa != null) {
                aa.e(c4686v2.a(this.f8718a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4686v2.this.a(this.f8718a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8719a;

        e(AdInfo adInfo) {
            this.f8719a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.b;
            if (aa != null) {
                aa.e(c4686v2.a(this.f8719a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4686v2.this.a(this.f8719a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$f */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f8720a;

        f(IronSourceError ironSourceError) {
            this.f8720a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Aa aa = C4686v2.this.c;
            if (aa != null) {
                aa.a(this.f8720a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f8720a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.v2$g */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f8721a;

        g(IronSourceError ironSourceError) {
            this.f8721a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Aa aa = C4686v2.this.b;
            if (aa != null) {
                aa.a(this.f8721a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f8721a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.v2$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8722a;

        h(AdInfo adInfo) {
            this.f8722a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.c;
            if (aa != null) {
                aa.h(c4686v2.a(this.f8722a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4686v2.this.a(this.f8722a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8723a;

        i(AdInfo adInfo) {
            this.f8723a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.b;
            if (aa != null) {
                aa.h(c4686v2.a(this.f8723a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4686v2.this.a(this.f8723a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$j */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8724a;

        j(AdInfo adInfo) {
            this.f8724a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.c;
            if (aa != null) {
                aa.f(c4686v2.a(this.f8724a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4686v2.this.a(this.f8724a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$k */
    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8725a;

        k(AdInfo adInfo) {
            this.f8725a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.b;
            if (aa != null) {
                aa.f(c4686v2.a(this.f8725a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4686v2.this.a(this.f8725a));
            }
        }
    }

    /* renamed from: com.ironsource.v2$l */
    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8726a;

        l(AdInfo adInfo) {
            this.f8726a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4686v2 c4686v2 = C4686v2.this;
            Aa aa = c4686v2.c;
            if (aa != null) {
                aa.g(c4686v2.a(this.f8726a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4686v2.this.a(this.f8726a));
            }
        }
    }

    private C4686v2() {
    }

    public static C4686v2 a() {
        return d;
    }

    public void b(Aa aa) {
        this.c = aa;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(Aa aa) {
        this.b = aa;
    }

    public Aa b() {
        return this.b;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
