package org.betup.model.remote.entity.matches.stats.statistics;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class StatisticsResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private StatisticsResponseDataModel statisticsResponseDataModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public StatisticsResponseDataModel getStatisticsResponseDataModel() {
        return this.statisticsResponseDataModel;
    }

    public void setStatisticsResponseDataModel(StatisticsResponseDataModel statisticsResponseDataModel) {
        this.statisticsResponseDataModel = statisticsResponseDataModel;
    }
}
