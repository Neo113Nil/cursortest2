package org.betup.services.offer;

import org.betup.services.offer.PromoService;

/* loaded from: classes2.dex */
public final class PromoParams {
    public static final String DEFAULT_PLACEMENT_ID = "default";

    private PromoParams() {
    }

    public static String getNativeBannerPlacement() {
        return "ca-app-pub-6958407189452435/7729111476";
    }

    /* renamed from: org.betup.services.offer.PromoParams$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement;

        static {
            int[] iArr = new int[PromoService.PromoPlacement.values().length];
            $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement = iArr;
            try {
                iArr[PromoService.PromoPlacement.DAILY_BONUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.MINI_GAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.BET_CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.BATTLE_STARTED_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.SHOP_BONUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.BET_PLACED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.BET_WON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.BET_LOST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.HOME_VIDEO_BONUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[PromoService.PromoPlacement.AUTO_PROMPT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static String getInterstitialPlacement(PromoService.PromoPlacement placement) {
        int i = AnonymousClass1.$SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[placement.ordinal()];
        if (i == 1) {
            return "interstitial_dailybonus_close_dialog";
        }
        if (i == 2) {
            return "interstitial_minigame";
        }
        if (i == 3) {
            return "interstitial_betwon_dialog";
        }
        if (i == 4) {
            return "interstitial_battle_started";
        }
        return "default";
    }

    public static String getVideoPlacement(PromoService.PromoPlacement placement) {
        int i = AnonymousClass1.$SwitchMap$org$betup$services$offer$PromoService$PromoPlacement[placement.ordinal()];
        if (i == 1) {
            return "video_daily_bonus_triple";
        }
        if (i == 2) {
            return "video_minigames";
        }
        switch (i) {
        }
        return "video_minigames";
    }

    public static PromoService.PromoPlacement placementFromVideoPlacementId(String placementId) {
        if (placementId == null) {
            return null;
        }
        for (PromoService.PromoPlacement promoPlacement : PromoService.PromoPlacement.values()) {
            if (placementId.equals(getVideoPlacement(promoPlacement))) {
                return promoPlacement;
            }
        }
        return null;
    }
}
