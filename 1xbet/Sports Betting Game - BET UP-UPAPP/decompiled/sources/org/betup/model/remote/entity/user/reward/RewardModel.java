package org.betup.model.remote.entity.user.reward;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class RewardModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private RewardDataModel rewardDataModel;

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public RewardDataModel getRewardResponseModel() {
        return this.rewardDataModel;
    }

    public void setRewardDataModel(RewardDataModel rewardDataModel) {
        this.rewardDataModel = rewardDataModel;
    }
}
