package org.betup.services.offer;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.services.user.UserAnalyticsTags;
import org.betup.services.user.UserService;

@Singleton
/* loaded from: classes2.dex */
public class PromoService {
    private final FirebaseRemoteConfig firebaseRemoteConfig;
    private final UserService userService;

    public enum PromoCase {
        DEFAULT,
        AFTER_TOUR,
        BONUS,
        ENERGY_RECOVERY
    }

    public enum PromoPlacement {
        DEFAULT,
        DAILY_BONUS,
        SHOP_BONUS,
        BET_CLOSED,
        BET_LOST,
        ENERGY_BONUS,
        MINI_GAME,
        VIDEO_FLASH_ROULETTE,
        BATTLE_STARTED_CLOSED,
        UNLOCK_ALL_BET_GROUPS,
        NOT_ENOUGH_BETCOINS,
        BET_PLACED,
        BET_WON,
        HOME_VIDEO_BONUS,
        AUTO_PROMPT
    }

    @Inject
    public PromoService(FirebaseRemoteConfig firebaseRemoteConfig, UserService userService) {
        this.userService = userService;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public boolean shouldDisplayPromo(PromoCase promoCase) {
        boolean isUserPromoEnabled = isUserPromoEnabled();
        boolean z = this.firebaseRemoteConfig.getBoolean(RemoteConfigConstants.GLOBAL_PROMO_ENABLED);
        boolean z2 = this.firebaseRemoteConfig.getBoolean(RemoteConfigConstants.AFTER_TOUR_PROMO_ENABLED);
        int i = AnonymousClass1.$SwitchMap$org$betup$services$offer$PromoService$PromoCase[promoCase.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return i != 3 ? isUserPromoEnabled && z : isUserPromoEnabled && z && z2;
    }

    /* renamed from: org.betup.services.offer.PromoService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$services$offer$PromoService$PromoCase;

        static {
            int[] iArr = new int[PromoCase.values().length];
            $SwitchMap$org$betup$services$offer$PromoService$PromoCase = iArr;
            try {
                iArr[PromoCase.BONUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoCase[PromoCase.ENERGY_RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoCase[PromoCase.AFTER_TOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean isUserPromoEnabled() {
        if (this.userService.isRegistered()) {
            return this.userService.getShortProfile().getUserModel().isAdsEnabled();
        }
        return true;
    }

    public boolean canShowAdMobInterstitial() {
        return isUserPromoEnabled() && isAdMobInterstitialAllowed();
    }

    public boolean isAdMobInterstitialAllowed() {
        Set<String> excludedTags = PromoInterstitialSettings.getExcludedTags();
        if (excludedTags.isEmpty()) {
            return true;
        }
        Set<String> tags = UserAnalyticsTags.getTags();
        if (tags.isEmpty()) {
            return true;
        }
        Iterator<String> it = tags.iterator();
        while (it.hasNext()) {
            if (excludedTags.contains(it.next())) {
                return false;
            }
        }
        return true;
    }
}
