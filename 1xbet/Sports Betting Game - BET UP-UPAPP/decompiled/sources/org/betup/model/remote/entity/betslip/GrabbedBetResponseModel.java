package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class GrabbedBetResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private GrabbedBetDataModel response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public GrabbedBetDataModel getResponse() {
        return this.response;
    }

    public void setResponse(GrabbedBetDataModel response) {
        this.response = response;
    }
}
