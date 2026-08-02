package org.betup.model.remote.entity.subscription;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class SubscriptionResponse {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private SubscriptionResponseModel response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public SubscriptionResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(SubscriptionResponseModel response) {
        this.response = response;
    }
}
