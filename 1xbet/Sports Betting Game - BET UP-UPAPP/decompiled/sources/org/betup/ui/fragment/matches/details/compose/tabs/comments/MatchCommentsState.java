package org.betup.ui.fragment.matches.details.compose.tabs.comments;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.user.compose.messages.MessageBubbleUi;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchCommentsModels.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u009c\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 ¨\u00068"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/comments/MatchCommentsState;", "", "matchId", "", "homeTeamName", "", "homeTeamLogo", "awayTeamName", "awayTeamLogo", "scoreLabel", "statusLabel", "isLive", "", "messages", "", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "isLoading", "isLoadingMore", "hasMore", "isSending", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZZZZ)V", "getMatchId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHomeTeamName", "()Ljava/lang/String;", "getHomeTeamLogo", "getAwayTeamName", "getAwayTeamLogo", "getScoreLabel", "getStatusLabel", "()Z", "getMessages", "()Ljava/util/List;", "getHasMore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZZZZ)Lorg/betup/ui/fragment/matches/details/compose/tabs/comments/MatchCommentsState;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchCommentsState {
    public static final int $stable = 0;
    private final String awayTeamLogo;
    private final String awayTeamName;
    private final boolean hasMore;
    private final String homeTeamLogo;
    private final String homeTeamName;
    private final boolean isLive;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final boolean isSending;
    private final Long matchId;
    private final List<MessageBubbleUi> messages;
    private final String scoreLabel;
    private final String statusLabel;

    public MatchCommentsState() {
        this(null, null, null, null, null, null, null, false, null, false, false, false, false, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScoreLabel() {
        return this.scoreLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStatusLabel() {
        return this.statusLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    public final List<MessageBubbleUi> component9() {
        return this.messages;
    }

    public final MatchCommentsState copy(Long matchId, String homeTeamName, String homeTeamLogo, String awayTeamName, String awayTeamLogo, String scoreLabel, String statusLabel, boolean isLive, List<MessageBubbleUi> messages, boolean isLoading, boolean isLoadingMore, boolean hasMore, boolean isSending) {
        Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
        Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
        Intrinsics.checkNotNullParameter(scoreLabel, "scoreLabel");
        Intrinsics.checkNotNullParameter(statusLabel, "statusLabel");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new MatchCommentsState(matchId, homeTeamName, homeTeamLogo, awayTeamName, awayTeamLogo, scoreLabel, statusLabel, isLive, messages, isLoading, isLoadingMore, hasMore, isSending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchCommentsState)) {
            return false;
        }
        MatchCommentsState matchCommentsState = (MatchCommentsState) other;
        return Intrinsics.areEqual(this.matchId, matchCommentsState.matchId) && Intrinsics.areEqual(this.homeTeamName, matchCommentsState.homeTeamName) && Intrinsics.areEqual(this.homeTeamLogo, matchCommentsState.homeTeamLogo) && Intrinsics.areEqual(this.awayTeamName, matchCommentsState.awayTeamName) && Intrinsics.areEqual(this.awayTeamLogo, matchCommentsState.awayTeamLogo) && Intrinsics.areEqual(this.scoreLabel, matchCommentsState.scoreLabel) && Intrinsics.areEqual(this.statusLabel, matchCommentsState.statusLabel) && this.isLive == matchCommentsState.isLive && Intrinsics.areEqual(this.messages, matchCommentsState.messages) && this.isLoading == matchCommentsState.isLoading && this.isLoadingMore == matchCommentsState.isLoadingMore && this.hasMore == matchCommentsState.hasMore && this.isSending == matchCommentsState.isSending;
    }

    public int hashCode() {
        Long l = this.matchId;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.homeTeamName.hashCode()) * 31;
        String str = this.homeTeamLogo;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.awayTeamName.hashCode()) * 31;
        String str2 = this.awayTeamLogo;
        return ((((((((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.scoreLabel.hashCode()) * 31) + this.statusLabel.hashCode()) * 31) + Boolean.hashCode(this.isLive)) * 31) + this.messages.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Boolean.hashCode(this.isSending);
    }

    public String toString() {
        return "MatchCommentsState(matchId=" + this.matchId + ", homeTeamName=" + this.homeTeamName + ", homeTeamLogo=" + this.homeTeamLogo + ", awayTeamName=" + this.awayTeamName + ", awayTeamLogo=" + this.awayTeamLogo + ", scoreLabel=" + this.scoreLabel + ", statusLabel=" + this.statusLabel + ", isLive=" + this.isLive + ", messages=" + this.messages + ", isLoading=" + this.isLoading + ", isLoadingMore=" + this.isLoadingMore + ", hasMore=" + this.hasMore + ", isSending=" + this.isSending + ")";
    }

    public MatchCommentsState(Long l, String homeTeamName, String str, String awayTeamName, String str2, String scoreLabel, String statusLabel, boolean z, List<MessageBubbleUi> messages, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
        Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
        Intrinsics.checkNotNullParameter(scoreLabel, "scoreLabel");
        Intrinsics.checkNotNullParameter(statusLabel, "statusLabel");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.matchId = l;
        this.homeTeamName = homeTeamName;
        this.homeTeamLogo = str;
        this.awayTeamName = awayTeamName;
        this.awayTeamLogo = str2;
        this.scoreLabel = scoreLabel;
        this.statusLabel = statusLabel;
        this.isLive = z;
        this.messages = messages;
        this.isLoading = z2;
        this.isLoadingMore = z3;
        this.hasMore = z4;
        this.isSending = z5;
    }

    public /* synthetic */ MatchCommentsState(Long l, String str, String str2, String str3, String str4, String str5, String str6, boolean z, List list, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : null, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? false : z, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) == 0 ? z5 : false);
    }

    public final Long getMatchId() {
        return this.matchId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    public final String getScoreLabel() {
        return this.scoreLabel;
    }

    public final String getStatusLabel() {
        return this.statusLabel;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final List<MessageBubbleUi> getMessages() {
        return this.messages;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean isSending() {
        return this.isSending;
    }
}
