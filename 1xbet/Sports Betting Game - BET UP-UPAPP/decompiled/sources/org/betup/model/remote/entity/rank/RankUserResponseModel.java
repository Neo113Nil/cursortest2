package org.betup.model.remote.entity.rank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class RankUserResponseModel {

    @SerializedName("day")
    @Expose
    private List<RankUserModel> day;

    @SerializedName("month")
    @Expose
    private List<RankUserModel> month;

    @SerializedName("week")
    @Expose
    private List<RankUserModel> week;

    public List<RankUserModel> getWeek() {
        return this.week;
    }

    public void setWeek(List<RankUserModel> week) {
        this.week = week;
    }

    public List<RankUserModel> getMonth() {
        return this.month;
    }

    public void setMonth(List<RankUserModel> month) {
        this.month = month;
    }

    public List<RankUserModel> getDay() {
        return this.day;
    }

    public void setDay(List<RankUserModel> day) {
        this.day = day;
    }
}
