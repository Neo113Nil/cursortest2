package com.ironsource;

/* loaded from: classes5.dex */
public interface O4 {

    public interface a {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout a(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize);

        void a(android.app.Activity activity, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str);

        void e(java.lang.String str);
    }

    public interface b {
        void a(android.app.Activity activity, java.lang.String str);

        void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        void b(android.app.Activity activity, java.lang.String str, java.lang.String str2);

        void c(java.lang.String str);

        boolean d(java.lang.String str);
    }

    public interface c {
        void a(android.app.Activity activity, java.lang.String str, java.lang.String str2);

        void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        void a(java.lang.String str);

        void b(android.app.Activity activity, java.lang.String str);

        boolean h(java.lang.String str);
    }

    java.lang.String a(android.content.Context context);
}
