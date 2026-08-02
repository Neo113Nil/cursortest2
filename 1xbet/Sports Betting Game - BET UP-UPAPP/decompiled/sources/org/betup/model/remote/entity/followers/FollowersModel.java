package org.betup.model.remote.entity.followers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class FollowersModel {

    @SerializedName("continuationToken")
    @Expose
    private String continuationToken;

    @SerializedName("users")
    @Expose
    private List<UserFollower> users;

    public List<UserFollower> getUsers() {
        return this.users;
    }

    public void setUsers(List<UserFollower> response) {
        this.users = response;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }
}
