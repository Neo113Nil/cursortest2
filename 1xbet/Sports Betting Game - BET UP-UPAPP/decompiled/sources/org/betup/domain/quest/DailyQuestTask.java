package org.betup.domain.quest;

import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyQuestModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\"J\u0082\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\tHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lorg/betup/domain/quest/DailyQuestTask;", "", "id", "", "name", "description", "taskType", "navigationTarget", "progressCurrent", "", "progressTarget", "status", "Lorg/betup/domain/quest/DailyQuestTaskStatus;", UnifiedMediationParams.KEY_ICON_URL, "isCompleted", "", "rewardBetcoins", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILorg/betup/domain/quest/DailyQuestTaskStatus;Ljava/lang/String;ZLjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getTaskType", "getNavigationTarget", "getProgressCurrent", "()I", "getProgressTarget", "getStatus", "()Lorg/betup/domain/quest/DailyQuestTaskStatus;", "getIconUrl", "()Z", "getRewardBetcoins", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILorg/betup/domain/quest/DailyQuestTaskStatus;Ljava/lang/String;ZLjava/lang/Long;)Lorg/betup/domain/quest/DailyQuestTask;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DailyQuestTask {
    public static final int $stable = 0;
    private final String description;
    private final String iconUrl;
    private final String id;
    private final boolean isCompleted;
    private final String name;
    private final String navigationTarget;
    private final int progressCurrent;
    private final int progressTarget;
    private final Long rewardBetcoins;
    private final DailyQuestTaskStatus status;
    private final String taskType;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNavigationTarget() {
        return this.navigationTarget;
    }

    /* renamed from: component6, reason: from getter */
    public final int getProgressCurrent() {
        return this.progressCurrent;
    }

    /* renamed from: component7, reason: from getter */
    public final int getProgressTarget() {
        return this.progressTarget;
    }

    /* renamed from: component8, reason: from getter */
    public final DailyQuestTaskStatus getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final DailyQuestTask copy(String id, String name, String description, String taskType, String navigationTarget, int progressCurrent, int progressTarget, DailyQuestTaskStatus status, String iconUrl, boolean isCompleted, Long rewardBetcoins) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        Intrinsics.checkNotNullParameter(status, "status");
        return new DailyQuestTask(id, name, description, taskType, navigationTarget, progressCurrent, progressTarget, status, iconUrl, isCompleted, rewardBetcoins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyQuestTask)) {
            return false;
        }
        DailyQuestTask dailyQuestTask = (DailyQuestTask) other;
        return Intrinsics.areEqual(this.id, dailyQuestTask.id) && Intrinsics.areEqual(this.name, dailyQuestTask.name) && Intrinsics.areEqual(this.description, dailyQuestTask.description) && Intrinsics.areEqual(this.taskType, dailyQuestTask.taskType) && Intrinsics.areEqual(this.navigationTarget, dailyQuestTask.navigationTarget) && this.progressCurrent == dailyQuestTask.progressCurrent && this.progressTarget == dailyQuestTask.progressTarget && this.status == dailyQuestTask.status && Intrinsics.areEqual(this.iconUrl, dailyQuestTask.iconUrl) && this.isCompleted == dailyQuestTask.isCompleted && Intrinsics.areEqual(this.rewardBetcoins, dailyQuestTask.rewardBetcoins);
    }

    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.taskType.hashCode()) * 31;
        String str = this.navigationTarget;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.progressCurrent)) * 31) + Integer.hashCode(this.progressTarget)) * 31) + this.status.hashCode()) * 31;
        String str2 = this.iconUrl;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isCompleted)) * 31;
        Long l = this.rewardBetcoins;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "DailyQuestTask(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", taskType=" + this.taskType + ", navigationTarget=" + this.navigationTarget + ", progressCurrent=" + this.progressCurrent + ", progressTarget=" + this.progressTarget + ", status=" + this.status + ", iconUrl=" + this.iconUrl + ", isCompleted=" + this.isCompleted + ", rewardBetcoins=" + this.rewardBetcoins + ")";
    }

    public DailyQuestTask(String id, String name, String description, String taskType, String str, int i, int i2, DailyQuestTaskStatus status, String str2, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.name = name;
        this.description = description;
        this.taskType = taskType;
        this.navigationTarget = str;
        this.progressCurrent = i;
        this.progressTarget = i2;
        this.status = status;
        this.iconUrl = str2;
        this.isCompleted = z;
        this.rewardBetcoins = l;
    }

    public /* synthetic */ DailyQuestTask(String str, String str2, String str3, String str4, String str5, int i, int i2, DailyQuestTaskStatus dailyQuestTaskStatus, String str6, boolean z, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i3 & 16) != 0 ? null : str5, i, i2, dailyQuestTaskStatus, str6, z, (i3 & 1024) != 0 ? null : l);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public final String getNavigationTarget() {
        return this.navigationTarget;
    }

    public final int getProgressCurrent() {
        return this.progressCurrent;
    }

    public final int getProgressTarget() {
        return this.progressTarget;
    }

    public final DailyQuestTaskStatus getStatus() {
        return this.status;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final Long getRewardBetcoins() {
        return this.rewardBetcoins;
    }
}
