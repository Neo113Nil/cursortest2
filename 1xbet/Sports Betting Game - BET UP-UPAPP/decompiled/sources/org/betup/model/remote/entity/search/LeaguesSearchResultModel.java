package org.betup.model.remote.entity.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.ResponseModel;
import org.betup.model.remote.entity.leagues.LeaguesResponseModel;

/* loaded from: classes2.dex */
public class LeaguesSearchResultModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    LeaguesResponseModel meta;

    @SerializedName("response")
    @Expose
    ResponseModel<LeaguesResponseModel> response;

    public LeaguesResponseModel getMeta() {
        return this.meta;
    }

    public void setMeta(LeaguesResponseModel meta) {
        this.meta = meta;
    }

    public ResponseModel<LeaguesResponseModel> getResponse() {
        return this.response;
    }

    public void setResponse(ResponseModel<LeaguesResponseModel> response) {
        this.response = response;
    }
}
