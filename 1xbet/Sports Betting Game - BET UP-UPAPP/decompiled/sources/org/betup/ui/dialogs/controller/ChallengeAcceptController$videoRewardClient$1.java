package org.betup.ui.dialogs.controller;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.VideoRewardService;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengeAcceptController.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"org/betup/ui/dialogs/controller/ChallengeAcceptController$videoRewardClient$1", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", "onVideoRewardRequestProcessed", "", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", "", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeAcceptController$videoRewardClient$1 implements VideoRewardService.VideoRewardServiceClient {
    final /* synthetic */ ChallengeAcceptController this$0;

    ChallengeAcceptController$videoRewardClient$1(ChallengeAcceptController challengeAcceptController) {
        this.this$0 = challengeAcceptController;
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result == VideoRewardService.RewardedVideoResult.SUCCESS) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$videoRewardClient$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChallengeAcceptController$videoRewardClient$1.onVideoRewardRequestProcessed$lambda$0();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVideoRewardRequestProcessed$lambda$0() {
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Intrinsics.checkNotNullParameter(info, "info");
        mutableStateFlow = this.this$0._isVideoRewardAvailable;
        mutableStateFlow.setValue(Boolean.valueOf(info.isAvailable() && !info.isQuotaExhausted()));
        mutableStateFlow2 = this.this$0._videoRewardAmount;
        mutableStateFlow2.setValue(Long.valueOf(info.getPrizeAmount()));
    }
}
