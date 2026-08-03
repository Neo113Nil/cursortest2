package com.ironsource;

/* loaded from: classes5.dex */
public class Y7 extends com.ironsource.X7.a<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> implements com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener {

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6092a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        a(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6092a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6092a, "onRewardedVideoAdLoadSuccess()");
            this.b.onRewardedVideoAdLoadSuccess(this.f6092a);
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6093a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener c;

        b(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6093a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6093a, "onRewardedVideoAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdLoadFailed(this.f6093a, this.b);
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6094a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        c(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6094a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6094a, "onRewardedVideoAdOpened()");
            this.b.onRewardedVideoAdOpened(this.f6094a);
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6095a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener c;

        d(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6095a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6095a, "onRewardedVideoAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdShowFailed(this.f6095a, this.b);
        }
    }

    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6096a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        e(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6096a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6096a, "onRewardedVideoAdClicked()");
            this.b.onRewardedVideoAdClicked(this.f6096a);
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6097a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        f(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6097a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6097a, "onRewardedVideoAdRewarded()");
            this.b.onRewardedVideoAdRewarded(this.f6097a);
        }
    }

    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6098a;
        final /* synthetic */ com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        g(java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f6098a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Y7.this.a(this.f6098a, "onRewardedVideoAdClosed()");
            this.b.onRewardedVideoAdClosed(this.f6098a);
        }
    }

    Y7(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.e(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.g(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.b(str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.a(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.c(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.f(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = a();
        a(new com.ironsource.Y7.d(str, ironSourceError, a2), a2 != null);
    }

    Y7() {
    }
}
