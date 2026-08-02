package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeVideoBonusUiState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u0007J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J`\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\nHÖ\u0001J\t\u00101\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u00062"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "", "adsActive", "", "availabilityPhase", "Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "adsAmount", "", "displayPrizeAmount", "usedInInterval", "", "maxPerInterval", "cooldownEndsAtEpochMs", "isActionLoading", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZLorg/betup/ui/common/video/VideoOfferAvailabilityPhase;JJIILjava/lang/Long;Z)V", "getAdsActive", "()Z", "getAvailabilityPhase", "()Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "getAdsAmount", "()J", "getDisplayPrizeAmount", "getUsedInInterval", "()I", "getMaxPerInterval", "getCooldownEndsAtEpochMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "limitReached", "getLimitReached", "isOnCooldown", "nowMs", "showQuota", "quotaLabel", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLorg/betup/ui/common/video/VideoOfferAvailabilityPhase;JJIILjava/lang/Long;Z)Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeVideoBonusUiState {
    public static final int $stable = 0;
    private final boolean adsActive;
    private final long adsAmount;
    private final VideoOfferAvailabilityPhase availabilityPhase;
    private final Long cooldownEndsAtEpochMs;
    private final long displayPrizeAmount;
    private final boolean isActionLoading;
    private final int maxPerInterval;
    private final int usedInInterval;

    public HomeVideoBonusUiState() {
        this(false, null, 0L, 0L, 0, 0, null, false, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAdsActive() {
        return this.adsActive;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoOfferAvailabilityPhase getAvailabilityPhase() {
        return this.availabilityPhase;
    }

    /* renamed from: component3, reason: from getter */
    public final long getAdsAmount() {
        return this.adsAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDisplayPrizeAmount() {
        return this.displayPrizeAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUsedInInterval() {
        return this.usedInInterval;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxPerInterval() {
        return this.maxPerInterval;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getCooldownEndsAtEpochMs() {
        return this.cooldownEndsAtEpochMs;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsActionLoading() {
        return this.isActionLoading;
    }

    public final HomeVideoBonusUiState copy(boolean adsActive, VideoOfferAvailabilityPhase availabilityPhase, long adsAmount, long displayPrizeAmount, int usedInInterval, int maxPerInterval, Long cooldownEndsAtEpochMs, boolean isActionLoading) {
        Intrinsics.checkNotNullParameter(availabilityPhase, "availabilityPhase");
        return new HomeVideoBonusUiState(adsActive, availabilityPhase, adsAmount, displayPrizeAmount, usedInInterval, maxPerInterval, cooldownEndsAtEpochMs, isActionLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeVideoBonusUiState)) {
            return false;
        }
        HomeVideoBonusUiState homeVideoBonusUiState = (HomeVideoBonusUiState) other;
        return this.adsActive == homeVideoBonusUiState.adsActive && this.availabilityPhase == homeVideoBonusUiState.availabilityPhase && this.adsAmount == homeVideoBonusUiState.adsAmount && this.displayPrizeAmount == homeVideoBonusUiState.displayPrizeAmount && this.usedInInterval == homeVideoBonusUiState.usedInInterval && this.maxPerInterval == homeVideoBonusUiState.maxPerInterval && Intrinsics.areEqual(this.cooldownEndsAtEpochMs, homeVideoBonusUiState.cooldownEndsAtEpochMs) && this.isActionLoading == homeVideoBonusUiState.isActionLoading;
    }

    public int hashCode() {
        int hashCode = ((((((((((Boolean.hashCode(this.adsActive) * 31) + this.availabilityPhase.hashCode()) * 31) + Long.hashCode(this.adsAmount)) * 31) + Long.hashCode(this.displayPrizeAmount)) * 31) + Integer.hashCode(this.usedInInterval)) * 31) + Integer.hashCode(this.maxPerInterval)) * 31;
        Long l = this.cooldownEndsAtEpochMs;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.isActionLoading);
    }

    public String toString() {
        return "HomeVideoBonusUiState(adsActive=" + this.adsActive + ", availabilityPhase=" + this.availabilityPhase + ", adsAmount=" + this.adsAmount + ", displayPrizeAmount=" + this.displayPrizeAmount + ", usedInInterval=" + this.usedInInterval + ", maxPerInterval=" + this.maxPerInterval + ", cooldownEndsAtEpochMs=" + this.cooldownEndsAtEpochMs + ", isActionLoading=" + this.isActionLoading + ")";
    }

    public HomeVideoBonusUiState(boolean z, VideoOfferAvailabilityPhase availabilityPhase, long j, long j2, int i, int i2, Long l, boolean z2) {
        Intrinsics.checkNotNullParameter(availabilityPhase, "availabilityPhase");
        this.adsActive = z;
        this.availabilityPhase = availabilityPhase;
        this.adsAmount = j;
        this.displayPrizeAmount = j2;
        this.usedInInterval = i;
        this.maxPerInterval = i2;
        this.cooldownEndsAtEpochMs = l;
        this.isActionLoading = z2;
    }

    public final boolean getAdsActive() {
        return this.adsActive;
    }

    public /* synthetic */ HomeVideoBonusUiState(boolean z, VideoOfferAvailabilityPhase videoOfferAvailabilityPhase, long j, long j2, int i, int i2, Long l, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? VideoOfferAvailabilityPhase.CHECKING : videoOfferAvailabilityPhase, (i3 & 4) != 0 ? 0L : j, (i3 & 8) == 0 ? j2 : 0L, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : l, (i3 & 128) == 0 ? z2 : false);
    }

    public final VideoOfferAvailabilityPhase getAvailabilityPhase() {
        return this.availabilityPhase;
    }

    public final long getAdsAmount() {
        return this.adsAmount;
    }

    public final long getDisplayPrizeAmount() {
        return this.displayPrizeAmount;
    }

    public final int getUsedInInterval() {
        return this.usedInInterval;
    }

    public final int getMaxPerInterval() {
        return this.maxPerInterval;
    }

    public final Long getCooldownEndsAtEpochMs() {
        return this.cooldownEndsAtEpochMs;
    }

    public final boolean isActionLoading() {
        return this.isActionLoading;
    }

    public final boolean getLimitReached() {
        int i = this.maxPerInterval;
        return i > 0 && this.usedInInterval >= i;
    }

    public final boolean isOnCooldown(long nowMs) {
        Long l = this.cooldownEndsAtEpochMs;
        return l != null && l.longValue() > nowMs;
    }

    public final boolean showQuota(long nowMs) {
        return this.maxPerInterval > 0 && !isOnCooldown(nowMs) && !getLimitReached() && this.usedInInterval < this.maxPerInterval;
    }

    public final String quotaLabel(long nowMs) {
        if (!showQuota(nowMs)) {
            return null;
        }
        return RangesKt.coerceIn(this.usedInInterval + 1, 1, this.maxPerInterval) + "/" + this.maxPerInterval;
    }
}
