package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameSessionDto.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bI\b\u0087\b\u0018\u00002\u00020\u0001B³\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\f\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b'\u0010(J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0010HÆ\u0003J\t\u0010U\u001a\u00020\u0010HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020 HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\fHÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\fHÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010;J¼\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020 2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0005HÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010,R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010,R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u001a\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bK\u0010;R\u001a\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bL\u0010;¨\u0006m"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "", "id", "", "currentMinute", "", "teamDetails", "Lorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;", "matchDetails", "Lorg/betup/games/flashbet/model/FlashBetGameMatchDetailsDto;", "matchStartDate", "userAnswers", "", "Lorg/betup/games/flashbet/model/FlashBetGameUserAnswerDto;", "expiresAt", "betAmount", "", "returnAmount", "pendingQuestion", "Lorg/betup/games/flashbet/model/FlashBetGameQuestionDto;", "nextQuestionMinute", "matchTimerSpeedMultiplier", "totalMatchRealSeconds", "gapBetweenQuestionsMs", "clientQuestionCountdownSeconds", "endingPhaseMatchMinutes", "revealTeamsDelayMs", "resultDialogDelayMs", "goalSoundLeadMs", "lastQuestionMinute", "result", "finished", "", "events", "Lorg/betup/games/flashbet/model/FlashBetGameEventDto;", "scores", "Lorg/betup/games/flashbet/model/FlashBetGameScoreUpdateDto;", "possessionHomePercent", "possessionAwayPercent", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;Lorg/betup/games/flashbet/model/FlashBetGameMatchDetailsDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JJLorg/betup/games/flashbet/model/FlashBetGameQuestionDto;Ljava/lang/Integer;IIIIIIIIILjava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getCurrentMinute", "()I", "getTeamDetails", "()Lorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;", "getMatchDetails", "()Lorg/betup/games/flashbet/model/FlashBetGameMatchDetailsDto;", "getMatchStartDate", "getUserAnswers", "()Ljava/util/List;", "getExpiresAt", "getBetAmount", "()J", "getReturnAmount", "getPendingQuestion", "()Lorg/betup/games/flashbet/model/FlashBetGameQuestionDto;", "getNextQuestionMinute", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatchTimerSpeedMultiplier", "getTotalMatchRealSeconds", "getGapBetweenQuestionsMs", "getClientQuestionCountdownSeconds", "getEndingPhaseMatchMinutes", "getRevealTeamsDelayMs", "getResultDialogDelayMs", "getGoalSoundLeadMs", "getLastQuestionMinute", "getResult", "getFinished", "()Z", "getEvents", "getScores", "getPossessionHomePercent", "getPossessionAwayPercent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;ILorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;Lorg/betup/games/flashbet/model/FlashBetGameMatchDetailsDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JJLorg/betup/games/flashbet/model/FlashBetGameQuestionDto;Ljava/lang/Integer;IIIIIIIIILjava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameSessionDto {
    public static final int $stable = 8;

    @SerializedName("betAmount")
    private final long betAmount;

    @SerializedName("clientQuestionCountdownSeconds")
    private final int clientQuestionCountdownSeconds;

    @SerializedName("currentMinute")
    private final int currentMinute;

    @SerializedName("endingPhaseMatchMinutes")
    private final int endingPhaseMatchMinutes;

    @SerializedName("events")
    private final List<FlashBetGameEventDto> events;

    @SerializedName("expiresAt")
    private final String expiresAt;

    @SerializedName("finished")
    private final boolean finished;

    @SerializedName("gapBetweenQuestionsMs")
    private final int gapBetweenQuestionsMs;

    @SerializedName("goalSoundLeadMs")
    private final int goalSoundLeadMs;

    @SerializedName("id")
    private final String id;

    @SerializedName("lastQuestionMinute")
    private final int lastQuestionMinute;

    @SerializedName("matchDetails")
    private final FlashBetGameMatchDetailsDto matchDetails;

    @SerializedName("matchStartDate")
    private final String matchStartDate;

    @SerializedName("matchTimerSpeedMultiplier")
    private final int matchTimerSpeedMultiplier;

    @SerializedName("nextQuestionMinute")
    private final Integer nextQuestionMinute;

    @SerializedName("pendingQuestion")
    private final FlashBetGameQuestionDto pendingQuestion;

    @SerializedName("possessionAwayPercent")
    private final Integer possessionAwayPercent;

    @SerializedName("possessionHomePercent")
    private final Integer possessionHomePercent;

    @SerializedName("result")
    private final String result;

    @SerializedName("resultDialogDelayMs")
    private final int resultDialogDelayMs;

    @SerializedName("returnAmount")
    private final long returnAmount;

    @SerializedName("revealTeamsDelayMs")
    private final int revealTeamsDelayMs;

    @SerializedName("scores")
    private final List<FlashBetGameScoreUpdateDto> scores;

    @SerializedName("teamDetails")
    private final FlashBetGameMatchTeamDetailsDto teamDetails;

    @SerializedName("totalMatchRealSeconds")
    private final int totalMatchRealSeconds;

    @SerializedName("userAnswers")
    private final List<FlashBetGameUserAnswerDto> userAnswers;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final FlashBetGameQuestionDto getPendingQuestion() {
        return this.pendingQuestion;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getNextQuestionMinute() {
        return this.nextQuestionMinute;
    }

    /* renamed from: component12, reason: from getter */
    public final int getMatchTimerSpeedMultiplier() {
        return this.matchTimerSpeedMultiplier;
    }

    /* renamed from: component13, reason: from getter */
    public final int getTotalMatchRealSeconds() {
        return this.totalMatchRealSeconds;
    }

    /* renamed from: component14, reason: from getter */
    public final int getGapBetweenQuestionsMs() {
        return this.gapBetweenQuestionsMs;
    }

    /* renamed from: component15, reason: from getter */
    public final int getClientQuestionCountdownSeconds() {
        return this.clientQuestionCountdownSeconds;
    }

    /* renamed from: component16, reason: from getter */
    public final int getEndingPhaseMatchMinutes() {
        return this.endingPhaseMatchMinutes;
    }

    /* renamed from: component17, reason: from getter */
    public final int getRevealTeamsDelayMs() {
        return this.revealTeamsDelayMs;
    }

    /* renamed from: component18, reason: from getter */
    public final int getResultDialogDelayMs() {
        return this.resultDialogDelayMs;
    }

    /* renamed from: component19, reason: from getter */
    public final int getGoalSoundLeadMs() {
        return this.goalSoundLeadMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentMinute() {
        return this.currentMinute;
    }

    /* renamed from: component20, reason: from getter */
    public final int getLastQuestionMinute() {
        return this.lastQuestionMinute;
    }

    /* renamed from: component21, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    public final List<FlashBetGameEventDto> component23() {
        return this.events;
    }

    public final List<FlashBetGameScoreUpdateDto> component24() {
        return this.scores;
    }

    /* renamed from: component25, reason: from getter */
    public final Integer getPossessionHomePercent() {
        return this.possessionHomePercent;
    }

    /* renamed from: component26, reason: from getter */
    public final Integer getPossessionAwayPercent() {
        return this.possessionAwayPercent;
    }

    /* renamed from: component3, reason: from getter */
    public final FlashBetGameMatchTeamDetailsDto getTeamDetails() {
        return this.teamDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final FlashBetGameMatchDetailsDto getMatchDetails() {
        return this.matchDetails;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMatchStartDate() {
        return this.matchStartDate;
    }

    public final List<FlashBetGameUserAnswerDto> component6() {
        return this.userAnswers;
    }

    /* renamed from: component7, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: component8, reason: from getter */
    public final long getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final long getReturnAmount() {
        return this.returnAmount;
    }

    public final FlashBetGameSessionDto copy(String id, int currentMinute, FlashBetGameMatchTeamDetailsDto teamDetails, FlashBetGameMatchDetailsDto matchDetails, String matchStartDate, List<FlashBetGameUserAnswerDto> userAnswers, String expiresAt, long betAmount, long returnAmount, FlashBetGameQuestionDto pendingQuestion, Integer nextQuestionMinute, int matchTimerSpeedMultiplier, int totalMatchRealSeconds, int gapBetweenQuestionsMs, int clientQuestionCountdownSeconds, int endingPhaseMatchMinutes, int revealTeamsDelayMs, int resultDialogDelayMs, int goalSoundLeadMs, int lastQuestionMinute, String result, boolean finished, List<FlashBetGameEventDto> events, List<FlashBetGameScoreUpdateDto> scores, Integer possessionHomePercent, Integer possessionAwayPercent) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new FlashBetGameSessionDto(id, currentMinute, teamDetails, matchDetails, matchStartDate, userAnswers, expiresAt, betAmount, returnAmount, pendingQuestion, nextQuestionMinute, matchTimerSpeedMultiplier, totalMatchRealSeconds, gapBetweenQuestionsMs, clientQuestionCountdownSeconds, endingPhaseMatchMinutes, revealTeamsDelayMs, resultDialogDelayMs, goalSoundLeadMs, lastQuestionMinute, result, finished, events, scores, possessionHomePercent, possessionAwayPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameSessionDto)) {
            return false;
        }
        FlashBetGameSessionDto flashBetGameSessionDto = (FlashBetGameSessionDto) other;
        return Intrinsics.areEqual(this.id, flashBetGameSessionDto.id) && this.currentMinute == flashBetGameSessionDto.currentMinute && Intrinsics.areEqual(this.teamDetails, flashBetGameSessionDto.teamDetails) && Intrinsics.areEqual(this.matchDetails, flashBetGameSessionDto.matchDetails) && Intrinsics.areEqual(this.matchStartDate, flashBetGameSessionDto.matchStartDate) && Intrinsics.areEqual(this.userAnswers, flashBetGameSessionDto.userAnswers) && Intrinsics.areEqual(this.expiresAt, flashBetGameSessionDto.expiresAt) && this.betAmount == flashBetGameSessionDto.betAmount && this.returnAmount == flashBetGameSessionDto.returnAmount && Intrinsics.areEqual(this.pendingQuestion, flashBetGameSessionDto.pendingQuestion) && Intrinsics.areEqual(this.nextQuestionMinute, flashBetGameSessionDto.nextQuestionMinute) && this.matchTimerSpeedMultiplier == flashBetGameSessionDto.matchTimerSpeedMultiplier && this.totalMatchRealSeconds == flashBetGameSessionDto.totalMatchRealSeconds && this.gapBetweenQuestionsMs == flashBetGameSessionDto.gapBetweenQuestionsMs && this.clientQuestionCountdownSeconds == flashBetGameSessionDto.clientQuestionCountdownSeconds && this.endingPhaseMatchMinutes == flashBetGameSessionDto.endingPhaseMatchMinutes && this.revealTeamsDelayMs == flashBetGameSessionDto.revealTeamsDelayMs && this.resultDialogDelayMs == flashBetGameSessionDto.resultDialogDelayMs && this.goalSoundLeadMs == flashBetGameSessionDto.goalSoundLeadMs && this.lastQuestionMinute == flashBetGameSessionDto.lastQuestionMinute && Intrinsics.areEqual(this.result, flashBetGameSessionDto.result) && this.finished == flashBetGameSessionDto.finished && Intrinsics.areEqual(this.events, flashBetGameSessionDto.events) && Intrinsics.areEqual(this.scores, flashBetGameSessionDto.scores) && Intrinsics.areEqual(this.possessionHomePercent, flashBetGameSessionDto.possessionHomePercent) && Intrinsics.areEqual(this.possessionAwayPercent, flashBetGameSessionDto.possessionAwayPercent);
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + Integer.hashCode(this.currentMinute)) * 31;
        FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto = this.teamDetails;
        int hashCode2 = (hashCode + (flashBetGameMatchTeamDetailsDto == null ? 0 : flashBetGameMatchTeamDetailsDto.hashCode())) * 31;
        FlashBetGameMatchDetailsDto flashBetGameMatchDetailsDto = this.matchDetails;
        int hashCode3 = (hashCode2 + (flashBetGameMatchDetailsDto == null ? 0 : flashBetGameMatchDetailsDto.hashCode())) * 31;
        String str = this.matchStartDate;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<FlashBetGameUserAnswerDto> list = this.userAnswers;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.expiresAt;
        int hashCode6 = (((((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.betAmount)) * 31) + Long.hashCode(this.returnAmount)) * 31;
        FlashBetGameQuestionDto flashBetGameQuestionDto = this.pendingQuestion;
        int hashCode7 = (hashCode6 + (flashBetGameQuestionDto == null ? 0 : flashBetGameQuestionDto.hashCode())) * 31;
        Integer num = this.nextQuestionMinute;
        int hashCode8 = (((((((((((((((((((hashCode7 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.matchTimerSpeedMultiplier)) * 31) + Integer.hashCode(this.totalMatchRealSeconds)) * 31) + Integer.hashCode(this.gapBetweenQuestionsMs)) * 31) + Integer.hashCode(this.clientQuestionCountdownSeconds)) * 31) + Integer.hashCode(this.endingPhaseMatchMinutes)) * 31) + Integer.hashCode(this.revealTeamsDelayMs)) * 31) + Integer.hashCode(this.resultDialogDelayMs)) * 31) + Integer.hashCode(this.goalSoundLeadMs)) * 31) + Integer.hashCode(this.lastQuestionMinute)) * 31;
        String str3 = this.result;
        int hashCode9 = (((hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.finished)) * 31;
        List<FlashBetGameEventDto> list2 = this.events;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FlashBetGameScoreUpdateDto> list3 = this.scores;
        int hashCode11 = (hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.possessionHomePercent;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.possessionAwayPercent;
        return hashCode12 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "FlashBetGameSessionDto(id=" + this.id + ", currentMinute=" + this.currentMinute + ", teamDetails=" + this.teamDetails + ", matchDetails=" + this.matchDetails + ", matchStartDate=" + this.matchStartDate + ", userAnswers=" + this.userAnswers + ", expiresAt=" + this.expiresAt + ", betAmount=" + this.betAmount + ", returnAmount=" + this.returnAmount + ", pendingQuestion=" + this.pendingQuestion + ", nextQuestionMinute=" + this.nextQuestionMinute + ", matchTimerSpeedMultiplier=" + this.matchTimerSpeedMultiplier + ", totalMatchRealSeconds=" + this.totalMatchRealSeconds + ", gapBetweenQuestionsMs=" + this.gapBetweenQuestionsMs + ", clientQuestionCountdownSeconds=" + this.clientQuestionCountdownSeconds + ", endingPhaseMatchMinutes=" + this.endingPhaseMatchMinutes + ", revealTeamsDelayMs=" + this.revealTeamsDelayMs + ", resultDialogDelayMs=" + this.resultDialogDelayMs + ", goalSoundLeadMs=" + this.goalSoundLeadMs + ", lastQuestionMinute=" + this.lastQuestionMinute + ", result=" + this.result + ", finished=" + this.finished + ", events=" + this.events + ", scores=" + this.scores + ", possessionHomePercent=" + this.possessionHomePercent + ", possessionAwayPercent=" + this.possessionAwayPercent + ")";
    }

    public FlashBetGameSessionDto(String id, int i, FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, FlashBetGameMatchDetailsDto flashBetGameMatchDetailsDto, String str, List<FlashBetGameUserAnswerDto> list, String str2, long j, long j2, FlashBetGameQuestionDto flashBetGameQuestionDto, Integer num, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str3, boolean z, List<FlashBetGameEventDto> list2, List<FlashBetGameScoreUpdateDto> list3, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.currentMinute = i;
        this.teamDetails = flashBetGameMatchTeamDetailsDto;
        this.matchDetails = flashBetGameMatchDetailsDto;
        this.matchStartDate = str;
        this.userAnswers = list;
        this.expiresAt = str2;
        this.betAmount = j;
        this.returnAmount = j2;
        this.pendingQuestion = flashBetGameQuestionDto;
        this.nextQuestionMinute = num;
        this.matchTimerSpeedMultiplier = i2;
        this.totalMatchRealSeconds = i3;
        this.gapBetweenQuestionsMs = i4;
        this.clientQuestionCountdownSeconds = i5;
        this.endingPhaseMatchMinutes = i6;
        this.revealTeamsDelayMs = i7;
        this.resultDialogDelayMs = i8;
        this.goalSoundLeadMs = i9;
        this.lastQuestionMinute = i10;
        this.result = str3;
        this.finished = z;
        this.events = list2;
        this.scores = list3;
        this.possessionHomePercent = num2;
        this.possessionAwayPercent = num3;
    }

    public /* synthetic */ FlashBetGameSessionDto(String str, int i, FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, FlashBetGameMatchDetailsDto flashBetGameMatchDetailsDto, String str2, List list, String str3, long j, long j2, FlashBetGameQuestionDto flashBetGameQuestionDto, Integer num, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str4, boolean z, List list2, List list3, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i, (i11 & 4) != 0 ? null : flashBetGameMatchTeamDetailsDto, (i11 & 8) != 0 ? null : flashBetGameMatchDetailsDto, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? 0L : j, (i11 & 256) == 0 ? j2 : 0L, (i11 & 512) != 0 ? null : flashBetGameQuestionDto, (i11 & 1024) != 0 ? null : num, (i11 & 2048) != 0 ? 5 : i2, (i11 & 4096) != 0 ? 20 : i3, (i11 & 8192) != 0 ? 1000 : i4, (i11 & 16384) != 0 ? 12 : i5, (i11 & 32768) != 0 ? 15 : i6, (i11 & 65536) != 0 ? 1500 : i7, (i11 & 131072) == 0 ? i8 : 1500, (i11 & 262144) == 0 ? i9 : 1000, (i11 & 524288) != 0 ? 75 : i10, (i11 & 1048576) != 0 ? null : str4, (i11 & 2097152) != 0 ? false : z, (i11 & 4194304) != 0 ? null : list2, (i11 & 8388608) != 0 ? null : list3, (i11 & 16777216) != 0 ? null : num2, (i11 & 33554432) != 0 ? null : num3);
    }

    public final String getId() {
        return this.id;
    }

    public final int getCurrentMinute() {
        return this.currentMinute;
    }

    public final FlashBetGameMatchTeamDetailsDto getTeamDetails() {
        return this.teamDetails;
    }

    public final FlashBetGameMatchDetailsDto getMatchDetails() {
        return this.matchDetails;
    }

    public final String getMatchStartDate() {
        return this.matchStartDate;
    }

    public final List<FlashBetGameUserAnswerDto> getUserAnswers() {
        return this.userAnswers;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final long getBetAmount() {
        return this.betAmount;
    }

    public final long getReturnAmount() {
        return this.returnAmount;
    }

    public final FlashBetGameQuestionDto getPendingQuestion() {
        return this.pendingQuestion;
    }

    public final Integer getNextQuestionMinute() {
        return this.nextQuestionMinute;
    }

    public final int getMatchTimerSpeedMultiplier() {
        return this.matchTimerSpeedMultiplier;
    }

    public final int getTotalMatchRealSeconds() {
        return this.totalMatchRealSeconds;
    }

    public final int getGapBetweenQuestionsMs() {
        return this.gapBetweenQuestionsMs;
    }

    public final int getClientQuestionCountdownSeconds() {
        return this.clientQuestionCountdownSeconds;
    }

    public final int getEndingPhaseMatchMinutes() {
        return this.endingPhaseMatchMinutes;
    }

    public final int getRevealTeamsDelayMs() {
        return this.revealTeamsDelayMs;
    }

    public final int getResultDialogDelayMs() {
        return this.resultDialogDelayMs;
    }

    public final int getGoalSoundLeadMs() {
        return this.goalSoundLeadMs;
    }

    public final int getLastQuestionMinute() {
        return this.lastQuestionMinute;
    }

    public final String getResult() {
        return this.result;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final List<FlashBetGameEventDto> getEvents() {
        return this.events;
    }

    public final List<FlashBetGameScoreUpdateDto> getScores() {
        return this.scores;
    }

    public final Integer getPossessionHomePercent() {
        return this.possessionHomePercent;
    }

    public final Integer getPossessionAwayPercent() {
        return this.possessionAwayPercent;
    }
}
