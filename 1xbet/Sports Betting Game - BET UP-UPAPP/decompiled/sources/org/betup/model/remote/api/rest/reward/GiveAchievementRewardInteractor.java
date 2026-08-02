package org.betup.model.remote.api.rest.reward;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.rewards.AchievementRewardRequest;
import org.betup.model.remote.entity.rewards.RewardModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GiveAchievementRewardInteractor extends BaseNewVersionBettingInteractor<RewardModel, AchievementRewardRequest> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(AchievementRewardRequest request, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 0;
    }

    @Inject
    public GiveAchievementRewardInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<RewardModel> makeCall(NewVersionBettingApi api, AchievementRewardRequest request, Bundle parameters, String token) {
        return api.giveAchievementReward(token, request.getAchievementId(), request.getAmount());
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(AchievementRewardRequest request, Bundle parameters) {
        if (request == null) {
            return 1;
        }
        return Long.hashCode((request.getAchievementId() * 31) + request.getAmount());
    }
}
