package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class TeamsModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private TeamsMetaModel meta;

    @SerializedName("response")
    @Expose
    private TeamsResponseModel response;

    public TeamsMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(TeamsMetaModel meta) {
        this.meta = meta;
    }

    public TeamsResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(TeamsResponseModel response) {
        this.response = response;
    }
}
