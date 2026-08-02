package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class BetSlipModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private MetaModel meta;

    @SerializedName("response")
    @Expose
    private BetSlipResponseModel response;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public BetSlipResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(BetSlipResponseModel response) {
        this.response = response;
    }
}
