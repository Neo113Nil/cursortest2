package org.betup.services.ads;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.services.offer.PromoService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AdUnitRegistry.kt */
@Singleton
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lorg/betup/services/ads/AdUnitRegistry;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "rewardedUnit", "", "placement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "rewardedPreloadPlacements", "", "interstitialUnit", "interstitialPreloadPlacements", "nativeUnit", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdUnitRegistry {
    public static final int $stable = 8;
    private final Context context;

    /* compiled from: AdUnitRegistry.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromoService.PromoPlacement.values().length];
            try {
                iArr[PromoService.PromoPlacement.HOME_VIDEO_BONUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoService.PromoPlacement.AUTO_PROMPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoService.PromoPlacement.BET_PLACED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoService.PromoPlacement.BET_WON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoService.PromoPlacement.BET_LOST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PromoService.PromoPlacement.DAILY_BONUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PromoService.PromoPlacement.SHOP_BONUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PromoService.PromoPlacement.MINI_GAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PromoService.PromoPlacement.BET_CLOSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public AdUnitRegistry(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ String rewardedUnit$default(AdUnitRegistry adUnitRegistry, PromoService.PromoPlacement promoPlacement, int i, Object obj) {
        if ((i & 1) != 0) {
            promoPlacement = PromoService.PromoPlacement.DEFAULT;
        }
        return adUnitRegistry.rewardedUnit(promoPlacement);
    }

    public final String rewardedUnit(PromoService.PromoPlacement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (!AdMobDiagnostics.useProductionAdUnits()) {
            String string = this.context.getString(R.string.admob_rewarded_test);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[placement.ordinal()]) {
            case 1:
                String string2 = this.context.getString(R.string.admob_rewarded_home_prod);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = this.context.getString(R.string.admob_rewarded_auto_prompt_prod);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = this.context.getString(R.string.admob_rewarded_bet_placed_prod);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = this.context.getString(R.string.admob_rewarded_bet_won_prod);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = this.context.getString(R.string.admob_rewarded_bet_lost_prod);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = this.context.getString(R.string.admob_rewarded_unlock_bet_groups_prod);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = this.context.getString(R.string.admob_rewarded_daily_bonus_prod);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = this.context.getString(R.string.admob_rewarded_not_enough_betcoins_prod);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 9:
                String string10 = this.context.getString(R.string.admob_rewarded_shop_bonus_prod);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 10:
                String string11 = this.context.getString(R.string.admob_rewarded_video_flash_roulette_prod);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            default:
                String string12 = this.context.getString(R.string.admob_rewarded_not_enough_betcoins_prod);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
        }
    }

    public final List<PromoService.PromoPlacement> rewardedPreloadPlacements() {
        return CollectionsKt.listOf((Object[]) new PromoService.PromoPlacement[]{PromoService.PromoPlacement.HOME_VIDEO_BONUS, PromoService.PromoPlacement.AUTO_PROMPT, PromoService.PromoPlacement.SHOP_BONUS, PromoService.PromoPlacement.DAILY_BONUS, PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, PromoService.PromoPlacement.BET_PLACED, PromoService.PromoPlacement.BET_WON, PromoService.PromoPlacement.BET_LOST, PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS});
    }

    public final String interstitialUnit(PromoService.PromoPlacement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (!AdMobDiagnostics.useProductionAdUnits()) {
            String string = this.context.getString(R.string.admob_interstitial_test);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[placement.ordinal()];
        if (i == 11) {
            String string2 = this.context.getString(R.string.admob_interstitial_minigame_prod);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 12) {
            String string3 = this.context.getString(R.string.admob_interstitial_bet_closed_prod);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = this.context.getString(R.string.admob_interstitial_prod);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public final List<PromoService.PromoPlacement> interstitialPreloadPlacements() {
        return CollectionsKt.listOf((Object[]) new PromoService.PromoPlacement[]{PromoService.PromoPlacement.BET_CLOSED, PromoService.PromoPlacement.MINI_GAME, PromoService.PromoPlacement.DEFAULT});
    }

    public final String nativeUnit() {
        if (AdMobDiagnostics.useProductionAdUnits()) {
            String string = this.context.getString(R.string.admob_native_prod);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = this.context.getString(R.string.admob_native_test);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
