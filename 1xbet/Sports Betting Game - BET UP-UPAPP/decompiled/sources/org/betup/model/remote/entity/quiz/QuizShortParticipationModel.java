package org.betup.model.remote.entity.quiz;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.details.QuizShortModel;
import org.betup.model.remote.entity.matches.details.QuizTierModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizShortParticipationModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\rHÖ\u0001J\t\u0010-\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lorg/betup/model/remote/entity/quiz/QuizShortParticipationModel;", "", "id", "", "quiz", "Lorg/betup/model/remote/entity/matches/details/QuizShortModel;", "moneyPlaced", "moneyReturned", "totalCoefficient", "", "tier", "Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "state", "", "createdAt", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/details/QuizShortModel;JJDLorg/betup/model/remote/entity/matches/details/QuizTierModel;ILjava/lang/String;)V", "getId", "()J", "getQuiz", "()Lorg/betup/model/remote/entity/matches/details/QuizShortModel;", "getMoneyPlaced", "getMoneyReturned", "getTotalCoefficient", "()D", "getTier", "()Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "getState", "()I", "getCreatedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizShortParticipationModel {
    public static final int $stable = 8;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("id")
    private final long id;

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
    public final long getId() {
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

    /* renamed from: component8, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final QuizShortParticipationModel copy(long id, QuizShortModel quiz, long moneyPlaced, long moneyReturned, double totalCoefficient, QuizTierModel tier, int state, String createdAt) {
        Intrinsics.checkNotNullParameter(quiz, "quiz");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new QuizShortParticipationModel(id, quiz, moneyPlaced, moneyReturned, totalCoefficient, tier, state, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizShortParticipationModel)) {
            return false;
        }
        QuizShortParticipationModel quizShortParticipationModel = (QuizShortParticipationModel) other;
        return this.id == quizShortParticipationModel.id && Intrinsics.areEqual(this.quiz, quizShortParticipationModel.quiz) && this.moneyPlaced == quizShortParticipationModel.moneyPlaced && this.moneyReturned == quizShortParticipationModel.moneyReturned && Double.compare(this.totalCoefficient, quizShortParticipationModel.totalCoefficient) == 0 && Intrinsics.areEqual(this.tier, quizShortParticipationModel.tier) && this.state == quizShortParticipationModel.state && Intrinsics.areEqual(this.createdAt, quizShortParticipationModel.createdAt);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + this.quiz.hashCode()) * 31) + Long.hashCode(this.moneyPlaced)) * 31) + Long.hashCode(this.moneyReturned)) * 31) + Double.hashCode(this.totalCoefficient)) * 31) + this.tier.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "QuizShortParticipationModel(id=" + this.id + ", quiz=" + this.quiz + ", moneyPlaced=" + this.moneyPlaced + ", moneyReturned=" + this.moneyReturned + ", totalCoefficient=" + this.totalCoefficient + ", tier=" + this.tier + ", state=" + this.state + ", createdAt=" + this.createdAt + ")";
    }

    public QuizShortParticipationModel(long j, QuizShortModel quiz, long j2, long j3, double d, QuizTierModel tier, int i, String createdAt) {
        Intrinsics.checkNotNullParameter(quiz, "quiz");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = j;
        this.quiz = quiz;
        this.moneyPlaced = j2;
        this.moneyReturned = j3;
        this.totalCoefficient = d;
        this.tier = tier;
        this.state = i;
        this.createdAt = createdAt;
    }

    public final long getId() {
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

    public final String getCreatedAt() {
        return this.createdAt;
    }
}
