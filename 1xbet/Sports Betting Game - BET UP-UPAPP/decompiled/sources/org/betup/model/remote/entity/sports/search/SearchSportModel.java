package org.betup.model.remote.entity.sports.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.teams.search.SearchTeamMetaModel;
import org.betup.model.remote.entity.teams.search.SearchTeamResponseModel;

/* loaded from: classes2.dex */
public class SearchSportModel {

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
