package org.betup.bus;

import android.os.Bundle;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.offer.PromoService;

/* loaded from: classes2.dex */
public class OfferMessage {
    private Bundle bundle;
    private PromoService.PromoCase promoCase;
    private PromoService.PromoPlacement promoPlacement;
    private PromoType promoType;

    public OfferMessage(PromoType promoType, PromoService.PromoCase promoCase, PromoService.PromoPlacement promoPlacement, Bundle bundle) {
        this.promoType = promoType;
        this.promoCase = promoCase;
        this.promoPlacement = promoPlacement;
        this.bundle = bundle;
    }

    public OfferMessage(PromoType promoType, PromoService.PromoPlacement promoPlacement) {
        this.promoType = promoType;
        this.promoCase = PromoService.PromoCase.DEFAULT;
        this.promoPlacement = promoPlacement;
    }

    public OfferMessage(PromoType promoType, PromoService.PromoCase promoCase, Bundle bundle) {
        this(promoType, promoCase, PromoService.PromoPlacement.DEFAULT, bundle);
    }

    public OfferMessage(PromoType promoType, Bundle bundle) {
        this(promoType, PromoService.PromoCase.DEFAULT, PromoService.PromoPlacement.DEFAULT, bundle);
    }

    public PromoService.PromoCase getPromoCase() {
        return this.promoCase;
    }

    public PromoType getPromoType() {
        return this.promoType;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public PromoService.PromoPlacement getPromoPlacement() {
        return this.promoPlacement;
    }
}
