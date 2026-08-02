package org.betup.model.remote.api.rest.videoRewards;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.videoRewards.VideoRedeemResult;
import org.betup.utils.HashCoder;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class RedeemVideoRewardForPlacementInteractor extends BaseAnalyticsInteractor<VideoRedeemResult, String> {
    public static final String REFERENCED_ID = "referencedId";
    public static final String REFERENCED_VALUE = "referencedValue";

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 3000L;
    }

    @Inject
    public RedeemVideoRewardForPlacementInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(String id, Bundle parameters) {
        if (parameters != null) {
            return HashCoder.hashCode(Long.valueOf(parameters.getLong("referencedValue", 0L)), parameters.getString("referencedId", "undefined"), id);
        }
        return super.getHash((RedeemVideoRewardForPlacementInteractor) id, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<VideoRedeemResult> makeCall(AnalyticsApi api, String id, Bundle parameters, String token) {
        Long l;
        String str = null;
        if (parameters != null) {
            l = parameters.containsKey("referencedValue") ? Long.valueOf(parameters.getLong("referencedValue")) : null;
            if (parameters.containsKey("referencedId")) {
                str = parameters.getString("referencedId");
            }
        } else {
            l = null;
        }
        return api.redeemVideoRewardForPlacement(token, id, str, l);
    }
}
