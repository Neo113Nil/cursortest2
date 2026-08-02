package org.betup.model.remote.entity.leagues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.teams.search.SearchTeamMetaModel;

/* loaded from: classes2.dex */
public class SearchLeaguesModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private SearchTeamMetaModel meta;

    @SerializedName("response")
    @Expose
    private SearchLeaguesResponseModel response;

    public SearchTeamMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(SearchTeamMetaModel meta) {
        this.meta = meta;
    }

    public SearchLeaguesResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(SearchLeaguesResponseModel response) {
        this.response = response;
    }
}
