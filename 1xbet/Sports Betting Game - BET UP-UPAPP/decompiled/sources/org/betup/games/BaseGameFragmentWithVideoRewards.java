package org.betup.games;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.games.promo.MiniGameRoundPromoHelper;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.dialogs.RewardReceivedDialog;
import org.betup.utils.SharedPrefs;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BaseGameFragmentWithVideoRewards.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H$J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH$J\b\u0010\r\u001a\u00020\bH\u0004J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\nH\u0004J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¨\u0006\u001c"}, d2 = {"Lorg/betup/games/BaseGameFragmentWithVideoRewards;", "Lorg/betup/games/BaseGameFragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getVideoRewardServiceInstance", "Lorg/betup/services/offer/VideoRewardService;", "updateOfferState", "", "isAvailable", "", "amount", "", "onVideoRewardClicked", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onGamePlayed", "won", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseGameFragmentWithVideoRewards extends BaseGameFragment implements VideoRewardService.VideoRewardServiceClient {
    public static final int $stable = 8;

    /* compiled from: BaseGameFragmentWithVideoRewards.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MiniGameRoundPromoHelper.PromoAction.values().length];
            try {
                iArr[MiniGameRoundPromoHelper.PromoAction.VIDEO_OFFER_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MiniGameRoundPromoHelper.PromoAction.INTERSTITIAL_SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MiniGameRoundPromoHelper.PromoAction.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected abstract VideoRewardService getVideoRewardServiceInstance();

    protected abstract void updateOfferState(boolean isAvailable, long amount);

    protected final void onVideoRewardClicked() {
        SharedPrefs.resetCurrentMiniGamesPlayedCounter(getContext());
        getVideoRewardServiceInstance().redeemReward(PromoService.PromoPlacement.MINI_GAME, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getVideoRewardServiceInstance().connectClient(PromoService.PromoPlacement.MINI_GAME, null, this);
    }

    @Override // org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getVideoRewardServiceInstance().disconnectClient(PromoService.PromoPlacement.MINI_GAME, null);
    }

    protected final void onGamePlayed(boolean won) {
        MiniGameRoundPromoHelper miniGameRoundPromoHelper = MiniGameRoundPromoHelper.INSTANCE;
        Context context = getContext();
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        int i = WhenMappings.$EnumSwitchMapping$0[miniGameRoundPromoHelper.onRoundEnded(context, won, simpleName, new Function0() { // from class: org.betup.games.BaseGameFragmentWithVideoRewards$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onGamePlayed$lambda$0;
                onGamePlayed$lambda$0 = BaseGameFragmentWithVideoRewards.onGamePlayed$lambda$0(BaseGameFragmentWithVideoRewards.this);
                return onGamePlayed$lambda$0;
            }
        }).ordinal()];
        if (i == 1) {
            getVideoRewardServiceInstance().getVideoRewardInfo(PromoService.PromoPlacement.MINI_GAME, null, null);
        } else if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGamePlayed$lambda$0(BaseGameFragmentWithVideoRewards baseGameFragmentWithVideoRewards) {
        baseGameFragmentWithVideoRewards.getUserServiceAccessor().getReportDailyQuestClientEventInteractor().reportMinigameWon();
        return Unit.INSTANCE;
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (isActive()) {
            if (result != VideoRewardService.RewardedVideoResult.SUCCESS) {
                updateOfferState(false, 0L);
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                updateOfferState(false, 0L);
                RewardReceivedDialog.showDialog(activity, (int) amount, activity.getString(R.string.home_daily_bonus_title), activity.getString(R.string.home_daily_bonus_got));
            }
        }
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Intrinsics.checkNotNullParameter(info, "info");
        if (isActive()) {
            boolean z2 = false;
            try {
                z = getVideoRewardServiceInstance().isRewardedReady(PromoService.PromoPlacement.MINI_GAME);
            } catch (Exception e) {
                Log.e("BaseGameFragment", "Error checking rewarded ad availability", e);
                z = false;
            }
            boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
            if (z3 && z) {
                z2 = true;
            }
            Log.d("BaseGameFragment", "Video reward updated: backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", amount=" + info.getPrizeAmount());
            if (z3 && !getVideoRewardServiceInstance().isRewardedReady(PromoService.PromoPlacement.MINI_GAME)) {
                getVideoRewardServiceInstance().preloadRewarded();
            }
            updateOfferState(z2, info.getPrizeAmount());
        }
    }
}
