package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizParticipationModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0012HÆ\u0003Ji\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "", "id", "", "quiz", "Lorg/betup/model/remote/entity/matches/details/QuizShortModel;", "moneyPlaced", "", "moneyReturned", "totalCoefficient", "", "tier", "Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "state", "bets", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsPlaceModel;", "createdAt", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/model/remote/entity/matches/details/QuizShortModel;JJDLorg/betup/model/remote/entity/matches/details/QuizTierModel;ILjava/util/List;Ljava/lang/String;)V", "getId", "()I", "getQuiz", "()Lorg/betup/model/remote/entity/matches/details/QuizShortModel;", "getMoneyPlaced", "()J", "getMoneyReturned", "getTotalCoefficient", "()D", "getTier", "()Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "getState", "getBets", "()Ljava/util/List;", "getCreatedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizParticipationModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<BetsPlaceModel> bets;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("id")
    private final int id;

    @SerializedName("moneyPlaced")
    private final long moneyPlaced;

    @SerializedName("moneyReturned")
    private final long moneyReturned;

    @SerializedName("quiz")
    private final QuizShortModel quiz;

    @SerializedName("state")
    private final int state;

    @SerializedName("tier")
    private final QuizTierModel tier;

    @SerializedName("totalCoefficient")
    private final double totalCoefficient;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final QuizShortModel getQuiz() {
        return this.quiz;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMoneyReturned() {
        return this.moneyReturned;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTotalCoefficient() {
        return this.totalCoefficient;
    }

    /* renamed from: component6, reason: from getter */
    public final QuizTierModel getTier() {
        return this.tier;
    }

    /* renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final List<BetsPlaceModel> component8() {
        return this.bets;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final QuizParticipationModel copy(int id, QuizShortModel quiz, long moneyPlaced, long moneyReturned, double totalCoefficient, QuizTierModel tier, int state, List<? extends BetsPlaceModel> bets, String createdAt) {
        Intrinsics.checkNotNullParameter(quiz, "quiz");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new QuizParticipationModel(id, quiz, moneyPlaced, moneyReturned, totalCoefficient, tier, state, bets, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizParticipationModel)) {
            return false;
        }
        QuizParticipationModel quizParticipationModel = (QuizParticipationModel) other;
        return this.id == quizParticipationModel.id && Intrinsics.areEqual(this.quiz, quizParticipationModel.quiz) && this.moneyPlaced == quizParticipationModel.moneyPlaced && this.moneyReturned == quizParticipationModel.moneyReturned && Double.compare(this.totalCoefficient, quizParticipationModel.totalCoefficient) == 0 && Intrinsics.areEqual(this.tier, quizParticipationModel.tier) && this.state == quizParticipationModel.state && Intrinsics.areEqual(this.bets, quizParticipationModel.bets) && Intrinsics.areEqual(this.createdAt, quizParticipationModel.createdAt);
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.quiz.hashCode()) * 31) + Long.hashCode(this.moneyPlaced)) * 31) + Long.hashCode(this.moneyReturned)) * 31) + Double.hashCode(this.totalCoefficient)) * 31) + this.tier.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + this.bets.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "QuizParticipationModel(id=" + this.id + ", quiz=" + this.quiz + ", moneyPlaced=" + this.moneyPlaced + ", moneyReturned=" + this.moneyReturned + ", totalCoefficient=" + this.totalCoefficient + ", tier=" + this.tier + ", state=" + this.state + ", bets=" + this.bets + ", createdAt=" + this.createdAt + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuizParticipationModel(int i, QuizShortModel quiz, long j, long j2, double d, QuizTierModel tier, int i2, List<? extends BetsPlaceModel> bets, String createdAt) {
        Intrinsics.checkNotNullParameter(quiz, "quiz");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = i;
        this.quiz = quiz;
        this.moneyPlaced = j;
        this.moneyReturned = j2;
        this.totalCoefficient = d;
        this.tier = tier;
        this.state = i2;
        this.bets = bets;
        this.createdAt = createdAt;
    }

    public final int getId() {
        return this.id;
    }

    public final QuizShortModel getQuiz() {
        return this.quiz;
    }

    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final long getMoneyReturned() {
        return this.moneyReturned;
    }

    public final double getTotalCoefficient() {
        return this.totalCoefficient;
    }

    public final QuizTierModel getTier() {
        return this.tier;
    }

    public final int getState() {
        return this.state;
    }

    public final List<BetsPlaceModel> getBets() {
        return this.bets;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }
}
