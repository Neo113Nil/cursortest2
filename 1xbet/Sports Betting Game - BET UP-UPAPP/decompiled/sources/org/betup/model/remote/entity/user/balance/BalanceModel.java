package org.betup.model.remote.entity.user.balance;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class BalanceModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private BalanceResponseModel response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public BalanceResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(BalanceResponseModel response) {
        this.response = response;
    }
}
