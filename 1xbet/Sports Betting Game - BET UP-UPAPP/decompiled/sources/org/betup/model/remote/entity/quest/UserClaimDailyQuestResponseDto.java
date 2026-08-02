package org.betup.model.remote.entity.quest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserDailyQuestDtos.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/quest/UserClaimDailyQuestResponseDto;", "", "quest", "Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "newBalance", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;J)V", "getQuest", "()Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "getNewBalance", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserClaimDailyQuestResponseDto {
    public static final int $stable = 8;

    @SerializedName("newBalance")
    private final long newBalance;

    @SerializedName("quest")
    private final UserDailyQuestInstanceDto quest;

    public static /* synthetic */ UserClaimDailyQuestResponseDto copy$default(UserClaimDailyQuestResponseDto userClaimDailyQuestResponseDto, UserDailyQuestInstanceDto userDailyQuestInstanceDto, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            userDailyQuestInstanceDto = userClaimDailyQuestResponseDto.quest;
        }
        if ((i & 2) != 0) {
            j = userClaimDailyQuestResponseDto.newBalance;
        }
        return userClaimDailyQuestResponseDto.copy(userDailyQuestInstanceDto, j);
    }

    /* renamed from: component1, reason: from getter */
    public final UserDailyQuestInstanceDto getQuest() {
        return this.quest;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNewBalance() {
        return this.newBalance;
    }

    public final UserClaimDailyQuestResponseDto copy(UserDailyQuestInstanceDto quest, long newBalance) {
        Intrinsics.checkNotNullParameter(quest, "quest");
        return new UserClaimDailyQuestResponseDto(quest, newBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserClaimDailyQuestResponseDto)) {
            return false;
        }
        UserClaimDailyQuestResponseDto userClaimDailyQuestResponseDto = (UserClaimDailyQuestResponseDto) other;
        return Intrinsics.areEqual(this.quest, userClaimDailyQuestResponseDto.quest) && this.newBalance == userClaimDailyQuestResponseDto.newBalance;
    }

    public int hashCode() {
        return (this.quest.hashCode() * 31) + Long.hashCode(this.newBalance);
    }

    public String toString() {
        return "UserClaimDailyQuestResponseDto(quest=" + this.quest + ", newBalance=" + this.newBalance + ")";
    }

    public UserClaimDailyQuestResponseDto(UserDailyQuestInstanceDto quest, long j) {
        Intrinsics.checkNotNullParameter(quest, "quest");
        this.quest = quest;
        this.newBalance = j;
    }

    public final UserDailyQuestInstanceDto getQuest() {
        return this.quest;
    }

    public final long getNewBalance() {
        return this.newBalance;
    }
}
