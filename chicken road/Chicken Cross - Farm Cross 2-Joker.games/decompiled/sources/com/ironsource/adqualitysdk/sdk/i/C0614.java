package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.پ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0614 extends AdListener implements InterfaceC0997 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f1590;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0807 f1591;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AdListener f1592;

    public C0614(C0588 c0588, AdListener adListener, C0807 c0807) {
        this.f1590 = c0588;
        this.f1592 = adListener;
        this.f1591 = c0807;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("FwQMeLDP6CgzEm5+rfrpBToPM3Sn\n", "VmBAEcO7jUY=\n"), new Object[0]);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    public final void onAdFailedToLoad(int i) {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("zhYNwrjwRaTqAG/EpcVEjO4bLc6v0E+G4BMl\n", "j3JBq8uEIMo=\n"), Integer.valueOf(i));
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("luo3+fgwocqy/FX/5QWg7br+CfX4N63LuQ==\n", "1457kItExKQ=\n"), new Object[0]);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final void onAdLeftApplication() {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("lEhltfhcRP+wXgez5WlF3bBKXZ37WE34tk1dteRG\n", "1Swp3IsoIZE=\n"), new Object[0]);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("A1nakyJoYrMnT7iVP11jkS1c8p81\n", "Qj2W+lEcB90=\n"), new Object[0]);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("HM7rnKAaBtg42ImavS8H+S3PyZC3\n", "Xaqn9dNuY7Y=\n"), new Object[0]);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("UvSluvDW0Z924se87ePQomT5mbbEx8eFZuKMkO/L15p29A==\n", "E5Dp04OitPE=\n"), new Object[0]);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this.f1592;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f1590.m5529(this, this.f1591, StringFog.decrypt("gAeLOdOPszmkEek/zrqyEaAKqzXEr7kbrgKjB8mPvhalJrUiz4k=\n", "wWPHUKD71lc=\n"), loadAdError);
        AdListener adListener = this.f1592;
        if (adListener != null) {
            adListener.onAdFailedToLoad(loadAdError);
        }
    }
}
