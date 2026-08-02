package org.betup.model.remote.entity.missions;

import com.google.gson.annotations.SerializedName;
import com.ironsource.X3;

/* loaded from: classes2.dex */
public class MissionTaskModel {

    @SerializedName("current_progress")
    private float currentProgress;

    @SerializedName(X3.i.H0)
    private String icon;

    @SerializedName("id")
    private Long id;

    @SerializedName("max_progress")
    private float maxProgress;

    @SerializedName("odds")
    private Float odds;

    @SerializedName("title")
    private String title;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public float getCurrentProgress() {
        return this.currentProgress;
    }

    public void setCurrentProgress(float currentProgress) {
        this.currentProgress = currentProgress;
    }

    public float getMaxProgress() {
        return this.maxProgress;
    }

    public void setMaxProgress(float maxProgress) {
        this.maxProgress = maxProgress;
    }

    public Float getOdds() {
        return this.odds;
    }

    public void setOdds(Float odds) {
        this.odds = odds;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return Math.abs(this.maxProgress - this.currentProgress) < 0.1f;
    }
}
