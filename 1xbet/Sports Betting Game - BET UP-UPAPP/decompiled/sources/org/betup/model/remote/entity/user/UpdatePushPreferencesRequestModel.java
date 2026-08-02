package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UpdatePushPreferencesRequestModel {

    @SerializedName("betPush")
    private Boolean betPush;

    @SerializedName("matchPush")
    private Boolean matchPush;

    public UpdatePushPreferencesRequestModel(Boolean matchPush, Boolean betPush) {
        this.matchPush = matchPush;
        this.betPush = betPush;
    }

    public Boolean getMatchPush() {
        return this.matchPush;
    }

    public void setMatchPush(Boolean matchPush) {
        this.matchPush = matchPush;
    }

    public Boolean getBetPush() {
        return this.betPush;
    }

    public void setBetPush(Boolean betPush) {
        this.betPush = betPush;
    }
}
