package org.betup.model.remote.entity.rank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class RankResponseModel {

    @SerializedName("user_rank")
    @Expose
    List<RankUserModel> nearUsers;

    @SerializedName("top_users")
    @Expose
    List<RankUserModel> topUsers;

    public List<RankUserModel> getTopUsers() {
        return this.topUsers;
    }

    public List<RankUserModel> getNearUsers() {
        return this.nearUsers;
    }
}
