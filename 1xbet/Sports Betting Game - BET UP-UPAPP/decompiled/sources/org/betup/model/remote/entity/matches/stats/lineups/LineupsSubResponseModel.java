package org.betup.model.remote.entity.matches.stats.lineups;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class LineupsSubResponseModel {

    @SerializedName("lineups")
    private LineupsResponseDataModel lineups;

    public LineupsResponseDataModel getLineups() {
        return this.lineups;
    }

    public void setLineups(LineupsResponseDataModel lineups) {
        this.lineups = lineups;
    }
}
