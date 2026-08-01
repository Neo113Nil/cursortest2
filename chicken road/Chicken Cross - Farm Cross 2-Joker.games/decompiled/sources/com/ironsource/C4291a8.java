package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4291a8 extends C4472j3 {
    private static final C4291a8 d = new C4291a8();
    private InterfaceC4355cb b = null;
    private InterfaceC4355cb c = null;

    /* renamed from: com.ironsource.a8$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8062a;

        a(AdInfo adInfo) {
            this.f8062a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.e(c4291a8.a(this.f8062a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4291a8.this.a(this.f8062a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f8063a;
        final /* synthetic */ AdInfo b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f8063a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.a(this.f8063a, c4291a8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4291a8.this.a(this.b) + ", error = " + this.f8063a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.a8$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f8064a;
        final /* synthetic */ AdInfo b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f8064a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.a(this.f8064a, c4291a8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4291a8.this.a(this.b) + ", error = " + this.f8064a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.a8$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8065a;

        d(AdInfo adInfo) {
            this.f8065a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.d(c4291a8.a(this.f8065a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4291a8.this.a(this.f8065a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8066a;

        e(AdInfo adInfo) {
            this.f8066a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.d(c4291a8.a(this.f8066a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4291a8.this.a(this.f8066a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$f */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8067a;

        f(AdInfo adInfo) {
            this.f8067a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.a(c4291a8.a(this.f8067a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4291a8.this.a(this.f8067a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$g */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8068a;

        g(AdInfo adInfo) {
            this.f8068a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.a(c4291a8.a(this.f8068a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4291a8.this.a(this.f8068a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f8069a;

        h(IronSourceError ironSourceError) {
            this.f8069a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4355cb interfaceC4355cb = C4291a8.this.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.a(this.f8069a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f8069a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.a8$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f8070a;

        i(IronSourceError ironSourceError) {
            this.f8070a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4355cb interfaceC4355cb = C4291a8.this.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.a(this.f8070a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f8070a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.a8$j */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8071a;

        j(AdInfo adInfo) {
            this.f8071a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.c(c4291a8.a(this.f8071a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4291a8.this.a(this.f8071a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$k */
    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8072a;

        k(AdInfo adInfo) {
            this.f8072a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.c(c4291a8.a(this.f8072a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4291a8.this.a(this.f8072a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$l */
    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8073a;

        l(AdInfo adInfo) {
            this.f8073a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.b(c4291a8.a(this.f8073a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4291a8.this.a(this.f8073a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$m */
    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8074a;

        m(AdInfo adInfo) {
            this.f8074a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.b;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.b(c4291a8.a(this.f8074a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4291a8.this.a(this.f8074a));
            }
        }
    }

    /* renamed from: com.ironsource.a8$n */
    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f8075a;

        n(AdInfo adInfo) {
            this.f8075a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4291a8 c4291a8 = C4291a8.this;
            InterfaceC4355cb interfaceC4355cb = c4291a8.c;
            if (interfaceC4355cb != null) {
                interfaceC4355cb.e(c4291a8.a(this.f8075a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4291a8.this.a(this.f8075a));
            }
        }
    }

    private C4291a8() {
    }

    public static synchronized C4291a8 a() {
        C4291a8 c4291a8;
        synchronized (C4291a8.class) {
            c4291a8 = d;
        }
        return c4291a8;
    }

    public synchronized void b(InterfaceC4355cb interfaceC4355cb) {
        this.c = interfaceC4355cb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC4355cb interfaceC4355cb) {
        this.b = interfaceC4355cb;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
