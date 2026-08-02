package org.betup.ui.fragment.home.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\t\u0010<\u001a\u00020\rHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003Jà\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u0010\u001a\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\nHÖ\u0001J\t\u0010L\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006M"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "", "matchId", "", "homeTeamName", "", "awayTeamName", "homeLogoUrl", "awayLogoUrl", "scoreHome", "", "scoreAway", "isLive", "", "sportName", "betsLabel", "kickoffTimeLabel", "kickoffDateLabel", "leagueName", "periodLabel", "liveTimeLabel", "sentimentPercents", "", "", "odds", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getMatchId", "()J", "getHomeTeamName", "()Ljava/lang/String;", "getAwayTeamName", "getHomeLogoUrl", "getAwayLogoUrl", "getScoreHome", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScoreAway", "()Z", "getSportName", "getBetsLabel", "getKickoffTimeLabel", "getKickoffDateLabel", "getLeagueName", "getPeriodLabel", "getLiveTimeLabel", "getSentimentPercents", "()Ljava/util/List;", "getOdds", "getSportId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeMatchItem {
    public static final int $stable = 8;
    private final String awayLogoUrl;
    private final String awayTeamName;
    private final String betsLabel;
    private final String homeLogoUrl;
    private final String homeTeamName;
    private final boolean isLive;
    private final String kickoffDateLabel;
    private final String kickoffTimeLabel;
    private final String leagueName;
    private final String liveTimeLabel;
    private final long matchId;
    private final List<HomeMatchOddUi> odds;
    private final String periodLabel;
    private final Integer scoreAway;
    private final Integer scoreHome;
    private final List<Float> sentimentPercents;
    private final int sportId;
    private final String sportName;

    /* renamed from: component1, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBetsLabel() {
        return this.betsLabel;
    }

    /* renamed from: component11, reason: from getter */
    public final String getKickoffTimeLabel() {
        return this.kickoffTimeLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final String getKickoffDateLabel() {
        return this.kickoffDateLabel;
    }

    /* renamed from: component13, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPeriodLabel() {
        return this.periodLabel;
    }

    /* renamed from: component15, reason: from getter */
    public final String getLiveTimeLabel() {
        return this.liveTimeLabel;
    }

    public final List<Float> component16() {
        return this.sentimentPercents;
    }

    public final List<HomeMatchOddUi> component17() {
        return this.odds;
    }

    /* renamed from: component18, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHomeLogoUrl() {
        return this.homeLogoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAwayLogoUrl() {
        return this.awayLogoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    public final HomeMatchItem copy(long matchId, String homeTeamName, String awayTeamName, String homeLogoUrl, String awayLogoUrl, Integer scoreHome, Integer scoreAway, boolean isLive, String sportName, String betsLabel, String kickoffTimeLabel, String kickoffDateLabel, String leagueName, String periodLabel, String liveTimeLabel, List<Float> sentimentPercents, List<HomeMatchOddUi> odds, int sportId) {
        Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
        Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
        Intrinsics.checkNotNullParameter(homeLogoUrl, "homeLogoUrl");
        Intrinsics.checkNotNullParameter(awayLogoUrl, "awayLogoUrl");
        Intrinsics.checkNotNullParameter(sentimentPercents, "sentimentPercents");
        Intrinsics.checkNotNullParameter(odds, "odds");
        return new HomeMatchItem(matchId, homeTeamName, awayTeamName, homeLogoUrl, awayLogoUrl, scoreHome, scoreAway, isLive, sportName, betsLabel, kickoffTimeLabel, kickoffDateLabel, leagueName, periodLabel, liveTimeLabel, sentimentPercents, odds, sportId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMatchItem)) {
            return false;
        }
        HomeMatchItem homeMatchItem = (HomeMatchItem) other;
        return this.matchId == homeMatchItem.matchId && Intrinsics.areEqual(this.homeTeamName, homeMatchItem.homeTeamName) && Intrinsics.areEqual(this.awayTeamName, homeMatchItem.awayTeamName) && Intrinsics.areEqual(this.homeLogoUrl, homeMatchItem.homeLogoUrl) && Intrinsics.areEqual(this.awayLogoUrl, homeMatchItem.awayLogoUrl) && Intrinsics.areEqual(this.scoreHome, homeMatchItem.scoreHome) && Intrinsics.areEqual(this.scoreAway, homeMatchItem.scoreAway) && this.isLive == homeMatchItem.isLive && Intrinsics.areEqual(this.sportName, homeMatchItem.sportName) && Intrinsics.areEqual(this.betsLabel, homeMatchItem.betsLabel) && Intrinsics.areEqual(this.kickoffTimeLabel, homeMatchItem.kickoffTimeLabel) && Intrinsics.areEqual(this.kickoffDateLabel, homeMatchItem.kickoffDateLabel) && Intrinsics.areEqual(this.leagueName, homeMatchItem.leagueName) && Intrinsics.areEqual(this.periodLabel, homeMatchItem.periodLabel) && Intrinsics.areEqual(this.liveTimeLabel, homeMatchItem.liveTimeLabel) && Intrinsics.areEqual(this.sentimentPercents, homeMatchItem.sentimentPercents) && Intrinsics.areEqual(this.odds, homeMatchItem.odds) && this.sportId == homeMatchItem.sportId;
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.matchId) * 31) + this.homeTeamName.hashCode()) * 31) + this.awayTeamName.hashCode()) * 31) + this.homeLogoUrl.hashCode()) * 31) + this.awayLogoUrl.hashCode()) * 31;
        Integer num = this.scoreHome;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.scoreAway;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isLive)) * 31;
        String str = this.sportName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.betsLabel;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kickoffTimeLabel;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kickoffDateLabel;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leagueName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.periodLabel;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.liveTimeLabel;
        return ((((((hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.sentimentPercents.hashCode()) * 31) + this.odds.hashCode()) * 31) + Integer.hashCode(this.sportId);
    }

    public String toString() {
        return "HomeMatchItem(matchId=" + this.matchId + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", homeLogoUrl=" + this.homeLogoUrl + ", awayLogoUrl=" + this.awayLogoUrl + ", scoreHome=" + this.scoreHome + ", scoreAway=" + this.scoreAway + ", isLive=" + this.isLive + ", sportName=" + this.sportName + ", betsLabel=" + this.betsLabel + ", kickoffTimeLabel=" + this.kickoffTimeLabel + ", kickoffDateLabel=" + this.kickoffDateLabel + ", leagueName=" + this.leagueName + ", periodLabel=" + this.periodLabel + ", liveTimeLabel=" + this.liveTimeLabel + ", sentimentPercents=" + this.sentimentPercents + ", odds=" + this.odds + ", sportId=" + this.sportId + ")";
    }

    public HomeMatchItem(long j, String homeTeamName, String awayTeamName, String homeLogoUrl, String awayLogoUrl, Integer num, Integer num2, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Float> sentimentPercents, List<HomeMatchOddUi> odds, int i) {
        Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
        Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
        Intrinsics.checkNotNullParameter(homeLogoUrl, "homeLogoUrl");
        Intrinsics.checkNotNullParameter(awayLogoUrl, "awayLogoUrl");
        Intrinsics.checkNotNullParameter(sentimentPercents, "sentimentPercents");
        Intrinsics.checkNotNullParameter(odds, "odds");
        this.matchId = j;
        this.homeTeamName = homeTeamName;
        this.awayTeamName = awayTeamName;
        this.homeLogoUrl = homeLogoUrl;
        this.awayLogoUrl = awayLogoUrl;
        this.scoreHome = num;
        this.scoreAway = num2;
        this.isLive = z;
        this.sportName = str;
        this.betsLabel = str2;
        this.kickoffTimeLabel = str3;
        this.kickoffDateLabel = str4;
        this.leagueName = str5;
        this.periodLabel = str6;
        this.liveTimeLabel = str7;
        this.sentimentPercents = sentimentPercents;
        this.odds = odds;
        this.sportId = i;
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getHomeLogoUrl() {
        return this.homeLogoUrl;
    }

    public final String getAwayLogoUrl() {
        return this.awayLogoUrl;
    }

    public final Integer getScoreHome() {
        return this.scoreHome;
    }

    public final Integer getScoreAway() {
        return this.scoreAway;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getBetsLabel() {
        return this.betsLabel;
    }

    public final String getKickoffTimeLabel() {
        return this.kickoffTimeLabel;
    }

    public final String getKickoffDateLabel() {
        return this.kickoffDateLabel;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final String getPeriodLabel() {
        return this.periodLabel;
    }

    public final String getLiveTimeLabel() {
        return this.liveTimeLabel;
    }

    public /* synthetic */ HomeMatchItem(long j, String str, String str2, String str3, String str4, Integer num, Integer num2, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, num, num2, z, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : str9, (i2 & 8192) != 0 ? null : str10, (i2 & 16384) != 0 ? null : str11, (32768 & i2) != 0 ? CollectionsKt.emptyList() : list, (65536 & i2) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 131072) != 0 ? 0 : i);
    }

    public final List<Float> getSentimentPercents() {
        return this.sentimentPercents;
    }

    public final List<HomeMatchOddUi> getOdds() {
        return this.odds;
    }

    public final int getSportId() {
        return this.sportId;
    }
}
