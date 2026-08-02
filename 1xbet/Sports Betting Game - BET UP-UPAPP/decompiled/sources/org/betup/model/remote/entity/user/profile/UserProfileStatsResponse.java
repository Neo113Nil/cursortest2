package org.betup.model.remote.entity.user.profile;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserProfileStatsResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/entity/user/profile/UserProfileStatsResponse;", "", "betStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "competitionStats", "Lorg/betup/model/remote/entity/user/profile/CompetitionStatsResponse;", "quizStats", "Lorg/betup/model/remote/entity/user/profile/QuizStatsResponse;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;Lorg/betup/model/remote/entity/user/profile/CompetitionStatsResponse;Lorg/betup/model/remote/entity/user/profile/QuizStatsResponse;)V", "getBetStats", "()Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "getCompetitionStats", "()Lorg/betup/model/remote/entity/user/profile/CompetitionStatsResponse;", "getQuizStats", "()Lorg/betup/model/remote/entity/user/profile/QuizStatsResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserProfileStatsResponse {
    public static final int $stable = 0;

    @SerializedName("betStats")
    private final NewUserBetStatisticsModel betStats;

    @SerializedName("competitionStats")
    private final CompetitionStatsResponse competitionStats;

    @SerializedName("quizStats")
    private final QuizStatsResponse quizStats;

    public static /* synthetic */ UserProfileStatsResponse copy$default(UserProfileStatsResponse userProfileStatsResponse, NewUserBetStatisticsModel newUserBetStatisticsModel, CompetitionStatsResponse competitionStatsResponse, QuizStatsResponse quizStatsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            newUserBetStatisticsModel = userProfileStatsResponse.betStats;
        }
        if ((i & 2) != 0) {
            competitionStatsResponse = userProfileStatsResponse.competitionStats;
        }
        if ((i & 4) != 0) {
            quizStatsResponse = userProfileStatsResponse.quizStats;
        }
        return userProfileStatsResponse.copy(newUserBetStatisticsModel, competitionStatsResponse, quizStatsResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final NewUserBetStatisticsModel getBetStats() {
        return this.betStats;
    }

    /* renamed from: component2, reason: from getter */
    public final CompetitionStatsResponse getCompetitionStats() {
        return this.competitionStats;
    }

    /* renamed from: component3, reason: from getter */
    public final QuizStatsResponse getQuizStats() {
        return this.quizStats;
    }

    public final UserProfileStatsResponse copy(NewUserBetStatisticsModel betStats, CompetitionStatsResponse competitionStats, QuizStatsResponse quizStats) {
        return new UserProfileStatsResponse(betStats, competitionStats, quizStats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileStatsResponse)) {
            return false;
        }
        UserProfileStatsResponse userProfileStatsResponse = (UserProfileStatsResponse) other;
        return Intrinsics.areEqual(this.betStats, userProfileStatsResponse.betStats) && Intrinsics.areEqual(this.competitionStats, userProfileStatsResponse.competitionStats) && Intrinsics.areEqual(this.quizStats, userProfileStatsResponse.quizStats);
    }

    public int hashCode() {
        NewUserBetStatisticsModel newUserBetStatisticsModel = this.betStats;
        int hashCode = (newUserBetStatisticsModel == null ? 0 : newUserBetStatisticsModel.hashCode()) * 31;
        CompetitionStatsResponse competitionStatsResponse = this.competitionStats;
        int hashCode2 = (hashCode + (competitionStatsResponse == null ? 0 : competitionStatsResponse.hashCode())) * 31;
        QuizStatsResponse quizStatsResponse = this.quizStats;
        return hashCode2 + (quizStatsResponse != null ? quizStatsResponse.hashCode() : 0);
    }

    public String toString() {
        return "UserProfileStatsResponse(betStats=" + this.betStats + ", competitionStats=" + this.competitionStats + ", quizStats=" + this.quizStats + ")";
    }

    public UserProfileStatsResponse(NewUserBetStatisticsModel newUserBetStatisticsModel, CompetitionStatsResponse competitionStatsResponse, QuizStatsResponse quizStatsResponse) {
        this.betStats = newUserBetStatisticsModel;
        this.competitionStats = competitionStatsResponse;
        this.quizStats = quizStatsResponse;
    }

    public final NewUserBetStatisticsModel getBetStats() {
        return this.betStats;
    }

    public final CompetitionStatsResponse getCompetitionStats() {
        return this.competitionStats;
    }

    public final QuizStatsResponse getQuizStats() {
        return this.quizStats;
    }
}
