package org.betup.model.remote.entity.achievements;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;

/* loaded from: classes2.dex */
public class NewAchievementsResponseModel {

    @SerializedName("items")
    private List<NewUserAchievementsModel> items;

    @SerializedName("summary")
    private NewAchievementSummaryModel summary;

    public List<NewUserAchievementsModel> getItems() {
        return this.items;
    }

    public void setItems(List<NewUserAchievementsModel> items) {
        this.items = items;
    }

    public NewAchievementSummaryModel getSummary() {
        return this.summary;
    }

    public void setSummary(NewAchievementSummaryModel summary) {
        this.summary = summary;
    }
}
