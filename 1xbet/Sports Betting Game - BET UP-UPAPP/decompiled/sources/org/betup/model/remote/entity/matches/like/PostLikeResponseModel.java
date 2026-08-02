package org.betup.model.remote.entity.matches.like;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class PostLikeResponseModel {

    @SerializedName("liked")
    private boolean liked;

    @SerializedName("match")
    private MatchDetailsDataModel match;

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public void setMatch(MatchDetailsDataModel match) {
        this.match = match;
    }

    public boolean isLiked() {
        return this.liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
