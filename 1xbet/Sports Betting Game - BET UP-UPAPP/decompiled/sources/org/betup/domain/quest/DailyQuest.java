package org.betup.domain.quest;

import com.ironsource.C3473f8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyQuestModels.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\u0013\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\"¨\u00064"}, d2 = {"Lorg/betup/domain/quest/DailyQuest;", "", "id", "", "title", "description", "coverImageUrl", "rewardBetcoins", "", "status", "Lorg/betup/domain/quest/DailyQuestStatus;", "expiresAtEpochMs", "tasks", "", "Lorg/betup/domain/quest/DailyQuestTask;", "rewardClaimed", "", "isClaimable", C3473f8.k, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLorg/betup/domain/quest/DailyQuestStatus;JLjava/util/List;ZZZ)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getCoverImageUrl", "getRewardBetcoins", "()J", "getStatus", "()Lorg/betup/domain/quest/DailyQuestStatus;", "getExpiresAtEpochMs", "getTasks", "()Ljava/util/List;", "getRewardClaimed", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DailyQuest {
    public static final int $stable = 8;
    private final String coverImageUrl;
    private final String description;
    private final long expiresAtEpochMs;
    private final String id;
    private final boolean isClaimable;
    private final boolean isVisible;
    private final long rewardBetcoins;
    private final boolean rewardClaimed;
    private final DailyQuestStatus status;
    private final List<DailyQuestTask> tasks;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsClaimable() {
        return this.isClaimable;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    /* renamed from: component6, reason: from getter */
    public final DailyQuestStatus getStatus() {
        return this.status;
    }

    /* renamed from: component7, reason: from getter */
    public final long getExpiresAtEpochMs() {
        return this.expiresAtEpochMs;
    }

    public final List<DailyQuestTask> component8() {
        return this.tasks;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getRewardClaimed() {
        return this.rewardClaimed;
    }

    public final DailyQuest copy(String id, String title, String description, String coverImageUrl, long rewardBetcoins, DailyQuestStatus status, long expiresAtEpochMs, List<DailyQuestTask> tasks, boolean rewardClaimed, boolean isClaimable, boolean isVisible) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        return new DailyQuest(id, title, description, coverImageUrl, rewardBetcoins, status, expiresAtEpochMs, tasks, rewardClaimed, isClaimable, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyQuest)) {
            return false;
        }
        DailyQuest dailyQuest = (DailyQuest) other;
        return Intrinsics.areEqual(this.id, dailyQuest.id) && Intrinsics.areEqual(this.title, dailyQuest.title) && Intrinsics.areEqual(this.description, dailyQuest.description) && Intrinsics.areEqual(this.coverImageUrl, dailyQuest.coverImageUrl) && this.rewardBetcoins == dailyQuest.rewardBetcoins && this.status == dailyQuest.status && this.expiresAtEpochMs == dailyQuest.expiresAtEpochMs && Intrinsics.areEqual(this.tasks, dailyQuest.tasks) && this.rewardClaimed == dailyQuest.rewardClaimed && this.isClaimable == dailyQuest.isClaimable && this.isVisible == dailyQuest.isVisible;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str = this.coverImageUrl;
        return ((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.rewardBetcoins)) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.expiresAtEpochMs)) * 31) + this.tasks.hashCode()) * 31) + Boolean.hashCode(this.rewardClaimed)) * 31) + Boolean.hashCode(this.isClaimable)) * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "DailyQuest(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", coverImageUrl=" + this.coverImageUrl + ", rewardBetcoins=" + this.rewardBetcoins + ", status=" + this.status + ", expiresAtEpochMs=" + this.expiresAtEpochMs + ", tasks=" + this.tasks + ", rewardClaimed=" + this.rewardClaimed + ", isClaimable=" + this.isClaimable + ", isVisible=" + this.isVisible + ")";
    }

    public DailyQuest(String id, String title, String description, String str, long j, DailyQuestStatus status, long j2, List<DailyQuestTask> tasks, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.id = id;
        this.title = title;
        this.description = description;
        this.coverImageUrl = str;
        this.rewardBetcoins = j;
        this.status = status;
        this.expiresAtEpochMs = j2;
        this.tasks = tasks;
        this.rewardClaimed = z;
        this.isClaimable = z2;
        this.isVisible = z3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final long getRewardBetcoins() {
        return this.rewardBetcoins;
    }

    public final DailyQuestStatus getStatus() {
        return this.status;
    }

    public final long getExpiresAtEpochMs() {
        return this.expiresAtEpochMs;
    }

    public final List<DailyQuestTask> getTasks() {
        return this.tasks;
    }

    public final boolean getRewardClaimed() {
        return this.rewardClaimed;
    }

    public final boolean isClaimable() {
        return this.isClaimable;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
