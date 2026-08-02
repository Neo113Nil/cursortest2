package org.betup.model.remote.entity.matches.like;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class LikeResponseModel {

    @SerializedName("liked")
    private boolean liked;

    public boolean isLiked() {
        return this.liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
