package com.startapp.sdk.ads.banner;

import android.view.View;

/* loaded from: classes.dex */
public interface BannerListener {
    void onClick(View view);

    void onFailedToReceiveAd(View view);

    void onImpression(View view);

    void onReceiveAd(View view);
}
