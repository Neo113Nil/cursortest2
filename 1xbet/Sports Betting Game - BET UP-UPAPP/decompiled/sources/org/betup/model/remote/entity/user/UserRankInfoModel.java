package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserRankInfoModel {

    @SerializedName("change")
    private double change;

    @SerializedName("change_day")
    private double changeDay;

    @SerializedName("change_month")
    private double changeMonth;

    @SerializedName("change_week")
    private double changeWeek;

    @SerializedName("rank")
    private int rank;

    @SerializedName("rank_day")
    private int rankDay;

    @SerializedName("rank_month")
    private int rankMonth;

    @SerializedName("rank_week")
    private int rankWeek;

    @SerializedName("roi")
    private double roi;

    @SerializedName("roi_day")
    private double roiDay;

    @SerializedName("roi_month")
    private double roiMonth;

    @SerializedName("roi_week")
    private double roiWeek;

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRankDay() {
        return this.rankDay;
    }

    public void setRankDay(int rankDay) {
        this.rankDay = rankDay;
    }

    public int getRankMonth() {
        return this.rankMonth;
    }

    public void setRankMonth(int rankMonth) {
        this.rankMonth = rankMonth;
    }

    public double getRoiDay() {
        return this.roiDay;
    }

    public void setRoiDay(double roiDay) {
        this.roiDay = roiDay;
    }

    public double getRoiMonth() {
        return this.roiMonth;
    }

    public void setRoiMonth(double roiMonth) {
        this.roiMonth = roiMonth;
    }

    public double getRoi() {
        return this.roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getChange() {
        return this.change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getChangeDay() {
        return this.changeDay;
    }

    public void setChangeDay(double changeDay) {
        this.changeDay = changeDay;
    }

    public double getChangeMonth() {
        return this.changeMonth;
    }

    public void setChangeMonth(double changeMonth) {
        this.changeMonth = changeMonth;
    }

    public int getRankWeek() {
        return this.rankWeek;
    }

    public void setRankWeek(int rankWeek) {
        this.rankWeek = rankWeek;
    }

    public double getRoiWeek() {
        return this.roiWeek;
    }

    public void setRoiWeek(double roiWeek) {
        this.roiWeek = roiWeek;
    }

    public double getChangeWeek() {
        return this.changeWeek;
    }

    public void setChangeWeek(double changeWeek) {
        this.changeWeek = changeWeek;
    }
}
