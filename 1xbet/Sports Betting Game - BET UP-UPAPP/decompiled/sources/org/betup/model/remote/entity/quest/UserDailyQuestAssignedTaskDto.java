package org.betup.model.remote.entity.quest;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserDailyQuestDtos.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jx\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lorg/betup/model/remote/entity/quest/UserDailyQuestAssignedTaskDto;", "", "id", "", "taskType", "progressCurrent", "", "progressTarget", "status", UnifiedMediationParams.KEY_ICON_URL, "name", "description", "rewardBetcoins", "", "navigationTarget", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTaskType", "getProgressCurrent", "()I", "getProgressTarget", "getStatus", "getIconUrl", "getName", "getDescription", "getRewardBetcoins", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNavigationTarget", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lorg/betup/model/remote/entity/quest/UserDailyQuestAssignedTaskDto;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserDailyQuestAssignedTaskDto {
    public static final int $stable = 0;

    @SerializedName("description")
    private final String description;

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private final String iconUrl;

    @SerializedName("id")
    private final String id;

    @SerializedName("name")
    private final String name;

    @SerializedName("navigationTarget")
    private final String navigationTarget;

    @SerializedName("progressCurrent")
    private final int progressCurrent;

    @SerializedName("progressTarget")
    private final int progressTarget;

    @SerializedName("rewardBetcoins")
    private final Long rewardBetcoins;

    @SerializedName("status")
    private final String status;

    @SerializedName("taskType")
    private final String taskType;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNavigationTarget() {
        return this.navigationTarget;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgressCurrent() {
        return this.progressCurrent;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProgressTarget() {
        return this.progressTarget;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    public final UserDailyQuestAssignedTaskDto copy(String id, String taskType, int progressCurrent, int progressTarget, String status, String iconUrl, String name, String description, Long rewardBetcoins, String navigationTarget) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        return new UserDailyQuestAssignedTaskDto(id, taskType, progressCurrent, progressTarget, status, iconUrl, name, description, rewardBetcoins, navigationTarget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDailyQuestAssignedTaskDto)) {
            return false;
        }
        UserDailyQuestAssignedTaskDto userDailyQuestAssignedTaskDto = (UserDailyQuestAssignedTaskDto) other;
        return Intrinsics.areEqual(this.id, userDailyQuestAssignedTaskDto.id) && Intrinsics.areEqual(this.taskType, userDailyQuestAssignedTaskDto.taskType) && this.progressCurrent == userDailyQuestAssignedTaskDto.progressCurrent && this.progressTarget == userDailyQuestAssignedTaskDto.progressTarget && Intrinsics.areEqual(this.status, userDailyQuestAssignedTaskDto.status) && Intrinsics.areEqual(this.iconUrl, userDailyQuestAssignedTaskDto.iconUrl) && Intrinsics.areEqual(this.name, userDailyQuestAssignedTaskDto.name) && Intrinsics.areEqual(this.description, userDailyQuestAssignedTaskDto.description) && Intrinsics.areEqual(this.rewardBetcoins, userDailyQuestAssignedTaskDto.rewardBetcoins) && Intrinsics.areEqual(this.navigationTarget, userDailyQuestAssignedTaskDto.navigationTarget);
    }

    public int hashCode() {
        int hashCode = ((((((((this.id.hashCode() * 31) + this.taskType.hashCode()) * 31) + Integer.hashCode(this.progressCurrent)) * 31) + Integer.hashCode(this.progressTarget)) * 31) + this.status.hashCode()) * 31;
        String str = this.iconUrl;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31;
        Long l = this.rewardBetcoins;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.navigationTarget;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UserDailyQuestAssignedTaskDto(id=" + this.id + ", taskType=" + this.taskType + ", progressCurrent=" + this.progressCurrent + ", progressTarget=" + this.progressTarget + ", status=" + this.status + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", description=" + this.description + ", rewardBetcoins=" + this.rewardBetcoins + ", navigationTarget=" + this.navigationTarget + ")";
    }

    public UserDailyQuestAssignedTaskDto(String id, String taskType, int i, int i2, String status, String str, String name, String description, Long l, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.taskType = taskType;
        this.progressCurrent = i;
        this.progressTarget = i2;
        this.status = status;
        this.iconUrl = str;
        this.name = name;
        this.description = description;
        this.rewardBetcoins = l;
        this.navigationTarget = str2;
    }

    public /* synthetic */ UserDailyQuestAssignedTaskDto(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, Long l, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, str3, str4, str5, str6, (i3 & 256) != 0 ? null : l, (i3 & 512) != 0 ? null : str7);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public final int getProgressCurrent() {
        return this.progressCurrent;
    }

    public final int getProgressTarget() {
        return this.progressTarget;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    public final String getNavigationTarget() {
        return this.navigationTarget;
    }
}
