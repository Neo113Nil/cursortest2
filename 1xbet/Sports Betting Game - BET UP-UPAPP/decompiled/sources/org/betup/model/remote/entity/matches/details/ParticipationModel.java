package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ParticipationModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0012HÆ\u0003Jk\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\rHÖ\u0001J\t\u00103\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/ParticipationModel;", "", "id", "", "quiz", "Lorg/betup/model/remote/entity/matches/details/QuizModel;", "moneyPlaced", "", "moneyReturned", "totalCoefficient", "tier", "Lorg/betup/model/remote/entity/matches/details/TierModelShort;", "state", "", "bets", "", "Lorg/betup/model/remote/entity/matches/details/BetModelShortInfo;", "createdAt", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/details/QuizModel;DDDLorg/betup/model/remote/entity/matches/details/TierModelShort;ILjava/util/List;Ljava/lang/String;)V", "getId", "()J", "getQuiz", "()Lorg/betup/model/remote/entity/matches/details/QuizModel;", "getMoneyPlaced", "()D", "getMoneyReturned", "getTotalCoefficient", "getTier", "()Lorg/betup/model/remote/entity/matches/details/TierModelShort;", "getState", "()I", "getBets", "()Ljava/util/List;", "getCreatedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ParticipationModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<BetModelShortInfo> bets;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("id")
    private final long id;

    @SerializedName("moneyPlaced")
    private final double moneyPlaced;

    @SerializedName("moneyReturned")
    private final double moneyReturned;

    @SerializedName("quiz")
    private final QuizModel quiz;

    @SerializedName("state")
    private final int state;

    @SerializedName("tier")
    private final TierModelShort tier;

    @SerializedName("totalCoefficient")
    private final double totalCoefficient;

    public ParticipationModel() {
        this(0L, null, 0.0d, 0.0d, 0.0d, null, 0, null, null, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final QuizModel getQuiz() {
        return this.quiz;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMoneyPlaced() {
        return this.moneyPlaced;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMoneyReturned() {
        return this.moneyReturned;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTotalCoefficient() {
        return this.totalCoefficient;
    }

    /* renamed from: component6, reason: from getter */
    public final TierModelShort getTier() {
        return this.tier;
    }

    /* renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final List<BetModelShortInfo> component8() {
        return this.bets;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final ParticipationModel copy(long id, QuizModel quiz, double moneyPlaced, double moneyReturned, double totalCoefficient, TierModelShort tier, int state, List<BetModelShortInfo> bets, String createdAt) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new ParticipationModel(id, quiz, moneyPlaced, moneyReturned, totalCoefficient, tier, state, bets, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipationModel)) {
            return false;
        }
        ParticipationModel participationModel = (ParticipationModel) other;
        return this.id == participationModel.id && Intrinsics.areEqual(this.quiz, participationModel.quiz) && Double.compare(this.moneyPlaced, participationModel.moneyPlaced) == 0 && Double.compare(this.moneyReturned, participationModel.moneyReturned) == 0 && Double.compare(this.totalCoefficient, participationModel.totalCoefficient) == 0 && Intrinsics.areEqual(this.tier, participationModel.tier) && this.state == participationModel.state && Intrinsics.areEqual(this.bets, participationModel.bets) && Intrinsics.areEqual(this.createdAt, participationModel.createdAt);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        QuizModel quizModel = this.quiz;
        return ((((((((((((((hashCode + (quizModel == null ? 0 : quizModel.hashCode())) * 31) + Double.hashCode(this.moneyPlaced)) * 31) + Double.hashCode(this.moneyReturned)) * 31) + Double.hashCode(this.totalCoefficient)) * 31) + this.tier.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + this.bets.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "ParticipationModel(id=" + this.id + ", quiz=" + this.quiz + ", moneyPlaced=" + this.moneyPlaced + ", moneyReturned=" + this.moneyReturned + ", totalCoefficient=" + this.totalCoefficient + ", tier=" + this.tier + ", state=" + this.state + ", bets=" + this.bets + ", createdAt=" + this.createdAt + ")";
    }

    public ParticipationModel(long j, QuizModel quizModel, double d, double d2, double d3, TierModelShort tier, int i, List<BetModelShortInfo> bets, String createdAt) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = j;
        this.quiz = quizModel;
        this.moneyPlaced = d;
        this.moneyReturned = d2;
        this.totalCoefficient = d3;
        this.tier = tier;
        this.state = i;
        this.bets = bets;
        this.createdAt = createdAt;
    }

    public final long getId() {
        return this.id;
    }

    public final QuizModel getQuiz() {
        return this.quiz;
    }

    public final double getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final double getMoneyReturned() {
        return this.moneyReturned;
    }

    public final double getTotalCoefficient() {
        return this.totalCoefficient;
    }

    public /* synthetic */ ParticipationModel(long j, QuizModel quizModel, double d, double d2, double d3, TierModelShort tierModelShort, int i, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : quizModel, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) == 0 ? d3 : 0.0d, (i2 & 32) != 0 ? new TierModelShort(0, 0.0d, 0.0d, null, null, 31, null) : tierModelShort, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list, (i2 & 256) != 0 ? "" : str);
    }

    public final TierModelShort getTier() {
        return this.tier;
    }

    public final int getState() {
        return this.state;
    }

    public final List<BetModelShortInfo> getBets() {
        return this.bets;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }
}
