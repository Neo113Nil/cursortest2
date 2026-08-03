package com.ironsource;

/* renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3339w2 extends com.ironsource.X7.a<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.w2$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6794a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener c;

        a(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f6794a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3339w2.this.a(this.f6794a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.f6794a, this.b);
        }
    }

    /* renamed from: com.ironsource.w2$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6795a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        b(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f6795a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3339w2.this.a(this.f6795a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.f6795a);
        }
    }

    /* renamed from: com.ironsource.w2$c */
    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6796a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        c(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f6796a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3339w2.this.a(this.f6796a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.f6796a);
        }
    }

    /* renamed from: com.ironsource.w2$d */
    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6797a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        d(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f6797a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3339w2.this.a(this.f6797a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.f6797a);
        }
    }

    /* renamed from: com.ironsource.w2$e */
    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6798a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        e(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f6798a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3339w2.this.a(this.f6798a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.f6798a);
        }
    }

    public void a(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener a2 = a();
        a(new com.ironsource.C3339w2.a(str, ironSourceError, a2), a2 != null);
    }

    public void b(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener a2 = a();
        a(new com.ironsource.C3339w2.e(str, a2), a2 != null);
    }

    public void c(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener a2 = a();
        a(new com.ironsource.C3339w2.b(str, a2), a2 != null);
    }

    public void d(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener a2 = a();
        a(new com.ironsource.C3339w2.c(str, a2), a2 != null);
    }

    public void a(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener a2 = a();
        a(new com.ironsource.C3339w2.d(str, a2), a2 != null);
    }
}
