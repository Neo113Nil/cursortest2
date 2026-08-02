package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizParticipationResponseModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/QuizParticipationResponseModel;", "", "participation", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "quizParticipation", "errorCodes", "", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;Ljava/util/List;)V", "getParticipation", "()Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "getQuizParticipation", "getErrorCodes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizParticipationResponseModel {
    public static final int $stable = 8;

    @SerializedName("errorCodes")
    private final List<Integer> errorCodes;

    @SerializedName("participation")
    private final QuizParticipationModel participation;

    @SerializedName("quizParticipation")
    private final QuizParticipationModel quizParticipation;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuizParticipationResponseModel copy$default(QuizParticipationResponseModel quizParticipationResponseModel, QuizParticipationModel quizParticipationModel, QuizParticipationModel quizParticipationModel2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            quizParticipationModel = quizParticipationResponseModel.participation;
        }
        if ((i & 2) != 0) {
            quizParticipationModel2 = quizParticipationResponseModel.quizParticipation;
        }
        if ((i & 4) != 0) {
            list = quizParticipationResponseModel.errorCodes;
        }
        return quizParticipationResponseModel.copy(quizParticipationModel, quizParticipationModel2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final QuizParticipationModel getParticipation() {
        return this.participation;
    }

    /* renamed from: component2, reason: from getter */
    public final QuizParticipationModel getQuizParticipation() {
        return this.quizParticipation;
    }

    public final List<Integer> component3() {
        return this.errorCodes;
    }

    public final QuizParticipationResponseModel copy(QuizParticipationModel participation, QuizParticipationModel quizParticipation, List<Integer> errorCodes) {
        Intrinsics.checkNotNullParameter(quizParticipation, "quizParticipation");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        return new QuizParticipationResponseModel(participation, quizParticipation, errorCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizParticipationResponseModel)) {
            return false;
        }
        QuizParticipationResponseModel quizParticipationResponseModel = (QuizParticipationResponseModel) other;
        return Intrinsics.areEqual(this.participation, quizParticipationResponseModel.participation) && Intrinsics.areEqual(this.quizParticipation, quizParticipationResponseModel.quizParticipation) && Intrinsics.areEqual(this.errorCodes, quizParticipationResponseModel.errorCodes);
    }

    public int hashCode() {
        QuizParticipationModel quizParticipationModel = this.participation;
        return ((((quizParticipationModel == null ? 0 : quizParticipationModel.hashCode()) * 31) + this.quizParticipation.hashCode()) * 31) + this.errorCodes.hashCode();
    }

    public String toString() {
        return "QuizParticipationResponseModel(participation=" + this.participation + ", quizParticipation=" + this.quizParticipation + ", errorCodes=" + this.errorCodes + ")";
    }

    public QuizParticipationResponseModel(QuizParticipationModel quizParticipationModel, QuizParticipationModel quizParticipation, List<Integer> errorCodes) {
        Intrinsics.checkNotNullParameter(quizParticipation, "quizParticipation");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        this.participation = quizParticipationModel;
        this.quizParticipation = quizParticipation;
        this.errorCodes = errorCodes;
    }

    public final QuizParticipationModel getParticipation() {
        return this.participation;
    }

    public final QuizParticipationModel getQuizParticipation() {
        return this.quizParticipation;
    }

    public final List<Integer> getErrorCodes() {
        return this.errorCodes;
    }
}
