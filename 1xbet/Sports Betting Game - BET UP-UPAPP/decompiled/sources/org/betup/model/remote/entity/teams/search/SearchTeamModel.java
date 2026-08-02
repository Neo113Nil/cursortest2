package org.betup.model.remote.entity.teams.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class SearchTeamModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private SearchTeamMetaModel meta;

    @SerializedName("response")
    @Expose
    private SearchTeamResponseModel response;

    public SearchTeamMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(SearchTeamMetaModel meta) {
        this.meta = meta;
    }

    public SearchTeamResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(SearchTeamResponseModel response) {
        this.response = response;
    }
}
