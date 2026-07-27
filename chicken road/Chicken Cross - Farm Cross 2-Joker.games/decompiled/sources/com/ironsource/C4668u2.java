package com.ironsource;

import com.ironsource.V7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4668u2 extends V7.a<ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.u2$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8689a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyBannerListener c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f8689a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4668u2.this.a(this.f8689a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.f8689a, this.b);
        }
    }

    /* renamed from: com.ironsource.u2$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8690a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f8690a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4668u2.this.a(this.f8690a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.f8690a);
        }
    }

    /* renamed from: com.ironsource.u2$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8691a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f8691a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4668u2.this.a(this.f8691a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.f8691a);
        }
    }

    /* renamed from: com.ironsource.u2$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8692a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f8692a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4668u2.this.a(this.f8692a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.f8692a);
        }
    }

    /* renamed from: com.ironsource.u2$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8693a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f8693a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4668u2.this.a(this.f8693a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.f8693a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener a2 = a();
        a(new a(str, ironSourceError, a2), a2 != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new e(str, a2), a2 != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new b(str, a2), a2 != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new c(str, a2), a2 != null);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new d(str, a2), a2 != null);
    }
}
