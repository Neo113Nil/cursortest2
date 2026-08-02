package org.betup.model.remote.entity.matches.stats.standings;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class StandingsStatsResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private List<TeamStanding> response;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public List<TeamStanding> getResponse() {
        return this.response;
    }

    public void setResponse(List<TeamStanding> response) {
        this.response = response;
    }
}
