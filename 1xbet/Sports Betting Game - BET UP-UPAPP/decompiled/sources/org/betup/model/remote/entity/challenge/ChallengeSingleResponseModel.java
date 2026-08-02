package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class ChallengeSingleResponseModel {

    @SerializedName("response")
    private ChallengeDataModel challenge;

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel meta;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public ChallengeDataModel getChallenge() {
        return this.challenge;
    }

    public void setChallenge(ChallengeDataModel challenge) {
        this.challenge = challenge;
    }
}
