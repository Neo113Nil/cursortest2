package org.betup.model.remote.api.rest.user.bets.models.state;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class BetListStateModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private BetListStateMetaModel meta;

    @SerializedName("response")
    @Expose
    private BetListStateResponseModel response;

    public BetListStateMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(BetListStateMetaModel meta) {
        this.meta = meta;
    }

    public BetListStateResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(BetListStateResponseModel response) {
        this.response = response;
    }
}
