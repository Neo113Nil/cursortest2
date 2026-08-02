package org.betup.model.remote.entity.matches.stats.lineups;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class LineupsResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private LineupsSubResponseModel response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public LineupsSubResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(LineupsSubResponseModel response) {
        this.response = response;
    }
}
