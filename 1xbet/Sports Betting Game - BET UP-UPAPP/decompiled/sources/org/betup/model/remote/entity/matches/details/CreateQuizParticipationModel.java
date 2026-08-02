package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CreateQuizParticipationModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/CreateQuizParticipationModel;", "", "quizId", "", "tierId", "bets", "", "Lorg/betup/model/remote/entity/matches/details/PlaceBetRequestModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLjava/util/List;)V", "getQuizId", "()J", "getTierId", "getBets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateQuizParticipationModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<PlaceBetRequestModel> bets;
    private final transient long quizId;

    @SerializedName("tierId")
    private final long tierId;

    public static /* synthetic */ CreateQuizParticipationModel copy$default(CreateQuizParticipationModel createQuizParticipationModel, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createQuizParticipationModel.quizId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = createQuizParticipationModel.tierId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = createQuizParticipationModel.bets;
        }
        return createQuizParticipationModel.copy(j3, j4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getQuizId() {
        return this.quizId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTierId() {
        return this.tierId;
    }

    public final List<PlaceBetRequestModel> component3() {
        return this.bets;
    }

    public final CreateQuizParticipationModel copy(long quizId, long tierId, List<PlaceBetRequestModel> bets) {
        Intrinsics.checkNotNullParameter(bets, "bets");
        return new CreateQuizParticipationModel(quizId, tierId, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateQuizParticipationModel)) {
            return false;
        }
        CreateQuizParticipationModel createQuizParticipationModel = (CreateQuizParticipationModel) other;
        return this.quizId == createQuizParticipationModel.quizId && this.tierId == createQuizParticipationModel.tierId && Intrinsics.areEqual(this.bets, createQuizParticipationModel.bets);
    }

    public int hashCode() {
        return (((Long.hashCode(this.quizId) * 31) + Long.hashCode(this.tierId)) * 31) + this.bets.hashCode();
    }

    public String toString() {
        return "CreateQuizParticipationModel(quizId=" + this.quizId + ", tierId=" + this.tierId + ", bets=" + this.bets + ")";
    }

    public CreateQuizParticipationModel(long j, long j2, List<PlaceBetRequestModel> bets) {
        Intrinsics.checkNotNullParameter(bets, "bets");
        this.quizId = j;
        this.tierId = j2;
        this.bets = bets;
    }

    public final long getQuizId() {
        return this.quizId;
    }

    public final long getTierId() {
        return this.tierId;
    }

    public final List<PlaceBetRequestModel> getBets() {
        return this.bets;
    }
}
