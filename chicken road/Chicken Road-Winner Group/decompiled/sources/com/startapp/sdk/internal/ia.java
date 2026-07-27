package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class ia implements AdEventListener {
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        com.startapp.sdk.adsbase.e eVar = ja.f3914a;
        if (eVar.f3219e.showAd()) {
            eVar.f3217c = System.currentTimeMillis();
            eVar.f3218d = 0;
        }
    }
}
