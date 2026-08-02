package org.betup.services.offer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import org.betup.services.ads.AdMobDiagnostics;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.ads.interstitial.InterstitialAdListener;
import org.betup.services.offer.PromoService;
import org.betup.utils.SharedPrefs;

/* loaded from: classes2.dex */
public class InterstitialOffer implements Offer, InterstitialAdListener {
    private final AdUnitRegistry adUnitRegistry;
    private final Activity context;
    private final InterstitialAdController interstitialAdController;
    private final PromoService promoService;

    @Override // org.betup.services.offer.Offer
    public void pause() {
    }

    public InterstitialOffer(Activity context, PromoService promoService, InterstitialAdController interstitialAdController, AdUnitRegistry adUnitRegistry) {
        this.context = context;
        this.promoService = promoService;
        this.interstitialAdController = interstitialAdController;
        this.adUnitRegistry = adUnitRegistry;
        interstitialAdController.setListener(this);
    }

    @Override // org.betup.services.offer.Offer
    public boolean isLoaded() {
        Iterator<PromoService.PromoPlacement> it = this.adUnitRegistry.interstitialPreloadPlacements().iterator();
        while (it.hasNext()) {
            if (this.interstitialAdController.isReady(this.adUnitRegistry.interstitialUnit(it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.betup.services.offer.Offer
    public boolean show(Bundle bundle, String placementId) {
        String interstitialUnit = this.adUnitRegistry.interstitialUnit(resolvePlacement(placementId));
        AdMobDiagnostics.logRequest("interstitial", interstitialUnit, placementId);
        if (this.interstitialAdController.isReady(interstitialUnit)) {
            return this.interstitialAdController.show(this.context, interstitialUnit);
        }
        Log.d("OFFERTEST", "interstitial not ready for placement=" + placementId + " unit=" + interstitialUnit + "; preloading for next time");
        if (!this.promoService.canShowAdMobInterstitial()) {
            return false;
        }
        this.interstitialAdController.preload(this.context, interstitialUnit);
        return false;
    }

    @Override // org.betup.services.offer.Offer
    public void init() {
        if (this.promoService.canShowAdMobInterstitial()) {
            preloadAll();
        }
    }

    @Override // org.betup.services.offer.Offer
    public void resume() {
        if (this.promoService.canShowAdMobInterstitial()) {
            preloadAll();
        }
    }

    @Override // org.betup.services.ads.interstitial.InterstitialAdListener
    public void onDismissed(String adUnitId) {
        if (adUnitId.equals(this.adUnitRegistry.interstitialUnit(PromoService.PromoPlacement.BET_CLOSED))) {
            SharedPrefs.markBetWonCloseInterstitialShown(this.context);
        }
    }

    private void preloadAll() {
        Iterator<PromoService.PromoPlacement> it = this.adUnitRegistry.interstitialPreloadPlacements().iterator();
        while (it.hasNext()) {
            this.interstitialAdController.preload(this.context, this.adUnitRegistry.interstitialUnit(it.next()));
        }
    }

    private static PromoService.PromoPlacement resolvePlacement(String placementId) {
        if (PromoParams.getInterstitialPlacement(PromoService.PromoPlacement.MINI_GAME).equals(placementId)) {
            return PromoService.PromoPlacement.MINI_GAME;
        }
        if (PromoParams.getInterstitialPlacement(PromoService.PromoPlacement.BET_CLOSED).equals(placementId)) {
            return PromoService.PromoPlacement.BET_CLOSED;
        }
        if (PromoParams.getInterstitialPlacement(PromoService.PromoPlacement.DAILY_BONUS).equals(placementId)) {
            return PromoService.PromoPlacement.DAILY_BONUS;
        }
        if (PromoParams.getInterstitialPlacement(PromoService.PromoPlacement.BATTLE_STARTED_CLOSED).equals(placementId)) {
            return PromoService.PromoPlacement.BATTLE_STARTED_CLOSED;
        }
        return PromoService.PromoPlacement.DEFAULT;
    }
}
