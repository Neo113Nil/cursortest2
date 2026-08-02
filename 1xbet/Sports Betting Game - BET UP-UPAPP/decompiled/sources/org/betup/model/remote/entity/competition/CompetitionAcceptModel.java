package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class CompetitionAcceptModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private CompetitionGrabbedBetResponseModel response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public CompetitionGrabbedBetResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(CompetitionGrabbedBetResponseModel response) {
        this.response = response;
    }
}
