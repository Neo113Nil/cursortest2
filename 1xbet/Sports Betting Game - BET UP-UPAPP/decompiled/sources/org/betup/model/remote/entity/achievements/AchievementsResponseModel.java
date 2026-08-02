package org.betup.model.remote.entity.achievements;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class AchievementsResponseModel {

    @SerializedName("items")
    private List<AchievementsDataModel> items;

    @SerializedName("summary")
    private AchievementSummaryModel summary;

    public List<AchievementsDataModel> getItems() {
        return this.items;
    }

    public void setItems(List<AchievementsDataModel> items) {
        this.items = items;
    }

    public AchievementSummaryModel getSummary() {
        return this.summary;
    }

    public void setSummary(AchievementSummaryModel summary) {
        this.summary = summary;
    }
}
