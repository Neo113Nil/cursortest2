package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class BoostResultResponseModel {

    @SerializedName("response")
    private BoostLevelResultModel boostLevelResultModel;

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public BoostLevelResultModel getBoostLevelResultModel() {
        return this.boostLevelResultModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public void setBoostLevelResultModel(BoostLevelResultModel boostLevelResultModel) {
        this.boostLevelResultModel = boostLevelResultModel;
    }
}
