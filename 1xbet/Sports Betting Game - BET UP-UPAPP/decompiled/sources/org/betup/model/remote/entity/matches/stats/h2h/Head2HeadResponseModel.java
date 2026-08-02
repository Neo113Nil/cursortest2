package org.betup.model.remote.entity.matches.stats.h2h;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class Head2HeadResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private Head2HeadSubResponseModel response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public Head2HeadSubResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(Head2HeadSubResponseModel response) {
        this.response = response;
    }
}
