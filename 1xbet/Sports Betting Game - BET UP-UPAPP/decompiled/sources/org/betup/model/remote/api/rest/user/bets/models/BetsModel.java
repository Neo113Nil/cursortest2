package org.betup.model.remote.api.rest.user.bets.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class BetsModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private BetsMetaModel meta;

    @SerializedName("response")
    @Expose
    private BetsResponseModel response;

    public BetsMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(BetsMetaModel meta) {
        this.meta = meta;
    }

    public BetsResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(BetsResponseModel response) {
        this.response = response;
    }
}
