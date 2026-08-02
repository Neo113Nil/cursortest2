package org.betup.model.remote.entity.matches.championship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class ChampionshipModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private ChampionshipMetaModel meta;

    @SerializedName("response")
    @Expose
    private ChampionshipResponseModel response;

    public ChampionshipMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(ChampionshipMetaModel meta) {
        this.meta = meta;
    }

    public ChampionshipResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(ChampionshipResponseModel response) {
        this.response = response;
    }
}
