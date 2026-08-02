package org.betup.games.promo;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.OfferMessage;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.offer.PromoInterstitialSettings;
import org.betup.services.offer.PromoService;
import org.betup.utils.SharedPrefs;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MiniGameRoundPromoHelper.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¨\u0006\u0010"}, d2 = {"Lorg/betup/games/promo/MiniGameRoundPromoHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onRoundEnded", "Lorg/betup/games/promo/MiniGameRoundPromoHelper$PromoAction;", "context", "Landroid/content/Context;", "won", "", "analyticsLabel", "", "onMinigameWonQuest", "Lkotlin/Function0;", "", "PromoAction", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MiniGameRoundPromoHelper {
    public static final int $stable = 0;
    public static final MiniGameRoundPromoHelper INSTANCE = new MiniGameRoundPromoHelper();

    private MiniGameRoundPromoHelper() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MiniGameRoundPromoHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/games/promo/MiniGameRoundPromoHelper$PromoAction;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "INTERSTITIAL_SCHEDULED", "VIDEO_OFFER_REFRESH", "NONE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromoAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PromoAction[] $VALUES;
        public static final PromoAction INTERSTITIAL_SCHEDULED = new PromoAction("INTERSTITIAL_SCHEDULED", 0);
        public static final PromoAction VIDEO_OFFER_REFRESH = new PromoAction("VIDEO_OFFER_REFRESH", 1);
        public static final PromoAction NONE = new PromoAction("NONE", 2);

        private static final /* synthetic */ PromoAction[] $values() {
            return new PromoAction[]{INTERSTITIAL_SCHEDULED, VIDEO_OFFER_REFRESH, NONE};
        }

        public static EnumEntries<PromoAction> getEntries() {
            return $ENTRIES;
        }

        private PromoAction(String str, int i) {
        }

        static {
            PromoAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static PromoAction valueOf(String str) {
            return (PromoAction) Enum.valueOf(PromoAction.class, str);
        }

        public static PromoAction[] values() {
            return (PromoAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoAction onRoundEnded$default(MiniGameRoundPromoHelper miniGameRoundPromoHelper, Context context, boolean z, String str, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        return miniGameRoundPromoHelper.onRoundEnded(context, z, str, function0);
    }

    public final PromoAction onRoundEnded(Context context, boolean won, String analyticsLabel, Function0<Unit> onMinigameWonQuest) {
        Intrinsics.checkNotNullParameter(analyticsLabel, "analyticsLabel");
        if (context == null) {
            return PromoAction.NONE;
        }
        SharedPrefs.trackMiniGamePlayed(context, won);
        if (won) {
            AnalyticsHelper.INSTANCE.logMiniGameWon(analyticsLabel);
            if (onMinigameWonQuest != null) {
                onMinigameWonQuest.invoke();
            }
        } else {
            AnalyticsHelper.INSTANCE.logMiniGameLost(analyticsLabel);
        }
        long miniGamesInterstitialInterval = PromoInterstitialSettings.getMiniGamesInterstitialInterval();
        long j = FirebaseRemoteConfig.getInstance().getLong(RemoteConfigConstants.MINI_GAMES_VIDEO_INTERVAL);
        if (miniGamesInterstitialInterval <= 0 || SharedPrefs.getCurrentMiniGamesWins(context) < miniGamesInterstitialInterval) {
            if (SharedPrefs.getCurrentMiniGamesPlayed(context) >= j) {
                return PromoAction.VIDEO_OFFER_REFRESH;
            }
            return PromoAction.NONE;
        }
        SharedPrefs.resetCurrentMiniGamesWinsCounter(context);
        EventBus.getDefault().post(new OfferMessage(PromoType.INTERSTITIAL, PromoService.PromoPlacement.MINI_GAME));
        return PromoAction.INTERSTITIAL_SCHEDULED;
    }
}
