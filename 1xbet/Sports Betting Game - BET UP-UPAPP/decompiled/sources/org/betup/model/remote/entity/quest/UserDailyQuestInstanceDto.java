package org.betup.model.remote.entity.quest;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserDailyQuestDtos.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u008d\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\u0013\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001f¨\u00069"}, d2 = {"Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "", "id", "", "coverImageUrl", "rewardBetcoins", "", "title", "description", "status", "expiresAt", "Ljava/util/Date;", "tasks", "", "Lorg/betup/model/remote/entity/quest/UserDailyQuestAssignedTaskDto;", "rewardClaimed", "", "claimedAt", "createdAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getCoverImageUrl", "getRewardBetcoins", "()J", "getTitle", "getDescription", "getStatus", "getExpiresAt", "()Ljava/util/Date;", "getTasks", "()Ljava/util/List;", "getRewardClaimed", "()Z", "getClaimedAt", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserDailyQuestInstanceDto {
    public static final int $stable = 8;

    @SerializedName("claimedAt")
    private final Date claimedAt;

    @SerializedName("coverImageUrl")
    private final String coverImageUrl;

    @SerializedName("createdAt")
    private final Date createdAt;

    @SerializedName("description")
    private final String description;

    @SerializedName("expiresAt")
    private final Date expiresAt;

    @SerializedName("id")
    private final String id;

    @SerializedName("rewardBetcoins")
    private final long rewardBetcoins;

    @SerializedName("rewardClaimed")
    private final boolean rewardClaimed;

    @SerializedName("status")
    private final String status;

    @SerializedName("tasks")
    private final List<UserDailyQuestAssignedTaskDto> tasks;

    @SerializedName("title")
    private final String title;

    @SerializedName("updatedAt")
    private final Date updatedAt;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getClaimedAt() {
        return this.claimedAt;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final List<UserDailyQuestAssignedTaskDto> component8() {
        return this.tasks;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getRewardClaimed() {
        return this.rewardClaimed;
    }

    public final UserDailyQuestInstanceDto copy(String id, String coverImageUrl, long rewardBetcoins, String title, String description, String status, Date expiresAt, List<UserDailyQuestAssignedTaskDto> tasks, boolean rewardClaimed, Date claimedAt, Date createdAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new UserDailyQuestInstanceDto(id, coverImageUrl, rewardBetcoins, title, description, status, expiresAt, tasks, rewardClaimed, claimedAt, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDailyQuestInstanceDto)) {
            return false;
        }
        UserDailyQuestInstanceDto userDailyQuestInstanceDto = (UserDailyQuestInstanceDto) other;
        return Intrinsics.areEqual(this.id, userDailyQuestInstanceDto.id) && Intrinsics.areEqual(this.coverImageUrl, userDailyQuestInstanceDto.coverImageUrl) && this.rewardBetcoins == userDailyQuestInstanceDto.rewardBetcoins && Intrinsics.areEqual(this.title, userDailyQuestInstanceDto.title) && Intrinsics.areEqual(this.description, userDailyQuestInstanceDto.description) && Intrinsics.areEqual(this.status, userDailyQuestInstanceDto.status) && Intrinsics.areEqual(this.expiresAt, userDailyQuestInstanceDto.expiresAt) && Intrinsics.areEqual(this.tasks, userDailyQuestInstanceDto.tasks) && this.rewardClaimed == userDailyQuestInstanceDto.rewardClaimed && Intrinsics.areEqual(this.claimedAt, userDailyQuestInstanceDto.claimedAt) && Intrinsics.areEqual(this.createdAt, userDailyQuestInstanceDto.createdAt) && Intrinsics.areEqual(this.updatedAt, userDailyQuestInstanceDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.coverImageUrl;
        int hashCode2 = (((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.rewardBetcoins)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.status.hashCode()) * 31) + this.expiresAt.hashCode()) * 31) + this.tasks.hashCode()) * 31) + Boolean.hashCode(this.rewardClaimed)) * 31;
        Date date = this.claimedAt;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdAt;
        return ((hashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        return "UserDailyQuestInstanceDto(id=" + this.id + ", coverImageUrl=" + this.coverImageUrl + ", rewardBetcoins=" + this.rewardBetcoins + ", title=" + this.title + ", description=" + this.description + ", status=" + this.status + ", expiresAt=" + this.expiresAt + ", tasks=" + this.tasks + ", rewardClaimed=" + this.rewardClaimed + ", claimedAt=" + this.claimedAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public UserDailyQuestInstanceDto(String id, String str, long j, String title, String description, String status, Date expiresAt, List<UserDailyQuestAssignedTaskDto> tasks, boolean z, Date date, Date date2, Date updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.id = id;
        this.coverImageUrl = str;
        this.rewardBetcoins = j;
        this.title = title;
        this.description = description;
        this.status = status;
        this.expiresAt = expiresAt;
        this.tasks = tasks;
        this.rewardClaimed = z;
        this.claimedAt = date;
        this.createdAt = date2;
        this.updatedAt = updatedAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final List<UserDailyQuestAssignedTaskDto> getTasks() {
        return this.tasks;
    }

    public final boolean getRewardClaimed() {
        return this.rewardClaimed;
    }

    public final Date getClaimedAt() {
        return this.claimedAt;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }
}
