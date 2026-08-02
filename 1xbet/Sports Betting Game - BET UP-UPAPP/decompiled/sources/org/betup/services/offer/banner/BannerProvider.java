package org.betup.services.offer.banner;

import android.view.View;

/* loaded from: classes2.dex */
public interface BannerProvider {
    void fillView(BannerController bannerController, View view);

    int getLayoutId();

    void release();

    void requestNew();
}
