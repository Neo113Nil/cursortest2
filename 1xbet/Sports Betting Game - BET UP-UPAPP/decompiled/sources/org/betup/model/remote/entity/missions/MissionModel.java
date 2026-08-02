package org.betup.model.remote.entity.missions;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class MissionModel {

    @SerializedName("current_progress")
    private float currentProgress;

    @SerializedName("displayed_number")
    private Long displayedNumber;

    @SerializedName("header_icon")
    private String headerIcon;

    @SerializedName("id")
    private Long id;

    @SerializedName("rewards")
    private List<MissionRewardModel> rewards;

    @SerializedName("state")
    private MissionState state;

    @SerializedName("tasks")
    private List<MissionTaskModel> tasks;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDisplayedNumber() {
        return this.displayedNumber;
    }

    public void setDisplayedNumber(Long displayedNumber) {
        this.displayedNumber = displayedNumber;
    }

    public MissionState getState() {
        return this.state;
    }

    public void setState(MissionState state) {
        this.state = state;
    }

    public List<MissionTaskModel> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<MissionTaskModel> tasks) {
        this.tasks = tasks;
    }

    public float getCurrentProgress() {
        return this.currentProgress;
    }

    public void setCurrentProgress(float currentProgress) {
        this.currentProgress = currentProgress;
    }

    public String getHeaderIcon() {
        return this.headerIcon;
    }

    public void setHeaderIcon(String headerIcon) {
        this.headerIcon = headerIcon;
    }

    public List<MissionRewardModel> getRewards() {
        return this.rewards;
    }

    public void setRewards(List<MissionRewardModel> rewards) {
        this.rewards = rewards;
    }

    public MissionRewardModel getRewardOfType(MissionRewardType rewardType) {
        List<MissionRewardModel> list = this.rewards;
        if (list == null) {
            return null;
        }
        for (MissionRewardModel missionRewardModel : list) {
            if (missionRewardModel.getType() == rewardType) {
                return missionRewardModel;
            }
        }
        return null;
    }

    public boolean canBeCompleted() {
        return this.state == MissionState.ACTIVE && Math.abs(this.currentProgress - 1.0f) < 0.01f;
    }

    public boolean isFirstMissionBeginning() {
        return this.id.longValue() == 1 && this.state == MissionState.NEXT;
    }
}
