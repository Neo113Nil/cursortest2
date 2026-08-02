package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class MatchesForLeagueModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private SpecificChampMetaModel meta;

    @SerializedName("response")
    @Expose
    private SpecificChampResponseModel response;

    public SpecificChampMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(SpecificChampMetaModel meta) {
        this.meta = meta;
    }

    public SpecificChampResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(SpecificChampResponseModel response) {
        this.response = response;
    }
}
