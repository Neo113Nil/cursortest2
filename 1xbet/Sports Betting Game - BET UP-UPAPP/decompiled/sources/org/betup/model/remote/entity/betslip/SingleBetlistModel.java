package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class SingleBetlistModel {

    @SerializedName("response")
    private BetsListModel betListModel;

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public BetsListModel getBetListModel() {
        return this.betListModel;
    }

    public void setBetListModel(BetsListModel betListModel) {
        this.betListModel = betListModel;
    }
}
