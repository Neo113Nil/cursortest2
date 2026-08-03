package com.ironsource;

/* loaded from: classes5.dex */
public class V7 extends com.ironsource.X7.a<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> implements com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener {

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6017a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        a(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f6017a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.V7.this.a(this.f6017a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.f6017a);
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6018a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener c;

        b(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f6018a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.V7.this.a(this.f6018a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.f6018a, this.b);
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6019a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        c(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f6019a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.V7.this.a(this.f6019a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.f6019a);
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6020a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener c;

        d(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f6020a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.V7.this.a(this.f6020a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.f6020a, this.b);
        }
    }

    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6021a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        e(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f6021a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.V7.this.a(this.f6021a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.f6021a);
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6022a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        f(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f6022a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.V7.this.a(this.f6022a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.f6022a);
        }
    }

    V7(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = a();
        a(new com.ironsource.V7.e(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = a();
        a(new com.ironsource.V7.f(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = a();
        a(new com.ironsource.V7.b(str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = a();
        a(new com.ironsource.V7.c(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = a();
        a(new com.ironsource.V7.a(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = a();
        a(new com.ironsource.V7.d(str, ironSourceError, a2), a2 != null);
    }

    V7() {
    }
}
