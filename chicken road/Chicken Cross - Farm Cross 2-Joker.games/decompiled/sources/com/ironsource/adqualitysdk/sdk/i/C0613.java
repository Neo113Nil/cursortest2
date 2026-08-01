package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0613 extends AppOpenAd.AppOpenAdLoadCallback implements InterfaceC0997 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f1587;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0807 f1588;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AppOpenAd.AppOpenAdLoadCallback f1589;

    public C0613(C0588 c0588, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, C0807 c0807) {
        this.f1587 = c0588;
        this.f1589 = appOpenAdLoadCallback;
        this.f1588 = c0807;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f1587.m5529(this, this.f1588, StringFog.decrypt("e9KXxsKKg6Re7ojo1qyMiVbAhurZwYKLe8ah6NuDiIFuzavm04s=\n", "OqLnibLv7eU=\n"), loadAdError);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1589;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(loadAdError);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        AppOpenAd appOpenAd2 = appOpenAd;
        this.f1587.m5529(this, this.f1588, StringFog.decrypt("A6numEFNmgImlfG2VWuVLy67/7RaBpstA73SuFBMkSc=\n", "Qtme1zEo9EM=\n"), appOpenAd2);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1589;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(appOpenAd2);
        }
    }

    public final void onAppOpenAdFailedToLoad(int i) {
        this.f1587.m5529(this, this.f1588, StringFog.decrypt("Km+W2keqMqcPU4n0U4w9igd9h/Zc4TOIKm+W2keqMqcPWYf8W6o4sgRTifRT\n", "ax/mlTfPXOY=\n"), Integer.valueOf(i));
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1589;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    public final void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
        this.f1587.m5529(this, this.f1588, StringFog.decrypt("4TA0EfAjntDEDCs/5AWR/cwiJT3raJ//4TA0EfAjntDEDCs/5COU\n", "oEBEXoBG8JE=\n"), appOpenAd);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1589;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(appOpenAd);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this.f1589;
    }

    public final void onAppOpenAdFailedToLoad(LoadAdError loadAdError) {
        this.f1587.m5529(this, this.f1588, StringFog.decrypt("DtoBkjIgoeEr5h68JgauzCPIEL4pa6DODtoBkjIgoeEr7BC0LiCr9CDmHrwmEqbUJ+8Dry03\n", "T6px3UJFz6A=\n"), loadAdError);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1589;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }
}
