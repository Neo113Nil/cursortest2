package org.betup.model.remote.entity.rewardedprompt;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptDtos.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u008d\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001c¨\u00064"}, d2 = {"Lorg/betup/model/remote/entity/rewardedprompt/UserRewardedPromptStateDto;", "", "campaignId", "", "impressionsCount", "", "dismissalsCount", "watchStartsCount", "watchCompletesCount", "todayImpressions", "lastShownAt", "Ljava/util/Date;", "lastDismissAt", "lastWatchAt", "lastAction", "nextEligibleAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IIIIILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getCampaignId", "()Ljava/lang/String;", "getImpressionsCount", "()I", "getDismissalsCount", "getWatchStartsCount", "getWatchCompletesCount", "getTodayImpressions", "getLastShownAt", "()Ljava/util/Date;", "getLastDismissAt", "getLastWatchAt", "getLastAction", "getNextEligibleAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserRewardedPromptStateDto {
    public static final int $stable = 8;
    private final String campaignId;
    private final int dismissalsCount;
    private final int impressionsCount;
    private final String lastAction;
    private final Date lastDismissAt;
    private final Date lastShownAt;
    private final Date lastWatchAt;
    private final Date nextEligibleAt;
    private final int todayImpressions;
    private final Date updatedAt;
    private final int watchCompletesCount;
    private final int watchStartsCount;

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLastAction() {
        return this.lastAction;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getNextEligibleAt() {
        return this.nextEligibleAt;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImpressionsCount() {
        return this.impressionsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDismissalsCount() {
        return this.dismissalsCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWatchStartsCount() {
        return this.watchStartsCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWatchCompletesCount() {
        return this.watchCompletesCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTodayImpressions() {
        return this.todayImpressions;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getLastShownAt() {
        return this.lastShownAt;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getLastDismissAt() {
        return this.lastDismissAt;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getLastWatchAt() {
        return this.lastWatchAt;
    }

    public final UserRewardedPromptStateDto copy(String campaignId, int impressionsCount, int dismissalsCount, int watchStartsCount, int watchCompletesCount, int todayImpressions, Date lastShownAt, Date lastDismissAt, Date lastWatchAt, String lastAction, Date nextEligibleAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new UserRewardedPromptStateDto(campaignId, impressionsCount, dismissalsCount, watchStartsCount, watchCompletesCount, todayImpressions, lastShownAt, lastDismissAt, lastWatchAt, lastAction, nextEligibleAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRewardedPromptStateDto)) {
            return false;
        }
        UserRewardedPromptStateDto userRewardedPromptStateDto = (UserRewardedPromptStateDto) other;
        return Intrinsics.areEqual(this.campaignId, userRewardedPromptStateDto.campaignId) && this.impressionsCount == userRewardedPromptStateDto.impressionsCount && this.dismissalsCount == userRewardedPromptStateDto.dismissalsCount && this.watchStartsCount == userRewardedPromptStateDto.watchStartsCount && this.watchCompletesCount == userRewardedPromptStateDto.watchCompletesCount && this.todayImpressions == userRewardedPromptStateDto.todayImpressions && Intrinsics.areEqual(this.lastShownAt, userRewardedPromptStateDto.lastShownAt) && Intrinsics.areEqual(this.lastDismissAt, userRewardedPromptStateDto.lastDismissAt) && Intrinsics.areEqual(this.lastWatchAt, userRewardedPromptStateDto.lastWatchAt) && Intrinsics.areEqual(this.lastAction, userRewardedPromptStateDto.lastAction) && Intrinsics.areEqual(this.nextEligibleAt, userRewardedPromptStateDto.nextEligibleAt) && Intrinsics.areEqual(this.updatedAt, userRewardedPromptStateDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.campaignId.hashCode() * 31) + Integer.hashCode(this.impressionsCount)) * 31) + Integer.hashCode(this.dismissalsCount)) * 31) + Integer.hashCode(this.watchStartsCount)) * 31) + Integer.hashCode(this.watchCompletesCount)) * 31) + Integer.hashCode(this.todayImpressions)) * 31;
        Date date = this.lastShownAt;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.lastDismissAt;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.lastWatchAt;
        int hashCode4 = (hashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str = this.lastAction;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Date date4 = this.nextEligibleAt;
        int hashCode6 = (hashCode5 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.updatedAt;
        return hashCode6 + (date5 != null ? date5.hashCode() : 0);
    }

    public String toString() {
        return "UserRewardedPromptStateDto(campaignId=" + this.campaignId + ", impressionsCount=" + this.impressionsCount + ", dismissalsCount=" + this.dismissalsCount + ", watchStartsCount=" + this.watchStartsCount + ", watchCompletesCount=" + this.watchCompletesCount + ", todayImpressions=" + this.todayImpressions + ", lastShownAt=" + this.lastShownAt + ", lastDismissAt=" + this.lastDismissAt + ", lastWatchAt=" + this.lastWatchAt + ", lastAction=" + this.lastAction + ", nextEligibleAt=" + this.nextEligibleAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public UserRewardedPromptStateDto(String campaignId, int i, int i2, int i3, int i4, int i5, Date date, Date date2, Date date3, String str, Date date4, Date date5) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.campaignId = campaignId;
        this.impressionsCount = i;
        this.dismissalsCount = i2;
        this.watchStartsCount = i3;
        this.watchCompletesCount = i4;
        this.todayImpressions = i5;
        this.lastShownAt = date;
        this.lastDismissAt = date2;
        this.lastWatchAt = date3;
        this.lastAction = str;
        this.nextEligibleAt = date4;
        this.updatedAt = date5;
    }

    public /* synthetic */ UserRewardedPromptStateDto(String str, int i, int i2, int i3, int i4, int i5, Date date, Date date2, Date date3, String str2, Date date4, Date date5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) == 0 ? i5 : 0, (i6 & 64) != 0 ? null : date, (i6 & 128) != 0 ? null : date2, (i6 & 256) != 0 ? null : date3, (i6 & 512) != 0 ? null : str2, (i6 & 1024) != 0 ? null : date4, (i6 & 2048) == 0 ? date5 : null);
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final int getImpressionsCount() {
        return this.impressionsCount;
    }

    public final int getDismissalsCount() {
        return this.dismissalsCount;
    }

    public final int getWatchStartsCount() {
        return this.watchStartsCount;
    }

    public final int getWatchCompletesCount() {
        return this.watchCompletesCount;
    }

    public final int getTodayImpressions() {
        return this.todayImpressions;
    }

    public final Date getLastShownAt() {
        return this.lastShownAt;
    }

    public final Date getLastDismissAt() {
        return this.lastDismissAt;
    }

    public final Date getLastWatchAt() {
        return this.lastWatchAt;
    }

    public final String getLastAction() {
        return this.lastAction;
    }

    public final Date getNextEligibleAt() {
        return this.nextEligibleAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }
}
