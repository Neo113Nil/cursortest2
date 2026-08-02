package org.betup.services.offer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.OfferMessage;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.offer.PromoService;
import org.betup.utils.SharedPrefs;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetWonCloseInterstitialHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/services/offer/BetWonCloseInterstitialHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "maybeShow", "", "context", "Landroid/content/Context;", "betState", "Lorg/betup/model/remote/entity/bets/BetState;", "promoService", "Lorg/betup/services/offer/PromoService;", "skipBecauseVideoRedeemed", "", "POST_OFFER_DELAY_MS", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetWonCloseInterstitialHelper {
    public static final int $stable = 0;
    public static final BetWonCloseInterstitialHelper INSTANCE = new BetWonCloseInterstitialHelper();
    private static final long POST_OFFER_DELAY_MS = 350;
    private static final String TAG = "BetWonCloseInterstitial";

    private BetWonCloseInterstitialHelper() {
    }

    public final void maybeShow(Context context, BetState betState, PromoService promoService, boolean skipBecauseVideoRedeemed) {
        Intrinsics.checkNotNullParameter(promoService, "promoService");
        if (betState != BetState.WON) {
            Log.d(TAG, "skipped: state=" + betState);
            return;
        }
        if (skipBecauseVideoRedeemed) {
            Log.d(TAG, "skipped: user redeemed video reward");
            return;
        }
        if (!promoService.canShowAdMobInterstitial()) {
            Log.d(TAG, "skipped: ads disabled or user excluded by tag");
            return;
        }
        if (context == null) {
            Log.w(TAG, "skipped: context null");
            return;
        }
        long betWonCloseCooldownMinutes = PromoInterstitialSettings.getBetWonCloseCooldownMinutes();
        if (betWonCloseCooldownMinutes > 0) {
            long j = 60000 * betWonCloseCooldownMinutes;
            long currentTimeMillis = System.currentTimeMillis() - SharedPrefs.getLastBetWonCloseInterstitialAtMs(context);
            if (currentTimeMillis < j) {
                Log.d(TAG, "skipped: cooldown active (" + ((j - currentTimeMillis) / 1000) + "s left, cooldown=" + betWonCloseCooldownMinutes + "min)");
                return;
            }
        } else {
            Log.d(TAG, "no app cooldown (cooldownMinutes=0); AdMob decides if ad is shown");
        }
        Log.d(TAG, "scheduling OfferMessage BET_CLOSED");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.services.offer.BetWonCloseInterstitialHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BetWonCloseInterstitialHelper.maybeShow$lambda$1();
            }
        }, POST_OFFER_DELAY_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeShow$lambda$1() {
        Log.d(TAG, "posting OfferMessage BET_CLOSED");
        EventBus.getDefault().post(new OfferMessage(PromoType.INTERSTITIAL, PromoService.PromoPlacement.BET_CLOSED));
    }
}
