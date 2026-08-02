package org.betup.model.remote.entity.matches.stats.highlights;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class HighlightResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel meta;

    @SerializedName("response")
    private HighlightResponseDataModel response;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public HighlightResponseDataModel getResponse() {
        return this.response;
    }

    public void setResponse(HighlightResponseDataModel response) {
        this.response = response;
    }
}
