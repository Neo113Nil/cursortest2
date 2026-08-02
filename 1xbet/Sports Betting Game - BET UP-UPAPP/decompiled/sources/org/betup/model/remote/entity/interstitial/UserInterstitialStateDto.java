package org.betup.model.remote.entity.interstitial;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialActionRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006+"}, d2 = {"Lorg/betup/model/remote/entity/interstitial/UserInterstitialStateDto;", "", "campaignId", "", "impressionsCount", "", "clicksCount", "todayImpressions", "lastShownAt", "Ljava/util/Date;", "lastClickAt", "lastAction", "nextEligibleAt", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IIILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getCampaignId", "()Ljava/lang/String;", "getImpressionsCount", "()I", "getClicksCount", "getTodayImpressions", "getLastShownAt", "()Ljava/util/Date;", "getLastClickAt", "getLastAction", "getNextEligibleAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserInterstitialStateDto {
    public static final int $stable = 8;
    private final String campaignId;
    private final int clicksCount;
    private final int impressionsCount;
    private final String lastAction;
    private final Date lastClickAt;
    private final Date lastShownAt;
    private final Date nextEligibleAt;
    private final int todayImpressions;
    private final Date updatedAt;

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImpressionsCount() {
        return this.impressionsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getClicksCount() {
        return this.clicksCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTodayImpressions() {
        return this.todayImpressions;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getLastShownAt() {
        return this.lastShownAt;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getLastClickAt() {
        return this.lastClickAt;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLastAction() {
        return this.lastAction;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getNextEligibleAt() {
        return this.nextEligibleAt;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final UserInterstitialStateDto copy(String campaignId, int impressionsCount, int clicksCount, int todayImpressions, Date lastShownAt, Date lastClickAt, String lastAction, Date nextEligibleAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new UserInterstitialStateDto(campaignId, impressionsCount, clicksCount, todayImpressions, lastShownAt, lastClickAt, lastAction, nextEligibleAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInterstitialStateDto)) {
            return false;
        }
        UserInterstitialStateDto userInterstitialStateDto = (UserInterstitialStateDto) other;
        return Intrinsics.areEqual(this.campaignId, userInterstitialStateDto.campaignId) && this.impressionsCount == userInterstitialStateDto.impressionsCount && this.clicksCount == userInterstitialStateDto.clicksCount && this.todayImpressions == userInterstitialStateDto.todayImpressions && Intrinsics.areEqual(this.lastShownAt, userInterstitialStateDto.lastShownAt) && Intrinsics.areEqual(this.lastClickAt, userInterstitialStateDto.lastClickAt) && Intrinsics.areEqual(this.lastAction, userInterstitialStateDto.lastAction) && Intrinsics.areEqual(this.nextEligibleAt, userInterstitialStateDto.nextEligibleAt) && Intrinsics.areEqual(this.updatedAt, userInterstitialStateDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((this.campaignId.hashCode() * 31) + Integer.hashCode(this.impressionsCount)) * 31) + Integer.hashCode(this.clicksCount)) * 31) + Integer.hashCode(this.todayImpressions)) * 31;
        Date date = this.lastShownAt;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.lastClickAt;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.lastAction;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Date date3 = this.nextEligibleAt;
        int hashCode5 = (hashCode4 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updatedAt;
        return hashCode5 + (date4 != null ? date4.hashCode() : 0);
    }

    public String toString() {
        return "UserInterstitialStateDto(campaignId=" + this.campaignId + ", impressionsCount=" + this.impressionsCount + ", clicksCount=" + this.clicksCount + ", todayImpressions=" + this.todayImpressions + ", lastShownAt=" + this.lastShownAt + ", lastClickAt=" + this.lastClickAt + ", lastAction=" + this.lastAction + ", nextEligibleAt=" + this.nextEligibleAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public UserInterstitialStateDto(String campaignId, int i, int i2, int i3, Date date, Date date2, String str, Date date3, Date date4) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.campaignId = campaignId;
        this.impressionsCount = i;
        this.clicksCount = i2;
        this.todayImpressions = i3;
        this.lastShownAt = date;
        this.lastClickAt = date2;
        this.lastAction = str;
        this.nextEligibleAt = date3;
        this.updatedAt = date4;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final int getImpressionsCount() {
        return this.impressionsCount;
    }

    public final int getClicksCount() {
        return this.clicksCount;
    }

    public final int getTodayImpressions() {
        return this.todayImpressions;
    }

    public final Date getLastShownAt() {
        return this.lastShownAt;
    }

    public final Date getLastClickAt() {
        return this.lastClickAt;
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
