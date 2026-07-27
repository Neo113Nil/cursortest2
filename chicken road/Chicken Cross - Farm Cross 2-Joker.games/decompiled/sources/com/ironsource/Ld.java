package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes6.dex */
public class Ld extends C4472j3 {
    private static final Ld d = new Ld();
    private InterfaceC4570ob b = null;
    private InterfaceC4570ob c = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7739a;
        final /* synthetic */ AdInfo b;

        a(boolean z, AdInfo adInfo) {
            this.f7739a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                if (this.f7739a) {
                    ((InterfaceC4588pb) interfaceC4570ob).d(ld.a(this.b));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Ld.this.a(this.b));
                } else {
                    ((InterfaceC4588pb) interfaceC4570ob).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4411fd f7740a;
        final /* synthetic */ AdInfo b;

        b(C4411fd c4411fd, AdInfo adInfo) {
            this.f7740a = c4411fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.b(this.f7740a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f7740a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4411fd f7741a;
        final /* synthetic */ AdInfo b;

        c(C4411fd c4411fd, AdInfo adInfo) {
            this.f7741a = c4411fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.b(this.f7741a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f7741a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f7742a;
        final /* synthetic */ AdInfo b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f7742a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.a(this.f7742a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Ld.this.a(this.b) + ", error = " + this.f7742a.getErrorMessage());
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f7743a;
        final /* synthetic */ AdInfo b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f7743a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.a(this.f7743a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Ld.this.a(this.b) + ", error = " + this.f7743a.getErrorMessage());
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4411fd f7744a;
        final /* synthetic */ AdInfo b;

        f(C4411fd c4411fd, AdInfo adInfo) {
            this.f7744a = c4411fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.a(this.f7744a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f7744a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4411fd f7745a;
        final /* synthetic */ AdInfo b;

        g(C4411fd c4411fd, AdInfo adInfo) {
            this.f7745a = c4411fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.a(this.f7745a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f7745a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f7746a;

        h(AdInfo adInfo) {
            this.f7746a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                ((InterfaceC4606qb) interfaceC4570ob).a(ld.a(this.f7746a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Ld.this.a(this.f7746a));
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f7747a;

        i(AdInfo adInfo) {
            this.f7747a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                ((InterfaceC4606qb) interfaceC4570ob).a(ld.a(this.f7747a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Ld.this.a(this.f7747a));
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f7748a;

        j(IronSourceError ironSourceError) {
            this.f7748a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4570ob interfaceC4570ob = Ld.this.c;
            if (interfaceC4570ob != null) {
                ((InterfaceC4606qb) interfaceC4570ob).a(this.f7748a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f7748a.getErrorMessage());
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f7749a;

        k(IronSourceError ironSourceError) {
            this.f7749a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4570ob interfaceC4570ob = Ld.this.b;
            if (interfaceC4570ob != null) {
                ((InterfaceC4606qb) interfaceC4570ob).a(this.f7749a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f7749a.getErrorMessage());
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f7750a;

        l(AdInfo adInfo) {
            this.f7750a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.c(ld.a(this.f7750a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Ld.this.a(this.f7750a));
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f7751a;

        m(AdInfo adInfo) {
            this.f7751a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.c(ld.a(this.f7751a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Ld.this.a(this.f7751a));
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f7752a;

        n(AdInfo adInfo) {
            this.f7752a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.b(ld.a(this.f7752a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Ld.this.a(this.f7752a));
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f7753a;

        o(AdInfo adInfo) {
            this.f7753a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.b;
            if (interfaceC4570ob != null) {
                interfaceC4570ob.b(ld.a(this.f7753a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Ld.this.a(this.f7753a));
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7754a;
        final /* synthetic */ AdInfo b;

        p(boolean z, AdInfo adInfo) {
            this.f7754a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4570ob interfaceC4570ob = ld.c;
            if (interfaceC4570ob != null) {
                if (this.f7754a) {
                    ((InterfaceC4588pb) interfaceC4570ob).d(ld.a(this.b));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Ld.this.a(this.b));
                } else {
                    ((InterfaceC4588pb) interfaceC4570ob).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            }
        }
    }

    private Ld() {
    }

    public void b() {
    }

    public void c() {
    }

    public static Ld a() {
        return d;
    }

    public void b(InterfaceC4570ob interfaceC4570ob) {
        this.c = interfaceC4570ob;
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
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4570ob interfaceC4570ob = this.b;
        if (interfaceC4570ob == null || !(interfaceC4570ob instanceof InterfaceC4606qb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC4570ob interfaceC4570ob) {
        this.b = interfaceC4570ob;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4570ob interfaceC4570ob = this.b;
        if (interfaceC4570ob == null || !(interfaceC4570ob instanceof InterfaceC4606qb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(C4411fd c4411fd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4411fd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4411fd, adInfo));
        }
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC4570ob interfaceC4570ob = this.b;
        if (interfaceC4570ob == null || !(interfaceC4570ob instanceof InterfaceC4588pb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C4411fd c4411fd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4411fd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4411fd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
