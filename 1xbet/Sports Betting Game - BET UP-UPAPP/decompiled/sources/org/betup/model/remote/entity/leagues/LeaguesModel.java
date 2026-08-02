package org.betup.model.remote.entity.leagues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class LeaguesModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private LeaguesMetaModel meta;

    @SerializedName("response")
    @Expose
    private LeaguesResponseModel response;

    public LeaguesMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(LeaguesMetaModel meta) {
        this.meta = meta;
    }

    public LeaguesResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(LeaguesResponseModel response) {
        this.response = response;
    }
}
