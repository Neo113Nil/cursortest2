package org.betup.model.remote.entity.matches.observable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;
import org.betup.model.remote.entity.matches.MatchesMetaModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class MatchesListModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private MatchesMetaModel meta;

    @SerializedName("response")
    @Expose
    private List<MatchDetailsDataModel> response;

    public MatchesMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MatchesMetaModel meta) {
        this.meta = meta;
    }

    public List<MatchDetailsDataModel> getResponse() {
        return this.response;
    }
}
