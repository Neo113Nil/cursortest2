package org.betup.model.remote.entity.presentation;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserPresentationStateDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\""}, d2 = {"Lorg/betup/model/remote/entity/presentation/UserPresentationStateDto;", "", "campaignId", "", "viewsCount", "", "lastShownAt", "Ljava/util/Date;", "lastAction", "nextEligibleAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getCampaignId", "()Ljava/lang/String;", "getViewsCount", "()I", "getLastShownAt", "()Ljava/util/Date;", "getLastAction", "getNextEligibleAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserPresentationStateDto {
    public static final int $stable = 8;
    private final String campaignId;
    private final String lastAction;
    private final Date lastShownAt;
    private final Date nextEligibleAt;
    private final Date updatedAt;
    private final int viewsCount;

    public static /* synthetic */ UserPresentationStateDto copy$default(UserPresentationStateDto userPresentationStateDto, String str, int i, Date date, String str2, Date date2, Date date3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userPresentationStateDto.campaignId;
        }
        if ((i2 & 2) != 0) {
            i = userPresentationStateDto.viewsCount;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            date = userPresentationStateDto.lastShownAt;
        }
        Date date4 = date;
        if ((i2 & 8) != 0) {
            str2 = userPresentationStateDto.lastAction;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            date2 = userPresentationStateDto.nextEligibleAt;
        }
        Date date5 = date2;
        if ((i2 & 32) != 0) {
            date3 = userPresentationStateDto.updatedAt;
        }
        return userPresentationStateDto.copy(str, i3, date4, str3, date5, date3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getViewsCount() {
        return this.viewsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getLastShownAt() {
        return this.lastShownAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastAction() {
        return this.lastAction;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getNextEligibleAt() {
        return this.nextEligibleAt;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final UserPresentationStateDto copy(String campaignId, int viewsCount, Date lastShownAt, String lastAction, Date nextEligibleAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new UserPresentationStateDto(campaignId, viewsCount, lastShownAt, lastAction, nextEligibleAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPresentationStateDto)) {
            return false;
        }
        UserPresentationStateDto userPresentationStateDto = (UserPresentationStateDto) other;
        return Intrinsics.areEqual(this.campaignId, userPresentationStateDto.campaignId) && this.viewsCount == userPresentationStateDto.viewsCount && Intrinsics.areEqual(this.lastShownAt, userPresentationStateDto.lastShownAt) && Intrinsics.areEqual(this.lastAction, userPresentationStateDto.lastAction) && Intrinsics.areEqual(this.nextEligibleAt, userPresentationStateDto.nextEligibleAt) && Intrinsics.areEqual(this.updatedAt, userPresentationStateDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((this.campaignId.hashCode() * 31) + Integer.hashCode(this.viewsCount)) * 31;
        Date date = this.lastShownAt;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.lastAction;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date2 = this.nextEligibleAt;
        int hashCode4 = (hashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updatedAt;
        return hashCode4 + (date3 != null ? date3.hashCode() : 0);
    }

    public String toString() {
        return "UserPresentationStateDto(campaignId=" + this.campaignId + ", viewsCount=" + this.viewsCount + ", lastShownAt=" + this.lastShownAt + ", lastAction=" + this.lastAction + ", nextEligibleAt=" + this.nextEligibleAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public UserPresentationStateDto(String campaignId, int i, Date date, String str, Date date2, Date date3) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.campaignId = campaignId;
        this.viewsCount = i;
        this.lastShownAt = date;
        this.lastAction = str;
        this.nextEligibleAt = date2;
        this.updatedAt = date3;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final int getViewsCount() {
        return this.viewsCount;
    }

    public final Date getLastShownAt() {
        return this.lastShownAt;
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
