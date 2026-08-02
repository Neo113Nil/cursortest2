package org.betup.model.remote.entity.country;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class CountryResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private List<CountryModel> response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public List<CountryModel> getResponse() {
        return this.response;
    }

    public void setResponse(List<CountryModel> response) {
        this.response = response;
    }
}
