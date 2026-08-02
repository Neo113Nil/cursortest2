package org.betup.ui.fragment.bets.betslip.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetSlipItemUi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003JÒ\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010 R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0015\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u00104\u001a\u000205¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107¨\u0006R"}, d2 = {"Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "", "betId", "", "matchBetId", "isAvailable", "", "userBetAvailable", "isDeleted", "dateTime", "", "homeTeamName", "awayTeamName", "betName", "grabbedCoefficient", "", "state", "Lorg/betup/model/remote/entity/matches/MatchState;", "betState", "Lorg/betup/model/remote/entity/bets/BetState;", "betTypeGroup", "isCoefficientUp", "matchSportType", "matchSportTypeImage", "score", "varietyName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/Long;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLorg/betup/model/remote/entity/matches/MatchState;Lorg/betup/model/remote/entity/bets/BetState;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBetId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMatchBetId", "()Z", "getUserBetAvailable", "getDateTime", "()Ljava/lang/String;", "getHomeTeamName", "getAwayTeamName", "getBetName", "getGrabbedCoefficient", "()D", "getState", "()Lorg/betup/model/remote/entity/matches/MatchState;", "getBetState", "()Lorg/betup/model/remote/entity/bets/BetState;", "getBetTypeGroup", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMatchSportType", "getMatchSportTypeImage", "getScore", "getVarietyName", "textColor", "Landroidx/compose/ui/graphics/Color;", "getTextColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/Long;Ljava/lang/Long;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLorg/betup/model/remote/entity/matches/MatchState;Lorg/betup/model/remote/entity/bets/BetState;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BetSlipUiModel {
    public static final int $stable = 0;
    private final String awayTeamName;
    private final Long betId;
    private final String betName;
    private final BetState betState;
    private final String betTypeGroup;
    private final String dateTime;
    private final double grabbedCoefficient;
    private final String homeTeamName;
    private final boolean isAvailable;
    private final Boolean isCoefficientUp;
    private final boolean isDeleted;
    private final Long matchBetId;
    private final String matchSportType;
    private final String matchSportTypeImage;
    private final String score;
    private final MatchState state;
    private final long textColor;
    private final boolean userBetAvailable;
    private final String varietyName;

    /* renamed from: component1, reason: from getter */
    public final Long getBetId() {
        return this.betId;
    }

    /* renamed from: component10, reason: from getter */
    public final double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    /* renamed from: component11, reason: from getter */
    public final MatchState getState() {
        return this.state;
    }

    /* renamed from: component12, reason: from getter */
    public final BetState getBetState() {
        return this.betState;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBetTypeGroup() {
        return this.betTypeGroup;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsCoefficientUp() {
        return this.isCoefficientUp;
    }

    /* renamed from: component15, reason: from getter */
    public final String getMatchSportType() {
        return this.matchSportType;
    }

    /* renamed from: component16, reason: from getter */
    public final String getMatchSportTypeImage() {
        return this.matchSportTypeImage;
    }

    /* renamed from: component17, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    /* renamed from: component18, reason: from getter */
    public final String getVarietyName() {
        return this.varietyName;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getMatchBetId() {
        return this.matchBetId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUserBetAvailable() {
        return this.userBetAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    public final BetSlipUiModel copy(Long betId, Long matchBetId, boolean isAvailable, boolean userBetAvailable, boolean isDeleted, String dateTime, String homeTeamName, String awayTeamName, String betName, double grabbedCoefficient, MatchState state, BetState betState, String betTypeGroup, Boolean isCoefficientUp, String matchSportType, String matchSportTypeImage, String score, String varietyName) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
        Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(betTypeGroup, "betTypeGroup");
        return new BetSlipUiModel(betId, matchBetId, isAvailable, userBetAvailable, isDeleted, dateTime, homeTeamName, awayTeamName, betName, grabbedCoefficient, state, betState, betTypeGroup, isCoefficientUp, matchSportType, matchSportTypeImage, score, varietyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetSlipUiModel)) {
            return false;
        }
        BetSlipUiModel betSlipUiModel = (BetSlipUiModel) other;
        return Intrinsics.areEqual(this.betId, betSlipUiModel.betId) && Intrinsics.areEqual(this.matchBetId, betSlipUiModel.matchBetId) && this.isAvailable == betSlipUiModel.isAvailable && this.userBetAvailable == betSlipUiModel.userBetAvailable && this.isDeleted == betSlipUiModel.isDeleted && Intrinsics.areEqual(this.dateTime, betSlipUiModel.dateTime) && Intrinsics.areEqual(this.homeTeamName, betSlipUiModel.homeTeamName) && Intrinsics.areEqual(this.awayTeamName, betSlipUiModel.awayTeamName) && Intrinsics.areEqual(this.betName, betSlipUiModel.betName) && Double.compare(this.grabbedCoefficient, betSlipUiModel.grabbedCoefficient) == 0 && this.state == betSlipUiModel.state && this.betState == betSlipUiModel.betState && Intrinsics.areEqual(this.betTypeGroup, betSlipUiModel.betTypeGroup) && Intrinsics.areEqual(this.isCoefficientUp, betSlipUiModel.isCoefficientUp) && Intrinsics.areEqual(this.matchSportType, betSlipUiModel.matchSportType) && Intrinsics.areEqual(this.matchSportTypeImage, betSlipUiModel.matchSportTypeImage) && Intrinsics.areEqual(this.score, betSlipUiModel.score) && Intrinsics.areEqual(this.varietyName, betSlipUiModel.varietyName);
    }

    public int hashCode() {
        Long l = this.betId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.matchBetId;
        int hashCode2 = (((((((((((((((((((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + Boolean.hashCode(this.userBetAvailable)) * 31) + Boolean.hashCode(this.isDeleted)) * 31) + this.dateTime.hashCode()) * 31) + this.homeTeamName.hashCode()) * 31) + this.awayTeamName.hashCode()) * 31) + this.betName.hashCode()) * 31) + Double.hashCode(this.grabbedCoefficient)) * 31) + this.state.hashCode()) * 31;
        BetState betState = this.betState;
        int hashCode3 = (((hashCode2 + (betState == null ? 0 : betState.hashCode())) * 31) + this.betTypeGroup.hashCode()) * 31;
        Boolean bool = this.isCoefficientUp;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.matchSportType;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.matchSportTypeImage;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.score;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.varietyName;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "BetSlipUiModel(betId=" + this.betId + ", matchBetId=" + this.matchBetId + ", isAvailable=" + this.isAvailable + ", userBetAvailable=" + this.userBetAvailable + ", isDeleted=" + this.isDeleted + ", dateTime=" + this.dateTime + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", betName=" + this.betName + ", grabbedCoefficient=" + this.grabbedCoefficient + ", state=" + this.state + ", betState=" + this.betState + ", betTypeGroup=" + this.betTypeGroup + ", isCoefficientUp=" + this.isCoefficientUp + ", matchSportType=" + this.matchSportType + ", matchSportTypeImage=" + this.matchSportTypeImage + ", score=" + this.score + ", varietyName=" + this.varietyName + ")";
    }

    public BetSlipUiModel(Long l, Long l2, boolean z, boolean z2, boolean z3, String dateTime, String homeTeamName, String awayTeamName, String betName, double d, MatchState state, BetState betState, String betTypeGroup, Boolean bool, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
        Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(betTypeGroup, "betTypeGroup");
        this.betId = l;
        this.matchBetId = l2;
        this.isAvailable = z;
        this.userBetAvailable = z2;
        this.isDeleted = z3;
        this.dateTime = dateTime;
        this.homeTeamName = homeTeamName;
        this.awayTeamName = awayTeamName;
        this.betName = betName;
        this.grabbedCoefficient = d;
        this.state = state;
        this.betState = betState;
        this.betTypeGroup = betTypeGroup;
        this.isCoefficientUp = bool;
        this.matchSportType = str;
        this.matchSportTypeImage = str2;
        this.score = str3;
        this.varietyName = str4;
        this.textColor = betState != null ? UiExtensionsKt.getTextColor(betState) : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
    }

    public final Long getBetId() {
        return this.betId;
    }

    public final Long getMatchBetId() {
        return this.matchBetId;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean getUserBetAvailable() {
        return this.userBetAvailable;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getBetName() {
        return this.betName;
    }

    public final double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    public final MatchState getState() {
        return this.state;
    }

    public final BetState getBetState() {
        return this.betState;
    }

    public /* synthetic */ BetSlipUiModel(Long l, Long l2, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, double d, MatchState matchState, BetState betState, String str5, Boolean bool, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, str, str2, str3, str4, d, matchState, (i & 2048) != 0 ? null : betState, (i & 4096) != 0 ? "" : str5, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : str7, (65536 & i) != 0 ? null : str8, (i & 131072) != 0 ? null : str9);
    }

    public final String getBetTypeGroup() {
        return this.betTypeGroup;
    }

    public final Boolean isCoefficientUp() {
        return this.isCoefficientUp;
    }

    public final String getMatchSportType() {
        return this.matchSportType;
    }

    public final String getMatchSportTypeImage() {
        return this.matchSportTypeImage;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getVarietyName() {
        return this.varietyName;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }
}
