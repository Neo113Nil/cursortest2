package org.betup.model.remote.entity.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class AchievementModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private AchievementsMetaModel meta;

    @SerializedName("response")
    @Expose
    private AchievementsResponseModel response;

    public AchievementsMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(AchievementsMetaModel meta) {
        this.meta = meta;
    }

    public AchievementsResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(AchievementsResponseModel response) {
        this.response = response;
    }
}
