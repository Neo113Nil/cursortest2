package org.betup.services.offer;

import org.betup.bus.OfferMessage;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.ui.LifecycleListener;

/* loaded from: classes2.dex */
public interface OfferService extends LifecycleListener {
    boolean isAvailable(PromoType offer);

    void showOffer(OfferMessage offerMessage);
}
