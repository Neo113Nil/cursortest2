package org.betup.model.remote.entity.sports;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class SportsModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private SportsMetaModel meta;

    @SerializedName("response")
    @Expose
    private SportsResponseModel response;

    public SportsMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(SportsMetaModel meta) {
        this.meta = meta;
    }

    public SportsResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(SportsResponseModel response) {
        this.response = response;
    }
}
