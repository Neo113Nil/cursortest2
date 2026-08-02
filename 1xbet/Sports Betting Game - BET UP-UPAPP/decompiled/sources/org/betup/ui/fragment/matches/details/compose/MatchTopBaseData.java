package org.betup.ui.fragment.matches.details.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchTopBaseItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010&\u001a\u00020\u0003J\u0006\u0010'\u001a\u00020\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0012HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0010HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u0006;"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;", "", "firstTeamName", "", "secondTeamName", "firstTeamImage", "secondTeamImage", "scoreFirstTeam", "scoreSecondTeam", "matchDateTime", "isScoreAvailable", "", "playTime", "playTimeName", "isLive", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "matchStat", "Lorg/betup/model/remote/entity/matches/MatchState;", "periodScoresDisplay", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILorg/betup/model/remote/entity/matches/MatchState;Ljava/lang/String;)V", "getFirstTeamName", "()Ljava/lang/String;", "getSecondTeamName", "getFirstTeamImage", "getSecondTeamImage", "getScoreFirstTeam", "getScoreSecondTeam", "getMatchDateTime", "()Z", "getPlayTime", "getPlayTimeName", "getSportId", "()I", "getMatchStat", "()Lorg/betup/model/remote/entity/matches/MatchState;", "getPeriodScoresDisplay", "getCurrentTimeForMatchDetail", "getCurrentDateForMatchDetail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchTopBaseData {
    public static final int $stable = 0;
    private final String firstTeamImage;
    private final String firstTeamName;
    private final boolean isLive;
    private final boolean isScoreAvailable;
    private final String matchDateTime;
    private final MatchState matchStat;
    private final String periodScoresDisplay;
    private final String playTime;
    private final String playTimeName;
    private final String scoreFirstTeam;
    private final String scoreSecondTeam;
    private final String secondTeamImage;
    private final String secondTeamName;
    private final int sportId;

    /* renamed from: component1, reason: from getter */
    public final String getFirstTeamName() {
        return this.firstTeamName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlayTimeName() {
        return this.playTimeName;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* renamed from: component12, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* renamed from: component13, reason: from getter */
    public final MatchState getMatchStat() {
        return this.matchStat;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPeriodScoresDisplay() {
        return this.periodScoresDisplay;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondTeamName() {
        return this.secondTeamName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFirstTeamImage() {
        return this.firstTeamImage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondTeamImage() {
        return this.secondTeamImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScoreFirstTeam() {
        return this.scoreFirstTeam;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScoreSecondTeam() {
        return this.scoreSecondTeam;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMatchDateTime() {
        return this.matchDateTime;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsScoreAvailable() {
        return this.isScoreAvailable;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPlayTime() {
        return this.playTime;
    }

    public final MatchTopBaseData copy(String firstTeamName, String secondTeamName, String firstTeamImage, String secondTeamImage, String scoreFirstTeam, String scoreSecondTeam, String matchDateTime, boolean isScoreAvailable, String playTime, String playTimeName, boolean isLive, int sportId, MatchState matchStat, String periodScoresDisplay) {
        Intrinsics.checkNotNullParameter(firstTeamName, "firstTeamName");
        Intrinsics.checkNotNullParameter(secondTeamName, "secondTeamName");
        Intrinsics.checkNotNullParameter(firstTeamImage, "firstTeamImage");
        Intrinsics.checkNotNullParameter(secondTeamImage, "secondTeamImage");
        Intrinsics.checkNotNullParameter(playTimeName, "playTimeName");
        Intrinsics.checkNotNullParameter(matchStat, "matchStat");
        return new MatchTopBaseData(firstTeamName, secondTeamName, firstTeamImage, secondTeamImage, scoreFirstTeam, scoreSecondTeam, matchDateTime, isScoreAvailable, playTime, playTimeName, isLive, sportId, matchStat, periodScoresDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchTopBaseData)) {
            return false;
        }
        MatchTopBaseData matchTopBaseData = (MatchTopBaseData) other;
        return Intrinsics.areEqual(this.firstTeamName, matchTopBaseData.firstTeamName) && Intrinsics.areEqual(this.secondTeamName, matchTopBaseData.secondTeamName) && Intrinsics.areEqual(this.firstTeamImage, matchTopBaseData.firstTeamImage) && Intrinsics.areEqual(this.secondTeamImage, matchTopBaseData.secondTeamImage) && Intrinsics.areEqual(this.scoreFirstTeam, matchTopBaseData.scoreFirstTeam) && Intrinsics.areEqual(this.scoreSecondTeam, matchTopBaseData.scoreSecondTeam) && Intrinsics.areEqual(this.matchDateTime, matchTopBaseData.matchDateTime) && this.isScoreAvailable == matchTopBaseData.isScoreAvailable && Intrinsics.areEqual(this.playTime, matchTopBaseData.playTime) && Intrinsics.areEqual(this.playTimeName, matchTopBaseData.playTimeName) && this.isLive == matchTopBaseData.isLive && this.sportId == matchTopBaseData.sportId && this.matchStat == matchTopBaseData.matchStat && Intrinsics.areEqual(this.periodScoresDisplay, matchTopBaseData.periodScoresDisplay);
    }

    public int hashCode() {
        int hashCode = ((((((this.firstTeamName.hashCode() * 31) + this.secondTeamName.hashCode()) * 31) + this.firstTeamImage.hashCode()) * 31) + this.secondTeamImage.hashCode()) * 31;
        String str = this.scoreFirstTeam;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scoreSecondTeam;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchDateTime;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isScoreAvailable)) * 31;
        String str4 = this.playTime;
        int hashCode5 = (((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.playTimeName.hashCode()) * 31) + Boolean.hashCode(this.isLive)) * 31) + Integer.hashCode(this.sportId)) * 31) + this.matchStat.hashCode()) * 31;
        String str5 = this.periodScoresDisplay;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "MatchTopBaseData(firstTeamName=" + this.firstTeamName + ", secondTeamName=" + this.secondTeamName + ", firstTeamImage=" + this.firstTeamImage + ", secondTeamImage=" + this.secondTeamImage + ", scoreFirstTeam=" + this.scoreFirstTeam + ", scoreSecondTeam=" + this.scoreSecondTeam + ", matchDateTime=" + this.matchDateTime + ", isScoreAvailable=" + this.isScoreAvailable + ", playTime=" + this.playTime + ", playTimeName=" + this.playTimeName + ", isLive=" + this.isLive + ", sportId=" + this.sportId + ", matchStat=" + this.matchStat + ", periodScoresDisplay=" + this.periodScoresDisplay + ")";
    }

    public MatchTopBaseData(String firstTeamName, String secondTeamName, String firstTeamImage, String secondTeamImage, String str, String str2, String str3, boolean z, String str4, String playTimeName, boolean z2, int i, MatchState matchStat, String str5) {
        Intrinsics.checkNotNullParameter(firstTeamName, "firstTeamName");
        Intrinsics.checkNotNullParameter(secondTeamName, "secondTeamName");
        Intrinsics.checkNotNullParameter(firstTeamImage, "firstTeamImage");
        Intrinsics.checkNotNullParameter(secondTeamImage, "secondTeamImage");
        Intrinsics.checkNotNullParameter(playTimeName, "playTimeName");
        Intrinsics.checkNotNullParameter(matchStat, "matchStat");
        this.firstTeamName = firstTeamName;
        this.secondTeamName = secondTeamName;
        this.firstTeamImage = firstTeamImage;
        this.secondTeamImage = secondTeamImage;
        this.scoreFirstTeam = str;
        this.scoreSecondTeam = str2;
        this.matchDateTime = str3;
        this.isScoreAvailable = z;
        this.playTime = str4;
        this.playTimeName = playTimeName;
        this.isLive = z2;
        this.sportId = i;
        this.matchStat = matchStat;
        this.periodScoresDisplay = str5;
    }

    public /* synthetic */ MatchTopBaseData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, boolean z2, int i, MatchState matchState, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "Stade Brestois 29" : str, (i2 & 2) != 0 ? "Stade Brestois 29" : str2, (i2 & 4) != 0 ? "data:image/png;base64,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" : str3, (i2 & 8) != 0 ? "data:image/png;base64,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" : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? "2025-06-02 08:23:50.0" : str7, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? false : z2, i, matchState, (i2 & 8192) != 0 ? null : str10);
    }

    public final String getFirstTeamName() {
        return this.firstTeamName;
    }

    public final String getSecondTeamName() {
        return this.secondTeamName;
    }

    public final String getFirstTeamImage() {
        return this.firstTeamImage;
    }

    public final String getSecondTeamImage() {
        return this.secondTeamImage;
    }

    public final String getScoreFirstTeam() {
        return this.scoreFirstTeam;
    }

    public final String getScoreSecondTeam() {
        return this.scoreSecondTeam;
    }

    public final String getMatchDateTime() {
        return this.matchDateTime;
    }

    public final boolean isScoreAvailable() {
        return this.isScoreAvailable;
    }

    public final String getPlayTime() {
        return this.playTime;
    }

    public final String getPlayTimeName() {
        return this.playTimeName;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final int getSportId() {
        return this.sportId;
    }

    public final MatchState getMatchStat() {
        return this.matchStat;
    }

    public final String getPeriodScoresDisplay() {
        return this.periodScoresDisplay;
    }

    public final String getCurrentTimeForMatchDetail() {
        String formattedTime;
        if (this.isScoreAvailable) {
            return UiExtensionsKt.normalizeMatchTime(this.playTimeName);
        }
        String str = this.matchDateTime;
        return (str == null || (formattedTime = UiExtensionsKt.getFormattedTime(str)) == null) ? "" : formattedTime;
    }

    public final String getCurrentDateForMatchDetail() {
        String formattedDateWithoutYear;
        if (this.isScoreAvailable) {
            return UiExtensionsKt.normalizeMatchTime(this.playTime);
        }
        String str = this.matchDateTime;
        return (str == null || (formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(str)) == null) ? "" : formattedDateWithoutYear;
    }
}
