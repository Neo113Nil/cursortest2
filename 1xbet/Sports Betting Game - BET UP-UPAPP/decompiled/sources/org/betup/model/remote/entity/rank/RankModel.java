package org.betup.model.remote.entity.rank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class RankModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private RankMetaModel meta;

    @SerializedName("response")
    @Expose
    private RankDataModel response;

    public RankMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(RankMetaModel meta) {
        this.meta = meta;
    }

    public RankDataModel getResponse() {
        return this.response;
    }

    public void setResponse(RankDataModel response) {
        this.response = response;
    }
}
