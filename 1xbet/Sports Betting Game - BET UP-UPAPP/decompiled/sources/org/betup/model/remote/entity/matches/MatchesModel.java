package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class MatchesModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private MatchesMetaModel meta;

    @SerializedName("response")
    @Expose
    private MatchesResponseModel response;

    public MatchesMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MatchesMetaModel meta) {
        this.meta = meta;
    }

    public MatchesResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(MatchesResponseModel response) {
        this.response = response;
    }
}
