package org.betup.model.remote.entity.achievements;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class AchievementSummaryModel {

    @SerializedName("completedTasks")
    private int completedTasks;

    @SerializedName("totalBonus")
    private int totalBonus;

    @SerializedName("totalTasks")
    private int totalTasks;

    public int getTotalTasks() {
        return this.totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public int getCompletedTasks() {
        return this.completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public int getTotalBonus() {
        return this.totalBonus;
    }

    public void setTotalBonus(int totalBonus) {
        this.totalBonus = totalBonus;
    }
}
