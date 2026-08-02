package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class ChallengeListResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel meta;

    @SerializedName("response")
    private ChallengePaginableResponseModel response;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public ChallengePaginableResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(ChallengePaginableResponseModel response) {
        this.response = response;
    }
}
