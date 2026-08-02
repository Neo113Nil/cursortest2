package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchDetailsQuizAvailabilityModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/MatchDetailsQuizAvailabilityModel;", "", "id", "", "matchId", "state", "available", "", "participation", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIZLorg/betup/model/remote/entity/matches/details/QuizParticipationModel;)V", "getId", "()I", "getMatchId", "getState", "getAvailable", "()Z", "getParticipation", "()Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MatchDetailsQuizAvailabilityModel {
    public static final int $stable = 8;

    @SerializedName("available")
    private final boolean available;

    @SerializedName("quizId")
    private final int id;

    @SerializedName("matchId")
    private final int matchId;

    @SerializedName("participation")
    private final QuizParticipationModel participation;

    @SerializedName("state")
    private final int state;

    public static /* synthetic */ MatchDetailsQuizAvailabilityModel copy$default(MatchDetailsQuizAvailabilityModel matchDetailsQuizAvailabilityModel, int i, int i2, int i3, boolean z, QuizParticipationModel quizParticipationModel, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = matchDetailsQuizAvailabilityModel.id;
        }
        if ((i4 & 2) != 0) {
            i2 = matchDetailsQuizAvailabilityModel.matchId;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = matchDetailsQuizAvailabilityModel.state;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            z = matchDetailsQuizAvailabilityModel.available;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            quizParticipationModel = matchDetailsQuizAvailabilityModel.participation;
        }
        return matchDetailsQuizAvailabilityModel.copy(i, i5, i6, z2, quizParticipationModel);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMatchId() {
        return this.matchId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* renamed from: component5, reason: from getter */
    public final QuizParticipationModel getParticipation() {
        return this.participation;
    }

    public final MatchDetailsQuizAvailabilityModel copy(int id, int matchId, int state, boolean available, QuizParticipationModel participation) {
        return new MatchDetailsQuizAvailabilityModel(id, matchId, state, available, participation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchDetailsQuizAvailabilityModel)) {
            return false;
        }
        MatchDetailsQuizAvailabilityModel matchDetailsQuizAvailabilityModel = (MatchDetailsQuizAvailabilityModel) other;
        return this.id == matchDetailsQuizAvailabilityModel.id && this.matchId == matchDetailsQuizAvailabilityModel.matchId && this.state == matchDetailsQuizAvailabilityModel.state && this.available == matchDetailsQuizAvailabilityModel.available && Intrinsics.areEqual(this.participation, matchDetailsQuizAvailabilityModel.participation);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.matchId)) * 31) + Integer.hashCode(this.state)) * 31) + Boolean.hashCode(this.available)) * 31;
        QuizParticipationModel quizParticipationModel = this.participation;
        return hashCode + (quizParticipationModel == null ? 0 : quizParticipationModel.hashCode());
    }

    public String toString() {
        return "MatchDetailsQuizAvailabilityModel(id=" + this.id + ", matchId=" + this.matchId + ", state=" + this.state + ", available=" + this.available + ", participation=" + this.participation + ")";
    }

    public MatchDetailsQuizAvailabilityModel(int i, int i2, int i3, boolean z, QuizParticipationModel quizParticipationModel) {
        this.id = i;
        this.matchId = i2;
        this.state = i3;
        this.available = z;
        this.participation = quizParticipationModel;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final int getState() {
        return this.state;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final QuizParticipationModel getParticipation() {
        return this.participation;
    }
}
