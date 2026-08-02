package org.betup.services.offer.banner;

import android.app.Activity;
import org.betup.BetUpApp;
import org.betup.services.offer.PromoService;

/* loaded from: classes2.dex */
public class BannerFactory {

    public enum BannerProviderType {
        ADMOB
    }

    public static BannerProvider getDefaultBannerProdiver(Activity activity, PromoService promoService) {
        return new AdMobNativeBannerProvider(activity, promoService, ((BetUpApp) activity.getApplication()).getComponent().adUnitRegistry());
    }
}
