package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.model.VKScopes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/QuizModel;", "", "id", "", "match", "Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", VKScopes.QUESTIONS, "", "Lorg/betup/model/remote/entity/matches/details/BetSectionModel;", "state", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;Ljava/util/List;I)V", "getId", "()I", "getMatch", "()Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", "getQuestions", "()Ljava/util/List;", "getState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizModel {
    public static final int $stable = 8;

    @SerializedName("id")
    private final int id;

    @SerializedName("match")
    private final MatchShortDetailsDataModel match;

    @SerializedName(VKScopes.QUESTIONS)
    private final List<BetSectionModel> questions;

    @SerializedName("state")
    private final int state;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuizModel copy$default(QuizModel quizModel, int i, MatchShortDetailsDataModel matchShortDetailsDataModel, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = quizModel.id;
        }
        if ((i3 & 2) != 0) {
            matchShortDetailsDataModel = quizModel.match;
        }
        if ((i3 & 4) != 0) {
            list = quizModel.questions;
        }
        if ((i3 & 8) != 0) {
            i2 = quizModel.state;
        }
        return quizModel.copy(i, matchShortDetailsDataModel, list, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchShortDetailsDataModel getMatch() {
        return this.match;
    }

    public final List<BetSectionModel> component3() {
        return this.questions;
    }

    /* renamed from: component4, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final QuizModel copy(int id, MatchShortDetailsDataModel match, List<BetSectionModel> questions, int state) {
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new QuizModel(id, match, questions, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizModel)) {
            return false;
        }
        QuizModel quizModel = (QuizModel) other;
        return this.id == quizModel.id && Intrinsics.areEqual(this.match, quizModel.match) && Intrinsics.areEqual(this.questions, quizModel.questions) && this.state == quizModel.state;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.match.hashCode()) * 31) + this.questions.hashCode()) * 31) + Integer.hashCode(this.state);
    }

    public String toString() {
        return "QuizModel(id=" + this.id + ", match=" + this.match + ", questions=" + this.questions + ", state=" + this.state + ")";
    }

    public QuizModel(int i, MatchShortDetailsDataModel match, List<BetSectionModel> questions, int i2) {
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.id = i;
        this.match = match;
        this.questions = questions;
        this.state = i2;
    }

    public final int getId() {
        return this.id;
    }

    public final MatchShortDetailsDataModel getMatch() {
        return this.match;
    }

    public final List<BetSectionModel> getQuestions() {
        return this.questions;
    }

    public final int getState() {
        return this.state;
    }
}
