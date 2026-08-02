package org.betup.model.remote.api.rest.reward;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.rewards.RewardModel;
import org.betup.model.remote.entity.rewards.WheelOfFortuneRewardRequest;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GiveWheelOfFortuneRewardInteractor extends BaseNewVersionBettingInteractor<RewardModel, WheelOfFortuneRewardRequest> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(WheelOfFortuneRewardRequest request, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 0;
    }

    @Inject
    public GiveWheelOfFortuneRewardInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<RewardModel> makeCall(NewVersionBettingApi api, WheelOfFortuneRewardRequest request, Bundle parameters, String token) {
        return api.giveWheelOfFortuneReward(token, request.getDailyBonusId(), request.getMultiplier());
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(WheelOfFortuneRewardRequest request, Bundle parameters) {
        if (request == null) {
            return 1;
        }
        return Long.hashCode((request.getDailyBonusId() * 31) + request.getMultiplier());
    }
}
