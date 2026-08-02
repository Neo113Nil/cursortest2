package org.betup.services.offer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.betup.bus.OfferMessage;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.experiments.ABTestService;
import org.betup.services.offer.PromoService;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;

/* loaded from: classes2.dex */
public class DefaultOfferService implements OfferService {
    private final ABTestService abTestService;
    private final Map<PromoType, Offer> offers;
    private final PromoService promoService;

    @Override // org.betup.ui.LifecycleListener
    public void onPause() {
    }

    public DefaultOfferService(Activity activity, ProgressDisplay progressDisplay, UserService userService, PromoService promoService, ABTestService abTestService, InterstitialAdController interstitialAdController, AdUnitRegistry adUnitRegistry) {
        this.promoService = promoService;
        HashMap hashMap = new HashMap();
        this.offers = hashMap;
        this.abTestService = abTestService;
        hashMap.put(PromoType.INTERSTITIAL, new InterstitialOffer(activity, promoService, interstitialAdController, adUnitRegistry));
        initOffers();
    }

    @Override // org.betup.services.offer.OfferService
    public boolean isAvailable(PromoType offer) {
        return this.offers.get(offer) != null && this.offers.get(offer).isLoaded();
    }

    private void initOffers() {
        Iterator<Offer> it = this.offers.values().iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }

    @Override // org.betup.services.offer.OfferService
    public void showOffer(OfferMessage offerMessage) {
        if (!FirebaseRemoteConfig.getInstance().getBoolean(RemoteConfigConstants.OFFERS_ENABLED)) {
            Log.d("OFFERTEST", "showOffer blocked: enableOffers=false in Remote Config");
            return;
        }
        PromoType promoType = offerMessage.getPromoType();
        Bundle bundle = offerMessage.getBundle();
        Log.d("OFFERTEST", "FINDING OFFER " + promoType + " OFFER = " + this.offers.get(promoType) + " placement=" + offerMessage.getPromoPlacement());
        if (!this.promoService.shouldDisplayPromo(offerMessage.getPromoCase())) {
            Log.d("OFFERTEST", "showOffer blocked: shouldDisplayPromo=false for case=" + offerMessage.getPromoCase());
            return;
        }
        if (this.offers.get(promoType) == null) {
            Log.d("OFFERTEST", "showOffer blocked: no offer handler for type=" + promoType);
            return;
        }
        if (promoType == PromoType.INTERSTITIAL && !this.promoService.isAdMobInterstitialAllowed()) {
            Log.d("OFFERTEST", "showOffer blocked: user excluded from AdMob interstitials");
            return;
        }
        String placementIdForOffer = getPlacementIdForOffer(offerMessage.getPromoType(), offerMessage.getPromoPlacement());
        Log.d("OFFERTEST", "showOffer type=" + promoType + " placement=" + placementIdForOffer + " shown=" + this.offers.get(promoType).show(bundle, placementIdForOffer));
    }

    @Override // org.betup.ui.LifecycleListener
    public void onResume() {
        Iterator<Offer> it = this.offers.values().iterator();
        while (it.hasNext()) {
            it.next().resume();
        }
    }

    @Override // org.betup.ui.LifecycleListener
    public void onStop() {
        Iterator<Offer> it = this.offers.values().iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    /* renamed from: org.betup.services.offer.DefaultOfferService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$remote$entity$promo$PromoType;

        static {
            int[] iArr = new int[PromoType.values().length];
            $SwitchMap$org$betup$model$remote$entity$promo$PromoType = iArr;
            try {
                iArr[PromoType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$promo$PromoType[PromoType.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private String getPlacementIdForOffer(PromoType promoType, PromoService.PromoPlacement placement) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$promo$PromoType[promoType.ordinal()];
        if (i == 1) {
            return PromoParams.getInterstitialPlacement(placement);
        }
        if (i == 2) {
            return PromoParams.getVideoPlacement(placement);
        }
        return "default";
    }
}
