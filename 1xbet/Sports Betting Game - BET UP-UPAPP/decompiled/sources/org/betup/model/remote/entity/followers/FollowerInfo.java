package org.betup.model.remote.entity.followers;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class FollowerInfo {

    @SerializedName("followers_count")
    private int followersCount;

    @SerializedName("is_followed")
    private boolean isFollowed;

    public int getFollowersCount() {
        return this.followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public boolean isFollowed() {
        return this.isFollowed;
    }

    public void setFollowed(boolean followed) {
        this.isFollowed = followed;
    }
}
