package org.betup.ui.fragment.home.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.home.compose.HomeLiveMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeMoreMatchesUiState;
import org.betup.ui.fragment.home.compose.HomePromoUiState;
import org.betup.ui.fragment.home.compose.HomeStatsUiState;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;
import org.betup.ui.fragment.home.controller.HomeVideoBonusUiState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\t\u00106\u001a\u00020\u0015HÆ\u0003Jv\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0015HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeUiState;", "", "stats", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "promo", "Lorg/betup/ui/fragment/home/compose/HomePromoUiState;", "dailyQuests", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "videoBonus", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "bonusOfferActive", "", "activeOffer", "Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "offerExpirationMs", "", "liveMatches", "Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;", "moreMatches", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", "battlesBadgeCount", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;Lorg/betup/ui/fragment/home/compose/HomePromoUiState;Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;ZLorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;Ljava/lang/Long;Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;I)V", "getStats", "()Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "getPromo", "()Lorg/betup/ui/fragment/home/compose/HomePromoUiState;", "getDailyQuests", "()Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "getVideoBonus", "()Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "getBonusOfferActive", "()Z", "getActiveOffer", "()Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "getOfferExpirationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLiveMatches", "()Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;", "getMoreMatches", "()Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", "getBattlesBadgeCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;Lorg/betup/ui/fragment/home/compose/HomePromoUiState;Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;ZLorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;Ljava/lang/Long;Lorg/betup/ui/fragment/home/compose/HomeLiveMatchesUiState;Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;I)Lorg/betup/ui/fragment/home/compose/HomeUiState;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeUiState {
    public static final int $stable = 0;
    private final HomeActiveOfferUiState activeOffer;
    private final int battlesBadgeCount;
    private final boolean bonusOfferActive;
    private final HomeDailyQuestUiState dailyQuests;
    private final HomeLiveMatchesUiState liveMatches;
    private final HomeMoreMatchesUiState moreMatches;
    private final Long offerExpirationMs;
    private final HomePromoUiState promo;
    private final HomeStatsUiState stats;
    private final HomeVideoBonusUiState videoBonus;

    public HomeUiState() {
        this(null, null, null, null, false, null, null, null, null, 0, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final HomeStatsUiState getStats() {
        return this.stats;
    }

    /* renamed from: component10, reason: from getter */
    public final int getBattlesBadgeCount() {
        return this.battlesBadgeCount;
    }

    /* renamed from: component2, reason: from getter */
    public final HomePromoUiState getPromo() {
        return this.promo;
    }

    /* renamed from: component3, reason: from getter */
    public final HomeDailyQuestUiState getDailyQuests() {
        return this.dailyQuests;
    }

    /* renamed from: component4, reason: from getter */
    public final HomeVideoBonusUiState getVideoBonus() {
        return this.videoBonus;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBonusOfferActive() {
        return this.bonusOfferActive;
    }

    /* renamed from: component6, reason: from getter */
    public final HomeActiveOfferUiState getActiveOffer() {
        return this.activeOffer;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getOfferExpirationMs() {
        return this.offerExpirationMs;
    }

    /* renamed from: component8, reason: from getter */
    public final HomeLiveMatchesUiState getLiveMatches() {
        return this.liveMatches;
    }

    /* renamed from: component9, reason: from getter */
    public final HomeMoreMatchesUiState getMoreMatches() {
        return this.moreMatches;
    }

    public final HomeUiState copy(HomeStatsUiState stats, HomePromoUiState promo, HomeDailyQuestUiState dailyQuests, HomeVideoBonusUiState videoBonus, boolean bonusOfferActive, HomeActiveOfferUiState activeOffer, Long offerExpirationMs, HomeLiveMatchesUiState liveMatches, HomeMoreMatchesUiState moreMatches, int battlesBadgeCount) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(dailyQuests, "dailyQuests");
        Intrinsics.checkNotNullParameter(videoBonus, "videoBonus");
        Intrinsics.checkNotNullParameter(liveMatches, "liveMatches");
        Intrinsics.checkNotNullParameter(moreMatches, "moreMatches");
        return new HomeUiState(stats, promo, dailyQuests, videoBonus, bonusOfferActive, activeOffer, offerExpirationMs, liveMatches, moreMatches, battlesBadgeCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeUiState)) {
            return false;
        }
        HomeUiState homeUiState = (HomeUiState) other;
        return Intrinsics.areEqual(this.stats, homeUiState.stats) && Intrinsics.areEqual(this.promo, homeUiState.promo) && Intrinsics.areEqual(this.dailyQuests, homeUiState.dailyQuests) && Intrinsics.areEqual(this.videoBonus, homeUiState.videoBonus) && this.bonusOfferActive == homeUiState.bonusOfferActive && Intrinsics.areEqual(this.activeOffer, homeUiState.activeOffer) && Intrinsics.areEqual(this.offerExpirationMs, homeUiState.offerExpirationMs) && Intrinsics.areEqual(this.liveMatches, homeUiState.liveMatches) && Intrinsics.areEqual(this.moreMatches, homeUiState.moreMatches) && this.battlesBadgeCount == homeUiState.battlesBadgeCount;
    }

    public int hashCode() {
        int hashCode = ((((((((this.stats.hashCode() * 31) + this.promo.hashCode()) * 31) + this.dailyQuests.hashCode()) * 31) + this.videoBonus.hashCode()) * 31) + Boolean.hashCode(this.bonusOfferActive)) * 31;
        HomeActiveOfferUiState homeActiveOfferUiState = this.activeOffer;
        int hashCode2 = (hashCode + (homeActiveOfferUiState == null ? 0 : homeActiveOfferUiState.hashCode())) * 31;
        Long l = this.offerExpirationMs;
        return ((((((hashCode2 + (l != null ? l.hashCode() : 0)) * 31) + this.liveMatches.hashCode()) * 31) + this.moreMatches.hashCode()) * 31) + Integer.hashCode(this.battlesBadgeCount);
    }

    public String toString() {
        return "HomeUiState(stats=" + this.stats + ", promo=" + this.promo + ", dailyQuests=" + this.dailyQuests + ", videoBonus=" + this.videoBonus + ", bonusOfferActive=" + this.bonusOfferActive + ", activeOffer=" + this.activeOffer + ", offerExpirationMs=" + this.offerExpirationMs + ", liveMatches=" + this.liveMatches + ", moreMatches=" + this.moreMatches + ", battlesBadgeCount=" + this.battlesBadgeCount + ")";
    }

    public HomeUiState(HomeStatsUiState stats, HomePromoUiState promo, HomeDailyQuestUiState dailyQuests, HomeVideoBonusUiState videoBonus, boolean z, HomeActiveOfferUiState homeActiveOfferUiState, Long l, HomeLiveMatchesUiState liveMatches, HomeMoreMatchesUiState moreMatches, int i) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(dailyQuests, "dailyQuests");
        Intrinsics.checkNotNullParameter(videoBonus, "videoBonus");
        Intrinsics.checkNotNullParameter(liveMatches, "liveMatches");
        Intrinsics.checkNotNullParameter(moreMatches, "moreMatches");
        this.stats = stats;
        this.promo = promo;
        this.dailyQuests = dailyQuests;
        this.videoBonus = videoBonus;
        this.bonusOfferActive = z;
        this.activeOffer = homeActiveOfferUiState;
        this.offerExpirationMs = l;
        this.liveMatches = liveMatches;
        this.moreMatches = moreMatches;
        this.battlesBadgeCount = i;
    }

    public /* synthetic */ HomeUiState(HomeStatsUiState homeStatsUiState, HomePromoUiState homePromoUiState, HomeDailyQuestUiState homeDailyQuestUiState, HomeVideoBonusUiState homeVideoBonusUiState, boolean z, HomeActiveOfferUiState homeActiveOfferUiState, Long l, HomeLiveMatchesUiState homeLiveMatchesUiState, HomeMoreMatchesUiState homeMoreMatchesUiState, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? HomeStatsUiState.Hidden.INSTANCE : homeStatsUiState, (i2 & 2) != 0 ? HomePromoUiState.Content.INSTANCE : homePromoUiState, (i2 & 4) != 0 ? HomeDailyQuestUiState.Hidden.INSTANCE : homeDailyQuestUiState, (i2 & 8) != 0 ? new HomeVideoBonusUiState(false, null, 0L, 0L, 0, 0, null, false, 255, null) : homeVideoBonusUiState, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : homeActiveOfferUiState, (i2 & 64) == 0 ? l : null, (i2 & 128) != 0 ? HomeLiveMatchesUiState.Hidden.INSTANCE : homeLiveMatchesUiState, (i2 & 256) != 0 ? HomeMoreMatchesUiState.Hidden.INSTANCE : homeMoreMatchesUiState, (i2 & 512) == 0 ? i : 0);
    }

    public final HomeStatsUiState getStats() {
        return this.stats;
    }

    public final HomePromoUiState getPromo() {
        return this.promo;
    }

    public final HomeDailyQuestUiState getDailyQuests() {
        return this.dailyQuests;
    }

    public final HomeVideoBonusUiState getVideoBonus() {
        return this.videoBonus;
    }

    public final boolean getBonusOfferActive() {
        return this.bonusOfferActive;
    }

    public final HomeActiveOfferUiState getActiveOffer() {
        return this.activeOffer;
    }

    public final Long getOfferExpirationMs() {
        return this.offerExpirationMs;
    }

    public final HomeLiveMatchesUiState getLiveMatches() {
        return this.liveMatches;
    }

    public final HomeMoreMatchesUiState getMoreMatches() {
        return this.moreMatches;
    }

    public final int getBattlesBadgeCount() {
        return this.battlesBadgeCount;
    }
}
