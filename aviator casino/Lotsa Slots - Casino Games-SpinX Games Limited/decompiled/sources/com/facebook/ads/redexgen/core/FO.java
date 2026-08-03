package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class FO extends com.facebook.ads.redexgen.core.AbstractC0984Qq<com.facebook.ads.redexgen.core.FB> {
    public int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.C7M A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A06;
    public final java.util.List<java.lang.String> A08;
    public final android.app.Application.ActivityLifecycleCallbacks A02 = new android.app.Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            com.facebook.ads.redexgen.core.C1636gi c1636gi;
            android.os.Handler handler;
            java.lang.Runnable runnable;
            c1636gi = com.facebook.ads.redexgen.core.FO.this.A05;
            if (activity == c1636gi.A0E()) {
                handler = com.facebook.ads.redexgen.core.FO.this.A03;
                runnable = com.facebook.ads.redexgen.core.FO.this.A07;
                handler.removeCallbacks(runnable);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            android.os.Handler handler;
            java.lang.Runnable runnable;
            handler = com.facebook.ads.redexgen.core.FO.this.A03;
            runnable = com.facebook.ads.redexgen.core.FO.this.A07;
            handler.post(runnable);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
        }
    };
    public final android.os.Handler A03 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable A07 = new com.facebook.ads.redexgen.core.RunnableC1501eX(this);

    public FO(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.List<java.lang.String> screenshotUrls, int i, com.facebook.ads.redexgen.core.C7M c7m, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, int i2) {
        this.A08 = screenshotUrls;
        this.A01 = i;
        this.A05 = c1636gi;
        this.A04 = c7m;
        this.A06 = viewOnClickListenerC0834Kr;
        this.A00 = i2;
        this.A03.post(this.A07);
        if (android.os.Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.FB A0F(android.view.ViewGroup viewGroup, int i) {
        com.facebook.ads.redexgen.core.F9 f9 = new com.facebook.ads.redexgen.core.F9(this.A05);
        if (com.facebook.ads.redexgen.core.C1086Up.A1D(this.A05)) {
            f9.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1502eY(this));
        }
        return new com.facebook.ads.redexgen.core.FB(f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(com.facebook.ads.redexgen.core.FB fb, int i) {
        java.lang.String str = this.A08.get(i % this.A08.size());
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        fb.A0p().setLayoutParams(marginLayoutParams);
        fb.A0p().setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    public final void A0L(com.facebook.ads.redexgen.core.C7M c7m) {
        super.A0L(c7m);
        this.A03.removeCallbacks(this.A07);
        if (android.os.Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0O(int i) {
        this.A00 = i;
    }
}
