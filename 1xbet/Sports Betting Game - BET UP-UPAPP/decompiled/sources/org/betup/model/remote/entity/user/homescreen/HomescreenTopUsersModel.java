package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.rank.RankUpdateModel;
import org.betup.model.remote.entity.rank.RankUserModel;

/* loaded from: classes2.dex */
public class HomescreenTopUsersModel {

    @SerializedName("user_of_day_prize")
    private int dayPrize;

    @SerializedName("user_of_day_icon")
    @Expose
    private String rewardIcon;

    @SerializedName("top_users")
    @Expose
    private List<RankUserModel> topUsers = new ArrayList();

    @SerializedName("user_of_day_updates")
    private RankUpdateModel updates;

    @SerializedName("users_of_day")
    @Expose
    private HomeScreenUserOfTheDayDataModel usersOfDay;

    public List<RankUserModel> getTopUsers() {
        return this.topUsers;
    }

    public void setTopUsers(List<RankUserModel> topUsers) {
        this.topUsers = topUsers;
    }

    public HomeScreenUserOfTheDayDataModel getUsersOfDay() {
        return this.usersOfDay;
    }

    public void setUsersOfDay(HomeScreenUserOfTheDayDataModel usersOfDay) {
        this.usersOfDay = usersOfDay;
    }

    public String getRewardIcon() {
        return this.rewardIcon;
    }

    public void setRewardIcon(String rewardIcon) {
        this.rewardIcon = rewardIcon;
    }

    public int getDayPrize() {
        return this.dayPrize;
    }

    public void setDayPrize(int dayPrize) {
        this.dayPrize = dayPrize;
    }

    public RankUpdateModel getUpdates() {
        return this.updates;
    }

    public void setUpdates(RankUpdateModel updates) {
        this.updates = updates;
    }
}
