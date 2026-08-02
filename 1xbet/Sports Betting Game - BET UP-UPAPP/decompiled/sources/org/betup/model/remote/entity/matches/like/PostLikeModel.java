package org.betup.model.remote.entity.matches.like;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class PostLikeModel {

    @SerializedName("response")
    MatchDetailsDataModel match;

    @SerializedName(Mechanism.JsonKeys.META)
    MetaModel metaModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public void setMatch(MatchDetailsDataModel match) {
        this.match = match;
    }
}
