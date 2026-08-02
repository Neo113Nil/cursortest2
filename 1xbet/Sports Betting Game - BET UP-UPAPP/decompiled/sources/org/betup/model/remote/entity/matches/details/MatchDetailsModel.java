package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class MatchDetailsModel {

    @SerializedName("response")
    @Expose
    private MatchDetailsResponseModel matchInfo;

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private MatchDetailsMetaModel meta;

    public MatchDetailsMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MatchDetailsMetaModel meta) {
        this.meta = meta;
    }

    public MatchDetailsResponseModel getMatchInfo() {
        return this.matchInfo;
    }

    public void setMatchInfo(MatchDetailsResponseModel matchInfo) {
        this.matchInfo = matchInfo;
    }
}
