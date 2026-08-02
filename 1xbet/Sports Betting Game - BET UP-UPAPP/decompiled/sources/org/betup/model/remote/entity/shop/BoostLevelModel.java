package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class BoostLevelModel {

    @SerializedName("response")
    private BoostLevelDataModel boostLevelDataModel;

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public BoostLevelDataModel getBoostLevelDataModel() {
        return this.boostLevelDataModel;
    }

    public void setBoostLevelDataModel(BoostLevelDataModel boostLevelDataModel) {
        this.boostLevelDataModel = boostLevelDataModel;
    }
}
